package org.xtext.example.dockercompose.formatting2

import com.google.inject.Inject
import dockercompose.*
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.dockercompose.services.DockerComposeGrammarAccess

class DockerComposeFormatter extends AbstractFormatter2 {
	
	@Inject extension DockerComposeGrammarAccess

	def dispatch void format(DockerCompose dockerCompose, extension IFormattableDocument document) {
				
		for (service : dockerCompose.services) {
			service.format
		}
		for (network : dockerCompose.networks) {
			network.format
		}
		for (volume : dockerCompose.volumes) {
			volume.format
		}
		for (config : dockerCompose.configs) {
			config.format
		}
		for (secret : dockerCompose.secrets) {
			secret.format
		}
		
		dockerCompose.regionFor.keyword("services:").prepend[newLine];
		dockerCompose.regionFor.keyword("networks:").prepend[newLine];
		dockerCompose.regionFor.keyword("volumes:").prepend[newLine];
		dockerCompose.regionFor.keyword("configs:").prepend[newLine];
		dockerCompose.regionFor.keyword("secrets:").prepend[newLine];	
	}

	def dispatch void format(Service service, extension IFormattableDocument document) {

		for (device : service.devices) {
			device.format
		}
		for (dNS : service.dns) {
			dNS.format
		}
		for (dependency : service.depends_on) {
			dependency.format
		}
		for (volumeConnector : service.volumes) {
			volumeConnector.format
		}
		for (configConnector : service.configs) {
			configConnector.format
		}
		for (secretConnector : service.secrets) {
			secretConnector.format
		}
		for (networkConnector : service.networks) {
			networkConnector.format
		}
		for (port : service.ports) {
			port.format
		}
		for (env : service.environment) {
			env.format
		}
		
		service.prepend[space="\n\t"]
		service.regionFor.keyword(":").prepend[noSpace];
		service.regionFor.keyword("image:").prepend[space="\n\t\t"].append[space=" "];
		service.regionFor.keyword("build:").prepend[space="\n\t\t"].append[space=" "];
		service.regionFor.keyword("cpu_count:").prepend[space="\n\t\t"].append[space=" "];
		service.regionFor.keyword("command:").prepend[space="\n\t\t"].append[space=" "];
		service.regionFor.keyword("container_name:").prepend[space="\n\t\t"].append[space=" "];
		service.regionFor.keyword("restart:").prepend[space="\n\t\t"].append[space=" "];
		service.regionFor.keyword("init:").prepend[space="\n\t\t"].append[space=" "];
		service.regionFor.keyword("read_only:").prepend[space="\n\t\t"].append[space=" "];
		service.regionFor.keyword("environment:").prepend[space="\n\t\t"];
		service.regionFor.keyword("devices:").prepend[space="\n\t\t"];
		service.regionFor.keyword("dns:").prepend[space="\n\t\t"];
		service.regionFor.keyword("ports:").prepend[space="\n\t\t"];
		service.regionFor.keyword("links:").prepend[space="\n\t\t"];
		service.regionFor.keyword("depends_on:").prepend[space="\n\t\t"];
		service.regionFor.keyword("networks:").prepend[space="\n\t\t"];
		service.regionFor.keyword("volumes:").prepend[space="\n\t\t"];
		service.regionFor.keyword("configs:").prepend[space="\n\t\t"];
		service.regionFor.keyword("secrets:").prepend[space="\n\t\t"];
		
		for (k : service.regionFor.keywords("-")) {
			k.prepend[space="\n\t\t\t"].append[space=" "];
		}
	}
	
	def dispatch void format(EnvironmentVariable env, extension IFormattableDocument document) {
		
		env.prepend[space="\n\t\t\t"];
		
		if (env.regionFor.keyword("-") !== null) {
			if (env.regionFor.keyword("-").offset == env.allSemanticRegions.get(0).offset) {
				env.regionFor.keyword("=").prepend[noSpace].append[noSpace];
				env.regionFor.keyword("-").append[space=" "];
			}
			else {
				env.regionFor.keyword(":").prepend[noSpace].append[space=" "];
			}
		}
		else {
			env.regionFor.keyword(":").prepend[noSpace].append[space=" "];
		}
	}
	
	def dispatch void format(Dependency dependency, extension IFormattableDocument document) {
		dependency.prepend[space="\n\t\t\t"]
		dependency.regionFor.keyword("-").append[space=" "];
		dependency.regionFor.keyword("condition:").prepend[space="\n\t\t\t\t"].append[space=" "];
	}
	
