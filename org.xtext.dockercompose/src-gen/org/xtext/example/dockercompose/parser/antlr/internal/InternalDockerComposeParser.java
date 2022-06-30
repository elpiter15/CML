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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VERSION", "RULE_PORT_DEF", "RULE_DEVICE_DEF", "RULE_ID", "RULE_QUOTED_INT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'version:'", "'services:'", "'volumes:'", "'configs:'", "'secrets:'", "'networks:'", "':'", "'build:'", "'image:'", "'cpu_count:'", "'command:'", "'container_name:'", "'restart:'", "'init:'", "'read_only:'", "'links:'", "'-'", "'depends_on:'", "'devices:'", "'dns:'", "'ports:'", "'condition:'", "'ipv4_address:'", "'priority:'", "'aliases:'", "'link_local_ips:'", "'source:'", "'type:'", "'target:'", "'bind:'", "'propagation:'", "'volume:'", "'nocopy:'", "'tmpfs:'", "'size:'", "'uid:'", "'gid:'", "'mode:'", "'{'", "'}'", "'driver:'", "'attachable:'", "'enable_ipv6:'", "'internal:'", "'external:'", "'name:'", "'labels:'", "'driver_opts:'", "'ipam:'", "'file:'", "'environment:'", "'config:'", "'options:'", "'subnet:'", "'ip_range:'", "'gateway:'", "'aux_addresses:'", "'.'", "'/'", "'true'", "'false'", "'\"no\"'", "'always'", "'on-failure'", "'unless-stopped'", "'rw'", "'ro'", "'z'", "'volume'", "'bind'", "'tmpfs'", "'npipe'", "'rprivate'", "'private'", "'rshared'", "'shared'", "'rslave'", "'slave'", "'service_started'", "'service_healthy'", "'service_completed_successfully'"
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
    public static final int RULE_ID=7;
    public static final int RULE_PORT_DEF=5;
    public static final int RULE_INT=10;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
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
    public static final int RULE_DEVICE_DEF=6;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__95=95;
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
    public static final int RULE_SL_COMMENT=12;
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
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
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

                if ( LA6_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 0) ) {
                    alt6=1;
                }
                else if ( LA6_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 1) ) {
                    alt6=2;
                }
                else if ( LA6_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 2) ) {
                    alt6=3;
                }
                else if ( LA6_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 3) ) {
                    alt6=4;
                }
                else if ( LA6_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 4) ) {
                    alt6=5;
                }
                else if ( LA6_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 5) ) {
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
            	    otherlv_1=(Token)match(input,15,FOLLOW_3); 

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
            	    otherlv_3=(Token)match(input,16,FOLLOW_5); 

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
            	    otherlv_5=(Token)match(input,17,FOLLOW_5); 

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
            	    otherlv_7=(Token)match(input,18,FOLLOW_5); 

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
            	    otherlv_9=(Token)match(input,19,FOLLOW_5); 

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
            	    otherlv_11=(Token)match(input,20,FOLLOW_5); 

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
    // InternalDockerCompose.g:307:1: ruleService returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

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
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

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

        EObject lv_depends_on_25_0 = null;

        EObject lv_networks_27_0 = null;

        EObject lv_volumes_30_0 = null;

        EObject lv_volumes_32_0 = null;

        EObject lv_configs_35_0 = null;

        EObject lv_configs_37_0 = null;

        EObject lv_secrets_40_0 = null;

        EObject lv_secrets_42_0 = null;

        EObject lv_devices_45_0 = null;

        EObject lv_dns_48_0 = null;

        EObject lv_dns_49_0 = null;

        EObject lv_ports_52_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:313:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) ) ) ) )
            // InternalDockerCompose.g:314:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalDockerCompose.g:314:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) ) ) )
            // InternalDockerCompose.g:315:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) ) )
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

            otherlv_2=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:345:3: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) ) )
            // InternalDockerCompose.g:346:4: ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) )
            {
            // InternalDockerCompose.g:346:4: ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) )
            // InternalDockerCompose.g:347:5: ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:350:5: ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ ) ) ) ) )+ {...}?)
            // InternalDockerCompose.g:351:6: ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ ) ) ) ) )+ {...}?
            {
            // InternalDockerCompose.g:351:6: ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ ) ) ) ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=17;
                alt26 = dfa26.predict(input);
                switch (alt26) {
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

            	    if ( (LA7_0==22) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==23) ) {
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
            	            otherlv_4=(Token)match(input,22,FOLLOW_9); 

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
            	            otherlv_6=(Token)match(input,23,FOLLOW_5); 

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
            	    otherlv_8=(Token)match(input,24,FOLLOW_11); 

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
            	    // InternalDockerCompose.g:448:4: ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:448:4: ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:449:5: {...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:449:104: ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:450:6: ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:453:9: ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:453:10: {...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:453:19: (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:453:20: otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,25,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getCommandKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:457:9: ( (lv_command_11_0= ruleEString ) )
            	    // InternalDockerCompose.g:458:10: (lv_command_11_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:458:10: (lv_command_11_0= ruleEString )
            	    // InternalDockerCompose.g:459:11: lv_command_11_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getServiceAccess().getCommandEStringParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_command_11_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getServiceRule());
            	    											}
            	    											set(
            	    												current,
            	    												"command",
            	    												lv_command_11_0,
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
            	case 4 :
            	    // InternalDockerCompose.g:482:4: ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:482:4: ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:483:5: {...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalDockerCompose.g:483:104: ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:484:6: ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalDockerCompose.g:487:9: ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:487:10: {...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:487:19: (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:487:20: otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,26,FOLLOW_5); 

            	    									newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getContainer_nameKeyword_3_3_0());
            	    								
            	    // InternalDockerCompose.g:491:9: ( (lv_container_name_13_0= ruleEString ) )
            	    // InternalDockerCompose.g:492:10: (lv_container_name_13_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:492:10: (lv_container_name_13_0= ruleEString )
            	    // InternalDockerCompose.g:493:11: lv_container_name_13_0= ruleEString
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
            	    // InternalDockerCompose.g:516:4: ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:516:4: ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) )
            	    // InternalDockerCompose.g:517:5: {...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalDockerCompose.g:517:104: ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) )
            	    // InternalDockerCompose.g:518:6: ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalDockerCompose.g:521:9: ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) )
            	    // InternalDockerCompose.g:521:10: {...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:521:19: (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) )
            	    // InternalDockerCompose.g:521:20: otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) )
            	    {
            	    otherlv_14=(Token)match(input,27,FOLLOW_12); 

            	    									newLeafNode(otherlv_14, grammarAccess.getServiceAccess().getRestartKeyword_3_4_0());
            	    								
            	    // InternalDockerCompose.g:525:9: ( (lv_restart_15_0= ruleRestartPolicy ) )
            	    // InternalDockerCompose.g:526:10: (lv_restart_15_0= ruleRestartPolicy )
            	    {
            	    // InternalDockerCompose.g:526:10: (lv_restart_15_0= ruleRestartPolicy )
            	    // InternalDockerCompose.g:527:11: lv_restart_15_0= ruleRestartPolicy
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
            	    // InternalDockerCompose.g:550:4: ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:550:4: ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:551:5: {...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalDockerCompose.g:551:104: ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:552:6: ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalDockerCompose.g:555:9: ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:555:10: {...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:555:19: (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:555:20: otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) )
            	    {
            	    otherlv_16=(Token)match(input,28,FOLLOW_13); 

            	    									newLeafNode(otherlv_16, grammarAccess.getServiceAccess().getInitKeyword_3_5_0());
            	    								
            	    // InternalDockerCompose.g:559:9: ( (lv_init_17_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:560:10: (lv_init_17_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:560:10: (lv_init_17_0= ruleEBoolean )
            	    // InternalDockerCompose.g:561:11: lv_init_17_0= ruleEBoolean
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
            	    // InternalDockerCompose.g:584:4: ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:584:4: ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:585:5: {...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalDockerCompose.g:585:104: ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:586:6: ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalDockerCompose.g:589:9: ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:589:10: {...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:589:19: (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:589:20: otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) )
            	    {
            	    otherlv_18=(Token)match(input,29,FOLLOW_13); 

            	    									newLeafNode(otherlv_18, grammarAccess.getServiceAccess().getRead_onlyKeyword_3_6_0());
            	    								
            	    // InternalDockerCompose.g:593:9: ( (lv_read_only_19_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:594:10: (lv_read_only_19_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:594:10: (lv_read_only_19_0= ruleEBoolean )
            	    // InternalDockerCompose.g:595:11: lv_read_only_19_0= ruleEBoolean
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
            	    // InternalDockerCompose.g:618:4: ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:618:4: ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:619:5: {...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalDockerCompose.g:619:104: ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) )
            	    // InternalDockerCompose.g:620:6: ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalDockerCompose.g:623:9: ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) )
            	    // InternalDockerCompose.g:623:10: {...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:623:19: (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ )
            	    // InternalDockerCompose.g:623:20: otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+
            	    {
            	    otherlv_20=(Token)match(input,30,FOLLOW_14); 

            	    									newLeafNode(otherlv_20, grammarAccess.getServiceAccess().getLinksKeyword_3_7_0());
            	    								
            	    // InternalDockerCompose.g:627:9: (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==31) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:628:10: otherlv_21= '-' ( (lv_links_22_0= ruleLink ) )
            	    	    {
            	    	    otherlv_21=(Token)match(input,31,FOLLOW_5); 

            	    	    										newLeafNode(otherlv_21, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_7_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:632:10: ( (lv_links_22_0= ruleLink ) )
            	    	    // InternalDockerCompose.g:633:11: (lv_links_22_0= ruleLink )
            	    	    {
            	    	    // InternalDockerCompose.g:633:11: (lv_links_22_0= ruleLink )
            	    	    // InternalDockerCompose.g:634:12: lv_links_22_0= ruleLink
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServiceAccess().getLinksLinkParserRuleCall_3_7_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_15);
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
            	    // InternalDockerCompose.g:658:4: ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:658:4: ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) )
            	    // InternalDockerCompose.g:659:5: {...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalDockerCompose.g:659:104: ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) )
            	    // InternalDockerCompose.g:660:6: ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalDockerCompose.g:663:9: ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) )
            	    // InternalDockerCompose.g:663:10: {...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:663:19: (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) )
            	    // InternalDockerCompose.g:663:20: otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ )
            	    {
            	    otherlv_23=(Token)match(input,32,FOLLOW_16); 

            	    									newLeafNode(otherlv_23, grammarAccess.getServiceAccess().getDepends_onKeyword_3_8_0());
            	    								
            	    // InternalDockerCompose.g:667:9: ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==31) ) {
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
            	            // InternalDockerCompose.g:668:10: ( (lv_depends_on_24_0= ruleDependency_short ) )+
            	            {
            	            // InternalDockerCompose.g:668:10: ( (lv_depends_on_24_0= ruleDependency_short ) )+
            	            int cnt9=0;
            	            loop9:
            	            do {
            	                int alt9=2;
            	                int LA9_0 = input.LA(1);

            	                if ( (LA9_0==31) ) {
            	                    alt9=1;
            	                }


            	                switch (alt9) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:669:11: (lv_depends_on_24_0= ruleDependency_short )
            	            	    {
            	            	    // InternalDockerCompose.g:669:11: (lv_depends_on_24_0= ruleDependency_short )
            	            	    // InternalDockerCompose.g:670:12: lv_depends_on_24_0= ruleDependency_short
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getServiceAccess().getDepends_onDependency_shortParserRuleCall_3_8_1_0_0());
            	            	    											
            	            	    pushFollow(FOLLOW_15);
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
            	            // InternalDockerCompose.g:688:10: ( (lv_depends_on_25_0= ruleDependency_long ) )+
            	            {
            	            // InternalDockerCompose.g:688:10: ( (lv_depends_on_25_0= ruleDependency_long ) )+
            	            int cnt10=0;
            	            loop10:
            	            do {
            	                int alt10=2;
            	                int LA10_0 = input.LA(1);

            	                if ( (LA10_0==RULE_STRING) ) {
            	                    int LA10_2 = input.LA(2);

            	                    if ( (LA10_2==21) ) {
            	                        int LA10_4 = input.LA(3);

            	                        if ( (LA10_4==36) ) {
            	                            alt10=1;
            	                        }


            	                    }


            	                }
            	                else if ( (LA10_0==RULE_ID) ) {
            	                    int LA10_3 = input.LA(2);

            	                    if ( (LA10_3==21) ) {
            	                        int LA10_4 = input.LA(3);

            	                        if ( (LA10_4==36) ) {
            	                            alt10=1;
            	                        }


            	                    }


            	                }


            	                switch (alt10) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:689:11: (lv_depends_on_25_0= ruleDependency_long )
            	            	    {
            	            	    // InternalDockerCompose.g:689:11: (lv_depends_on_25_0= ruleDependency_long )
            	            	    // InternalDockerCompose.g:690:12: lv_depends_on_25_0= ruleDependency_long
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getServiceAccess().getDepends_onDependency_longParserRuleCall_3_8_1_1_0());
            	            	    											
            	            	    pushFollow(FOLLOW_17);
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
            	    // InternalDockerCompose.g:714:4: ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:714:4: ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) )
            	    // InternalDockerCompose.g:715:5: {...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // InternalDockerCompose.g:715:104: ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) )
            	    // InternalDockerCompose.g:716:6: ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9);
            	    					
            	    // InternalDockerCompose.g:719:9: ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) )
            	    // InternalDockerCompose.g:719:10: {...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:719:19: (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ )
            	    // InternalDockerCompose.g:719:20: otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+
            	    {
            	    otherlv_26=(Token)match(input,20,FOLLOW_16); 

            	    									newLeafNode(otherlv_26, grammarAccess.getServiceAccess().getNetworksKeyword_3_9_0());
            	    								
            	    // InternalDockerCompose.g:723:9: ( (lv_networks_27_0= ruleNetworkConnector ) )+
            	    int cnt12=0;
            	    loop12:
            	    do {
            	        int alt12=2;
            	        switch ( input.LA(1) ) {
            	        case RULE_STRING:
            	            {
            	            int LA12_2 = input.LA(2);

            	            if ( (LA12_2==21) ) {
            	                alt12=1;
            	            }


            	            }
            	            break;
            	        case RULE_ID:
            	            {
            	            int LA12_3 = input.LA(2);

            	            if ( (LA12_3==21) ) {
            	                alt12=1;
            	            }


            	            }
            	            break;
            	        case 31:
            	            {
            	            alt12=1;
            	            }
            	            break;

            	        }

            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:724:10: (lv_networks_27_0= ruleNetworkConnector )
            	    	    {
            	    	    // InternalDockerCompose.g:724:10: (lv_networks_27_0= ruleNetworkConnector )
            	    	    // InternalDockerCompose.g:725:11: lv_networks_27_0= ruleNetworkConnector
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getServiceAccess().getNetworksNetworkConnectorParserRuleCall_3_9_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_17);
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
            	    // InternalDockerCompose.g:748:4: ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:748:4: ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) )
            	    // InternalDockerCompose.g:749:5: {...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // InternalDockerCompose.g:749:105: ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:750:6: ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10);
            	    					
            	    // InternalDockerCompose.g:753:9: ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) )
            	    // InternalDockerCompose.g:753:10: {...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:753:19: (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) )
            	    // InternalDockerCompose.g:753:20: otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ )
            	    {
            	    otherlv_28=(Token)match(input,17,FOLLOW_14); 

            	    									newLeafNode(otherlv_28, grammarAccess.getServiceAccess().getVolumesKeyword_3_10_0());
            	    								
            	    // InternalDockerCompose.g:757:9: ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==31) ) {
            	        int LA15_1 = input.LA(2);

            	        if ( (LA15_1==RULE_ID||LA15_1==RULE_STRING) ) {
            	            alt15=1;
            	        }
            	        else if ( (LA15_1==29||(LA15_1>=41 && LA15_1<=44)||LA15_1==46||LA15_1==48) ) {
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
            	            // InternalDockerCompose.g:758:10: (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+
            	            {
            	            // InternalDockerCompose.g:758:10: (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+
            	            int cnt13=0;
            	            loop13:
            	            do {
            	                int alt13=2;
            	                int LA13_0 = input.LA(1);

            	                if ( (LA13_0==31) ) {
            	                    alt13=1;
            	                }


            	                switch (alt13) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:759:11: otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) )
            	            	    {
            	            	    otherlv_29=(Token)match(input,31,FOLLOW_5); 

            	            	    											newLeafNode(otherlv_29, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_10_1_0_0());
            	            	    										
            	            	    // InternalDockerCompose.g:763:11: ( (lv_volumes_30_0= ruleVolumeConnector_short ) )
            	            	    // InternalDockerCompose.g:764:12: (lv_volumes_30_0= ruleVolumeConnector_short )
            	            	    {
            	            	    // InternalDockerCompose.g:764:12: (lv_volumes_30_0= ruleVolumeConnector_short )
            	            	    // InternalDockerCompose.g:765:13: lv_volumes_30_0= ruleVolumeConnector_short
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getVolumesVolumeConnector_shortParserRuleCall_3_10_1_0_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_15);
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
            	            // InternalDockerCompose.g:784:10: (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+
            	            {
            	            // InternalDockerCompose.g:784:10: (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+
            	            int cnt14=0;
            	            loop14:
            	            do {
            	                int alt14=2;
            	                int LA14_0 = input.LA(1);

            	                if ( (LA14_0==31) ) {
            	                    alt14=1;
            	                }


            	                switch (alt14) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:785:11: otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) )
            	            	    {
            	            	    otherlv_31=(Token)match(input,31,FOLLOW_18); 

            	            	    											newLeafNode(otherlv_31, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_10_1_1_0());
            	            	    										
            	            	    // InternalDockerCompose.g:789:11: ( (lv_volumes_32_0= ruleVolumeConnector_long ) )
            	            	    // InternalDockerCompose.g:790:12: (lv_volumes_32_0= ruleVolumeConnector_long )
            	            	    {
            	            	    // InternalDockerCompose.g:790:12: (lv_volumes_32_0= ruleVolumeConnector_long )
            	            	    // InternalDockerCompose.g:791:13: lv_volumes_32_0= ruleVolumeConnector_long
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getVolumesVolumeConnector_longParserRuleCall_3_10_1_1_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_15);
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
            	    // InternalDockerCompose.g:816:4: ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:816:4: ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) )
            	    // InternalDockerCompose.g:817:5: {...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 11)");
            	    }
            	    // InternalDockerCompose.g:817:105: ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:818:6: ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 11);
            	    					
            	    // InternalDockerCompose.g:821:9: ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) )
            	    // InternalDockerCompose.g:821:10: {...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:821:19: (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) )
            	    // InternalDockerCompose.g:821:20: otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ )
            	    {
            	    otherlv_33=(Token)match(input,18,FOLLOW_14); 

            	    									newLeafNode(otherlv_33, grammarAccess.getServiceAccess().getConfigsKeyword_3_11_0());
            	    								
            	    // InternalDockerCompose.g:825:9: ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==31) ) {
            	        int LA18_1 = input.LA(2);

            	        if ( (LA18_1==RULE_ID||LA18_1==RULE_STRING) ) {
            	            alt18=1;
            	        }
            	        else if ( (LA18_1==41||LA18_1==43||(LA18_1>=50 && LA18_1<=52)) ) {
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
            	            // InternalDockerCompose.g:826:10: (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+
            	            {
            	            // InternalDockerCompose.g:826:10: (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+
            	            int cnt16=0;
            	            loop16:
            	            do {
            	                int alt16=2;
            	                int LA16_0 = input.LA(1);

            	                if ( (LA16_0==31) ) {
            	                    alt16=1;
            	                }


            	                switch (alt16) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:827:11: otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) )
            	            	    {
            	            	    otherlv_34=(Token)match(input,31,FOLLOW_5); 

            	            	    											newLeafNode(otherlv_34, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_11_1_0_0());
            	            	    										
            	            	    // InternalDockerCompose.g:831:11: ( (lv_configs_35_0= ruleConfigConnector_short ) )
            	            	    // InternalDockerCompose.g:832:12: (lv_configs_35_0= ruleConfigConnector_short )
            	            	    {
            	            	    // InternalDockerCompose.g:832:12: (lv_configs_35_0= ruleConfigConnector_short )
            	            	    // InternalDockerCompose.g:833:13: lv_configs_35_0= ruleConfigConnector_short
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getConfigsConfigConnector_shortParserRuleCall_3_11_1_0_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_15);
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
            	            // InternalDockerCompose.g:852:10: (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+
            	            {
            	            // InternalDockerCompose.g:852:10: (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+
            	            int cnt17=0;
            	            loop17:
            	            do {
            	                int alt17=2;
            	                int LA17_0 = input.LA(1);

            	                if ( (LA17_0==31) ) {
            	                    alt17=1;
            	                }


            	                switch (alt17) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:853:11: otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) )
            	            	    {
            	            	    otherlv_36=(Token)match(input,31,FOLLOW_19); 

            	            	    											newLeafNode(otherlv_36, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_11_1_1_0());
            	            	    										
            	            	    // InternalDockerCompose.g:857:11: ( (lv_configs_37_0= ruleConfigConnector_long ) )
            	            	    // InternalDockerCompose.g:858:12: (lv_configs_37_0= ruleConfigConnector_long )
            	            	    {
            	            	    // InternalDockerCompose.g:858:12: (lv_configs_37_0= ruleConfigConnector_long )
            	            	    // InternalDockerCompose.g:859:13: lv_configs_37_0= ruleConfigConnector_long
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getConfigsConfigConnector_longParserRuleCall_3_11_1_1_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_15);
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
            	    // InternalDockerCompose.g:884:4: ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:884:4: ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) )
            	    // InternalDockerCompose.g:885:5: {...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 12)");
            	    }
            	    // InternalDockerCompose.g:885:105: ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:886:6: ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 12);
            	    					
            	    // InternalDockerCompose.g:889:9: ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) )
            	    // InternalDockerCompose.g:889:10: {...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:889:19: (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) )
            	    // InternalDockerCompose.g:889:20: otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ )
            	    {
            	    otherlv_38=(Token)match(input,19,FOLLOW_14); 

            	    									newLeafNode(otherlv_38, grammarAccess.getServiceAccess().getSecretsKeyword_3_12_0());
            	    								
            	    // InternalDockerCompose.g:893:9: ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==31) ) {
            	        int LA21_1 = input.LA(2);

            	        if ( (LA21_1==RULE_ID||LA21_1==RULE_STRING) ) {
            	            alt21=1;
            	        }
            	        else if ( (LA21_1==41||LA21_1==43||(LA21_1>=50 && LA21_1<=52)) ) {
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
            	            // InternalDockerCompose.g:894:10: (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+
            	            {
            	            // InternalDockerCompose.g:894:10: (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+
            	            int cnt19=0;
            	            loop19:
            	            do {
            	                int alt19=2;
            	                int LA19_0 = input.LA(1);

            	                if ( (LA19_0==31) ) {
            	                    alt19=1;
            	                }


            	                switch (alt19) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:895:11: otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) )
            	            	    {
            	            	    otherlv_39=(Token)match(input,31,FOLLOW_5); 

            	            	    											newLeafNode(otherlv_39, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_12_1_0_0());
            	            	    										
            	            	    // InternalDockerCompose.g:899:11: ( (lv_secrets_40_0= ruleSecretConnector_short ) )
            	            	    // InternalDockerCompose.g:900:12: (lv_secrets_40_0= ruleSecretConnector_short )
            	            	    {
            	            	    // InternalDockerCompose.g:900:12: (lv_secrets_40_0= ruleSecretConnector_short )
            	            	    // InternalDockerCompose.g:901:13: lv_secrets_40_0= ruleSecretConnector_short
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getSecretsSecretConnector_shortParserRuleCall_3_12_1_0_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_15);
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
            	            // InternalDockerCompose.g:920:10: (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+
            	            {
            	            // InternalDockerCompose.g:920:10: (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+
            	            int cnt20=0;
            	            loop20:
            	            do {
            	                int alt20=2;
            	                int LA20_0 = input.LA(1);

            	                if ( (LA20_0==31) ) {
            	                    alt20=1;
            	                }


            	                switch (alt20) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:921:11: otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) )
            	            	    {
            	            	    otherlv_41=(Token)match(input,31,FOLLOW_19); 

            	            	    											newLeafNode(otherlv_41, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_12_1_1_0());
            	            	    										
            	            	    // InternalDockerCompose.g:925:11: ( (lv_secrets_42_0= ruleSecretConnector_long ) )
            	            	    // InternalDockerCompose.g:926:12: (lv_secrets_42_0= ruleSecretConnector_long )
            	            	    {
            	            	    // InternalDockerCompose.g:926:12: (lv_secrets_42_0= ruleSecretConnector_long )
            	            	    // InternalDockerCompose.g:927:13: lv_secrets_42_0= ruleSecretConnector_long
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getSecretsSecretConnector_longParserRuleCall_3_12_1_1_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_15);
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
            	    // InternalDockerCompose.g:952:4: ({...}? => ( ({...}? => (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:952:4: ({...}? => ( ({...}? => (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:953:5: {...}? => ( ({...}? => (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 13)");
            	    }
            	    // InternalDockerCompose.g:953:105: ( ({...}? => (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ ) ) )
            	    // InternalDockerCompose.g:954:6: ({...}? => (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 13);
            	    					
            	    // InternalDockerCompose.g:957:9: ({...}? => (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ ) )
            	    // InternalDockerCompose.g:957:10: {...}? => (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:957:19: (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ )
            	    // InternalDockerCompose.g:957:20: otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+
            	    {
            	    otherlv_43=(Token)match(input,33,FOLLOW_14); 

            	    									newLeafNode(otherlv_43, grammarAccess.getServiceAccess().getDevicesKeyword_3_13_0());
            	    								
            	    // InternalDockerCompose.g:961:9: (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+
            	    int cnt22=0;
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==31) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:962:10: otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) )
            	    	    {
            	    	    otherlv_44=(Token)match(input,31,FOLLOW_20); 

            	    	    										newLeafNode(otherlv_44, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_13_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:966:10: ( (lv_devices_45_0= ruleDevice ) )
            	    	    // InternalDockerCompose.g:967:11: (lv_devices_45_0= ruleDevice )
            	    	    {
            	    	    // InternalDockerCompose.g:967:11: (lv_devices_45_0= ruleDevice )
            	    	    // InternalDockerCompose.g:968:12: lv_devices_45_0= ruleDevice
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServiceAccess().getDevicesDeviceParserRuleCall_3_13_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_devices_45_0=ruleDevice();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"devices",
            	    	    													lv_devices_45_0,
            	    	    													"org.xtext.example.dockercompose.DockerCompose.Device");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


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


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // InternalDockerCompose.g:992:4: ({...}? => ( ({...}? => (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:992:4: ({...}? => ( ({...}? => (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) ) ) ) )
            	    // InternalDockerCompose.g:993:5: {...}? => ( ({...}? => (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 14)");
            	    }
            	    // InternalDockerCompose.g:993:105: ( ({...}? => (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) ) ) )
            	    // InternalDockerCompose.g:994:6: ({...}? => (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 14);
            	    					
            	    // InternalDockerCompose.g:997:9: ({...}? => (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) ) )
            	    // InternalDockerCompose.g:997:10: {...}? => (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:997:19: (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) )
            	    // InternalDockerCompose.g:997:20: otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) )
            	    {
            	    otherlv_46=(Token)match(input,34,FOLLOW_21); 

            	    									newLeafNode(otherlv_46, grammarAccess.getServiceAccess().getDnsKeyword_3_14_0());
            	    								
            	    // InternalDockerCompose.g:1001:9: ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==31) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==RULE_INT) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalDockerCompose.g:1002:10: (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+
            	            {
            	            // InternalDockerCompose.g:1002:10: (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+
            	            int cnt23=0;
            	            loop23:
            	            do {
            	                int alt23=2;
            	                int LA23_0 = input.LA(1);

            	                if ( (LA23_0==31) ) {
            	                    alt23=1;
            	                }


            	                switch (alt23) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:1003:11: otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) )
            	            	    {
            	            	    otherlv_47=(Token)match(input,31,FOLLOW_21); 

            	            	    											newLeafNode(otherlv_47, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_14_1_0_0());
            	            	    										
            	            	    // InternalDockerCompose.g:1007:11: ( (lv_dns_48_0= ruleDNS ) )
            	            	    // InternalDockerCompose.g:1008:12: (lv_dns_48_0= ruleDNS )
            	            	    {
            	            	    // InternalDockerCompose.g:1008:12: (lv_dns_48_0= ruleDNS )
            	            	    // InternalDockerCompose.g:1009:13: lv_dns_48_0= ruleDNS
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getDnsDNSParserRuleCall_3_14_1_0_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_15);
            	            	    lv_dns_48_0=ruleDNS();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"dns",
            	            	    														lv_dns_48_0,
            	            	    														"org.xtext.example.dockercompose.DockerCompose.DNS");
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
            	            break;
            	        case 2 :
            	            // InternalDockerCompose.g:1028:10: ( (lv_dns_49_0= ruleDNS ) )
            	            {
            	            // InternalDockerCompose.g:1028:10: ( (lv_dns_49_0= ruleDNS ) )
            	            // InternalDockerCompose.g:1029:11: (lv_dns_49_0= ruleDNS )
            	            {
            	            // InternalDockerCompose.g:1029:11: (lv_dns_49_0= ruleDNS )
            	            // InternalDockerCompose.g:1030:12: lv_dns_49_0= ruleDNS
            	            {

            	            												newCompositeNode(grammarAccess.getServiceAccess().getDnsDNSParserRuleCall_3_14_1_1_0());
            	            											
            	            pushFollow(FOLLOW_10);
            	            lv_dns_49_0=ruleDNS();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getServiceRule());
            	            												}
            	            												add(
            	            													current,
            	            													"dns",
            	            													lv_dns_49_0,
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
            	case 16 :
            	    // InternalDockerCompose.g:1054:4: ({...}? => ( ({...}? => (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1054:4: ({...}? => ( ({...}? => (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:1055:5: {...}? => ( ({...}? => (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 15)");
            	    }
            	    // InternalDockerCompose.g:1055:105: ( ({...}? => (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ ) ) )
            	    // InternalDockerCompose.g:1056:6: ({...}? => (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 15);
            	    					
            	    // InternalDockerCompose.g:1059:9: ({...}? => (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ ) )
            	    // InternalDockerCompose.g:1059:10: {...}? => (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:1059:19: (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ )
            	    // InternalDockerCompose.g:1059:20: otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+
            	    {
            	    otherlv_50=(Token)match(input,35,FOLLOW_14); 

            	    									newLeafNode(otherlv_50, grammarAccess.getServiceAccess().getPortsKeyword_3_15_0());
            	    								
            	    // InternalDockerCompose.g:1063:9: (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+
            	    int cnt25=0;
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==31) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:1064:10: otherlv_51= '-' ( (lv_ports_52_0= rulePort ) )
            	    	    {
            	    	    otherlv_51=(Token)match(input,31,FOLLOW_22); 

            	    	    										newLeafNode(otherlv_51, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_15_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:1068:10: ( (lv_ports_52_0= rulePort ) )
            	    	    // InternalDockerCompose.g:1069:11: (lv_ports_52_0= rulePort )
            	    	    {
            	    	    // InternalDockerCompose.g:1069:11: (lv_ports_52_0= rulePort )
            	    	    // InternalDockerCompose.g:1070:12: lv_ports_52_0= rulePort
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServiceAccess().getPortsPortParserRuleCall_3_15_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_ports_52_0=rulePort();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"ports",
            	    	    													lv_ports_52_0,
            	    	    													"org.xtext.example.dockercompose.DockerCompose.Port");
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

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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


    // $ANTLR start "entryRulePort"
    // InternalDockerCompose.g:1106:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalDockerCompose.g:1106:45: (iv_rulePort= rulePort EOF )
            // InternalDockerCompose.g:1107:2: iv_rulePort= rulePort EOF
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
    // InternalDockerCompose.g:1113:1: rulePort returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_PORT_DEF ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:1119:2: ( ( () ( (lv_value_1_0= RULE_PORT_DEF ) ) ) )
            // InternalDockerCompose.g:1120:2: ( () ( (lv_value_1_0= RULE_PORT_DEF ) ) )
            {
            // InternalDockerCompose.g:1120:2: ( () ( (lv_value_1_0= RULE_PORT_DEF ) ) )
            // InternalDockerCompose.g:1121:3: () ( (lv_value_1_0= RULE_PORT_DEF ) )
            {
            // InternalDockerCompose.g:1121:3: ()
            // InternalDockerCompose.g:1122:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPortAccess().getPortAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1128:3: ( (lv_value_1_0= RULE_PORT_DEF ) )
            // InternalDockerCompose.g:1129:4: (lv_value_1_0= RULE_PORT_DEF )
            {
            // InternalDockerCompose.g:1129:4: (lv_value_1_0= RULE_PORT_DEF )
            // InternalDockerCompose.g:1130:5: lv_value_1_0= RULE_PORT_DEF
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
    // InternalDockerCompose.g:1150:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalDockerCompose.g:1150:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalDockerCompose.g:1151:2: iv_ruleDevice= ruleDevice EOF
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
    // InternalDockerCompose.g:1157:1: ruleDevice returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_DEVICE_DEF ) ) ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:1163:2: ( ( () ( (lv_value_1_0= RULE_DEVICE_DEF ) ) ) )
            // InternalDockerCompose.g:1164:2: ( () ( (lv_value_1_0= RULE_DEVICE_DEF ) ) )
            {
            // InternalDockerCompose.g:1164:2: ( () ( (lv_value_1_0= RULE_DEVICE_DEF ) ) )
            // InternalDockerCompose.g:1165:3: () ( (lv_value_1_0= RULE_DEVICE_DEF ) )
            {
            // InternalDockerCompose.g:1165:3: ()
            // InternalDockerCompose.g:1166:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeviceAccess().getDeviceAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1172:3: ( (lv_value_1_0= RULE_DEVICE_DEF ) )
            // InternalDockerCompose.g:1173:4: (lv_value_1_0= RULE_DEVICE_DEF )
            {
            // InternalDockerCompose.g:1173:4: (lv_value_1_0= RULE_DEVICE_DEF )
            // InternalDockerCompose.g:1174:5: lv_value_1_0= RULE_DEVICE_DEF
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
    // InternalDockerCompose.g:1194:1: entryRuleImage returns [String current=null] : iv_ruleImage= ruleImage EOF ;
    public final String entryRuleImage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImage = null;


        try {
            // InternalDockerCompose.g:1194:45: (iv_ruleImage= ruleImage EOF )
            // InternalDockerCompose.g:1195:2: iv_ruleImage= ruleImage EOF
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
    // InternalDockerCompose.g:1201:1: ruleImage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString | (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+ ) ) ;
    public final AntlrDatatypeRuleToken ruleImage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        Token kw=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_EString_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1207:2: ( (this_EString_0= ruleEString | (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+ ) ) )
            // InternalDockerCompose.g:1208:2: (this_EString_0= ruleEString | (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+ ) )
            {
            // InternalDockerCompose.g:1208:2: (this_EString_0= ruleEString | (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+ ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                int LA28_2 = input.LA(2);

                if ( (LA28_2==21) ) {
                    alt28=2;
                }
                else if ( (LA28_2==EOF||LA28_2==RULE_ID||LA28_2==RULE_STRING||(LA28_2>=15 && LA28_2<=20)||(LA28_2>=22 && LA28_2<=30)||(LA28_2>=32 && LA28_2<=35)) ) {
                    alt28=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalDockerCompose.g:1209:3: this_EString_0= ruleEString
                    {

                    			newCompositeNode(grammarAccess.getImageAccess().getEStringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EString_0=ruleEString();

                    state._fsp--;


                    			current.merge(this_EString_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:1220:3: (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+ )
                    {
                    // InternalDockerCompose.g:1220:3: (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+ )
                    // InternalDockerCompose.g:1221:4: this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_7); 

                    				current.merge(this_ID_1);
                    			

                    				newLeafNode(this_ID_1, grammarAccess.getImageAccess().getIDTerminalRuleCall_1_0());
                    			
                    // InternalDockerCompose.g:1228:4: (kw= ':' this_ID_3= RULE_ID )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==21) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalDockerCompose.g:1229:5: kw= ':' this_ID_3= RULE_ID
                    	    {
                    	    kw=(Token)match(input,21,FOLLOW_23); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getImageAccess().getColonKeyword_1_1_0());
                    	    				
                    	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_24); 

                    	    					current.merge(this_ID_3);
                    	    				

                    	    					newLeafNode(this_ID_3, grammarAccess.getImageAccess().getIDTerminalRuleCall_1_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);


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
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleLink"
    // InternalDockerCompose.g:1247:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalDockerCompose.g:1247:45: (iv_ruleLink= ruleLink EOF )
            // InternalDockerCompose.g:1248:2: iv_ruleLink= ruleLink EOF
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
    // InternalDockerCompose.g:1254:1: ruleLink returns [EObject current=null] : ( () ( ( ruleEString ) ) (otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_alias_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1260:2: ( ( () ( ( ruleEString ) ) (otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) ) )? ) )
            // InternalDockerCompose.g:1261:2: ( () ( ( ruleEString ) ) (otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) ) )? )
            {
            // InternalDockerCompose.g:1261:2: ( () ( ( ruleEString ) ) (otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) ) )? )
            // InternalDockerCompose.g:1262:3: () ( ( ruleEString ) ) (otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) ) )?
            {
            // InternalDockerCompose.g:1262:3: ()
            // InternalDockerCompose.g:1263:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkAccess().getLinkAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1269:3: ( ( ruleEString ) )
            // InternalDockerCompose.g:1270:4: ( ruleEString )
            {
            // InternalDockerCompose.g:1270:4: ( ruleEString )
            // InternalDockerCompose.g:1271:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkAccess().getServiceServiceCrossReference_1_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDockerCompose.g:1285:3: (otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDockerCompose.g:1286:4: otherlv_2= ':' ( (lv_alias_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getColonKeyword_2_0());
                    			
                    // InternalDockerCompose.g:1290:4: ( (lv_alias_3_0= ruleEString ) )
                    // InternalDockerCompose.g:1291:5: (lv_alias_3_0= ruleEString )
                    {
                    // InternalDockerCompose.g:1291:5: (lv_alias_3_0= ruleEString )
                    // InternalDockerCompose.g:1292:6: lv_alias_3_0= ruleEString
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
    // InternalDockerCompose.g:1314:1: entryRuleDependency_short returns [EObject current=null] : iv_ruleDependency_short= ruleDependency_short EOF ;
    public final EObject entryRuleDependency_short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency_short = null;


        try {
            // InternalDockerCompose.g:1314:57: (iv_ruleDependency_short= ruleDependency_short EOF )
            // InternalDockerCompose.g:1315:2: iv_ruleDependency_short= ruleDependency_short EOF
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
    // InternalDockerCompose.g:1321:1: ruleDependency_short returns [EObject current=null] : ( () otherlv_1= '-' ( ( ruleEString ) ) ) ;
    public final EObject ruleDependency_short() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:1327:2: ( ( () otherlv_1= '-' ( ( ruleEString ) ) ) )
            // InternalDockerCompose.g:1328:2: ( () otherlv_1= '-' ( ( ruleEString ) ) )
            {
            // InternalDockerCompose.g:1328:2: ( () otherlv_1= '-' ( ( ruleEString ) ) )
            // InternalDockerCompose.g:1329:3: () otherlv_1= '-' ( ( ruleEString ) )
            {
            // InternalDockerCompose.g:1329:3: ()
            // InternalDockerCompose.g:1330:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDependency_shortAccess().getDependencyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDependency_shortAccess().getHyphenMinusKeyword_1());
            		
            // InternalDockerCompose.g:1340:3: ( ( ruleEString ) )
            // InternalDockerCompose.g:1341:4: ( ruleEString )
            {
            // InternalDockerCompose.g:1341:4: ( ruleEString )
            // InternalDockerCompose.g:1342:5: ruleEString
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
    // InternalDockerCompose.g:1360:1: entryRuleDependency_long returns [EObject current=null] : iv_ruleDependency_long= ruleDependency_long EOF ;
    public final EObject entryRuleDependency_long() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency_long = null;


        try {
            // InternalDockerCompose.g:1360:56: (iv_ruleDependency_long= ruleDependency_long EOF )
            // InternalDockerCompose.g:1361:2: iv_ruleDependency_long= ruleDependency_long EOF
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
    // InternalDockerCompose.g:1367:1: ruleDependency_long returns [EObject current=null] : ( () ( ( ruleEString ) ) otherlv_2= ':' otherlv_3= 'condition:' ( (lv_condition_4_0= ruleCondition ) ) ) ;
    public final EObject ruleDependency_long() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_condition_4_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1373:2: ( ( () ( ( ruleEString ) ) otherlv_2= ':' otherlv_3= 'condition:' ( (lv_condition_4_0= ruleCondition ) ) ) )
            // InternalDockerCompose.g:1374:2: ( () ( ( ruleEString ) ) otherlv_2= ':' otherlv_3= 'condition:' ( (lv_condition_4_0= ruleCondition ) ) )
            {
            // InternalDockerCompose.g:1374:2: ( () ( ( ruleEString ) ) otherlv_2= ':' otherlv_3= 'condition:' ( (lv_condition_4_0= ruleCondition ) ) )
            // InternalDockerCompose.g:1375:3: () ( ( ruleEString ) ) otherlv_2= ':' otherlv_3= 'condition:' ( (lv_condition_4_0= ruleCondition ) )
            {
            // InternalDockerCompose.g:1375:3: ()
            // InternalDockerCompose.g:1376:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDependency_longAccess().getDependencyAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1382:3: ( ( ruleEString ) )
            // InternalDockerCompose.g:1383:4: ( ruleEString )
            {
            // InternalDockerCompose.g:1383:4: ( ruleEString )
            // InternalDockerCompose.g:1384:5: ruleEString
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

            otherlv_2=(Token)match(input,21,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getDependency_longAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getDependency_longAccess().getConditionKeyword_3());
            		
            // InternalDockerCompose.g:1406:3: ( (lv_condition_4_0= ruleCondition ) )
            // InternalDockerCompose.g:1407:4: (lv_condition_4_0= ruleCondition )
            {
            // InternalDockerCompose.g:1407:4: (lv_condition_4_0= ruleCondition )
            // InternalDockerCompose.g:1408:5: lv_condition_4_0= ruleCondition
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
    // InternalDockerCompose.g:1429:1: entryRuleNetworkConnector returns [EObject current=null] : iv_ruleNetworkConnector= ruleNetworkConnector EOF ;
    public final EObject entryRuleNetworkConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConnector = null;


        try {
            // InternalDockerCompose.g:1429:57: (iv_ruleNetworkConnector= ruleNetworkConnector EOF )
            // InternalDockerCompose.g:1430:2: iv_ruleNetworkConnector= ruleNetworkConnector EOF
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
    // InternalDockerCompose.g:1436:1: ruleNetworkConnector returns [EObject current=null] : ( () ( (otherlv_1= '-' ( ( ruleEString ) ) ) | ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) ) ) ) ;
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
            // InternalDockerCompose.g:1442:2: ( ( () ( (otherlv_1= '-' ( ( ruleEString ) ) ) | ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) ) ) ) )
            // InternalDockerCompose.g:1443:2: ( () ( (otherlv_1= '-' ( ( ruleEString ) ) ) | ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) ) ) )
            {
            // InternalDockerCompose.g:1443:2: ( () ( (otherlv_1= '-' ( ( ruleEString ) ) ) | ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) ) ) )
            // InternalDockerCompose.g:1444:3: () ( (otherlv_1= '-' ( ( ruleEString ) ) ) | ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) ) )
            {
            // InternalDockerCompose.g:1444:3: ()
            // InternalDockerCompose.g:1445:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkConnectorAccess().getNetworkConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1451:3: ( (otherlv_1= '-' ( ( ruleEString ) ) ) | ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_ID||LA33_0==RULE_STRING) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalDockerCompose.g:1452:4: (otherlv_1= '-' ( ( ruleEString ) ) )
                    {
                    // InternalDockerCompose.g:1452:4: (otherlv_1= '-' ( ( ruleEString ) ) )
                    // InternalDockerCompose.g:1453:5: otherlv_1= '-' ( ( ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_5); 

                    					newLeafNode(otherlv_1, grammarAccess.getNetworkConnectorAccess().getHyphenMinusKeyword_1_0_0());
                    				
                    // InternalDockerCompose.g:1457:5: ( ( ruleEString ) )
                    // InternalDockerCompose.g:1458:6: ( ruleEString )
                    {
                    // InternalDockerCompose.g:1458:6: ( ruleEString )
                    // InternalDockerCompose.g:1459:7: ruleEString
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
                    // InternalDockerCompose.g:1475:4: ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) )
                    {
                    // InternalDockerCompose.g:1475:4: ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) )
                    // InternalDockerCompose.g:1476:5: ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) )
                    {
                    // InternalDockerCompose.g:1476:5: ( ( ruleEString ) )
                    // InternalDockerCompose.g:1477:6: ( ruleEString )
                    {
                    // InternalDockerCompose.g:1477:6: ( ruleEString )
                    // InternalDockerCompose.g:1478:7: ruleEString
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

                    otherlv_4=(Token)match(input,21,FOLLOW_27); 

                    					newLeafNode(otherlv_4, grammarAccess.getNetworkConnectorAccess().getColonKeyword_1_1_1());
                    				
                    // InternalDockerCompose.g:1496:5: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) )
                    // InternalDockerCompose.g:1497:6: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) )
                    {
                    // InternalDockerCompose.g:1497:6: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) )
                    // InternalDockerCompose.g:1498:7: ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* )
                    {
                     
                    						  getUnorderedGroupHelper().enter(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2());
                    						
                    // InternalDockerCompose.g:1501:7: ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* )
                    // InternalDockerCompose.g:1502:8: ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )*
                    {
                    // InternalDockerCompose.g:1502:8: ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )*
                    loop32:
                    do {
                        int alt32=5;
                        int LA32_0 = input.LA(1);

                        if ( LA32_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 0) ) {
                            alt32=1;
                        }
                        else if ( LA32_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 1) ) {
                            alt32=2;
                        }
                        else if ( LA32_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 2) ) {
                            alt32=3;
                        }
                        else if ( LA32_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 3) ) {
                            alt32=4;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalDockerCompose.g:1503:6: ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1503:6: ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1504:7: {...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 0)");
                    	    }
                    	    // InternalDockerCompose.g:1504:119: ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) )
                    	    // InternalDockerCompose.g:1505:8: ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 0);
                    	    							
                    	    // InternalDockerCompose.g:1508:11: ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) )
                    	    // InternalDockerCompose.g:1508:12: {...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1508:21: (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) )
                    	    // InternalDockerCompose.g:1508:22: otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) )
                    	    {
                    	    otherlv_6=(Token)match(input,37,FOLLOW_21); 

                    	    											newLeafNode(otherlv_6, grammarAccess.getNetworkConnectorAccess().getIpv4_addressKeyword_1_1_2_0_0());
                    	    										
                    	    // InternalDockerCompose.g:1512:11: ( (lv_ipv4_address_7_0= ruleDNS ) )
                    	    // InternalDockerCompose.g:1513:12: (lv_ipv4_address_7_0= ruleDNS )
                    	    {
                    	    // InternalDockerCompose.g:1513:12: (lv_ipv4_address_7_0= ruleDNS )
                    	    // InternalDockerCompose.g:1514:13: lv_ipv4_address_7_0= ruleDNS
                    	    {

                    	    													newCompositeNode(grammarAccess.getNetworkConnectorAccess().getIpv4_addressDNSParserRuleCall_1_1_2_0_1_0());
                    	    												
                    	    pushFollow(FOLLOW_27);
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
                    	    // InternalDockerCompose.g:1537:6: ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1537:6: ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1538:7: {...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 1)");
                    	    }
                    	    // InternalDockerCompose.g:1538:119: ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) )
                    	    // InternalDockerCompose.g:1539:8: ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 1);
                    	    							
                    	    // InternalDockerCompose.g:1542:11: ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) )
                    	    // InternalDockerCompose.g:1542:12: {...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1542:21: (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) )
                    	    // InternalDockerCompose.g:1542:22: otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) )
                    	    {
                    	    otherlv_8=(Token)match(input,38,FOLLOW_11); 

                    	    											newLeafNode(otherlv_8, grammarAccess.getNetworkConnectorAccess().getPriorityKeyword_1_1_2_1_0());
                    	    										
                    	    // InternalDockerCompose.g:1546:11: ( (lv_priority_9_0= ruleEInt ) )
                    	    // InternalDockerCompose.g:1547:12: (lv_priority_9_0= ruleEInt )
                    	    {
                    	    // InternalDockerCompose.g:1547:12: (lv_priority_9_0= ruleEInt )
                    	    // InternalDockerCompose.g:1548:13: lv_priority_9_0= ruleEInt
                    	    {

                    	    													newCompositeNode(grammarAccess.getNetworkConnectorAccess().getPriorityEIntParserRuleCall_1_1_2_1_1_0());
                    	    												
                    	    pushFollow(FOLLOW_27);
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
                    	    // InternalDockerCompose.g:1571:6: ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1571:6: ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) )
                    	    // InternalDockerCompose.g:1572:7: {...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 2)");
                    	    }
                    	    // InternalDockerCompose.g:1572:119: ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) )
                    	    // InternalDockerCompose.g:1573:8: ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 2);
                    	    							
                    	    // InternalDockerCompose.g:1576:11: ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) )
                    	    // InternalDockerCompose.g:1576:12: {...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1576:21: (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ )
                    	    // InternalDockerCompose.g:1576:22: otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+
                    	    {
                    	    otherlv_10=(Token)match(input,39,FOLLOW_14); 

                    	    											newLeafNode(otherlv_10, grammarAccess.getNetworkConnectorAccess().getAliasesKeyword_1_1_2_2_0());
                    	    										
                    	    // InternalDockerCompose.g:1580:11: (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+
                    	    int cnt30=0;
                    	    loop30:
                    	    do {
                    	        int alt30=2;
                    	        int LA30_0 = input.LA(1);

                    	        if ( (LA30_0==31) ) {
                    	            int LA30_2 = input.LA(2);

                    	            if ( (LA30_2==RULE_STRING) ) {
                    	                alt30=1;
                    	            }
                    	            else if ( (LA30_2==RULE_ID) ) {
                    	                alt30=1;
                    	            }


                    	        }


                    	        switch (alt30) {
                    	    	case 1 :
                    	    	    // InternalDockerCompose.g:1581:12: otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) )
                    	    	    {
                    	    	    otherlv_11=(Token)match(input,31,FOLLOW_5); 

                    	    	    												newLeafNode(otherlv_11, grammarAccess.getNetworkConnectorAccess().getHyphenMinusKeyword_1_1_2_2_1_0());
                    	    	    											
                    	    	    // InternalDockerCompose.g:1585:12: ( (lv_aliases_12_0= ruleAlias ) )
                    	    	    // InternalDockerCompose.g:1586:13: (lv_aliases_12_0= ruleAlias )
                    	    	    {
                    	    	    // InternalDockerCompose.g:1586:13: (lv_aliases_12_0= ruleAlias )
                    	    	    // InternalDockerCompose.g:1587:14: lv_aliases_12_0= ruleAlias
                    	    	    {

                    	    	    														newCompositeNode(grammarAccess.getNetworkConnectorAccess().getAliasesAliasParserRuleCall_1_1_2_2_1_1_0());
                    	    	    													
                    	    	    pushFollow(FOLLOW_28);
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
                    	    	    if ( cnt30 >= 1 ) break loop30;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(30, input);
                    	                throw eee;
                    	        }
                    	        cnt30++;
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalDockerCompose.g:1611:6: ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1611:6: ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) )
                    	    // InternalDockerCompose.g:1612:7: {...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 3)");
                    	    }
                    	    // InternalDockerCompose.g:1612:119: ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) )
                    	    // InternalDockerCompose.g:1613:8: ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2(), 3);
                    	    							
                    	    // InternalDockerCompose.g:1616:11: ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) )
                    	    // InternalDockerCompose.g:1616:12: {...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1616:21: (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ )
                    	    // InternalDockerCompose.g:1616:22: otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+
                    	    {
                    	    otherlv_13=(Token)match(input,40,FOLLOW_14); 

                    	    											newLeafNode(otherlv_13, grammarAccess.getNetworkConnectorAccess().getLink_local_ipsKeyword_1_1_2_3_0());
                    	    										
                    	    // InternalDockerCompose.g:1620:11: (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+
                    	    int cnt31=0;
                    	    loop31:
                    	    do {
                    	        int alt31=2;
                    	        int LA31_0 = input.LA(1);

                    	        if ( (LA31_0==31) ) {
                    	            int LA31_2 = input.LA(2);

                    	            if ( (LA31_2==RULE_INT) ) {
                    	                alt31=1;
                    	            }


                    	        }


                    	        switch (alt31) {
                    	    	case 1 :
                    	    	    // InternalDockerCompose.g:1621:12: otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) )
                    	    	    {
                    	    	    otherlv_14=(Token)match(input,31,FOLLOW_21); 

                    	    	    												newLeafNode(otherlv_14, grammarAccess.getNetworkConnectorAccess().getHyphenMinusKeyword_1_1_2_3_1_0());
                    	    	    											
                    	    	    // InternalDockerCompose.g:1625:12: ( (lv_link_local_ips_15_0= ruleDNS ) )
                    	    	    // InternalDockerCompose.g:1626:13: (lv_link_local_ips_15_0= ruleDNS )
                    	    	    {
                    	    	    // InternalDockerCompose.g:1626:13: (lv_link_local_ips_15_0= ruleDNS )
                    	    	    // InternalDockerCompose.g:1627:14: lv_link_local_ips_15_0= ruleDNS
                    	    	    {

                    	    	    														newCompositeNode(grammarAccess.getNetworkConnectorAccess().getLink_local_ipsDNSParserRuleCall_1_1_2_3_1_1_0());
                    	    	    													
                    	    	    pushFollow(FOLLOW_28);
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
                    	    	    if ( cnt31 >= 1 ) break loop31;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(31, input);
                    	                throw eee;
                    	        }
                    	        cnt31++;
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_1_2());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
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
    // InternalDockerCompose.g:1664:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // InternalDockerCompose.g:1664:46: (iv_ruleAlias= ruleAlias EOF )
            // InternalDockerCompose.g:1665:2: iv_ruleAlias= ruleAlias EOF
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
    // InternalDockerCompose.g:1671:1: ruleAlias returns [EObject current=null] : ( () ( (lv_alias_1_0= ruleEString ) ) ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_alias_1_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1677:2: ( ( () ( (lv_alias_1_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:1678:2: ( () ( (lv_alias_1_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:1678:2: ( () ( (lv_alias_1_0= ruleEString ) ) )
            // InternalDockerCompose.g:1679:3: () ( (lv_alias_1_0= ruleEString ) )
            {
            // InternalDockerCompose.g:1679:3: ()
            // InternalDockerCompose.g:1680:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAliasAccess().getAliasAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1686:3: ( (lv_alias_1_0= ruleEString ) )
            // InternalDockerCompose.g:1687:4: (lv_alias_1_0= ruleEString )
            {
            // InternalDockerCompose.g:1687:4: (lv_alias_1_0= ruleEString )
            // InternalDockerCompose.g:1688:5: lv_alias_1_0= ruleEString
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
    // InternalDockerCompose.g:1709:1: entryRuleVolumeConnector_long returns [EObject current=null] : iv_ruleVolumeConnector_long= ruleVolumeConnector_long EOF ;
    public final EObject entryRuleVolumeConnector_long() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumeConnector_long = null;


        try {
            // InternalDockerCompose.g:1709:61: (iv_ruleVolumeConnector_long= ruleVolumeConnector_long EOF )
            // InternalDockerCompose.g:1710:2: iv_ruleVolumeConnector_long= ruleVolumeConnector_long EOF
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
    // InternalDockerCompose.g:1716:1: ruleVolumeConnector_long returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ;
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
            // InternalDockerCompose.g:1722:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalDockerCompose.g:1723:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalDockerCompose.g:1723:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalDockerCompose.g:1724:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalDockerCompose.g:1724:3: ()
            // InternalDockerCompose.g:1725:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeConnector_longAccess().getVolumeConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1731:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
            // InternalDockerCompose.g:1732:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalDockerCompose.g:1732:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
            // InternalDockerCompose.g:1733:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1());
            				
            // InternalDockerCompose.g:1736:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
            // InternalDockerCompose.g:1737:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?
            {
            // InternalDockerCompose.g:1737:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=8;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // InternalDockerCompose.g:1738:4: ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1738:4: ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:1739:5: {...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalDockerCompose.g:1739:117: ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:1740:6: ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalDockerCompose.g:1743:9: ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) )
            	    // InternalDockerCompose.g:1743:10: {...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1743:19: (otherlv_2= 'source:' ( ( ruleEString ) ) )
            	    // InternalDockerCompose.g:1743:20: otherlv_2= 'source:' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,41,FOLLOW_5); 

            	    									newLeafNode(otherlv_2, grammarAccess.getVolumeConnector_longAccess().getSourceKeyword_1_0_0());
            	    								
            	    // InternalDockerCompose.g:1747:9: ( ( ruleEString ) )
            	    // InternalDockerCompose.g:1748:10: ( ruleEString )
            	    {
            	    // InternalDockerCompose.g:1748:10: ( ruleEString )
            	    // InternalDockerCompose.g:1749:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getVolumeConnector_longRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getVolumeConnector_longAccess().getVolumeVolumeCrossReference_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_29);
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
            	    // InternalDockerCompose.g:1769:4: ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1769:4: ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) )
            	    // InternalDockerCompose.g:1770:5: {...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalDockerCompose.g:1770:117: ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) )
            	    // InternalDockerCompose.g:1771:6: ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalDockerCompose.g:1774:9: ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) )
            	    // InternalDockerCompose.g:1774:10: {...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1774:19: (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) )
            	    // InternalDockerCompose.g:1774:20: otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) )
            	    {
            	    otherlv_4=(Token)match(input,42,FOLLOW_30); 

            	    									newLeafNode(otherlv_4, grammarAccess.getVolumeConnector_longAccess().getTypeKeyword_1_1_0());
            	    								
            	    // InternalDockerCompose.g:1778:9: ( (lv_type_5_0= ruleMountType ) )
            	    // InternalDockerCompose.g:1779:10: (lv_type_5_0= ruleMountType )
            	    {
            	    // InternalDockerCompose.g:1779:10: (lv_type_5_0= ruleMountType )
            	    // InternalDockerCompose.g:1780:11: lv_type_5_0= ruleMountType
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeConnector_longAccess().getTypeMountTypeEnumRuleCall_1_1_1_0());
            	    										
            	    pushFollow(FOLLOW_29);
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
            	    // InternalDockerCompose.g:1803:4: ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1803:4: ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) )
            	    // InternalDockerCompose.g:1804:5: {...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalDockerCompose.g:1804:117: ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) )
            	    // InternalDockerCompose.g:1805:6: ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalDockerCompose.g:1808:9: ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) )
            	    // InternalDockerCompose.g:1808:10: {...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1808:19: (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) )
            	    // InternalDockerCompose.g:1808:20: otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) )
            	    {
            	    otherlv_6=(Token)match(input,43,FOLLOW_31); 

            	    									newLeafNode(otherlv_6, grammarAccess.getVolumeConnector_longAccess().getTargetKeyword_1_2_0());
            	    								
            	    // InternalDockerCompose.g:1812:9: ( (lv_container_path_7_0= rulePATH ) )
            	    // InternalDockerCompose.g:1813:10: (lv_container_path_7_0= rulePATH )
            	    {
            	    // InternalDockerCompose.g:1813:10: (lv_container_path_7_0= rulePATH )
            	    // InternalDockerCompose.g:1814:11: lv_container_path_7_0= rulePATH
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeConnector_longAccess().getContainer_pathPATHParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_29);
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
            	    // InternalDockerCompose.g:1837:4: ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1837:4: ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:1838:5: {...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalDockerCompose.g:1838:117: ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:1839:6: ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalDockerCompose.g:1842:9: ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:1842:10: {...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1842:19: (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:1842:20: otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) )
            	    {
            	    otherlv_8=(Token)match(input,29,FOLLOW_13); 

            	    									newLeafNode(otherlv_8, grammarAccess.getVolumeConnector_longAccess().getRead_onlyKeyword_1_3_0());
            	    								
            	    // InternalDockerCompose.g:1846:9: ( (lv_read_only_9_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:1847:10: (lv_read_only_9_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:1847:10: (lv_read_only_9_0= ruleEBoolean )
            	    // InternalDockerCompose.g:1848:11: lv_read_only_9_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeConnector_longAccess().getRead_onlyEBooleanParserRuleCall_1_3_1_0());
            	    										
            	    pushFollow(FOLLOW_29);
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
            	    // InternalDockerCompose.g:1871:4: ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1871:4: ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) )
            	    // InternalDockerCompose.g:1872:5: {...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalDockerCompose.g:1872:117: ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) )
            	    // InternalDockerCompose.g:1873:6: ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalDockerCompose.g:1876:9: ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) )
            	    // InternalDockerCompose.g:1876:10: {...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1876:19: (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) )
            	    // InternalDockerCompose.g:1876:20: otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) )
            	    {
            	    otherlv_10=(Token)match(input,44,FOLLOW_32); 

            	    									newLeafNode(otherlv_10, grammarAccess.getVolumeConnector_longAccess().getBindKeyword_1_4_0());
            	    								
            	    otherlv_11=(Token)match(input,45,FOLLOW_33); 

            	    									newLeafNode(otherlv_11, grammarAccess.getVolumeConnector_longAccess().getPropagationKeyword_1_4_1());
            	    								
            	    // InternalDockerCompose.g:1884:9: ( (lv_propagation_12_0= rulePropagationType ) )
            	    // InternalDockerCompose.g:1885:10: (lv_propagation_12_0= rulePropagationType )
            	    {
            	    // InternalDockerCompose.g:1885:10: (lv_propagation_12_0= rulePropagationType )
            	    // InternalDockerCompose.g:1886:11: lv_propagation_12_0= rulePropagationType
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeConnector_longAccess().getPropagationPropagationTypeEnumRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_29);
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
            	    // InternalDockerCompose.g:1909:4: ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1909:4: ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:1910:5: {...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalDockerCompose.g:1910:117: ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:1911:6: ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalDockerCompose.g:1914:9: ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:1914:10: {...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1914:19: (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:1914:20: otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) )
            	    {
            	    otherlv_13=(Token)match(input,46,FOLLOW_34); 

            	    									newLeafNode(otherlv_13, grammarAccess.getVolumeConnector_longAccess().getVolumeKeyword_1_5_0());
            	    								
            	    otherlv_14=(Token)match(input,47,FOLLOW_13); 

            	    									newLeafNode(otherlv_14, grammarAccess.getVolumeConnector_longAccess().getNocopyKeyword_1_5_1());
            	    								
            	    // InternalDockerCompose.g:1922:9: ( (lv_nocopy_15_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:1923:10: (lv_nocopy_15_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:1923:10: (lv_nocopy_15_0= ruleEBoolean )
            	    // InternalDockerCompose.g:1924:11: lv_nocopy_15_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeConnector_longAccess().getNocopyEBooleanParserRuleCall_1_5_2_0());
            	    										
            	    pushFollow(FOLLOW_29);
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
            	    // InternalDockerCompose.g:1947:4: ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1947:4: ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) )
            	    // InternalDockerCompose.g:1948:5: {...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalDockerCompose.g:1948:117: ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) )
            	    // InternalDockerCompose.g:1949:6: ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 6);
            	    					
            	    // InternalDockerCompose.g:1952:9: ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) )
            	    // InternalDockerCompose.g:1952:10: {...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1952:19: (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) )
            	    // InternalDockerCompose.g:1952:20: otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) )
            	    {
            	    otherlv_16=(Token)match(input,48,FOLLOW_35); 

            	    									newLeafNode(otherlv_16, grammarAccess.getVolumeConnector_longAccess().getTmpfsKeyword_1_6_0());
            	    								
            	    otherlv_17=(Token)match(input,49,FOLLOW_11); 

            	    									newLeafNode(otherlv_17, grammarAccess.getVolumeConnector_longAccess().getSizeKeyword_1_6_1());
            	    								
            	    // InternalDockerCompose.g:1960:9: ( (lv_size_18_0= ruleEInt ) )
            	    // InternalDockerCompose.g:1961:10: (lv_size_18_0= ruleEInt )
            	    {
            	    // InternalDockerCompose.g:1961:10: (lv_size_18_0= ruleEInt )
            	    // InternalDockerCompose.g:1962:11: lv_size_18_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeConnector_longAccess().getSizeEIntParserRuleCall_1_6_2_0());
            	    										
            	    pushFollow(FOLLOW_29);
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
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
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
    // InternalDockerCompose.g:1997:1: entryRuleVolumeConnector_short returns [EObject current=null] : iv_ruleVolumeConnector_short= ruleVolumeConnector_short EOF ;
    public final EObject entryRuleVolumeConnector_short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumeConnector_short = null;


        try {
            // InternalDockerCompose.g:1997:62: (iv_ruleVolumeConnector_short= ruleVolumeConnector_short EOF )
            // InternalDockerCompose.g:1998:2: iv_ruleVolumeConnector_short= ruleVolumeConnector_short EOF
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
    // InternalDockerCompose.g:2004:1: ruleVolumeConnector_short returns [EObject current=null] : ( () ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? ) ;
    public final EObject ruleVolumeConnector_short() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_container_path_3_0 = null;

        Enumerator lv_access_mode_5_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:2010:2: ( ( () ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? ) )
            // InternalDockerCompose.g:2011:2: ( () ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? )
            {
            // InternalDockerCompose.g:2011:2: ( () ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? )
            // InternalDockerCompose.g:2012:3: () ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )?
            {
            // InternalDockerCompose.g:2012:3: ()
            // InternalDockerCompose.g:2013:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeConnector_shortAccess().getVolumeConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2019:3: ( ( ruleEString ) )
            // InternalDockerCompose.g:2020:4: ( ruleEString )
            {
            // InternalDockerCompose.g:2020:4: ( ruleEString )
            // InternalDockerCompose.g:2021:5: ruleEString
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

            otherlv_2=(Token)match(input,21,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getVolumeConnector_shortAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:2039:3: ( (lv_container_path_3_0= rulePATH ) )
            // InternalDockerCompose.g:2040:4: (lv_container_path_3_0= rulePATH )
            {
            // InternalDockerCompose.g:2040:4: (lv_container_path_3_0= rulePATH )
            // InternalDockerCompose.g:2041:5: lv_container_path_3_0= rulePATH
            {

            					newCompositeNode(grammarAccess.getVolumeConnector_shortAccess().getContainer_pathPATHParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalDockerCompose.g:2058:3: (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==21) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDockerCompose.g:2059:4: otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_37); 

                    				newLeafNode(otherlv_4, grammarAccess.getVolumeConnector_shortAccess().getColonKeyword_4_0());
                    			
                    // InternalDockerCompose.g:2063:4: ( (lv_access_mode_5_0= ruleAccessMode ) )
                    // InternalDockerCompose.g:2064:5: (lv_access_mode_5_0= ruleAccessMode )
                    {
                    // InternalDockerCompose.g:2064:5: (lv_access_mode_5_0= ruleAccessMode )
                    // InternalDockerCompose.g:2065:6: lv_access_mode_5_0= ruleAccessMode
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
    // InternalDockerCompose.g:2087:1: entryRuleConfigConnector_long returns [EObject current=null] : iv_ruleConfigConnector_long= ruleConfigConnector_long EOF ;
    public final EObject entryRuleConfigConnector_long() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigConnector_long = null;


        try {
            // InternalDockerCompose.g:2087:61: (iv_ruleConfigConnector_long= ruleConfigConnector_long EOF )
            // InternalDockerCompose.g:2088:2: iv_ruleConfigConnector_long= ruleConfigConnector_long EOF
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
    // InternalDockerCompose.g:2094:1: ruleConfigConnector_long returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ;
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
            // InternalDockerCompose.g:2100:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalDockerCompose.g:2101:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalDockerCompose.g:2101:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalDockerCompose.g:2102:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalDockerCompose.g:2102:3: ()
            // InternalDockerCompose.g:2103:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigConnector_longAccess().getConfigConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2109:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
            // InternalDockerCompose.g:2110:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalDockerCompose.g:2110:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
            // InternalDockerCompose.g:2111:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1());
            				
            // InternalDockerCompose.g:2114:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
            // InternalDockerCompose.g:2115:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?
            {
            // InternalDockerCompose.g:2115:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=6;
                int LA36_0 = input.LA(1);

                if ( LA36_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 0) ) {
                    alt36=1;
                }
                else if ( LA36_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 1) ) {
                    alt36=2;
                }
                else if ( LA36_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 2) ) {
                    alt36=3;
                }
                else if ( LA36_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 3) ) {
                    alt36=4;
                }
                else if ( LA36_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 4) ) {
                    alt36=5;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalDockerCompose.g:2116:4: ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2116:4: ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:2117:5: {...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalDockerCompose.g:2117:117: ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:2118:6: ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalDockerCompose.g:2121:9: ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) )
            	    // InternalDockerCompose.g:2121:10: {...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2121:19: (otherlv_2= 'source:' ( ( ruleEString ) ) )
            	    // InternalDockerCompose.g:2121:20: otherlv_2= 'source:' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,41,FOLLOW_5); 

            	    									newLeafNode(otherlv_2, grammarAccess.getConfigConnector_longAccess().getSourceKeyword_1_0_0());
            	    								
            	    // InternalDockerCompose.g:2125:9: ( ( ruleEString ) )
            	    // InternalDockerCompose.g:2126:10: ( ruleEString )
            	    {
            	    // InternalDockerCompose.g:2126:10: ( ruleEString )
            	    // InternalDockerCompose.g:2127:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getConfigConnector_longRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getConfigConnector_longAccess().getConfigConfigCrossReference_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_38);
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
            	    // InternalDockerCompose.g:2147:4: ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2147:4: ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) )
            	    // InternalDockerCompose.g:2148:5: {...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalDockerCompose.g:2148:117: ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) )
            	    // InternalDockerCompose.g:2149:6: ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalDockerCompose.g:2152:9: ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) )
            	    // InternalDockerCompose.g:2152:10: {...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2152:19: (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) )
            	    // InternalDockerCompose.g:2152:20: otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) )
            	    {
            	    otherlv_4=(Token)match(input,43,FOLLOW_39); 

            	    									newLeafNode(otherlv_4, grammarAccess.getConfigConnector_longAccess().getTargetKeyword_1_1_0());
            	    								
            	    // InternalDockerCompose.g:2156:9: ( (lv_target_5_0= rulePATH ) )
            	    // InternalDockerCompose.g:2157:10: (lv_target_5_0= rulePATH )
            	    {
            	    // InternalDockerCompose.g:2157:10: (lv_target_5_0= rulePATH )
            	    // InternalDockerCompose.g:2158:11: lv_target_5_0= rulePATH
            	    {

            	    											newCompositeNode(grammarAccess.getConfigConnector_longAccess().getTargetPATHParserRuleCall_1_1_1_0());
            	    										
            	    pushFollow(FOLLOW_38);
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
            	    // InternalDockerCompose.g:2181:4: ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2181:4: ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    // InternalDockerCompose.g:2182:5: {...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalDockerCompose.g:2182:117: ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) )
            	    // InternalDockerCompose.g:2183:6: ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalDockerCompose.g:2186:9: ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) )
            	    // InternalDockerCompose.g:2186:10: {...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2186:19: (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) )
            	    // InternalDockerCompose.g:2186:20: otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) )
            	    {
            	    otherlv_6=(Token)match(input,50,FOLLOW_40); 

            	    									newLeafNode(otherlv_6, grammarAccess.getConfigConnector_longAccess().getUidKeyword_1_2_0());
            	    								
            	    // InternalDockerCompose.g:2190:9: ( (lv_uid_7_0= RULE_QUOTED_INT ) )
            	    // InternalDockerCompose.g:2191:10: (lv_uid_7_0= RULE_QUOTED_INT )
            	    {
            	    // InternalDockerCompose.g:2191:10: (lv_uid_7_0= RULE_QUOTED_INT )
            	    // InternalDockerCompose.g:2192:11: lv_uid_7_0= RULE_QUOTED_INT
            	    {
            	    lv_uid_7_0=(Token)match(input,RULE_QUOTED_INT,FOLLOW_38); 

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
            	    // InternalDockerCompose.g:2214:4: ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2214:4: ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    // InternalDockerCompose.g:2215:5: {...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalDockerCompose.g:2215:117: ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) )
            	    // InternalDockerCompose.g:2216:6: ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalDockerCompose.g:2219:9: ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) )
            	    // InternalDockerCompose.g:2219:10: {...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2219:19: (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) )
            	    // InternalDockerCompose.g:2219:20: otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) )
            	    {
            	    otherlv_8=(Token)match(input,51,FOLLOW_40); 

            	    									newLeafNode(otherlv_8, grammarAccess.getConfigConnector_longAccess().getGidKeyword_1_3_0());
            	    								
            	    // InternalDockerCompose.g:2223:9: ( (lv_gid_9_0= RULE_QUOTED_INT ) )
            	    // InternalDockerCompose.g:2224:10: (lv_gid_9_0= RULE_QUOTED_INT )
            	    {
            	    // InternalDockerCompose.g:2224:10: (lv_gid_9_0= RULE_QUOTED_INT )
            	    // InternalDockerCompose.g:2225:11: lv_gid_9_0= RULE_QUOTED_INT
            	    {
            	    lv_gid_9_0=(Token)match(input,RULE_QUOTED_INT,FOLLOW_38); 

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
            	    // InternalDockerCompose.g:2247:4: ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2247:4: ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) )
            	    // InternalDockerCompose.g:2248:5: {...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalDockerCompose.g:2248:117: ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) )
            	    // InternalDockerCompose.g:2249:6: ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalDockerCompose.g:2252:9: ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) )
            	    // InternalDockerCompose.g:2252:10: {...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2252:19: (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) )
            	    // InternalDockerCompose.g:2252:20: otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) )
            	    {
            	    otherlv_10=(Token)match(input,52,FOLLOW_11); 

            	    									newLeafNode(otherlv_10, grammarAccess.getConfigConnector_longAccess().getModeKeyword_1_4_0());
            	    								
            	    // InternalDockerCompose.g:2256:9: ( (lv_mode_11_0= ruleEInt ) )
            	    // InternalDockerCompose.g:2257:10: (lv_mode_11_0= ruleEInt )
            	    {
            	    // InternalDockerCompose.g:2257:10: (lv_mode_11_0= ruleEInt )
            	    // InternalDockerCompose.g:2258:11: lv_mode_11_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getConfigConnector_longAccess().getModeEIntParserRuleCall_1_4_1_0());
            	    										
            	    pushFollow(FOLLOW_38);
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
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
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
    // InternalDockerCompose.g:2293:1: entryRuleConfigConnector_short returns [EObject current=null] : iv_ruleConfigConnector_short= ruleConfigConnector_short EOF ;
    public final EObject entryRuleConfigConnector_short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigConnector_short = null;


        try {
            // InternalDockerCompose.g:2293:62: (iv_ruleConfigConnector_short= ruleConfigConnector_short EOF )
            // InternalDockerCompose.g:2294:2: iv_ruleConfigConnector_short= ruleConfigConnector_short EOF
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
    // InternalDockerCompose.g:2300:1: ruleConfigConnector_short returns [EObject current=null] : ( () ( ( ruleEString ) ) ) ;
    public final EObject ruleConfigConnector_short() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalDockerCompose.g:2306:2: ( ( () ( ( ruleEString ) ) ) )
            // InternalDockerCompose.g:2307:2: ( () ( ( ruleEString ) ) )
            {
            // InternalDockerCompose.g:2307:2: ( () ( ( ruleEString ) ) )
            // InternalDockerCompose.g:2308:3: () ( ( ruleEString ) )
            {
            // InternalDockerCompose.g:2308:3: ()
            // InternalDockerCompose.g:2309:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigConnector_shortAccess().getConfigConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2315:3: ( ( ruleEString ) )
            // InternalDockerCompose.g:2316:4: ( ruleEString )
            {
            // InternalDockerCompose.g:2316:4: ( ruleEString )
            // InternalDockerCompose.g:2317:5: ruleEString
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
    // InternalDockerCompose.g:2335:1: entryRuleSecretConnector_long returns [EObject current=null] : iv_ruleSecretConnector_long= ruleSecretConnector_long EOF ;
    public final EObject entryRuleSecretConnector_long() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecretConnector_long = null;


        try {
            // InternalDockerCompose.g:2335:61: (iv_ruleSecretConnector_long= ruleSecretConnector_long EOF )
            // InternalDockerCompose.g:2336:2: iv_ruleSecretConnector_long= ruleSecretConnector_long EOF
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
    // InternalDockerCompose.g:2342:1: ruleSecretConnector_long returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ;
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
            // InternalDockerCompose.g:2348:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalDockerCompose.g:2349:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalDockerCompose.g:2349:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalDockerCompose.g:2350:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalDockerCompose.g:2350:3: ()
            // InternalDockerCompose.g:2351:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecretConnector_longAccess().getSecretConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2357:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
            // InternalDockerCompose.g:2358:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalDockerCompose.g:2358:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
            // InternalDockerCompose.g:2359:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1());
            				
            // InternalDockerCompose.g:2362:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
            // InternalDockerCompose.g:2363:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?
            {
            // InternalDockerCompose.g:2363:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=6;
                int LA37_0 = input.LA(1);

                if ( LA37_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 1) ) {
                    alt37=2;
                }
                else if ( LA37_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 2) ) {
                    alt37=3;
                }
                else if ( LA37_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 3) ) {
                    alt37=4;
                }
                else if ( LA37_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 4) ) {
                    alt37=5;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalDockerCompose.g:2364:4: ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2364:4: ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:2365:5: {...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalDockerCompose.g:2365:117: ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:2366:6: ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalDockerCompose.g:2369:9: ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) )
            	    // InternalDockerCompose.g:2369:10: {...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2369:19: (otherlv_2= 'source:' ( ( ruleEString ) ) )
            	    // InternalDockerCompose.g:2369:20: otherlv_2= 'source:' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,41,FOLLOW_5); 

            	    									newLeafNode(otherlv_2, grammarAccess.getSecretConnector_longAccess().getSourceKeyword_1_0_0());
            	    								
            	    // InternalDockerCompose.g:2373:9: ( ( ruleEString ) )
            	    // InternalDockerCompose.g:2374:10: ( ruleEString )
            	    {
            	    // InternalDockerCompose.g:2374:10: ( ruleEString )
            	    // InternalDockerCompose.g:2375:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSecretConnector_longRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getSecretConnector_longAccess().getSecretSecretCrossReference_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_38);
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
            	    // InternalDockerCompose.g:2395:4: ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2395:4: ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) )
            	    // InternalDockerCompose.g:2396:5: {...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalDockerCompose.g:2396:117: ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) )
            	    // InternalDockerCompose.g:2397:6: ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalDockerCompose.g:2400:9: ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) )
            	    // InternalDockerCompose.g:2400:10: {...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2400:19: (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) )
            	    // InternalDockerCompose.g:2400:20: otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) )
            	    {
            	    otherlv_4=(Token)match(input,43,FOLLOW_39); 

            	    									newLeafNode(otherlv_4, grammarAccess.getSecretConnector_longAccess().getTargetKeyword_1_1_0());
            	    								
            	    // InternalDockerCompose.g:2404:9: ( (lv_target_5_0= rulePATH ) )
            	    // InternalDockerCompose.g:2405:10: (lv_target_5_0= rulePATH )
            	    {
            	    // InternalDockerCompose.g:2405:10: (lv_target_5_0= rulePATH )
            	    // InternalDockerCompose.g:2406:11: lv_target_5_0= rulePATH
            	    {

            	    											newCompositeNode(grammarAccess.getSecretConnector_longAccess().getTargetPATHParserRuleCall_1_1_1_0());
            	    										
            	    pushFollow(FOLLOW_38);
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
            	    // InternalDockerCompose.g:2429:4: ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2429:4: ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    // InternalDockerCompose.g:2430:5: {...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalDockerCompose.g:2430:117: ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) )
            	    // InternalDockerCompose.g:2431:6: ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalDockerCompose.g:2434:9: ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) )
            	    // InternalDockerCompose.g:2434:10: {...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2434:19: (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) )
            	    // InternalDockerCompose.g:2434:20: otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) )
            	    {
            	    otherlv_6=(Token)match(input,50,FOLLOW_40); 

            	    									newLeafNode(otherlv_6, grammarAccess.getSecretConnector_longAccess().getUidKeyword_1_2_0());
            	    								
            	    // InternalDockerCompose.g:2438:9: ( (lv_uid_7_0= RULE_QUOTED_INT ) )
            	    // InternalDockerCompose.g:2439:10: (lv_uid_7_0= RULE_QUOTED_INT )
            	    {
            	    // InternalDockerCompose.g:2439:10: (lv_uid_7_0= RULE_QUOTED_INT )
            	    // InternalDockerCompose.g:2440:11: lv_uid_7_0= RULE_QUOTED_INT
            	    {
            	    lv_uid_7_0=(Token)match(input,RULE_QUOTED_INT,FOLLOW_38); 

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
            	    // InternalDockerCompose.g:2462:4: ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2462:4: ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    // InternalDockerCompose.g:2463:5: {...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalDockerCompose.g:2463:117: ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) )
            	    // InternalDockerCompose.g:2464:6: ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalDockerCompose.g:2467:9: ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) )
            	    // InternalDockerCompose.g:2467:10: {...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2467:19: (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) )
            	    // InternalDockerCompose.g:2467:20: otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) )
            	    {
            	    otherlv_8=(Token)match(input,51,FOLLOW_40); 

            	    									newLeafNode(otherlv_8, grammarAccess.getSecretConnector_longAccess().getGidKeyword_1_3_0());
            	    								
            	    // InternalDockerCompose.g:2471:9: ( (lv_gid_9_0= RULE_QUOTED_INT ) )
            	    // InternalDockerCompose.g:2472:10: (lv_gid_9_0= RULE_QUOTED_INT )
            	    {
            	    // InternalDockerCompose.g:2472:10: (lv_gid_9_0= RULE_QUOTED_INT )
            	    // InternalDockerCompose.g:2473:11: lv_gid_9_0= RULE_QUOTED_INT
            	    {
            	    lv_gid_9_0=(Token)match(input,RULE_QUOTED_INT,FOLLOW_38); 

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
            	    // InternalDockerCompose.g:2495:4: ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2495:4: ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) )
            	    // InternalDockerCompose.g:2496:5: {...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalDockerCompose.g:2496:117: ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) )
            	    // InternalDockerCompose.g:2497:6: ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalDockerCompose.g:2500:9: ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) )
            	    // InternalDockerCompose.g:2500:10: {...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2500:19: (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) )
            	    // InternalDockerCompose.g:2500:20: otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) )
            	    {
            	    otherlv_10=(Token)match(input,52,FOLLOW_11); 

            	    									newLeafNode(otherlv_10, grammarAccess.getSecretConnector_longAccess().getModeKeyword_1_4_0());
            	    								
            	    // InternalDockerCompose.g:2504:9: ( (lv_mode_11_0= ruleEInt ) )
            	    // InternalDockerCompose.g:2505:10: (lv_mode_11_0= ruleEInt )
            	    {
            	    // InternalDockerCompose.g:2505:10: (lv_mode_11_0= ruleEInt )
            	    // InternalDockerCompose.g:2506:11: lv_mode_11_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getSecretConnector_longAccess().getModeEIntParserRuleCall_1_4_1_0());
            	    										
            	    pushFollow(FOLLOW_38);
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
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
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
    // InternalDockerCompose.g:2541:1: entryRuleSecretConnector_short returns [EObject current=null] : iv_ruleSecretConnector_short= ruleSecretConnector_short EOF ;
    public final EObject entryRuleSecretConnector_short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecretConnector_short = null;


        try {
            // InternalDockerCompose.g:2541:62: (iv_ruleSecretConnector_short= ruleSecretConnector_short EOF )
            // InternalDockerCompose.g:2542:2: iv_ruleSecretConnector_short= ruleSecretConnector_short EOF
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
    // InternalDockerCompose.g:2548:1: ruleSecretConnector_short returns [EObject current=null] : ( () ( ( ruleEString ) ) ) ;
    public final EObject ruleSecretConnector_short() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalDockerCompose.g:2554:2: ( ( () ( ( ruleEString ) ) ) )
            // InternalDockerCompose.g:2555:2: ( () ( ( ruleEString ) ) )
            {
            // InternalDockerCompose.g:2555:2: ( () ( ( ruleEString ) ) )
            // InternalDockerCompose.g:2556:3: () ( ( ruleEString ) )
            {
            // InternalDockerCompose.g:2556:3: ()
            // InternalDockerCompose.g:2557:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecretConnector_shortAccess().getSecretConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2563:3: ( ( ruleEString ) )
            // InternalDockerCompose.g:2564:4: ( ruleEString )
            {
            // InternalDockerCompose.g:2564:4: ( ruleEString )
            // InternalDockerCompose.g:2565:5: ruleEString
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
    // InternalDockerCompose.g:2583:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // InternalDockerCompose.g:2583:48: (iv_ruleNetwork= ruleNetwork EOF )
            // InternalDockerCompose.g:2584:2: iv_ruleNetwork= ruleNetwork EOF
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
    // InternalDockerCompose.g:2590:1: ruleNetwork returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) ) ) ;
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
            // InternalDockerCompose.g:2596:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) ) ) )
            // InternalDockerCompose.g:2597:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) ) )
            {
            // InternalDockerCompose.g:2597:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:2598:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:2598:3: ()
            // InternalDockerCompose.g:2599:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkAccess().getNetworkAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2605:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:2606:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:2606:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:2607:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,21,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:2628:3: ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==53) ) {
                alt41=1;
            }
            else if ( (LA41_0==EOF||LA41_0==RULE_ID||LA41_0==RULE_STRING||(LA41_0>=15 && LA41_0<=20)||(LA41_0>=55 && LA41_0<=63)) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalDockerCompose.g:2629:4: (otherlv_3= '{' otherlv_4= '}' )
                    {
                    // InternalDockerCompose.g:2629:4: (otherlv_3= '{' otherlv_4= '}' )
                    // InternalDockerCompose.g:2630:5: otherlv_3= '{' otherlv_4= '}'
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_42); 

                    					newLeafNode(otherlv_3, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_3_0_0());
                    				
                    otherlv_4=(Token)match(input,54,FOLLOW_2); 

                    					newLeafNode(otherlv_4, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_3_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:2640:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) )
                    {
                    // InternalDockerCompose.g:2640:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) )
                    // InternalDockerCompose.g:2641:5: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) )
                    {
                    // InternalDockerCompose.g:2641:5: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) )
                    // InternalDockerCompose.g:2642:6: ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    					
                    // InternalDockerCompose.g:2645:6: ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* )
                    // InternalDockerCompose.g:2646:7: ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )*
                    {
                    // InternalDockerCompose.g:2646:7: ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )*
                    loop40:
                    do {
                        int alt40=10;
                        alt40 = dfa40.predict(input);
                        switch (alt40) {
                    	case 1 :
                    	    // InternalDockerCompose.g:2647:5: ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2647:5: ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2648:6: {...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 0)");
                    	    }
                    	    // InternalDockerCompose.g:2648:107: ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) )
                    	    // InternalDockerCompose.g:2649:7: ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 0);
                    	    						
                    	    // InternalDockerCompose.g:2652:10: ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) )
                    	    // InternalDockerCompose.g:2652:11: {...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2652:20: (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) )
                    	    // InternalDockerCompose.g:2652:21: otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,55,FOLLOW_5); 

                    	    										newLeafNode(otherlv_6, grammarAccess.getNetworkAccess().getDriverKeyword_3_1_0_0());
                    	    									
                    	    // InternalDockerCompose.g:2656:10: ( (lv_driver_7_0= ruleEString ) )
                    	    // InternalDockerCompose.g:2657:11: (lv_driver_7_0= ruleEString )
                    	    {
                    	    // InternalDockerCompose.g:2657:11: (lv_driver_7_0= ruleEString )
                    	    // InternalDockerCompose.g:2658:12: lv_driver_7_0= ruleEString
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getDriverEStringParserRuleCall_3_1_0_1_0());
                    	    											
                    	    pushFollow(FOLLOW_43);
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
                    	    // InternalDockerCompose.g:2681:5: ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2681:5: ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2682:6: {...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 1)");
                    	    }
                    	    // InternalDockerCompose.g:2682:107: ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:2683:7: ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 1);
                    	    						
                    	    // InternalDockerCompose.g:2686:10: ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:2686:11: {...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2686:20: (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:2686:21: otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_8=(Token)match(input,56,FOLLOW_13); 

                    	    										newLeafNode(otherlv_8, grammarAccess.getNetworkAccess().getAttachableKeyword_3_1_1_0());
                    	    									
                    	    // InternalDockerCompose.g:2690:10: ( (lv_attachable_9_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:2691:11: (lv_attachable_9_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:2691:11: (lv_attachable_9_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:2692:12: lv_attachable_9_0= ruleEBoolean
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getAttachableEBooleanParserRuleCall_3_1_1_1_0());
                    	    											
                    	    pushFollow(FOLLOW_43);
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
                    	    // InternalDockerCompose.g:2715:5: ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2715:5: ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2716:6: {...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 2)");
                    	    }
                    	    // InternalDockerCompose.g:2716:107: ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:2717:7: ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 2);
                    	    						
                    	    // InternalDockerCompose.g:2720:10: ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:2720:11: {...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2720:20: (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:2720:21: otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_10=(Token)match(input,57,FOLLOW_13); 

                    	    										newLeafNode(otherlv_10, grammarAccess.getNetworkAccess().getEnable_ipv6Keyword_3_1_2_0());
                    	    									
                    	    // InternalDockerCompose.g:2724:10: ( (lv_enable_ipv6_11_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:2725:11: (lv_enable_ipv6_11_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:2725:11: (lv_enable_ipv6_11_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:2726:12: lv_enable_ipv6_11_0= ruleEBoolean
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getEnable_ipv6EBooleanParserRuleCall_3_1_2_1_0());
                    	    											
                    	    pushFollow(FOLLOW_43);
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
                    	    // InternalDockerCompose.g:2749:5: ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2749:5: ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2750:6: {...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 3)");
                    	    }
                    	    // InternalDockerCompose.g:2750:107: ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:2751:7: ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 3);
                    	    						
                    	    // InternalDockerCompose.g:2754:10: ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:2754:11: {...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2754:20: (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:2754:21: otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_12=(Token)match(input,58,FOLLOW_13); 

                    	    										newLeafNode(otherlv_12, grammarAccess.getNetworkAccess().getInternalKeyword_3_1_3_0());
                    	    									
                    	    // InternalDockerCompose.g:2758:10: ( (lv_internal_13_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:2759:11: (lv_internal_13_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:2759:11: (lv_internal_13_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:2760:12: lv_internal_13_0= ruleEBoolean
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getInternalEBooleanParserRuleCall_3_1_3_1_0());
                    	    											
                    	    pushFollow(FOLLOW_43);
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
                    	    // InternalDockerCompose.g:2783:5: ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2783:5: ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2784:6: {...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 4)");
                    	    }
                    	    // InternalDockerCompose.g:2784:107: ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:2785:7: ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 4);
                    	    						
                    	    // InternalDockerCompose.g:2788:10: ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:2788:11: {...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2788:20: (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:2788:21: otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_14=(Token)match(input,59,FOLLOW_13); 

                    	    										newLeafNode(otherlv_14, grammarAccess.getNetworkAccess().getExternalKeyword_3_1_4_0());
                    	    									
                    	    // InternalDockerCompose.g:2792:10: ( (lv_external_15_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:2793:11: (lv_external_15_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:2793:11: (lv_external_15_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:2794:12: lv_external_15_0= ruleEBoolean
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getExternalEBooleanParserRuleCall_3_1_4_1_0());
                    	    											
                    	    pushFollow(FOLLOW_43);
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
                    	    // InternalDockerCompose.g:2817:5: ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2817:5: ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2818:6: {...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 5)");
                    	    }
                    	    // InternalDockerCompose.g:2818:107: ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) )
                    	    // InternalDockerCompose.g:2819:7: ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 5);
                    	    						
                    	    // InternalDockerCompose.g:2822:10: ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) )
                    	    // InternalDockerCompose.g:2822:11: {...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2822:20: (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) )
                    	    // InternalDockerCompose.g:2822:21: otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,60,FOLLOW_5); 

                    	    										newLeafNode(otherlv_16, grammarAccess.getNetworkAccess().getNameKeyword_3_1_5_0());
                    	    									
                    	    // InternalDockerCompose.g:2826:10: ( (lv_network_name_17_0= ruleEString ) )
                    	    // InternalDockerCompose.g:2827:11: (lv_network_name_17_0= ruleEString )
                    	    {
                    	    // InternalDockerCompose.g:2827:11: (lv_network_name_17_0= ruleEString )
                    	    // InternalDockerCompose.g:2828:12: lv_network_name_17_0= ruleEString
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getNetwork_nameEStringParserRuleCall_3_1_5_1_0());
                    	    											
                    	    pushFollow(FOLLOW_43);
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
                    	    // InternalDockerCompose.g:2851:5: ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2851:5: ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) )
                    	    // InternalDockerCompose.g:2852:6: {...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 6) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 6)");
                    	    }
                    	    // InternalDockerCompose.g:2852:107: ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) )
                    	    // InternalDockerCompose.g:2853:7: ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 6);
                    	    						
                    	    // InternalDockerCompose.g:2856:10: ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) )
                    	    // InternalDockerCompose.g:2856:11: {...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2856:20: (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ )
                    	    // InternalDockerCompose.g:2856:21: otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+
                    	    {
                    	    otherlv_18=(Token)match(input,61,FOLLOW_5); 

                    	    										newLeafNode(otherlv_18, grammarAccess.getNetworkAccess().getLabelsKeyword_3_1_6_0());
                    	    									
                    	    // InternalDockerCompose.g:2860:10: ( (lv_labels_19_0= ruleNetworkLabel ) )+
                    	    int cnt38=0;
                    	    loop38:
                    	    do {
                    	        int alt38=2;
                    	        int LA38_0 = input.LA(1);

                    	        if ( (LA38_0==RULE_STRING) ) {
                    	            int LA38_2 = input.LA(2);

                    	            if ( (LA38_2==21) ) {
                    	                int LA38_4 = input.LA(3);

                    	                if ( (LA38_4==RULE_STRING) ) {
                    	                    int LA38_5 = input.LA(4);

                    	                    if ( (LA38_5==EOF||LA38_5==RULE_ID||LA38_5==RULE_STRING||(LA38_5>=15 && LA38_5<=20)||(LA38_5>=55 && LA38_5<=63)) ) {
                    	                        alt38=1;
                    	                    }


                    	                }
                    	                else if ( (LA38_4==RULE_ID) ) {
                    	                    int LA38_6 = input.LA(4);

                    	                    if ( (LA38_6==EOF||LA38_6==RULE_ID||LA38_6==RULE_STRING||(LA38_6>=15 && LA38_6<=20)||(LA38_6>=55 && LA38_6<=63)) ) {
                    	                        alt38=1;
                    	                    }


                    	                }


                    	            }


                    	        }
                    	        else if ( (LA38_0==RULE_ID) ) {
                    	            int LA38_3 = input.LA(2);

                    	            if ( (LA38_3==21) ) {
                    	                int LA38_4 = input.LA(3);

                    	                if ( (LA38_4==RULE_STRING) ) {
                    	                    int LA38_5 = input.LA(4);

                    	                    if ( (LA38_5==EOF||LA38_5==RULE_ID||LA38_5==RULE_STRING||(LA38_5>=15 && LA38_5<=20)||(LA38_5>=55 && LA38_5<=63)) ) {
                    	                        alt38=1;
                    	                    }


                    	                }
                    	                else if ( (LA38_4==RULE_ID) ) {
                    	                    int LA38_6 = input.LA(4);

                    	                    if ( (LA38_6==EOF||LA38_6==RULE_ID||LA38_6==RULE_STRING||(LA38_6>=15 && LA38_6<=20)||(LA38_6>=55 && LA38_6<=63)) ) {
                    	                        alt38=1;
                    	                    }


                    	                }


                    	            }


                    	        }


                    	        switch (alt38) {
                    	    	case 1 :
                    	    	    // InternalDockerCompose.g:2861:11: (lv_labels_19_0= ruleNetworkLabel )
                    	    	    {
                    	    	    // InternalDockerCompose.g:2861:11: (lv_labels_19_0= ruleNetworkLabel )
                    	    	    // InternalDockerCompose.g:2862:12: lv_labels_19_0= ruleNetworkLabel
                    	    	    {

                    	    	    												newCompositeNode(grammarAccess.getNetworkAccess().getLabelsNetworkLabelParserRuleCall_3_1_6_1_0());
                    	    	    											
                    	    	    pushFollow(FOLLOW_44);
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
                    	    	    if ( cnt38 >= 1 ) break loop38;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(38, input);
                    	                throw eee;
                    	        }
                    	        cnt38++;
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 8 :
                    	    // InternalDockerCompose.g:2885:5: ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2885:5: ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) )
                    	    // InternalDockerCompose.g:2886:6: {...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 7) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 7)");
                    	    }
                    	    // InternalDockerCompose.g:2886:107: ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) )
                    	    // InternalDockerCompose.g:2887:7: ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 7);
                    	    						
                    	    // InternalDockerCompose.g:2890:10: ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) )
                    	    // InternalDockerCompose.g:2890:11: {...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2890:20: (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ )
                    	    // InternalDockerCompose.g:2890:21: otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+
                    	    {
                    	    otherlv_20=(Token)match(input,62,FOLLOW_5); 

                    	    										newLeafNode(otherlv_20, grammarAccess.getNetworkAccess().getDriver_optsKeyword_3_1_7_0());
                    	    									
                    	    // InternalDockerCompose.g:2894:10: ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+
                    	    int cnt39=0;
                    	    loop39:
                    	    do {
                    	        int alt39=2;
                    	        int LA39_0 = input.LA(1);

                    	        if ( (LA39_0==RULE_STRING) ) {
                    	            int LA39_2 = input.LA(2);

                    	            if ( (LA39_2==21) ) {
                    	                int LA39_4 = input.LA(3);

                    	                if ( (LA39_4==RULE_STRING) ) {
                    	                    int LA39_5 = input.LA(4);

                    	                    if ( (LA39_5==EOF||LA39_5==RULE_ID||LA39_5==RULE_STRING||(LA39_5>=15 && LA39_5<=20)||(LA39_5>=55 && LA39_5<=63)) ) {
                    	                        alt39=1;
                    	                    }


                    	                }
                    	                else if ( (LA39_4==RULE_ID) ) {
                    	                    int LA39_6 = input.LA(4);

                    	                    if ( (LA39_6==EOF||LA39_6==RULE_ID||LA39_6==RULE_STRING||(LA39_6>=15 && LA39_6<=20)||(LA39_6>=55 && LA39_6<=63)) ) {
                    	                        alt39=1;
                    	                    }


                    	                }


                    	            }


                    	        }
                    	        else if ( (LA39_0==RULE_ID) ) {
                    	            int LA39_3 = input.LA(2);

                    	            if ( (LA39_3==21) ) {
                    	                int LA39_4 = input.LA(3);

                    	                if ( (LA39_4==RULE_STRING) ) {
                    	                    int LA39_5 = input.LA(4);

                    	                    if ( (LA39_5==EOF||LA39_5==RULE_ID||LA39_5==RULE_STRING||(LA39_5>=15 && LA39_5<=20)||(LA39_5>=55 && LA39_5<=63)) ) {
                    	                        alt39=1;
                    	                    }


                    	                }
                    	                else if ( (LA39_4==RULE_ID) ) {
                    	                    int LA39_6 = input.LA(4);

                    	                    if ( (LA39_6==EOF||LA39_6==RULE_ID||LA39_6==RULE_STRING||(LA39_6>=15 && LA39_6<=20)||(LA39_6>=55 && LA39_6<=63)) ) {
                    	                        alt39=1;
                    	                    }


                    	                }


                    	            }


                    	        }


                    	        switch (alt39) {
                    	    	case 1 :
                    	    	    // InternalDockerCompose.g:2895:11: (lv_driver_opts_21_0= ruleNetworkDriverOpt )
                    	    	    {
                    	    	    // InternalDockerCompose.g:2895:11: (lv_driver_opts_21_0= ruleNetworkDriverOpt )
                    	    	    // InternalDockerCompose.g:2896:12: lv_driver_opts_21_0= ruleNetworkDriverOpt
                    	    	    {

                    	    	    												newCompositeNode(grammarAccess.getNetworkAccess().getDriver_optsNetworkDriverOptParserRuleCall_3_1_7_1_0());
                    	    	    											
                    	    	    pushFollow(FOLLOW_44);
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
                    	    	    if ( cnt39 >= 1 ) break loop39;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(39, input);
                    	                throw eee;
                    	        }
                    	        cnt39++;
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 9 :
                    	    // InternalDockerCompose.g:2919:5: ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2919:5: ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2920:6: {...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 8) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 8)");
                    	    }
                    	    // InternalDockerCompose.g:2920:107: ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) )
                    	    // InternalDockerCompose.g:2921:7: ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 8);
                    	    						
                    	    // InternalDockerCompose.g:2924:10: ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) )
                    	    // InternalDockerCompose.g:2924:11: {...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2924:20: (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) )
                    	    // InternalDockerCompose.g:2924:21: otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) )
                    	    {
                    	    otherlv_22=(Token)match(input,63,FOLLOW_45); 

                    	    										newLeafNode(otherlv_22, grammarAccess.getNetworkAccess().getIpamKeyword_3_1_8_0());
                    	    									
                    	    // InternalDockerCompose.g:2928:10: ( (lv_ipam_23_0= ruleIPAM ) )
                    	    // InternalDockerCompose.g:2929:11: (lv_ipam_23_0= ruleIPAM )
                    	    {
                    	    // InternalDockerCompose.g:2929:11: (lv_ipam_23_0= ruleIPAM )
                    	    // InternalDockerCompose.g:2930:12: lv_ipam_23_0= ruleIPAM
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getIpamIPAMParserRuleCall_3_1_8_1_0());
                    	    											
                    	    pushFollow(FOLLOW_43);
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
                    	    break loop40;
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
    // InternalDockerCompose.g:2965:1: entryRuleVolume returns [EObject current=null] : iv_ruleVolume= ruleVolume EOF ;
    public final EObject entryRuleVolume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolume = null;


        try {
            // InternalDockerCompose.g:2965:47: (iv_ruleVolume= ruleVolume EOF )
            // InternalDockerCompose.g:2966:2: iv_ruleVolume= ruleVolume EOF
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
    // InternalDockerCompose.g:2972:1: ruleVolume returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) ) ) ;
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
            // InternalDockerCompose.g:2978:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:2979:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:2979:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:2980:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:2980:3: ()
            // InternalDockerCompose.g:2981:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeAccess().getVolumeAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2987:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:2988:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:2988:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:2989:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,21,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getVolumeAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:3010:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:3011:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:3011:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) )
            // InternalDockerCompose.g:3012:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getVolumeAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:3015:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* )
            // InternalDockerCompose.g:3016:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )*
            {
            // InternalDockerCompose.g:3016:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )*
            loop44:
            do {
                int alt44=6;
                int LA44_0 = input.LA(1);

                if ( LA44_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 0) ) {
                    alt44=1;
                }
                else if ( LA44_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 1) ) {
                    alt44=2;
                }
                else if ( LA44_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 2) ) {
                    alt44=3;
                }
                else if ( LA44_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 3) ) {
                    alt44=4;
                }
                else if ( LA44_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 4) ) {
                    alt44=5;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalDockerCompose.g:3017:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3017:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:3018:5: {...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDockerCompose.g:3018:103: ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:3019:6: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDockerCompose.g:3022:9: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:3022:10: {...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:3022:19: (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:3022:20: otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) )
            	    {
            	    otherlv_4=(Token)match(input,59,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getVolumeAccess().getExternalKeyword_3_0_0());
            	    								
            	    // InternalDockerCompose.g:3026:9: ( (lv_external_5_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:3027:10: (lv_external_5_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:3027:10: (lv_external_5_0= ruleEBoolean )
            	    // InternalDockerCompose.g:3028:11: lv_external_5_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeAccess().getExternalEBooleanParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_46);
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
            	    // InternalDockerCompose.g:3051:4: ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3051:4: ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3052:5: {...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDockerCompose.g:3052:103: ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3053:6: ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDockerCompose.g:3056:9: ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3056:10: {...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:3056:19: (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3056:20: otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,55,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getVolumeAccess().getDriverKeyword_3_1_0());
            	    								
            	    // InternalDockerCompose.g:3060:9: ( (lv_driver_7_0= ruleEString ) )
            	    // InternalDockerCompose.g:3061:10: (lv_driver_7_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3061:10: (lv_driver_7_0= ruleEString )
            	    // InternalDockerCompose.g:3062:11: lv_driver_7_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeAccess().getDriverEStringParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_46);
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
            	    // InternalDockerCompose.g:3085:4: ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3085:4: ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3086:5: {...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:3086:103: ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3087:6: ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:3090:9: ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3090:10: {...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:3090:19: (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3090:20: otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,60,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getVolumeAccess().getNameKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:3094:9: ( (lv_volume_name_9_0= ruleEString ) )
            	    // InternalDockerCompose.g:3095:10: (lv_volume_name_9_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3095:10: (lv_volume_name_9_0= ruleEString )
            	    // InternalDockerCompose.g:3096:11: lv_volume_name_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeAccess().getVolume_nameEStringParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_46);
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
            	    // InternalDockerCompose.g:3119:4: ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3119:4: ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) )
            	    // InternalDockerCompose.g:3120:5: {...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalDockerCompose.g:3120:103: ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) )
            	    // InternalDockerCompose.g:3121:6: ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalDockerCompose.g:3124:9: ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) )
            	    // InternalDockerCompose.g:3124:10: {...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:3124:19: (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ )
            	    // InternalDockerCompose.g:3124:20: otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+
            	    {
            	    otherlv_10=(Token)match(input,61,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getVolumeAccess().getLabelsKeyword_3_3_0());
            	    								
            	    // InternalDockerCompose.g:3128:9: ( (lv_labels_11_0= ruleVolumeLabel ) )+
            	    int cnt42=0;
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( (LA42_0==RULE_STRING) ) {
            	            int LA42_2 = input.LA(2);

            	            if ( (LA42_2==21) ) {
            	                int LA42_4 = input.LA(3);

            	                if ( (LA42_4==RULE_STRING) ) {
            	                    int LA42_5 = input.LA(4);

            	                    if ( (LA42_5==EOF||LA42_5==RULE_ID||LA42_5==RULE_STRING||(LA42_5>=15 && LA42_5<=20)||LA42_5==55||(LA42_5>=59 && LA42_5<=62)) ) {
            	                        alt42=1;
            	                    }


            	                }
            	                else if ( (LA42_4==RULE_ID) ) {
            	                    int LA42_6 = input.LA(4);

            	                    if ( (LA42_6==EOF||LA42_6==RULE_ID||LA42_6==RULE_STRING||(LA42_6>=15 && LA42_6<=20)||LA42_6==55||(LA42_6>=59 && LA42_6<=62)) ) {
            	                        alt42=1;
            	                    }


            	                }


            	            }


            	        }
            	        else if ( (LA42_0==RULE_ID) ) {
            	            int LA42_3 = input.LA(2);

            	            if ( (LA42_3==21) ) {
            	                int LA42_4 = input.LA(3);

            	                if ( (LA42_4==RULE_STRING) ) {
            	                    int LA42_5 = input.LA(4);

            	                    if ( (LA42_5==EOF||LA42_5==RULE_ID||LA42_5==RULE_STRING||(LA42_5>=15 && LA42_5<=20)||LA42_5==55||(LA42_5>=59 && LA42_5<=62)) ) {
            	                        alt42=1;
            	                    }


            	                }
            	                else if ( (LA42_4==RULE_ID) ) {
            	                    int LA42_6 = input.LA(4);

            	                    if ( (LA42_6==EOF||LA42_6==RULE_ID||LA42_6==RULE_STRING||(LA42_6>=15 && LA42_6<=20)||LA42_6==55||(LA42_6>=59 && LA42_6<=62)) ) {
            	                        alt42=1;
            	                    }


            	                }


            	            }


            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:3129:10: (lv_labels_11_0= ruleVolumeLabel )
            	    	    {
            	    	    // InternalDockerCompose.g:3129:10: (lv_labels_11_0= ruleVolumeLabel )
            	    	    // InternalDockerCompose.g:3130:11: lv_labels_11_0= ruleVolumeLabel
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getVolumeAccess().getLabelsVolumeLabelParserRuleCall_3_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_47);
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
            	    	    if ( cnt42 >= 1 ) break loop42;
            	                EarlyExitException eee =
            	                    new EarlyExitException(42, input);
            	                throw eee;
            	        }
            	        cnt42++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDockerCompose.g:3153:4: ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3153:4: ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) )
            	    // InternalDockerCompose.g:3154:5: {...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalDockerCompose.g:3154:103: ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) )
            	    // InternalDockerCompose.g:3155:6: ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalDockerCompose.g:3158:9: ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) )
            	    // InternalDockerCompose.g:3158:10: {...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:3158:19: (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ )
            	    // InternalDockerCompose.g:3158:20: otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+
            	    {
            	    otherlv_12=(Token)match(input,62,FOLLOW_5); 

            	    									newLeafNode(otherlv_12, grammarAccess.getVolumeAccess().getDriver_optsKeyword_3_4_0());
            	    								
            	    // InternalDockerCompose.g:3162:9: ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+
            	    int cnt43=0;
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==RULE_STRING) ) {
            	            int LA43_2 = input.LA(2);

            	            if ( (LA43_2==21) ) {
            	                int LA43_4 = input.LA(3);

            	                if ( (LA43_4==RULE_STRING) ) {
            	                    int LA43_5 = input.LA(4);

            	                    if ( (LA43_5==EOF||LA43_5==RULE_ID||LA43_5==RULE_STRING||(LA43_5>=15 && LA43_5<=20)||LA43_5==55||(LA43_5>=59 && LA43_5<=62)) ) {
            	                        alt43=1;
            	                    }


            	                }
            	                else if ( (LA43_4==RULE_ID) ) {
            	                    int LA43_6 = input.LA(4);

            	                    if ( (LA43_6==EOF||LA43_6==RULE_ID||LA43_6==RULE_STRING||(LA43_6>=15 && LA43_6<=20)||LA43_6==55||(LA43_6>=59 && LA43_6<=62)) ) {
            	                        alt43=1;
            	                    }


            	                }


            	            }


            	        }
            	        else if ( (LA43_0==RULE_ID) ) {
            	            int LA43_3 = input.LA(2);

            	            if ( (LA43_3==21) ) {
            	                int LA43_4 = input.LA(3);

            	                if ( (LA43_4==RULE_STRING) ) {
            	                    int LA43_5 = input.LA(4);

            	                    if ( (LA43_5==EOF||LA43_5==RULE_ID||LA43_5==RULE_STRING||(LA43_5>=15 && LA43_5<=20)||LA43_5==55||(LA43_5>=59 && LA43_5<=62)) ) {
            	                        alt43=1;
            	                    }


            	                }
            	                else if ( (LA43_4==RULE_ID) ) {
            	                    int LA43_6 = input.LA(4);

            	                    if ( (LA43_6==EOF||LA43_6==RULE_ID||LA43_6==RULE_STRING||(LA43_6>=15 && LA43_6<=20)||LA43_6==55||(LA43_6>=59 && LA43_6<=62)) ) {
            	                        alt43=1;
            	                    }


            	                }


            	            }


            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:3163:10: (lv_driver_opts_13_0= ruleVolumeDriverOpt )
            	    	    {
            	    	    // InternalDockerCompose.g:3163:10: (lv_driver_opts_13_0= ruleVolumeDriverOpt )
            	    	    // InternalDockerCompose.g:3164:11: lv_driver_opts_13_0= ruleVolumeDriverOpt
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getVolumeAccess().getDriver_optsVolumeDriverOptParserRuleCall_3_4_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_47);
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
            	    	    if ( cnt43 >= 1 ) break loop43;
            	                EarlyExitException eee =
            	                    new EarlyExitException(43, input);
            	                throw eee;
            	        }
            	        cnt43++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalDockerCompose.g:3198:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalDockerCompose.g:3198:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalDockerCompose.g:3199:2: iv_ruleConfig= ruleConfig EOF
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
    // InternalDockerCompose.g:3205:1: ruleConfig returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) ) ) ;
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
            // InternalDockerCompose.g:3211:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:3212:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:3212:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:3213:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:3213:3: ()
            // InternalDockerCompose.g:3214:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigAccess().getConfigAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3220:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3221:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3221:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3222:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,21,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:3243:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:3244:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:3244:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalDockerCompose.g:3245:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getConfigAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:3248:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* )
            // InternalDockerCompose.g:3249:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalDockerCompose.g:3249:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )*
            loop45:
            do {
                int alt45=4;
                int LA45_0 = input.LA(1);

                if ( LA45_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 0) ) {
                    alt45=1;
                }
                else if ( LA45_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 1) ) {
                    alt45=2;
                }
                else if ( LA45_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 2) ) {
                    alt45=3;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalDockerCompose.g:3250:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3250:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:3251:5: {...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDockerCompose.g:3251:103: ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:3252:6: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDockerCompose.g:3255:9: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:3255:10: {...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    }
            	    // InternalDockerCompose.g:3255:19: (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:3255:20: otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) )
            	    {
            	    otherlv_4=(Token)match(input,59,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getConfigAccess().getExternalKeyword_3_0_0());
            	    								
            	    // InternalDockerCompose.g:3259:9: ( (lv_external_5_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:3260:10: (lv_external_5_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:3260:10: (lv_external_5_0= ruleEBoolean )
            	    // InternalDockerCompose.g:3261:11: lv_external_5_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getConfigAccess().getExternalEBooleanParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_48);
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
            	    // InternalDockerCompose.g:3284:4: ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3284:4: ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3285:5: {...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDockerCompose.g:3285:103: ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3286:6: ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDockerCompose.g:3289:9: ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3289:10: {...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    }
            	    // InternalDockerCompose.g:3289:19: (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3289:20: otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,64,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getConfigAccess().getFileKeyword_3_1_0());
            	    								
            	    // InternalDockerCompose.g:3293:9: ( (lv_file_7_0= ruleEString ) )
            	    // InternalDockerCompose.g:3294:10: (lv_file_7_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3294:10: (lv_file_7_0= ruleEString )
            	    // InternalDockerCompose.g:3295:11: lv_file_7_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getConfigAccess().getFileEStringParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_48);
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
            	    // InternalDockerCompose.g:3318:4: ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3318:4: ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3319:5: {...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:3319:103: ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3320:6: ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:3323:9: ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3323:10: {...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    }
            	    // InternalDockerCompose.g:3323:19: (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3323:20: otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,60,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getConfigAccess().getNameKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:3327:9: ( (lv_config_name_9_0= ruleEString ) )
            	    // InternalDockerCompose.g:3328:10: (lv_config_name_9_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3328:10: (lv_config_name_9_0= ruleEString )
            	    // InternalDockerCompose.g:3329:11: lv_config_name_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getConfigAccess().getConfig_nameEStringParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_48);
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
            	    break loop45;
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
    // InternalDockerCompose.g:3363:1: entryRuleSecret returns [EObject current=null] : iv_ruleSecret= ruleSecret EOF ;
    public final EObject entryRuleSecret() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecret = null;


        try {
            // InternalDockerCompose.g:3363:47: (iv_ruleSecret= ruleSecret EOF )
            // InternalDockerCompose.g:3364:2: iv_ruleSecret= ruleSecret EOF
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
    // InternalDockerCompose.g:3370:1: ruleSecret returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) ) ;
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
            // InternalDockerCompose.g:3376:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:3377:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:3377:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:3378:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:3378:3: ()
            // InternalDockerCompose.g:3379:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecretAccess().getSecretAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3385:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3386:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3386:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3387:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,21,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getSecretAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:3408:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:3409:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:3409:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalDockerCompose.g:3410:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSecretAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:3413:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* )
            // InternalDockerCompose.g:3414:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalDockerCompose.g:3414:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )*
            loop46:
            do {
                int alt46=5;
                int LA46_0 = input.LA(1);

                if ( LA46_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 0) ) {
                    alt46=1;
                }
                else if ( LA46_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 1) ) {
                    alt46=2;
                }
                else if ( LA46_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 2) ) {
                    alt46=3;
                }
                else if ( LA46_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 3) ) {
                    alt46=4;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalDockerCompose.g:3415:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3415:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:3416:5: {...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDockerCompose.g:3416:103: ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:3417:6: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDockerCompose.g:3420:9: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:3420:10: {...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "true");
            	    }
            	    // InternalDockerCompose.g:3420:19: (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:3420:20: otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) )
            	    {
            	    otherlv_4=(Token)match(input,59,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getSecretAccess().getExternalKeyword_3_0_0());
            	    								
            	    // InternalDockerCompose.g:3424:9: ( (lv_external_5_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:3425:10: (lv_external_5_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:3425:10: (lv_external_5_0= ruleEBoolean )
            	    // InternalDockerCompose.g:3426:11: lv_external_5_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getSecretAccess().getExternalEBooleanParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_49);
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
            	    // InternalDockerCompose.g:3449:4: ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3449:4: ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3450:5: {...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDockerCompose.g:3450:103: ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3451:6: ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDockerCompose.g:3454:9: ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3454:10: {...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "true");
            	    }
            	    // InternalDockerCompose.g:3454:19: (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3454:20: otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,64,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getSecretAccess().getFileKeyword_3_1_0());
            	    								
            	    // InternalDockerCompose.g:3458:9: ( (lv_file_7_0= ruleEString ) )
            	    // InternalDockerCompose.g:3459:10: (lv_file_7_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3459:10: (lv_file_7_0= ruleEString )
            	    // InternalDockerCompose.g:3460:11: lv_file_7_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getSecretAccess().getFileEStringParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_49);
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
            	    // InternalDockerCompose.g:3483:4: ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3483:4: ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3484:5: {...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:3484:103: ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3485:6: ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:3488:9: ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3488:10: {...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "true");
            	    }
            	    // InternalDockerCompose.g:3488:19: (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3488:20: otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,65,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getSecretAccess().getEnvironmentKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:3492:9: ( (lv_environment_9_0= ruleEString ) )
            	    // InternalDockerCompose.g:3493:10: (lv_environment_9_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3493:10: (lv_environment_9_0= ruleEString )
            	    // InternalDockerCompose.g:3494:11: lv_environment_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getSecretAccess().getEnvironmentEStringParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_49);
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
            	    // InternalDockerCompose.g:3517:4: ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3517:4: ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3518:5: {...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalDockerCompose.g:3518:103: ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3519:6: ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalDockerCompose.g:3522:9: ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3522:10: {...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "true");
            	    }
            	    // InternalDockerCompose.g:3522:19: (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3522:20: otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,60,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getSecretAccess().getNameKeyword_3_3_0());
            	    								
            	    // InternalDockerCompose.g:3526:9: ( (lv_secret_name_11_0= ruleEString ) )
            	    // InternalDockerCompose.g:3527:10: (lv_secret_name_11_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3527:10: (lv_secret_name_11_0= ruleEString )
            	    // InternalDockerCompose.g:3528:11: lv_secret_name_11_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getSecretAccess().getSecret_nameEStringParserRuleCall_3_3_1_0());
            	    										
            	    pushFollow(FOLLOW_49);
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
            	    break loop46;
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
    // InternalDockerCompose.g:3562:1: entryRuleVolumeLabel returns [EObject current=null] : iv_ruleVolumeLabel= ruleVolumeLabel EOF ;
    public final EObject entryRuleVolumeLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumeLabel = null;


        try {
            // InternalDockerCompose.g:3562:52: (iv_ruleVolumeLabel= ruleVolumeLabel EOF )
            // InternalDockerCompose.g:3563:2: iv_ruleVolumeLabel= ruleVolumeLabel EOF
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
    // InternalDockerCompose.g:3569:1: ruleVolumeLabel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleVolumeLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3575:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:3576:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:3576:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:3577:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:3577:3: ()
            // InternalDockerCompose.g:3578:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeLabelAccess().getVolumeLabelAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3584:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3585:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3585:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3586:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getVolumeLabelAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:3607:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:3608:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:3608:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:3609:5: lv_value_3_0= ruleEString
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
    // InternalDockerCompose.g:3630:1: entryRuleVolumeDriverOpt returns [EObject current=null] : iv_ruleVolumeDriverOpt= ruleVolumeDriverOpt EOF ;
    public final EObject entryRuleVolumeDriverOpt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumeDriverOpt = null;


        try {
            // InternalDockerCompose.g:3630:56: (iv_ruleVolumeDriverOpt= ruleVolumeDriverOpt EOF )
            // InternalDockerCompose.g:3631:2: iv_ruleVolumeDriverOpt= ruleVolumeDriverOpt EOF
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
    // InternalDockerCompose.g:3637:1: ruleVolumeDriverOpt returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleVolumeDriverOpt() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3643:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:3644:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:3644:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:3645:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:3645:3: ()
            // InternalDockerCompose.g:3646:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeDriverOptAccess().getVolumeDriverOptAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3652:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3653:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3653:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3654:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getVolumeDriverOptAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:3675:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:3676:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:3676:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:3677:5: lv_value_3_0= ruleEString
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
    // InternalDockerCompose.g:3698:1: entryRuleNetworkLabel returns [EObject current=null] : iv_ruleNetworkLabel= ruleNetworkLabel EOF ;
    public final EObject entryRuleNetworkLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkLabel = null;


        try {
            // InternalDockerCompose.g:3698:53: (iv_ruleNetworkLabel= ruleNetworkLabel EOF )
            // InternalDockerCompose.g:3699:2: iv_ruleNetworkLabel= ruleNetworkLabel EOF
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
    // InternalDockerCompose.g:3705:1: ruleNetworkLabel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleNetworkLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3711:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:3712:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:3712:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:3713:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:3713:3: ()
            // InternalDockerCompose.g:3714:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkLabelAccess().getNetworkLabelAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3720:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3721:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3721:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3722:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkLabelAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:3743:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:3744:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:3744:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:3745:5: lv_value_3_0= ruleEString
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
    // InternalDockerCompose.g:3766:1: entryRuleNetworkDriverOpt returns [EObject current=null] : iv_ruleNetworkDriverOpt= ruleNetworkDriverOpt EOF ;
    public final EObject entryRuleNetworkDriverOpt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkDriverOpt = null;


        try {
            // InternalDockerCompose.g:3766:57: (iv_ruleNetworkDriverOpt= ruleNetworkDriverOpt EOF )
            // InternalDockerCompose.g:3767:2: iv_ruleNetworkDriverOpt= ruleNetworkDriverOpt EOF
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
    // InternalDockerCompose.g:3773:1: ruleNetworkDriverOpt returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleNetworkDriverOpt() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3779:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:3780:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:3780:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:3781:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:3781:3: ()
            // InternalDockerCompose.g:3782:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkDriverOptAccess().getNetworkDriverOptAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3788:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3789:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3789:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3790:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkDriverOptAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:3811:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:3812:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:3812:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:3813:5: lv_value_3_0= ruleEString
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
    // InternalDockerCompose.g:3834:1: entryRuleIPAM returns [EObject current=null] : iv_ruleIPAM= ruleIPAM EOF ;
    public final EObject entryRuleIPAM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAM = null;


        try {
            // InternalDockerCompose.g:3834:45: (iv_ruleIPAM= ruleIPAM EOF )
            // InternalDockerCompose.g:3835:2: iv_ruleIPAM= ruleIPAM EOF
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
    // InternalDockerCompose.g:3841:1: ruleIPAM returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) ) ) ;
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
            // InternalDockerCompose.g:3847:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:3848:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:3848:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:3849:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:3849:3: ()
            // InternalDockerCompose.g:3850:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIPAMAccess().getIPAMAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3856:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:3857:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:3857:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) )
            // InternalDockerCompose.g:3858:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIPAMAccess().getUnorderedGroup_1());
            				
            // InternalDockerCompose.g:3861:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* )
            // InternalDockerCompose.g:3862:6: ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )*
            {
            // InternalDockerCompose.g:3862:6: ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )*
            loop49:
            do {
                int alt49=4;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==55) ) {
                    int LA49_2 = input.LA(2);

                    if ( (LA49_2==RULE_STRING) ) {
                        int LA49_5 = input.LA(3);

                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {
                            alt49=1;
                        }


                    }
                    else if ( (LA49_2==RULE_ID) ) {
                        int LA49_6 = input.LA(3);

                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {
                            alt49=1;
                        }


                    }


                }
                else if ( LA49_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 1) ) {
                    alt49=2;
                }
                else if ( LA49_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 2) ) {
                    alt49=3;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalDockerCompose.g:3863:4: ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3863:4: ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3864:5: {...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalDockerCompose.g:3864:101: ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3865:6: ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalDockerCompose.g:3868:9: ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3868:10: {...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "true");
            	    }
            	    // InternalDockerCompose.g:3868:19: (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3868:20: otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,55,FOLLOW_5); 

            	    									newLeafNode(otherlv_2, grammarAccess.getIPAMAccess().getDriverKeyword_1_0_0());
            	    								
            	    // InternalDockerCompose.g:3872:9: ( (lv_driver_3_0= ruleEString ) )
            	    // InternalDockerCompose.g:3873:10: (lv_driver_3_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3873:10: (lv_driver_3_0= ruleEString )
            	    // InternalDockerCompose.g:3874:11: lv_driver_3_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getIPAMAccess().getDriverEStringParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_50);
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
            	    // InternalDockerCompose.g:3897:4: ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3897:4: ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:3898:5: {...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalDockerCompose.g:3898:101: ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) )
            	    // InternalDockerCompose.g:3899:6: ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalDockerCompose.g:3902:9: ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) )
            	    // InternalDockerCompose.g:3902:10: {...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "true");
            	    }
            	    // InternalDockerCompose.g:3902:19: (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ )
            	    // InternalDockerCompose.g:3902:20: otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+
            	    {
            	    otherlv_4=(Token)match(input,66,FOLLOW_14); 

            	    									newLeafNode(otherlv_4, grammarAccess.getIPAMAccess().getConfigKeyword_1_1_0());
            	    								
            	    // InternalDockerCompose.g:3906:9: (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+
            	    int cnt47=0;
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==31) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:3907:10: otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,31,FOLLOW_51); 

            	    	    										newLeafNode(otherlv_5, grammarAccess.getIPAMAccess().getHyphenMinusKeyword_1_1_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:3911:10: ( (lv_configs_6_0= ruleIPAMConfig ) )
            	    	    // InternalDockerCompose.g:3912:11: (lv_configs_6_0= ruleIPAMConfig )
            	    	    {
            	    	    // InternalDockerCompose.g:3912:11: (lv_configs_6_0= ruleIPAMConfig )
            	    	    // InternalDockerCompose.g:3913:12: lv_configs_6_0= ruleIPAMConfig
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getIPAMAccess().getConfigsIPAMConfigParserRuleCall_1_1_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_52);
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
            	    	    if ( cnt47 >= 1 ) break loop47;
            	                EarlyExitException eee =
            	                    new EarlyExitException(47, input);
            	                throw eee;
            	        }
            	        cnt47++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIPAMAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDockerCompose.g:3937:4: ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3937:4: ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) )
            	    // InternalDockerCompose.g:3938:5: {...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalDockerCompose.g:3938:101: ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) )
            	    // InternalDockerCompose.g:3939:6: ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalDockerCompose.g:3942:9: ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) )
            	    // InternalDockerCompose.g:3942:10: {...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "true");
            	    }
            	    // InternalDockerCompose.g:3942:19: (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ )
            	    // InternalDockerCompose.g:3942:20: otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+
            	    {
            	    otherlv_7=(Token)match(input,67,FOLLOW_5); 

            	    									newLeafNode(otherlv_7, grammarAccess.getIPAMAccess().getOptionsKeyword_1_2_0());
            	    								
            	    // InternalDockerCompose.g:3946:9: ( (lv_options_8_0= ruleIPAMOption ) )+
            	    int cnt48=0;
            	    loop48:
            	    do {
            	        int alt48=2;
            	        int LA48_0 = input.LA(1);

            	        if ( (LA48_0==RULE_STRING) ) {
            	            int LA48_2 = input.LA(2);

            	            if ( (LA48_2==21) ) {
            	                int LA48_4 = input.LA(3);

            	                if ( (LA48_4==RULE_STRING) ) {
            	                    int LA48_5 = input.LA(4);

            	                    if ( (LA48_5==EOF||LA48_5==RULE_ID||LA48_5==RULE_STRING||(LA48_5>=15 && LA48_5<=20)||(LA48_5>=55 && LA48_5<=63)||(LA48_5>=66 && LA48_5<=67)) ) {
            	                        alt48=1;
            	                    }


            	                }
            	                else if ( (LA48_4==RULE_ID) ) {
            	                    int LA48_6 = input.LA(4);

            	                    if ( (LA48_6==EOF||LA48_6==RULE_ID||LA48_6==RULE_STRING||(LA48_6>=15 && LA48_6<=20)||(LA48_6>=55 && LA48_6<=63)||(LA48_6>=66 && LA48_6<=67)) ) {
            	                        alt48=1;
            	                    }


            	                }


            	            }


            	        }
            	        else if ( (LA48_0==RULE_ID) ) {
            	            int LA48_3 = input.LA(2);

            	            if ( (LA48_3==21) ) {
            	                int LA48_4 = input.LA(3);

            	                if ( (LA48_4==RULE_STRING) ) {
            	                    int LA48_5 = input.LA(4);

            	                    if ( (LA48_5==EOF||LA48_5==RULE_ID||LA48_5==RULE_STRING||(LA48_5>=15 && LA48_5<=20)||(LA48_5>=55 && LA48_5<=63)||(LA48_5>=66 && LA48_5<=67)) ) {
            	                        alt48=1;
            	                    }


            	                }
            	                else if ( (LA48_4==RULE_ID) ) {
            	                    int LA48_6 = input.LA(4);

            	                    if ( (LA48_6==EOF||LA48_6==RULE_ID||LA48_6==RULE_STRING||(LA48_6>=15 && LA48_6<=20)||(LA48_6>=55 && LA48_6<=63)||(LA48_6>=66 && LA48_6<=67)) ) {
            	                        alt48=1;
            	                    }


            	                }


            	            }


            	        }


            	        switch (alt48) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:3947:10: (lv_options_8_0= ruleIPAMOption )
            	    	    {
            	    	    // InternalDockerCompose.g:3947:10: (lv_options_8_0= ruleIPAMOption )
            	    	    // InternalDockerCompose.g:3948:11: lv_options_8_0= ruleIPAMOption
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getIPAMAccess().getOptionsIPAMOptionParserRuleCall_1_2_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_53);
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
            	    	    if ( cnt48 >= 1 ) break loop48;
            	                EarlyExitException eee =
            	                    new EarlyExitException(48, input);
            	                throw eee;
            	        }
            	        cnt48++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIPAMAccess().getUnorderedGroup_1());
            	    					

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
    // InternalDockerCompose.g:3982:1: entryRuleIPAMConfig returns [EObject current=null] : iv_ruleIPAMConfig= ruleIPAMConfig EOF ;
    public final EObject entryRuleIPAMConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAMConfig = null;


        try {
            // InternalDockerCompose.g:3982:51: (iv_ruleIPAMConfig= ruleIPAMConfig EOF )
            // InternalDockerCompose.g:3983:2: iv_ruleIPAMConfig= ruleIPAMConfig EOF
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
    // InternalDockerCompose.g:3989:1: ruleIPAMConfig returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) ) ) ;
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
            // InternalDockerCompose.g:3995:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:3996:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:3996:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:3997:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:3997:3: ()
            // InternalDockerCompose.g:3998:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIPAMConfigAccess().getIPAMConfigAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:4004:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:4005:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:4005:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) )
            // InternalDockerCompose.g:4006:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1());
            				
            // InternalDockerCompose.g:4009:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* )
            // InternalDockerCompose.g:4010:6: ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )*
            {
            // InternalDockerCompose.g:4010:6: ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )*
            loop51:
            do {
                int alt51=5;
                int LA51_0 = input.LA(1);

                if ( LA51_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 0) ) {
                    alt51=1;
                }
                else if ( LA51_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 1) ) {
                    alt51=2;
                }
                else if ( LA51_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 2) ) {
                    alt51=3;
                }
                else if ( LA51_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 3) ) {
                    alt51=4;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalDockerCompose.g:4011:4: ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:4011:4: ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) )
            	    // InternalDockerCompose.g:4012:5: {...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalDockerCompose.g:4012:107: ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) )
            	    // InternalDockerCompose.g:4013:6: ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalDockerCompose.g:4016:9: ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) )
            	    // InternalDockerCompose.g:4016:10: {...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "true");
            	    }
            	    // InternalDockerCompose.g:4016:19: (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) )
            	    // InternalDockerCompose.g:4016:20: otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) )
            	    {
            	    otherlv_2=(Token)match(input,68,FOLLOW_11); 

            	    									newLeafNode(otherlv_2, grammarAccess.getIPAMConfigAccess().getSubnetKeyword_1_0_0());
            	    								
            	    // InternalDockerCompose.g:4020:9: ( (lv_subnet_3_0= ruleNetworkAddress ) )
            	    // InternalDockerCompose.g:4021:10: (lv_subnet_3_0= ruleNetworkAddress )
            	    {
            	    // InternalDockerCompose.g:4021:10: (lv_subnet_3_0= ruleNetworkAddress )
            	    // InternalDockerCompose.g:4022:11: lv_subnet_3_0= ruleNetworkAddress
            	    {

            	    											newCompositeNode(grammarAccess.getIPAMConfigAccess().getSubnetNetworkAddressParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_54);
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
            	    // InternalDockerCompose.g:4045:4: ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:4045:4: ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) )
            	    // InternalDockerCompose.g:4046:5: {...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalDockerCompose.g:4046:107: ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) )
            	    // InternalDockerCompose.g:4047:6: ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalDockerCompose.g:4050:9: ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) )
            	    // InternalDockerCompose.g:4050:10: {...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "true");
            	    }
            	    // InternalDockerCompose.g:4050:19: (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) )
            	    // InternalDockerCompose.g:4050:20: otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) )
            	    {
            	    otherlv_4=(Token)match(input,69,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getIPAMConfigAccess().getIp_rangeKeyword_1_1_0());
            	    								
            	    // InternalDockerCompose.g:4054:9: ( (lv_ip_range_5_0= ruleNetworkAddress ) )
            	    // InternalDockerCompose.g:4055:10: (lv_ip_range_5_0= ruleNetworkAddress )
            	    {
            	    // InternalDockerCompose.g:4055:10: (lv_ip_range_5_0= ruleNetworkAddress )
            	    // InternalDockerCompose.g:4056:11: lv_ip_range_5_0= ruleNetworkAddress
            	    {

            	    											newCompositeNode(grammarAccess.getIPAMConfigAccess().getIp_rangeNetworkAddressParserRuleCall_1_1_1_0());
            	    										
            	    pushFollow(FOLLOW_54);
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
            	    // InternalDockerCompose.g:4079:4: ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:4079:4: ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) )
            	    // InternalDockerCompose.g:4080:5: {...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalDockerCompose.g:4080:107: ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) )
            	    // InternalDockerCompose.g:4081:6: ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalDockerCompose.g:4084:9: ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) )
            	    // InternalDockerCompose.g:4084:10: {...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "true");
            	    }
            	    // InternalDockerCompose.g:4084:19: (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) )
            	    // InternalDockerCompose.g:4084:20: otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) )
            	    {
            	    otherlv_6=(Token)match(input,70,FOLLOW_21); 

            	    									newLeafNode(otherlv_6, grammarAccess.getIPAMConfigAccess().getGatewayKeyword_1_2_0());
            	    								
            	    // InternalDockerCompose.g:4088:9: ( (lv_gateway_7_0= ruleDNS ) )
            	    // InternalDockerCompose.g:4089:10: (lv_gateway_7_0= ruleDNS )
            	    {
            	    // InternalDockerCompose.g:4089:10: (lv_gateway_7_0= ruleDNS )
            	    // InternalDockerCompose.g:4090:11: lv_gateway_7_0= ruleDNS
            	    {

            	    											newCompositeNode(grammarAccess.getIPAMConfigAccess().getGatewayDNSParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_54);
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
            	    // InternalDockerCompose.g:4113:4: ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:4113:4: ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) )
            	    // InternalDockerCompose.g:4114:5: {...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalDockerCompose.g:4114:107: ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) )
            	    // InternalDockerCompose.g:4115:6: ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalDockerCompose.g:4118:9: ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) )
            	    // InternalDockerCompose.g:4118:10: {...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "true");
            	    }
            	    // InternalDockerCompose.g:4118:19: (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ )
            	    // InternalDockerCompose.g:4118:20: otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+
            	    {
            	    otherlv_8=(Token)match(input,71,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getIPAMConfigAccess().getAux_addressesKeyword_1_3_0());
            	    								
            	    // InternalDockerCompose.g:4122:9: ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+
            	    int cnt50=0;
            	    loop50:
            	    do {
            	        int alt50=2;
            	        int LA50_0 = input.LA(1);

            	        if ( (LA50_0==RULE_STRING) ) {
            	            int LA50_2 = input.LA(2);

            	            if ( (LA50_2==21) ) {
            	                int LA50_4 = input.LA(3);

            	                if ( (LA50_4==RULE_INT) ) {
            	                    alt50=1;
            	                }


            	            }


            	        }
            	        else if ( (LA50_0==RULE_ID) ) {
            	            int LA50_3 = input.LA(2);

            	            if ( (LA50_3==21) ) {
            	                int LA50_4 = input.LA(3);

            	                if ( (LA50_4==RULE_INT) ) {
            	                    alt50=1;
            	                }


            	            }


            	        }


            	        switch (alt50) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:4123:10: (lv_aux_addresses_9_0= ruleIPAMAddress )
            	    	    {
            	    	    // InternalDockerCompose.g:4123:10: (lv_aux_addresses_9_0= ruleIPAMAddress )
            	    	    // InternalDockerCompose.g:4124:11: lv_aux_addresses_9_0= ruleIPAMAddress
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getIPAMConfigAccess().getAux_addressesIPAMAddressParserRuleCall_1_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_55);
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
            	    	    if ( cnt50 >= 1 ) break loop50;
            	                EarlyExitException eee =
            	                    new EarlyExitException(50, input);
            	                throw eee;
            	        }
            	        cnt50++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalDockerCompose.g:4158:1: entryRuleIPAMOption returns [EObject current=null] : iv_ruleIPAMOption= ruleIPAMOption EOF ;
    public final EObject entryRuleIPAMOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAMOption = null;


        try {
            // InternalDockerCompose.g:4158:51: (iv_ruleIPAMOption= ruleIPAMOption EOF )
            // InternalDockerCompose.g:4159:2: iv_ruleIPAMOption= ruleIPAMOption EOF
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
    // InternalDockerCompose.g:4165:1: ruleIPAMOption returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleIPAMOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:4171:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:4172:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:4172:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:4173:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:4173:3: ()
            // InternalDockerCompose.g:4174:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIPAMOptionAccess().getIPAMOptionAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:4180:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:4181:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:4181:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:4182:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getIPAMOptionAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:4203:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:4204:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:4204:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:4205:5: lv_value_3_0= ruleEString
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
    // InternalDockerCompose.g:4226:1: entryRuleIPAMAddress returns [EObject current=null] : iv_ruleIPAMAddress= ruleIPAMAddress EOF ;
    public final EObject entryRuleIPAMAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAMAddress = null;


        try {
            // InternalDockerCompose.g:4226:52: (iv_ruleIPAMAddress= ruleIPAMAddress EOF )
            // InternalDockerCompose.g:4227:2: iv_ruleIPAMAddress= ruleIPAMAddress EOF
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
    // InternalDockerCompose.g:4233:1: ruleIPAMAddress returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) ) ) ;
    public final EObject ruleIPAMAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_dns_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:4239:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) ) ) )
            // InternalDockerCompose.g:4240:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) ) )
            {
            // InternalDockerCompose.g:4240:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) ) )
            // InternalDockerCompose.g:4241:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) )
            {
            // InternalDockerCompose.g:4241:3: ()
            // InternalDockerCompose.g:4242:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIPAMAddressAccess().getIPAMAddressAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:4248:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:4249:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:4249:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:4250:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,21,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getIPAMAddressAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:4271:3: ( (lv_dns_3_0= ruleDNS ) )
            // InternalDockerCompose.g:4272:4: (lv_dns_3_0= ruleDNS )
            {
            // InternalDockerCompose.g:4272:4: (lv_dns_3_0= ruleDNS )
            // InternalDockerCompose.g:4273:5: lv_dns_3_0= ruleDNS
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
    // InternalDockerCompose.g:4294:1: entryRulePATH returns [String current=null] : iv_rulePATH= rulePATH EOF ;
    public final String entryRulePATH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePATH = null;


        try {
            // InternalDockerCompose.g:4294:44: (iv_rulePATH= rulePATH EOF )
            // InternalDockerCompose.g:4295:2: iv_rulePATH= rulePATH EOF
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
    // InternalDockerCompose.g:4301:1: rulePATH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' )? (kw= '/' )? (this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken rulePATH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4307:2: ( ( (kw= '.' )? (kw= '/' )? (this_ID_2= RULE_ID )* ) )
            // InternalDockerCompose.g:4308:2: ( (kw= '.' )? (kw= '/' )? (this_ID_2= RULE_ID )* )
            {
            // InternalDockerCompose.g:4308:2: ( (kw= '.' )? (kw= '/' )? (this_ID_2= RULE_ID )* )
            // InternalDockerCompose.g:4309:3: (kw= '.' )? (kw= '/' )? (this_ID_2= RULE_ID )*
            {
            // InternalDockerCompose.g:4309:3: (kw= '.' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==72) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDockerCompose.g:4310:4: kw= '.'
                    {
                    kw=(Token)match(input,72,FOLLOW_56); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDockerCompose.g:4316:3: (kw= '/' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==73) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDockerCompose.g:4317:4: kw= '/'
                    {
                    kw=(Token)match(input,73,FOLLOW_57); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPATHAccess().getSolidusKeyword_1());
                    			

                    }
                    break;

            }

            // InternalDockerCompose.g:4323:3: (this_ID_2= RULE_ID )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ID) ) {
                    int LA54_2 = input.LA(2);

                    if ( (LA54_2==EOF||LA54_2==RULE_ID||LA54_2==RULE_STRING||(LA54_2>=15 && LA54_2<=20)||(LA54_2>=22 && LA54_2<=35)||(LA54_2>=41 && LA54_2<=44)||LA54_2==46||LA54_2==48||(LA54_2>=50 && LA54_2<=52)) ) {
                        alt54=1;
                    }
                    else if ( (LA54_2==21) ) {
                        int LA54_4 = input.LA(3);

                        if ( ((LA54_4>=80 && LA54_4<=82)) ) {
                            alt54=1;
                        }


                    }


                }


                switch (alt54) {
            	case 1 :
            	    // InternalDockerCompose.g:4324:4: this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_57); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getPATHAccess().getIDTerminalRuleCall_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // $ANTLR end "rulePATH"


    // $ANTLR start "entryRuleEString"
    // InternalDockerCompose.g:4336:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDockerCompose.g:4336:47: (iv_ruleEString= ruleEString EOF )
            // InternalDockerCompose.g:4337:2: iv_ruleEString= ruleEString EOF
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
    // InternalDockerCompose.g:4343:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4349:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDockerCompose.g:4350:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDockerCompose.g:4350:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_STRING) ) {
                alt55=1;
            }
            else if ( (LA55_0==RULE_ID) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalDockerCompose.g:4351:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4359:3: this_ID_1= RULE_ID
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
    // InternalDockerCompose.g:4370:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDockerCompose.g:4370:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDockerCompose.g:4371:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalDockerCompose.g:4377:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4383:2: (this_INT_0= RULE_INT )
            // InternalDockerCompose.g:4384:2: this_INT_0= RULE_INT
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
    // InternalDockerCompose.g:4394:1: entryRuleDNS returns [EObject current=null] : iv_ruleDNS= ruleDNS EOF ;
    public final EObject entryRuleDNS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNS = null;


        try {
            // InternalDockerCompose.g:4394:44: (iv_ruleDNS= ruleDNS EOF )
            // InternalDockerCompose.g:4395:2: iv_ruleDNS= ruleDNS EOF
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
    // InternalDockerCompose.g:4401:1: ruleDNS returns [EObject current=null] : ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) ) ;
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
            // InternalDockerCompose.g:4407:2: ( ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) ) )
            // InternalDockerCompose.g:4408:2: ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) )
            {
            // InternalDockerCompose.g:4408:2: ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) )
            // InternalDockerCompose.g:4409:3: ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) )
            {
            // InternalDockerCompose.g:4409:3: ( (lv_dns1_0_0= ruleEInt ) )
            // InternalDockerCompose.g:4410:4: (lv_dns1_0_0= ruleEInt )
            {
            // InternalDockerCompose.g:4410:4: (lv_dns1_0_0= ruleEInt )
            // InternalDockerCompose.g:4411:5: lv_dns1_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDNSAccess().getDns1EIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_58);
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

            otherlv_1=(Token)match(input,72,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDNSAccess().getFullStopKeyword_1());
            		
            // InternalDockerCompose.g:4432:3: ( (lv_dns2_2_0= ruleEInt ) )
            // InternalDockerCompose.g:4433:4: (lv_dns2_2_0= ruleEInt )
            {
            // InternalDockerCompose.g:4433:4: (lv_dns2_2_0= ruleEInt )
            // InternalDockerCompose.g:4434:5: lv_dns2_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDNSAccess().getDns2EIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_58);
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

            otherlv_3=(Token)match(input,72,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getDNSAccess().getFullStopKeyword_3());
            		
            // InternalDockerCompose.g:4455:3: ( (lv_dns3_4_0= ruleEInt ) )
            // InternalDockerCompose.g:4456:4: (lv_dns3_4_0= ruleEInt )
            {
            // InternalDockerCompose.g:4456:4: (lv_dns3_4_0= ruleEInt )
            // InternalDockerCompose.g:4457:5: lv_dns3_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDNSAccess().getDns3EIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_58);
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

            otherlv_5=(Token)match(input,72,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getDNSAccess().getFullStopKeyword_5());
            		
            // InternalDockerCompose.g:4478:3: ( (lv_dns4_6_0= ruleEInt ) )
            // InternalDockerCompose.g:4479:4: (lv_dns4_6_0= ruleEInt )
            {
            // InternalDockerCompose.g:4479:4: (lv_dns4_6_0= ruleEInt )
            // InternalDockerCompose.g:4480:5: lv_dns4_6_0= ruleEInt
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
    // InternalDockerCompose.g:4501:1: entryRuleNetworkAddress returns [EObject current=null] : iv_ruleNetworkAddress= ruleNetworkAddress EOF ;
    public final EObject entryRuleNetworkAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkAddress = null;


        try {
            // InternalDockerCompose.g:4501:55: (iv_ruleNetworkAddress= ruleNetworkAddress EOF )
            // InternalDockerCompose.g:4502:2: iv_ruleNetworkAddress= ruleNetworkAddress EOF
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
    // InternalDockerCompose.g:4508:1: ruleNetworkAddress returns [EObject current=null] : ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) ) ) ;
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
            // InternalDockerCompose.g:4514:2: ( ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) ) ) )
            // InternalDockerCompose.g:4515:2: ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) ) )
            {
            // InternalDockerCompose.g:4515:2: ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) ) )
            // InternalDockerCompose.g:4516:3: ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) )
            {
            // InternalDockerCompose.g:4516:3: ( (lv_dns1_0_0= ruleEInt ) )
            // InternalDockerCompose.g:4517:4: (lv_dns1_0_0= ruleEInt )
            {
            // InternalDockerCompose.g:4517:4: (lv_dns1_0_0= ruleEInt )
            // InternalDockerCompose.g:4518:5: lv_dns1_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNetworkAddressAccess().getDns1EIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_58);
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

            otherlv_1=(Token)match(input,72,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getNetworkAddressAccess().getFullStopKeyword_1());
            		
            // InternalDockerCompose.g:4539:3: ( (lv_dns2_2_0= ruleEInt ) )
            // InternalDockerCompose.g:4540:4: (lv_dns2_2_0= ruleEInt )
            {
            // InternalDockerCompose.g:4540:4: (lv_dns2_2_0= ruleEInt )
            // InternalDockerCompose.g:4541:5: lv_dns2_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNetworkAddressAccess().getDns2EIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_58);
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

            otherlv_3=(Token)match(input,72,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getNetworkAddressAccess().getFullStopKeyword_3());
            		
            // InternalDockerCompose.g:4562:3: ( (lv_dns3_4_0= ruleEInt ) )
            // InternalDockerCompose.g:4563:4: (lv_dns3_4_0= ruleEInt )
            {
            // InternalDockerCompose.g:4563:4: (lv_dns3_4_0= ruleEInt )
            // InternalDockerCompose.g:4564:5: lv_dns3_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNetworkAddressAccess().getDns3EIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_58);
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

            otherlv_5=(Token)match(input,72,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getNetworkAddressAccess().getFullStopKeyword_5());
            		
            // InternalDockerCompose.g:4585:3: ( (lv_dns4_6_0= ruleEInt ) )
            // InternalDockerCompose.g:4586:4: (lv_dns4_6_0= ruleEInt )
            {
            // InternalDockerCompose.g:4586:4: (lv_dns4_6_0= ruleEInt )
            // InternalDockerCompose.g:4587:5: lv_dns4_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNetworkAddressAccess().getDns4EIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_59);
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

            otherlv_7=(Token)match(input,73,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getNetworkAddressAccess().getSolidusKeyword_7());
            		
            // InternalDockerCompose.g:4608:3: ( (lv_netId_8_0= ruleEInt ) )
            // InternalDockerCompose.g:4609:4: (lv_netId_8_0= ruleEInt )
            {
            // InternalDockerCompose.g:4609:4: (lv_netId_8_0= ruleEInt )
            // InternalDockerCompose.g:4610:5: lv_netId_8_0= ruleEInt
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
    // InternalDockerCompose.g:4631:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalDockerCompose.g:4631:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalDockerCompose.g:4632:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalDockerCompose.g:4638:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4644:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalDockerCompose.g:4645:2: (kw= 'true' | kw= 'false' )
            {
            // InternalDockerCompose.g:4645:2: (kw= 'true' | kw= 'false' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==74) ) {
                alt56=1;
            }
            else if ( (LA56_0==75) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalDockerCompose.g:4646:3: kw= 'true'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4652:3: kw= 'false'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

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
    // InternalDockerCompose.g:4661:1: ruleRestartPolicy returns [Enumerator current=null] : ( (enumLiteral_0= '\"no\"' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'on-failure' ) | (enumLiteral_3= 'unless-stopped' ) ) ;
    public final Enumerator ruleRestartPolicy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4667:2: ( ( (enumLiteral_0= '\"no\"' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'on-failure' ) | (enumLiteral_3= 'unless-stopped' ) ) )
            // InternalDockerCompose.g:4668:2: ( (enumLiteral_0= '\"no\"' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'on-failure' ) | (enumLiteral_3= 'unless-stopped' ) )
            {
            // InternalDockerCompose.g:4668:2: ( (enumLiteral_0= '\"no\"' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'on-failure' ) | (enumLiteral_3= 'unless-stopped' ) )
            int alt57=4;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt57=1;
                }
                break;
            case 77:
                {
                alt57=2;
                }
                break;
            case 78:
                {
                alt57=3;
                }
                break;
            case 79:
                {
                alt57=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalDockerCompose.g:4669:3: (enumLiteral_0= '\"no\"' )
                    {
                    // InternalDockerCompose.g:4669:3: (enumLiteral_0= '\"no\"' )
                    // InternalDockerCompose.g:4670:4: enumLiteral_0= '\"no\"'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getRestartPolicyAccess().getNoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRestartPolicyAccess().getNoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4677:3: (enumLiteral_1= 'always' )
                    {
                    // InternalDockerCompose.g:4677:3: (enumLiteral_1= 'always' )
                    // InternalDockerCompose.g:4678:4: enumLiteral_1= 'always'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getRestartPolicyAccess().getAlwaysEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRestartPolicyAccess().getAlwaysEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:4685:3: (enumLiteral_2= 'on-failure' )
                    {
                    // InternalDockerCompose.g:4685:3: (enumLiteral_2= 'on-failure' )
                    // InternalDockerCompose.g:4686:4: enumLiteral_2= 'on-failure'
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getRestartPolicyAccess().getOnfailureEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRestartPolicyAccess().getOnfailureEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDockerCompose.g:4693:3: (enumLiteral_3= 'unless-stopped' )
                    {
                    // InternalDockerCompose.g:4693:3: (enumLiteral_3= 'unless-stopped' )
                    // InternalDockerCompose.g:4694:4: enumLiteral_3= 'unless-stopped'
                    {
                    enumLiteral_3=(Token)match(input,79,FOLLOW_2); 

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
    // InternalDockerCompose.g:4704:1: ruleAccessMode returns [Enumerator current=null] : ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) | (enumLiteral_2= 'z' ) ) ;
    public final Enumerator ruleAccessMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4710:2: ( ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) | (enumLiteral_2= 'z' ) ) )
            // InternalDockerCompose.g:4711:2: ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) | (enumLiteral_2= 'z' ) )
            {
            // InternalDockerCompose.g:4711:2: ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) | (enumLiteral_2= 'z' ) )
            int alt58=3;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt58=1;
                }
                break;
            case 81:
                {
                alt58=2;
                }
                break;
            case 82:
                {
                alt58=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalDockerCompose.g:4712:3: (enumLiteral_0= 'rw' )
                    {
                    // InternalDockerCompose.g:4712:3: (enumLiteral_0= 'rw' )
                    // InternalDockerCompose.g:4713:4: enumLiteral_0= 'rw'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getAccessModeAccess().getRwEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessModeAccess().getRwEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4720:3: (enumLiteral_1= 'ro' )
                    {
                    // InternalDockerCompose.g:4720:3: (enumLiteral_1= 'ro' )
                    // InternalDockerCompose.g:4721:4: enumLiteral_1= 'ro'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getAccessModeAccess().getRoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessModeAccess().getRoEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:4728:3: (enumLiteral_2= 'z' )
                    {
                    // InternalDockerCompose.g:4728:3: (enumLiteral_2= 'z' )
                    // InternalDockerCompose.g:4729:4: enumLiteral_2= 'z'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); 

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
    // InternalDockerCompose.g:4739:1: ruleMountType returns [Enumerator current=null] : ( (enumLiteral_0= 'volume' ) | (enumLiteral_1= 'bind' ) | (enumLiteral_2= 'tmpfs' ) | (enumLiteral_3= 'npipe' ) ) ;
    public final Enumerator ruleMountType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4745:2: ( ( (enumLiteral_0= 'volume' ) | (enumLiteral_1= 'bind' ) | (enumLiteral_2= 'tmpfs' ) | (enumLiteral_3= 'npipe' ) ) )
            // InternalDockerCompose.g:4746:2: ( (enumLiteral_0= 'volume' ) | (enumLiteral_1= 'bind' ) | (enumLiteral_2= 'tmpfs' ) | (enumLiteral_3= 'npipe' ) )
            {
            // InternalDockerCompose.g:4746:2: ( (enumLiteral_0= 'volume' ) | (enumLiteral_1= 'bind' ) | (enumLiteral_2= 'tmpfs' ) | (enumLiteral_3= 'npipe' ) )
            int alt59=4;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt59=1;
                }
                break;
            case 84:
                {
                alt59=2;
                }
                break;
            case 85:
                {
                alt59=3;
                }
                break;
            case 86:
                {
                alt59=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalDockerCompose.g:4747:3: (enumLiteral_0= 'volume' )
                    {
                    // InternalDockerCompose.g:4747:3: (enumLiteral_0= 'volume' )
                    // InternalDockerCompose.g:4748:4: enumLiteral_0= 'volume'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getMountTypeAccess().getVolumeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMountTypeAccess().getVolumeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4755:3: (enumLiteral_1= 'bind' )
                    {
                    // InternalDockerCompose.g:4755:3: (enumLiteral_1= 'bind' )
                    // InternalDockerCompose.g:4756:4: enumLiteral_1= 'bind'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getMountTypeAccess().getBindEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMountTypeAccess().getBindEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:4763:3: (enumLiteral_2= 'tmpfs' )
                    {
                    // InternalDockerCompose.g:4763:3: (enumLiteral_2= 'tmpfs' )
                    // InternalDockerCompose.g:4764:4: enumLiteral_2= 'tmpfs'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getMountTypeAccess().getTmpfsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMountTypeAccess().getTmpfsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDockerCompose.g:4771:3: (enumLiteral_3= 'npipe' )
                    {
                    // InternalDockerCompose.g:4771:3: (enumLiteral_3= 'npipe' )
                    // InternalDockerCompose.g:4772:4: enumLiteral_3= 'npipe'
                    {
                    enumLiteral_3=(Token)match(input,86,FOLLOW_2); 

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
    // InternalDockerCompose.g:4782:1: rulePropagationType returns [Enumerator current=null] : ( (enumLiteral_0= 'rprivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'rshared' ) | (enumLiteral_3= 'shared' ) | (enumLiteral_4= 'rslave' ) | (enumLiteral_5= 'slave' ) ) ;
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
            // InternalDockerCompose.g:4788:2: ( ( (enumLiteral_0= 'rprivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'rshared' ) | (enumLiteral_3= 'shared' ) | (enumLiteral_4= 'rslave' ) | (enumLiteral_5= 'slave' ) ) )
            // InternalDockerCompose.g:4789:2: ( (enumLiteral_0= 'rprivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'rshared' ) | (enumLiteral_3= 'shared' ) | (enumLiteral_4= 'rslave' ) | (enumLiteral_5= 'slave' ) )
            {
            // InternalDockerCompose.g:4789:2: ( (enumLiteral_0= 'rprivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'rshared' ) | (enumLiteral_3= 'shared' ) | (enumLiteral_4= 'rslave' ) | (enumLiteral_5= 'slave' ) )
            int alt60=6;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt60=1;
                }
                break;
            case 88:
                {
                alt60=2;
                }
                break;
            case 89:
                {
                alt60=3;
                }
                break;
            case 90:
                {
                alt60=4;
                }
                break;
            case 91:
                {
                alt60=5;
                }
                break;
            case 92:
                {
                alt60=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalDockerCompose.g:4790:3: (enumLiteral_0= 'rprivate' )
                    {
                    // InternalDockerCompose.g:4790:3: (enumLiteral_0= 'rprivate' )
                    // InternalDockerCompose.g:4791:4: enumLiteral_0= 'rprivate'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getRprivateEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPropagationTypeAccess().getRprivateEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4798:3: (enumLiteral_1= 'private' )
                    {
                    // InternalDockerCompose.g:4798:3: (enumLiteral_1= 'private' )
                    // InternalDockerCompose.g:4799:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPropagationTypeAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:4806:3: (enumLiteral_2= 'rshared' )
                    {
                    // InternalDockerCompose.g:4806:3: (enumLiteral_2= 'rshared' )
                    // InternalDockerCompose.g:4807:4: enumLiteral_2= 'rshared'
                    {
                    enumLiteral_2=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getRsharedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPropagationTypeAccess().getRsharedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDockerCompose.g:4814:3: (enumLiteral_3= 'shared' )
                    {
                    // InternalDockerCompose.g:4814:3: (enumLiteral_3= 'shared' )
                    // InternalDockerCompose.g:4815:4: enumLiteral_3= 'shared'
                    {
                    enumLiteral_3=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getSharedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPropagationTypeAccess().getSharedEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDockerCompose.g:4822:3: (enumLiteral_4= 'rslave' )
                    {
                    // InternalDockerCompose.g:4822:3: (enumLiteral_4= 'rslave' )
                    // InternalDockerCompose.g:4823:4: enumLiteral_4= 'rslave'
                    {
                    enumLiteral_4=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getRslaveEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPropagationTypeAccess().getRslaveEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDockerCompose.g:4830:3: (enumLiteral_5= 'slave' )
                    {
                    // InternalDockerCompose.g:4830:3: (enumLiteral_5= 'slave' )
                    // InternalDockerCompose.g:4831:4: enumLiteral_5= 'slave'
                    {
                    enumLiteral_5=(Token)match(input,92,FOLLOW_2); 

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
    // InternalDockerCompose.g:4841:1: ruleCondition returns [Enumerator current=null] : ( (enumLiteral_0= 'service_started' ) | (enumLiteral_1= 'service_healthy' ) | (enumLiteral_2= 'service_completed_successfully' ) ) ;
    public final Enumerator ruleCondition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4847:2: ( ( (enumLiteral_0= 'service_started' ) | (enumLiteral_1= 'service_healthy' ) | (enumLiteral_2= 'service_completed_successfully' ) ) )
            // InternalDockerCompose.g:4848:2: ( (enumLiteral_0= 'service_started' ) | (enumLiteral_1= 'service_healthy' ) | (enumLiteral_2= 'service_completed_successfully' ) )
            {
            // InternalDockerCompose.g:4848:2: ( (enumLiteral_0= 'service_started' ) | (enumLiteral_1= 'service_healthy' ) | (enumLiteral_2= 'service_completed_successfully' ) )
            int alt61=3;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt61=1;
                }
                break;
            case 94:
                {
                alt61=2;
                }
                break;
            case 95:
                {
                alt61=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalDockerCompose.g:4849:3: (enumLiteral_0= 'service_started' )
                    {
                    // InternalDockerCompose.g:4849:3: (enumLiteral_0= 'service_started' )
                    // InternalDockerCompose.g:4850:4: enumLiteral_0= 'service_started'
                    {
                    enumLiteral_0=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getService_startedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getConditionAccess().getService_startedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4857:3: (enumLiteral_1= 'service_healthy' )
                    {
                    // InternalDockerCompose.g:4857:3: (enumLiteral_1= 'service_healthy' )
                    // InternalDockerCompose.g:4858:4: enumLiteral_1= 'service_healthy'
                    {
                    enumLiteral_1=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getService_healthyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getConditionAccess().getService_healthyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:4865:3: (enumLiteral_2= 'service_completed_successfully' )
                    {
                    // InternalDockerCompose.g:4865:3: (enumLiteral_2= 'service_completed_successfully' )
                    // InternalDockerCompose.g:4866:4: enumLiteral_2= 'service_completed_successfully'
                    {
                    enumLiteral_2=(Token)match(input,95,FOLLOW_2); 

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


    protected DFA26 dfa26 = new DFA26(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA40 dfa40 = new DFA40(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\1\1\30\uffff";
    static final String dfa_3s = "\1\7\1\uffff\4\7\17\uffff\2\25\1\uffff\1\0";
    static final String dfa_4s = "\1\43\1\uffff\4\37\17\uffff\2\25\1\uffff\1\0";
    static final String dfa_5s = "\1\uffff\1\21\4\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\16\1\17\1\20\1\13\1\14\1\15\2\uffff\1\12\1\uffff";
    static final String dfa_6s = "\1\0\1\uffff\1\5\1\3\1\4\1\1\22\uffff\1\2}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\1\1\5\uffff\2\1\1\2\1\3\1\4\1\5\1\uffff\2\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\uffff\1\16\1\17\1\20\1\21",
            "",
            "\1\1\1\uffff\1\1\25\uffff\1\22",
            "\1\1\1\uffff\1\1\25\uffff\1\23",
            "\1\1\1\uffff\1\1\25\uffff\1\24",
            "\1\26\1\uffff\1\25\25\uffff\1\27",
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
            "\1\30",
            "\1\30",
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

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 351:6: ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'links:' (otherlv_21= '-' ( (lv_links_22_0= ruleLink ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends_on:' ( ( (lv_depends_on_24_0= ruleDependency_short ) )+ | ( (lv_depends_on_25_0= ruleDependency_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'networks:' ( (lv_networks_27_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'volumes:' ( (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_short ) ) )+ | (otherlv_31= '-' ( (lv_volumes_32_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'configs:' ( (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_short ) ) )+ | (otherlv_36= '-' ( (lv_configs_37_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'secrets:' ( (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_short ) ) )+ | (otherlv_41= '-' ( (lv_secrets_42_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'devices:' (otherlv_44= '-' ( (lv_devices_45_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'dns:' ( (otherlv_47= '-' ( (lv_dns_48_0= ruleDNS ) ) )+ | ( (lv_dns_49_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'ports:' (otherlv_51= '-' ( (lv_ports_52_0= rulePort ) ) )+ ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_0==EOF||LA26_0==RULE_ID||LA26_0==RULE_STRING||(LA26_0>=15 && LA26_0<=16)) ) {s = 1;}

                        else if ( (LA26_0==17) ) {s = 2;}

                        else if ( (LA26_0==18) ) {s = 3;}

                        else if ( (LA26_0==19) ) {s = 4;}

                        else if ( (LA26_0==20) ) {s = 5;}

                        else if ( LA26_0 >= 22 && LA26_0 <= 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 0) ) {s = 6;}

                        else if ( LA26_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 1) ) {s = 7;}

                        else if ( LA26_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 2) ) {s = 8;}

                        else if ( LA26_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 3) ) {s = 9;}

                        else if ( LA26_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 4) ) {s = 10;}

                        else if ( LA26_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 5) ) {s = 11;}

                        else if ( LA26_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 6) ) {s = 12;}

                        else if ( LA26_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 7) ) {s = 13;}

                        else if ( LA26_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8) ) {s = 14;}

                        else if ( LA26_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 13) ) {s = 15;}

                        else if ( LA26_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 14) ) {s = 16;}

                        else if ( LA26_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 15) ) {s = 17;}

                         
                        input.seek(index26_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_5 = input.LA(1);

                         
                        int index26_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_5==RULE_STRING) ) {s = 21;}

                        else if ( (LA26_5==RULE_ID) ) {s = 22;}

                        else if ( LA26_5 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9) ) {s = 23;}

                         
                        input.seek(index26_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_24 = input.LA(1);

                         
                        int index26_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9) ) {s = 23;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getServiceAccess().getUnorderedGroup_3()) ) {s = 1;}

                         
                        input.seek(index26_24);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_3 = input.LA(1);

                         
                        int index26_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_3==RULE_ID||LA26_3==RULE_STRING) ) {s = 1;}

                        else if ( LA26_3 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 11) ) {s = 19;}

                         
                        input.seek(index26_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA26_4 = input.LA(1);

                         
                        int index26_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA26_4 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 12) ) {s = 20;}

                        else if ( (LA26_4==RULE_ID||LA26_4==RULE_STRING) ) {s = 1;}

                         
                        input.seek(index26_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA26_2 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10) ) {s = 18;}

                        else if ( (LA26_2==RULE_ID||LA26_2==RULE_STRING) ) {s = 1;}

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\14\uffff";
    static final String dfa_9s = "\1\1\13\uffff";
    static final String dfa_10s = "\1\7\1\uffff\1\112\6\uffff\2\0\1\uffff";
    static final String dfa_11s = "\1\60\1\uffff\1\113\6\uffff\2\0\1\uffff";
    static final String dfa_12s = "\1\uffff\1\10\1\uffff\1\1\1\2\1\3\1\5\1\6\1\7\2\uffff\1\4";
    static final String dfa_13s = "\1\0\10\uffff\1\1\1\2\1\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\uffff\1\1\5\uffff\6\1\1\uffff\7\1\1\2\6\1\5\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\uffff\1\10",
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()+ loopback of 1737:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_0==EOF||LA34_0==RULE_ID||LA34_0==RULE_STRING||(LA34_0>=15 && LA34_0<=20)||(LA34_0>=22 && LA34_0<=28)||(LA34_0>=30 && LA34_0<=35)) ) {s = 1;}

                        else if ( (LA34_0==29) ) {s = 2;}

                        else if ( LA34_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 0) ) {s = 3;}

                        else if ( LA34_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 1) ) {s = 4;}

                        else if ( LA34_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 2) ) {s = 5;}

                        else if ( LA34_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA34_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA34_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_9 = input.LA(1);

                         
                        int index34_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 3) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1()) ) {s = 1;}

                         
                        input.seek(index34_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_10 = input.LA(1);

                         
                        int index34_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 3) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1()) ) {s = 1;}

                         
                        input.seek(index34_10);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\13\uffff";
    static final String dfa_16s = "\1\1\12\uffff";
    static final String dfa_17s = "\1\7\12\uffff";
    static final String dfa_18s = "\1\77\12\uffff";
    static final String dfa_19s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_20s = "\1\0\12\uffff}>";
    static final String[] dfa_21s = {
            "\1\1\1\uffff\1\1\5\uffff\6\1\42\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
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

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "()* loopback of 2646:7: ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_0 = input.LA(1);

                         
                        int index40_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA40_0==EOF||LA40_0==RULE_ID||LA40_0==RULE_STRING||(LA40_0>=15 && LA40_0<=20)) ) {s = 1;}

                        else if ( LA40_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 0) ) {s = 2;}

                        else if ( LA40_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 1) ) {s = 3;}

                        else if ( LA40_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 2) ) {s = 4;}

                        else if ( LA40_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 3) ) {s = 5;}

                        else if ( LA40_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 4) ) {s = 6;}

                        else if ( LA40_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 5) ) {s = 7;}

                        else if ( LA40_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 6) ) {s = 8;}

                        else if ( LA40_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 7) ) {s = 9;}

                        else if ( LA40_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 8) ) {s = 10;}

                         
                        input.seek(index40_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000001F8002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001F8282L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000F7FDE0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000F7FDE0080L,0x0000000000000300L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000F7FDE0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x000000000000F000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000FFFDE0002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000280L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000FFFDE0282L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00015E0020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x001C0A0000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x00000000E0000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000001E080000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00015E0020000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000780000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00015E0020000080L,0x0000000000000300L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x000000001F800000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000200080L,0x0000000000000300L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000070000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x001C0A0000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x001C0A0000000080L,0x0000000000000300L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xFFA0000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0xFF80000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0xFF80000000000282L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0xFF80000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x7880000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x7880000000000282L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1800000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x1800000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0080000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0080000080000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0080000080000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0080000000000282L,0x000000000000000CL});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000F0L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000282L,0x00000000000000F0L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000200L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});

}
