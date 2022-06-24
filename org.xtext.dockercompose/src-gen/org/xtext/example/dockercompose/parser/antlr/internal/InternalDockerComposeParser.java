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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VERSION", "RULE_DEVICE", "RULE_PORT", "RULE_ID", "RULE_QUOTED_INT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'version:'", "'services:'", "'networks:'", "'volumes:'", "'configs:'", "'secrets:'", "':'", "'build:'", "'image:'", "'cpu_count:'", "'command:'", "'container_name:'", "'restart:'", "'init:'", "'read_only:'", "'depends_on:'", "'-'", "'devices:'", "'dns:'", "'ports:'", "'ipv4_address:'", "'priority:'", "'aliases:'", "'link_local_ips:'", "'source:'", "'type:'", "'target:'", "'bind:'", "'propagation:'", "'volume:'", "'nocopy:'", "'tmpfs:'", "'size:'", "'uid:'", "'gid:'", "'mode:'", "'{'", "'}'", "'driver:'", "'attachable:'", "'enable_ipv6:'", "'internal:'", "'external:'", "'name:'", "'labels:'", "'driver_opts:'", "'ipam:'", "'file:'", "'environment:'", "'config:'", "'options:'", "'subnet:'", "'ip_range:'", "'gateway:'", "'aux_addresses:'", "'.'", "'/'", "'true'", "'false'", "'\"no\"'", "'always'", "'on-failure'", "'unless-stopped'", "'rw'", "'ro'", "'z'", "'volume'", "'bind'", "'tmpfs'", "'npipe'", "'rprivate'", "'private'", "'rshared'", "'shared'", "'rslave'", "'slave'"
    };
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
    public static final int RULE_PORT=6;
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
    public static final int RULE_DEVICE=5;
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
    // InternalDockerCompose.g:72:1: ruleDockerCompose returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' this_VERSION_2= RULE_VERSION ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleDockerCompose() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_VERSION_2=null;
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
            // InternalDockerCompose.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' this_VERSION_2= RULE_VERSION ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) ) )+ {...}?) ) ) )
            // InternalDockerCompose.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' this_VERSION_2= RULE_VERSION ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) ) )+ {...}?) ) )
            {
            // InternalDockerCompose.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' this_VERSION_2= RULE_VERSION ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) ) )+ {...}?) ) )
            // InternalDockerCompose.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' this_VERSION_2= RULE_VERSION ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) ) )+ {...}?) )
            {
            // InternalDockerCompose.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' this_VERSION_2= RULE_VERSION ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) ) )+ {...}?) )
            // InternalDockerCompose.g:81:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' this_VERSION_2= RULE_VERSION ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getDockerComposeAccess().getUnorderedGroup());
            			
            // InternalDockerCompose.g:84:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'version:' this_VERSION_2= RULE_VERSION ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) ) )+ {...}?)
            // InternalDockerCompose.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'version:' this_VERSION_2= RULE_VERSION ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) ) )+ {...}?
            {
            // InternalDockerCompose.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'version:' this_VERSION_2= RULE_VERSION ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) ) )+
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
            	    // InternalDockerCompose.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'version:' this_VERSION_2= RULE_VERSION ) ) ) )
            	    {
            	    // InternalDockerCompose.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'version:' this_VERSION_2= RULE_VERSION ) ) ) )
            	    // InternalDockerCompose.g:87:4: {...}? => ( ({...}? => (otherlv_1= 'version:' this_VERSION_2= RULE_VERSION ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalDockerCompose.g:87:107: ( ({...}? => (otherlv_1= 'version:' this_VERSION_2= RULE_VERSION ) ) )
            	    // InternalDockerCompose.g:88:5: ({...}? => (otherlv_1= 'version:' this_VERSION_2= RULE_VERSION ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalDockerCompose.g:91:8: ({...}? => (otherlv_1= 'version:' this_VERSION_2= RULE_VERSION ) )
            	    // InternalDockerCompose.g:91:9: {...}? => (otherlv_1= 'version:' this_VERSION_2= RULE_VERSION )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:91:18: (otherlv_1= 'version:' this_VERSION_2= RULE_VERSION )
            	    // InternalDockerCompose.g:91:19: otherlv_1= 'version:' this_VERSION_2= RULE_VERSION
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getDockerComposeAccess().getVersionKeyword_0_0());
            	    							
            	    this_VERSION_2=(Token)match(input,RULE_VERSION,FOLLOW_4); 

            	    								newLeafNode(this_VERSION_2, grammarAccess.getDockerComposeAccess().getVERSIONTerminalRuleCall_0_1());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDockerComposeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDockerCompose.g:105:3: ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:105:3: ({...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) ) )
            	    // InternalDockerCompose.g:106:4: {...}? => ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalDockerCompose.g:106:107: ( ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) ) )
            	    // InternalDockerCompose.g:107:5: ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalDockerCompose.g:110:8: ({...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ ) )
            	    // InternalDockerCompose.g:110:9: {...}? => (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:110:18: (otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+ )
            	    // InternalDockerCompose.g:110:19: otherlv_3= 'services:' ( (lv_services_4_0= ruleService ) )+
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_5); 

            	    								newLeafNode(otherlv_3, grammarAccess.getDockerComposeAccess().getServicesKeyword_1_0());
            	    							
            	    // InternalDockerCompose.g:114:8: ( (lv_services_4_0= ruleService ) )+
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
            	    	    // InternalDockerCompose.g:115:9: (lv_services_4_0= ruleService )
            	    	    {
            	    	    // InternalDockerCompose.g:115:9: (lv_services_4_0= ruleService )
            	    	    // InternalDockerCompose.g:116:10: lv_services_4_0= ruleService
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
            	    // InternalDockerCompose.g:139:3: ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:139:3: ({...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) ) )
            	    // InternalDockerCompose.g:140:4: {...}? => ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalDockerCompose.g:140:107: ( ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) ) )
            	    // InternalDockerCompose.g:141:5: ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalDockerCompose.g:144:8: ({...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ ) )
            	    // InternalDockerCompose.g:144:9: {...}? => (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:144:18: (otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+ )
            	    // InternalDockerCompose.g:144:19: otherlv_5= 'networks:' ( (lv_networks_6_0= ruleNetwork ) )+
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_5); 

            	    								newLeafNode(otherlv_5, grammarAccess.getDockerComposeAccess().getNetworksKeyword_2_0());
            	    							
            	    // InternalDockerCompose.g:148:8: ( (lv_networks_6_0= ruleNetwork ) )+
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
            	    	    // InternalDockerCompose.g:149:9: (lv_networks_6_0= ruleNetwork )
            	    	    {
            	    	    // InternalDockerCompose.g:149:9: (lv_networks_6_0= ruleNetwork )
            	    	    // InternalDockerCompose.g:150:10: lv_networks_6_0= ruleNetwork
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
            	    // InternalDockerCompose.g:173:3: ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:173:3: ({...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) ) )
            	    // InternalDockerCompose.g:174:4: {...}? => ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalDockerCompose.g:174:107: ( ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) ) )
            	    // InternalDockerCompose.g:175:5: ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalDockerCompose.g:178:8: ({...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ ) )
            	    // InternalDockerCompose.g:178:9: {...}? => (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:178:18: (otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+ )
            	    // InternalDockerCompose.g:178:19: otherlv_7= 'volumes:' ( (lv_volumes_8_0= ruleVolume ) )+
            	    {
            	    otherlv_7=(Token)match(input,18,FOLLOW_5); 

            	    								newLeafNode(otherlv_7, grammarAccess.getDockerComposeAccess().getVolumesKeyword_3_0());
            	    							
            	    // InternalDockerCompose.g:182:8: ( (lv_volumes_8_0= ruleVolume ) )+
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
            	    	    // InternalDockerCompose.g:183:9: (lv_volumes_8_0= ruleVolume )
            	    	    {
            	    	    // InternalDockerCompose.g:183:9: (lv_volumes_8_0= ruleVolume )
            	    	    // InternalDockerCompose.g:184:10: lv_volumes_8_0= ruleVolume
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
            	    // InternalDockerCompose.g:207:3: ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:207:3: ({...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) ) )
            	    // InternalDockerCompose.g:208:4: {...}? => ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalDockerCompose.g:208:107: ( ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) ) )
            	    // InternalDockerCompose.g:209:5: ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalDockerCompose.g:212:8: ({...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ ) )
            	    // InternalDockerCompose.g:212:9: {...}? => (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:212:18: (otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+ )
            	    // InternalDockerCompose.g:212:19: otherlv_9= 'configs:' ( (lv_configs_10_0= ruleConfig ) )+
            	    {
            	    otherlv_9=(Token)match(input,19,FOLLOW_5); 

            	    								newLeafNode(otherlv_9, grammarAccess.getDockerComposeAccess().getConfigsKeyword_4_0());
            	    							
            	    // InternalDockerCompose.g:216:8: ( (lv_configs_10_0= ruleConfig ) )+
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
            	    	    // InternalDockerCompose.g:217:9: (lv_configs_10_0= ruleConfig )
            	    	    {
            	    	    // InternalDockerCompose.g:217:9: (lv_configs_10_0= ruleConfig )
            	    	    // InternalDockerCompose.g:218:10: lv_configs_10_0= ruleConfig
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
            	    // InternalDockerCompose.g:241:3: ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:241:3: ({...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) ) )
            	    // InternalDockerCompose.g:242:4: {...}? => ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalDockerCompose.g:242:107: ( ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) ) )
            	    // InternalDockerCompose.g:243:5: ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDockerComposeAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalDockerCompose.g:246:8: ({...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ ) )
            	    // InternalDockerCompose.g:246:9: {...}? => (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDockerCompose", "true");
            	    }
            	    // InternalDockerCompose.g:246:18: (otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+ )
            	    // InternalDockerCompose.g:246:19: otherlv_11= 'secrets:' ( (lv_secrets_12_0= ruleSecret ) )+
            	    {
            	    otherlv_11=(Token)match(input,20,FOLLOW_5); 

            	    								newLeafNode(otherlv_11, grammarAccess.getDockerComposeAccess().getSecretsKeyword_5_0());
            	    							
            	    // InternalDockerCompose.g:250:8: ( (lv_secrets_12_0= ruleSecret ) )+
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
            	    	    // InternalDockerCompose.g:251:9: (lv_secrets_12_0= ruleSecret )
            	    	    {
            	    	    // InternalDockerCompose.g:251:9: (lv_secrets_12_0= ruleSecret )
            	    	    // InternalDockerCompose.g:252:10: lv_secrets_12_0= ruleSecret
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
    // InternalDockerCompose.g:286:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalDockerCompose.g:286:48: (iv_ruleService= ruleService EOF )
            // InternalDockerCompose.g:287:2: iv_ruleService= ruleService EOF
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
    // InternalDockerCompose.g:293:1: ruleService returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ ) ) ) ) )+ {...}?) ) ) ) ;
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
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token this_DEVICE_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token this_PORT_43=null;
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

        EObject lv_volumes_27_0 = null;

        EObject lv_configs_30_0 = null;

        EObject lv_secrets_33_0 = null;

        EObject lv_dns_39_0 = null;

        EObject lv_dns_40_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:299:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ ) ) ) ) )+ {...}?) ) ) ) )
            // InternalDockerCompose.g:300:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalDockerCompose.g:300:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ ) ) ) ) )+ {...}?) ) ) )
            // InternalDockerCompose.g:301:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ ) ) ) ) )+ {...}?) ) )
            {
            // InternalDockerCompose.g:301:3: ()
            // InternalDockerCompose.g:302:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceAccess().getServiceAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:308:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:309:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:309:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:310:5: lv_name_1_0= ruleEString
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
            		
            // InternalDockerCompose.g:331:3: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ ) ) ) ) )+ {...}?) ) )
            // InternalDockerCompose.g:332:4: ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ ) ) ) ) )+ {...}?) )
            {
            // InternalDockerCompose.g:332:4: ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ ) ) ) ) )+ {...}?) )
            // InternalDockerCompose.g:333:5: ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:336:5: ( ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ ) ) ) ) )+ {...}?)
            // InternalDockerCompose.g:337:6: ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ ) ) ) ) )+ {...}?
            {
            // InternalDockerCompose.g:337:6: ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ ) ) ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=16;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // InternalDockerCompose.g:338:4: ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:338:4: ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) )
            	    // InternalDockerCompose.g:339:5: {...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDockerCompose.g:339:104: ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) )
            	    // InternalDockerCompose.g:340:6: ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDockerCompose.g:343:9: ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) )
            	    // InternalDockerCompose.g:343:10: {...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:343:19: ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) )
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
            	            // InternalDockerCompose.g:343:20: (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) )
            	            {
            	            // InternalDockerCompose.g:343:20: (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) )
            	            // InternalDockerCompose.g:344:10: otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) )
            	            {
            	            otherlv_4=(Token)match(input,22,FOLLOW_9); 

            	            										newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getBuildKeyword_3_0_0_0());
            	            									
            	            // InternalDockerCompose.g:348:10: ( (lv_build_5_0= rulePATH ) )
            	            // InternalDockerCompose.g:349:11: (lv_build_5_0= rulePATH )
            	            {
            	            // InternalDockerCompose.g:349:11: (lv_build_5_0= rulePATH )
            	            // InternalDockerCompose.g:350:12: lv_build_5_0= rulePATH
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
            	            // InternalDockerCompose.g:369:9: (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) )
            	            {
            	            // InternalDockerCompose.g:369:9: (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) )
            	            // InternalDockerCompose.g:370:10: otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) )
            	            {
            	            otherlv_6=(Token)match(input,23,FOLLOW_5); 

            	            										newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getImageKeyword_3_0_1_0());
            	            									
            	            // InternalDockerCompose.g:374:10: ( (lv_image_7_0= ruleImage ) )
            	            // InternalDockerCompose.g:375:11: (lv_image_7_0= ruleImage )
            	            {
            	            // InternalDockerCompose.g:375:11: (lv_image_7_0= ruleImage )
            	            // InternalDockerCompose.g:376:12: lv_image_7_0= ruleImage
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
            	    // InternalDockerCompose.g:400:4: ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:400:4: ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) )
            	    // InternalDockerCompose.g:401:5: {...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDockerCompose.g:401:104: ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) )
            	    // InternalDockerCompose.g:402:6: ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDockerCompose.g:405:9: ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) )
            	    // InternalDockerCompose.g:405:10: {...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:405:19: (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) )
            	    // InternalDockerCompose.g:405:20: otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) )
            	    {
            	    otherlv_8=(Token)match(input,24,FOLLOW_11); 

            	    									newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getCpu_countKeyword_3_1_0());
            	    								
            	    // InternalDockerCompose.g:409:9: ( (lv_cpu_count_9_0= ruleEInt ) )
            	    // InternalDockerCompose.g:410:10: (lv_cpu_count_9_0= ruleEInt )
            	    {
            	    // InternalDockerCompose.g:410:10: (lv_cpu_count_9_0= ruleEInt )
            	    // InternalDockerCompose.g:411:11: lv_cpu_count_9_0= ruleEInt
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
            	    // InternalDockerCompose.g:434:4: ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:434:4: ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:435:5: {...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:435:104: ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:436:6: ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:439:9: ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:439:10: {...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:439:19: (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:439:20: otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,25,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getCommandKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:443:9: ( (lv_command_11_0= ruleEString ) )
            	    // InternalDockerCompose.g:444:10: (lv_command_11_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:444:10: (lv_command_11_0= ruleEString )
            	    // InternalDockerCompose.g:445:11: lv_command_11_0= ruleEString
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
            	    // InternalDockerCompose.g:468:4: ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:468:4: ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:469:5: {...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalDockerCompose.g:469:104: ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:470:6: ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalDockerCompose.g:473:9: ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:473:10: {...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:473:19: (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:473:20: otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,26,FOLLOW_5); 

            	    									newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getContainer_nameKeyword_3_3_0());
            	    								
            	    // InternalDockerCompose.g:477:9: ( (lv_container_name_13_0= ruleEString ) )
            	    // InternalDockerCompose.g:478:10: (lv_container_name_13_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:478:10: (lv_container_name_13_0= ruleEString )
            	    // InternalDockerCompose.g:479:11: lv_container_name_13_0= ruleEString
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
            	    // InternalDockerCompose.g:502:4: ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:502:4: ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) )
            	    // InternalDockerCompose.g:503:5: {...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalDockerCompose.g:503:104: ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) )
            	    // InternalDockerCompose.g:504:6: ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalDockerCompose.g:507:9: ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) )
            	    // InternalDockerCompose.g:507:10: {...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:507:19: (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) )
            	    // InternalDockerCompose.g:507:20: otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) )
            	    {
            	    otherlv_14=(Token)match(input,27,FOLLOW_12); 

            	    									newLeafNode(otherlv_14, grammarAccess.getServiceAccess().getRestartKeyword_3_4_0());
            	    								
            	    // InternalDockerCompose.g:511:9: ( (lv_restart_15_0= ruleRestartPolicy ) )
            	    // InternalDockerCompose.g:512:10: (lv_restart_15_0= ruleRestartPolicy )
            	    {
            	    // InternalDockerCompose.g:512:10: (lv_restart_15_0= ruleRestartPolicy )
            	    // InternalDockerCompose.g:513:11: lv_restart_15_0= ruleRestartPolicy
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
            	    // InternalDockerCompose.g:536:4: ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:536:4: ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:537:5: {...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalDockerCompose.g:537:104: ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:538:6: ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalDockerCompose.g:541:9: ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:541:10: {...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:541:19: (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:541:20: otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) )
            	    {
            	    otherlv_16=(Token)match(input,28,FOLLOW_13); 

            	    									newLeafNode(otherlv_16, grammarAccess.getServiceAccess().getInitKeyword_3_5_0());
            	    								
            	    // InternalDockerCompose.g:545:9: ( (lv_init_17_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:546:10: (lv_init_17_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:546:10: (lv_init_17_0= ruleEBoolean )
            	    // InternalDockerCompose.g:547:11: lv_init_17_0= ruleEBoolean
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
            	    // InternalDockerCompose.g:570:4: ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:570:4: ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:571:5: {...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalDockerCompose.g:571:104: ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:572:6: ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalDockerCompose.g:575:9: ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:575:10: {...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:575:19: (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:575:20: otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) )
            	    {
            	    otherlv_18=(Token)match(input,29,FOLLOW_13); 

            	    									newLeafNode(otherlv_18, grammarAccess.getServiceAccess().getRead_onlyKeyword_3_6_0());
            	    								
            	    // InternalDockerCompose.g:579:9: ( (lv_read_only_19_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:580:10: (lv_read_only_19_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:580:10: (lv_read_only_19_0= ruleEBoolean )
            	    // InternalDockerCompose.g:581:11: lv_read_only_19_0= ruleEBoolean
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
            	    // InternalDockerCompose.g:604:4: ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:604:4: ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:605:5: {...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalDockerCompose.g:605:104: ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) )
            	    // InternalDockerCompose.g:606:6: ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalDockerCompose.g:609:9: ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) )
            	    // InternalDockerCompose.g:609:10: {...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:609:19: (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ )
            	    // InternalDockerCompose.g:609:20: otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+
            	    {
            	    otherlv_20=(Token)match(input,30,FOLLOW_14); 

            	    									newLeafNode(otherlv_20, grammarAccess.getServiceAccess().getDepends_onKeyword_3_7_0());
            	    								
            	    // InternalDockerCompose.g:613:9: (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+
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
            	    	    // InternalDockerCompose.g:614:10: otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) )
            	    	    {
            	    	    otherlv_21=(Token)match(input,31,FOLLOW_5); 

            	    	    										newLeafNode(otherlv_21, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_7_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:618:10: ( (lv_depends_on_22_0= ruleDependency ) )
            	    	    // InternalDockerCompose.g:619:11: (lv_depends_on_22_0= ruleDependency )
            	    	    {
            	    	    // InternalDockerCompose.g:619:11: (lv_depends_on_22_0= ruleDependency )
            	    	    // InternalDockerCompose.g:620:12: lv_depends_on_22_0= ruleDependency
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
            	    // InternalDockerCompose.g:644:4: ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:644:4: ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ ) ) ) )
            	    // InternalDockerCompose.g:645:5: {...}? => ( ({...}? => (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalDockerCompose.g:645:104: ( ({...}? => (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ ) ) )
            	    // InternalDockerCompose.g:646:6: ({...}? => (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalDockerCompose.g:649:9: ({...}? => (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ ) )
            	    // InternalDockerCompose.g:649:10: {...}? => (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:649:19: (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ )
            	    // InternalDockerCompose.g:649:20: otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+
            	    {
            	    otherlv_23=(Token)match(input,17,FOLLOW_16); 

            	    									newLeafNode(otherlv_23, grammarAccess.getServiceAccess().getNetworksKeyword_3_8_0());
            	    								
            	    // InternalDockerCompose.g:653:9: ( (lv_networks_24_0= ruleNetworkConnector ) )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        switch ( input.LA(1) ) {
            	        case RULE_STRING:
            	            {
            	            int LA9_2 = input.LA(2);

            	            if ( (LA9_2==21) ) {
            	                alt9=1;
            	            }


            	            }
            	            break;
            	        case RULE_ID:
            	            {
            	            int LA9_3 = input.LA(2);

            	            if ( (LA9_3==21) ) {
            	                alt9=1;
            	            }


            	            }
            	            break;
            	        case 31:
            	            {
            	            alt9=1;
            	            }
            	            break;

            	        }

            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:654:10: (lv_networks_24_0= ruleNetworkConnector )
            	    	    {
            	    	    // InternalDockerCompose.g:654:10: (lv_networks_24_0= ruleNetworkConnector )
            	    	    // InternalDockerCompose.g:655:11: lv_networks_24_0= ruleNetworkConnector
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getServiceAccess().getNetworksNetworkConnectorParserRuleCall_3_8_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_networks_24_0=ruleNetworkConnector();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"networks",
            	    	    												lv_networks_24_0,
            	    	    												"org.xtext.example.dockercompose.DockerCompose.NetworkConnector");
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


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalDockerCompose.g:678:4: ({...}? => ( ({...}? => (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:678:4: ({...}? => ( ({...}? => (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:679:5: {...}? => ( ({...}? => (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // InternalDockerCompose.g:679:104: ( ({...}? => (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ ) ) )
            	    // InternalDockerCompose.g:680:6: ({...}? => (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9);
            	    					
            	    // InternalDockerCompose.g:683:9: ({...}? => (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ ) )
            	    // InternalDockerCompose.g:683:10: {...}? => (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:683:19: (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ )
            	    // InternalDockerCompose.g:683:20: otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+
            	    {
            	    otherlv_25=(Token)match(input,18,FOLLOW_14); 

            	    									newLeafNode(otherlv_25, grammarAccess.getServiceAccess().getVolumesKeyword_3_9_0());
            	    								
            	    // InternalDockerCompose.g:687:9: (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==31) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:688:10: otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) )
            	    	    {
            	    	    otherlv_26=(Token)match(input,31,FOLLOW_18); 

            	    	    										newLeafNode(otherlv_26, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_9_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:692:10: ( (lv_volumes_27_0= ruleVolumeConnector ) )
            	    	    // InternalDockerCompose.g:693:11: (lv_volumes_27_0= ruleVolumeConnector )
            	    	    {
            	    	    // InternalDockerCompose.g:693:11: (lv_volumes_27_0= ruleVolumeConnector )
            	    	    // InternalDockerCompose.g:694:12: lv_volumes_27_0= ruleVolumeConnector
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServiceAccess().getVolumesVolumeConnectorParserRuleCall_3_9_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_volumes_27_0=ruleVolumeConnector();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"volumes",
            	    	    													lv_volumes_27_0,
            	    	    													"org.xtext.example.dockercompose.DockerCompose.VolumeConnector");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


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
            	    // InternalDockerCompose.g:718:4: ({...}? => ( ({...}? => (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:718:4: ({...}? => ( ({...}? => (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:719:5: {...}? => ( ({...}? => (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // InternalDockerCompose.g:719:105: ( ({...}? => (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ ) ) )
            	    // InternalDockerCompose.g:720:6: ({...}? => (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10);
            	    					
            	    // InternalDockerCompose.g:723:9: ({...}? => (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ ) )
            	    // InternalDockerCompose.g:723:10: {...}? => (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:723:19: (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ )
            	    // InternalDockerCompose.g:723:20: otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+
            	    {
            	    otherlv_28=(Token)match(input,19,FOLLOW_14); 

            	    									newLeafNode(otherlv_28, grammarAccess.getServiceAccess().getConfigsKeyword_3_10_0());
            	    								
            	    // InternalDockerCompose.g:727:9: (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+
            	    int cnt11=0;
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==31) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:728:10: otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) )
            	    	    {
            	    	    otherlv_29=(Token)match(input,31,FOLLOW_19); 

            	    	    										newLeafNode(otherlv_29, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_10_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:732:10: ( (lv_configs_30_0= ruleConfigConnector ) )
            	    	    // InternalDockerCompose.g:733:11: (lv_configs_30_0= ruleConfigConnector )
            	    	    {
            	    	    // InternalDockerCompose.g:733:11: (lv_configs_30_0= ruleConfigConnector )
            	    	    // InternalDockerCompose.g:734:12: lv_configs_30_0= ruleConfigConnector
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServiceAccess().getConfigsConfigConnectorParserRuleCall_3_10_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_configs_30_0=ruleConfigConnector();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"configs",
            	    	    													lv_configs_30_0,
            	    	    													"org.xtext.example.dockercompose.DockerCompose.ConfigConnector");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


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


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalDockerCompose.g:758:4: ({...}? => ( ({...}? => (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:758:4: ({...}? => ( ({...}? => (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:759:5: {...}? => ( ({...}? => (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 11)");
            	    }
            	    // InternalDockerCompose.g:759:105: ( ({...}? => (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ ) ) )
            	    // InternalDockerCompose.g:760:6: ({...}? => (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 11);
            	    					
            	    // InternalDockerCompose.g:763:9: ({...}? => (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ ) )
            	    // InternalDockerCompose.g:763:10: {...}? => (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:763:19: (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ )
            	    // InternalDockerCompose.g:763:20: otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+
            	    {
            	    otherlv_31=(Token)match(input,20,FOLLOW_14); 

            	    									newLeafNode(otherlv_31, grammarAccess.getServiceAccess().getSecretsKeyword_3_11_0());
            	    								
            	    // InternalDockerCompose.g:767:9: (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+
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
            	    	    // InternalDockerCompose.g:768:10: otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) )
            	    	    {
            	    	    otherlv_32=(Token)match(input,31,FOLLOW_19); 

            	    	    										newLeafNode(otherlv_32, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_11_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:772:10: ( (lv_secrets_33_0= ruleSecretConnector ) )
            	    	    // InternalDockerCompose.g:773:11: (lv_secrets_33_0= ruleSecretConnector )
            	    	    {
            	    	    // InternalDockerCompose.g:773:11: (lv_secrets_33_0= ruleSecretConnector )
            	    	    // InternalDockerCompose.g:774:12: lv_secrets_33_0= ruleSecretConnector
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServiceAccess().getSecretsSecretConnectorParserRuleCall_3_11_1_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_secrets_33_0=ruleSecretConnector();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"secrets",
            	    	    													lv_secrets_33_0,
            	    	    													"org.xtext.example.dockercompose.DockerCompose.SecretConnector");
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


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalDockerCompose.g:798:4: ({...}? => ( ({...}? => (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:798:4: ({...}? => ( ({...}? => (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ ) ) ) )
            	    // InternalDockerCompose.g:799:5: {...}? => ( ({...}? => (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 12)");
            	    }
            	    // InternalDockerCompose.g:799:105: ( ({...}? => (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ ) ) )
            	    // InternalDockerCompose.g:800:6: ({...}? => (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 12);
            	    					
            	    // InternalDockerCompose.g:803:9: ({...}? => (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ ) )
            	    // InternalDockerCompose.g:803:10: {...}? => (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:803:19: (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ )
            	    // InternalDockerCompose.g:803:20: otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+
            	    {
            	    otherlv_34=(Token)match(input,32,FOLLOW_14); 

            	    									newLeafNode(otherlv_34, grammarAccess.getServiceAccess().getDevicesKeyword_3_12_0());
            	    								
            	    // InternalDockerCompose.g:807:9: (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+
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
            	    	    // InternalDockerCompose.g:808:10: otherlv_35= '-' this_DEVICE_36= RULE_DEVICE
            	    	    {
            	    	    otherlv_35=(Token)match(input,31,FOLLOW_20); 

            	    	    										newLeafNode(otherlv_35, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_12_1_0());
            	    	    									
            	    	    this_DEVICE_36=(Token)match(input,RULE_DEVICE,FOLLOW_15); 

            	    	    										newLeafNode(this_DEVICE_36, grammarAccess.getServiceAccess().getDEVICETerminalRuleCall_3_12_1_1());
            	    	    									

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


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // InternalDockerCompose.g:823:4: ({...}? => ( ({...}? => (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:823:4: ({...}? => ( ({...}? => (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) ) ) ) )
            	    // InternalDockerCompose.g:824:5: {...}? => ( ({...}? => (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 13)");
            	    }
            	    // InternalDockerCompose.g:824:105: ( ({...}? => (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) ) ) )
            	    // InternalDockerCompose.g:825:6: ({...}? => (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 13);
            	    					
            	    // InternalDockerCompose.g:828:9: ({...}? => (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) ) )
            	    // InternalDockerCompose.g:828:10: {...}? => (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:828:19: (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) )
            	    // InternalDockerCompose.g:828:20: otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) )
            	    {
            	    otherlv_37=(Token)match(input,33,FOLLOW_21); 

            	    									newLeafNode(otherlv_37, grammarAccess.getServiceAccess().getDnsKeyword_3_13_0());
            	    								
            	    // InternalDockerCompose.g:832:9: ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==31) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==RULE_INT) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalDockerCompose.g:833:10: (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+
            	            {
            	            // InternalDockerCompose.g:833:10: (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+
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
            	            	    // InternalDockerCompose.g:834:11: otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) )
            	            	    {
            	            	    otherlv_38=(Token)match(input,31,FOLLOW_21); 

            	            	    											newLeafNode(otherlv_38, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_13_1_0_0());
            	            	    										
            	            	    // InternalDockerCompose.g:838:11: ( (lv_dns_39_0= ruleDNS ) )
            	            	    // InternalDockerCompose.g:839:12: (lv_dns_39_0= ruleDNS )
            	            	    {
            	            	    // InternalDockerCompose.g:839:12: (lv_dns_39_0= ruleDNS )
            	            	    // InternalDockerCompose.g:840:13: lv_dns_39_0= ruleDNS
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getServiceAccess().getDnsDNSParserRuleCall_3_13_1_0_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_15);
            	            	    lv_dns_39_0=ruleDNS();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"dns",
            	            	    														lv_dns_39_0,
            	            	    														"org.xtext.example.dockercompose.DockerCompose.DNS");
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
            	        case 2 :
            	            // InternalDockerCompose.g:859:10: ( (lv_dns_40_0= ruleDNS ) )
            	            {
            	            // InternalDockerCompose.g:859:10: ( (lv_dns_40_0= ruleDNS ) )
            	            // InternalDockerCompose.g:860:11: (lv_dns_40_0= ruleDNS )
            	            {
            	            // InternalDockerCompose.g:860:11: (lv_dns_40_0= ruleDNS )
            	            // InternalDockerCompose.g:861:12: lv_dns_40_0= ruleDNS
            	            {

            	            												newCompositeNode(grammarAccess.getServiceAccess().getDnsDNSParserRuleCall_3_13_1_1_0());
            	            											
            	            pushFollow(FOLLOW_10);
            	            lv_dns_40_0=ruleDNS();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getServiceRule());
            	            												}
            	            												add(
            	            													current,
            	            													"dns",
            	            													lv_dns_40_0,
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
            	    // InternalDockerCompose.g:885:4: ({...}? => ( ({...}? => (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:885:4: ({...}? => ( ({...}? => (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ ) ) ) )
            	    // InternalDockerCompose.g:886:5: {...}? => ( ({...}? => (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleService", "getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 14)");
            	    }
            	    // InternalDockerCompose.g:886:105: ( ({...}? => (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ ) ) )
            	    // InternalDockerCompose.g:887:6: ({...}? => (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 14);
            	    					
            	    // InternalDockerCompose.g:890:9: ({...}? => (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ ) )
            	    // InternalDockerCompose.g:890:10: {...}? => (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleService", "true");
            	    }
            	    // InternalDockerCompose.g:890:19: (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ )
            	    // InternalDockerCompose.g:890:20: otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+
            	    {
            	    otherlv_41=(Token)match(input,34,FOLLOW_14); 

            	    									newLeafNode(otherlv_41, grammarAccess.getServiceAccess().getPortsKeyword_3_14_0());
            	    								
            	    // InternalDockerCompose.g:894:9: (otherlv_42= '-' this_PORT_43= RULE_PORT )+
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
            	    	    // InternalDockerCompose.g:895:10: otherlv_42= '-' this_PORT_43= RULE_PORT
            	    	    {
            	    	    otherlv_42=(Token)match(input,31,FOLLOW_22); 

            	    	    										newLeafNode(otherlv_42, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_14_1_0());
            	    	    									
            	    	    this_PORT_43=(Token)match(input,RULE_PORT,FOLLOW_15); 

            	    	    										newLeafNode(this_PORT_43, grammarAccess.getServiceAccess().getPORTTerminalRuleCall_3_14_1_1());
            	    	    									

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

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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


    // $ANTLR start "entryRuleImage"
    // InternalDockerCompose.g:922:1: entryRuleImage returns [String current=null] : iv_ruleImage= ruleImage EOF ;
    public final String entryRuleImage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImage = null;


        try {
            // InternalDockerCompose.g:922:45: (iv_ruleImage= ruleImage EOF )
            // InternalDockerCompose.g:923:2: iv_ruleImage= ruleImage EOF
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
    // InternalDockerCompose.g:929:1: ruleImage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString | (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+ ) ) ;
    public final AntlrDatatypeRuleToken ruleImage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        Token kw=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_EString_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:935:2: ( (this_EString_0= ruleEString | (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+ ) ) )
            // InternalDockerCompose.g:936:2: (this_EString_0= ruleEString | (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+ ) )
            {
            // InternalDockerCompose.g:936:2: (this_EString_0= ruleEString | (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+ ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==21) ) {
                    alt19=2;
                }
                else if ( (LA19_2==EOF||LA19_2==RULE_ID||LA19_2==RULE_STRING||(LA19_2>=15 && LA19_2<=20)||(LA19_2>=22 && LA19_2<=30)||(LA19_2>=32 && LA19_2<=34)) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalDockerCompose.g:937:3: this_EString_0= ruleEString
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
                    // InternalDockerCompose.g:948:3: (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+ )
                    {
                    // InternalDockerCompose.g:948:3: (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+ )
                    // InternalDockerCompose.g:949:4: this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )+
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_7); 

                    				current.merge(this_ID_1);
                    			

                    				newLeafNode(this_ID_1, grammarAccess.getImageAccess().getIDTerminalRuleCall_1_0());
                    			
                    // InternalDockerCompose.g:956:4: (kw= ':' this_ID_3= RULE_ID )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==21) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalDockerCompose.g:957:5: kw= ':' this_ID_3= RULE_ID
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
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
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
    // InternalDockerCompose.g:975:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalDockerCompose.g:975:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalDockerCompose.g:976:2: iv_ruleDependency= ruleDependency EOF
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
    // InternalDockerCompose.g:982:1: ruleDependency returns [EObject current=null] : ( () ( ( ruleEString ) ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalDockerCompose.g:988:2: ( ( () ( ( ruleEString ) ) ) )
            // InternalDockerCompose.g:989:2: ( () ( ( ruleEString ) ) )
            {
            // InternalDockerCompose.g:989:2: ( () ( ( ruleEString ) ) )
            // InternalDockerCompose.g:990:3: () ( ( ruleEString ) )
            {
            // InternalDockerCompose.g:990:3: ()
            // InternalDockerCompose.g:991:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDependencyAccess().getDependencyAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:997:3: ( ( ruleEString ) )
            // InternalDockerCompose.g:998:4: ( ruleEString )
            {
            // InternalDockerCompose.g:998:4: ( ruleEString )
            // InternalDockerCompose.g:999:5: ruleEString
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


    // $ANTLR start "entryRuleNetworkConnector"
    // InternalDockerCompose.g:1017:1: entryRuleNetworkConnector returns [EObject current=null] : iv_ruleNetworkConnector= ruleNetworkConnector EOF ;
    public final EObject entryRuleNetworkConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConnector = null;


        try {
            // InternalDockerCompose.g:1017:57: (iv_ruleNetworkConnector= ruleNetworkConnector EOF )
            // InternalDockerCompose.g:1018:2: iv_ruleNetworkConnector= ruleNetworkConnector EOF
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
    // InternalDockerCompose.g:1024:1: ruleNetworkConnector returns [EObject current=null] : ( ( () (otherlv_1= '-' ( ( ruleEString ) ) ) ) | ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) ) ) ;
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
            // InternalDockerCompose.g:1030:2: ( ( ( () (otherlv_1= '-' ( ( ruleEString ) ) ) ) | ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) ) ) )
            // InternalDockerCompose.g:1031:2: ( ( () (otherlv_1= '-' ( ( ruleEString ) ) ) ) | ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) ) )
            {
            // InternalDockerCompose.g:1031:2: ( ( () (otherlv_1= '-' ( ( ruleEString ) ) ) ) | ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID||LA23_0==RULE_STRING) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalDockerCompose.g:1032:3: ( () (otherlv_1= '-' ( ( ruleEString ) ) ) )
                    {
                    // InternalDockerCompose.g:1032:3: ( () (otherlv_1= '-' ( ( ruleEString ) ) ) )
                    // InternalDockerCompose.g:1033:4: () (otherlv_1= '-' ( ( ruleEString ) ) )
                    {
                    // InternalDockerCompose.g:1033:4: ()
                    // InternalDockerCompose.g:1034:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNetworkConnectorAccess().getNetworkConnectorAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDockerCompose.g:1040:4: (otherlv_1= '-' ( ( ruleEString ) ) )
                    // InternalDockerCompose.g:1041:5: otherlv_1= '-' ( ( ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_5); 

                    					newLeafNode(otherlv_1, grammarAccess.getNetworkConnectorAccess().getHyphenMinusKeyword_0_1_0());
                    				
                    // InternalDockerCompose.g:1045:5: ( ( ruleEString ) )
                    // InternalDockerCompose.g:1046:6: ( ruleEString )
                    {
                    // InternalDockerCompose.g:1046:6: ( ruleEString )
                    // InternalDockerCompose.g:1047:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNetworkConnectorRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNetworkConnectorAccess().getNetworkNetworkCrossReference_0_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:1064:3: ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) )
                    {
                    // InternalDockerCompose.g:1064:3: ( ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) ) )
                    // InternalDockerCompose.g:1065:4: ( ( ruleEString ) ) otherlv_4= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) )
                    {
                    // InternalDockerCompose.g:1065:4: ( ( ruleEString ) )
                    // InternalDockerCompose.g:1066:5: ( ruleEString )
                    {
                    // InternalDockerCompose.g:1066:5: ( ruleEString )
                    // InternalDockerCompose.g:1067:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNetworkConnectorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNetworkConnectorAccess().getNetworkNetworkCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getNetworkConnectorAccess().getColonKeyword_1_1());
                    			
                    // InternalDockerCompose.g:1085:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) ) )
                    // InternalDockerCompose.g:1086:5: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) )
                    {
                    // InternalDockerCompose.g:1086:5: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* ) )
                    // InternalDockerCompose.g:1087:6: ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2());
                    					
                    // InternalDockerCompose.g:1090:6: ( ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )* )
                    // InternalDockerCompose.g:1091:7: ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )*
                    {
                    // InternalDockerCompose.g:1091:7: ( ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) ) )*
                    loop22:
                    do {
                        int alt22=5;
                        int LA22_0 = input.LA(1);

                        if ( LA22_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2(), 0) ) {
                            alt22=1;
                        }
                        else if ( LA22_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2(), 1) ) {
                            alt22=2;
                        }
                        else if ( LA22_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2(), 2) ) {
                            alt22=3;
                        }
                        else if ( LA22_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2(), 3) ) {
                            alt22=4;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalDockerCompose.g:1092:5: ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1092:5: ({...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1093:6: {...}? => ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2(), 0)");
                    	    }
                    	    // InternalDockerCompose.g:1093:116: ( ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) ) )
                    	    // InternalDockerCompose.g:1094:7: ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2(), 0);
                    	    						
                    	    // InternalDockerCompose.g:1097:10: ({...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) ) )
                    	    // InternalDockerCompose.g:1097:11: {...}? => (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1097:20: (otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) ) )
                    	    // InternalDockerCompose.g:1097:21: otherlv_6= 'ipv4_address:' ( (lv_ipv4_address_7_0= ruleDNS ) )
                    	    {
                    	    otherlv_6=(Token)match(input,35,FOLLOW_21); 

                    	    										newLeafNode(otherlv_6, grammarAccess.getNetworkConnectorAccess().getIpv4_addressKeyword_1_2_0_0());
                    	    									
                    	    // InternalDockerCompose.g:1101:10: ( (lv_ipv4_address_7_0= ruleDNS ) )
                    	    // InternalDockerCompose.g:1102:11: (lv_ipv4_address_7_0= ruleDNS )
                    	    {
                    	    // InternalDockerCompose.g:1102:11: (lv_ipv4_address_7_0= ruleDNS )
                    	    // InternalDockerCompose.g:1103:12: lv_ipv4_address_7_0= ruleDNS
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkConnectorAccess().getIpv4_addressDNSParserRuleCall_1_2_0_1_0());
                    	    											
                    	    pushFollow(FOLLOW_25);
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

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDockerCompose.g:1126:5: ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1126:5: ({...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1127:6: {...}? => ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2(), 1)");
                    	    }
                    	    // InternalDockerCompose.g:1127:116: ( ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) ) )
                    	    // InternalDockerCompose.g:1128:7: ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2(), 1);
                    	    						
                    	    // InternalDockerCompose.g:1131:10: ({...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) ) )
                    	    // InternalDockerCompose.g:1131:11: {...}? => (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1131:20: (otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) ) )
                    	    // InternalDockerCompose.g:1131:21: otherlv_8= 'priority:' ( (lv_priority_9_0= ruleEInt ) )
                    	    {
                    	    otherlv_8=(Token)match(input,36,FOLLOW_11); 

                    	    										newLeafNode(otherlv_8, grammarAccess.getNetworkConnectorAccess().getPriorityKeyword_1_2_1_0());
                    	    									
                    	    // InternalDockerCompose.g:1135:10: ( (lv_priority_9_0= ruleEInt ) )
                    	    // InternalDockerCompose.g:1136:11: (lv_priority_9_0= ruleEInt )
                    	    {
                    	    // InternalDockerCompose.g:1136:11: (lv_priority_9_0= ruleEInt )
                    	    // InternalDockerCompose.g:1137:12: lv_priority_9_0= ruleEInt
                    	    {

                    	    												newCompositeNode(grammarAccess.getNetworkConnectorAccess().getPriorityEIntParserRuleCall_1_2_1_1_0());
                    	    											
                    	    pushFollow(FOLLOW_25);
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

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalDockerCompose.g:1160:5: ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1160:5: ({...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) ) )
                    	    // InternalDockerCompose.g:1161:6: {...}? => ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2(), 2)");
                    	    }
                    	    // InternalDockerCompose.g:1161:116: ( ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) ) )
                    	    // InternalDockerCompose.g:1162:7: ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2(), 2);
                    	    						
                    	    // InternalDockerCompose.g:1165:10: ({...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ ) )
                    	    // InternalDockerCompose.g:1165:11: {...}? => (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1165:20: (otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+ )
                    	    // InternalDockerCompose.g:1165:21: otherlv_10= 'aliases:' (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+
                    	    {
                    	    otherlv_10=(Token)match(input,37,FOLLOW_14); 

                    	    										newLeafNode(otherlv_10, grammarAccess.getNetworkConnectorAccess().getAliasesKeyword_1_2_2_0());
                    	    									
                    	    // InternalDockerCompose.g:1169:10: (otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) ) )+
                    	    int cnt20=0;
                    	    loop20:
                    	    do {
                    	        int alt20=2;
                    	        int LA20_0 = input.LA(1);

                    	        if ( (LA20_0==31) ) {
                    	            int LA20_2 = input.LA(2);

                    	            if ( (LA20_2==RULE_STRING) ) {
                    	                alt20=1;
                    	            }
                    	            else if ( (LA20_2==RULE_ID) ) {
                    	                alt20=1;
                    	            }


                    	        }


                    	        switch (alt20) {
                    	    	case 1 :
                    	    	    // InternalDockerCompose.g:1170:11: otherlv_11= '-' ( (lv_aliases_12_0= ruleAlias ) )
                    	    	    {
                    	    	    otherlv_11=(Token)match(input,31,FOLLOW_5); 

                    	    	    											newLeafNode(otherlv_11, grammarAccess.getNetworkConnectorAccess().getHyphenMinusKeyword_1_2_2_1_0());
                    	    	    										
                    	    	    // InternalDockerCompose.g:1174:11: ( (lv_aliases_12_0= ruleAlias ) )
                    	    	    // InternalDockerCompose.g:1175:12: (lv_aliases_12_0= ruleAlias )
                    	    	    {
                    	    	    // InternalDockerCompose.g:1175:12: (lv_aliases_12_0= ruleAlias )
                    	    	    // InternalDockerCompose.g:1176:13: lv_aliases_12_0= ruleAlias
                    	    	    {

                    	    	    													newCompositeNode(grammarAccess.getNetworkConnectorAccess().getAliasesAliasParserRuleCall_1_2_2_1_1_0());
                    	    	    												
                    	    	    pushFollow(FOLLOW_26);
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
                    	    	    if ( cnt20 >= 1 ) break loop20;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(20, input);
                    	                throw eee;
                    	        }
                    	        cnt20++;
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalDockerCompose.g:1200:5: ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1200:5: ({...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) ) )
                    	    // InternalDockerCompose.g:1201:6: {...}? => ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2(), 3)");
                    	    }
                    	    // InternalDockerCompose.g:1201:116: ( ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) ) )
                    	    // InternalDockerCompose.g:1202:7: ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2(), 3);
                    	    						
                    	    // InternalDockerCompose.g:1205:10: ({...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ ) )
                    	    // InternalDockerCompose.g:1205:11: {...}? => (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetworkConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1205:20: (otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+ )
                    	    // InternalDockerCompose.g:1205:21: otherlv_13= 'link_local_ips:' (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+
                    	    {
                    	    otherlv_13=(Token)match(input,38,FOLLOW_14); 

                    	    										newLeafNode(otherlv_13, grammarAccess.getNetworkConnectorAccess().getLink_local_ipsKeyword_1_2_3_0());
                    	    									
                    	    // InternalDockerCompose.g:1209:10: (otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) ) )+
                    	    int cnt21=0;
                    	    loop21:
                    	    do {
                    	        int alt21=2;
                    	        int LA21_0 = input.LA(1);

                    	        if ( (LA21_0==31) ) {
                    	            int LA21_2 = input.LA(2);

                    	            if ( (LA21_2==RULE_INT) ) {
                    	                alt21=1;
                    	            }


                    	        }


                    	        switch (alt21) {
                    	    	case 1 :
                    	    	    // InternalDockerCompose.g:1210:11: otherlv_14= '-' ( (lv_link_local_ips_15_0= ruleDNS ) )
                    	    	    {
                    	    	    otherlv_14=(Token)match(input,31,FOLLOW_21); 

                    	    	    											newLeafNode(otherlv_14, grammarAccess.getNetworkConnectorAccess().getHyphenMinusKeyword_1_2_3_1_0());
                    	    	    										
                    	    	    // InternalDockerCompose.g:1214:11: ( (lv_link_local_ips_15_0= ruleDNS ) )
                    	    	    // InternalDockerCompose.g:1215:12: (lv_link_local_ips_15_0= ruleDNS )
                    	    	    {
                    	    	    // InternalDockerCompose.g:1215:12: (lv_link_local_ips_15_0= ruleDNS )
                    	    	    // InternalDockerCompose.g:1216:13: lv_link_local_ips_15_0= ruleDNS
                    	    	    {

                    	    	    													newCompositeNode(grammarAccess.getNetworkConnectorAccess().getLink_local_ipsDNSParserRuleCall_1_2_3_1_1_0());
                    	    	    												
                    	    	    pushFollow(FOLLOW_26);
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
                    	    	    if ( cnt21 >= 1 ) break loop21;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(21, input);
                    	                throw eee;
                    	        }
                    	        cnt21++;
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getNetworkConnectorAccess().getUnorderedGroup_1_2());
                    					

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
    // $ANTLR end "ruleNetworkConnector"


    // $ANTLR start "entryRuleAlias"
    // InternalDockerCompose.g:1252:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // InternalDockerCompose.g:1252:46: (iv_ruleAlias= ruleAlias EOF )
            // InternalDockerCompose.g:1253:2: iv_ruleAlias= ruleAlias EOF
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
    // InternalDockerCompose.g:1259:1: ruleAlias returns [EObject current=null] : ( () ( (lv_alias_1_0= ruleEString ) ) ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_alias_1_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1265:2: ( ( () ( (lv_alias_1_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:1266:2: ( () ( (lv_alias_1_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:1266:2: ( () ( (lv_alias_1_0= ruleEString ) ) )
            // InternalDockerCompose.g:1267:3: () ( (lv_alias_1_0= ruleEString ) )
            {
            // InternalDockerCompose.g:1267:3: ()
            // InternalDockerCompose.g:1268:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAliasAccess().getAliasAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1274:3: ( (lv_alias_1_0= ruleEString ) )
            // InternalDockerCompose.g:1275:4: (lv_alias_1_0= ruleEString )
            {
            // InternalDockerCompose.g:1275:4: (lv_alias_1_0= ruleEString )
            // InternalDockerCompose.g:1276:5: lv_alias_1_0= ruleEString
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
    // InternalDockerCompose.g:1297:1: entryRuleVolumeConnector returns [EObject current=null] : iv_ruleVolumeConnector= ruleVolumeConnector EOF ;
    public final EObject entryRuleVolumeConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumeConnector = null;


        try {
            // InternalDockerCompose.g:1297:56: (iv_ruleVolumeConnector= ruleVolumeConnector EOF )
            // InternalDockerCompose.g:1298:2: iv_ruleVolumeConnector= ruleVolumeConnector EOF
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
    // InternalDockerCompose.g:1304:1: ruleVolumeConnector returns [EObject current=null] : ( () ( ( ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ) ;
    public final EObject ruleVolumeConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_container_path_3_0 = null;

        Enumerator lv_access_mode_5_0 = null;

        Enumerator lv_type_10_0 = null;

        AntlrDatatypeRuleToken lv_container_path_12_0 = null;

        AntlrDatatypeRuleToken lv_read_only_14_0 = null;

        Enumerator lv_propagation_17_0 = null;

        AntlrDatatypeRuleToken lv_nocopy_20_0 = null;

        AntlrDatatypeRuleToken lv_size_23_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1310:2: ( ( () ( ( ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ) )
            // InternalDockerCompose.g:1311:2: ( () ( ( ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            {
            // InternalDockerCompose.g:1311:2: ( () ( ( ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalDockerCompose.g:1312:3: () ( ( ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalDockerCompose.g:1312:3: ()
            // InternalDockerCompose.g:1313:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeConnectorAccess().getVolumeConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1319:3: ( ( ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==29||(LA26_0>=39 && LA26_0<=42)||LA26_0==44||LA26_0==46) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalDockerCompose.g:1320:4: ( ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? )
                    {
                    // InternalDockerCompose.g:1320:4: ( ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )? )
                    // InternalDockerCompose.g:1321:5: ( ( ruleEString ) ) otherlv_2= ':' ( (lv_container_path_3_0= rulePATH ) ) (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )?
                    {
                    // InternalDockerCompose.g:1321:5: ( ( ruleEString ) )
                    // InternalDockerCompose.g:1322:6: ( ruleEString )
                    {
                    // InternalDockerCompose.g:1322:6: ( ruleEString )
                    // InternalDockerCompose.g:1323:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getVolumeConnectorRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getVolumeConnectorAccess().getVolumeVolumeCrossReference_1_0_0_0());
                    						
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,21,FOLLOW_27); 

                    					newLeafNode(otherlv_2, grammarAccess.getVolumeConnectorAccess().getColonKeyword_1_0_1());
                    				
                    // InternalDockerCompose.g:1341:5: ( (lv_container_path_3_0= rulePATH ) )
                    // InternalDockerCompose.g:1342:6: (lv_container_path_3_0= rulePATH )
                    {
                    // InternalDockerCompose.g:1342:6: (lv_container_path_3_0= rulePATH )
                    // InternalDockerCompose.g:1343:7: lv_container_path_3_0= rulePATH
                    {

                    							newCompositeNode(grammarAccess.getVolumeConnectorAccess().getContainer_pathPATHParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_24);
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

                    // InternalDockerCompose.g:1360:5: (otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==21) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalDockerCompose.g:1361:6: otherlv_4= ':' ( (lv_access_mode_5_0= ruleAccessMode ) )
                            {
                            otherlv_4=(Token)match(input,21,FOLLOW_28); 

                            						newLeafNode(otherlv_4, grammarAccess.getVolumeConnectorAccess().getColonKeyword_1_0_3_0());
                            					
                            // InternalDockerCompose.g:1365:6: ( (lv_access_mode_5_0= ruleAccessMode ) )
                            // InternalDockerCompose.g:1366:7: (lv_access_mode_5_0= ruleAccessMode )
                            {
                            // InternalDockerCompose.g:1366:7: (lv_access_mode_5_0= ruleAccessMode )
                            // InternalDockerCompose.g:1367:8: lv_access_mode_5_0= ruleAccessMode
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
                    // InternalDockerCompose.g:1387:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
                    {
                    // InternalDockerCompose.g:1387:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
                    // InternalDockerCompose.g:1388:5: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalDockerCompose.g:1388:5: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
                    // InternalDockerCompose.g:1389:6: ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1());
                    					
                    // InternalDockerCompose.g:1392:6: ( ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
                    // InternalDockerCompose.g:1393:7: ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) ) ) ) )+ {...}?
                    {
                    // InternalDockerCompose.g:1393:7: ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) ) ) ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=8;
                        alt25 = dfa25.predict(input);
                        switch (alt25) {
                    	case 1 :
                    	    // InternalDockerCompose.g:1394:5: ({...}? => ( ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1394:5: ({...}? => ( ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1395:6: {...}? => ( ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 0)");
                    	    }
                    	    // InternalDockerCompose.g:1395:115: ( ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) ) )
                    	    // InternalDockerCompose.g:1396:7: ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 0);
                    	    						
                    	    // InternalDockerCompose.g:1399:10: ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) )
                    	    // InternalDockerCompose.g:1399:11: {...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1399:20: (otherlv_7= 'source:' ( ( ruleEString ) ) )
                    	    // InternalDockerCompose.g:1399:21: otherlv_7= 'source:' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,39,FOLLOW_5); 

                    	    										newLeafNode(otherlv_7, grammarAccess.getVolumeConnectorAccess().getSourceKeyword_1_1_0_0());
                    	    									
                    	    // InternalDockerCompose.g:1403:10: ( ( ruleEString ) )
                    	    // InternalDockerCompose.g:1404:11: ( ruleEString )
                    	    {
                    	    // InternalDockerCompose.g:1404:11: ( ruleEString )
                    	    // InternalDockerCompose.g:1405:12: ruleEString
                    	    {

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getVolumeConnectorRule());
                    	    												}
                    	    											

                    	    												newCompositeNode(grammarAccess.getVolumeConnectorAccess().getVolumeVolumeCrossReference_1_1_0_1_0());
                    	    											
                    	    pushFollow(FOLLOW_29);
                    	    ruleEString();

                    	    state._fsp--;


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
                    	case 2 :
                    	    // InternalDockerCompose.g:1425:5: ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1425:5: ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1426:6: {...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 1)");
                    	    }
                    	    // InternalDockerCompose.g:1426:115: ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) )
                    	    // InternalDockerCompose.g:1427:7: ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 1);
                    	    						
                    	    // InternalDockerCompose.g:1430:10: ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) )
                    	    // InternalDockerCompose.g:1430:11: {...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1430:20: (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) )
                    	    // InternalDockerCompose.g:1430:21: otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) )
                    	    {
                    	    otherlv_9=(Token)match(input,40,FOLLOW_30); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getVolumeConnectorAccess().getTypeKeyword_1_1_1_0());
                    	    									
                    	    // InternalDockerCompose.g:1434:10: ( (lv_type_10_0= ruleMountType ) )
                    	    // InternalDockerCompose.g:1435:11: (lv_type_10_0= ruleMountType )
                    	    {
                    	    // InternalDockerCompose.g:1435:11: (lv_type_10_0= ruleMountType )
                    	    // InternalDockerCompose.g:1436:12: lv_type_10_0= ruleMountType
                    	    {

                    	    												newCompositeNode(grammarAccess.getVolumeConnectorAccess().getTypeMountTypeEnumRuleCall_1_1_1_1_0());
                    	    											
                    	    pushFollow(FOLLOW_29);
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
                    	    // InternalDockerCompose.g:1459:5: ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1459:5: ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1460:6: {...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 2)");
                    	    }
                    	    // InternalDockerCompose.g:1460:115: ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) )
                    	    // InternalDockerCompose.g:1461:7: ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 2);
                    	    						
                    	    // InternalDockerCompose.g:1464:10: ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) )
                    	    // InternalDockerCompose.g:1464:11: {...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1464:20: (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) )
                    	    // InternalDockerCompose.g:1464:21: otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) )
                    	    {
                    	    otherlv_11=(Token)match(input,41,FOLLOW_31); 

                    	    										newLeafNode(otherlv_11, grammarAccess.getVolumeConnectorAccess().getTargetKeyword_1_1_2_0());
                    	    									
                    	    // InternalDockerCompose.g:1468:10: ( (lv_container_path_12_0= rulePATH ) )
                    	    // InternalDockerCompose.g:1469:11: (lv_container_path_12_0= rulePATH )
                    	    {
                    	    // InternalDockerCompose.g:1469:11: (lv_container_path_12_0= rulePATH )
                    	    // InternalDockerCompose.g:1470:12: lv_container_path_12_0= rulePATH
                    	    {

                    	    												newCompositeNode(grammarAccess.getVolumeConnectorAccess().getContainer_pathPATHParserRuleCall_1_1_2_1_0());
                    	    											
                    	    pushFollow(FOLLOW_29);
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
                    	    // InternalDockerCompose.g:1493:5: ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1493:5: ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1494:6: {...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 3)");
                    	    }
                    	    // InternalDockerCompose.g:1494:115: ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:1495:7: ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 3);
                    	    						
                    	    // InternalDockerCompose.g:1498:10: ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:1498:11: {...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1498:20: (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:1498:21: otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_13=(Token)match(input,29,FOLLOW_13); 

                    	    										newLeafNode(otherlv_13, grammarAccess.getVolumeConnectorAccess().getRead_onlyKeyword_1_1_3_0());
                    	    									
                    	    // InternalDockerCompose.g:1502:10: ( (lv_read_only_14_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:1503:11: (lv_read_only_14_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:1503:11: (lv_read_only_14_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:1504:12: lv_read_only_14_0= ruleEBoolean
                    	    {

                    	    												newCompositeNode(grammarAccess.getVolumeConnectorAccess().getRead_onlyEBooleanParserRuleCall_1_1_3_1_0());
                    	    											
                    	    pushFollow(FOLLOW_29);
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
                    	    // InternalDockerCompose.g:1527:5: ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1527:5: ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1528:6: {...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 4)");
                    	    }
                    	    // InternalDockerCompose.g:1528:115: ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) )
                    	    // InternalDockerCompose.g:1529:7: ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 4);
                    	    						
                    	    // InternalDockerCompose.g:1532:10: ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) )
                    	    // InternalDockerCompose.g:1532:11: {...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1532:20: (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) )
                    	    // InternalDockerCompose.g:1532:21: otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) )
                    	    {
                    	    otherlv_15=(Token)match(input,42,FOLLOW_32); 

                    	    										newLeafNode(otherlv_15, grammarAccess.getVolumeConnectorAccess().getBindKeyword_1_1_4_0());
                    	    									
                    	    otherlv_16=(Token)match(input,43,FOLLOW_33); 

                    	    										newLeafNode(otherlv_16, grammarAccess.getVolumeConnectorAccess().getPropagationKeyword_1_1_4_1());
                    	    									
                    	    // InternalDockerCompose.g:1540:10: ( (lv_propagation_17_0= rulePropagationType ) )
                    	    // InternalDockerCompose.g:1541:11: (lv_propagation_17_0= rulePropagationType )
                    	    {
                    	    // InternalDockerCompose.g:1541:11: (lv_propagation_17_0= rulePropagationType )
                    	    // InternalDockerCompose.g:1542:12: lv_propagation_17_0= rulePropagationType
                    	    {

                    	    												newCompositeNode(grammarAccess.getVolumeConnectorAccess().getPropagationPropagationTypeEnumRuleCall_1_1_4_2_0());
                    	    											
                    	    pushFollow(FOLLOW_29);
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
                    	    // InternalDockerCompose.g:1565:5: ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1565:5: ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1566:6: {...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 5)");
                    	    }
                    	    // InternalDockerCompose.g:1566:115: ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:1567:7: ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 5);
                    	    						
                    	    // InternalDockerCompose.g:1570:10: ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:1570:11: {...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1570:20: (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:1570:21: otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_18=(Token)match(input,44,FOLLOW_34); 

                    	    										newLeafNode(otherlv_18, grammarAccess.getVolumeConnectorAccess().getVolumeKeyword_1_1_5_0());
                    	    									
                    	    otherlv_19=(Token)match(input,45,FOLLOW_13); 

                    	    										newLeafNode(otherlv_19, grammarAccess.getVolumeConnectorAccess().getNocopyKeyword_1_1_5_1());
                    	    									
                    	    // InternalDockerCompose.g:1578:10: ( (lv_nocopy_20_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:1579:11: (lv_nocopy_20_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:1579:11: (lv_nocopy_20_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:1580:12: lv_nocopy_20_0= ruleEBoolean
                    	    {

                    	    												newCompositeNode(grammarAccess.getVolumeConnectorAccess().getNocopyEBooleanParserRuleCall_1_1_5_2_0());
                    	    											
                    	    pushFollow(FOLLOW_29);
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
                    	    // InternalDockerCompose.g:1603:5: ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1603:5: ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1604:6: {...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 6) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 6)");
                    	    }
                    	    // InternalDockerCompose.g:1604:115: ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) ) )
                    	    // InternalDockerCompose.g:1605:7: ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 6);
                    	    						
                    	    // InternalDockerCompose.g:1608:10: ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) )
                    	    // InternalDockerCompose.g:1608:11: {...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleVolumeConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1608:20: (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) )
                    	    // InternalDockerCompose.g:1608:21: otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) )
                    	    {
                    	    otherlv_21=(Token)match(input,46,FOLLOW_35); 

                    	    										newLeafNode(otherlv_21, grammarAccess.getVolumeConnectorAccess().getTmpfsKeyword_1_1_6_0());
                    	    									
                    	    otherlv_22=(Token)match(input,47,FOLLOW_11); 

                    	    										newLeafNode(otherlv_22, grammarAccess.getVolumeConnectorAccess().getSizeKeyword_1_1_6_1());
                    	    									
                    	    // InternalDockerCompose.g:1616:10: ( (lv_size_23_0= ruleEInt ) )
                    	    // InternalDockerCompose.g:1617:11: (lv_size_23_0= ruleEInt )
                    	    {
                    	    // InternalDockerCompose.g:1617:11: (lv_size_23_0= ruleEInt )
                    	    // InternalDockerCompose.g:1618:12: lv_size_23_0= ruleEInt
                    	    {

                    	    												newCompositeNode(grammarAccess.getVolumeConnectorAccess().getSizeEIntParserRuleCall_1_1_6_2_0());
                    	    											
                    	    pushFollow(FOLLOW_29);
                    	    lv_size_23_0=ruleEInt();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getVolumeConnectorRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"size",
                    	    													lv_size_23_0,
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
                    	    if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
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
    // InternalDockerCompose.g:1654:1: entryRuleConfigConnector returns [EObject current=null] : iv_ruleConfigConnector= ruleConfigConnector EOF ;
    public final EObject entryRuleConfigConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigConnector = null;


        try {
            // InternalDockerCompose.g:1654:56: (iv_ruleConfigConnector= ruleConfigConnector EOF )
            // InternalDockerCompose.g:1655:2: iv_ruleConfigConnector= ruleConfigConnector EOF
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
    // InternalDockerCompose.g:1661:1: ruleConfigConnector returns [EObject current=null] : ( () ( ( ( ruleEString ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ) ;
    public final EObject ruleConfigConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_uid_8_0=null;
        Token otherlv_9=null;
        Token lv_gid_10_0=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_target_6_0 = null;

        AntlrDatatypeRuleToken lv_mode_12_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1667:2: ( ( () ( ( ( ruleEString ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ) )
            // InternalDockerCompose.g:1668:2: ( () ( ( ( ruleEString ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            {
            // InternalDockerCompose.g:1668:2: ( () ( ( ( ruleEString ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalDockerCompose.g:1669:3: () ( ( ( ruleEString ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalDockerCompose.g:1669:3: ()
            // InternalDockerCompose.g:1670:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigConnectorAccess().getConfigConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1676:3: ( ( ( ruleEString ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID||LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( (LA28_0==39||LA28_0==41||(LA28_0>=48 && LA28_0<=50)) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalDockerCompose.g:1677:4: ( ( ruleEString ) )
                    {
                    // InternalDockerCompose.g:1677:4: ( ( ruleEString ) )
                    // InternalDockerCompose.g:1678:5: ( ruleEString )
                    {
                    // InternalDockerCompose.g:1678:5: ( ruleEString )
                    // InternalDockerCompose.g:1679:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfigConnectorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConfigConnectorAccess().getConfigConfigCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:1694:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
                    {
                    // InternalDockerCompose.g:1694:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
                    // InternalDockerCompose.g:1695:5: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalDockerCompose.g:1695:5: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
                    // InternalDockerCompose.g:1696:6: ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1());
                    					
                    // InternalDockerCompose.g:1699:6: ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
                    // InternalDockerCompose.g:1700:7: ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?
                    {
                    // InternalDockerCompose.g:1700:7: ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=6;
                        int LA27_0 = input.LA(1);

                        if ( LA27_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 0) ) {
                            alt27=1;
                        }
                        else if ( LA27_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 1) ) {
                            alt27=2;
                        }
                        else if ( LA27_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 2) ) {
                            alt27=3;
                        }
                        else if ( LA27_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 3) ) {
                            alt27=4;
                        }
                        else if ( LA27_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 4) ) {
                            alt27=5;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalDockerCompose.g:1701:5: ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1701:5: ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1702:6: {...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleConfigConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 0)");
                    	    }
                    	    // InternalDockerCompose.g:1702:115: ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) )
                    	    // InternalDockerCompose.g:1703:7: ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 0);
                    	    						
                    	    // InternalDockerCompose.g:1706:10: ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) )
                    	    // InternalDockerCompose.g:1706:11: {...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleConfigConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1706:20: (otherlv_3= 'source:' ( ( ruleEString ) ) )
                    	    // InternalDockerCompose.g:1706:21: otherlv_3= 'source:' ( ( ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,39,FOLLOW_5); 

                    	    										newLeafNode(otherlv_3, grammarAccess.getConfigConnectorAccess().getSourceKeyword_1_1_0_0());
                    	    									
                    	    // InternalDockerCompose.g:1710:10: ( ( ruleEString ) )
                    	    // InternalDockerCompose.g:1711:11: ( ruleEString )
                    	    {
                    	    // InternalDockerCompose.g:1711:11: ( ruleEString )
                    	    // InternalDockerCompose.g:1712:12: ruleEString
                    	    {

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getConfigConnectorRule());
                    	    												}
                    	    											

                    	    												newCompositeNode(grammarAccess.getConfigConnectorAccess().getConfigConfigCrossReference_1_1_0_1_0());
                    	    											
                    	    pushFollow(FOLLOW_36);
                    	    ruleEString();

                    	    state._fsp--;


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
                    	case 2 :
                    	    // InternalDockerCompose.g:1732:5: ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1732:5: ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1733:6: {...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleConfigConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 1)");
                    	    }
                    	    // InternalDockerCompose.g:1733:115: ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) )
                    	    // InternalDockerCompose.g:1734:7: ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 1);
                    	    						
                    	    // InternalDockerCompose.g:1737:10: ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) )
                    	    // InternalDockerCompose.g:1737:11: {...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleConfigConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1737:20: (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) )
                    	    // InternalDockerCompose.g:1737:21: otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) )
                    	    {
                    	    otherlv_5=(Token)match(input,41,FOLLOW_37); 

                    	    										newLeafNode(otherlv_5, grammarAccess.getConfigConnectorAccess().getTargetKeyword_1_1_1_0());
                    	    									
                    	    // InternalDockerCompose.g:1741:10: ( (lv_target_6_0= rulePATH ) )
                    	    // InternalDockerCompose.g:1742:11: (lv_target_6_0= rulePATH )
                    	    {
                    	    // InternalDockerCompose.g:1742:11: (lv_target_6_0= rulePATH )
                    	    // InternalDockerCompose.g:1743:12: lv_target_6_0= rulePATH
                    	    {

                    	    												newCompositeNode(grammarAccess.getConfigConnectorAccess().getTargetPATHParserRuleCall_1_1_1_1_0());
                    	    											
                    	    pushFollow(FOLLOW_36);
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
                    	    // InternalDockerCompose.g:1766:5: ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1766:5: ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1767:6: {...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleConfigConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 2)");
                    	    }
                    	    // InternalDockerCompose.g:1767:115: ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) )
                    	    // InternalDockerCompose.g:1768:7: ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 2);
                    	    						
                    	    // InternalDockerCompose.g:1771:10: ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) )
                    	    // InternalDockerCompose.g:1771:11: {...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleConfigConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1771:20: (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) )
                    	    // InternalDockerCompose.g:1771:21: otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) )
                    	    {
                    	    otherlv_7=(Token)match(input,48,FOLLOW_38); 

                    	    										newLeafNode(otherlv_7, grammarAccess.getConfigConnectorAccess().getUidKeyword_1_1_2_0());
                    	    									
                    	    // InternalDockerCompose.g:1775:10: ( (lv_uid_8_0= RULE_QUOTED_INT ) )
                    	    // InternalDockerCompose.g:1776:11: (lv_uid_8_0= RULE_QUOTED_INT )
                    	    {
                    	    // InternalDockerCompose.g:1776:11: (lv_uid_8_0= RULE_QUOTED_INT )
                    	    // InternalDockerCompose.g:1777:12: lv_uid_8_0= RULE_QUOTED_INT
                    	    {
                    	    lv_uid_8_0=(Token)match(input,RULE_QUOTED_INT,FOLLOW_36); 

                    	    												newLeafNode(lv_uid_8_0, grammarAccess.getConfigConnectorAccess().getUidQUOTED_INTTerminalRuleCall_1_1_2_1_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getConfigConnectorRule());
                    	    												}
                    	    												setWithLastConsumed(
                    	    													current,
                    	    													"uid",
                    	    													lv_uid_8_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.QUOTED_INT");
                    	    											

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
                    	    // InternalDockerCompose.g:1799:5: ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1799:5: ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1800:6: {...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleConfigConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 3)");
                    	    }
                    	    // InternalDockerCompose.g:1800:115: ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) )
                    	    // InternalDockerCompose.g:1801:7: ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 3);
                    	    						
                    	    // InternalDockerCompose.g:1804:10: ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) )
                    	    // InternalDockerCompose.g:1804:11: {...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleConfigConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1804:20: (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) )
                    	    // InternalDockerCompose.g:1804:21: otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) )
                    	    {
                    	    otherlv_9=(Token)match(input,49,FOLLOW_38); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getConfigConnectorAccess().getGidKeyword_1_1_3_0());
                    	    									
                    	    // InternalDockerCompose.g:1808:10: ( (lv_gid_10_0= RULE_QUOTED_INT ) )
                    	    // InternalDockerCompose.g:1809:11: (lv_gid_10_0= RULE_QUOTED_INT )
                    	    {
                    	    // InternalDockerCompose.g:1809:11: (lv_gid_10_0= RULE_QUOTED_INT )
                    	    // InternalDockerCompose.g:1810:12: lv_gid_10_0= RULE_QUOTED_INT
                    	    {
                    	    lv_gid_10_0=(Token)match(input,RULE_QUOTED_INT,FOLLOW_36); 

                    	    												newLeafNode(lv_gid_10_0, grammarAccess.getConfigConnectorAccess().getGidQUOTED_INTTerminalRuleCall_1_1_3_1_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getConfigConnectorRule());
                    	    												}
                    	    												setWithLastConsumed(
                    	    													current,
                    	    													"gid",
                    	    													lv_gid_10_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.QUOTED_INT");
                    	    											

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
                    	    // InternalDockerCompose.g:1832:5: ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1832:5: ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1833:6: {...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleConfigConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 4)");
                    	    }
                    	    // InternalDockerCompose.g:1833:115: ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) )
                    	    // InternalDockerCompose.g:1834:7: ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getConfigConnectorAccess().getUnorderedGroup_1_1(), 4);
                    	    						
                    	    // InternalDockerCompose.g:1837:10: ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) )
                    	    // InternalDockerCompose.g:1837:11: {...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleConfigConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1837:20: (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) )
                    	    // InternalDockerCompose.g:1837:21: otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) )
                    	    {
                    	    otherlv_11=(Token)match(input,50,FOLLOW_11); 

                    	    										newLeafNode(otherlv_11, grammarAccess.getConfigConnectorAccess().getModeKeyword_1_1_4_0());
                    	    									
                    	    // InternalDockerCompose.g:1841:10: ( (lv_mode_12_0= ruleEInt ) )
                    	    // InternalDockerCompose.g:1842:11: (lv_mode_12_0= ruleEInt )
                    	    {
                    	    // InternalDockerCompose.g:1842:11: (lv_mode_12_0= ruleEInt )
                    	    // InternalDockerCompose.g:1843:12: lv_mode_12_0= ruleEInt
                    	    {

                    	    												newCompositeNode(grammarAccess.getConfigConnectorAccess().getModeEIntParserRuleCall_1_1_4_1_0());
                    	    											
                    	    pushFollow(FOLLOW_36);
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
                    	    if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
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
    // InternalDockerCompose.g:1879:1: entryRuleSecretConnector returns [EObject current=null] : iv_ruleSecretConnector= ruleSecretConnector EOF ;
    public final EObject entryRuleSecretConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecretConnector = null;


        try {
            // InternalDockerCompose.g:1879:56: (iv_ruleSecretConnector= ruleSecretConnector EOF )
            // InternalDockerCompose.g:1880:2: iv_ruleSecretConnector= ruleSecretConnector EOF
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
    // InternalDockerCompose.g:1886:1: ruleSecretConnector returns [EObject current=null] : ( () ( ( ( ruleEString ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ) ;
    public final EObject ruleSecretConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_uid_8_0=null;
        Token otherlv_9=null;
        Token lv_gid_10_0=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_target_6_0 = null;

        AntlrDatatypeRuleToken lv_mode_12_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:1892:2: ( ( () ( ( ( ruleEString ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) ) )
            // InternalDockerCompose.g:1893:2: ( () ( ( ( ruleEString ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            {
            // InternalDockerCompose.g:1893:2: ( () ( ( ( ruleEString ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalDockerCompose.g:1894:3: () ( ( ( ruleEString ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalDockerCompose.g:1894:3: ()
            // InternalDockerCompose.g:1895:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecretConnectorAccess().getSecretConnectorAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:1901:3: ( ( ( ruleEString ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            else if ( (LA30_0==39||LA30_0==41||(LA30_0>=48 && LA30_0<=50)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalDockerCompose.g:1902:4: ( ( ruleEString ) )
                    {
                    // InternalDockerCompose.g:1902:4: ( ( ruleEString ) )
                    // InternalDockerCompose.g:1903:5: ( ruleEString )
                    {
                    // InternalDockerCompose.g:1903:5: ( ruleEString )
                    // InternalDockerCompose.g:1904:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSecretConnectorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSecretConnectorAccess().getSecretSecretCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:1919:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
                    {
                    // InternalDockerCompose.g:1919:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
                    // InternalDockerCompose.g:1920:5: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalDockerCompose.g:1920:5: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
                    // InternalDockerCompose.g:1921:6: ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1());
                    					
                    // InternalDockerCompose.g:1924:6: ( ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
                    // InternalDockerCompose.g:1925:7: ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+ {...}?
                    {
                    // InternalDockerCompose.g:1925:7: ( ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=6;
                        int LA29_0 = input.LA(1);

                        if ( LA29_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 0) ) {
                            alt29=1;
                        }
                        else if ( LA29_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 1) ) {
                            alt29=2;
                        }
                        else if ( LA29_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 2) ) {
                            alt29=3;
                        }
                        else if ( LA29_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 3) ) {
                            alt29=4;
                        }
                        else if ( LA29_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 4) ) {
                            alt29=5;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalDockerCompose.g:1926:5: ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1926:5: ({...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1927:6: {...}? => ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleSecretConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 0)");
                    	    }
                    	    // InternalDockerCompose.g:1927:115: ( ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) ) )
                    	    // InternalDockerCompose.g:1928:7: ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 0);
                    	    						
                    	    // InternalDockerCompose.g:1931:10: ({...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) ) )
                    	    // InternalDockerCompose.g:1931:11: {...}? => (otherlv_3= 'source:' ( ( ruleEString ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSecretConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1931:20: (otherlv_3= 'source:' ( ( ruleEString ) ) )
                    	    // InternalDockerCompose.g:1931:21: otherlv_3= 'source:' ( ( ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,39,FOLLOW_5); 

                    	    										newLeafNode(otherlv_3, grammarAccess.getSecretConnectorAccess().getSourceKeyword_1_1_0_0());
                    	    									
                    	    // InternalDockerCompose.g:1935:10: ( ( ruleEString ) )
                    	    // InternalDockerCompose.g:1936:11: ( ruleEString )
                    	    {
                    	    // InternalDockerCompose.g:1936:11: ( ruleEString )
                    	    // InternalDockerCompose.g:1937:12: ruleEString
                    	    {

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getSecretConnectorRule());
                    	    												}
                    	    											

                    	    												newCompositeNode(grammarAccess.getSecretConnectorAccess().getSecretSecretCrossReference_1_1_0_1_0());
                    	    											
                    	    pushFollow(FOLLOW_36);
                    	    ruleEString();

                    	    state._fsp--;


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
                    	case 2 :
                    	    // InternalDockerCompose.g:1957:5: ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1957:5: ({...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1958:6: {...}? => ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleSecretConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 1)");
                    	    }
                    	    // InternalDockerCompose.g:1958:115: ( ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) ) )
                    	    // InternalDockerCompose.g:1959:7: ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 1);
                    	    						
                    	    // InternalDockerCompose.g:1962:10: ({...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) ) )
                    	    // InternalDockerCompose.g:1962:11: {...}? => (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSecretConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1962:20: (otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) ) )
                    	    // InternalDockerCompose.g:1962:21: otherlv_5= 'target:' ( (lv_target_6_0= rulePATH ) )
                    	    {
                    	    otherlv_5=(Token)match(input,41,FOLLOW_37); 

                    	    										newLeafNode(otherlv_5, grammarAccess.getSecretConnectorAccess().getTargetKeyword_1_1_1_0());
                    	    									
                    	    // InternalDockerCompose.g:1966:10: ( (lv_target_6_0= rulePATH ) )
                    	    // InternalDockerCompose.g:1967:11: (lv_target_6_0= rulePATH )
                    	    {
                    	    // InternalDockerCompose.g:1967:11: (lv_target_6_0= rulePATH )
                    	    // InternalDockerCompose.g:1968:12: lv_target_6_0= rulePATH
                    	    {

                    	    												newCompositeNode(grammarAccess.getSecretConnectorAccess().getTargetPATHParserRuleCall_1_1_1_1_0());
                    	    											
                    	    pushFollow(FOLLOW_36);
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
                    	    // InternalDockerCompose.g:1991:5: ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:1991:5: ({...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) ) )
                    	    // InternalDockerCompose.g:1992:6: {...}? => ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleSecretConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 2)");
                    	    }
                    	    // InternalDockerCompose.g:1992:115: ( ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) ) )
                    	    // InternalDockerCompose.g:1993:7: ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 2);
                    	    						
                    	    // InternalDockerCompose.g:1996:10: ({...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) ) )
                    	    // InternalDockerCompose.g:1996:11: {...}? => (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSecretConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:1996:20: (otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) ) )
                    	    // InternalDockerCompose.g:1996:21: otherlv_7= 'uid:' ( (lv_uid_8_0= RULE_QUOTED_INT ) )
                    	    {
                    	    otherlv_7=(Token)match(input,48,FOLLOW_38); 

                    	    										newLeafNode(otherlv_7, grammarAccess.getSecretConnectorAccess().getUidKeyword_1_1_2_0());
                    	    									
                    	    // InternalDockerCompose.g:2000:10: ( (lv_uid_8_0= RULE_QUOTED_INT ) )
                    	    // InternalDockerCompose.g:2001:11: (lv_uid_8_0= RULE_QUOTED_INT )
                    	    {
                    	    // InternalDockerCompose.g:2001:11: (lv_uid_8_0= RULE_QUOTED_INT )
                    	    // InternalDockerCompose.g:2002:12: lv_uid_8_0= RULE_QUOTED_INT
                    	    {
                    	    lv_uid_8_0=(Token)match(input,RULE_QUOTED_INT,FOLLOW_36); 

                    	    												newLeafNode(lv_uid_8_0, grammarAccess.getSecretConnectorAccess().getUidQUOTED_INTTerminalRuleCall_1_1_2_1_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getSecretConnectorRule());
                    	    												}
                    	    												setWithLastConsumed(
                    	    													current,
                    	    													"uid",
                    	    													lv_uid_8_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.QUOTED_INT");
                    	    											

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
                    	    // InternalDockerCompose.g:2024:5: ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2024:5: ({...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2025:6: {...}? => ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleSecretConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 3)");
                    	    }
                    	    // InternalDockerCompose.g:2025:115: ( ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) ) )
                    	    // InternalDockerCompose.g:2026:7: ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 3);
                    	    						
                    	    // InternalDockerCompose.g:2029:10: ({...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) ) )
                    	    // InternalDockerCompose.g:2029:11: {...}? => (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSecretConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:2029:20: (otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) ) )
                    	    // InternalDockerCompose.g:2029:21: otherlv_9= 'gid:' ( (lv_gid_10_0= RULE_QUOTED_INT ) )
                    	    {
                    	    otherlv_9=(Token)match(input,49,FOLLOW_38); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getSecretConnectorAccess().getGidKeyword_1_1_3_0());
                    	    									
                    	    // InternalDockerCompose.g:2033:10: ( (lv_gid_10_0= RULE_QUOTED_INT ) )
                    	    // InternalDockerCompose.g:2034:11: (lv_gid_10_0= RULE_QUOTED_INT )
                    	    {
                    	    // InternalDockerCompose.g:2034:11: (lv_gid_10_0= RULE_QUOTED_INT )
                    	    // InternalDockerCompose.g:2035:12: lv_gid_10_0= RULE_QUOTED_INT
                    	    {
                    	    lv_gid_10_0=(Token)match(input,RULE_QUOTED_INT,FOLLOW_36); 

                    	    												newLeafNode(lv_gid_10_0, grammarAccess.getSecretConnectorAccess().getGidQUOTED_INTTerminalRuleCall_1_1_3_1_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getSecretConnectorRule());
                    	    												}
                    	    												setWithLastConsumed(
                    	    													current,
                    	    													"gid",
                    	    													lv_gid_10_0,
                    	    													"org.xtext.example.dockercompose.DockerCompose.QUOTED_INT");
                    	    											

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
                    	    // InternalDockerCompose.g:2057:5: ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2057:5: ({...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2058:6: {...}? => ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleSecretConnector", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 4)");
                    	    }
                    	    // InternalDockerCompose.g:2058:115: ( ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) ) )
                    	    // InternalDockerCompose.g:2059:7: ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getSecretConnectorAccess().getUnorderedGroup_1_1(), 4);
                    	    						
                    	    // InternalDockerCompose.g:2062:10: ({...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) ) )
                    	    // InternalDockerCompose.g:2062:11: {...}? => (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSecretConnector", "true");
                    	    }
                    	    // InternalDockerCompose.g:2062:20: (otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) ) )
                    	    // InternalDockerCompose.g:2062:21: otherlv_11= 'mode:' ( (lv_mode_12_0= ruleEInt ) )
                    	    {
                    	    otherlv_11=(Token)match(input,50,FOLLOW_11); 

                    	    										newLeafNode(otherlv_11, grammarAccess.getSecretConnectorAccess().getModeKeyword_1_1_4_0());
                    	    									
                    	    // InternalDockerCompose.g:2066:10: ( (lv_mode_12_0= ruleEInt ) )
                    	    // InternalDockerCompose.g:2067:11: (lv_mode_12_0= ruleEInt )
                    	    {
                    	    // InternalDockerCompose.g:2067:11: (lv_mode_12_0= ruleEInt )
                    	    // InternalDockerCompose.g:2068:12: lv_mode_12_0= ruleEInt
                    	    {

                    	    												newCompositeNode(grammarAccess.getSecretConnectorAccess().getModeEIntParserRuleCall_1_1_4_1_0());
                    	    											
                    	    pushFollow(FOLLOW_36);
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
                    	    if ( cnt29 >= 1 ) break loop29;
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
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
    // InternalDockerCompose.g:2104:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // InternalDockerCompose.g:2104:48: (iv_ruleNetwork= ruleNetwork EOF )
            // InternalDockerCompose.g:2105:2: iv_ruleNetwork= ruleNetwork EOF
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
    // InternalDockerCompose.g:2111:1: ruleNetwork returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) ) ) ;
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
            // InternalDockerCompose.g:2117:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) ) ) )
            // InternalDockerCompose.g:2118:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) ) )
            {
            // InternalDockerCompose.g:2118:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:2119:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:2119:3: ()
            // InternalDockerCompose.g:2120:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkAccess().getNetworkAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2126:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:2127:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:2127:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:2128:5: lv_name_1_0= ruleEString
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
            		
            // InternalDockerCompose.g:2149:3: ( (otherlv_3= '{' otherlv_4= '}' ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            else if ( (LA34_0==EOF||LA34_0==RULE_ID||LA34_0==RULE_STRING||(LA34_0>=15 && LA34_0<=20)||(LA34_0>=53 && LA34_0<=61)) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalDockerCompose.g:2150:4: (otherlv_3= '{' otherlv_4= '}' )
                    {
                    // InternalDockerCompose.g:2150:4: (otherlv_3= '{' otherlv_4= '}' )
                    // InternalDockerCompose.g:2151:5: otherlv_3= '{' otherlv_4= '}'
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_40); 

                    					newLeafNode(otherlv_3, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_3_0_0());
                    				
                    otherlv_4=(Token)match(input,52,FOLLOW_2); 

                    					newLeafNode(otherlv_4, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_3_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:2161:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) )
                    {
                    // InternalDockerCompose.g:2161:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) ) )
                    // InternalDockerCompose.g:2162:5: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) )
                    {
                    // InternalDockerCompose.g:2162:5: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* ) )
                    // InternalDockerCompose.g:2163:6: ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    					
                    // InternalDockerCompose.g:2166:6: ( ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )* )
                    // InternalDockerCompose.g:2167:7: ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )*
                    {
                    // InternalDockerCompose.g:2167:7: ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )*
                    loop33:
                    do {
                        int alt33=10;
                        alt33 = dfa33.predict(input);
                        switch (alt33) {
                    	case 1 :
                    	    // InternalDockerCompose.g:2168:5: ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2168:5: ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2169:6: {...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 0)");
                    	    }
                    	    // InternalDockerCompose.g:2169:107: ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) )
                    	    // InternalDockerCompose.g:2170:7: ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 0);
                    	    						
                    	    // InternalDockerCompose.g:2173:10: ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) )
                    	    // InternalDockerCompose.g:2173:11: {...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2173:20: (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) )
                    	    // InternalDockerCompose.g:2173:21: otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,53,FOLLOW_5); 

                    	    										newLeafNode(otherlv_6, grammarAccess.getNetworkAccess().getDriverKeyword_3_1_0_0());
                    	    									
                    	    // InternalDockerCompose.g:2177:10: ( (lv_driver_7_0= ruleEString ) )
                    	    // InternalDockerCompose.g:2178:11: (lv_driver_7_0= ruleEString )
                    	    {
                    	    // InternalDockerCompose.g:2178:11: (lv_driver_7_0= ruleEString )
                    	    // InternalDockerCompose.g:2179:12: lv_driver_7_0= ruleEString
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
                    	    // InternalDockerCompose.g:2202:5: ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2202:5: ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2203:6: {...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 1)");
                    	    }
                    	    // InternalDockerCompose.g:2203:107: ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:2204:7: ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 1);
                    	    						
                    	    // InternalDockerCompose.g:2207:10: ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:2207:11: {...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2207:20: (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:2207:21: otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_8=(Token)match(input,54,FOLLOW_13); 

                    	    										newLeafNode(otherlv_8, grammarAccess.getNetworkAccess().getAttachableKeyword_3_1_1_0());
                    	    									
                    	    // InternalDockerCompose.g:2211:10: ( (lv_attachable_9_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:2212:11: (lv_attachable_9_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:2212:11: (lv_attachable_9_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:2213:12: lv_attachable_9_0= ruleEBoolean
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
                    	    // InternalDockerCompose.g:2236:5: ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2236:5: ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2237:6: {...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 2)");
                    	    }
                    	    // InternalDockerCompose.g:2237:107: ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:2238:7: ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 2);
                    	    						
                    	    // InternalDockerCompose.g:2241:10: ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:2241:11: {...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2241:20: (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:2241:21: otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_10=(Token)match(input,55,FOLLOW_13); 

                    	    										newLeafNode(otherlv_10, grammarAccess.getNetworkAccess().getEnable_ipv6Keyword_3_1_2_0());
                    	    									
                    	    // InternalDockerCompose.g:2245:10: ( (lv_enable_ipv6_11_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:2246:11: (lv_enable_ipv6_11_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:2246:11: (lv_enable_ipv6_11_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:2247:12: lv_enable_ipv6_11_0= ruleEBoolean
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
                    	    // InternalDockerCompose.g:2270:5: ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2270:5: ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2271:6: {...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 3)");
                    	    }
                    	    // InternalDockerCompose.g:2271:107: ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:2272:7: ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 3);
                    	    						
                    	    // InternalDockerCompose.g:2275:10: ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:2275:11: {...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2275:20: (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:2275:21: otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_12=(Token)match(input,56,FOLLOW_13); 

                    	    										newLeafNode(otherlv_12, grammarAccess.getNetworkAccess().getInternalKeyword_3_1_3_0());
                    	    									
                    	    // InternalDockerCompose.g:2279:10: ( (lv_internal_13_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:2280:11: (lv_internal_13_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:2280:11: (lv_internal_13_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:2281:12: lv_internal_13_0= ruleEBoolean
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
                    	    // InternalDockerCompose.g:2304:5: ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2304:5: ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2305:6: {...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 4)");
                    	    }
                    	    // InternalDockerCompose.g:2305:107: ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) )
                    	    // InternalDockerCompose.g:2306:7: ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 4);
                    	    						
                    	    // InternalDockerCompose.g:2309:10: ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) )
                    	    // InternalDockerCompose.g:2309:11: {...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2309:20: (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) )
                    	    // InternalDockerCompose.g:2309:21: otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_14=(Token)match(input,57,FOLLOW_13); 

                    	    										newLeafNode(otherlv_14, grammarAccess.getNetworkAccess().getExternalKeyword_3_1_4_0());
                    	    									
                    	    // InternalDockerCompose.g:2313:10: ( (lv_external_15_0= ruleEBoolean ) )
                    	    // InternalDockerCompose.g:2314:11: (lv_external_15_0= ruleEBoolean )
                    	    {
                    	    // InternalDockerCompose.g:2314:11: (lv_external_15_0= ruleEBoolean )
                    	    // InternalDockerCompose.g:2315:12: lv_external_15_0= ruleEBoolean
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
                    	    // InternalDockerCompose.g:2338:5: ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2338:5: ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2339:6: {...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 5)");
                    	    }
                    	    // InternalDockerCompose.g:2339:107: ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) )
                    	    // InternalDockerCompose.g:2340:7: ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 5);
                    	    						
                    	    // InternalDockerCompose.g:2343:10: ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) )
                    	    // InternalDockerCompose.g:2343:11: {...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2343:20: (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) )
                    	    // InternalDockerCompose.g:2343:21: otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,58,FOLLOW_5); 

                    	    										newLeafNode(otherlv_16, grammarAccess.getNetworkAccess().getNameKeyword_3_1_5_0());
                    	    									
                    	    // InternalDockerCompose.g:2347:10: ( (lv_network_name_17_0= ruleEString ) )
                    	    // InternalDockerCompose.g:2348:11: (lv_network_name_17_0= ruleEString )
                    	    {
                    	    // InternalDockerCompose.g:2348:11: (lv_network_name_17_0= ruleEString )
                    	    // InternalDockerCompose.g:2349:12: lv_network_name_17_0= ruleEString
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
                    	    // InternalDockerCompose.g:2372:5: ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2372:5: ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) )
                    	    // InternalDockerCompose.g:2373:6: {...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 6) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 6)");
                    	    }
                    	    // InternalDockerCompose.g:2373:107: ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) )
                    	    // InternalDockerCompose.g:2374:7: ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 6);
                    	    						
                    	    // InternalDockerCompose.g:2377:10: ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) )
                    	    // InternalDockerCompose.g:2377:11: {...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2377:20: (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ )
                    	    // InternalDockerCompose.g:2377:21: otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+
                    	    {
                    	    otherlv_18=(Token)match(input,59,FOLLOW_5); 

                    	    										newLeafNode(otherlv_18, grammarAccess.getNetworkAccess().getLabelsKeyword_3_1_6_0());
                    	    									
                    	    // InternalDockerCompose.g:2381:10: ( (lv_labels_19_0= ruleNetworkLabel ) )+
                    	    int cnt31=0;
                    	    loop31:
                    	    do {
                    	        int alt31=2;
                    	        int LA31_0 = input.LA(1);

                    	        if ( (LA31_0==RULE_STRING) ) {
                    	            int LA31_2 = input.LA(2);

                    	            if ( (LA31_2==21) ) {
                    	                int LA31_4 = input.LA(3);

                    	                if ( (LA31_4==RULE_STRING) ) {
                    	                    int LA31_5 = input.LA(4);

                    	                    if ( (LA31_5==EOF||LA31_5==RULE_ID||LA31_5==RULE_STRING||(LA31_5>=15 && LA31_5<=20)||(LA31_5>=53 && LA31_5<=61)) ) {
                    	                        alt31=1;
                    	                    }


                    	                }
                    	                else if ( (LA31_4==RULE_ID) ) {
                    	                    int LA31_6 = input.LA(4);

                    	                    if ( (LA31_6==EOF||LA31_6==RULE_ID||LA31_6==RULE_STRING||(LA31_6>=15 && LA31_6<=20)||(LA31_6>=53 && LA31_6<=61)) ) {
                    	                        alt31=1;
                    	                    }


                    	                }


                    	            }


                    	        }
                    	        else if ( (LA31_0==RULE_ID) ) {
                    	            int LA31_3 = input.LA(2);

                    	            if ( (LA31_3==21) ) {
                    	                int LA31_4 = input.LA(3);

                    	                if ( (LA31_4==RULE_STRING) ) {
                    	                    int LA31_5 = input.LA(4);

                    	                    if ( (LA31_5==EOF||LA31_5==RULE_ID||LA31_5==RULE_STRING||(LA31_5>=15 && LA31_5<=20)||(LA31_5>=53 && LA31_5<=61)) ) {
                    	                        alt31=1;
                    	                    }


                    	                }
                    	                else if ( (LA31_4==RULE_ID) ) {
                    	                    int LA31_6 = input.LA(4);

                    	                    if ( (LA31_6==EOF||LA31_6==RULE_ID||LA31_6==RULE_STRING||(LA31_6>=15 && LA31_6<=20)||(LA31_6>=53 && LA31_6<=61)) ) {
                    	                        alt31=1;
                    	                    }


                    	                }


                    	            }


                    	        }


                    	        switch (alt31) {
                    	    	case 1 :
                    	    	    // InternalDockerCompose.g:2382:11: (lv_labels_19_0= ruleNetworkLabel )
                    	    	    {
                    	    	    // InternalDockerCompose.g:2382:11: (lv_labels_19_0= ruleNetworkLabel )
                    	    	    // InternalDockerCompose.g:2383:12: lv_labels_19_0= ruleNetworkLabel
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
                    	    	    if ( cnt31 >= 1 ) break loop31;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(31, input);
                    	                throw eee;
                    	        }
                    	        cnt31++;
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 8 :
                    	    // InternalDockerCompose.g:2406:5: ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2406:5: ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) )
                    	    // InternalDockerCompose.g:2407:6: {...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 7) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 7)");
                    	    }
                    	    // InternalDockerCompose.g:2407:107: ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) )
                    	    // InternalDockerCompose.g:2408:7: ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 7);
                    	    						
                    	    // InternalDockerCompose.g:2411:10: ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) )
                    	    // InternalDockerCompose.g:2411:11: {...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2411:20: (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ )
                    	    // InternalDockerCompose.g:2411:21: otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+
                    	    {
                    	    otherlv_20=(Token)match(input,60,FOLLOW_5); 

                    	    										newLeafNode(otherlv_20, grammarAccess.getNetworkAccess().getDriver_optsKeyword_3_1_7_0());
                    	    									
                    	    // InternalDockerCompose.g:2415:10: ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+
                    	    int cnt32=0;
                    	    loop32:
                    	    do {
                    	        int alt32=2;
                    	        int LA32_0 = input.LA(1);

                    	        if ( (LA32_0==RULE_STRING) ) {
                    	            int LA32_2 = input.LA(2);

                    	            if ( (LA32_2==21) ) {
                    	                int LA32_4 = input.LA(3);

                    	                if ( (LA32_4==RULE_STRING) ) {
                    	                    int LA32_5 = input.LA(4);

                    	                    if ( (LA32_5==EOF||LA32_5==RULE_ID||LA32_5==RULE_STRING||(LA32_5>=15 && LA32_5<=20)||(LA32_5>=53 && LA32_5<=61)) ) {
                    	                        alt32=1;
                    	                    }


                    	                }
                    	                else if ( (LA32_4==RULE_ID) ) {
                    	                    int LA32_6 = input.LA(4);

                    	                    if ( (LA32_6==EOF||LA32_6==RULE_ID||LA32_6==RULE_STRING||(LA32_6>=15 && LA32_6<=20)||(LA32_6>=53 && LA32_6<=61)) ) {
                    	                        alt32=1;
                    	                    }


                    	                }


                    	            }


                    	        }
                    	        else if ( (LA32_0==RULE_ID) ) {
                    	            int LA32_3 = input.LA(2);

                    	            if ( (LA32_3==21) ) {
                    	                int LA32_4 = input.LA(3);

                    	                if ( (LA32_4==RULE_STRING) ) {
                    	                    int LA32_5 = input.LA(4);

                    	                    if ( (LA32_5==EOF||LA32_5==RULE_ID||LA32_5==RULE_STRING||(LA32_5>=15 && LA32_5<=20)||(LA32_5>=53 && LA32_5<=61)) ) {
                    	                        alt32=1;
                    	                    }


                    	                }
                    	                else if ( (LA32_4==RULE_ID) ) {
                    	                    int LA32_6 = input.LA(4);

                    	                    if ( (LA32_6==EOF||LA32_6==RULE_ID||LA32_6==RULE_STRING||(LA32_6>=15 && LA32_6<=20)||(LA32_6>=53 && LA32_6<=61)) ) {
                    	                        alt32=1;
                    	                    }


                    	                }


                    	            }


                    	        }


                    	        switch (alt32) {
                    	    	case 1 :
                    	    	    // InternalDockerCompose.g:2416:11: (lv_driver_opts_21_0= ruleNetworkDriverOpt )
                    	    	    {
                    	    	    // InternalDockerCompose.g:2416:11: (lv_driver_opts_21_0= ruleNetworkDriverOpt )
                    	    	    // InternalDockerCompose.g:2417:12: lv_driver_opts_21_0= ruleNetworkDriverOpt
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
                    	    	    if ( cnt32 >= 1 ) break loop32;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(32, input);
                    	                throw eee;
                    	        }
                    	        cnt32++;
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 9 :
                    	    // InternalDockerCompose.g:2440:5: ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) )
                    	    {
                    	    // InternalDockerCompose.g:2440:5: ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) )
                    	    // InternalDockerCompose.g:2441:6: {...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 8) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 8)");
                    	    }
                    	    // InternalDockerCompose.g:2441:107: ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) )
                    	    // InternalDockerCompose.g:2442:7: ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 8);
                    	    						
                    	    // InternalDockerCompose.g:2445:10: ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) )
                    	    // InternalDockerCompose.g:2445:11: {...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNetwork", "true");
                    	    }
                    	    // InternalDockerCompose.g:2445:20: (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) )
                    	    // InternalDockerCompose.g:2445:21: otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) )
                    	    {
                    	    otherlv_22=(Token)match(input,61,FOLLOW_43); 

                    	    										newLeafNode(otherlv_22, grammarAccess.getNetworkAccess().getIpamKeyword_3_1_8_0());
                    	    									
                    	    // InternalDockerCompose.g:2449:10: ( (lv_ipam_23_0= ruleIPAM ) )
                    	    // InternalDockerCompose.g:2450:11: (lv_ipam_23_0= ruleIPAM )
                    	    {
                    	    // InternalDockerCompose.g:2450:11: (lv_ipam_23_0= ruleIPAM )
                    	    // InternalDockerCompose.g:2451:12: lv_ipam_23_0= ruleIPAM
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
                    	    break loop33;
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
    // InternalDockerCompose.g:2486:1: entryRuleVolume returns [EObject current=null] : iv_ruleVolume= ruleVolume EOF ;
    public final EObject entryRuleVolume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolume = null;


        try {
            // InternalDockerCompose.g:2486:47: (iv_ruleVolume= ruleVolume EOF )
            // InternalDockerCompose.g:2487:2: iv_ruleVolume= ruleVolume EOF
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
    // InternalDockerCompose.g:2493:1: ruleVolume returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) ) ) ;
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
            // InternalDockerCompose.g:2499:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:2500:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:2500:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:2501:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:2501:3: ()
            // InternalDockerCompose.g:2502:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeAccess().getVolumeAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2508:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:2509:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:2509:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:2510:5: lv_name_1_0= ruleEString
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
            		
            // InternalDockerCompose.g:2531:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:2532:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:2532:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* ) )
            // InternalDockerCompose.g:2533:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getVolumeAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:2536:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )* )
            // InternalDockerCompose.g:2537:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )*
            {
            // InternalDockerCompose.g:2537:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) ) )*
            loop37:
            do {
                int alt37=6;
                int LA37_0 = input.LA(1);

                if ( LA37_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 1) ) {
                    alt37=2;
                }
                else if ( LA37_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 2) ) {
                    alt37=3;
                }
                else if ( LA37_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 3) ) {
                    alt37=4;
                }
                else if ( LA37_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 4) ) {
                    alt37=5;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalDockerCompose.g:2538:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2538:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:2539:5: {...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDockerCompose.g:2539:103: ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:2540:6: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDockerCompose.g:2543:9: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:2543:10: {...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:2543:19: (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:2543:20: otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) )
            	    {
            	    otherlv_4=(Token)match(input,57,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getVolumeAccess().getExternalKeyword_3_0_0());
            	    								
            	    // InternalDockerCompose.g:2547:9: ( (lv_external_5_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:2548:10: (lv_external_5_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:2548:10: (lv_external_5_0= ruleEBoolean )
            	    // InternalDockerCompose.g:2549:11: lv_external_5_0= ruleEBoolean
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
            	    // InternalDockerCompose.g:2572:4: ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2572:4: ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:2573:5: {...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDockerCompose.g:2573:103: ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:2574:6: ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDockerCompose.g:2577:9: ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:2577:10: {...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:2577:19: (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:2577:20: otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,53,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getVolumeAccess().getDriverKeyword_3_1_0());
            	    								
            	    // InternalDockerCompose.g:2581:9: ( (lv_driver_7_0= ruleEString ) )
            	    // InternalDockerCompose.g:2582:10: (lv_driver_7_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:2582:10: (lv_driver_7_0= ruleEString )
            	    // InternalDockerCompose.g:2583:11: lv_driver_7_0= ruleEString
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
            	    // InternalDockerCompose.g:2606:4: ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2606:4: ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:2607:5: {...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:2607:103: ( ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:2608:6: ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:2611:9: ({...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:2611:10: {...}? => (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:2611:19: (otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:2611:20: otherlv_8= 'name:' ( (lv_volume_name_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,58,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getVolumeAccess().getNameKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:2615:9: ( (lv_volume_name_9_0= ruleEString ) )
            	    // InternalDockerCompose.g:2616:10: (lv_volume_name_9_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:2616:10: (lv_volume_name_9_0= ruleEString )
            	    // InternalDockerCompose.g:2617:11: lv_volume_name_9_0= ruleEString
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
            	    // InternalDockerCompose.g:2640:4: ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2640:4: ({...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) ) )
            	    // InternalDockerCompose.g:2641:5: {...}? => ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalDockerCompose.g:2641:103: ( ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) ) )
            	    // InternalDockerCompose.g:2642:6: ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalDockerCompose.g:2645:9: ({...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ ) )
            	    // InternalDockerCompose.g:2645:10: {...}? => (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:2645:19: (otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+ )
            	    // InternalDockerCompose.g:2645:20: otherlv_10= 'labels:' ( (lv_labels_11_0= ruleVolumeLabel ) )+
            	    {
            	    otherlv_10=(Token)match(input,59,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getVolumeAccess().getLabelsKeyword_3_3_0());
            	    								
            	    // InternalDockerCompose.g:2649:9: ( (lv_labels_11_0= ruleVolumeLabel ) )+
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

            	                    if ( (LA35_5==EOF||LA35_5==RULE_ID||LA35_5==RULE_STRING||(LA35_5>=15 && LA35_5<=20)||LA35_5==53||(LA35_5>=57 && LA35_5<=60)) ) {
            	                        alt35=1;
            	                    }


            	                }
            	                else if ( (LA35_4==RULE_ID) ) {
            	                    int LA35_6 = input.LA(4);

            	                    if ( (LA35_6==EOF||LA35_6==RULE_ID||LA35_6==RULE_STRING||(LA35_6>=15 && LA35_6<=20)||LA35_6==53||(LA35_6>=57 && LA35_6<=60)) ) {
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

            	                    if ( (LA35_5==EOF||LA35_5==RULE_ID||LA35_5==RULE_STRING||(LA35_5>=15 && LA35_5<=20)||LA35_5==53||(LA35_5>=57 && LA35_5<=60)) ) {
            	                        alt35=1;
            	                    }


            	                }
            	                else if ( (LA35_4==RULE_ID) ) {
            	                    int LA35_6 = input.LA(4);

            	                    if ( (LA35_6==EOF||LA35_6==RULE_ID||LA35_6==RULE_STRING||(LA35_6>=15 && LA35_6<=20)||LA35_6==53||(LA35_6>=57 && LA35_6<=60)) ) {
            	                        alt35=1;
            	                    }


            	                }


            	            }


            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:2650:10: (lv_labels_11_0= ruleVolumeLabel )
            	    	    {
            	    	    // InternalDockerCompose.g:2650:10: (lv_labels_11_0= ruleVolumeLabel )
            	    	    // InternalDockerCompose.g:2651:11: lv_labels_11_0= ruleVolumeLabel
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
            	    	    if ( cnt35 >= 1 ) break loop35;
            	                EarlyExitException eee =
            	                    new EarlyExitException(35, input);
            	                throw eee;
            	        }
            	        cnt35++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDockerCompose.g:2674:4: ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2674:4: ({...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) ) )
            	    // InternalDockerCompose.g:2675:5: {...}? => ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalDockerCompose.g:2675:103: ( ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) ) )
            	    // InternalDockerCompose.g:2676:6: ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVolumeAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalDockerCompose.g:2679:9: ({...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ ) )
            	    // InternalDockerCompose.g:2679:10: {...}? => (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVolume", "true");
            	    }
            	    // InternalDockerCompose.g:2679:19: (otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+ )
            	    // InternalDockerCompose.g:2679:20: otherlv_12= 'driver_opts:' ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+
            	    {
            	    otherlv_12=(Token)match(input,60,FOLLOW_5); 

            	    									newLeafNode(otherlv_12, grammarAccess.getVolumeAccess().getDriver_optsKeyword_3_4_0());
            	    								
            	    // InternalDockerCompose.g:2683:9: ( (lv_driver_opts_13_0= ruleVolumeDriverOpt ) )+
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

            	                    if ( (LA36_5==EOF||LA36_5==RULE_ID||LA36_5==RULE_STRING||(LA36_5>=15 && LA36_5<=20)||LA36_5==53||(LA36_5>=57 && LA36_5<=60)) ) {
            	                        alt36=1;
            	                    }


            	                }
            	                else if ( (LA36_4==RULE_ID) ) {
            	                    int LA36_6 = input.LA(4);

            	                    if ( (LA36_6==EOF||LA36_6==RULE_ID||LA36_6==RULE_STRING||(LA36_6>=15 && LA36_6<=20)||LA36_6==53||(LA36_6>=57 && LA36_6<=60)) ) {
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

            	                    if ( (LA36_5==EOF||LA36_5==RULE_ID||LA36_5==RULE_STRING||(LA36_5>=15 && LA36_5<=20)||LA36_5==53||(LA36_5>=57 && LA36_5<=60)) ) {
            	                        alt36=1;
            	                    }


            	                }
            	                else if ( (LA36_4==RULE_ID) ) {
            	                    int LA36_6 = input.LA(4);

            	                    if ( (LA36_6==EOF||LA36_6==RULE_ID||LA36_6==RULE_STRING||(LA36_6>=15 && LA36_6<=20)||LA36_6==53||(LA36_6>=57 && LA36_6<=60)) ) {
            	                        alt36=1;
            	                    }


            	                }


            	            }


            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:2684:10: (lv_driver_opts_13_0= ruleVolumeDriverOpt )
            	    	    {
            	    	    // InternalDockerCompose.g:2684:10: (lv_driver_opts_13_0= ruleVolumeDriverOpt )
            	    	    // InternalDockerCompose.g:2685:11: lv_driver_opts_13_0= ruleVolumeDriverOpt
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
            	    	    if ( cnt36 >= 1 ) break loop36;
            	                EarlyExitException eee =
            	                    new EarlyExitException(36, input);
            	                throw eee;
            	        }
            	        cnt36++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVolumeAccess().getUnorderedGroup_3());
            	    					

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
    // InternalDockerCompose.g:2719:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalDockerCompose.g:2719:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalDockerCompose.g:2720:2: iv_ruleConfig= ruleConfig EOF
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
    // InternalDockerCompose.g:2726:1: ruleConfig returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) ) ) ;
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
            // InternalDockerCompose.g:2732:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:2733:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:2733:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:2734:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:2734:3: ()
            // InternalDockerCompose.g:2735:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigAccess().getConfigAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2741:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:2742:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:2742:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:2743:5: lv_name_1_0= ruleEString
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
            		
            // InternalDockerCompose.g:2764:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:2765:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:2765:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalDockerCompose.g:2766:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getConfigAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:2769:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )* )
            // InternalDockerCompose.g:2770:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalDockerCompose.g:2770:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) ) )*
            loop38:
            do {
                int alt38=4;
                int LA38_0 = input.LA(1);

                if ( LA38_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 0) ) {
                    alt38=1;
                }
                else if ( LA38_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 1) ) {
                    alt38=2;
                }
                else if ( LA38_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 2) ) {
                    alt38=3;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalDockerCompose.g:2771:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2771:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:2772:5: {...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDockerCompose.g:2772:103: ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:2773:6: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDockerCompose.g:2776:9: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:2776:10: {...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    }
            	    // InternalDockerCompose.g:2776:19: (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:2776:20: otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) )
            	    {
            	    otherlv_4=(Token)match(input,57,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getConfigAccess().getExternalKeyword_3_0_0());
            	    								
            	    // InternalDockerCompose.g:2780:9: ( (lv_external_5_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:2781:10: (lv_external_5_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:2781:10: (lv_external_5_0= ruleEBoolean )
            	    // InternalDockerCompose.g:2782:11: lv_external_5_0= ruleEBoolean
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
            	    // InternalDockerCompose.g:2805:4: ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2805:4: ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:2806:5: {...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDockerCompose.g:2806:103: ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:2807:6: ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDockerCompose.g:2810:9: ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:2810:10: {...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    }
            	    // InternalDockerCompose.g:2810:19: (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:2810:20: otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,62,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getConfigAccess().getFileKeyword_3_1_0());
            	    								
            	    // InternalDockerCompose.g:2814:9: ( (lv_file_7_0= ruleEString ) )
            	    // InternalDockerCompose.g:2815:10: (lv_file_7_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:2815:10: (lv_file_7_0= ruleEString )
            	    // InternalDockerCompose.g:2816:11: lv_file_7_0= ruleEString
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
            	    // InternalDockerCompose.g:2839:4: ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2839:4: ({...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:2840:5: {...}? => ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:2840:103: ( ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:2841:6: ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:2844:9: ({...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:2844:10: {...}? => (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    }
            	    // InternalDockerCompose.g:2844:19: (otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:2844:20: otherlv_8= 'name:' ( (lv_config_name_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,58,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getConfigAccess().getNameKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:2848:9: ( (lv_config_name_9_0= ruleEString ) )
            	    // InternalDockerCompose.g:2849:10: (lv_config_name_9_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:2849:10: (lv_config_name_9_0= ruleEString )
            	    // InternalDockerCompose.g:2850:11: lv_config_name_9_0= ruleEString
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
            	    break loop38;
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
    // InternalDockerCompose.g:2884:1: entryRuleSecret returns [EObject current=null] : iv_ruleSecret= ruleSecret EOF ;
    public final EObject entryRuleSecret() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecret = null;


        try {
            // InternalDockerCompose.g:2884:47: (iv_ruleSecret= ruleSecret EOF )
            // InternalDockerCompose.g:2885:2: iv_ruleSecret= ruleSecret EOF
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
    // InternalDockerCompose.g:2891:1: ruleSecret returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) ) ;
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
            // InternalDockerCompose.g:2897:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:2898:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:2898:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:2899:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:2899:3: ()
            // InternalDockerCompose.g:2900:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecretAccess().getSecretAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:2906:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:2907:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:2907:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:2908:5: lv_name_1_0= ruleEString
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
            		
            // InternalDockerCompose.g:2929:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:2930:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:2930:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalDockerCompose.g:2931:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSecretAccess().getUnorderedGroup_3());
            				
            // InternalDockerCompose.g:2934:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )* )
            // InternalDockerCompose.g:2935:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalDockerCompose.g:2935:6: ( ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) ) )*
            loop39:
            do {
                int alt39=5;
                int LA39_0 = input.LA(1);

                if ( LA39_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 0) ) {
                    alt39=1;
                }
                else if ( LA39_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 1) ) {
                    alt39=2;
                }
                else if ( LA39_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 2) ) {
                    alt39=3;
                }
                else if ( LA39_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 3) ) {
                    alt39=4;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalDockerCompose.g:2936:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2936:4: ({...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalDockerCompose.g:2937:5: {...}? => ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDockerCompose.g:2937:103: ( ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) ) )
            	    // InternalDockerCompose.g:2938:6: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDockerCompose.g:2941:9: ({...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) ) )
            	    // InternalDockerCompose.g:2941:10: {...}? => (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "true");
            	    }
            	    // InternalDockerCompose.g:2941:19: (otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) ) )
            	    // InternalDockerCompose.g:2941:20: otherlv_4= 'external:' ( (lv_external_5_0= ruleEBoolean ) )
            	    {
            	    otherlv_4=(Token)match(input,57,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getSecretAccess().getExternalKeyword_3_0_0());
            	    								
            	    // InternalDockerCompose.g:2945:9: ( (lv_external_5_0= ruleEBoolean ) )
            	    // InternalDockerCompose.g:2946:10: (lv_external_5_0= ruleEBoolean )
            	    {
            	    // InternalDockerCompose.g:2946:10: (lv_external_5_0= ruleEBoolean )
            	    // InternalDockerCompose.g:2947:11: lv_external_5_0= ruleEBoolean
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
            	    // InternalDockerCompose.g:2970:4: ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:2970:4: ({...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:2971:5: {...}? => ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDockerCompose.g:2971:103: ( ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:2972:6: ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDockerCompose.g:2975:9: ({...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:2975:10: {...}? => (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "true");
            	    }
            	    // InternalDockerCompose.g:2975:19: (otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:2975:20: otherlv_6= 'file:' ( (lv_file_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,62,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getSecretAccess().getFileKeyword_3_1_0());
            	    								
            	    // InternalDockerCompose.g:2979:9: ( (lv_file_7_0= ruleEString ) )
            	    // InternalDockerCompose.g:2980:10: (lv_file_7_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:2980:10: (lv_file_7_0= ruleEString )
            	    // InternalDockerCompose.g:2981:11: lv_file_7_0= ruleEString
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
            	    // InternalDockerCompose.g:3004:4: ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3004:4: ({...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3005:5: {...}? => ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDockerCompose.g:3005:103: ( ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3006:6: ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDockerCompose.g:3009:9: ({...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3009:10: {...}? => (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "true");
            	    }
            	    // InternalDockerCompose.g:3009:19: (otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3009:20: otherlv_8= 'environment:' ( (lv_environment_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,63,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getSecretAccess().getEnvironmentKeyword_3_2_0());
            	    								
            	    // InternalDockerCompose.g:3013:9: ( (lv_environment_9_0= ruleEString ) )
            	    // InternalDockerCompose.g:3014:10: (lv_environment_9_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3014:10: (lv_environment_9_0= ruleEString )
            	    // InternalDockerCompose.g:3015:11: lv_environment_9_0= ruleEString
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
            	    // InternalDockerCompose.g:3038:4: ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3038:4: ({...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3039:5: {...}? => ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "getUnorderedGroupHelper().canSelect(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalDockerCompose.g:3039:103: ( ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3040:6: ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSecretAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalDockerCompose.g:3043:9: ({...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3043:10: {...}? => (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSecret", "true");
            	    }
            	    // InternalDockerCompose.g:3043:19: (otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3043:20: otherlv_10= 'name:' ( (lv_secret_name_11_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,58,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getSecretAccess().getNameKeyword_3_3_0());
            	    								
            	    // InternalDockerCompose.g:3047:9: ( (lv_secret_name_11_0= ruleEString ) )
            	    // InternalDockerCompose.g:3048:10: (lv_secret_name_11_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3048:10: (lv_secret_name_11_0= ruleEString )
            	    // InternalDockerCompose.g:3049:11: lv_secret_name_11_0= ruleEString
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
            	    break loop39;
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
    // InternalDockerCompose.g:3083:1: entryRuleVolumeLabel returns [EObject current=null] : iv_ruleVolumeLabel= ruleVolumeLabel EOF ;
    public final EObject entryRuleVolumeLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumeLabel = null;


        try {
            // InternalDockerCompose.g:3083:52: (iv_ruleVolumeLabel= ruleVolumeLabel EOF )
            // InternalDockerCompose.g:3084:2: iv_ruleVolumeLabel= ruleVolumeLabel EOF
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
    // InternalDockerCompose.g:3090:1: ruleVolumeLabel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleVolumeLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3096:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:3097:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:3097:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:3098:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:3098:3: ()
            // InternalDockerCompose.g:3099:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeLabelAccess().getVolumeLabelAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3105:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3106:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3106:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3107:5: lv_name_1_0= ruleEString
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
            		
            // InternalDockerCompose.g:3128:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:3129:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:3129:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:3130:5: lv_value_3_0= ruleEString
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
    // InternalDockerCompose.g:3151:1: entryRuleVolumeDriverOpt returns [EObject current=null] : iv_ruleVolumeDriverOpt= ruleVolumeDriverOpt EOF ;
    public final EObject entryRuleVolumeDriverOpt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumeDriverOpt = null;


        try {
            // InternalDockerCompose.g:3151:56: (iv_ruleVolumeDriverOpt= ruleVolumeDriverOpt EOF )
            // InternalDockerCompose.g:3152:2: iv_ruleVolumeDriverOpt= ruleVolumeDriverOpt EOF
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
    // InternalDockerCompose.g:3158:1: ruleVolumeDriverOpt returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleVolumeDriverOpt() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3164:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:3165:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:3165:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:3166:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:3166:3: ()
            // InternalDockerCompose.g:3167:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeDriverOptAccess().getVolumeDriverOptAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3173:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3174:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3174:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3175:5: lv_name_1_0= ruleEString
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
            		
            // InternalDockerCompose.g:3196:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:3197:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:3197:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:3198:5: lv_value_3_0= ruleEString
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
    // InternalDockerCompose.g:3219:1: entryRuleNetworkLabel returns [EObject current=null] : iv_ruleNetworkLabel= ruleNetworkLabel EOF ;
    public final EObject entryRuleNetworkLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkLabel = null;


        try {
            // InternalDockerCompose.g:3219:53: (iv_ruleNetworkLabel= ruleNetworkLabel EOF )
            // InternalDockerCompose.g:3220:2: iv_ruleNetworkLabel= ruleNetworkLabel EOF
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
    // InternalDockerCompose.g:3226:1: ruleNetworkLabel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleNetworkLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3232:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:3233:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:3233:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:3234:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:3234:3: ()
            // InternalDockerCompose.g:3235:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkLabelAccess().getNetworkLabelAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3241:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3242:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3242:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3243:5: lv_name_1_0= ruleEString
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
            		
            // InternalDockerCompose.g:3264:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:3265:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:3265:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:3266:5: lv_value_3_0= ruleEString
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
    // InternalDockerCompose.g:3287:1: entryRuleNetworkDriverOpt returns [EObject current=null] : iv_ruleNetworkDriverOpt= ruleNetworkDriverOpt EOF ;
    public final EObject entryRuleNetworkDriverOpt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkDriverOpt = null;


        try {
            // InternalDockerCompose.g:3287:57: (iv_ruleNetworkDriverOpt= ruleNetworkDriverOpt EOF )
            // InternalDockerCompose.g:3288:2: iv_ruleNetworkDriverOpt= ruleNetworkDriverOpt EOF
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
    // InternalDockerCompose.g:3294:1: ruleNetworkDriverOpt returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleNetworkDriverOpt() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3300:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:3301:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:3301:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:3302:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:3302:3: ()
            // InternalDockerCompose.g:3303:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkDriverOptAccess().getNetworkDriverOptAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3309:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3310:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3310:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3311:5: lv_name_1_0= ruleEString
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
            		
            // InternalDockerCompose.g:3332:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:3333:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:3333:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:3334:5: lv_value_3_0= ruleEString
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
    // InternalDockerCompose.g:3355:1: entryRuleIPAM returns [EObject current=null] : iv_ruleIPAM= ruleIPAM EOF ;
    public final EObject entryRuleIPAM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAM = null;


        try {
            // InternalDockerCompose.g:3355:45: (iv_ruleIPAM= ruleIPAM EOF )
            // InternalDockerCompose.g:3356:2: iv_ruleIPAM= ruleIPAM EOF
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
    // InternalDockerCompose.g:3362:1: ruleIPAM returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) ) ) ;
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
            // InternalDockerCompose.g:3368:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:3369:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:3369:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:3370:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:3370:3: ()
            // InternalDockerCompose.g:3371:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIPAMAccess().getIPAMAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3377:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:3378:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:3378:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* ) )
            // InternalDockerCompose.g:3379:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIPAMAccess().getUnorderedGroup_1());
            				
            // InternalDockerCompose.g:3382:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )* )
            // InternalDockerCompose.g:3383:6: ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )*
            {
            // InternalDockerCompose.g:3383:6: ( ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) ) )*
            loop42:
            do {
                int alt42=4;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==53) ) {
                    int LA42_2 = input.LA(2);

                    if ( (LA42_2==RULE_STRING) ) {
                        int LA42_5 = input.LA(3);

                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {
                            alt42=1;
                        }


                    }
                    else if ( (LA42_2==RULE_ID) ) {
                        int LA42_6 = input.LA(3);

                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {
                            alt42=1;
                        }


                    }


                }
                else if ( LA42_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 1) ) {
                    alt42=2;
                }
                else if ( LA42_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 2) ) {
                    alt42=3;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalDockerCompose.g:3384:4: ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3384:4: ({...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) ) )
            	    // InternalDockerCompose.g:3385:5: {...}? => ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalDockerCompose.g:3385:101: ( ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) ) )
            	    // InternalDockerCompose.g:3386:6: ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalDockerCompose.g:3389:9: ({...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) ) )
            	    // InternalDockerCompose.g:3389:10: {...}? => (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "true");
            	    }
            	    // InternalDockerCompose.g:3389:19: (otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) ) )
            	    // InternalDockerCompose.g:3389:20: otherlv_2= 'driver:' ( (lv_driver_3_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,53,FOLLOW_5); 

            	    									newLeafNode(otherlv_2, grammarAccess.getIPAMAccess().getDriverKeyword_1_0_0());
            	    								
            	    // InternalDockerCompose.g:3393:9: ( (lv_driver_3_0= ruleEString ) )
            	    // InternalDockerCompose.g:3394:10: (lv_driver_3_0= ruleEString )
            	    {
            	    // InternalDockerCompose.g:3394:10: (lv_driver_3_0= ruleEString )
            	    // InternalDockerCompose.g:3395:11: lv_driver_3_0= ruleEString
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
            	    // InternalDockerCompose.g:3418:4: ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3418:4: ({...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) ) )
            	    // InternalDockerCompose.g:3419:5: {...}? => ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalDockerCompose.g:3419:101: ( ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) ) )
            	    // InternalDockerCompose.g:3420:6: ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalDockerCompose.g:3423:9: ({...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ ) )
            	    // InternalDockerCompose.g:3423:10: {...}? => (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "true");
            	    }
            	    // InternalDockerCompose.g:3423:19: (otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+ )
            	    // InternalDockerCompose.g:3423:20: otherlv_4= 'config:' (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+
            	    {
            	    otherlv_4=(Token)match(input,64,FOLLOW_14); 

            	    									newLeafNode(otherlv_4, grammarAccess.getIPAMAccess().getConfigKeyword_1_1_0());
            	    								
            	    // InternalDockerCompose.g:3427:9: (otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) ) )+
            	    int cnt40=0;
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==31) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:3428:10: otherlv_5= '-' ( (lv_configs_6_0= ruleIPAMConfig ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,31,FOLLOW_49); 

            	    	    										newLeafNode(otherlv_5, grammarAccess.getIPAMAccess().getHyphenMinusKeyword_1_1_1_0());
            	    	    									
            	    	    // InternalDockerCompose.g:3432:10: ( (lv_configs_6_0= ruleIPAMConfig ) )
            	    	    // InternalDockerCompose.g:3433:11: (lv_configs_6_0= ruleIPAMConfig )
            	    	    {
            	    	    // InternalDockerCompose.g:3433:11: (lv_configs_6_0= ruleIPAMConfig )
            	    	    // InternalDockerCompose.g:3434:12: lv_configs_6_0= ruleIPAMConfig
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
            	    	    if ( cnt40 >= 1 ) break loop40;
            	                EarlyExitException eee =
            	                    new EarlyExitException(40, input);
            	                throw eee;
            	        }
            	        cnt40++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIPAMAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDockerCompose.g:3458:4: ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3458:4: ({...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) ) )
            	    // InternalDockerCompose.g:3459:5: {...}? => ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalDockerCompose.g:3459:101: ( ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) ) )
            	    // InternalDockerCompose.g:3460:6: ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalDockerCompose.g:3463:9: ({...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ ) )
            	    // InternalDockerCompose.g:3463:10: {...}? => (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAM", "true");
            	    }
            	    // InternalDockerCompose.g:3463:19: (otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+ )
            	    // InternalDockerCompose.g:3463:20: otherlv_7= 'options:' ( (lv_options_8_0= ruleIPAMOption ) )+
            	    {
            	    otherlv_7=(Token)match(input,65,FOLLOW_5); 

            	    									newLeafNode(otherlv_7, grammarAccess.getIPAMAccess().getOptionsKeyword_1_2_0());
            	    								
            	    // InternalDockerCompose.g:3467:9: ( (lv_options_8_0= ruleIPAMOption ) )+
            	    int cnt41=0;
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==RULE_STRING) ) {
            	            int LA41_2 = input.LA(2);

            	            if ( (LA41_2==21) ) {
            	                int LA41_4 = input.LA(3);

            	                if ( (LA41_4==RULE_STRING) ) {
            	                    int LA41_5 = input.LA(4);

            	                    if ( (LA41_5==EOF||LA41_5==RULE_ID||LA41_5==RULE_STRING||(LA41_5>=15 && LA41_5<=20)||(LA41_5>=53 && LA41_5<=61)||(LA41_5>=64 && LA41_5<=65)) ) {
            	                        alt41=1;
            	                    }


            	                }
            	                else if ( (LA41_4==RULE_ID) ) {
            	                    int LA41_6 = input.LA(4);

            	                    if ( (LA41_6==EOF||LA41_6==RULE_ID||LA41_6==RULE_STRING||(LA41_6>=15 && LA41_6<=20)||(LA41_6>=53 && LA41_6<=61)||(LA41_6>=64 && LA41_6<=65)) ) {
            	                        alt41=1;
            	                    }


            	                }


            	            }


            	        }
            	        else if ( (LA41_0==RULE_ID) ) {
            	            int LA41_3 = input.LA(2);

            	            if ( (LA41_3==21) ) {
            	                int LA41_4 = input.LA(3);

            	                if ( (LA41_4==RULE_STRING) ) {
            	                    int LA41_5 = input.LA(4);

            	                    if ( (LA41_5==EOF||LA41_5==RULE_ID||LA41_5==RULE_STRING||(LA41_5>=15 && LA41_5<=20)||(LA41_5>=53 && LA41_5<=61)||(LA41_5>=64 && LA41_5<=65)) ) {
            	                        alt41=1;
            	                    }


            	                }
            	                else if ( (LA41_4==RULE_ID) ) {
            	                    int LA41_6 = input.LA(4);

            	                    if ( (LA41_6==EOF||LA41_6==RULE_ID||LA41_6==RULE_STRING||(LA41_6>=15 && LA41_6<=20)||(LA41_6>=53 && LA41_6<=61)||(LA41_6>=64 && LA41_6<=65)) ) {
            	                        alt41=1;
            	                    }


            	                }


            	            }


            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:3468:10: (lv_options_8_0= ruleIPAMOption )
            	    	    {
            	    	    // InternalDockerCompose.g:3468:10: (lv_options_8_0= ruleIPAMOption )
            	    	    // InternalDockerCompose.g:3469:11: lv_options_8_0= ruleIPAMOption
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
            	    	    if ( cnt41 >= 1 ) break loop41;
            	                EarlyExitException eee =
            	                    new EarlyExitException(41, input);
            	                throw eee;
            	        }
            	        cnt41++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIPAMAccess().getUnorderedGroup_1());
            	    					

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
    // InternalDockerCompose.g:3503:1: entryRuleIPAMConfig returns [EObject current=null] : iv_ruleIPAMConfig= ruleIPAMConfig EOF ;
    public final EObject entryRuleIPAMConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAMConfig = null;


        try {
            // InternalDockerCompose.g:3503:51: (iv_ruleIPAMConfig= ruleIPAMConfig EOF )
            // InternalDockerCompose.g:3504:2: iv_ruleIPAMConfig= ruleIPAMConfig EOF
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
    // InternalDockerCompose.g:3510:1: ruleIPAMConfig returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) ) ) ;
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
            // InternalDockerCompose.g:3516:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) ) ) )
            // InternalDockerCompose.g:3517:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) ) )
            {
            // InternalDockerCompose.g:3517:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) ) )
            // InternalDockerCompose.g:3518:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) )
            {
            // InternalDockerCompose.g:3518:3: ()
            // InternalDockerCompose.g:3519:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIPAMConfigAccess().getIPAMConfigAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3525:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) ) )
            // InternalDockerCompose.g:3526:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) )
            {
            // InternalDockerCompose.g:3526:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* ) )
            // InternalDockerCompose.g:3527:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1());
            				
            // InternalDockerCompose.g:3530:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )* )
            // InternalDockerCompose.g:3531:6: ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )*
            {
            // InternalDockerCompose.g:3531:6: ( ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) ) )*
            loop44:
            do {
                int alt44=5;
                int LA44_0 = input.LA(1);

                if ( LA44_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 0) ) {
                    alt44=1;
                }
                else if ( LA44_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 1) ) {
                    alt44=2;
                }
                else if ( LA44_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 2) ) {
                    alt44=3;
                }
                else if ( LA44_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 3) ) {
                    alt44=4;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalDockerCompose.g:3532:4: ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3532:4: ({...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) ) )
            	    // InternalDockerCompose.g:3533:5: {...}? => ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalDockerCompose.g:3533:107: ( ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) ) )
            	    // InternalDockerCompose.g:3534:6: ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalDockerCompose.g:3537:9: ({...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) ) )
            	    // InternalDockerCompose.g:3537:10: {...}? => (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "true");
            	    }
            	    // InternalDockerCompose.g:3537:19: (otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) ) )
            	    // InternalDockerCompose.g:3537:20: otherlv_2= 'subnet:' ( (lv_subnet_3_0= ruleNetworkAddress ) )
            	    {
            	    otherlv_2=(Token)match(input,66,FOLLOW_11); 

            	    									newLeafNode(otherlv_2, grammarAccess.getIPAMConfigAccess().getSubnetKeyword_1_0_0());
            	    								
            	    // InternalDockerCompose.g:3541:9: ( (lv_subnet_3_0= ruleNetworkAddress ) )
            	    // InternalDockerCompose.g:3542:10: (lv_subnet_3_0= ruleNetworkAddress )
            	    {
            	    // InternalDockerCompose.g:3542:10: (lv_subnet_3_0= ruleNetworkAddress )
            	    // InternalDockerCompose.g:3543:11: lv_subnet_3_0= ruleNetworkAddress
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
            	    // InternalDockerCompose.g:3566:4: ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3566:4: ({...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) ) )
            	    // InternalDockerCompose.g:3567:5: {...}? => ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalDockerCompose.g:3567:107: ( ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) ) )
            	    // InternalDockerCompose.g:3568:6: ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalDockerCompose.g:3571:9: ({...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) ) )
            	    // InternalDockerCompose.g:3571:10: {...}? => (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "true");
            	    }
            	    // InternalDockerCompose.g:3571:19: (otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) ) )
            	    // InternalDockerCompose.g:3571:20: otherlv_4= 'ip_range:' ( (lv_ip_range_5_0= ruleNetworkAddress ) )
            	    {
            	    otherlv_4=(Token)match(input,67,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getIPAMConfigAccess().getIp_rangeKeyword_1_1_0());
            	    								
            	    // InternalDockerCompose.g:3575:9: ( (lv_ip_range_5_0= ruleNetworkAddress ) )
            	    // InternalDockerCompose.g:3576:10: (lv_ip_range_5_0= ruleNetworkAddress )
            	    {
            	    // InternalDockerCompose.g:3576:10: (lv_ip_range_5_0= ruleNetworkAddress )
            	    // InternalDockerCompose.g:3577:11: lv_ip_range_5_0= ruleNetworkAddress
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
            	    // InternalDockerCompose.g:3600:4: ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3600:4: ({...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) ) )
            	    // InternalDockerCompose.g:3601:5: {...}? => ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalDockerCompose.g:3601:107: ( ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) ) )
            	    // InternalDockerCompose.g:3602:6: ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalDockerCompose.g:3605:9: ({...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) ) )
            	    // InternalDockerCompose.g:3605:10: {...}? => (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "true");
            	    }
            	    // InternalDockerCompose.g:3605:19: (otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) ) )
            	    // InternalDockerCompose.g:3605:20: otherlv_6= 'gateway:' ( (lv_gateway_7_0= ruleDNS ) )
            	    {
            	    otherlv_6=(Token)match(input,68,FOLLOW_21); 

            	    									newLeafNode(otherlv_6, grammarAccess.getIPAMConfigAccess().getGatewayKeyword_1_2_0());
            	    								
            	    // InternalDockerCompose.g:3609:9: ( (lv_gateway_7_0= ruleDNS ) )
            	    // InternalDockerCompose.g:3610:10: (lv_gateway_7_0= ruleDNS )
            	    {
            	    // InternalDockerCompose.g:3610:10: (lv_gateway_7_0= ruleDNS )
            	    // InternalDockerCompose.g:3611:11: lv_gateway_7_0= ruleDNS
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
            	    // InternalDockerCompose.g:3634:4: ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) )
            	    {
            	    // InternalDockerCompose.g:3634:4: ({...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) ) )
            	    // InternalDockerCompose.g:3635:5: {...}? => ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalDockerCompose.g:3635:107: ( ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) ) )
            	    // InternalDockerCompose.g:3636:6: ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalDockerCompose.g:3639:9: ({...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ ) )
            	    // InternalDockerCompose.g:3639:10: {...}? => (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIPAMConfig", "true");
            	    }
            	    // InternalDockerCompose.g:3639:19: (otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+ )
            	    // InternalDockerCompose.g:3639:20: otherlv_8= 'aux_addresses:' ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+
            	    {
            	    otherlv_8=(Token)match(input,69,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getIPAMConfigAccess().getAux_addressesKeyword_1_3_0());
            	    								
            	    // InternalDockerCompose.g:3643:9: ( (lv_aux_addresses_9_0= ruleIPAMAddress ) )+
            	    int cnt43=0;
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==RULE_STRING) ) {
            	            int LA43_2 = input.LA(2);

            	            if ( (LA43_2==21) ) {
            	                int LA43_4 = input.LA(3);

            	                if ( (LA43_4==RULE_INT) ) {
            	                    alt43=1;
            	                }


            	            }


            	        }
            	        else if ( (LA43_0==RULE_ID) ) {
            	            int LA43_3 = input.LA(2);

            	            if ( (LA43_3==21) ) {
            	                int LA43_4 = input.LA(3);

            	                if ( (LA43_4==RULE_INT) ) {
            	                    alt43=1;
            	                }


            	            }


            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // InternalDockerCompose.g:3644:10: (lv_aux_addresses_9_0= ruleIPAMAddress )
            	    	    {
            	    	    // InternalDockerCompose.g:3644:10: (lv_aux_addresses_9_0= ruleIPAMAddress )
            	    	    // InternalDockerCompose.g:3645:11: lv_aux_addresses_9_0= ruleIPAMAddress
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
            	    	    if ( cnt43 >= 1 ) break loop43;
            	                EarlyExitException eee =
            	                    new EarlyExitException(43, input);
            	                throw eee;
            	        }
            	        cnt43++;
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIPAMConfigAccess().getUnorderedGroup_1());
            	    					

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
    // InternalDockerCompose.g:3679:1: entryRuleIPAMOption returns [EObject current=null] : iv_ruleIPAMOption= ruleIPAMOption EOF ;
    public final EObject entryRuleIPAMOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAMOption = null;


        try {
            // InternalDockerCompose.g:3679:51: (iv_ruleIPAMOption= ruleIPAMOption EOF )
            // InternalDockerCompose.g:3680:2: iv_ruleIPAMOption= ruleIPAMOption EOF
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
    // InternalDockerCompose.g:3686:1: ruleIPAMOption returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleIPAMOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3692:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalDockerCompose.g:3693:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalDockerCompose.g:3693:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalDockerCompose.g:3694:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalDockerCompose.g:3694:3: ()
            // InternalDockerCompose.g:3695:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIPAMOptionAccess().getIPAMOptionAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3701:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3702:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3702:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3703:5: lv_name_1_0= ruleEString
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
            		
            // InternalDockerCompose.g:3724:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDockerCompose.g:3725:4: (lv_value_3_0= ruleEString )
            {
            // InternalDockerCompose.g:3725:4: (lv_value_3_0= ruleEString )
            // InternalDockerCompose.g:3726:5: lv_value_3_0= ruleEString
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
    // InternalDockerCompose.g:3747:1: entryRuleIPAMAddress returns [EObject current=null] : iv_ruleIPAMAddress= ruleIPAMAddress EOF ;
    public final EObject entryRuleIPAMAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAMAddress = null;


        try {
            // InternalDockerCompose.g:3747:52: (iv_ruleIPAMAddress= ruleIPAMAddress EOF )
            // InternalDockerCompose.g:3748:2: iv_ruleIPAMAddress= ruleIPAMAddress EOF
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
    // InternalDockerCompose.g:3754:1: ruleIPAMAddress returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) ) ) ;
    public final EObject ruleIPAMAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_dns_3_0 = null;



        	enterRule();

        try {
            // InternalDockerCompose.g:3760:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) ) ) )
            // InternalDockerCompose.g:3761:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) ) )
            {
            // InternalDockerCompose.g:3761:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) ) )
            // InternalDockerCompose.g:3762:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_dns_3_0= ruleDNS ) )
            {
            // InternalDockerCompose.g:3762:3: ()
            // InternalDockerCompose.g:3763:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIPAMAddressAccess().getIPAMAddressAction_0(),
            					current);
            			

            }

            // InternalDockerCompose.g:3769:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerCompose.g:3770:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerCompose.g:3770:4: (lv_name_1_0= ruleEString )
            // InternalDockerCompose.g:3771:5: lv_name_1_0= ruleEString
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
            		
            // InternalDockerCompose.g:3792:3: ( (lv_dns_3_0= ruleDNS ) )
            // InternalDockerCompose.g:3793:4: (lv_dns_3_0= ruleDNS )
            {
            // InternalDockerCompose.g:3793:4: (lv_dns_3_0= ruleDNS )
            // InternalDockerCompose.g:3794:5: lv_dns_3_0= ruleDNS
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
    // InternalDockerCompose.g:3815:1: entryRulePATH returns [String current=null] : iv_rulePATH= rulePATH EOF ;
    public final String entryRulePATH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePATH = null;


        try {
            // InternalDockerCompose.g:3815:44: (iv_rulePATH= rulePATH EOF )
            // InternalDockerCompose.g:3816:2: iv_rulePATH= rulePATH EOF
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
    // InternalDockerCompose.g:3822:1: rulePATH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' )? (kw= '/' )? (this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken rulePATH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:3828:2: ( ( (kw= '.' )? (kw= '/' )? (this_ID_2= RULE_ID )* ) )
            // InternalDockerCompose.g:3829:2: ( (kw= '.' )? (kw= '/' )? (this_ID_2= RULE_ID )* )
            {
            // InternalDockerCompose.g:3829:2: ( (kw= '.' )? (kw= '/' )? (this_ID_2= RULE_ID )* )
            // InternalDockerCompose.g:3830:3: (kw= '.' )? (kw= '/' )? (this_ID_2= RULE_ID )*
            {
            // InternalDockerCompose.g:3830:3: (kw= '.' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==70) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDockerCompose.g:3831:4: kw= '.'
                    {
                    kw=(Token)match(input,70,FOLLOW_54); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPATHAccess().getFullStopKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDockerCompose.g:3837:3: (kw= '/' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==71) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDockerCompose.g:3838:4: kw= '/'
                    {
                    kw=(Token)match(input,71,FOLLOW_55); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPATHAccess().getSolidusKeyword_1());
                    			

                    }
                    break;

            }

            // InternalDockerCompose.g:3844:3: (this_ID_2= RULE_ID )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    int LA47_2 = input.LA(2);

                    if ( (LA47_2==21) ) {
                        int LA47_3 = input.LA(3);

                        if ( ((LA47_3>=78 && LA47_3<=80)) ) {
                            alt47=1;
                        }


                    }
                    else if ( (LA47_2==EOF||LA47_2==RULE_ID||LA47_2==RULE_STRING||(LA47_2>=15 && LA47_2<=20)||(LA47_2>=22 && LA47_2<=34)||(LA47_2>=39 && LA47_2<=42)||LA47_2==44||LA47_2==46||(LA47_2>=48 && LA47_2<=50)) ) {
                        alt47=1;
                    }


                }


                switch (alt47) {
            	case 1 :
            	    // InternalDockerCompose.g:3845:4: this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_55); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getPATHAccess().getIDTerminalRuleCall_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalDockerCompose.g:3857:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDockerCompose.g:3857:47: (iv_ruleEString= ruleEString EOF )
            // InternalDockerCompose.g:3858:2: iv_ruleEString= ruleEString EOF
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
    // InternalDockerCompose.g:3864:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:3870:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDockerCompose.g:3871:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDockerCompose.g:3871:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_STRING) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_ID) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalDockerCompose.g:3872:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:3880:3: this_ID_1= RULE_ID
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
    // InternalDockerCompose.g:3891:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDockerCompose.g:3891:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDockerCompose.g:3892:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalDockerCompose.g:3898:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:3904:2: (this_INT_0= RULE_INT )
            // InternalDockerCompose.g:3905:2: this_INT_0= RULE_INT
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
    // InternalDockerCompose.g:3915:1: entryRuleDNS returns [EObject current=null] : iv_ruleDNS= ruleDNS EOF ;
    public final EObject entryRuleDNS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNS = null;


        try {
            // InternalDockerCompose.g:3915:44: (iv_ruleDNS= ruleDNS EOF )
            // InternalDockerCompose.g:3916:2: iv_ruleDNS= ruleDNS EOF
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
    // InternalDockerCompose.g:3922:1: ruleDNS returns [EObject current=null] : ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) ) ;
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
            // InternalDockerCompose.g:3928:2: ( ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) ) )
            // InternalDockerCompose.g:3929:2: ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) )
            {
            // InternalDockerCompose.g:3929:2: ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) )
            // InternalDockerCompose.g:3930:3: ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) )
            {
            // InternalDockerCompose.g:3930:3: ( (lv_dns1_0_0= ruleEInt ) )
            // InternalDockerCompose.g:3931:4: (lv_dns1_0_0= ruleEInt )
            {
            // InternalDockerCompose.g:3931:4: (lv_dns1_0_0= ruleEInt )
            // InternalDockerCompose.g:3932:5: lv_dns1_0_0= ruleEInt
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
            		
            // InternalDockerCompose.g:3953:3: ( (lv_dns2_2_0= ruleEInt ) )
            // InternalDockerCompose.g:3954:4: (lv_dns2_2_0= ruleEInt )
            {
            // InternalDockerCompose.g:3954:4: (lv_dns2_2_0= ruleEInt )
            // InternalDockerCompose.g:3955:5: lv_dns2_2_0= ruleEInt
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
            		
            // InternalDockerCompose.g:3976:3: ( (lv_dns3_4_0= ruleEInt ) )
            // InternalDockerCompose.g:3977:4: (lv_dns3_4_0= ruleEInt )
            {
            // InternalDockerCompose.g:3977:4: (lv_dns3_4_0= ruleEInt )
            // InternalDockerCompose.g:3978:5: lv_dns3_4_0= ruleEInt
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
            		
            // InternalDockerCompose.g:3999:3: ( (lv_dns4_6_0= ruleEInt ) )
            // InternalDockerCompose.g:4000:4: (lv_dns4_6_0= ruleEInt )
            {
            // InternalDockerCompose.g:4000:4: (lv_dns4_6_0= ruleEInt )
            // InternalDockerCompose.g:4001:5: lv_dns4_6_0= ruleEInt
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
    // InternalDockerCompose.g:4022:1: entryRuleNetworkAddress returns [EObject current=null] : iv_ruleNetworkAddress= ruleNetworkAddress EOF ;
    public final EObject entryRuleNetworkAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkAddress = null;


        try {
            // InternalDockerCompose.g:4022:55: (iv_ruleNetworkAddress= ruleNetworkAddress EOF )
            // InternalDockerCompose.g:4023:2: iv_ruleNetworkAddress= ruleNetworkAddress EOF
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
    // InternalDockerCompose.g:4029:1: ruleNetworkAddress returns [EObject current=null] : ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) ) ) ;
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
            // InternalDockerCompose.g:4035:2: ( ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) ) ) )
            // InternalDockerCompose.g:4036:2: ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) ) )
            {
            // InternalDockerCompose.g:4036:2: ( ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) ) )
            // InternalDockerCompose.g:4037:3: ( (lv_dns1_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_dns2_2_0= ruleEInt ) ) otherlv_3= '.' ( (lv_dns3_4_0= ruleEInt ) ) otherlv_5= '.' ( (lv_dns4_6_0= ruleEInt ) ) otherlv_7= '/' ( (lv_netId_8_0= ruleEInt ) )
            {
            // InternalDockerCompose.g:4037:3: ( (lv_dns1_0_0= ruleEInt ) )
            // InternalDockerCompose.g:4038:4: (lv_dns1_0_0= ruleEInt )
            {
            // InternalDockerCompose.g:4038:4: (lv_dns1_0_0= ruleEInt )
            // InternalDockerCompose.g:4039:5: lv_dns1_0_0= ruleEInt
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
            		
            // InternalDockerCompose.g:4060:3: ( (lv_dns2_2_0= ruleEInt ) )
            // InternalDockerCompose.g:4061:4: (lv_dns2_2_0= ruleEInt )
            {
            // InternalDockerCompose.g:4061:4: (lv_dns2_2_0= ruleEInt )
            // InternalDockerCompose.g:4062:5: lv_dns2_2_0= ruleEInt
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
            		
            // InternalDockerCompose.g:4083:3: ( (lv_dns3_4_0= ruleEInt ) )
            // InternalDockerCompose.g:4084:4: (lv_dns3_4_0= ruleEInt )
            {
            // InternalDockerCompose.g:4084:4: (lv_dns3_4_0= ruleEInt )
            // InternalDockerCompose.g:4085:5: lv_dns3_4_0= ruleEInt
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
            		
            // InternalDockerCompose.g:4106:3: ( (lv_dns4_6_0= ruleEInt ) )
            // InternalDockerCompose.g:4107:4: (lv_dns4_6_0= ruleEInt )
            {
            // InternalDockerCompose.g:4107:4: (lv_dns4_6_0= ruleEInt )
            // InternalDockerCompose.g:4108:5: lv_dns4_6_0= ruleEInt
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
            		
            // InternalDockerCompose.g:4129:3: ( (lv_netId_8_0= ruleEInt ) )
            // InternalDockerCompose.g:4130:4: (lv_netId_8_0= ruleEInt )
            {
            // InternalDockerCompose.g:4130:4: (lv_netId_8_0= ruleEInt )
            // InternalDockerCompose.g:4131:5: lv_netId_8_0= ruleEInt
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
    // InternalDockerCompose.g:4152:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalDockerCompose.g:4152:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalDockerCompose.g:4153:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalDockerCompose.g:4159:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4165:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalDockerCompose.g:4166:2: (kw= 'true' | kw= 'false' )
            {
            // InternalDockerCompose.g:4166:2: (kw= 'true' | kw= 'false' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==72) ) {
                alt49=1;
            }
            else if ( (LA49_0==73) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalDockerCompose.g:4167:3: kw= 'true'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4173:3: kw= 'false'
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
    // InternalDockerCompose.g:4182:1: ruleRestartPolicy returns [Enumerator current=null] : ( (enumLiteral_0= '\"no\"' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'on-failure' ) | (enumLiteral_3= 'unless-stopped' ) ) ;
    public final Enumerator ruleRestartPolicy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4188:2: ( ( (enumLiteral_0= '\"no\"' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'on-failure' ) | (enumLiteral_3= 'unless-stopped' ) ) )
            // InternalDockerCompose.g:4189:2: ( (enumLiteral_0= '\"no\"' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'on-failure' ) | (enumLiteral_3= 'unless-stopped' ) )
            {
            // InternalDockerCompose.g:4189:2: ( (enumLiteral_0= '\"no\"' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'on-failure' ) | (enumLiteral_3= 'unless-stopped' ) )
            int alt50=4;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt50=1;
                }
                break;
            case 75:
                {
                alt50=2;
                }
                break;
            case 76:
                {
                alt50=3;
                }
                break;
            case 77:
                {
                alt50=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalDockerCompose.g:4190:3: (enumLiteral_0= '\"no\"' )
                    {
                    // InternalDockerCompose.g:4190:3: (enumLiteral_0= '\"no\"' )
                    // InternalDockerCompose.g:4191:4: enumLiteral_0= '\"no\"'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getRestartPolicyAccess().getNoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRestartPolicyAccess().getNoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4198:3: (enumLiteral_1= 'always' )
                    {
                    // InternalDockerCompose.g:4198:3: (enumLiteral_1= 'always' )
                    // InternalDockerCompose.g:4199:4: enumLiteral_1= 'always'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getRestartPolicyAccess().getAlwaysEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRestartPolicyAccess().getAlwaysEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:4206:3: (enumLiteral_2= 'on-failure' )
                    {
                    // InternalDockerCompose.g:4206:3: (enumLiteral_2= 'on-failure' )
                    // InternalDockerCompose.g:4207:4: enumLiteral_2= 'on-failure'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getRestartPolicyAccess().getOnfailureEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRestartPolicyAccess().getOnfailureEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDockerCompose.g:4214:3: (enumLiteral_3= 'unless-stopped' )
                    {
                    // InternalDockerCompose.g:4214:3: (enumLiteral_3= 'unless-stopped' )
                    // InternalDockerCompose.g:4215:4: enumLiteral_3= 'unless-stopped'
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
    // InternalDockerCompose.g:4225:1: ruleAccessMode returns [Enumerator current=null] : ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) | (enumLiteral_2= 'z' ) ) ;
    public final Enumerator ruleAccessMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4231:2: ( ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) | (enumLiteral_2= 'z' ) ) )
            // InternalDockerCompose.g:4232:2: ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) | (enumLiteral_2= 'z' ) )
            {
            // InternalDockerCompose.g:4232:2: ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) | (enumLiteral_2= 'z' ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt51=1;
                }
                break;
            case 79:
                {
                alt51=2;
                }
                break;
            case 80:
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalDockerCompose.g:4233:3: (enumLiteral_0= 'rw' )
                    {
                    // InternalDockerCompose.g:4233:3: (enumLiteral_0= 'rw' )
                    // InternalDockerCompose.g:4234:4: enumLiteral_0= 'rw'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getAccessModeAccess().getRwEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessModeAccess().getRwEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4241:3: (enumLiteral_1= 'ro' )
                    {
                    // InternalDockerCompose.g:4241:3: (enumLiteral_1= 'ro' )
                    // InternalDockerCompose.g:4242:4: enumLiteral_1= 'ro'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getAccessModeAccess().getRoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessModeAccess().getRoEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:4249:3: (enumLiteral_2= 'z' )
                    {
                    // InternalDockerCompose.g:4249:3: (enumLiteral_2= 'z' )
                    // InternalDockerCompose.g:4250:4: enumLiteral_2= 'z'
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
    // InternalDockerCompose.g:4260:1: ruleMountType returns [Enumerator current=null] : ( (enumLiteral_0= 'volume' ) | (enumLiteral_1= 'bind' ) | (enumLiteral_2= 'tmpfs' ) | (enumLiteral_3= 'npipe' ) ) ;
    public final Enumerator ruleMountType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDockerCompose.g:4266:2: ( ( (enumLiteral_0= 'volume' ) | (enumLiteral_1= 'bind' ) | (enumLiteral_2= 'tmpfs' ) | (enumLiteral_3= 'npipe' ) ) )
            // InternalDockerCompose.g:4267:2: ( (enumLiteral_0= 'volume' ) | (enumLiteral_1= 'bind' ) | (enumLiteral_2= 'tmpfs' ) | (enumLiteral_3= 'npipe' ) )
            {
            // InternalDockerCompose.g:4267:2: ( (enumLiteral_0= 'volume' ) | (enumLiteral_1= 'bind' ) | (enumLiteral_2= 'tmpfs' ) | (enumLiteral_3= 'npipe' ) )
            int alt52=4;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt52=1;
                }
                break;
            case 82:
                {
                alt52=2;
                }
                break;
            case 83:
                {
                alt52=3;
                }
                break;
            case 84:
                {
                alt52=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalDockerCompose.g:4268:3: (enumLiteral_0= 'volume' )
                    {
                    // InternalDockerCompose.g:4268:3: (enumLiteral_0= 'volume' )
                    // InternalDockerCompose.g:4269:4: enumLiteral_0= 'volume'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getMountTypeAccess().getVolumeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMountTypeAccess().getVolumeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4276:3: (enumLiteral_1= 'bind' )
                    {
                    // InternalDockerCompose.g:4276:3: (enumLiteral_1= 'bind' )
                    // InternalDockerCompose.g:4277:4: enumLiteral_1= 'bind'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getMountTypeAccess().getBindEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMountTypeAccess().getBindEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:4284:3: (enumLiteral_2= 'tmpfs' )
                    {
                    // InternalDockerCompose.g:4284:3: (enumLiteral_2= 'tmpfs' )
                    // InternalDockerCompose.g:4285:4: enumLiteral_2= 'tmpfs'
                    {
                    enumLiteral_2=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getMountTypeAccess().getTmpfsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMountTypeAccess().getTmpfsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDockerCompose.g:4292:3: (enumLiteral_3= 'npipe' )
                    {
                    // InternalDockerCompose.g:4292:3: (enumLiteral_3= 'npipe' )
                    // InternalDockerCompose.g:4293:4: enumLiteral_3= 'npipe'
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
    // InternalDockerCompose.g:4303:1: rulePropagationType returns [Enumerator current=null] : ( (enumLiteral_0= 'rprivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'rshared' ) | (enumLiteral_3= 'shared' ) | (enumLiteral_4= 'rslave' ) | (enumLiteral_5= 'slave' ) ) ;
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
            // InternalDockerCompose.g:4309:2: ( ( (enumLiteral_0= 'rprivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'rshared' ) | (enumLiteral_3= 'shared' ) | (enumLiteral_4= 'rslave' ) | (enumLiteral_5= 'slave' ) ) )
            // InternalDockerCompose.g:4310:2: ( (enumLiteral_0= 'rprivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'rshared' ) | (enumLiteral_3= 'shared' ) | (enumLiteral_4= 'rslave' ) | (enumLiteral_5= 'slave' ) )
            {
            // InternalDockerCompose.g:4310:2: ( (enumLiteral_0= 'rprivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'rshared' ) | (enumLiteral_3= 'shared' ) | (enumLiteral_4= 'rslave' ) | (enumLiteral_5= 'slave' ) )
            int alt53=6;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt53=1;
                }
                break;
            case 86:
                {
                alt53=2;
                }
                break;
            case 87:
                {
                alt53=3;
                }
                break;
            case 88:
                {
                alt53=4;
                }
                break;
            case 89:
                {
                alt53=5;
                }
                break;
            case 90:
                {
                alt53=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalDockerCompose.g:4311:3: (enumLiteral_0= 'rprivate' )
                    {
                    // InternalDockerCompose.g:4311:3: (enumLiteral_0= 'rprivate' )
                    // InternalDockerCompose.g:4312:4: enumLiteral_0= 'rprivate'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getRprivateEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPropagationTypeAccess().getRprivateEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:4319:3: (enumLiteral_1= 'private' )
                    {
                    // InternalDockerCompose.g:4319:3: (enumLiteral_1= 'private' )
                    // InternalDockerCompose.g:4320:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPropagationTypeAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerCompose.g:4327:3: (enumLiteral_2= 'rshared' )
                    {
                    // InternalDockerCompose.g:4327:3: (enumLiteral_2= 'rshared' )
                    // InternalDockerCompose.g:4328:4: enumLiteral_2= 'rshared'
                    {
                    enumLiteral_2=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getRsharedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPropagationTypeAccess().getRsharedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDockerCompose.g:4335:3: (enumLiteral_3= 'shared' )
                    {
                    // InternalDockerCompose.g:4335:3: (enumLiteral_3= 'shared' )
                    // InternalDockerCompose.g:4336:4: enumLiteral_3= 'shared'
                    {
                    enumLiteral_3=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getSharedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPropagationTypeAccess().getSharedEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDockerCompose.g:4343:3: (enumLiteral_4= 'rslave' )
                    {
                    // InternalDockerCompose.g:4343:3: (enumLiteral_4= 'rslave' )
                    // InternalDockerCompose.g:4344:4: enumLiteral_4= 'rslave'
                    {
                    enumLiteral_4=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getPropagationTypeAccess().getRslaveEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPropagationTypeAccess().getRslaveEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDockerCompose.g:4351:3: (enumLiteral_5= 'slave' )
                    {
                    // InternalDockerCompose.g:4351:3: (enumLiteral_5= 'slave' )
                    // InternalDockerCompose.g:4352:4: enumLiteral_5= 'slave'
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


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\1\27\uffff";
    static final String dfa_3s = "\1\7\1\uffff\4\7\13\uffff\2\25\4\uffff\1\0";
    static final String dfa_4s = "\1\42\1\uffff\4\37\13\uffff\2\25\4\uffff\1\0";
    static final String dfa_5s = "\1\uffff\1\20\4\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\15\1\16\1\17\2\uffff\1\11\1\12\1\13\1\14\1\uffff";
    static final String dfa_6s = "\1\0\1\uffff\1\2\1\1\1\3\1\5\21\uffff\1\4}>";
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

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 337:6: ( ({...}? => ( ({...}? => ( (otherlv_4= 'build:' ( (lv_build_5_0= rulePATH ) ) ) | (otherlv_6= 'image:' ( (lv_image_7_0= ruleImage ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cpu_count:' ( (lv_cpu_count_9_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'command:' ( (lv_command_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'container_name:' ( (lv_container_name_13_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'restart:' ( (lv_restart_15_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'init:' ( (lv_init_17_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'read_only:' ( (lv_read_only_19_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'depends_on:' (otherlv_21= '-' ( (lv_depends_on_22_0= ruleDependency ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'networks:' ( (lv_networks_24_0= ruleNetworkConnector ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'volumes:' (otherlv_26= '-' ( (lv_volumes_27_0= ruleVolumeConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'configs:' (otherlv_29= '-' ( (lv_configs_30_0= ruleConfigConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'secrets:' (otherlv_32= '-' ( (lv_secrets_33_0= ruleSecretConnector ) ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'devices:' (otherlv_35= '-' this_DEVICE_36= RULE_DEVICE )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'dns:' ( (otherlv_38= '-' ( (lv_dns_39_0= ruleDNS ) ) )+ | ( (lv_dns_40_0= ruleDNS ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'ports:' (otherlv_42= '-' this_PORT_43= RULE_PORT )+ ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                         
                        int index17_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA17_0==EOF||LA17_0==RULE_ID||LA17_0==RULE_STRING||(LA17_0>=15 && LA17_0<=16)) ) {s = 1;}

                        else if ( (LA17_0==17) ) {s = 2;}

                        else if ( (LA17_0==18) ) {s = 3;}

                        else if ( (LA17_0==19) ) {s = 4;}

                        else if ( (LA17_0==20) ) {s = 5;}

                        else if ( LA17_0 >= 22 && LA17_0 <= 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 0) ) {s = 6;}

                        else if ( LA17_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 1) ) {s = 7;}

                        else if ( LA17_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 2) ) {s = 8;}

                        else if ( LA17_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 3) ) {s = 9;}

                        else if ( LA17_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 4) ) {s = 10;}

                        else if ( LA17_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 5) ) {s = 11;}

                        else if ( LA17_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 6) ) {s = 12;}

                        else if ( LA17_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 7) ) {s = 13;}

                        else if ( LA17_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 12) ) {s = 14;}

                        else if ( LA17_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 13) ) {s = 15;}

                        else if ( LA17_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 14) ) {s = 16;}

                         
                        input.seek(index17_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_3 = input.LA(1);

                         
                        int index17_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA17_3 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 9) ) {s = 20;}

                        else if ( (LA17_3==RULE_ID||LA17_3==RULE_STRING) ) {s = 1;}

                         
                        input.seek(index17_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_2 = input.LA(1);

                         
                        int index17_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA17_2==RULE_STRING) ) {s = 17;}

                        else if ( (LA17_2==RULE_ID) ) {s = 18;}

                        else if ( LA17_2 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8) ) {s = 19;}

                         
                        input.seek(index17_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_4 = input.LA(1);

                         
                        int index17_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA17_4 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 10) ) {s = 21;}

                        else if ( (LA17_4==RULE_ID||LA17_4==RULE_STRING) ) {s = 1;}

                         
                        input.seek(index17_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_23 = input.LA(1);

                         
                        int index17_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 8) ) {s = 19;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getServiceAccess().getUnorderedGroup_3()) ) {s = 1;}

                         
                        input.seek(index17_23);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA17_5==RULE_ID||LA17_5==RULE_STRING) ) {s = 1;}

                        else if ( LA17_5 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getServiceAccess().getUnorderedGroup_3(), 11) ) {s = 22;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
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

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()+ loopback of 1393:7: ( ({...}? => ( ({...}? => (otherlv_7= 'source:' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'type:' ( (lv_type_10_0= ruleMountType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'target:' ( (lv_container_path_12_0= rulePATH ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'read_only:' ( (lv_read_only_14_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'bind:' otherlv_16= 'propagation:' ( (lv_propagation_17_0= rulePropagationType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'volume:' otherlv_19= 'nocopy:' ( (lv_nocopy_20_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'tmpfs:' otherlv_22= 'size:' ( (lv_size_23_0= ruleEInt ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_9 = input.LA(1);

                         
                        int index25_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 3) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1()) ) {s = 1;}

                         
                        input.seek(index25_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_10 = input.LA(1);

                         
                        int index25_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 3) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1()) ) {s = 1;}

                         
                        input.seek(index25_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_0 = input.LA(1);

                         
                        int index25_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_0==EOF||LA25_0==RULE_ID||LA25_0==RULE_STRING||(LA25_0>=15 && LA25_0<=20)||(LA25_0>=22 && LA25_0<=28)||(LA25_0>=30 && LA25_0<=34)) ) {s = 1;}

                        else if ( (LA25_0==29) ) {s = 2;}

                        else if ( LA25_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 0) ) {s = 3;}

                        else if ( LA25_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 1) ) {s = 4;}

                        else if ( LA25_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 2) ) {s = 5;}

                        else if ( LA25_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 4) ) {s = 6;}

                        else if ( LA25_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 5) ) {s = 7;}

                        else if ( LA25_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getVolumeConnectorAccess().getUnorderedGroup_1_1(), 6) ) {s = 8;}

                         
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
            return "()* loopback of 2167:7: ( ({...}? => ( ({...}? => (otherlv_6= 'driver:' ( (lv_driver_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'attachable:' ( (lv_attachable_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'enable_ipv6:' ( (lv_enable_ipv6_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internal:' ( (lv_internal_13_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'external:' ( (lv_external_15_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'name:' ( (lv_network_name_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'labels:' ( (lv_labels_19_0= ruleNetworkLabel ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'driver_opts:' ( (lv_driver_opts_21_0= ruleNetworkDriverOpt ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'ipam:' ( (lv_ipam_23_0= ruleIPAM ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_0 = input.LA(1);

                         
                        int index33_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA33_0==EOF||LA33_0==RULE_ID||LA33_0==RULE_STRING||(LA33_0>=15 && LA33_0<=20)) ) {s = 1;}

                        else if ( LA33_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 0) ) {s = 2;}

                        else if ( LA33_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 1) ) {s = 3;}

                        else if ( LA33_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 2) ) {s = 4;}

                        else if ( LA33_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 3) ) {s = 5;}

                        else if ( LA33_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 4) ) {s = 6;}

                        else if ( LA33_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 5) ) {s = 7;}

                        else if ( LA33_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 6) ) {s = 8;}

                        else if ( LA33_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 7) ) {s = 9;}

                        else if ( LA33_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkAccess().getUnorderedGroup_3_1(), 8) ) {s = 10;}

                         
                        input.seek(index33_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
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
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000578020000280L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0007028000000280L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
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