	def dispatch void format(NetworkConnector connector, extension IFormattableDocument document) {
		connector.prepend[space="\n\t\t\t"]
		connector.regionFor.keyword(":").prepend[noSpace];
		connector.regionFor.keyword("ipv4_address:").prepend[space="\n\t\t\t\t"].append[space=" "];
		connector.regionFor.keyword("priority:").prepend[space="\n\t\t\t\t"].append[space=" "];
		connector.regionFor.keyword("aliases:").prepend[space="\n\t\t\t\t"];
		connector.regionFor.keyword("link_local_ips:").prepend[space="\n\t\t\t\t"];
				
		for (k : connector.regionFor.keywords("-")) {
			if (k.offset != connector.allSemanticRegions.get(0).offset){
				k.prepend[space="\n\t\t\t\t\t"].append[space=" "];
			}
			else
				k.append[space=" "]
		}
	}
	
	def dispatch void format(VolumeConnector connector, extension IFormattableDocument document) {
		
		if (connector.regionFor.keyword("source:") !== null) {
			if (connector.regionFor.keyword("source:").offset != connector.allSemanticRegions.get(0).offset) {
				connector.regionFor.keyword("source:").prepend[space="\n\t\t\t  "];
			}
		}
		
		if (connector.regionFor.keyword("target:") !== null) {
			if (connector.regionFor.keyword("target:").offset != connector.allSemanticRegions.get(0).offset) {
				connector.regionFor.keyword("target:").prepend[space="\n\t\t\t  "];
			}	
		}
		
		if (connector.regionFor.keyword("type:") !== null) {
			if (connector.regionFor.keyword("type:").offset != connector.allSemanticRegions.get(0).offset) {
				connector.regionFor.keyword("type:").prepend[space="\n\t\t\t  "];
			}
		}
		
		if (connector.regionFor.keyword("read_only:") !== null) {
			if (connector.regionFor.keyword("read_only:").offset != connector.allSemanticRegions.get(0).offset) {
				connector.regionFor.keyword("read_only:").prepend[space="\n\t\t\t  "];
			}
		}
		
		if (connector.regionFor.keyword("bind:") !== null) {
			if (connector.regionFor.keyword("bind:").offset != connector.allSemanticRegions.get(0).offset) {
				connector.regionFor.keyword("bind:").prepend[space=" "];
			}
			else
				connector.regionFor.keyword("bind:").prepend[space="\n\t\t\t  "];
		}
		
		if (connector.regionFor.keyword("volume:") !== null) {
			if (connector.regionFor.keyword("volume:").offset != connector.allSemanticRegions.get(0).offset) {
				connector.regionFor.keyword("volume:").prepend[space="\n\t\t\t  "];
			}
		}
		
		if (connector.regionFor.keyword("tmpfs:") !== null) {
			if (connector.regionFor.keyword("tmpfs:").offset != connector.allSemanticRegions.get(0).offset) {
				connector.regionFor.keyword("tmpfs:").prepend[space="\n\t\t\t  "];
			}
		}
		
		connector.regionFor.keyword("source:").append[space=" "];
		connector.regionFor.keyword("target:").append[space=" "];
		connector.regionFor.keyword("type:").append[space=" "];
		connector.regionFor.keyword("read_only:").append[space=" "];

		connector.regionFor.keyword("propagation:").prepend[space="\n\t\t\t\t"].append[space=" "];
		connector.regionFor.keyword("nocopy:").prepend[space="\n\t\t\t\t"].append[space=" "];
		connector.regionFor.keyword("size:").prepend[space="\n\t\t\t\t"].append[space=" "];
		
		for (k : connector.regionFor.keywords(":")) {
			k.prepend[noSpace].append[noSpace];
		}
	}
	
