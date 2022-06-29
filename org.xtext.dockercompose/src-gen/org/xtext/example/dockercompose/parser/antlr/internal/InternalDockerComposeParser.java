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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VERSION", "RULE_PORT_DEF", "RULE_DEVICE_DEF", "RULE_ID", "RULE_QUOTED_INT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'version:'", "'services:'", "'networks:'", "'volumes:'", "'configs:'", "'secrets:'", "':'", "'build:'", "'image:'", "'cpu_count:'", "'command:'", "'container_name:'", "'restart:'", "'init:'", "'read_only:'", "'depends_on:'", "'-'", "'devices:'", "'dns:'", "'ports:'", "'ipv4_address:'", "'priority:'", "'aliases:'", "'link_local_ips:'", "'source:'", "'type:'", "'target:'", "'bind:'", "'propagation:'", "'volume:'", "'nocopy:'", "'tmpfs:'", "'size:'", "'uid:'", "'gid:'", "'mode:'", "'{'", "'}'", "'driver:'", "'attachable:'", "'enable_ipv6:'", "'internal:'", "'external:'", "'name:'", "'labels:'", "'driver_opts:'", "'ipam:'", "'file:'", "'environment:'", "'config:'", "'options:'", "'subnet:'", "'ip_range:'", "'gateway:'", "'aux_addresses:'", "'.'", "'/'", "'true'", "'false'", "'\"no\"'", "'always'", "'on-failure'", "'unless-stopped'", "'rw'", "'ro'", "'z'", "'volume'", "'bind'", "'tmpfs'", "'npipe'", "'rprivate'", "'private'", "'rshared'", "'shared'", "'rslave'", "'slave'"
    };
    public static final int RULE_DEVICE_DEF=6;
    public static final int T__50=50;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int RULE_VERSION=4;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int RULE_QUOTED_INT=8;
    public static final int RULE_ID=7;
    public static final int RULE_PORT_DEF=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__89=89;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
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
    // InternalDockerCompose.g:72:1: ruleDockerCompose returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) ) )+ {...}?) ) ) ;
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

        EObject lv_networks_6_0 = null;

        EObject lv_volumes_8_0 = null;

        EObject lv_configs_10_0 = null;

        EObject lv_secrets_12_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) ) )+ {...}?) ) ) )
            // InternalDockerCompose.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) ) )+ {...}?) ) )
            {
            // InternalDockerCompose.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) ) )+ {...}?) ) )
            // InternalDockerCompose.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) ) )+ {...}?) )
            {
            // InternalDockerCompose.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) ) )+ {...}?) )
            // InternalDockerCompose.g:81:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getDockerComposeAccess().getUnorderedGroup());
            			
            // InternalDockerCompose.g:84:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) ) )+ {...}?)
            // InternalDockerCompose.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) ) )+ {...}?
            {
            // InternalDockerCompose.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'version:' ( (lv_version_2_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) ) )+
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
            	    // InternalDockerCompose.g:153:3: ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:153:3: ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) )
            	    // InternalDockerCompose.g:154:4: {...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalDockerCompose.g:154:107: ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) )
            	    // InternalDockerCompose.g:155:5: ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalDockerCompose.g:158:8: ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) )
            	    // InternalDockerCompose.g:158:9: {...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:158:18: (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ )
            	    // InternalDockerCompose.g:158:19: otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_5); 

            	    								newLeafNode(otherlv_5, grammarAccess.getDockerComposeAccess().getNetworksKeyword_2_0());
            	    							
            	    // InternalDockerCompose.g:162:8: ( (lv_networks_6_0= ruleNetwork ) )+
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
            	    	    // InternalDockerCompose.g:163:9: (lv_networks_6_0= ruleNetwork )
            	    	    {
            	    	    // InternalDockerCompose.g:163:9: (lv_networks_6_0= ruleNetwork )
            	    	    // InternalDockerCompose.g:164:10: lv_networks_6_0= ruleNetwork
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getDockerComposeAccess().getNetworksNetworkParserRuleCall_2_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_networks_6_0=ruleNetwork();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getDockerComposeRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"networks",
            	    	    											lv_networks_6_0,
            	    	    											"org.xtext.example.dockercompose.DockerCompose.Network");
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
            	    // InternalDockerCompose.g:187:3: ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:187:3: ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) )
            	    // InternalDockerCompose.g:188:4: {...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalDockerCompose.g:188:107: ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) )
            	    // InternalDockerCompose.g:189:5: ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalDockerCompose.g:192:8: ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) )
            	    // InternalDockerCompose.g:192:9: {...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:192:18: (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ )
            	    // InternalDockerCompose.g:192:19: otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+
            	    {
            	    otherlv_7=(Token)match(input,18,FOLLOW_5); 

            	    								newLeafNode(otherlv_7, grammarAccess.getDockerComposeAccess().getVolumesKeyword_3_0());
            	    							
            	    // InternalDockerCompose.g:196:8: ( (lv_volumes_8_0= ruleVolume ) )+
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
            	    	    // InternalDockerCompose.g:197:9: (lv_volumes_8_0= ruleVolume )
            	    	    {
            	    	    // InternalDockerCompose.g:197:9: (lv_volumes_8_0= ruleVolume )
            	    	    // InternalDockerCompose.g:198:10: lv_volumes_8_0= ruleVolume
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getDockerComposeAccess().getVolumesVolumeParserRuleCall_3_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_volumes_8_0=ruleVolume();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getDockerComposeRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"volumes",
            	    	    											lv_volumes_8_0,
            	    	    											"org.xtext.example.dockercompose.DockerCompose.Volume");
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
            	    // InternalDockerCompose.g:221:3: ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:221:3: ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) )
            	    // InternalDockerCompose.g:222:4: {...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalDockerCompose.g:222:107: ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) )
            	    // InternalDockerCompose.g:223:5: ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalDockerCompose.g:226:8: ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) )
            	    // InternalDockerCompose.g:226:9: {...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:226:18: (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ )
            	    // InternalDockerCompose.g:226:19: otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+
            	    {
            	    otherlv_9=(Token)match(input,19,FOLLOW_5); 

            	    								newLeafNode(otherlv_9, grammarAccess.getDockerComposeAccess().getConfigsKeyword_4_0());
            	    							
            	    // InternalDockerCompose.g:230:8: ( (lv_configs_10_0= ruleConfig ) )+
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
            	    	    // InternalDockerCompose.g:231:9: (lv_configs_10_0= ruleConfig )
            	    	    {
            	    	    // InternalDockerCompose.g:231:9: (lv_configs_10_0= ruleConfig )
            	    	    // InternalDockerCompose.g:232:10: lv_configs_10_0= ruleConfig
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getDockerComposeAccess().getConfigsConfigParserRuleCall_4_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_configs_10_0=ruleConfig();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getDockerComposeRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"configs",
            	    	    											lv_configs_10_0,
            	    	    											"org.xtext.example.dockercompose.DockerCompose.Config");
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
            	    // InternalDockerCompose.g:255:3: ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:255:3: ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) )
            	    // InternalDockerCompose.g:256:4: {...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalDockerCompose.g:256:107: ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) )
            	    // InternalDockerCompose.g:257:5: ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalDockerCompose.g:260:8: ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) )
            	    // InternalDockerCompose.g:260:9: {...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:260:18: (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ )
            	    // InternalDockerCompose.g:260:19: otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+
            	    {
            	    otherlv_11=(Token)match(input,20,FOLLOW_5); 

            	    								newLeafNode(otherlv_11, grammarAccess.getDockerComposeAccess().getSecretsKeyword_5_0());
            	    							
            	    // InternalDockerCompose.g:264:8: ( (lv_secrets_12_0= ruleSecret ) )+
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
            	    	    // InternalDockerCompose.g:265:9: (lv_secrets_12_0= ruleSecret )
            	    	    {
            	    	    // InternalDockerCompose.g:265:9: (lv_secrets_12_0= ruleSecret )
            	    	    // InternalDockerCompose.g:266:10: lv_secrets_12_0= ruleSecret
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getDockerComposeAccess().getSecretsSecretParserRuleCall_5_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_secrets_12_0=ruleSecret();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getDockerComposeRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"secrets",
            	    	    											lv_secrets_12_0,
            	    	    											"org.xtext.example.dockercompose.DockerCompose.Secret");
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
    // InternalDockerCompose.g:307:1: ruleService returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) ) ) ) ;
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
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_build_5_0 = null;

        AntlrDatatypeRuleToken lv_image_7_0 = null;

        AntlrDatatypeRuleToken lv_cpu_count_9_0 = null;

        AntlrDatatypeRuleToken lv_command_11_0 = null;

        AntlrDatatypeRuleToken lv_container_name_13_0 = null;

        Enumerator lv_restart_15_0 = null;

        AntlrDatatypeRuleToken lv_init_17_0 = null;

        AntlrDatatypeRuleToken lv_read_only_19_0 = null;

        EObject lv_depends_on_22_0 = null;

        EObject lv_networks_24_0 = null;

        EObject lv_networks_25_0 = null;

        EObject lv_volumes_28_0 = null;

        EObject lv_volumes_30_0 = null;

        EObject lv_configs_33_0 = null;

        EObject lv_configs_35_0 = null;

        EObject lv_secrets_38_0 = null;

        EObject lv_secrets_40_0 = null;

        EObject lv_devices_43_0 = null;

        EObject lv_dns_46_0 = null;

        EObject lv_dns_47_0 = null;

        EObject lv_ports_50_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:313:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) ) ) ) )
            // InternalDockerCompose.g:314:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalDockerCompose.g:314:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) ) ) )
            // InternalDockerCompose.g:315:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) ) )
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
            		
            // InternalDockerCompose.g:345:3: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) ) )
            // InternalDockerCompose.g:346:4: ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) )
            {
            // InternalDockerCompose.g:346:4: ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ ) ) ) ) )+ {...}?) )
            // InternalDockerCompose.g:347:5: ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:350:5: ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ ) ) ) ) )+ {...}?)
            // InternalDockerCompose.g:351:6: ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ ) ) ) ) )+ {...}?
            {
            // InternalDockerCompose.g:351:6: ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ ) ) ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=16;
                alt25 = dfa25.predict(input);
                switch (alt25) {
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
            	    // InternalDockerCompose.g:618:4: ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:618:4: ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:619:5: {...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalDockerCompose.g:619:104: ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) )
            	    // InternalDockerCompose.g:620:6: ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalDockerCompose.g:623:9: ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) )
            	    // InternalDockerCompose.g:623:10: {...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:623:19: (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ )
            	    // InternalDockerCompose.g:623:20: otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+
            	    {
            	    otherlv_20=(Token)match(input,30,FOLLOW_14); 

            	    									newLeafNode(otherlv_20, grammarAccess.getServiceAccess().getDepends_onKeyword_3_7_0());
            	    								
            	    // InternalDockerCompose.g:627:9: (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+
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
            	    	    // InternalDockerCompose.g:628:10: otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) )
            	    	    {
            	    	    otherlv_21=(Token)match(input,31,FOLLOW_5); 

            	    	    										newLeafNode(otherlv_21, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_7_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:632:10: ( (lv_depends_on_22_0= ruleDependency ) )
            	    	    // InternalDockerCompose.g:633:11: (lv_depends_on_22_0= ruleDependency )
            	    	    {
            	    	    // InternalDockerCompose.g:633:11: (lv_depends_on_22_0= ruleDependency )
            	    	    // InternalDockerCompose.g:634:12: lv_depends_on_22_0= ruleDependency
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServiceAccess().getDepends_onDependencyParserRuleCall_3_7_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_depends_on_22_0=ruleDependency();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"depends_on",
            	    	    													lv_depends_on_22_0,
            	    	    													"org.xtext.example.dockercompose.DockerCompose.Dependency");
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
            	    // InternalDockerCompose.g:658:4: ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:658:4: ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) ) ) ) )
            	    // InternalDockerCompose.g:659:5: {...}? => ( ({...}? => (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalDockerCompose.g:659:104: ( ({...}? => (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) ) ) )
            	    // InternalDockerCompose.g:660:6: ({...}? => (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalDockerCompose.g:663:9: ({...}? => (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) ) )
            	    // InternalDockerCompose.g:663:10: {...}? => (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:663:19: (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) )
            	    // InternalDockerCompose.g:663:20: otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ )
            	    {
            	    otherlv_23=(Token)match(input,17,FOLLOW_16); 

            	    									newLeafNode(otherlv_23, grammarAccess.getServiceAccess().getNetworksKeyword_3_8_0());
            	    								
            	    // InternalDockerCompose.g:667:9: ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ )
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
            	            // InternalDockerCompose.g:668:10: ( (lv_networks_24_0= ruleNetworkConnector_short ) )+
            	            {
            	            // InternalDockerCompose.g:668:10: ( (lv_networks_24_0= ruleNetworkConnector_short ) )+
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
            	            	    // InternalDockerCompose.g:669:11: (lv_networks_24_0= ruleNetworkConnector_short )
            	            	    {
            	            	    // InternalDockerCompose.g:669:11: (lv_networks_24_0= ruleNetworkConnector_short )
            	            	    // InternalDockerCompose.g:670:12: lv_networks_24_0= ruleNetworkConnector_short
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getServiceAccess().getNetworksNetworkConnector_shortParserRuleCall_3_8_1_0_0());
            	            	    											
            	            	    pushFollow(FOLLOW_15);
            	            	    lv_networks_24_0=ruleNetworkConnector_short();

            	            	    state._fsp--;


            	            	    												if (current==null) {
            	            	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    												}
            	            	    												add(
            	            	    													current,
            	            	    													"networks",
            	            	    													lv_networks_24_0,
            	            	    													"org.xtext.example.dockercompose.DockerCompose.NetworkConnector_short");
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
            	            // InternalDockerCompose.g:688:10: ( (lv_networks_25_0= ruleNetworkConnector_long ) )+
            	            {
            	            // InternalDockerCompose.g:688:10: ( (lv_networks_25_0= ruleNetworkConnector_long ) )+
            	            int cnt10=0;
            	            loop10:
            	            do {
            	                int alt10=2;
            	                int LA10_0 = input.LA(1);

            	                if ( (LA10_0==RULE_STRING) ) {
            	                    int LA10_2 = input.LA(2);

            	                    if ( (LA10_2==21) ) {
            	                        alt10=1;
            	                    }


            	                }
            	                else if ( (LA10_0==RULE_ID) ) {
            	                    int LA10_3 = input.LA(2);

            	                    if ( (LA10_3==21) ) {
            	                        alt10=1;
            	                    }


            	                }


            	                switch (alt10) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:689:11: (lv_networks_25_0= ruleNetworkConnector_long )
            	            	    {
            	            	    // InternalDockerCompose.g:689:11: (lv_networks_25_0= ruleNetworkConnector_long )
            	            	    // InternalDockerCompose.g:690:12: lv_networks_25_0= ruleNetworkConnector_long
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getServiceAccess().getNetworksNetworkConnector_longParserRuleCall_3_8_1_1_0());
            	            	    											
            	            	    pushFollow(FOLLOW_17);
            	            	    lv_networks_25_0=ruleNetworkConnector_long();

            	            	    state._fsp--;


            	            	    												if (current==null) {
            	            	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    												}
            	            	    												add(
            	            	    													current,
            	            	    													"networks",
            	            	    													lv_networks_25_0,
            	            	    													"org.xtext.example.dockercompose.DockerCompose.NetworkConnector_long");
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
            	    // InternalDockerCompose.g:714:4: ({...}? => ( ({...}? => (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:714:4: ({...}? => ( ({...}? => (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) )
            	    // InternalDockerCompose.g:715:5: {...}? => ( ({...}? => (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // InternalDockerCompose.g:715:104: ( ({...}? => (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:716:6: ({...}? => (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9);
            	    					
            	    // InternalDockerCompose.g:719:9: ({...}? => (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) ) )
            	    // InternalDockerCompose.g:719:10: {...}? => (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:719:19: (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) )
            	    // InternalDockerCompose.g:719:20: otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ )
            	    {
            	    otherlv_26=(Token)match(input,18,FOLLOW_14); 

            	    									newLeafNode(otherlv_26, grammarAccess.getServiceAccess().getVolumesKeyword_3_9_0());
            	    								
            	    // InternalDockerCompose.g:723:9: ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==31) ) {
            	        int LA14_1 = input.LA(2);

            	        if ( (LA14_1==RULE_ID||LA14_1==RULE_STRING) ) {
            	            alt14=1;
            	        }
            	        else if ( (LA14_1==29||(LA14_1>=39 && LA14_1<=42)||LA14_1==44||LA14_1==46) ) {
            	            alt14=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 14, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalDockerCompose.g:724:10: (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+
            	            {
            	            // InternalDockerCompose.g:724:10: (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+
            	            int cnt12=0;
            	            loop12:
            	            do {
            	                int alt12=2;
            	                int LA12_0 = input.LA(1);

            	                if ( (LA12_0==31) ) {
            	                    alt12=1;
            	                }


            	                switch (alt12) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:725:11: otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) )
            	            	    {
            	            	    otherlv_27=(Token)match(input,31,FOLLOW_5); 

            	            	    											newLeafNode(otherlv_27, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_9_1_0_0());
            	            	    										
            	            	    // InternalDockerCompose.g:729:11: ( (lv_volumes_28_0= ruleVolumeConnector_short ) )
            	            	    // InternalDockerCompose.g:730:12: (lv_volumes_28_0= ruleVolumeConnector_short )
            	            	    {
            	            	    // InternalDockerCompose.g:730:12: (lv_volumes_28_0= ruleVolumeConnector_short )
            	            	    // InternalDockerCompose.g:731:13: lv_volumes_28_0= ruleVolumeConnector_short
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getVolumesVolumeConnector_shortParserRuleCall_3_9_1_0_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_15);
            	            	    lv_volumes_28_0=ruleVolumeConnector_short();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"volumes",
            	            	    														lv_volumes_28_0,
            	            	    														"org.xtext.example.dockercompose.DockerCompose.VolumeConnector_short");
            	            	    													afterParserOrEnumRuleCall();
            	            	    												

            	            	    }


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
            	        case 2 :
            	            // InternalDockerCompose.g:750:10: (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+
            	            {
            	            // InternalDockerCompose.g:750:10: (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+
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
            	            	    // InternalDockerCompose.g:751:11: otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) )
            	            	    {
            	            	    otherlv_29=(Token)match(input,31,FOLLOW_18); 

            	            	    											newLeafNode(otherlv_29, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_9_1_1_0());
            	            	    										
            	            	    // InternalDockerCompose.g:755:11: ( (lv_volumes_30_0= ruleVolumeConnector_long ) )
            	            	    // InternalDockerCompose.g:756:12: (lv_volumes_30_0= ruleVolumeConnector_long )
            	            	    {
            	            	    // InternalDockerCompose.g:756:12: (lv_volumes_30_0= ruleVolumeConnector_long )
            	            	    // InternalDockerCompose.g:757:13: lv_volumes_30_0= ruleVolumeConnector_long
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getVolumesVolumeConnector_longParserRuleCall_3_9_1_1_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_15);
            	            	    lv_volumes_30_0=ruleVolumeConnector_long();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"volumes",
            	            	    														lv_volumes_30_0,
            	            	    														"org.xtext.example.dockercompose.DockerCompose.VolumeConnector_long");
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

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalDockerCompose.g:782:4: ({...}? => ( ({...}? => (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:782:4: ({...}? => ( ({...}? => (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) ) ) ) )
            	    // InternalDockerCompose.g:783:5: {...}? => ( ({...}? => (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // InternalDockerCompose.g:783:105: ( ({...}? => (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:784:6: ({...}? => (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10);
            	    					
            	    // InternalDockerCompose.g:787:9: ({...}? => (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) ) )
            	    // InternalDockerCompose.g:787:10: {...}? => (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:787:19: (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) )
            	    // InternalDockerCompose.g:787:20: otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ )
            	    {
            	    otherlv_31=(Token)match(input,19,FOLLOW_14); 

            	    									newLeafNode(otherlv_31, grammarAccess.getServiceAccess().getConfigsKeyword_3_10_0());
            	    								
            	    // InternalDockerCompose.g:791:9: ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==31) ) {
            	        int LA17_1 = input.LA(2);

            	        if ( (LA17_1==RULE_ID||LA17_1==RULE_STRING) ) {
            	            alt17=1;
            	        }
            	        else if ( (LA17_1==39||LA17_1==41||(LA17_1>=48 && LA17_1<=50)) ) {
            	            alt17=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 17, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalDockerCompose.g:792:10: (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+
            	            {
            	            // InternalDockerCompose.g:792:10: (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+
            	            int cnt15=0;
            	            loop15:
            	            do {
            	                int alt15=2;
            	                int LA15_0 = input.LA(1);

            	                if ( (LA15_0==31) ) {
            	                    alt15=1;
            	                }


            	                switch (alt15) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:793:11: otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) )
            	            	    {
            	            	    otherlv_32=(Token)match(input,31,FOLLOW_5); 

            	            	    											newLeafNode(otherlv_32, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_10_1_0_0());
            	            	    										
            	            	    // InternalDockerCompose.g:797:11: ( (lv_configs_33_0= ruleConfigConnector_short ) )
            	            	    // InternalDockerCompose.g:798:12: (lv_configs_33_0= ruleConfigConnector_short )
            	            	    {
            	            	    // InternalDockerCompose.g:798:12: (lv_configs_33_0= ruleConfigConnector_short )
            	            	    // InternalDockerCompose.g:799:13: lv_configs_33_0= ruleConfigConnector_short
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getConfigsConfigConnector_shortParserRuleCall_3_10_1_0_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_15);
            	            	    lv_configs_33_0=ruleConfigConnector_short();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"configs",
            	            	    														lv_configs_33_0,
            	            	    														"org.xtext.example.dockercompose.DockerCompose.ConfigConnector_short");
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
            	            break;
            	        case 2 :
            	            // InternalDockerCompose.g:818:10: (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+
            	            {
            	            // InternalDockerCompose.g:818:10: (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+
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
            	            	    // InternalDockerCompose.g:819:11: otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) )
            	            	    {
            	            	    otherlv_34=(Token)match(input,31,FOLLOW_19); 

            	            	    											newLeafNode(otherlv_34, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_10_1_1_0());
            	            	    										
            	            	    // InternalDockerCompose.g:823:11: ( (lv_configs_35_0= ruleConfigConnector_long ) )
            	            	    // InternalDockerCompose.g:824:12: (lv_configs_35_0= ruleConfigConnector_long )
            	            	    {
            	            	    // InternalDockerCompose.g:824:12: (lv_configs_35_0= ruleConfigConnector_long )
            	            	    // InternalDockerCompose.g:825:13: lv_configs_35_0= ruleConfigConnector_long
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getConfigsConfigConnector_longParserRuleCall_3_10_1_1_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_15);
            	            	    lv_configs_35_0=ruleConfigConnector_long();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"configs",
            	            	    														lv_configs_35_0,
            	            	    														"org.xtext.example.dockercompose.DockerCompose.ConfigConnector_long");
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

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalDockerCompose.g:850:4: ({...}? => ( ({...}? => (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:850:4: ({...}? => ( ({...}? => (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) ) ) ) )
            	    // InternalDockerCompose.g:851:5: {...}? => ( ({...}? => (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 11)");
            	    }
            	    // InternalDockerCompose.g:851:105: ( ({...}? => (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:852:6: ({...}? => (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 11);
            	    					
            	    // InternalDockerCompose.g:855:9: ({...}? => (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) ) )
            	    // InternalDockerCompose.g:855:10: {...}? => (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:855:19: (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) )
            	    // InternalDockerCompose.g:855:20: otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ )
            	    {
            	    otherlv_36=(Token)match(input,20,FOLLOW_14); 

            	    									newLeafNode(otherlv_36, grammarAccess.getServiceAccess().getSecretsKeyword_3_11_0());
            	    								
            	    // InternalDockerCompose.g:859:9: ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==31) ) {
            	        int LA20_1 = input.LA(2);

            	        if ( (LA20_1==RULE_ID||LA20_1==RULE_STRING) ) {
            	            alt20=1;
            	        }
            	        else if ( (LA20_1==39||LA20_1==41||(LA20_1>=48 && LA20_1<=50)) ) {
            	            alt20=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 20, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalDockerCompose.g:860:10: (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+
            	            {
            	            // InternalDockerCompose.g:860:10: (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+
            	            int cnt18=0;
            	            loop18:
            	            do {
            	                int alt18=2;
            	                int LA18_0 = input.LA(1);

            	                if ( (LA18_0==31) ) {
            	                    alt18=1;
            	                }


            	                switch (alt18) {
            	            	case 1 :
            	            	    // InternalDockerCompose.g:861:11: otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) )
            	            	    {
            	            	    otherlv_37=(Token)match(input,31,FOLLOW_5); 

            	            	    											newLeafNode(otherlv_37, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_11_1_0_0());
            	            	    										
            	            	    // InternalDockerCompose.g:865:11: ( (lv_secrets_38_0= ruleSecretConnector_short ) )
            	            	    // InternalDockerCompose.g:866:12: (lv_secrets_38_0= ruleSecretConnector_short )
            	            	    {
            	            	    // InternalDockerCompose.g:866:12: (lv_secrets_38_0= ruleSecretConnector_short )
            	            	    // InternalDockerCompose.g:867:13: lv_secrets_38_0= ruleSecretConnector_short
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getSecretsSecretConnector_shortParserRuleCall_3_11_1_0_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_15);
            	            	    lv_secrets_38_0=ruleSecretConnector_short();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"secrets",
            	            	    														lv_secrets_38_0,
            	            	    														"org.xtext.example.dockercompose.DockerCompose.SecretConnector_short");
            	            	    													afterParserOrEnumRuleCall();
            	            	    												

            	            	    }


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
            	        case 2 :
            	            // InternalDockerCompose.g:886:10: (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+
            	            {
            	            // InternalDockerCompose.g:886:10: (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+
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
            	            	    // InternalDockerCompose.g:887:11: otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) )
            	            	    {
            	            	    otherlv_39=(Token)match(input,31,FOLLOW_19); 

            	            	    											newLeafNode(otherlv_39, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_11_1_1_0());
            	            	    										
            	            	    // InternalDockerCompose.g:891:11: ( (lv_secrets_40_0= ruleSecretConnector_long ) )
            	            	    // InternalDockerCompose.g:892:12: (lv_secrets_40_0= ruleSecretConnector_long )
            	            	    {
            	            	    // InternalDockerCompose.g:892:12: (lv_secrets_40_0= ruleSecretConnector_long )
            	            	    // InternalDockerCompose.g:893:13: lv_secrets_40_0= ruleSecretConnector_long
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getSecretsSecretConnector_longParserRuleCall_3_11_1_1_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_15);
            	            	    lv_secrets_40_0=ruleSecretConnector_long();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"secrets",
            	            	    														lv_secrets_40_0,
            	            	    														"org.xtext.example.dockercompose.DockerCompose.SecretConnector_long");
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

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalDockerCompose.g:918:4: ({...}? => ( ({...}? => (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:918:4: ({...}? => ( ({...}? => (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:919:5: {...}? => ( ({...}? => (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 12)");
            	    }
            	    // InternalDockerCompose.g:919:105: ( ({...}? => (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ ) ) )
            	    // InternalDockerCompose.g:920:6: ({...}? => (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 12);
            	    					
            	    // InternalDockerCompose.g:923:9: ({...}? => (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ ) )
            	    // InternalDockerCompose.g:923:10: {...}? => (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:923:19: (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ )
            	    // InternalDockerCompose.g:923:20: otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+
            	    {
            	    otherlv_41=(Token)match(input,32,FOLLOW_14); 

            	    									newLeafNode(otherlv_41, grammarAccess.getServiceAccess().getDevicesKeyword_3_12_0());
            	    								
            	    // InternalDockerCompose.g:927:9: (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+
            	    int cnt21=0;
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==31) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:928:10: otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) )
            	    	    {
            	    	    otherlv_42=(Token)match(input,31,FOLLOW_20); 

            	    	    										newLeafNode(otherlv_42, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_12_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:932:10: ( (lv_devices_43_0= ruleDevice ) )
            	    	    // InternalDockerCompose.g:933:11: (lv_devices_43_0= ruleDevice )
            	    	    {
            	    	    // InternalDockerCompose.g:933:11: (lv_devices_43_0= ruleDevice )
            	    	    // InternalDockerCompose.g:934:12: lv_devices_43_0= ruleDevice
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServiceAccess().getDevicesDeviceParserRuleCall_3_12_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_devices_43_0=ruleDevice();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"devices",
            	    	    													lv_devices_43_0,
            	    	    													"org.xtext.example.dockercompose.DockerCompose.Device");
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


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // InternalDockerCompose.g:958:4: ({...}? => ( ({...}? => (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:958:4: ({...}? => ( ({...}? => (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) ) ) ) )
            	    // InternalDockerCompose.g:959:5: {...}? => ( ({...}? => (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 13)");
            	    }
            	    // InternalDockerCompose.g:959:105: ( ({...}? => (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) ) ) )
            	    // InternalDockerCompose.g:960:6: ({...}? => (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 13);
            	    					
            	    // InternalDockerCompose.g:963:9: ({...}? => (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) ) )
            	    // InternalDockerCompose.g:963:10: {...}? => (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:963:19: (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) )
            	    // InternalDockerCompose.g:963:20: otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) )
            	    {
            	    otherlv_44=(Token)match(input,33,FOLLOW_21); 

            	    									newLeafNode(otherlv_44, grammarAccess.getServiceAccess().getDnsKeyword_3_13_0());
            	    								
            	    // InternalDockerCompose.g:967:9: ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==31) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==RULE_INT) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalDockerCompose.g:968:10: (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+
            	            {
            	            // InternalDockerCompose.g:968:10: (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+
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
            	            	    // InternalDockerCompose.g:969:11: otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) )
            	            	    {
            	            	    otherlv_45=(Token)match(input,31,FOLLOW_21); 

            	            	    											newLeafNode(otherlv_45, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_13_1_0_0());
            	            	    										
            	            	    // InternalDockerCompose.g:973:11: ( (lv_dns_46_0= ruleDNS ) )
            	            	    // InternalDockerCompose.g:974:12: (lv_dns_46_0= ruleDNS )
            	            	    {
            	            	    // InternalDockerCompose.g:974:12: (lv_dns_46_0= ruleDNS )
            	            	    // InternalDockerCompose.g:975:13: lv_dns_46_0= ruleDNS
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getDnsDNSParserRuleCall_3_13_1_0_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_15);
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
            	            // InternalDockerCompose.g:994:10: ( (lv_dns_47_0= ruleDNS ) )
            	            {
            	            // InternalDockerCompose.g:994:10: ( (lv_dns_47_0= ruleDNS ) )
            	            // InternalDockerCompose.g:995:11: (lv_dns_47_0= ruleDNS )
            	            {
            	            // InternalDockerCompose.g:995:11: (lv_dns_47_0= ruleDNS )
            	            // InternalDockerCompose.g:996:12: lv_dns_47_0= ruleDNS
            	            {

            	            												newCompositeNode(grammarAccess.getServiceAccess().getDnsDNSParserRuleCall_3_13_1_1_0());
            	            											
            	            pushFollow(FOLLOW_10);
            	            lv_dns_47_0=ruleDNS();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getServiceRule());
            	            												}
            	            												add(
            	            													current,
            	            													"dns",
            	            													lv_dns_47_0,
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
            	case 15 :
            	    // InternalDockerCompose.g:1020:4: ({...}? => ( ({...}? => (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1020:4: ({...}? => ( ({...}? => (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:1021:5: {...}? => ( ({...}? => (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 14)");
            	    }
            	    // InternalDockerCompose.g:1021:105: ( ({...}? => (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ ) ) )
            	    // InternalDockerCompose.g:1022:6: ({...}? => (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 14);
            	    					
            	    // InternalDockerCompose.g:1025:9: ({...}? => (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ ) )
            	    // InternalDockerCompose.g:1025:10: {...}? => (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:1025:19: (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ )
            	    // InternalDockerCompose.g:1025:20: otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+
            	    {
            	    otherlv_48=(Token)match(input,34,FOLLOW_14); 

            	    									newLeafNode(otherlv_48, grammarAccess.getServiceAccess().getPortsKeyword_3_14_0());
            	    								
            	    // InternalDockerCompose.g:1029:9: (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+
            	    int cnt24=0;
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==31) ) {
            	            alt24=1;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:1030:10: otherlv_49= '-' ( (lv_ports_50_0= rulePort ) )
            	    	    {
            	    	    otherlv_49=(Token)match(input,31,FOLLOW_22); 

            	    	    										newLeafNode(otherlv_49, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_14_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:1034:10: ( (lv_ports_50_0= rulePort ) )
            	    	    // InternalDockerCompose.g:1035:11: (lv_ports_50_0= rulePort )
            	    	    {
            	    	    // InternalDockerCompose.g:1035:11: (lv_ports_50_0= rulePort )
            	    	    // InternalDockerCompose.g:1036:12: lv_ports_50_0= rulePort
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServiceAccess().getPortsPortParserRuleCall_3_14_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_ports_50_0=rulePort();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"ports",
            	    	    													lv_ports_50_0,
            	    	    													"org.xtext.example.dockercompose.DockerCompose.Port");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt24 >= 1 ) break loop24;
            	                EarlyExitException eee =
            	                    new EarlyExitException(24, input);
            	                throw eee;
            	        }
            	        cnt24++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

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
    // InternalDockerCompose.g:1072:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalDockerCompose.g:1072:45: (iv_rulePort= rulePort EOF )
            // InternalDockerCompose.g:1073:2: iv_rulePort= rulePort EOF
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
    // InternalDockerCompose.g:1079:1: rulePort returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_PORT_DEF ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:1085:2: ( ( () ( (lv_value_1_0= RULE_PORT_DEF ) ) ) )
            // InternalDockerCompose.g:1086:2: ( () ( (lv_value_1_0= RULE_PORT_DEF ) ) )
            {
            // InternalDockerCompose.g:1086:2: ( () ( (lv_value_1_0= RULE_PORT_DEF ) ) )
            // InternalDockerCompose.g:1087:3: () ( (lv_value_1_0= RULE_PORT_DEF ) )
            {
            // InternalDockerCompose.g:1087:3: ()
            // InternalDockerCompose.g:1088:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPortAccess().getPortAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1094:3: ( (lv_value_1_0= RULE_PORT_DEF ) )
            // InternalDockerCompose.g:1095:4: (lv_value_1_0= RULE_PORT_DEF )
            {
            // InternalDockerCompose.g:1095:4: (lv_value_1_0= RULE_PORT_DEF )
            // InternalDockerCompose.g:1096:5: lv_value_1_0= RULE_PORT_DEF
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
    // InternalDockerCompose.g:1116:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalDockerCompose.g:1116:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalDockerCompose.g:1117:2: iv_ruleDevice= ruleDevice EOF
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
    // InternalDockerCompose.g:1123:1: ruleDevice returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_DEVICE_DEF ) ) ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:1129:2: ( ( () ( (lv_value_1_0= RULE_DEVICE_DEF ) ) ) )
            // InternalDockerCompose.g:1130:2: ( () ( (lv_value_1_0= RULE_DEVICE_DEF ) ) )
            {
            // InternalDockerCompose.g:1130:2: ( () ( (lv_value_1_0= RULE_DEVICE_DEF ) ) )
            // InternalDockerCompose.g:1131:3: () ( (lv_value_1_0= RULE_DEVICE_DEF ) )
            {
            // InternalDockerCompose.g:1131:3: ()
            // InternalDockerCompose.g:1132:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeviceAccess().getDeviceAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1138:3: ( (lv_value_1_0= RULE_DEVICE_DEF ) )
            // InternalDockerCompose.g:1139:4: (lv_value_1_0= RULE_DEVICE_DEF )
            {
            // InternalDockerCompose.g:1139:4: (lv_value_1_0= RULE_DEVICE_DEF )
            // InternalDockerCompose.g:1140:5: lv_value_1_0= RULE_DEVICE_DEF
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
    // InternalDockerCompose.g:1160:1: entryRuleImage returns [String current=null] : iv_ruleImage= ruleImage EOF ;
    public final String entryRuleImage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImage = null;


        try {
            // InternalDockerCompose.g:1160:45: (iv_ruleImage= ruleImage EOF )
            // InternalDockerCompose.g:1161:2: iv_ruleImage= ruleImage EOF
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
    // InternalDockerCompose.g:1167:1: ruleImage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString | (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+ ) ) ;
    public final AntlrDatatypeRuleToken ruleImage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        Token kw=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_EString_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1173:2: ( (this_EString_0= ruleEString | (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+ ) ) )
            // InternalDockerCompose.g:1174:2: (this_EString_0= ruleEString | (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+ ) )
            {
            // InternalDockerCompose.g:1174:2: (this_EString_0= ruleEString | (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+ ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ID) ) {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==21) ) {
                    alt27=2;
                }
                else if ( (LA27_2==EOF||LA27_2==RULE_ID||LA27_2==RULE_STRING||(LA27_2>=15 && LA27_2<=20)||(LA27_2>=22 && LA27_2<=30)||(LA27_2>=32 && LA27_2<=34)) ) {
                    alt27=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalDockerCompose.g:1175:3: this_EString_0= ruleEString
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
                    // InternalDockerCompose.g:1186:3: (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+ )
                    {
                    // InternalDockerCompose.g:1186:3: (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+ )
                    // InternalDockerCompose.g:1187:4: this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_7); 

                    				current.merge(this_ID_1);
                    			

                    				newLeafNode(this_ID_1, grammarAccess.getImageAccess().getIDTerminalRuleCall_1_0());
                    			
                    // InternalDockerCompose.g:1194:4: (kw= ':' this_ID_3= RULE_ID )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==21) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalDockerCompose.g:1195:5: kw= ':' this_ID_3= RULE_ID
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
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
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


    // $ANTLR start "entryRuleDependency"
    // InternalDockerCompose.g:1213:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalDockerCompose.g:1213:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalDockerCompose.g:1214:2: iv_ruleDependency= ruleDependency EOF
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
    // InternalDockerCompose.g:1220:1: ruleDependency returns [EObject current=null] : ( () ( ( ruleEString ) ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalDockerCompose.g:1226:2: ( ( () ( ( ruleEString ) ) ) )
            // InternalDockerCompose.g:1227:2: ( () ( ( ruleEString ) ) )
            {
            // InternalDockerCompose.g:1227:2: ( () ( ( ruleEString ) ) )
            // InternalDockerCompose.g:1228:3: () ( ( ruleEString ) )
            {
            // InternalDockerCompose.g:1228:3: ()
            // InternalDockerCompose.g:1229:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDependencyAccess().getDependencyAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1235:3: ( ( ruleEString ) )
            // InternalDockerCompose.g:1236:4: ( ruleEString )
            {
            // InternalDockerCompose.g:1236:4: ( ruleEString )
            // InternalDockerCompose.g:1237:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDependencyAccess().getServiceServiceCrossReference_1_0());
            				
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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleNetworkConnector_short"
    // InternalDockerCompose.g:1255:1: entryRuleNetworkConnector_short returns [EObject current=null] : iv_ruleNetworkConnector_short= ruleNetworkConnector_short EOF ;
    public final EObject entryRuleNetworkConnector_short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConnector_short = null;


        try {
            // InternalDockerCompose.g:1255:63: (iv_ruleNetworkConnector_short= ruleNetworkConnector_short EOF )
            // InternalDockerCompose.g:1256:2: iv_ruleNetworkConnector_short= ruleNetworkConnector_short EOF
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
    // InternalDockerCompose.g:1262:1: ruleNetworkConnector_short returns [EObject current=null] : ( () otherlv_1= '-' ( ( ruleEString ) ) ) ;
    public final EObject ruleNetworkConnector_short() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:1268:2: ( ( () otherlv_1= '-' ( ( ruleEString ) ) ) )
            // InternalDockerCompose.g:1269:2: ( () otherlv_1= '-' ( ( ruleEString ) ) )
            {
            // InternalDockerCompose.g:1269:2: ( () otherlv_1= '-' ( ( ruleEString ) ) )
            // InternalDockerCompose.g:1270:3: () otherlv_1= '-' ( ( ruleEString ) )
            {
            // InternalDockerCompose.g:1270:3: ()
            // InternalDockerCompose.g:1271:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkConnector_shortAccess().getNetworkConnectorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getNetworkConnector_shortAccess().getHyphenMinusKeyword_1());
            		
            // InternalDockerCompose.g:1281:3: ( ( ruleEString ) )
            // InternalDockerCompose.g:1282:4: ( ruleEString )
            {
            // InternalDockerCompose.g:1282:4: ( ruleEString )
            // InternalDockerCompose.g:1283:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetworkConnector_shortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNetworkConnector_shortAccess().getNetworkNetworkCrossReference_2_0());
            				
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
    // $ANTLR end "ruleNetworkConnector_short"


    // $ANTLR start "entryRuleNetworkConnector_long"
    // InternalDockerCompose.g:1301:1: entryRuleNetworkConnector_long returns [EObject current=null] : iv_ruleNetworkConnector_long= ruleNetworkConnector_long EOF ;
    public final EObject entryRuleNetworkConnector_long() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConnector_long = null;


        try {
            // InternalDockerCompose.g:1301:62: (iv_ruleNetworkConnector_long= ruleNetworkConnector_long EOF )
            // InternalDockerCompose.g:1302:2: iv_ruleNetworkConnector_long= ruleNetworkConnector_long EOF
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
    // InternalDockerCompose.g:1308:1: ruleNetworkConnector_long returns [EObject current=null] : ( () ( ( ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleNetworkConnector_long() throws RecognitionException {
        EObject current = null;

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
            // InternalDockerCompose.g:1314:2: ( ( () ( ( ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:1315:2: ( () ( ( ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:1315:2: ( () ( ( ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:1316:3: () ( ( ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:1316:3: ()
            // InternalDockerCompose.g:1317:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkConnector_longAccess().getNetworkConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1323:3: ( ( ruleEString ) )
            // InternalDockerCompose.g:1324:4: ( ruleEString )
            {
            // InternalDockerCompose.g:1324:4: ( ruleEString )
            // InternalDockerCompose.g:1325:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetworkConnector_longRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNetworkConnector_longAccess().getNetworkNetworkCrossReference_1_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkConnector_longAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:1343:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:1344:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:1344:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )* ) )
            // InternalDockerCompose.g:1345:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:1348:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )* )
            // InternalDockerCompose.g:1349:6: ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )*
            {
            // InternalDockerCompose.g:1349:6: ( ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) ) )*
            loop30:
            do {
                int alt30=5;
                int LA30_0 = input.LA(1);

                if ( LA30_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 0) ) {
                    alt30=1;
                }
                else if ( LA30_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 1) ) {
                    alt30=2;
                }
                else if ( LA30_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 2) ) {
                    alt30=3;
                }
                else if ( LA30_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 3) ) {
                    alt30=4;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalDockerCompose.g:1350:4: ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1350:4: ({...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) ) )
            	    // InternalDockerCompose.g:1351:5: {...}? => ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNetworkConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDockerCompose.g:1351:118: ( ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) ) )
            	    // InternalDockerCompose.g:1352:6: ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDockerCompose.g:1355:9: ({...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) ) )
            	    // InternalDockerCompose.g:1355:10: {...}? => (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNetworkConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1355:19: (otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) ) )
            	    // InternalDockerCompose.g:1355:20: otherlv_4= 'ipv4_address:' ( (lv_ipv4_address_5_0= ruleDNS ) )
            	    {
            	    otherlv_4=(Token)match(input,35,FOLLOW_21); 

            	    									newLeafNode(otherlv_4, grammarAccess.getNetworkConnector_longAccess().getIpv4_addressKeyword_3_0_0());
            	    								
            	    // InternalDockerCompose.g:1359:9: ( (lv_ipv4_address_5_0= ruleDNS ) )
            	    // InternalDockerCompose.g:1360:10: (lv_ipv4_address_5_0= ruleDNS )
            	    {
            	    // InternalDockerCompose.g:1360:10: (lv_ipv4_address_5_0= ruleDNS )
            	    // InternalDockerCompose.g:1361:11: lv_ipv4_address_5_0= ruleDNS
            	    {

            	    											newCompositeNode(grammarAccess.getNetworkConnector_longAccess().getIpv4_addressDNSParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_25);
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
            	    // InternalDockerCompose.g:1384:4: ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1384:4: ({...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) ) )
            	    // InternalDockerCompose.g:1385:5: {...}? => ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNetworkConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDockerCompose.g:1385:118: ( ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) ) )
            	    // InternalDockerCompose.g:1386:6: ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDockerCompose.g:1389:9: ({...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) ) )
            	    // InternalDockerCompose.g:1389:10: {...}? => (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNetworkConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1389:19: (otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) ) )
            	    // InternalDockerCompose.g:1389:20: otherlv_6= 'priority:' ( (lv_priority_7_0= ruleEInt ) )
            	    {
            	    otherlv_6=(Token)match(input,36,FOLLOW_11); 

            	    									newLeafNode(otherlv_6, grammarAccess.getNetworkConnector_longAccess().getPriorityKeyword_3_1_0());
            	    								
            	    // InternalDockerCompose.g:1393:9: ( (lv_priority_7_0= ruleEInt ) )
            	    // InternalDockerCompose.g:1394:10: (lv_priority_7_0= ruleEInt )
            	    {
            	    // InternalDockerCompose.g:1394:10: (lv_priority_7_0= ruleEInt )
            	    // InternalDockerCompose.g:1395:11: lv_priority_7_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getNetworkConnector_longAccess().getPriorityEIntParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_25);
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
            	    // InternalDockerCompose.g:1418:4: ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1418:4: ({...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:1419:5: {...}? => ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNetworkConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:1419:118: ( ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) ) )
            	    // InternalDockerCompose.g:1420:6: ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:1423:9: ({...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ ) )
            	    // InternalDockerCompose.g:1423:10: {...}? => (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNetworkConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1423:19: (otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+ )
            	    // InternalDockerCompose.g:1423:20: otherlv_8= 'aliases:' (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+
            	    {
            	    otherlv_8=(Token)match(input,37,FOLLOW_14); 

            	    									newLeafNode(otherlv_8, grammarAccess.getNetworkConnector_longAccess().getAliasesKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:1427:9: (otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) ) )+
            	    int cnt28=0;
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==31) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:1428:10: otherlv_9= '-' ( (lv_aliases_10_0= ruleAlias ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,31,FOLLOW_5); 

            	    	    										newLeafNode(otherlv_9, grammarAccess.getNetworkConnector_longAccess().getHyphenMinusKeyword_3_2_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:1432:10: ( (lv_aliases_10_0= ruleAlias ) )
            	    	    // InternalDockerCompose.g:1433:11: (lv_aliases_10_0= ruleAlias )
            	    	    {
            	    	    // InternalDockerCompose.g:1433:11: (lv_aliases_10_0= ruleAlias )
            	    	    // InternalDockerCompose.g:1434:12: lv_aliases_10_0= ruleAlias
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getNetworkConnector_longAccess().getAliasesAliasParserRuleCall_3_2_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_26);
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
            	    	    if ( cnt28 >= 1 ) break loop28;
            	                EarlyExitException eee =
            	                    new EarlyExitException(28, input);
            	                throw eee;
            	        }
            	        cnt28++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDockerCompose.g:1458:4: ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1458:4: ({...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:1459:5: {...}? => ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNetworkConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalDockerCompose.g:1459:118: ( ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) ) )
            	    // InternalDockerCompose.g:1460:6: ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalDockerCompose.g:1463:9: ({...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ ) )
            	    // InternalDockerCompose.g:1463:10: {...}? => (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNetworkConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1463:19: (otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+ )
            	    // InternalDockerCompose.g:1463:20: otherlv_11= 'link_local_ips:' (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+
            	    {
            	    otherlv_11=(Token)match(input,38,FOLLOW_14); 

            	    									newLeafNode(otherlv_11, grammarAccess.getNetworkConnector_longAccess().getLink_local_ipsKeyword_3_3_0());
            	    								
            	    // InternalDockerCompose.g:1467:9: (otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) ) )+
            	    int cnt29=0;
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==31) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:1468:10: otherlv_12= '-' ( (lv_link_local_ips_13_0= ruleDNS ) )
            	    	    {
            	    	    otherlv_12=(Token)match(input,31,FOLLOW_21); 

            	    	    										newLeafNode(otherlv_12, grammarAccess.getNetworkConnector_longAccess().getHyphenMinusKeyword_3_3_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:1472:10: ( (lv_link_local_ips_13_0= ruleDNS ) )
            	    	    // InternalDockerCompose.g:1473:11: (lv_link_local_ips_13_0= ruleDNS )
            	    	    {
            	    	    // InternalDockerCompose.g:1473:11: (lv_link_local_ips_13_0= ruleDNS )
            	    	    // InternalDockerCompose.g:1474:12: lv_link_local_ips_13_0= ruleDNS
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getNetworkConnector_longAccess().getLink_local_ipsDNSParserRuleCall_3_3_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_26);
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
            	    	    if ( cnt29 >= 1 ) break loop29;
            	                EarlyExitException eee =
            	                    new EarlyExitException(29, input);
            	                throw eee;
            	        }
            	        cnt29++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkConnector_longAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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


    // $ANTLR start "entryRuleAlias"
    // InternalDockerCompose.g:1509:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // InternalDockerCompose.g:1509:46: (iv_ruleAlias= ruleAlias EOF )
            // InternalDockerCompose.g:1510:2: iv_ruleAlias= ruleAlias EOF
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
    // InternalDockerCompose.g:1516:1: ruleAlias returns [EObject current=null] : ( () ( (lv_alias_1_0= ruleEString ) ) ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_alias_1_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1522:2: ( ( () ( (lv_alias_1_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:1523:2: ( () ( (lv_alias_1_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:1523:2: ( () ( (lv_alias_1_0= ruleEString ) ) )
            // InternalDockerCompose.g:1524:3: () ( (lv_alias_1_0= ruleEString ) )
            {
            // InternalDockerCompose.g:1524:3: ()
            // InternalDockerCompose.g:1525:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAliasAccess().getAliasAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1531:3: ( (lv_alias_1_0= ruleEString ) )
            // InternalDockerCompose.g:1532:4: (lv_alias_1_0= ruleEString )
            {
            // InternalDockerCompose.g:1532:4: (lv_alias_1_0= ruleEString )
            // InternalDockerCompose.g:1533:5: lv_alias_1_0= ruleEString
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


    // $ANTLR start "entryRuleVolumeConnector_short"
    // InternalDockerCompose.g:1554:1: entryRuleVolumeConnector_short returns [EObject current=null] : iv_ruleVolumeConnector_short= ruleVolumeConnector_short EOF ;
    public final EObject entryRuleVolumeConnector_short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumeConnector_short = null;


        try {
            // InternalDockerCompose.g:1554:62: (iv_ruleVolumeConnector_short= ruleVolumeConnector_short EOF )
            // InternalDockerCompose.g:1555:2: iv_ruleVolumeConnector_short= ruleVolumeConnector_short EOF
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
    // InternalDockerCompose.g:1561:1: ruleVolumeConnector_short returns [EObject current=null] : ( () ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? ) ;
    public final EObject ruleVolumeConnector_short() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_container_path_3_0 = null;

        Enumerator lv_access_mode_5_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1567:2: ( ( () ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? ) )
            // InternalDockerCompose.g:1568:2: ( () ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? )
            {
            // InternalDockerCompose.g:1568:2: ( () ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? )
            // InternalDockerCompose.g:1569:3: () ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )?
            {
            // InternalDockerCompose.g:1569:3: ()
            // InternalDockerCompose.g:1570:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeConnector_shortAccess().getVolumeConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1576:3: ( ( ruleEString ) )
            // InternalDockerCompose.g:1577:4: ( ruleEString )
            {
            // InternalDockerCompose.g:1577:4: ( ruleEString )
            // InternalDockerCompose.g:1578:5: ruleEString
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

            otherlv_2=(Token)match(input,21,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getVolumeConnector_shortAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:1596:3: ( (lv_container_path_3_0= rulePATH ) )
            // InternalDockerCompose.g:1597:4: (lv_container_path_3_0= rulePATH )
            {
            // InternalDockerCompose.g:1597:4: (lv_container_path_3_0= rulePATH )
            // InternalDockerCompose.g:1598:5: lv_container_path_3_0= rulePATH
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

            // InternalDockerCompose.g:1615:3: (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==21) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDockerCompose.g:1616:4: otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getVolumeConnector_shortAccess().getColonKeyword_4_0());
                    			
                    // InternalDockerCompose.g:1620:4: ( (lv_access_mode_5_0= ruleAccessMode ) )
                    // InternalDockerCompose.g:1621:5: (lv_access_mode_5_0= ruleAccessMode )
                    {
                    // InternalDockerCompose.g:1621:5: (lv_access_mode_5_0= ruleAccessMode )
                    // InternalDockerCompose.g:1622:6: lv_access_mode_5_0= ruleAccessMode
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


    // $ANTLR start "entryRuleVolumeConnector_long"
    // InternalDockerCompose.g:1644:1: entryRuleVolumeConnector_long returns [EObject current=null] : iv_ruleVolumeConnector_long= ruleVolumeConnector_long EOF ;
    public final EObject entryRuleVolumeConnector_long() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumeConnector_long = null;


        try {
            // InternalDockerCompose.g:1644:61: (iv_ruleVolumeConnector_long= ruleVolumeConnector_long EOF )
            // InternalDockerCompose.g:1645:2: iv_ruleVolumeConnector_long= ruleVolumeConnector_long EOF
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
    // InternalDockerCompose.g:1651:1: ruleVolumeConnector_long returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ;
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
            // InternalDockerCompose.g:1657:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalDockerCompose.g:1658:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalDockerCompose.g:1658:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalDockerCompose.g:1659:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalDockerCompose.g:1659:3: ()
            // InternalDockerCompose.g:1660:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeConnector_longAccess().getVolumeConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1666:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
            // InternalDockerCompose.g:1667:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalDockerCompose.g:1667:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
            // InternalDockerCompose.g:1668:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1());
            				
            // InternalDockerCompose.g:1671:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
            // InternalDockerCompose.g:1672:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+ {...}?
            {
            // InternalDockerCompose.g:1672:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=8;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // InternalDockerCompose.g:1673:4: ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1673:4: ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:1674:5: {...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalDockerCompose.g:1674:117: ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:1675:6: ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalDockerCompose.g:1678:9: ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) )
            	    // InternalDockerCompose.g:1678:10: {...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1678:19: (otherlv_2= 'source:' ( ( ruleEString ) ) )
            	    // InternalDockerCompose.g:1678:20: otherlv_2= 'source:' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,39,FOLLOW_5); 

            	    									newLeafNode(otherlv_2, grammarAccess.getVolumeConnector_longAccess().getSourceKeyword_1_0_0());
            	    								
            	    // InternalDockerCompose.g:1682:9: ( ( ruleEString ) )
            	    // InternalDockerCompose.g:1683:10: ( ruleEString )
            	    {
            	    // InternalDockerCompose.g:1683:10: ( ruleEString )
            	    // InternalDockerCompose.g:1684:11: ruleEString
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
            	    // InternalDockerCompose.g:1704:4: ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1704:4: ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) )
            	    // InternalDockerCompose.g:1705:5: {...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalDockerCompose.g:1705:117: ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) )
            	    // InternalDockerCompose.g:1706:6: ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalDockerCompose.g:1709:9: ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) )
            	    // InternalDockerCompose.g:1709:10: {...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1709:19: (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) )
            	    // InternalDockerCompose.g:1709:20: otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) )
            	    {
            	    otherlv_4=(Token)match(input,40,FOLLOW_30); 

            	    									newLeafNode(otherlv_4, grammarAccess.getVolumeConnector_longAccess().getTypeKeyword_1_1_0());
            	    								
            	    // InternalDockerCompose.g:1713:9: ( (lv_type_5_0= ruleMountType ) )
            	    // InternalDockerCompose.g:1714:10: (lv_type_5_0= ruleMountType )
            	    {
            	    // InternalDockerCompose.g:1714:10: (lv_type_5_0= ruleMountType )
            	    // InternalDockerCompose.g:1715:11: lv_type_5_0= ruleMountType
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
            	    // InternalDockerCompose.g:1738:4: ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1738:4: ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) )
            	    // InternalDockerCompose.g:1739:5: {...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalDockerCompose.g:1739:117: ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) )
            	    // InternalDockerCompose.g:1740:6: ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalDockerCompose.g:1743:9: ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) )
            	    // InternalDockerCompose.g:1743:10: {...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1743:19: (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) )
            	    // InternalDockerCompose.g:1743:20: otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) )
            	    {
            	    otherlv_6=(Token)match(input,41,FOLLOW_31); 

            	    									newLeafNode(otherlv_6, grammarAccess.getVolumeConnector_longAccess().getTargetKeyword_1_2_0());
            	    								
            	    // InternalDockerCompose.g:1747:9: ( (lv_container_path_7_0= rulePATH ) )
            	    // InternalDockerCompose.g:1748:10: (lv_container_path_7_0= rulePATH )
            	    {
            	    // InternalDockerCompose.g:1748:10: (lv_container_path_7_0= rulePATH )
            	    // InternalDockerCompose.g:1749:11: lv_container_path_7_0= rulePATH
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
            	    // InternalDockerCompose.g:1772:4: ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1772:4: ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:1773:5: {...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalDockerCompose.g:1773:117: ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:1774:6: ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalDockerCompose.g:1777:9: ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:1777:10: {...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1777:19: (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:1777:20: otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) )
            	    {
            	    otherlv_8=(Token)match(input,29,FOLLOW_13); 

            	    									newLeafNode(otherlv_8, grammarAccess.getVolumeConnector_longAccess().getRead_onlyKeyword_1_3_0());
            	    								
            	    // InternalDockerCompose.g:1781:9: ( (lv_read_only_9_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:1782:10: (lv_read_only_9_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:1782:10: (lv_read_only_9_0= ruleEBoolean )
            	    // InternalDockerCompose.g:1783:11: lv_read_only_9_0= ruleEBoolean
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
            	    // InternalDockerCompose.g:1806:4: ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1806:4: ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) )
            	    // InternalDockerCompose.g:1807:5: {...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalDockerCompose.g:1807:117: ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) )
            	    // InternalDockerCompose.g:1808:6: ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalDockerCompose.g:1811:9: ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) )
            	    // InternalDockerCompose.g:1811:10: {...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1811:19: (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) )
            	    // InternalDockerCompose.g:1811:20: otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) )
            	    {
            	    otherlv_10=(Token)match(input,42,FOLLOW_32); 

            	    									newLeafNode(otherlv_10, grammarAccess.getVolumeConnector_longAccess().getBindKeyword_1_4_0());
            	    								
            	    otherlv_11=(Token)match(input,43,FOLLOW_33); 

            	    									newLeafNode(otherlv_11, grammarAccess.getVolumeConnector_longAccess().getPropagationKeyword_1_4_1());
            	    								
            	    // InternalDockerCompose.g:1819:9: ( (lv_propagation_12_0= rulePropagationType ) )
            	    // InternalDockerCompose.g:1820:10: (lv_propagation_12_0= rulePropagationType )
            	    {
            	    // InternalDockerCompose.g:1820:10: (lv_propagation_12_0= rulePropagationType )
            	    // InternalDockerCompose.g:1821:11: lv_propagation_12_0= rulePropagationType
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
            	    // InternalDockerCompose.g:1844:4: ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1844:4: ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:1845:5: {...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalDockerCompose.g:1845:117: ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:1846:6: ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalDockerCompose.g:1849:9: ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:1849:10: {...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1849:19: (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:1849:20: otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) )
            	    {
            	    otherlv_13=(Token)match(input,44,FOLLOW_34); 

            	    									newLeafNode(otherlv_13, grammarAccess.getVolumeConnector_longAccess().getVolumeKeyword_1_5_0());
            	    								
            	    otherlv_14=(Token)match(input,45,FOLLOW_13); 

            	    									newLeafNode(otherlv_14, grammarAccess.getVolumeConnector_longAccess().getNocopyKeyword_1_5_1());
            	    								
            	    // InternalDockerCompose.g:1857:9: ( (lv_nocopy_15_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:1858:10: (lv_nocopy_15_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:1858:10: (lv_nocopy_15_0= ruleEBoolean )
            	    // InternalDockerCompose.g:1859:11: lv_nocopy_15_0= ruleEBoolean
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
            	    // InternalDockerCompose.g:1882:4: ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:1882:4: ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) )
            	    // InternalDockerCompose.g:1883:5: {...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalDockerCompose.g:1883:117: ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) )
            	    // InternalDockerCompose.g:1884:6: ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 6);
            	    					
            	    // InternalDockerCompose.g:1887:9: ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) )
            	    // InternalDockerCompose.g:1887:10: {...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolumeConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:1887:19: (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) )
            	    // InternalDockerCompose.g:1887:20: otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) )
            	    {
            	    otherlv_16=(Token)match(input,46,FOLLOW_35); 

            	    									newLeafNode(otherlv_16, grammarAccess.getVolumeConnector_longAccess().getTmpfsKeyword_1_6_0());
            	    								
            	    otherlv_17=(Token)match(input,47,FOLLOW_11); 

            	    									newLeafNode(otherlv_17, grammarAccess.getVolumeConnector_longAccess().getSizeKeyword_1_6_1());
            	    								
            	    // InternalDockerCompose.g:1895:9: ( (lv_size_18_0= ruleEInt ) )
            	    // InternalDockerCompose.g:1896:10: (lv_size_18_0= ruleEInt )
            	    {
            	    // InternalDockerCompose.g:1896:10: (lv_size_18_0= ruleEInt )
            	    // InternalDockerCompose.g:1897:11: lv_size_18_0= ruleEInt
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
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
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


    // $ANTLR start "entryRuleConfigConnector_short"
    // InternalDockerCompose.g:1932:1: entryRuleConfigConnector_short returns [EObject current=null] : iv_ruleConfigConnector_short= ruleConfigConnector_short EOF ;
    public final EObject entryRuleConfigConnector_short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigConnector_short = null;


        try {
            // InternalDockerCompose.g:1932:62: (iv_ruleConfigConnector_short= ruleConfigConnector_short EOF )
            // InternalDockerCompose.g:1933:2: iv_ruleConfigConnector_short= ruleConfigConnector_short EOF
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
    // InternalDockerCompose.g:1939:1: ruleConfigConnector_short returns [EObject current=null] : ( () ( ( ruleEString ) ) ) ;
    public final EObject ruleConfigConnector_short() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalDockerCompose.g:1945:2: ( ( () ( ( ruleEString ) ) ) )
            // InternalDockerCompose.g:1946:2: ( () ( ( ruleEString ) ) )
            {
            // InternalDockerCompose.g:1946:2: ( () ( ( ruleEString ) ) )
            // InternalDockerCompose.g:1947:3: () ( ( ruleEString ) )
            {
            // InternalDockerCompose.g:1947:3: ()
            // InternalDockerCompose.g:1948:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigConnector_shortAccess().getConfigConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1954:3: ( ( ruleEString ) )
            // InternalDockerCompose.g:1955:4: ( ruleEString )
            {
            // InternalDockerCompose.g:1955:4: ( ruleEString )
            // InternalDockerCompose.g:1956:5: ruleEString
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


    // $ANTLR start "entryRuleConfigConnector_long"
    // InternalDockerCompose.g:1974:1: entryRuleConfigConnector_long returns [EObject current=null] : iv_ruleConfigConnector_long= ruleConfigConnector_long EOF ;
    public final EObject entryRuleConfigConnector_long() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigConnector_long = null;


        try {
            // InternalDockerCompose.g:1974:61: (iv_ruleConfigConnector_long= ruleConfigConnector_long EOF )
            // InternalDockerCompose.g:1975:2: iv_ruleConfigConnector_long= ruleConfigConnector_long EOF
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
    // InternalDockerCompose.g:1981:1: ruleConfigConnector_long returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ;
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
            // InternalDockerCompose.g:1987:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalDockerCompose.g:1988:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalDockerCompose.g:1988:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalDockerCompose.g:1989:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalDockerCompose.g:1989:3: ()
            // InternalDockerCompose.g:1990:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigConnector_longAccess().getConfigConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1996:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
            // InternalDockerCompose.g:1997:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalDockerCompose.g:1997:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
            // InternalDockerCompose.g:1998:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1());
            				
            // InternalDockerCompose.g:2001:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
            // InternalDockerCompose.g:2002:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?
            {
            // InternalDockerCompose.g:2002:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=6;
                int LA33_0 = input.LA(1);

                if ( LA33_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 0) ) {
                    alt33=1;
                }
                else if ( LA33_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 1) ) {
                    alt33=2;
                }
                else if ( LA33_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 2) ) {
                    alt33=3;
                }
                else if ( LA33_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 3) ) {
                    alt33=4;
                }
                else if ( LA33_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 4) ) {
                    alt33=5;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalDockerCompose.g:2003:4: ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2003:4: ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:2004:5: {...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalDockerCompose.g:2004:117: ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:2005:6: ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalDockerCompose.g:2008:9: ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) )
            	    // InternalDockerCompose.g:2008:10: {...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2008:19: (otherlv_2= 'source:' ( ( ruleEString ) ) )
            	    // InternalDockerCompose.g:2008:20: otherlv_2= 'source:' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,39,FOLLOW_5); 

            	    									newLeafNode(otherlv_2, grammarAccess.getConfigConnector_longAccess().getSourceKeyword_1_0_0());
            	    								
            	    // InternalDockerCompose.g:2012:9: ( ( ruleEString ) )
            	    // InternalDockerCompose.g:2013:10: ( ruleEString )
            	    {
            	    // InternalDockerCompose.g:2013:10: ( ruleEString )
            	    // InternalDockerCompose.g:2014:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getConfigConnector_longRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getConfigConnector_longAccess().getConfigConfigCrossReference_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_36);
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
            	    // InternalDockerCompose.g:2034:4: ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2034:4: ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) )
            	    // InternalDockerCompose.g:2035:5: {...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalDockerCompose.g:2035:117: ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) )
            	    // InternalDockerCompose.g:2036:6: ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalDockerCompose.g:2039:9: ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) )
            	    // InternalDockerCompose.g:2039:10: {...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2039:19: (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) )
            	    // InternalDockerCompose.g:2039:20: otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) )
            	    {
            	    otherlv_4=(Token)match(input,41,FOLLOW_37); 

            	    									newLeafNode(otherlv_4, grammarAccess.getConfigConnector_longAccess().getTargetKeyword_1_1_0());
            	    								
            	    // InternalDockerCompose.g:2043:9: ( (lv_target_5_0= rulePATH ) )
            	    // InternalDockerCompose.g:2044:10: (lv_target_5_0= rulePATH )
            	    {
            	    // InternalDockerCompose.g:2044:10: (lv_target_5_0= rulePATH )
            	    // InternalDockerCompose.g:2045:11: lv_target_5_0= rulePATH
            	    {

            	    											newCompositeNode(grammarAccess.getConfigConnector_longAccess().getTargetPATHParserRuleCall_1_1_1_0());
            	    										
            	    pushFollow(FOLLOW_36);
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
            	    // InternalDockerCompose.g:2068:4: ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2068:4: ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    // InternalDockerCompose.g:2069:5: {...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalDockerCompose.g:2069:117: ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) )
            	    // InternalDockerCompose.g:2070:6: ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalDockerCompose.g:2073:9: ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) )
            	    // InternalDockerCompose.g:2073:10: {...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2073:19: (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) )
            	    // InternalDockerCompose.g:2073:20: otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) )
            	    {
            	    otherlv_6=(Token)match(input,48,FOLLOW_38); 

            	    									newLeafNode(otherlv_6, grammarAccess.getConfigConnector_longAccess().getUidKeyword_1_2_0());
            	    								
            	    // InternalDockerCompose.g:2077:9: ( (lv_uid_7_0= RULE_QUOTED_INT ) )
            	    // InternalDockerCompose.g:2078:10: (lv_uid_7_0= RULE_QUOTED_INT )
            	    {
            	    // InternalDockerCompose.g:2078:10: (lv_uid_7_0= RULE_QUOTED_INT )
            	    // InternalDockerCompose.g:2079:11: lv_uid_7_0= RULE_QUOTED_INT
            	    {
            	    lv_uid_7_0=(Token)match(input,RULE_QUOTED_INT,FOLLOW_36); 

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
            	    // InternalDockerCompose.g:2101:4: ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2101:4: ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    // InternalDockerCompose.g:2102:5: {...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalDockerCompose.g:2102:117: ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) )
            	    // InternalDockerCompose.g:2103:6: ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalDockerCompose.g:2106:9: ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) )
            	    // InternalDockerCompose.g:2106:10: {...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2106:19: (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) )
            	    // InternalDockerCompose.g:2106:20: otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) )
            	    {
            	    otherlv_8=(Token)match(input,49,FOLLOW_38); 

            	    									newLeafNode(otherlv_8, grammarAccess.getConfigConnector_longAccess().getGidKeyword_1_3_0());
            	    								
            	    // InternalDockerCompose.g:2110:9: ( (lv_gid_9_0= RULE_QUOTED_INT ) )
            	    // InternalDockerCompose.g:2111:10: (lv_gid_9_0= RULE_QUOTED_INT )
            	    {
            	    // InternalDockerCompose.g:2111:10: (lv_gid_9_0= RULE_QUOTED_INT )
            	    // InternalDockerCompose.g:2112:11: lv_gid_9_0= RULE_QUOTED_INT
            	    {
            	    lv_gid_9_0=(Token)match(input,RULE_QUOTED_INT,FOLLOW_36); 

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
            	    // InternalDockerCompose.g:2134:4: ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2134:4: ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) )
            	    // InternalDockerCompose.g:2135:5: {...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalDockerCompose.g:2135:117: ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) )
            	    // InternalDockerCompose.g:2136:6: ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigConnector_longAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalDockerCompose.g:2139:9: ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) )
            	    // InternalDockerCompose.g:2139:10: {...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfigConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2139:19: (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) )
            	    // InternalDockerCompose.g:2139:20: otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) )
            	    {
            	    otherlv_10=(Token)match(input,50,FOLLOW_11); 

            	    									newLeafNode(otherlv_10, grammarAccess.getConfigConnector_longAccess().getModeKeyword_1_4_0());
            	    								
            	    // InternalDockerCompose.g:2143:9: ( (lv_mode_11_0= ruleEInt ) )
            	    // InternalDockerCompose.g:2144:10: (lv_mode_11_0= ruleEInt )
            	    {
            	    // InternalDockerCompose.g:2144:10: (lv_mode_11_0= ruleEInt )
            	    // InternalDockerCompose.g:2145:11: lv_mode_11_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getConfigConnector_longAccess().getModeEIntParserRuleCall_1_4_1_0());
            	    										
            	    pushFollow(FOLLOW_36);
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
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
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


    // $ANTLR start "entryRuleSecretConnector_short"
    // InternalDockerCompose.g:2180:1: entryRuleSecretConnector_short returns [EObject current=null] : iv_ruleSecretConnector_short= ruleSecretConnector_short EOF ;
    public final EObject entryRuleSecretConnector_short() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecretConnector_short = null;


        try {
            // InternalDockerCompose.g:2180:62: (iv_ruleSecretConnector_short= ruleSecretConnector_short EOF )
            // InternalDockerCompose.g:2181:2: iv_ruleSecretConnector_short= ruleSecretConnector_short EOF
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
    // InternalDockerCompose.g:2187:1: ruleSecretConnector_short returns [EObject current=null] : ( () ( ( ruleEString ) ) ) ;
    public final EObject ruleSecretConnector_short() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalDockerCompose.g:2193:2: ( ( () ( ( ruleEString ) ) ) )
            // InternalDockerCompose.g:2194:2: ( () ( ( ruleEString ) ) )
            {
            // InternalDockerCompose.g:2194:2: ( () ( ( ruleEString ) ) )
            // InternalDockerCompose.g:2195:3: () ( ( ruleEString ) )
            {
            // InternalDockerCompose.g:2195:3: ()
            // InternalDockerCompose.g:2196:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecretConnector_shortAccess().getSecretConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2202:3: ( ( ruleEString ) )
            // InternalDockerCompose.g:2203:4: ( ruleEString )
            {
            // InternalDockerCompose.g:2203:4: ( ruleEString )
            // InternalDockerCompose.g:2204:5: ruleEString
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


    // $ANTLR start "entryRuleSecretConnector_long"
    // InternalDockerCompose.g:2222:1: entryRuleSecretConnector_long returns [EObject current=null] : iv_ruleSecretConnector_long= ruleSecretConnector_long EOF ;
    public final EObject entryRuleSecretConnector_long() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecretConnector_long = null;


        try {
            // InternalDockerCompose.g:2222:61: (iv_ruleSecretConnector_long= ruleSecretConnector_long EOF )
            // InternalDockerCompose.g:2223:2: iv_ruleSecretConnector_long= ruleSecretConnector_long EOF
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
    // InternalDockerCompose.g:2229:1: ruleSecretConnector_long returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ;
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
            // InternalDockerCompose.g:2235:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalDockerCompose.g:2236:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalDockerCompose.g:2236:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalDockerCompose.g:2237:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalDockerCompose.g:2237:3: ()
            // InternalDockerCompose.g:2238:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecretConnector_longAccess().getSecretConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2244:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
            // InternalDockerCompose.g:2245:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalDockerCompose.g:2245:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
            // InternalDockerCompose.g:2246:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1());
            				
            // InternalDockerCompose.g:2249:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
            // InternalDockerCompose.g:2250:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+ {...}?
            {
            // InternalDockerCompose.g:2250:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=6;
                int LA34_0 = input.LA(1);

                if ( LA34_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 0) ) {
                    alt34=1;
                }
                else if ( LA34_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 1) ) {
                    alt34=2;
                }
                else if ( LA34_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 2) ) {
                    alt34=3;
                }
                else if ( LA34_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 3) ) {
                    alt34=4;
                }
                else if ( LA34_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 4) ) {
                    alt34=5;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDockerCompose.g:2251:4: ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2251:4: ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:2252:5: {...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalDockerCompose.g:2252:117: ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:2253:6: ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalDockerCompose.g:2256:9: ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) )
            	    // InternalDockerCompose.g:2256:10: {...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2256:19: (otherlv_2= 'source:' ( ( ruleEString ) ) )
            	    // InternalDockerCompose.g:2256:20: otherlv_2= 'source:' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,39,FOLLOW_5); 

            	    									newLeafNode(otherlv_2, grammarAccess.getSecretConnector_longAccess().getSourceKeyword_1_0_0());
            	    								
            	    // InternalDockerCompose.g:2260:9: ( ( ruleEString ) )
            	    // InternalDockerCompose.g:2261:10: ( ruleEString )
            	    {
            	    // InternalDockerCompose.g:2261:10: ( ruleEString )
            	    // InternalDockerCompose.g:2262:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSecretConnector_longRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getSecretConnector_longAccess().getSecretSecretCrossReference_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_36);
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
            	    // InternalDockerCompose.g:2282:4: ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2282:4: ({...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) ) )
            	    // InternalDockerCompose.g:2283:5: {...}? => ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalDockerCompose.g:2283:117: ( ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) ) )
            	    // InternalDockerCompose.g:2284:6: ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalDockerCompose.g:2287:9: ({...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) ) )
            	    // InternalDockerCompose.g:2287:10: {...}? => (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2287:19: (otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) ) )
            	    // InternalDockerCompose.g:2287:20: otherlv_4= 'target:' ( (lv_target_5_0= rulePATH ) )
            	    {
            	    otherlv_4=(Token)match(input,41,FOLLOW_37); 

            	    									newLeafNode(otherlv_4, grammarAccess.getSecretConnector_longAccess().getTargetKeyword_1_1_0());
            	    								
            	    // InternalDockerCompose.g:2291:9: ( (lv_target_5_0= rulePATH ) )
            	    // InternalDockerCompose.g:2292:10: (lv_target_5_0= rulePATH )
            	    {
            	    // InternalDockerCompose.g:2292:10: (lv_target_5_0= rulePATH )
            	    // InternalDockerCompose.g:2293:11: lv_target_5_0= rulePATH
            	    {

            	    											newCompositeNode(grammarAccess.getSecretConnector_longAccess().getTargetPATHParserRuleCall_1_1_1_0());
            	    										
            	    pushFollow(FOLLOW_36);
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
            	    // InternalDockerCompose.g:2316:4: ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2316:4: ({...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    // InternalDockerCompose.g:2317:5: {...}? => ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalDockerCompose.g:2317:117: ( ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) ) )
            	    // InternalDockerCompose.g:2318:6: ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalDockerCompose.g:2321:9: ({...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) ) )
            	    // InternalDockerCompose.g:2321:10: {...}? => (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2321:19: (otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) ) )
            	    // InternalDockerCompose.g:2321:20: otherlv_6= 'uid:' ( (lv_uid_7_0= RULE_QUOTED_INT ) )
            	    {
            	    otherlv_6=(Token)match(input,48,FOLLOW_38); 

            	    									newLeafNode(otherlv_6, grammarAccess.getSecretConnector_longAccess().getUidKeyword_1_2_0());
            	    								
            	    // InternalDockerCompose.g:2325:9: ( (lv_uid_7_0= RULE_QUOTED_INT ) )
            	    // InternalDockerCompose.g:2326:10: (lv_uid_7_0= RULE_QUOTED_INT )
            	    {
            	    // InternalDockerCompose.g:2326:10: (lv_uid_7_0= RULE_QUOTED_INT )
            	    // InternalDockerCompose.g:2327:11: lv_uid_7_0= RULE_QUOTED_INT
            	    {
            	    lv_uid_7_0=(Token)match(input,RULE_QUOTED_INT,FOLLOW_36); 

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
            	    // InternalDockerCompose.g:2349:4: ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2349:4: ({...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) ) )
            	    // InternalDockerCompose.g:2350:5: {...}? => ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalDockerCompose.g:2350:117: ( ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) ) )
            	    // InternalDockerCompose.g:2351:6: ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalDockerCompose.g:2354:9: ({...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) ) )
            	    // InternalDockerCompose.g:2354:10: {...}? => (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2354:19: (otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) ) )
            	    // InternalDockerCompose.g:2354:20: otherlv_8= 'gid:' ( (lv_gid_9_0= RULE_QUOTED_INT ) )
            	    {
            	    otherlv_8=(Token)match(input,49,FOLLOW_38); 

            	    									newLeafNode(otherlv_8, grammarAccess.getSecretConnector_longAccess().getGidKeyword_1_3_0());
            	    								
            	    // InternalDockerCompose.g:2358:9: ( (lv_gid_9_0= RULE_QUOTED_INT ) )
            	    // InternalDockerCompose.g:2359:10: (lv_gid_9_0= RULE_QUOTED_INT )
            	    {
            	    // InternalDockerCompose.g:2359:10: (lv_gid_9_0= RULE_QUOTED_INT )
            	    // InternalDockerCompose.g:2360:11: lv_gid_9_0= RULE_QUOTED_INT
            	    {
            	    lv_gid_9_0=(Token)match(input,RULE_QUOTED_INT,FOLLOW_36); 

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
            	    // InternalDockerCompose.g:2382:4: ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2382:4: ({...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) ) )
            	    // InternalDockerCompose.g:2383:5: {...}? => ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalDockerCompose.g:2383:117: ( ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) ) )
            	    // InternalDockerCompose.g:2384:6: ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretConnector_longAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalDockerCompose.g:2387:9: ({...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) ) )
            	    // InternalDockerCompose.g:2387:10: {...}? => (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecretConnector_long", "true");
            	    }
            	    // InternalDockerCompose.g:2387:19: (otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) ) )
            	    // InternalDockerCompose.g:2387:20: otherlv_10= 'mode:' ( (lv_mode_11_0= ruleEInt ) )
            	    {
            	    otherlv_10=(Token)match(input,50,FOLLOW_11); 

            	    									newLeafNode(otherlv_10, grammarAccess.getSecretConnector_longAccess().getModeKeyword_1_4_0());
            	    								
            	    // InternalDockerCompose.g:2391:9: ( (lv_mode_11_0= ruleEInt ) )
            	    // InternalDockerCompose.g:2392:10: (lv_mode_11_0= ruleEInt )
            	    {
            	    // InternalDockerCompose.g:2392:10: (lv_mode_11_0= ruleEInt )
            	    // InternalDockerCompose.g:2393:11: lv_mode_11_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getSecretConnector_longAccess().getModeEIntParserRuleCall_1_4_1_0());
            	    										
            	    pushFollow(FOLLOW_36);
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
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
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


    // $ANTLR start "entryRuleNetwork"
    // InternalDockerCompose.g:2428:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // InternalDockerCompose.g:2428:48: (iv_ruleNetwork= ruleNetwork EOF )
            // InternalDockerCompose.g:2429:2: iv_ruleNetwork= ruleNetwork EOF
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
    // InternalDockerCompose.g:2435:1: ruleNetwork returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) ) ) ;
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
            // InternalDockerCompose.g:2441:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) ) ) )
            // InternalDockerCompose.g:2442:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) ) )
            {
            // InternalDockerCompose.g:2442:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:2443:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:2443:3: ()
            // InternalDockerCompose.g:2444:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkAccess().getNetworkAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2450:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:2451:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:2451:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:2452:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,21,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:2473:3: ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==51) ) {
                alt38=1;
            }
            else if ( (LA38_0==EOF||LA38_0==RULE_ID||LA38_0==RULE_STRING||(LA38_0>=15 && LA38_0<=20)||(LA38_0>=53 && LA38_0<=61)) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalDockerCompose.g:2474:4: (otherlv_3= '{' otherlv_4= '}' )
                    {
                    // InternalDockerCompose.g:2474:4: (otherlv_3= '{' otherlv_4= '}' )
                    // InternalDockerCompose.g:2475:5: otherlv_3= '{' otherlv_4= '}'
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_40); 

                    					newLeafNode(otherlv_3, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_3_0_0());
                    				
                    otherlv_4=(Token)match(input,52,FOLLOW_2); 

                    					newLeafNode(otherlv_4, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_3_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:2485:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) )
                    {
                    // InternalDockerCompose.g:2485:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) )
                    // InternalDockerCompose.g:2486:5: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) )
                    {
                    // InternalDockerCompose.g:2486:5: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) )
                    // InternalDockerCompose.g:2487:6: ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    					
                    // InternalDockerCompose.g:2490:6: ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* )
                    // InternalDockerCompose.g:2491:7: ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )*
                    {
                    // InternalDockerCompose.g:2491:7: ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )*
                    loop37:
                    do {
                        int alt37=10;
                        alt37 = dfa37.predict(input);
                        switch (alt37) {
                    	case 1 :
                    	    // InternalDockerCompose.g:2492:5: ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2492:5: ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2493:6: {...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 0)");
                    	    }
                    	    // InternalDockerCompose.g:2493:107: ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) )
                    	    // InternalDockerCompose.g:2494:7: ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 0);
                    	    						
                    	    // InternalDockerCompose.g:2497:10: ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) )
                    	    // InternalDockerCompose.g:2497:11: {...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2497:20: (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) )
                    	    // InternalDockerCompose.g:2497:21: otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,53,FOLLOW_5); 

                    	    										newLeafNode(otherlv_6, grammarAccess.getNetworkAccess().getDriverKeyword_3_1_0_0());
                    	    									
                    	    // InternalDockerCompose.g:2501:10: ( (lv_driver_7_0= ruleEString ) )
                    	    // InternalDockerCompose.g:2502:11: (lv_driver_7_0= ruleEString )
                    	    {
                    	    // InternalDockerCompose.g:2502:11: (lv_driver_7_0= ruleEString )
                    	    // InternalDockerCompose.g:2503:12: lv_driver_7_0= ruleEString
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getDriverEStringParserRuleCall_3_1_0_1_0());
                    	    											
                    	    pushFollow(FOLLOW_41);
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
                    	    // InternalDockerCompose.g:2526:5: ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2526:5: ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2527:6: {...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 1)");
                    	    }
                    	    // InternalDockerCompose.g:2527:107: ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:2528:7: ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 1);
                    	    						
                    	    // InternalDockerCompose.g:2531:10: ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:2531:11: {...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2531:20: (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:2531:21: otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_8=(Token)match(input,54,FOLLOW_13); 

                    	    										newLeafNode(otherlv_8, grammarAccess.getNetworkAccess().getAttachableKeyword_3_1_1_0());
                    	    									
                    	    // InternalDockerCompose.g:2535:10: ( (lv_attachable_9_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:2536:11: (lv_attachable_9_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:2536:11: (lv_attachable_9_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:2537:12: lv_attachable_9_0= ruleEBoolean
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getAttachableEBooleanParserRuleCall_3_1_1_1_0());
                    	    											
                    	    pushFollow(FOLLOW_41);
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
                    	    // InternalDockerCompose.g:2560:5: ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2560:5: ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2561:6: {...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 2)");
                    	    }
                    	    // InternalDockerCompose.g:2561:107: ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:2562:7: ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 2);
                    	    						
                    	    // InternalDockerCompose.g:2565:10: ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:2565:11: {...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2565:20: (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:2565:21: otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_10=(Token)match(input,55,FOLLOW_13); 

                    	    										newLeafNode(otherlv_10, grammarAccess.getNetworkAccess().getEnable_ipv6Keyword_3_1_2_0());
                    	    									
                    	    // InternalDockerCompose.g:2569:10: ( (lv_enable_ipv6_11_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:2570:11: (lv_enable_ipv6_11_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:2570:11: (lv_enable_ipv6_11_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:2571:12: lv_enable_ipv6_11_0= ruleEBoolean
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getEnable_ipv6EBooleanParserRuleCall_3_1_2_1_0());
                    	    											
                    	    pushFollow(FOLLOW_41);
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
                    	    // InternalDockerCompose.g:2594:5: ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2594:5: ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2595:6: {...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 3)");
                    	    }
                    	    // InternalDockerCompose.g:2595:107: ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:2596:7: ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 3);
                    	    						
                    	    // InternalDockerCompose.g:2599:10: ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:2599:11: {...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2599:20: (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:2599:21: otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_12=(Token)match(input,56,FOLLOW_13); 

                    	    										newLeafNode(otherlv_12, grammarAccess.getNetworkAccess().getInternalKeyword_3_1_3_0());
                    	    									
                    	    // InternalDockerCompose.g:2603:10: ( (lv_internal_13_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:2604:11: (lv_internal_13_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:2604:11: (lv_internal_13_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:2605:12: lv_internal_13_0= ruleEBoolean
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getInternalEBooleanParserRuleCall_3_1_3_1_0());
                    	    											
                    	    pushFollow(FOLLOW_41);
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
                    	    // InternalDockerCompose.g:2628:5: ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2628:5: ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2629:6: {...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 4)");
                    	    }
                    	    // InternalDockerCompose.g:2629:107: ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:2630:7: ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 4);
                    	    						
                    	    // InternalDockerCompose.g:2633:10: ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:2633:11: {...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2633:20: (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:2633:21: otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_14=(Token)match(input,57,FOLLOW_13); 

                    	    										newLeafNode(otherlv_14, grammarAccess.getNetworkAccess().getExternalKeyword_3_1_4_0());
                    	    									
                    	    // InternalDockerCompose.g:2637:10: ( (lv_external_15_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:2638:11: (lv_external_15_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:2638:11: (lv_external_15_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:2639:12: lv_external_15_0= ruleEBoolean
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getExternalEBooleanParserRuleCall_3_1_4_1_0());
                    	    											
                    	    pushFollow(FOLLOW_41);
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
                    	    // InternalDockerCompose.g:2662:5: ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2662:5: ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2663:6: {...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 5)");
                    	    }
                    	    // InternalDockerCompose.g:2663:107: ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) )
                    	    // InternalDockerCompose.g:2664:7: ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 5);
                    	    						
                    	    // InternalDockerCompose.g:2667:10: ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) )
                    	    // InternalDockerCompose.g:2667:11: {...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2667:20: (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) )
                    	    // InternalDockerCompose.g:2667:21: otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,58,FOLLOW_5); 

                    	    										newLeafNode(otherlv_16, grammarAccess.getNetworkAccess().getNameKeyword_3_1_5_0());
                    	    									
                    	    // InternalDockerCompose.g:2671:10: ( (lv_network_name_17_0= ruleEString ) )
                    	    // InternalDockerCompose.g:2672:11: (lv_network_name_17_0= ruleEString )
                    	    {
                    	    // InternalDockerCompose.g:2672:11: (lv_network_name_17_0= ruleEString )
                    	    // InternalDockerCompose.g:2673:12: lv_network_name_17_0= ruleEString
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getNetwork_nameEStringParserRuleCall_3_1_5_1_0());
                    	    											
                    	    pushFollow(FOLLOW_41);
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
                    	    // InternalDockerCompose.g:2696:5: ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2696:5: ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) )
                    	    // InternalDockerCompose.g:2697:6: {...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 6) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 6)");
                    	    }
                    	    // InternalDockerCompose.g:2697:107: ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) )
                    	    // InternalDockerCompose.g:2698:7: ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 6);
                    	    						
                    	    // InternalDockerCompose.g:2701:10: ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) )
                    	    // InternalDockerCompose.g:2701:11: {...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2701:20: (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ )
                    	    // InternalDockerCompose.g:2701:21: otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+
                    	    {
                    	    otherlv_18=(Token)match(input,59,FOLLOW_5); 

                    	    										newLeafNode(otherlv_18, grammarAccess.getNetworkAccess().getLabelsKeyword_3_1_6_0());
                    	    									
                    	    // InternalDockerCompose.g:2705:10: ( (lv_labels_19_0= ruleNetworkLabel ) )+
                    	    int cnt35=0;
                    	    loop35:
                    	    do {
                    	        int alt35=2;
                    	        int LA35_0 = input.LA(1);

                    	        if ( (LA35_0==RULE_STRING) ) {
                    	            int LA35_2 = input.LA(2);

                    	            if ( (LA35_2==21) ) {
                    	                int LA35_4 = input.LA(3);

                    	                if ( (LA35_4==RULE_STRING) ) {
                    	                    int LA35_5 = input.LA(4);

                    	                    if ( (LA35_5==EOF||LA35_5==RULE_ID||LA35_5==RULE_STRING||(LA35_5>=15 && LA35_5<=20)||(LA35_5>=53 && LA35_5<=61)) ) {
                    	                        alt35=1;
                    	                    }


                    	                }
                    	                else if ( (LA35_4==RULE_ID) ) {
                    	                    int LA35_6 = input.LA(4);

                    	                    if ( (LA35_6==EOF||LA35_6==RULE_ID||LA35_6==RULE_STRING||(LA35_6>=15 && LA35_6<=20)||(LA35_6>=53 && LA35_6<=61)) ) {
                    	                        alt35=1;
                    	                    }


                    	                }


                    	            }


                    	        }
                    	        else if ( (LA35_0==RULE_ID) ) {
                    	            int LA35_3 = input.LA(2);

                    	            if ( (LA35_3==21) ) {
                    	                int LA35_4 = input.LA(3);

                    	                if ( (LA35_4==RULE_STRING) ) {
                    	                    int LA35_5 = input.LA(4);

                    	                    if ( (LA35_5==EOF||LA35_5==RULE_ID||LA35_5==RULE_STRING||(LA35_5>=15 && LA35_5<=20)||(LA35_5>=53 && LA35_5<=61)) ) {
                    	                        alt35=1;
                    	                    }


                    	                }
                    	                else if ( (LA35_4==RULE_ID) ) {
                    	                    int LA35_6 = input.LA(4);

                    	                    if ( (LA35_6==EOF||LA35_6==RULE_ID||LA35_6==RULE_STRING||(LA35_6>=15 && LA35_6<=20)||(LA35_6>=53 && LA35_6<=61)) ) {
                    	                        alt35=1;
                    	                    }


                    	                }


                    	            }


                    	        }


                    	        switch (alt35) {
                    	    	case 1 :
                    	    	    // InternalDockerCompose.g:2706:11: (lv_labels_19_0= ruleNetworkLabel )
                    	    	    {
                    	    	    // InternalDockerCompose.g:2706:11: (lv_labels_19_0= ruleNetworkLabel )
                    	    	    // InternalDockerCompose.g:2707:12: lv_labels_19_0= ruleNetworkLabel
                    	    	    {

                    	    	    												newCompositeNode(grammarAccess.getNetworkAccess().getLabelsNetworkLabelParserRuleCall_3_1_6_1_0());
                    	    	    											
                    	    	    pushFollow(FOLLOW_42);
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
                    	    	    if ( cnt35 >= 1 ) break loop35;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(35, input);
                    	                throw eee;
                    	        }
                    	        cnt35++;
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 8 :
                    	    // InternalDockerCompose.g:2730:5: ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2730:5: ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) )
                    	    // InternalDockerCompose.g:2731:6: {...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 7) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 7)");
                    	    }
                    	    // InternalDockerCompose.g:2731:107: ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) )
                    	    // InternalDockerCompose.g:2732:7: ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 7);
                    	    						
                    	    // InternalDockerCompose.g:2735:10: ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) )
                    	    // InternalDockerCompose.g:2735:11: {...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2735:20: (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ )
                    	    // InternalDockerCompose.g:2735:21: otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+
                    	    {
                    	    otherlv_20=(Token)match(input,60,FOLLOW_5); 

                    	    										newLeafNode(otherlv_20, grammarAccess.getNetworkAccess().getDriver_optsKeyword_3_1_7_0());
                    	    									
                    	    // InternalDockerCompose.g:2739:10: ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+
                    	    int cnt36=0;
                    	    loop36:
                    	    do {
                    	        int alt36=2;
                    	        int LA36_0 = input.LA(1);

                    	        if ( (LA36_0==RULE_STRING) ) {
                    	            int LA36_2 = input.LA(2);

                    	            if ( (LA36_2==21) ) {
                    	                int LA36_4 = input.LA(3);

                    	                if ( (LA36_4==RULE_STRING) ) {
                    	                    int LA36_5 = input.LA(4);

                    	                    if ( (LA36_5==EOF||LA36_5==RULE_ID||LA36_5==RULE_STRING||(LA36_5>=15 && LA36_5<=20)||(LA36_5>=53 && LA36_5<=61)) ) {
                    	                        alt36=1;
                    	                    }


                    	                }
                    	                else if ( (LA36_4==RULE_ID) ) {
                    	                    int LA36_6 = input.LA(4);

                    	                    if ( (LA36_6==EOF||LA36_6==RULE_ID||LA36_6==RULE_STRING||(LA36_6>=15 && LA36_6<=20)||(LA36_6>=53 && LA36_6<=61)) ) {
                    	                        alt36=1;
                    	                    }


                    	                }


                    	            }


                    	        }
                    	        else if ( (LA36_0==RULE_ID) ) {
                    	            int LA36_3 = input.LA(2);

                    	            if ( (LA36_3==21) ) {
                    	                int LA36_4 = input.LA(3);

                    	                if ( (LA36_4==RULE_STRING) ) {
                    	                    int LA36_5 = input.LA(4);

                    	                    if ( (LA36_5==EOF||LA36_5==RULE_ID||LA36_5==RULE_STRING||(LA36_5>=15 && LA36_5<=20)||(LA36_5>=53 && LA36_5<=61)) ) {
                    	                        alt36=1;
                    	                    }


                    	                }
                    	                else if ( (LA36_4==RULE_ID) ) {
                    	                    int LA36_6 = input.LA(4);

                    	                    if ( (LA36_6==EOF||LA36_6==RULE_ID||LA36_6==RULE_STRING||(LA36_6>=15 && LA36_6<=20)||(LA36_6>=53 && LA36_6<=61)) ) {
                    	                        alt36=1;
                    	                    }


                    	                }


                    	            }


                    	        }


                    	        switch (alt36) {
                    	    	case 1 :
                    	    	    // InternalDockerCompose.g:2740:11: (lv_driver_opts_21_0= ruleNetworkDriverOpt )
                    	    	    {
                    	    	    // InternalDockerCompose.g:2740:11: (lv_driver_opts_21_0= ruleNetworkDriverOpt )
                    	    	    // InternalDockerCompose.g:2741:12: lv_driver_opts_21_0= ruleNetworkDriverOpt
                    	    	    {

                    	    	    												newCompositeNode(grammarAccess.getNetworkAccess().getDriver_optsNetworkDriverOptParserRuleCall_3_1_7_1_0());
                    	    	    											
                    	    	    pushFollow(FOLLOW_42);
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
                    	    	    if ( cnt36 >= 1 ) break loop36;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(36, input);
                    	                throw eee;
                    	        }
                    	        cnt36++;
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 9 :
                    	    // InternalDockerCompose.g:2764:5: ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2764:5: ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2765:6: {...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 8) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 8)");
                    	    }
                    	    // InternalDockerCompose.g:2765:107: ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) )
                    	    // InternalDockerCompose.g:2766:7: ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 8);
                    	    						
                    	    // InternalDockerCompose.g:2769:10: ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) )
                    	    // InternalDockerCompose.g:2769:11: {...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2769:20: (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) )
                    	    // InternalDockerCompose.g:2769:21: otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) )
                    	    {
                    	    otherlv_22=(Token)match(input,61,FOLLOW_43); 

                    	    										newLeafNode(otherlv_22, grammarAccess.getNetworkAccess().getIpamKeyword_3_1_8_0());
                    	    									
                    	    // InternalDockerCompose.g:2773:10: ( (lv_ipam_23_0= ruleIPAM ) )
                    	    // InternalDockerCompose.g:2774:11: (lv_ipam_23_0= ruleIPAM )
                    	    {
                    	    // InternalDockerCompose.g:2774:11: (lv_ipam_23_0= ruleIPAM )
                    	    // InternalDockerCompose.g:2775:12: lv_ipam_23_0= ruleIPAM
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkAccess().getIpamIPAMParserRuleCall_3_1_8_1_0());
                    	    											
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop37;
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
    // InternalDockerCompose.g:2810:1: entryRuleVolume returns [EObject current=null] : iv_ruleVolume= ruleVolume EOF ;
    public final EObject entryRuleVolume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolume = null;


        try {
            // InternalDockerCompose.g:2810:47: (iv_ruleVolume= ruleVolume EOF )
            // InternalDockerCompose.g:2811:2: iv_ruleVolume= ruleVolume EOF
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
    // InternalDockerCompose.g:2817:1: ruleVolume returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) ) ) ;
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
            // InternalDockerCompose.g:2823:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:2824:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:2824:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:2825:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:2825:3: ()
            // InternalDockerCompose.g:2826:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeAccess().getVolumeAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2832:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:2833:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:2833:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:2834:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,21,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getVolumeAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:2855:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:2856:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:2856:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) )
            // InternalDockerCompose.g:2857:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getVolumeAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:2860:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* )
            // InternalDockerCompose.g:2861:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )*
            {
            // InternalDockerCompose.g:2861:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )*
            loop41:
            do {
                int alt41=6;
                int LA41_0 = input.LA(1);

                if ( LA41_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 0) ) {
                    alt41=1;
                }
                else if ( LA41_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 1) ) {
                    alt41=2;
                }
                else if ( LA41_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 2) ) {
                    alt41=3;
                }
                else if ( LA41_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 3) ) {
                    alt41=4;
                }
                else if ( LA41_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 4) ) {
                    alt41=5;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalDockerCompose.g:2862:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2862:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:2863:5: {...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDockerCompose.g:2863:103: ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:2864:6: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDockerCompose.g:2867:9: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:2867:10: {...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:2867:19: (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:2867:20: otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) )
            	    {
            	    otherlv_4=(Token)match(input,57,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getVolumeAccess().getExternalKeyword_3_0_0());
            	    								
            	    // InternalDockerCompose.g:2871:9: ( (lv_external_5_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:2872:10: (lv_external_5_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:2872:10: (lv_external_5_0= ruleEBoolean )
            	    // InternalDockerCompose.g:2873:11: lv_external_5_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeAccess().getExternalEBooleanParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_44);
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
            	    // InternalDockerCompose.g:2896:4: ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2896:4: ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:2897:5: {...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDockerCompose.g:2897:103: ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:2898:6: ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDockerCompose.g:2901:9: ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:2901:10: {...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:2901:19: (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:2901:20: otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,53,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getVolumeAccess().getDriverKeyword_3_1_0());
            	    								
            	    // InternalDockerCompose.g:2905:9: ( (lv_driver_7_0= ruleEString ) )
            	    // InternalDockerCompose.g:2906:10: (lv_driver_7_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:2906:10: (lv_driver_7_0= ruleEString )
            	    // InternalDockerCompose.g:2907:11: lv_driver_7_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeAccess().getDriverEStringParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_44);
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
            	    // InternalDockerCompose.g:2930:4: ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2930:4: ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:2931:5: {...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:2931:103: ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:2932:6: ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:2935:9: ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:2935:10: {...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:2935:19: (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:2935:20: otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,58,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getVolumeAccess().getNameKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:2939:9: ( (lv_volume_name_9_0= ruleEString ) )
            	    // InternalDockerCompose.g:2940:10: (lv_volume_name_9_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:2940:10: (lv_volume_name_9_0= ruleEString )
            	    // InternalDockerCompose.g:2941:11: lv_volume_name_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getVolumeAccess().getVolume_nameEStringParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_44);
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
            	    // InternalDockerCompose.g:2964:4: ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2964:4: ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) )
            	    // InternalDockerCompose.g:2965:5: {...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalDockerCompose.g:2965:103: ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) )
            	    // InternalDockerCompose.g:2966:6: ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalDockerCompose.g:2969:9: ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) )
            	    // InternalDockerCompose.g:2969:10: {...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:2969:19: (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ )
            	    // InternalDockerCompose.g:2969:20: otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+
            	    {
            	    otherlv_10=(Token)match(input,59,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getVolumeAccess().getLabelsKeyword_3_3_0());
            	    								
            	    // InternalDockerCompose.g:2973:9: ( (lv_labels_11_0= ruleVolumeLabel ) )+
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

            	                    if ( (LA39_5==EOF||LA39_5==RULE_ID||LA39_5==RULE_STRING||(LA39_5>=15 && LA39_5<=20)||LA39_5==53||(LA39_5>=57 && LA39_5<=60)) ) {
            	                        alt39=1;
            	                    }


            	                }
            	                else if ( (LA39_4==RULE_ID) ) {
            	                    int LA39_6 = input.LA(4);

            	                    if ( (LA39_6==EOF||LA39_6==RULE_ID||LA39_6==RULE_STRING||(LA39_6>=15 && LA39_6<=20)||LA39_6==53||(LA39_6>=57 && LA39_6<=60)) ) {
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

            	                    if ( (LA39_5==EOF||LA39_5==RULE_ID||LA39_5==RULE_STRING||(LA39_5>=15 && LA39_5<=20)||LA39_5==53||(LA39_5>=57 && LA39_5<=60)) ) {
            	                        alt39=1;
            	                    }


            	                }
            	                else if ( (LA39_4==RULE_ID) ) {
            	                    int LA39_6 = input.LA(4);

            	                    if ( (LA39_6==EOF||LA39_6==RULE_ID||LA39_6==RULE_STRING||(LA39_6>=15 && LA39_6<=20)||LA39_6==53||(LA39_6>=57 && LA39_6<=60)) ) {
            	                        alt39=1;
            	                    }


            	                }


            	            }


            	        }


            	        switch (alt39) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:2974:10: (lv_labels_11_0= ruleVolumeLabel )
            	    	    {
            	    	    // InternalDockerCompose.g:2974:10: (lv_labels_11_0= ruleVolumeLabel )
            	    	    // InternalDockerCompose.g:2975:11: lv_labels_11_0= ruleVolumeLabel
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getVolumeAccess().getLabelsVolumeLabelParserRuleCall_3_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_45);
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
            	    	    if ( cnt39 >= 1 ) break loop39;
            	                EarlyExitException eee =
            	                    new EarlyExitException(39, input);
            	                throw eee;
            	        }
            	        cnt39++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDockerCompose.g:2998:4: ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2998:4: ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) )
            	    // InternalDockerCompose.g:2999:5: {...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalDockerCompose.g:2999:103: ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) )
            	    // InternalDockerCompose.g:3000:6: ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalDockerCompose.g:3003:9: ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) )
            	    // InternalDockerCompose.g:3003:10: {...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:3003:19: (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ )
            	    // InternalDockerCompose.g:3003:20: otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+
            	    {
            	    otherlv_12=(Token)match(input,60,FOLLOW_5); 

            	    									newLeafNode(otherlv_12, grammarAccess.getVolumeAccess().getDriver_optsKeyword_3_4_0());
            	    								
            	    // InternalDockerCompose.g:3007:9: ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+
            	    int cnt40=0;
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==RULE_STRING) ) {
            	            int LA40_2 = input.LA(2);

            	            if ( (LA40_2==21) ) {
            	                int LA40_4 = input.LA(3);

            	                if ( (LA40_4==RULE_STRING) ) {
            	                    int LA40_5 = input.LA(4);

            	                    if ( (LA40_5==EOF||LA40_5==RULE_ID||LA40_5==RULE_STRING||(LA40_5>=15 && LA40_5<=20)||LA40_5==53||(LA40_5>=57 && LA40_5<=60)) ) {
            	                        alt40=1;
            	                    }


            	                }
            	                else if ( (LA40_4==RULE_ID) ) {
            	                    int LA40_6 = input.LA(4);

            	                    if ( (LA40_6==EOF||LA40_6==RULE_ID||LA40_6==RULE_STRING||(LA40_6>=15 && LA40_6<=20)||LA40_6==53||(LA40_6>=57 && LA40_6<=60)) ) {
            	                        alt40=1;
            	                    }


            	                }


            	            }


            	        }
            	        else if ( (LA40_0==RULE_ID) ) {
            	            int LA40_3 = input.LA(2);

            	            if ( (LA40_3==21) ) {
            	                int LA40_4 = input.LA(3);

            	                if ( (LA40_4==RULE_STRING) ) {
            	                    int LA40_5 = input.LA(4);

            	                    if ( (LA40_5==EOF||LA40_5==RULE_ID||LA40_5==RULE_STRING||(LA40_5>=15 && LA40_5<=20)||LA40_5==53||(LA40_5>=57 && LA40_5<=60)) ) {
            	                        alt40=1;
            	                    }


            	                }
            	                else if ( (LA40_4==RULE_ID) ) {
            	                    int LA40_6 = input.LA(4);

            	                    if ( (LA40_6==EOF||LA40_6==RULE_ID||LA40_6==RULE_STRING||(LA40_6>=15 && LA40_6<=20)||LA40_6==53||(LA40_6>=57 && LA40_6<=60)) ) {
            	                        alt40=1;
            	                    }


            	                }


            	            }


            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:3008:10: (lv_driver_opts_13_0= ruleVolumeDriverOpt )
            	    	    {
            	    	    // InternalDockerCompose.g:3008:10: (lv_driver_opts_13_0= ruleVolumeDriverOpt )
            	    	    // InternalDockerCompose.g:3009:11: lv_driver_opts_13_0= ruleVolumeDriverOpt
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getVolumeAccess().getDriver_optsVolumeDriverOptParserRuleCall_3_4_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_45);
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
            	    	    if ( cnt40 >= 1 ) break loop40;
            	                EarlyExitException eee =
            	                    new EarlyExitException(40, input);
            	                throw eee;
            	        }
            	        cnt40++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeAccess().getUnorderedGroup_3());
            	    					

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
    // InternalDockerCompose.g:3043:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalDockerCompose.g:3043:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalDockerCompose.g:3044:2: iv_ruleConfig= ruleConfig EOF
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
    // InternalDockerCompose.g:3050:1: ruleConfig returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) ) ) ;
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
            // InternalDockerCompose.g:3056:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:3057:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:3057:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:3058:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:3058:3: ()
            // InternalDockerCompose.g:3059:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigAccess().getConfigAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3065:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3066:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3066:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3067:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,21,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:3088:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:3089:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:3089:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalDockerCompose.g:3090:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getConfigAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:3093:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* )
            // InternalDockerCompose.g:3094:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalDockerCompose.g:3094:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )*
            loop42:
            do {
                int alt42=4;
                int LA42_0 = input.LA(1);

                if ( LA42_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 0) ) {
                    alt42=1;
                }
                else if ( LA42_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 1) ) {
                    alt42=2;
                }
                else if ( LA42_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 2) ) {
                    alt42=3;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalDockerCompose.g:3095:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3095:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:3096:5: {...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDockerCompose.g:3096:103: ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:3097:6: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDockerCompose.g:3100:9: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:3100:10: {...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    }
            	    // InternalDockerCompose.g:3100:19: (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:3100:20: otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) )
            	    {
            	    otherlv_4=(Token)match(input,57,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getConfigAccess().getExternalKeyword_3_0_0());
            	    								
            	    // InternalDockerCompose.g:3104:9: ( (lv_external_5_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:3105:10: (lv_external_5_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:3105:10: (lv_external_5_0= ruleEBoolean )
            	    // InternalDockerCompose.g:3106:11: lv_external_5_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getConfigAccess().getExternalEBooleanParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_46);
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
            	    // InternalDockerCompose.g:3129:4: ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3129:4: ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3130:5: {...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDockerCompose.g:3130:103: ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3131:6: ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDockerCompose.g:3134:9: ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3134:10: {...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    }
            	    // InternalDockerCompose.g:3134:19: (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3134:20: otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,62,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getConfigAccess().getFileKeyword_3_1_0());
            	    								
            	    // InternalDockerCompose.g:3138:9: ( (lv_file_7_0= ruleEString ) )
            	    // InternalDockerCompose.g:3139:10: (lv_file_7_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3139:10: (lv_file_7_0= ruleEString )
            	    // InternalDockerCompose.g:3140:11: lv_file_7_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getConfigAccess().getFileEStringParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_46);
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
            	    // InternalDockerCompose.g:3163:4: ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3163:4: ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3164:5: {...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:3164:103: ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3165:6: ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:3168:9: ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3168:10: {...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    }
            	    // InternalDockerCompose.g:3168:19: (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3168:20: otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,58,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getConfigAccess().getNameKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:3172:9: ( (lv_config_name_9_0= ruleEString ) )
            	    // InternalDockerCompose.g:3173:10: (lv_config_name_9_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3173:10: (lv_config_name_9_0= ruleEString )
            	    // InternalDockerCompose.g:3174:11: lv_config_name_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getConfigAccess().getConfig_nameEStringParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_46);
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
            	    break loop42;
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
    // InternalDockerCompose.g:3208:1: entryRuleSecret returns [EObject current=null] : iv_ruleSecret= ruleSecret EOF ;
    public final EObject entryRuleSecret() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecret = null;


        try {
            // InternalDockerCompose.g:3208:47: (iv_ruleSecret= ruleSecret EOF )
            // InternalDockerCompose.g:3209:2: iv_ruleSecret= ruleSecret EOF
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
    // InternalDockerCompose.g:3215:1: ruleSecret returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) ) ;
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
            // InternalDockerCompose.g:3221:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:3222:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:3222:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:3223:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:3223:3: ()
            // InternalDockerCompose.g:3224:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecretAccess().getSecretAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3230:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3231:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3231:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3232:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,21,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getSecretAccess().getColonKeyword_2());
            		
            // InternalDockerCompose.g:3253:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:3254:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:3254:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalDockerCompose.g:3255:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSecretAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:3258:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* )
            // InternalDockerCompose.g:3259:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalDockerCompose.g:3259:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )*
            loop43:
            do {
                int alt43=5;
                int LA43_0 = input.LA(1);

                if ( LA43_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 0) ) {
                    alt43=1;
                }
                else if ( LA43_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 1) ) {
                    alt43=2;
                }
                else if ( LA43_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 2) ) {
                    alt43=3;
                }
                else if ( LA43_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 3) ) {
                    alt43=4;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalDockerCompose.g:3260:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3260:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:3261:5: {...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDockerCompose.g:3261:103: ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:3262:6: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDockerCompose.g:3265:9: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:3265:10: {...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "true");
            	    }
            	    // InternalDockerCompose.g:3265:19: (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:3265:20: otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) )
            	    {
            	    otherlv_4=(Token)match(input,57,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getSecretAccess().getExternalKeyword_3_0_0());
            	    								
            	    // InternalDockerCompose.g:3269:9: ( (lv_external_5_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:3270:10: (lv_external_5_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:3270:10: (lv_external_5_0= ruleEBoolean )
            	    // InternalDockerCompose.g:3271:11: lv_external_5_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getSecretAccess().getExternalEBooleanParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_47);
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
            	    // InternalDockerCompose.g:3294:4: ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3294:4: ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3295:5: {...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDockerCompose.g:3295:103: ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3296:6: ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDockerCompose.g:3299:9: ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3299:10: {...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "true");
            	    }
            	    // InternalDockerCompose.g:3299:19: (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3299:20: otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,62,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getSecretAccess().getFileKeyword_3_1_0());
            	    								
            	    // InternalDockerCompose.g:3303:9: ( (lv_file_7_0= ruleEString ) )
            	    // InternalDockerCompose.g:3304:10: (lv_file_7_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3304:10: (lv_file_7_0= ruleEString )
            	    // InternalDockerCompose.g:3305:11: lv_file_7_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getSecretAccess().getFileEStringParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_47);
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
            	    // InternalDockerCompose.g:3328:4: ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3328:4: ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3329:5: {...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:3329:103: ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3330:6: ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:3333:9: ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3333:10: {...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "true");
            	    }
            	    // InternalDockerCompose.g:3333:19: (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3333:20: otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,63,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getSecretAccess().getEnvironmentKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:3337:9: ( (lv_environment_9_0= ruleEString ) )
            	    // InternalDockerCompose.g:3338:10: (lv_environment_9_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3338:10: (lv_environment_9_0= ruleEString )
            	    // InternalDockerCompose.g:3339:11: lv_environment_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getSecretAccess().getEnvironmentEStringParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_47);
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
            	    // InternalDockerCompose.g:3362:4: ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3362:4: ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3363:5: {...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalDockerCompose.g:3363:103: ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3364:6: ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalDockerCompose.g:3367:9: ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3367:10: {...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "true");
            	    }
            	    // InternalDockerCompose.g:3367:19: (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3367:20: otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,58,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getSecretAccess().getNameKeyword_3_3_0());
            	    								
            	    // InternalDockerCompose.g:3371:9: ( (lv_secret_name_11_0= ruleEString ) )
            	    // InternalDockerCompose.g:3372:10: (lv_secret_name_11_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3372:10: (lv_secret_name_11_0= ruleEString )
            	    // InternalDockerCompose.g:3373:11: lv_secret_name_11_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getSecretAccess().getSecret_nameEStringParserRuleCall_3_3_1_0());
            	    										
            	    pushFollow(FOLLOW_47);
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
            	    break loop43;
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
    // InternalDockerCompose.g:3407:1: entryRuleVolumeLabel returns [EObject current=null] : iv_ruleVolumeLabel= ruleVolumeLabel EOF ;
    public final EObject entryRuleVolumeLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumeLabel = null;


        try {
            // InternalDockerCompose.g:3407:52: (iv_ruleVolumeLabel= ruleVolumeLabel EOF )
            // InternalDockerCompose.g:3408:2: iv_ruleVolumeLabel= ruleVolumeLabel EOF
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
    // InternalDockerCompose.g:3414:1: ruleVolumeLabel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleVolumeLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3420:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:3421:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:3421:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:3422:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:3422:3: ()
            // InternalDockerCompose.g:3423:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeLabelAccess().getVolumeLabelAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3429:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3430:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3430:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3431:5: lv_name_1_0= ruleEString
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
            		
            // InternalDockerCompose.g:3452:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:3453:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:3453:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:3454:5: lv_value_3_0= ruleEString
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
    // InternalDockerCompose.g:3475:1: entryRuleVolumeDriverOpt returns [EObject current=null] : iv_ruleVolumeDriverOpt= ruleVolumeDriverOpt EOF ;
    public final EObject entryRuleVolumeDriverOpt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumeDriverOpt = null;


        try {
            // InternalDockerCompose.g:3475:56: (iv_ruleVolumeDriverOpt= ruleVolumeDriverOpt EOF )
            // InternalDockerCompose.g:3476:2: iv_ruleVolumeDriverOpt= ruleVolumeDriverOpt EOF
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
    // InternalDockerCompose.g:3482:1: ruleVolumeDriverOpt returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleVolumeDriverOpt() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3488:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:3489:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:3489:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:3490:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:3490:3: ()
            // InternalDockerCompose.g:3491:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeDriverOptAccess().getVolumeDriverOptAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3497:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3498:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3498:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3499:5: lv_name_1_0= ruleEString
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
            		
            // InternalDockerCompose.g:3520:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:3521:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:3521:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:3522:5: lv_value_3_0= ruleEString
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
    // InternalDockerCompose.g:3543:1: entryRuleNetworkLabel returns [EObject current=null] : iv_ruleNetworkLabel= ruleNetworkLabel EOF ;
    public final EObject entryRuleNetworkLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkLabel = null;


        try {
            // InternalDockerCompose.g:3543:53: (iv_ruleNetworkLabel= ruleNetworkLabel EOF )
            // InternalDockerCompose.g:3544:2: iv_ruleNetworkLabel= ruleNetworkLabel EOF
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
    // InternalDockerCompose.g:3550:1: ruleNetworkLabel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleNetworkLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3556:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:3557:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:3557:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:3558:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:3558:3: ()
            // InternalDockerCompose.g:3559:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkLabelAccess().getNetworkLabelAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3565:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3566:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3566:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3567:5: lv_name_1_0= ruleEString
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
            		
            // InternalDockerCompose.g:3588:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:3589:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:3589:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:3590:5: lv_value_3_0= ruleEString
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
    // InternalDockerCompose.g:3611:1: entryRuleNetworkDriverOpt returns [EObject current=null] : iv_ruleNetworkDriverOpt= ruleNetworkDriverOpt EOF ;
    public final EObject entryRuleNetworkDriverOpt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkDriverOpt = null;


        try {
            // InternalDockerCompose.g:3611:57: (iv_ruleNetworkDriverOpt= ruleNetworkDriverOpt EOF )
            // InternalDockerCompose.g:3612:2: iv_ruleNetworkDriverOpt= ruleNetworkDriverOpt EOF
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
    // InternalDockerCompose.g:3618:1: ruleNetworkDriverOpt returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleNetworkDriverOpt() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3624:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:3625:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:3625:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:3626:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:3626:3: ()
            // InternalDockerCompose.g:3627:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkDriverOptAccess().getNetworkDriverOptAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3633:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3634:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3634:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3635:5: lv_name_1_0= ruleEString
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
            		
            // InternalDockerCompose.g:3656:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:3657:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:3657:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:3658:5: lv_value_3_0= ruleEString
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
    // InternalDockerCompose.g:3679:1: entryRuleIPAM returns [EObject current=null] : iv_ruleIPAM= ruleIPAM EOF ;
    public final EObject entryRuleIPAM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAM = null;


        try {
            // InternalDockerCompose.g:3679:45: (iv_ruleIPAM= ruleIPAM EOF )
            // InternalDockerCompose.g:3680:2: iv_ruleIPAM= ruleIPAM EOF
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
    // InternalDockerCompose.g:3686:1: ruleIPAM returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) ) ) ;
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
            // InternalDockerCompose.g:3692:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:3693:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:3693:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:3694:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:3694:3: ()
            // InternalDockerCompose.g:3695:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIPAMAccess().getIPAMAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3701:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:3702:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:3702:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) )
            // InternalDockerCompose.g:3703:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIPAMAccess().getUnorderedGroup_1());
            				
            // InternalDockerCompose.g:3706:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* )
            // InternalDockerCompose.g:3707:6: ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )*
            {
            // InternalDockerCompose.g:3707:6: ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )*
            loop46:
            do {
                int alt46=4;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==53) ) {
                    int LA46_2 = input.LA(2);

                    if ( (LA46_2==RULE_STRING) ) {
                        int LA46_5 = input.LA(3);

                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {
                            alt46=1;
                        }


                    }
                    else if ( (LA46_2==RULE_ID) ) {
                        int LA46_6 = input.LA(3);

                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {
                            alt46=1;
                        }


                    }


                }
                else if ( LA46_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 1) ) {
                    alt46=2;
                }
                else if ( LA46_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 2) ) {
                    alt46=3;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalDockerCompose.g:3708:4: ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3708:4: ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3709:5: {...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalDockerCompose.g:3709:101: ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3710:6: ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalDockerCompose.g:3713:9: ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3713:10: {...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "true");
            	    }
            	    // InternalDockerCompose.g:3713:19: (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3713:20: otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,53,FOLLOW_5); 

            	    									newLeafNode(otherlv_2, grammarAccess.getIPAMAccess().getDriverKeyword_1_0_0());
            	    								
            	    // InternalDockerCompose.g:3717:9: ( (lv_driver_3_0= ruleEString ) )
            	    // InternalDockerCompose.g:3718:10: (lv_driver_3_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3718:10: (lv_driver_3_0= ruleEString )
            	    // InternalDockerCompose.g:3719:11: lv_driver_3_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getIPAMAccess().getDriverEStringParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_48);
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
            	    // InternalDockerCompose.g:3742:4: ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3742:4: ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:3743:5: {...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalDockerCompose.g:3743:101: ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) )
            	    // InternalDockerCompose.g:3744:6: ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalDockerCompose.g:3747:9: ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) )
            	    // InternalDockerCompose.g:3747:10: {...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "true");
            	    }
            	    // InternalDockerCompose.g:3747:19: (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ )
            	    // InternalDockerCompose.g:3747:20: otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+
            	    {
            	    otherlv_4=(Token)match(input,64,FOLLOW_14); 

            	    									newLeafNode(otherlv_4, grammarAccess.getIPAMAccess().getConfigKeyword_1_1_0());
            	    								
            	    // InternalDockerCompose.g:3751:9: (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+
            	    int cnt44=0;
            	    loop44:
            	    do {
            	        int alt44=2;
            	        int LA44_0 = input.LA(1);

            	        if ( (LA44_0==31) ) {
            	            alt44=1;
            	        }


            	        switch (alt44) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:3752:10: otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,31,FOLLOW_49); 

            	    	    										newLeafNode(otherlv_5, grammarAccess.getIPAMAccess().getHyphenMinusKeyword_1_1_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:3756:10: ( (lv_configs_6_0= ruleIPAMConfig ) )
            	    	    // InternalDockerCompose.g:3757:11: (lv_configs_6_0= ruleIPAMConfig )
            	    	    {
            	    	    // InternalDockerCompose.g:3757:11: (lv_configs_6_0= ruleIPAMConfig )
            	    	    // InternalDockerCompose.g:3758:12: lv_configs_6_0= ruleIPAMConfig
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getIPAMAccess().getConfigsIPAMConfigParserRuleCall_1_1_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_50);
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
            	    	    if ( cnt44 >= 1 ) break loop44;
            	                EarlyExitException eee =
            	                    new EarlyExitException(44, input);
            	                throw eee;
            	        }
            	        cnt44++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIPAMAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDockerCompose.g:3782:4: ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3782:4: ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) )
            	    // InternalDockerCompose.g:3783:5: {...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalDockerCompose.g:3783:101: ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) )
            	    // InternalDockerCompose.g:3784:6: ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalDockerCompose.g:3787:9: ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) )
            	    // InternalDockerCompose.g:3787:10: {...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "true");
            	    }
            	    // InternalDockerCompose.g:3787:19: (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ )
            	    // InternalDockerCompose.g:3787:20: otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+
            	    {
            	    otherlv_7=(Token)match(input,65,FOLLOW_5); 

            	    									newLeafNode(otherlv_7, grammarAccess.getIPAMAccess().getOptionsKeyword_1_2_0());
            	    								
            	    // InternalDockerCompose.g:3791:9: ( (lv_options_8_0= ruleIPAMOption ) )+
            	    int cnt45=0;
            	    loop45:
            	    do {
            	        int alt45=2;
            	        int LA45_0 = input.LA(1);

            	        if ( (LA45_0==RULE_STRING) ) {
            	            int LA45_2 = input.LA(2);

            	            if ( (LA45_2==21) ) {
            	                int LA45_4 = input.LA(3);

            	                if ( (LA45_4==RULE_STRING) ) {
            	                    int LA45_5 = input.LA(4);

            	                    if ( (LA45_5==EOF||LA45_5==RULE_ID||LA45_5==RULE_STRING||(LA45_5>=15 && LA45_5<=20)||(LA45_5>=53 && LA45_5<=61)||(LA45_5>=64 && LA45_5<=65)) ) {
            	                        alt45=1;
            	                    }


            	                }
            	                else if ( (LA45_4==RULE_ID) ) {
            	                    int LA45_6 = input.LA(4);

            	                    if ( (LA45_6==EOF||LA45_6==RULE_ID||LA45_6==RULE_STRING||(LA45_6>=15 && LA45_6<=20)||(LA45_6>=53 && LA45_6<=61)||(LA45_6>=64 && LA45_6<=65)) ) {
            	                        alt45=1;
            	                    }


            	                }


            	            }


            	        }
            	        else if ( (LA45_0==RULE_ID) ) {
            	            int LA45_3 = input.LA(2);

            	            if ( (LA45_3==21) ) {
            	                int LA45_4 = input.LA(3);

            	                if ( (LA45_4==RULE_STRING) ) {
            	                    int LA45_5 = input.LA(4);

            	                    if ( (LA45_5==EOF||LA45_5==RULE_ID||LA45_5==RULE_STRING||(LA45_5>=15 && LA45_5<=20)||(LA45_5>=53 && LA45_5<=61)||(LA45_5>=64 && LA45_5<=65)) ) {
            	                        alt45=1;
            	                    }


            	                }
            	                else if ( (LA45_4==RULE_ID) ) {
            	                    int LA45_6 = input.LA(4);

            	                    if ( (LA45_6==EOF||LA45_6==RULE_ID||LA45_6==RULE_STRING||(LA45_6>=15 && LA45_6<=20)||(LA45_6>=53 && LA45_6<=61)||(LA45_6>=64 && LA45_6<=65)) ) {
            	                        alt45=1;
            	                    }


            	                }


            	            }


            	        }


            	        switch (alt45) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:3792:10: (lv_options_8_0= ruleIPAMOption )
            	    	    {
            	    	    // InternalDockerCompose.g:3792:10: (lv_options_8_0= ruleIPAMOption )
            	    	    // InternalDockerCompose.g:3793:11: lv_options_8_0= ruleIPAMOption
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getIPAMAccess().getOptionsIPAMOptionParserRuleCall_1_2_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_51);
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
            	    	    if ( cnt45 >= 1 ) break loop45;
            	                EarlyExitException eee =
            	                    new EarlyExitException(45, input);
            	                throw eee;
            	        }
            	        cnt45++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIPAMAccess().getUnorderedGroup_1());
            	    					

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
    // InternalDockerCompose.g:3827:1: entryRuleIPAMConfig returns [EObject current=null] : iv_ruleIPAMConfig= ruleIPAMConfig EOF ;
    public final EObject entryRuleIPAMConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAMConfig = null;


        try {
            // InternalDockerCompose.g:3827:51: (iv_ruleIPAMConfig= ruleIPAMConfig EOF )
            // InternalDockerCompose.g:3828:2: iv_ruleIPAMConfig= ruleIPAMConfig EOF
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
    // InternalDockerCompose.g:3834:1: ruleIPAMConfig returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) ) ) ;
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
            // InternalDockerCompose.g:3840:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:3841:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:3841:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:3842:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:3842:3: ()
            // InternalDockerCompose.g:3843:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIPAMConfigAccess().getIPAMConfigAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3849:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:3850:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:3850:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) )
            // InternalDockerCompose.g:3851:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1());
            				
            // InternalDockerCompose.g:3854:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* )
            // InternalDockerCompose.g:3855:6: ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )*
            {
            // InternalDockerCompose.g:3855:6: ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )*
            loop48:
            do {
                int alt48=5;
                int LA48_0 = input.LA(1);

                if ( LA48_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 0) ) {
                    alt48=1;
                }
                else if ( LA48_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 1) ) {
                    alt48=2;
                }
                else if ( LA48_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 2) ) {
                    alt48=3;
                }
                else if ( LA48_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 3) ) {
                    alt48=4;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalDockerCompose.g:3856:4: ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3856:4: ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) )
            	    // InternalDockerCompose.g:3857:5: {...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalDockerCompose.g:3857:107: ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) )
            	    // InternalDockerCompose.g:3858:6: ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalDockerCompose.g:3861:9: ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) )
            	    // InternalDockerCompose.g:3861:10: {...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "true");
            	    }
            	    // InternalDockerCompose.g:3861:19: (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) )
            	    // InternalDockerCompose.g:3861:20: otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) )
            	    {
            	    otherlv_2=(Token)match(input,66,FOLLOW_11); 

            	    									newLeafNode(otherlv_2, grammarAccess.getIPAMConfigAccess().getSubnetKeyword_1_0_0());
            	    								
            	    // InternalDockerCompose.g:3865:9: ( (lv_subnet_3_0= ruleNetworkAddress ) )
            	    // InternalDockerCompose.g:3866:10: (lv_subnet_3_0= ruleNetworkAddress )
            	    {
            	    // InternalDockerCompose.g:3866:10: (lv_subnet_3_0= ruleNetworkAddress )
            	    // InternalDockerCompose.g:3867:11: lv_subnet_3_0= ruleNetworkAddress
            	    {

            	    											newCompositeNode(grammarAccess.getIPAMConfigAccess().getSubnetNetworkAddressParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_52);
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
            	    // InternalDockerCompose.g:3890:4: ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3890:4: ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) )
            	    // InternalDockerCompose.g:3891:5: {...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalDockerCompose.g:3891:107: ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) )
            	    // InternalDockerCompose.g:3892:6: ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalDockerCompose.g:3895:9: ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) )
            	    // InternalDockerCompose.g:3895:10: {...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "true");
            	    }
            	    // InternalDockerCompose.g:3895:19: (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) )
            	    // InternalDockerCompose.g:3895:20: otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) )
            	    {
            	    otherlv_4=(Token)match(input,67,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getIPAMConfigAccess().getIp_rangeKeyword_1_1_0());
            	    								
            	    // InternalDockerCompose.g:3899:9: ( (lv_ip_range_5_0= ruleNetworkAddress ) )
            	    // InternalDockerCompose.g:3900:10: (lv_ip_range_5_0= ruleNetworkAddress )
            	    {
            	    // InternalDockerCompose.g:3900:10: (lv_ip_range_5_0= ruleNetworkAddress )
            	    // InternalDockerCompose.g:3901:11: lv_ip_range_5_0= ruleNetworkAddress
            	    {

            	    											newCompositeNode(grammarAccess.getIPAMConfigAccess().getIp_rangeNetworkAddressParserRuleCall_1_1_1_0());
            	    										
            	    pushFollow(FOLLOW_52);
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
            	    // InternalDockerCompose.g:3924:4: ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3924:4: ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) )
            	    // InternalDockerCompose.g:3925:5: {...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalDockerCompose.g:3925:107: ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) )
            	    // InternalDockerCompose.g:3926:6: ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalDockerCompose.g:3929:9: ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) )
            	    // InternalDockerCompose.g:3929:10: {...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "true");
            	    }
            	    // InternalDockerCompose.g:3929:19: (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) )
            	    // InternalDockerCompose.g:3929:20: otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) )
            	    {
            	    otherlv_6=(Token)match(input,68,FOLLOW_21); 

            	    									newLeafNode(otherlv_6, grammarAccess.getIPAMConfigAccess().getGatewayKeyword_1_2_0());
            	    								
            	    // InternalDockerCompose.g:3933:9: ( (lv_gateway_7_0= ruleDNS ) )
            	    // InternalDockerCompose.g:3934:10: (lv_gateway_7_0= ruleDNS )
            	    {
            	    // InternalDockerCompose.g:3934:10: (lv_gateway_7_0= ruleDNS )
            	    // InternalDockerCompose.g:3935:11: lv_gateway_7_0= ruleDNS
            	    {

            	    											newCompositeNode(grammarAccess.getIPAMConfigAccess().getGatewayDNSParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_52);
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
            	    // InternalDockerCompose.g:3958:4: ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3958:4: ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) )
            	    // InternalDockerCompose.g:3959:5: {...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalDockerCompose.g:3959:107: ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) )
            	    // InternalDockerCompose.g:3960:6: ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalDockerCompose.g:3963:9: ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) )
            	    // InternalDockerCompose.g:3963:10: {...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "true");
            	    }
            	    // InternalDockerCompose.g:3963:19: (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ )
            	    // InternalDockerCompose.g:3963:20: otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+
            	    {
            	    otherlv_8=(Token)match(input,69,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getIPAMConfigAccess().getAux_addressesKeyword_1_3_0());
            	    								
            	    // InternalDockerCompose.g:3967:9: ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+
            	    int cnt47=0;
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==RULE_STRING) ) {
            	            int LA47_2 = input.LA(2);

            	            if ( (LA47_2==21) ) {
            	                int LA47_4 = input.LA(3);

            	                if ( (LA47_4==RULE_INT) ) {
            	                    alt47=1;
            	                }


            	            }


            	        }
            	        else if ( (LA47_0==RULE_ID) ) {
            	            int LA47_3 = input.LA(2);

            	            if ( (LA47_3==21) ) {
            	                int LA47_4 = input.LA(3);

            	                if ( (LA47_4==RULE_INT) ) {
            	                    alt47=1;
            	                }


            	            }


            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:3968:10: (lv_aux_addresses_9_0= ruleIPAMAddress )
            	    	    {
            	    	    // InternalDockerCompose.g:3968:10: (lv_aux_addresses_9_0= ruleIPAMAddress )
            	    	    // InternalDockerCompose.g:3969:11: lv_aux_addresses_9_0= ruleIPAMAddress
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getIPAMConfigAccess().getAux_addressesIPAMAddressParserRuleCall_1_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_53);
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
            	    	    if ( cnt47 >= 1 ) break loop47;
            	                EarlyExitException eee =
            	                    new EarlyExitException(47, input);
            	                throw eee;
            	        }
            	        cnt47++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalDockerCompose.g:4003:1: entryRuleIPAMOption returns [EObject current=null] : iv_ruleIPAMOption= ruleIPAMOption EOF ;
    public final EObject entryRuleIPAMOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAMOption = null;


        try {
            // InternalDockerCompose.g:4003:51: (iv_ruleIPAMOption= ruleIPAMOption EOF )
            // InternalDockerCompose.g:4004:2: iv_ruleIPAMOption= ruleIPAMOption EOF
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
    // InternalDockerCompose.g:4010:1: ruleIPAMOption returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleIPAMOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:4016:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:4017:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:4017:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:4018:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:4018:3: ()
            // InternalDockerCompose.g:4019:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIPAMOptionAccess().getIPAMOptionAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:4025:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:4026:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:4026:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:4027:5: lv_name_1_0= ruleEString
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
            		
            // InternalDockerCompose.g:4048:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:4049:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:4049:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:4050:5: lv_value_3_0= ruleEString
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
    // InternalDockerCompose.g:4071:1: entryRuleIPAMAddress returns [EObject current=null] : iv_ruleIPAMAddress= ruleIPAMAddress EOF ;
    public final EObject entryRuleIPAMAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAMAddress = null;


        try {
            // InternalDockerCompose.g:4071:52: (iv_ruleIPAMAddress= ruleIPAMAddress EOF )
            // InternalDockerCompose.g:4072:2: iv_ruleIPAMAddress= ruleIPAMAddress EOF
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
    // InternalDockerCompose.g:4078:1: ruleIPAMAddress returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) ) ) ;
    public final EObject ruleIPAMAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_dns_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:4084:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) ) ) )
            // InternalDockerCompose.g:4085:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) ) )
            {
            // InternalDockerCompose.g:4085:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) ) )
            // InternalDockerCompose.g:4086:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) )
            {
            // InternalDockerCompose.g:4086:3: ()
            // InternalDockerCompose.g:4087:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIPAMAddressAccess().getIPAMAddressAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:4093:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:4094:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:4094:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:4095:5: lv_name_1_0= ruleEString
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
            		
            // InternalDockerCompose.g:4116:3: ( (lv_dns_3_0= ruleDNS ) )
            // InternalDockerCompose.g:4117:4: (lv_dns_3_0= ruleDNS )
            {
            // InternalDockerCompose.g:4117:4: (lv_dns_3_0= ruleDNS )
            // InternalDockerCompose.g:4118:5: lv_dns_3_0= ruleDNS
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
    // InternalDockerCompose.g:4139:1: entryRulePATH returns [String current=null] : iv_rulePATH= rulePATH EOF ;
    public final String entryRulePATH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePATH = null;


        try {
            // InternalDockerCompose.g:4139:44: (iv_rulePATH= rulePATH EOF )
            // InternalDockerCompose.g:4140:2: iv_rulePATH= rulePATH EOF
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
    // InternalDockerCompose.g:4146:1: rulePATH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' )? (kw= '/' )? (this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken rulePATH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4152:2: ( ( (kw= '.' )? (kw= '/' )? (this_ID_2= RULE_ID )* ) )
            // InternalDockerCompose.g:4153:2: ( (kw= '.' )? (kw= '/' )? (this_ID_2= RULE_ID )* )
            {
            // InternalDockerCompose.g:4153:2: ( (kw= '.' )? (kw= '/' )? (this_ID_2= RULE_ID )* )
            // InternalDockerCompose.g:4154:3: (kw= '.' )? (kw= '/' )? (this_ID_2= RULE_ID )*
            {
            // InternalDockerCompose.g:4154:3: (kw= '.' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==70) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDockerCompose.g:4155:4: kw= '.'
                    {
                    kw=(Token)match(input,70,FOLLOW_54); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDockerCompose.g:4161:3: (kw= '/' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==71) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDockerCompose.g:4162:4: kw= '/'
                    {
                    kw=(Token)match(input,71,FOLLOW_55); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPATHAccess().getSolidusKeyword_1());
                    			

                    }
                    break;

            }

            // InternalDockerCompose.g:4168:3: (this_ID_2= RULE_ID )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID) ) {
                    int LA51_2 = input.LA(2);

                    if ( (LA51_2==EOF||LA51_2==RULE_ID||LA51_2==RULE_STRING||(LA51_2>=15 && LA51_2<=20)||(LA51_2>=22 && LA51_2<=34)||(LA51_2>=39 && LA51_2<=42)||LA51_2==44||LA51_2==46||(LA51_2>=48 && LA51_2<=50)) ) {
                        alt51=1;
                    }
                    else if ( (LA51_2==21) ) {
                        int LA51_4 = input.LA(3);

                        if ( ((LA51_4>=78 && LA51_4<=80)) ) {
                            alt51=1;
                        }


                    }


                }


                switch (alt51) {
            	case 1 :
            	    // InternalDockerCompose.g:4169:4: this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_55); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getPATHAccess().getIDTerminalRuleCall_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalDockerCompose.g:4181:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDockerCompose.g:4181:47: (iv_ruleEString= ruleEString EOF )
            // InternalDockerCompose.g:4182:2: iv_ruleEString= ruleEString EOF
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
    // InternalDockerCompose.g:4188:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4194:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDockerCompose.g:4195:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDockerCompose.g:4195:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_STRING) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_ID) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalDockerCompose.g:4196:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4204:3: this_ID_1= RULE_ID
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
    // InternalDockerCompose.g:4215:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDockerCompose.g:4215:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDockerCompose.g:4216:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalDockerCompose.g:4222:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4228:2: (this_INT_0= RULE_INT )
            // InternalDockerCompose.g:4229:2: this_INT_0= RULE_INT
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
    // InternalDockerCompose.g:4239:1: entryRuleDNS returns [EObject current=null] : iv_ruleDNS= ruleDNS EOF ;
    public final EObject entryRuleDNS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNS = null;


        try {
            // InternalDockerCompose.g:4239:44: (iv_ruleDNS= ruleDNS EOF )
            // InternalDockerCompose.g:4240:2: iv_ruleDNS= ruleDNS EOF
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
    // InternalDockerCompose.g:4246:1: ruleDNS returns [EObject current=null] : ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) ) ;
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
            // InternalDockerCompose.g:4252:2: ( ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) ) )
            // InternalDockerCompose.g:4253:2: ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) )
            {
            // InternalDockerCompose.g:4253:2: ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) )
            // InternalDockerCompose.g:4254:3: ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) )
            {
            // InternalDockerCompose.g:4254:3: ( (lv_dns1_0_0= ruleEInt ) )
            // InternalDockerCompose.g:4255:4: (lv_dns1_0_0= ruleEInt )
            {
            // InternalDockerCompose.g:4255:4: (lv_dns1_0_0= ruleEInt )
            // InternalDockerCompose.g:4256:5: lv_dns1_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDNSAccess().getDns1EIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_56);
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

            otherlv_1=(Token)match(input,70,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDNSAccess().getFullStopKeyword_1());
            		
            // InternalDockerCompose.g:4277:3: ( (lv_dns2_2_0= ruleEInt ) )
            // InternalDockerCompose.g:4278:4: (lv_dns2_2_0= ruleEInt )
            {
            // InternalDockerCompose.g:4278:4: (lv_dns2_2_0= ruleEInt )
            // InternalDockerCompose.g:4279:5: lv_dns2_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDNSAccess().getDns2EIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_56);
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

            otherlv_3=(Token)match(input,70,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getDNSAccess().getFullStopKeyword_3());
            		
            // InternalDockerCompose.g:4300:3: ( (lv_dns3_4_0= ruleEInt ) )
            // InternalDockerCompose.g:4301:4: (lv_dns3_4_0= ruleEInt )
            {
            // InternalDockerCompose.g:4301:4: (lv_dns3_4_0= ruleEInt )
            // InternalDockerCompose.g:4302:5: lv_dns3_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDNSAccess().getDns3EIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_56);
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

            otherlv_5=(Token)match(input,70,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getDNSAccess().getFullStopKeyword_5());
            		
            // InternalDockerCompose.g:4323:3: ( (lv_dns4_6_0= ruleEInt ) )
            // InternalDockerCompose.g:4324:4: (lv_dns4_6_0= ruleEInt )
            {
            // InternalDockerCompose.g:4324:4: (lv_dns4_6_0= ruleEInt )
            // InternalDockerCompose.g:4325:5: lv_dns4_6_0= ruleEInt
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
    // InternalDockerCompose.g:4346:1: entryRuleNetworkAddress returns [EObject current=null] : iv_ruleNetworkAddress= ruleNetworkAddress EOF ;
    public final EObject entryRuleNetworkAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkAddress = null;


        try {
            // InternalDockerCompose.g:4346:55: (iv_ruleNetworkAddress= ruleNetworkAddress EOF )
            // InternalDockerCompose.g:4347:2: iv_ruleNetworkAddress= ruleNetworkAddress EOF
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
    // InternalDockerCompose.g:4353:1: ruleNetworkAddress returns [EObject current=null] : ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) ) ) ;
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
            // InternalDockerCompose.g:4359:2: ( ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) ) ) )
            // InternalDockerCompose.g:4360:2: ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) ) )
            {
            // InternalDockerCompose.g:4360:2: ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) ) )
            // InternalDockerCompose.g:4361:3: ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) )
            {
            // InternalDockerCompose.g:4361:3: ( (lv_dns1_0_0= ruleEInt ) )
            // InternalDockerCompose.g:4362:4: (lv_dns1_0_0= ruleEInt )
            {
            // InternalDockerCompose.g:4362:4: (lv_dns1_0_0= ruleEInt )
            // InternalDockerCompose.g:4363:5: lv_dns1_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNetworkAddressAccess().getDns1EIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_56);
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

            otherlv_1=(Token)match(input,70,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getNetworkAddressAccess().getFullStopKeyword_1());
            		
            // InternalDockerCompose.g:4384:3: ( (lv_dns2_2_0= ruleEInt ) )
            // InternalDockerCompose.g:4385:4: (lv_dns2_2_0= ruleEInt )
            {
            // InternalDockerCompose.g:4385:4: (lv_dns2_2_0= ruleEInt )
            // InternalDockerCompose.g:4386:5: lv_dns2_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNetworkAddressAccess().getDns2EIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_56);
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

            otherlv_3=(Token)match(input,70,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getNetworkAddressAccess().getFullStopKeyword_3());
            		
            // InternalDockerCompose.g:4407:3: ( (lv_dns3_4_0= ruleEInt ) )
            // InternalDockerCompose.g:4408:4: (lv_dns3_4_0= ruleEInt )
            {
            // InternalDockerCompose.g:4408:4: (lv_dns3_4_0= ruleEInt )
            // InternalDockerCompose.g:4409:5: lv_dns3_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNetworkAddressAccess().getDns3EIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_56);
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

            otherlv_5=(Token)match(input,70,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getNetworkAddressAccess().getFullStopKeyword_5());
            		
            // InternalDockerCompose.g:4430:3: ( (lv_dns4_6_0= ruleEInt ) )
            // InternalDockerCompose.g:4431:4: (lv_dns4_6_0= ruleEInt )
            {
            // InternalDockerCompose.g:4431:4: (lv_dns4_6_0= ruleEInt )
            // InternalDockerCompose.g:4432:5: lv_dns4_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNetworkAddressAccess().getDns4EIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_57);
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

            otherlv_7=(Token)match(input,71,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getNetworkAddressAccess().getSolidusKeyword_7());
            		
            // InternalDockerCompose.g:4453:3: ( (lv_netId_8_0= ruleEInt ) )
            // InternalDockerCompose.g:4454:4: (lv_netId_8_0= ruleEInt )
            {
            // InternalDockerCompose.g:4454:4: (lv_netId_8_0= ruleEInt )
            // InternalDockerCompose.g:4455:5: lv_netId_8_0= ruleEInt
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
    // InternalDockerCompose.g:4476:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalDockerCompose.g:4476:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalDockerCompose.g:4477:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalDockerCompose.g:4483:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4489:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalDockerCompose.g:4490:2: (kw= 'true' | kw= 'false' )
            {
            // InternalDockerCompose.g:4490:2: (kw= 'true' | kw= 'false' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==72) ) {
                alt53=1;
            }
            else if ( (LA53_0==73) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalDockerCompose.g:4491:3: kw= 'true'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4497:3: kw= 'false'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

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
    // InternalDockerCompose.g:4506:1: ruleRestartPolicy returns [Enumerator current=null] : ( (enumLiteral_0= '\"no\"' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'on-failure' ) | (enumLiteral_3= 'unless-stopped' ) ) ;
    public final Enumerator ruleRestartPolicy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4512:2: ( ( (enumLiteral_0= '\"no\"' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'on-failure' ) | (enumLiteral_3= 'unless-stopped' ) ) )
            // InternalDockerCompose.g:4513:2: ( (enumLiteral_0= '\"no\"' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'on-failure' ) | (enumLiteral_3= 'unless-stopped' ) )
            {
            // InternalDockerCompose.g:4513:2: ( (enumLiteral_0= '\"no\"' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'on-failure' ) | (enumLiteral_3= 'unless-stopped' ) )
            int alt54=4;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt54=1;
                }
                break;
            case 75:
                {
                alt54=2;
                }
                break;
            case 76:
                {
                alt54=3;
                }
                break;
            case 77:
                {
                alt54=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalDockerCompose.g:4514:3: (enumLiteral_0= '\"no\"' )
                    {
                    // InternalDockerCompose.g:4514:3: (enumLiteral_0= '\"no\"' )
                    // InternalDockerCompose.g:4515:4: enumLiteral_0= '\"no\"'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getRestartPolicyAccess().getNoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRestartPolicyAccess().getNoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4522:3: (enumLiteral_1= 'always' )
                    {
                    // InternalDockerCompose.g:4522:3: (enumLiteral_1= 'always' )
                    // InternalDockerCompose.g:4523:4: enumLiteral_1= 'always'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getRestartPolicyAccess().getAlwaysEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRestartPolicyAccess().getAlwaysEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:4530:3: (enumLiteral_2= 'on-failure' )
                    {
                    // InternalDockerCompose.g:4530:3: (enumLiteral_2= 'on-failure' )
                    // InternalDockerCompose.g:4531:4: enumLiteral_2= 'on-failure'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getRestartPolicyAccess().getOnfailureEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRestartPolicyAccess().getOnfailureEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDockerCompose.g:4538:3: (enumLiteral_3= 'unless-stopped' )
                    {
                    // InternalDockerCompose.g:4538:3: (enumLiteral_3= 'unless-stopped' )
                    // InternalDockerCompose.g:4539:4: enumLiteral_3= 'unless-stopped'
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_2); 

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
    // InternalDockerCompose.g:4549:1: ruleAccessMode returns [Enumerator current=null] : ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) | (enumLiteral_2= 'z' ) ) ;
    public final Enumerator ruleAccessMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4555:2: ( ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) | (enumLiteral_2= 'z' ) ) )
            // InternalDockerCompose.g:4556:2: ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) | (enumLiteral_2= 'z' ) )
            {
            // InternalDockerCompose.g:4556:2: ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) | (enumLiteral_2= 'z' ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt55=1;
                }
                break;
            case 79:
                {
                alt55=2;
                }
                break;
            case 80:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalDockerCompose.g:4557:3: (enumLiteral_0= 'rw' )
                    {
                    // InternalDockerCompose.g:4557:3: (enumLiteral_0= 'rw' )
                    // InternalDockerCompose.g:4558:4: enumLiteral_0= 'rw'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getAccessModeAccess().getRwEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessModeAccess().getRwEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4565:3: (enumLiteral_1= 'ro' )
                    {
                    // InternalDockerCompose.g:4565:3: (enumLiteral_1= 'ro' )
                    // InternalDockerCompose.g:4566:4: enumLiteral_1= 'ro'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getAccessModeAccess().getRoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessModeAccess().getRoEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:4573:3: (enumLiteral_2= 'z' )
                    {
                    // InternalDockerCompose.g:4573:3: (enumLiteral_2= 'z' )
                    // InternalDockerCompose.g:4574:4: enumLiteral_2= 'z'
                    {
                    enumLiteral_2=(Token)match(input,80,FOLLOW_2); 

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
    // InternalDockerCompose.g:4584:1: ruleMountType returns [Enumerator current=null] : ( (enumLiteral_0= 'volume' ) | (enumLiteral_1= 'bind' ) | (enumLiteral_2= 'tmpfs' ) | (enumLiteral_3= 'npipe' ) ) ;
    public final Enumerator ruleMountType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4590:2: ( ( (enumLiteral_0= 'volume' ) | (enumLiteral_1= 'bind' ) | (enumLiteral_2= 'tmpfs' ) | (enumLiteral_3= 'npipe' ) ) )
            // InternalDockerCompose.g:4591:2: ( (enumLiteral_0= 'volume' ) | (enumLiteral_1= 'bind' ) | (enumLiteral_2= 'tmpfs' ) | (enumLiteral_3= 'npipe' ) )
            {
            // InternalDockerCompose.g:4591:2: ( (enumLiteral_0= 'volume' ) | (enumLiteral_1= 'bind' ) | (enumLiteral_2= 'tmpfs' ) | (enumLiteral_3= 'npipe' ) )
            int alt56=4;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt56=1;
                }
                break;
            case 82:
                {
                alt56=2;
                }
                break;
            case 83:
                {
                alt56=3;
                }
                break;
            case 84:
                {
                alt56=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalDockerCompose.g:4592:3: (enumLiteral_0= 'volume' )
                    {
                    // InternalDockerCompose.g:4592:3: (enumLiteral_0= 'volume' )
                    // InternalDockerCompose.g:4593:4: enumLiteral_0= 'volume'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getMountTypeAccess().getVolumeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMountTypeAccess().getVolumeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4600:3: (enumLiteral_1= 'bind' )
                    {
                    // InternalDockerCompose.g:4600:3: (enumLiteral_1= 'bind' )
                    // InternalDockerCompose.g:4601:4: enumLiteral_1= 'bind'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getMountTypeAccess().getBindEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMountTypeAccess().getBindEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:4608:3: (enumLiteral_2= 'tmpfs' )
                    {
                    // InternalDockerCompose.g:4608:3: (enumLiteral_2= 'tmpfs' )
                    // InternalDockerCompose.g:4609:4: enumLiteral_2= 'tmpfs'
                    {
                    enumLiteral_2=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getMountTypeAccess().getTmpfsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMountTypeAccess().getTmpfsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDockerCompose.g:4616:3: (enumLiteral_3= 'npipe' )
                    {
                    // InternalDockerCompose.g:4616:3: (enumLiteral_3= 'npipe' )
                    // InternalDockerCompose.g:4617:4: enumLiteral_3= 'npipe'
                    {
                    enumLiteral_3=(Token)match(input,84,FOLLOW_2); 

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
    // InternalDockerCompose.g:4627:1: rulePropagationType returns [Enumerator current=null] : ( (enumLiteral_0= 'rprivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'rshared' ) | (enumLiteral_3= 'shared' ) | (enumLiteral_4= 'rslave' ) | (enumLiteral_5= 'slave' ) ) ;
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
            // InternalDockerCompose.g:4633:2: ( ( (enumLiteral_0= 'rprivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'rshared' ) | (enumLiteral_3= 'shared' ) | (enumLiteral_4= 'rslave' ) | (enumLiteral_5= 'slave' ) ) )
            // InternalDockerCompose.g:4634:2: ( (enumLiteral_0= 'rprivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'rshared' ) | (enumLiteral_3= 'shared' ) | (enumLiteral_4= 'rslave' ) | (enumLiteral_5= 'slave' ) )
            {
            // InternalDockerCompose.g:4634:2: ( (enumLiteral_0= 'rprivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'rshared' ) | (enumLiteral_3= 'shared' ) | (enumLiteral_4= 'rslave' ) | (enumLiteral_5= 'slave' ) )
            int alt57=6;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt57=1;
                }
                break;
            case 86:
                {
                alt57=2;
                }
                break;
            case 87:
                {
                alt57=3;
                }
                break;
            case 88:
                {
                alt57=4;
                }
                break;
            case 89:
                {
                alt57=5;
                }
                break;
            case 90:
                {
                alt57=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalDockerCompose.g:4635:3: (enumLiteral_0= 'rprivate' )
                    {
                    // InternalDockerCompose.g:4635:3: (enumLiteral_0= 'rprivate' )
                    // InternalDockerCompose.g:4636:4: enumLiteral_0= 'rprivate'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getRprivateEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPropagationTypeAccess().getRprivateEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4643:3: (enumLiteral_1= 'private' )
                    {
                    // InternalDockerCompose.g:4643:3: (enumLiteral_1= 'private' )
                    // InternalDockerCompose.g:4644:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPropagationTypeAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:4651:3: (enumLiteral_2= 'rshared' )
                    {
                    // InternalDockerCompose.g:4651:3: (enumLiteral_2= 'rshared' )
                    // InternalDockerCompose.g:4652:4: enumLiteral_2= 'rshared'
                    {
                    enumLiteral_2=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getRsharedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPropagationTypeAccess().getRsharedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDockerCompose.g:4659:3: (enumLiteral_3= 'shared' )
                    {
                    // InternalDockerCompose.g:4659:3: (enumLiteral_3= 'shared' )
                    // InternalDockerCompose.g:4660:4: enumLiteral_3= 'shared'
                    {
                    enumLiteral_3=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getSharedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPropagationTypeAccess().getSharedEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDockerCompose.g:4667:3: (enumLiteral_4= 'rslave' )
                    {
                    // InternalDockerCompose.g:4667:3: (enumLiteral_4= 'rslave' )
                    // InternalDockerCompose.g:4668:4: enumLiteral_4= 'rslave'
                    {
                    enumLiteral_4=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getRslaveEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPropagationTypeAccess().getRslaveEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDockerCompose.g:4675:3: (enumLiteral_5= 'slave' )
                    {
                    // InternalDockerCompose.g:4675:3: (enumLiteral_5= 'slave' )
                    // InternalDockerCompose.g:4676:4: enumLiteral_5= 'slave'
                    {
                    enumLiteral_5=(Token)match(input,90,FOLLOW_2); 

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

    // Delegated rules


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA37 dfa37 = new DFA37(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\1\27\uffff";
    static final String dfa_3s = "\1\7\1\uffff\4\7\13\uffff\2\25\4\uffff\1\0";
    static final String dfa_4s = "\1\42\1\uffff\4\37\13\uffff\2\25\4\uffff\1\0";
    static final String dfa_5s = "\1\uffff\1\20\4\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\15\1\16\1\17\2\uffff\1\11\1\12\1\13\1\14\1\uffff";
    static final String dfa_6s = "\1\5\1\uffff\1\0\1\4\1\1\1\2\21\uffff\1\3}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\1\1\5\uffff\2\1\1\2\1\3\1\4\1\5\1\uffff\2\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\uffff\1\16\1\17\1\20",
            "",
            "\1\22\1\uffff\1\21\25\uffff\1\23",
            "\1\1\1\uffff\1\1\25\uffff\1\24",
            "\1\1\1\uffff\1\1\25\uffff\1\25",
            "\1\1\1\uffff\1\1\25\uffff\1\26",
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
            "\1\27",
            "\1\27",
            "",
            "",
            "",
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

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 351:6: ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( ( (lv_networks_24_0= ruleNetworkConnector_short ) )+ | ( (lv_networks_25_0= ruleNetworkConnector_long ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'volumes:' ( (otherlv_27= '-' ( (lv_volumes_28_0= ruleVolumeConnector_short ) ) )+ | (otherlv_29= '-' ( (lv_volumes_30_0= ruleVolumeConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'configs:' ( (otherlv_32= '-' ( (lv_configs_33_0= ruleConfigConnector_short ) ) )+ | (otherlv_34= '-' ( (lv_configs_35_0= ruleConfigConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'secrets:' ( (otherlv_37= '-' ( (lv_secrets_38_0= ruleSecretConnector_short ) ) )+ | (otherlv_39= '-' ( (lv_secrets_40_0= ruleSecretConnector_long ) ) )+ ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'devices:' (otherlv_42= '-' ( (lv_devices_43_0= ruleDevice ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'dns:' ( (otherlv_45= '-' ( (lv_dns_46_0= ruleDNS ) ) )+ | ( (lv_dns_47_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= 'ports:' (otherlv_49= '-' ( (lv_ports_50_0= rulePort ) ) )+ ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_2 = input.LA(1);

                         
                        int index25_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_2==RULE_STRING) ) {s = 17;}

                        else if ( (LA25_2==RULE_ID) ) {s = 18;}

                        else if ( LA25_2 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8) ) {s = 19;}

                         
                        input.seek(index25_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_4 = input.LA(1);

                         
                        int index25_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA25_4 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10) ) {s = 21;}

                        else if ( (LA25_4==RULE_ID||LA25_4==RULE_STRING) ) {s = 1;}

                         
                        input.seek(index25_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_5 = input.LA(1);

                         
                        int index25_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA25_5 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 11) ) {s = 22;}

                        else if ( (LA25_5==RULE_ID||LA25_5==RULE_STRING) ) {s = 1;}

                         
                        input.seek(index25_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA25_23 = input.LA(1);

                         
                        int index25_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8) ) {s = 19;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getServiceAccess().getUnorderedGroup_3()) ) {s = 1;}

                         
                        input.seek(index25_23);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA25_3 = input.LA(1);

                         
                        int index25_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_3==RULE_ID||LA25_3==RULE_STRING) ) {s = 1;}

                        else if ( LA25_3 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9) ) {s = 20;}

                         
                        input.seek(index25_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA25_0 = input.LA(1);

                         
                        int index25_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_0==EOF||LA25_0==RULE_ID||LA25_0==RULE_STRING||(LA25_0>=15 && LA25_0<=16)) ) {s = 1;}

                        else if ( (LA25_0==17) ) {s = 2;}

                        else if ( (LA25_0==18) ) {s = 3;}

                        else if ( (LA25_0==19) ) {s = 4;}

                        else if ( (LA25_0==20) ) {s = 5;}

                        else if ( LA25_0 >= 22 && LA25_0 <= 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 0) ) {s = 6;}

                        else if ( LA25_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 1) ) {s = 7;}

                        else if ( LA25_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 2) ) {s = 8;}

                        else if ( LA25_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 3) ) {s = 9;}

                        else if ( LA25_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 4) ) {s = 10;}

                        else if ( LA25_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 5) ) {s = 11;}

                        else if ( LA25_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 6) ) {s = 12;}

                        else if ( LA25_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 7) ) {s = 13;}

                        else if ( LA25_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 12) ) {s = 14;}

                        else if ( LA25_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 13) ) {s = 15;}

                        else if ( LA25_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 14) ) {s = 16;}

                         
                        input.seek(index25_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\14\uffff";
    static final String dfa_9s = "\1\1\13\uffff";
    static final String dfa_10s = "\1\7\1\uffff\1\110\6\uffff\2\0\1\uffff";
    static final String dfa_11s = "\1\56\1\uffff\1\111\6\uffff\2\0\1\uffff";
    static final String dfa_12s = "\1\uffff\1\10\1\uffff\1\1\1\2\1\3\1\5\1\6\1\7\2\uffff\1\4";
    static final String dfa_13s = "\1\2\10\uffff\1\0\1\1\1\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\uffff\1\1\5\uffff\6\1\1\uffff\7\1\1\2\5\1\4\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\uffff\1\10",
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

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()+ loopback of 1672:6: ( ({...}? => ( ({...}? => (otherlv_2= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'type:' ( (lv_type_5_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'target:' ( (lv_container_path_7_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'read_only:' ( (lv_read_only_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'bind:' otherlv_11= 'propagation:' ( (lv_propagation_12_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'volume:' otherlv_14= 'nocopy:' ( (lv_nocopy_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tmpfs:' otherlv_17= 'size:' ( (lv_size_18_0= ruleEInt ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_9 = input.LA(1);

                         
                        int index32_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 3) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1()) ) {s = 1;}

                         
                        input.seek(index32_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_10 = input.LA(1);

                         
                        int index32_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 3) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1()) ) {s = 1;}

                         
                        input.seek(index32_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_0 = input.LA(1);

                         
                        int index32_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_0==EOF||LA32_0==RULE_ID||LA32_0==RULE_STRING||(LA32_0>=15 && LA32_0<=20)||(LA32_0>=22 && LA32_0<=28)||(LA32_0>=30 && LA32_0<=34)) ) {s = 1;}

                        else if ( (LA32_0==29) ) {s = 2;}

                        else if ( LA32_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 0) ) {s = 3;}

                        else if ( LA32_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 1) ) {s = 4;}

                        else if ( LA32_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 2) ) {s = 5;}

                        else if ( LA32_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA32_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA32_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnector_longAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                         
                        input.seek(index32_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\13\uffff";
    static final String dfa_16s = "\1\1\12\uffff";
    static final String dfa_17s = "\1\7\12\uffff";
    static final String dfa_18s = "\1\75\12\uffff";
    static final String dfa_19s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_20s = "\1\0\12\uffff}>";
    static final String[] dfa_21s = {
            "\1\1\1\uffff\1\1\5\uffff\6\1\40\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
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

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "()* loopback of 2491:7: ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_0 = input.LA(1);

                         
                        int index37_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA37_0==EOF||LA37_0==RULE_ID||LA37_0==RULE_STRING||(LA37_0>=15 && LA37_0<=20)) ) {s = 1;}

                        else if ( LA37_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 0) ) {s = 2;}

                        else if ( LA37_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 1) ) {s = 3;}

                        else if ( LA37_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 2) ) {s = 4;}

                        else if ( LA37_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 3) ) {s = 5;}

                        else if ( LA37_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 4) ) {s = 6;}

                        else if ( LA37_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 5) ) {s = 7;}

                        else if ( LA37_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 6) ) {s = 8;}

                        else if ( LA37_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 7) ) {s = 9;}

                        else if ( LA37_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 8) ) {s = 10;}

                         
                        input.seek(index37_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000077FDE0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000077FDE0080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000077FDE0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000007FFDE0002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000280L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000007FFDE0282L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000578020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0007028000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000007880000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000578020000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000578020000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000007E00000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0007028000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0007028000000080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x3FE8000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x3FE0000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x3FE0000000000282L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x3FE0000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x1E20000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1E20000000000282L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x4600000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0xC600000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0020000080000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0020000080000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020000000000282L,0x0000000000000003L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x000000000000003CL});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000282L,0x000000000000003CL});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000080L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});

}
