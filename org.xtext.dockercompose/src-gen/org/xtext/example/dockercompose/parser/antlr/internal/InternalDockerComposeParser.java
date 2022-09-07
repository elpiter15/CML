package org.xtext.example.dockercompose.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.dockercompose.services.DockerComposeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDockerComposeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VERSION_INT", "RULE_VERSION_FLOAT", "RULE_QUOTED_INT", "RULE_INT", "RULE_ID", "RULE_DEVICE_DEF", "RULE_PORT_DEF", "RULE_STRING", "RULE_ANY_OTHER", "RULE_PERMISSION", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'version:'", "'services:'", "'volumes:'", "'configs:'", "'secrets:'", "'networks:'", "'.'", "':'", "'build:'", "'image:'", "'cpu_count:'", "'command:'", "'container_name:'", "'restart:'", "'init:'", "'read_only:'", "'links:'", "'-'", "'depends_on:'", "'environment:'", "'devices:'", "'dns:'", "'ports:'", "'='", "'/'", "'@'", "'condition:'", "'ipv4_address:'", "'priority:'", "'aliases:'", "'link_local_ips:'", "'source:'", "'type:'", "'target:'", "'bind:'", "'propagation:'", "'volume:'", "'nocopy:'", "'tmpfs:'", "'size'", "'uid:'", "'gid:'", "'mode:'", "'{'", "'}'", "'driver:'", "'attachable:'", "'enable_ipv6:'", "'internal:'", "'external:'", "'name:'", "'labels:'", "'driver_opts:'", "'ipam:'", "'file:'", "'config:'", "'options:'", "'subnet:'", "'ip_range:'", "'gateway:'", "'aux_addresses:'", "'..'", "'\"'", "'true'", "'false'", "'\"no\"'", "'always'", "'on-failure'", "'unless-stopped'", "'rw'", "'ro'", "'z'", "'volume'", "'bind'", "'tmpfs'", "'npipe'", "'rprivate'", "'private'", "'rshared'", "'shared'", "'rslave'", "'slave'", "'service_started'", "'service_healthy'", "'service_completed_successfully'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=8;
    public static final int RULE_VERSION_INT=4;
    public static final int RULE_PORT_DEF=10;
    public static final int RULE_INT=7;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_PERMISSION=13;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int RULE_DEVICE_DEF=9;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_QUOTED_INT=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=16;
    public static final int RULE_VERSION_FLOAT=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalDockerComposeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDockerComposeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDockerComposeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDockerCompose.g"; }



     	private DockerComposeGrammarAccess grammarAccess;

        public InternalDockerComposeParser(TokenStream input, DockerComposeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DockerCompose";
       	}

       	@Override
       	protected DockerComposeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDockerCompose"
    // InternalDockerCompose.g:65:1: entryRuleDockerCompose returns [EObject current=null] : iv_ruleDockerCompose= ruleDockerCompose EOF ;
    public final EObject entryRuleDockerCompose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDockerCompose = null;


        try {
            // InternalDockerCompose.g:65:54: (iv_ruleDockerCompose= ruleDockerCompose EOF )
            // InternalDockerCompose.g:66:2: iv_ruleDockerCompose= ruleDockerCompose EOF
            {
             newCompositeNode(grammarAccess.getDockerComposeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDockerCompose=ruleDockerCompose();

            state._fsp--;

             current =iv_ruleDockerCompose; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDockerCompose"


    // $ANTLR start "ruleDockerCompose"
    // InternalDockerCompose.g:72:1: ruleDockerCompose returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleDockerCompose() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_version_2_0 = null;

        EObject lv_services_4_0 = null;

        EObject lv_volumes_6_0 = null;

        EObject lv_configs_8_0 = null;

        EObject lv_secrets_10_0 = null;

        EObject lv_networks_12_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) ) )+ {...}?) ) ) )
            // InternalDockerCompose.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) ) )+ {...}?) ) )
            {
            // InternalDockerCompose.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) ) )+ {...}?) ) )
            // InternalDockerCompose.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) ) )+ {...}?) )
            {
            // InternalDockerCompose.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) ) )+ {...}?) )
            // InternalDockerCompose.g:81:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getDockerComposeAccess().getUnorderedGroup());
            			
            // InternalDockerCompose.g:84:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) ) )+ {...}?)
            // InternalDockerCompose.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) ) )+ {...}?
            {
            // InternalDockerCompose.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=7;
                int LA6_0 = input.LA(1);

                if ( LA6_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 0) ) {
                    alt6=1;
                }
                else if ( LA6_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 1) ) {
                    alt6=2;
                }
                else if ( LA6_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 2) ) {
                    alt6=3;
                }
                else if ( LA6_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 3) ) {
                    alt6=4;
                }
                else if ( LA6_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 4) ) {
                    alt6=5;
                }
                else if ( LA6_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 5) ) {
                    alt6=6;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDockerCompose.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= ruleVersion ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= ruleVersion ) ) ) ) ) )
            	    // InternalDockerCompose.g:87:4: {...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= ruleVersion ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalDockerCompose.g:87:107: ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= ruleVersion ) ) ) ) )
            	    // InternalDockerCompose.g:88:5: ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= ruleVersion ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalDockerCompose.g:91:8: ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= ruleVersion ) ) ) )
            	    // InternalDockerCompose.g:91:9: {...}? => (otherlv_1= 'version:' ( (lv_version_2_0= ruleVersion ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:91:18: (otherlv_1= 'version:' ( (lv_version_2_0= ruleVersion ) ) )
            	    // InternalDockerCompose.g:91:19: otherlv_1= 'version:' ( (lv_version_2_0= ruleVersion ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getDockerComposeAccess().getVersionKeyword_0_0());
            	    							
            	    // InternalDockerCompose.g:95:8: ( (lv_version_2_0= ruleVersion ) )
            	    // InternalDockerCompose.g:96:9: (lv_version_2_0= ruleVersion )
            	    {
            	    // InternalDockerCompose.g:96:9: (lv_version_2_0= ruleVersion )
            	    // InternalDockerCompose.g:97:10: lv_version_2_0= ruleVersion
            	    {

            	    										newCompositeNode(grammarAccess.getDockerComposeAccess().getVersionVersionParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_version_2_0=ruleVersion();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getDockerComposeRule());
            	    										}
            	    										set(
            	    											current,
            	    											"version",
            	    											lv_version_2_0,
            	    											"org.xtext.example.dockercompose.DockerCompose.Version");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDockerComposeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDockerCompose.g:120:3: ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:120:3: ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) )
            	    // InternalDockerCompose.g:121:4: {...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalDockerCompose.g:121:107: ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) )
            	    // InternalDockerCompose.g:122:5: ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalDockerCompose.g:125:8: ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) )
            	    // InternalDockerCompose.g:125:9: {...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:125:18: (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ )
            	    // InternalDockerCompose.g:125:19: otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_5); 

            	    								newLeafNode(otherlv_3, grammarAccess.getDockerComposeAccess().getServicesKeyword_1_0());
            	    							
            	    // InternalDockerCompose.g:129:8: ( (lv_services_4_0= ruleService ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==RULE_ID) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:130:9: (lv_services_4_0= ruleService )
            	    	    {
            	    	    // InternalDockerCompose.g:130:9: (lv_services_4_0= ruleService )
            	    	    // InternalDockerCompose.g:131:10: lv_services_4_0= ruleService
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getDockerComposeAccess().getServicesServiceParserRuleCall_1_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_services_4_0=ruleService();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getDockerComposeRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"services",
            	    	    											lv_services_4_0,
            	    	    											"org.xtext.example.dockercompose.DockerCompose.Service");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDockerComposeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDockerCompose.g:154:3: ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:154:3: ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) )
            	    // InternalDockerCompose.g:155:4: {...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalDockerCompose.g:155:107: ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) )
            	    // InternalDockerCompose.g:156:5: ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalDockerCompose.g:159:8: ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) )
            	    // InternalDockerCompose.g:159:9: {...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:159:18: (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ )
            	    // InternalDockerCompose.g:159:19: otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_5); 

            	    								newLeafNode(otherlv_5, grammarAccess.getDockerComposeAccess().getVolumesKeyword_2_0());
            	    							
            	    // InternalDockerCompose.g:163:8: ( (lv_volumes_6_0= ruleVolume ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==RULE_ID) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:164:9: (lv_volumes_6_0= ruleVolume )
            	    	    {
            	    	    // InternalDockerCompose.g:164:9: (lv_volumes_6_0= ruleVolume )
            	    	    // InternalDockerCompose.g:165:10: lv_volumes_6_0= ruleVolume
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getDockerComposeAccess().getVolumesVolumeParserRuleCall_2_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_volumes_6_0=ruleVolume();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getDockerComposeRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"volumes",
            	    	    											lv_volumes_6_0,
            	    	    											"org.xtext.example.dockercompose.DockerCompose.Volume");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDockerComposeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDockerCompose.g:188:3: ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:188:3: ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) )
            	    // InternalDockerCompose.g:189:4: {...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalDockerCompose.g:189:107: ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) )
            	    // InternalDockerCompose.g:190:5: ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalDockerCompose.g:193:8: ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) )
            	    // InternalDockerCompose.g:193:9: {...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:193:18: (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ )
            	    // InternalDockerCompose.g:193:19: otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+
            	    {
            	    otherlv_7=(Token)match(input,20,FOLLOW_5); 

            	    								newLeafNode(otherlv_7, grammarAccess.getDockerComposeAccess().getConfigsKeyword_3_0());
            	    							
            	    // InternalDockerCompose.g:197:8: ( (lv_configs_8_0= ruleConfig ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==RULE_ID) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:198:9: (lv_configs_8_0= ruleConfig )
            	    	    {
            	    	    // InternalDockerCompose.g:198:9: (lv_configs_8_0= ruleConfig )
            	    	    // InternalDockerCompose.g:199:10: lv_configs_8_0= ruleConfig
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getDockerComposeAccess().getConfigsConfigParserRuleCall_3_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_configs_8_0=ruleConfig();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getDockerComposeRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"configs",
            	    	    											lv_configs_8_0,
            	    	    											"org.xtext.example.dockercompose.DockerCompose.Config");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDockerComposeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDockerCompose.g:222:3: ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:222:3: ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) )
            	    // InternalDockerCompose.g:223:4: {...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalDockerCompose.g:223:107: ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) )
            	    // InternalDockerCompose.g:224:5: ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalDockerCompose.g:227:8: ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) )
            	    // InternalDockerCompose.g:227:9: {...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:227:18: (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ )
            	    // InternalDockerCompose.g:227:19: otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+
            	    {
            	    otherlv_9=(Token)match(input,21,FOLLOW_5); 

            	    								newLeafNode(otherlv_9, grammarAccess.getDockerComposeAccess().getSecretsKeyword_4_0());
            	    							
            	    // InternalDockerCompose.g:231:8: ( (lv_secrets_10_0= ruleSecret ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==RULE_ID) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:232:9: (lv_secrets_10_0= ruleSecret )
            	    	    {
            	    	    // InternalDockerCompose.g:232:9: (lv_secrets_10_0= ruleSecret )
            	    	    // InternalDockerCompose.g:233:10: lv_secrets_10_0= ruleSecret
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getDockerComposeAccess().getSecretsSecretParserRuleCall_4_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_secrets_10_0=ruleSecret();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getDockerComposeRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"secrets",
            	    	    											lv_secrets_10_0,
            	    	    											"org.xtext.example.dockercompose.DockerCompose.Secret");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDockerComposeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalDockerCompose.g:256:3: ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:256:3: ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) )
            	    // InternalDockerCompose.g:257:4: {...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalDockerCompose.g:257:107: ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) )
            	    // InternalDockerCompose.g:258:5: ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalDockerCompose.g:261:8: ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) )
            	    // InternalDockerCompose.g:261:9: {...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:261:18: (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ )
            	    // InternalDockerCompose.g:261:19: otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+
            	    {
            	    otherlv_11=(Token)match(input,22,FOLLOW_5); 

            	    								newLeafNode(otherlv_11, grammarAccess.getDockerComposeAccess().getNetworksKeyword_5_0());
            	    							
            	    // InternalDockerCompose.g:265:8: ( (lv_networks_12_0= ruleNetwork ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==RULE_ID) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:266:9: (lv_networks_12_0= ruleNetwork )
            	    	    {
            	    	    // InternalDockerCompose.g:266:9: (lv_networks_12_0= ruleNetwork )
            	    	    // InternalDockerCompose.g:267:10: lv_networks_12_0= ruleNetwork
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getDockerComposeAccess().getNetworksNetworkParserRuleCall_5_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_networks_12_0=ruleNetwork();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getDockerComposeRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"networks",
            	    	    											lv_networks_12_0,
            	    	    											"org.xtext.example.dockercompose.DockerCompose.Network");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDockerComposeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDockerComposeAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canLeave(grammarAccess.getDockerComposeAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getDockerComposeAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDockerCompose"


    // $ANTLR start "entryRuleVersion"
    // InternalDockerCompose.g:301:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalDockerCompose.g:301:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalDockerCompose.g:302:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalDockerCompose.g:308:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VERSION_INT_0= RULE_VERSION_INT | this_VERSION_FLOAT_1= RULE_VERSION_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VERSION_INT_0=null;
        Token this_VERSION_FLOAT_1=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:314:2: ( (this_VERSION_INT_0= RULE_VERSION_INT | this_VERSION_FLOAT_1= RULE_VERSION_FLOAT ) )
            // InternalDockerCompose.g:315:2: (this_VERSION_INT_0= RULE_VERSION_INT | this_VERSION_FLOAT_1= RULE_VERSION_FLOAT )
            {
            // InternalDockerCompose.g:315:2: (this_VERSION_INT_0= RULE_VERSION_INT | this_VERSION_FLOAT_1= RULE_VERSION_FLOAT )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_VERSION_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_VERSION_FLOAT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDockerCompose.g:316:3: this_VERSION_INT_0= RULE_VERSION_INT
                    {
                    this_VERSION_INT_0=(Token)match(input,RULE_VERSION_INT,FOLLOW_2); 

                    			current.merge(this_VERSION_INT_0);
                    		

                    			newLeafNode(this_VERSION_INT_0, grammarAccess.getVersionAccess().getVERSION_INTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:324:3: this_VERSION_FLOAT_1= RULE_VERSION_FLOAT
                    {
                    this_VERSION_FLOAT_1=(Token)match(input,RULE_VERSION_FLOAT,FOLLOW_2); 

                    			current.merge(this_VERSION_FLOAT_1);
                    		

                    			newLeafNode(this_VERSION_FLOAT_1, grammarAccess.getVersionAccess().getVERSION_FLOATTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleQuotedInt"
    // InternalDockerCompose.g:335:1: entryRuleQuotedInt returns [String current=null] : iv_ruleQuotedInt= ruleQuotedInt EOF ;
    public final String entryRuleQuotedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuotedInt = null;


        try {
            // InternalDockerCompose.g:335:49: (iv_ruleQuotedInt= ruleQuotedInt EOF )
            // InternalDockerCompose.g:336:2: iv_ruleQuotedInt= ruleQuotedInt EOF
            {
             newCompositeNode(grammarAccess.getQuotedIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuotedInt=ruleQuotedInt();

            state._fsp--;

             current =iv_ruleQuotedInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedInt"


    // $ANTLR start "ruleQuotedInt"
    // InternalDockerCompose.g:342:1: ruleQuotedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QUOTED_INT_0= RULE_QUOTED_INT | this_VERSION_INT_1= RULE_VERSION_INT ) ;
    public final AntlrDatatypeRuleToken ruleQuotedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_QUOTED_INT_0=null;
        Token this_VERSION_INT_1=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:348:2: ( (this_QUOTED_INT_0= RULE_QUOTED_INT | this_VERSION_INT_1= RULE_VERSION_INT ) )
            // InternalDockerCompose.g:349:2: (this_QUOTED_INT_0= RULE_QUOTED_INT | this_VERSION_INT_1= RULE_VERSION_INT )
            {
            // InternalDockerCompose.g:349:2: (this_QUOTED_INT_0= RULE_QUOTED_INT | this_VERSION_INT_1= RULE_VERSION_INT )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_QUOTED_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_VERSION_INT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDockerCompose.g:350:3: this_QUOTED_INT_0= RULE_QUOTED_INT
                    {
                    this_QUOTED_INT_0=(Token)match(input,RULE_QUOTED_INT,FOLLOW_2); 

                    			current.merge(this_QUOTED_INT_0);
                    		

                    			newLeafNode(this_QUOTED_INT_0, grammarAccess.getQuotedIntAccess().getQUOTED_INTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:358:3: this_VERSION_INT_1= RULE_VERSION_INT
                    {
                    this_VERSION_INT_1=(Token)match(input,RULE_VERSION_INT,FOLLOW_2); 

                    			current.merge(this_VERSION_INT_1);
                    		

                    			newLeafNode(this_VERSION_INT_1, grammarAccess.getQuotedIntAccess().getVERSION_INTTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuotedInt"


    // $ANTLR start "entryRuleEDouble"
    // InternalDockerCompose.g:369:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalDockerCompose.g:369:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalDockerCompose.g:370:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalDockerCompose.g:376:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:382:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalDockerCompose.g:383:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalDockerCompose.g:383:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalDockerCompose.g:384:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,23,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleService"
    // InternalDockerCompose.g:407:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalDockerCompose.g:407:48: (iv_ruleService= ruleService EOF )
            // InternalDockerCompose.g:408:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalDockerCompose.g:414:1: ruleService returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        AntlrDatatypeRuleToken lv_build_5_0 = null;

        AntlrDatatypeRuleToken lv_image_7_0 = null;

        AntlrDatatypeRuleToken lv_cpu_count_9_0 = null;

        AntlrDatatypeRuleToken lv_command_11_0 = null;

        AntlrDatatypeRuleToken lv_container_name_13_0 = null;

        Enumerator lv_restart_15_0 = null;

        AntlrDatatypeRuleToken lv_init_17_0 = null;

        AntlrDatatypeRuleToken lv_read_only_19_0 = null;

        EObject lv_links_22_0 = null;

        EObject lv_depends_on_24_0 = null;

        EObject lv_networks_26_0 = null;

        EObject lv_networks_27_0 = null;

        EObject lv_volumes_30_0 = null;

        EObject lv_configs_33_0 = null;

        EObject lv_secrets_36_0 = null;

        EObject lv_environment_38_0 = null;

        EObject lv_environment_39_0 = null;

        EObject lv_devices_42_0 = null;

        EObject lv_dns_45_0 = null;

        EObject lv_dns_46_0 = null;

        EObject lv_ports_49_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:420:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:421:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:421:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:422:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:422:3: ()
            // InternalDockerCompose.g:423:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceAccess().getServiceAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:429:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDockerCompose.g:430:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDockerCompose.g:430:4: (lv_name_1_0= RULE_ID )
            // InternalDockerCompose.g:431:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:451:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:452:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:452:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ ) ) ) ) )* ) )
            // InternalDockerCompose.g:453:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:456:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ ) ) ) ) )* )
            // InternalDockerCompose.g:457:6: ( ({...}? => ( ({...}? => (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ ) ) ) ) )*
            {
            // InternalDockerCompose.g:457:6: ( ({...}? => ( ({...}? => (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ ) ) ) ) )*
            loop24:
            do {
                int alt24=19;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // InternalDockerCompose.g:458:4: ({...}? => ( ({...}? => (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:458:4: ({...}? => ( ({...}? => (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) ) ) )
            	    // InternalDockerCompose.g:459:5: {...}? => ( ({...}? => (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDockerCompose.g:459:104: ( ({...}? => (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) ) )
            	    // InternalDockerCompose.g:460:6: ({...}? => (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDockerCompose.g:463:9: ({...}? => (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) )
            	    // InternalDockerCompose.g:463:10: {...}? => (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:463:19: (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) )
            	    // InternalDockerCompose.g:463:20: otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getBuildKeyword_3_0_0());
            	    								
            	    // InternalDockerCompose.g:467:9: ( (lv_build_5_0= rulePATH ) )
            	    // InternalDockerCompose.g:468:10: (lv_build_5_0= rulePATH )
            	    {
            	    // InternalDockerCompose.g:468:10: (lv_build_5_0= rulePATH )
            	    // InternalDockerCompose.g:469:11: lv_build_5_0= rulePATH
            	    {

            	    											newCompositeNode(grammarAccess.getServiceAccess().getBuildPATHParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_build_5_0=rulePATH();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getServiceRule());
            	    											}
            	    											set(
            	    												current,
            	    												"build",
            	    												lv_build_5_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.PATH");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDockerCompose.g:492:4: ({...}? => ( ({...}? => (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:492:4: ({...}? => ( ({...}? => (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) )
            	    // InternalDockerCompose.g:493:5: {...}? => ( ({...}? => (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDockerCompose.g:493:104: ( ({...}? => (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) )
            	    // InternalDockerCompose.g:494:6: ({...}? => (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDockerCompose.g:497:9: ({...}? => (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) )
            	    // InternalDockerCompose.g:497:10: {...}? => (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:497:19: (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) )
            	    // InternalDockerCompose.g:497:20: otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) )
            	    {
            	    otherlv_6=(Token)match(input,26,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getImageKeyword_3_1_0());
            	    								
            	    // InternalDockerCompose.g:501:9: ( (lv_image_7_0= ruleImage ) )
            	    // InternalDockerCompose.g:502:10: (lv_image_7_0= ruleImage )
            	    {
            	    // InternalDockerCompose.g:502:10: (lv_image_7_0= ruleImage )
            	    // InternalDockerCompose.g:503:11: lv_image_7_0= ruleImage
            	    {

            	    											newCompositeNode(grammarAccess.getServiceAccess().getImageImageParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_image_7_0=ruleImage();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getServiceRule());
            	    											}
            	    											set(
            	    												current,
            	    												"image",
            	    												lv_image_7_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.Image");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDockerCompose.g:526:4: ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:526:4: ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) )
            	    // InternalDockerCompose.g:527:5: {...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:527:104: ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) )
            	    // InternalDockerCompose.g:528:6: ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:531:9: ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) )
            	    // InternalDockerCompose.g:531:10: {...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:531:19: (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) )
            	    // InternalDockerCompose.g:531:20: otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) )
            	    {
            	    otherlv_8=(Token)match(input,27,FOLLOW_8); 

            	    									newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getCpu_countKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:535:9: ( (lv_cpu_count_9_0= ruleEInt ) )
            	    // InternalDockerCompose.g:536:10: (lv_cpu_count_9_0= ruleEInt )
            	    {
            	    // InternalDockerCompose.g:536:10: (lv_cpu_count_9_0= ruleEInt )
            	    // InternalDockerCompose.g:537:11: lv_cpu_count_9_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getServiceAccess().getCpu_countEIntParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_cpu_count_9_0=ruleEInt();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getServiceRule());
            	    											}
            	    											set(
            	    												current,
            	    												"cpu_count",
            	    												lv_cpu_count_9_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.EInt");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDockerCompose.g:560:4: ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:560:4: ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) ) ) ) )
            	    // InternalDockerCompose.g:561:5: {...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalDockerCompose.g:561:104: ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) ) ) )
            	    // InternalDockerCompose.g:562:6: ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalDockerCompose.g:565:9: ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) ) )
            	    // InternalDockerCompose.g:565:10: {...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:565:19: (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) )
            	    // InternalDockerCompose.g:565:20: otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) )
            	    {
            	    otherlv_10=(Token)match(input,28,FOLLOW_12); 

            	    									newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getCommandKeyword_3_3_0());
            	    								
            	    // InternalDockerCompose.g:569:9: ( (lv_command_11_0= ruleCommand ) )
            	    // InternalDockerCompose.g:570:10: (lv_command_11_0= ruleCommand )
            	    {
            	    // InternalDockerCompose.g:570:10: (lv_command_11_0= ruleCommand )
            	    // InternalDockerCompose.g:571:11: lv_command_11_0= ruleCommand
            	    {

            	    											newCompositeNode(grammarAccess.getServiceAccess().getCommandCommandParserRuleCall_3_3_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_command_11_0=ruleCommand();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getServiceRule());
            	    											}
            	    											set(
            	    												current,
            	    												"command",
            	    												lv_command_11_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.Command");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDockerCompose.g:594:4: ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:594:4: ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:595:5: {...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalDockerCompose.g:595:104: ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:596:6: ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalDockerCompose.g:599:9: ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:599:10: {...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:599:19: (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:599:20: otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,29,FOLLOW_13); 

            	    									newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getContainer_nameKeyword_3_4_0());
            	    								
            	    // InternalDockerCompose.g:603:9: ( (lv_container_name_13_0= ruleEString ) )
            	    // InternalDockerCompose.g:604:10: (lv_container_name_13_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:604:10: (lv_container_name_13_0= ruleEString )
            	    // InternalDockerCompose.g:605:11: lv_container_name_13_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getServiceAccess().getContainer_nameEStringParserRuleCall_3_4_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_container_name_13_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getServiceRule());
            	    											}
            	    											set(
            	    												current,
            	    												"container_name",
            	    												lv_container_name_13_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalDockerCompose.g:628:4: ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:628:4: ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) )
            	    // InternalDockerCompose.g:629:5: {...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalDockerCompose.g:629:104: ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) )
            	    // InternalDockerCompose.g:630:6: ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalDockerCompose.g:633:9: ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) )
            	    // InternalDockerCompose.g:633:10: {...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:633:19: (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) )
            	    // InternalDockerCompose.g:633:20: otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) )
            	    {
            	    otherlv_14=(Token)match(input,30,FOLLOW_14); 

            	    									newLeafNode(otherlv_14, grammarAccess.getServiceAccess().getRestartKeyword_3_5_0());
            	    								
            	    // InternalDockerCompose.g:637:9: ( (lv_restart_15_0= ruleRestartPolicy ) )
            	    // InternalDockerCompose.g:638:10: (lv_restart_15_0= ruleRestartPolicy )
            	    {
            	    // InternalDockerCompose.g:638:10: (lv_restart_15_0= ruleRestartPolicy )
            	    // InternalDockerCompose.g:639:11: lv_restart_15_0= ruleRestartPolicy
            	    {

            	    											newCompositeNode(grammarAccess.getServiceAccess().getRestartRestartPolicyEnumRuleCall_3_5_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_restart_15_0=ruleRestartPolicy();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getServiceRule());
            	    											}
            	    											set(
            	    												current,
            	    												"restart",
            	    												lv_restart_15_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.RestartPolicy");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalDockerCompose.g:662:4: ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:662:4: ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:663:5: {...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalDockerCompose.g:663:104: ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:664:6: ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalDockerCompose.g:667:9: ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:667:10: {...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:667:19: (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:667:20: otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) )
            	    {
            	    otherlv_16=(Token)match(input,31,FOLLOW_15); 

            	    									newLeafNode(otherlv_16, grammarAccess.getServiceAccess().getInitKeyword_3_6_0());
            	    								
            	    // InternalDockerCompose.g:671:9: ( (lv_init_17_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:672:10: (lv_init_17_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:672:10: (lv_init_17_0= ruleEBoolean )
            	    // InternalDockerCompose.g:673:11: lv_init_17_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getServiceAccess().getInitEBooleanParserRuleCall_3_6_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_init_17_0=ruleEBoolean();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getServiceRule());
            	    											}
            	    											set(
            	    												current,
            	    												"init",
            	    												lv_init_17_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.EBoolean");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalDockerCompose.g:696:4: ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:696:4: ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:697:5: {...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalDockerCompose.g:697:104: ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:698:6: ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalDockerCompose.g:701:9: ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:701:10: {...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:701:19: (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:701:20: otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) )
            	    {
            	    otherlv_18=(Token)match(input,32,FOLLOW_15); 

            	    									newLeafNode(otherlv_18, grammarAccess.getServiceAccess().getRead_onlyKeyword_3_7_0());
            	    								
            	    // InternalDockerCompose.g:705:9: ( (lv_read_only_19_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:706:10: (lv_read_only_19_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:706:10: (lv_read_only_19_0= ruleEBoolean )
            	    // InternalDockerCompose.g:707:11: lv_read_only_19_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getServiceAccess().getRead_onlyEBooleanParserRuleCall_3_7_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_read_only_19_0=ruleEBoolean();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getServiceRule());
            	    											}
            	    											set(
            	    												current,
            	    												"read_only",
            	    												lv_read_only_19_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.EBoolean");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalDockerCompose.g:730:4: ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:730:4: ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:731:5: {...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalDockerCompose.g:731:104: ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) )
            	    // InternalDockerCompose.g:732:6: ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalDockerCompose.g:735:9: ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) )
            	    // InternalDockerCompose.g:735:10: {...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:735:19: (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ )
            	    // InternalDockerCompose.g:735:20: otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+
            	    {
            	    otherlv_20=(Token)match(input,33,FOLLOW_16); 

            	    									newLeafNode(otherlv_20, grammarAccess.getServiceAccess().getLinksKeyword_3_8_0());
            	    								
            	    // InternalDockerCompose.g:739:9: (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==34) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:740:10: otherlv_21= '-' ( (lv_links_22_0= ruleLink ) )
            	    	    {
            	    	    otherlv_21=(Token)match(input,34,FOLLOW_5); 

            	    	    										newLeafNode(otherlv_21, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_8_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:744:10: ( (lv_links_22_0= ruleLink ) )
            	    	    // InternalDockerCompose.g:745:11: (lv_links_22_0= ruleLink )
            	    	    {
            	    	    // InternalDockerCompose.g:745:11: (lv_links_22_0= ruleLink )
            	    	    // InternalDockerCompose.g:746:12: lv_links_22_0= ruleLink
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServiceAccess().getLinksLinkParserRuleCall_3_8_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_links_22_0=ruleLink();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"links",
            	    	    													lv_links_22_0,
            	    	    													"org.xtext.example.dockercompose.DockerCompose.Link");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt9 >= 1 ) break loop9;
            	                EarlyExitException eee =
            	                    new EarlyExitException(9, input);
            	                throw eee;
            	        }
            	        cnt9++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalDockerCompose.g:770:4: ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:770:4: ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ ) ) ) )
            	    // InternalDockerCompose.g:771:5: {...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // InternalDockerCompose.g:771:104: ( ({...}? => (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ ) ) )
            	    // InternalDockerCompose.g:772:6: ({...}? => (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9);
            	    					
            	    // InternalDockerCompose.g:775:9: ({...}? => (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ ) )
            	    // InternalDockerCompose.g:775:10: {...}? => (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:775:19: (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ )
            	    // InternalDockerCompose.g:775:20: otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+
            	    {
            	    otherlv_23=(Token)match(input,35,FOLLOW_18); 

            	    									newLeafNode(otherlv_23, grammarAccess.getServiceAccess().getDepends_onKeyword_3_9_0());
            	    								
            	    // InternalDockerCompose.g:779:9: ( (lv_depends_on_24_0= ruleDependency ) )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==RULE_ID) ) {
            	            int LA10_2 = input.LA(2);

            	            if ( (LA10_2==24) ) {
            	                int LA10_4 = input.LA(3);

            	                if ( (LA10_4==43) ) {
            	                    alt10=1;
            	                }


            	            }


            	        }
            	        else if ( (LA10_0==34) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:780:10: (lv_depends_on_24_0= ruleDependency )
            	    	    {
            	    	    // InternalDockerCompose.g:780:10: (lv_depends_on_24_0= ruleDependency )
            	    	    // InternalDockerCompose.g:781:11: lv_depends_on_24_0= ruleDependency
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getServiceAccess().getDepends_onDependencyParserRuleCall_3_9_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_19);
            	    	    lv_depends_on_24_0=ruleDependency();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"depends_on",
            	    	    												lv_depends_on_24_0,
            	    	    												"org.xtext.example.dockercompose.DockerCompose.Dependency");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt10 >= 1 ) break loop10;
            	                EarlyExitException eee =
            	                    new EarlyExitException(10, input);
            	                throw eee;
            	        }
            	        cnt10++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalDockerCompose.g:804:4: ({...}? => ( ({...}? => (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:804:4: ({...}? => ( ({...}? => (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) ) ) ) )
            	    // InternalDockerCompose.g:805:5: {...}? => ( ({...}? => (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // InternalDockerCompose.g:805:105: ( ({...}? => (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) ) ) )
            	    // InternalDockerCompose.g:806:6: ({...}? => (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10);
            	    					
            	    // InternalDockerCompose.g:809:9: ({...}? => (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) ) )
            	    // InternalDockerCompose.g:809:10: {...}? => (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:809:19: (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) )
            	    // InternalDockerCompose.g:809:20: otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ )
            	    {
            	    otherlv_25=(Token)match(input,22,FOLLOW_18); 

            	    									newLeafNode(otherlv_25, grammarAccess.getServiceAccess().getNetworksKeyword_3_10_0());
            	    								
            	    // InternalDockerCompose.g:813:9: ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==RULE_ID) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==34) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalDockerCompose.g:814:10: ( (lv_networks_26_0= ruleNetworkConnector_long ) )+
            	            {
            	            // InternalDockerCompose.g:814:10: ( (lv_networks_26_0= ruleNetworkConnector_long ) )+
            	            int cnt11=0;
            	            loop11:
            	            do {
            	                int alt11=2;
            	                int LA11_0 = input.LA(1);

            	                if ( (LA11_0==RULE_ID) ) {
            	                    int LA11_2 = input.LA(2);

            	                    if ( (LA11_2==24) ) {
            	                        alt11=1;
            	                    }


            	                }


            	                switch (alt11) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:815:11: (lv_networks_26_0= ruleNetworkConnector_long )
            	            	    {
            	            	    // InternalDockerCompose.g:815:11: (lv_networks_26_0= ruleNetworkConnector_long )
            	            	    // InternalDockerCompose.g:816:12: lv_networks_26_0= ruleNetworkConnector_long
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getServiceAccess().getNetworksNetworkConnector_longParserRuleCall_3_10_1_0_0());
            	            	    											
            	            	    pushFollow(FOLLOW_20);
            	            	    lv_networks_26_0=ruleNetworkConnector_long();

            	            	    state._fsp--;


            	            	    												if (current==null) {
            	            	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    												}
            	            	    												add(
            	            	    													current,
            	            	    													"networks",
            	            	    													lv_networks_26_0,
            	            	    													"org.xtext.example.dockercompose.DockerCompose.NetworkConnector_long");
            	            	    												afterParserOrEnumRuleCall();
            	            	    											

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt11 >= 1 ) break loop11;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(11, input);
            	                        throw eee;
            	                }
            	                cnt11++;
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // InternalDockerCompose.g:834:10: ( (lv_networks_27_0= ruleNetworkConnector_short ) )+
            	            {
            	            // InternalDockerCompose.g:834:10: ( (lv_networks_27_0= ruleNetworkConnector_short ) )+
            	            int cnt12=0;
            	            loop12:
            	            do {
            	                int alt12=2;
            	                int LA12_0 = input.LA(1);

            	                if ( (LA12_0==34) ) {
            	                    alt12=1;
            	                }


            	                switch (alt12) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:835:11: (lv_networks_27_0= ruleNetworkConnector_short )
            	            	    {
            	            	    // InternalDockerCompose.g:835:11: (lv_networks_27_0= ruleNetworkConnector_short )
            	            	    // InternalDockerCompose.g:836:12: lv_networks_27_0= ruleNetworkConnector_short
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getServiceAccess().getNetworksNetworkConnector_shortParserRuleCall_3_10_1_1_0());
            	            	    											
            	            	    pushFollow(FOLLOW_19);
            	            	    lv_networks_27_0=ruleNetworkConnector_short();

            	            	    state._fsp--;


            	            	    												if (current==null) {
            	            	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    												}
            	            	    												add(
            	            	    													current,
            	            	    													"networks",
            	            	    													lv_networks_27_0,
            	            	    													"org.xtext.example.dockercompose.DockerCompose.NetworkConnector_short");
            	            	    												afterParserOrEnumRuleCall();
            	            	    											

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt12 >= 1 ) break loop12;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(12, input);
            	                        throw eee;
            	                }
            	                cnt12++;
            	            } while (true);


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalDockerCompose.g:860:4: ({...}? => ( ({...}? => (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:860:4: ({...}? => ( ({...}? => (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:861:5: {...}? => ( ({...}? => (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 11)");
            	    }
            	    // InternalDockerCompose.g:861:105: ( ({...}? => (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ ) ) )
            	    // InternalDockerCompose.g:862:6: ({...}? => (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 11);
            	    					
            	    // InternalDockerCompose.g:865:9: ({...}? => (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ ) )
            	    // InternalDockerCompose.g:865:10: {...}? => (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:865:19: (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ )
            	    // InternalDockerCompose.g:865:20: otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+
            	    {
            	    otherlv_28=(Token)match(input,19,FOLLOW_16); 

            	    									newLeafNode(otherlv_28, grammarAccess.getServiceAccess().getVolumesKeyword_3_11_0());
            	    								
            	    // InternalDockerCompose.g:869:9: (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+
            	    int cnt14=0;
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==34) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:870:10: otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) )
            	    	    {
            	    	    otherlv_29=(Token)match(input,34,FOLLOW_21); 

            	    	    										newLeafNode(otherlv_29, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_11_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:874:10: ( (lv_volumes_30_0= ruleVolumeConnector ) )
            	    	    // InternalDockerCompose.g:875:11: (lv_volumes_30_0= ruleVolumeConnector )
            	    	    {
            	    	    // InternalDockerCompose.g:875:11: (lv_volumes_30_0= ruleVolumeConnector )
            	    	    // InternalDockerCompose.g:876:12: lv_volumes_30_0= ruleVolumeConnector
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServiceAccess().getVolumesVolumeConnectorParserRuleCall_3_11_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_volumes_30_0=ruleVolumeConnector();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"volumes",
            	    	    													lv_volumes_30_0,
            	    	    													"org.xtext.example.dockercompose.DockerCompose.VolumeConnector");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt14 >= 1 ) break loop14;
            	                EarlyExitException eee =
            	                    new EarlyExitException(14, input);
            	                throw eee;
            	        }
            	        cnt14++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalDockerCompose.g:900:4: ({...}? => ( ({...}? => (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:900:4: ({...}? => ( ({...}? => (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:901:5: {...}? => ( ({...}? => (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 12)");
            	    }
            	    // InternalDockerCompose.g:901:105: ( ({...}? => (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ ) ) )
            	    // InternalDockerCompose.g:902:6: ({...}? => (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 12);
            	    					
            	    // InternalDockerCompose.g:905:9: ({...}? => (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ ) )
            	    // InternalDockerCompose.g:905:10: {...}? => (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:905:19: (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ )
            	    // InternalDockerCompose.g:905:20: otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+
            	    {
            	    otherlv_31=(Token)match(input,20,FOLLOW_16); 

            	    									newLeafNode(otherlv_31, grammarAccess.getServiceAccess().getConfigsKeyword_3_12_0());
            	    								
            	    // InternalDockerCompose.g:909:9: (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+
            	    int cnt15=0;
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==34) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:910:10: otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) )
            	    	    {
            	    	    otherlv_32=(Token)match(input,34,FOLLOW_22); 

            	    	    										newLeafNode(otherlv_32, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_12_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:914:10: ( (lv_configs_33_0= ruleConfigConnector ) )
            	    	    // InternalDockerCompose.g:915:11: (lv_configs_33_0= ruleConfigConnector )
            	    	    {
            	    	    // InternalDockerCompose.g:915:11: (lv_configs_33_0= ruleConfigConnector )
            	    	    // InternalDockerCompose.g:916:12: lv_configs_33_0= ruleConfigConnector
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServiceAccess().getConfigsConfigConnectorParserRuleCall_3_12_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_configs_33_0=ruleConfigConnector();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"configs",
            	    	    													lv_configs_33_0,
            	    	    													"org.xtext.example.dockercompose.DockerCompose.ConfigConnector");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt15 >= 1 ) break loop15;
            	                EarlyExitException eee =
            	                    new EarlyExitException(15, input);
            	                throw eee;
            	        }
            	        cnt15++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // InternalDockerCompose.g:940:4: ({...}? => ( ({...}? => (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:940:4: ({...}? => ( ({...}? => (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:941:5: {...}? => ( ({...}? => (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 13)");
            	    }
            	    // InternalDockerCompose.g:941:105: ( ({...}? => (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ ) ) )
            	    // InternalDockerCompose.g:942:6: ({...}? => (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 13);
            	    					
            	    // InternalDockerCompose.g:945:9: ({...}? => (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ ) )
            	    // InternalDockerCompose.g:945:10: {...}? => (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:945:19: (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ )
            	    // InternalDockerCompose.g:945:20: otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+
            	    {
            	    otherlv_34=(Token)match(input,21,FOLLOW_16); 

            	    									newLeafNode(otherlv_34, grammarAccess.getServiceAccess().getSecretsKeyword_3_13_0());
            	    								
            	    // InternalDockerCompose.g:949:9: (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+
            	    int cnt16=0;
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==34) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:950:10: otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) )
            	    	    {
            	    	    otherlv_35=(Token)match(input,34,FOLLOW_22); 

            	    	    										newLeafNode(otherlv_35, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_13_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:954:10: ( (lv_secrets_36_0= ruleSecretConnector ) )
            	    	    // InternalDockerCompose.g:955:11: (lv_secrets_36_0= ruleSecretConnector )
            	    	    {
            	    	    // InternalDockerCompose.g:955:11: (lv_secrets_36_0= ruleSecretConnector )
            	    	    // InternalDockerCompose.g:956:12: lv_secrets_36_0= ruleSecretConnector
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServiceAccess().getSecretsSecretConnectorParserRuleCall_3_13_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_secrets_36_0=ruleSecretConnector();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"secrets",
            	    	    													lv_secrets_36_0,
            	    	    													"org.xtext.example.dockercompose.DockerCompose.SecretConnector");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt16 >= 1 ) break loop16;
            	                EarlyExitException eee =
            	                    new EarlyExitException(16, input);
            	                throw eee;
            	        }
            	        cnt16++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // InternalDockerCompose.g:980:4: ({...}? => ( ({...}? => (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:980:4: ({...}? => ( ({...}? => (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) ) ) ) )
            	    // InternalDockerCompose.g:981:5: {...}? => ( ({...}? => (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 14)");
            	    }
            	    // InternalDockerCompose.g:981:105: ( ({...}? => (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) ) ) )
            	    // InternalDockerCompose.g:982:6: ({...}? => (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 14);
            	    					
            	    // InternalDockerCompose.g:985:9: ({...}? => (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) ) )
            	    // InternalDockerCompose.g:985:10: {...}? => (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:985:19: (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) )
            	    // InternalDockerCompose.g:985:20: otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ )
            	    {
            	    otherlv_37=(Token)match(input,36,FOLLOW_18); 

            	    									newLeafNode(otherlv_37, grammarAccess.getServiceAccess().getEnvironmentKeyword_3_14_0());
            	    								
            	    // InternalDockerCompose.g:989:9: ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==RULE_ID) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==34) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalDockerCompose.g:990:10: ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+
            	            {
            	            // InternalDockerCompose.g:990:10: ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+
            	            int cnt17=0;
            	            loop17:
            	            do {
            	                int alt17=2;
            	                int LA17_0 = input.LA(1);

            	                if ( (LA17_0==RULE_ID) ) {
            	                    int LA17_2 = input.LA(2);

            	                    if ( (LA17_2==24) ) {
            	                        alt17=1;
            	                    }


            	                }


            	                switch (alt17) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:991:11: (lv_environment_38_0= ruleEnvironmentVariableMap )
            	            	    {
            	            	    // InternalDockerCompose.g:991:11: (lv_environment_38_0= ruleEnvironmentVariableMap )
            	            	    // InternalDockerCompose.g:992:12: lv_environment_38_0= ruleEnvironmentVariableMap
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getServiceAccess().getEnvironmentEnvironmentVariableMapParserRuleCall_3_14_1_0_0());
            	            	    											
            	            	    pushFollow(FOLLOW_20);
            	            	    lv_environment_38_0=ruleEnvironmentVariableMap();

            	            	    state._fsp--;


            	            	    												if (current==null) {
            	            	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    												}
            	            	    												add(
            	            	    													current,
            	            	    													"environment",
            	            	    													lv_environment_38_0,
            	            	    													"org.xtext.example.dockercompose.DockerCompose.EnvironmentVariableMap");
            	            	    												afterParserOrEnumRuleCall();
            	            	    											

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt17 >= 1 ) break loop17;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(17, input);
            	                        throw eee;
            	                }
            	                cnt17++;
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // InternalDockerCompose.g:1010:10: ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+
            	            {
            	            // InternalDockerCompose.g:1010:10: ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+
            	            int cnt18=0;
            	            loop18:
            	            do {
            	                int alt18=2;
            	                int LA18_0 = input.LA(1);

            	                if ( (LA18_0==34) ) {
            	                    alt18=1;
            	                }


            	                switch (alt18) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:1011:11: (lv_environment_39_0= ruleEnvironmentVariableList )
            	            	    {
            	            	    // InternalDockerCompose.g:1011:11: (lv_environment_39_0= ruleEnvironmentVariableList )
            	            	    // InternalDockerCompose.g:1012:12: lv_environment_39_0= ruleEnvironmentVariableList
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getServiceAccess().getEnvironmentEnvironmentVariableListParserRuleCall_3_14_1_1_0());
            	            	    											
            	            	    pushFollow(FOLLOW_19);
            	            	    lv_environment_39_0=ruleEnvironmentVariableList();

            	            	    state._fsp--;


            	            	    												if (current==null) {
            	            	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    												}
            	            	    												add(
            	            	    													current,
            	            	    													"environment",
            	            	    													lv_environment_39_0,
            	            	    													"org.xtext.example.dockercompose.DockerCompose.EnvironmentVariableList");
            	            	    												afterParserOrEnumRuleCall();
            	            	    											

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt18 >= 1 ) break loop18;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(18, input);
            	                        throw eee;
            	                }
            	                cnt18++;
            	            } while (true);


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 16 :
            	    // InternalDockerCompose.g:1036:4: ({...}? => ( ({...}? => (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1036:4: ({...}? => ( ({...}? => (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:1037:5: {...}? => ( ({...}? => (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 15)");
            	    }
            	    // InternalDockerCompose.g:1037:105: ( ({...}? => (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ ) ) )
            	    // InternalDockerCompose.g:1038:6: ({...}? => (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 15);
            	    					
            	    // InternalDockerCompose.g:1041:9: ({...}? => (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ ) )
            	    // InternalDockerCompose.g:1041:10: {...}? => (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:1041:19: (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ )
            	    // InternalDockerCompose.g:1041:20: otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+
            	    {
            	    otherlv_40=(Token)match(input,37,FOLLOW_16); 

            	    									newLeafNode(otherlv_40, grammarAccess.getServiceAccess().getDevicesKeyword_3_15_0());
            	    								
            	    // InternalDockerCompose.g:1045:9: (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+
            	    int cnt20=0;
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==34) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:1046:10: otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) )
            	    	    {
            	    	    otherlv_41=(Token)match(input,34,FOLLOW_23); 

            	    	    										newLeafNode(otherlv_41, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_15_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:1050:10: ( (lv_devices_42_0= ruleDevice ) )
            	    	    // InternalDockerCompose.g:1051:11: (lv_devices_42_0= ruleDevice )
            	    	    {
            	    	    // InternalDockerCompose.g:1051:11: (lv_devices_42_0= ruleDevice )
            	    	    // InternalDockerCompose.g:1052:12: lv_devices_42_0= ruleDevice
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServiceAccess().getDevicesDeviceParserRuleCall_3_15_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_devices_42_0=ruleDevice();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"devices",
            	    	    													lv_devices_42_0,
            	    	    													"org.xtext.example.dockercompose.DockerCompose.Device");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt20 >= 1 ) break loop20;
            	                EarlyExitException eee =
            	                    new EarlyExitException(20, input);
            	                throw eee;
            	        }
            	        cnt20++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 17 :
            	    // InternalDockerCompose.g:1076:4: ({...}? => ( ({...}? => (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1076:4: ({...}? => ( ({...}? => (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) ) ) ) )
            	    // InternalDockerCompose.g:1077:5: {...}? => ( ({...}? => (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 16) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 16)");
            	    }
            	    // InternalDockerCompose.g:1077:105: ( ({...}? => (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) ) ) )
            	    // InternalDockerCompose.g:1078:6: ({...}? => (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 16);
            	    					
            	    // InternalDockerCompose.g:1081:9: ({...}? => (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) ) )
            	    // InternalDockerCompose.g:1081:10: {...}? => (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:1081:19: (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) )
            	    // InternalDockerCompose.g:1081:20: otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) )
            	    {
            	    otherlv_43=(Token)match(input,38,FOLLOW_24); 

            	    									newLeafNode(otherlv_43, grammarAccess.getServiceAccess().getDnsKeyword_3_16_0());
            	    								
            	    // InternalDockerCompose.g:1085:9: ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==34) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==RULE_INT) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalDockerCompose.g:1086:10: (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+
            	            {
            	            // InternalDockerCompose.g:1086:10: (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+
            	            int cnt21=0;
            	            loop21:
            	            do {
            	                int alt21=2;
            	                int LA21_0 = input.LA(1);

            	                if ( (LA21_0==34) ) {
            	                    alt21=1;
            	                }


            	                switch (alt21) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:1087:11: otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) )
            	            	    {
            	            	    otherlv_44=(Token)match(input,34,FOLLOW_24); 

            	            	    											newLeafNode(otherlv_44, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_16_1_0_0());
            	            	    										
            	            	    // InternalDockerCompose.g:1091:11: ( (lv_dns_45_0= ruleDNS ) )
            	            	    // InternalDockerCompose.g:1092:12: (lv_dns_45_0= ruleDNS )
            	            	    {
            	            	    // InternalDockerCompose.g:1092:12: (lv_dns_45_0= ruleDNS )
            	            	    // InternalDockerCompose.g:1093:13: lv_dns_45_0= ruleDNS
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getDnsDNSParserRuleCall_3_16_1_0_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_17);
            	            	    lv_dns_45_0=ruleDNS();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"dns",
            	            	    														lv_dns_45_0,
            	            	    														"org.xtext.example.dockercompose.DockerCompose.DNS");
            	            	    													afterParserOrEnumRuleCall();
            	            	    												

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt21 >= 1 ) break loop21;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(21, input);
            	                        throw eee;
            	                }
            	                cnt21++;
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // InternalDockerCompose.g:1112:10: ( (lv_dns_46_0= ruleDNS ) )
            	            {
            	            // InternalDockerCompose.g:1112:10: ( (lv_dns_46_0= ruleDNS ) )
            	            // InternalDockerCompose.g:1113:11: (lv_dns_46_0= ruleDNS )
            	            {
            	            // InternalDockerCompose.g:1113:11: (lv_dns_46_0= ruleDNS )
            	            // InternalDockerCompose.g:1114:12: lv_dns_46_0= ruleDNS
            	            {

            	            												newCompositeNode(grammarAccess.getServiceAccess().getDnsDNSParserRuleCall_3_16_1_1_0());
            	            											
            	            pushFollow(FOLLOW_10);
            	            lv_dns_46_0=ruleDNS();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getServiceRule());
            	            												}
            	            												add(
            	            													current,
            	            													"dns",
            	            													lv_dns_46_0,
            	            													"org.xtext.example.dockercompose.DockerCompose.DNS");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 18 :
            	    // InternalDockerCompose.g:1138:4: ({...}? => ( ({...}? => (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1138:4: ({...}? => ( ({...}? => (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:1139:5: {...}? => ( ({...}? => (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 17) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 17)");
            	    }
            	    // InternalDockerCompose.g:1139:105: ( ({...}? => (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ ) ) )
            	    // InternalDockerCompose.g:1140:6: ({...}? => (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 17);
            	    					
            	    // InternalDockerCompose.g:1143:9: ({...}? => (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ ) )
            	    // InternalDockerCompose.g:1143:10: {...}? => (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:1143:19: (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ )
            	    // InternalDockerCompose.g:1143:20: otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+
            	    {
            	    otherlv_47=(Token)match(input,39,FOLLOW_16); 

            	    									newLeafNode(otherlv_47, grammarAccess.getServiceAccess().getPortsKeyword_3_17_0());
            	    								
            	    // InternalDockerCompose.g:1147:9: (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+
            	    int cnt23=0;
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==34) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:1148:10: otherlv_48= '-' ( (lv_ports_49_0= rulePort ) )
            	    	    {
            	    	    otherlv_48=(Token)match(input,34,FOLLOW_25); 

            	    	    										newLeafNode(otherlv_48, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_17_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:1152:10: ( (lv_ports_49_0= rulePort ) )
            	    	    // InternalDockerCompose.g:1153:11: (lv_ports_49_0= rulePort )
            	    	    {
            	    	    // InternalDockerCompose.g:1153:11: (lv_ports_49_0= rulePort )
            	    	    // InternalDockerCompose.g:1154:12: lv_ports_49_0= rulePort
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServiceAccess().getPortsPortParserRuleCall_3_17_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_ports_49_0=rulePort();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"ports",
            	    	    													lv_ports_49_0,
            	    	    													"org.xtext.example.dockercompose.DockerCompose.Port");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt23 >= 1 ) break loop23;
            	                EarlyExitException eee =
            	                    new EarlyExitException(23, input);
            	                throw eee;
            	        }
            	        cnt23++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleEnvironmentVariableMap"
    // InternalDockerCompose.g:1189:1: entryRuleEnvironmentVariableMap returns [EObject current=null] : iv_ruleEnvironmentVariableMap= ruleEnvironmentVariableMap EOF ;
    public final EObject entryRuleEnvironmentVariableMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentVariableMap = null;


        try {
            // InternalDockerCompose.g:1189:63: (iv_ruleEnvironmentVariableMap= ruleEnvironmentVariableMap EOF )
            // InternalDockerCompose.g:1190:2: iv_ruleEnvironmentVariableMap= ruleEnvironmentVariableMap EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentVariableMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironmentVariableMap=ruleEnvironmentVariableMap();

            state._fsp--;

             current =iv_ruleEnvironmentVariableMap; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvironmentVariableMap"


    // $ANTLR start "ruleEnvironmentVariableMap"
    // InternalDockerCompose.g:1196:1: ruleEnvironmentVariableMap returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_value_3_0= ruleEString ) ) | ( (lv_value_4_0= rulePATH ) ) )? ) ;
    public final EObject ruleEnvironmentVariableMap() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1202:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_value_3_0= ruleEString ) ) | ( (lv_value_4_0= rulePATH ) ) )? ) )
            // InternalDockerCompose.g:1203:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_value_3_0= ruleEString ) ) | ( (lv_value_4_0= rulePATH ) ) )? )
            {
            // InternalDockerCompose.g:1203:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_value_3_0= ruleEString ) ) | ( (lv_value_4_0= rulePATH ) ) )? )
            // InternalDockerCompose.g:1204:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_value_3_0= ruleEString ) ) | ( (lv_value_4_0= rulePATH ) ) )?
            {
            // InternalDockerCompose.g:1204:3: ()
            // InternalDockerCompose.g:1205:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentVariableMapAccess().getEnvironmentVariableAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1211:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDockerCompose.g:1212:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDockerCompose.g:1212:4: (lv_name_1_0= RULE_ID )
            // InternalDockerCompose.g:1213:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnvironmentVariableMapAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnvironmentVariableMapRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvironmentVariableMapAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:1233:3: ( ( (lv_value_3_0= ruleEString ) ) | ( (lv_value_4_0= rulePATH ) ) )?
            int alt25=3;
            switch ( input.LA(1) ) {
                case RULE_VERSION_INT:
                case RULE_VERSION_FLOAT:
                case RULE_QUOTED_INT:
                case RULE_DEVICE_DEF:
                case RULE_PORT_DEF:
                case RULE_STRING:
                case 79:
                    {
                    alt25=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==EOF||LA25_2==RULE_ID||(LA25_2>=17 && LA25_2<=22)||(LA25_2>=25 && LA25_2<=33)||(LA25_2>=35 && LA25_2<=39)) ) {
                        alt25=1;
                    }
                    }
                    break;
                case 23:
                case 41:
                case 78:
                    {
                    alt25=2;
                    }
                    break;
            }

            switch (alt25) {
                case 1 :
                    // InternalDockerCompose.g:1234:4: ( (lv_value_3_0= ruleEString ) )
                    {
                    // InternalDockerCompose.g:1234:4: ( (lv_value_3_0= ruleEString ) )
                    // InternalDockerCompose.g:1235:5: (lv_value_3_0= ruleEString )
                    {
                    // InternalDockerCompose.g:1235:5: (lv_value_3_0= ruleEString )
                    // InternalDockerCompose.g:1236:6: lv_value_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentVariableMapAccess().getValueEStringParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentVariableMapRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.xtext.example.dockercompose.DockerCompose.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:1254:4: ( (lv_value_4_0= rulePATH ) )
                    {
                    // InternalDockerCompose.g:1254:4: ( (lv_value_4_0= rulePATH ) )
                    // InternalDockerCompose.g:1255:5: (lv_value_4_0= rulePATH )
                    {
                    // InternalDockerCompose.g:1255:5: (lv_value_4_0= rulePATH )
                    // InternalDockerCompose.g:1256:6: lv_value_4_0= rulePATH
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentVariableMapAccess().getValuePATHParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=rulePATH();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentVariableMapRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.xtext.example.dockercompose.DockerCompose.PATH");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvironmentVariableMap"


    // $ANTLR start "entryRuleEnvironmentVariableList"
    // InternalDockerCompose.g:1278:1: entryRuleEnvironmentVariableList returns [EObject current=null] : iv_ruleEnvironmentVariableList= ruleEnvironmentVariableList EOF ;
    public final EObject entryRuleEnvironmentVariableList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentVariableList = null;


        try {
            // InternalDockerCompose.g:1278:64: (iv_ruleEnvironmentVariableList= ruleEnvironmentVariableList EOF )
            // InternalDockerCompose.g:1279:2: iv_ruleEnvironmentVariableList= ruleEnvironmentVariableList EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentVariableListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironmentVariableList=ruleEnvironmentVariableList();

            state._fsp--;

             current =iv_ruleEnvironmentVariableList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvironmentVariableList"


    // $ANTLR start "ruleEnvironmentVariableList"
    // InternalDockerCompose.g:1285:1: ruleEnvironmentVariableList returns [EObject current=null] : ( () otherlv_1= '-' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( (lv_value_4_0= ruleEString ) ) | ( (lv_value_5_0= rulePATH ) ) ) )? ) ;
    public final EObject ruleEnvironmentVariableList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1291:2: ( ( () otherlv_1= '-' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( (lv_value_4_0= ruleEString ) ) | ( (lv_value_5_0= rulePATH ) ) ) )? ) )
            // InternalDockerCompose.g:1292:2: ( () otherlv_1= '-' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( (lv_value_4_0= ruleEString ) ) | ( (lv_value_5_0= rulePATH ) ) ) )? )
            {
            // InternalDockerCompose.g:1292:2: ( () otherlv_1= '-' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( (lv_value_4_0= ruleEString ) ) | ( (lv_value_5_0= rulePATH ) ) ) )? )
            // InternalDockerCompose.g:1293:3: () otherlv_1= '-' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( (lv_value_4_0= ruleEString ) ) | ( (lv_value_5_0= rulePATH ) ) ) )?
            {
            // InternalDockerCompose.g:1293:3: ()
            // InternalDockerCompose.g:1294:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentVariableListAccess().getEnvironmentVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentVariableListAccess().getHyphenMinusKeyword_1());
            		
            // InternalDockerCompose.g:1304:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDockerCompose.g:1305:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDockerCompose.g:1305:4: (lv_name_2_0= RULE_ID )
            // InternalDockerCompose.g:1306:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEnvironmentVariableListAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnvironmentVariableListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.dockercompose.DockerCompose.ID");
            				

            }


            }

            // InternalDockerCompose.g:1322:3: (otherlv_3= '=' ( ( (lv_value_4_0= ruleEString ) ) | ( (lv_value_5_0= rulePATH ) ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDockerCompose.g:1323:4: otherlv_3= '=' ( ( (lv_value_4_0= ruleEString ) ) | ( (lv_value_5_0= rulePATH ) ) )
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnvironmentVariableListAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalDockerCompose.g:1327:4: ( ( (lv_value_4_0= ruleEString ) ) | ( (lv_value_5_0= rulePATH ) ) )
                    int alt26=2;
                    switch ( input.LA(1) ) {
                    case RULE_STRING:
                        {
                        alt26=1;
                        }
                        break;
                    case RULE_VERSION_INT:
                    case RULE_VERSION_FLOAT:
                    case RULE_QUOTED_INT:
                    case RULE_ID:
                    case RULE_DEVICE_DEF:
                    case RULE_PORT_DEF:
                    case 79:
                        {
                        alt26=1;
                        }
                        break;
                    case 23:
                    case 41:
                    case 78:
                        {
                        alt26=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }

                    switch (alt26) {
                        case 1 :
                            // InternalDockerCompose.g:1328:5: ( (lv_value_4_0= ruleEString ) )
                            {
                            // InternalDockerCompose.g:1328:5: ( (lv_value_4_0= ruleEString ) )
                            // InternalDockerCompose.g:1329:6: (lv_value_4_0= ruleEString )
                            {
                            // InternalDockerCompose.g:1329:6: (lv_value_4_0= ruleEString )
                            // InternalDockerCompose.g:1330:7: lv_value_4_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getEnvironmentVariableListAccess().getValueEStringParserRuleCall_3_1_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_value_4_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEnvironmentVariableListRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_4_0,
                            								"org.xtext.example.dockercompose.DockerCompose.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalDockerCompose.g:1348:5: ( (lv_value_5_0= rulePATH ) )
                            {
                            // InternalDockerCompose.g:1348:5: ( (lv_value_5_0= rulePATH ) )
                            // InternalDockerCompose.g:1349:6: (lv_value_5_0= rulePATH )
                            {
                            // InternalDockerCompose.g:1349:6: (lv_value_5_0= rulePATH )
                            // InternalDockerCompose.g:1350:7: lv_value_5_0= rulePATH
                            {

                            							newCompositeNode(grammarAccess.getEnvironmentVariableListAccess().getValuePATHParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_value_5_0=rulePATH();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEnvironmentVariableListRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_5_0,
                            								"org.xtext.example.dockercompose.DockerCompose.PATH");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvironmentVariableList"


    // $ANTLR start "entryRulePort"
    // InternalDockerCompose.g:1373:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalDockerCompose.g:1373:45: (iv_rulePort= rulePort EOF )
            // InternalDockerCompose.g:1374:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalDockerCompose.g:1380:1: rulePort returns [EObject current=null] : ( () ( (lv_value_1_0= rulePorts ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1386:2: ( ( () ( (lv_value_1_0= rulePorts ) ) ) )
            // InternalDockerCompose.g:1387:2: ( () ( (lv_value_1_0= rulePorts ) ) )
            {
            // InternalDockerCompose.g:1387:2: ( () ( (lv_value_1_0= rulePorts ) ) )
            // InternalDockerCompose.g:1388:3: () ( (lv_value_1_0= rulePorts ) )
            {
            // InternalDockerCompose.g:1388:3: ()
            // InternalDockerCompose.g:1389:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPortAccess().getPortAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1395:3: ( (lv_value_1_0= rulePorts ) )
            // InternalDockerCompose.g:1396:4: (lv_value_1_0= rulePorts )
            {
            // InternalDockerCompose.g:1396:4: (lv_value_1_0= rulePorts )
            // InternalDockerCompose.g:1397:5: lv_value_1_0= rulePorts
            {

            					newCompositeNode(grammarAccess.getPortAccess().getValuePortsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=rulePorts();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.Ports");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleDevice"
    // InternalDockerCompose.g:1418:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalDockerCompose.g:1418:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalDockerCompose.g:1419:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalDockerCompose.g:1425:1: ruleDevice returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_DEVICE_DEF ) ) ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:1431:2: ( ( () ( (lv_value_1_0= RULE_DEVICE_DEF ) ) ) )
            // InternalDockerCompose.g:1432:2: ( () ( (lv_value_1_0= RULE_DEVICE_DEF ) ) )
            {
            // InternalDockerCompose.g:1432:2: ( () ( (lv_value_1_0= RULE_DEVICE_DEF ) ) )
            // InternalDockerCompose.g:1433:3: () ( (lv_value_1_0= RULE_DEVICE_DEF ) )
            {
            // InternalDockerCompose.g:1433:3: ()
            // InternalDockerCompose.g:1434:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeviceAccess().getDeviceAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1440:3: ( (lv_value_1_0= RULE_DEVICE_DEF ) )
            // InternalDockerCompose.g:1441:4: (lv_value_1_0= RULE_DEVICE_DEF )
            {
            // InternalDockerCompose.g:1441:4: (lv_value_1_0= RULE_DEVICE_DEF )
            // InternalDockerCompose.g:1442:5: lv_value_1_0= RULE_DEVICE_DEF
            {
            lv_value_1_0=(Token)match(input,RULE_DEVICE_DEF,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getDeviceAccess().getValueDEVICE_DEFTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.DEVICE_DEF");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleImage"
    // InternalDockerCompose.g:1462:1: entryRuleImage returns [String current=null] : iv_ruleImage= ruleImage EOF ;
    public final String entryRuleImage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImage = null;


        try {
            // InternalDockerCompose.g:1462:45: (iv_ruleImage= ruleImage EOF )
            // InternalDockerCompose.g:1463:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalDockerCompose.g:1469:1: ruleImage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_dotID_0= ruledotID (kw= ':' (this_EInt_2= ruleEInt | this_dotID_3= ruledotID )+ )* kw= '/' )? (this_dotID_5= ruledotID (kw= ':' (this_EInt_7= ruleEInt | this_dotID_8= ruledotID )+ )* kw= '/' )? this_ID_10= RULE_ID ( (kw= ':' (this_EInt_12= ruleEInt | this_EDouble_13= ruleEDouble | ( (kw= '-' )? this_dotID_15= ruledotID ) )+ ) | (kw= '@' this_dotID_17= ruledotID (kw= ':' (this_EInt_19= ruleEInt | this_dotID_20= ruledotID )+ )* ) )? ) ;
    public final AntlrDatatypeRuleToken ruleImage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_10=null;
        AntlrDatatypeRuleToken this_dotID_0 = null;

        AntlrDatatypeRuleToken this_EInt_2 = null;

        AntlrDatatypeRuleToken this_dotID_3 = null;

        AntlrDatatypeRuleToken this_dotID_5 = null;

        AntlrDatatypeRuleToken this_EInt_7 = null;

        AntlrDatatypeRuleToken this_dotID_8 = null;

        AntlrDatatypeRuleToken this_EInt_12 = null;

        AntlrDatatypeRuleToken this_EDouble_13 = null;

        AntlrDatatypeRuleToken this_dotID_15 = null;

        AntlrDatatypeRuleToken this_dotID_17 = null;

        AntlrDatatypeRuleToken this_EInt_19 = null;

        AntlrDatatypeRuleToken this_dotID_20 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1475:2: ( ( (this_dotID_0= ruledotID (kw= ':' (this_EInt_2= ruleEInt | this_dotID_3= ruledotID )+ )* kw= '/' )? (this_dotID_5= ruledotID (kw= ':' (this_EInt_7= ruleEInt | this_dotID_8= ruledotID )+ )* kw= '/' )? this_ID_10= RULE_ID ( (kw= ':' (this_EInt_12= ruleEInt | this_EDouble_13= ruleEDouble | ( (kw= '-' )? this_dotID_15= ruledotID ) )+ ) | (kw= '@' this_dotID_17= ruledotID (kw= ':' (this_EInt_19= ruleEInt | this_dotID_20= ruledotID )+ )* ) )? ) )
            // InternalDockerCompose.g:1476:2: ( (this_dotID_0= ruledotID (kw= ':' (this_EInt_2= ruleEInt | this_dotID_3= ruledotID )+ )* kw= '/' )? (this_dotID_5= ruledotID (kw= ':' (this_EInt_7= ruleEInt | this_dotID_8= ruledotID )+ )* kw= '/' )? this_ID_10= RULE_ID ( (kw= ':' (this_EInt_12= ruleEInt | this_EDouble_13= ruleEDouble | ( (kw= '-' )? this_dotID_15= ruledotID ) )+ ) | (kw= '@' this_dotID_17= ruledotID (kw= ':' (this_EInt_19= ruleEInt | this_dotID_20= ruledotID )+ )* ) )? )
            {
            // InternalDockerCompose.g:1476:2: ( (this_dotID_0= ruledotID (kw= ':' (this_EInt_2= ruleEInt | this_dotID_3= ruledotID )+ )* kw= '/' )? (this_dotID_5= ruledotID (kw= ':' (this_EInt_7= ruleEInt | this_dotID_8= ruledotID )+ )* kw= '/' )? this_ID_10= RULE_ID ( (kw= ':' (this_EInt_12= ruleEInt | this_EDouble_13= ruleEDouble | ( (kw= '-' )? this_dotID_15= ruledotID ) )+ ) | (kw= '@' this_dotID_17= ruledotID (kw= ':' (this_EInt_19= ruleEInt | this_dotID_20= ruledotID )+ )* ) )? )
            // InternalDockerCompose.g:1477:3: (this_dotID_0= ruledotID (kw= ':' (this_EInt_2= ruleEInt | this_dotID_3= ruledotID )+ )* kw= '/' )? (this_dotID_5= ruledotID (kw= ':' (this_EInt_7= ruleEInt | this_dotID_8= ruledotID )+ )* kw= '/' )? this_ID_10= RULE_ID ( (kw= ':' (this_EInt_12= ruleEInt | this_EDouble_13= ruleEDouble | ( (kw= '-' )? this_dotID_15= ruledotID ) )+ ) | (kw= '@' this_dotID_17= ruledotID (kw= ':' (this_EInt_19= ruleEInt | this_dotID_20= ruledotID )+ )* ) )?
            {
            // InternalDockerCompose.g:1477:3: (this_dotID_0= ruledotID (kw= ':' (this_EInt_2= ruleEInt | this_dotID_3= ruledotID )+ )* kw= '/' )?
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalDockerCompose.g:1478:4: this_dotID_0= ruledotID (kw= ':' (this_EInt_2= ruleEInt | this_dotID_3= ruledotID )+ )* kw= '/'
                    {

                    				newCompositeNode(grammarAccess.getImageAccess().getDotIDParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_29);
                    this_dotID_0=ruledotID();

                    state._fsp--;


                    				current.merge(this_dotID_0);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalDockerCompose.g:1488:4: (kw= ':' (this_EInt_2= ruleEInt | this_dotID_3= ruledotID )+ )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==24) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalDockerCompose.g:1489:5: kw= ':' (this_EInt_2= ruleEInt | this_dotID_3= ruledotID )+
                    	    {
                    	    kw=(Token)match(input,24,FOLLOW_30); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getImageAccess().getColonKeyword_0_1_0());
                    	    				
                    	    // InternalDockerCompose.g:1494:5: (this_EInt_2= ruleEInt | this_dotID_3= ruledotID )+
                    	    int cnt28=0;
                    	    loop28:
                    	    do {
                    	        int alt28=3;
                    	        int LA28_0 = input.LA(1);

                    	        if ( (LA28_0==RULE_INT) ) {
                    	            alt28=1;
                    	        }
                    	        else if ( (LA28_0==RULE_ID) ) {
                    	            alt28=2;
                    	        }


                    	        switch (alt28) {
                    	    	case 1 :
                    	    	    // InternalDockerCompose.g:1495:6: this_EInt_2= ruleEInt
                    	    	    {

                    	    	    						newCompositeNode(grammarAccess.getImageAccess().getEIntParserRuleCall_0_1_1_0());
                    	    	    					
                    	    	    pushFollow(FOLLOW_31);
                    	    	    this_EInt_2=ruleEInt();

                    	    	    state._fsp--;


                    	    	    						current.merge(this_EInt_2);
                    	    	    					

                    	    	    						afterParserOrEnumRuleCall();
                    	    	    					

                    	    	    }
                    	    	    break;
                    	    	case 2 :
                    	    	    // InternalDockerCompose.g:1506:6: this_dotID_3= ruledotID
                    	    	    {

                    	    	    						newCompositeNode(grammarAccess.getImageAccess().getDotIDParserRuleCall_0_1_1_1());
                    	    	    					
                    	    	    pushFollow(FOLLOW_31);
                    	    	    this_dotID_3=ruledotID();

                    	    	    state._fsp--;


                    	    	    						current.merge(this_dotID_3);
                    	    	    					

                    	    	    						afterParserOrEnumRuleCall();
                    	    	    					

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt28 >= 1 ) break loop28;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(28, input);
                    	                throw eee;
                    	        }
                    	        cnt28++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    kw=(Token)match(input,41,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getImageAccess().getSolidusKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalDockerCompose.g:1524:3: (this_dotID_5= ruledotID (kw= ':' (this_EInt_7= ruleEInt | this_dotID_8= ruledotID )+ )* kw= '/' )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalDockerCompose.g:1525:4: this_dotID_5= ruledotID (kw= ':' (this_EInt_7= ruleEInt | this_dotID_8= ruledotID )+ )* kw= '/'
                    {

                    				newCompositeNode(grammarAccess.getImageAccess().getDotIDParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_29);
                    this_dotID_5=ruledotID();

                    state._fsp--;


                    				current.merge(this_dotID_5);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalDockerCompose.g:1535:4: (kw= ':' (this_EInt_7= ruleEInt | this_dotID_8= ruledotID )+ )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==24) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalDockerCompose.g:1536:5: kw= ':' (this_EInt_7= ruleEInt | this_dotID_8= ruledotID )+
                    	    {
                    	    kw=(Token)match(input,24,FOLLOW_30); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getImageAccess().getColonKeyword_1_1_0());
                    	    				
                    	    // InternalDockerCompose.g:1541:5: (this_EInt_7= ruleEInt | this_dotID_8= ruledotID )+
                    	    int cnt31=0;
                    	    loop31:
                    	    do {
                    	        int alt31=3;
                    	        int LA31_0 = input.LA(1);

                    	        if ( (LA31_0==RULE_INT) ) {
                    	            alt31=1;
                    	        }
                    	        else if ( (LA31_0==RULE_ID) ) {
                    	            alt31=2;
                    	        }


                    	        switch (alt31) {
                    	    	case 1 :
                    	    	    // InternalDockerCompose.g:1542:6: this_EInt_7= ruleEInt
                    	    	    {

                    	    	    						newCompositeNode(grammarAccess.getImageAccess().getEIntParserRuleCall_1_1_1_0());
                    	    	    					
                    	    	    pushFollow(FOLLOW_31);
                    	    	    this_EInt_7=ruleEInt();

                    	    	    state._fsp--;


                    	    	    						current.merge(this_EInt_7);
                    	    	    					

                    	    	    						afterParserOrEnumRuleCall();
                    	    	    					

                    	    	    }
                    	    	    break;
                    	    	case 2 :
                    	    	    // InternalDockerCompose.g:1553:6: this_dotID_8= ruledotID
                    	    	    {

                    	    	    						newCompositeNode(grammarAccess.getImageAccess().getDotIDParserRuleCall_1_1_1_1());
                    	    	    					
                    	    	    pushFollow(FOLLOW_31);
                    	    	    this_dotID_8=ruledotID();

                    	    	    state._fsp--;


                    	    	    						current.merge(this_dotID_8);
                    	    	    					

                    	    	    						afterParserOrEnumRuleCall();
                    	    	    					

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt31 >= 1 ) break loop31;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(31, input);
                    	                throw eee;
                    	        }
                    	        cnt31++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    kw=(Token)match(input,41,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getImageAccess().getSolidusKeyword_1_2());
                    			

                    }
                    break;

            }

            this_ID_10=(Token)match(input,RULE_ID,FOLLOW_32); 

            			current.merge(this_ID_10);
            		

            			newLeafNode(this_ID_10, grammarAccess.getImageAccess().getIDTerminalRuleCall_2());
            		
            // InternalDockerCompose.g:1578:3: ( (kw= ':' (this_EInt_12= ruleEInt | this_EDouble_13= ruleEDouble | ( (kw= '-' )? this_dotID_15= ruledotID ) )+ ) | (kw= '@' this_dotID_17= ruledotID (kw= ':' (this_EInt_19= ruleEInt | this_dotID_20= ruledotID )+ )* ) )?
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==24) ) {
                alt38=1;
            }
            else if ( (LA38_0==42) ) {
                alt38=2;
            }
            switch (alt38) {
                case 1 :
                    // InternalDockerCompose.g:1579:4: (kw= ':' (this_EInt_12= ruleEInt | this_EDouble_13= ruleEDouble | ( (kw= '-' )? this_dotID_15= ruledotID ) )+ )
                    {
                    // InternalDockerCompose.g:1579:4: (kw= ':' (this_EInt_12= ruleEInt | this_EDouble_13= ruleEDouble | ( (kw= '-' )? this_dotID_15= ruledotID ) )+ )
                    // InternalDockerCompose.g:1580:5: kw= ':' (this_EInt_12= ruleEInt | this_EDouble_13= ruleEDouble | ( (kw= '-' )? this_dotID_15= ruledotID ) )+
                    {
                    kw=(Token)match(input,24,FOLLOW_33); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getImageAccess().getColonKeyword_3_0_0());
                    				
                    // InternalDockerCompose.g:1585:5: (this_EInt_12= ruleEInt | this_EDouble_13= ruleEDouble | ( (kw= '-' )? this_dotID_15= ruledotID ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=4;
                        switch ( input.LA(1) ) {
                        case RULE_ID:
                            {
                            int LA35_2 = input.LA(2);

                            if ( (LA35_2==EOF||(LA35_2>=RULE_INT && LA35_2<=RULE_ID)||(LA35_2>=17 && LA35_2<=23)||(LA35_2>=25 && LA35_2<=39)) ) {
                                alt35=3;
                            }


                            }
                            break;
                        case RULE_INT:
                            {
                            int LA35_3 = input.LA(2);

                            if ( (LA35_3==EOF||(LA35_3>=RULE_INT && LA35_3<=RULE_ID)||(LA35_3>=17 && LA35_3<=22)||(LA35_3>=25 && LA35_3<=39)) ) {
                                alt35=1;
                            }
                            else if ( (LA35_3==23) ) {
                                alt35=2;
                            }


                            }
                            break;
                        case 34:
                            {
                            alt35=3;
                            }
                            break;

                        }

                        switch (alt35) {
                    	case 1 :
                    	    // InternalDockerCompose.g:1586:6: this_EInt_12= ruleEInt
                    	    {

                    	    						newCompositeNode(grammarAccess.getImageAccess().getEIntParserRuleCall_3_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_34);
                    	    this_EInt_12=ruleEInt();

                    	    state._fsp--;


                    	    						current.merge(this_EInt_12);
                    	    					

                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDockerCompose.g:1597:6: this_EDouble_13= ruleEDouble
                    	    {

                    	    						newCompositeNode(grammarAccess.getImageAccess().getEDoubleParserRuleCall_3_0_1_1());
                    	    					
                    	    pushFollow(FOLLOW_34);
                    	    this_EDouble_13=ruleEDouble();

                    	    state._fsp--;


                    	    						current.merge(this_EDouble_13);
                    	    					

                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalDockerCompose.g:1608:6: ( (kw= '-' )? this_dotID_15= ruledotID )
                    	    {
                    	    // InternalDockerCompose.g:1608:6: ( (kw= '-' )? this_dotID_15= ruledotID )
                    	    // InternalDockerCompose.g:1609:7: (kw= '-' )? this_dotID_15= ruledotID
                    	    {
                    	    // InternalDockerCompose.g:1609:7: (kw= '-' )?
                    	    int alt34=2;
                    	    int LA34_0 = input.LA(1);

                    	    if ( (LA34_0==34) ) {
                    	        alt34=1;
                    	    }
                    	    switch (alt34) {
                    	        case 1 :
                    	            // InternalDockerCompose.g:1610:8: kw= '-'
                    	            {
                    	            kw=(Token)match(input,34,FOLLOW_5); 

                    	            								current.merge(kw);
                    	            								newLeafNode(kw, grammarAccess.getImageAccess().getHyphenMinusKeyword_3_0_1_2_0());
                    	            							

                    	            }
                    	            break;

                    	    }


                    	    							newCompositeNode(grammarAccess.getImageAccess().getDotIDParserRuleCall_3_0_1_2_1());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    this_dotID_15=ruledotID();

                    	    state._fsp--;


                    	    							current.merge(this_dotID_15);
                    	    						

                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:1630:4: (kw= '@' this_dotID_17= ruledotID (kw= ':' (this_EInt_19= ruleEInt | this_dotID_20= ruledotID )+ )* )
                    {
                    // InternalDockerCompose.g:1630:4: (kw= '@' this_dotID_17= ruledotID (kw= ':' (this_EInt_19= ruleEInt | this_dotID_20= ruledotID )+ )* )
                    // InternalDockerCompose.g:1631:5: kw= '@' this_dotID_17= ruledotID (kw= ':' (this_EInt_19= ruleEInt | this_dotID_20= ruledotID )+ )*
                    {
                    kw=(Token)match(input,42,FOLLOW_5); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getImageAccess().getCommercialAtKeyword_3_1_0());
                    				

                    					newCompositeNode(grammarAccess.getImageAccess().getDotIDParserRuleCall_3_1_1());
                    				
                    pushFollow(FOLLOW_35);
                    this_dotID_17=ruledotID();

                    state._fsp--;


                    					current.merge(this_dotID_17);
                    				

                    					afterParserOrEnumRuleCall();
                    				
                    // InternalDockerCompose.g:1646:5: (kw= ':' (this_EInt_19= ruleEInt | this_dotID_20= ruledotID )+ )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==24) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalDockerCompose.g:1647:6: kw= ':' (this_EInt_19= ruleEInt | this_dotID_20= ruledotID )+
                    	    {
                    	    kw=(Token)match(input,24,FOLLOW_30); 

                    	    						current.merge(kw);
                    	    						newLeafNode(kw, grammarAccess.getImageAccess().getColonKeyword_3_1_2_0());
                    	    					
                    	    // InternalDockerCompose.g:1652:6: (this_EInt_19= ruleEInt | this_dotID_20= ruledotID )+
                    	    int cnt36=0;
                    	    loop36:
                    	    do {
                    	        int alt36=3;
                    	        alt36 = dfa36.predict(input);
                    	        switch (alt36) {
                    	    	case 1 :
                    	    	    // InternalDockerCompose.g:1653:7: this_EInt_19= ruleEInt
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getImageAccess().getEIntParserRuleCall_3_1_2_1_0());
                    	    	    						
                    	    	    pushFollow(FOLLOW_36);
                    	    	    this_EInt_19=ruleEInt();

                    	    	    state._fsp--;


                    	    	    							current.merge(this_EInt_19);
                    	    	    						

                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }
                    	    	    break;
                    	    	case 2 :
                    	    	    // InternalDockerCompose.g:1664:7: this_dotID_20= ruledotID
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getImageAccess().getDotIDParserRuleCall_3_1_2_1_1());
                    	    	    						
                    	    	    pushFollow(FOLLOW_36);
                    	    	    this_dotID_20=ruledotID();

                    	    	    state._fsp--;


                    	    	    							current.merge(this_dotID_20);
                    	    	    						

                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt36 >= 1 ) break loop36;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(36, input);
                    	                throw eee;
                    	        }
                    	        cnt36++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleLink"
    // InternalDockerCompose.g:1682:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalDockerCompose.g:1682:45: (iv_ruleLink= ruleLink EOF )
            // InternalDockerCompose.g:1683:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalDockerCompose.g:1689:1: ruleLink returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_alias_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1695:2: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) ) )? ) )
            // InternalDockerCompose.g:1696:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) ) )? )
            {
            // InternalDockerCompose.g:1696:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) ) )? )
            // InternalDockerCompose.g:1697:3: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) ) )?
            {
            // InternalDockerCompose.g:1697:3: ()
            // InternalDockerCompose.g:1698:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkAccess().getLinkAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1704:3: ( (otherlv_1= RULE_ID ) )
            // InternalDockerCompose.g:1705:4: (otherlv_1= RULE_ID )
            {
            // InternalDockerCompose.g:1705:4: (otherlv_1= RULE_ID )
            // InternalDockerCompose.g:1706:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getServiceServiceCrossReference_1_0());
            				

            }


            }

            // InternalDockerCompose.g:1717:3: (otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==24) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDockerCompose.g:1718:4: otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getColonKeyword_2_0());
                    			
                    // InternalDockerCompose.g:1722:4: ( (lv_alias_3_0= ruleEString ) )
                    // InternalDockerCompose.g:1723:5: (lv_alias_3_0= ruleEString )
                    {
                    // InternalDockerCompose.g:1723:5: (lv_alias_3_0= ruleEString )
                    // InternalDockerCompose.g:1724:6: lv_alias_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getAliasEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_alias_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						set(
                    							current,
                    							"alias",
                    							lv_alias_3_0,
                    							"org.xtext.example.dockercompose.DockerCompose.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleDependency"
    // InternalDockerCompose.g:1746:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalDockerCompose.g:1746:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalDockerCompose.g:1747:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalDockerCompose.g:1753:1: ruleDependency returns [EObject current=null] : ( () ( (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'condition:' ( (lv_condition_6_0= ruleCondition ) ) ) ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_condition_6_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1759:2: ( ( () ( (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'condition:' ( (lv_condition_6_0= ruleCondition ) ) ) ) ) )
            // InternalDockerCompose.g:1760:2: ( () ( (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'condition:' ( (lv_condition_6_0= ruleCondition ) ) ) ) )
            {
            // InternalDockerCompose.g:1760:2: ( () ( (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'condition:' ( (lv_condition_6_0= ruleCondition ) ) ) ) )
            // InternalDockerCompose.g:1761:3: () ( (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'condition:' ( (lv_condition_6_0= ruleCondition ) ) ) )
            {
            // InternalDockerCompose.g:1761:3: ()
            // InternalDockerCompose.g:1762:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDependencyAccess().getDependencyAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1768:3: ( (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'condition:' ( (lv_condition_6_0= ruleCondition ) ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==34) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ID) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalDockerCompose.g:1769:4: (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalDockerCompose.g:1769:4: (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )
                    // InternalDockerCompose.g:1770:5: otherlv_1= '-' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_5); 

                    					newLeafNode(otherlv_1, grammarAccess.getDependencyAccess().getHyphenMinusKeyword_1_0_0());
                    				
                    // InternalDockerCompose.g:1774:5: ( (otherlv_2= RULE_ID ) )
                    // InternalDockerCompose.g:1775:6: (otherlv_2= RULE_ID )
                    {
                    // InternalDockerCompose.g:1775:6: (otherlv_2= RULE_ID )
                    // InternalDockerCompose.g:1776:7: otherlv_2= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDependencyRule());
                    							}
                    						
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(otherlv_2, grammarAccess.getDependencyAccess().getServiceServiceCrossReference_1_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:1789:4: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'condition:' ( (lv_condition_6_0= ruleCondition ) ) )
                    {
                    // InternalDockerCompose.g:1789:4: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'condition:' ( (lv_condition_6_0= ruleCondition ) ) )
                    // InternalDockerCompose.g:1790:5: ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'condition:' ( (lv_condition_6_0= ruleCondition ) )
                    {
                    // InternalDockerCompose.g:1790:5: ( (otherlv_3= RULE_ID ) )
                    // InternalDockerCompose.g:1791:6: (otherlv_3= RULE_ID )
                    {
                    // InternalDockerCompose.g:1791:6: (otherlv_3= RULE_ID )
                    // InternalDockerCompose.g:1792:7: otherlv_3= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDependencyRule());
                    							}
                    						
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    							newLeafNode(otherlv_3, grammarAccess.getDependencyAccess().getServiceServiceCrossReference_1_1_0_0());
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_37); 

                    					newLeafNode(otherlv_4, grammarAccess.getDependencyAccess().getColonKeyword_1_1_1());
                    				
                    otherlv_5=(Token)match(input,43,FOLLOW_38); 

                    					newLeafNode(otherlv_5, grammarAccess.getDependencyAccess().getConditionKeyword_1_1_2());
                    				
                    // InternalDockerCompose.g:1811:5: ( (lv_condition_6_0= ruleCondition ) )
                    // InternalDockerCompose.g:1812:6: (lv_condition_6_0= ruleCondition )
                    {
                    // InternalDockerCompose.g:1812:6: (lv_condition_6_0= ruleCondition )
                    // InternalDockerCompose.g:1813:7: lv_condition_6_0= ruleCondition
                    {

                    							newCompositeNode(grammarAccess.getDependencyAccess().getConditionConditionEnumRuleCall_1_1_3_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_condition_6_0=ruleCondition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDependencyRule());
                    							}
                    							set(
                    								current,
                    								"condition",
                    								lv_condition_6_0,
                    								"org.xtext.example.dockercompose.DockerCompose.Condition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleNetworkConnector_long"
    // InternalDockerCompose.g:1836:1: entryRuleNetworkConnector_long returns [EObject current=null] : iv_ruleNetworkConnector_long= ruleNetworkConnector_long EOF ;
    public final EObject entryRuleNetworkConnector_long() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConnector_long = null;


        try {
            // InternalDockerCompose.g:1836:62: (iv_ruleNetworkConnector_long= ruleNetworkConnector_long EOF )
            // InternalDockerCompose.g:1837:2: iv_ruleNetworkConnector_long= ruleNetworkConnector_long EOF
            {
             newCompositeNode(grammarAccess.getNetworkConnector_longRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkConnector_long=ruleNetworkConnector_long();

            state._fsp--;

             current =iv_ruleNetworkConnector_long; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNetworkConnector_long"


    // $ANTLR start "ruleNetworkConnector_long"
    // InternalDockerCompose.g:1843:1: ruleNetworkConnector_long returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleNetworkConnector_long() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_ipv4_address_5_0 = null;

        AntlrDatatypeRuleToken lv_priority_7_0 = null;

        EObject lv_aliases_10_0 = null;

        EObject lv_link_local_ips_13_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1849:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:1850:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:1850:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:1851:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:1851:3: ()
            // InternalDockerCompose.g:1852:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkConnector_longAccess().getNetworkConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1858:3: ( (otherlv_1= RULE_ID ) )
            // InternalDockerCompose.g:1859:4: (otherlv_1= RULE_ID )
            {
            // InternalDockerCompose.g:1859:4: (otherlv_1= RULE_ID )
            // InternalDockerCompose.g:1860:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetworkConnector_longRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_1, grammarAccess.getNetworkConnector_longAccess().getNetworkNetworkCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkConnector_longAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:1875:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:1876:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:1876:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )* ) )
            // InternalDockerCompose.g:1877:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:1880:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )* )
            // InternalDockerCompose.g:1881:6: ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )*
            {
            // InternalDockerCompose.g:1881:6: ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )*
            loop43:
            do {
                int alt43=5;
                int LA43_0 = input.LA(1);

                if ( LA43_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 0) ) {
                    alt43=1;
                }
                else if ( LA43_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 1) ) {
                    alt43=2;
                }
                else if ( LA43_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 2) ) {
                    alt43=3;
                }
                else if ( LA43_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 3) ) {
                    alt43=4;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalDockerCompose.g:1882:4: ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1882:4: ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) )
            	    // InternalDockerCompose.g:1883:5: {...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNetworkConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDockerCompose.g:1883:118: ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) )
            	    // InternalDockerCompose.g:1884:6: ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDockerCompose.g:1887:9: ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) )
            	    // InternalDockerCompose.g:1887:10: {...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNetworkConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1887:19: (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) )
            	    // InternalDockerCompose.g:1887:20: otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) )
            	    {
            	    otherlv_4=(Token)match(input,44,FOLLOW_24); 

            	    									newLeafNode(otherlv_4, grammarAccess.getNetworkConnector_longAccess().getIpv4_addressKeyword_3_0_0());
            	    								
            	    // InternalDockerCompose.g:1891:9: ( (lv_ipv4_address_5_0= ruleDNS ) )
            	    // InternalDockerCompose.g:1892:10: (lv_ipv4_address_5_0= ruleDNS )
            	    {
            	    // InternalDockerCompose.g:1892:10: (lv_ipv4_address_5_0= ruleDNS )
            	    // InternalDockerCompose.g:1893:11: lv_ipv4_address_5_0= ruleDNS
            	    {

            	    											newCompositeNode(grammarAccess.getNetworkConnector_longAccess().getIpv4_addressDNSParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_39);
            	    lv_ipv4_address_5_0=ruleDNS();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getNetworkConnector_longRule());
            	    											}
            	    											set(
            	    												current,
            	    												"ipv4_address",
            	    												lv_ipv4_address_5_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.DNS");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDockerCompose.g:1916:4: ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1916:4: ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) )
            	    // InternalDockerCompose.g:1917:5: {...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNetworkConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDockerCompose.g:1917:118: ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) )
            	    // InternalDockerCompose.g:1918:6: ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDockerCompose.g:1921:9: ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) )
            	    // InternalDockerCompose.g:1921:10: {...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNetworkConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1921:19: (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) )
            	    // InternalDockerCompose.g:1921:20: otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) )
            	    {
            	    otherlv_6=(Token)match(input,45,FOLLOW_8); 

            	    									newLeafNode(otherlv_6, grammarAccess.getNetworkConnector_longAccess().getPriorityKeyword_3_1_0());
            	    								
            	    // InternalDockerCompose.g:1925:9: ( (lv_priority_7_0= ruleEInt ) )
            	    // InternalDockerCompose.g:1926:10: (lv_priority_7_0= ruleEInt )
            	    {
            	    // InternalDockerCompose.g:1926:10: (lv_priority_7_0= ruleEInt )
            	    // InternalDockerCompose.g:1927:11: lv_priority_7_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getNetworkConnector_longAccess().getPriorityEIntParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_39);
            	    lv_priority_7_0=ruleEInt();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getNetworkConnector_longRule());
            	    											}
            	    											set(
            	    												current,
            	    												"priority",
            	    												lv_priority_7_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.EInt");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDockerCompose.g:1950:4: ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1950:4: ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:1951:5: {...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNetworkConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:1951:118: ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) )
            	    // InternalDockerCompose.g:1952:6: ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:1955:9: ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) )
            	    // InternalDockerCompose.g:1955:10: {...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNetworkConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1955:19: (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ )
            	    // InternalDockerCompose.g:1955:20: otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+
            	    {
            	    otherlv_8=(Token)match(input,46,FOLLOW_16); 

            	    									newLeafNode(otherlv_8, grammarAccess.getNetworkConnector_longAccess().getAliasesKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:1959:9: (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+
            	    int cnt41=0;
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==34) ) {
            	            alt41=1;
            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:1960:10: otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,34,FOLLOW_13); 

            	    	    										newLeafNode(otherlv_9, grammarAccess.getNetworkConnector_longAccess().getHyphenMinusKeyword_3_2_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:1964:10: ( (lv_aliases_10_0= ruleAlias ) )
            	    	    // InternalDockerCompose.g:1965:11: (lv_aliases_10_0= ruleAlias )
            	    	    {
            	    	    // InternalDockerCompose.g:1965:11: (lv_aliases_10_0= ruleAlias )
            	    	    // InternalDockerCompose.g:1966:12: lv_aliases_10_0= ruleAlias
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getNetworkConnector_longAccess().getAliasesAliasParserRuleCall_3_2_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_40);
            	    	    lv_aliases_10_0=ruleAlias();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getNetworkConnector_longRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"aliases",
            	    	    													lv_aliases_10_0,
            	    	    													"org.xtext.example.dockercompose.DockerCompose.Alias");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt41 >= 1 ) break loop41;
            	                EarlyExitException eee =
            	                    new EarlyExitException(41, input);
            	                throw eee;
            	        }
            	        cnt41++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDockerCompose.g:1990:4: ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1990:4: ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:1991:5: {...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNetworkConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalDockerCompose.g:1991:118: ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) )
            	    // InternalDockerCompose.g:1992:6: ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalDockerCompose.g:1995:9: ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) )
            	    // InternalDockerCompose.g:1995:10: {...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNetworkConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1995:19: (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ )
            	    // InternalDockerCompose.g:1995:20: otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+
            	    {
            	    otherlv_11=(Token)match(input,47,FOLLOW_16); 

            	    									newLeafNode(otherlv_11, grammarAccess.getNetworkConnector_longAccess().getLink_local_ipsKeyword_3_3_0());
            	    								
            	    // InternalDockerCompose.g:1999:9: (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+
            	    int cnt42=0;
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( (LA42_0==34) ) {
            	            alt42=1;
            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:2000:10: otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) )
            	    	    {
            	    	    otherlv_12=(Token)match(input,34,FOLLOW_24); 

            	    	    										newLeafNode(otherlv_12, grammarAccess.getNetworkConnector_longAccess().getHyphenMinusKeyword_3_3_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:2004:10: ( (lv_link_local_ips_13_0= ruleDNS ) )
            	    	    // InternalDockerCompose.g:2005:11: (lv_link_local_ips_13_0= ruleDNS )
            	    	    {
            	    	    // InternalDockerCompose.g:2005:11: (lv_link_local_ips_13_0= ruleDNS )
            	    	    // InternalDockerCompose.g:2006:12: lv_link_local_ips_13_0= ruleDNS
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getNetworkConnector_longAccess().getLink_local_ipsDNSParserRuleCall_3_3_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_40);
            	    	    lv_link_local_ips_13_0=ruleDNS();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getNetworkConnector_longRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"link_local_ips",
            	    	    													lv_link_local_ips_13_0,
            	    	    													"org.xtext.example.dockercompose.DockerCompose.DNS");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt42 >= 1 ) break loop42;
            	                EarlyExitException eee =
            	                    new EarlyExitException(42, input);
            	                throw eee;
            	        }
            	        cnt42++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNetworkConnector_long"


    // $ANTLR start "entryRuleNetworkConnector_short"
    // InternalDockerCompose.g:2041:1: entryRuleNetworkConnector_short returns [EObject current=null] : iv_ruleNetworkConnector_short= ruleNetworkConnector_short EOF ;
    public final EObject entryRuleNetworkConnector_short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConnector_short = null;


        try {
            // InternalDockerCompose.g:2041:63: (iv_ruleNetworkConnector_short= ruleNetworkConnector_short EOF )
            // InternalDockerCompose.g:2042:2: iv_ruleNetworkConnector_short= ruleNetworkConnector_short EOF
            {
             newCompositeNode(grammarAccess.getNetworkConnector_shortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkConnector_short=ruleNetworkConnector_short();

            state._fsp--;

             current =iv_ruleNetworkConnector_short; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNetworkConnector_short"


    // $ANTLR start "ruleNetworkConnector_short"
    // InternalDockerCompose.g:2048:1: ruleNetworkConnector_short returns [EObject current=null] : ( () otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleNetworkConnector_short() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:2054:2: ( ( () otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDockerCompose.g:2055:2: ( () otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDockerCompose.g:2055:2: ( () otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) )
            // InternalDockerCompose.g:2056:3: () otherlv_1= '-' ( (otherlv_2= RULE_ID ) )
            {
            // InternalDockerCompose.g:2056:3: ()
            // InternalDockerCompose.g:2057:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkConnector_shortAccess().getNetworkConnectorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getNetworkConnector_shortAccess().getHyphenMinusKeyword_1());
            		
            // InternalDockerCompose.g:2067:3: ( (otherlv_2= RULE_ID ) )
            // InternalDockerCompose.g:2068:4: (otherlv_2= RULE_ID )
            {
            // InternalDockerCompose.g:2068:4: (otherlv_2= RULE_ID )
            // InternalDockerCompose.g:2069:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetworkConnector_shortRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getNetworkConnector_shortAccess().getNetworkNetworkCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNetworkConnector_short"


    // $ANTLR start "entryRuleAlias"
    // InternalDockerCompose.g:2084:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // InternalDockerCompose.g:2084:46: (iv_ruleAlias= ruleAlias EOF )
            // InternalDockerCompose.g:2085:2: iv_ruleAlias= ruleAlias EOF
            {
             newCompositeNode(grammarAccess.getAliasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlias=ruleAlias();

            state._fsp--;

             current =iv_ruleAlias; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlias"


    // $ANTLR start "ruleAlias"
    // InternalDockerCompose.g:2091:1: ruleAlias returns [EObject current=null] : ( () ( (lv_alias_1_0= ruleEString ) ) ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_alias_1_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:2097:2: ( ( () ( (lv_alias_1_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:2098:2: ( () ( (lv_alias_1_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:2098:2: ( () ( (lv_alias_1_0= ruleEString ) ) )
            // InternalDockerCompose.g:2099:3: () ( (lv_alias_1_0= ruleEString ) )
            {
            // InternalDockerCompose.g:2099:3: ()
            // InternalDockerCompose.g:2100:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAliasAccess().getAliasAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2106:3: ( (lv_alias_1_0= ruleEString ) )
            // InternalDockerCompose.g:2107:4: (lv_alias_1_0= ruleEString )
            {
            // InternalDockerCompose.g:2107:4: (lv_alias_1_0= ruleEString )
            // InternalDockerCompose.g:2108:5: lv_alias_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAliasAccess().getAliasEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_alias_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAliasRule());
            					}
            					set(
            						current,
            						"alias",
            						lv_alias_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlias"


    // $ANTLR start "entryRuleVolumeConnector"
    // InternalDockerCompose.g:2129:1: entryRuleVolumeConnector returns [EObject current=null] : iv_ruleVolumeConnector= ruleVolumeConnector EOF ;
    public final EObject entryRuleVolumeConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumeConnector = null;


        try {
            // InternalDockerCompose.g:2129:56: (iv_ruleVolumeConnector= ruleVolumeConnector EOF )
            // InternalDockerCompose.g:2130:2: iv_ruleVolumeConnector= ruleVolumeConnector EOF
            {
             newCompositeNode(grammarAccess.getVolumeConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVolumeConnector=ruleVolumeConnector();

            state._fsp--;

             current =iv_ruleVolumeConnector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVolumeConnector"


    // $ANTLR start "ruleVolumeConnector"
    // InternalDockerCompose.g:2136:1: ruleVolumeConnector returns [EObject current=null] : ( () ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ) ;
    public final EObject ruleVolumeConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_container_path_3_0 = null;

        Enumerator lv_access_mode_5_0 = null;

        Enumerator lv_type_10_0 = null;

        AntlrDatatypeRuleToken lv_container_path_12_0 = null;

        AntlrDatatypeRuleToken lv_read_only_14_0 = null;

        Enumerator lv_propagation_17_0 = null;

        AntlrDatatypeRuleToken lv_nocopy_20_0 = null;

        AntlrDatatypeRuleToken lv_size_24_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:2142:2: ( ( () ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ) )
            // InternalDockerCompose.g:2143:2: ( () ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            {
            // InternalDockerCompose.g:2143:2: ( () ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalDockerCompose.g:2144:3: () ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalDockerCompose.g:2144:3: ()
            // InternalDockerCompose.g:2145:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeConnectorAccess().getVolumeConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2151:3: ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            else if ( (LA46_0==32||(LA46_0>=48 && LA46_0<=51)||LA46_0==53||LA46_0==55) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalDockerCompose.g:2152:4: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? )
                    {
                    // InternalDockerCompose.g:2152:4: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? )
                    // InternalDockerCompose.g:2153:5: ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )?
                    {
                    // InternalDockerCompose.g:2153:5: ( (otherlv_1= RULE_ID ) )
                    // InternalDockerCompose.g:2154:6: (otherlv_1= RULE_ID )
                    {
                    // InternalDockerCompose.g:2154:6: (otherlv_1= RULE_ID )
                    // InternalDockerCompose.g:2155:7: otherlv_1= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getVolumeConnectorRule());
                    							}
                    						
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_9); 

                    							newLeafNode(otherlv_1, grammarAccess.getVolumeConnectorAccess().getVolumeVolumeCrossReference_1_0_0_0());
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_11); 

                    					newLeafNode(otherlv_2, grammarAccess.getVolumeConnectorAccess().getColonKeyword_1_0_1());
                    				
                    // InternalDockerCompose.g:2170:5: ( (lv_container_path_3_0= rulePATH ) )
                    // InternalDockerCompose.g:2171:6: (lv_container_path_3_0= rulePATH )
                    {
                    // InternalDockerCompose.g:2171:6: (lv_container_path_3_0= rulePATH )
                    // InternalDockerCompose.g:2172:7: lv_container_path_3_0= rulePATH
                    {

                    							newCompositeNode(grammarAccess.getVolumeConnectorAccess().getContainer_pathPATHParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_35);
                    lv_container_path_3_0=rulePATH();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getVolumeConnectorRule());
                    							}
                    							set(
                    								current,
                    								"container_path",
                    								lv_container_path_3_0,
                    								"org.xtext.example.dockercompose.DockerCompose.PATH");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalDockerCompose.g:2189:5: (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==24) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalDockerCompose.g:2190:6: otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) )
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_41); 

                            						newLeafNode(otherlv_4, grammarAccess.getVolumeConnectorAccess().getColonKeyword_1_0_3_0());
                            					
                            // InternalDockerCompose.g:2194:6: ( (lv_access_mode_5_0= ruleAccessMode ) )
                            // InternalDockerCompose.g:2195:7: (lv_access_mode_5_0= ruleAccessMode )
                            {
                            // InternalDockerCompose.g:2195:7: (lv_access_mode_5_0= ruleAccessMode )
                            // InternalDockerCompose.g:2196:8: lv_access_mode_5_0= ruleAccessMode
                            {

                            								newCompositeNode(grammarAccess.getVolumeConnectorAccess().getAccess_modeAccessModeEnumRuleCall_1_0_3_1_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_access_mode_5_0=ruleAccessMode();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getVolumeConnectorRule());
                            								}
                            								set(
                            									current,
                            									"access_mode",
                            									lv_access_mode_5_0,
                            									"org.xtext.example.dockercompose.DockerCompose.AccessMode");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:2216:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
                    {
                    // InternalDockerCompose.g:2216:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
                    // InternalDockerCompose.g:2217:5: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalDockerCompose.g:2217:5: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
                    // InternalDockerCompose.g:2218:6: ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1());
                    					
                    // InternalDockerCompose.g:2221:6: ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
                    // InternalDockerCompose.g:2222:7: ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) ) ) ) )+ {...}?
                    {
                    // InternalDockerCompose.g:2222:7: ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) ) ) ) )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=8;
                        alt45 = dfa45.predict(input);
                        switch (alt45) {
                    	case 1 :
                    	    // InternalDockerCompose.g:2223:5: ({...}? => ( ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2223:5: ({...}? => ( ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2224:6: {...}? => ( ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 0)");
                    	    }
                    	    // InternalDockerCompose.g:2224:115: ( ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) ) )
                    	    // InternalDockerCompose.g:2225:7: ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 0);
                    	    						
                    	    // InternalDockerCompose.g:2228:10: ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) )
                    	    // InternalDockerCompose.g:2228:11: {...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:2228:20: (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) )
                    	    // InternalDockerCompose.g:2228:21: otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,48,FOLLOW_5); 

                    	    										newLeafNode(otherlv_7, grammarAccess.getVolumeConnectorAccess().getSourceKeyword_1_1_0_0());
                    	    									
                    	    // InternalDockerCompose.g:2232:10: ( (otherlv_8= RULE_ID ) )
                    	    // InternalDockerCompose.g:2233:11: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalDockerCompose.g:2233:11: (otherlv_8= RULE_ID )
                    	    // InternalDockerCompose.g:2234:12: otherlv_8= RULE_ID
                    	    {

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getVolumeConnectorRule());
                    	    												}
                    	    											
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_42); 

                    	    												newLeafNode(otherlv_8, grammarAccess.getVolumeConnectorAccess().getVolumeVolumeCrossReference_1_1_0_1_0());
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDockerCompose.g:2251:5: ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2251:5: ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2252:6: {...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 1)");
                    	    }
                    	    // InternalDockerCompose.g:2252:115: ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) )
                    	    // InternalDockerCompose.g:2253:7: ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 1);
                    	    						
                    	    // InternalDockerCompose.g:2256:10: ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) )
                    	    // InternalDockerCompose.g:2256:11: {...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:2256:20: (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) )
                    	    // InternalDockerCompose.g:2256:21: otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) )
                    	    {
                    	    otherlv_9=(Token)match(input,49,FOLLOW_43); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getVolumeConnectorAccess().getTypeKeyword_1_1_1_0());
                    	    									
                    	    // InternalDockerCompose.g:2260:10: ( (lv_type_10_0= ruleMountType ) )
                    	    // InternalDockerCompose.g:2261:11: (lv_type_10_0= ruleMountType )
                    	    {
                    	    // InternalDockerCompose.g:2261:11: (lv_type_10_0= ruleMountType )
                    	    // InternalDockerCompose.g:2262:12: lv_type_10_0= ruleMountType
                    	    {

                    	    												newCompositeNode(grammarAccess.getVolumeConnectorAccess().getTypeMountTypeEnumRuleCall_1_1_1_1_0());
                    	    											
                    	    pushFollow(FOLLOW_42);
                    	    lv_type_10_0=ruleMountType();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getVolumeConnectorRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"type",
                    	    													lv_type_10_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.MountType");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalDockerCompose.g:2285:5: ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2285:5: ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2286:6: {...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 2)");
                    	    }
                    	    // InternalDockerCompose.g:2286:115: ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) )
                    	    // InternalDockerCompose.g:2287:7: ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 2);
                    	    						
                    	    // InternalDockerCompose.g:2290:10: ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) )
                    	    // InternalDockerCompose.g:2290:11: {...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:2290:20: (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) )
                    	    // InternalDockerCompose.g:2290:21: otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) )
                    	    {
                    	    otherlv_11=(Token)match(input,50,FOLLOW_11); 

                    	    										newLeafNode(otherlv_11, grammarAccess.getVolumeConnectorAccess().getTargetKeyword_1_1_2_0());
                    	    									
                    	    // InternalDockerCompose.g:2294:10: ( (lv_container_path_12_0= rulePATH ) )
                    	    // InternalDockerCompose.g:2295:11: (lv_container_path_12_0= rulePATH )
                    	    {
                    	    // InternalDockerCompose.g:2295:11: (lv_container_path_12_0= rulePATH )
                    	    // InternalDockerCompose.g:2296:12: lv_container_path_12_0= rulePATH
                    	    {

                    	    												newCompositeNode(grammarAccess.getVolumeConnectorAccess().getContainer_pathPATHParserRuleCall_1_1_2_1_0());
                    	    											
                    	    pushFollow(FOLLOW_42);
                    	    lv_container_path_12_0=rulePATH();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getVolumeConnectorRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"container_path",
                    	    													lv_container_path_12_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.PATH");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalDockerCompose.g:2319:5: ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2319:5: ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2320:6: {...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 3)");
                    	    }
                    	    // InternalDockerCompose.g:2320:115: ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:2321:7: ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 3);
                    	    						
                    	    // InternalDockerCompose.g:2324:10: ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:2324:11: {...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:2324:20: (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:2324:21: otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_13=(Token)match(input,32,FOLLOW_15); 

                    	    										newLeafNode(otherlv_13, grammarAccess.getVolumeConnectorAccess().getRead_onlyKeyword_1_1_3_0());
                    	    									
                    	    // InternalDockerCompose.g:2328:10: ( (lv_read_only_14_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:2329:11: (lv_read_only_14_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:2329:11: (lv_read_only_14_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:2330:12: lv_read_only_14_0= ruleEBoolean
                    	    {

                    	    												newCompositeNode(grammarAccess.getVolumeConnectorAccess().getRead_onlyEBooleanParserRuleCall_1_1_3_1_0());
                    	    											
                    	    pushFollow(FOLLOW_42);
                    	    lv_read_only_14_0=ruleEBoolean();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getVolumeConnectorRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"read_only",
                    	    													lv_read_only_14_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.EBoolean");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalDockerCompose.g:2353:5: ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2353:5: ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2354:6: {...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 4)");
                    	    }
                    	    // InternalDockerCompose.g:2354:115: ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) )
                    	    // InternalDockerCompose.g:2355:7: ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 4);
                    	    						
                    	    // InternalDockerCompose.g:2358:10: ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) )
                    	    // InternalDockerCompose.g:2358:11: {...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:2358:20: (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) )
                    	    // InternalDockerCompose.g:2358:21: otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) )
                    	    {
                    	    otherlv_15=(Token)match(input,51,FOLLOW_44); 

                    	    										newLeafNode(otherlv_15, grammarAccess.getVolumeConnectorAccess().getBindKeyword_1_1_4_0());
                    	    									
                    	    otherlv_16=(Token)match(input,52,FOLLOW_45); 

                    	    										newLeafNode(otherlv_16, grammarAccess.getVolumeConnectorAccess().getPropagationKeyword_1_1_4_1());
                    	    									
                    	    // InternalDockerCompose.g:2366:10: ( (lv_propagation_17_0= rulePropagationType ) )
                    	    // InternalDockerCompose.g:2367:11: (lv_propagation_17_0= rulePropagationType )
                    	    {
                    	    // InternalDockerCompose.g:2367:11: (lv_propagation_17_0= rulePropagationType )
                    	    // InternalDockerCompose.g:2368:12: lv_propagation_17_0= rulePropagationType
                    	    {

                    	    												newCompositeNode(grammarAccess.getVolumeConnectorAccess().getPropagationPropagationTypeEnumRuleCall_1_1_4_2_0());
                    	    											
                    	    pushFollow(FOLLOW_42);
                    	    lv_propagation_17_0=rulePropagationType();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getVolumeConnectorRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"propagation",
                    	    													lv_propagation_17_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.PropagationType");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalDockerCompose.g:2391:5: ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2391:5: ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2392:6: {...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 5)");
                    	    }
                    	    // InternalDockerCompose.g:2392:115: ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:2393:7: ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 5);
                    	    						
                    	    // InternalDockerCompose.g:2396:10: ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:2396:11: {...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:2396:20: (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:2396:21: otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_18=(Token)match(input,53,FOLLOW_46); 

                    	    										newLeafNode(otherlv_18, grammarAccess.getVolumeConnectorAccess().getVolumeKeyword_1_1_5_0());
                    	    									
                    	    otherlv_19=(Token)match(input,54,FOLLOW_15); 

                    	    										newLeafNode(otherlv_19, grammarAccess.getVolumeConnectorAccess().getNocopyKeyword_1_1_5_1());
                    	    									
                    	    // InternalDockerCompose.g:2404:10: ( (lv_nocopy_20_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:2405:11: (lv_nocopy_20_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:2405:11: (lv_nocopy_20_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:2406:12: lv_nocopy_20_0= ruleEBoolean
                    	    {

                    	    												newCompositeNode(grammarAccess.getVolumeConnectorAccess().getNocopyEBooleanParserRuleCall_1_1_5_2_0());
                    	    											
                    	    pushFollow(FOLLOW_42);
                    	    lv_nocopy_20_0=ruleEBoolean();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getVolumeConnectorRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"nocopy",
                    	    													lv_nocopy_20_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.EBoolean");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // InternalDockerCompose.g:2429:5: ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2429:5: ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2430:6: {...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 6) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 6)");
                    	    }
                    	    // InternalDockerCompose.g:2430:115: ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) ) )
                    	    // InternalDockerCompose.g:2431:7: ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 6);
                    	    						
                    	    // InternalDockerCompose.g:2434:10: ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) )
                    	    // InternalDockerCompose.g:2434:11: {...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:2434:20: (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) )
                    	    // InternalDockerCompose.g:2434:21: otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) )
                    	    {
                    	    otherlv_21=(Token)match(input,55,FOLLOW_47); 

                    	    										newLeafNode(otherlv_21, grammarAccess.getVolumeConnectorAccess().getTmpfsKeyword_1_1_6_0());
                    	    									
                    	    otherlv_22=(Token)match(input,56,FOLLOW_9); 

                    	    										newLeafNode(otherlv_22, grammarAccess.getVolumeConnectorAccess().getSizeKeyword_1_1_6_1());
                    	    									
                    	    otherlv_23=(Token)match(input,24,FOLLOW_8); 

                    	    										newLeafNode(otherlv_23, grammarAccess.getVolumeConnectorAccess().getColonKeyword_1_1_6_2());
                    	    									
                    	    // InternalDockerCompose.g:2446:10: ( (lv_size_24_0= ruleEInt ) )
                    	    // InternalDockerCompose.g:2447:11: (lv_size_24_0= ruleEInt )
                    	    {
                    	    // InternalDockerCompose.g:2447:11: (lv_size_24_0= ruleEInt )
                    	    // InternalDockerCompose.g:2448:12: lv_size_24_0= ruleEInt
                    	    {

                    	    												newCompositeNode(grammarAccess.getVolumeConnectorAccess().getSizeEIntParserRuleCall_1_1_6_3_0());
                    	    											
                    	    pushFollow(FOLLOW_42);
                    	    lv_size_24_0=ruleEInt();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getVolumeConnectorRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"size",
                    	    													lv_size_24_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.EInt");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt45 >= 1 ) break loop45;
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1()) ) {
                        throw new FailedPredicateException(input, "ruleVolumeConnector", "getUnorderedGroupHelper().canLeave(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1())");
                    }

                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1());
                    					

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVolumeConnector"


    // $ANTLR start "entryRuleConfigConnector"
    // InternalDockerCompose.g:2484:1: entryRuleConfigConnector returns [EObject current=null] : iv_ruleConfigConnector= ruleConfigConnector EOF ;
    public final EObject entryRuleConfigConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigConnector = null;


        try {
            // InternalDockerCompose.g:2484:56: (iv_ruleConfigConnector= ruleConfigConnector EOF )
            // InternalDockerCompose.g:2485:2: iv_ruleConfigConnector= ruleConfigConnector EOF
            {
             newCompositeNode(grammarAccess.getConfigConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigConnector=ruleConfigConnector();

            state._fsp--;

             current =iv_ruleConfigConnector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigConnector"


    // $ANTLR start "ruleConfigConnector"
    // InternalDockerCompose.g:2491:1: ruleConfigConnector returns [EObject current=null] : ( () ( ( (otherlv_1= RULE_ID ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ) ;
    public final EObject ruleConfigConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_target_6_0 = null;

        AntlrDatatypeRuleToken lv_uid_8_0 = null;

        AntlrDatatypeRuleToken lv_gid_10_0 = null;

        AntlrDatatypeRuleToken lv_mode_12_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:2497:2: ( ( () ( ( (otherlv_1= RULE_ID ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ) )
            // InternalDockerCompose.g:2498:2: ( () ( ( (otherlv_1= RULE_ID ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            {
            // InternalDockerCompose.g:2498:2: ( () ( ( (otherlv_1= RULE_ID ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalDockerCompose.g:2499:3: () ( ( (otherlv_1= RULE_ID ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalDockerCompose.g:2499:3: ()
            // InternalDockerCompose.g:2500:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigConnectorAccess().getConfigConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2506:3: ( ( (otherlv_1= RULE_ID ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            else if ( (LA48_0==48||LA48_0==50||(LA48_0>=57 && LA48_0<=59)) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalDockerCompose.g:2507:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalDockerCompose.g:2507:4: ( (otherlv_1= RULE_ID ) )
                    // InternalDockerCompose.g:2508:5: (otherlv_1= RULE_ID )
                    {
                    // InternalDockerCompose.g:2508:5: (otherlv_1= RULE_ID )
                    // InternalDockerCompose.g:2509:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfigConnectorRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getConfigConnectorAccess().getConfigConfigCrossReference_1_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:2521:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
                    {
                    // InternalDockerCompose.g:2521:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
                    // InternalDockerCompose.g:2522:5: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalDockerCompose.g:2522:5: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
                    // InternalDockerCompose.g:2523:6: ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1());
                    					
                    // InternalDockerCompose.g:2526:6: ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
                    // InternalDockerCompose.g:2527:7: ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?
                    {
                    // InternalDockerCompose.g:2527:7: ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=6;
                        int LA47_0 = input.LA(1);

                        if ( LA47_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 0) ) {
                            alt47=1;
                        }
                        else if ( LA47_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 1) ) {
                            alt47=2;
                        }
                        else if ( LA47_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 2) ) {
                            alt47=3;
                        }
                        else if ( LA47_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 3) ) {
                            alt47=4;
                        }
                        else if ( LA47_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 4) ) {
                            alt47=5;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalDockerCompose.g:2528:5: ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2528:5: ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2529:6: {...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleConfigConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 0)");
                    	    }
                    	    // InternalDockerCompose.g:2529:115: ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) )
                    	    // InternalDockerCompose.g:2530:7: ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 0);
                    	    						
                    	    // InternalDockerCompose.g:2533:10: ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) )
                    	    // InternalDockerCompose.g:2533:11: {...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleConfigConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:2533:20: (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) )
                    	    // InternalDockerCompose.g:2533:21: otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,48,FOLLOW_5); 

                    	    										newLeafNode(otherlv_3, grammarAccess.getConfigConnectorAccess().getSourceKeyword_1_1_0_0());
                    	    									
                    	    // InternalDockerCompose.g:2537:10: ( (otherlv_4= RULE_ID ) )
                    	    // InternalDockerCompose.g:2538:11: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalDockerCompose.g:2538:11: (otherlv_4= RULE_ID )
                    	    // InternalDockerCompose.g:2539:12: otherlv_4= RULE_ID
                    	    {

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getConfigConnectorRule());
                    	    												}
                    	    											
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_48); 

                    	    												newLeafNode(otherlv_4, grammarAccess.getConfigConnectorAccess().getConfigConfigCrossReference_1_1_0_1_0());
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDockerCompose.g:2556:5: ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2556:5: ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2557:6: {...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleConfigConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 1)");
                    	    }
                    	    // InternalDockerCompose.g:2557:115: ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) )
                    	    // InternalDockerCompose.g:2558:7: ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 1);
                    	    						
                    	    // InternalDockerCompose.g:2561:10: ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) )
                    	    // InternalDockerCompose.g:2561:11: {...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleConfigConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:2561:20: (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) )
                    	    // InternalDockerCompose.g:2561:21: otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) )
                    	    {
                    	    otherlv_5=(Token)match(input,50,FOLLOW_11); 

                    	    										newLeafNode(otherlv_5, grammarAccess.getConfigConnectorAccess().getTargetKeyword_1_1_1_0());
                    	    									
                    	    // InternalDockerCompose.g:2565:10: ( (lv_target_6_0= rulePATH ) )
                    	    // InternalDockerCompose.g:2566:11: (lv_target_6_0= rulePATH )
                    	    {
                    	    // InternalDockerCompose.g:2566:11: (lv_target_6_0= rulePATH )
                    	    // InternalDockerCompose.g:2567:12: lv_target_6_0= rulePATH
                    	    {

                    	    												newCompositeNode(grammarAccess.getConfigConnectorAccess().getTargetPATHParserRuleCall_1_1_1_1_0());
                    	    											
                    	    pushFollow(FOLLOW_48);
                    	    lv_target_6_0=rulePATH();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getConfigConnectorRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"target",
                    	    													lv_target_6_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.PATH");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalDockerCompose.g:2590:5: ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2590:5: ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2591:6: {...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleConfigConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 2)");
                    	    }
                    	    // InternalDockerCompose.g:2591:115: ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) )
                    	    // InternalDockerCompose.g:2592:7: ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 2);
                    	    						
                    	    // InternalDockerCompose.g:2595:10: ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) )
                    	    // InternalDockerCompose.g:2595:11: {...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleConfigConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:2595:20: (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) )
                    	    // InternalDockerCompose.g:2595:21: otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) )
                    	    {
                    	    otherlv_7=(Token)match(input,57,FOLLOW_49); 

                    	    										newLeafNode(otherlv_7, grammarAccess.getConfigConnectorAccess().getUidKeyword_1_1_2_0());
                    	    									
                    	    // InternalDockerCompose.g:2599:10: ( (lv_uid_8_0= ruleQuotedInt ) )
                    	    // InternalDockerCompose.g:2600:11: (lv_uid_8_0= ruleQuotedInt )
                    	    {
                    	    // InternalDockerCompose.g:2600:11: (lv_uid_8_0= ruleQuotedInt )
                    	    // InternalDockerCompose.g:2601:12: lv_uid_8_0= ruleQuotedInt
                    	    {

                    	    												newCompositeNode(grammarAccess.getConfigConnectorAccess().getUidQuotedIntParserRuleCall_1_1_2_1_0());
                    	    											
                    	    pushFollow(FOLLOW_48);
                    	    lv_uid_8_0=ruleQuotedInt();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getConfigConnectorRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"uid",
                    	    													lv_uid_8_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.QuotedInt");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalDockerCompose.g:2624:5: ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2624:5: ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2625:6: {...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleConfigConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 3)");
                    	    }
                    	    // InternalDockerCompose.g:2625:115: ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) )
                    	    // InternalDockerCompose.g:2626:7: ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 3);
                    	    						
                    	    // InternalDockerCompose.g:2629:10: ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) )
                    	    // InternalDockerCompose.g:2629:11: {...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleConfigConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:2629:20: (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) )
                    	    // InternalDockerCompose.g:2629:21: otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) )
                    	    {
                    	    otherlv_9=(Token)match(input,58,FOLLOW_49); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getConfigConnectorAccess().getGidKeyword_1_1_3_0());
                    	    									
                    	    // InternalDockerCompose.g:2633:10: ( (lv_gid_10_0= ruleQuotedInt ) )
                    	    // InternalDockerCompose.g:2634:11: (lv_gid_10_0= ruleQuotedInt )
                    	    {
                    	    // InternalDockerCompose.g:2634:11: (lv_gid_10_0= ruleQuotedInt )
                    	    // InternalDockerCompose.g:2635:12: lv_gid_10_0= ruleQuotedInt
                    	    {

                    	    												newCompositeNode(grammarAccess.getConfigConnectorAccess().getGidQuotedIntParserRuleCall_1_1_3_1_0());
                    	    											
                    	    pushFollow(FOLLOW_48);
                    	    lv_gid_10_0=ruleQuotedInt();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getConfigConnectorRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"gid",
                    	    													lv_gid_10_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.QuotedInt");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalDockerCompose.g:2658:5: ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2658:5: ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2659:6: {...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleConfigConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 4)");
                    	    }
                    	    // InternalDockerCompose.g:2659:115: ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) )
                    	    // InternalDockerCompose.g:2660:7: ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 4);
                    	    						
                    	    // InternalDockerCompose.g:2663:10: ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) )
                    	    // InternalDockerCompose.g:2663:11: {...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleConfigConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:2663:20: (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) )
                    	    // InternalDockerCompose.g:2663:21: otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) )
                    	    {
                    	    otherlv_11=(Token)match(input,59,FOLLOW_8); 

                    	    										newLeafNode(otherlv_11, grammarAccess.getConfigConnectorAccess().getModeKeyword_1_1_4_0());
                    	    									
                    	    // InternalDockerCompose.g:2667:10: ( (lv_mode_12_0= ruleEInt ) )
                    	    // InternalDockerCompose.g:2668:11: (lv_mode_12_0= ruleEInt )
                    	    {
                    	    // InternalDockerCompose.g:2668:11: (lv_mode_12_0= ruleEInt )
                    	    // InternalDockerCompose.g:2669:12: lv_mode_12_0= ruleEInt
                    	    {

                    	    												newCompositeNode(grammarAccess.getConfigConnectorAccess().getModeEIntParserRuleCall_1_1_4_1_0());
                    	    											
                    	    pushFollow(FOLLOW_48);
                    	    lv_mode_12_0=ruleEInt();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getConfigConnectorRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"mode",
                    	    													lv_mode_12_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.EInt");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt47 >= 1 ) break loop47;
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1()) ) {
                        throw new FailedPredicateException(input, "ruleConfigConnector", "getUnorderedGroupHelper().canLeave(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1())");
                    }

                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1());
                    					

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigConnector"


    // $ANTLR start "entryRuleSecretConnector"
    // InternalDockerCompose.g:2705:1: entryRuleSecretConnector returns [EObject current=null] : iv_ruleSecretConnector= ruleSecretConnector EOF ;
    public final EObject entryRuleSecretConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecretConnector = null;


        try {
            // InternalDockerCompose.g:2705:56: (iv_ruleSecretConnector= ruleSecretConnector EOF )
            // InternalDockerCompose.g:2706:2: iv_ruleSecretConnector= ruleSecretConnector EOF
            {
             newCompositeNode(grammarAccess.getSecretConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecretConnector=ruleSecretConnector();

            state._fsp--;

             current =iv_ruleSecretConnector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSecretConnector"


    // $ANTLR start "ruleSecretConnector"
    // InternalDockerCompose.g:2712:1: ruleSecretConnector returns [EObject current=null] : ( () ( ( (otherlv_1= RULE_ID ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ) ;
    public final EObject ruleSecretConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_target_6_0 = null;

        AntlrDatatypeRuleToken lv_uid_8_0 = null;

        AntlrDatatypeRuleToken lv_gid_10_0 = null;

        AntlrDatatypeRuleToken lv_mode_12_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:2718:2: ( ( () ( ( (otherlv_1= RULE_ID ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ) )
            // InternalDockerCompose.g:2719:2: ( () ( ( (otherlv_1= RULE_ID ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            {
            // InternalDockerCompose.g:2719:2: ( () ( ( (otherlv_1= RULE_ID ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalDockerCompose.g:2720:3: () ( ( (otherlv_1= RULE_ID ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalDockerCompose.g:2720:3: ()
            // InternalDockerCompose.g:2721:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecretConnectorAccess().getSecretConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2727:3: ( ( (otherlv_1= RULE_ID ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            else if ( (LA50_0==48||LA50_0==50||(LA50_0>=57 && LA50_0<=59)) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalDockerCompose.g:2728:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalDockerCompose.g:2728:4: ( (otherlv_1= RULE_ID ) )
                    // InternalDockerCompose.g:2729:5: (otherlv_1= RULE_ID )
                    {
                    // InternalDockerCompose.g:2729:5: (otherlv_1= RULE_ID )
                    // InternalDockerCompose.g:2730:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSecretConnectorRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getSecretConnectorAccess().getSecretSecretCrossReference_1_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:2742:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
                    {
                    // InternalDockerCompose.g:2742:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
                    // InternalDockerCompose.g:2743:5: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalDockerCompose.g:2743:5: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
                    // InternalDockerCompose.g:2744:6: ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1());
                    					
                    // InternalDockerCompose.g:2747:6: ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
                    // InternalDockerCompose.g:2748:7: ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?
                    {
                    // InternalDockerCompose.g:2748:7: ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=6;
                        int LA49_0 = input.LA(1);

                        if ( LA49_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 0) ) {
                            alt49=1;
                        }
                        else if ( LA49_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 1) ) {
                            alt49=2;
                        }
                        else if ( LA49_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 2) ) {
                            alt49=3;
                        }
                        else if ( LA49_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 3) ) {
                            alt49=4;
                        }
                        else if ( LA49_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 4) ) {
                            alt49=5;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalDockerCompose.g:2749:5: ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2749:5: ({...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2750:6: {...}? => ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleSecretConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 0)");
                    	    }
                    	    // InternalDockerCompose.g:2750:115: ( ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) ) )
                    	    // InternalDockerCompose.g:2751:7: ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 0);
                    	    						
                    	    // InternalDockerCompose.g:2754:10: ({...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) ) )
                    	    // InternalDockerCompose.g:2754:11: {...}? => (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSecretConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:2754:20: (otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) ) )
                    	    // InternalDockerCompose.g:2754:21: otherlv_3= 'source:' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,48,FOLLOW_5); 

                    	    										newLeafNode(otherlv_3, grammarAccess.getSecretConnectorAccess().getSourceKeyword_1_1_0_0());
                    	    									
                    	    // InternalDockerCompose.g:2758:10: ( (otherlv_4= RULE_ID ) )
                    	    // InternalDockerCompose.g:2759:11: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalDockerCompose.g:2759:11: (otherlv_4= RULE_ID )
                    	    // InternalDockerCompose.g:2760:12: otherlv_4= RULE_ID
                    	    {

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getSecretConnectorRule());
                    	    												}
                    	    											
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_48); 

                    	    												newLeafNode(otherlv_4, grammarAccess.getSecretConnectorAccess().getSecretSecretCrossReference_1_1_0_1_0());
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDockerCompose.g:2777:5: ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2777:5: ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2778:6: {...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleSecretConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 1)");
                    	    }
                    	    // InternalDockerCompose.g:2778:115: ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) )
                    	    // InternalDockerCompose.g:2779:7: ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 1);
                    	    						
                    	    // InternalDockerCompose.g:2782:10: ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) )
                    	    // InternalDockerCompose.g:2782:11: {...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSecretConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:2782:20: (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) )
                    	    // InternalDockerCompose.g:2782:21: otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) )
                    	    {
                    	    otherlv_5=(Token)match(input,50,FOLLOW_11); 

                    	    										newLeafNode(otherlv_5, grammarAccess.getSecretConnectorAccess().getTargetKeyword_1_1_1_0());
                    	    									
                    	    // InternalDockerCompose.g:2786:10: ( (lv_target_6_0= rulePATH ) )
                    	    // InternalDockerCompose.g:2787:11: (lv_target_6_0= rulePATH )
                    	    {
                    	    // InternalDockerCompose.g:2787:11: (lv_target_6_0= rulePATH )
                    	    // InternalDockerCompose.g:2788:12: lv_target_6_0= rulePATH
                    	    {

                    	    												newCompositeNode(grammarAccess.getSecretConnectorAccess().getTargetPATHParserRuleCall_1_1_1_1_0());
                    	    											
                    	    pushFollow(FOLLOW_48);
                    	    lv_target_6_0=rulePATH();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getSecretConnectorRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"target",
                    	    													lv_target_6_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.PATH");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalDockerCompose.g:2811:5: ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2811:5: ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2812:6: {...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleSecretConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 2)");
                    	    }
                    	    // InternalDockerCompose.g:2812:115: ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) ) )
                    	    // InternalDockerCompose.g:2813:7: ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 2);
                    	    						
                    	    // InternalDockerCompose.g:2816:10: ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) ) )
                    	    // InternalDockerCompose.g:2816:11: {...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSecretConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:2816:20: (otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) ) )
                    	    // InternalDockerCompose.g:2816:21: otherlv_7= 'uid:' ( (lv_uid_8_0= ruleQuotedInt ) )
                    	    {
                    	    otherlv_7=(Token)match(input,57,FOLLOW_49); 

                    	    										newLeafNode(otherlv_7, grammarAccess.getSecretConnectorAccess().getUidKeyword_1_1_2_0());
                    	    									
                    	    // InternalDockerCompose.g:2820:10: ( (lv_uid_8_0= ruleQuotedInt ) )
                    	    // InternalDockerCompose.g:2821:11: (lv_uid_8_0= ruleQuotedInt )
                    	    {
                    	    // InternalDockerCompose.g:2821:11: (lv_uid_8_0= ruleQuotedInt )
                    	    // InternalDockerCompose.g:2822:12: lv_uid_8_0= ruleQuotedInt
                    	    {

                    	    												newCompositeNode(grammarAccess.getSecretConnectorAccess().getUidQuotedIntParserRuleCall_1_1_2_1_0());
                    	    											
                    	    pushFollow(FOLLOW_48);
                    	    lv_uid_8_0=ruleQuotedInt();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getSecretConnectorRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"uid",
                    	    													lv_uid_8_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.QuotedInt");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalDockerCompose.g:2845:5: ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2845:5: ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2846:6: {...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleSecretConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 3)");
                    	    }
                    	    // InternalDockerCompose.g:2846:115: ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) ) )
                    	    // InternalDockerCompose.g:2847:7: ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 3);
                    	    						
                    	    // InternalDockerCompose.g:2850:10: ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) ) )
                    	    // InternalDockerCompose.g:2850:11: {...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSecretConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:2850:20: (otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) ) )
                    	    // InternalDockerCompose.g:2850:21: otherlv_9= 'gid:' ( (lv_gid_10_0= ruleQuotedInt ) )
                    	    {
                    	    otherlv_9=(Token)match(input,58,FOLLOW_49); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getSecretConnectorAccess().getGidKeyword_1_1_3_0());
                    	    									
                    	    // InternalDockerCompose.g:2854:10: ( (lv_gid_10_0= ruleQuotedInt ) )
                    	    // InternalDockerCompose.g:2855:11: (lv_gid_10_0= ruleQuotedInt )
                    	    {
                    	    // InternalDockerCompose.g:2855:11: (lv_gid_10_0= ruleQuotedInt )
                    	    // InternalDockerCompose.g:2856:12: lv_gid_10_0= ruleQuotedInt
                    	    {

                    	    												newCompositeNode(grammarAccess.getSecretConnectorAccess().getGidQuotedIntParserRuleCall_1_1_3_1_0());
                    	    											
                    	    pushFollow(FOLLOW_48);
                    	    lv_gid_10_0=ruleQuotedInt();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getSecretConnectorRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"gid",
                    	    													lv_gid_10_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.QuotedInt");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalDockerCompose.g:2879:5: ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2879:5: ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2880:6: {...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleSecretConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 4)");
                    	    }
                    	    // InternalDockerCompose.g:2880:115: ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) )
                    	    // InternalDockerCompose.g:2881:7: ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 4);
                    	    						
                    	    // InternalDockerCompose.g:2884:10: ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) )
                    	    // InternalDockerCompose.g:2884:11: {...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSecretConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:2884:20: (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) )
                    	    // InternalDockerCompose.g:2884:21: otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) )
                    	    {
                    	    otherlv_11=(Token)match(input,59,FOLLOW_8); 

                    	    										newLeafNode(otherlv_11, grammarAccess.getSecretConnectorAccess().getModeKeyword_1_1_4_0());
                    	    									
                    	    // InternalDockerCompose.g:2888:10: ( (lv_mode_12_0= ruleEInt ) )
                    	    // InternalDockerCompose.g:2889:11: (lv_mode_12_0= ruleEInt )
                    	    {
                    	    // InternalDockerCompose.g:2889:11: (lv_mode_12_0= ruleEInt )
                    	    // InternalDockerCompose.g:2890:12: lv_mode_12_0= ruleEInt
                    	    {

                    	    												newCompositeNode(grammarAccess.getSecretConnectorAccess().getModeEIntParserRuleCall_1_1_4_1_0());
                    	    											
                    	    pushFollow(FOLLOW_48);
                    	    lv_mode_12_0=ruleEInt();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getSecretConnectorRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"mode",
                    	    													lv_mode_12_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.EInt");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt49 >= 1 ) break loop49;
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1()) ) {
                        throw new FailedPredicateException(input, "ruleSecretConnector", "getUnorderedGroupHelper().canLeave(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1())");
                    }

                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1());
                    					

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSecretConnector"


    // $ANTLR start "entryRuleNetwork"
    // InternalDockerCompose.g:2926:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // InternalDockerCompose.g:2926:48: (iv_ruleNetwork= ruleNetwork EOF )
            // InternalDockerCompose.g:2927:2: iv_ruleNetwork= ruleNetwork EOF
            {
             newCompositeNode(grammarAccess.getNetworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetwork=ruleNetwork();

            state._fsp--;

             current =iv_ruleNetwork; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNetwork"


    // $ANTLR start "ruleNetwork"
    // InternalDockerCompose.g:2933:1: ruleNetwork returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) ) ) ;
    public final EObject ruleNetwork() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_driver_7_0 = null;

        AntlrDatatypeRuleToken lv_attachable_9_0 = null;

        AntlrDatatypeRuleToken lv_enable_ipv6_11_0 = null;

        AntlrDatatypeRuleToken lv_internal_13_0 = null;

        AntlrDatatypeRuleToken lv_external_15_0 = null;

        AntlrDatatypeRuleToken lv_network_name_17_0 = null;

        EObject lv_labels_19_0 = null;

        EObject lv_driver_opts_21_0 = null;

        EObject lv_ipam_23_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:2939:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) ) ) )
            // InternalDockerCompose.g:2940:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) ) )
            {
            // InternalDockerCompose.g:2940:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:2941:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:2941:3: ()
            // InternalDockerCompose.g:2942:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkAccess().getNetworkAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2948:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDockerCompose.g:2949:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDockerCompose.g:2949:4: (lv_name_1_0= RULE_ID )
            // InternalDockerCompose.g:2950:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNetworkAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetworkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:2970:3: ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==60) ) {
                alt54=1;
            }
            else if ( (LA54_0==EOF||LA54_0==RULE_ID||(LA54_0>=17 && LA54_0<=22)||(LA54_0>=62 && LA54_0<=70)) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalDockerCompose.g:2971:4: (otherlv_3= '{' otherlv_4= '}' )
                    {
                    // InternalDockerCompose.g:2971:4: (otherlv_3= '{' otherlv_4= '}' )
                    // InternalDockerCompose.g:2972:5: otherlv_3= '{' otherlv_4= '}'
                    {
                    otherlv_3=(Token)match(input,60,FOLLOW_51); 

                    					newLeafNode(otherlv_3, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_3_0_0());
                    				
                    otherlv_4=(Token)match(input,61,FOLLOW_2); 

                    					newLeafNode(otherlv_4, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_3_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:2982:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) )
                    {
                    // InternalDockerCompose.g:2982:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) )
                    // InternalDockerCompose.g:2983:5: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) )
                    {
                    // InternalDockerCompose.g:2983:5: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) )
                    // InternalDockerCompose.g:2984:6: ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    					
                    // InternalDockerCompose.g:2987:6: ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* )
                    // InternalDockerCompose.g:2988:7: ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )*
                    {
                    // InternalDockerCompose.g:2988:7: ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )*
                    loop53:
                    do {
                        int alt53=10;
                        alt53 = dfa53.predict(input);
                        switch (alt53) {
                    	case 1 :
                    	    // InternalDockerCompose.g:2989:5: ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2989:5: ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2990:6: {...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 0)");
                    	    }
                    	    // InternalDockerCompose.g:2990:107: ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) )
                    	    // InternalDockerCompose.g:2991:7: ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 0);
                    	    						
                    	    // InternalDockerCompose.g:2994:10: ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) )
                    	    // InternalDockerCompose.g:2994:11: {...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2994:20: (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) )
                    	    // InternalDockerCompose.g:2994:21: otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,62,FOLLOW_13); 

                    	    										newLeafNode(otherlv_6, grammarAccess.getNetworkAccess().getDriverKeyword_3_1_0_0());
                    	    									
                    	    // InternalDockerCompose.g:2998:10: ( (lv_driver_7_0= ruleEString ) )
                    	    // InternalDockerCompose.g:2999:11: (lv_driver_7_0= ruleEString )
                    	    {
                    	    // InternalDockerCompose.g:2999:11: (lv_driver_7_0= ruleEString )
                    	    // InternalDockerCompose.g:3000:12: lv_driver_7_0= ruleEString
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getDriverEStringParserRuleCall_3_1_0_1_0());
                    	    											
                    	    pushFollow(FOLLOW_52);
                    	    lv_driver_7_0=ruleEString();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getNetworkRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"driver",
                    	    													lv_driver_7_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.EString");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDockerCompose.g:3023:5: ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:3023:5: ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:3024:6: {...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 1)");
                    	    }
                    	    // InternalDockerCompose.g:3024:107: ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:3025:7: ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 1);
                    	    						
                    	    // InternalDockerCompose.g:3028:10: ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:3028:11: {...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:3028:20: (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:3028:21: otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_8=(Token)match(input,63,FOLLOW_15); 

                    	    										newLeafNode(otherlv_8, grammarAccess.getNetworkAccess().getAttachableKeyword_3_1_1_0());
                    	    									
                    	    // InternalDockerCompose.g:3032:10: ( (lv_attachable_9_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:3033:11: (lv_attachable_9_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:3033:11: (lv_attachable_9_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:3034:12: lv_attachable_9_0= ruleEBoolean
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getAttachableEBooleanParserRuleCall_3_1_1_1_0());
                    	    											
                    	    pushFollow(FOLLOW_52);
                    	    lv_attachable_9_0=ruleEBoolean();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getNetworkRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"attachable",
                    	    													lv_attachable_9_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.EBoolean");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalDockerCompose.g:3057:5: ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:3057:5: ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:3058:6: {...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 2)");
                    	    }
                    	    // InternalDockerCompose.g:3058:107: ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:3059:7: ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 2);
                    	    						
                    	    // InternalDockerCompose.g:3062:10: ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:3062:11: {...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:3062:20: (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:3062:21: otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_10=(Token)match(input,64,FOLLOW_15); 

                    	    										newLeafNode(otherlv_10, grammarAccess.getNetworkAccess().getEnable_ipv6Keyword_3_1_2_0());
                    	    									
                    	    // InternalDockerCompose.g:3066:10: ( (lv_enable_ipv6_11_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:3067:11: (lv_enable_ipv6_11_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:3067:11: (lv_enable_ipv6_11_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:3068:12: lv_enable_ipv6_11_0= ruleEBoolean
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getEnable_ipv6EBooleanParserRuleCall_3_1_2_1_0());
                    	    											
                    	    pushFollow(FOLLOW_52);
                    	    lv_enable_ipv6_11_0=ruleEBoolean();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getNetworkRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"enable_ipv6",
                    	    													lv_enable_ipv6_11_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.EBoolean");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalDockerCompose.g:3091:5: ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:3091:5: ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:3092:6: {...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 3)");
                    	    }
                    	    // InternalDockerCompose.g:3092:107: ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:3093:7: ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 3);
                    	    						
                    	    // InternalDockerCompose.g:3096:10: ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:3096:11: {...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:3096:20: (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:3096:21: otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_12=(Token)match(input,65,FOLLOW_15); 

                    	    										newLeafNode(otherlv_12, grammarAccess.getNetworkAccess().getInternalKeyword_3_1_3_0());
                    	    									
                    	    // InternalDockerCompose.g:3100:10: ( (lv_internal_13_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:3101:11: (lv_internal_13_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:3101:11: (lv_internal_13_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:3102:12: lv_internal_13_0= ruleEBoolean
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getInternalEBooleanParserRuleCall_3_1_3_1_0());
                    	    											
                    	    pushFollow(FOLLOW_52);
                    	    lv_internal_13_0=ruleEBoolean();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getNetworkRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"internal",
                    	    													lv_internal_13_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.EBoolean");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalDockerCompose.g:3125:5: ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:3125:5: ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:3126:6: {...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 4)");
                    	    }
                    	    // InternalDockerCompose.g:3126:107: ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:3127:7: ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 4);
                    	    						
                    	    // InternalDockerCompose.g:3130:10: ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:3130:11: {...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:3130:20: (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:3130:21: otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_14=(Token)match(input,66,FOLLOW_15); 

                    	    										newLeafNode(otherlv_14, grammarAccess.getNetworkAccess().getExternalKeyword_3_1_4_0());
                    	    									
                    	    // InternalDockerCompose.g:3134:10: ( (lv_external_15_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:3135:11: (lv_external_15_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:3135:11: (lv_external_15_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:3136:12: lv_external_15_0= ruleEBoolean
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getExternalEBooleanParserRuleCall_3_1_4_1_0());
                    	    											
                    	    pushFollow(FOLLOW_52);
                    	    lv_external_15_0=ruleEBoolean();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getNetworkRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"external",
                    	    													lv_external_15_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.EBoolean");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalDockerCompose.g:3159:5: ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:3159:5: ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) )
                    	    // InternalDockerCompose.g:3160:6: {...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 5)");
                    	    }
                    	    // InternalDockerCompose.g:3160:107: ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) )
                    	    // InternalDockerCompose.g:3161:7: ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 5);
                    	    						
                    	    // InternalDockerCompose.g:3164:10: ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) )
                    	    // InternalDockerCompose.g:3164:11: {...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:3164:20: (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) )
                    	    // InternalDockerCompose.g:3164:21: otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,67,FOLLOW_13); 

                    	    										newLeafNode(otherlv_16, grammarAccess.getNetworkAccess().getNameKeyword_3_1_5_0());
                    	    									
                    	    // InternalDockerCompose.g:3168:10: ( (lv_network_name_17_0= ruleEString ) )
                    	    // InternalDockerCompose.g:3169:11: (lv_network_name_17_0= ruleEString )
                    	    {
                    	    // InternalDockerCompose.g:3169:11: (lv_network_name_17_0= ruleEString )
                    	    // InternalDockerCompose.g:3170:12: lv_network_name_17_0= ruleEString
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getNetwork_nameEStringParserRuleCall_3_1_5_1_0());
                    	    											
                    	    pushFollow(FOLLOW_52);
                    	    lv_network_name_17_0=ruleEString();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getNetworkRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"network_name",
                    	    													lv_network_name_17_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.EString");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // InternalDockerCompose.g:3193:5: ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:3193:5: ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) )
                    	    // InternalDockerCompose.g:3194:6: {...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 6) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 6)");
                    	    }
                    	    // InternalDockerCompose.g:3194:107: ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) )
                    	    // InternalDockerCompose.g:3195:7: ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 6);
                    	    						
                    	    // InternalDockerCompose.g:3198:10: ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) )
                    	    // InternalDockerCompose.g:3198:11: {...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:3198:20: (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ )
                    	    // InternalDockerCompose.g:3198:21: otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+
                    	    {
                    	    otherlv_18=(Token)match(input,68,FOLLOW_5); 

                    	    										newLeafNode(otherlv_18, grammarAccess.getNetworkAccess().getLabelsKeyword_3_1_6_0());
                    	    									
                    	    // InternalDockerCompose.g:3202:10: ( (lv_labels_19_0= ruleNetworkLabel ) )+
                    	    int cnt51=0;
                    	    loop51:
                    	    do {
                    	        int alt51=2;
                    	        int LA51_0 = input.LA(1);

                    	        if ( (LA51_0==RULE_ID) ) {
                    	            int LA51_2 = input.LA(2);

                    	            if ( (LA51_2==23) ) {
                    	                alt51=1;
                    	            }
                    	            else if ( (LA51_2==24) ) {
                    	                int LA51_4 = input.LA(3);

                    	                if ( (LA51_4==RULE_ID) ) {
                    	                    int LA51_5 = input.LA(4);

                    	                    if ( (LA51_5==EOF||LA51_5==RULE_ID||(LA51_5>=17 && LA51_5<=22)||(LA51_5>=62 && LA51_5<=70)) ) {
                    	                        alt51=1;
                    	                    }


                    	                }
                    	                else if ( ((LA51_4>=RULE_VERSION_INT && LA51_4<=RULE_QUOTED_INT)||(LA51_4>=RULE_DEVICE_DEF && LA51_4<=RULE_STRING)||LA51_4==79) ) {
                    	                    alt51=1;
                    	                }


                    	            }


                    	        }


                    	        switch (alt51) {
                    	    	case 1 :
                    	    	    // InternalDockerCompose.g:3203:11: (lv_labels_19_0= ruleNetworkLabel )
                    	    	    {
                    	    	    // InternalDockerCompose.g:3203:11: (lv_labels_19_0= ruleNetworkLabel )
                    	    	    // InternalDockerCompose.g:3204:12: lv_labels_19_0= ruleNetworkLabel
                    	    	    {

                    	    	    												newCompositeNode(grammarAccess.getNetworkAccess().getLabelsNetworkLabelParserRuleCall_3_1_6_1_0());
                    	    	    											
                    	    	    pushFollow(FOLLOW_53);
                    	    	    lv_labels_19_0=ruleNetworkLabel();

                    	    	    state._fsp--;


                    	    	    												if (current==null) {
                    	    	    													current = createModelElementForParent(grammarAccess.getNetworkRule());
                    	    	    												}
                    	    	    												add(
                    	    	    													current,
                    	    	    													"labels",
                    	    	    													lv_labels_19_0,
                    	    	    													"org.xtext.example.dockercompose.DockerCompose.NetworkLabel");
                    	    	    												afterParserOrEnumRuleCall();
                    	    	    											

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt51 >= 1 ) break loop51;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(51, input);
                    	                throw eee;
                    	        }
                    	        cnt51++;
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 8 :
                    	    // InternalDockerCompose.g:3227:5: ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:3227:5: ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) )
                    	    // InternalDockerCompose.g:3228:6: {...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 7) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 7)");
                    	    }
                    	    // InternalDockerCompose.g:3228:107: ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) )
                    	    // InternalDockerCompose.g:3229:7: ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 7);
                    	    						
                    	    // InternalDockerCompose.g:3232:10: ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) )
                    	    // InternalDockerCompose.g:3232:11: {...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:3232:20: (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ )
                    	    // InternalDockerCompose.g:3232:21: otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+
                    	    {
                    	    otherlv_20=(Token)match(input,69,FOLLOW_13); 

                    	    										newLeafNode(otherlv_20, grammarAccess.getNetworkAccess().getDriver_optsKeyword_3_1_7_0());
                    	    									
                    	    // InternalDockerCompose.g:3236:10: ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+
                    	    int cnt52=0;
                    	    loop52:
                    	    do {
                    	        int alt52=2;
                    	        int LA52_0 = input.LA(1);

                    	        if ( (LA52_0==RULE_ID) ) {
                    	            int LA52_2 = input.LA(2);

                    	            if ( (LA52_2==24) ) {
                    	                int LA52_4 = input.LA(3);

                    	                if ( (LA52_4==RULE_ID) ) {
                    	                    int LA52_5 = input.LA(4);

                    	                    if ( (LA52_5==EOF||(LA52_5>=RULE_VERSION_INT && LA52_5<=RULE_QUOTED_INT)||(LA52_5>=RULE_ID && LA52_5<=RULE_STRING)||(LA52_5>=17 && LA52_5<=22)||(LA52_5>=62 && LA52_5<=70)||LA52_5==79) ) {
                    	                        alt52=1;
                    	                    }


                    	                }
                    	                else if ( ((LA52_4>=RULE_VERSION_INT && LA52_4<=RULE_QUOTED_INT)||(LA52_4>=RULE_DEVICE_DEF && LA52_4<=RULE_STRING)||LA52_4==79) ) {
                    	                    alt52=1;
                    	                }


                    	            }


                    	        }
                    	        else if ( ((LA52_0>=RULE_VERSION_INT && LA52_0<=RULE_QUOTED_INT)||(LA52_0>=RULE_DEVICE_DEF && LA52_0<=RULE_STRING)||LA52_0==79) ) {
                    	            alt52=1;
                    	        }


                    	        switch (alt52) {
                    	    	case 1 :
                    	    	    // InternalDockerCompose.g:3237:11: (lv_driver_opts_21_0= ruleNetworkDriverOpt )
                    	    	    {
                    	    	    // InternalDockerCompose.g:3237:11: (lv_driver_opts_21_0= ruleNetworkDriverOpt )
                    	    	    // InternalDockerCompose.g:3238:12: lv_driver_opts_21_0= ruleNetworkDriverOpt
                    	    	    {

                    	    	    												newCompositeNode(grammarAccess.getNetworkAccess().getDriver_optsNetworkDriverOptParserRuleCall_3_1_7_1_0());
                    	    	    											
                    	    	    pushFollow(FOLLOW_54);
                    	    	    lv_driver_opts_21_0=ruleNetworkDriverOpt();

                    	    	    state._fsp--;


                    	    	    												if (current==null) {
                    	    	    													current = createModelElementForParent(grammarAccess.getNetworkRule());
                    	    	    												}
                    	    	    												add(
                    	    	    													current,
                    	    	    													"driver_opts",
                    	    	    													lv_driver_opts_21_0,
                    	    	    													"org.xtext.example.dockercompose.DockerCompose.NetworkDriverOpt");
                    	    	    												afterParserOrEnumRuleCall();
                    	    	    											

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt52 >= 1 ) break loop52;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(52, input);
                    	                throw eee;
                    	        }
                    	        cnt52++;
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 9 :
                    	    // InternalDockerCompose.g:3261:5: ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:3261:5: ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) )
                    	    // InternalDockerCompose.g:3262:6: {...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 8) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 8)");
                    	    }
                    	    // InternalDockerCompose.g:3262:107: ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) )
                    	    // InternalDockerCompose.g:3263:7: ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 8);
                    	    						
                    	    // InternalDockerCompose.g:3266:10: ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) )
                    	    // InternalDockerCompose.g:3266:11: {...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:3266:20: (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) )
                    	    // InternalDockerCompose.g:3266:21: otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) )
                    	    {
                    	    otherlv_22=(Token)match(input,70,FOLLOW_55); 

                    	    										newLeafNode(otherlv_22, grammarAccess.getNetworkAccess().getIpamKeyword_3_1_8_0());
                    	    									
                    	    // InternalDockerCompose.g:3270:10: ( (lv_ipam_23_0= ruleIPAM ) )
                    	    // InternalDockerCompose.g:3271:11: (lv_ipam_23_0= ruleIPAM )
                    	    {
                    	    // InternalDockerCompose.g:3271:11: (lv_ipam_23_0= ruleIPAM )
                    	    // InternalDockerCompose.g:3272:12: lv_ipam_23_0= ruleIPAM
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getIpamIPAMParserRuleCall_3_1_8_1_0());
                    	    											
                    	    pushFollow(FOLLOW_52);
                    	    lv_ipam_23_0=ruleIPAM();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getNetworkRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"ipam",
                    	    													lv_ipam_23_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.IPAM");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    					

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNetwork"


    // $ANTLR start "entryRuleVolume"
    // InternalDockerCompose.g:3307:1: entryRuleVolume returns [EObject current=null] : iv_ruleVolume= ruleVolume EOF ;
    public final EObject entryRuleVolume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolume = null;


        try {
            // InternalDockerCompose.g:3307:47: (iv_ruleVolume= ruleVolume EOF )
            // InternalDockerCompose.g:3308:2: iv_ruleVolume= ruleVolume EOF
            {
             newCompositeNode(grammarAccess.getVolumeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVolume=ruleVolume();

            state._fsp--;

             current =iv_ruleVolume; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVolume"


    // $ANTLR start "ruleVolume"
    // InternalDockerCompose.g:3314:1: ruleVolume returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleVolume() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_external_5_0 = null;

        AntlrDatatypeRuleToken lv_driver_7_0 = null;

        AntlrDatatypeRuleToken lv_volume_name_9_0 = null;

        EObject lv_labels_11_0 = null;

        EObject lv_driver_opts_13_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3320:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:3321:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:3321:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:3322:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:3322:3: ()
            // InternalDockerCompose.g:3323:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeAccess().getVolumeAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3329:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDockerCompose.g:3330:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDockerCompose.g:3330:4: (lv_name_1_0= RULE_ID )
            // InternalDockerCompose.g:3331:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVolumeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVolumeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getVolumeAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:3351:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:3352:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:3352:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) )
            // InternalDockerCompose.g:3353:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getVolumeAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:3356:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* )
            // InternalDockerCompose.g:3357:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )*
            {
            // InternalDockerCompose.g:3357:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )*
            loop57:
            do {
                int alt57=6;
                int LA57_0 = input.LA(1);

                if ( LA57_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 0) ) {
                    alt57=1;
                }
                else if ( LA57_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 1) ) {
                    alt57=2;
                }
                else if ( LA57_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 2) ) {
                    alt57=3;
                }
                else if ( LA57_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 3) ) {
                    alt57=4;
                }
                else if ( LA57_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 4) ) {
                    alt57=5;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalDockerCompose.g:3358:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3358:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:3359:5: {...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDockerCompose.g:3359:103: ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:3360:6: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDockerCompose.g:3363:9: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:3363:10: {...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:3363:19: (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:3363:20: otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) )
            	    {
            	    otherlv_4=(Token)match(input,66,FOLLOW_15); 

            	    									newLeafNode(otherlv_4, grammarAccess.getVolumeAccess().getExternalKeyword_3_0_0());
            	    								
            	    // InternalDockerCompose.g:3367:9: ( (lv_external_5_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:3368:10: (lv_external_5_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:3368:10: (lv_external_5_0= ruleEBoolean )
            	    // InternalDockerCompose.g:3369:11: lv_external_5_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeAccess().getExternalEBooleanParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_56);
            	    lv_external_5_0=ruleEBoolean();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getVolumeRule());
            	    											}
            	    											set(
            	    												current,
            	    												"external",
            	    												lv_external_5_0 != null,
            	    												"org.xtext.example.dockercompose.DockerCompose.EBoolean");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDockerCompose.g:3392:4: ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3392:4: ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3393:5: {...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDockerCompose.g:3393:103: ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3394:6: ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDockerCompose.g:3397:9: ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3397:10: {...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:3397:19: (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3397:20: otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,62,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getVolumeAccess().getDriverKeyword_3_1_0());
            	    								
            	    // InternalDockerCompose.g:3401:9: ( (lv_driver_7_0= ruleEString ) )
            	    // InternalDockerCompose.g:3402:10: (lv_driver_7_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3402:10: (lv_driver_7_0= ruleEString )
            	    // InternalDockerCompose.g:3403:11: lv_driver_7_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeAccess().getDriverEStringParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_56);
            	    lv_driver_7_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getVolumeRule());
            	    											}
            	    											set(
            	    												current,
            	    												"driver",
            	    												lv_driver_7_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDockerCompose.g:3426:4: ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3426:4: ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3427:5: {...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:3427:103: ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3428:6: ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:3431:9: ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3431:10: {...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:3431:19: (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3431:20: otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,67,FOLLOW_13); 

            	    									newLeafNode(otherlv_8, grammarAccess.getVolumeAccess().getNameKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:3435:9: ( (lv_volume_name_9_0= ruleEString ) )
            	    // InternalDockerCompose.g:3436:10: (lv_volume_name_9_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3436:10: (lv_volume_name_9_0= ruleEString )
            	    // InternalDockerCompose.g:3437:11: lv_volume_name_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeAccess().getVolume_nameEStringParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_56);
            	    lv_volume_name_9_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getVolumeRule());
            	    											}
            	    											set(
            	    												current,
            	    												"volume_name",
            	    												lv_volume_name_9_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDockerCompose.g:3460:4: ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3460:4: ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) )
            	    // InternalDockerCompose.g:3461:5: {...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalDockerCompose.g:3461:103: ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) )
            	    // InternalDockerCompose.g:3462:6: ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalDockerCompose.g:3465:9: ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) )
            	    // InternalDockerCompose.g:3465:10: {...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:3465:19: (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ )
            	    // InternalDockerCompose.g:3465:20: otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+
            	    {
            	    otherlv_10=(Token)match(input,68,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getVolumeAccess().getLabelsKeyword_3_3_0());
            	    								
            	    // InternalDockerCompose.g:3469:9: ( (lv_labels_11_0= ruleVolumeLabel ) )+
            	    int cnt55=0;
            	    loop55:
            	    do {
            	        int alt55=2;
            	        int LA55_0 = input.LA(1);

            	        if ( (LA55_0==RULE_ID) ) {
            	            int LA55_2 = input.LA(2);

            	            if ( (LA55_2==24) ) {
            	                int LA55_4 = input.LA(3);

            	                if ( (LA55_4==RULE_ID) ) {
            	                    int LA55_5 = input.LA(4);

            	                    if ( (LA55_5==EOF||(LA55_5>=RULE_VERSION_INT && LA55_5<=RULE_QUOTED_INT)||(LA55_5>=RULE_ID && LA55_5<=RULE_STRING)||(LA55_5>=17 && LA55_5<=22)||LA55_5==62||(LA55_5>=66 && LA55_5<=69)||LA55_5==79) ) {
            	                        alt55=1;
            	                    }


            	                }
            	                else if ( ((LA55_4>=RULE_VERSION_INT && LA55_4<=RULE_QUOTED_INT)||(LA55_4>=RULE_DEVICE_DEF && LA55_4<=RULE_STRING)||LA55_4==79) ) {
            	                    alt55=1;
            	                }


            	            }


            	        }
            	        else if ( ((LA55_0>=RULE_VERSION_INT && LA55_0<=RULE_QUOTED_INT)||(LA55_0>=RULE_DEVICE_DEF && LA55_0<=RULE_STRING)||LA55_0==79) ) {
            	            alt55=1;
            	        }


            	        switch (alt55) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:3470:10: (lv_labels_11_0= ruleVolumeLabel )
            	    	    {
            	    	    // InternalDockerCompose.g:3470:10: (lv_labels_11_0= ruleVolumeLabel )
            	    	    // InternalDockerCompose.g:3471:11: lv_labels_11_0= ruleVolumeLabel
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getVolumeAccess().getLabelsVolumeLabelParserRuleCall_3_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_57);
            	    	    lv_labels_11_0=ruleVolumeLabel();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getVolumeRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"labels",
            	    	    												lv_labels_11_0,
            	    	    												"org.xtext.example.dockercompose.DockerCompose.VolumeLabel");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt55 >= 1 ) break loop55;
            	                EarlyExitException eee =
            	                    new EarlyExitException(55, input);
            	                throw eee;
            	        }
            	        cnt55++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDockerCompose.g:3494:4: ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3494:4: ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) )
            	    // InternalDockerCompose.g:3495:5: {...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalDockerCompose.g:3495:103: ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) )
            	    // InternalDockerCompose.g:3496:6: ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalDockerCompose.g:3499:9: ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) )
            	    // InternalDockerCompose.g:3499:10: {...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:3499:19: (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ )
            	    // InternalDockerCompose.g:3499:20: otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+
            	    {
            	    otherlv_12=(Token)match(input,69,FOLLOW_13); 

            	    									newLeafNode(otherlv_12, grammarAccess.getVolumeAccess().getDriver_optsKeyword_3_4_0());
            	    								
            	    // InternalDockerCompose.g:3503:9: ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+
            	    int cnt56=0;
            	    loop56:
            	    do {
            	        int alt56=2;
            	        int LA56_0 = input.LA(1);

            	        if ( (LA56_0==RULE_ID) ) {
            	            int LA56_2 = input.LA(2);

            	            if ( (LA56_2==24) ) {
            	                int LA56_4 = input.LA(3);

            	                if ( (LA56_4==RULE_ID) ) {
            	                    int LA56_5 = input.LA(4);

            	                    if ( (LA56_5==EOF||(LA56_5>=RULE_VERSION_INT && LA56_5<=RULE_QUOTED_INT)||(LA56_5>=RULE_ID && LA56_5<=RULE_STRING)||(LA56_5>=17 && LA56_5<=22)||LA56_5==62||(LA56_5>=66 && LA56_5<=69)||LA56_5==79) ) {
            	                        alt56=1;
            	                    }


            	                }
            	                else if ( ((LA56_4>=RULE_VERSION_INT && LA56_4<=RULE_QUOTED_INT)||(LA56_4>=RULE_DEVICE_DEF && LA56_4<=RULE_STRING)||LA56_4==79) ) {
            	                    alt56=1;
            	                }


            	            }


            	        }
            	        else if ( ((LA56_0>=RULE_VERSION_INT && LA56_0<=RULE_QUOTED_INT)||(LA56_0>=RULE_DEVICE_DEF && LA56_0<=RULE_STRING)||LA56_0==79) ) {
            	            alt56=1;
            	        }


            	        switch (alt56) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:3504:10: (lv_driver_opts_13_0= ruleVolumeDriverOpt )
            	    	    {
            	    	    // InternalDockerCompose.g:3504:10: (lv_driver_opts_13_0= ruleVolumeDriverOpt )
            	    	    // InternalDockerCompose.g:3505:11: lv_driver_opts_13_0= ruleVolumeDriverOpt
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getVolumeAccess().getDriver_optsVolumeDriverOptParserRuleCall_3_4_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_57);
            	    	    lv_driver_opts_13_0=ruleVolumeDriverOpt();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getVolumeRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"driver_opts",
            	    	    												lv_driver_opts_13_0,
            	    	    												"org.xtext.example.dockercompose.DockerCompose.VolumeDriverOpt");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt56 >= 1 ) break loop56;
            	                EarlyExitException eee =
            	                    new EarlyExitException(56, input);
            	                throw eee;
            	        }
            	        cnt56++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getVolumeAccess().getUnorderedGroup_3());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVolume"


    // $ANTLR start "entryRuleConfig"
    // InternalDockerCompose.g:3539:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalDockerCompose.g:3539:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalDockerCompose.g:3540:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalDockerCompose.g:3546:1: ruleConfig returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_external_5_0 = null;

        AntlrDatatypeRuleToken lv_file_7_0 = null;

        AntlrDatatypeRuleToken lv_config_name_9_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3552:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:3553:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:3553:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:3554:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:3554:3: ()
            // InternalDockerCompose.g:3555:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigAccess().getConfigAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3561:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDockerCompose.g:3562:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDockerCompose.g:3562:4: (lv_name_1_0= RULE_ID )
            // InternalDockerCompose.g:3563:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConfigAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:3583:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:3584:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:3584:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalDockerCompose.g:3585:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getConfigAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:3588:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* )
            // InternalDockerCompose.g:3589:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalDockerCompose.g:3589:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )*
            loop58:
            do {
                int alt58=4;
                int LA58_0 = input.LA(1);

                if ( LA58_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 0) ) {
                    alt58=1;
                }
                else if ( LA58_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 1) ) {
                    alt58=2;
                }
                else if ( LA58_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 2) ) {
                    alt58=3;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalDockerCompose.g:3590:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3590:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:3591:5: {...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDockerCompose.g:3591:103: ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:3592:6: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDockerCompose.g:3595:9: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:3595:10: {...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    }
            	    // InternalDockerCompose.g:3595:19: (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:3595:20: otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) )
            	    {
            	    otherlv_4=(Token)match(input,66,FOLLOW_15); 

            	    									newLeafNode(otherlv_4, grammarAccess.getConfigAccess().getExternalKeyword_3_0_0());
            	    								
            	    // InternalDockerCompose.g:3599:9: ( (lv_external_5_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:3600:10: (lv_external_5_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:3600:10: (lv_external_5_0= ruleEBoolean )
            	    // InternalDockerCompose.g:3601:11: lv_external_5_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getConfigAccess().getExternalEBooleanParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_58);
            	    lv_external_5_0=ruleEBoolean();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"external",
            	    												lv_external_5_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.EBoolean");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDockerCompose.g:3624:4: ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3624:4: ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) )
            	    // InternalDockerCompose.g:3625:5: {...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDockerCompose.g:3625:103: ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) )
            	    // InternalDockerCompose.g:3626:6: ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDockerCompose.g:3629:9: ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) )
            	    // InternalDockerCompose.g:3629:10: {...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    }
            	    // InternalDockerCompose.g:3629:19: (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) )
            	    // InternalDockerCompose.g:3629:20: otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) )
            	    {
            	    otherlv_6=(Token)match(input,71,FOLLOW_11); 

            	    									newLeafNode(otherlv_6, grammarAccess.getConfigAccess().getFileKeyword_3_1_0());
            	    								
            	    // InternalDockerCompose.g:3633:9: ( (lv_file_7_0= rulePATH ) )
            	    // InternalDockerCompose.g:3634:10: (lv_file_7_0= rulePATH )
            	    {
            	    // InternalDockerCompose.g:3634:10: (lv_file_7_0= rulePATH )
            	    // InternalDockerCompose.g:3635:11: lv_file_7_0= rulePATH
            	    {

            	    											newCompositeNode(grammarAccess.getConfigAccess().getFilePATHParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_58);
            	    lv_file_7_0=rulePATH();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"file",
            	    												lv_file_7_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.PATH");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDockerCompose.g:3658:4: ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3658:4: ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3659:5: {...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:3659:103: ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3660:6: ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:3663:9: ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3663:10: {...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    }
            	    // InternalDockerCompose.g:3663:19: (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3663:20: otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,67,FOLLOW_13); 

            	    									newLeafNode(otherlv_8, grammarAccess.getConfigAccess().getNameKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:3667:9: ( (lv_config_name_9_0= ruleEString ) )
            	    // InternalDockerCompose.g:3668:10: (lv_config_name_9_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3668:10: (lv_config_name_9_0= ruleEString )
            	    // InternalDockerCompose.g:3669:11: lv_config_name_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getConfigAccess().getConfig_nameEStringParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_58);
            	    lv_config_name_9_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"config_name",
            	    												lv_config_name_9_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getConfigAccess().getUnorderedGroup_3());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleSecret"
    // InternalDockerCompose.g:3703:1: entryRuleSecret returns [EObject current=null] : iv_ruleSecret= ruleSecret EOF ;
    public final EObject entryRuleSecret() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecret = null;


        try {
            // InternalDockerCompose.g:3703:47: (iv_ruleSecret= ruleSecret EOF )
            // InternalDockerCompose.g:3704:2: iv_ruleSecret= ruleSecret EOF
            {
             newCompositeNode(grammarAccess.getSecretRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecret=ruleSecret();

            state._fsp--;

             current =iv_ruleSecret; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSecret"


    // $ANTLR start "ruleSecret"
    // InternalDockerCompose.g:3710:1: ruleSecret returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleSecret() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_external_5_0 = null;

        AntlrDatatypeRuleToken lv_file_7_0 = null;

        AntlrDatatypeRuleToken lv_environment_9_0 = null;

        AntlrDatatypeRuleToken lv_secret_name_11_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3716:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:3717:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:3717:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:3718:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:3718:3: ()
            // InternalDockerCompose.g:3719:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecretAccess().getSecretAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3725:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDockerCompose.g:3726:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDockerCompose.g:3726:4: (lv_name_1_0= RULE_ID )
            // InternalDockerCompose.g:3727:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSecretAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSecretRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getSecretAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:3747:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:3748:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:3748:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalDockerCompose.g:3749:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSecretAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:3752:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* )
            // InternalDockerCompose.g:3753:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalDockerCompose.g:3753:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )*
            loop59:
            do {
                int alt59=5;
                int LA59_0 = input.LA(1);

                if ( LA59_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 0) ) {
                    alt59=1;
                }
                else if ( LA59_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 1) ) {
                    alt59=2;
                }
                else if ( LA59_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 2) ) {
                    alt59=3;
                }
                else if ( LA59_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 3) ) {
                    alt59=4;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalDockerCompose.g:3754:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3754:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:3755:5: {...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDockerCompose.g:3755:103: ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:3756:6: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDockerCompose.g:3759:9: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:3759:10: {...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "true");
            	    }
            	    // InternalDockerCompose.g:3759:19: (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:3759:20: otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) )
            	    {
            	    otherlv_4=(Token)match(input,66,FOLLOW_15); 

            	    									newLeafNode(otherlv_4, grammarAccess.getSecretAccess().getExternalKeyword_3_0_0());
            	    								
            	    // InternalDockerCompose.g:3763:9: ( (lv_external_5_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:3764:10: (lv_external_5_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:3764:10: (lv_external_5_0= ruleEBoolean )
            	    // InternalDockerCompose.g:3765:11: lv_external_5_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getSecretAccess().getExternalEBooleanParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_59);
            	    lv_external_5_0=ruleEBoolean();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSecretRule());
            	    											}
            	    											set(
            	    												current,
            	    												"external",
            	    												lv_external_5_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.EBoolean");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSecretAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDockerCompose.g:3788:4: ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3788:4: ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) ) )
            	    // InternalDockerCompose.g:3789:5: {...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDockerCompose.g:3789:103: ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) ) )
            	    // InternalDockerCompose.g:3790:6: ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDockerCompose.g:3793:9: ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) ) )
            	    // InternalDockerCompose.g:3793:10: {...}? => (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "true");
            	    }
            	    // InternalDockerCompose.g:3793:19: (otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) ) )
            	    // InternalDockerCompose.g:3793:20: otherlv_6= 'file:' ( (lv_file_7_0= rulePATH ) )
            	    {
            	    otherlv_6=(Token)match(input,71,FOLLOW_11); 

            	    									newLeafNode(otherlv_6, grammarAccess.getSecretAccess().getFileKeyword_3_1_0());
            	    								
            	    // InternalDockerCompose.g:3797:9: ( (lv_file_7_0= rulePATH ) )
            	    // InternalDockerCompose.g:3798:10: (lv_file_7_0= rulePATH )
            	    {
            	    // InternalDockerCompose.g:3798:10: (lv_file_7_0= rulePATH )
            	    // InternalDockerCompose.g:3799:11: lv_file_7_0= rulePATH
            	    {

            	    											newCompositeNode(grammarAccess.getSecretAccess().getFilePATHParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_59);
            	    lv_file_7_0=rulePATH();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSecretRule());
            	    											}
            	    											set(
            	    												current,
            	    												"file",
            	    												lv_file_7_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.PATH");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSecretAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDockerCompose.g:3822:4: ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3822:4: ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3823:5: {...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:3823:103: ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3824:6: ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:3827:9: ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3827:10: {...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "true");
            	    }
            	    // InternalDockerCompose.g:3827:19: (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3827:20: otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,36,FOLLOW_13); 

            	    									newLeafNode(otherlv_8, grammarAccess.getSecretAccess().getEnvironmentKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:3831:9: ( (lv_environment_9_0= ruleEString ) )
            	    // InternalDockerCompose.g:3832:10: (lv_environment_9_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3832:10: (lv_environment_9_0= ruleEString )
            	    // InternalDockerCompose.g:3833:11: lv_environment_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getSecretAccess().getEnvironmentEStringParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_59);
            	    lv_environment_9_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSecretRule());
            	    											}
            	    											set(
            	    												current,
            	    												"environment",
            	    												lv_environment_9_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSecretAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDockerCompose.g:3856:4: ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3856:4: ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3857:5: {...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalDockerCompose.g:3857:103: ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3858:6: ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalDockerCompose.g:3861:9: ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3861:10: {...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "true");
            	    }
            	    // InternalDockerCompose.g:3861:19: (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3861:20: otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,67,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getSecretAccess().getNameKeyword_3_3_0());
            	    								
            	    // InternalDockerCompose.g:3865:9: ( (lv_secret_name_11_0= ruleEString ) )
            	    // InternalDockerCompose.g:3866:10: (lv_secret_name_11_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3866:10: (lv_secret_name_11_0= ruleEString )
            	    // InternalDockerCompose.g:3867:11: lv_secret_name_11_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getSecretAccess().getSecret_nameEStringParserRuleCall_3_3_1_0());
            	    										
            	    pushFollow(FOLLOW_59);
            	    lv_secret_name_11_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSecretRule());
            	    											}
            	    											set(
            	    												current,
            	    												"secret_name",
            	    												lv_secret_name_11_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSecretAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getSecretAccess().getUnorderedGroup_3());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSecret"


    // $ANTLR start "entryRuleVolumeLabel"
    // InternalDockerCompose.g:3901:1: entryRuleVolumeLabel returns [EObject current=null] : iv_ruleVolumeLabel= ruleVolumeLabel EOF ;
    public final EObject entryRuleVolumeLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumeLabel = null;


        try {
            // InternalDockerCompose.g:3901:52: (iv_ruleVolumeLabel= ruleVolumeLabel EOF )
            // InternalDockerCompose.g:3902:2: iv_ruleVolumeLabel= ruleVolumeLabel EOF
            {
             newCompositeNode(grammarAccess.getVolumeLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVolumeLabel=ruleVolumeLabel();

            state._fsp--;

             current =iv_ruleVolumeLabel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVolumeLabel"


    // $ANTLR start "ruleVolumeLabel"
    // InternalDockerCompose.g:3908:1: ruleVolumeLabel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleVolumeLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3914:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:3915:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:3915:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:3916:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:3916:3: ()
            // InternalDockerCompose.g:3917:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeLabelAccess().getVolumeLabelAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3923:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3924:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3924:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3925:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVolumeLabelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVolumeLabelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getVolumeLabelAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:3946:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:3947:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:3947:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:3948:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVolumeLabelAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVolumeLabelRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.dockercompose.DockerCompose.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVolumeLabel"


    // $ANTLR start "entryRuleVolumeDriverOpt"
    // InternalDockerCompose.g:3969:1: entryRuleVolumeDriverOpt returns [EObject current=null] : iv_ruleVolumeDriverOpt= ruleVolumeDriverOpt EOF ;
    public final EObject entryRuleVolumeDriverOpt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumeDriverOpt = null;


        try {
            // InternalDockerCompose.g:3969:56: (iv_ruleVolumeDriverOpt= ruleVolumeDriverOpt EOF )
            // InternalDockerCompose.g:3970:2: iv_ruleVolumeDriverOpt= ruleVolumeDriverOpt EOF
            {
             newCompositeNode(grammarAccess.getVolumeDriverOptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVolumeDriverOpt=ruleVolumeDriverOpt();

            state._fsp--;

             current =iv_ruleVolumeDriverOpt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVolumeDriverOpt"


    // $ANTLR start "ruleVolumeDriverOpt"
    // InternalDockerCompose.g:3976:1: ruleVolumeDriverOpt returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleVolumeDriverOpt() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3982:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:3983:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:3983:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:3984:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:3984:3: ()
            // InternalDockerCompose.g:3985:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeDriverOptAccess().getVolumeDriverOptAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3991:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3992:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3992:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3993:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVolumeDriverOptAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVolumeDriverOptRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getVolumeDriverOptAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:4014:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:4015:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:4015:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:4016:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVolumeDriverOptAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVolumeDriverOptRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.dockercompose.DockerCompose.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVolumeDriverOpt"


    // $ANTLR start "entryRuleNetworkLabel"
    // InternalDockerCompose.g:4037:1: entryRuleNetworkLabel returns [EObject current=null] : iv_ruleNetworkLabel= ruleNetworkLabel EOF ;
    public final EObject entryRuleNetworkLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkLabel = null;


        try {
            // InternalDockerCompose.g:4037:53: (iv_ruleNetworkLabel= ruleNetworkLabel EOF )
            // InternalDockerCompose.g:4038:2: iv_ruleNetworkLabel= ruleNetworkLabel EOF
            {
             newCompositeNode(grammarAccess.getNetworkLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkLabel=ruleNetworkLabel();

            state._fsp--;

             current =iv_ruleNetworkLabel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNetworkLabel"


    // $ANTLR start "ruleNetworkLabel"
    // InternalDockerCompose.g:4044:1: ruleNetworkLabel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleLabelID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleNetworkLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:4050:2: ( ( () ( (lv_name_1_0= ruleLabelID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:4051:2: ( () ( (lv_name_1_0= ruleLabelID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:4051:2: ( () ( (lv_name_1_0= ruleLabelID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:4052:3: () ( (lv_name_1_0= ruleLabelID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:4052:3: ()
            // InternalDockerCompose.g:4053:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkLabelAccess().getNetworkLabelAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:4059:3: ( (lv_name_1_0= ruleLabelID ) )
            // InternalDockerCompose.g:4060:4: (lv_name_1_0= ruleLabelID )
            {
            // InternalDockerCompose.g:4060:4: (lv_name_1_0= ruleLabelID )
            // InternalDockerCompose.g:4061:5: lv_name_1_0= ruleLabelID
            {

            					newCompositeNode(grammarAccess.getNetworkLabelAccess().getNameLabelIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleLabelID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkLabelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.LabelID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkLabelAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:4082:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:4083:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:4083:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:4084:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNetworkLabelAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkLabelRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.dockercompose.DockerCompose.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNetworkLabel"


    // $ANTLR start "entryRuleNetworkDriverOpt"
    // InternalDockerCompose.g:4105:1: entryRuleNetworkDriverOpt returns [EObject current=null] : iv_ruleNetworkDriverOpt= ruleNetworkDriverOpt EOF ;
    public final EObject entryRuleNetworkDriverOpt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkDriverOpt = null;


        try {
            // InternalDockerCompose.g:4105:57: (iv_ruleNetworkDriverOpt= ruleNetworkDriverOpt EOF )
            // InternalDockerCompose.g:4106:2: iv_ruleNetworkDriverOpt= ruleNetworkDriverOpt EOF
            {
             newCompositeNode(grammarAccess.getNetworkDriverOptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkDriverOpt=ruleNetworkDriverOpt();

            state._fsp--;

             current =iv_ruleNetworkDriverOpt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNetworkDriverOpt"


    // $ANTLR start "ruleNetworkDriverOpt"
    // InternalDockerCompose.g:4112:1: ruleNetworkDriverOpt returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleNetworkDriverOpt() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:4118:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:4119:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:4119:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:4120:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:4120:3: ()
            // InternalDockerCompose.g:4121:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkDriverOptAccess().getNetworkDriverOptAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:4127:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:4128:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:4128:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:4129:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNetworkDriverOptAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkDriverOptRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkDriverOptAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:4150:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:4151:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:4151:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:4152:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNetworkDriverOptAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkDriverOptRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.dockercompose.DockerCompose.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNetworkDriverOpt"


    // $ANTLR start "entryRuleIPAM"
    // InternalDockerCompose.g:4173:1: entryRuleIPAM returns [EObject current=null] : iv_ruleIPAM= ruleIPAM EOF ;
    public final EObject entryRuleIPAM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAM = null;


        try {
            // InternalDockerCompose.g:4173:45: (iv_ruleIPAM= ruleIPAM EOF )
            // InternalDockerCompose.g:4174:2: iv_ruleIPAM= ruleIPAM EOF
            {
             newCompositeNode(grammarAccess.getIPAMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIPAM=ruleIPAM();

            state._fsp--;

             current =iv_ruleIPAM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIPAM"


    // $ANTLR start "ruleIPAM"
    // InternalDockerCompose.g:4180:1: ruleIPAM returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleIPAM() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_driver_3_0 = null;

        EObject lv_configs_6_0 = null;

        EObject lv_options_8_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:4186:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:4187:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:4187:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:4188:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:4188:3: ()
            // InternalDockerCompose.g:4189:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIPAMAccess().getIPAMAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:4195:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:4196:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:4196:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) )
            // InternalDockerCompose.g:4197:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIPAMAccess().getUnorderedGroup_1());
            				
            // InternalDockerCompose.g:4200:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* )
            // InternalDockerCompose.g:4201:6: ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )*
            {
            // InternalDockerCompose.g:4201:6: ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )*
            loop62:
            do {
                int alt62=4;
                alt62 = dfa62.predict(input);
                switch (alt62) {
            	case 1 :
            	    // InternalDockerCompose.g:4202:4: ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:4202:4: ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:4203:5: {...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalDockerCompose.g:4203:101: ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:4204:6: ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalDockerCompose.g:4207:9: ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:4207:10: {...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "true");
            	    }
            	    // InternalDockerCompose.g:4207:19: (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:4207:20: otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,62,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getIPAMAccess().getDriverKeyword_1_0_0());
            	    								
            	    // InternalDockerCompose.g:4211:9: ( (lv_driver_3_0= ruleEString ) )
            	    // InternalDockerCompose.g:4212:10: (lv_driver_3_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:4212:10: (lv_driver_3_0= ruleEString )
            	    // InternalDockerCompose.g:4213:11: lv_driver_3_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getIPAMAccess().getDriverEStringParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_60);
            	    lv_driver_3_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getIPAMRule());
            	    											}
            	    											set(
            	    												current,
            	    												"driver",
            	    												lv_driver_3_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIPAMAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDockerCompose.g:4236:4: ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:4236:4: ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:4237:5: {...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalDockerCompose.g:4237:101: ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) )
            	    // InternalDockerCompose.g:4238:6: ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalDockerCompose.g:4241:9: ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) )
            	    // InternalDockerCompose.g:4241:10: {...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "true");
            	    }
            	    // InternalDockerCompose.g:4241:19: (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ )
            	    // InternalDockerCompose.g:4241:20: otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+
            	    {
            	    otherlv_4=(Token)match(input,72,FOLLOW_16); 

            	    									newLeafNode(otherlv_4, grammarAccess.getIPAMAccess().getConfigKeyword_1_1_0());
            	    								
            	    // InternalDockerCompose.g:4245:9: (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+
            	    int cnt60=0;
            	    loop60:
            	    do {
            	        int alt60=2;
            	        int LA60_0 = input.LA(1);

            	        if ( (LA60_0==34) ) {
            	            alt60=1;
            	        }


            	        switch (alt60) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:4246:10: otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,34,FOLLOW_61); 

            	    	    										newLeafNode(otherlv_5, grammarAccess.getIPAMAccess().getHyphenMinusKeyword_1_1_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:4250:10: ( (lv_configs_6_0= ruleIPAMConfig ) )
            	    	    // InternalDockerCompose.g:4251:11: (lv_configs_6_0= ruleIPAMConfig )
            	    	    {
            	    	    // InternalDockerCompose.g:4251:11: (lv_configs_6_0= ruleIPAMConfig )
            	    	    // InternalDockerCompose.g:4252:12: lv_configs_6_0= ruleIPAMConfig
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getIPAMAccess().getConfigsIPAMConfigParserRuleCall_1_1_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_62);
            	    	    lv_configs_6_0=ruleIPAMConfig();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getIPAMRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"configs",
            	    	    													lv_configs_6_0,
            	    	    													"org.xtext.example.dockercompose.DockerCompose.IPAMConfig");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt60 >= 1 ) break loop60;
            	                EarlyExitException eee =
            	                    new EarlyExitException(60, input);
            	                throw eee;
            	        }
            	        cnt60++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIPAMAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDockerCompose.g:4276:4: ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:4276:4: ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) )
            	    // InternalDockerCompose.g:4277:5: {...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalDockerCompose.g:4277:101: ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) )
            	    // InternalDockerCompose.g:4278:6: ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalDockerCompose.g:4281:9: ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) )
            	    // InternalDockerCompose.g:4281:10: {...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "true");
            	    }
            	    // InternalDockerCompose.g:4281:19: (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ )
            	    // InternalDockerCompose.g:4281:20: otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+
            	    {
            	    otherlv_7=(Token)match(input,73,FOLLOW_13); 

            	    									newLeafNode(otherlv_7, grammarAccess.getIPAMAccess().getOptionsKeyword_1_2_0());
            	    								
            	    // InternalDockerCompose.g:4285:9: ( (lv_options_8_0= ruleIPAMOption ) )+
            	    int cnt61=0;
            	    loop61:
            	    do {
            	        int alt61=2;
            	        int LA61_0 = input.LA(1);

            	        if ( (LA61_0==RULE_ID) ) {
            	            int LA61_2 = input.LA(2);

            	            if ( (LA61_2==24) ) {
            	                int LA61_4 = input.LA(3);

            	                if ( (LA61_4==RULE_ID) ) {
            	                    int LA61_5 = input.LA(4);

            	                    if ( (LA61_5==EOF||(LA61_5>=RULE_VERSION_INT && LA61_5<=RULE_QUOTED_INT)||(LA61_5>=RULE_ID && LA61_5<=RULE_STRING)||(LA61_5>=17 && LA61_5<=22)||(LA61_5>=62 && LA61_5<=70)||(LA61_5>=72 && LA61_5<=73)||LA61_5==79) ) {
            	                        alt61=1;
            	                    }


            	                }
            	                else if ( ((LA61_4>=RULE_VERSION_INT && LA61_4<=RULE_QUOTED_INT)||(LA61_4>=RULE_DEVICE_DEF && LA61_4<=RULE_STRING)||LA61_4==79) ) {
            	                    alt61=1;
            	                }


            	            }


            	        }
            	        else if ( ((LA61_0>=RULE_VERSION_INT && LA61_0<=RULE_QUOTED_INT)||(LA61_0>=RULE_DEVICE_DEF && LA61_0<=RULE_STRING)||LA61_0==79) ) {
            	            alt61=1;
            	        }


            	        switch (alt61) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:4286:10: (lv_options_8_0= ruleIPAMOption )
            	    	    {
            	    	    // InternalDockerCompose.g:4286:10: (lv_options_8_0= ruleIPAMOption )
            	    	    // InternalDockerCompose.g:4287:11: lv_options_8_0= ruleIPAMOption
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getIPAMAccess().getOptionsIPAMOptionParserRuleCall_1_2_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_63);
            	    	    lv_options_8_0=ruleIPAMOption();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getIPAMRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"options",
            	    	    												lv_options_8_0,
            	    	    												"org.xtext.example.dockercompose.DockerCompose.IPAMOption");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt61 >= 1 ) break loop61;
            	                EarlyExitException eee =
            	                    new EarlyExitException(61, input);
            	                throw eee;
            	        }
            	        cnt61++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIPAMAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getIPAMAccess().getUnorderedGroup_1());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIPAM"


    // $ANTLR start "entryRuleIPAMConfig"
    // InternalDockerCompose.g:4321:1: entryRuleIPAMConfig returns [EObject current=null] : iv_ruleIPAMConfig= ruleIPAMConfig EOF ;
    public final EObject entryRuleIPAMConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAMConfig = null;


        try {
            // InternalDockerCompose.g:4321:51: (iv_ruleIPAMConfig= ruleIPAMConfig EOF )
            // InternalDockerCompose.g:4322:2: iv_ruleIPAMConfig= ruleIPAMConfig EOF
            {
             newCompositeNode(grammarAccess.getIPAMConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIPAMConfig=ruleIPAMConfig();

            state._fsp--;

             current =iv_ruleIPAMConfig; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIPAMConfig"


    // $ANTLR start "ruleIPAMConfig"
    // InternalDockerCompose.g:4328:1: ruleIPAMConfig returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleIPAMConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_subnet_3_0 = null;

        EObject lv_ip_range_5_0 = null;

        EObject lv_gateway_7_0 = null;

        EObject lv_aux_addresses_9_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:4334:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:4335:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:4335:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:4336:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:4336:3: ()
            // InternalDockerCompose.g:4337:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIPAMConfigAccess().getIPAMConfigAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:4343:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:4344:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:4344:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) )
            // InternalDockerCompose.g:4345:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1());
            				
            // InternalDockerCompose.g:4348:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* )
            // InternalDockerCompose.g:4349:6: ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )*
            {
            // InternalDockerCompose.g:4349:6: ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )*
            loop64:
            do {
                int alt64=5;
                int LA64_0 = input.LA(1);

                if ( LA64_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 0) ) {
                    alt64=1;
                }
                else if ( LA64_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 1) ) {
                    alt64=2;
                }
                else if ( LA64_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 2) ) {
                    alt64=3;
                }
                else if ( LA64_0 == 77 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 3) ) {
                    alt64=4;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalDockerCompose.g:4350:4: ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:4350:4: ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) )
            	    // InternalDockerCompose.g:4351:5: {...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalDockerCompose.g:4351:107: ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) )
            	    // InternalDockerCompose.g:4352:6: ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalDockerCompose.g:4355:9: ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) )
            	    // InternalDockerCompose.g:4355:10: {...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "true");
            	    }
            	    // InternalDockerCompose.g:4355:19: (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) )
            	    // InternalDockerCompose.g:4355:20: otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) )
            	    {
            	    otherlv_2=(Token)match(input,74,FOLLOW_8); 

            	    									newLeafNode(otherlv_2, grammarAccess.getIPAMConfigAccess().getSubnetKeyword_1_0_0());
            	    								
            	    // InternalDockerCompose.g:4359:9: ( (lv_subnet_3_0= ruleNetworkAddress ) )
            	    // InternalDockerCompose.g:4360:10: (lv_subnet_3_0= ruleNetworkAddress )
            	    {
            	    // InternalDockerCompose.g:4360:10: (lv_subnet_3_0= ruleNetworkAddress )
            	    // InternalDockerCompose.g:4361:11: lv_subnet_3_0= ruleNetworkAddress
            	    {

            	    											newCompositeNode(grammarAccess.getIPAMConfigAccess().getSubnetNetworkAddressParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_64);
            	    lv_subnet_3_0=ruleNetworkAddress();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getIPAMConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"subnet",
            	    												lv_subnet_3_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.NetworkAddress");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDockerCompose.g:4384:4: ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:4384:4: ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) )
            	    // InternalDockerCompose.g:4385:5: {...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalDockerCompose.g:4385:107: ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) )
            	    // InternalDockerCompose.g:4386:6: ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalDockerCompose.g:4389:9: ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) )
            	    // InternalDockerCompose.g:4389:10: {...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "true");
            	    }
            	    // InternalDockerCompose.g:4389:19: (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) )
            	    // InternalDockerCompose.g:4389:20: otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) )
            	    {
            	    otherlv_4=(Token)match(input,75,FOLLOW_8); 

            	    									newLeafNode(otherlv_4, grammarAccess.getIPAMConfigAccess().getIp_rangeKeyword_1_1_0());
            	    								
            	    // InternalDockerCompose.g:4393:9: ( (lv_ip_range_5_0= ruleNetworkAddress ) )
            	    // InternalDockerCompose.g:4394:10: (lv_ip_range_5_0= ruleNetworkAddress )
            	    {
            	    // InternalDockerCompose.g:4394:10: (lv_ip_range_5_0= ruleNetworkAddress )
            	    // InternalDockerCompose.g:4395:11: lv_ip_range_5_0= ruleNetworkAddress
            	    {

            	    											newCompositeNode(grammarAccess.getIPAMConfigAccess().getIp_rangeNetworkAddressParserRuleCall_1_1_1_0());
            	    										
            	    pushFollow(FOLLOW_64);
            	    lv_ip_range_5_0=ruleNetworkAddress();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getIPAMConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"ip_range",
            	    												lv_ip_range_5_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.NetworkAddress");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDockerCompose.g:4418:4: ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:4418:4: ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) )
            	    // InternalDockerCompose.g:4419:5: {...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalDockerCompose.g:4419:107: ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) )
            	    // InternalDockerCompose.g:4420:6: ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalDockerCompose.g:4423:9: ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) )
            	    // InternalDockerCompose.g:4423:10: {...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "true");
            	    }
            	    // InternalDockerCompose.g:4423:19: (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) )
            	    // InternalDockerCompose.g:4423:20: otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) )
            	    {
            	    otherlv_6=(Token)match(input,76,FOLLOW_24); 

            	    									newLeafNode(otherlv_6, grammarAccess.getIPAMConfigAccess().getGatewayKeyword_1_2_0());
            	    								
            	    // InternalDockerCompose.g:4427:9: ( (lv_gateway_7_0= ruleDNS ) )
            	    // InternalDockerCompose.g:4428:10: (lv_gateway_7_0= ruleDNS )
            	    {
            	    // InternalDockerCompose.g:4428:10: (lv_gateway_7_0= ruleDNS )
            	    // InternalDockerCompose.g:4429:11: lv_gateway_7_0= ruleDNS
            	    {

            	    											newCompositeNode(grammarAccess.getIPAMConfigAccess().getGatewayDNSParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_64);
            	    lv_gateway_7_0=ruleDNS();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getIPAMConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"gateway",
            	    												lv_gateway_7_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.DNS");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDockerCompose.g:4452:4: ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:4452:4: ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) )
            	    // InternalDockerCompose.g:4453:5: {...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalDockerCompose.g:4453:107: ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) )
            	    // InternalDockerCompose.g:4454:6: ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalDockerCompose.g:4457:9: ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) )
            	    // InternalDockerCompose.g:4457:10: {...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "true");
            	    }
            	    // InternalDockerCompose.g:4457:19: (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ )
            	    // InternalDockerCompose.g:4457:20: otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+
            	    {
            	    otherlv_8=(Token)match(input,77,FOLLOW_13); 

            	    									newLeafNode(otherlv_8, grammarAccess.getIPAMConfigAccess().getAux_addressesKeyword_1_3_0());
            	    								
            	    // InternalDockerCompose.g:4461:9: ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+
            	    int cnt63=0;
            	    loop63:
            	    do {
            	        int alt63=2;
            	        int LA63_0 = input.LA(1);

            	        if ( (LA63_0==RULE_ID) ) {
            	            int LA63_2 = input.LA(2);

            	            if ( (LA63_2==24) ) {
            	                int LA63_4 = input.LA(3);

            	                if ( (LA63_4==RULE_INT) ) {
            	                    alt63=1;
            	                }


            	            }


            	        }
            	        else if ( ((LA63_0>=RULE_VERSION_INT && LA63_0<=RULE_QUOTED_INT)||(LA63_0>=RULE_DEVICE_DEF && LA63_0<=RULE_STRING)||LA63_0==79) ) {
            	            alt63=1;
            	        }


            	        switch (alt63) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:4462:10: (lv_aux_addresses_9_0= ruleIPAMAddress )
            	    	    {
            	    	    // InternalDockerCompose.g:4462:10: (lv_aux_addresses_9_0= ruleIPAMAddress )
            	    	    // InternalDockerCompose.g:4463:11: lv_aux_addresses_9_0= ruleIPAMAddress
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getIPAMConfigAccess().getAux_addressesIPAMAddressParserRuleCall_1_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_65);
            	    	    lv_aux_addresses_9_0=ruleIPAMAddress();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getIPAMConfigRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"aux_addresses",
            	    	    												lv_aux_addresses_9_0,
            	    	    												"org.xtext.example.dockercompose.DockerCompose.IPAMAddress");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt63 >= 1 ) break loop63;
            	                EarlyExitException eee =
            	                    new EarlyExitException(63, input);
            	                throw eee;
            	        }
            	        cnt63++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIPAMConfig"


    // $ANTLR start "entryRuleIPAMOption"
    // InternalDockerCompose.g:4497:1: entryRuleIPAMOption returns [EObject current=null] : iv_ruleIPAMOption= ruleIPAMOption EOF ;
    public final EObject entryRuleIPAMOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAMOption = null;


        try {
            // InternalDockerCompose.g:4497:51: (iv_ruleIPAMOption= ruleIPAMOption EOF )
            // InternalDockerCompose.g:4498:2: iv_ruleIPAMOption= ruleIPAMOption EOF
            {
             newCompositeNode(grammarAccess.getIPAMOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIPAMOption=ruleIPAMOption();

            state._fsp--;

             current =iv_ruleIPAMOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIPAMOption"


    // $ANTLR start "ruleIPAMOption"
    // InternalDockerCompose.g:4504:1: ruleIPAMOption returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleIPAMOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:4510:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:4511:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:4511:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:4512:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:4512:3: ()
            // InternalDockerCompose.g:4513:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIPAMOptionAccess().getIPAMOptionAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:4519:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:4520:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:4520:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:4521:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIPAMOptionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIPAMOptionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getIPAMOptionAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:4542:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:4543:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:4543:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:4544:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIPAMOptionAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIPAMOptionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.dockercompose.DockerCompose.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIPAMOption"


    // $ANTLR start "entryRuleIPAMAddress"
    // InternalDockerCompose.g:4565:1: entryRuleIPAMAddress returns [EObject current=null] : iv_ruleIPAMAddress= ruleIPAMAddress EOF ;
    public final EObject entryRuleIPAMAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAMAddress = null;


        try {
            // InternalDockerCompose.g:4565:52: (iv_ruleIPAMAddress= ruleIPAMAddress EOF )
            // InternalDockerCompose.g:4566:2: iv_ruleIPAMAddress= ruleIPAMAddress EOF
            {
             newCompositeNode(grammarAccess.getIPAMAddressRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIPAMAddress=ruleIPAMAddress();

            state._fsp--;

             current =iv_ruleIPAMAddress; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIPAMAddress"


    // $ANTLR start "ruleIPAMAddress"
    // InternalDockerCompose.g:4572:1: ruleIPAMAddress returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) ) ) ;
    public final EObject ruleIPAMAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_dns_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:4578:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) ) ) )
            // InternalDockerCompose.g:4579:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) ) )
            {
            // InternalDockerCompose.g:4579:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) ) )
            // InternalDockerCompose.g:4580:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) )
            {
            // InternalDockerCompose.g:4580:3: ()
            // InternalDockerCompose.g:4581:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIPAMAddressAccess().getIPAMAddressAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:4587:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:4588:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:4588:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:4589:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIPAMAddressAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIPAMAddressRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getIPAMAddressAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:4610:3: ( (lv_dns_3_0= ruleDNS ) )
            // InternalDockerCompose.g:4611:4: (lv_dns_3_0= ruleDNS )
            {
            // InternalDockerCompose.g:4611:4: (lv_dns_3_0= ruleDNS )
            // InternalDockerCompose.g:4612:5: lv_dns_3_0= ruleDNS
            {

            					newCompositeNode(grammarAccess.getIPAMAddressAccess().getDnsDNSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_dns_3_0=ruleDNS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIPAMAddressRule());
            					}
            					set(
            						current,
            						"dns",
            						lv_dns_3_0,
            						"org.xtext.example.dockercompose.DockerCompose.DNS");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIPAMAddress"


    // $ANTLR start "entryRulePorts"
    // InternalDockerCompose.g:4633:1: entryRulePorts returns [String current=null] : iv_rulePorts= rulePorts EOF ;
    public final String entryRulePorts() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePorts = null;


        try {
            // InternalDockerCompose.g:4633:45: (iv_rulePorts= rulePorts EOF )
            // InternalDockerCompose.g:4634:2: iv_rulePorts= rulePorts EOF
            {
             newCompositeNode(grammarAccess.getPortsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePorts=rulePorts();

            state._fsp--;

             current =iv_rulePorts.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePorts"


    // $ANTLR start "rulePorts"
    // InternalDockerCompose.g:4640:1: rulePorts returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PORT_DEF_0= RULE_PORT_DEF | this_VERSION_INT_1= RULE_VERSION_INT | this_QUOTED_INT_2= RULE_QUOTED_INT ) ;
    public final AntlrDatatypeRuleToken rulePorts() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PORT_DEF_0=null;
        Token this_VERSION_INT_1=null;
        Token this_QUOTED_INT_2=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4646:2: ( (this_PORT_DEF_0= RULE_PORT_DEF | this_VERSION_INT_1= RULE_VERSION_INT | this_QUOTED_INT_2= RULE_QUOTED_INT ) )
            // InternalDockerCompose.g:4647:2: (this_PORT_DEF_0= RULE_PORT_DEF | this_VERSION_INT_1= RULE_VERSION_INT | this_QUOTED_INT_2= RULE_QUOTED_INT )
            {
            // InternalDockerCompose.g:4647:2: (this_PORT_DEF_0= RULE_PORT_DEF | this_VERSION_INT_1= RULE_VERSION_INT | this_QUOTED_INT_2= RULE_QUOTED_INT )
            int alt65=3;
            switch ( input.LA(1) ) {
            case RULE_PORT_DEF:
                {
                alt65=1;
                }
                break;
            case RULE_VERSION_INT:
                {
                alt65=2;
                }
                break;
            case RULE_QUOTED_INT:
                {
                alt65=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalDockerCompose.g:4648:3: this_PORT_DEF_0= RULE_PORT_DEF
                    {
                    this_PORT_DEF_0=(Token)match(input,RULE_PORT_DEF,FOLLOW_2); 

                    			current.merge(this_PORT_DEF_0);
                    		

                    			newLeafNode(this_PORT_DEF_0, grammarAccess.getPortsAccess().getPORT_DEFTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4656:3: this_VERSION_INT_1= RULE_VERSION_INT
                    {
                    this_VERSION_INT_1=(Token)match(input,RULE_VERSION_INT,FOLLOW_2); 

                    			current.merge(this_VERSION_INT_1);
                    		

                    			newLeafNode(this_VERSION_INT_1, grammarAccess.getPortsAccess().getVERSION_INTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:4664:3: this_QUOTED_INT_2= RULE_QUOTED_INT
                    {
                    this_QUOTED_INT_2=(Token)match(input,RULE_QUOTED_INT,FOLLOW_2); 

                    			current.merge(this_QUOTED_INT_2);
                    		

                    			newLeafNode(this_QUOTED_INT_2, grammarAccess.getPortsAccess().getQUOTED_INTTerminalRuleCall_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePorts"


    // $ANTLR start "entryRulePATH"
    // InternalDockerCompose.g:4675:1: entryRulePATH returns [String current=null] : iv_rulePATH= rulePATH EOF ;
    public final String entryRulePATH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePATH = null;


        try {
            // InternalDockerCompose.g:4675:44: (iv_rulePATH= rulePATH EOF )
            // InternalDockerCompose.g:4676:2: iv_rulePATH= rulePATH EOF
            {
             newCompositeNode(grammarAccess.getPATHRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePATH=rulePATH();

            state._fsp--;

             current =iv_rulePATH.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePATH"


    // $ANTLR start "rulePATH"
    // InternalDockerCompose.g:4682:1: rulePATH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) | kw= '.' | kw= '..' ) (kw= '/' ( (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) | kw= '.' | kw= '..' ) )* (kw= '/' )? ) | (kw= '/' ( ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' ) kw= '/' )* ( (this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )* ) | kw= '.' | kw= '..' )? ) ) ;
    public final AntlrDatatypeRuleToken rulePATH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_6=null;
        Token this_ID_8=null;
        Token this_ID_13=null;
        Token this_ID_15=null;
        Token this_ID_19=null;
        Token this_ID_21=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4688:2: ( ( ( ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) | kw= '.' | kw= '..' ) (kw= '/' ( (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) | kw= '.' | kw= '..' ) )* (kw= '/' )? ) | (kw= '/' ( ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' ) kw= '/' )* ( (this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )* ) | kw= '.' | kw= '..' )? ) ) )
            // InternalDockerCompose.g:4689:2: ( ( ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) | kw= '.' | kw= '..' ) (kw= '/' ( (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) | kw= '.' | kw= '..' ) )* (kw= '/' )? ) | (kw= '/' ( ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' ) kw= '/' )* ( (this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )* ) | kw= '.' | kw= '..' )? ) )
            {
            // InternalDockerCompose.g:4689:2: ( ( ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) | kw= '.' | kw= '..' ) (kw= '/' ( (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) | kw= '.' | kw= '..' ) )* (kw= '/' )? ) | (kw= '/' ( ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' ) kw= '/' )* ( (this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )* ) | kw= '.' | kw= '..' )? ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_ID||LA77_0==23||LA77_0==78) ) {
                alt77=1;
            }
            else if ( (LA77_0==41) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalDockerCompose.g:4690:3: ( ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) | kw= '.' | kw= '..' ) (kw= '/' ( (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) | kw= '.' | kw= '..' ) )* (kw= '/' )? )
                    {
                    // InternalDockerCompose.g:4690:3: ( ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) | kw= '.' | kw= '..' ) (kw= '/' ( (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) | kw= '.' | kw= '..' ) )* (kw= '/' )? )
                    // InternalDockerCompose.g:4691:4: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) | kw= '.' | kw= '..' ) (kw= '/' ( (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) | kw= '.' | kw= '..' ) )* (kw= '/' )?
                    {
                    // InternalDockerCompose.g:4691:4: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) | kw= '.' | kw= '..' )
                    int alt67=3;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                        {
                        alt67=1;
                        }
                        break;
                    case 23:
                        {
                        alt67=2;
                        }
                        break;
                    case 78:
                        {
                        alt67=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }

                    switch (alt67) {
                        case 1 :
                            // InternalDockerCompose.g:4692:5: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
                            {
                            // InternalDockerCompose.g:4692:5: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
                            // InternalDockerCompose.g:4693:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
                            {
                            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_66); 

                            						current.merge(this_ID_0);
                            					

                            						newLeafNode(this_ID_0, grammarAccess.getPATHAccess().getIDTerminalRuleCall_0_0_0_0());
                            					
                            // InternalDockerCompose.g:4700:6: (kw= '.' this_ID_2= RULE_ID )*
                            loop66:
                            do {
                                int alt66=2;
                                int LA66_0 = input.LA(1);

                                if ( (LA66_0==23) ) {
                                    int LA66_2 = input.LA(2);

                                    if ( (LA66_2==RULE_ID) ) {
                                        alt66=1;
                                    }


                                }


                                switch (alt66) {
                            	case 1 :
                            	    // InternalDockerCompose.g:4701:7: kw= '.' this_ID_2= RULE_ID
                            	    {
                            	    kw=(Token)match(input,23,FOLLOW_5); 

                            	    							current.merge(kw);
                            	    							newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopKeyword_0_0_0_1_0());
                            	    						
                            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_66); 

                            	    							current.merge(this_ID_2);
                            	    						

                            	    							newLeafNode(this_ID_2, grammarAccess.getPATHAccess().getIDTerminalRuleCall_0_0_0_1_1());
                            	    						

                            	    }
                            	    break;

                            	default :
                            	    break loop66;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // InternalDockerCompose.g:4716:5: kw= '.'
                            {
                            kw=(Token)match(input,23,FOLLOW_67); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopKeyword_0_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalDockerCompose.g:4722:5: kw= '..'
                            {
                            kw=(Token)match(input,78,FOLLOW_67); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopFullStopKeyword_0_0_2());
                            				

                            }
                            break;

                    }

                    // InternalDockerCompose.g:4728:4: (kw= '/' ( (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) | kw= '.' | kw= '..' ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==41) ) {
                            switch ( input.LA(2) ) {
                            case RULE_ID:
                                {
                                alt70=1;
                                }
                                break;
                            case 23:
                                {
                                alt70=1;
                                }
                                break;
                            case 78:
                                {
                                alt70=1;
                                }
                                break;

                            }

                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalDockerCompose.g:4729:5: kw= '/' ( (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) | kw= '.' | kw= '..' )
                    	    {
                    	    kw=(Token)match(input,41,FOLLOW_68); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getPATHAccess().getSolidusKeyword_0_1_0());
                    	    				
                    	    // InternalDockerCompose.g:4734:5: ( (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) | kw= '.' | kw= '..' )
                    	    int alt69=3;
                    	    switch ( input.LA(1) ) {
                    	    case RULE_ID:
                    	        {
                    	        alt69=1;
                    	        }
                    	        break;
                    	    case 23:
                    	        {
                    	        alt69=2;
                    	        }
                    	        break;
                    	    case 78:
                    	        {
                    	        alt69=3;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 69, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt69) {
                    	        case 1 :
                    	            // InternalDockerCompose.g:4735:6: (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* )
                    	            {
                    	            // InternalDockerCompose.g:4735:6: (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* )
                    	            // InternalDockerCompose.g:4736:7: this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )*
                    	            {
                    	            this_ID_6=(Token)match(input,RULE_ID,FOLLOW_66); 

                    	            							current.merge(this_ID_6);
                    	            						

                    	            							newLeafNode(this_ID_6, grammarAccess.getPATHAccess().getIDTerminalRuleCall_0_1_1_0_0());
                    	            						
                    	            // InternalDockerCompose.g:4743:7: (kw= '.' this_ID_8= RULE_ID )*
                    	            loop68:
                    	            do {
                    	                int alt68=2;
                    	                int LA68_0 = input.LA(1);

                    	                if ( (LA68_0==23) ) {
                    	                    int LA68_2 = input.LA(2);

                    	                    if ( (LA68_2==RULE_ID) ) {
                    	                        alt68=1;
                    	                    }


                    	                }


                    	                switch (alt68) {
                    	            	case 1 :
                    	            	    // InternalDockerCompose.g:4744:8: kw= '.' this_ID_8= RULE_ID
                    	            	    {
                    	            	    kw=(Token)match(input,23,FOLLOW_5); 

                    	            	    								current.merge(kw);
                    	            	    								newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopKeyword_0_1_1_0_1_0());
                    	            	    							
                    	            	    this_ID_8=(Token)match(input,RULE_ID,FOLLOW_66); 

                    	            	    								current.merge(this_ID_8);
                    	            	    							

                    	            	    								newLeafNode(this_ID_8, grammarAccess.getPATHAccess().getIDTerminalRuleCall_0_1_1_0_1_1());
                    	            	    							

                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop68;
                    	                }
                    	            } while (true);


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalDockerCompose.g:4759:6: kw= '.'
                    	            {
                    	            kw=(Token)match(input,23,FOLLOW_67); 

                    	            						current.merge(kw);
                    	            						newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopKeyword_0_1_1_1());
                    	            					

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalDockerCompose.g:4765:6: kw= '..'
                    	            {
                    	            kw=(Token)match(input,78,FOLLOW_67); 

                    	            						current.merge(kw);
                    	            						newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopFullStopKeyword_0_1_1_2());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    // InternalDockerCompose.g:4772:4: (kw= '/' )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==41) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalDockerCompose.g:4773:5: kw= '/'
                            {
                            kw=(Token)match(input,41,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getPATHAccess().getSolidusKeyword_0_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4781:3: (kw= '/' ( ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' ) kw= '/' )* ( (this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )* ) | kw= '.' | kw= '..' )? )
                    {
                    // InternalDockerCompose.g:4781:3: (kw= '/' ( ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' ) kw= '/' )* ( (this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )* ) | kw= '.' | kw= '..' )? )
                    // InternalDockerCompose.g:4782:4: kw= '/' ( ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' ) kw= '/' )* ( (this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )* ) | kw= '.' | kw= '..' )?
                    {
                    kw=(Token)match(input,41,FOLLOW_69); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPATHAccess().getSolidusKeyword_1_0());
                    			
                    // InternalDockerCompose.g:4787:4: ( ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' ) kw= '/' )*
                    loop74:
                    do {
                        int alt74=2;
                        alt74 = dfa74.predict(input);
                        switch (alt74) {
                    	case 1 :
                    	    // InternalDockerCompose.g:4788:5: ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' ) kw= '/'
                    	    {
                    	    // InternalDockerCompose.g:4788:5: ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' )
                    	    int alt73=3;
                    	    switch ( input.LA(1) ) {
                    	    case RULE_ID:
                    	        {
                    	        alt73=1;
                    	        }
                    	        break;
                    	    case 23:
                    	        {
                    	        alt73=2;
                    	        }
                    	        break;
                    	    case 78:
                    	        {
                    	        alt73=3;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 73, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt73) {
                    	        case 1 :
                    	            // InternalDockerCompose.g:4789:6: (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* )
                    	            {
                    	            // InternalDockerCompose.g:4789:6: (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* )
                    	            // InternalDockerCompose.g:4790:7: this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )*
                    	            {
                    	            this_ID_13=(Token)match(input,RULE_ID,FOLLOW_70); 

                    	            							current.merge(this_ID_13);
                    	            						

                    	            							newLeafNode(this_ID_13, grammarAccess.getPATHAccess().getIDTerminalRuleCall_1_1_0_0_0());
                    	            						
                    	            // InternalDockerCompose.g:4797:7: (kw= '.' this_ID_15= RULE_ID )*
                    	            loop72:
                    	            do {
                    	                int alt72=2;
                    	                int LA72_0 = input.LA(1);

                    	                if ( (LA72_0==23) ) {
                    	                    alt72=1;
                    	                }


                    	                switch (alt72) {
                    	            	case 1 :
                    	            	    // InternalDockerCompose.g:4798:8: kw= '.' this_ID_15= RULE_ID
                    	            	    {
                    	            	    kw=(Token)match(input,23,FOLLOW_5); 

                    	            	    								current.merge(kw);
                    	            	    								newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopKeyword_1_1_0_0_1_0());
                    	            	    							
                    	            	    this_ID_15=(Token)match(input,RULE_ID,FOLLOW_70); 

                    	            	    								current.merge(this_ID_15);
                    	            	    							

                    	            	    								newLeafNode(this_ID_15, grammarAccess.getPATHAccess().getIDTerminalRuleCall_1_1_0_0_1_1());
                    	            	    							

                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop72;
                    	                }
                    	            } while (true);


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalDockerCompose.g:4813:6: kw= '.'
                    	            {
                    	            kw=(Token)match(input,23,FOLLOW_71); 

                    	            						current.merge(kw);
                    	            						newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopKeyword_1_1_0_1());
                    	            					

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalDockerCompose.g:4819:6: kw= '..'
                    	            {
                    	            kw=(Token)match(input,78,FOLLOW_71); 

                    	            						current.merge(kw);
                    	            						newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopFullStopKeyword_1_1_0_2());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    kw=(Token)match(input,41,FOLLOW_69); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getPATHAccess().getSolidusKeyword_1_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    // InternalDockerCompose.g:4831:4: ( (this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )* ) | kw= '.' | kw= '..' )?
                    int alt76=4;
                    switch ( input.LA(1) ) {
                        case RULE_ID:
                            {
                            alt76=1;
                            }
                            break;
                        case 23:
                            {
                            alt76=2;
                            }
                            break;
                        case 78:
                            {
                            alt76=3;
                            }
                            break;
                    }

                    switch (alt76) {
                        case 1 :
                            // InternalDockerCompose.g:4832:5: (this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )* )
                            {
                            // InternalDockerCompose.g:4832:5: (this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )* )
                            // InternalDockerCompose.g:4833:6: this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )*
                            {
                            this_ID_19=(Token)match(input,RULE_ID,FOLLOW_72); 

                            						current.merge(this_ID_19);
                            					

                            						newLeafNode(this_ID_19, grammarAccess.getPATHAccess().getIDTerminalRuleCall_1_2_0_0());
                            					
                            // InternalDockerCompose.g:4840:6: (kw= '.' this_ID_21= RULE_ID )*
                            loop75:
                            do {
                                int alt75=2;
                                int LA75_0 = input.LA(1);

                                if ( (LA75_0==23) ) {
                                    int LA75_2 = input.LA(2);

                                    if ( (LA75_2==RULE_ID) ) {
                                        alt75=1;
                                    }


                                }


                                switch (alt75) {
                            	case 1 :
                            	    // InternalDockerCompose.g:4841:7: kw= '.' this_ID_21= RULE_ID
                            	    {
                            	    kw=(Token)match(input,23,FOLLOW_5); 

                            	    							current.merge(kw);
                            	    							newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopKeyword_1_2_0_1_0());
                            	    						
                            	    this_ID_21=(Token)match(input,RULE_ID,FOLLOW_72); 

                            	    							current.merge(this_ID_21);
                            	    						

                            	    							newLeafNode(this_ID_21, grammarAccess.getPATHAccess().getIDTerminalRuleCall_1_2_0_1_1());
                            	    						

                            	    }
                            	    break;

                            	default :
                            	    break loop75;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // InternalDockerCompose.g:4856:5: kw= '.'
                            {
                            kw=(Token)match(input,23,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopKeyword_1_2_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalDockerCompose.g:4862:5: kw= '..'
                            {
                            kw=(Token)match(input,78,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopFullStopKeyword_1_2_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePATH"


    // $ANTLR start "entryRuleEString"
    // InternalDockerCompose.g:4873:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDockerCompose.g:4873:47: (iv_ruleEString= ruleEString EOF )
            // InternalDockerCompose.g:4874:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDockerCompose.g:4880:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | (kw= '\"' kw= '\"' ) | this_PORT_DEF_4= RULE_PORT_DEF | this_VERSION_INT_5= RULE_VERSION_INT | this_QUOTED_INT_6= RULE_QUOTED_INT | this_VERSION_FLOAT_7= RULE_VERSION_FLOAT | this_DEVICE_DEF_8= RULE_DEVICE_DEF ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;
        Token kw=null;
        Token this_PORT_DEF_4=null;
        Token this_VERSION_INT_5=null;
        Token this_QUOTED_INT_6=null;
        Token this_VERSION_FLOAT_7=null;
        Token this_DEVICE_DEF_8=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4886:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | (kw= '\"' kw= '\"' ) | this_PORT_DEF_4= RULE_PORT_DEF | this_VERSION_INT_5= RULE_VERSION_INT | this_QUOTED_INT_6= RULE_QUOTED_INT | this_VERSION_FLOAT_7= RULE_VERSION_FLOAT | this_DEVICE_DEF_8= RULE_DEVICE_DEF ) )
            // InternalDockerCompose.g:4887:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | (kw= '\"' kw= '\"' ) | this_PORT_DEF_4= RULE_PORT_DEF | this_VERSION_INT_5= RULE_VERSION_INT | this_QUOTED_INT_6= RULE_QUOTED_INT | this_VERSION_FLOAT_7= RULE_VERSION_FLOAT | this_DEVICE_DEF_8= RULE_DEVICE_DEF )
            {
            // InternalDockerCompose.g:4887:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | (kw= '\"' kw= '\"' ) | this_PORT_DEF_4= RULE_PORT_DEF | this_VERSION_INT_5= RULE_VERSION_INT | this_QUOTED_INT_6= RULE_QUOTED_INT | this_VERSION_FLOAT_7= RULE_VERSION_FLOAT | this_DEVICE_DEF_8= RULE_DEVICE_DEF )
            int alt78=8;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt78=1;
                }
                break;
            case RULE_ID:
                {
                alt78=2;
                }
                break;
            case 79:
                {
                alt78=3;
                }
                break;
            case RULE_PORT_DEF:
                {
                alt78=4;
                }
                break;
            case RULE_VERSION_INT:
                {
                alt78=5;
                }
                break;
            case RULE_QUOTED_INT:
                {
                alt78=6;
                }
                break;
            case RULE_VERSION_FLOAT:
                {
                alt78=7;
                }
                break;
            case RULE_DEVICE_DEF:
                {
                alt78=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalDockerCompose.g:4888:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4896:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:4904:3: (kw= '\"' kw= '\"' )
                    {
                    // InternalDockerCompose.g:4904:3: (kw= '\"' kw= '\"' )
                    // InternalDockerCompose.g:4905:4: kw= '\"' kw= '\"'
                    {
                    kw=(Token)match(input,79,FOLLOW_73); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEStringAccess().getQuotationMarkKeyword_2_0());
                    			
                    kw=(Token)match(input,79,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEStringAccess().getQuotationMarkKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDockerCompose.g:4917:3: this_PORT_DEF_4= RULE_PORT_DEF
                    {
                    this_PORT_DEF_4=(Token)match(input,RULE_PORT_DEF,FOLLOW_2); 

                    			current.merge(this_PORT_DEF_4);
                    		

                    			newLeafNode(this_PORT_DEF_4, grammarAccess.getEStringAccess().getPORT_DEFTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDockerCompose.g:4925:3: this_VERSION_INT_5= RULE_VERSION_INT
                    {
                    this_VERSION_INT_5=(Token)match(input,RULE_VERSION_INT,FOLLOW_2); 

                    			current.merge(this_VERSION_INT_5);
                    		

                    			newLeafNode(this_VERSION_INT_5, grammarAccess.getEStringAccess().getVERSION_INTTerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalDockerCompose.g:4933:3: this_QUOTED_INT_6= RULE_QUOTED_INT
                    {
                    this_QUOTED_INT_6=(Token)match(input,RULE_QUOTED_INT,FOLLOW_2); 

                    			current.merge(this_QUOTED_INT_6);
                    		

                    			newLeafNode(this_QUOTED_INT_6, grammarAccess.getEStringAccess().getQUOTED_INTTerminalRuleCall_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalDockerCompose.g:4941:3: this_VERSION_FLOAT_7= RULE_VERSION_FLOAT
                    {
                    this_VERSION_FLOAT_7=(Token)match(input,RULE_VERSION_FLOAT,FOLLOW_2); 

                    			current.merge(this_VERSION_FLOAT_7);
                    		

                    			newLeafNode(this_VERSION_FLOAT_7, grammarAccess.getEStringAccess().getVERSION_FLOATTerminalRuleCall_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalDockerCompose.g:4949:3: this_DEVICE_DEF_8= RULE_DEVICE_DEF
                    {
                    this_DEVICE_DEF_8=(Token)match(input,RULE_DEVICE_DEF,FOLLOW_2); 

                    			current.merge(this_DEVICE_DEF_8);
                    		

                    			newLeafNode(this_DEVICE_DEF_8, grammarAccess.getEStringAccess().getDEVICE_DEFTerminalRuleCall_7());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleLabelID"
    // InternalDockerCompose.g:4960:1: entryRuleLabelID returns [String current=null] : iv_ruleLabelID= ruleLabelID EOF ;
    public final String entryRuleLabelID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLabelID = null;


        try {
            // InternalDockerCompose.g:4960:47: (iv_ruleLabelID= ruleLabelID EOF )
            // InternalDockerCompose.g:4961:2: iv_ruleLabelID= ruleLabelID EOF
            {
             newCompositeNode(grammarAccess.getLabelIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabelID=ruleLabelID();

            state._fsp--;

             current =iv_ruleLabelID.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabelID"


    // $ANTLR start "ruleLabelID"
    // InternalDockerCompose.g:4967:1: ruleLabelID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleLabelID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4973:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDockerCompose.g:4974:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDockerCompose.g:4974:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDockerCompose.g:4975:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_72); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getLabelIDAccess().getIDTerminalRuleCall_0());
            		
            // InternalDockerCompose.g:4982:3: (kw= '.' this_ID_2= RULE_ID )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==23) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalDockerCompose.g:4983:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,23,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getLabelIDAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_72); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getLabelIDAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabelID"


    // $ANTLR start "entryRuleEInt"
    // InternalDockerCompose.g:5000:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDockerCompose.g:5000:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDockerCompose.g:5001:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDockerCompose.g:5007:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:5013:2: (this_INT_0= RULE_INT )
            // InternalDockerCompose.g:5014:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleCommand"
    // InternalDockerCompose.g:5024:1: entryRuleCommand returns [String current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final String entryRuleCommand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommand = null;


        try {
            // InternalDockerCompose.g:5024:47: (iv_ruleCommand= ruleCommand EOF )
            // InternalDockerCompose.g:5025:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalDockerCompose.g:5031:1: ruleCommand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString | this_ANY_OTHER_1= RULE_ANY_OTHER | this_PATH_2= rulePATH | this_EInt_3= ruleEInt | kw= '-' )+ ;
    public final AntlrDatatypeRuleToken ruleCommand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_EString_0 = null;

        AntlrDatatypeRuleToken this_PATH_2 = null;

        AntlrDatatypeRuleToken this_EInt_3 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:5037:2: ( (this_EString_0= ruleEString | this_ANY_OTHER_1= RULE_ANY_OTHER | this_PATH_2= rulePATH | this_EInt_3= ruleEInt | kw= '-' )+ )
            // InternalDockerCompose.g:5038:2: (this_EString_0= ruleEString | this_ANY_OTHER_1= RULE_ANY_OTHER | this_PATH_2= rulePATH | this_EInt_3= ruleEInt | kw= '-' )+
            {
            // InternalDockerCompose.g:5038:2: (this_EString_0= ruleEString | this_ANY_OTHER_1= RULE_ANY_OTHER | this_PATH_2= rulePATH | this_EInt_3= ruleEInt | kw= '-' )+
            int cnt80=0;
            loop80:
            do {
                int alt80=6;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA80_2 = input.LA(2);

                    if ( (LA80_2==EOF||(LA80_2>=RULE_VERSION_INT && LA80_2<=RULE_ANY_OTHER)||(LA80_2>=17 && LA80_2<=23)||(LA80_2>=25 && LA80_2<=39)||LA80_2==41||(LA80_2>=78 && LA80_2<=79)) ) {
                        alt80=1;
                    }


                    }
                    break;
                case RULE_VERSION_INT:
                case RULE_VERSION_FLOAT:
                case RULE_QUOTED_INT:
                case RULE_DEVICE_DEF:
                case RULE_PORT_DEF:
                case RULE_STRING:
                case 79:
                    {
                    alt80=1;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt80=2;
                    }
                    break;
                case 23:
                case 41:
                case 78:
                    {
                    alt80=3;
                    }
                    break;
                case RULE_INT:
                    {
                    alt80=4;
                    }
                    break;
                case 34:
                    {
                    alt80=5;
                    }
                    break;

                }

                switch (alt80) {
            	case 1 :
            	    // InternalDockerCompose.g:5039:3: this_EString_0= ruleEString
            	    {

            	    			newCompositeNode(grammarAccess.getCommandAccess().getEStringParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_74);
            	    this_EString_0=ruleEString();

            	    state._fsp--;


            	    			current.merge(this_EString_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalDockerCompose.g:5050:3: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_74); 

            	    			current.merge(this_ANY_OTHER_1);
            	    		

            	    			newLeafNode(this_ANY_OTHER_1, grammarAccess.getCommandAccess().getANY_OTHERTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalDockerCompose.g:5058:3: this_PATH_2= rulePATH
            	    {

            	    			newCompositeNode(grammarAccess.getCommandAccess().getPATHParserRuleCall_2());
            	    		
            	    pushFollow(FOLLOW_74);
            	    this_PATH_2=rulePATH();

            	    state._fsp--;


            	    			current.merge(this_PATH_2);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalDockerCompose.g:5069:3: this_EInt_3= ruleEInt
            	    {

            	    			newCompositeNode(grammarAccess.getCommandAccess().getEIntParserRuleCall_3());
            	    		
            	    pushFollow(FOLLOW_74);
            	    this_EInt_3=ruleEInt();

            	    state._fsp--;


            	    			current.merge(this_EInt_3);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalDockerCompose.g:5080:3: kw= '-'
            	    {
            	    kw=(Token)match(input,34,FOLLOW_74); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getCommandAccess().getHyphenMinusKeyword_4());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt80 >= 1 ) break loop80;
                        EarlyExitException eee =
                            new EarlyExitException(80, input);
                        throw eee;
                }
                cnt80++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuledotID"
    // InternalDockerCompose.g:5089:1: entryRuledotID returns [String current=null] : iv_ruledotID= ruledotID EOF ;
    public final String entryRuledotID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledotID = null;


        try {
            // InternalDockerCompose.g:5089:45: (iv_ruledotID= ruledotID EOF )
            // InternalDockerCompose.g:5090:2: iv_ruledotID= ruledotID EOF
            {
             newCompositeNode(grammarAccess.getDotIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledotID=ruledotID();

            state._fsp--;

             current =iv_ruledotID.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledotID"


    // $ANTLR start "ruledotID"
    // InternalDockerCompose.g:5096:1: ruledotID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruledotID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:5102:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDockerCompose.g:5103:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDockerCompose.g:5103:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDockerCompose.g:5104:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_72); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getDotIDAccess().getIDTerminalRuleCall_0());
            		
            // InternalDockerCompose.g:5111:3: (kw= '.' this_ID_2= RULE_ID )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==23) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalDockerCompose.g:5112:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,23,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getDotIDAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_72); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getDotIDAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledotID"


    // $ANTLR start "entryRuleDNS"
    // InternalDockerCompose.g:5129:1: entryRuleDNS returns [EObject current=null] : iv_ruleDNS= ruleDNS EOF ;
    public final EObject entryRuleDNS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNS = null;


        try {
            // InternalDockerCompose.g:5129:44: (iv_ruleDNS= ruleDNS EOF )
            // InternalDockerCompose.g:5130:2: iv_ruleDNS= ruleDNS EOF
            {
             newCompositeNode(grammarAccess.getDNSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDNS=ruleDNS();

            state._fsp--;

             current =iv_ruleDNS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDNS"


    // $ANTLR start "ruleDNS"
    // InternalDockerCompose.g:5136:1: ruleDNS returns [EObject current=null] : ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) ) ;
    public final EObject ruleDNS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_dns1_0_0 = null;

        AntlrDatatypeRuleToken lv_dns2_2_0 = null;

        AntlrDatatypeRuleToken lv_dns3_4_0 = null;

        AntlrDatatypeRuleToken lv_dns4_6_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:5142:2: ( ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) ) )
            // InternalDockerCompose.g:5143:2: ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) )
            {
            // InternalDockerCompose.g:5143:2: ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) )
            // InternalDockerCompose.g:5144:3: ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) )
            {
            // InternalDockerCompose.g:5144:3: ( (lv_dns1_0_0= ruleEInt ) )
            // InternalDockerCompose.g:5145:4: (lv_dns1_0_0= ruleEInt )
            {
            // InternalDockerCompose.g:5145:4: (lv_dns1_0_0= ruleEInt )
            // InternalDockerCompose.g:5146:5: lv_dns1_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDNSAccess().getDns1EIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_dns1_0_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDNSRule());
            					}
            					set(
            						current,
            						"dns1",
            						lv_dns1_0_0,
            						"org.xtext.example.dockercompose.DockerCompose.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDNSAccess().getFullStopKeyword_1());
            		
            // InternalDockerCompose.g:5167:3: ( (lv_dns2_2_0= ruleEInt ) )
            // InternalDockerCompose.g:5168:4: (lv_dns2_2_0= ruleEInt )
            {
            // InternalDockerCompose.g:5168:4: (lv_dns2_2_0= ruleEInt )
            // InternalDockerCompose.g:5169:5: lv_dns2_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDNSAccess().getDns2EIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_dns2_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDNSRule());
            					}
            					set(
            						current,
            						"dns2",
            						lv_dns2_2_0,
            						"org.xtext.example.dockercompose.DockerCompose.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getDNSAccess().getFullStopKeyword_3());
            		
            // InternalDockerCompose.g:5190:3: ( (lv_dns3_4_0= ruleEInt ) )
            // InternalDockerCompose.g:5191:4: (lv_dns3_4_0= ruleEInt )
            {
            // InternalDockerCompose.g:5191:4: (lv_dns3_4_0= ruleEInt )
            // InternalDockerCompose.g:5192:5: lv_dns3_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDNSAccess().getDns3EIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_dns3_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDNSRule());
            					}
            					set(
            						current,
            						"dns3",
            						lv_dns3_4_0,
            						"org.xtext.example.dockercompose.DockerCompose.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getDNSAccess().getFullStopKeyword_5());
            		
            // InternalDockerCompose.g:5213:3: ( (lv_dns4_6_0= ruleEInt ) )
            // InternalDockerCompose.g:5214:4: (lv_dns4_6_0= ruleEInt )
            {
            // InternalDockerCompose.g:5214:4: (lv_dns4_6_0= ruleEInt )
            // InternalDockerCompose.g:5215:5: lv_dns4_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDNSAccess().getDns4EIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_dns4_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDNSRule());
            					}
            					set(
            						current,
            						"dns4",
            						lv_dns4_6_0,
            						"org.xtext.example.dockercompose.DockerCompose.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDNS"


    // $ANTLR start "entryRuleNetworkAddress"
    // InternalDockerCompose.g:5236:1: entryRuleNetworkAddress returns [EObject current=null] : iv_ruleNetworkAddress= ruleNetworkAddress EOF ;
    public final EObject entryRuleNetworkAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkAddress = null;


        try {
            // InternalDockerCompose.g:5236:55: (iv_ruleNetworkAddress= ruleNetworkAddress EOF )
            // InternalDockerCompose.g:5237:2: iv_ruleNetworkAddress= ruleNetworkAddress EOF
            {
             newCompositeNode(grammarAccess.getNetworkAddressRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkAddress=ruleNetworkAddress();

            state._fsp--;

             current =iv_ruleNetworkAddress; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNetworkAddress"


    // $ANTLR start "ruleNetworkAddress"
    // InternalDockerCompose.g:5243:1: ruleNetworkAddress returns [EObject current=null] : ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) ) ) ;
    public final EObject ruleNetworkAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_dns1_0_0 = null;

        AntlrDatatypeRuleToken lv_dns2_2_0 = null;

        AntlrDatatypeRuleToken lv_dns3_4_0 = null;

        AntlrDatatypeRuleToken lv_dns4_6_0 = null;

        AntlrDatatypeRuleToken lv_netId_8_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:5249:2: ( ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) ) ) )
            // InternalDockerCompose.g:5250:2: ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) ) )
            {
            // InternalDockerCompose.g:5250:2: ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) ) )
            // InternalDockerCompose.g:5251:3: ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) )
            {
            // InternalDockerCompose.g:5251:3: ( (lv_dns1_0_0= ruleEInt ) )
            // InternalDockerCompose.g:5252:4: (lv_dns1_0_0= ruleEInt )
            {
            // InternalDockerCompose.g:5252:4: (lv_dns1_0_0= ruleEInt )
            // InternalDockerCompose.g:5253:5: lv_dns1_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNetworkAddressAccess().getDns1EIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_dns1_0_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkAddressRule());
            					}
            					set(
            						current,
            						"dns1",
            						lv_dns1_0_0,
            						"org.xtext.example.dockercompose.DockerCompose.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getNetworkAddressAccess().getFullStopKeyword_1());
            		
            // InternalDockerCompose.g:5274:3: ( (lv_dns2_2_0= ruleEInt ) )
            // InternalDockerCompose.g:5275:4: (lv_dns2_2_0= ruleEInt )
            {
            // InternalDockerCompose.g:5275:4: (lv_dns2_2_0= ruleEInt )
            // InternalDockerCompose.g:5276:5: lv_dns2_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNetworkAddressAccess().getDns2EIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_dns2_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkAddressRule());
            					}
            					set(
            						current,
            						"dns2",
            						lv_dns2_2_0,
            						"org.xtext.example.dockercompose.DockerCompose.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getNetworkAddressAccess().getFullStopKeyword_3());
            		
            // InternalDockerCompose.g:5297:3: ( (lv_dns3_4_0= ruleEInt ) )
            // InternalDockerCompose.g:5298:4: (lv_dns3_4_0= ruleEInt )
            {
            // InternalDockerCompose.g:5298:4: (lv_dns3_4_0= ruleEInt )
            // InternalDockerCompose.g:5299:5: lv_dns3_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNetworkAddressAccess().getDns3EIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_dns3_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkAddressRule());
            					}
            					set(
            						current,
            						"dns3",
            						lv_dns3_4_0,
            						"org.xtext.example.dockercompose.DockerCompose.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getNetworkAddressAccess().getFullStopKeyword_5());
            		
            // InternalDockerCompose.g:5320:3: ( (lv_dns4_6_0= ruleEInt ) )
            // InternalDockerCompose.g:5321:4: (lv_dns4_6_0= ruleEInt )
            {
            // InternalDockerCompose.g:5321:4: (lv_dns4_6_0= ruleEInt )
            // InternalDockerCompose.g:5322:5: lv_dns4_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNetworkAddressAccess().getDns4EIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_71);
            lv_dns4_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkAddressRule());
            					}
            					set(
            						current,
            						"dns4",
            						lv_dns4_6_0,
            						"org.xtext.example.dockercompose.DockerCompose.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,41,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getNetworkAddressAccess().getSolidusKeyword_7());
            		
            // InternalDockerCompose.g:5343:3: ( (lv_netId_8_0= ruleEInt ) )
            // InternalDockerCompose.g:5344:4: (lv_netId_8_0= ruleEInt )
            {
            // InternalDockerCompose.g:5344:4: (lv_netId_8_0= ruleEInt )
            // InternalDockerCompose.g:5345:5: lv_netId_8_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNetworkAddressAccess().getNetIdEIntParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_netId_8_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkAddressRule());
            					}
            					set(
            						current,
            						"netId",
            						lv_netId_8_0,
            						"org.xtext.example.dockercompose.DockerCompose.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNetworkAddress"


    // $ANTLR start "entryRuleEBoolean"
    // InternalDockerCompose.g:5366:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalDockerCompose.g:5366:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalDockerCompose.g:5367:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalDockerCompose.g:5373:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:5379:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalDockerCompose.g:5380:2: (kw= 'true' | kw= 'false' )
            {
            // InternalDockerCompose.g:5380:2: (kw= 'true' | kw= 'false' )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==80) ) {
                alt82=1;
            }
            else if ( (LA82_0==81) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalDockerCompose.g:5381:3: kw= 'true'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:5387:3: kw= 'false'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "ruleRestartPolicy"
    // InternalDockerCompose.g:5396:1: ruleRestartPolicy returns [Enumerator current=null] : ( (enumLiteral_0= '\"no\"' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'on-failure' ) | (enumLiteral_3= 'unless-stopped' ) ) ;
    public final Enumerator ruleRestartPolicy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:5402:2: ( ( (enumLiteral_0= '\"no\"' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'on-failure' ) | (enumLiteral_3= 'unless-stopped' ) ) )
            // InternalDockerCompose.g:5403:2: ( (enumLiteral_0= '\"no\"' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'on-failure' ) | (enumLiteral_3= 'unless-stopped' ) )
            {
            // InternalDockerCompose.g:5403:2: ( (enumLiteral_0= '\"no\"' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'on-failure' ) | (enumLiteral_3= 'unless-stopped' ) )
            int alt83=4;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt83=1;
                }
                break;
            case 83:
                {
                alt83=2;
                }
                break;
            case 84:
                {
                alt83=3;
                }
                break;
            case 85:
                {
                alt83=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalDockerCompose.g:5404:3: (enumLiteral_0= '\"no\"' )
                    {
                    // InternalDockerCompose.g:5404:3: (enumLiteral_0= '\"no\"' )
                    // InternalDockerCompose.g:5405:4: enumLiteral_0= '\"no\"'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getRestartPolicyAccess().getNoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRestartPolicyAccess().getNoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:5412:3: (enumLiteral_1= 'always' )
                    {
                    // InternalDockerCompose.g:5412:3: (enumLiteral_1= 'always' )
                    // InternalDockerCompose.g:5413:4: enumLiteral_1= 'always'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getRestartPolicyAccess().getAlwaysEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRestartPolicyAccess().getAlwaysEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:5420:3: (enumLiteral_2= 'on-failure' )
                    {
                    // InternalDockerCompose.g:5420:3: (enumLiteral_2= 'on-failure' )
                    // InternalDockerCompose.g:5421:4: enumLiteral_2= 'on-failure'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getRestartPolicyAccess().getOnfailureEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRestartPolicyAccess().getOnfailureEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDockerCompose.g:5428:3: (enumLiteral_3= 'unless-stopped' )
                    {
                    // InternalDockerCompose.g:5428:3: (enumLiteral_3= 'unless-stopped' )
                    // InternalDockerCompose.g:5429:4: enumLiteral_3= 'unless-stopped'
                    {
                    enumLiteral_3=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getRestartPolicyAccess().getUnlessstoppedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRestartPolicyAccess().getUnlessstoppedEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestartPolicy"


    // $ANTLR start "ruleAccessMode"
    // InternalDockerCompose.g:5439:1: ruleAccessMode returns [Enumerator current=null] : ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) | (enumLiteral_2= 'z' ) ) ;
    public final Enumerator ruleAccessMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:5445:2: ( ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) | (enumLiteral_2= 'z' ) ) )
            // InternalDockerCompose.g:5446:2: ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) | (enumLiteral_2= 'z' ) )
            {
            // InternalDockerCompose.g:5446:2: ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) | (enumLiteral_2= 'z' ) )
            int alt84=3;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt84=1;
                }
                break;
            case 87:
                {
                alt84=2;
                }
                break;
            case 88:
                {
                alt84=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalDockerCompose.g:5447:3: (enumLiteral_0= 'rw' )
                    {
                    // InternalDockerCompose.g:5447:3: (enumLiteral_0= 'rw' )
                    // InternalDockerCompose.g:5448:4: enumLiteral_0= 'rw'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getAccessModeAccess().getRwEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessModeAccess().getRwEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:5455:3: (enumLiteral_1= 'ro' )
                    {
                    // InternalDockerCompose.g:5455:3: (enumLiteral_1= 'ro' )
                    // InternalDockerCompose.g:5456:4: enumLiteral_1= 'ro'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getAccessModeAccess().getRoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessModeAccess().getRoEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:5463:3: (enumLiteral_2= 'z' )
                    {
                    // InternalDockerCompose.g:5463:3: (enumLiteral_2= 'z' )
                    // InternalDockerCompose.g:5464:4: enumLiteral_2= 'z'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getAccessModeAccess().getZEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAccessModeAccess().getZEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccessMode"


    // $ANTLR start "ruleMountType"
    // InternalDockerCompose.g:5474:1: ruleMountType returns [Enumerator current=null] : ( (enumLiteral_0= 'volume' ) | (enumLiteral_1= 'bind' ) | (enumLiteral_2= 'tmpfs' ) | (enumLiteral_3= 'npipe' ) ) ;
    public final Enumerator ruleMountType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:5480:2: ( ( (enumLiteral_0= 'volume' ) | (enumLiteral_1= 'bind' ) | (enumLiteral_2= 'tmpfs' ) | (enumLiteral_3= 'npipe' ) ) )
            // InternalDockerCompose.g:5481:2: ( (enumLiteral_0= 'volume' ) | (enumLiteral_1= 'bind' ) | (enumLiteral_2= 'tmpfs' ) | (enumLiteral_3= 'npipe' ) )
            {
            // InternalDockerCompose.g:5481:2: ( (enumLiteral_0= 'volume' ) | (enumLiteral_1= 'bind' ) | (enumLiteral_2= 'tmpfs' ) | (enumLiteral_3= 'npipe' ) )
            int alt85=4;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt85=1;
                }
                break;
            case 90:
                {
                alt85=2;
                }
                break;
            case 91:
                {
                alt85=3;
                }
                break;
            case 92:
                {
                alt85=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // InternalDockerCompose.g:5482:3: (enumLiteral_0= 'volume' )
                    {
                    // InternalDockerCompose.g:5482:3: (enumLiteral_0= 'volume' )
                    // InternalDockerCompose.g:5483:4: enumLiteral_0= 'volume'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getMountTypeAccess().getVolumeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMountTypeAccess().getVolumeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:5490:3: (enumLiteral_1= 'bind' )
                    {
                    // InternalDockerCompose.g:5490:3: (enumLiteral_1= 'bind' )
                    // InternalDockerCompose.g:5491:4: enumLiteral_1= 'bind'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getMountTypeAccess().getBindEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMountTypeAccess().getBindEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:5498:3: (enumLiteral_2= 'tmpfs' )
                    {
                    // InternalDockerCompose.g:5498:3: (enumLiteral_2= 'tmpfs' )
                    // InternalDockerCompose.g:5499:4: enumLiteral_2= 'tmpfs'
                    {
                    enumLiteral_2=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getMountTypeAccess().getTmpfsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMountTypeAccess().getTmpfsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDockerCompose.g:5506:3: (enumLiteral_3= 'npipe' )
                    {
                    // InternalDockerCompose.g:5506:3: (enumLiteral_3= 'npipe' )
                    // InternalDockerCompose.g:5507:4: enumLiteral_3= 'npipe'
                    {
                    enumLiteral_3=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getMountTypeAccess().getNpipeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMountTypeAccess().getNpipeEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMountType"


    // $ANTLR start "rulePropagationType"
    // InternalDockerCompose.g:5517:1: rulePropagationType returns [Enumerator current=null] : ( (enumLiteral_0= 'rprivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'rshared' ) | (enumLiteral_3= 'shared' ) | (enumLiteral_4= 'rslave' ) | (enumLiteral_5= 'slave' ) ) ;
    public final Enumerator rulePropagationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:5523:2: ( ( (enumLiteral_0= 'rprivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'rshared' ) | (enumLiteral_3= 'shared' ) | (enumLiteral_4= 'rslave' ) | (enumLiteral_5= 'slave' ) ) )
            // InternalDockerCompose.g:5524:2: ( (enumLiteral_0= 'rprivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'rshared' ) | (enumLiteral_3= 'shared' ) | (enumLiteral_4= 'rslave' ) | (enumLiteral_5= 'slave' ) )
            {
            // InternalDockerCompose.g:5524:2: ( (enumLiteral_0= 'rprivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'rshared' ) | (enumLiteral_3= 'shared' ) | (enumLiteral_4= 'rslave' ) | (enumLiteral_5= 'slave' ) )
            int alt86=6;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt86=1;
                }
                break;
            case 94:
                {
                alt86=2;
                }
                break;
            case 95:
                {
                alt86=3;
                }
                break;
            case 96:
                {
                alt86=4;
                }
                break;
            case 97:
                {
                alt86=5;
                }
                break;
            case 98:
                {
                alt86=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // InternalDockerCompose.g:5525:3: (enumLiteral_0= 'rprivate' )
                    {
                    // InternalDockerCompose.g:5525:3: (enumLiteral_0= 'rprivate' )
                    // InternalDockerCompose.g:5526:4: enumLiteral_0= 'rprivate'
                    {
                    enumLiteral_0=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getRprivateEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPropagationTypeAccess().getRprivateEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:5533:3: (enumLiteral_1= 'private' )
                    {
                    // InternalDockerCompose.g:5533:3: (enumLiteral_1= 'private' )
                    // InternalDockerCompose.g:5534:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPropagationTypeAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:5541:3: (enumLiteral_2= 'rshared' )
                    {
                    // InternalDockerCompose.g:5541:3: (enumLiteral_2= 'rshared' )
                    // InternalDockerCompose.g:5542:4: enumLiteral_2= 'rshared'
                    {
                    enumLiteral_2=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getRsharedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPropagationTypeAccess().getRsharedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDockerCompose.g:5549:3: (enumLiteral_3= 'shared' )
                    {
                    // InternalDockerCompose.g:5549:3: (enumLiteral_3= 'shared' )
                    // InternalDockerCompose.g:5550:4: enumLiteral_3= 'shared'
                    {
                    enumLiteral_3=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getSharedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPropagationTypeAccess().getSharedEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDockerCompose.g:5557:3: (enumLiteral_4= 'rslave' )
                    {
                    // InternalDockerCompose.g:5557:3: (enumLiteral_4= 'rslave' )
                    // InternalDockerCompose.g:5558:4: enumLiteral_4= 'rslave'
                    {
                    enumLiteral_4=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getRslaveEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPropagationTypeAccess().getRslaveEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDockerCompose.g:5565:3: (enumLiteral_5= 'slave' )
                    {
                    // InternalDockerCompose.g:5565:3: (enumLiteral_5= 'slave' )
                    // InternalDockerCompose.g:5566:4: enumLiteral_5= 'slave'
                    {
                    enumLiteral_5=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getSlaveEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPropagationTypeAccess().getSlaveEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropagationType"


    // $ANTLR start "ruleCondition"
    // InternalDockerCompose.g:5576:1: ruleCondition returns [Enumerator current=null] : ( (enumLiteral_0= 'service_started' ) | (enumLiteral_1= 'service_healthy' ) | (enumLiteral_2= 'service_completed_successfully' ) ) ;
    public final Enumerator ruleCondition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:5582:2: ( ( (enumLiteral_0= 'service_started' ) | (enumLiteral_1= 'service_healthy' ) | (enumLiteral_2= 'service_completed_successfully' ) ) )
            // InternalDockerCompose.g:5583:2: ( (enumLiteral_0= 'service_started' ) | (enumLiteral_1= 'service_healthy' ) | (enumLiteral_2= 'service_completed_successfully' ) )
            {
            // InternalDockerCompose.g:5583:2: ( (enumLiteral_0= 'service_started' ) | (enumLiteral_1= 'service_healthy' ) | (enumLiteral_2= 'service_completed_successfully' ) )
            int alt87=3;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt87=1;
                }
                break;
            case 100:
                {
                alt87=2;
                }
                break;
            case 101:
                {
                alt87=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalDockerCompose.g:5584:3: (enumLiteral_0= 'service_started' )
                    {
                    // InternalDockerCompose.g:5584:3: (enumLiteral_0= 'service_started' )
                    // InternalDockerCompose.g:5585:4: enumLiteral_0= 'service_started'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getService_startedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getConditionAccess().getService_startedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:5592:3: (enumLiteral_1= 'service_healthy' )
                    {
                    // InternalDockerCompose.g:5592:3: (enumLiteral_1= 'service_healthy' )
                    // InternalDockerCompose.g:5593:4: enumLiteral_1= 'service_healthy'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getService_healthyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getConditionAccess().getService_healthyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:5600:3: (enumLiteral_2= 'service_completed_successfully' )
                    {
                    // InternalDockerCompose.g:5600:3: (enumLiteral_2= 'service_completed_successfully' )
                    // InternalDockerCompose.g:5601:4: enumLiteral_2= 'service_completed_successfully'
                    {
                    enumLiteral_2=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getService_completed_successfullyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getConditionAccess().getService_completed_successfullyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"

    // Delegated rules


    protected DFA24 dfa24 = new DFA24(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA74 dfa74 = new DFA74(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\1\31\uffff";
    static final String dfa_3s = "\1\10\1\uffff\4\10\21\uffff\1\30\1\uffff\1\0";
    static final String dfa_4s = "\1\47\1\uffff\4\42\21\uffff\1\30\1\uffff\1\0";
    static final String dfa_5s = "\1\uffff\1\23\4\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\17\1\20\1\21\1\22\1\14\1\15\1\16\1\uffff\1\13\1\uffff";
    static final String dfa_6s = "\1\5\1\uffff\1\0\1\1\1\4\1\2\23\uffff\1\3}>";
    static final String[] dfa_7s = {
            "\1\1\10\uffff\2\1\1\2\1\3\1\4\1\5\2\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\uffff\1\17\1\20\1\21\1\22\1\23",
            "",
            "\1\1\31\uffff\1\24",
            "\1\1\31\uffff\1\25",
            "\1\1\31\uffff\1\26",
            "\1\27\31\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\31",
            "",
            "\1\uffff"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 457:6: ( ({...}? => ( ({...}? => (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleCommand ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( (lv_depends_on_24_0= ruleDependency ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'networks:' ( ( (lv_networks_26_0= ruleNetworkConnector_long ) )+ | ( (lv_networks_27_0= ruleNetworkConnector_short ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'secrets:' (otherlv_35= '-' ( (lv_secrets_36_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'environment:' ( ( (lv_environment_38_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_39_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'devices:' (otherlv_41= '-' ( (lv_devices_42_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'dns:' ( (otherlv_44= '-' ( (lv_dns_45_0= ruleDNS ) ) )+ | ( (lv_dns_46_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'ports:' (otherlv_48= '-' ( (lv_ports_49_0= rulePort ) ) )+ ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_2 = input.LA(1);

                         
                        int index24_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_2==RULE_ID) ) {s = 1;}

                        else if ( LA24_2 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 11) ) {s = 20;}

                         
                        input.seek(index24_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_3 = input.LA(1);

                         
                        int index24_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_3==RULE_ID) ) {s = 1;}

                        else if ( LA24_3 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 12) ) {s = 21;}

                         
                        input.seek(index24_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_5 = input.LA(1);

                         
                        int index24_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_5==RULE_ID) ) {s = 23;}

                        else if ( LA24_5 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10) ) {s = 24;}

                         
                        input.seek(index24_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_25 = input.LA(1);

                         
                        int index24_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index24_25);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA24_4 = input.LA(1);

                         
                        int index24_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_4==RULE_ID) ) {s = 1;}

                        else if ( LA24_4 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 13) ) {s = 22;}

                         
                        input.seek(index24_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA24_0 = input.LA(1);

                         
                        int index24_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_0==EOF||LA24_0==RULE_ID||(LA24_0>=17 && LA24_0<=18)) ) {s = 1;}

                        else if ( (LA24_0==19) ) {s = 2;}

                        else if ( (LA24_0==20) ) {s = 3;}

                        else if ( (LA24_0==21) ) {s = 4;}

                        else if ( (LA24_0==22) ) {s = 5;}

                        else if ( LA24_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 0) ) {s = 6;}

                        else if ( LA24_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 1) ) {s = 7;}

                        else if ( LA24_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 2) ) {s = 8;}

                        else if ( LA24_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 3) ) {s = 9;}

                        else if ( LA24_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 4) ) {s = 10;}

                        else if ( LA24_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 5) ) {s = 11;}

                        else if ( LA24_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 6) ) {s = 12;}

                        else if ( LA24_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 7) ) {s = 13;}

                        else if ( LA24_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8) ) {s = 14;}

                        else if ( LA24_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9) ) {s = 15;}

                        else if ( LA24_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 14) ) {s = 16;}

                        else if ( LA24_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 15) ) {s = 17;}

                        else if ( LA24_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 16) ) {s = 18;}

                        else if ( LA24_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 17) ) {s = 19;}

                         
                        input.seek(index24_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\23\uffff";
    static final String dfa_9s = "\1\uffff\1\5\5\uffff\2\5\1\uffff\1\5\3\uffff\2\5\3\uffff";
    static final String dfa_10s = "\3\10\1\7\2\uffff\1\27\4\7\1\10\4\7\1\10\2\7";
    static final String dfa_11s = "\1\10\1\52\1\10\1\42\2\uffff\3\51\1\10\1\51\1\10\2\51\1\47\1\51\1\10\2\51";
    static final String dfa_12s = "\4\uffff\1\1\1\2\15\uffff";
    static final String dfa_13s = "\23\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\5\10\uffff\6\5\1\2\1\3\11\5\1\uffff\5\5\1\uffff\1\4\1\5",
            "\1\6",
            "\1\7\1\10\31\uffff\1\5",
            "",
            "",
            "\1\2\1\11\20\uffff\1\4",
            "\1\7\1\12\10\uffff\7\5\1\11\17\5\1\uffff\1\4",
            "\1\7\1\12\10\uffff\6\5\1\13\1\11\17\5\1\uffff\1\4",
            "\1\14\1\15",
            "\1\7\1\12\10\uffff\6\5\1\13\1\16\17\5\1\uffff\1\4",
            "\1\17",
            "\1\14\1\15\17\uffff\1\11\20\uffff\1\4",
            "\1\14\1\15\16\uffff\1\20\1\11\20\uffff\1\4",
            "\1\14\1\21\10\uffff\6\5\2\uffff\11\5\1\uffff\5\5",
            "\1\7\1\12\10\uffff\6\5\1\13\1\11\17\5\1\uffff\1\4",
            "\1\22",
            "\1\14\1\15\16\uffff\1\20\1\16\20\uffff\1\4",
            "\1\14\1\15\16\uffff\1\20\1\11\20\uffff\1\4"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1477:3: (this_dotID_0= ruledotID (kw= ':' (this_EInt_2= ruleEInt | this_dotID_3= ruledotID )+ )* kw= '/' )?";
        }
    }
    static final String dfa_15s = "\14\uffff";
    static final String dfa_16s = "\1\uffff\1\4\3\uffff\3\4\1\uffff\2\4\1\uffff";
    static final String dfa_17s = "\2\10\1\uffff\1\7\1\uffff\3\7\1\10\3\7";
    static final String dfa_18s = "\1\10\1\52\1\uffff\1\42\1\uffff\3\51\1\10\1\47\2\51";
    static final String dfa_19s = "\2\uffff\1\1\1\uffff\1\2\7\uffff";
    static final String dfa_20s = "\14\uffff}>";
    static final String[] dfa_21s = {
            "\1\1",
            "\1\4\10\uffff\6\4\1\2\1\3\11\4\1\uffff\5\4\1\uffff\1\2\1\4",
            "",
            "\1\5\1\6\31\uffff\1\4",
            "",
            "\1\5\1\7\10\uffff\7\4\1\2\17\4\1\uffff\1\2",
            "\1\5\1\7\10\uffff\6\4\1\10\1\2\17\4\1\uffff\1\2",
            "\1\5\1\7\10\uffff\6\4\1\10\1\11\17\4\1\uffff\1\2",
            "\1\12",
            "\1\2\1\13\10\uffff\6\4\2\uffff\11\4\1\uffff\5\4",
            "\1\5\1\7\10\uffff\6\4\1\10\1\2\17\4\1\uffff\1\2",
            "\2\2\16\uffff\1\2\1\11\20\uffff\1\2"
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "1524:3: (this_dotID_5= ruledotID (kw= ':' (this_EInt_7= ruleEInt | this_dotID_8= ruledotID )+ )* kw= '/' )?";
        }
    }
    static final String dfa_22s = "\6\uffff";
    static final String dfa_23s = "\1\1\1\uffff\1\4\2\uffff\1\1";
    static final String dfa_24s = "\1\7\1\uffff\1\7\2\uffff\1\7";
    static final String dfa_25s = "\1\47\1\uffff\1\47\2\uffff\1\47";
    static final String dfa_26s = "\1\uffff\1\3\1\uffff\1\1\1\2\1\uffff";
    static final String dfa_27s = "\6\uffff}>";
    static final String[] dfa_28s = {
            "\1\3\1\2\10\uffff\6\1\1\uffff\12\1\1\uffff\5\1",
            "",
            "\2\4\10\uffff\7\4\1\5\11\4\1\uffff\5\4",
            "",
            "",
            "\1\4\1\2\10\uffff\6\1\2\uffff\11\1\1\uffff\5\1"
    };

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "()+ loopback of 1652:6: (this_EInt_19= ruleEInt | this_dotID_20= ruledotID )+";
        }
    }
    static final String dfa_29s = "\1\1\13\uffff";
    static final String dfa_30s = "\1\10\1\uffff\1\120\6\uffff\2\0\1\uffff";
    static final String dfa_31s = "\1\67\1\uffff\1\121\6\uffff\2\0\1\uffff";
    static final String dfa_32s = "\1\uffff\1\10\1\uffff\1\1\1\2\1\3\1\5\1\6\1\7\2\uffff\1\4";
    static final String dfa_33s = "\1\2\10\uffff\1\0\1\1\1\uffff}>";
    static final String[] dfa_34s = {
            "\1\1\10\uffff\6\1\2\uffff\7\1\1\2\7\1\10\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\uffff\1\10",
            "",
            "\1\11\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            ""
    };
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[][] dfa_34 = unpackEncodedStringArray(dfa_34s);

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_15;
            this.eof = dfa_29;
            this.min = dfa_30;
            this.max = dfa_31;
            this.accept = dfa_32;
            this.special = dfa_33;
            this.transition = dfa_34;
        }
        public String getDescription() {
            return "()+ loopback of 2222:7: ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size' otherlv_23= ':' ( (lv_size_24_0= ruleEInt ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_9 = input.LA(1);

                         
                        int index45_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 3) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1()) ) {s = 1;}

                         
                        input.seek(index45_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA45_10 = input.LA(1);

                         
                        int index45_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 3) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1()) ) {s = 1;}

                         
                        input.seek(index45_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA45_0 = input.LA(1);

                         
                        int index45_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA45_0==EOF||LA45_0==RULE_ID||(LA45_0>=17 && LA45_0<=22)||(LA45_0>=25 && LA45_0<=31)||(LA45_0>=33 && LA45_0<=39)) ) {s = 1;}

                        else if ( (LA45_0==32) ) {s = 2;}

                        else if ( LA45_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 0) ) {s = 3;}

                        else if ( LA45_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 1) ) {s = 4;}

                        else if ( LA45_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 2) ) {s = 5;}

                        else if ( LA45_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 4) ) {s = 6;}

                        else if ( LA45_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 5) ) {s = 7;}

                        else if ( LA45_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 6) ) {s = 8;}

                         
                        input.seek(index45_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_35s = "\13\uffff";
    static final String dfa_36s = "\1\1\12\uffff";
    static final String dfa_37s = "\1\10\12\uffff";
    static final String dfa_38s = "\1\106\12\uffff";
    static final String dfa_39s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_40s = "\1\0\12\uffff}>";
    static final String[] dfa_41s = {
            "\1\1\10\uffff\6\1\47\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final short[][] dfa_41 = unpackEncodedStringArray(dfa_41s);

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_35;
            this.eof = dfa_36;
            this.min = dfa_37;
            this.max = dfa_38;
            this.accept = dfa_39;
            this.special = dfa_40;
            this.transition = dfa_41;
        }
        public String getDescription() {
            return "()* loopback of 2988:7: ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_0==EOF||LA53_0==RULE_ID||(LA53_0>=17 && LA53_0<=22)) ) {s = 1;}

                        else if ( LA53_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 0) ) {s = 2;}

                        else if ( LA53_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 1) ) {s = 3;}

                        else if ( LA53_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 2) ) {s = 4;}

                        else if ( LA53_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 3) ) {s = 5;}

                        else if ( LA53_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 4) ) {s = 6;}

                        else if ( LA53_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 5) ) {s = 7;}

                        else if ( LA53_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 6) ) {s = 8;}

                        else if ( LA53_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 7) ) {s = 9;}

                        else if ( LA53_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 8) ) {s = 10;}

                         
                        input.seek(index53_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_42s = "\17\uffff";
    static final String dfa_43s = "\1\1\16\uffff";
    static final String dfa_44s = "\1\10\1\uffff\1\4\2\uffff\2\0\1\117\5\0\1\uffff\1\0";
    static final String dfa_45s = "\1\111\1\uffff\1\117\2\uffff\2\0\1\117\5\0\1\uffff\1\0";
    static final String dfa_46s = "\1\uffff\1\4\1\uffff\1\2\1\3\10\uffff\1\1\1\uffff";
    static final String dfa_47s = "\1\1\4\uffff\1\6\1\4\1\uffff\1\2\1\5\1\3\1\10\1\7\1\uffff\1\0}>";
    static final String[] dfa_48s = {
            "\1\1\10\uffff\6\1\47\uffff\1\2\10\1\1\uffff\1\3\1\4",
            "",
            "\1\11\1\13\1\12\1\uffff\1\6\1\14\1\10\1\5\103\uffff\1\7",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\16",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff"
    };

    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[][] dfa_48 = unpackEncodedStringArray(dfa_48s);

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = dfa_42;
            this.eof = dfa_43;
            this.min = dfa_44;
            this.max = dfa_45;
            this.accept = dfa_46;
            this.special = dfa_47;
            this.transition = dfa_48;
        }
        public String getDescription() {
            return "()* loopback of 4201:6: ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_14 = input.LA(1);

                         
                        int index62_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_14);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA62_0 = input.LA(1);

                         
                        int index62_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA62_0==EOF||LA62_0==RULE_ID||(LA62_0>=17 && LA62_0<=22)||(LA62_0>=63 && LA62_0<=70)) ) {s = 1;}

                        else if ( (LA62_0==62) ) {s = 2;}

                        else if ( LA62_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA62_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                         
                        input.seek(index62_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA62_8 = input.LA(1);

                         
                        int index62_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA62_10 = input.LA(1);

                         
                        int index62_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA62_6 = input.LA(1);

                         
                        int index62_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA62_9 = input.LA(1);

                         
                        int index62_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA62_5 = input.LA(1);

                         
                        int index62_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_5);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA62_12 = input.LA(1);

                         
                        int index62_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA62_11 = input.LA(1);

                         
                        int index62_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_11);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_49s = "\10\uffff";
    static final String dfa_50s = "\4\4\1\uffff\1\4\1\uffff\1\4";
    static final String dfa_51s = "\4\117\1\uffff\1\117\1\uffff\1\117";
    static final String dfa_52s = "\4\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String dfa_53s = "\10\uffff}>";
    static final String[] dfa_54s = {
            "\4\4\1\1\4\4\4\uffff\6\4\1\2\20\4\1\uffff\1\4\6\uffff\4\4\1\uffff\1\4\1\uffff\1\4\1\uffff\3\4\6\uffff\2\4\3\uffff\1\4\6\uffff\1\3\1\4",
            "\11\4\4\uffff\6\4\1\5\20\4\1\uffff\1\6\6\uffff\4\4\1\uffff\1\4\1\uffff\1\4\1\uffff\3\4\6\uffff\2\4\3\uffff\1\4\6\uffff\2\4",
            "\11\4\4\uffff\27\4\1\uffff\1\6\6\uffff\4\4\1\uffff\1\4\1\uffff\1\4\1\uffff\3\4\6\uffff\2\4\3\uffff\1\4\6\uffff\2\4",
            "\11\4\4\uffff\27\4\1\uffff\1\6\6\uffff\4\4\1\uffff\1\4\1\uffff\1\4\1\uffff\3\4\6\uffff\2\4\3\uffff\1\4\6\uffff\2\4",
            "",
            "\4\4\1\7\4\4\4\uffff\7\4\1\uffff\17\4\1\uffff\1\4\44\uffff\2\4",
            "",
            "\11\4\4\uffff\6\4\1\5\20\4\1\uffff\1\6\6\uffff\4\4\1\uffff\1\4\1\uffff\1\4\1\uffff\3\4\6\uffff\2\4\3\uffff\1\4\6\uffff\2\4"
    };

    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final char[] dfa_51 = DFA.unpackEncodedStringToUnsignedChars(dfa_50s);
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_51s);
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_52s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_53s);
    static final short[][] dfa_55 = unpackEncodedStringArray(dfa_54s);

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = dfa_49;
            this.eof = dfa_50;
            this.min = dfa_51;
            this.max = dfa_52;
            this.accept = dfa_53;
            this.special = dfa_54;
            this.transition = dfa_55;
        }
        public String getDescription() {
            return "()* loopback of 4787:4: ( ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' ) kw= '/' )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000007E0002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000007E0102L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000FBFE780002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000020000800100L,0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020400801FF0L,0x000000000000C000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000F70L,0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000FFFE780002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000FFFE780102L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000FBFE780102L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00AF000100000100L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0E05000000000100L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000450L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000800F72L,0x000000000000C000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000800F70L,0x000000000000C000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020001000180L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040001000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000180L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000182L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000001000182L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000003800000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000F00400000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00AF000100000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x000000001E000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x00000007E0000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0E05000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0xD000000000000002L,0x000000000000007FL});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0xC000000000000002L,0x000000000000007FL});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xC000000000000102L,0x000000000000007FL});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0xC000000000000F72L,0x000000000000807FL});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0xC000000000000000L,0x000000000000037FL});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x4000000000000002L,0x000000000000003CL});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x4000000000000F72L,0x000000000000803CL});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000002L,0x000000000000008CL});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000001000000002L,0x000000000000008CL});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x4000000400000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x4000000400000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x4000000000000F72L,0x0000000000008300L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003C00L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000F72L,0x000000000000BC00L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000020000800002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000800100L,0x0000000000004000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000800102L,0x0000000000004000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000020000800000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000020400801FF2L,0x000000000000C000L});

}