	def dispatch void format(ConfigConnector connector, extension IFormattableDocument document) {
		
		if (connector.regionFor.keyword("source:") !== null) {
			if (connector.regionFor.keyword("source:").offset != connector.allSemanticRegions.get(0).offset) {
				connector.regionFor.keyword("source:").prepend[space="\n\t\t\t  "];
			}
		}
		
		if (connector.regionFor.keyword("target:") !== null) {
			if (connector.regionFor.keyword("target:").offset != connector.allSemanticRegions.get(0).offset) {
				connector.regionFor.keyword("target:").prepend[space="\n\t\t\t  "];
			}
		}
		
		if (connector.regionFor.keyword("uid:") !== null) {
			if (connector.regionFor.keyword("uid:").offset != connector.allSemanticRegions.get(0).offset) {
				connector.regionFor.keyword("uid:").prepend[space="\n\t\t\t  "];
			}
		}
		
		if (connector.regionFor.keyword("gid:") !== null) {
			if (connector.regionFor.keyword("gid:").offset != connector.allSemanticRegions.get(0).offset) {
				connector.regionFor.keyword("gid:").prepend[space="\n\t\t\t  "];
			}
		}
		
		if (connector.regionFor.keyword("mode:") !== null) {
			if (connector.regionFor.keyword("mode:").offset != connector.allSemanticRegions.get(0).offset) {
				connector.regionFor.keyword("mode:").prepend[space="\n\t\t\t  "];
			}
		}
		
		connector.regionFor.keyword("source:").append[space=" "];
		connector.regionFor.keyword("target:").append[space=" "];
		connector.regionFor.keyword("uid:").append[space=" "];
		connector.regionFor.keyword("gid:").append[space=" "];
		connector.regionFor.keyword("mode:").append[space=" "];
	}
	
	def dispatch void format(SecretConnector connector, extension IFormattableDocument document) {
		
		if (connector.regionFor.keyword("source:") !== null) {
			if (connector.regionFor.keyword("source:").offset != connector.allSemanticRegions.get(0).offset) {
				connector.regionFor.keyword("source:").prepend[space="\n\t\t\t  "];
			}
		}
		
		if (connector.regionFor.keyword("target:") !== null) {
			if (connector.regionFor.keyword("target:").offset != connector.allSemanticRegions.get(0).offset) {
				connector.regionFor.keyword("target:").prepend[space="\n\t\t\t  "];
			}
		}
		
		if (connector.regionFor.keyword("uid:") !== null) {
			if (connector.regionFor.keyword("uid:").offset != connector.allSemanticRegions.get(0).offset) {
				connector.regionFor.keyword("uid:").prepend[space="\n\t\t\t  "];
			}
		}
		
		if (connector.regionFor.keyword("gid:") !== null) {
			if (connector.regionFor.keyword("gid:").offset != connector.allSemanticRegions.get(0).offset) {
				connector.regionFor.keyword("gid:").prepend[space="\n\t\t\t  "];
			}
		}
		
		if (connector.regionFor.keyword("mode:") !== null) {
			if (connector.regionFor.keyword("mode:").offset != connector.allSemanticRegions.get(0).offset) {
				connector.regionFor.keyword("mode:").prepend[space="\n\t\t\t  "];
			}
		}
	
		connector.regionFor.keyword("source:").append[space=" "];
		connector.regionFor.keyword("target:").append[space=" "];
		connector.regionFor.keyword("uid:").append[space=" "];
		connector.regionFor.keyword("gid:").append[space=" "];
		connector.regionFor.keyword("mode:").append[space=" "];
	}

	def dispatch void format(Network network, extension IFormattableDocument document) {
		network.prepend[space="\n\t"]
		network.regionFor.keyword(":").prepend[noSpace];
		network.regionFor.keyword("driver:").prepend[space="\n\t\t"].append[space=" "];
		network.regionFor.keyword("attachable:").prepend[space="\n\t\t"].append[space=" "];
		network.regionFor.keyword("enable_ipv6:").prepend[space="\n\t\t"].append[space=" "];
		network.regionFor.keyword("internal:").prepend[space="\n\t\t"].append[space=" "];
		network.regionFor.keyword("external:").prepend[space="\n\t\t"].append[space=" "];
		network.regionFor.keyword("name:").prepend[space="\n\t\t"].append[space=" "];
		network.regionFor.keyword("labels:").prepend[space="\n\t\t"];
		network.regionFor.keyword("driver_opts:").prepend[space="\n\t\t"];
		network.regionFor.keyword("ipam:").prepend[space="\n\t\t"];
	
		for (label : network.labels) {
			label.format
		}
		for (driver_opt : network.driver_opts) {
			driver_opt.format
		}
		network.ipam.format
	}
	
	def dispatch void format(NetworkLabel label, extension IFormattableDocument document) {
		label.prepend[space="\n\t\t\t"]
		label.regionFor.keyword(":").prepend[noSpace].append[space=" "];
	}
	
	def dispatch void format(NetworkDriverOpt opt, extension IFormattableDocument document) {
		opt.prepend[space="\n\t\t\t"]
		opt.regionFor.keyword(":").prepend[noSpace].append[space=" "];
	}
	
