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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VERSION", "RULE_ID", "RULE_PORT_DEF", "RULE_DEVICE_DEF", "RULE_QUOTED_INT", "RULE_STRING", "RULE_INT", "RULE_PERMISSION", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'version:'", "'services:'", "'volumes:'", "'configs:'", "'secrets:'", "'networks:'", "':'", "'build:'", "'image:'", "'cpu_count:'", "'command:'", "'container_name:'", "'restart:'", "'init:'", "'read_only:'", "'links:'", "'-'", "'depends_on:'", "'environment:'", "'devices:'", "'dns:'", "'ports:'", "'='", "'/'", "'@'", "'condition:'", "'ipv4_address:'", "'priority:'", "'aliases:'", "'link_local_ips:'", "'source:'", "'type:'", "'target:'", "'bind:'", "'propagation:'", "'volume:'", "'nocopy:'", "'tmpfs:'", "'size:'", "'uid:'", "'gid:'", "'mode:'", "'{'", "'}'", "'driver:'", "'attachable:'", "'enable_ipv6:'", "'internal:'", "'external:'", "'name:'", "'labels:'", "'driver_opts:'", "'ipam:'", "'file:'", "'config:'", "'options:'", "'subnet:'", "'ip_range:'", "'gateway:'", "'aux_addresses:'", "'.'", "'..'", "'true'", "'false'", "'\"no\"'", "'always'", "'on-failure'", "'unless-stopped'", "'rw'", "'ro'", "'z'", "'volume'", "'bind'", "'tmpfs'", "'npipe'", "'rprivate'", "'private'", "'rshared'", "'shared'", "'rslave'", "'slave'", "'service_started'", "'service_healthy'", "'service_completed_successfully'"
    };
    public static final int T__50=50;
    public static final int RULE_VERSION=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_PORT_DEF=6;
    public static final int RULE_INT=10;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_PERMISSION=11;
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
    public static final int T__92=92;
    public static final int RULE_DEVICE_DEF=7;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_QUOTED_INT=8;
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
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=13;
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
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
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
    // InternalDockerCompose.g:72:1: ruleDockerCompose returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleDockerCompose() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_version_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_services_4_0 = null;

        EObject lv_volumes_6_0 = null;

        EObject lv_configs_8_0 = null;

        EObject lv_secrets_10_0 = null;

        EObject lv_networks_12_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) ) )+ {...}?) ) ) )
            // InternalDockerCompose.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) ) )+ {...}?) ) )
            {
            // InternalDockerCompose.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) ) )+ {...}?) ) )
            // InternalDockerCompose.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) ) )+ {...}?) )
            {
            // InternalDockerCompose.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) ) )+ {...}?) )
            // InternalDockerCompose.g:81:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getDockerComposeAccess().getUnorderedGroup());
            			
            // InternalDockerCompose.g:84:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) ) )+ {...}?)
            // InternalDockerCompose.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) ) )+ {...}?
            {
            // InternalDockerCompose.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=7;
                int LA6_0 = input.LA(1);

                if ( LA6_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 0) ) {
                    alt6=1;
                }
                else if ( LA6_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 1) ) {
                    alt6=2;
                }
                else if ( LA6_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 2) ) {
                    alt6=3;
                }
                else if ( LA6_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 3) ) {
                    alt6=4;
                }
                else if ( LA6_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 4) ) {
                    alt6=5;
                }
                else if ( LA6_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 5) ) {
                    alt6=6;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDockerCompose.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) )
            	    // InternalDockerCompose.g:87:4: {...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalDockerCompose.g:87:107: ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) )
            	    // InternalDockerCompose.g:88:5: ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalDockerCompose.g:91:8: ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) )
            	    // InternalDockerCompose.g:91:9: {...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:91:18: (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) )
            	    // InternalDockerCompose.g:91:19: otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getDockerComposeAccess().getVersionKeyword_0_0());
            	    							
            	    // InternalDockerCompose.g:95:8: ( (lv_version_2_0= RULE_VERSION ) )
            	    // InternalDockerCompose.g:96:9: (lv_version_2_0= RULE_VERSION )
            	    {
            	    // InternalDockerCompose.g:96:9: (lv_version_2_0= RULE_VERSION )
            	    // InternalDockerCompose.g:97:10: lv_version_2_0= RULE_VERSION
            	    {
            	    lv_version_2_0=(Token)match(input,RULE_VERSION,FOLLOW_4); 

            	    										newLeafNode(lv_version_2_0, grammarAccess.getDockerComposeAccess().getVersionVERSIONTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getDockerComposeRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"version",
            	    											lv_version_2_0,
            	    											"org.xtext.example.dockercompose.DockerCompose.VERSION");
            	    									

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
            	    // InternalDockerCompose.g:119:3: ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:119:3: ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) )
            	    // InternalDockerCompose.g:120:4: {...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalDockerCompose.g:120:107: ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) )
            	    // InternalDockerCompose.g:121:5: ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalDockerCompose.g:124:8: ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) )
            	    // InternalDockerCompose.g:124:9: {...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:124:18: (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ )
            	    // InternalDockerCompose.g:124:19: otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_5); 

            	    								newLeafNode(otherlv_3, grammarAccess.getDockerComposeAccess().getServicesKeyword_1_0());
            	    							
            	    // InternalDockerCompose.g:128:8: ( (lv_services_4_0= ruleService ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==RULE_ID||LA1_0==RULE_STRING) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:129:9: (lv_services_4_0= ruleService )
            	    	    {
            	    	    // InternalDockerCompose.g:129:9: (lv_services_4_0= ruleService )
            	    	    // InternalDockerCompose.g:130:10: lv_services_4_0= ruleService
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
            	    // InternalDockerCompose.g:153:3: ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:153:3: ({...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) ) )
            	    // InternalDockerCompose.g:154:4: {...}? => ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalDockerCompose.g:154:107: ( ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) ) )
            	    // InternalDockerCompose.g:155:5: ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalDockerCompose.g:158:8: ({...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ ) )
            	    // InternalDockerCompose.g:158:9: {...}? => (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:158:18: (otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+ )
            	    // InternalDockerCompose.g:158:19: otherlv_5= 'volumes:' ( (lv_volumes_6_0= ruleVolume ) )+
            	    {
            	    otherlv_5=(Token)match(input,18,FOLLOW_5); 

            	    								newLeafNode(otherlv_5, grammarAccess.getDockerComposeAccess().getVolumesKeyword_2_0());
            	    							
            	    // InternalDockerCompose.g:162:8: ( (lv_volumes_6_0= ruleVolume ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==RULE_ID||LA2_0==RULE_STRING) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:163:9: (lv_volumes_6_0= ruleVolume )
            	    	    {
            	    	    // InternalDockerCompose.g:163:9: (lv_volumes_6_0= ruleVolume )
            	    	    // InternalDockerCompose.g:164:10: lv_volumes_6_0= ruleVolume
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
            	    // InternalDockerCompose.g:187:3: ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:187:3: ({...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) ) )
            	    // InternalDockerCompose.g:188:4: {...}? => ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalDockerCompose.g:188:107: ( ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) ) )
            	    // InternalDockerCompose.g:189:5: ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalDockerCompose.g:192:8: ({...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ ) )
            	    // InternalDockerCompose.g:192:9: {...}? => (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:192:18: (otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+ )
            	    // InternalDockerCompose.g:192:19: otherlv_7= 'configs:' ( (lv_configs_8_0= ruleConfig ) )+
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_5); 

            	    								newLeafNode(otherlv_7, grammarAccess.getDockerComposeAccess().getConfigsKeyword_3_0());
            	    							
            	    // InternalDockerCompose.g:196:8: ( (lv_configs_8_0= ruleConfig ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==RULE_ID||LA3_0==RULE_STRING) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:197:9: (lv_configs_8_0= ruleConfig )
            	    	    {
            	    	    // InternalDockerCompose.g:197:9: (lv_configs_8_0= ruleConfig )
            	    	    // InternalDockerCompose.g:198:10: lv_configs_8_0= ruleConfig
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
            	    // InternalDockerCompose.g:221:3: ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:221:3: ({...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) ) )
            	    // InternalDockerCompose.g:222:4: {...}? => ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalDockerCompose.g:222:107: ( ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) ) )
            	    // InternalDockerCompose.g:223:5: ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalDockerCompose.g:226:8: ({...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ ) )
            	    // InternalDockerCompose.g:226:9: {...}? => (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:226:18: (otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+ )
            	    // InternalDockerCompose.g:226:19: otherlv_9= 'secrets:' ( (lv_secrets_10_0= ruleSecret ) )+
            	    {
            	    otherlv_9=(Token)match(input,20,FOLLOW_5); 

            	    								newLeafNode(otherlv_9, grammarAccess.getDockerComposeAccess().getSecretsKeyword_4_0());
            	    							
            	    // InternalDockerCompose.g:230:8: ( (lv_secrets_10_0= ruleSecret ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==RULE_ID||LA4_0==RULE_STRING) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:231:9: (lv_secrets_10_0= ruleSecret )
            	    	    {
            	    	    // InternalDockerCompose.g:231:9: (lv_secrets_10_0= ruleSecret )
            	    	    // InternalDockerCompose.g:232:10: lv_secrets_10_0= ruleSecret
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
            	    // InternalDockerCompose.g:255:3: ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:255:3: ({...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) ) )
            	    // InternalDockerCompose.g:256:4: {...}? => ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalDockerCompose.g:256:107: ( ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) ) )
            	    // InternalDockerCompose.g:257:5: ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalDockerCompose.g:260:8: ({...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ ) )
            	    // InternalDockerCompose.g:260:9: {...}? => (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:260:18: (otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+ )
            	    // InternalDockerCompose.g:260:19: otherlv_11= 'networks:' ( (lv_networks_12_0= ruleNetwork ) )+
            	    {
            	    otherlv_11=(Token)match(input,21,FOLLOW_5); 

            	    								newLeafNode(otherlv_11, grammarAccess.getDockerComposeAccess().getNetworksKeyword_5_0());
            	    							
            	    // InternalDockerCompose.g:264:8: ( (lv_networks_12_0= ruleNetwork ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==RULE_ID||LA5_0==RULE_STRING) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:265:9: (lv_networks_12_0= ruleNetwork )
            	    	    {
            	    	    // InternalDockerCompose.g:265:9: (lv_networks_12_0= ruleNetwork )
            	    	    // InternalDockerCompose.g:266:10: lv_networks_12_0= ruleNetwork
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


    // $ANTLR start "entryRuleService"
    // InternalDockerCompose.g:300:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalDockerCompose.g:300:48: (iv_ruleService= ruleService EOF )
            // InternalDockerCompose.g:301:2: iv_ruleService= ruleService EOF
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
    // InternalDockerCompose.g:307:1: ruleService returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_command_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_build_5_0 = null;

        AntlrDatatypeRuleToken lv_image_7_0 = null;

        AntlrDatatypeRuleToken lv_cpu_count_9_0 = null;

        AntlrDatatypeRuleToken lv_container_name_13_0 = null;

        Enumerator lv_restart_15_0 = null;

        AntlrDatatypeRuleToken lv_init_17_0 = null;

        AntlrDatatypeRuleToken lv_read_only_19_0 = null;

        EObject lv_links_22_0 = null;

        EObject lv_depends_on_24_0 = null;

        EObject lv_depends_on_25_0 = null;

        EObject lv_networks_27_0 = null;

        EObject lv_volumes_30_0 = null;

        EObject lv_volumes_32_0 = null;

        EObject lv_configs_35_0 = null;

        EObject lv_configs_37_0 = null;

        EObject lv_secrets_40_0 = null;

        EObject lv_secrets_42_0 = null;

        EObject lv_environment_44_0 = null;

        EObject lv_environment_45_0 = null;

        EObject lv_devices_48_0 = null;

        EObject lv_dns_51_0 = null;

        EObject lv_dns_52_0 = null;

        EObject lv_ports_55_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:313:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) ) ) ) )
            // InternalDockerCompose.g:314:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalDockerCompose.g:314:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) ) ) )
            // InternalDockerCompose.g:315:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) ) )
            {
            // InternalDockerCompose.g:315:3: ()
            // InternalDockerCompose.g:316:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceAccess().getServiceAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:322:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:323:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:323:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:324:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:345:3: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) ) )
            // InternalDockerCompose.g:346:4: ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) )
            {
            // InternalDockerCompose.g:346:4: ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) )
            // InternalDockerCompose.g:347:5: ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:350:5: ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ ) ) ) ) )+ {...}?)
            // InternalDockerCompose.g:351:6: ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ ) ) ) ) )+ {...}?
            {
            // InternalDockerCompose.g:351:6: ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ ) ) ) ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=18;
                alt29 = dfa29.predict(input);
                switch (alt29) {
            	case 1 :
            	    // InternalDockerCompose.g:352:4: ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:352:4: ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) )
            	    // InternalDockerCompose.g:353:5: {...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDockerCompose.g:353:104: ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) )
            	    // InternalDockerCompose.g:354:6: ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDockerCompose.g:357:9: ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) )
            	    // InternalDockerCompose.g:357:10: {...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:357:19: ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==23) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==24) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalDockerCompose.g:357:20: (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) )
            	            {
            	            // InternalDockerCompose.g:357:20: (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) )
            	            // InternalDockerCompose.g:358:10: otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) )
            	            {
            	            otherlv_4=(Token)match(input,23,FOLLOW_9); 

            	            										newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getBuildKeyword_3_0_0_0());
            	            									
            	            // InternalDockerCompose.g:362:10: ( (lv_build_5_0= rulePATH ) )
            	            // InternalDockerCompose.g:363:11: (lv_build_5_0= rulePATH )
            	            {
            	            // InternalDockerCompose.g:363:11: (lv_build_5_0= rulePATH )
            	            // InternalDockerCompose.g:364:12: lv_build_5_0= rulePATH
            	            {

            	            												newCompositeNode(grammarAccess.getServiceAccess().getBuildPATHParserRuleCall_3_0_0_1_0());
            	            											
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
            	            break;
            	        case 2 :
            	            // InternalDockerCompose.g:383:9: (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) )
            	            {
            	            // InternalDockerCompose.g:383:9: (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) )
            	            // InternalDockerCompose.g:384:10: otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) )
            	            {
            	            otherlv_6=(Token)match(input,24,FOLLOW_11); 

            	            										newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getImageKeyword_3_0_1_0());
            	            									
            	            // InternalDockerCompose.g:388:10: ( (lv_image_7_0= ruleImage ) )
            	            // InternalDockerCompose.g:389:11: (lv_image_7_0= ruleImage )
            	            {
            	            // InternalDockerCompose.g:389:11: (lv_image_7_0= ruleImage )
            	            // InternalDockerCompose.g:390:12: lv_image_7_0= ruleImage
            	            {

            	            												newCompositeNode(grammarAccess.getServiceAccess().getImageImageParserRuleCall_3_0_1_1_0());
            	            											
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
            	            break;

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDockerCompose.g:414:4: ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:414:4: ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) )
            	    // InternalDockerCompose.g:415:5: {...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDockerCompose.g:415:104: ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) )
            	    // InternalDockerCompose.g:416:6: ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDockerCompose.g:419:9: ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) )
            	    // InternalDockerCompose.g:419:10: {...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:419:19: (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) )
            	    // InternalDockerCompose.g:419:20: otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) )
            	    {
            	    otherlv_8=(Token)match(input,25,FOLLOW_12); 

            	    									newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getCpu_countKeyword_3_1_0());
            	    								
            	    // InternalDockerCompose.g:423:9: ( (lv_cpu_count_9_0= ruleEInt ) )
            	    // InternalDockerCompose.g:424:10: (lv_cpu_count_9_0= ruleEInt )
            	    {
            	    // InternalDockerCompose.g:424:10: (lv_cpu_count_9_0= ruleEInt )
            	    // InternalDockerCompose.g:425:11: lv_cpu_count_9_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getServiceAccess().getCpu_countEIntParserRuleCall_3_1_1_0());
            	    										
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
            	case 3 :
            	    // InternalDockerCompose.g:448:4: ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:448:4: ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) ) ) ) )
            	    // InternalDockerCompose.g:449:5: {...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:449:104: ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) ) ) )
            	    // InternalDockerCompose.g:450:6: ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:453:9: ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) ) )
            	    // InternalDockerCompose.g:453:10: {...}? => (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:453:19: (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) )
            	    // InternalDockerCompose.g:453:20: otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) )
            	    {
            	    otherlv_10=(Token)match(input,26,FOLLOW_11); 

            	    									newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getCommandKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:457:9: ( (lv_command_11_0= RULE_ID ) )
            	    // InternalDockerCompose.g:458:10: (lv_command_11_0= RULE_ID )
            	    {
            	    // InternalDockerCompose.g:458:10: (lv_command_11_0= RULE_ID )
            	    // InternalDockerCompose.g:459:11: lv_command_11_0= RULE_ID
            	    {
            	    lv_command_11_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    											newLeafNode(lv_command_11_0, grammarAccess.getServiceAccess().getCommandIDTerminalRuleCall_3_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getServiceRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"command",
            	    												lv_command_11_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.ID");
            	    										

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
            	    // InternalDockerCompose.g:481:4: ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:481:4: ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:482:5: {...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalDockerCompose.g:482:104: ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:483:6: ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalDockerCompose.g:486:9: ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:486:10: {...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:486:19: (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:486:20: otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,27,FOLLOW_5); 

            	    									newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getContainer_nameKeyword_3_3_0());
            	    								
            	    // InternalDockerCompose.g:490:9: ( (lv_container_name_13_0= ruleEString ) )
            	    // InternalDockerCompose.g:491:10: (lv_container_name_13_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:491:10: (lv_container_name_13_0= ruleEString )
            	    // InternalDockerCompose.g:492:11: lv_container_name_13_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getServiceAccess().getContainer_nameEStringParserRuleCall_3_3_1_0());
            	    										
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
            	case 5 :
            	    // InternalDockerCompose.g:515:4: ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:515:4: ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) )
            	    // InternalDockerCompose.g:516:5: {...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalDockerCompose.g:516:104: ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) )
            	    // InternalDockerCompose.g:517:6: ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalDockerCompose.g:520:9: ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) )
            	    // InternalDockerCompose.g:520:10: {...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:520:19: (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) )
            	    // InternalDockerCompose.g:520:20: otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) )
            	    {
            	    otherlv_14=(Token)match(input,28,FOLLOW_13); 

            	    									newLeafNode(otherlv_14, grammarAccess.getServiceAccess().getRestartKeyword_3_4_0());
            	    								
            	    // InternalDockerCompose.g:524:9: ( (lv_restart_15_0= ruleRestartPolicy ) )
            	    // InternalDockerCompose.g:525:10: (lv_restart_15_0= ruleRestartPolicy )
            	    {
            	    // InternalDockerCompose.g:525:10: (lv_restart_15_0= ruleRestartPolicy )
            	    // InternalDockerCompose.g:526:11: lv_restart_15_0= ruleRestartPolicy
            	    {

            	    											newCompositeNode(grammarAccess.getServiceAccess().getRestartRestartPolicyEnumRuleCall_3_4_1_0());
            	    										
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
            	case 6 :
            	    // InternalDockerCompose.g:549:4: ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:549:4: ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:550:5: {...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalDockerCompose.g:550:104: ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:551:6: ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalDockerCompose.g:554:9: ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:554:10: {...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:554:19: (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:554:20: otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) )
            	    {
            	    otherlv_16=(Token)match(input,29,FOLLOW_14); 

            	    									newLeafNode(otherlv_16, grammarAccess.getServiceAccess().getInitKeyword_3_5_0());
            	    								
            	    // InternalDockerCompose.g:558:9: ( (lv_init_17_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:559:10: (lv_init_17_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:559:10: (lv_init_17_0= ruleEBoolean )
            	    // InternalDockerCompose.g:560:11: lv_init_17_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getServiceAccess().getInitEBooleanParserRuleCall_3_5_1_0());
            	    										
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
            	case 7 :
            	    // InternalDockerCompose.g:583:4: ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:583:4: ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:584:5: {...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalDockerCompose.g:584:104: ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:585:6: ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalDockerCompose.g:588:9: ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:588:10: {...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:588:19: (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:588:20: otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) )
            	    {
            	    otherlv_18=(Token)match(input,30,FOLLOW_14); 

            	    									newLeafNode(otherlv_18, grammarAccess.getServiceAccess().getRead_onlyKeyword_3_6_0());
            	    								
            	    // InternalDockerCompose.g:592:9: ( (lv_read_only_19_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:593:10: (lv_read_only_19_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:593:10: (lv_read_only_19_0= ruleEBoolean )
            	    // InternalDockerCompose.g:594:11: lv_read_only_19_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getServiceAccess().getRead_onlyEBooleanParserRuleCall_3_6_1_0());
            	    										
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
            	case 8 :
            	    // InternalDockerCompose.g:617:4: ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:617:4: ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:618:5: {...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalDockerCompose.g:618:104: ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) )
            	    // InternalDockerCompose.g:619:6: ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalDockerCompose.g:622:9: ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) )
            	    // InternalDockerCompose.g:622:10: {...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:622:19: (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ )
            	    // InternalDockerCompose.g:622:20: otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+
            	    {
            	    otherlv_20=(Token)match(input,31,FOLLOW_15); 

            	    									newLeafNode(otherlv_20, grammarAccess.getServiceAccess().getLinksKeyword_3_7_0());
            	    								
            	    // InternalDockerCompose.g:626:9: (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==32) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:627:10: otherlv_21= '-' ( (lv_links_22_0= ruleLink ) )
            	    	    {
            	    	    otherlv_21=(Token)match(input,32,FOLLOW_5); 

            	    	    										newLeafNode(otherlv_21, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_7_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:631:10: ( (lv_links_22_0= ruleLink ) )
            	    	    // InternalDockerCompose.g:632:11: (lv_links_22_0= ruleLink )
            	    	    {
            	    	    // InternalDockerCompose.g:632:11: (lv_links_22_0= ruleLink )
            	    	    // InternalDockerCompose.g:633:12: lv_links_22_0= ruleLink
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServiceAccess().getLinksLinkParserRuleCall_3_7_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_16);
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
            	    	    if ( cnt8 >= 1 ) break loop8;
            	                EarlyExitException eee =
            	                    new EarlyExitException(8, input);
            	                throw eee;
            	        }
            	        cnt8++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalDockerCompose.g:657:4: ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:657:4: ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) )
            	    // InternalDockerCompose.g:658:5: {...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalDockerCompose.g:658:104: ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) )
            	    // InternalDockerCompose.g:659:6: ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalDockerCompose.g:662:9: ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) )
            	    // InternalDockerCompose.g:662:10: {...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:662:19: (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) )
            	    // InternalDockerCompose.g:662:20: otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ )
            	    {
            	    otherlv_23=(Token)match(input,33,FOLLOW_17); 

            	    									newLeafNode(otherlv_23, grammarAccess.getServiceAccess().getDepends_onKeyword_3_8_0());
            	    								
            	    // InternalDockerCompose.g:666:9: ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==32) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==RULE_ID||LA11_0==RULE_STRING) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalDockerCompose.g:667:10: ( (lv_depends_on_24_0= ruleDependency_short ) )+
            	            {
            	            // InternalDockerCompose.g:667:10: ( (lv_depends_on_24_0= ruleDependency_short ) )+
            	            int cnt9=0;
            	            loop9:
            	            do {
            	                int alt9=2;
            	                int LA9_0 = input.LA(1);

            	                if ( (LA9_0==32) ) {
            	                    alt9=1;
            	                }


            	                switch (alt9) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:668:11: (lv_depends_on_24_0= ruleDependency_short )
            	            	    {
            	            	    // InternalDockerCompose.g:668:11: (lv_depends_on_24_0= ruleDependency_short )
            	            	    // InternalDockerCompose.g:669:12: lv_depends_on_24_0= ruleDependency_short
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getServiceAccess().getDepends_onDependency_shortParserRuleCall_3_8_1_0_0());
            	            	    											
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_depends_on_24_0=ruleDependency_short();

            	            	    state._fsp--;


            	            	    												if (current==null) {
            	            	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    												}
            	            	    												add(
            	            	    													current,
            	            	    													"depends_on",
            	            	    													lv_depends_on_24_0,
            	            	    													"org.xtext.example.dockercompose.DockerCompose.Dependency_short");
            	            	    												afterParserOrEnumRuleCall();
            	            	    											

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
            	            break;
            	        case 2 :
            	            // InternalDockerCompose.g:687:10: ( (lv_depends_on_25_0= ruleDependency_long ) )+
            	            {
            	            // InternalDockerCompose.g:687:10: ( (lv_depends_on_25_0= ruleDependency_long ) )+
            	            int cnt10=0;
            	            loop10:
            	            do {
            	                int alt10=2;
            	                int LA10_0 = input.LA(1);

            	                if ( (LA10_0==RULE_STRING) ) {
            	                    int LA10_2 = input.LA(2);

            	                    if ( (LA10_2==22) ) {
            	                        int LA10_4 = input.LA(3);

            	                        if ( (LA10_4==41) ) {
            	                            alt10=1;
            	                        }


            	                    }


            	                }
            	                else if ( (LA10_0==RULE_ID) ) {
            	                    int LA10_3 = input.LA(2);

            	                    if ( (LA10_3==22) ) {
            	                        int LA10_4 = input.LA(3);

            	                        if ( (LA10_4==41) ) {
            	                            alt10=1;
            	                        }


            	                    }


            	                }


            	                switch (alt10) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:688:11: (lv_depends_on_25_0= ruleDependency_long )
            	            	    {
            	            	    // InternalDockerCompose.g:688:11: (lv_depends_on_25_0= ruleDependency_long )
            	            	    // InternalDockerCompose.g:689:12: lv_depends_on_25_0= ruleDependency_long
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getServiceAccess().getDepends_onDependency_longParserRuleCall_3_8_1_1_0());
            	            	    											
            	            	    pushFollow(FOLLOW_18);
            	            	    lv_depends_on_25_0=ruleDependency_long();

            	            	    state._fsp--;


            	            	    												if (current==null) {
            	            	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    												}
            	            	    												add(
            	            	    													current,
            	            	    													"depends_on",
            	            	    													lv_depends_on_25_0,
            	            	    													"org.xtext.example.dockercompose.DockerCompose.Dependency_long");
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
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalDockerCompose.g:713:4: ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:713:4: ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) )
            	    // InternalDockerCompose.g:714:5: {...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // InternalDockerCompose.g:714:104: ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) )
            	    // InternalDockerCompose.g:715:6: ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9);
            	    					
            	    // InternalDockerCompose.g:718:9: ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) )
            	    // InternalDockerCompose.g:718:10: {...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:718:19: (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ )
            	    // InternalDockerCompose.g:718:20: otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+
            	    {
            	    otherlv_26=(Token)match(input,21,FOLLOW_17); 

            	    									newLeafNode(otherlv_26, grammarAccess.getServiceAccess().getNetworksKeyword_3_9_0());
            	    								
            	    // InternalDockerCompose.g:722:9: ( (lv_networks_27_0= ruleNetworkConnector ) )+
            	    int cnt12=0;
            	    loop12:
            	    do {
            	        int alt12=2;
            	        switch ( input.LA(1) ) {
            	        case RULE_STRING:
            	            {
            	            int LA12_2 = input.LA(2);

            	            if ( (LA12_2==22) ) {
            	                alt12=1;
            	            }


            	            }
            	            break;
            	        case RULE_ID:
            	            {
            	            int LA12_3 = input.LA(2);

            	            if ( (LA12_3==22) ) {
            	                alt12=1;
            	            }


            	            }
            	            break;
            	        case 32:
            	            {
            	            alt12=1;
            	            }
            	            break;

            	        }

            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:723:10: (lv_networks_27_0= ruleNetworkConnector )
            	    	    {
            	    	    // InternalDockerCompose.g:723:10: (lv_networks_27_0= ruleNetworkConnector )
            	    	    // InternalDockerCompose.g:724:11: lv_networks_27_0= ruleNetworkConnector
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getServiceAccess().getNetworksNetworkConnectorParserRuleCall_3_9_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_18);
            	    	    lv_networks_27_0=ruleNetworkConnector();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"networks",
            	    	    												lv_networks_27_0,
            	    	    												"org.xtext.example.dockercompose.DockerCompose.NetworkConnector");
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


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalDockerCompose.g:747:4: ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:747:4: ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) )
            	    // InternalDockerCompose.g:748:5: {...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // InternalDockerCompose.g:748:105: ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:749:6: ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10);
            	    					
            	    // InternalDockerCompose.g:752:9: ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) )
            	    // InternalDockerCompose.g:752:10: {...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:752:19: (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) )
            	    // InternalDockerCompose.g:752:20: otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ )
            	    {
            	    otherlv_28=(Token)match(input,18,FOLLOW_15); 

            	    									newLeafNode(otherlv_28, grammarAccess.getServiceAccess().getVolumesKeyword_3_10_0());
            	    								
            	    // InternalDockerCompose.g:756:9: ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==32) ) {
            	        int LA15_1 = input.LA(2);

            	        if ( (LA15_1==RULE_ID||LA15_1==RULE_STRING) ) {
            	            alt15=1;
            	        }
            	        else if ( (LA15_1==30||(LA15_1>=46 && LA15_1<=49)||LA15_1==51||LA15_1==53) ) {
            	            alt15=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 15, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalDockerCompose.g:757:10: (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+
            	            {
            	            // InternalDockerCompose.g:757:10: (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+
            	            int cnt13=0;
            	            loop13:
            	            do {
            	                int alt13=2;
            	                int LA13_0 = input.LA(1);

            	                if ( (LA13_0==32) ) {
            	                    alt13=1;
            	                }


            	                switch (alt13) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:758:11: otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) )
            	            	    {
            	            	    otherlv_29=(Token)match(input,32,FOLLOW_5); 

            	            	    											newLeafNode(otherlv_29, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_10_1_0_0());
            	            	    										
            	            	    // InternalDockerCompose.g:762:11: ( (lv_volumes_30_0= ruleVolumeConnector_short ) )
            	            	    // InternalDockerCompose.g:763:12: (lv_volumes_30_0= ruleVolumeConnector_short )
            	            	    {
            	            	    // InternalDockerCompose.g:763:12: (lv_volumes_30_0= ruleVolumeConnector_short )
            	            	    // InternalDockerCompose.g:764:13: lv_volumes_30_0= ruleVolumeConnector_short
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getVolumesVolumeConnector_shortParserRuleCall_3_10_1_0_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_volumes_30_0=ruleVolumeConnector_short();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"volumes",
            	            	    														lv_volumes_30_0,
            	            	    														"org.xtext.example.dockercompose.DockerCompose.VolumeConnector_short");
            	            	    													afterParserOrEnumRuleCall();
            	            	    												

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt13 >= 1 ) break loop13;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(13, input);
            	                        throw eee;
            	                }
            	                cnt13++;
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // InternalDockerCompose.g:783:10: (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+
            	            {
            	            // InternalDockerCompose.g:783:10: (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+
            	            int cnt14=0;
            	            loop14:
            	            do {
            	                int alt14=2;
            	                int LA14_0 = input.LA(1);

            	                if ( (LA14_0==32) ) {
            	                    alt14=1;
            	                }


            	                switch (alt14) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:784:11: otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) )
            	            	    {
            	            	    otherlv_31=(Token)match(input,32,FOLLOW_19); 

            	            	    											newLeafNode(otherlv_31, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_10_1_1_0());
            	            	    										
            	            	    // InternalDockerCompose.g:788:11: ( (lv_volumes_32_0= ruleVolumeConnector_long ) )
            	            	    // InternalDockerCompose.g:789:12: (lv_volumes_32_0= ruleVolumeConnector_long )
            	            	    {
            	            	    // InternalDockerCompose.g:789:12: (lv_volumes_32_0= ruleVolumeConnector_long )
            	            	    // InternalDockerCompose.g:790:13: lv_volumes_32_0= ruleVolumeConnector_long
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getVolumesVolumeConnector_longParserRuleCall_3_10_1_1_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_volumes_32_0=ruleVolumeConnector_long();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"volumes",
            	            	    														lv_volumes_32_0,
            	            	    														"org.xtext.example.dockercompose.DockerCompose.VolumeConnector_long");
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
            	    // InternalDockerCompose.g:815:4: ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:815:4: ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) )
            	    // InternalDockerCompose.g:816:5: {...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 11)");
            	    }
            	    // InternalDockerCompose.g:816:105: ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:817:6: ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 11);
            	    					
            	    // InternalDockerCompose.g:820:9: ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) )
            	    // InternalDockerCompose.g:820:10: {...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:820:19: (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) )
            	    // InternalDockerCompose.g:820:20: otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ )
            	    {
            	    otherlv_33=(Token)match(input,19,FOLLOW_15); 

            	    									newLeafNode(otherlv_33, grammarAccess.getServiceAccess().getConfigsKeyword_3_11_0());
            	    								
            	    // InternalDockerCompose.g:824:9: ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==32) ) {
            	        int LA18_1 = input.LA(2);

            	        if ( (LA18_1==RULE_ID||LA18_1==RULE_STRING) ) {
            	            alt18=1;
            	        }
            	        else if ( (LA18_1==46||LA18_1==48||(LA18_1>=55 && LA18_1<=57)) ) {
            	            alt18=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 18, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalDockerCompose.g:825:10: (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+
            	            {
            	            // InternalDockerCompose.g:825:10: (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+
            	            int cnt16=0;
            	            loop16:
            	            do {
            	                int alt16=2;
            	                int LA16_0 = input.LA(1);

            	                if ( (LA16_0==32) ) {
            	                    alt16=1;
            	                }


            	                switch (alt16) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:826:11: otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) )
            	            	    {
            	            	    otherlv_34=(Token)match(input,32,FOLLOW_5); 

            	            	    											newLeafNode(otherlv_34, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_11_1_0_0());
            	            	    										
            	            	    // InternalDockerCompose.g:830:11: ( (lv_configs_35_0= ruleConfigConnector_short ) )
            	            	    // InternalDockerCompose.g:831:12: (lv_configs_35_0= ruleConfigConnector_short )
            	            	    {
            	            	    // InternalDockerCompose.g:831:12: (lv_configs_35_0= ruleConfigConnector_short )
            	            	    // InternalDockerCompose.g:832:13: lv_configs_35_0= ruleConfigConnector_short
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getConfigsConfigConnector_shortParserRuleCall_3_11_1_0_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_configs_35_0=ruleConfigConnector_short();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"configs",
            	            	    														lv_configs_35_0,
            	            	    														"org.xtext.example.dockercompose.DockerCompose.ConfigConnector_short");
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
            	            break;
            	        case 2 :
            	            // InternalDockerCompose.g:851:10: (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+
            	            {
            	            // InternalDockerCompose.g:851:10: (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+
            	            int cnt17=0;
            	            loop17:
            	            do {
            	                int alt17=2;
            	                int LA17_0 = input.LA(1);

            	                if ( (LA17_0==32) ) {
            	                    alt17=1;
            	                }


            	                switch (alt17) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:852:11: otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) )
            	            	    {
            	            	    otherlv_36=(Token)match(input,32,FOLLOW_20); 

            	            	    											newLeafNode(otherlv_36, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_11_1_1_0());
            	            	    										
            	            	    // InternalDockerCompose.g:856:11: ( (lv_configs_37_0= ruleConfigConnector_long ) )
            	            	    // InternalDockerCompose.g:857:12: (lv_configs_37_0= ruleConfigConnector_long )
            	            	    {
            	            	    // InternalDockerCompose.g:857:12: (lv_configs_37_0= ruleConfigConnector_long )
            	            	    // InternalDockerCompose.g:858:13: lv_configs_37_0= ruleConfigConnector_long
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getConfigsConfigConnector_longParserRuleCall_3_11_1_1_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_configs_37_0=ruleConfigConnector_long();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"configs",
            	            	    														lv_configs_37_0,
            	            	    														"org.xtext.example.dockercompose.DockerCompose.ConfigConnector_long");
            	            	    													afterParserOrEnumRuleCall();
            	            	    												

            	            	    }


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

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalDockerCompose.g:883:4: ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:883:4: ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) )
            	    // InternalDockerCompose.g:884:5: {...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 12)");
            	    }
            	    // InternalDockerCompose.g:884:105: ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:885:6: ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 12);
            	    					
            	    // InternalDockerCompose.g:888:9: ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) )
            	    // InternalDockerCompose.g:888:10: {...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:888:19: (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) )
            	    // InternalDockerCompose.g:888:20: otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ )
            	    {
            	    otherlv_38=(Token)match(input,20,FOLLOW_15); 

            	    									newLeafNode(otherlv_38, grammarAccess.getServiceAccess().getSecretsKeyword_3_12_0());
            	    								
            	    // InternalDockerCompose.g:892:9: ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==32) ) {
            	        int LA21_1 = input.LA(2);

            	        if ( (LA21_1==RULE_ID||LA21_1==RULE_STRING) ) {
            	            alt21=1;
            	        }
            	        else if ( (LA21_1==46||LA21_1==48||(LA21_1>=55 && LA21_1<=57)) ) {
            	            alt21=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 21, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalDockerCompose.g:893:10: (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+
            	            {
            	            // InternalDockerCompose.g:893:10: (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+
            	            int cnt19=0;
            	            loop19:
            	            do {
            	                int alt19=2;
            	                int LA19_0 = input.LA(1);

            	                if ( (LA19_0==32) ) {
            	                    alt19=1;
            	                }


            	                switch (alt19) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:894:11: otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) )
            	            	    {
            	            	    otherlv_39=(Token)match(input,32,FOLLOW_5); 

            	            	    											newLeafNode(otherlv_39, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_12_1_0_0());
            	            	    										
            	            	    // InternalDockerCompose.g:898:11: ( (lv_secrets_40_0= ruleSecretConnector_short ) )
            	            	    // InternalDockerCompose.g:899:12: (lv_secrets_40_0= ruleSecretConnector_short )
            	            	    {
            	            	    // InternalDockerCompose.g:899:12: (lv_secrets_40_0= ruleSecretConnector_short )
            	            	    // InternalDockerCompose.g:900:13: lv_secrets_40_0= ruleSecretConnector_short
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getSecretsSecretConnector_shortParserRuleCall_3_12_1_0_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_secrets_40_0=ruleSecretConnector_short();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"secrets",
            	            	    														lv_secrets_40_0,
            	            	    														"org.xtext.example.dockercompose.DockerCompose.SecretConnector_short");
            	            	    													afterParserOrEnumRuleCall();
            	            	    												

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt19 >= 1 ) break loop19;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(19, input);
            	                        throw eee;
            	                }
            	                cnt19++;
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // InternalDockerCompose.g:919:10: (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+
            	            {
            	            // InternalDockerCompose.g:919:10: (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+
            	            int cnt20=0;
            	            loop20:
            	            do {
            	                int alt20=2;
            	                int LA20_0 = input.LA(1);

            	                if ( (LA20_0==32) ) {
            	                    alt20=1;
            	                }


            	                switch (alt20) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:920:11: otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) )
            	            	    {
            	            	    otherlv_41=(Token)match(input,32,FOLLOW_20); 

            	            	    											newLeafNode(otherlv_41, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_12_1_1_0());
            	            	    										
            	            	    // InternalDockerCompose.g:924:11: ( (lv_secrets_42_0= ruleSecretConnector_long ) )
            	            	    // InternalDockerCompose.g:925:12: (lv_secrets_42_0= ruleSecretConnector_long )
            	            	    {
            	            	    // InternalDockerCompose.g:925:12: (lv_secrets_42_0= ruleSecretConnector_long )
            	            	    // InternalDockerCompose.g:926:13: lv_secrets_42_0= ruleSecretConnector_long
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getSecretsSecretConnector_longParserRuleCall_3_12_1_1_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_secrets_42_0=ruleSecretConnector_long();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"secrets",
            	            	    														lv_secrets_42_0,
            	            	    														"org.xtext.example.dockercompose.DockerCompose.SecretConnector_long");
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
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // InternalDockerCompose.g:951:4: ({...}? => ( ({...}? => (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:951:4: ({...}? => ( ({...}? => (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) ) ) ) )
            	    // InternalDockerCompose.g:952:5: {...}? => ( ({...}? => (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 13)");
            	    }
            	    // InternalDockerCompose.g:952:105: ( ({...}? => (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) ) ) )
            	    // InternalDockerCompose.g:953:6: ({...}? => (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 13);
            	    					
            	    // InternalDockerCompose.g:956:9: ({...}? => (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) ) )
            	    // InternalDockerCompose.g:956:10: {...}? => (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:956:19: (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) )
            	    // InternalDockerCompose.g:956:20: otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ )
            	    {
            	    otherlv_43=(Token)match(input,34,FOLLOW_21); 

            	    									newLeafNode(otherlv_43, grammarAccess.getServiceAccess().getEnvironmentKeyword_3_13_0());
            	    								
            	    // InternalDockerCompose.g:960:9: ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==RULE_ID) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==32) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalDockerCompose.g:961:10: ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+
            	            {
            	            // InternalDockerCompose.g:961:10: ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+
            	            int cnt22=0;
            	            loop22:
            	            do {
            	                int alt22=2;
            	                int LA22_0 = input.LA(1);

            	                if ( (LA22_0==RULE_ID) ) {
            	                    int LA22_2 = input.LA(2);

            	                    if ( (LA22_2==22) ) {
            	                        alt22=1;
            	                    }


            	                }


            	                switch (alt22) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:962:11: (lv_environment_44_0= ruleEnvironmentVariableMap )
            	            	    {
            	            	    // InternalDockerCompose.g:962:11: (lv_environment_44_0= ruleEnvironmentVariableMap )
            	            	    // InternalDockerCompose.g:963:12: lv_environment_44_0= ruleEnvironmentVariableMap
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getServiceAccess().getEnvironmentEnvironmentVariableMapParserRuleCall_3_13_1_0_0());
            	            	    											
            	            	    pushFollow(FOLLOW_22);
            	            	    lv_environment_44_0=ruleEnvironmentVariableMap();

            	            	    state._fsp--;


            	            	    												if (current==null) {
            	            	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    												}
            	            	    												add(
            	            	    													current,
            	            	    													"environment",
            	            	    													lv_environment_44_0,
            	            	    													"org.xtext.example.dockercompose.DockerCompose.EnvironmentVariableMap");
            	            	    												afterParserOrEnumRuleCall();
            	            	    											

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt22 >= 1 ) break loop22;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(22, input);
            	                        throw eee;
            	                }
            	                cnt22++;
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // InternalDockerCompose.g:981:10: ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+
            	            {
            	            // InternalDockerCompose.g:981:10: ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+
            	            int cnt23=0;
            	            loop23:
            	            do {
            	                int alt23=2;
            	                int LA23_0 = input.LA(1);

            	                if ( (LA23_0==32) ) {
            	                    alt23=1;
            	                }


            	                switch (alt23) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:982:11: (lv_environment_45_0= ruleEnvironmentVariableList )
            	            	    {
            	            	    // InternalDockerCompose.g:982:11: (lv_environment_45_0= ruleEnvironmentVariableList )
            	            	    // InternalDockerCompose.g:983:12: lv_environment_45_0= ruleEnvironmentVariableList
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getServiceAccess().getEnvironmentEnvironmentVariableListParserRuleCall_3_13_1_1_0());
            	            	    											
            	            	    pushFollow(FOLLOW_23);
            	            	    lv_environment_45_0=ruleEnvironmentVariableList();

            	            	    state._fsp--;


            	            	    												if (current==null) {
            	            	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    												}
            	            	    												add(
            	            	    													current,
            	            	    													"environment",
            	            	    													lv_environment_45_0,
            	            	    													"org.xtext.example.dockercompose.DockerCompose.EnvironmentVariableList");
            	            	    												afterParserOrEnumRuleCall();
            	            	    											

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
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // InternalDockerCompose.g:1007:4: ({...}? => ( ({...}? => (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1007:4: ({...}? => ( ({...}? => (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:1008:5: {...}? => ( ({...}? => (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 14)");
            	    }
            	    // InternalDockerCompose.g:1008:105: ( ({...}? => (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ ) ) )
            	    // InternalDockerCompose.g:1009:6: ({...}? => (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 14);
            	    					
            	    // InternalDockerCompose.g:1012:9: ({...}? => (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ ) )
            	    // InternalDockerCompose.g:1012:10: {...}? => (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:1012:19: (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ )
            	    // InternalDockerCompose.g:1012:20: otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+
            	    {
            	    otherlv_46=(Token)match(input,35,FOLLOW_15); 

            	    									newLeafNode(otherlv_46, grammarAccess.getServiceAccess().getDevicesKeyword_3_14_0());
            	    								
            	    // InternalDockerCompose.g:1016:9: (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+
            	    int cnt25=0;
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==32) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:1017:10: otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) )
            	    	    {
            	    	    otherlv_47=(Token)match(input,32,FOLLOW_24); 

            	    	    										newLeafNode(otherlv_47, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_14_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:1021:10: ( (lv_devices_48_0= ruleDevice ) )
            	    	    // InternalDockerCompose.g:1022:11: (lv_devices_48_0= ruleDevice )
            	    	    {
            	    	    // InternalDockerCompose.g:1022:11: (lv_devices_48_0= ruleDevice )
            	    	    // InternalDockerCompose.g:1023:12: lv_devices_48_0= ruleDevice
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServiceAccess().getDevicesDeviceParserRuleCall_3_14_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_16);
            	    	    lv_devices_48_0=ruleDevice();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"devices",
            	    	    													lv_devices_48_0,
            	    	    													"org.xtext.example.dockercompose.DockerCompose.Device");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt25 >= 1 ) break loop25;
            	                EarlyExitException eee =
            	                    new EarlyExitException(25, input);
            	                throw eee;
            	        }
            	        cnt25++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 16 :
            	    // InternalDockerCompose.g:1047:4: ({...}? => ( ({...}? => (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1047:4: ({...}? => ( ({...}? => (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) ) ) ) )
            	    // InternalDockerCompose.g:1048:5: {...}? => ( ({...}? => (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 15)");
            	    }
            	    // InternalDockerCompose.g:1048:105: ( ({...}? => (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) ) ) )
            	    // InternalDockerCompose.g:1049:6: ({...}? => (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 15);
            	    					
            	    // InternalDockerCompose.g:1052:9: ({...}? => (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) ) )
            	    // InternalDockerCompose.g:1052:10: {...}? => (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:1052:19: (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) )
            	    // InternalDockerCompose.g:1052:20: otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) )
            	    {
            	    otherlv_49=(Token)match(input,36,FOLLOW_25); 

            	    									newLeafNode(otherlv_49, grammarAccess.getServiceAccess().getDnsKeyword_3_15_0());
            	    								
            	    // InternalDockerCompose.g:1056:9: ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==32) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==RULE_INT) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalDockerCompose.g:1057:10: (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+
            	            {
            	            // InternalDockerCompose.g:1057:10: (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+
            	            int cnt26=0;
            	            loop26:
            	            do {
            	                int alt26=2;
            	                int LA26_0 = input.LA(1);

            	                if ( (LA26_0==32) ) {
            	                    alt26=1;
            	                }


            	                switch (alt26) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:1058:11: otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) )
            	            	    {
            	            	    otherlv_50=(Token)match(input,32,FOLLOW_25); 

            	            	    											newLeafNode(otherlv_50, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_15_1_0_0());
            	            	    										
            	            	    // InternalDockerCompose.g:1062:11: ( (lv_dns_51_0= ruleDNS ) )
            	            	    // InternalDockerCompose.g:1063:12: (lv_dns_51_0= ruleDNS )
            	            	    {
            	            	    // InternalDockerCompose.g:1063:12: (lv_dns_51_0= ruleDNS )
            	            	    // InternalDockerCompose.g:1064:13: lv_dns_51_0= ruleDNS
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getDnsDNSParserRuleCall_3_15_1_0_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_dns_51_0=ruleDNS();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"dns",
            	            	    														lv_dns_51_0,
            	            	    														"org.xtext.example.dockercompose.DockerCompose.DNS");
            	            	    													afterParserOrEnumRuleCall();
            	            	    												

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt26 >= 1 ) break loop26;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(26, input);
            	                        throw eee;
            	                }
            	                cnt26++;
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // InternalDockerCompose.g:1083:10: ( (lv_dns_52_0= ruleDNS ) )
            	            {
            	            // InternalDockerCompose.g:1083:10: ( (lv_dns_52_0= ruleDNS ) )
            	            // InternalDockerCompose.g:1084:11: (lv_dns_52_0= ruleDNS )
            	            {
            	            // InternalDockerCompose.g:1084:11: (lv_dns_52_0= ruleDNS )
            	            // InternalDockerCompose.g:1085:12: lv_dns_52_0= ruleDNS
            	            {

            	            												newCompositeNode(grammarAccess.getServiceAccess().getDnsDNSParserRuleCall_3_15_1_1_0());
            	            											
            	            pushFollow(FOLLOW_10);
            	            lv_dns_52_0=ruleDNS();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getServiceRule());
            	            												}
            	            												add(
            	            													current,
            	            													"dns",
            	            													lv_dns_52_0,
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
            	case 17 :
            	    // InternalDockerCompose.g:1109:4: ({...}? => ( ({...}? => (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1109:4: ({...}? => ( ({...}? => (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:1110:5: {...}? => ( ({...}? => (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 16) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 16)");
            	    }
            	    // InternalDockerCompose.g:1110:105: ( ({...}? => (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ ) ) )
            	    // InternalDockerCompose.g:1111:6: ({...}? => (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 16);
            	    					
            	    // InternalDockerCompose.g:1114:9: ({...}? => (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ ) )
            	    // InternalDockerCompose.g:1114:10: {...}? => (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:1114:19: (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ )
            	    // InternalDockerCompose.g:1114:20: otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+
            	    {
            	    otherlv_53=(Token)match(input,37,FOLLOW_15); 

            	    									newLeafNode(otherlv_53, grammarAccess.getServiceAccess().getPortsKeyword_3_16_0());
            	    								
            	    // InternalDockerCompose.g:1118:9: (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+
            	    int cnt28=0;
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==32) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:1119:10: otherlv_54= '-' ( (lv_ports_55_0= rulePort ) )
            	    	    {
            	    	    otherlv_54=(Token)match(input,32,FOLLOW_26); 

            	    	    										newLeafNode(otherlv_54, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_16_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:1123:10: ( (lv_ports_55_0= rulePort ) )
            	    	    // InternalDockerCompose.g:1124:11: (lv_ports_55_0= rulePort )
            	    	    {
            	    	    // InternalDockerCompose.g:1124:11: (lv_ports_55_0= rulePort )
            	    	    // InternalDockerCompose.g:1125:12: lv_ports_55_0= rulePort
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServiceAccess().getPortsPortParserRuleCall_3_16_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_16);
            	    	    lv_ports_55_0=rulePort();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"ports",
            	    	    													lv_ports_55_0,
            	    	    													"org.xtext.example.dockercompose.DockerCompose.Port");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


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


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getServiceAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canLeave(grammarAccess.getServiceAccess().getUnorderedGroup_3())");
            }

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
    // InternalDockerCompose.g:1161:1: entryRuleEnvironmentVariableMap returns [EObject current=null] : iv_ruleEnvironmentVariableMap= ruleEnvironmentVariableMap EOF ;
    public final EObject entryRuleEnvironmentVariableMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentVariableMap = null;


        try {
            // InternalDockerCompose.g:1161:63: (iv_ruleEnvironmentVariableMap= ruleEnvironmentVariableMap EOF )
            // InternalDockerCompose.g:1162:2: iv_ruleEnvironmentVariableMap= ruleEnvironmentVariableMap EOF
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
    // InternalDockerCompose.g:1168:1: ruleEnvironmentVariableMap returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )? ) ;
    public final EObject ruleEnvironmentVariableMap() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1174:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )? ) )
            // InternalDockerCompose.g:1175:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )? )
            {
            // InternalDockerCompose.g:1175:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )? )
            // InternalDockerCompose.g:1176:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )?
            {
            // InternalDockerCompose.g:1176:3: ()
            // InternalDockerCompose.g:1177:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentVariableMapAccess().getEnvironmentVariableAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1183:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDockerCompose.g:1184:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDockerCompose.g:1184:4: (lv_name_1_0= RULE_ID )
            // InternalDockerCompose.g:1185:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,22,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvironmentVariableMapAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:1205:3: ( (lv_value_3_0= ruleEString ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==EOF||LA30_1==RULE_ID||LA30_1==RULE_STRING||(LA30_1>=16 && LA30_1<=21)||(LA30_1>=23 && LA30_1<=31)||(LA30_1>=33 && LA30_1<=37)) ) {
                    alt30=1;
                }
            }
            else if ( (LA30_0==RULE_ID) ) {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==EOF||LA30_2==RULE_ID||LA30_2==RULE_STRING||(LA30_2>=16 && LA30_2<=21)||(LA30_2>=23 && LA30_2<=31)||(LA30_2>=33 && LA30_2<=37)) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalDockerCompose.g:1206:4: (lv_value_3_0= ruleEString )
                    {
                    // InternalDockerCompose.g:1206:4: (lv_value_3_0= ruleEString )
                    // InternalDockerCompose.g:1207:5: lv_value_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getEnvironmentVariableMapAccess().getValueEStringParserRuleCall_3_0());
                    				
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
    // InternalDockerCompose.g:1228:1: entryRuleEnvironmentVariableList returns [EObject current=null] : iv_ruleEnvironmentVariableList= ruleEnvironmentVariableList EOF ;
    public final EObject entryRuleEnvironmentVariableList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentVariableList = null;


        try {
            // InternalDockerCompose.g:1228:64: (iv_ruleEnvironmentVariableList= ruleEnvironmentVariableList EOF )
            // InternalDockerCompose.g:1229:2: iv_ruleEnvironmentVariableList= ruleEnvironmentVariableList EOF
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
    // InternalDockerCompose.g:1235:1: ruleEnvironmentVariableList returns [EObject current=null] : ( () otherlv_1= '-' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleEnvironmentVariableList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1241:2: ( ( () otherlv_1= '-' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleEString ) ) )? ) )
            // InternalDockerCompose.g:1242:2: ( () otherlv_1= '-' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleEString ) ) )? )
            {
            // InternalDockerCompose.g:1242:2: ( () otherlv_1= '-' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleEString ) ) )? )
            // InternalDockerCompose.g:1243:3: () otherlv_1= '-' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleEString ) ) )?
            {
            // InternalDockerCompose.g:1243:3: ()
            // InternalDockerCompose.g:1244:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentVariableListAccess().getEnvironmentVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentVariableListAccess().getHyphenMinusKeyword_1());
            		
            // InternalDockerCompose.g:1254:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDockerCompose.g:1255:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDockerCompose.g:1255:4: (lv_name_2_0= RULE_ID )
            // InternalDockerCompose.g:1256:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_28); 

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

            // InternalDockerCompose.g:1272:3: (otherlv_3= '=' ( (lv_value_4_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDockerCompose.g:1273:4: otherlv_3= '=' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnvironmentVariableListAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalDockerCompose.g:1277:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalDockerCompose.g:1278:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalDockerCompose.g:1278:5: (lv_value_4_0= ruleEString )
                    // InternalDockerCompose.g:1279:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentVariableListAccess().getValueEStringParserRuleCall_3_1_0());
                    					
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
    // InternalDockerCompose.g:1301:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalDockerCompose.g:1301:45: (iv_rulePort= rulePort EOF )
            // InternalDockerCompose.g:1302:2: iv_rulePort= rulePort EOF
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
    // InternalDockerCompose.g:1308:1: rulePort returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_PORT_DEF ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:1314:2: ( ( () ( (lv_value_1_0= RULE_PORT_DEF ) ) ) )
            // InternalDockerCompose.g:1315:2: ( () ( (lv_value_1_0= RULE_PORT_DEF ) ) )
            {
            // InternalDockerCompose.g:1315:2: ( () ( (lv_value_1_0= RULE_PORT_DEF ) ) )
            // InternalDockerCompose.g:1316:3: () ( (lv_value_1_0= RULE_PORT_DEF ) )
            {
            // InternalDockerCompose.g:1316:3: ()
            // InternalDockerCompose.g:1317:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPortAccess().getPortAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1323:3: ( (lv_value_1_0= RULE_PORT_DEF ) )
            // InternalDockerCompose.g:1324:4: (lv_value_1_0= RULE_PORT_DEF )
            {
            // InternalDockerCompose.g:1324:4: (lv_value_1_0= RULE_PORT_DEF )
            // InternalDockerCompose.g:1325:5: lv_value_1_0= RULE_PORT_DEF
            {
            lv_value_1_0=(Token)match(input,RULE_PORT_DEF,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getPortAccess().getValuePORT_DEFTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.PORT_DEF");
            				

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
    // InternalDockerCompose.g:1345:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalDockerCompose.g:1345:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalDockerCompose.g:1346:2: iv_ruleDevice= ruleDevice EOF
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
    // InternalDockerCompose.g:1352:1: ruleDevice returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_DEVICE_DEF ) ) ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:1358:2: ( ( () ( (lv_value_1_0= RULE_DEVICE_DEF ) ) ) )
            // InternalDockerCompose.g:1359:2: ( () ( (lv_value_1_0= RULE_DEVICE_DEF ) ) )
            {
            // InternalDockerCompose.g:1359:2: ( () ( (lv_value_1_0= RULE_DEVICE_DEF ) ) )
            // InternalDockerCompose.g:1360:3: () ( (lv_value_1_0= RULE_DEVICE_DEF ) )
            {
            // InternalDockerCompose.g:1360:3: ()
            // InternalDockerCompose.g:1361:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeviceAccess().getDeviceAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1367:3: ( (lv_value_1_0= RULE_DEVICE_DEF ) )
            // InternalDockerCompose.g:1368:4: (lv_value_1_0= RULE_DEVICE_DEF )
            {
            // InternalDockerCompose.g:1368:4: (lv_value_1_0= RULE_DEVICE_DEF )
            // InternalDockerCompose.g:1369:5: lv_value_1_0= RULE_DEVICE_DEF
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
    // InternalDockerCompose.g:1389:1: entryRuleImage returns [String current=null] : iv_ruleImage= ruleImage EOF ;
    public final String entryRuleImage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImage = null;


        try {
            // InternalDockerCompose.g:1389:45: (iv_ruleImage= ruleImage EOF )
            // InternalDockerCompose.g:1390:2: iv_ruleImage= ruleImage EOF
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
    // InternalDockerCompose.g:1396:1: ruleImage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* kw= '/' )? (this_ID_4= RULE_ID (kw= ':' this_ID_6= RULE_ID )* kw= '/' )? this_ID_8= RULE_ID ( (kw= ':' this_ID_10= RULE_ID ) | (kw= '@' this_ID_12= RULE_ID (kw= ':' this_ID_14= RULE_ID )* ) )? ) ;
    public final AntlrDatatypeRuleToken ruleImage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        Token this_ID_6=null;
        Token this_ID_8=null;
        Token this_ID_10=null;
        Token this_ID_12=null;
        Token this_ID_14=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:1402:2: ( ( (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* kw= '/' )? (this_ID_4= RULE_ID (kw= ':' this_ID_6= RULE_ID )* kw= '/' )? this_ID_8= RULE_ID ( (kw= ':' this_ID_10= RULE_ID ) | (kw= '@' this_ID_12= RULE_ID (kw= ':' this_ID_14= RULE_ID )* ) )? ) )
            // InternalDockerCompose.g:1403:2: ( (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* kw= '/' )? (this_ID_4= RULE_ID (kw= ':' this_ID_6= RULE_ID )* kw= '/' )? this_ID_8= RULE_ID ( (kw= ':' this_ID_10= RULE_ID ) | (kw= '@' this_ID_12= RULE_ID (kw= ':' this_ID_14= RULE_ID )* ) )? )
            {
            // InternalDockerCompose.g:1403:2: ( (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* kw= '/' )? (this_ID_4= RULE_ID (kw= ':' this_ID_6= RULE_ID )* kw= '/' )? this_ID_8= RULE_ID ( (kw= ':' this_ID_10= RULE_ID ) | (kw= '@' this_ID_12= RULE_ID (kw= ':' this_ID_14= RULE_ID )* ) )? )
            // InternalDockerCompose.g:1404:3: (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* kw= '/' )? (this_ID_4= RULE_ID (kw= ':' this_ID_6= RULE_ID )* kw= '/' )? this_ID_8= RULE_ID ( (kw= ':' this_ID_10= RULE_ID ) | (kw= '@' this_ID_12= RULE_ID (kw= ':' this_ID_14= RULE_ID )* ) )?
            {
            // InternalDockerCompose.g:1404:3: (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* kw= '/' )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalDockerCompose.g:1405:4: this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* kw= '/'
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_29); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getImageAccess().getIDTerminalRuleCall_0_0());
                    			
                    // InternalDockerCompose.g:1412:4: (kw= ':' this_ID_2= RULE_ID )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==22) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalDockerCompose.g:1413:5: kw= ':' this_ID_2= RULE_ID
                    	    {
                    	    kw=(Token)match(input,22,FOLLOW_11); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getImageAccess().getColonKeyword_0_1_0());
                    	    				
                    	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_29); 

                    	    					current.merge(this_ID_2);
                    	    				

                    	    					newLeafNode(this_ID_2, grammarAccess.getImageAccess().getIDTerminalRuleCall_0_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    kw=(Token)match(input,39,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getImageAccess().getSolidusKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalDockerCompose.g:1432:3: (this_ID_4= RULE_ID (kw= ':' this_ID_6= RULE_ID )* kw= '/' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==22) ) {
                    int LA35_2 = input.LA(3);

                    if ( (LA35_2==RULE_ID) ) {
                        int LA35_5 = input.LA(4);

                        if ( (LA35_5==22||LA35_5==39) ) {
                            alt35=1;
                        }
                    }
                }
                else if ( (LA35_1==39) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // InternalDockerCompose.g:1433:4: this_ID_4= RULE_ID (kw= ':' this_ID_6= RULE_ID )* kw= '/'
                    {
                    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_29); 

                    				current.merge(this_ID_4);
                    			

                    				newLeafNode(this_ID_4, grammarAccess.getImageAccess().getIDTerminalRuleCall_1_0());
                    			
                    // InternalDockerCompose.g:1440:4: (kw= ':' this_ID_6= RULE_ID )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==22) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalDockerCompose.g:1441:5: kw= ':' this_ID_6= RULE_ID
                    	    {
                    	    kw=(Token)match(input,22,FOLLOW_11); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getImageAccess().getColonKeyword_1_1_0());
                    	    				
                    	    this_ID_6=(Token)match(input,RULE_ID,FOLLOW_29); 

                    	    					current.merge(this_ID_6);
                    	    				

                    	    					newLeafNode(this_ID_6, grammarAccess.getImageAccess().getIDTerminalRuleCall_1_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    kw=(Token)match(input,39,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getImageAccess().getSolidusKeyword_1_2());
                    			

                    }
                    break;

            }

            this_ID_8=(Token)match(input,RULE_ID,FOLLOW_30); 

            			current.merge(this_ID_8);
            		

            			newLeafNode(this_ID_8, grammarAccess.getImageAccess().getIDTerminalRuleCall_2());
            		
            // InternalDockerCompose.g:1467:3: ( (kw= ':' this_ID_10= RULE_ID ) | (kw= '@' this_ID_12= RULE_ID (kw= ':' this_ID_14= RULE_ID )* ) )?
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==22) ) {
                alt37=1;
            }
            else if ( (LA37_0==40) ) {
                alt37=2;
            }
            switch (alt37) {
                case 1 :
                    // InternalDockerCompose.g:1468:4: (kw= ':' this_ID_10= RULE_ID )
                    {
                    // InternalDockerCompose.g:1468:4: (kw= ':' this_ID_10= RULE_ID )
                    // InternalDockerCompose.g:1469:5: kw= ':' this_ID_10= RULE_ID
                    {
                    kw=(Token)match(input,22,FOLLOW_11); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getImageAccess().getColonKeyword_3_0_0());
                    				
                    this_ID_10=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					current.merge(this_ID_10);
                    				

                    					newLeafNode(this_ID_10, grammarAccess.getImageAccess().getIDTerminalRuleCall_3_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:1483:4: (kw= '@' this_ID_12= RULE_ID (kw= ':' this_ID_14= RULE_ID )* )
                    {
                    // InternalDockerCompose.g:1483:4: (kw= '@' this_ID_12= RULE_ID (kw= ':' this_ID_14= RULE_ID )* )
                    // InternalDockerCompose.g:1484:5: kw= '@' this_ID_12= RULE_ID (kw= ':' this_ID_14= RULE_ID )*
                    {
                    kw=(Token)match(input,40,FOLLOW_11); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getImageAccess().getCommercialAtKeyword_3_1_0());
                    				
                    this_ID_12=(Token)match(input,RULE_ID,FOLLOW_31); 

                    					current.merge(this_ID_12);
                    				

                    					newLeafNode(this_ID_12, grammarAccess.getImageAccess().getIDTerminalRuleCall_3_1_1());
                    				
                    // InternalDockerCompose.g:1496:5: (kw= ':' this_ID_14= RULE_ID )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==22) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalDockerCompose.g:1497:6: kw= ':' this_ID_14= RULE_ID
                    	    {
                    	    kw=(Token)match(input,22,FOLLOW_11); 

                    	    						current.merge(kw);
                    	    						newLeafNode(kw, grammarAccess.getImageAccess().getColonKeyword_3_1_2_0());
                    	    					
                    	    this_ID_14=(Token)match(input,RULE_ID,FOLLOW_31); 

                    	    						current.merge(this_ID_14);
                    	    					

                    	    						newLeafNode(this_ID_14, grammarAccess.getImageAccess().getIDTerminalRuleCall_3_1_2_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
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
    // InternalDockerCompose.g:1516:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalDockerCompose.g:1516:45: (iv_ruleLink= ruleLink EOF )
            // InternalDockerCompose.g:1517:2: iv_ruleLink= ruleLink EOF
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
    // InternalDockerCompose.g:1523:1: ruleLink returns [EObject current=null] : ( () ( ( ruleEString ) ) (otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_alias_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1529:2: ( ( () ( ( ruleEString ) ) (otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) ) )? ) )
            // InternalDockerCompose.g:1530:2: ( () ( ( ruleEString ) ) (otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) ) )? )
            {
            // InternalDockerCompose.g:1530:2: ( () ( ( ruleEString ) ) (otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) ) )? )
            // InternalDockerCompose.g:1531:3: () ( ( ruleEString ) ) (otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) ) )?
            {
            // InternalDockerCompose.g:1531:3: ()
            // InternalDockerCompose.g:1532:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkAccess().getLinkAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1538:3: ( ( ruleEString ) )
            // InternalDockerCompose.g:1539:4: ( ruleEString )
            {
            // InternalDockerCompose.g:1539:4: ( ruleEString )
            // InternalDockerCompose.g:1540:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkAccess().getServiceServiceCrossReference_1_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDockerCompose.g:1554:3: (otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==22) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDockerCompose.g:1555:4: otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getColonKeyword_2_0());
                    			
                    // InternalDockerCompose.g:1559:4: ( (lv_alias_3_0= ruleEString ) )
                    // InternalDockerCompose.g:1560:5: (lv_alias_3_0= ruleEString )
                    {
                    // InternalDockerCompose.g:1560:5: (lv_alias_3_0= ruleEString )
                    // InternalDockerCompose.g:1561:6: lv_alias_3_0= ruleEString
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


    // $ANTLR start "entryRuleDependency_short"
    // InternalDockerCompose.g:1583:1: entryRuleDependency_short returns [EObject current=null] : iv_ruleDependency_short= ruleDependency_short EOF ;
    public final EObject entryRuleDependency_short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency_short = null;


        try {
            // InternalDockerCompose.g:1583:57: (iv_ruleDependency_short= ruleDependency_short EOF )
            // InternalDockerCompose.g:1584:2: iv_ruleDependency_short= ruleDependency_short EOF
            {
             newCompositeNode(grammarAccess.getDependency_shortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependency_short=ruleDependency_short();

            state._fsp--;

             current =iv_ruleDependency_short; 
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
    // $ANTLR end "entryRuleDependency_short"


    // $ANTLR start "ruleDependency_short"
    // InternalDockerCompose.g:1590:1: ruleDependency_short returns [EObject current=null] : ( () otherlv_1= '-' ( ( ruleEString ) ) ) ;
    public final EObject ruleDependency_short() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:1596:2: ( ( () otherlv_1= '-' ( ( ruleEString ) ) ) )
            // InternalDockerCompose.g:1597:2: ( () otherlv_1= '-' ( ( ruleEString ) ) )
            {
            // InternalDockerCompose.g:1597:2: ( () otherlv_1= '-' ( ( ruleEString ) ) )
            // InternalDockerCompose.g:1598:3: () otherlv_1= '-' ( ( ruleEString ) )
            {
            // InternalDockerCompose.g:1598:3: ()
            // InternalDockerCompose.g:1599:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDependency_shortAccess().getDependencyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDependency_shortAccess().getHyphenMinusKeyword_1());
            		
            // InternalDockerCompose.g:1609:3: ( ( ruleEString ) )
            // InternalDockerCompose.g:1610:4: ( ruleEString )
            {
            // InternalDockerCompose.g:1610:4: ( ruleEString )
            // InternalDockerCompose.g:1611:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependency_shortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDependency_shortAccess().getServiceServiceCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleDependency_short"


    // $ANTLR start "entryRuleDependency_long"
    // InternalDockerCompose.g:1629:1: entryRuleDependency_long returns [EObject current=null] : iv_ruleDependency_long= ruleDependency_long EOF ;
    public final EObject entryRuleDependency_long() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency_long = null;


        try {
            // InternalDockerCompose.g:1629:56: (iv_ruleDependency_long= ruleDependency_long EOF )
            // InternalDockerCompose.g:1630:2: iv_ruleDependency_long= ruleDependency_long EOF
            {
             newCompositeNode(grammarAccess.getDependency_longRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependency_long=ruleDependency_long();

            state._fsp--;

             current =iv_ruleDependency_long; 
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
    // $ANTLR end "entryRuleDependency_long"


    // $ANTLR start "ruleDependency_long"
    // InternalDockerCompose.g:1636:1: ruleDependency_long returns [EObject current=null] : ( () ( ( ruleEString ) ) otherlv_2= ':' otherlv_3= 'condition:' ( (lv_condition_4_0= ruleCondition ) ) ) ;
    public final EObject ruleDependency_long() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_condition_4_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1642:2: ( ( () ( ( ruleEString ) ) otherlv_2= ':' otherlv_3= 'condition:' ( (lv_condition_4_0= ruleCondition ) ) ) )
            // InternalDockerCompose.g:1643:2: ( () ( ( ruleEString ) ) otherlv_2= ':' otherlv_3= 'condition:' ( (lv_condition_4_0= ruleCondition ) ) )
            {
            // InternalDockerCompose.g:1643:2: ( () ( ( ruleEString ) ) otherlv_2= ':' otherlv_3= 'condition:' ( (lv_condition_4_0= ruleCondition ) ) )
            // InternalDockerCompose.g:1644:3: () ( ( ruleEString ) ) otherlv_2= ':' otherlv_3= 'condition:' ( (lv_condition_4_0= ruleCondition ) )
            {
            // InternalDockerCompose.g:1644:3: ()
            // InternalDockerCompose.g:1645:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDependency_longAccess().getDependencyAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1651:3: ( ( ruleEString ) )
            // InternalDockerCompose.g:1652:4: ( ruleEString )
            {
            // InternalDockerCompose.g:1652:4: ( ruleEString )
            // InternalDockerCompose.g:1653:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependency_longRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDependency_longAccess().getServiceServiceCrossReference_1_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getDependency_longAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getDependency_longAccess().getConditionKeyword_3());
            		
            // InternalDockerCompose.g:1675:3: ( (lv_condition_4_0= ruleCondition ) )
            // InternalDockerCompose.g:1676:4: (lv_condition_4_0= ruleCondition )
            {
            // InternalDockerCompose.g:1676:4: (lv_condition_4_0= ruleCondition )
            // InternalDockerCompose.g:1677:5: lv_condition_4_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getDependency_longAccess().getConditionConditionEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_4_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDependency_longRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_4_0,
            						"org.xtext.example.dockercompose.DockerCompose.Condition");
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
    // $ANTLR end "ruleDependency_long"


    // $ANTLR start "entryRuleNetworkConnector"
    // InternalDockerCompose.g:1698:1: entryRuleNetworkConnector returns [EObject current=null] : iv_ruleNetworkConnector= ruleNetworkConnector EOF ;
    public final EObject entryRuleNetworkConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConnector = null;


        try {
            // InternalDockerCompose.g:1698:57: (iv_ruleNetworkConnector= ruleNetworkConnector EOF )
            // InternalDockerCompose.g:1699:2: iv_ruleNetworkConnector= ruleNetworkConnector EOF
            {
             newCompositeNode(grammarAccess.getNetworkConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkConnector=ruleNetworkConnector();

            state._fsp--;

             current =iv_ruleNetworkConnector; 
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
    // $ANTLR end "entryRuleNetworkConnector"


    // $ANTLR start "ruleNetworkConnector"
    // InternalDockerCompose.g:1705:1: ruleNetworkConnector returns [EObject current=null] : ( () ( (otherlv_1= '-' ( ( ruleEString ) ) ) | ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) ) ) ) ;
    public final EObject ruleNetworkConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_ipv4_address_7_0 = null;

        AntlrDatatypeRuleToken lv_priority_9_0 = null;

        EObject lv_aliases_12_0 = null;

        EObject lv_link_local_ips_15_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1711:2: ( ( () ( (otherlv_1= '-' ( ( ruleEString ) ) ) | ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) ) ) ) )
            // InternalDockerCompose.g:1712:2: ( () ( (otherlv_1= '-' ( ( ruleEString ) ) ) | ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) ) ) )
            {
            // InternalDockerCompose.g:1712:2: ( () ( (otherlv_1= '-' ( ( ruleEString ) ) ) | ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) ) ) )
            // InternalDockerCompose.g:1713:3: () ( (otherlv_1= '-' ( ( ruleEString ) ) ) | ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) ) )
            {
            // InternalDockerCompose.g:1713:3: ()
            // InternalDockerCompose.g:1714:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkConnectorAccess().getNetworkConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1720:3: ( (otherlv_1= '-' ( ( ruleEString ) ) ) | ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==32) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_ID||LA42_0==RULE_STRING) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalDockerCompose.g:1721:4: (otherlv_1= '-' ( ( ruleEString ) ) )
                    {
                    // InternalDockerCompose.g:1721:4: (otherlv_1= '-' ( ( ruleEString ) ) )
                    // InternalDockerCompose.g:1722:5: otherlv_1= '-' ( ( ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_5); 

                    					newLeafNode(otherlv_1, grammarAccess.getNetworkConnectorAccess().getHyphenMinusKeyword_1_0_0());
                    				
                    // InternalDockerCompose.g:1726:5: ( ( ruleEString ) )
                    // InternalDockerCompose.g:1727:6: ( ruleEString )
                    {
                    // InternalDockerCompose.g:1727:6: ( ruleEString )
                    // InternalDockerCompose.g:1728:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNetworkConnectorRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNetworkConnectorAccess().getNetworkNetworkCrossReference_1_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:1744:4: ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) )
                    {
                    // InternalDockerCompose.g:1744:4: ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) )
                    // InternalDockerCompose.g:1745:5: ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) )
                    {
                    // InternalDockerCompose.g:1745:5: ( ( ruleEString ) )
                    // InternalDockerCompose.g:1746:6: ( ruleEString )
                    {
                    // InternalDockerCompose.g:1746:6: ( ruleEString )
                    // InternalDockerCompose.g:1747:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNetworkConnectorRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNetworkConnectorAccess().getNetworkNetworkCrossReference_1_1_0_0());
                    						
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,22,FOLLOW_34); 

                    					newLeafNode(otherlv_4, grammarAccess.getNetworkConnectorAccess().getColonKeyword_1_1_1());
                    				
                    // InternalDockerCompose.g:1765:5: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) )
                    // InternalDockerCompose.g:1766:6: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) )
                    {
                    // InternalDockerCompose.g:1766:6: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) )
                    // InternalDockerCompose.g:1767:7: ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* )
                    {
                     
                    						  getUnorderedGroupHelper().enter(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2());
                    						
                    // InternalDockerCompose.g:1770:7: ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* )
                    // InternalDockerCompose.g:1771:8: ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )*
                    {
                    // InternalDockerCompose.g:1771:8: ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )*
                    loop41:
                    do {
                        int alt41=5;
                        int LA41_0 = input.LA(1);

                        if ( LA41_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 0) ) {
                            alt41=1;
                        }
                        else if ( LA41_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 1) ) {
                            alt41=2;
                        }
                        else if ( LA41_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 2) ) {
                            alt41=3;
                        }
                        else if ( LA41_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 3) ) {
                            alt41=4;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalDockerCompose.g:1772:6: ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1772:6: ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1773:7: {...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 0)");
                    	    }
                    	    // InternalDockerCompose.g:1773:119: ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) )
                    	    // InternalDockerCompose.g:1774:8: ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 0);
                    	    							
                    	    // InternalDockerCompose.g:1777:11: ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) )
                    	    // InternalDockerCompose.g:1777:12: {...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1777:21: (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) )
                    	    // InternalDockerCompose.g:1777:22: otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) )
                    	    {
                    	    otherlv_6=(Token)match(input,42,FOLLOW_25); 

                    	    											newLeafNode(otherlv_6, grammarAccess.getNetworkConnectorAccess().getIpv4_addressKeyword_1_1_2_0_0());
                    	    										
                    	    // InternalDockerCompose.g:1781:11: ( (lv_ipv4_address_7_0= ruleDNS ) )
                    	    // InternalDockerCompose.g:1782:12: (lv_ipv4_address_7_0= ruleDNS )
                    	    {
                    	    // InternalDockerCompose.g:1782:12: (lv_ipv4_address_7_0= ruleDNS )
                    	    // InternalDockerCompose.g:1783:13: lv_ipv4_address_7_0= ruleDNS
                    	    {

                    	    													newCompositeNode(grammarAccess.getNetworkConnectorAccess().getIpv4_addressDNSParserRuleCall_1_1_2_0_1_0());
                    	    												
                    	    pushFollow(FOLLOW_34);
                    	    lv_ipv4_address_7_0=ruleDNS();

                    	    state._fsp--;


                    	    													if (current==null) {
                    	    														current = createModelElementForParent(grammarAccess.getNetworkConnectorRule());
                    	    													}
                    	    													set(
                    	    														current,
                    	    														"ipv4_address",
                    	    														lv_ipv4_address_7_0,
                    	    														"org.xtext.example.dockercompose.DockerCompose.DNS");
                    	    													afterParserOrEnumRuleCall();
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDockerCompose.g:1806:6: ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1806:6: ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1807:7: {...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 1)");
                    	    }
                    	    // InternalDockerCompose.g:1807:119: ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) )
                    	    // InternalDockerCompose.g:1808:8: ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 1);
                    	    							
                    	    // InternalDockerCompose.g:1811:11: ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) )
                    	    // InternalDockerCompose.g:1811:12: {...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1811:21: (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) )
                    	    // InternalDockerCompose.g:1811:22: otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) )
                    	    {
                    	    otherlv_8=(Token)match(input,43,FOLLOW_12); 

                    	    											newLeafNode(otherlv_8, grammarAccess.getNetworkConnectorAccess().getPriorityKeyword_1_1_2_1_0());
                    	    										
                    	    // InternalDockerCompose.g:1815:11: ( (lv_priority_9_0= ruleEInt ) )
                    	    // InternalDockerCompose.g:1816:12: (lv_priority_9_0= ruleEInt )
                    	    {
                    	    // InternalDockerCompose.g:1816:12: (lv_priority_9_0= ruleEInt )
                    	    // InternalDockerCompose.g:1817:13: lv_priority_9_0= ruleEInt
                    	    {

                    	    													newCompositeNode(grammarAccess.getNetworkConnectorAccess().getPriorityEIntParserRuleCall_1_1_2_1_1_0());
                    	    												
                    	    pushFollow(FOLLOW_34);
                    	    lv_priority_9_0=ruleEInt();

                    	    state._fsp--;


                    	    													if (current==null) {
                    	    														current = createModelElementForParent(grammarAccess.getNetworkConnectorRule());
                    	    													}
                    	    													set(
                    	    														current,
                    	    														"priority",
                    	    														lv_priority_9_0,
                    	    														"org.xtext.example.dockercompose.DockerCompose.EInt");
                    	    													afterParserOrEnumRuleCall();
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalDockerCompose.g:1840:6: ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1840:6: ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) )
                    	    // InternalDockerCompose.g:1841:7: {...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 2)");
                    	    }
                    	    // InternalDockerCompose.g:1841:119: ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) )
                    	    // InternalDockerCompose.g:1842:8: ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 2);
                    	    							
                    	    // InternalDockerCompose.g:1845:11: ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) )
                    	    // InternalDockerCompose.g:1845:12: {...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1845:21: (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ )
                    	    // InternalDockerCompose.g:1845:22: otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+
                    	    {
                    	    otherlv_10=(Token)match(input,44,FOLLOW_15); 

                    	    											newLeafNode(otherlv_10, grammarAccess.getNetworkConnectorAccess().getAliasesKeyword_1_1_2_2_0());
                    	    										
                    	    // InternalDockerCompose.g:1849:11: (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+
                    	    int cnt39=0;
                    	    loop39:
                    	    do {
                    	        int alt39=2;
                    	        int LA39_0 = input.LA(1);

                    	        if ( (LA39_0==32) ) {
                    	            int LA39_2 = input.LA(2);

                    	            if ( (LA39_2==RULE_STRING) ) {
                    	                alt39=1;
                    	            }
                    	            else if ( (LA39_2==RULE_ID) ) {
                    	                alt39=1;
                    	            }


                    	        }


                    	        switch (alt39) {
                    	    	case 1 :
                    	    	    // InternalDockerCompose.g:1850:12: otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) )
                    	    	    {
                    	    	    otherlv_11=(Token)match(input,32,FOLLOW_5); 

                    	    	    												newLeafNode(otherlv_11, grammarAccess.getNetworkConnectorAccess().getHyphenMinusKeyword_1_1_2_2_1_0());
                    	    	    											
                    	    	    // InternalDockerCompose.g:1854:12: ( (lv_aliases_12_0= ruleAlias ) )
                    	    	    // InternalDockerCompose.g:1855:13: (lv_aliases_12_0= ruleAlias )
                    	    	    {
                    	    	    // InternalDockerCompose.g:1855:13: (lv_aliases_12_0= ruleAlias )
                    	    	    // InternalDockerCompose.g:1856:14: lv_aliases_12_0= ruleAlias
                    	    	    {

                    	    	    														newCompositeNode(grammarAccess.getNetworkConnectorAccess().getAliasesAliasParserRuleCall_1_1_2_2_1_1_0());
                    	    	    													
                    	    	    pushFollow(FOLLOW_35);
                    	    	    lv_aliases_12_0=ruleAlias();

                    	    	    state._fsp--;


                    	    	    														if (current==null) {
                    	    	    															current = createModelElementForParent(grammarAccess.getNetworkConnectorRule());
                    	    	    														}
                    	    	    														add(
                    	    	    															current,
                    	    	    															"aliases",
                    	    	    															lv_aliases_12_0,
                    	    	    															"org.xtext.example.dockercompose.DockerCompose.Alias");
                    	    	    														afterParserOrEnumRuleCall();
                    	    	    													

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt39 >= 1 ) break loop39;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(39, input);
                    	                throw eee;
                    	        }
                    	        cnt39++;
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalDockerCompose.g:1880:6: ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1880:6: ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) )
                    	    // InternalDockerCompose.g:1881:7: {...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 3)");
                    	    }
                    	    // InternalDockerCompose.g:1881:119: ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) )
                    	    // InternalDockerCompose.g:1882:8: ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 3);
                    	    							
                    	    // InternalDockerCompose.g:1885:11: ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) )
                    	    // InternalDockerCompose.g:1885:12: {...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1885:21: (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ )
                    	    // InternalDockerCompose.g:1885:22: otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+
                    	    {
                    	    otherlv_13=(Token)match(input,45,FOLLOW_15); 

                    	    											newLeafNode(otherlv_13, grammarAccess.getNetworkConnectorAccess().getLink_local_ipsKeyword_1_1_2_3_0());
                    	    										
                    	    // InternalDockerCompose.g:1889:11: (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+
                    	    int cnt40=0;
                    	    loop40:
                    	    do {
                    	        int alt40=2;
                    	        int LA40_0 = input.LA(1);

                    	        if ( (LA40_0==32) ) {
                    	            int LA40_2 = input.LA(2);

                    	            if ( (LA40_2==RULE_INT) ) {
                    	                alt40=1;
                    	            }


                    	        }


                    	        switch (alt40) {
                    	    	case 1 :
                    	    	    // InternalDockerCompose.g:1890:12: otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) )
                    	    	    {
                    	    	    otherlv_14=(Token)match(input,32,FOLLOW_25); 

                    	    	    												newLeafNode(otherlv_14, grammarAccess.getNetworkConnectorAccess().getHyphenMinusKeyword_1_1_2_3_1_0());
                    	    	    											
                    	    	    // InternalDockerCompose.g:1894:12: ( (lv_link_local_ips_15_0= ruleDNS ) )
                    	    	    // InternalDockerCompose.g:1895:13: (lv_link_local_ips_15_0= ruleDNS )
                    	    	    {
                    	    	    // InternalDockerCompose.g:1895:13: (lv_link_local_ips_15_0= ruleDNS )
                    	    	    // InternalDockerCompose.g:1896:14: lv_link_local_ips_15_0= ruleDNS
                    	    	    {

                    	    	    														newCompositeNode(grammarAccess.getNetworkConnectorAccess().getLink_local_ipsDNSParserRuleCall_1_1_2_3_1_1_0());
                    	    	    													
                    	    	    pushFollow(FOLLOW_35);
                    	    	    lv_link_local_ips_15_0=ruleDNS();

                    	    	    state._fsp--;


                    	    	    														if (current==null) {
                    	    	    															current = createModelElementForParent(grammarAccess.getNetworkConnectorRule());
                    	    	    														}
                    	    	    														add(
                    	    	    															current,
                    	    	    															"link_local_ips",
                    	    	    															lv_link_local_ips_15_0,
                    	    	    															"org.xtext.example.dockercompose.DockerCompose.DNS");
                    	    	    														afterParserOrEnumRuleCall();
                    	    	    													

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt40 >= 1 ) break loop40;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(40, input);
                    	                throw eee;
                    	        }
                    	        cnt40++;
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }


                    }

                     
                    						  getUnorderedGroupHelper().leave(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2());
                    						

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
    // $ANTLR end "ruleNetworkConnector"


    // $ANTLR start "entryRuleAlias"
    // InternalDockerCompose.g:1933:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // InternalDockerCompose.g:1933:46: (iv_ruleAlias= ruleAlias EOF )
            // InternalDockerCompose.g:1934:2: iv_ruleAlias= ruleAlias EOF
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
    // InternalDockerCompose.g:1940:1: ruleAlias returns [EObject current=null] : ( () ( (lv_alias_1_0= ruleEString ) ) ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_alias_1_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1946:2: ( ( () ( (lv_alias_1_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:1947:2: ( () ( (lv_alias_1_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:1947:2: ( () ( (lv_alias_1_0= ruleEString ) ) )
            // InternalDockerCompose.g:1948:3: () ( (lv_alias_1_0= ruleEString ) )
            {
            // InternalDockerCompose.g:1948:3: ()
            // InternalDockerCompose.g:1949:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAliasAccess().getAliasAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1955:3: ( (lv_alias_1_0= ruleEString ) )
            // InternalDockerCompose.g:1956:4: (lv_alias_1_0= ruleEString )
            {
            // InternalDockerCompose.g:1956:4: (lv_alias_1_0= ruleEString )
            // InternalDockerCompose.g:1957:5: lv_alias_1_0= ruleEString
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


    // $ANTLR start "entryRuleVolumeConnector_long"
    // InternalDockerCompose.g:1978:1: entryRuleVolumeConnector_long returns [EObject current=null] : iv_ruleVolumeConnector_long= ruleVolumeConnector_long EOF ;
    public final EObject entryRuleVolumeConnector_long() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumeConnector_long = null;


        try {
            // InternalDockerCompose.g:1978:61: (iv_ruleVolumeConnector_long= ruleVolumeConnector_long EOF )
            // InternalDockerCompose.g:1979:2: iv_ruleVolumeConnector_long= ruleVolumeConnector_long EOF
            {
             newCompositeNode(grammarAccess.getVolumeConnector_longRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVolumeConnector_long=ruleVolumeConnector_long();

            state._fsp--;

             current =iv_ruleVolumeConnector_long; 
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
    // $ANTLR end "entryRuleVolumeConnector_long"


    // $ANTLR start "ruleVolumeConnector_long"
    // InternalDockerCompose.g:1985:1: ruleVolumeConnector_long returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleVolumeConnector_long() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_container_path_7_0 = null;

        AntlrDatatypeRuleToken lv_read_only_9_0 = null;

        Enumerator lv_propagation_12_0 = null;

        AntlrDatatypeRuleToken lv_nocopy_15_0 = null;

        AntlrDatatypeRuleToken lv_size_18_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1991:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalDockerCompose.g:1992:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalDockerCompose.g:1992:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalDockerCompose.g:1993:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalDockerCompose.g:1993:3: ()
            // InternalDockerCompose.g:1994:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeConnector_longAccess().getVolumeConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2000:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
            // InternalDockerCompose.g:2001:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalDockerCompose.g:2001:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
            // InternalDockerCompose.g:2002:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1());
            				
            // InternalDockerCompose.g:2005:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
            // InternalDockerCompose.g:2006:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?
            {
            // InternalDockerCompose.g:2006:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=8;
                alt43 = dfa43.predict(input);
                switch (alt43) {
            	case 1 :
            	    // InternalDockerCompose.g:2007:4: ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2007:4: ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:2008:5: {...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalDockerCompose.g:2008:117: ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:2009:6: ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalDockerCompose.g:2012:9: ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) )
            	    // InternalDockerCompose.g:2012:10: {...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2012:19: (otherlv_2= 'source:' ( ( ruleEString ) ) )
            	    // InternalDockerCompose.g:2012:20: otherlv_2= 'source:' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_5); 

            	    									newLeafNode(otherlv_2, grammarAccess.getVolumeConnector_longAccess().getSourceKeyword_1_0_0());
            	    								
            	    // InternalDockerCompose.g:2016:9: ( ( ruleEString ) )
            	    // InternalDockerCompose.g:2017:10: ( ruleEString )
            	    {
            	    // InternalDockerCompose.g:2017:10: ( ruleEString )
            	    // InternalDockerCompose.g:2018:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getVolumeConnector_longRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getVolumeConnector_longAccess().getVolumeVolumeCrossReference_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDockerCompose.g:2038:4: ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2038:4: ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) )
            	    // InternalDockerCompose.g:2039:5: {...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalDockerCompose.g:2039:117: ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) )
            	    // InternalDockerCompose.g:2040:6: ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalDockerCompose.g:2043:9: ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) )
            	    // InternalDockerCompose.g:2043:10: {...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2043:19: (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) )
            	    // InternalDockerCompose.g:2043:20: otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) )
            	    {
            	    otherlv_4=(Token)match(input,47,FOLLOW_37); 

            	    									newLeafNode(otherlv_4, grammarAccess.getVolumeConnector_longAccess().getTypeKeyword_1_1_0());
            	    								
            	    // InternalDockerCompose.g:2047:9: ( (lv_type_5_0= ruleMountType ) )
            	    // InternalDockerCompose.g:2048:10: (lv_type_5_0= ruleMountType )
            	    {
            	    // InternalDockerCompose.g:2048:10: (lv_type_5_0= ruleMountType )
            	    // InternalDockerCompose.g:2049:11: lv_type_5_0= ruleMountType
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeConnector_longAccess().getTypeMountTypeEnumRuleCall_1_1_1_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_type_5_0=ruleMountType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getVolumeConnector_longRule());
            	    											}
            	    											set(
            	    												current,
            	    												"type",
            	    												lv_type_5_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.MountType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDockerCompose.g:2072:4: ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2072:4: ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) )
            	    // InternalDockerCompose.g:2073:5: {...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalDockerCompose.g:2073:117: ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) )
            	    // InternalDockerCompose.g:2074:6: ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalDockerCompose.g:2077:9: ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) )
            	    // InternalDockerCompose.g:2077:10: {...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2077:19: (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) )
            	    // InternalDockerCompose.g:2077:20: otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) )
            	    {
            	    otherlv_6=(Token)match(input,48,FOLLOW_9); 

            	    									newLeafNode(otherlv_6, grammarAccess.getVolumeConnector_longAccess().getTargetKeyword_1_2_0());
            	    								
            	    // InternalDockerCompose.g:2081:9: ( (lv_container_path_7_0= rulePATH ) )
            	    // InternalDockerCompose.g:2082:10: (lv_container_path_7_0= rulePATH )
            	    {
            	    // InternalDockerCompose.g:2082:10: (lv_container_path_7_0= rulePATH )
            	    // InternalDockerCompose.g:2083:11: lv_container_path_7_0= rulePATH
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeConnector_longAccess().getContainer_pathPATHParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_container_path_7_0=rulePATH();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getVolumeConnector_longRule());
            	    											}
            	    											set(
            	    												current,
            	    												"container_path",
            	    												lv_container_path_7_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.PATH");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDockerCompose.g:2106:4: ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2106:4: ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:2107:5: {...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalDockerCompose.g:2107:117: ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:2108:6: ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalDockerCompose.g:2111:9: ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:2111:10: {...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2111:19: (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:2111:20: otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) )
            	    {
            	    otherlv_8=(Token)match(input,30,FOLLOW_14); 

            	    									newLeafNode(otherlv_8, grammarAccess.getVolumeConnector_longAccess().getRead_onlyKeyword_1_3_0());
            	    								
            	    // InternalDockerCompose.g:2115:9: ( (lv_read_only_9_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:2116:10: (lv_read_only_9_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:2116:10: (lv_read_only_9_0= ruleEBoolean )
            	    // InternalDockerCompose.g:2117:11: lv_read_only_9_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeConnector_longAccess().getRead_onlyEBooleanParserRuleCall_1_3_1_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_read_only_9_0=ruleEBoolean();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getVolumeConnector_longRule());
            	    											}
            	    											set(
            	    												current,
            	    												"read_only",
            	    												lv_read_only_9_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.EBoolean");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDockerCompose.g:2140:4: ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2140:4: ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) )
            	    // InternalDockerCompose.g:2141:5: {...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalDockerCompose.g:2141:117: ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) )
            	    // InternalDockerCompose.g:2142:6: ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalDockerCompose.g:2145:9: ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) )
            	    // InternalDockerCompose.g:2145:10: {...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2145:19: (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) )
            	    // InternalDockerCompose.g:2145:20: otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) )
            	    {
            	    otherlv_10=(Token)match(input,49,FOLLOW_38); 

            	    									newLeafNode(otherlv_10, grammarAccess.getVolumeConnector_longAccess().getBindKeyword_1_4_0());
            	    								
            	    otherlv_11=(Token)match(input,50,FOLLOW_39); 

            	    									newLeafNode(otherlv_11, grammarAccess.getVolumeConnector_longAccess().getPropagationKeyword_1_4_1());
            	    								
            	    // InternalDockerCompose.g:2153:9: ( (lv_propagation_12_0= rulePropagationType ) )
            	    // InternalDockerCompose.g:2154:10: (lv_propagation_12_0= rulePropagationType )
            	    {
            	    // InternalDockerCompose.g:2154:10: (lv_propagation_12_0= rulePropagationType )
            	    // InternalDockerCompose.g:2155:11: lv_propagation_12_0= rulePropagationType
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeConnector_longAccess().getPropagationPropagationTypeEnumRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_propagation_12_0=rulePropagationType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getVolumeConnector_longRule());
            	    											}
            	    											set(
            	    												current,
            	    												"propagation",
            	    												lv_propagation_12_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.PropagationType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalDockerCompose.g:2178:4: ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2178:4: ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:2179:5: {...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalDockerCompose.g:2179:117: ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:2180:6: ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalDockerCompose.g:2183:9: ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:2183:10: {...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2183:19: (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:2183:20: otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) )
            	    {
            	    otherlv_13=(Token)match(input,51,FOLLOW_40); 

            	    									newLeafNode(otherlv_13, grammarAccess.getVolumeConnector_longAccess().getVolumeKeyword_1_5_0());
            	    								
            	    otherlv_14=(Token)match(input,52,FOLLOW_14); 

            	    									newLeafNode(otherlv_14, grammarAccess.getVolumeConnector_longAccess().getNocopyKeyword_1_5_1());
            	    								
            	    // InternalDockerCompose.g:2191:9: ( (lv_nocopy_15_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:2192:10: (lv_nocopy_15_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:2192:10: (lv_nocopy_15_0= ruleEBoolean )
            	    // InternalDockerCompose.g:2193:11: lv_nocopy_15_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeConnector_longAccess().getNocopyEBooleanParserRuleCall_1_5_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_nocopy_15_0=ruleEBoolean();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getVolumeConnector_longRule());
            	    											}
            	    											set(
            	    												current,
            	    												"nocopy",
            	    												lv_nocopy_15_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.EBoolean");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalDockerCompose.g:2216:4: ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2216:4: ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) )
            	    // InternalDockerCompose.g:2217:5: {...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalDockerCompose.g:2217:117: ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) )
            	    // InternalDockerCompose.g:2218:6: ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 6);
            	    					
            	    // InternalDockerCompose.g:2221:9: ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) )
            	    // InternalDockerCompose.g:2221:10: {...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2221:19: (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) )
            	    // InternalDockerCompose.g:2221:20: otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) )
            	    {
            	    otherlv_16=(Token)match(input,53,FOLLOW_41); 

            	    									newLeafNode(otherlv_16, grammarAccess.getVolumeConnector_longAccess().getTmpfsKeyword_1_6_0());
            	    								
            	    otherlv_17=(Token)match(input,54,FOLLOW_12); 

            	    									newLeafNode(otherlv_17, grammarAccess.getVolumeConnector_longAccess().getSizeKeyword_1_6_1());
            	    								
            	    // InternalDockerCompose.g:2229:9: ( (lv_size_18_0= ruleEInt ) )
            	    // InternalDockerCompose.g:2230:10: (lv_size_18_0= ruleEInt )
            	    {
            	    // InternalDockerCompose.g:2230:10: (lv_size_18_0= ruleEInt )
            	    // InternalDockerCompose.g:2231:11: lv_size_18_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeConnector_longAccess().getSizeEIntParserRuleCall_1_6_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_size_18_0=ruleEInt();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getVolumeConnector_longRule());
            	    											}
            	    											set(
            	    												current,
            	    												"size",
            	    												lv_size_18_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.EInt");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canLeave(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleVolumeConnector_long"


    // $ANTLR start "entryRuleVolumeConnector_short"
    // InternalDockerCompose.g:2266:1: entryRuleVolumeConnector_short returns [EObject current=null] : iv_ruleVolumeConnector_short= ruleVolumeConnector_short EOF ;
    public final EObject entryRuleVolumeConnector_short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumeConnector_short = null;


        try {
            // InternalDockerCompose.g:2266:62: (iv_ruleVolumeConnector_short= ruleVolumeConnector_short EOF )
            // InternalDockerCompose.g:2267:2: iv_ruleVolumeConnector_short= ruleVolumeConnector_short EOF
            {
             newCompositeNode(grammarAccess.getVolumeConnector_shortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVolumeConnector_short=ruleVolumeConnector_short();

            state._fsp--;

             current =iv_ruleVolumeConnector_short; 
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
    // $ANTLR end "entryRuleVolumeConnector_short"


    // $ANTLR start "ruleVolumeConnector_short"
    // InternalDockerCompose.g:2273:1: ruleVolumeConnector_short returns [EObject current=null] : ( () ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? ) ;
    public final EObject ruleVolumeConnector_short() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_container_path_3_0 = null;

        Enumerator lv_access_mode_5_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:2279:2: ( ( () ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? ) )
            // InternalDockerCompose.g:2280:2: ( () ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? )
            {
            // InternalDockerCompose.g:2280:2: ( () ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? )
            // InternalDockerCompose.g:2281:3: () ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )?
            {
            // InternalDockerCompose.g:2281:3: ()
            // InternalDockerCompose.g:2282:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeConnector_shortAccess().getVolumeConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2288:3: ( ( ruleEString ) )
            // InternalDockerCompose.g:2289:4: ( ruleEString )
            {
            // InternalDockerCompose.g:2289:4: ( ruleEString )
            // InternalDockerCompose.g:2290:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVolumeConnector_shortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getVolumeConnector_shortAccess().getVolumeVolumeCrossReference_1_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getVolumeConnector_shortAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:2308:3: ( (lv_container_path_3_0= rulePATH ) )
            // InternalDockerCompose.g:2309:4: (lv_container_path_3_0= rulePATH )
            {
            // InternalDockerCompose.g:2309:4: (lv_container_path_3_0= rulePATH )
            // InternalDockerCompose.g:2310:5: lv_container_path_3_0= rulePATH
            {

            					newCompositeNode(grammarAccess.getVolumeConnector_shortAccess().getContainer_pathPATHParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_container_path_3_0=rulePATH();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVolumeConnector_shortRule());
            					}
            					set(
            						current,
            						"container_path",
            						lv_container_path_3_0,
            						"org.xtext.example.dockercompose.DockerCompose.PATH");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDockerCompose.g:2327:3: (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==22) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDockerCompose.g:2328:4: otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_42); 

                    				newLeafNode(otherlv_4, grammarAccess.getVolumeConnector_shortAccess().getColonKeyword_4_0());
                    			
                    // InternalDockerCompose.g:2332:4: ( (lv_access_mode_5_0= ruleAccessMode ) )
                    // InternalDockerCompose.g:2333:5: (lv_access_mode_5_0= ruleAccessMode )
                    {
                    // InternalDockerCompose.g:2333:5: (lv_access_mode_5_0= ruleAccessMode )
                    // InternalDockerCompose.g:2334:6: lv_access_mode_5_0= ruleAccessMode
                    {

                    						newCompositeNode(grammarAccess.getVolumeConnector_shortAccess().getAccess_modeAccessModeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_access_mode_5_0=ruleAccessMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVolumeConnector_shortRule());
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
    // $ANTLR end "ruleVolumeConnector_short"


    // $ANTLR start "entryRuleConfigConnector_long"
    // InternalDockerCompose.g:2356:1: entryRuleConfigConnector_long returns [EObject current=null] : iv_ruleConfigConnector_long= ruleConfigConnector_long EOF ;
    public final EObject entryRuleConfigConnector_long() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigConnector_long = null;


        try {
            // InternalDockerCompose.g:2356:61: (iv_ruleConfigConnector_long= ruleConfigConnector_long EOF )
            // InternalDockerCompose.g:2357:2: iv_ruleConfigConnector_long= ruleConfigConnector_long EOF
            {
             newCompositeNode(grammarAccess.getConfigConnector_longRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigConnector_long=ruleConfigConnector_long();

            state._fsp--;

             current =iv_ruleConfigConnector_long; 
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
    // $ANTLR end "entryRuleConfigConnector_long"


    // $ANTLR start "ruleConfigConnector_long"
    // InternalDockerCompose.g:2363:1: ruleConfigConnector_long returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleConfigConnector_long() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_uid_7_0=null;
        Token otherlv_8=null;
        Token lv_gid_9_0=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_target_5_0 = null;

        AntlrDatatypeRuleToken lv_mode_11_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:2369:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalDockerCompose.g:2370:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalDockerCompose.g:2370:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalDockerCompose.g:2371:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalDockerCompose.g:2371:3: ()
            // InternalDockerCompose.g:2372:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigConnector_longAccess().getConfigConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2378:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
            // InternalDockerCompose.g:2379:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalDockerCompose.g:2379:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
            // InternalDockerCompose.g:2380:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1());
            				
            // InternalDockerCompose.g:2383:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
            // InternalDockerCompose.g:2384:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?
            {
            // InternalDockerCompose.g:2384:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=6;
                int LA45_0 = input.LA(1);

                if ( LA45_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 0) ) {
                    alt45=1;
                }
                else if ( LA45_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 1) ) {
                    alt45=2;
                }
                else if ( LA45_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 2) ) {
                    alt45=3;
                }
                else if ( LA45_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 3) ) {
                    alt45=4;
                }
                else if ( LA45_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 4) ) {
                    alt45=5;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalDockerCompose.g:2385:4: ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2385:4: ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:2386:5: {...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalDockerCompose.g:2386:117: ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:2387:6: ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalDockerCompose.g:2390:9: ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) )
            	    // InternalDockerCompose.g:2390:10: {...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2390:19: (otherlv_2= 'source:' ( ( ruleEString ) ) )
            	    // InternalDockerCompose.g:2390:20: otherlv_2= 'source:' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_5); 

            	    									newLeafNode(otherlv_2, grammarAccess.getConfigConnector_longAccess().getSourceKeyword_1_0_0());
            	    								
            	    // InternalDockerCompose.g:2394:9: ( ( ruleEString ) )
            	    // InternalDockerCompose.g:2395:10: ( ruleEString )
            	    {
            	    // InternalDockerCompose.g:2395:10: ( ruleEString )
            	    // InternalDockerCompose.g:2396:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getConfigConnector_longRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getConfigConnector_longAccess().getConfigConfigCrossReference_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDockerCompose.g:2416:4: ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2416:4: ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) )
            	    // InternalDockerCompose.g:2417:5: {...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalDockerCompose.g:2417:117: ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) )
            	    // InternalDockerCompose.g:2418:6: ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalDockerCompose.g:2421:9: ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) )
            	    // InternalDockerCompose.g:2421:10: {...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2421:19: (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) )
            	    // InternalDockerCompose.g:2421:20: otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) )
            	    {
            	    otherlv_4=(Token)match(input,48,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getConfigConnector_longAccess().getTargetKeyword_1_1_0());
            	    								
            	    // InternalDockerCompose.g:2425:9: ( (lv_target_5_0= rulePATH ) )
            	    // InternalDockerCompose.g:2426:10: (lv_target_5_0= rulePATH )
            	    {
            	    // InternalDockerCompose.g:2426:10: (lv_target_5_0= rulePATH )
            	    // InternalDockerCompose.g:2427:11: lv_target_5_0= rulePATH
            	    {

            	    											newCompositeNode(grammarAccess.getConfigConnector_longAccess().getTargetPATHParserRuleCall_1_1_1_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    lv_target_5_0=rulePATH();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getConfigConnector_longRule());
            	    											}
            	    											set(
            	    												current,
            	    												"target",
            	    												lv_target_5_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.PATH");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDockerCompose.g:2450:4: ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2450:4: ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    // InternalDockerCompose.g:2451:5: {...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalDockerCompose.g:2451:117: ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) )
            	    // InternalDockerCompose.g:2452:6: ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalDockerCompose.g:2455:9: ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) )
            	    // InternalDockerCompose.g:2455:10: {...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2455:19: (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) )
            	    // InternalDockerCompose.g:2455:20: otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) )
            	    {
            	    otherlv_6=(Token)match(input,55,FOLLOW_44); 

            	    									newLeafNode(otherlv_6, grammarAccess.getConfigConnector_longAccess().getUidKeyword_1_2_0());
            	    								
            	    // InternalDockerCompose.g:2459:9: ( (lv_uid_7_0= RULE_QUOTED_INT ) )
            	    // InternalDockerCompose.g:2460:10: (lv_uid_7_0= RULE_QUOTED_INT )
            	    {
            	    // InternalDockerCompose.g:2460:10: (lv_uid_7_0= RULE_QUOTED_INT )
            	    // InternalDockerCompose.g:2461:11: lv_uid_7_0= RULE_QUOTED_INT
            	    {
            	    lv_uid_7_0=(Token)match(input,RULE_QUOTED_INT,FOLLOW_43); 

            	    											newLeafNode(lv_uid_7_0, grammarAccess.getConfigConnector_longAccess().getUidQUOTED_INTTerminalRuleCall_1_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getConfigConnector_longRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"uid",
            	    												lv_uid_7_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.QUOTED_INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDockerCompose.g:2483:4: ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2483:4: ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    // InternalDockerCompose.g:2484:5: {...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalDockerCompose.g:2484:117: ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) )
            	    // InternalDockerCompose.g:2485:6: ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalDockerCompose.g:2488:9: ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) )
            	    // InternalDockerCompose.g:2488:10: {...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2488:19: (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) )
            	    // InternalDockerCompose.g:2488:20: otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) )
            	    {
            	    otherlv_8=(Token)match(input,56,FOLLOW_44); 

            	    									newLeafNode(otherlv_8, grammarAccess.getConfigConnector_longAccess().getGidKeyword_1_3_0());
            	    								
            	    // InternalDockerCompose.g:2492:9: ( (lv_gid_9_0= RULE_QUOTED_INT ) )
            	    // InternalDockerCompose.g:2493:10: (lv_gid_9_0= RULE_QUOTED_INT )
            	    {
            	    // InternalDockerCompose.g:2493:10: (lv_gid_9_0= RULE_QUOTED_INT )
            	    // InternalDockerCompose.g:2494:11: lv_gid_9_0= RULE_QUOTED_INT
            	    {
            	    lv_gid_9_0=(Token)match(input,RULE_QUOTED_INT,FOLLOW_43); 

            	    											newLeafNode(lv_gid_9_0, grammarAccess.getConfigConnector_longAccess().getGidQUOTED_INTTerminalRuleCall_1_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getConfigConnector_longRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"gid",
            	    												lv_gid_9_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.QUOTED_INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDockerCompose.g:2516:4: ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2516:4: ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) )
            	    // InternalDockerCompose.g:2517:5: {...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalDockerCompose.g:2517:117: ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) )
            	    // InternalDockerCompose.g:2518:6: ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalDockerCompose.g:2521:9: ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) )
            	    // InternalDockerCompose.g:2521:10: {...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2521:19: (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) )
            	    // InternalDockerCompose.g:2521:20: otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) )
            	    {
            	    otherlv_10=(Token)match(input,57,FOLLOW_12); 

            	    									newLeafNode(otherlv_10, grammarAccess.getConfigConnector_longAccess().getModeKeyword_1_4_0());
            	    								
            	    // InternalDockerCompose.g:2525:9: ( (lv_mode_11_0= ruleEInt ) )
            	    // InternalDockerCompose.g:2526:10: (lv_mode_11_0= ruleEInt )
            	    {
            	    // InternalDockerCompose.g:2526:10: (lv_mode_11_0= ruleEInt )
            	    // InternalDockerCompose.g:2527:11: lv_mode_11_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getConfigConnector_longAccess().getModeEIntParserRuleCall_1_4_1_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    lv_mode_11_0=ruleEInt();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getConfigConnector_longRule());
            	    											}
            	    											set(
            	    												current,
            	    												"mode",
            	    												lv_mode_11_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.EInt");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1());
            	    					

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleConfigConnector_long", "getUnorderedGroupHelper().canLeave(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleConfigConnector_long"


    // $ANTLR start "entryRuleConfigConnector_short"
    // InternalDockerCompose.g:2562:1: entryRuleConfigConnector_short returns [EObject current=null] : iv_ruleConfigConnector_short= ruleConfigConnector_short EOF ;
    public final EObject entryRuleConfigConnector_short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigConnector_short = null;


        try {
            // InternalDockerCompose.g:2562:62: (iv_ruleConfigConnector_short= ruleConfigConnector_short EOF )
            // InternalDockerCompose.g:2563:2: iv_ruleConfigConnector_short= ruleConfigConnector_short EOF
            {
             newCompositeNode(grammarAccess.getConfigConnector_shortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigConnector_short=ruleConfigConnector_short();

            state._fsp--;

             current =iv_ruleConfigConnector_short; 
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
    // $ANTLR end "entryRuleConfigConnector_short"


    // $ANTLR start "ruleConfigConnector_short"
    // InternalDockerCompose.g:2569:1: ruleConfigConnector_short returns [EObject current=null] : ( () ( ( ruleEString ) ) ) ;
    public final EObject ruleConfigConnector_short() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalDockerCompose.g:2575:2: ( ( () ( ( ruleEString ) ) ) )
            // InternalDockerCompose.g:2576:2: ( () ( ( ruleEString ) ) )
            {
            // InternalDockerCompose.g:2576:2: ( () ( ( ruleEString ) ) )
            // InternalDockerCompose.g:2577:3: () ( ( ruleEString ) )
            {
            // InternalDockerCompose.g:2577:3: ()
            // InternalDockerCompose.g:2578:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigConnector_shortAccess().getConfigConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2584:3: ( ( ruleEString ) )
            // InternalDockerCompose.g:2585:4: ( ruleEString )
            {
            // InternalDockerCompose.g:2585:4: ( ruleEString )
            // InternalDockerCompose.g:2586:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigConnector_shortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConfigConnector_shortAccess().getConfigConfigCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleConfigConnector_short"


    // $ANTLR start "entryRuleSecretConnector_long"
    // InternalDockerCompose.g:2604:1: entryRuleSecretConnector_long returns [EObject current=null] : iv_ruleSecretConnector_long= ruleSecretConnector_long EOF ;
    public final EObject entryRuleSecretConnector_long() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecretConnector_long = null;


        try {
            // InternalDockerCompose.g:2604:61: (iv_ruleSecretConnector_long= ruleSecretConnector_long EOF )
            // InternalDockerCompose.g:2605:2: iv_ruleSecretConnector_long= ruleSecretConnector_long EOF
            {
             newCompositeNode(grammarAccess.getSecretConnector_longRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecretConnector_long=ruleSecretConnector_long();

            state._fsp--;

             current =iv_ruleSecretConnector_long; 
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
    // $ANTLR end "entryRuleSecretConnector_long"


    // $ANTLR start "ruleSecretConnector_long"
    // InternalDockerCompose.g:2611:1: ruleSecretConnector_long returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleSecretConnector_long() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_uid_7_0=null;
        Token otherlv_8=null;
        Token lv_gid_9_0=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_target_5_0 = null;

        AntlrDatatypeRuleToken lv_mode_11_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:2617:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalDockerCompose.g:2618:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalDockerCompose.g:2618:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalDockerCompose.g:2619:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalDockerCompose.g:2619:3: ()
            // InternalDockerCompose.g:2620:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecretConnector_longAccess().getSecretConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2626:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
            // InternalDockerCompose.g:2627:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalDockerCompose.g:2627:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
            // InternalDockerCompose.g:2628:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1());
            				
            // InternalDockerCompose.g:2631:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
            // InternalDockerCompose.g:2632:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?
            {
            // InternalDockerCompose.g:2632:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=6;
                int LA46_0 = input.LA(1);

                if ( LA46_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 0) ) {
                    alt46=1;
                }
                else if ( LA46_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 1) ) {
                    alt46=2;
                }
                else if ( LA46_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 2) ) {
                    alt46=3;
                }
                else if ( LA46_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 3) ) {
                    alt46=4;
                }
                else if ( LA46_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 4) ) {
                    alt46=5;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalDockerCompose.g:2633:4: ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2633:4: ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:2634:5: {...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalDockerCompose.g:2634:117: ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:2635:6: ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalDockerCompose.g:2638:9: ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) )
            	    // InternalDockerCompose.g:2638:10: {...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2638:19: (otherlv_2= 'source:' ( ( ruleEString ) ) )
            	    // InternalDockerCompose.g:2638:20: otherlv_2= 'source:' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,46,FOLLOW_5); 

            	    									newLeafNode(otherlv_2, grammarAccess.getSecretConnector_longAccess().getSourceKeyword_1_0_0());
            	    								
            	    // InternalDockerCompose.g:2642:9: ( ( ruleEString ) )
            	    // InternalDockerCompose.g:2643:10: ( ruleEString )
            	    {
            	    // InternalDockerCompose.g:2643:10: ( ruleEString )
            	    // InternalDockerCompose.g:2644:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSecretConnector_longRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getSecretConnector_longAccess().getSecretSecretCrossReference_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDockerCompose.g:2664:4: ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2664:4: ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) )
            	    // InternalDockerCompose.g:2665:5: {...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalDockerCompose.g:2665:117: ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) )
            	    // InternalDockerCompose.g:2666:6: ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalDockerCompose.g:2669:9: ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) )
            	    // InternalDockerCompose.g:2669:10: {...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2669:19: (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) )
            	    // InternalDockerCompose.g:2669:20: otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) )
            	    {
            	    otherlv_4=(Token)match(input,48,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getSecretConnector_longAccess().getTargetKeyword_1_1_0());
            	    								
            	    // InternalDockerCompose.g:2673:9: ( (lv_target_5_0= rulePATH ) )
            	    // InternalDockerCompose.g:2674:10: (lv_target_5_0= rulePATH )
            	    {
            	    // InternalDockerCompose.g:2674:10: (lv_target_5_0= rulePATH )
            	    // InternalDockerCompose.g:2675:11: lv_target_5_0= rulePATH
            	    {

            	    											newCompositeNode(grammarAccess.getSecretConnector_longAccess().getTargetPATHParserRuleCall_1_1_1_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    lv_target_5_0=rulePATH();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSecretConnector_longRule());
            	    											}
            	    											set(
            	    												current,
            	    												"target",
            	    												lv_target_5_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.PATH");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDockerCompose.g:2698:4: ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2698:4: ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    // InternalDockerCompose.g:2699:5: {...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalDockerCompose.g:2699:117: ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) )
            	    // InternalDockerCompose.g:2700:6: ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalDockerCompose.g:2703:9: ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) )
            	    // InternalDockerCompose.g:2703:10: {...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2703:19: (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) )
            	    // InternalDockerCompose.g:2703:20: otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) )
            	    {
            	    otherlv_6=(Token)match(input,55,FOLLOW_44); 

            	    									newLeafNode(otherlv_6, grammarAccess.getSecretConnector_longAccess().getUidKeyword_1_2_0());
            	    								
            	    // InternalDockerCompose.g:2707:9: ( (lv_uid_7_0= RULE_QUOTED_INT ) )
            	    // InternalDockerCompose.g:2708:10: (lv_uid_7_0= RULE_QUOTED_INT )
            	    {
            	    // InternalDockerCompose.g:2708:10: (lv_uid_7_0= RULE_QUOTED_INT )
            	    // InternalDockerCompose.g:2709:11: lv_uid_7_0= RULE_QUOTED_INT
            	    {
            	    lv_uid_7_0=(Token)match(input,RULE_QUOTED_INT,FOLLOW_43); 

            	    											newLeafNode(lv_uid_7_0, grammarAccess.getSecretConnector_longAccess().getUidQUOTED_INTTerminalRuleCall_1_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSecretConnector_longRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"uid",
            	    												lv_uid_7_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.QUOTED_INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDockerCompose.g:2731:4: ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2731:4: ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    // InternalDockerCompose.g:2732:5: {...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalDockerCompose.g:2732:117: ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) )
            	    // InternalDockerCompose.g:2733:6: ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalDockerCompose.g:2736:9: ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) )
            	    // InternalDockerCompose.g:2736:10: {...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2736:19: (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) )
            	    // InternalDockerCompose.g:2736:20: otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) )
            	    {
            	    otherlv_8=(Token)match(input,56,FOLLOW_44); 

            	    									newLeafNode(otherlv_8, grammarAccess.getSecretConnector_longAccess().getGidKeyword_1_3_0());
            	    								
            	    // InternalDockerCompose.g:2740:9: ( (lv_gid_9_0= RULE_QUOTED_INT ) )
            	    // InternalDockerCompose.g:2741:10: (lv_gid_9_0= RULE_QUOTED_INT )
            	    {
            	    // InternalDockerCompose.g:2741:10: (lv_gid_9_0= RULE_QUOTED_INT )
            	    // InternalDockerCompose.g:2742:11: lv_gid_9_0= RULE_QUOTED_INT
            	    {
            	    lv_gid_9_0=(Token)match(input,RULE_QUOTED_INT,FOLLOW_43); 

            	    											newLeafNode(lv_gid_9_0, grammarAccess.getSecretConnector_longAccess().getGidQUOTED_INTTerminalRuleCall_1_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSecretConnector_longRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"gid",
            	    												lv_gid_9_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.QUOTED_INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDockerCompose.g:2764:4: ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2764:4: ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) )
            	    // InternalDockerCompose.g:2765:5: {...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalDockerCompose.g:2765:117: ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) )
            	    // InternalDockerCompose.g:2766:6: ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalDockerCompose.g:2769:9: ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) )
            	    // InternalDockerCompose.g:2769:10: {...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2769:19: (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) )
            	    // InternalDockerCompose.g:2769:20: otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) )
            	    {
            	    otherlv_10=(Token)match(input,57,FOLLOW_12); 

            	    									newLeafNode(otherlv_10, grammarAccess.getSecretConnector_longAccess().getModeKeyword_1_4_0());
            	    								
            	    // InternalDockerCompose.g:2773:9: ( (lv_mode_11_0= ruleEInt ) )
            	    // InternalDockerCompose.g:2774:10: (lv_mode_11_0= ruleEInt )
            	    {
            	    // InternalDockerCompose.g:2774:10: (lv_mode_11_0= ruleEInt )
            	    // InternalDockerCompose.g:2775:11: lv_mode_11_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getSecretConnector_longAccess().getModeEIntParserRuleCall_1_4_1_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    lv_mode_11_0=ruleEInt();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSecretConnector_longRule());
            	    											}
            	    											set(
            	    												current,
            	    												"mode",
            	    												lv_mode_11_0,
            	    												"org.xtext.example.dockercompose.DockerCompose.EInt");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleSecretConnector_long", "getUnorderedGroupHelper().canLeave(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleSecretConnector_long"


    // $ANTLR start "entryRuleSecretConnector_short"
    // InternalDockerCompose.g:2810:1: entryRuleSecretConnector_short returns [EObject current=null] : iv_ruleSecretConnector_short= ruleSecretConnector_short EOF ;
    public final EObject entryRuleSecretConnector_short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecretConnector_short = null;


        try {
            // InternalDockerCompose.g:2810:62: (iv_ruleSecretConnector_short= ruleSecretConnector_short EOF )
            // InternalDockerCompose.g:2811:2: iv_ruleSecretConnector_short= ruleSecretConnector_short EOF
            {
             newCompositeNode(grammarAccess.getSecretConnector_shortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecretConnector_short=ruleSecretConnector_short();

            state._fsp--;

             current =iv_ruleSecretConnector_short; 
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
    // $ANTLR end "entryRuleSecretConnector_short"


    // $ANTLR start "ruleSecretConnector_short"
    // InternalDockerCompose.g:2817:1: ruleSecretConnector_short returns [EObject current=null] : ( () ( ( ruleEString ) ) ) ;
    public final EObject ruleSecretConnector_short() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalDockerCompose.g:2823:2: ( ( () ( ( ruleEString ) ) ) )
            // InternalDockerCompose.g:2824:2: ( () ( ( ruleEString ) ) )
            {
            // InternalDockerCompose.g:2824:2: ( () ( ( ruleEString ) ) )
            // InternalDockerCompose.g:2825:3: () ( ( ruleEString ) )
            {
            // InternalDockerCompose.g:2825:3: ()
            // InternalDockerCompose.g:2826:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecretConnector_shortAccess().getSecretConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2832:3: ( ( ruleEString ) )
            // InternalDockerCompose.g:2833:4: ( ruleEString )
            {
            // InternalDockerCompose.g:2833:4: ( ruleEString )
            // InternalDockerCompose.g:2834:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSecretConnector_shortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSecretConnector_shortAccess().getSecretSecretCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleSecretConnector_short"


    // $ANTLR start "entryRuleNetwork"
    // InternalDockerCompose.g:2852:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // InternalDockerCompose.g:2852:48: (iv_ruleNetwork= ruleNetwork EOF )
            // InternalDockerCompose.g:2853:2: iv_ruleNetwork= ruleNetwork EOF
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
    // InternalDockerCompose.g:2859:1: ruleNetwork returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) ) ) ;
    public final EObject ruleNetwork() throws RecognitionException {
        EObject current = null;

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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

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
            // InternalDockerCompose.g:2865:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) ) ) )
            // InternalDockerCompose.g:2866:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) ) )
            {
            // InternalDockerCompose.g:2866:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:2867:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:2867:3: ()
            // InternalDockerCompose.g:2868:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkAccess().getNetworkAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2874:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:2875:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:2875:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:2876:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNetworkAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:2897:3: ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==58) ) {
                alt50=1;
            }
            else if ( (LA50_0==EOF||LA50_0==RULE_ID||LA50_0==RULE_STRING||(LA50_0>=16 && LA50_0<=21)||(LA50_0>=60 && LA50_0<=68)) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalDockerCompose.g:2898:4: (otherlv_3= '{' otherlv_4= '}' )
                    {
                    // InternalDockerCompose.g:2898:4: (otherlv_3= '{' otherlv_4= '}' )
                    // InternalDockerCompose.g:2899:5: otherlv_3= '{' otherlv_4= '}'
                    {
                    otherlv_3=(Token)match(input,58,FOLLOW_46); 

                    					newLeafNode(otherlv_3, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_3_0_0());
                    				
                    otherlv_4=(Token)match(input,59,FOLLOW_2); 

                    					newLeafNode(otherlv_4, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_3_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:2909:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) )
                    {
                    // InternalDockerCompose.g:2909:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) )
                    // InternalDockerCompose.g:2910:5: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) )
                    {
                    // InternalDockerCompose.g:2910:5: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) )
                    // InternalDockerCompose.g:2911:6: ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    					
                    // InternalDockerCompose.g:2914:6: ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* )
                    // InternalDockerCompose.g:2915:7: ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )*
                    {
                    // InternalDockerCompose.g:2915:7: ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )*
                    loop49:
                    do {
                        int alt49=10;
                        alt49 = dfa49.predict(input);
                        switch (alt49) {
                    	case 1 :
                    	    // InternalDockerCompose.g:2916:5: ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2916:5: ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2917:6: {...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 0)");
                    	    }
                    	    // InternalDockerCompose.g:2917:107: ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) )
                    	    // InternalDockerCompose.g:2918:7: ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 0);
                    	    						
                    	    // InternalDockerCompose.g:2921:10: ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) )
                    	    // InternalDockerCompose.g:2921:11: {...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2921:20: (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) )
                    	    // InternalDockerCompose.g:2921:21: otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,60,FOLLOW_5); 

                    	    										newLeafNode(otherlv_6, grammarAccess.getNetworkAccess().getDriverKeyword_3_1_0_0());
                    	    									
                    	    // InternalDockerCompose.g:2925:10: ( (lv_driver_7_0= ruleEString ) )
                    	    // InternalDockerCompose.g:2926:11: (lv_driver_7_0= ruleEString )
                    	    {
                    	    // InternalDockerCompose.g:2926:11: (lv_driver_7_0= ruleEString )
                    	    // InternalDockerCompose.g:2927:12: lv_driver_7_0= ruleEString
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getDriverEStringParserRuleCall_3_1_0_1_0());
                    	    											
                    	    pushFollow(FOLLOW_47);
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
                    	    // InternalDockerCompose.g:2950:5: ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2950:5: ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2951:6: {...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 1)");
                    	    }
                    	    // InternalDockerCompose.g:2951:107: ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:2952:7: ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 1);
                    	    						
                    	    // InternalDockerCompose.g:2955:10: ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:2955:11: {...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2955:20: (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:2955:21: otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_8=(Token)match(input,61,FOLLOW_14); 

                    	    										newLeafNode(otherlv_8, grammarAccess.getNetworkAccess().getAttachableKeyword_3_1_1_0());
                    	    									
                    	    // InternalDockerCompose.g:2959:10: ( (lv_attachable_9_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:2960:11: (lv_attachable_9_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:2960:11: (lv_attachable_9_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:2961:12: lv_attachable_9_0= ruleEBoolean
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getAttachableEBooleanParserRuleCall_3_1_1_1_0());
                    	    											
                    	    pushFollow(FOLLOW_47);
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
                    	    // InternalDockerCompose.g:2984:5: ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2984:5: ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2985:6: {...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 2)");
                    	    }
                    	    // InternalDockerCompose.g:2985:107: ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:2986:7: ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 2);
                    	    						
                    	    // InternalDockerCompose.g:2989:10: ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:2989:11: {...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2989:20: (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:2989:21: otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_10=(Token)match(input,62,FOLLOW_14); 

                    	    										newLeafNode(otherlv_10, grammarAccess.getNetworkAccess().getEnable_ipv6Keyword_3_1_2_0());
                    	    									
                    	    // InternalDockerCompose.g:2993:10: ( (lv_enable_ipv6_11_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:2994:11: (lv_enable_ipv6_11_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:2994:11: (lv_enable_ipv6_11_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:2995:12: lv_enable_ipv6_11_0= ruleEBoolean
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getEnable_ipv6EBooleanParserRuleCall_3_1_2_1_0());
                    	    											
                    	    pushFollow(FOLLOW_47);
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
                    	    // InternalDockerCompose.g:3018:5: ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:3018:5: ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:3019:6: {...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 3)");
                    	    }
                    	    // InternalDockerCompose.g:3019:107: ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:3020:7: ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 3);
                    	    						
                    	    // InternalDockerCompose.g:3023:10: ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:3023:11: {...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:3023:20: (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:3023:21: otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_12=(Token)match(input,63,FOLLOW_14); 

                    	    										newLeafNode(otherlv_12, grammarAccess.getNetworkAccess().getInternalKeyword_3_1_3_0());
                    	    									
                    	    // InternalDockerCompose.g:3027:10: ( (lv_internal_13_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:3028:11: (lv_internal_13_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:3028:11: (lv_internal_13_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:3029:12: lv_internal_13_0= ruleEBoolean
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getInternalEBooleanParserRuleCall_3_1_3_1_0());
                    	    											
                    	    pushFollow(FOLLOW_47);
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
                    	    // InternalDockerCompose.g:3052:5: ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:3052:5: ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:3053:6: {...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 4)");
                    	    }
                    	    // InternalDockerCompose.g:3053:107: ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:3054:7: ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 4);
                    	    						
                    	    // InternalDockerCompose.g:3057:10: ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:3057:11: {...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:3057:20: (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:3057:21: otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_14=(Token)match(input,64,FOLLOW_14); 

                    	    										newLeafNode(otherlv_14, grammarAccess.getNetworkAccess().getExternalKeyword_3_1_4_0());
                    	    									
                    	    // InternalDockerCompose.g:3061:10: ( (lv_external_15_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:3062:11: (lv_external_15_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:3062:11: (lv_external_15_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:3063:12: lv_external_15_0= ruleEBoolean
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getExternalEBooleanParserRuleCall_3_1_4_1_0());
                    	    											
                    	    pushFollow(FOLLOW_47);
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
                    	    // InternalDockerCompose.g:3086:5: ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:3086:5: ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) )
                    	    // InternalDockerCompose.g:3087:6: {...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 5)");
                    	    }
                    	    // InternalDockerCompose.g:3087:107: ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) )
                    	    // InternalDockerCompose.g:3088:7: ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 5);
                    	    						
                    	    // InternalDockerCompose.g:3091:10: ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) )
                    	    // InternalDockerCompose.g:3091:11: {...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:3091:20: (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) )
                    	    // InternalDockerCompose.g:3091:21: otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,65,FOLLOW_5); 

                    	    										newLeafNode(otherlv_16, grammarAccess.getNetworkAccess().getNameKeyword_3_1_5_0());
                    	    									
                    	    // InternalDockerCompose.g:3095:10: ( (lv_network_name_17_0= ruleEString ) )
                    	    // InternalDockerCompose.g:3096:11: (lv_network_name_17_0= ruleEString )
                    	    {
                    	    // InternalDockerCompose.g:3096:11: (lv_network_name_17_0= ruleEString )
                    	    // InternalDockerCompose.g:3097:12: lv_network_name_17_0= ruleEString
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getNetwork_nameEStringParserRuleCall_3_1_5_1_0());
                    	    											
                    	    pushFollow(FOLLOW_47);
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
                    	    // InternalDockerCompose.g:3120:5: ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:3120:5: ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) )
                    	    // InternalDockerCompose.g:3121:6: {...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 6) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 6)");
                    	    }
                    	    // InternalDockerCompose.g:3121:107: ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) )
                    	    // InternalDockerCompose.g:3122:7: ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 6);
                    	    						
                    	    // InternalDockerCompose.g:3125:10: ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) )
                    	    // InternalDockerCompose.g:3125:11: {...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:3125:20: (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ )
                    	    // InternalDockerCompose.g:3125:21: otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+
                    	    {
                    	    otherlv_18=(Token)match(input,66,FOLLOW_5); 

                    	    										newLeafNode(otherlv_18, grammarAccess.getNetworkAccess().getLabelsKeyword_3_1_6_0());
                    	    									
                    	    // InternalDockerCompose.g:3129:10: ( (lv_labels_19_0= ruleNetworkLabel ) )+
                    	    int cnt47=0;
                    	    loop47:
                    	    do {
                    	        int alt47=2;
                    	        int LA47_0 = input.LA(1);

                    	        if ( (LA47_0==RULE_STRING) ) {
                    	            int LA47_2 = input.LA(2);

                    	            if ( (LA47_2==22) ) {
                    	                int LA47_4 = input.LA(3);

                    	                if ( (LA47_4==RULE_STRING) ) {
                    	                    int LA47_5 = input.LA(4);

                    	                    if ( (LA47_5==EOF||LA47_5==RULE_ID||LA47_5==RULE_STRING||(LA47_5>=16 && LA47_5<=21)||(LA47_5>=60 && LA47_5<=68)) ) {
                    	                        alt47=1;
                    	                    }


                    	                }
                    	                else if ( (LA47_4==RULE_ID) ) {
                    	                    int LA47_6 = input.LA(4);

                    	                    if ( (LA47_6==EOF||LA47_6==RULE_ID||LA47_6==RULE_STRING||(LA47_6>=16 && LA47_6<=21)||(LA47_6>=60 && LA47_6<=68)) ) {
                    	                        alt47=1;
                    	                    }


                    	                }


                    	            }


                    	        }
                    	        else if ( (LA47_0==RULE_ID) ) {
                    	            int LA47_3 = input.LA(2);

                    	            if ( (LA47_3==22) ) {
                    	                int LA47_4 = input.LA(3);

                    	                if ( (LA47_4==RULE_STRING) ) {
                    	                    int LA47_5 = input.LA(4);

                    	                    if ( (LA47_5==EOF||LA47_5==RULE_ID||LA47_5==RULE_STRING||(LA47_5>=16 && LA47_5<=21)||(LA47_5>=60 && LA47_5<=68)) ) {
                    	                        alt47=1;
                    	                    }


                    	                }
                    	                else if ( (LA47_4==RULE_ID) ) {
                    	                    int LA47_6 = input.LA(4);

                    	                    if ( (LA47_6==EOF||LA47_6==RULE_ID||LA47_6==RULE_STRING||(LA47_6>=16 && LA47_6<=21)||(LA47_6>=60 && LA47_6<=68)) ) {
                    	                        alt47=1;
                    	                    }


                    	                }


                    	            }


                    	        }


                    	        switch (alt47) {
                    	    	case 1 :
                    	    	    // InternalDockerCompose.g:3130:11: (lv_labels_19_0= ruleNetworkLabel )
                    	    	    {
                    	    	    // InternalDockerCompose.g:3130:11: (lv_labels_19_0= ruleNetworkLabel )
                    	    	    // InternalDockerCompose.g:3131:12: lv_labels_19_0= ruleNetworkLabel
                    	    	    {

                    	    	    												newCompositeNode(grammarAccess.getNetworkAccess().getLabelsNetworkLabelParserRuleCall_3_1_6_1_0());
                    	    	    											
                    	    	    pushFollow(FOLLOW_48);
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
                    	    	    if ( cnt47 >= 1 ) break loop47;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(47, input);
                    	                throw eee;
                    	        }
                    	        cnt47++;
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 8 :
                    	    // InternalDockerCompose.g:3154:5: ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:3154:5: ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) )
                    	    // InternalDockerCompose.g:3155:6: {...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 7) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 7)");
                    	    }
                    	    // InternalDockerCompose.g:3155:107: ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) )
                    	    // InternalDockerCompose.g:3156:7: ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 7);
                    	    						
                    	    // InternalDockerCompose.g:3159:10: ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) )
                    	    // InternalDockerCompose.g:3159:11: {...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:3159:20: (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ )
                    	    // InternalDockerCompose.g:3159:21: otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+
                    	    {
                    	    otherlv_20=(Token)match(input,67,FOLLOW_5); 

                    	    										newLeafNode(otherlv_20, grammarAccess.getNetworkAccess().getDriver_optsKeyword_3_1_7_0());
                    	    									
                    	    // InternalDockerCompose.g:3163:10: ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+
                    	    int cnt48=0;
                    	    loop48:
                    	    do {
                    	        int alt48=2;
                    	        int LA48_0 = input.LA(1);

                    	        if ( (LA48_0==RULE_STRING) ) {
                    	            int LA48_2 = input.LA(2);

                    	            if ( (LA48_2==22) ) {
                    	                int LA48_4 = input.LA(3);

                    	                if ( (LA48_4==RULE_STRING) ) {
                    	                    int LA48_5 = input.LA(4);

                    	                    if ( (LA48_5==EOF||LA48_5==RULE_ID||LA48_5==RULE_STRING||(LA48_5>=16 && LA48_5<=21)||(LA48_5>=60 && LA48_5<=68)) ) {
                    	                        alt48=1;
                    	                    }


                    	                }
                    	                else if ( (LA48_4==RULE_ID) ) {
                    	                    int LA48_6 = input.LA(4);

                    	                    if ( (LA48_6==EOF||LA48_6==RULE_ID||LA48_6==RULE_STRING||(LA48_6>=16 && LA48_6<=21)||(LA48_6>=60 && LA48_6<=68)) ) {
                    	                        alt48=1;
                    	                    }


                    	                }


                    	            }


                    	        }
                    	        else if ( (LA48_0==RULE_ID) ) {
                    	            int LA48_3 = input.LA(2);

                    	            if ( (LA48_3==22) ) {
                    	                int LA48_4 = input.LA(3);

                    	                if ( (LA48_4==RULE_STRING) ) {
                    	                    int LA48_5 = input.LA(4);

                    	                    if ( (LA48_5==EOF||LA48_5==RULE_ID||LA48_5==RULE_STRING||(LA48_5>=16 && LA48_5<=21)||(LA48_5>=60 && LA48_5<=68)) ) {
                    	                        alt48=1;
                    	                    }


                    	                }
                    	                else if ( (LA48_4==RULE_ID) ) {
                    	                    int LA48_6 = input.LA(4);

                    	                    if ( (LA48_6==EOF||LA48_6==RULE_ID||LA48_6==RULE_STRING||(LA48_6>=16 && LA48_6<=21)||(LA48_6>=60 && LA48_6<=68)) ) {
                    	                        alt48=1;
                    	                    }


                    	                }


                    	            }


                    	        }


                    	        switch (alt48) {
                    	    	case 1 :
                    	    	    // InternalDockerCompose.g:3164:11: (lv_driver_opts_21_0= ruleNetworkDriverOpt )
                    	    	    {
                    	    	    // InternalDockerCompose.g:3164:11: (lv_driver_opts_21_0= ruleNetworkDriverOpt )
                    	    	    // InternalDockerCompose.g:3165:12: lv_driver_opts_21_0= ruleNetworkDriverOpt
                    	    	    {

                    	    	    												newCompositeNode(grammarAccess.getNetworkAccess().getDriver_optsNetworkDriverOptParserRuleCall_3_1_7_1_0());
                    	    	    											
                    	    	    pushFollow(FOLLOW_48);
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
                    	    	    if ( cnt48 >= 1 ) break loop48;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(48, input);
                    	                throw eee;
                    	        }
                    	        cnt48++;
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 9 :
                    	    // InternalDockerCompose.g:3188:5: ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:3188:5: ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) )
                    	    // InternalDockerCompose.g:3189:6: {...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 8) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 8)");
                    	    }
                    	    // InternalDockerCompose.g:3189:107: ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) )
                    	    // InternalDockerCompose.g:3190:7: ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 8);
                    	    						
                    	    // InternalDockerCompose.g:3193:10: ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) )
                    	    // InternalDockerCompose.g:3193:11: {...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:3193:20: (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) )
                    	    // InternalDockerCompose.g:3193:21: otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) )
                    	    {
                    	    otherlv_22=(Token)match(input,68,FOLLOW_49); 

                    	    										newLeafNode(otherlv_22, grammarAccess.getNetworkAccess().getIpamKeyword_3_1_8_0());
                    	    									
                    	    // InternalDockerCompose.g:3197:10: ( (lv_ipam_23_0= ruleIPAM ) )
                    	    // InternalDockerCompose.g:3198:11: (lv_ipam_23_0= ruleIPAM )
                    	    {
                    	    // InternalDockerCompose.g:3198:11: (lv_ipam_23_0= ruleIPAM )
                    	    // InternalDockerCompose.g:3199:12: lv_ipam_23_0= ruleIPAM
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getIpamIPAMParserRuleCall_3_1_8_1_0());
                    	    											
                    	    pushFollow(FOLLOW_47);
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
                    	    break loop49;
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
    // InternalDockerCompose.g:3234:1: entryRuleVolume returns [EObject current=null] : iv_ruleVolume= ruleVolume EOF ;
    public final EObject entryRuleVolume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolume = null;


        try {
            // InternalDockerCompose.g:3234:47: (iv_ruleVolume= ruleVolume EOF )
            // InternalDockerCompose.g:3235:2: iv_ruleVolume= ruleVolume EOF
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
    // InternalDockerCompose.g:3241:1: ruleVolume returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleVolume() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_external_5_0 = null;

        AntlrDatatypeRuleToken lv_driver_7_0 = null;

        AntlrDatatypeRuleToken lv_volume_name_9_0 = null;

        EObject lv_labels_11_0 = null;

        EObject lv_driver_opts_13_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3247:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:3248:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:3248:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:3249:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:3249:3: ()
            // InternalDockerCompose.g:3250:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeAccess().getVolumeAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3256:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3257:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3257:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3258:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVolumeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVolumeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getVolumeAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:3279:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:3280:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:3280:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) )
            // InternalDockerCompose.g:3281:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getVolumeAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:3284:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* )
            // InternalDockerCompose.g:3285:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )*
            {
            // InternalDockerCompose.g:3285:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )*
            loop53:
            do {
                int alt53=6;
                int LA53_0 = input.LA(1);

                if ( LA53_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 0) ) {
                    alt53=1;
                }
                else if ( LA53_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 1) ) {
                    alt53=2;
                }
                else if ( LA53_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 2) ) {
                    alt53=3;
                }
                else if ( LA53_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 3) ) {
                    alt53=4;
                }
                else if ( LA53_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 4) ) {
                    alt53=5;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalDockerCompose.g:3286:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3286:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:3287:5: {...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDockerCompose.g:3287:103: ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:3288:6: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDockerCompose.g:3291:9: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:3291:10: {...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:3291:19: (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:3291:20: otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) )
            	    {
            	    otherlv_4=(Token)match(input,64,FOLLOW_14); 

            	    									newLeafNode(otherlv_4, grammarAccess.getVolumeAccess().getExternalKeyword_3_0_0());
            	    								
            	    // InternalDockerCompose.g:3295:9: ( (lv_external_5_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:3296:10: (lv_external_5_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:3296:10: (lv_external_5_0= ruleEBoolean )
            	    // InternalDockerCompose.g:3297:11: lv_external_5_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeAccess().getExternalEBooleanParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_50);
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
            	    // InternalDockerCompose.g:3320:4: ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3320:4: ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3321:5: {...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDockerCompose.g:3321:103: ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3322:6: ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDockerCompose.g:3325:9: ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3325:10: {...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:3325:19: (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3325:20: otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,60,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getVolumeAccess().getDriverKeyword_3_1_0());
            	    								
            	    // InternalDockerCompose.g:3329:9: ( (lv_driver_7_0= ruleEString ) )
            	    // InternalDockerCompose.g:3330:10: (lv_driver_7_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3330:10: (lv_driver_7_0= ruleEString )
            	    // InternalDockerCompose.g:3331:11: lv_driver_7_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeAccess().getDriverEStringParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_50);
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
            	    // InternalDockerCompose.g:3354:4: ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3354:4: ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3355:5: {...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:3355:103: ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3356:6: ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:3359:9: ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3359:10: {...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:3359:19: (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3359:20: otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,65,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getVolumeAccess().getNameKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:3363:9: ( (lv_volume_name_9_0= ruleEString ) )
            	    // InternalDockerCompose.g:3364:10: (lv_volume_name_9_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3364:10: (lv_volume_name_9_0= ruleEString )
            	    // InternalDockerCompose.g:3365:11: lv_volume_name_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeAccess().getVolume_nameEStringParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_50);
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
            	    // InternalDockerCompose.g:3388:4: ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3388:4: ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) )
            	    // InternalDockerCompose.g:3389:5: {...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalDockerCompose.g:3389:103: ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) )
            	    // InternalDockerCompose.g:3390:6: ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalDockerCompose.g:3393:9: ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) )
            	    // InternalDockerCompose.g:3393:10: {...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:3393:19: (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ )
            	    // InternalDockerCompose.g:3393:20: otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+
            	    {
            	    otherlv_10=(Token)match(input,66,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getVolumeAccess().getLabelsKeyword_3_3_0());
            	    								
            	    // InternalDockerCompose.g:3397:9: ( (lv_labels_11_0= ruleVolumeLabel ) )+
            	    int cnt51=0;
            	    loop51:
            	    do {
            	        int alt51=2;
            	        int LA51_0 = input.LA(1);

            	        if ( (LA51_0==RULE_STRING) ) {
            	            int LA51_2 = input.LA(2);

            	            if ( (LA51_2==22) ) {
            	                int LA51_4 = input.LA(3);

            	                if ( (LA51_4==RULE_STRING) ) {
            	                    int LA51_5 = input.LA(4);

            	                    if ( (LA51_5==EOF||LA51_5==RULE_ID||LA51_5==RULE_STRING||(LA51_5>=16 && LA51_5<=21)||LA51_5==60||(LA51_5>=64 && LA51_5<=67)) ) {
            	                        alt51=1;
            	                    }


            	                }
            	                else if ( (LA51_4==RULE_ID) ) {
            	                    int LA51_6 = input.LA(4);

            	                    if ( (LA51_6==EOF||LA51_6==RULE_ID||LA51_6==RULE_STRING||(LA51_6>=16 && LA51_6<=21)||LA51_6==60||(LA51_6>=64 && LA51_6<=67)) ) {
            	                        alt51=1;
            	                    }


            	                }


            	            }


            	        }
            	        else if ( (LA51_0==RULE_ID) ) {
            	            int LA51_3 = input.LA(2);

            	            if ( (LA51_3==22) ) {
            	                int LA51_4 = input.LA(3);

            	                if ( (LA51_4==RULE_STRING) ) {
            	                    int LA51_5 = input.LA(4);

            	                    if ( (LA51_5==EOF||LA51_5==RULE_ID||LA51_5==RULE_STRING||(LA51_5>=16 && LA51_5<=21)||LA51_5==60||(LA51_5>=64 && LA51_5<=67)) ) {
            	                        alt51=1;
            	                    }


            	                }
            	                else if ( (LA51_4==RULE_ID) ) {
            	                    int LA51_6 = input.LA(4);

            	                    if ( (LA51_6==EOF||LA51_6==RULE_ID||LA51_6==RULE_STRING||(LA51_6>=16 && LA51_6<=21)||LA51_6==60||(LA51_6>=64 && LA51_6<=67)) ) {
            	                        alt51=1;
            	                    }


            	                }


            	            }


            	        }


            	        switch (alt51) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:3398:10: (lv_labels_11_0= ruleVolumeLabel )
            	    	    {
            	    	    // InternalDockerCompose.g:3398:10: (lv_labels_11_0= ruleVolumeLabel )
            	    	    // InternalDockerCompose.g:3399:11: lv_labels_11_0= ruleVolumeLabel
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getVolumeAccess().getLabelsVolumeLabelParserRuleCall_3_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_51);
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
            	    	    if ( cnt51 >= 1 ) break loop51;
            	                EarlyExitException eee =
            	                    new EarlyExitException(51, input);
            	                throw eee;
            	        }
            	        cnt51++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDockerCompose.g:3422:4: ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3422:4: ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) )
            	    // InternalDockerCompose.g:3423:5: {...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalDockerCompose.g:3423:103: ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) )
            	    // InternalDockerCompose.g:3424:6: ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalDockerCompose.g:3427:9: ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) )
            	    // InternalDockerCompose.g:3427:10: {...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:3427:19: (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ )
            	    // InternalDockerCompose.g:3427:20: otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+
            	    {
            	    otherlv_12=(Token)match(input,67,FOLLOW_5); 

            	    									newLeafNode(otherlv_12, grammarAccess.getVolumeAccess().getDriver_optsKeyword_3_4_0());
            	    								
            	    // InternalDockerCompose.g:3431:9: ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+
            	    int cnt52=0;
            	    loop52:
            	    do {
            	        int alt52=2;
            	        int LA52_0 = input.LA(1);

            	        if ( (LA52_0==RULE_STRING) ) {
            	            int LA52_2 = input.LA(2);

            	            if ( (LA52_2==22) ) {
            	                int LA52_4 = input.LA(3);

            	                if ( (LA52_4==RULE_STRING) ) {
            	                    int LA52_5 = input.LA(4);

            	                    if ( (LA52_5==EOF||LA52_5==RULE_ID||LA52_5==RULE_STRING||(LA52_5>=16 && LA52_5<=21)||LA52_5==60||(LA52_5>=64 && LA52_5<=67)) ) {
            	                        alt52=1;
            	                    }


            	                }
            	                else if ( (LA52_4==RULE_ID) ) {
            	                    int LA52_6 = input.LA(4);

            	                    if ( (LA52_6==EOF||LA52_6==RULE_ID||LA52_6==RULE_STRING||(LA52_6>=16 && LA52_6<=21)||LA52_6==60||(LA52_6>=64 && LA52_6<=67)) ) {
            	                        alt52=1;
            	                    }


            	                }


            	            }


            	        }
            	        else if ( (LA52_0==RULE_ID) ) {
            	            int LA52_3 = input.LA(2);

            	            if ( (LA52_3==22) ) {
            	                int LA52_4 = input.LA(3);

            	                if ( (LA52_4==RULE_STRING) ) {
            	                    int LA52_5 = input.LA(4);

            	                    if ( (LA52_5==EOF||LA52_5==RULE_ID||LA52_5==RULE_STRING||(LA52_5>=16 && LA52_5<=21)||LA52_5==60||(LA52_5>=64 && LA52_5<=67)) ) {
            	                        alt52=1;
            	                    }


            	                }
            	                else if ( (LA52_4==RULE_ID) ) {
            	                    int LA52_6 = input.LA(4);

            	                    if ( (LA52_6==EOF||LA52_6==RULE_ID||LA52_6==RULE_STRING||(LA52_6>=16 && LA52_6<=21)||LA52_6==60||(LA52_6>=64 && LA52_6<=67)) ) {
            	                        alt52=1;
            	                    }


            	                }


            	            }


            	        }


            	        switch (alt52) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:3432:10: (lv_driver_opts_13_0= ruleVolumeDriverOpt )
            	    	    {
            	    	    // InternalDockerCompose.g:3432:10: (lv_driver_opts_13_0= ruleVolumeDriverOpt )
            	    	    // InternalDockerCompose.g:3433:11: lv_driver_opts_13_0= ruleVolumeDriverOpt
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getVolumeAccess().getDriver_optsVolumeDriverOptParserRuleCall_3_4_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_51);
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
            	    	    if ( cnt52 >= 1 ) break loop52;
            	                EarlyExitException eee =
            	                    new EarlyExitException(52, input);
            	                throw eee;
            	        }
            	        cnt52++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeAccess().getUnorderedGroup_3());
            	    					

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
    // InternalDockerCompose.g:3467:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalDockerCompose.g:3467:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalDockerCompose.g:3468:2: iv_ruleConfig= ruleConfig EOF
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
    // InternalDockerCompose.g:3474:1: ruleConfig returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_external_5_0 = null;

        AntlrDatatypeRuleToken lv_file_7_0 = null;

        AntlrDatatypeRuleToken lv_config_name_9_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3480:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:3481:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:3481:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:3482:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:3482:3: ()
            // InternalDockerCompose.g:3483:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigAccess().getConfigAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3489:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3490:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3490:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3491:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConfigAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:3512:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:3513:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:3513:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalDockerCompose.g:3514:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getConfigAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:3517:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* )
            // InternalDockerCompose.g:3518:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalDockerCompose.g:3518:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )*
            loop54:
            do {
                int alt54=4;
                int LA54_0 = input.LA(1);

                if ( LA54_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 0) ) {
                    alt54=1;
                }
                else if ( LA54_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 1) ) {
                    alt54=2;
                }
                else if ( LA54_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 2) ) {
                    alt54=3;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalDockerCompose.g:3519:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3519:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:3520:5: {...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDockerCompose.g:3520:103: ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:3521:6: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDockerCompose.g:3524:9: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:3524:10: {...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    }
            	    // InternalDockerCompose.g:3524:19: (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:3524:20: otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) )
            	    {
            	    otherlv_4=(Token)match(input,64,FOLLOW_14); 

            	    									newLeafNode(otherlv_4, grammarAccess.getConfigAccess().getExternalKeyword_3_0_0());
            	    								
            	    // InternalDockerCompose.g:3528:9: ( (lv_external_5_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:3529:10: (lv_external_5_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:3529:10: (lv_external_5_0= ruleEBoolean )
            	    // InternalDockerCompose.g:3530:11: lv_external_5_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getConfigAccess().getExternalEBooleanParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_52);
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
            	    // InternalDockerCompose.g:3553:4: ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3553:4: ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3554:5: {...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDockerCompose.g:3554:103: ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3555:6: ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDockerCompose.g:3558:9: ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3558:10: {...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    }
            	    // InternalDockerCompose.g:3558:19: (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3558:20: otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,69,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getConfigAccess().getFileKeyword_3_1_0());
            	    								
            	    // InternalDockerCompose.g:3562:9: ( (lv_file_7_0= ruleEString ) )
            	    // InternalDockerCompose.g:3563:10: (lv_file_7_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3563:10: (lv_file_7_0= ruleEString )
            	    // InternalDockerCompose.g:3564:11: lv_file_7_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getConfigAccess().getFileEStringParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_52);
            	    lv_file_7_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getConfigRule());
            	    											}
            	    											set(
            	    												current,
            	    												"file",
            	    												lv_file_7_0,
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
            	case 3 :
            	    // InternalDockerCompose.g:3587:4: ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3587:4: ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3588:5: {...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:3588:103: ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3589:6: ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:3592:9: ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3592:10: {...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    }
            	    // InternalDockerCompose.g:3592:19: (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3592:20: otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,65,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getConfigAccess().getNameKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:3596:9: ( (lv_config_name_9_0= ruleEString ) )
            	    // InternalDockerCompose.g:3597:10: (lv_config_name_9_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3597:10: (lv_config_name_9_0= ruleEString )
            	    // InternalDockerCompose.g:3598:11: lv_config_name_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getConfigAccess().getConfig_nameEStringParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_52);
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
            	    break loop54;
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
    // InternalDockerCompose.g:3632:1: entryRuleSecret returns [EObject current=null] : iv_ruleSecret= ruleSecret EOF ;
    public final EObject entryRuleSecret() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecret = null;


        try {
            // InternalDockerCompose.g:3632:47: (iv_ruleSecret= ruleSecret EOF )
            // InternalDockerCompose.g:3633:2: iv_ruleSecret= ruleSecret EOF
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
    // InternalDockerCompose.g:3639:1: ruleSecret returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleSecret() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_external_5_0 = null;

        AntlrDatatypeRuleToken lv_file_7_0 = null;

        AntlrDatatypeRuleToken lv_environment_9_0 = null;

        AntlrDatatypeRuleToken lv_secret_name_11_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3645:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:3646:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:3646:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:3647:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:3647:3: ()
            // InternalDockerCompose.g:3648:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecretAccess().getSecretAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3654:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3655:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3655:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3656:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSecretAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecretRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getSecretAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:3677:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:3678:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:3678:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalDockerCompose.g:3679:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSecretAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:3682:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* )
            // InternalDockerCompose.g:3683:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalDockerCompose.g:3683:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )*
            loop55:
            do {
                int alt55=5;
                int LA55_0 = input.LA(1);

                if ( LA55_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 0) ) {
                    alt55=1;
                }
                else if ( LA55_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 1) ) {
                    alt55=2;
                }
                else if ( LA55_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 2) ) {
                    alt55=3;
                }
                else if ( LA55_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 3) ) {
                    alt55=4;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalDockerCompose.g:3684:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3684:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:3685:5: {...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDockerCompose.g:3685:103: ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:3686:6: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDockerCompose.g:3689:9: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:3689:10: {...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "true");
            	    }
            	    // InternalDockerCompose.g:3689:19: (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:3689:20: otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) )
            	    {
            	    otherlv_4=(Token)match(input,64,FOLLOW_14); 

            	    									newLeafNode(otherlv_4, grammarAccess.getSecretAccess().getExternalKeyword_3_0_0());
            	    								
            	    // InternalDockerCompose.g:3693:9: ( (lv_external_5_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:3694:10: (lv_external_5_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:3694:10: (lv_external_5_0= ruleEBoolean )
            	    // InternalDockerCompose.g:3695:11: lv_external_5_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getSecretAccess().getExternalEBooleanParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_53);
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
            	    // InternalDockerCompose.g:3718:4: ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3718:4: ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3719:5: {...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDockerCompose.g:3719:103: ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3720:6: ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDockerCompose.g:3723:9: ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3723:10: {...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "true");
            	    }
            	    // InternalDockerCompose.g:3723:19: (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3723:20: otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,69,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getSecretAccess().getFileKeyword_3_1_0());
            	    								
            	    // InternalDockerCompose.g:3727:9: ( (lv_file_7_0= ruleEString ) )
            	    // InternalDockerCompose.g:3728:10: (lv_file_7_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3728:10: (lv_file_7_0= ruleEString )
            	    // InternalDockerCompose.g:3729:11: lv_file_7_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getSecretAccess().getFileEStringParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_53);
            	    lv_file_7_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSecretRule());
            	    											}
            	    											set(
            	    												current,
            	    												"file",
            	    												lv_file_7_0,
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
            	case 3 :
            	    // InternalDockerCompose.g:3752:4: ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3752:4: ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3753:5: {...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:3753:103: ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3754:6: ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:3757:9: ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3757:10: {...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "true");
            	    }
            	    // InternalDockerCompose.g:3757:19: (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3757:20: otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,34,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getSecretAccess().getEnvironmentKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:3761:9: ( (lv_environment_9_0= ruleEString ) )
            	    // InternalDockerCompose.g:3762:10: (lv_environment_9_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3762:10: (lv_environment_9_0= ruleEString )
            	    // InternalDockerCompose.g:3763:11: lv_environment_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getSecretAccess().getEnvironmentEStringParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_53);
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
            	    // InternalDockerCompose.g:3786:4: ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3786:4: ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3787:5: {...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalDockerCompose.g:3787:103: ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3788:6: ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalDockerCompose.g:3791:9: ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3791:10: {...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "true");
            	    }
            	    // InternalDockerCompose.g:3791:19: (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3791:20: otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,65,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getSecretAccess().getNameKeyword_3_3_0());
            	    								
            	    // InternalDockerCompose.g:3795:9: ( (lv_secret_name_11_0= ruleEString ) )
            	    // InternalDockerCompose.g:3796:10: (lv_secret_name_11_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3796:10: (lv_secret_name_11_0= ruleEString )
            	    // InternalDockerCompose.g:3797:11: lv_secret_name_11_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getSecretAccess().getSecret_nameEStringParserRuleCall_3_3_1_0());
            	    										
            	    pushFollow(FOLLOW_53);
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
            	    break loop55;
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
    // InternalDockerCompose.g:3831:1: entryRuleVolumeLabel returns [EObject current=null] : iv_ruleVolumeLabel= ruleVolumeLabel EOF ;
    public final EObject entryRuleVolumeLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumeLabel = null;


        try {
            // InternalDockerCompose.g:3831:52: (iv_ruleVolumeLabel= ruleVolumeLabel EOF )
            // InternalDockerCompose.g:3832:2: iv_ruleVolumeLabel= ruleVolumeLabel EOF
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
    // InternalDockerCompose.g:3838:1: ruleVolumeLabel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleVolumeLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3844:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:3845:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:3845:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:3846:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:3846:3: ()
            // InternalDockerCompose.g:3847:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeLabelAccess().getVolumeLabelAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3853:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3854:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3854:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3855:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVolumeLabelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_2=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getVolumeLabelAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:3876:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:3877:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:3877:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:3878:5: lv_value_3_0= ruleEString
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
    // InternalDockerCompose.g:3899:1: entryRuleVolumeDriverOpt returns [EObject current=null] : iv_ruleVolumeDriverOpt= ruleVolumeDriverOpt EOF ;
    public final EObject entryRuleVolumeDriverOpt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumeDriverOpt = null;


        try {
            // InternalDockerCompose.g:3899:56: (iv_ruleVolumeDriverOpt= ruleVolumeDriverOpt EOF )
            // InternalDockerCompose.g:3900:2: iv_ruleVolumeDriverOpt= ruleVolumeDriverOpt EOF
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
    // InternalDockerCompose.g:3906:1: ruleVolumeDriverOpt returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleVolumeDriverOpt() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3912:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:3913:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:3913:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:3914:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:3914:3: ()
            // InternalDockerCompose.g:3915:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeDriverOptAccess().getVolumeDriverOptAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3921:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3922:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3922:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3923:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVolumeDriverOptAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_2=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getVolumeDriverOptAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:3944:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:3945:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:3945:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:3946:5: lv_value_3_0= ruleEString
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
    // InternalDockerCompose.g:3967:1: entryRuleNetworkLabel returns [EObject current=null] : iv_ruleNetworkLabel= ruleNetworkLabel EOF ;
    public final EObject entryRuleNetworkLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkLabel = null;


        try {
            // InternalDockerCompose.g:3967:53: (iv_ruleNetworkLabel= ruleNetworkLabel EOF )
            // InternalDockerCompose.g:3968:2: iv_ruleNetworkLabel= ruleNetworkLabel EOF
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
    // InternalDockerCompose.g:3974:1: ruleNetworkLabel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleNetworkLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3980:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:3981:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:3981:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:3982:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:3982:3: ()
            // InternalDockerCompose.g:3983:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkLabelAccess().getNetworkLabelAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3989:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3990:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3990:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3991:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNetworkLabelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkLabelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.dockercompose.DockerCompose.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkLabelAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:4012:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:4013:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:4013:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:4014:5: lv_value_3_0= ruleEString
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
    // InternalDockerCompose.g:4035:1: entryRuleNetworkDriverOpt returns [EObject current=null] : iv_ruleNetworkDriverOpt= ruleNetworkDriverOpt EOF ;
    public final EObject entryRuleNetworkDriverOpt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkDriverOpt = null;


        try {
            // InternalDockerCompose.g:4035:57: (iv_ruleNetworkDriverOpt= ruleNetworkDriverOpt EOF )
            // InternalDockerCompose.g:4036:2: iv_ruleNetworkDriverOpt= ruleNetworkDriverOpt EOF
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
    // InternalDockerCompose.g:4042:1: ruleNetworkDriverOpt returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleNetworkDriverOpt() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:4048:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:4049:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:4049:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:4050:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:4050:3: ()
            // InternalDockerCompose.g:4051:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkDriverOptAccess().getNetworkDriverOptAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:4057:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:4058:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:4058:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:4059:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNetworkDriverOptAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_2=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkDriverOptAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:4080:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:4081:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:4081:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:4082:5: lv_value_3_0= ruleEString
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
    // InternalDockerCompose.g:4103:1: entryRuleIPAM returns [EObject current=null] : iv_ruleIPAM= ruleIPAM EOF ;
    public final EObject entryRuleIPAM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAM = null;


        try {
            // InternalDockerCompose.g:4103:45: (iv_ruleIPAM= ruleIPAM EOF )
            // InternalDockerCompose.g:4104:2: iv_ruleIPAM= ruleIPAM EOF
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
    // InternalDockerCompose.g:4110:1: ruleIPAM returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) ) ) ;
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
            // InternalDockerCompose.g:4116:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:4117:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:4117:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:4118:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:4118:3: ()
            // InternalDockerCompose.g:4119:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIPAMAccess().getIPAMAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:4125:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:4126:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:4126:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) )
            // InternalDockerCompose.g:4127:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIPAMAccess().getUnorderedGroup_1());
            				
            // InternalDockerCompose.g:4130:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* )
            // InternalDockerCompose.g:4131:6: ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )*
            {
            // InternalDockerCompose.g:4131:6: ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )*
            loop58:
            do {
                int alt58=4;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==60) ) {
                    int LA58_2 = input.LA(2);

                    if ( (LA58_2==RULE_STRING) ) {
                        int LA58_5 = input.LA(3);

                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {
                            alt58=1;
                        }


                    }
                    else if ( (LA58_2==RULE_ID) ) {
                        int LA58_6 = input.LA(3);

                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {
                            alt58=1;
                        }


                    }


                }
                else if ( LA58_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 1) ) {
                    alt58=2;
                }
                else if ( LA58_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 2) ) {
                    alt58=3;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalDockerCompose.g:4132:4: ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:4132:4: ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:4133:5: {...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalDockerCompose.g:4133:101: ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:4134:6: ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalDockerCompose.g:4137:9: ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:4137:10: {...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "true");
            	    }
            	    // InternalDockerCompose.g:4137:19: (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:4137:20: otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,60,FOLLOW_5); 

            	    									newLeafNode(otherlv_2, grammarAccess.getIPAMAccess().getDriverKeyword_1_0_0());
            	    								
            	    // InternalDockerCompose.g:4141:9: ( (lv_driver_3_0= ruleEString ) )
            	    // InternalDockerCompose.g:4142:10: (lv_driver_3_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:4142:10: (lv_driver_3_0= ruleEString )
            	    // InternalDockerCompose.g:4143:11: lv_driver_3_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getIPAMAccess().getDriverEStringParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_54);
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
            	    // InternalDockerCompose.g:4166:4: ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:4166:4: ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:4167:5: {...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalDockerCompose.g:4167:101: ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) )
            	    // InternalDockerCompose.g:4168:6: ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalDockerCompose.g:4171:9: ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) )
            	    // InternalDockerCompose.g:4171:10: {...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "true");
            	    }
            	    // InternalDockerCompose.g:4171:19: (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ )
            	    // InternalDockerCompose.g:4171:20: otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+
            	    {
            	    otherlv_4=(Token)match(input,70,FOLLOW_15); 

            	    									newLeafNode(otherlv_4, grammarAccess.getIPAMAccess().getConfigKeyword_1_1_0());
            	    								
            	    // InternalDockerCompose.g:4175:9: (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+
            	    int cnt56=0;
            	    loop56:
            	    do {
            	        int alt56=2;
            	        int LA56_0 = input.LA(1);

            	        if ( (LA56_0==32) ) {
            	            alt56=1;
            	        }


            	        switch (alt56) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:4176:10: otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,32,FOLLOW_55); 

            	    	    										newLeafNode(otherlv_5, grammarAccess.getIPAMAccess().getHyphenMinusKeyword_1_1_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:4180:10: ( (lv_configs_6_0= ruleIPAMConfig ) )
            	    	    // InternalDockerCompose.g:4181:11: (lv_configs_6_0= ruleIPAMConfig )
            	    	    {
            	    	    // InternalDockerCompose.g:4181:11: (lv_configs_6_0= ruleIPAMConfig )
            	    	    // InternalDockerCompose.g:4182:12: lv_configs_6_0= ruleIPAMConfig
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getIPAMAccess().getConfigsIPAMConfigParserRuleCall_1_1_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_56);
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
            	    	    if ( cnt56 >= 1 ) break loop56;
            	                EarlyExitException eee =
            	                    new EarlyExitException(56, input);
            	                throw eee;
            	        }
            	        cnt56++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIPAMAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDockerCompose.g:4206:4: ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:4206:4: ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) )
            	    // InternalDockerCompose.g:4207:5: {...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalDockerCompose.g:4207:101: ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) )
            	    // InternalDockerCompose.g:4208:6: ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalDockerCompose.g:4211:9: ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) )
            	    // InternalDockerCompose.g:4211:10: {...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "true");
            	    }
            	    // InternalDockerCompose.g:4211:19: (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ )
            	    // InternalDockerCompose.g:4211:20: otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+
            	    {
            	    otherlv_7=(Token)match(input,71,FOLLOW_5); 

            	    									newLeafNode(otherlv_7, grammarAccess.getIPAMAccess().getOptionsKeyword_1_2_0());
            	    								
            	    // InternalDockerCompose.g:4215:9: ( (lv_options_8_0= ruleIPAMOption ) )+
            	    int cnt57=0;
            	    loop57:
            	    do {
            	        int alt57=2;
            	        int LA57_0 = input.LA(1);

            	        if ( (LA57_0==RULE_STRING) ) {
            	            int LA57_2 = input.LA(2);

            	            if ( (LA57_2==22) ) {
            	                int LA57_4 = input.LA(3);

            	                if ( (LA57_4==RULE_STRING) ) {
            	                    int LA57_5 = input.LA(4);

            	                    if ( (LA57_5==EOF||LA57_5==RULE_ID||LA57_5==RULE_STRING||(LA57_5>=16 && LA57_5<=21)||(LA57_5>=60 && LA57_5<=68)||(LA57_5>=70 && LA57_5<=71)) ) {
            	                        alt57=1;
            	                    }


            	                }
            	                else if ( (LA57_4==RULE_ID) ) {
            	                    int LA57_6 = input.LA(4);

            	                    if ( (LA57_6==EOF||LA57_6==RULE_ID||LA57_6==RULE_STRING||(LA57_6>=16 && LA57_6<=21)||(LA57_6>=60 && LA57_6<=68)||(LA57_6>=70 && LA57_6<=71)) ) {
            	                        alt57=1;
            	                    }


            	                }


            	            }


            	        }
            	        else if ( (LA57_0==RULE_ID) ) {
            	            int LA57_3 = input.LA(2);

            	            if ( (LA57_3==22) ) {
            	                int LA57_4 = input.LA(3);

            	                if ( (LA57_4==RULE_STRING) ) {
            	                    int LA57_5 = input.LA(4);

            	                    if ( (LA57_5==EOF||LA57_5==RULE_ID||LA57_5==RULE_STRING||(LA57_5>=16 && LA57_5<=21)||(LA57_5>=60 && LA57_5<=68)||(LA57_5>=70 && LA57_5<=71)) ) {
            	                        alt57=1;
            	                    }


            	                }
            	                else if ( (LA57_4==RULE_ID) ) {
            	                    int LA57_6 = input.LA(4);

            	                    if ( (LA57_6==EOF||LA57_6==RULE_ID||LA57_6==RULE_STRING||(LA57_6>=16 && LA57_6<=21)||(LA57_6>=60 && LA57_6<=68)||(LA57_6>=70 && LA57_6<=71)) ) {
            	                        alt57=1;
            	                    }


            	                }


            	            }


            	        }


            	        switch (alt57) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:4216:10: (lv_options_8_0= ruleIPAMOption )
            	    	    {
            	    	    // InternalDockerCompose.g:4216:10: (lv_options_8_0= ruleIPAMOption )
            	    	    // InternalDockerCompose.g:4217:11: lv_options_8_0= ruleIPAMOption
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getIPAMAccess().getOptionsIPAMOptionParserRuleCall_1_2_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_57);
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
            	    	    if ( cnt57 >= 1 ) break loop57;
            	                EarlyExitException eee =
            	                    new EarlyExitException(57, input);
            	                throw eee;
            	        }
            	        cnt57++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIPAMAccess().getUnorderedGroup_1());
            	    					

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
    // InternalDockerCompose.g:4251:1: entryRuleIPAMConfig returns [EObject current=null] : iv_ruleIPAMConfig= ruleIPAMConfig EOF ;
    public final EObject entryRuleIPAMConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAMConfig = null;


        try {
            // InternalDockerCompose.g:4251:51: (iv_ruleIPAMConfig= ruleIPAMConfig EOF )
            // InternalDockerCompose.g:4252:2: iv_ruleIPAMConfig= ruleIPAMConfig EOF
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
    // InternalDockerCompose.g:4258:1: ruleIPAMConfig returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) ) ) ;
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
            // InternalDockerCompose.g:4264:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:4265:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:4265:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:4266:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:4266:3: ()
            // InternalDockerCompose.g:4267:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIPAMConfigAccess().getIPAMConfigAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:4273:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:4274:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:4274:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) )
            // InternalDockerCompose.g:4275:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1());
            				
            // InternalDockerCompose.g:4278:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* )
            // InternalDockerCompose.g:4279:6: ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )*
            {
            // InternalDockerCompose.g:4279:6: ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )*
            loop60:
            do {
                int alt60=5;
                int LA60_0 = input.LA(1);

                if ( LA60_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 0) ) {
                    alt60=1;
                }
                else if ( LA60_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 1) ) {
                    alt60=2;
                }
                else if ( LA60_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 2) ) {
                    alt60=3;
                }
                else if ( LA60_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 3) ) {
                    alt60=4;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalDockerCompose.g:4280:4: ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:4280:4: ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) )
            	    // InternalDockerCompose.g:4281:5: {...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalDockerCompose.g:4281:107: ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) )
            	    // InternalDockerCompose.g:4282:6: ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalDockerCompose.g:4285:9: ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) )
            	    // InternalDockerCompose.g:4285:10: {...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "true");
            	    }
            	    // InternalDockerCompose.g:4285:19: (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) )
            	    // InternalDockerCompose.g:4285:20: otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) )
            	    {
            	    otherlv_2=(Token)match(input,72,FOLLOW_12); 

            	    									newLeafNode(otherlv_2, grammarAccess.getIPAMConfigAccess().getSubnetKeyword_1_0_0());
            	    								
            	    // InternalDockerCompose.g:4289:9: ( (lv_subnet_3_0= ruleNetworkAddress ) )
            	    // InternalDockerCompose.g:4290:10: (lv_subnet_3_0= ruleNetworkAddress )
            	    {
            	    // InternalDockerCompose.g:4290:10: (lv_subnet_3_0= ruleNetworkAddress )
            	    // InternalDockerCompose.g:4291:11: lv_subnet_3_0= ruleNetworkAddress
            	    {

            	    											newCompositeNode(grammarAccess.getIPAMConfigAccess().getSubnetNetworkAddressParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_58);
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
            	    // InternalDockerCompose.g:4314:4: ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:4314:4: ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) )
            	    // InternalDockerCompose.g:4315:5: {...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalDockerCompose.g:4315:107: ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) )
            	    // InternalDockerCompose.g:4316:6: ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalDockerCompose.g:4319:9: ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) )
            	    // InternalDockerCompose.g:4319:10: {...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "true");
            	    }
            	    // InternalDockerCompose.g:4319:19: (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) )
            	    // InternalDockerCompose.g:4319:20: otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) )
            	    {
            	    otherlv_4=(Token)match(input,73,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getIPAMConfigAccess().getIp_rangeKeyword_1_1_0());
            	    								
            	    // InternalDockerCompose.g:4323:9: ( (lv_ip_range_5_0= ruleNetworkAddress ) )
            	    // InternalDockerCompose.g:4324:10: (lv_ip_range_5_0= ruleNetworkAddress )
            	    {
            	    // InternalDockerCompose.g:4324:10: (lv_ip_range_5_0= ruleNetworkAddress )
            	    // InternalDockerCompose.g:4325:11: lv_ip_range_5_0= ruleNetworkAddress
            	    {

            	    											newCompositeNode(grammarAccess.getIPAMConfigAccess().getIp_rangeNetworkAddressParserRuleCall_1_1_1_0());
            	    										
            	    pushFollow(FOLLOW_58);
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
            	    // InternalDockerCompose.g:4348:4: ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:4348:4: ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) )
            	    // InternalDockerCompose.g:4349:5: {...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalDockerCompose.g:4349:107: ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) )
            	    // InternalDockerCompose.g:4350:6: ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalDockerCompose.g:4353:9: ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) )
            	    // InternalDockerCompose.g:4353:10: {...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "true");
            	    }
            	    // InternalDockerCompose.g:4353:19: (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) )
            	    // InternalDockerCompose.g:4353:20: otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) )
            	    {
            	    otherlv_6=(Token)match(input,74,FOLLOW_25); 

            	    									newLeafNode(otherlv_6, grammarAccess.getIPAMConfigAccess().getGatewayKeyword_1_2_0());
            	    								
            	    // InternalDockerCompose.g:4357:9: ( (lv_gateway_7_0= ruleDNS ) )
            	    // InternalDockerCompose.g:4358:10: (lv_gateway_7_0= ruleDNS )
            	    {
            	    // InternalDockerCompose.g:4358:10: (lv_gateway_7_0= ruleDNS )
            	    // InternalDockerCompose.g:4359:11: lv_gateway_7_0= ruleDNS
            	    {

            	    											newCompositeNode(grammarAccess.getIPAMConfigAccess().getGatewayDNSParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_58);
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
            	    // InternalDockerCompose.g:4382:4: ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:4382:4: ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) )
            	    // InternalDockerCompose.g:4383:5: {...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalDockerCompose.g:4383:107: ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) )
            	    // InternalDockerCompose.g:4384:6: ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalDockerCompose.g:4387:9: ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) )
            	    // InternalDockerCompose.g:4387:10: {...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "true");
            	    }
            	    // InternalDockerCompose.g:4387:19: (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ )
            	    // InternalDockerCompose.g:4387:20: otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+
            	    {
            	    otherlv_8=(Token)match(input,75,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getIPAMConfigAccess().getAux_addressesKeyword_1_3_0());
            	    								
            	    // InternalDockerCompose.g:4391:9: ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+
            	    int cnt59=0;
            	    loop59:
            	    do {
            	        int alt59=2;
            	        int LA59_0 = input.LA(1);

            	        if ( (LA59_0==RULE_STRING) ) {
            	            int LA59_2 = input.LA(2);

            	            if ( (LA59_2==22) ) {
            	                int LA59_4 = input.LA(3);

            	                if ( (LA59_4==RULE_INT) ) {
            	                    alt59=1;
            	                }


            	            }


            	        }
            	        else if ( (LA59_0==RULE_ID) ) {
            	            int LA59_3 = input.LA(2);

            	            if ( (LA59_3==22) ) {
            	                int LA59_4 = input.LA(3);

            	                if ( (LA59_4==RULE_INT) ) {
            	                    alt59=1;
            	                }


            	            }


            	        }


            	        switch (alt59) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:4392:10: (lv_aux_addresses_9_0= ruleIPAMAddress )
            	    	    {
            	    	    // InternalDockerCompose.g:4392:10: (lv_aux_addresses_9_0= ruleIPAMAddress )
            	    	    // InternalDockerCompose.g:4393:11: lv_aux_addresses_9_0= ruleIPAMAddress
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getIPAMConfigAccess().getAux_addressesIPAMAddressParserRuleCall_1_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_59);
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
            	    	    if ( cnt59 >= 1 ) break loop59;
            	                EarlyExitException eee =
            	                    new EarlyExitException(59, input);
            	                throw eee;
            	        }
            	        cnt59++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
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
    // InternalDockerCompose.g:4427:1: entryRuleIPAMOption returns [EObject current=null] : iv_ruleIPAMOption= ruleIPAMOption EOF ;
    public final EObject entryRuleIPAMOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAMOption = null;


        try {
            // InternalDockerCompose.g:4427:51: (iv_ruleIPAMOption= ruleIPAMOption EOF )
            // InternalDockerCompose.g:4428:2: iv_ruleIPAMOption= ruleIPAMOption EOF
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
    // InternalDockerCompose.g:4434:1: ruleIPAMOption returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleIPAMOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:4440:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:4441:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:4441:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:4442:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:4442:3: ()
            // InternalDockerCompose.g:4443:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIPAMOptionAccess().getIPAMOptionAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:4449:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:4450:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:4450:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:4451:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIPAMOptionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_2=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getIPAMOptionAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:4472:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:4473:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:4473:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:4474:5: lv_value_3_0= ruleEString
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
    // InternalDockerCompose.g:4495:1: entryRuleIPAMAddress returns [EObject current=null] : iv_ruleIPAMAddress= ruleIPAMAddress EOF ;
    public final EObject entryRuleIPAMAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAMAddress = null;


        try {
            // InternalDockerCompose.g:4495:52: (iv_ruleIPAMAddress= ruleIPAMAddress EOF )
            // InternalDockerCompose.g:4496:2: iv_ruleIPAMAddress= ruleIPAMAddress EOF
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
    // InternalDockerCompose.g:4502:1: ruleIPAMAddress returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) ) ) ;
    public final EObject ruleIPAMAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_dns_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:4508:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) ) ) )
            // InternalDockerCompose.g:4509:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) ) )
            {
            // InternalDockerCompose.g:4509:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) ) )
            // InternalDockerCompose.g:4510:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) )
            {
            // InternalDockerCompose.g:4510:3: ()
            // InternalDockerCompose.g:4511:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIPAMAddressAccess().getIPAMAddressAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:4517:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:4518:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:4518:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:4519:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIPAMAddressAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_2=(Token)match(input,22,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getIPAMAddressAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:4540:3: ( (lv_dns_3_0= ruleDNS ) )
            // InternalDockerCompose.g:4541:4: (lv_dns_3_0= ruleDNS )
            {
            // InternalDockerCompose.g:4541:4: (lv_dns_3_0= ruleDNS )
            // InternalDockerCompose.g:4542:5: lv_dns_3_0= ruleDNS
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


    // $ANTLR start "entryRulePATH"
    // InternalDockerCompose.g:4563:1: entryRulePATH returns [String current=null] : iv_rulePATH= rulePATH EOF ;
    public final String entryRulePATH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePATH = null;


        try {
            // InternalDockerCompose.g:4563:44: (iv_rulePATH= rulePATH EOF )
            // InternalDockerCompose.g:4564:2: iv_rulePATH= rulePATH EOF
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
    // InternalDockerCompose.g:4570:1: rulePATH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) | kw= '.' | kw= '..' ) (kw= '/' ( (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) | kw= '.' | kw= '..' ) )* (kw= '/' )? ) | (kw= '/' ( ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' ) kw= '/' )* ( (this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )* ) | kw= '.' | kw= '..' )? ) ) ;
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
            // InternalDockerCompose.g:4576:2: ( ( ( ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) | kw= '.' | kw= '..' ) (kw= '/' ( (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) | kw= '.' | kw= '..' ) )* (kw= '/' )? ) | (kw= '/' ( ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' ) kw= '/' )* ( (this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )* ) | kw= '.' | kw= '..' )? ) ) )
            // InternalDockerCompose.g:4577:2: ( ( ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) | kw= '.' | kw= '..' ) (kw= '/' ( (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) | kw= '.' | kw= '..' ) )* (kw= '/' )? ) | (kw= '/' ( ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' ) kw= '/' )* ( (this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )* ) | kw= '.' | kw= '..' )? ) )
            {
            // InternalDockerCompose.g:4577:2: ( ( ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) | kw= '.' | kw= '..' ) (kw= '/' ( (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) | kw= '.' | kw= '..' ) )* (kw= '/' )? ) | (kw= '/' ( ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' ) kw= '/' )* ( (this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )* ) | kw= '.' | kw= '..' )? ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID||(LA72_0>=76 && LA72_0<=77)) ) {
                alt72=1;
            }
            else if ( (LA72_0==39) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalDockerCompose.g:4578:3: ( ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) | kw= '.' | kw= '..' ) (kw= '/' ( (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) | kw= '.' | kw= '..' ) )* (kw= '/' )? )
                    {
                    // InternalDockerCompose.g:4578:3: ( ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) | kw= '.' | kw= '..' ) (kw= '/' ( (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) | kw= '.' | kw= '..' ) )* (kw= '/' )? )
                    // InternalDockerCompose.g:4579:4: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) | kw= '.' | kw= '..' ) (kw= '/' ( (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) | kw= '.' | kw= '..' ) )* (kw= '/' )?
                    {
                    // InternalDockerCompose.g:4579:4: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) | kw= '.' | kw= '..' )
                    int alt62=3;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                        {
                        alt62=1;
                        }
                        break;
                    case 76:
                        {
                        alt62=2;
                        }
                        break;
                    case 77:
                        {
                        alt62=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }

                    switch (alt62) {
                        case 1 :
                            // InternalDockerCompose.g:4580:5: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
                            {
                            // InternalDockerCompose.g:4580:5: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
                            // InternalDockerCompose.g:4581:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
                            {
                            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_60); 

                            						current.merge(this_ID_0);
                            					

                            						newLeafNode(this_ID_0, grammarAccess.getPATHAccess().getIDTerminalRuleCall_0_0_0_0());
                            					
                            // InternalDockerCompose.g:4588:6: (kw= '.' this_ID_2= RULE_ID )*
                            loop61:
                            do {
                                int alt61=2;
                                int LA61_0 = input.LA(1);

                                if ( (LA61_0==76) ) {
                                    alt61=1;
                                }


                                switch (alt61) {
                            	case 1 :
                            	    // InternalDockerCompose.g:4589:7: kw= '.' this_ID_2= RULE_ID
                            	    {
                            	    kw=(Token)match(input,76,FOLLOW_11); 

                            	    							current.merge(kw);
                            	    							newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopKeyword_0_0_0_1_0());
                            	    						
                            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_60); 

                            	    							current.merge(this_ID_2);
                            	    						

                            	    							newLeafNode(this_ID_2, grammarAccess.getPATHAccess().getIDTerminalRuleCall_0_0_0_1_1());
                            	    						

                            	    }
                            	    break;

                            	default :
                            	    break loop61;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // InternalDockerCompose.g:4604:5: kw= '.'
                            {
                            kw=(Token)match(input,76,FOLLOW_61); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopKeyword_0_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalDockerCompose.g:4610:5: kw= '..'
                            {
                            kw=(Token)match(input,77,FOLLOW_61); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopFullStopKeyword_0_0_2());
                            				

                            }
                            break;

                    }

                    // InternalDockerCompose.g:4616:4: (kw= '/' ( (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) | kw= '.' | kw= '..' ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==39) ) {
                            int LA65_1 = input.LA(2);

                            if ( (LA65_1==RULE_ID) ) {
                                int LA65_3 = input.LA(3);

                                if ( (LA65_3==22) ) {
                                    int LA65_5 = input.LA(4);

                                    if ( ((LA65_5>=84 && LA65_5<=86)) ) {
                                        alt65=1;
                                    }


                                }
                                else if ( (LA65_3==EOF||LA65_3==RULE_ID||LA65_3==RULE_STRING||(LA65_3>=16 && LA65_3<=21)||(LA65_3>=23 && LA65_3<=37)||LA65_3==39||(LA65_3>=46 && LA65_3<=49)||LA65_3==51||LA65_3==53||(LA65_3>=55 && LA65_3<=57)||LA65_3==76) ) {
                                    alt65=1;
                                }


                            }
                            else if ( ((LA65_1>=76 && LA65_1<=77)) ) {
                                alt65=1;
                            }


                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalDockerCompose.g:4617:5: kw= '/' ( (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) | kw= '.' | kw= '..' )
                    	    {
                    	    kw=(Token)match(input,39,FOLLOW_62); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getPATHAccess().getSolidusKeyword_0_1_0());
                    	    				
                    	    // InternalDockerCompose.g:4622:5: ( (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* ) | kw= '.' | kw= '..' )
                    	    int alt64=3;
                    	    switch ( input.LA(1) ) {
                    	    case RULE_ID:
                    	        {
                    	        alt64=1;
                    	        }
                    	        break;
                    	    case 76:
                    	        {
                    	        alt64=2;
                    	        }
                    	        break;
                    	    case 77:
                    	        {
                    	        alt64=3;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 64, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt64) {
                    	        case 1 :
                    	            // InternalDockerCompose.g:4623:6: (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* )
                    	            {
                    	            // InternalDockerCompose.g:4623:6: (this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )* )
                    	            // InternalDockerCompose.g:4624:7: this_ID_6= RULE_ID (kw= '.' this_ID_8= RULE_ID )*
                    	            {
                    	            this_ID_6=(Token)match(input,RULE_ID,FOLLOW_60); 

                    	            							current.merge(this_ID_6);
                    	            						

                    	            							newLeafNode(this_ID_6, grammarAccess.getPATHAccess().getIDTerminalRuleCall_0_1_1_0_0());
                    	            						
                    	            // InternalDockerCompose.g:4631:7: (kw= '.' this_ID_8= RULE_ID )*
                    	            loop63:
                    	            do {
                    	                int alt63=2;
                    	                int LA63_0 = input.LA(1);

                    	                if ( (LA63_0==76) ) {
                    	                    alt63=1;
                    	                }


                    	                switch (alt63) {
                    	            	case 1 :
                    	            	    // InternalDockerCompose.g:4632:8: kw= '.' this_ID_8= RULE_ID
                    	            	    {
                    	            	    kw=(Token)match(input,76,FOLLOW_11); 

                    	            	    								current.merge(kw);
                    	            	    								newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopKeyword_0_1_1_0_1_0());
                    	            	    							
                    	            	    this_ID_8=(Token)match(input,RULE_ID,FOLLOW_60); 

                    	            	    								current.merge(this_ID_8);
                    	            	    							

                    	            	    								newLeafNode(this_ID_8, grammarAccess.getPATHAccess().getIDTerminalRuleCall_0_1_1_0_1_1());
                    	            	    							

                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop63;
                    	                }
                    	            } while (true);


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalDockerCompose.g:4647:6: kw= '.'
                    	            {
                    	            kw=(Token)match(input,76,FOLLOW_61); 

                    	            						current.merge(kw);
                    	            						newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopKeyword_0_1_1_1());
                    	            					

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalDockerCompose.g:4653:6: kw= '..'
                    	            {
                    	            kw=(Token)match(input,77,FOLLOW_61); 

                    	            						current.merge(kw);
                    	            						newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopFullStopKeyword_0_1_1_2());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    // InternalDockerCompose.g:4660:4: (kw= '/' )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==39) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalDockerCompose.g:4661:5: kw= '/'
                            {
                            kw=(Token)match(input,39,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getPATHAccess().getSolidusKeyword_0_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4669:3: (kw= '/' ( ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' ) kw= '/' )* ( (this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )* ) | kw= '.' | kw= '..' )? )
                    {
                    // InternalDockerCompose.g:4669:3: (kw= '/' ( ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' ) kw= '/' )* ( (this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )* ) | kw= '.' | kw= '..' )? )
                    // InternalDockerCompose.g:4670:4: kw= '/' ( ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' ) kw= '/' )* ( (this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )* ) | kw= '.' | kw= '..' )?
                    {
                    kw=(Token)match(input,39,FOLLOW_63); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPATHAccess().getSolidusKeyword_1_0());
                    			
                    // InternalDockerCompose.g:4675:4: ( ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' ) kw= '/' )*
                    loop69:
                    do {
                        int alt69=2;
                        alt69 = dfa69.predict(input);
                        switch (alt69) {
                    	case 1 :
                    	    // InternalDockerCompose.g:4676:5: ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' ) kw= '/'
                    	    {
                    	    // InternalDockerCompose.g:4676:5: ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' )
                    	    int alt68=3;
                    	    switch ( input.LA(1) ) {
                    	    case RULE_ID:
                    	        {
                    	        alt68=1;
                    	        }
                    	        break;
                    	    case 76:
                    	        {
                    	        alt68=2;
                    	        }
                    	        break;
                    	    case 77:
                    	        {
                    	        alt68=3;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 68, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt68) {
                    	        case 1 :
                    	            // InternalDockerCompose.g:4677:6: (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* )
                    	            {
                    	            // InternalDockerCompose.g:4677:6: (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* )
                    	            // InternalDockerCompose.g:4678:7: this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )*
                    	            {
                    	            this_ID_13=(Token)match(input,RULE_ID,FOLLOW_64); 

                    	            							current.merge(this_ID_13);
                    	            						

                    	            							newLeafNode(this_ID_13, grammarAccess.getPATHAccess().getIDTerminalRuleCall_1_1_0_0_0());
                    	            						
                    	            // InternalDockerCompose.g:4685:7: (kw= '.' this_ID_15= RULE_ID )*
                    	            loop67:
                    	            do {
                    	                int alt67=2;
                    	                int LA67_0 = input.LA(1);

                    	                if ( (LA67_0==76) ) {
                    	                    alt67=1;
                    	                }


                    	                switch (alt67) {
                    	            	case 1 :
                    	            	    // InternalDockerCompose.g:4686:8: kw= '.' this_ID_15= RULE_ID
                    	            	    {
                    	            	    kw=(Token)match(input,76,FOLLOW_11); 

                    	            	    								current.merge(kw);
                    	            	    								newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopKeyword_1_1_0_0_1_0());
                    	            	    							
                    	            	    this_ID_15=(Token)match(input,RULE_ID,FOLLOW_64); 

                    	            	    								current.merge(this_ID_15);
                    	            	    							

                    	            	    								newLeafNode(this_ID_15, grammarAccess.getPATHAccess().getIDTerminalRuleCall_1_1_0_0_1_1());
                    	            	    							

                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop67;
                    	                }
                    	            } while (true);


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalDockerCompose.g:4701:6: kw= '.'
                    	            {
                    	            kw=(Token)match(input,76,FOLLOW_65); 

                    	            						current.merge(kw);
                    	            						newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopKeyword_1_1_0_1());
                    	            					

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalDockerCompose.g:4707:6: kw= '..'
                    	            {
                    	            kw=(Token)match(input,77,FOLLOW_65); 

                    	            						current.merge(kw);
                    	            						newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopFullStopKeyword_1_1_0_2());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    kw=(Token)match(input,39,FOLLOW_63); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getPATHAccess().getSolidusKeyword_1_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    // InternalDockerCompose.g:4719:4: ( (this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )* ) | kw= '.' | kw= '..' )?
                    int alt71=4;
                    switch ( input.LA(1) ) {
                        case RULE_ID:
                            {
                            int LA71_1 = input.LA(2);

                            if ( (LA71_1==EOF||LA71_1==RULE_ID||LA71_1==RULE_STRING||(LA71_1>=16 && LA71_1<=21)||(LA71_1>=23 && LA71_1<=37)||(LA71_1>=46 && LA71_1<=49)||LA71_1==51||LA71_1==53||(LA71_1>=55 && LA71_1<=57)||LA71_1==76) ) {
                                alt71=1;
                            }
                            else if ( (LA71_1==22) ) {
                                int LA71_6 = input.LA(3);

                                if ( ((LA71_6>=84 && LA71_6<=86)) ) {
                                    alt71=1;
                                }
                            }
                            }
                            break;
                        case 76:
                            {
                            alt71=2;
                            }
                            break;
                        case 77:
                            {
                            alt71=3;
                            }
                            break;
                    }

                    switch (alt71) {
                        case 1 :
                            // InternalDockerCompose.g:4720:5: (this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )* )
                            {
                            // InternalDockerCompose.g:4720:5: (this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )* )
                            // InternalDockerCompose.g:4721:6: this_ID_19= RULE_ID (kw= '.' this_ID_21= RULE_ID )*
                            {
                            this_ID_19=(Token)match(input,RULE_ID,FOLLOW_66); 

                            						current.merge(this_ID_19);
                            					

                            						newLeafNode(this_ID_19, grammarAccess.getPATHAccess().getIDTerminalRuleCall_1_2_0_0());
                            					
                            // InternalDockerCompose.g:4728:6: (kw= '.' this_ID_21= RULE_ID )*
                            loop70:
                            do {
                                int alt70=2;
                                int LA70_0 = input.LA(1);

                                if ( (LA70_0==76) ) {
                                    alt70=1;
                                }


                                switch (alt70) {
                            	case 1 :
                            	    // InternalDockerCompose.g:4729:7: kw= '.' this_ID_21= RULE_ID
                            	    {
                            	    kw=(Token)match(input,76,FOLLOW_11); 

                            	    							current.merge(kw);
                            	    							newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopKeyword_1_2_0_1_0());
                            	    						
                            	    this_ID_21=(Token)match(input,RULE_ID,FOLLOW_66); 

                            	    							current.merge(this_ID_21);
                            	    						

                            	    							newLeafNode(this_ID_21, grammarAccess.getPATHAccess().getIDTerminalRuleCall_1_2_0_1_1());
                            	    						

                            	    }
                            	    break;

                            	default :
                            	    break loop70;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // InternalDockerCompose.g:4744:5: kw= '.'
                            {
                            kw=(Token)match(input,76,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopKeyword_1_2_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalDockerCompose.g:4750:5: kw= '..'
                            {
                            kw=(Token)match(input,77,FOLLOW_2); 

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
    // InternalDockerCompose.g:4761:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDockerCompose.g:4761:47: (iv_ruleEString= ruleEString EOF )
            // InternalDockerCompose.g:4762:2: iv_ruleEString= ruleEString EOF
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
    // InternalDockerCompose.g:4768:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4774:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDockerCompose.g:4775:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDockerCompose.g:4775:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_STRING) ) {
                alt73=1;
            }
            else if ( (LA73_0==RULE_ID) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalDockerCompose.g:4776:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4784:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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


    // $ANTLR start "entryRuleEInt"
    // InternalDockerCompose.g:4795:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDockerCompose.g:4795:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDockerCompose.g:4796:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalDockerCompose.g:4802:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4808:2: (this_INT_0= RULE_INT )
            // InternalDockerCompose.g:4809:2: this_INT_0= RULE_INT
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


    // $ANTLR start "entryRuleDNS"
    // InternalDockerCompose.g:4819:1: entryRuleDNS returns [EObject current=null] : iv_ruleDNS= ruleDNS EOF ;
    public final EObject entryRuleDNS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNS = null;


        try {
            // InternalDockerCompose.g:4819:44: (iv_ruleDNS= ruleDNS EOF )
            // InternalDockerCompose.g:4820:2: iv_ruleDNS= ruleDNS EOF
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
    // InternalDockerCompose.g:4826:1: ruleDNS returns [EObject current=null] : ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) ) ;
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
            // InternalDockerCompose.g:4832:2: ( ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) ) )
            // InternalDockerCompose.g:4833:2: ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) )
            {
            // InternalDockerCompose.g:4833:2: ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) )
            // InternalDockerCompose.g:4834:3: ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) )
            {
            // InternalDockerCompose.g:4834:3: ( (lv_dns1_0_0= ruleEInt ) )
            // InternalDockerCompose.g:4835:4: (lv_dns1_0_0= ruleEInt )
            {
            // InternalDockerCompose.g:4835:4: (lv_dns1_0_0= ruleEInt )
            // InternalDockerCompose.g:4836:5: lv_dns1_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDNSAccess().getDns1EIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_67);
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

            otherlv_1=(Token)match(input,76,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDNSAccess().getFullStopKeyword_1());
            		
            // InternalDockerCompose.g:4857:3: ( (lv_dns2_2_0= ruleEInt ) )
            // InternalDockerCompose.g:4858:4: (lv_dns2_2_0= ruleEInt )
            {
            // InternalDockerCompose.g:4858:4: (lv_dns2_2_0= ruleEInt )
            // InternalDockerCompose.g:4859:5: lv_dns2_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDNSAccess().getDns2EIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_67);
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

            otherlv_3=(Token)match(input,76,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getDNSAccess().getFullStopKeyword_3());
            		
            // InternalDockerCompose.g:4880:3: ( (lv_dns3_4_0= ruleEInt ) )
            // InternalDockerCompose.g:4881:4: (lv_dns3_4_0= ruleEInt )
            {
            // InternalDockerCompose.g:4881:4: (lv_dns3_4_0= ruleEInt )
            // InternalDockerCompose.g:4882:5: lv_dns3_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDNSAccess().getDns3EIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_67);
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

            otherlv_5=(Token)match(input,76,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getDNSAccess().getFullStopKeyword_5());
            		
            // InternalDockerCompose.g:4903:3: ( (lv_dns4_6_0= ruleEInt ) )
            // InternalDockerCompose.g:4904:4: (lv_dns4_6_0= ruleEInt )
            {
            // InternalDockerCompose.g:4904:4: (lv_dns4_6_0= ruleEInt )
            // InternalDockerCompose.g:4905:5: lv_dns4_6_0= ruleEInt
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
    // InternalDockerCompose.g:4926:1: entryRuleNetworkAddress returns [EObject current=null] : iv_ruleNetworkAddress= ruleNetworkAddress EOF ;
    public final EObject entryRuleNetworkAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkAddress = null;


        try {
            // InternalDockerCompose.g:4926:55: (iv_ruleNetworkAddress= ruleNetworkAddress EOF )
            // InternalDockerCompose.g:4927:2: iv_ruleNetworkAddress= ruleNetworkAddress EOF
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
    // InternalDockerCompose.g:4933:1: ruleNetworkAddress returns [EObject current=null] : ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) ) ) ;
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
            // InternalDockerCompose.g:4939:2: ( ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) ) ) )
            // InternalDockerCompose.g:4940:2: ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) ) )
            {
            // InternalDockerCompose.g:4940:2: ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) ) )
            // InternalDockerCompose.g:4941:3: ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) )
            {
            // InternalDockerCompose.g:4941:3: ( (lv_dns1_0_0= ruleEInt ) )
            // InternalDockerCompose.g:4942:4: (lv_dns1_0_0= ruleEInt )
            {
            // InternalDockerCompose.g:4942:4: (lv_dns1_0_0= ruleEInt )
            // InternalDockerCompose.g:4943:5: lv_dns1_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNetworkAddressAccess().getDns1EIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_67);
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

            otherlv_1=(Token)match(input,76,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getNetworkAddressAccess().getFullStopKeyword_1());
            		
            // InternalDockerCompose.g:4964:3: ( (lv_dns2_2_0= ruleEInt ) )
            // InternalDockerCompose.g:4965:4: (lv_dns2_2_0= ruleEInt )
            {
            // InternalDockerCompose.g:4965:4: (lv_dns2_2_0= ruleEInt )
            // InternalDockerCompose.g:4966:5: lv_dns2_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNetworkAddressAccess().getDns2EIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_67);
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

            otherlv_3=(Token)match(input,76,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getNetworkAddressAccess().getFullStopKeyword_3());
            		
            // InternalDockerCompose.g:4987:3: ( (lv_dns3_4_0= ruleEInt ) )
            // InternalDockerCompose.g:4988:4: (lv_dns3_4_0= ruleEInt )
            {
            // InternalDockerCompose.g:4988:4: (lv_dns3_4_0= ruleEInt )
            // InternalDockerCompose.g:4989:5: lv_dns3_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNetworkAddressAccess().getDns3EIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_67);
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

            otherlv_5=(Token)match(input,76,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getNetworkAddressAccess().getFullStopKeyword_5());
            		
            // InternalDockerCompose.g:5010:3: ( (lv_dns4_6_0= ruleEInt ) )
            // InternalDockerCompose.g:5011:4: (lv_dns4_6_0= ruleEInt )
            {
            // InternalDockerCompose.g:5011:4: (lv_dns4_6_0= ruleEInt )
            // InternalDockerCompose.g:5012:5: lv_dns4_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNetworkAddressAccess().getDns4EIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_65);
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

            otherlv_7=(Token)match(input,39,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getNetworkAddressAccess().getSolidusKeyword_7());
            		
            // InternalDockerCompose.g:5033:3: ( (lv_netId_8_0= ruleEInt ) )
            // InternalDockerCompose.g:5034:4: (lv_netId_8_0= ruleEInt )
            {
            // InternalDockerCompose.g:5034:4: (lv_netId_8_0= ruleEInt )
            // InternalDockerCompose.g:5035:5: lv_netId_8_0= ruleEInt
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
    // InternalDockerCompose.g:5056:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalDockerCompose.g:5056:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalDockerCompose.g:5057:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalDockerCompose.g:5063:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:5069:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalDockerCompose.g:5070:2: (kw= 'true' | kw= 'false' )
            {
            // InternalDockerCompose.g:5070:2: (kw= 'true' | kw= 'false' )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==78) ) {
                alt74=1;
            }
            else if ( (LA74_0==79) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalDockerCompose.g:5071:3: kw= 'true'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:5077:3: kw= 'false'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

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
    // InternalDockerCompose.g:5086:1: ruleRestartPolicy returns [Enumerator current=null] : ( (enumLiteral_0= '\"no\"' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'on-failure' ) | (enumLiteral_3= 'unless-stopped' ) ) ;
    public final Enumerator ruleRestartPolicy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:5092:2: ( ( (enumLiteral_0= '\"no\"' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'on-failure' ) | (enumLiteral_3= 'unless-stopped' ) ) )
            // InternalDockerCompose.g:5093:2: ( (enumLiteral_0= '\"no\"' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'on-failure' ) | (enumLiteral_3= 'unless-stopped' ) )
            {
            // InternalDockerCompose.g:5093:2: ( (enumLiteral_0= '\"no\"' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'on-failure' ) | (enumLiteral_3= 'unless-stopped' ) )
            int alt75=4;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt75=1;
                }
                break;
            case 81:
                {
                alt75=2;
                }
                break;
            case 82:
                {
                alt75=3;
                }
                break;
            case 83:
                {
                alt75=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalDockerCompose.g:5094:3: (enumLiteral_0= '\"no\"' )
                    {
                    // InternalDockerCompose.g:5094:3: (enumLiteral_0= '\"no\"' )
                    // InternalDockerCompose.g:5095:4: enumLiteral_0= '\"no\"'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getRestartPolicyAccess().getNoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRestartPolicyAccess().getNoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:5102:3: (enumLiteral_1= 'always' )
                    {
                    // InternalDockerCompose.g:5102:3: (enumLiteral_1= 'always' )
                    // InternalDockerCompose.g:5103:4: enumLiteral_1= 'always'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getRestartPolicyAccess().getAlwaysEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRestartPolicyAccess().getAlwaysEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:5110:3: (enumLiteral_2= 'on-failure' )
                    {
                    // InternalDockerCompose.g:5110:3: (enumLiteral_2= 'on-failure' )
                    // InternalDockerCompose.g:5111:4: enumLiteral_2= 'on-failure'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getRestartPolicyAccess().getOnfailureEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRestartPolicyAccess().getOnfailureEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDockerCompose.g:5118:3: (enumLiteral_3= 'unless-stopped' )
                    {
                    // InternalDockerCompose.g:5118:3: (enumLiteral_3= 'unless-stopped' )
                    // InternalDockerCompose.g:5119:4: enumLiteral_3= 'unless-stopped'
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_2); 

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
    // InternalDockerCompose.g:5129:1: ruleAccessMode returns [Enumerator current=null] : ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) | (enumLiteral_2= 'z' ) ) ;
    public final Enumerator ruleAccessMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:5135:2: ( ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) | (enumLiteral_2= 'z' ) ) )
            // InternalDockerCompose.g:5136:2: ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) | (enumLiteral_2= 'z' ) )
            {
            // InternalDockerCompose.g:5136:2: ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) | (enumLiteral_2= 'z' ) )
            int alt76=3;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt76=1;
                }
                break;
            case 85:
                {
                alt76=2;
                }
                break;
            case 86:
                {
                alt76=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalDockerCompose.g:5137:3: (enumLiteral_0= 'rw' )
                    {
                    // InternalDockerCompose.g:5137:3: (enumLiteral_0= 'rw' )
                    // InternalDockerCompose.g:5138:4: enumLiteral_0= 'rw'
                    {
                    enumLiteral_0=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getAccessModeAccess().getRwEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessModeAccess().getRwEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:5145:3: (enumLiteral_1= 'ro' )
                    {
                    // InternalDockerCompose.g:5145:3: (enumLiteral_1= 'ro' )
                    // InternalDockerCompose.g:5146:4: enumLiteral_1= 'ro'
                    {
                    enumLiteral_1=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getAccessModeAccess().getRoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessModeAccess().getRoEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:5153:3: (enumLiteral_2= 'z' )
                    {
                    // InternalDockerCompose.g:5153:3: (enumLiteral_2= 'z' )
                    // InternalDockerCompose.g:5154:4: enumLiteral_2= 'z'
                    {
                    enumLiteral_2=(Token)match(input,86,FOLLOW_2); 

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
    // InternalDockerCompose.g:5164:1: ruleMountType returns [Enumerator current=null] : ( (enumLiteral_0= 'volume' ) | (enumLiteral_1= 'bind' ) | (enumLiteral_2= 'tmpfs' ) | (enumLiteral_3= 'npipe' ) ) ;
    public final Enumerator ruleMountType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:5170:2: ( ( (enumLiteral_0= 'volume' ) | (enumLiteral_1= 'bind' ) | (enumLiteral_2= 'tmpfs' ) | (enumLiteral_3= 'npipe' ) ) )
            // InternalDockerCompose.g:5171:2: ( (enumLiteral_0= 'volume' ) | (enumLiteral_1= 'bind' ) | (enumLiteral_2= 'tmpfs' ) | (enumLiteral_3= 'npipe' ) )
            {
            // InternalDockerCompose.g:5171:2: ( (enumLiteral_0= 'volume' ) | (enumLiteral_1= 'bind' ) | (enumLiteral_2= 'tmpfs' ) | (enumLiteral_3= 'npipe' ) )
            int alt77=4;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt77=1;
                }
                break;
            case 88:
                {
                alt77=2;
                }
                break;
            case 89:
                {
                alt77=3;
                }
                break;
            case 90:
                {
                alt77=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalDockerCompose.g:5172:3: (enumLiteral_0= 'volume' )
                    {
                    // InternalDockerCompose.g:5172:3: (enumLiteral_0= 'volume' )
                    // InternalDockerCompose.g:5173:4: enumLiteral_0= 'volume'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getMountTypeAccess().getVolumeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMountTypeAccess().getVolumeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:5180:3: (enumLiteral_1= 'bind' )
                    {
                    // InternalDockerCompose.g:5180:3: (enumLiteral_1= 'bind' )
                    // InternalDockerCompose.g:5181:4: enumLiteral_1= 'bind'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getMountTypeAccess().getBindEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMountTypeAccess().getBindEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:5188:3: (enumLiteral_2= 'tmpfs' )
                    {
                    // InternalDockerCompose.g:5188:3: (enumLiteral_2= 'tmpfs' )
                    // InternalDockerCompose.g:5189:4: enumLiteral_2= 'tmpfs'
                    {
                    enumLiteral_2=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getMountTypeAccess().getTmpfsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMountTypeAccess().getTmpfsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDockerCompose.g:5196:3: (enumLiteral_3= 'npipe' )
                    {
                    // InternalDockerCompose.g:5196:3: (enumLiteral_3= 'npipe' )
                    // InternalDockerCompose.g:5197:4: enumLiteral_3= 'npipe'
                    {
                    enumLiteral_3=(Token)match(input,90,FOLLOW_2); 

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
    // InternalDockerCompose.g:5207:1: rulePropagationType returns [Enumerator current=null] : ( (enumLiteral_0= 'rprivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'rshared' ) | (enumLiteral_3= 'shared' ) | (enumLiteral_4= 'rslave' ) | (enumLiteral_5= 'slave' ) ) ;
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
            // InternalDockerCompose.g:5213:2: ( ( (enumLiteral_0= 'rprivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'rshared' ) | (enumLiteral_3= 'shared' ) | (enumLiteral_4= 'rslave' ) | (enumLiteral_5= 'slave' ) ) )
            // InternalDockerCompose.g:5214:2: ( (enumLiteral_0= 'rprivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'rshared' ) | (enumLiteral_3= 'shared' ) | (enumLiteral_4= 'rslave' ) | (enumLiteral_5= 'slave' ) )
            {
            // InternalDockerCompose.g:5214:2: ( (enumLiteral_0= 'rprivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'rshared' ) | (enumLiteral_3= 'shared' ) | (enumLiteral_4= 'rslave' ) | (enumLiteral_5= 'slave' ) )
            int alt78=6;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt78=1;
                }
                break;
            case 92:
                {
                alt78=2;
                }
                break;
            case 93:
                {
                alt78=3;
                }
                break;
            case 94:
                {
                alt78=4;
                }
                break;
            case 95:
                {
                alt78=5;
                }
                break;
            case 96:
                {
                alt78=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalDockerCompose.g:5215:3: (enumLiteral_0= 'rprivate' )
                    {
                    // InternalDockerCompose.g:5215:3: (enumLiteral_0= 'rprivate' )
                    // InternalDockerCompose.g:5216:4: enumLiteral_0= 'rprivate'
                    {
                    enumLiteral_0=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getRprivateEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPropagationTypeAccess().getRprivateEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:5223:3: (enumLiteral_1= 'private' )
                    {
                    // InternalDockerCompose.g:5223:3: (enumLiteral_1= 'private' )
                    // InternalDockerCompose.g:5224:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPropagationTypeAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:5231:3: (enumLiteral_2= 'rshared' )
                    {
                    // InternalDockerCompose.g:5231:3: (enumLiteral_2= 'rshared' )
                    // InternalDockerCompose.g:5232:4: enumLiteral_2= 'rshared'
                    {
                    enumLiteral_2=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getRsharedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPropagationTypeAccess().getRsharedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDockerCompose.g:5239:3: (enumLiteral_3= 'shared' )
                    {
                    // InternalDockerCompose.g:5239:3: (enumLiteral_3= 'shared' )
                    // InternalDockerCompose.g:5240:4: enumLiteral_3= 'shared'
                    {
                    enumLiteral_3=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getSharedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPropagationTypeAccess().getSharedEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDockerCompose.g:5247:3: (enumLiteral_4= 'rslave' )
                    {
                    // InternalDockerCompose.g:5247:3: (enumLiteral_4= 'rslave' )
                    // InternalDockerCompose.g:5248:4: enumLiteral_4= 'rslave'
                    {
                    enumLiteral_4=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getRslaveEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPropagationTypeAccess().getRslaveEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDockerCompose.g:5255:3: (enumLiteral_5= 'slave' )
                    {
                    // InternalDockerCompose.g:5255:3: (enumLiteral_5= 'slave' )
                    // InternalDockerCompose.g:5256:4: enumLiteral_5= 'slave'
                    {
                    enumLiteral_5=(Token)match(input,96,FOLLOW_2); 

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
    // InternalDockerCompose.g:5266:1: ruleCondition returns [Enumerator current=null] : ( (enumLiteral_0= 'service_started' ) | (enumLiteral_1= 'service_healthy' ) | (enumLiteral_2= 'service_completed_successfully' ) ) ;
    public final Enumerator ruleCondition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:5272:2: ( ( (enumLiteral_0= 'service_started' ) | (enumLiteral_1= 'service_healthy' ) | (enumLiteral_2= 'service_completed_successfully' ) ) )
            // InternalDockerCompose.g:5273:2: ( (enumLiteral_0= 'service_started' ) | (enumLiteral_1= 'service_healthy' ) | (enumLiteral_2= 'service_completed_successfully' ) )
            {
            // InternalDockerCompose.g:5273:2: ( (enumLiteral_0= 'service_started' ) | (enumLiteral_1= 'service_healthy' ) | (enumLiteral_2= 'service_completed_successfully' ) )
            int alt79=3;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt79=1;
                }
                break;
            case 98:
                {
                alt79=2;
                }
                break;
            case 99:
                {
                alt79=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalDockerCompose.g:5274:3: (enumLiteral_0= 'service_started' )
                    {
                    // InternalDockerCompose.g:5274:3: (enumLiteral_0= 'service_started' )
                    // InternalDockerCompose.g:5275:4: enumLiteral_0= 'service_started'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getService_startedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getConditionAccess().getService_startedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:5282:3: (enumLiteral_1= 'service_healthy' )
                    {
                    // InternalDockerCompose.g:5282:3: (enumLiteral_1= 'service_healthy' )
                    // InternalDockerCompose.g:5283:4: enumLiteral_1= 'service_healthy'
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getService_healthyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getConditionAccess().getService_healthyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:5290:3: (enumLiteral_2= 'service_completed_successfully' )
                    {
                    // InternalDockerCompose.g:5290:3: (enumLiteral_2= 'service_completed_successfully' )
                    // InternalDockerCompose.g:5291:4: enumLiteral_2= 'service_completed_successfully'
                    {
                    enumLiteral_2=(Token)match(input,99,FOLLOW_2); 

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


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA69 dfa69 = new DFA69(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\1\31\uffff";
    static final String dfa_3s = "\1\5\1\uffff\4\5\21\uffff\2\26\1\0";
    static final String dfa_4s = "\1\45\1\uffff\4\40\21\uffff\2\26\1\0";
    static final String dfa_5s = "\1\uffff\1\22\4\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\16\1\17\1\20\1\21\1\13\1\14\1\15\1\12\3\uffff";
    static final String dfa_6s = "\1\1\1\uffff\1\4\1\2\1\3\1\0\23\uffff\1\5}>";
    static final String[] dfa_7s = {
            "\1\1\3\uffff\1\1\6\uffff\2\1\1\2\1\3\1\4\1\5\1\uffff\2\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\uffff\1\16\1\17\1\20\1\21\1\22",
            "",
            "\1\1\3\uffff\1\1\26\uffff\1\23",
            "\1\1\3\uffff\1\1\26\uffff\1\24",
            "\1\1\3\uffff\1\1\26\uffff\1\25",
            "\1\30\3\uffff\1\27\26\uffff\1\26",
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
            "\1\31",
            "\1\uffff"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 351:6: ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'environment:' ( ( (lv_environment_44_0= ruleEnvironmentVariableMap ) )+ | ( (lv_environment_45_0= ruleEnvironmentVariableList ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'devices:' (otherlv_47= '-' ( (lv_devices_48_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'dns:' ( (otherlv_50= '-' ( (lv_dns_51_0= ruleDNS ) ) )+ | ( (lv_dns_52_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'ports:' (otherlv_54= '-' ( (lv_ports_55_0= rulePort ) ) )+ ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_5 = input.LA(1);

                         
                        int index29_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA29_5 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9) ) {s = 22;}

                        else if ( (LA29_5==RULE_STRING) ) {s = 23;}

                        else if ( (LA29_5==RULE_ID) ) {s = 24;}

                         
                        input.seek(index29_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_0 = input.LA(1);

                         
                        int index29_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA29_0==EOF||LA29_0==RULE_ID||LA29_0==RULE_STRING||(LA29_0>=16 && LA29_0<=17)) ) {s = 1;}

                        else if ( (LA29_0==18) ) {s = 2;}

                        else if ( (LA29_0==19) ) {s = 3;}

                        else if ( (LA29_0==20) ) {s = 4;}

                        else if ( (LA29_0==21) ) {s = 5;}

                        else if ( LA29_0 >= 23 && LA29_0 <= 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 0) ) {s = 6;}

                        else if ( LA29_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 1) ) {s = 7;}

                        else if ( LA29_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 2) ) {s = 8;}

                        else if ( LA29_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 3) ) {s = 9;}

                        else if ( LA29_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 4) ) {s = 10;}

                        else if ( LA29_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 5) ) {s = 11;}

                        else if ( LA29_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 6) ) {s = 12;}

                        else if ( LA29_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 7) ) {s = 13;}

                        else if ( LA29_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8) ) {s = 14;}

                        else if ( LA29_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 13) ) {s = 15;}

                        else if ( LA29_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 14) ) {s = 16;}

                        else if ( LA29_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 15) ) {s = 17;}

                        else if ( LA29_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 16) ) {s = 18;}

                         
                        input.seek(index29_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_3 = input.LA(1);

                         
                        int index29_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA29_3 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 11) ) {s = 20;}

                        else if ( (LA29_3==RULE_ID||LA29_3==RULE_STRING) ) {s = 1;}

                         
                        input.seek(index29_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA29_4 = input.LA(1);

                         
                        int index29_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA29_4==RULE_ID||LA29_4==RULE_STRING) ) {s = 1;}

                        else if ( LA29_4 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 12) ) {s = 21;}

                         
                        input.seek(index29_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA29_2 = input.LA(1);

                         
                        int index29_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA29_2==RULE_ID||LA29_2==RULE_STRING) ) {s = 1;}

                        else if ( LA29_2 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10) ) {s = 19;}

                         
                        input.seek(index29_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA29_25 = input.LA(1);

                         
                        int index29_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9) ) {s = 22;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getServiceAccess().getUnorderedGroup_3()) ) {s = 1;}

                         
                        input.seek(index29_25);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\10\uffff";
    static final String dfa_9s = "\1\uffff\1\4\3\uffff\1\4\2\uffff";
    static final String dfa_10s = "\3\5\2\uffff\2\5\1\26";
    static final String dfa_11s = "\1\5\1\50\1\5\2\uffff\1\47\1\5\1\47";
    static final String dfa_12s = "\3\uffff\1\1\1\2\3\uffff";
    static final String dfa_13s = "\10\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\4\3\uffff\1\4\6\uffff\6\4\1\2\11\4\1\uffff\5\4\1\uffff\1\3\1\4",
            "\1\5",
            "",
            "",
            "\1\4\3\uffff\1\4\6\uffff\6\4\1\6\11\4\1\uffff\5\4\1\uffff\1\3",
            "\1\7",
            "\1\6\20\uffff\1\3"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1404:3: (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* kw= '/' )?";
        }
    }
    static final String dfa_15s = "\14\uffff";
    static final String dfa_16s = "\1\1\13\uffff";
    static final String dfa_17s = "\1\5\1\uffff\1\116\6\uffff\2\0\1\uffff";
    static final String dfa_18s = "\1\65\1\uffff\1\117\6\uffff\2\0\1\uffff";
    static final String dfa_19s = "\1\uffff\1\10\1\uffff\1\1\1\2\1\3\1\5\1\6\1\7\2\uffff\1\4";
    static final String dfa_20s = "\1\0\10\uffff\1\1\1\2\1\uffff}>";
    static final String[] dfa_21s = {
            "\1\1\3\uffff\1\1\6\uffff\6\1\1\uffff\7\1\1\2\7\1\10\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\uffff\1\10",
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

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "()+ loopback of 2006:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_0 = input.LA(1);

                         
                        int index43_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA43_0==EOF||LA43_0==RULE_ID||LA43_0==RULE_STRING||(LA43_0>=16 && LA43_0<=21)||(LA43_0>=23 && LA43_0<=29)||(LA43_0>=31 && LA43_0<=37)) ) {s = 1;}

                        else if ( (LA43_0==30) ) {s = 2;}

                        else if ( LA43_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 0) ) {s = 3;}

                        else if ( LA43_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 1) ) {s = 4;}

                        else if ( LA43_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 2) ) {s = 5;}

                        else if ( LA43_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA43_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA43_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                         
                        input.seek(index43_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_9 = input.LA(1);

                         
                        int index43_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 3) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1()) ) {s = 1;}

                         
                        input.seek(index43_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_10 = input.LA(1);

                         
                        int index43_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 3) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1()) ) {s = 1;}

                         
                        input.seek(index43_10);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_22s = "\13\uffff";
    static final String dfa_23s = "\1\1\12\uffff";
    static final String dfa_24s = "\1\5\12\uffff";
    static final String dfa_25s = "\1\104\12\uffff";
    static final String dfa_26s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_27s = "\1\0\12\uffff}>";
    static final String[] dfa_28s = {
            "\1\1\3\uffff\1\1\6\uffff\6\1\46\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
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

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "()* loopback of 2915:7: ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_0 = input.LA(1);

                         
                        int index49_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_0==EOF||LA49_0==RULE_ID||LA49_0==RULE_STRING||(LA49_0>=16 && LA49_0<=21)) ) {s = 1;}

                        else if ( LA49_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 0) ) {s = 2;}

                        else if ( LA49_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 1) ) {s = 3;}

                        else if ( LA49_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 2) ) {s = 4;}

                        else if ( LA49_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 3) ) {s = 5;}

                        else if ( LA49_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 4) ) {s = 6;}

                        else if ( LA49_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 5) ) {s = 7;}

                        else if ( LA49_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 6) ) {s = 8;}

                        else if ( LA49_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 7) ) {s = 9;}

                        else if ( LA49_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 8) ) {s = 10;}

                         
                        input.seek(index49_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_29s = "\4\4\3\uffff\1\4";
    static final String dfa_30s = "\4\5\1\uffff\1\5\1\uffff\1\5";
    static final String dfa_31s = "\1\115\1\114\2\71\1\uffff\1\5\1\uffff\1\114";
    static final String dfa_32s = "\4\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String[] dfa_33s = {
            "\1\1\3\uffff\1\4\6\uffff\26\4\10\uffff\4\4\1\uffff\1\4\1\uffff\1\4\1\uffff\3\4\22\uffff\1\2\1\3",
            "\1\4\3\uffff\1\4\6\uffff\26\4\1\uffff\1\6\6\uffff\4\4\1\uffff\1\4\1\uffff\1\4\1\uffff\3\4\22\uffff\1\5",
            "\1\4\3\uffff\1\4\6\uffff\26\4\1\uffff\1\6\6\uffff\4\4\1\uffff\1\4\1\uffff\1\4\1\uffff\3\4",
            "\1\4\3\uffff\1\4\6\uffff\26\4\1\uffff\1\6\6\uffff\4\4\1\uffff\1\4\1\uffff\1\4\1\uffff\3\4",
            "",
            "\1\7",
            "",
            "\1\4\3\uffff\1\4\6\uffff\26\4\1\uffff\1\6\6\uffff\4\4\1\uffff\1\4\1\uffff\1\4\1\uffff\3\4\22\uffff\1\5"
    };
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = dfa_8;
            this.eof = dfa_29;
            this.min = dfa_30;
            this.max = dfa_31;
            this.accept = dfa_32;
            this.special = dfa_13;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "()* loopback of 4675:4: ( ( (this_ID_13= RULE_ID (kw= '.' this_ID_15= RULE_ID )* ) | kw= '.' | kw= '..' ) kw= '/' )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000003F0002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000003F0222L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000003EFFBC0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008000000020L,0x0000000000003000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000003EFFBC0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x00000000000F0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000003FFFBC0002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000220L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000003FFFBC0222L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x002BC00040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0381400000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000003EFFBC0022L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000003FFFBC0022L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000400L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000222L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000400002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00003C0100000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x002BC00040000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000007800000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x00000001F8000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000700000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0381400000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0xF400000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0xF000000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0xF000000000000222L,0x000000000000001FL});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0xF000000000000000L,0x00000000000000DFL});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x1000000000000002L,0x000000000000000FL});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x1000000000000222L,0x000000000000000FL});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000023L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000400000002L,0x0000000000000023L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x1000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x1000000100000000L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x1000000100000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x1000000000000222L,0x00000000000000C0L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000222L,0x0000000000000F00L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000008000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000020L,0x0000000000003000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000022L,0x0000000000003000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000008000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});

}
