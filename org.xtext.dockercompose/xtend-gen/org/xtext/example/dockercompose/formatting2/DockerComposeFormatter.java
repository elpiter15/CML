/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.dockercompose.formatting2;

import com.google.inject.Inject;
import dockercompose.Config;
import dockercompose.ConfigConnector;
import dockercompose.DNS;
import dockercompose.Dependency;
import dockercompose.Device;
import dockercompose.DockerCompose;
import dockercompose.IPAM;
import dockercompose.IPAMAddress;
import dockercompose.IPAMConfig;
import dockercompose.IPAMOption;
import dockercompose.Network;
import dockercompose.NetworkConnector;
import dockercompose.NetworkDriverOpt;
import dockercompose.NetworkLabel;
import dockercompose.Port;
import dockercompose.Secret;
import dockercompose.SecretConnector;
import dockercompose.Service;
import dockercompose.Volume;
import dockercompose.VolumeConnector;
import dockercompose.VolumeDriverOpt;
import dockercompose.VolumeLabel;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.example.dockercompose.services.DockerComposeGrammarAccess;

@SuppressWarnings("all")
public class DockerComposeFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private DockerComposeGrammarAccess _dockerComposeGrammarAccess;

  protected void _format(final DockerCompose dockerCompose, @Extension final IFormattableDocument document) {
    EList<Service> _services = dockerCompose.getServices();
    for (final Service service : _services) {
      document.<Service>format(service);
    }
    EList<Network> _networks = dockerCompose.getNetworks();
    for (final Network network : _networks) {
      document.<Network>format(network);
    }
    EList<Volume> _volumes = dockerCompose.getVolumes();
    for (final Volume volume : _volumes) {
      document.<Volume>format(volume);
    }
    EList<Config> _configs = dockerCompose.getConfigs();
    for (final Config config : _configs) {
      document.<Config>format(config);
    }
    EList<Secret> _secrets = dockerCompose.getSecrets();
    for (final Secret secret : _secrets) {
      document.<Secret>format(secret);
    }
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(dockerCompose).keyword("services:"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(dockerCompose).keyword("networks:"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(dockerCompose).keyword("volumes:"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(dockerCompose).keyword("configs:"), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(dockerCompose).keyword("secrets:"), _function_4);
  }

  protected void _format(final Service service, @Extension final IFormattableDocument document) {
    EList<Device> _devices = service.getDevices();
    for (final Device device : _devices) {
      document.<Device>format(device);
    }
    EList<DNS> _dns = service.getDns();
    for (final DNS dNS : _dns) {
      document.<DNS>format(dNS);
    }
    EList<Dependency> _depends_on = service.getDepends_on();
    for (final Dependency dependency : _depends_on) {
      document.<Dependency>format(dependency);
    }
    EList<VolumeConnector> _volumes = service.getVolumes();
    for (final VolumeConnector volumeConnector : _volumes) {
      document.<VolumeConnector>format(volumeConnector);
    }
    EList<ConfigConnector> _configs = service.getConfigs();
    for (final ConfigConnector configConnector : _configs) {
      document.<ConfigConnector>format(configConnector);
    }
    EList<SecretConnector> _secrets = service.getSecrets();
    for (final SecretConnector secretConnector : _secrets) {
      document.<SecretConnector>format(secretConnector);
    }
    EList<NetworkConnector> _networks = service.getNetworks();
    for (final NetworkConnector networkConnector : _networks) {
      document.<NetworkConnector>format(networkConnector);
    }
    EList<Port> _ports = service.getPorts();
    for (final Port port : _ports) {
      document.<Port>format(port);
    }
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t");
    };
    document.<Service>prepend(service, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("image:"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("build:"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("cpu_count:"), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("command:"), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("container_name:"), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("restart:"), _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("init:"), _function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("read_only:"), _function_8);
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("devices:"), _function_9);
    final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("dns:"), _function_10);
    final Procedure1<IHiddenRegionFormatter> _function_11 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("ports:"), _function_11);
    final Procedure1<IHiddenRegionFormatter> _function_12 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("depends_on:"), _function_12);
    final Procedure1<IHiddenRegionFormatter> _function_13 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("networks:"), _function_13);
    final Procedure1<IHiddenRegionFormatter> _function_14 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("volumes:"), _function_14);
    final Procedure1<IHiddenRegionFormatter> _function_15 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("configs:"), _function_15);
    final Procedure1<IHiddenRegionFormatter> _function_16 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("secrets:"), _function_16);
    List<ISemanticRegion> _keywords = this.textRegionExtensions.regionFor(service).keywords("-");
    for (final ISemanticRegion k : _keywords) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_17 = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t");
        };
        document.prepend(k, _function_17);
        final Procedure1<IHiddenRegionFormatter> _function_18 = (IHiddenRegionFormatter it) -> {
          it.setSpace(" ");
        };
        document.append(k, _function_18);
      }
    }
  }

  /**
   * def dispatch void format(NetworkConnector connector, extension IFormattableDocument document) {
   * connector.prepend[space="\n\t\t\t"]
   * connector.regionFor.keyword("ipv4_address:").prepend[space="\n\t\t\t\t"].append[space=" "];
   * connector.regionFor.keyword("priority:").prepend[space="\n\t\t\t\t"].append[space=" "];
   * connector.regionFor.keyword("aliases:").prepend[space="\n\t\t\t\t"].append[space=" "];
   * connector.regionFor.keyword("link_local_ips:").prepend[space="\n\t\t\t\t"].append[space=" "];
   * 
   * for (k : connector.regionFor.keywords("-")) {
   * k.append[space=" "];
   * if (!k.immediatelyPreceding.equals(null)){
   * k.prepend[space="\n\t\t\t\t\t"];
   * }
   * }
   * }
   * 
   * def dispatch void format(VolumeConnector connector, extension IFormattableDocument document) {
   * if (!connector.regionFor.keyword("source:").immediatelyPreceding.equals(null)) {
   * connector.regionFor.keyword("source:").prepend[space="\n\t\t\t  "].append[space=" "];
   * }
   * 
   * if (!connector.regionFor.keyword("type:").immediatelyPreceding.equals(null)) {
   * connector.regionFor.keyword("type:").prepend[space="\n\t\t\t  "].append[space=" "];
   * }
   * 
   * if (!connector.regionFor.keyword("target:").immediatelyPreceding.equals(null)) {
   * connector.regionFor.keyword("target:").prepend[space="\n\t\t\t  "].append[space=" "];
   * }
   * 
   * if (!connector.regionFor.keyword("read_only:").immediatelyPreceding.equals(null)) {
   * connector.regionFor.keyword("read_only:").prepend[space="\n\t\t\t  "].append[space=" "];
   * }
   * 
   * if (!connector.regionFor.keyword("bind:").immediatelyPreceding.equals(null)) {
   * connector.regionFor.keyword("bind:").prepend[space="\n\t\t\t  "].append[space=" "];
   * }
   * 
   * if (!connector.regionFor.keyword("volume:").immediatelyPreceding.equals(null)) {
   * connector.regionFor.keyword("volume:").prepend[space="\n\t\t\t  "].append[space=" "];
   * }
   * 
   * if (!connector.regionFor.keyword("tmpfs:").immediatelyPreceding.equals(null)) {
   * connector.regionFor.keyword("tmpfs:").prepend[space="\n\t\t\t  "].append[space=" "];
   * }
   * 
   * connector.regionFor.keyword("nocopy:").prepend[space="\n\t\t\t\t"].append[space=" "];
   * connector.regionFor.keyword("size:").prepend[space="\n\t\t\t\t"].append[space=" "];
   * }
   */
  protected void _format(final Network network, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t");
    };
    document.<Network>prepend(network, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(network).keyword("driver:"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(network).keyword("attachable:"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(network).keyword("enable_ipv6:"), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(network).keyword("internal:"), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(network).keyword("external:"), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(network).keyword("name:"), _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(network).keyword("labels:"), _function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(network).keyword("driver_opts:"), _function_8);
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(network).keyword("ipam:"), _function_9);
    EList<NetworkLabel> _labels = network.getLabels();
    for (final NetworkLabel label : _labels) {
      document.<NetworkLabel>format(label);
    }
    EList<NetworkDriverOpt> _driver_opts = network.getDriver_opts();
    for (final NetworkDriverOpt driver_opt : _driver_opts) {
      document.<NetworkDriverOpt>format(driver_opt);
    }
    document.<IPAM>format(network.getIpam());
  }

  protected void _format(final NetworkLabel label, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t");
    };
    document.<NetworkLabel>prepend(label, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(label).keyword(":"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(label).keyword(":"), _function_2);
  }

  protected void _format(final NetworkDriverOpt opt, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t");
    };
    document.<NetworkDriverOpt>prepend(opt, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(opt).keyword(":"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(opt).keyword(":"), _function_2);
  }

  protected void _format(final IPAM ipam, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(ipam).keyword("driver:"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(ipam).keyword("config:"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(ipam).keyword("options:"), _function_2);
    List<ISemanticRegion> _keywords = this.textRegionExtensions.regionFor(ipam).keywords("-");
    for (final ISemanticRegion k : _keywords) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t\t");
        };
        document.prepend(k, _function_3);
        final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
          it.setSpace(" ");
        };
        document.append(k, _function_4);
      }
    }
    EList<IPAMConfig> _configs = ipam.getConfigs();
    for (final IPAMConfig configs : _configs) {
      document.<IPAMConfig>format(configs);
    }
    EList<IPAMOption> _options = ipam.getOptions();
    for (final IPAMOption opt : _options) {
      document.<IPAMOption>format(opt);
    }
  }

  protected void _format(final IPAMOption opt, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t\t");
    };
    document.<IPAMOption>prepend(opt, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(opt).keyword(":"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(opt).keyword(":"), _function_2);
  }

  protected void _format(final IPAMConfig config, @Extension final IFormattableDocument document) {
    boolean _equals = this.textRegionExtensions.regionFor(config).keyword("subnet:").immediatelyPreceding().equals(null);
    boolean _not = (!_equals);
    if (_not) {
      final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
        it.setSpace("\n\t\t\t\t  ");
      };
      document.prepend(this.textRegionExtensions.regionFor(config).keyword("subnet:"), _function);
    }
    boolean _equals_1 = this.textRegionExtensions.regionFor(config).keyword("ip_range:").immediatelyPreceding().equals(null);
    boolean _not_1 = (!_equals_1);
    if (_not_1) {
      final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
        it.setSpace("\n\t\t\t\t  ");
      };
      document.prepend(this.textRegionExtensions.regionFor(config).keyword("ip_range:"), _function_1);
    }
    boolean _equals_2 = this.textRegionExtensions.regionFor(config).keyword("gateway:").immediatelyPreceding().equals(null);
    boolean _not_2 = (!_equals_2);
    if (_not_2) {
      final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
        it.setSpace("\n\t\t\t\t  ");
      };
      document.prepend(this.textRegionExtensions.regionFor(config).keyword("gateway:"), _function_2);
    }
    boolean _equals_3 = this.textRegionExtensions.regionFor(config).keyword("aux_addresses:").immediatelyPreceding().equals(null);
    boolean _not_3 = (!_equals_3);
    if (_not_3) {
      final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
        it.setSpace("\n\t\t\t\t  ");
      };
      document.prepend(this.textRegionExtensions.regionFor(config).keyword("aux_addresses:"), _function_3);
    }
    EList<IPAMAddress> _aux_addresses = config.getAux_addresses();
    for (final IPAMAddress address : _aux_addresses) {
      document.<IPAMAddress>format(address);
    }
  }

  protected void _format(final IPAMAddress address, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t\t\t");
    };
    document.<IPAMAddress>prepend(address, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(address).keyword(":"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(address).keyword(":"), _function_2);
  }

  protected void _format(final Volume volume, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t");
    };
    document.<Volume>prepend(volume, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(volume).keyword("external:"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(volume).keyword("driver:"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(volume).keyword("name:"), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(volume).keyword("labels:"), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(volume).keyword("driver_opts:"), _function_5);
    EList<VolumeLabel> _labels = volume.getLabels();
    for (final VolumeLabel label : _labels) {
      document.<VolumeLabel>format(label);
    }
    EList<VolumeDriverOpt> _driver_opts = volume.getDriver_opts();
    for (final VolumeDriverOpt driver_opt : _driver_opts) {
      document.<VolumeDriverOpt>format(driver_opt);
    }
  }

  protected void _format(final VolumeLabel label, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t");
    };
    document.<VolumeLabel>prepend(label, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(label).keyword(":"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(label).keyword(":"), _function_2);
  }

  protected void _format(final VolumeDriverOpt opt, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t");
    };
    document.<VolumeDriverOpt>prepend(opt, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(opt).keyword(":"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(opt).keyword(":"), _function_2);
  }

  protected void _format(final Config config, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t");
    };
    document.<Config>prepend(config, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(config).keyword("external:"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(config).keyword("file:"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(config).keyword("name:"), _function_3);
  }

  protected void _format(final Secret secret, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t");
    };
    document.<Secret>prepend(secret, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(secret).keyword("external:"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(secret).keyword("file:"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(secret).keyword("name:"), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(secret).keyword("environment:"), _function_4);
  }

  public void format(final Object config, final IFormattableDocument document) {
    if (config instanceof XtextResource) {
      _format((XtextResource)config, document);
      return;
    } else if (config instanceof Config) {
      _format((Config)config, document);
      return;
    } else if (config instanceof DockerCompose) {
      _format((DockerCompose)config, document);
      return;
    } else if (config instanceof IPAM) {
      _format((IPAM)config, document);
      return;
    } else if (config instanceof IPAMAddress) {
      _format((IPAMAddress)config, document);
      return;
    } else if (config instanceof IPAMConfig) {
      _format((IPAMConfig)config, document);
      return;
    } else if (config instanceof IPAMOption) {
      _format((IPAMOption)config, document);
      return;
    } else if (config instanceof Network) {
      _format((Network)config, document);
      return;
    } else if (config instanceof NetworkDriverOpt) {
      _format((NetworkDriverOpt)config, document);
      return;
    } else if (config instanceof NetworkLabel) {
      _format((NetworkLabel)config, document);
      return;
    } else if (config instanceof Secret) {
      _format((Secret)config, document);
      return;
    } else if (config instanceof Service) {
      _format((Service)config, document);
      return;
    } else if (config instanceof Volume) {
      _format((Volume)config, document);
      return;
    } else if (config instanceof VolumeDriverOpt) {
      _format((VolumeDriverOpt)config, document);
      return;
    } else if (config instanceof VolumeLabel) {
      _format((VolumeLabel)config, document);
      return;
    } else if (config instanceof EObject) {
      _format((EObject)config, document);
      return;
    } else if (config == null) {
      _format((Void)null, document);
      return;
    } else if (config != null) {
      _format(config, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(config, document).toString());
    }
  }
}