	def dispatch void format(IPAM ipam, extension IFormattableDocument document) {
		ipam.regionFor.keyword("driver:").prepend[space="\n\t\t\t"].append[space=" "];
		ipam.regionFor.keyword("config:").prepend[space="\n\t\t\t"];
		ipam.regionFor.keyword("options:").prepend[space="\n\t\t\t"];
		
		for (k : ipam.regionFor.keywords("-")) {
			k.prepend[space="\n\t\t\t\t"].append[space=" "];
		}
		
		for (configs : ipam.configs) {
			configs.format
		}
		for (opt : ipam.options) {
			opt.format
		}
	}
	
	def dispatch void format(IPAMOption opt, extension IFormattableDocument document) {
		opt.prepend[space="\n\t\t\t\t"]
		opt.regionFor.keyword(":").prepend[noSpace].append[space=" "];
	}
	
	def dispatch void format(IPAMConfig config, extension IFormattableDocument document) {
		
		if (config.regionFor.keyword("subnet:") !== null) {
			if (config.regionFor.keyword("subnet:").offset != config.allSemanticRegions.get(0).offset) {
				config.regionFor.keyword("subnet:").prepend[space="\n\t\t\t\t  "];
			}
		}
		
		if (config.regionFor.keyword("ip_range:") !== null) {
			if (config.regionFor.keyword("ip_range:").offset != config.allSemanticRegions.get(0).offset) {
				config.regionFor.keyword("ip_range:").prepend[space="\n\t\t\t\t  "];
			}
		}
		
		if (config.regionFor.keyword("gateway:") !== null) {
			if (config.regionFor.keyword("gateway:").offset != config.allSemanticRegions.get(0).offset) {
				config.regionFor.keyword("gateway:").prepend[space="\n\t\t\t\t  "];
			}
		}
		
		if (config.regionFor.keyword("aux_addresses:") !== null) {
			if (config.regionFor.keyword("aux_addresses:").offset != config.allSemanticRegions.get(0).offset) {
				config.regionFor.keyword("aux_addresses:").prepend[space="\n\t\t\t\t  "];
			}
		}
		
		for (address : config.aux_addresses) {
			address.format
		}
	}
	
	def dispatch void format(IPAMAddress address, extension IFormattableDocument document) {
		address.prepend[space="\n\t\t\t\t\t"]
		address.regionFor.keyword(":").prepend[noSpace].append[space=" "];
	}
	
	def dispatch void format(Volume volume, extension IFormattableDocument document) {
		volume.prepend[space="\n\t"]
		volume.regionFor.keyword(":").prepend[noSpace];
		volume.regionFor.keyword("external:").prepend[space="\n\t\t"].append[space=" "];
		volume.regionFor.keyword("driver:").prepend[space="\n\t\t"].append[space=" "];
		volume.regionFor.keyword("name:").prepend[space="\n\t\t"].append[space=" "];
		volume.regionFor.keyword("labels:").prepend[space="\n\t\t"];
		volume.regionFor.keyword("driver_opts:").prepend[space="\n\t\t"];
		
		for (label : volume.labels) {
			label.format
		}
		for (driver_opt : volume.driver_opts) {
			driver_opt.format
		}
	}
	
	def dispatch void format(VolumeLabel label, extension IFormattableDocument document) {
		label.prepend[space="\n\t\t\t"]
		label.regionFor.keyword(":").prepend[noSpace].append[space=" "];
	}
	
	def dispatch void format(VolumeDriverOpt opt, extension IFormattableDocument document) {
		opt.prepend[space="\n\t\t\t"]
		opt.regionFor.keyword(":").prepend[noSpace].append[space=" "];
	}
	
	def dispatch void format(Config config, extension IFormattableDocument document) {
		config.prepend[space="\n\t"]
		config.regionFor.keyword(":").prepend[noSpace];
		config.regionFor.keyword("external:").prepend[space="\n\t\t"].append[space=" "];
		config.regionFor.keyword("file:").prepend[space="\n\t\t"].append[space=" "];
		config.regionFor.keyword("name:").prepend[space="\n\t\t"].append[space=" "];
	}
	
	def dispatch void format(Secret secret, extension IFormattableDocument document) {
		secret.prepend[space="\n\t"]
		secret.regionFor.keyword(":").prepend[noSpace];
		secret.regionFor.keyword("external:").prepend[space="\n\t\t"].append[space=" "];
		secret.regionFor.keyword("file:").prepend[space="\n\t\t"].append[space=" "];
		secret.regionFor.keyword("name:").prepend[space="\n\t\t"].append[space=" "];
		secret.regionFor.keyword("environment:").prepend[space="\n\t\t"].append[space=" "];
	}	
}
