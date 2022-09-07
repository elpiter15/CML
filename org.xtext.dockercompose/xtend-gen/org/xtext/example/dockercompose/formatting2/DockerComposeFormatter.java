package org.xtext.example.dockercompose.formatting2;

import com.google.inject.Inject;
import dockercompose.Config;
import dockercompose.ConfigConnector;
import dockercompose.DNS;
import dockercompose.Dependency;
import dockercompose.Device;
import dockercompose.DockerCompose;
import dockercompose.EnvironmentVariable;
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
import org.eclipse.xtext.xbase.lib.Conversions;
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
    EList<EnvironmentVariable> _environment = service.getEnvironment();
    for (final EnvironmentVariable env : _environment) {
      document.<EnvironmentVariable>format(env);
    }
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t");
    };
    document.<Service>prepend(service, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword(":"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(service).keyword("image:"), _function_2), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(service).keyword("build:"), _function_4), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(service).keyword("cpu_count:"), _function_6), _function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(service).keyword("command:"), _function_8), _function_9);
    final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_11 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(service).keyword("container_name:"), _function_10), _function_11);
    final Procedure1<IHiddenRegionFormatter> _function_12 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_13 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(service).keyword("restart:"), _function_12), _function_13);
    final Procedure1<IHiddenRegionFormatter> _function_14 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_15 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(service).keyword("init:"), _function_14), _function_15);
    final Procedure1<IHiddenRegionFormatter> _function_16 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_17 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(service).keyword("read_only:"), _function_16), _function_17);
    final Procedure1<IHiddenRegionFormatter> _function_18 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("environment:"), _function_18);
    final Procedure1<IHiddenRegionFormatter> _function_19 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("devices:"), _function_19);
    final Procedure1<IHiddenRegionFormatter> _function_20 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("dns:"), _function_20);
    final Procedure1<IHiddenRegionFormatter> _function_21 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("ports:"), _function_21);
    final Procedure1<IHiddenRegionFormatter> _function_22 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("links:"), _function_22);
    final Procedure1<IHiddenRegionFormatter> _function_23 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("depends_on:"), _function_23);
    final Procedure1<IHiddenRegionFormatter> _function_24 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("networks:"), _function_24);
    final Procedure1<IHiddenRegionFormatter> _function_25 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("volumes:"), _function_25);
    final Procedure1<IHiddenRegionFormatter> _function_26 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("configs:"), _function_26);
    final Procedure1<IHiddenRegionFormatter> _function_27 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(service).keyword("secrets:"), _function_27);
    List<ISemanticRegion> _keywords = this.textRegionExtensions.regionFor(service).keywords("-");
    for (final ISemanticRegion k : _keywords) {
      final Procedure1<IHiddenRegionFormatter> _function_28 = (IHiddenRegionFormatter it) -> {
        it.setSpace("\n\t\t\t");
      };
      final Procedure1<IHiddenRegionFormatter> _function_29 = (IHiddenRegionFormatter it) -> {
        it.setSpace(" ");
      };
      document.append(document.prepend(k, _function_28), _function_29);
    }
  }

  protected void _format(final EnvironmentVariable env, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t");
    };
    document.<EnvironmentVariable>prepend(env, _function);
    ISemanticRegion _keyword = this.textRegionExtensions.regionFor(env).keyword("-");
    boolean _tripleNotEquals = (_keyword != null);
    if (_tripleNotEquals) {
      int _offset = this.textRegionExtensions.regionFor(env).keyword("-").getOffset();
      int _offset_1 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(env), ISemanticRegion.class))[0]).getOffset();
      boolean _equals = (_offset == _offset_1);
      if (_equals) {
        final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
          it.noSpace();
        };
        final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
          it.noSpace();
        };
        document.append(document.prepend(this.textRegionExtensions.regionFor(env).keyword("="), _function_1), _function_2);
        final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
          it.setSpace(" ");
        };
        document.append(this.textRegionExtensions.regionFor(env).keyword("-"), _function_3);
      } else {
        final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
          it.noSpace();
        };
        final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
          it.setSpace(" ");
        };
        document.append(document.prepend(this.textRegionExtensions.regionFor(env).keyword(":"), _function_4), _function_5);
      }
    } else {
      final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
        it.noSpace();
      };
      final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
        it.setSpace(" ");
      };
      document.append(document.prepend(this.textRegionExtensions.regionFor(env).keyword(":"), _function_6), _function_7);
    }
  }

  protected void _format(final Dependency dependency, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t");
    };
    document.<Dependency>prepend(dependency, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(dependency).keyword("-"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(dependency).keyword("condition:"), _function_2), _function_3);
  }

  protected void _format(final NetworkConnector connector, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t");
    };
    document.<NetworkConnector>prepend(connector, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(connector).keyword(":"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(connector).keyword("ipv4_address:"), _function_2), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(connector).keyword("priority:"), _function_4), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(connector).keyword("aliases:"), _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(connector).keyword("link_local_ips:"), _function_7);
    List<ISemanticRegion> _keywords = this.textRegionExtensions.regionFor(connector).keywords("-");
    for (final ISemanticRegion k : _keywords) {
      int _offset = k.getOffset();
      int _offset_1 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(connector), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals = (_offset != _offset_1);
      if (_notEquals) {
        final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t\t\t");
        };
        final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
          it.setSpace(" ");
        };
        document.append(document.prepend(k, _function_8), _function_9);
      } else {
        final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
          it.setSpace(" ");
        };
        document.append(k, _function_10);
      }
    }
  }

  protected void _format(final VolumeConnector connector, @Extension final IFormattableDocument document) {
    ISemanticRegion _keyword = this.textRegionExtensions.regionFor(connector).keyword("source:");
    boolean _tripleNotEquals = (_keyword != null);
    if (_tripleNotEquals) {
      int _offset = this.textRegionExtensions.regionFor(connector).keyword("source:").getOffset();
      int _offset_1 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(connector), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals = (_offset != _offset_1);
      if (_notEquals) {
        final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(connector).keyword("source:"), _function);
      }
    }
    ISemanticRegion _keyword_1 = this.textRegionExtensions.regionFor(connector).keyword("target:");
    boolean _tripleNotEquals_1 = (_keyword_1 != null);
    if (_tripleNotEquals_1) {
      int _offset_2 = this.textRegionExtensions.regionFor(connector).keyword("target:").getOffset();
      int _offset_3 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(connector), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals_1 = (_offset_2 != _offset_3);
      if (_notEquals_1) {
        final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(connector).keyword("target:"), _function_1);
      }
    }
    ISemanticRegion _keyword_2 = this.textRegionExtensions.regionFor(connector).keyword("type:");
    boolean _tripleNotEquals_2 = (_keyword_2 != null);
    if (_tripleNotEquals_2) {
      int _offset_4 = this.textRegionExtensions.regionFor(connector).keyword("type:").getOffset();
      int _offset_5 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(connector), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals_2 = (_offset_4 != _offset_5);
      if (_notEquals_2) {
        final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(connector).keyword("type:"), _function_2);
      }
    }
    ISemanticRegion _keyword_3 = this.textRegionExtensions.regionFor(connector).keyword("read_only:");
    boolean _tripleNotEquals_3 = (_keyword_3 != null);
    if (_tripleNotEquals_3) {
      int _offset_6 = this.textRegionExtensions.regionFor(connector).keyword("read_only:").getOffset();
      int _offset_7 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(connector), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals_3 = (_offset_6 != _offset_7);
      if (_notEquals_3) {
        final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(connector).keyword("read_only:"), _function_3);
      }
    }
    ISemanticRegion _keyword_4 = this.textRegionExtensions.regionFor(connector).keyword("bind:");
    boolean _tripleNotEquals_4 = (_keyword_4 != null);
    if (_tripleNotEquals_4) {
      int _offset_8 = this.textRegionExtensions.regionFor(connector).keyword("bind:").getOffset();
      int _offset_9 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(connector), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals_4 = (_offset_8 != _offset_9);
      if (_notEquals_4) {
        final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
          it.setSpace(" ");
        };
        document.prepend(this.textRegionExtensions.regionFor(connector).keyword("bind:"), _function_4);
      } else {
        final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(connector).keyword("bind:"), _function_5);
      }
    }
    ISemanticRegion _keyword_5 = this.textRegionExtensions.regionFor(connector).keyword("volume:");
    boolean _tripleNotEquals_5 = (_keyword_5 != null);
    if (_tripleNotEquals_5) {
      int _offset_10 = this.textRegionExtensions.regionFor(connector).keyword("volume:").getOffset();
      int _offset_11 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(connector), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals_5 = (_offset_10 != _offset_11);
      if (_notEquals_5) {
        final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(connector).keyword("volume:"), _function_6);
      }
    }
    ISemanticRegion _keyword_6 = this.textRegionExtensions.regionFor(connector).keyword("tmpfs:");
    boolean _tripleNotEquals_6 = (_keyword_6 != null);
    if (_tripleNotEquals_6) {
      int _offset_12 = this.textRegionExtensions.regionFor(connector).keyword("tmpfs:").getOffset();
      int _offset_13 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(connector), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals_6 = (_offset_12 != _offset_13);
      if (_notEquals_6) {
        final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(connector).keyword("tmpfs:"), _function_7);
      }
    }
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(connector).keyword("source:"), _function_8);
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(connector).keyword("target:"), _function_9);
    final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(connector).keyword("type:"), _function_10);
    final Procedure1<IHiddenRegionFormatter> _function_11 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(connector).keyword("read_only:"), _function_11);
    final Procedure1<IHiddenRegionFormatter> _function_12 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_13 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(connector).keyword("propagation:"), _function_12), _function_13);
    final Procedure1<IHiddenRegionFormatter> _function_14 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_15 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(connector).keyword("nocopy:"), _function_14), _function_15);
    final Procedure1<IHiddenRegionFormatter> _function_16 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_17 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(connector).keyword("size:"), _function_16), _function_17);
    List<ISemanticRegion> _keywords = this.textRegionExtensions.regionFor(connector).keywords(":");
    for (final ISemanticRegion k : _keywords) {
      final Procedure1<IHiddenRegionFormatter> _function_18 = (IHiddenRegionFormatter it) -> {
        it.noSpace();
      };
      final Procedure1<IHiddenRegionFormatter> _function_19 = (IHiddenRegionFormatter it) -> {
        it.noSpace();
      };
      document.append(document.prepend(k, _function_18), _function_19);
    }
  }

  protected void _format(final ConfigConnector connector, @Extension final IFormattableDocument document) {
    ISemanticRegion _keyword = this.textRegionExtensions.regionFor(connector).keyword("source:");
    boolean _tripleNotEquals = (_keyword != null);
    if (_tripleNotEquals) {
      int _offset = this.textRegionExtensions.regionFor(connector).keyword("source:").getOffset();
      int _offset_1 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(connector), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals = (_offset != _offset_1);
      if (_notEquals) {
        final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(connector).keyword("source:"), _function);
      }
    }
    ISemanticRegion _keyword_1 = this.textRegionExtensions.regionFor(connector).keyword("target:");
    boolean _tripleNotEquals_1 = (_keyword_1 != null);
    if (_tripleNotEquals_1) {
      int _offset_2 = this.textRegionExtensions.regionFor(connector).keyword("target:").getOffset();
      int _offset_3 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(connector), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals_1 = (_offset_2 != _offset_3);
      if (_notEquals_1) {
        final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(connector).keyword("target:"), _function_1);
      }
    }
    ISemanticRegion _keyword_2 = this.textRegionExtensions.regionFor(connector).keyword("uid:");
    boolean _tripleNotEquals_2 = (_keyword_2 != null);
    if (_tripleNotEquals_2) {
      int _offset_4 = this.textRegionExtensions.regionFor(connector).keyword("uid:").getOffset();
      int _offset_5 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(connector), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals_2 = (_offset_4 != _offset_5);
      if (_notEquals_2) {
        final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(connector).keyword("uid:"), _function_2);
      }
    }
    ISemanticRegion _keyword_3 = this.textRegionExtensions.regionFor(connector).keyword("gid:");
    boolean _tripleNotEquals_3 = (_keyword_3 != null);
    if (_tripleNotEquals_3) {
      int _offset_6 = this.textRegionExtensions.regionFor(connector).keyword("gid:").getOffset();
      int _offset_7 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(connector), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals_3 = (_offset_6 != _offset_7);
      if (_notEquals_3) {
        final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(connector).keyword("gid:"), _function_3);
      }
    }
    ISemanticRegion _keyword_4 = this.textRegionExtensions.regionFor(connector).keyword("mode:");
    boolean _tripleNotEquals_4 = (_keyword_4 != null);
    if (_tripleNotEquals_4) {
      int _offset_8 = this.textRegionExtensions.regionFor(connector).keyword("mode:").getOffset();
      int _offset_9 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(connector), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals_4 = (_offset_8 != _offset_9);
      if (_notEquals_4) {
        final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(connector).keyword("mode:"), _function_4);
      }
    }
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(connector).keyword("source:"), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(connector).keyword("target:"), _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(connector).keyword("uid:"), _function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(connector).keyword("gid:"), _function_8);
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(connector).keyword("mode:"), _function_9);
  }

  protected void _format(final SecretConnector connector, @Extension final IFormattableDocument document) {
    ISemanticRegion _keyword = this.textRegionExtensions.regionFor(connector).keyword("source:");
    boolean _tripleNotEquals = (_keyword != null);
    if (_tripleNotEquals) {
      int _offset = this.textRegionExtensions.regionFor(connector).keyword("source:").getOffset();
      int _offset_1 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(connector), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals = (_offset != _offset_1);
      if (_notEquals) {
        final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(connector).keyword("source:"), _function);
      }
    }
    ISemanticRegion _keyword_1 = this.textRegionExtensions.regionFor(connector).keyword("target:");
    boolean _tripleNotEquals_1 = (_keyword_1 != null);
    if (_tripleNotEquals_1) {
      int _offset_2 = this.textRegionExtensions.regionFor(connector).keyword("target:").getOffset();
      int _offset_3 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(connector), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals_1 = (_offset_2 != _offset_3);
      if (_notEquals_1) {
        final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(connector).keyword("target:"), _function_1);
      }
    }
    ISemanticRegion _keyword_2 = this.textRegionExtensions.regionFor(connector).keyword("uid:");
    boolean _tripleNotEquals_2 = (_keyword_2 != null);
    if (_tripleNotEquals_2) {
      int _offset_4 = this.textRegionExtensions.regionFor(connector).keyword("uid:").getOffset();
      int _offset_5 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(connector), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals_2 = (_offset_4 != _offset_5);
      if (_notEquals_2) {
        final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(connector).keyword("uid:"), _function_2);
      }
    }
    ISemanticRegion _keyword_3 = this.textRegionExtensions.regionFor(connector).keyword("gid:");
    boolean _tripleNotEquals_3 = (_keyword_3 != null);
    if (_tripleNotEquals_3) {
      int _offset_6 = this.textRegionExtensions.regionFor(connector).keyword("gid:").getOffset();
      int _offset_7 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(connector), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals_3 = (_offset_6 != _offset_7);
      if (_notEquals_3) {
        final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(connector).keyword("gid:"), _function_3);
      }
    }
    ISemanticRegion _keyword_4 = this.textRegionExtensions.regionFor(connector).keyword("mode:");
    boolean _tripleNotEquals_4 = (_keyword_4 != null);
    if (_tripleNotEquals_4) {
      int _offset_8 = this.textRegionExtensions.regionFor(connector).keyword("mode:").getOffset();
      int _offset_9 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(connector), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals_4 = (_offset_8 != _offset_9);
      if (_notEquals_4) {
        final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(connector).keyword("mode:"), _function_4);
      }
    }
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(connector).keyword("source:"), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(connector).keyword("target:"), _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(connector).keyword("uid:"), _function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(connector).keyword("gid:"), _function_8);
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(this.textRegionExtensions.regionFor(connector).keyword("mode:"), _function_9);
  }

  protected void _format(final Network network, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t");
    };
    document.<Network>prepend(network, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(network).keyword(":"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(network).keyword("driver:"), _function_2), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(network).keyword("attachable:"), _function_4), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(network).keyword("enable_ipv6:"), _function_6), _function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(network).keyword("internal:"), _function_8), _function_9);
    final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_11 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(network).keyword("external:"), _function_10), _function_11);
    final Procedure1<IHiddenRegionFormatter> _function_12 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_13 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(network).keyword("name:"), _function_12), _function_13);
    final Procedure1<IHiddenRegionFormatter> _function_14 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(network).keyword("labels:"), _function_14);
    final Procedure1<IHiddenRegionFormatter> _function_15 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(network).keyword("driver_opts:"), _function_15);
    final Procedure1<IHiddenRegionFormatter> _function_16 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(network).keyword("ipam:"), _function_16);
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
      it.noSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(label).keyword(":"), _function_1), _function_2);
  }

  protected void _format(final NetworkDriverOpt opt, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t");
    };
    document.<NetworkDriverOpt>prepend(opt, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(opt).keyword(":"), _function_1), _function_2);
  }

  protected void _format(final IPAM ipam, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(ipam).keyword("driver:"), _function), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(ipam).keyword("config:"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(ipam).keyword("options:"), _function_3);
    List<ISemanticRegion> _keywords = this.textRegionExtensions.regionFor(ipam).keywords("-");
    for (final ISemanticRegion k : _keywords) {
      final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
        it.setSpace("\n\t\t\t\t");
      };
      final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
        it.setSpace(" ");
      };
      document.append(document.prepend(k, _function_4), _function_5);
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
      it.noSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(opt).keyword(":"), _function_1), _function_2);
  }

  protected void _format(final IPAMConfig config, @Extension final IFormattableDocument document) {
    ISemanticRegion _keyword = this.textRegionExtensions.regionFor(config).keyword("subnet:");
    boolean _tripleNotEquals = (_keyword != null);
    if (_tripleNotEquals) {
      int _offset = this.textRegionExtensions.regionFor(config).keyword("subnet:").getOffset();
      int _offset_1 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(config), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals = (_offset != _offset_1);
      if (_notEquals) {
        final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(config).keyword("subnet:"), _function);
      }
    }
    ISemanticRegion _keyword_1 = this.textRegionExtensions.regionFor(config).keyword("ip_range:");
    boolean _tripleNotEquals_1 = (_keyword_1 != null);
    if (_tripleNotEquals_1) {
      int _offset_2 = this.textRegionExtensions.regionFor(config).keyword("ip_range:").getOffset();
      int _offset_3 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(config), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals_1 = (_offset_2 != _offset_3);
      if (_notEquals_1) {
        final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(config).keyword("ip_range:"), _function_1);
      }
    }
    ISemanticRegion _keyword_2 = this.textRegionExtensions.regionFor(config).keyword("gateway:");
    boolean _tripleNotEquals_2 = (_keyword_2 != null);
    if (_tripleNotEquals_2) {
      int _offset_4 = this.textRegionExtensions.regionFor(config).keyword("gateway:").getOffset();
      int _offset_5 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(config), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals_2 = (_offset_4 != _offset_5);
      if (_notEquals_2) {
        final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(config).keyword("gateway:"), _function_2);
      }
    }
    ISemanticRegion _keyword_3 = this.textRegionExtensions.regionFor(config).keyword("aux_addresses:");
    boolean _tripleNotEquals_3 = (_keyword_3 != null);
    if (_tripleNotEquals_3) {
      int _offset_6 = this.textRegionExtensions.regionFor(config).keyword("aux_addresses:").getOffset();
      int _offset_7 = (((ISemanticRegion[])Conversions.unwrapArray(this.textRegionExtensions.allSemanticRegions(config), ISemanticRegion.class))[0]).getOffset();
      boolean _notEquals_3 = (_offset_6 != _offset_7);
      if (_notEquals_3) {
        final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
          it.setSpace("\n\t\t\t\t  ");
        };
        document.prepend(this.textRegionExtensions.regionFor(config).keyword("aux_addresses:"), _function_3);
      }
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
      it.noSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(address).keyword(":"), _function_1), _function_2);
  }

  protected void _format(final Volume volume, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t");
    };
    document.<Volume>prepend(volume, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(volume).keyword(":"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(volume).keyword("external:"), _function_2), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(volume).keyword("driver:"), _function_4), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(volume).keyword("name:"), _function_6), _function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(volume).keyword("labels:"), _function_8);
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    document.prepend(this.textRegionExtensions.regionFor(volume).keyword("driver_opts:"), _function_9);
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
      it.noSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(label).keyword(":"), _function_1), _function_2);
  }

  protected void _format(final VolumeDriverOpt opt, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t\t");
    };
    document.<VolumeDriverOpt>prepend(opt, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(opt).keyword(":"), _function_1), _function_2);
  }

  protected void _format(final Config config, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t");
    };
    document.<Config>prepend(config, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(config).keyword(":"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(config).keyword("external:"), _function_2), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(config).keyword("file:"), _function_4), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(config).keyword("name:"), _function_6), _function_7);
  }

  protected void _format(final Secret secret, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t");
    };
    document.<Secret>prepend(secret, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(secret).keyword(":"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(secret).keyword("external:"), _function_2), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(secret).keyword("file:"), _function_4), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(secret).keyword("name:"), _function_6), _function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.setSpace("\n\t\t");
    };
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(secret).keyword("environment:"), _function_8), _function_9);
  }

  public void format(final Object config, final IFormattableDocument document) {
    if (config instanceof XtextResource) {
      _format((XtextResource)config, document);
      return;
    } else if (config instanceof Config) {
      _format((Config)config, document);
      return;
    } else if (config instanceof ConfigConnector) {
      _format((ConfigConnector)config, document);
      return;
    } else if (config instanceof Dependency) {
      _format((Dependency)config, document);
      return;
    } else if (config instanceof DockerCompose) {
      _format((DockerCompose)config, document);
      return;
    } else if (config instanceof EnvironmentVariable) {
      _format((EnvironmentVariable)config, document);
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
    } else if (config instanceof NetworkConnector) {
      _format((NetworkConnector)config, document);
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
    } else if (config instanceof SecretConnector) {
      _format((SecretConnector)config, document);
      return;
    } else if (config instanceof Service) {
      _format((Service)config, document);
      return;
    } else if (config instanceof Volume) {
      _format((Volume)config, document);
      return;
    } else if (config instanceof VolumeConnector) {
      _format((VolumeConnector)config, document);
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
