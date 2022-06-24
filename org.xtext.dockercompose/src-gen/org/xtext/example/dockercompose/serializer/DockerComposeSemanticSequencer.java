/*
 * generated by Xtext 2.27.0
 */
package org.xtext.example.dockercompose.serializer;

import com.google.inject.Inject;
import dockercompose.Alias;
import dockercompose.Config;
import dockercompose.ConfigConnector;
import dockercompose.DNS;
import dockercompose.Dependency;
import dockercompose.DockerCompose;
import dockercompose.DockercomposePackage;
import dockercompose.IPAM;
import dockercompose.IPAMAddress;
import dockercompose.IPAMConfig;
import dockercompose.IPAMOption;
import dockercompose.Network;
import dockercompose.NetworkAddress;
import dockercompose.NetworkConnector;
import dockercompose.NetworkDriverOpt;
import dockercompose.NetworkLabel;
import dockercompose.Secret;
import dockercompose.SecretConnector;
import dockercompose.Service;
import dockercompose.Volume;
import dockercompose.VolumeConnector;
import dockercompose.VolumeDriverOpt;
import dockercompose.VolumeLabel;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.dockercompose.services.DockerComposeGrammarAccess;

@SuppressWarnings("all")
public class DockerComposeSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DockerComposeGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DockercomposePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DockercomposePackage.ALIAS:
				sequence_Alias(context, (Alias) semanticObject); 
				return; 
			case DockercomposePackage.CONFIG:
				sequence_Config(context, (Config) semanticObject); 
				return; 
			case DockercomposePackage.CONFIG_CONNECTOR:
				sequence_ConfigConnector(context, (ConfigConnector) semanticObject); 
				return; 
			case DockercomposePackage.DNS:
				sequence_DNS(context, (DNS) semanticObject); 
				return; 
			case DockercomposePackage.DEPENDENCY:
				sequence_Dependency(context, (Dependency) semanticObject); 
				return; 
			case DockercomposePackage.DOCKER_COMPOSE:
				sequence_DockerCompose(context, (DockerCompose) semanticObject); 
				return; 
			case DockercomposePackage.IPAM:
				sequence_IPAM(context, (IPAM) semanticObject); 
				return; 
			case DockercomposePackage.IPAM_ADDRESS:
				sequence_IPAMAddress(context, (IPAMAddress) semanticObject); 
				return; 
			case DockercomposePackage.IPAM_CONFIG:
				sequence_IPAMConfig(context, (IPAMConfig) semanticObject); 
				return; 
			case DockercomposePackage.IPAM_OPTION:
				sequence_IPAMOption(context, (IPAMOption) semanticObject); 
				return; 
			case DockercomposePackage.NETWORK:
				sequence_Network(context, (Network) semanticObject); 
				return; 
			case DockercomposePackage.NETWORK_ADDRESS:
				sequence_NetworkAddress(context, (NetworkAddress) semanticObject); 
				return; 
			case DockercomposePackage.NETWORK_CONNECTOR:
				sequence_NetworkConnector(context, (NetworkConnector) semanticObject); 
				return; 
			case DockercomposePackage.NETWORK_DRIVER_OPT:
				sequence_NetworkDriverOpt(context, (NetworkDriverOpt) semanticObject); 
				return; 
			case DockercomposePackage.NETWORK_LABEL:
				sequence_NetworkLabel(context, (NetworkLabel) semanticObject); 
				return; 
			case DockercomposePackage.SECRET:
				sequence_Secret(context, (Secret) semanticObject); 
				return; 
			case DockercomposePackage.SECRET_CONNECTOR:
				sequence_SecretConnector(context, (SecretConnector) semanticObject); 
				return; 
			case DockercomposePackage.SERVICE:
				sequence_Service(context, (Service) semanticObject); 
				return; 
			case DockercomposePackage.VOLUME:
				sequence_Volume(context, (Volume) semanticObject); 
				return; 
			case DockercomposePackage.VOLUME_CONNECTOR:
				sequence_VolumeConnector(context, (VolumeConnector) semanticObject); 
				return; 
			case DockercomposePackage.VOLUME_DRIVER_OPT:
				sequence_VolumeDriverOpt(context, (VolumeDriverOpt) semanticObject); 
				return; 
			case DockercomposePackage.VOLUME_LABEL:
				sequence_VolumeLabel(context, (VolumeLabel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Alias returns Alias
	 *
	 * Constraint:
	 *     alias=EString
	 * </pre>
	 */
	protected void sequence_Alias(ISerializationContext context, Alias semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.ALIAS__ALIAS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.ALIAS__ALIAS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAliasAccess().getAliasEStringParserRuleCall_1_0(), semanticObject.getAlias());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ConfigConnector returns ConfigConnector
	 *
	 * Constraint:
	 *     (config=[Config|EString] | (config=[Config|EString] | target=PATH | uid=QUOTED_INT | gid=QUOTED_INT | mode=EInt)+)?
	 * </pre>
	 */
	protected void sequence_ConfigConnector(ISerializationContext context, ConfigConnector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Config returns Config
	 *
	 * Constraint:
	 *     (name=EString (external=EBoolean | file=EString | config_name=EString)*)
	 * </pre>
	 */
	protected void sequence_Config(ISerializationContext context, Config semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DNS returns DNS
	 *
	 * Constraint:
	 *     (dns1=EInt dns2=EInt dns3=EInt dns4=EInt)
	 * </pre>
	 */
	protected void sequence_DNS(ISerializationContext context, DNS semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.DNS__DNS1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.DNS__DNS1));
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.DNS__DNS2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.DNS__DNS2));
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.DNS__DNS3) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.DNS__DNS3));
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.DNS__DNS4) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.DNS__DNS4));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDNSAccess().getDns1EIntParserRuleCall_0_0(), semanticObject.getDns1());
		feeder.accept(grammarAccess.getDNSAccess().getDns2EIntParserRuleCall_2_0(), semanticObject.getDns2());
		feeder.accept(grammarAccess.getDNSAccess().getDns3EIntParserRuleCall_4_0(), semanticObject.getDns3());
		feeder.accept(grammarAccess.getDNSAccess().getDns4EIntParserRuleCall_6_0(), semanticObject.getDns4());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Dependency returns Dependency
	 *
	 * Constraint:
	 *     service=[Service|EString]
	 * </pre>
	 */
	protected void sequence_Dependency(ISerializationContext context, Dependency semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.DEPENDENCY__SERVICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.DEPENDENCY__SERVICE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDependencyAccess().getServiceServiceEStringParserRuleCall_1_0_1(), semanticObject.eGet(DockercomposePackage.Literals.DEPENDENCY__SERVICE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DockerCompose returns DockerCompose
	 *
	 * Constraint:
	 *     (services+=Service | networks+=Network | volumes+=Volume | configs+=Config | secrets+=Secret)*
	 * </pre>
	 */
	protected void sequence_DockerCompose(ISerializationContext context, DockerCompose semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     IPAMAddress returns IPAMAddress
	 *
	 * Constraint:
	 *     (name=EString dns=DNS)
	 * </pre>
	 */
	protected void sequence_IPAMAddress(ISerializationContext context, IPAMAddress semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.IPAM_ADDRESS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.IPAM_ADDRESS__NAME));
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.IPAM_ADDRESS__DNS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.IPAM_ADDRESS__DNS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIPAMAddressAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getIPAMAddressAccess().getDnsDNSParserRuleCall_3_0(), semanticObject.getDns());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     IPAMConfig returns IPAMConfig
	 *
	 * Constraint:
	 *     (subnet=NetworkAddress | ip_range=NetworkAddress | gateway=DNS | aux_addresses+=IPAMAddress)*
	 * </pre>
	 */
	protected void sequence_IPAMConfig(ISerializationContext context, IPAMConfig semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     IPAMOption returns IPAMOption
	 *
	 * Constraint:
	 *     (name=EString value=EString)
	 * </pre>
	 */
	protected void sequence_IPAMOption(ISerializationContext context, IPAMOption semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.IPAM_OPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.IPAM_OPTION__NAME));
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.IPAM_OPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.IPAM_OPTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIPAMOptionAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getIPAMOptionAccess().getValueEStringParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     IPAM returns IPAM
	 *
	 * Constraint:
	 *     (driver=EString | configs+=IPAMConfig | options+=IPAMOption)*
	 * </pre>
	 */
	protected void sequence_IPAM(ISerializationContext context, IPAM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NetworkAddress returns NetworkAddress
	 *
	 * Constraint:
	 *     (dns1=EInt dns2=EInt dns3=EInt dns4=EInt netId=EInt)
	 * </pre>
	 */
	protected void sequence_NetworkAddress(ISerializationContext context, NetworkAddress semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.DNS__DNS1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.DNS__DNS1));
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.DNS__DNS2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.DNS__DNS2));
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.DNS__DNS3) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.DNS__DNS3));
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.DNS__DNS4) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.DNS__DNS4));
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.NETWORK_ADDRESS__NET_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.NETWORK_ADDRESS__NET_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNetworkAddressAccess().getDns1EIntParserRuleCall_0_0(), semanticObject.getDns1());
		feeder.accept(grammarAccess.getNetworkAddressAccess().getDns2EIntParserRuleCall_2_0(), semanticObject.getDns2());
		feeder.accept(grammarAccess.getNetworkAddressAccess().getDns3EIntParserRuleCall_4_0(), semanticObject.getDns3());
		feeder.accept(grammarAccess.getNetworkAddressAccess().getDns4EIntParserRuleCall_6_0(), semanticObject.getDns4());
		feeder.accept(grammarAccess.getNetworkAddressAccess().getNetIdEIntParserRuleCall_8_0(), semanticObject.getNetId());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NetworkConnector returns NetworkConnector
	 *
	 * Constraint:
	 *     (network=[Network|EString] | (network=[Network|EString] (ipv4_address=DNS | priority=EInt | aliases+=Alias | link_local_ips+=DNS)*))
	 * </pre>
	 */
	protected void sequence_NetworkConnector(ISerializationContext context, NetworkConnector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NetworkDriverOpt returns NetworkDriverOpt
	 *
	 * Constraint:
	 *     (name=EString value=EString)
	 * </pre>
	 */
	protected void sequence_NetworkDriverOpt(ISerializationContext context, NetworkDriverOpt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.NETWORK_DRIVER_OPT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.NETWORK_DRIVER_OPT__NAME));
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.NETWORK_DRIVER_OPT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.NETWORK_DRIVER_OPT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNetworkDriverOptAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNetworkDriverOptAccess().getValueEStringParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NetworkLabel returns NetworkLabel
	 *
	 * Constraint:
	 *     (name=EString value=EString)
	 * </pre>
	 */
	protected void sequence_NetworkLabel(ISerializationContext context, NetworkLabel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.NETWORK_LABEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.NETWORK_LABEL__NAME));
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.NETWORK_LABEL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.NETWORK_LABEL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNetworkLabelAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNetworkLabelAccess().getValueEStringParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Network returns Network
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (
	 *             driver=EString | 
	 *             attachable=EBoolean | 
	 *             enable_ipv6=EBoolean | 
	 *             internal=EBoolean | 
	 *             external=EBoolean | 
	 *             network_name=EString | 
	 *             labels+=NetworkLabel | 
	 *             driver_opts+=NetworkDriverOpt | 
	 *             ipam=IPAM
	 *         )*
	 *     )
	 * </pre>
	 */
	protected void sequence_Network(ISerializationContext context, Network semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SecretConnector returns SecretConnector
	 *
	 * Constraint:
	 *     (secret=[Secret|EString] | (secret=[Secret|EString] | target=PATH | uid=QUOTED_INT | gid=QUOTED_INT | mode=EInt)+)?
	 * </pre>
	 */
	protected void sequence_SecretConnector(ISerializationContext context, SecretConnector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Secret returns Secret
	 *
	 * Constraint:
	 *     (name=EString (external=EBoolean | file=EString | environment=EString | secret_name=EString)*)
	 * </pre>
	 */
	protected void sequence_Secret(ISerializationContext context, Secret semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Service returns Service
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (
	 *             build=PATH | 
	 *             image=Image | 
	 *             cpu_count=EInt | 
	 *             command=EString | 
	 *             container_name=EString | 
	 *             restart=RestartPolicy | 
	 *             init=EBoolean | 
	 *             read_only=EBoolean | 
	 *             depends_on+=Dependency | 
	 *             networks+=NetworkConnector | 
	 *             volumes+=VolumeConnector | 
	 *             configs+=ConfigConnector | 
	 *             secrets+=SecretConnector | 
	 *             dns+=DNS | 
	 *             dns+=DNS
	 *         )*
	 *     )
	 * </pre>
	 */
	protected void sequence_Service(ISerializationContext context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VolumeConnector returns VolumeConnector
	 *
	 * Constraint:
	 *     (
	 *         (volume=[Volume|EString] container_path=PATH access_mode=AccessMode?) | 
	 *         (
	 *             volume=[Volume|EString] | 
	 *             type=MountType | 
	 *             container_path=PATH | 
	 *             read_only=EBoolean | 
	 *             propagation=PropagationType | 
	 *             nocopy=EBoolean | 
	 *             size=EInt
	 *         )+
	 *     )?
	 * </pre>
	 */
	protected void sequence_VolumeConnector(ISerializationContext context, VolumeConnector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VolumeDriverOpt returns VolumeDriverOpt
	 *
	 * Constraint:
	 *     (name=EString value=EString)
	 * </pre>
	 */
	protected void sequence_VolumeDriverOpt(ISerializationContext context, VolumeDriverOpt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.VOLUME_DRIVER_OPT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.VOLUME_DRIVER_OPT__NAME));
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.VOLUME_DRIVER_OPT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.VOLUME_DRIVER_OPT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVolumeDriverOptAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVolumeDriverOptAccess().getValueEStringParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VolumeLabel returns VolumeLabel
	 *
	 * Constraint:
	 *     (name=EString value=EString)
	 * </pre>
	 */
	protected void sequence_VolumeLabel(ISerializationContext context, VolumeLabel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.VOLUME_LABEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.VOLUME_LABEL__NAME));
			if (transientValues.isValueTransient(semanticObject, DockercomposePackage.Literals.VOLUME_LABEL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DockercomposePackage.Literals.VOLUME_LABEL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVolumeLabelAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVolumeLabelAccess().getValueEStringParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Volume returns Volume
	 *
	 * Constraint:
	 *     (name=EString (external?=EBoolean | driver=EString | volume_name=EString | labels+=VolumeLabel | driver_opts+=VolumeDriverOpt)*)
	 * </pre>
	 */
	protected void sequence_Volume(ISerializationContext context, Volume semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}