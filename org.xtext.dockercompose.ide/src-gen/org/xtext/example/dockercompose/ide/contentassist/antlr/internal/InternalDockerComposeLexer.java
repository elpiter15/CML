package org.xtext.example.dockercompose.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDockerComposeLexer extends Lexer {
    public static final int RULE_DEVICE_DEF=9;
    public static final int T__50=50;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int RULE_VERSION=7;
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
    public static final int RULE_QUOTED_INT=10;
    public static final int RULE_ID=6;
    public static final int RULE_PORT_DEF=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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
    public static final int RULE_STRING=5;
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

    public InternalDockerComposeLexer() {;} 
    public InternalDockerComposeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDockerComposeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDockerCompose.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:11:7: ( 'true' )
            // InternalDockerCompose.g:11:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:12:7: ( 'false' )
            // InternalDockerCompose.g:12:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:13:7: ( '\"no\"' )
            // InternalDockerCompose.g:13:9: '\"no\"'
            {
            match("\"no\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:14:7: ( 'always' )
            // InternalDockerCompose.g:14:9: 'always'
            {
            match("always"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:15:7: ( 'on-failure' )
            // InternalDockerCompose.g:15:9: 'on-failure'
            {
            match("on-failure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:16:7: ( 'unless-stopped' )
            // InternalDockerCompose.g:16:9: 'unless-stopped'
            {
            match("unless-stopped"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:17:7: ( 'rw' )
            // InternalDockerCompose.g:17:9: 'rw'
            {
            match("rw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:18:7: ( 'ro' )
            // InternalDockerCompose.g:18:9: 'ro'
            {
            match("ro"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:19:7: ( 'z' )
            // InternalDockerCompose.g:19:9: 'z'
            {
            match('z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:20:7: ( 'volume' )
            // InternalDockerCompose.g:20:9: 'volume'
            {
            match("volume"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:21:7: ( 'bind' )
            // InternalDockerCompose.g:21:9: 'bind'
            {
            match("bind"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:22:7: ( 'tmpfs' )
            // InternalDockerCompose.g:22:9: 'tmpfs'
            {
            match("tmpfs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:23:7: ( 'npipe' )
            // InternalDockerCompose.g:23:9: 'npipe'
            {
            match("npipe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:24:7: ( 'rprivate' )
            // InternalDockerCompose.g:24:9: 'rprivate'
            {
            match("rprivate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:25:7: ( 'private' )
            // InternalDockerCompose.g:25:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:26:7: ( 'rshared' )
            // InternalDockerCompose.g:26:9: 'rshared'
            {
            match("rshared"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:27:7: ( 'shared' )
            // InternalDockerCompose.g:27:9: 'shared'
            {
            match("shared"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:28:7: ( 'rslave' )
            // InternalDockerCompose.g:28:9: 'rslave'
            {
            match("rslave"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:29:7: ( 'slave' )
            // InternalDockerCompose.g:29:9: 'slave'
            {
            match("slave"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:30:7: ( 'version:' )
            // InternalDockerCompose.g:30:9: 'version:'
            {
            match("version:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:31:7: ( 'services:' )
            // InternalDockerCompose.g:31:9: 'services:'
            {
            match("services:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:32:7: ( 'networks:' )
            // InternalDockerCompose.g:32:9: 'networks:'
            {
            match("networks:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:33:7: ( 'volumes:' )
            // InternalDockerCompose.g:33:9: 'volumes:'
            {
            match("volumes:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:34:7: ( 'configs:' )
            // InternalDockerCompose.g:34:9: 'configs:'
            {
            match("configs:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:35:7: ( 'secrets:' )
            // InternalDockerCompose.g:35:9: 'secrets:'
            {
            match("secrets:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:36:7: ( ':' )
            // InternalDockerCompose.g:36:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:37:7: ( 'build:' )
            // InternalDockerCompose.g:37:9: 'build:'
            {
            match("build:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:38:7: ( 'image:' )
            // InternalDockerCompose.g:38:9: 'image:'
            {
            match("image:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:39:7: ( 'cpu_count:' )
            // InternalDockerCompose.g:39:9: 'cpu_count:'
            {
            match("cpu_count:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:40:7: ( 'command:' )
            // InternalDockerCompose.g:40:9: 'command:'
            {
            match("command:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:41:7: ( 'container_name:' )
            // InternalDockerCompose.g:41:9: 'container_name:'
            {
            match("container_name:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:42:7: ( 'restart:' )
            // InternalDockerCompose.g:42:9: 'restart:'
            {
            match("restart:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:43:7: ( 'init:' )
            // InternalDockerCompose.g:43:9: 'init:'
            {
            match("init:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:44:7: ( 'read_only:' )
            // InternalDockerCompose.g:44:9: 'read_only:'
            {
            match("read_only:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:45:7: ( 'depends_on:' )
            // InternalDockerCompose.g:45:9: 'depends_on:'
            {
            match("depends_on:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:46:7: ( '-' )
            // InternalDockerCompose.g:46:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:47:7: ( 'devices:' )
            // InternalDockerCompose.g:47:9: 'devices:'
            {
            match("devices:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:48:7: ( 'dns:' )
            // InternalDockerCompose.g:48:9: 'dns:'
            {
            match("dns:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:49:7: ( 'ports:' )
            // InternalDockerCompose.g:49:9: 'ports:'
            {
            match("ports:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:50:7: ( 'ipv4_address:' )
            // InternalDockerCompose.g:50:9: 'ipv4_address:'
            {
            match("ipv4_address:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:51:7: ( 'priority:' )
            // InternalDockerCompose.g:51:9: 'priority:'
            {
            match("priority:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:52:7: ( 'aliases:' )
            // InternalDockerCompose.g:52:9: 'aliases:'
            {
            match("aliases:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:53:7: ( 'link_local_ips:' )
            // InternalDockerCompose.g:53:9: 'link_local_ips:'
            {
            match("link_local_ips:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:54:7: ( 'source:' )
            // InternalDockerCompose.g:54:9: 'source:'
            {
            match("source:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:55:7: ( 'type:' )
            // InternalDockerCompose.g:55:9: 'type:'
            {
            match("type:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:56:7: ( 'target:' )
            // InternalDockerCompose.g:56:9: 'target:'
            {
            match("target:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:57:7: ( 'bind:' )
            // InternalDockerCompose.g:57:9: 'bind:'
            {
            match("bind:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:58:7: ( 'propagation:' )
            // InternalDockerCompose.g:58:9: 'propagation:'
            {
            match("propagation:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:59:7: ( 'volume:' )
            // InternalDockerCompose.g:59:9: 'volume:'
            {
            match("volume:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:60:7: ( 'nocopy:' )
            // InternalDockerCompose.g:60:9: 'nocopy:'
            {
            match("nocopy:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:61:7: ( 'tmpfs:' )
            // InternalDockerCompose.g:61:9: 'tmpfs:'
            {
            match("tmpfs:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:62:7: ( 'size:' )
            // InternalDockerCompose.g:62:9: 'size:'
            {
            match("size:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:63:7: ( 'uid:' )
            // InternalDockerCompose.g:63:9: 'uid:'
            {
            match("uid:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:64:7: ( 'gid:' )
            // InternalDockerCompose.g:64:9: 'gid:'
            {
            match("gid:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:65:7: ( 'mode:' )
            // InternalDockerCompose.g:65:9: 'mode:'
            {
            match("mode:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:66:7: ( '{' )
            // InternalDockerCompose.g:66:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:67:7: ( '}' )
            // InternalDockerCompose.g:67:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:68:7: ( 'driver:' )
            // InternalDockerCompose.g:68:9: 'driver:'
            {
            match("driver:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:69:7: ( 'attachable:' )
            // InternalDockerCompose.g:69:9: 'attachable:'
            {
            match("attachable:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:70:7: ( 'enable_ipv6:' )
            // InternalDockerCompose.g:70:9: 'enable_ipv6:'
            {
            match("enable_ipv6:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:71:7: ( 'internal:' )
            // InternalDockerCompose.g:71:9: 'internal:'
            {
            match("internal:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:72:7: ( 'external:' )
            // InternalDockerCompose.g:72:9: 'external:'
            {
            match("external:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:73:7: ( 'name:' )
            // InternalDockerCompose.g:73:9: 'name:'
            {
            match("name:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:74:7: ( 'labels:' )
            // InternalDockerCompose.g:74:9: 'labels:'
            {
            match("labels:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:75:7: ( 'driver_opts:' )
            // InternalDockerCompose.g:75:9: 'driver_opts:'
            {
            match("driver_opts:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:76:7: ( 'ipam:' )
            // InternalDockerCompose.g:76:9: 'ipam:'
            {
            match("ipam:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:77:7: ( 'file:' )
            // InternalDockerCompose.g:77:9: 'file:'
            {
            match("file:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:78:7: ( 'environment:' )
            // InternalDockerCompose.g:78:9: 'environment:'
            {
            match("environment:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:79:7: ( 'config:' )
            // InternalDockerCompose.g:79:9: 'config:'
            {
            match("config:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:80:7: ( 'options:' )
            // InternalDockerCompose.g:80:9: 'options:'
            {
            match("options:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:81:7: ( 'subnet:' )
            // InternalDockerCompose.g:81:9: 'subnet:'
            {
            match("subnet:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:82:7: ( 'ip_range:' )
            // InternalDockerCompose.g:82:9: 'ip_range:'
            {
            match("ip_range:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:83:7: ( 'gateway:' )
            // InternalDockerCompose.g:83:9: 'gateway:'
            {
            match("gateway:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:84:7: ( 'aux_addresses:' )
            // InternalDockerCompose.g:84:9: 'aux_addresses:'
            {
            match("aux_addresses:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:85:7: ( '.' )
            // InternalDockerCompose.g:85:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:86:7: ( '/' )
            // InternalDockerCompose.g:86:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "RULE_VERSION"
    public final void mRULE_VERSION() throws RecognitionException {
        try {
            int _type = RULE_VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:12899:14: ( '\"' RULE_INT '.' RULE_INT '\"' )
            // InternalDockerCompose.g:12899:16: '\"' RULE_INT '.' RULE_INT '\"'
            {
            match('\"'); 
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VERSION"

    // $ANTLR start "RULE_QUOTED_INT"
    public final void mRULE_QUOTED_INT() throws RecognitionException {
        try {
            int _type = RULE_QUOTED_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:12901:17: ( '\"' '\"' )
            // InternalDockerCompose.g:12901:19: '\"' '\"'
            {
            match('\"'); 
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUOTED_INT"

    // $ANTLR start "RULE_PORT_DEF"
    public final void mRULE_PORT_DEF() throws RecognitionException {
        try {
            int _type = RULE_PORT_DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:12903:15: ( '\"' ( ( ( ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':' )? RULE_INT '-' RULE_INT ':' )? RULE_INT '-' RULE_INT ( '/' RULE_ID )? | ( ( ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':' )? RULE_INT ':' )? RULE_INT ( '/' RULE_ID )? ) '\"' )
            // InternalDockerCompose.g:12903:17: '\"' ( ( ( ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':' )? RULE_INT '-' RULE_INT ':' )? RULE_INT '-' RULE_INT ( '/' RULE_ID )? | ( ( ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':' )? RULE_INT ':' )? RULE_INT ( '/' RULE_ID )? ) '\"'
            {
            match('\"'); 
            // InternalDockerCompose.g:12903:21: ( ( ( ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':' )? RULE_INT '-' RULE_INT ':' )? RULE_INT '-' RULE_INT ( '/' RULE_ID )? | ( ( ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':' )? RULE_INT ':' )? RULE_INT ( '/' RULE_ID )? )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalDockerCompose.g:12903:22: ( ( ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':' )? RULE_INT '-' RULE_INT ':' )? RULE_INT '-' RULE_INT ( '/' RULE_ID )?
                    {
                    // InternalDockerCompose.g:12903:22: ( ( ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':' )? RULE_INT '-' RULE_INT ':' )?
                    int alt6=2;
                    alt6 = dfa6.predict(input);
                    switch (alt6) {
                        case 1 :
                            // InternalDockerCompose.g:12903:23: ( ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':' )? RULE_INT '-' RULE_INT ':'
                            {
                            // InternalDockerCompose.g:12903:23: ( ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':' )?
                            int alt5=2;
                            alt5 = dfa5.predict(input);
                            switch (alt5) {
                                case 1 :
                                    // InternalDockerCompose.g:12903:24: ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':'
                                    {
                                    // InternalDockerCompose.g:12903:24: ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' )
                                    int alt1=4;
                                    alt1 = dfa1.predict(input);
                                    switch (alt1) {
                                        case 1 :
                                            // InternalDockerCompose.g:12903:25: '0' .. '9'
                                            {
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 2 :
                                            // InternalDockerCompose.g:12903:34: '0' .. '9' '0' .. '9'
                                            {
                                            matchRange('0','9'); 
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 3 :
                                            // InternalDockerCompose.g:12903:52: '1' '0' .. '9' '0' .. '9'
                                            {
                                            match('1'); 
                                            matchRange('0','9'); 
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 4 :
                                            // InternalDockerCompose.g:12903:74: '2' '0' .. '5' '0' .. '5'
                                            {
                                            match('2'); 
                                            matchRange('0','5'); 
                                            matchRange('0','5'); 

                                            }
                                            break;

                                    }

                                    match('.'); 
                                    // InternalDockerCompose.g:12903:101: ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' )
                                    int alt2=4;
                                    alt2 = dfa2.predict(input);
                                    switch (alt2) {
                                        case 1 :
                                            // InternalDockerCompose.g:12903:102: '0' .. '9'
                                            {
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 2 :
                                            // InternalDockerCompose.g:12903:111: '0' .. '9' '0' .. '9'
                                            {
                                            matchRange('0','9'); 
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 3 :
                                            // InternalDockerCompose.g:12903:129: '1' '0' .. '9' '0' .. '9'
                                            {
                                            match('1'); 
                                            matchRange('0','9'); 
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 4 :
                                            // InternalDockerCompose.g:12903:151: '2' '0' .. '5' '0' .. '5'
                                            {
                                            match('2'); 
                                            matchRange('0','5'); 
                                            matchRange('0','5'); 

                                            }
                                            break;

                                    }

                                    match('.'); 
                                    // InternalDockerCompose.g:12903:178: ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' )
                                    int alt3=4;
                                    alt3 = dfa3.predict(input);
                                    switch (alt3) {
                                        case 1 :
                                            // InternalDockerCompose.g:12903:179: '0' .. '9'
                                            {
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 2 :
                                            // InternalDockerCompose.g:12903:188: '0' .. '9' '0' .. '9'
                                            {
                                            matchRange('0','9'); 
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 3 :
                                            // InternalDockerCompose.g:12903:206: '1' '0' .. '9' '0' .. '9'
                                            {
                                            match('1'); 
                                            matchRange('0','9'); 
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 4 :
                                            // InternalDockerCompose.g:12903:228: '2' '0' .. '5' '0' .. '5'
                                            {
                                            match('2'); 
                                            matchRange('0','5'); 
                                            matchRange('0','5'); 

                                            }
                                            break;

                                    }

                                    match('.'); 
                                    // InternalDockerCompose.g:12903:255: ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' )
                                    int alt4=4;
                                    alt4 = dfa4.predict(input);
                                    switch (alt4) {
                                        case 1 :
                                            // InternalDockerCompose.g:12903:256: '0' .. '9'
                                            {
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 2 :
                                            // InternalDockerCompose.g:12903:265: '0' .. '9' '0' .. '9'
                                            {
                                            matchRange('0','9'); 
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 3 :
                                            // InternalDockerCompose.g:12903:283: '1' '0' .. '9' '0' .. '9'
                                            {
                                            match('1'); 
                                            matchRange('0','9'); 
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 4 :
                                            // InternalDockerCompose.g:12903:305: '2' '0' .. '5' '0' .. '5'
                                            {
                                            match('2'); 
                                            matchRange('0','5'); 
                                            matchRange('0','5'); 

                                            }
                                            break;

                                    }

                                    match(':'); 

                                    }
                                    break;

                            }

                            mRULE_INT(); 
                            match('-'); 
                            mRULE_INT(); 
                            match(':'); 

                            }
                            break;

                    }

                    mRULE_INT(); 
                    match('-'); 
                    mRULE_INT(); 
                    // InternalDockerCompose.g:12903:384: ( '/' RULE_ID )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='/') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalDockerCompose.g:12903:385: '/' RULE_ID
                            {
                            match('/'); 
                            mRULE_ID(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:12903:399: ( ( ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':' )? RULE_INT ':' )? RULE_INT ( '/' RULE_ID )?
                    {
                    // InternalDockerCompose.g:12903:399: ( ( ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':' )? RULE_INT ':' )?
                    int alt13=2;
                    alt13 = dfa13.predict(input);
                    switch (alt13) {
                        case 1 :
                            // InternalDockerCompose.g:12903:400: ( ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':' )? RULE_INT ':'
                            {
                            // InternalDockerCompose.g:12903:400: ( ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':' )?
                            int alt12=2;
                            alt12 = dfa12.predict(input);
                            switch (alt12) {
                                case 1 :
                                    // InternalDockerCompose.g:12903:401: ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':'
                                    {
                                    // InternalDockerCompose.g:12903:401: ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' )
                                    int alt8=4;
                                    alt8 = dfa8.predict(input);
                                    switch (alt8) {
                                        case 1 :
                                            // InternalDockerCompose.g:12903:402: '0' .. '9'
                                            {
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 2 :
                                            // InternalDockerCompose.g:12903:411: '0' .. '9' '0' .. '9'
                                            {
                                            matchRange('0','9'); 
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 3 :
                                            // InternalDockerCompose.g:12903:429: '1' '0' .. '9' '0' .. '9'
                                            {
                                            match('1'); 
                                            matchRange('0','9'); 
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 4 :
                                            // InternalDockerCompose.g:12903:451: '2' '0' .. '5' '0' .. '5'
                                            {
                                            match('2'); 
                                            matchRange('0','5'); 
                                            matchRange('0','5'); 

                                            }
                                            break;

                                    }

                                    match('.'); 
                                    // InternalDockerCompose.g:12903:478: ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' )
                                    int alt9=4;
                                    alt9 = dfa9.predict(input);
                                    switch (alt9) {
                                        case 1 :
                                            // InternalDockerCompose.g:12903:479: '0' .. '9'
                                            {
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 2 :
                                            // InternalDockerCompose.g:12903:488: '0' .. '9' '0' .. '9'
                                            {
                                            matchRange('0','9'); 
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 3 :
                                            // InternalDockerCompose.g:12903:506: '1' '0' .. '9' '0' .. '9'
                                            {
                                            match('1'); 
                                            matchRange('0','9'); 
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 4 :
                                            // InternalDockerCompose.g:12903:528: '2' '0' .. '5' '0' .. '5'
                                            {
                                            match('2'); 
                                            matchRange('0','5'); 
                                            matchRange('0','5'); 

                                            }
                                            break;

                                    }

                                    match('.'); 
                                    // InternalDockerCompose.g:12903:555: ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' )
                                    int alt10=4;
                                    alt10 = dfa10.predict(input);
                                    switch (alt10) {
                                        case 1 :
                                            // InternalDockerCompose.g:12903:556: '0' .. '9'
                                            {
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 2 :
                                            // InternalDockerCompose.g:12903:565: '0' .. '9' '0' .. '9'
                                            {
                                            matchRange('0','9'); 
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 3 :
                                            // InternalDockerCompose.g:12903:583: '1' '0' .. '9' '0' .. '9'
                                            {
                                            match('1'); 
                                            matchRange('0','9'); 
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 4 :
                                            // InternalDockerCompose.g:12903:605: '2' '0' .. '5' '0' .. '5'
                                            {
                                            match('2'); 
                                            matchRange('0','5'); 
                                            matchRange('0','5'); 

                                            }
                                            break;

                                    }

                                    match('.'); 
                                    // InternalDockerCompose.g:12903:632: ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' )
                                    int alt11=4;
                                    alt11 = dfa11.predict(input);
                                    switch (alt11) {
                                        case 1 :
                                            // InternalDockerCompose.g:12903:633: '0' .. '9'
                                            {
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 2 :
                                            // InternalDockerCompose.g:12903:642: '0' .. '9' '0' .. '9'
                                            {
                                            matchRange('0','9'); 
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 3 :
                                            // InternalDockerCompose.g:12903:660: '1' '0' .. '9' '0' .. '9'
                                            {
                                            match('1'); 
                                            matchRange('0','9'); 
                                            matchRange('0','9'); 

                                            }
                                            break;
                                        case 4 :
                                            // InternalDockerCompose.g:12903:682: '2' '0' .. '5' '0' .. '5'
                                            {
                                            match('2'); 
                                            matchRange('0','5'); 
                                            matchRange('0','5'); 

                                            }
                                            break;

                                    }

                                    match(':'); 

                                    }
                                    break;

                            }

                            mRULE_INT(); 
                            match(':'); 

                            }
                            break;

                    }

                    mRULE_INT(); 
                    // InternalDockerCompose.g:12903:735: ( '/' RULE_ID )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='/') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalDockerCompose.g:12903:736: '/' RULE_ID
                            {
                            match('/'); 
                            mRULE_ID(); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PORT_DEF"

    // $ANTLR start "RULE_DEVICE_DEF"
    public final void mRULE_DEVICE_DEF() throws RecognitionException {
        try {
            int _type = RULE_DEVICE_DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:12905:17: ( '\"' ( '.' )? ( '/' )? RULE_ID ':' ( '.' )? ( '/' )? RULE_ID ( ':' RULE_ID )? '\"' )
            // InternalDockerCompose.g:12905:19: '\"' ( '.' )? ( '/' )? RULE_ID ':' ( '.' )? ( '/' )? RULE_ID ( ':' RULE_ID )? '\"'
            {
            match('\"'); 
            // InternalDockerCompose.g:12905:23: ( '.' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='.') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDockerCompose.g:12905:23: '.'
                    {
                    match('.'); 

                    }
                    break;

            }

            // InternalDockerCompose.g:12905:28: ( '/' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='/') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDockerCompose.g:12905:28: '/'
                    {
                    match('/'); 

                    }
                    break;

            }

            mRULE_ID(); 
            match(':'); 
            // InternalDockerCompose.g:12905:45: ( '.' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='.') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDockerCompose.g:12905:45: '.'
                    {
                    match('.'); 

                    }
                    break;

            }

            // InternalDockerCompose.g:12905:50: ( '/' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='/') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDockerCompose.g:12905:50: '/'
                    {
                    match('/'); 

                    }
                    break;

            }

            mRULE_ID(); 
            // InternalDockerCompose.g:12905:63: ( ':' RULE_ID )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==':') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDockerCompose.g:12905:64: ':' RULE_ID
                    {
                    match(':'); 
                    mRULE_ID(); 

                    }
                    break;

            }

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEVICE_DEF"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:12907:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '/' | '.' | '0' .. '9' )* )
            // InternalDockerCompose.g:12907:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '/' | '.' | '0' .. '9' )*
            {
            // InternalDockerCompose.g:12907:11: ( '^' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='^') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDockerCompose.g:12907:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDockerCompose.g:12907:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '/' | '.' | '0' .. '9' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='-' && LA22_0<='9')||(LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='z')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDockerCompose.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:12909:10: ( ( '0' .. '9' )+ )
            // InternalDockerCompose.g:12909:12: ( '0' .. '9' )+
            {
            // InternalDockerCompose.g:12909:12: ( '0' .. '9' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDockerCompose.g:12909:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:12911:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDockerCompose.g:12911:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDockerCompose.g:12911:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\"') ) {
                alt26=1;
            }
            else if ( (LA26_0=='\'') ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalDockerCompose.g:12911:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDockerCompose.g:12911:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop24:
                    do {
                        int alt24=3;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0=='\\') ) {
                            alt24=1;
                        }
                        else if ( ((LA24_0>='\u0000' && LA24_0<='!')||(LA24_0>='#' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFF')) ) {
                            alt24=2;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalDockerCompose.g:12911:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDockerCompose.g:12911:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalDockerCompose.g:12911:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDockerCompose.g:12911:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop25:
                    do {
                        int alt25=3;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0=='\\') ) {
                            alt25=1;
                        }
                        else if ( ((LA25_0>='\u0000' && LA25_0<='&')||(LA25_0>='(' && LA25_0<='[')||(LA25_0>=']' && LA25_0<='\uFFFF')) ) {
                            alt25=2;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalDockerCompose.g:12911:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDockerCompose.g:12911:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:12913:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDockerCompose.g:12913:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDockerCompose.g:12913:24: ( options {greedy=false; } : . )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='*') ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1=='/') ) {
                        alt27=2;
                    }
                    else if ( ((LA27_1>='\u0000' && LA27_1<='.')||(LA27_1>='0' && LA27_1<='\uFFFF')) ) {
                        alt27=1;
                    }


                }
                else if ( ((LA27_0>='\u0000' && LA27_0<=')')||(LA27_0>='+' && LA27_0<='\uFFFF')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDockerCompose.g:12913:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:12915:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDockerCompose.g:12915:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDockerCompose.g:12915:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='\u0000' && LA28_0<='\t')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\uFFFF')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDockerCompose.g:12915:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalDockerCompose.g:12915:40: ( ( '\\r' )? '\\n' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\n'||LA30_0=='\r') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDockerCompose.g:12915:41: ( '\\r' )? '\\n'
                    {
                    // InternalDockerCompose.g:12915:41: ( '\\r' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0=='\r') ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalDockerCompose.g:12915:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:12917:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDockerCompose.g:12917:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDockerCompose.g:12917:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='\t' && LA31_0<='\n')||LA31_0=='\r'||LA31_0==' ') ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDockerCompose.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerCompose.g:12919:16: ( . )
            // InternalDockerCompose.g:12919:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalDockerCompose.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | RULE_VERSION | RULE_QUOTED_INT | RULE_PORT_DEF | RULE_DEVICE_DEF | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt32=87;
        alt32 = dfa32.predict(input);
        switch (alt32) {
            case 1 :
                // InternalDockerCompose.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalDockerCompose.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalDockerCompose.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalDockerCompose.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalDockerCompose.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalDockerCompose.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalDockerCompose.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalDockerCompose.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalDockerCompose.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalDockerCompose.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalDockerCompose.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalDockerCompose.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalDockerCompose.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalDockerCompose.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalDockerCompose.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalDockerCompose.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalDockerCompose.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalDockerCompose.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalDockerCompose.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalDockerCompose.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalDockerCompose.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalDockerCompose.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalDockerCompose.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalDockerCompose.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalDockerCompose.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalDockerCompose.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalDockerCompose.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalDockerCompose.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalDockerCompose.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalDockerCompose.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalDockerCompose.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalDockerCompose.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalDockerCompose.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // InternalDockerCompose.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // InternalDockerCompose.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // InternalDockerCompose.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // InternalDockerCompose.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // InternalDockerCompose.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // InternalDockerCompose.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // InternalDockerCompose.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // InternalDockerCompose.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // InternalDockerCompose.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // InternalDockerCompose.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // InternalDockerCompose.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // InternalDockerCompose.g:1:274: T__59
                {
                mT__59(); 

                }
                break;
            case 46 :
                // InternalDockerCompose.g:1:280: T__60
                {
                mT__60(); 

                }
                break;
            case 47 :
                // InternalDockerCompose.g:1:286: T__61
                {
                mT__61(); 

                }
                break;
            case 48 :
                // InternalDockerCompose.g:1:292: T__62
                {
                mT__62(); 

                }
                break;
            case 49 :
                // InternalDockerCompose.g:1:298: T__63
                {
                mT__63(); 

                }
                break;
            case 50 :
                // InternalDockerCompose.g:1:304: T__64
                {
                mT__64(); 

                }
                break;
            case 51 :
                // InternalDockerCompose.g:1:310: T__65
                {
                mT__65(); 

                }
                break;
            case 52 :
                // InternalDockerCompose.g:1:316: T__66
                {
                mT__66(); 

                }
                break;
            case 53 :
                // InternalDockerCompose.g:1:322: T__67
                {
                mT__67(); 

                }
                break;
            case 54 :
                // InternalDockerCompose.g:1:328: T__68
                {
                mT__68(); 

                }
                break;
            case 55 :
                // InternalDockerCompose.g:1:334: T__69
                {
                mT__69(); 

                }
                break;
            case 56 :
                // InternalDockerCompose.g:1:340: T__70
                {
                mT__70(); 

                }
                break;
            case 57 :
                // InternalDockerCompose.g:1:346: T__71
                {
                mT__71(); 

                }
                break;
            case 58 :
                // InternalDockerCompose.g:1:352: T__72
                {
                mT__72(); 

                }
                break;
            case 59 :
                // InternalDockerCompose.g:1:358: T__73
                {
                mT__73(); 

                }
                break;
            case 60 :
                // InternalDockerCompose.g:1:364: T__74
                {
                mT__74(); 

                }
                break;
            case 61 :
                // InternalDockerCompose.g:1:370: T__75
                {
                mT__75(); 

                }
                break;
            case 62 :
                // InternalDockerCompose.g:1:376: T__76
                {
                mT__76(); 

                }
                break;
            case 63 :
                // InternalDockerCompose.g:1:382: T__77
                {
                mT__77(); 

                }
                break;
            case 64 :
                // InternalDockerCompose.g:1:388: T__78
                {
                mT__78(); 

                }
                break;
            case 65 :
                // InternalDockerCompose.g:1:394: T__79
                {
                mT__79(); 

                }
                break;
            case 66 :
                // InternalDockerCompose.g:1:400: T__80
                {
                mT__80(); 

                }
                break;
            case 67 :
                // InternalDockerCompose.g:1:406: T__81
                {
                mT__81(); 

                }
                break;
            case 68 :
                // InternalDockerCompose.g:1:412: T__82
                {
                mT__82(); 

                }
                break;
            case 69 :
                // InternalDockerCompose.g:1:418: T__83
                {
                mT__83(); 

                }
                break;
            case 70 :
                // InternalDockerCompose.g:1:424: T__84
                {
                mT__84(); 

                }
                break;
            case 71 :
                // InternalDockerCompose.g:1:430: T__85
                {
                mT__85(); 

                }
                break;
            case 72 :
                // InternalDockerCompose.g:1:436: T__86
                {
                mT__86(); 

                }
                break;
            case 73 :
                // InternalDockerCompose.g:1:442: T__87
                {
                mT__87(); 

                }
                break;
            case 74 :
                // InternalDockerCompose.g:1:448: T__88
                {
                mT__88(); 

                }
                break;
            case 75 :
                // InternalDockerCompose.g:1:454: T__89
                {
                mT__89(); 

                }
                break;
            case 76 :
                // InternalDockerCompose.g:1:460: T__90
                {
                mT__90(); 

                }
                break;
            case 77 :
                // InternalDockerCompose.g:1:466: RULE_VERSION
                {
                mRULE_VERSION(); 

                }
                break;
            case 78 :
                // InternalDockerCompose.g:1:479: RULE_QUOTED_INT
                {
                mRULE_QUOTED_INT(); 

                }
                break;
            case 79 :
                // InternalDockerCompose.g:1:495: RULE_PORT_DEF
                {
                mRULE_PORT_DEF(); 

                }
                break;
            case 80 :
                // InternalDockerCompose.g:1:509: RULE_DEVICE_DEF
                {
                mRULE_DEVICE_DEF(); 

                }
                break;
            case 81 :
                // InternalDockerCompose.g:1:525: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 82 :
                // InternalDockerCompose.g:1:533: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 83 :
                // InternalDockerCompose.g:1:542: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 84 :
                // InternalDockerCompose.g:1:554: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 85 :
                // InternalDockerCompose.g:1:570: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 86 :
                // InternalDockerCompose.g:1:586: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 87 :
                // InternalDockerCompose.g:1:594: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA15_eotS =
        "\51\uffff";
    static final String DFA15_eofS =
        "\51\uffff";
    static final String DFA15_minS =
        "\1\60\4\42\2\uffff\1\60\3\42\3\56\2\42\1\56\1\60\10\56\1\60\3\56\3\60\1\56\3\60\2\72\1\55\1\72";
    static final String DFA15_maxS =
        "\1\71\4\72\2\uffff\1\71\3\72\3\71\2\72\2\71\1\65\2\56\3\71\1\56\2\71\1\65\2\56\3\72\1\56\1\72\1\71\5\72";
    static final String DFA15_acceptS =
        "\5\uffff\1\1\1\2\42\uffff";
    static final String DFA15_specialS =
        "\51\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\3\1\1\1\2\7\3",
            "\1\6\12\uffff\1\5\1\7\1\6\12\4\1\6",
            "\1\6\12\uffff\1\5\1\7\1\6\6\10\4\11\1\6",
            "\1\6\12\uffff\1\5\1\7\1\6\12\11\1\6",
            "\1\6\12\uffff\1\5\1\7\1\6\12\12\1\6",
            "",
            "",
            "\1\15\1\13\1\14\7\15",
            "\1\6\12\uffff\1\5\1\7\1\6\6\16\4\17\1\6",
            "\1\6\12\uffff\1\5\1\7\1\6\12\17\1\6",
            "\1\6\12\uffff\1\5\1\7\1\6\12\17\1\6",
            "\1\21\1\uffff\12\20",
            "\1\21\1\uffff\6\22\4\23",
            "\1\21\1\uffff\12\23",
            "\1\6\12\uffff\1\5\1\7\1\6\12\17\1\6",
            "\1\6\12\uffff\1\5\1\uffff\1\6\12\17\1\6",
            "\1\21\1\uffff\12\24",
            "\1\27\1\25\1\26\7\27",
            "\1\21\1\uffff\6\30",
            "\1\21",
            "\1\21",
            "\1\32\1\uffff\12\31",
            "\1\32\1\uffff\6\33\4\34",
            "\1\32\1\uffff\12\34",
            "\1\21",
            "\1\32\1\uffff\12\35",
            "\1\40\1\36\1\37\7\40",
            "\1\32\1\uffff\6\41",
            "\1\32",
            "\1\32",
            "\12\42\1\43",
            "\6\44\4\45\1\43",
            "\12\45\1\43",
            "\1\32",
            "\12\46\1\43",
            "\12\47",
            "\6\50\4\uffff\1\43",
            "\1\43",
            "\1\43",
            "\1\5\2\uffff\12\47\1\6",
            "\1\43"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "12903:21: ( ( ( ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':' )? RULE_INT '-' RULE_INT ':' )? RULE_INT '-' RULE_INT ( '/' RULE_ID )? | ( ( ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':' )? RULE_INT ':' )? RULE_INT ( '/' RULE_ID )? )";
        }
    }
    static final String DFA6_eotS =
        "\16\uffff";
    static final String DFA6_eofS =
        "\16\uffff";
    static final String DFA6_minS =
        "\1\60\4\55\1\60\1\uffff\3\55\1\42\2\55\1\uffff";
    static final String DFA6_maxS =
        "\6\71\1\uffff\3\71\1\72\2\71\1\uffff";
    static final String DFA6_acceptS =
        "\6\uffff\1\1\6\uffff\1\2";
    static final String DFA6_specialS =
        "\16\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\3\1\1\1\2\7\3",
            "\1\5\1\6\1\uffff\12\4",
            "\1\5\1\6\1\uffff\6\7\4\10",
            "\1\5\1\6\1\uffff\12\10",
            "\1\5\1\6\1\uffff\12\11",
            "\12\12",
            "",
            "\1\5\1\6\1\uffff\6\13\4\14",
            "\1\5\1\6\1\uffff\12\14",
            "\1\5\1\6\1\uffff\12\14",
            "\1\15\14\uffff\1\15\12\12\1\6",
            "\1\5\1\6\1\uffff\12\14",
            "\1\5\2\uffff\12\14",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "12903:22: ( ( ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':' )? RULE_INT '-' RULE_INT ':' )?";
        }
    }
    static final String DFA5_eotS =
        "\13\uffff";
    static final String DFA5_eofS =
        "\13\uffff";
    static final String DFA5_minS =
        "\1\60\4\55\2\uffff\4\55";
    static final String DFA5_maxS =
        "\5\71\2\uffff\4\71";
    static final String DFA5_acceptS =
        "\5\uffff\1\2\1\1\4\uffff";
    static final String DFA5_specialS =
        "\13\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\3\1\1\1\2\7\3",
            "\1\5\1\6\1\uffff\12\4",
            "\1\5\1\6\1\uffff\6\7\4\10",
            "\1\5\1\6\1\uffff\12\10",
            "\1\5\1\6\1\uffff\12\11",
            "",
            "",
            "\1\5\1\6\1\uffff\6\12\4\5",
            "\1\5\1\6\1\uffff\12\5",
            "\1\5\1\6\1\uffff\12\5",
            "\1\5\1\6\1\uffff\12\5"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "12903:23: ( ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':' )?";
        }
    }
    static final String DFA1_eotS =
        "\12\uffff";
    static final String DFA1_eofS =
        "\12\uffff";
    static final String DFA1_minS =
        "\1\60\4\56\1\uffff\1\56\3\uffff";
    static final String DFA1_maxS =
        "\5\71\1\uffff\1\65\3\uffff";
    static final String DFA1_acceptS =
        "\5\uffff\1\1\1\uffff\1\2\1\3\1\4";
    static final String DFA1_specialS =
        "\12\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\1\1\1\2\7\3",
            "\1\5\1\uffff\12\4",
            "\1\5\1\uffff\6\6\4\7",
            "\1\5\1\uffff\12\7",
            "\1\7\1\uffff\12\10",
            "",
            "\1\7\1\uffff\6\11",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "12903:24: ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' )";
        }
    }
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\12\uffff";
    static final String DFA2_minS =
        "\1\60\4\56\1\uffff\1\56\3\uffff";
    static final String DFA2_maxS =
        "\5\71\1\uffff\1\65\3\uffff";
    static final String DFA2_acceptS =
        "\5\uffff\1\1\1\uffff\1\2\1\3\1\4";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\3\1\1\1\2\7\3",
            "\1\5\1\uffff\12\4",
            "\1\5\1\uffff\6\6\4\7",
            "\1\5\1\uffff\12\7",
            "\1\7\1\uffff\12\10",
            "",
            "\1\7\1\uffff\6\11",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "12903:101: ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' )";
        }
    }
    static final String DFA3_eotS =
        "\12\uffff";
    static final String DFA3_eofS =
        "\12\uffff";
    static final String DFA3_minS =
        "\1\60\4\56\1\uffff\1\56\3\uffff";
    static final String DFA3_maxS =
        "\5\71\1\uffff\1\65\3\uffff";
    static final String DFA3_acceptS =
        "\5\uffff\1\1\1\uffff\1\2\1\3\1\4";
    static final String DFA3_specialS =
        "\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\3\1\1\1\2\7\3",
            "\1\5\1\uffff\12\4",
            "\1\5\1\uffff\6\6\4\7",
            "\1\5\1\uffff\12\7",
            "\1\7\1\uffff\12\10",
            "",
            "\1\7\1\uffff\6\11",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "12903:178: ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' )";
        }
    }
    static final String DFA4_eotS =
        "\12\uffff";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\5\60\1\uffff\1\60\3\uffff";
    static final String DFA4_maxS =
        "\1\71\4\72\1\uffff\1\72\3\uffff";
    static final String DFA4_acceptS =
        "\5\uffff\1\1\1\uffff\1\2\1\3\1\4";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\1\1\1\2\7\3",
            "\12\4\1\5",
            "\6\6\4\7\1\5",
            "\12\7\1\5",
            "\12\10\1\7",
            "",
            "\6\11\4\uffff\1\7",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "12903:255: ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' )";
        }
    }
    static final String DFA13_eotS =
        "\14\uffff";
    static final String DFA13_eofS =
        "\14\uffff";
    static final String DFA13_minS =
        "\1\60\4\42\2\uffff\5\42";
    static final String DFA13_maxS =
        "\1\71\4\72\2\uffff\5\72";
    static final String DFA13_acceptS =
        "\5\uffff\1\1\1\2\5\uffff";
    static final String DFA13_specialS =
        "\14\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\3\1\1\1\2\7\3",
            "\1\6\13\uffff\1\5\1\6\12\4\1\5",
            "\1\6\13\uffff\1\5\1\6\6\7\4\10\1\5",
            "\1\6\13\uffff\1\5\1\6\12\10\1\5",
            "\1\6\13\uffff\1\5\1\6\12\11\1\5",
            "",
            "",
            "\1\6\13\uffff\1\5\1\6\6\12\4\13\1\5",
            "\1\6\13\uffff\1\5\1\6\12\13\1\5",
            "\1\6\13\uffff\1\5\1\6\12\13\1\5",
            "\1\6\13\uffff\1\5\1\6\12\13\1\5",
            "\1\6\14\uffff\1\6\12\13\1\5"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "12903:399: ( ( ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':' )? RULE_INT ':' )?";
        }
    }
    static final String DFA12_eotS =
        "\13\uffff";
    static final String DFA12_eofS =
        "\13\uffff";
    static final String DFA12_minS =
        "\1\60\4\56\2\uffff\4\56";
    static final String DFA12_maxS =
        "\1\71\4\72\2\uffff\4\72";
    static final String DFA12_acceptS =
        "\5\uffff\1\2\1\1\4\uffff";
    static final String DFA12_specialS =
        "\13\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\3\1\1\1\2\7\3",
            "\1\6\1\uffff\12\4\1\5",
            "\1\6\1\uffff\6\7\4\10\1\5",
            "\1\6\1\uffff\12\10\1\5",
            "\1\6\1\uffff\12\11\1\5",
            "",
            "",
            "\1\6\1\uffff\6\12\5\5",
            "\1\6\1\uffff\13\5",
            "\1\6\1\uffff\13\5",
            "\1\6\1\uffff\13\5"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "12903:400: ( ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) '.' ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ':' )?";
        }
    }
    static final String DFA8_eotS =
        "\12\uffff";
    static final String DFA8_eofS =
        "\12\uffff";
    static final String DFA8_minS =
        "\1\60\4\56\1\uffff\1\56\3\uffff";
    static final String DFA8_maxS =
        "\5\71\1\uffff\1\65\3\uffff";
    static final String DFA8_acceptS =
        "\5\uffff\1\1\1\uffff\1\2\1\3\1\4";
    static final String DFA8_specialS =
        "\12\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\3\1\1\1\2\7\3",
            "\1\5\1\uffff\12\4",
            "\1\5\1\uffff\6\6\4\7",
            "\1\5\1\uffff\12\7",
            "\1\7\1\uffff\12\10",
            "",
            "\1\7\1\uffff\6\11",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "12903:401: ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' )";
        }
    }
    static final String DFA9_eotS =
        "\12\uffff";
    static final String DFA9_eofS =
        "\12\uffff";
    static final String DFA9_minS =
        "\1\60\4\56\1\uffff\1\56\3\uffff";
    static final String DFA9_maxS =
        "\5\71\1\uffff\1\65\3\uffff";
    static final String DFA9_acceptS =
        "\5\uffff\1\1\1\uffff\1\2\1\3\1\4";
    static final String DFA9_specialS =
        "\12\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\3\1\1\1\2\7\3",
            "\1\5\1\uffff\12\4",
            "\1\5\1\uffff\6\6\4\7",
            "\1\5\1\uffff\12\7",
            "\1\7\1\uffff\12\10",
            "",
            "\1\7\1\uffff\6\11",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "12903:478: ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' )";
        }
    }
    static final String DFA10_eotS =
        "\12\uffff";
    static final String DFA10_eofS =
        "\12\uffff";
    static final String DFA10_minS =
        "\1\60\4\56\1\uffff\1\56\3\uffff";
    static final String DFA10_maxS =
        "\5\71\1\uffff\1\65\3\uffff";
    static final String DFA10_acceptS =
        "\5\uffff\1\1\1\uffff\1\2\1\3\1\4";
    static final String DFA10_specialS =
        "\12\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\3\1\1\1\2\7\3",
            "\1\5\1\uffff\12\4",
            "\1\5\1\uffff\6\6\4\7",
            "\1\5\1\uffff\12\7",
            "\1\7\1\uffff\12\10",
            "",
            "\1\7\1\uffff\6\11",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "12903:555: ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' )";
        }
    }
    static final String DFA11_eotS =
        "\12\uffff";
    static final String DFA11_eofS =
        "\12\uffff";
    static final String DFA11_minS =
        "\5\60\1\uffff\1\60\3\uffff";
    static final String DFA11_maxS =
        "\1\71\4\72\1\uffff\1\72\3\uffff";
    static final String DFA11_acceptS =
        "\5\uffff\1\1\1\uffff\1\2\1\3\1\4";
    static final String DFA11_specialS =
        "\12\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\3\1\1\1\2\7\3",
            "\12\4\1\5",
            "\6\6\4\7\1\5",
            "\12\7\1\5",
            "\12\10\1\7",
            "",
            "\6\11\4\uffff\1\7",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "12903:632: ( '0' .. '9' | '0' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' )";
        }
    }
    static final String DFA32_eotS =
        "\1\uffff\2\45\1\40\4\45\1\76\6\45\1\uffff\2\45\1\uffff\3\45\2\uffff\1\45\1\uffff\1\145\1\40\2\uffff\1\40\2\uffff\4\45\1\uffff\2\45\12\uffff\7\45\1\u0082\1\u0083\3\45\1\uffff\22\45\1\uffff\6\45\1\uffff\5\45\2\uffff\2\45\6\uffff\6\45\14\uffff\10\45\2\uffff\54\45\1\u00fc\5\45\20\uffff\7\45\1\uffff\7\45\1\u011e\34\45\1\uffff\3\45\1\uffff\5\45\1\uffff\1\u0144\1\uffff\1\45\1\u0146\16\uffff\16\45\2\uffff\1\45\1\u0163\2\45\1\uffff\5\45\1\u016b\3\45\1\uffff\6\45\1\uffff\2\45\1\uffff\7\45\1\uffff\3\45\2\uffff\1\45\16\uffff\1\u0189\10\45\1\u0192\2\45\1\u0197\1\45\2\uffff\5\45\1\uffff\1\u019e\1\uffff\10\45\1\uffff\14\45\11\uffff\7\45\1\u01c2\1\uffff\3\45\2\uffff\2\45\1\uffff\1\u01c8\2\45\1\uffff\2\45\2\uffff\1\45\1\uffff\10\45\1\uffff\2\45\1\uffff\4\45\7\uffff\3\45\1\uffff\1\45\1\u01e4\2\uffff\1\45\2\uffff\1\45\1\uffff\3\45\2\uffff\1\45\1\uffff\5\45\1\uffff\2\45\1\uffff\3\45\4\uffff\4\45\1\uffff\1\45\2\uffff\1\45\1\uffff\2\45\1\uffff\1\45\1\uffff\5\45\4\uffff\2\45\1\u0209\1\45\1\uffff\2\45\1\uffff\6\45\2\uffff\1\45\1\uffff\4\45\1\uffff\4\45\1\uffff\2\45\1\uffff\2\45\1\uffff\1\45\2\uffff\3\45\1\uffff\1\45\1\uffff\1\u0226\2\45\3\uffff";
    static final String DFA32_eofS =
        "\u0229\uffff";
    static final String DFA32_minS =
        "\1\0\2\141\1\0\1\154\1\156\1\151\1\145\1\55\1\145\1\151\1\141\1\157\1\145\1\157\1\uffff\1\155\1\145\1\uffff\2\141\1\157\2\uffff\1\156\1\uffff\1\52\1\101\2\uffff\1\0\2\uffff\1\165\2\160\1\162\1\uffff\2\154\1\0\1\uffff\7\0\1\uffff\1\151\1\164\1\170\1\55\1\164\1\154\1\144\2\55\1\162\1\150\1\141\1\uffff\1\154\1\162\1\156\2\151\1\164\1\143\1\155\1\151\1\162\2\141\1\143\1\165\1\172\1\142\1\155\1\165\1\uffff\1\141\1\151\1\137\1\160\1\163\1\151\1\uffff\1\156\1\142\1\144\1\164\1\144\2\uffff\1\141\1\164\6\uffff\1\145\1\146\1\145\1\147\1\163\1\145\3\0\1\uffff\2\0\1\uffff\5\0\3\141\1\137\1\146\1\151\1\145\1\72\2\uffff\1\151\2\141\1\164\1\144\1\165\1\163\1\144\1\154\1\160\1\167\1\157\1\145\1\157\1\160\1\164\1\162\2\166\2\162\1\145\1\156\1\146\1\155\1\137\1\147\1\164\1\145\1\64\1\155\1\162\1\145\1\151\1\72\1\166\1\153\1\145\1\72\2\145\1\142\1\151\1\145\1\55\1\163\1\72\2\145\1\72\1\uffff\7\0\1\uffff\7\0\1\171\1\163\1\143\2\141\1\157\1\163\1\uffff\1\166\1\162\1\166\1\141\1\137\1\155\1\151\1\55\1\144\1\145\1\157\1\160\1\72\1\141\1\162\1\141\1\163\2\145\1\151\1\145\1\143\1\72\1\145\1\151\2\141\1\143\1\145\1\72\1\162\1\137\1\72\1\141\1\156\1\143\1\uffff\1\145\1\137\1\154\1\uffff\1\167\1\72\1\154\2\162\1\uffff\1\55\1\uffff\1\164\1\55\2\uffff\2\0\1\uffff\4\0\1\uffff\4\0\1\163\1\145\1\150\1\144\1\151\1\156\1\163\1\141\2\145\1\162\1\157\1\145\1\157\2\uffff\1\72\1\55\1\162\1\171\1\uffff\1\164\1\151\1\147\1\72\1\144\1\55\1\143\1\164\1\145\1\uffff\1\164\1\147\1\151\1\156\1\157\1\72\1\uffff\1\156\1\141\1\uffff\1\156\1\144\1\145\1\162\1\154\1\163\1\141\1\uffff\1\145\1\157\1\156\2\uffff\1\72\1\uffff\2\0\1\uffff\4\0\1\uffff\5\0\1\55\1\163\1\141\1\144\1\154\1\163\1\55\1\164\1\144\1\55\1\164\1\156\1\55\1\156\2\uffff\1\153\1\72\1\145\1\164\1\141\1\uffff\1\55\1\uffff\1\145\1\163\3\72\1\156\1\144\1\165\1\uffff\1\141\1\144\1\147\2\163\1\72\1\157\1\72\1\171\1\137\1\156\1\141\1\uffff\7\0\1\uffff\1\72\1\142\1\162\1\165\1\72\1\163\1\145\1\55\1\uffff\1\72\1\154\1\72\2\uffff\1\72\1\163\1\uffff\1\55\1\171\1\164\1\uffff\1\163\1\72\2\uffff\1\72\1\uffff\1\145\1\72\1\156\1\154\1\144\1\145\1\137\1\72\1\uffff\1\157\1\143\1\uffff\1\72\1\151\1\155\1\154\6\0\1\uffff\1\154\1\145\1\162\1\uffff\1\164\1\55\2\uffff\1\171\2\uffff\1\72\1\uffff\1\72\1\151\1\72\2\uffff\1\162\1\uffff\1\164\1\72\1\162\1\72\1\157\1\uffff\1\160\1\141\1\uffff\1\160\1\145\1\72\4\0\1\145\1\163\1\145\1\157\1\uffff\1\72\2\uffff\1\157\1\uffff\1\137\1\72\1\uffff\1\145\1\uffff\1\156\1\164\1\154\1\166\1\156\1\uffff\3\0\1\72\1\163\1\55\1\160\1\uffff\2\156\1\uffff\1\163\1\72\1\163\1\137\1\66\1\164\1\0\1\uffff\1\145\1\uffff\1\160\1\72\1\141\1\163\1\uffff\1\72\1\151\2\72\1\0\1\163\1\145\1\uffff\1\155\1\72\1\uffff\1\160\2\uffff\1\72\1\144\1\145\1\uffff\1\163\1\uffff\1\55\2\72\3\uffff";
    static final String DFA32_maxS =
        "\1\uffff\1\171\1\151\1\uffff\1\165\1\160\1\156\1\167\1\172\1\157\1\165\1\160\1\162\1\165\1\160\1\uffff\1\160\1\162\1\uffff\2\151\1\157\2\uffff\1\170\1\uffff\1\57\1\172\2\uffff\1\uffff\2\uffff\1\165\2\160\1\162\1\uffff\2\154\1\uffff\1\uffff\7\uffff\1\uffff\1\167\1\164\1\170\1\55\1\164\1\154\1\144\2\172\1\162\1\154\1\163\1\uffff\1\154\1\162\1\156\2\151\1\164\1\143\1\155\1\157\1\162\2\141\1\162\1\165\1\172\1\142\1\156\1\165\1\uffff\1\141\1\164\2\166\1\163\1\151\1\uffff\1\156\1\142\1\144\1\164\1\144\2\uffff\1\166\1\164\6\uffff\1\145\1\146\1\145\1\147\1\163\1\145\3\uffff\1\uffff\2\uffff\1\uffff\5\uffff\3\141\1\137\1\146\1\151\1\145\1\72\2\uffff\1\151\2\141\1\164\1\144\1\165\1\163\1\144\1\154\1\160\1\167\1\157\1\145\1\166\1\160\1\164\1\162\2\166\2\162\1\145\1\156\1\164\1\155\1\137\1\147\1\164\1\145\1\64\1\155\1\162\1\145\1\151\1\72\1\166\1\153\1\145\1\72\2\145\1\142\1\151\1\145\1\172\1\163\1\72\2\145\1\72\1\uffff\7\uffff\1\uffff\7\uffff\1\171\1\163\1\143\2\141\1\157\1\163\1\uffff\1\166\1\162\1\166\1\141\1\137\1\155\1\151\1\172\1\144\1\145\1\157\1\160\1\72\1\141\1\162\1\141\1\163\2\145\1\151\1\145\1\143\1\72\1\145\1\151\2\141\1\143\1\145\1\72\1\162\1\137\1\72\1\141\1\156\1\143\1\uffff\1\145\1\137\1\154\1\uffff\1\167\1\72\1\154\2\162\1\uffff\1\172\1\uffff\1\164\1\172\2\uffff\2\uffff\1\uffff\4\uffff\1\uffff\4\uffff\1\163\1\145\1\150\1\144\1\151\1\156\1\163\1\141\2\145\1\162\1\157\1\145\1\157\2\uffff\1\72\1\172\1\162\1\171\1\uffff\1\164\1\151\1\147\1\72\1\144\1\172\1\143\1\164\1\145\1\uffff\1\164\1\147\1\151\1\156\1\157\1\72\1\uffff\1\156\1\141\1\uffff\1\156\1\144\1\145\1\162\1\154\1\163\1\141\1\uffff\1\145\1\157\1\156\2\uffff\1\72\1\uffff\2\uffff\1\uffff\4\uffff\1\uffff\5\uffff\1\172\1\163\1\141\1\144\1\154\1\163\1\55\1\164\1\144\1\172\1\164\1\156\1\172\1\156\2\uffff\1\153\1\72\1\145\1\164\1\141\1\uffff\1\172\1\uffff\1\145\1\163\2\72\1\163\1\156\1\144\1\165\1\uffff\1\141\1\144\1\147\2\163\1\137\1\157\1\72\1\171\1\137\1\156\1\141\1\uffff\7\uffff\1\uffff\1\72\1\142\1\162\1\165\1\72\1\163\1\145\1\172\1\uffff\1\72\1\154\1\72\2\uffff\1\72\1\163\1\uffff\1\172\1\171\1\164\1\uffff\1\163\1\72\2\uffff\1\72\1\uffff\1\145\1\72\1\156\1\154\1\144\1\145\1\137\1\72\1\uffff\1\157\1\143\1\uffff\1\72\1\151\1\155\1\154\6\uffff\1\uffff\1\154\1\145\1\162\1\uffff\1\164\1\172\2\uffff\1\171\2\uffff\1\72\1\uffff\1\72\1\151\1\72\2\uffff\1\162\1\uffff\1\164\1\72\1\162\1\72\1\157\1\uffff\1\160\1\141\1\uffff\1\160\1\145\1\72\4\uffff\1\145\1\163\1\145\1\157\1\uffff\1\72\2\uffff\1\157\1\uffff\1\137\1\72\1\uffff\1\145\1\uffff\1\156\1\164\1\154\1\166\1\156\1\uffff\3\uffff\1\72\1\163\1\172\1\160\1\uffff\2\156\1\uffff\1\163\1\72\1\163\1\137\1\66\1\164\1\uffff\1\uffff\1\145\1\uffff\1\160\1\72\1\141\1\163\1\uffff\1\72\1\151\2\72\1\uffff\1\163\1\145\1\uffff\1\155\1\72\1\uffff\1\160\2\uffff\1\72\1\144\1\145\1\uffff\1\163\1\uffff\1\172\2\72\3\uffff";
    static final String DFA32_acceptS =
        "\17\uffff\1\32\2\uffff\1\44\3\uffff\1\70\1\71\1\uffff\1\113\2\uffff\1\121\1\122\1\uffff\1\126\1\127\4\uffff\1\121\3\uffff\1\116\7\uffff\1\123\14\uffff\1\11\22\uffff\1\32\6\uffff\1\44\5\uffff\1\70\1\71\2\uffff\1\113\1\124\1\125\1\114\1\122\1\126\11\uffff\1\116\2\uffff\1\117\15\uffff\1\7\1\10\62\uffff\1\3\7\uffff\1\117\16\uffff\1\65\44\uffff\1\46\3\uffff\1\66\5\uffff\1\1\1\uffff\1\55\2\uffff\1\103\1\3\2\uffff\1\120\4\uffff\1\115\22\uffff\1\57\1\13\4\uffff\1\77\11\uffff\1\64\6\uffff\1\41\2\uffff\1\102\7\uffff\1\67\3\uffff\1\63\1\14\1\uffff\1\2\2\uffff\1\120\4\uffff\1\115\23\uffff\1\33\1\15\5\uffff\1\47\1\uffff\1\23\10\uffff\1\34\14\uffff\1\56\7\uffff\1\4\10\uffff\1\22\3\uffff\1\61\1\12\2\uffff\1\62\3\uffff\1\21\2\uffff\1\54\1\107\1\uffff\1\105\10\uffff\1\72\2\uffff\1\100\12\uffff\1\52\3\uffff\1\106\2\uffff\1\20\1\40\1\uffff\1\27\1\24\1\uffff\1\17\3\uffff\1\31\1\30\1\uffff\1\36\5\uffff\1\45\2\uffff\1\111\13\uffff\1\16\1\uffff\1\26\1\51\1\uffff\1\25\2\uffff\1\75\1\uffff\1\110\5\uffff\1\76\7\uffff\1\42\2\uffff\1\35\7\uffff\1\73\1\uffff\1\5\4\uffff\1\43\7\uffff\1\60\2\uffff\1\101\1\uffff\1\74\1\104\3\uffff\1\50\1\uffff\1\112\3\uffff\1\6\1\37\1\53";
    static final String DFA32_specialS =
        "\1\57\2\uffff\1\110\32\uffff\1\113\11\uffff\1\64\1\uffff\1\51\1\53\1\52\1\15\1\44\1\21\1\47\75\uffff\1\31\1\3\1\71\1\uffff\1\55\1\30\1\uffff\1\11\1\26\1\33\1\60\1\56\75\uffff\1\32\1\45\1\22\1\41\1\61\1\17\1\70\1\uffff\1\46\1\72\1\114\1\115\1\101\1\62\1\54\75\uffff\1\73\1\34\1\uffff\1\42\1\10\1\111\1\105\1\uffff\1\63\1\107\1\74\1\66\70\uffff\1\23\1\65\1\uffff\1\20\1\50\1\102\1\75\1\uffff\1\12\1\13\1\0\1\100\1\67\56\uffff\1\35\1\14\1\103\1\1\1\7\1\4\1\104\54\uffff\1\36\1\106\1\37\1\40\1\16\1\112\41\uffff\1\24\1\43\1\25\1\2\25\uffff\1\5\1\27\1\6\16\uffff\1\76\14\uffff\1\77\25\uffff}>";
    static final String[] DFA32_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\40\1\3\4\40\1\36\5\40\1\22\1\31\1\32\12\35\1\17\6\40\32\34\3\40\1\33\1\34\1\40\1\4\1\12\1\16\1\21\1\30\1\2\1\24\1\34\1\20\2\34\1\23\1\25\1\13\1\5\1\14\1\34\1\7\1\15\1\1\1\6\1\11\3\34\1\10\1\26\1\40\1\27\uff82\40",
            "\1\44\13\uffff\1\42\4\uffff\1\41\6\uffff\1\43",
            "\1\46\7\uffff\1\47",
            "\42\61\1\51\13\61\1\55\1\56\1\54\1\52\1\53\7\54\7\61\32\60\3\61\1\57\1\60\1\61\15\60\1\50\14\60\uff85\61",
            "\1\62\7\uffff\1\63\1\64",
            "\1\65\1\uffff\1\66",
            "\1\70\4\uffff\1\67",
            "\1\75\11\uffff\1\72\1\73\2\uffff\1\74\3\uffff\1\71",
            "\15\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\100\11\uffff\1\77",
            "\1\101\13\uffff\1\102",
            "\1\106\3\uffff\1\104\11\uffff\1\105\1\103",
            "\1\110\2\uffff\1\107",
            "\1\113\2\uffff\1\111\1\115\2\uffff\1\112\2\uffff\1\114\5\uffff\1\116",
            "\1\117\1\120",
            "",
            "\1\122\1\123\1\uffff\1\124",
            "\1\125\10\uffff\1\126\3\uffff\1\127",
            "",
            "\1\132\7\uffff\1\131",
            "\1\134\7\uffff\1\133",
            "\1\135",
            "",
            "",
            "\1\140\11\uffff\1\141",
            "",
            "\1\143\4\uffff\1\144",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\0\61",
            "",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\55\61\15\157\1\160\6\61\32\157\4\61\1\157\1\61\16\157\1\156\13\157\uff85\61",
            "",
            "\42\61\1\164\12\61\1\165\1\167\1\163\12\162\1\166\uffc5\61",
            "\42\61\1\164\12\61\1\165\1\167\1\163\6\170\4\171\1\166\uffc5\61",
            "\42\61\1\164\12\61\1\165\1\167\1\163\12\171\1\166\uffc5\61",
            "\57\61\1\56\21\61\32\60\3\61\1\57\1\60\1\61\32\60\uff85\61",
            "\101\61\32\60\3\61\1\57\1\60\1\61\32\60\uff85\61",
            "\101\61\32\60\4\61\1\60\1\61\32\60\uff85\61",
            "\55\61\15\157\1\160\6\61\32\157\4\61\1\157\1\61\32\157\uff85\61",
            "",
            "\1\173\15\uffff\1\172",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\15\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\15\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0084",
            "\1\u0085\3\uffff\1\u0086",
            "\1\u0088\21\uffff\1\u0087",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091\5\uffff\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0097\16\uffff\1\u0096",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009c\1\u009b",
            "\1\u009d",
            "",
            "\1\u009e",
            "\1\u009f\12\uffff\1\u00a0",
            "\1\u00a3\1\uffff\1\u00a2\24\uffff\1\u00a1",
            "\1\u00a4\5\uffff\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "",
            "\1\u00ad\24\uffff\1\u00ae",
            "\1\u00af",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\42\61\1\u00b6\12\61\15\157\1\160\6\61\32\157\4\61\1\157\1\61\32\157\uff85\61",
            "\55\61\15\157\1\160\6\61\32\157\4\61\1\157\1\61\32\157\uff85\61",
            "\56\61\1\u00b7\1\u00b8\21\61\32\u00ba\3\61\1\u00b9\1\u00ba\1\61\32\u00ba\uff85\61",
            "",
            "\42\61\1\164\12\61\1\165\1\167\1\163\12\u00bb\1\166\uffc5\61",
            "\101\61\32\u00bd\3\61\1\u00bc\1\u00bd\1\61\32\u00bd\uff85\61",
            "",
            "\60\61\12\u00bf\uffc6\61",
            "\60\61\12\u00c0\uffc6\61",
            "\60\61\1\u00c3\1\u00c1\1\u00c2\7\u00c3\uffc6\61",
            "\42\61\1\164\12\61\1\165\1\167\1\163\6\u00c4\4\u00c5\1\166\uffc5\61",
            "\42\61\1\164\12\61\1\165\1\167\1\163\12\u00c5\1\166\uffc5\61",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00dc\6\uffff\1\u00db",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6\15\uffff\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\15\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "",
            "\57\61\1\u00b8\21\61\32\u00ba\3\61\1\u00b9\1\u00ba\1\61\32\u00ba\uff85\61",
            "\101\61\32\u00ba\3\61\1\u00b9\1\u00ba\1\61\32\u00ba\uff85\61",
            "\101\61\32\u00ba\4\61\1\u00ba\1\61\32\u00ba\uff85\61",
            "\42\61\1\u0105\12\61\15\u0103\1\u0104\6\61\32\u0103\4\61\1\u0103\1\61\32\u0103\uff85\61",
            "\42\61\1\164\12\61\1\165\1\167\1\163\12\u00c5\1\166\uffc5\61",
            "\101\61\32\u00bd\4\61\1\u00bd\1\61\32\u00bd\uff85\61",
            "\42\61\1\164\12\61\15\u0106\7\61\32\u0106\4\61\1\u0106\1\61\32\u0106\uff85\61",
            "",
            "\42\61\1\164\14\61\1\u0107\12\u00bf\1\u0108\uffc5\61",
            "\42\61\1\164\14\61\1\163\12\u00c0\uffc6\61",
            "\42\61\1\u010a\13\61\1\u010b\1\61\12\u0109\uffc6\61",
            "\42\61\1\u010a\13\61\1\u010b\1\61\6\u010c\4\u010d\uffc6\61",
            "\42\61\1\u010a\13\61\1\u010b\1\61\12\u010d\uffc6\61",
            "\42\61\1\164\12\61\1\165\1\167\1\163\12\u00c5\1\166\uffc5\61",
            "\42\61\1\164\12\61\1\165\1\u010e\1\163\12\u00c5\1\166\uffc5\61",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\15\45\1\u011d\6\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "",
            "\15\45\1\u0143\6\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u0145",
            "\15\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\42\61\1\u0105\12\61\15\u0103\1\u0104\6\61\32\u0103\4\61\1\u0103\1\61\32\u0103\uff85\61",
            "\101\61\32\u0148\3\61\1\u0147\1\u0148\1\61\32\u0148\uff85\61",
            "",
            "\42\61\1\164\12\61\15\u0106\7\61\32\u0106\4\61\1\u0106\1\61\32\u0106\uff85\61",
            "\101\61\32\u014b\3\61\1\u014a\1\u014b\1\61\32\u014b\uff85\61",
            "\60\61\12\u014c\uffc6\61",
            "\42\61\1\u010a\13\61\1\u010b\1\61\12\u014d\uffc6\61",
            "",
            "\60\61\1\u0151\1\u014f\1\u0150\7\u0151\uffc6\61",
            "\42\61\1\u010a\13\61\1\u010b\1\61\6\u0152\4\u0153\uffc6\61",
            "\42\61\1\u010a\13\61\1\u010b\1\61\12\u0153\uffc6\61",
            "\60\61\12\u0153\uffc6\61",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "",
            "",
            "\1\u0162",
            "\15\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0164",
            "\1\u0165",
            "",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\15\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "",
            "\1\u0175",
            "\1\u0176",
            "",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "",
            "",
            "\1\u0181",
            "",
            "\101\61\32\u0148\4\61\1\u0148\1\61\32\u0148\uff85\61",
            "\42\61\1\u0105\12\61\15\u0182\7\61\32\u0182\4\61\1\u0182\1\61\32\u0182\uff85\61",
            "",
            "\101\61\32\u014b\4\61\1\u014b\1\61\32\u014b\uff85\61",
            "\42\61\1\164\12\61\15\u0183\7\61\32\u0183\4\61\1\u0183\1\61\32\u0183\uff85\61",
            "\55\61\1\u0184\2\61\12\u014c\uffc6\61",
            "\42\61\1\u010a\13\61\1\u010b\1\61\12\u0153\uffc6\61",
            "",
            "\56\61\1\u0186\1\61\12\u0185\uffc6\61",
            "\56\61\1\u0186\1\61\6\u0187\4\u0188\uffc6\61",
            "\56\61\1\u0186\1\61\12\u0188\uffc6\61",
            "\42\61\1\u010a\13\61\1\u010b\1\61\12\u0153\uffc6\61",
            "\42\61\1\u010a\15\61\12\u0153\uffc6\61",
            "\15\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\15\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0193",
            "\1\u0194",
            "\15\45\1\u0196\6\uffff\32\45\4\uffff\1\45\1\uffff\22\45\1\u0195\7\45",
            "\1\u0198",
            "",
            "",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "",
            "\15\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a4\70\uffff\1\u01a3",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad\44\uffff\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "",
            "\42\61\1\u0105\12\61\15\u0182\7\61\32\u0182\4\61\1\u0182\1\61\32\u0182\uff85\61",
            "\42\61\1\164\12\61\15\u0183\7\61\32\u0183\4\61\1\u0183\1\61\32\u0183\uff85\61",
            "\60\61\12\u01b5\uffc6\61",
            "\56\61\1\u0186\1\61\12\u01b6\uffc6\61",
            "\60\61\1\u01b9\1\u01b7\1\u01b8\7\u01b9\uffc6\61",
            "\56\61\1\u0186\1\61\6\u01ba\uffca\61",
            "\56\61\1\u0186\uffd1\61",
            "",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\15\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "",
            "",
            "\1\u01c6",
            "\1\u01c7",
            "",
            "\15\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u01c9",
            "\1\u01ca",
            "",
            "\1\u01cb",
            "\1\u01cc",
            "",
            "",
            "\1\u01cd",
            "",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "",
            "\1\u01d6",
            "\1\u01d7",
            "",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\42\61\1\164\14\61\1\u0107\12\u01b5\uffc6\61",
            "\56\61\1\u0186\uffd1\61",
            "\60\61\12\u01dc\1\u01dd\uffc5\61",
            "\60\61\6\u01de\4\u01df\1\u01dd\uffc5\61",
            "\60\61\12\u01df\1\u01dd\uffc5\61",
            "\56\61\1\u0186\uffd1\61",
            "",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "",
            "\1\u01e3",
            "\15\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\u01e5",
            "",
            "",
            "\1\u01e6",
            "",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "",
            "",
            "\1\u01ea",
            "",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "",
            "\1\u01f0",
            "\1\u01f1",
            "",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\60\61\12\u01f5\1\u01dd\uffc5\61",
            "\60\61\12\u01f6\uffc6\61",
            "\60\61\6\u01f7\4\61\1\u01dd\uffc5\61",
            "\72\61\1\u01dd\uffc5\61",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "",
            "\1\u01fc",
            "",
            "",
            "\1\u01fd",
            "",
            "\1\u01fe",
            "\1\u01ff",
            "",
            "\1\u0200",
            "",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "",
            "\72\61\1\u01dd\uffc5\61",
            "\55\61\1\u0206\2\61\12\u01f6\1\166\uffc5\61",
            "\72\61\1\u01dd\uffc5\61",
            "\1\u0207",
            "\1\u0208",
            "\15\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u020a",
            "",
            "\1\u020b",
            "\1\u020c",
            "",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\60\61\12\u0213\uffc6\61",
            "",
            "\1\u0214",
            "",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\60\61\12\u0213\1\u0108\uffc5\61",
            "\1\u021d",
            "\1\u021e",
            "",
            "\1\u021f",
            "\1\u0220",
            "",
            "\1\u0221",
            "",
            "",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "",
            "\1\u0225",
            "",
            "\15\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0227",
            "\1\u0228",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | RULE_VERSION | RULE_QUOTED_INT | RULE_PORT_DEF | RULE_DEVICE_DEF | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_337 = input.LA(1);

                        s = -1;
                        if ( ((LA32_337>='0' && LA32_337<='9')) ) {s = 392;}

                        else if ( ((LA32_337>='\u0000' && LA32_337<='-')||LA32_337=='/'||(LA32_337>=':' && LA32_337<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_337=='.') ) {s = 390;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_389 = input.LA(1);

                        s = -1;
                        if ( ((LA32_389>='0' && LA32_389<='9')) ) {s = 438;}

                        else if ( (LA32_389=='.') ) {s = 390;}

                        else if ( ((LA32_389>='\u0000' && LA32_389<='-')||LA32_389=='/'||(LA32_389>=':' && LA32_389<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_479 = input.LA(1);

                        s = -1;
                        if ( ((LA32_479>='\u0000' && LA32_479<='9')||(LA32_479>=';' && LA32_479<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_479==':') ) {s = 477;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_111 = input.LA(1);

                        s = -1;
                        if ( (LA32_111==':') ) {s = 112;}

                        else if ( ((LA32_111>='-' && LA32_111<='9')||(LA32_111>='A' && LA32_111<='Z')||LA32_111=='_'||(LA32_111>='a' && LA32_111<='z')) ) {s = 111;}

                        else if ( ((LA32_111>='\u0000' && LA32_111<=',')||(LA32_111>=';' && LA32_111<='@')||(LA32_111>='[' && LA32_111<='^')||LA32_111=='`'||(LA32_111>='{' && LA32_111<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_391 = input.LA(1);

                        s = -1;
                        if ( ((LA32_391>='0' && LA32_391<='5')) ) {s = 442;}

                        else if ( (LA32_391=='.') ) {s = 390;}

                        else if ( ((LA32_391>='\u0000' && LA32_391<='-')||LA32_391=='/'||(LA32_391>='6' && LA32_391<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_501 = input.LA(1);

                        s = -1;
                        if ( (LA32_501==':') ) {s = 477;}

                        else if ( ((LA32_501>='\u0000' && LA32_501<='9')||(LA32_501>=';' && LA32_501<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_503 = input.LA(1);

                        s = -1;
                        if ( (LA32_503==':') ) {s = 477;}

                        else if ( ((LA32_503>='\u0000' && LA32_503<='9')||(LA32_503>=';' && LA32_503<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_390 = input.LA(1);

                        s = -1;
                        if ( (LA32_390=='1') ) {s = 439;}

                        else if ( (LA32_390=='2') ) {s = 440;}

                        else if ( (LA32_390=='0'||(LA32_390>='3' && LA32_390<='9')) ) {s = 441;}

                        else if ( ((LA32_390>='\u0000' && LA32_390<='/')||(LA32_390>=':' && LA32_390<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_263 = input.LA(1);

                        s = -1;
                        if ( (LA32_263=='^') ) {s = 330;}

                        else if ( ((LA32_263>='A' && LA32_263<='Z')||LA32_263=='_'||(LA32_263>='a' && LA32_263<='z')) ) {s = 331;}

                        else if ( ((LA32_263>='\u0000' && LA32_263<='@')||(LA32_263>='[' && LA32_263<=']')||LA32_263=='`'||(LA32_263>='{' && LA32_263<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA32_117 = input.LA(1);

                        s = -1;
                        if ( ((LA32_117>='0' && LA32_117<='9')) ) {s = 191;}

                        else if ( ((LA32_117>='\u0000' && LA32_117<='/')||(LA32_117>=':' && LA32_117<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA32_335 = input.LA(1);

                        s = -1;
                        if ( ((LA32_335>='0' && LA32_335<='9')) ) {s = 389;}

                        else if ( ((LA32_335>='\u0000' && LA32_335<='-')||LA32_335=='/'||(LA32_335>=':' && LA32_335<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_335=='.') ) {s = 390;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA32_336 = input.LA(1);

                        s = -1;
                        if ( ((LA32_336>='0' && LA32_336<='5')) ) {s = 391;}

                        else if ( ((LA32_336>='6' && LA32_336<='9')) ) {s = 392;}

                        else if ( ((LA32_336>='\u0000' && LA32_336<='-')||LA32_336=='/'||(LA32_336>=':' && LA32_336<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_336=='.') ) {s = 390;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA32_387 = input.LA(1);

                        s = -1;
                        if ( (LA32_387=='\"') ) {s = 116;}

                        else if ( ((LA32_387>='-' && LA32_387<='9')||(LA32_387>='A' && LA32_387<='Z')||LA32_387=='_'||(LA32_387>='a' && LA32_387<='z')) ) {s = 387;}

                        else if ( ((LA32_387>='\u0000' && LA32_387<='!')||(LA32_387>='#' && LA32_387<=',')||(LA32_387>=':' && LA32_387<='@')||(LA32_387>='[' && LA32_387<='^')||LA32_387=='`'||(LA32_387>='{' && LA32_387<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA32_45 = input.LA(1);

                        s = -1;
                        if ( ((LA32_45>='\u0000' && LA32_45<='.')||(LA32_45>='0' && LA32_45<='@')||(LA32_45>='[' && LA32_45<=']')||LA32_45=='`'||(LA32_45>='{' && LA32_45<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_45=='/') ) {s = 46;}

                        else if ( (LA32_45=='^') ) {s = 47;}

                        else if ( ((LA32_45>='A' && LA32_45<='Z')||LA32_45=='_'||(LA32_45>='a' && LA32_45<='z')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA32_441 = input.LA(1);

                        s = -1;
                        if ( ((LA32_441>='0' && LA32_441<='9')) ) {s = 479;}

                        else if ( (LA32_441==':') ) {s = 477;}

                        else if ( ((LA32_441>='\u0000' && LA32_441<='/')||(LA32_441>=';' && LA32_441<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA32_188 = input.LA(1);

                        s = -1;
                        if ( ((LA32_188>='A' && LA32_188<='Z')||LA32_188=='_'||(LA32_188>='a' && LA32_188<='z')) ) {s = 189;}

                        else if ( ((LA32_188>='\u0000' && LA32_188<='@')||(LA32_188>='[' && LA32_188<='^')||LA32_188=='`'||(LA32_188>='{' && LA32_188<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA32_330 = input.LA(1);

                        s = -1;
                        if ( ((LA32_330>='\u0000' && LA32_330<='@')||(LA32_330>='[' && LA32_330<='^')||LA32_330=='`'||(LA32_330>='{' && LA32_330<='\uFFFF')) ) {s = 49;}

                        else if ( ((LA32_330>='A' && LA32_330<='Z')||LA32_330=='_'||(LA32_330>='a' && LA32_330<='z')) ) {s = 331;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA32_47 = input.LA(1);

                        s = -1;
                        if ( ((LA32_47>='A' && LA32_47<='Z')||LA32_47=='_'||(LA32_47>='a' && LA32_47<='z')) ) {s = 48;}

                        else if ( ((LA32_47>='\u0000' && LA32_47<='@')||(LA32_47>='[' && LA32_47<='^')||LA32_47=='`'||(LA32_47>='{' && LA32_47<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA32_185 = input.LA(1);

                        s = -1;
                        if ( ((LA32_185>='\u0000' && LA32_185<='@')||(LA32_185>='[' && LA32_185<='^')||LA32_185=='`'||(LA32_185>='{' && LA32_185<='\uFFFF')) ) {s = 49;}

                        else if ( ((LA32_185>='A' && LA32_185<='Z')||LA32_185=='_'||(LA32_185>='a' && LA32_185<='z')) ) {s = 186;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA32_327 = input.LA(1);

                        s = -1;
                        if ( ((LA32_327>='A' && LA32_327<='Z')||LA32_327=='_'||(LA32_327>='a' && LA32_327<='z')) ) {s = 328;}

                        else if ( ((LA32_327>='\u0000' && LA32_327<='@')||(LA32_327>='[' && LA32_327<='^')||LA32_327=='`'||(LA32_327>='{' && LA32_327<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA32_476 = input.LA(1);

                        s = -1;
                        if ( ((LA32_476>='0' && LA32_476<='9')) ) {s = 501;}

                        else if ( ((LA32_476>='\u0000' && LA32_476<='/')||(LA32_476>=';' && LA32_476<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_476==':') ) {s = 477;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA32_478 = input.LA(1);

                        s = -1;
                        if ( ((LA32_478>='0' && LA32_478<='5')) ) {s = 503;}

                        else if ( ((LA32_478>='\u0000' && LA32_478<='/')||(LA32_478>='6' && LA32_478<='9')||(LA32_478>=';' && LA32_478<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_478==':') ) {s = 477;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA32_118 = input.LA(1);

                        s = -1;
                        if ( ((LA32_118>='0' && LA32_118<='9')) ) {s = 192;}

                        else if ( ((LA32_118>='\u0000' && LA32_118<='/')||(LA32_118>=':' && LA32_118<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA32_502 = input.LA(1);

                        s = -1;
                        if ( ((LA32_502>='\u0000' && LA32_502<=',')||(LA32_502>='.' && LA32_502<='/')||(LA32_502>=';' && LA32_502<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_502==':') ) {s = 118;}

                        else if ( ((LA32_502>='0' && LA32_502<='9')) ) {s = 502;}

                        else if ( (LA32_502=='-') ) {s = 518;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA32_115 = input.LA(1);

                        s = -1;
                        if ( ((LA32_115>='\u0000' && LA32_115<='@')||(LA32_115>='[' && LA32_115<=']')||LA32_115=='`'||(LA32_115>='{' && LA32_115<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_115=='^') ) {s = 188;}

                        else if ( ((LA32_115>='A' && LA32_115<='Z')||LA32_115=='_'||(LA32_115>='a' && LA32_115<='z')) ) {s = 189;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA32_110 = input.LA(1);

                        s = -1;
                        if ( (LA32_110=='\"') ) {s = 182;}

                        else if ( (LA32_110==':') ) {s = 112;}

                        else if ( ((LA32_110>='-' && LA32_110<='9')||(LA32_110>='A' && LA32_110<='Z')||LA32_110=='_'||(LA32_110>='a' && LA32_110<='z')) ) {s = 111;}

                        else if ( ((LA32_110>='\u0000' && LA32_110<='!')||(LA32_110>='#' && LA32_110<=',')||(LA32_110>=';' && LA32_110<='@')||(LA32_110>='[' && LA32_110<='^')||LA32_110=='`'||(LA32_110>='{' && LA32_110<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA32_183 = input.LA(1);

                        s = -1;
                        if ( ((LA32_183>='\u0000' && LA32_183<='.')||(LA32_183>='0' && LA32_183<='@')||(LA32_183>='[' && LA32_183<=']')||LA32_183=='`'||(LA32_183>='{' && LA32_183<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_183=='/') ) {s = 184;}

                        else if ( (LA32_183=='^') ) {s = 185;}

                        else if ( ((LA32_183>='A' && LA32_183<='Z')||LA32_183=='_'||(LA32_183>='a' && LA32_183<='z')) ) {s = 186;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA32_119 = input.LA(1);

                        s = -1;
                        if ( (LA32_119=='1') ) {s = 193;}

                        else if ( (LA32_119=='2') ) {s = 194;}

                        else if ( (LA32_119=='0'||(LA32_119>='3' && LA32_119<='9')) ) {s = 195;}

                        else if ( ((LA32_119>='\u0000' && LA32_119<='/')||(LA32_119>=':' && LA32_119<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA32_260 = input.LA(1);

                        s = -1;
                        if ( (LA32_260=='^') ) {s = 327;}

                        else if ( ((LA32_260>='A' && LA32_260<='Z')||LA32_260=='_'||(LA32_260>='a' && LA32_260<='z')) ) {s = 328;}

                        else if ( ((LA32_260>='\u0000' && LA32_260<='@')||(LA32_260>='[' && LA32_260<=']')||LA32_260=='`'||(LA32_260>='{' && LA32_260<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA32_386 = input.LA(1);

                        s = -1;
                        if ( (LA32_386=='\"') ) {s = 261;}

                        else if ( ((LA32_386>='\u0000' && LA32_386<='!')||(LA32_386>='#' && LA32_386<=',')||(LA32_386>=':' && LA32_386<='@')||(LA32_386>='[' && LA32_386<='^')||LA32_386=='`'||(LA32_386>='{' && LA32_386<='\uFFFF')) ) {s = 49;}

                        else if ( ((LA32_386>='-' && LA32_386<='9')||(LA32_386>='A' && LA32_386<='Z')||LA32_386=='_'||(LA32_386>='a' && LA32_386<='z')) ) {s = 386;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA32_437 = input.LA(1);

                        s = -1;
                        if ( (LA32_437=='\"') ) {s = 116;}

                        else if ( ((LA32_437>='\u0000' && LA32_437<='!')||(LA32_437>='#' && LA32_437<='.')||(LA32_437>=':' && LA32_437<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_437=='/') ) {s = 263;}

                        else if ( ((LA32_437>='0' && LA32_437<='9')) ) {s = 437;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA32_439 = input.LA(1);

                        s = -1;
                        if ( ((LA32_439>='0' && LA32_439<='9')) ) {s = 476;}

                        else if ( (LA32_439==':') ) {s = 477;}

                        else if ( ((LA32_439>='\u0000' && LA32_439<='/')||(LA32_439>=';' && LA32_439<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA32_440 = input.LA(1);

                        s = -1;
                        if ( ((LA32_440>='0' && LA32_440<='5')) ) {s = 478;}

                        else if ( ((LA32_440>='6' && LA32_440<='9')) ) {s = 479;}

                        else if ( (LA32_440==':') ) {s = 477;}

                        else if ( ((LA32_440>='\u0000' && LA32_440<='/')||(LA32_440>=';' && LA32_440<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA32_186 = input.LA(1);

                        s = -1;
                        if ( ((LA32_186>='-' && LA32_186<='9')||(LA32_186>='A' && LA32_186<='Z')||LA32_186=='_'||(LA32_186>='a' && LA32_186<='z')) ) {s = 259;}

                        else if ( (LA32_186==':') ) {s = 260;}

                        else if ( (LA32_186=='\"') ) {s = 261;}

                        else if ( ((LA32_186>='\u0000' && LA32_186<='!')||(LA32_186>='#' && LA32_186<=',')||(LA32_186>=';' && LA32_186<='@')||(LA32_186>='[' && LA32_186<='^')||LA32_186=='`'||(LA32_186>='{' && LA32_186<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA32_262 = input.LA(1);

                        s = -1;
                        if ( (LA32_262=='\"') ) {s = 116;}

                        else if ( ((LA32_262>='\u0000' && LA32_262<='!')||(LA32_262>='#' && LA32_262<=',')||(LA32_262>=':' && LA32_262<='@')||(LA32_262>='[' && LA32_262<='^')||LA32_262=='`'||(LA32_262>='{' && LA32_262<='\uFFFF')) ) {s = 49;}

                        else if ( ((LA32_262>='-' && LA32_262<='9')||(LA32_262>='A' && LA32_262<='Z')||LA32_262=='_'||(LA32_262>='a' && LA32_262<='z')) ) {s = 262;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA32_477 = input.LA(1);

                        s = -1;
                        if ( ((LA32_477>='\u0000' && LA32_477<='/')||(LA32_477>=':' && LA32_477<='\uFFFF')) ) {s = 49;}

                        else if ( ((LA32_477>='0' && LA32_477<='9')) ) {s = 502;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA32_46 = input.LA(1);

                        s = -1;
                        if ( (LA32_46=='^') ) {s = 47;}

                        else if ( ((LA32_46>='A' && LA32_46<='Z')||LA32_46=='_'||(LA32_46>='a' && LA32_46<='z')) ) {s = 48;}

                        else if ( ((LA32_46>='\u0000' && LA32_46<='@')||(LA32_46>='[' && LA32_46<=']')||LA32_46=='`'||(LA32_46>='{' && LA32_46<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA32_184 = input.LA(1);

                        s = -1;
                        if ( (LA32_184=='^') ) {s = 185;}

                        else if ( ((LA32_184>='A' && LA32_184<='Z')||LA32_184=='_'||(LA32_184>='a' && LA32_184<='z')) ) {s = 186;}

                        else if ( ((LA32_184>='\u0000' && LA32_184<='@')||(LA32_184>='[' && LA32_184<=']')||LA32_184=='`'||(LA32_184>='{' && LA32_184<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA32_191 = input.LA(1);

                        s = -1;
                        if ( (LA32_191=='\"') ) {s = 116;}

                        else if ( ((LA32_191>='\u0000' && LA32_191<='!')||(LA32_191>='#' && LA32_191<='.')||(LA32_191>=';' && LA32_191<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_191=='/') ) {s = 263;}

                        else if ( ((LA32_191>='0' && LA32_191<='9')) ) {s = 191;}

                        else if ( (LA32_191==':') ) {s = 264;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA32_48 = input.LA(1);

                        s = -1;
                        if ( ((LA32_48>='-' && LA32_48<='9')||(LA32_48>='A' && LA32_48<='Z')||LA32_48=='_'||(LA32_48>='a' && LA32_48<='z')) ) {s = 111;}

                        else if ( (LA32_48==':') ) {s = 112;}

                        else if ( ((LA32_48>='\u0000' && LA32_48<=',')||(LA32_48>=';' && LA32_48<='@')||(LA32_48>='[' && LA32_48<='^')||LA32_48=='`'||(LA32_48>='{' && LA32_48<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA32_331 = input.LA(1);

                        s = -1;
                        if ( ((LA32_331>='-' && LA32_331<='9')||(LA32_331>='A' && LA32_331<='Z')||LA32_331=='_'||(LA32_331>='a' && LA32_331<='z')) ) {s = 387;}

                        else if ( (LA32_331=='\"') ) {s = 116;}

                        else if ( ((LA32_331>='\u0000' && LA32_331<='!')||(LA32_331>='#' && LA32_331<=',')||(LA32_331>=':' && LA32_331<='@')||(LA32_331>='[' && LA32_331<='^')||LA32_331=='`'||(LA32_331>='{' && LA32_331<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA32_42 = input.LA(1);

                        s = -1;
                        if ( ((LA32_42>='0' && LA32_42<='9')) ) {s = 114;}

                        else if ( (LA32_42=='/') ) {s = 115;}

                        else if ( (LA32_42=='\"') ) {s = 116;}

                        else if ( (LA32_42=='-') ) {s = 117;}

                        else if ( ((LA32_42>='\u0000' && LA32_42<='!')||(LA32_42>='#' && LA32_42<=',')||(LA32_42>=';' && LA32_42<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_42==':') ) {s = 118;}

                        else if ( (LA32_42=='.') ) {s = 119;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA32_44 = input.LA(1);

                        s = -1;
                        if ( ((LA32_44>='0' && LA32_44<='9')) ) {s = 121;}

                        else if ( (LA32_44=='/') ) {s = 115;}

                        else if ( (LA32_44=='\"') ) {s = 116;}

                        else if ( (LA32_44=='-') ) {s = 117;}

                        else if ( ((LA32_44>='\u0000' && LA32_44<='!')||(LA32_44>='#' && LA32_44<=',')||(LA32_44>=';' && LA32_44<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_44==':') ) {s = 118;}

                        else if ( (LA32_44=='.') ) {s = 119;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA32_43 = input.LA(1);

                        s = -1;
                        if ( ((LA32_43>='0' && LA32_43<='5')) ) {s = 120;}

                        else if ( ((LA32_43>='6' && LA32_43<='9')) ) {s = 121;}

                        else if ( (LA32_43=='/') ) {s = 115;}

                        else if ( (LA32_43=='\"') ) {s = 116;}

                        else if ( (LA32_43=='-') ) {s = 117;}

                        else if ( ((LA32_43>='\u0000' && LA32_43<='!')||(LA32_43>='#' && LA32_43<=',')||(LA32_43>=';' && LA32_43<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_43==':') ) {s = 118;}

                        else if ( (LA32_43=='.') ) {s = 119;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA32_197 = input.LA(1);

                        s = -1;
                        if ( (LA32_197=='/') ) {s = 115;}

                        else if ( (LA32_197=='\"') ) {s = 116;}

                        else if ( ((LA32_197>='0' && LA32_197<='9')) ) {s = 197;}

                        else if ( (LA32_197=='-') ) {s = 117;}

                        else if ( ((LA32_197>='\u0000' && LA32_197<='!')||(LA32_197>='#' && LA32_197<=',')||(LA32_197>=';' && LA32_197<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_197==':') ) {s = 118;}

                        else if ( (LA32_197=='.') ) {s = 270;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA32_114 = input.LA(1);

                        s = -1;
                        if ( ((LA32_114>='0' && LA32_114<='9')) ) {s = 187;}

                        else if ( (LA32_114=='.') ) {s = 119;}

                        else if ( (LA32_114=='/') ) {s = 115;}

                        else if ( (LA32_114=='\"') ) {s = 116;}

                        else if ( (LA32_114=='-') ) {s = 117;}

                        else if ( ((LA32_114>='\u0000' && LA32_114<='!')||(LA32_114>='#' && LA32_114<=',')||(LA32_114>=';' && LA32_114<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_114==':') ) {s = 118;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA32_121 = input.LA(1);

                        s = -1;
                        if ( (LA32_121=='.') ) {s = 119;}

                        else if ( (LA32_121=='/') ) {s = 115;}

                        else if ( (LA32_121=='\"') ) {s = 116;}

                        else if ( ((LA32_121>='0' && LA32_121<='9')) ) {s = 197;}

                        else if ( (LA32_121=='-') ) {s = 117;}

                        else if ( ((LA32_121>='\u0000' && LA32_121<='!')||(LA32_121>='#' && LA32_121<=',')||(LA32_121>=';' && LA32_121<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_121==':') ) {s = 118;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA32_0 = input.LA(1);

                        s = -1;
                        if ( (LA32_0=='t') ) {s = 1;}

                        else if ( (LA32_0=='f') ) {s = 2;}

                        else if ( (LA32_0=='\"') ) {s = 3;}

                        else if ( (LA32_0=='a') ) {s = 4;}

                        else if ( (LA32_0=='o') ) {s = 5;}

                        else if ( (LA32_0=='u') ) {s = 6;}

                        else if ( (LA32_0=='r') ) {s = 7;}

                        else if ( (LA32_0=='z') ) {s = 8;}

                        else if ( (LA32_0=='v') ) {s = 9;}

                        else if ( (LA32_0=='b') ) {s = 10;}

                        else if ( (LA32_0=='n') ) {s = 11;}

                        else if ( (LA32_0=='p') ) {s = 12;}

                        else if ( (LA32_0=='s') ) {s = 13;}

                        else if ( (LA32_0=='c') ) {s = 14;}

                        else if ( (LA32_0==':') ) {s = 15;}

                        else if ( (LA32_0=='i') ) {s = 16;}

                        else if ( (LA32_0=='d') ) {s = 17;}

                        else if ( (LA32_0=='-') ) {s = 18;}

                        else if ( (LA32_0=='l') ) {s = 19;}

                        else if ( (LA32_0=='g') ) {s = 20;}

                        else if ( (LA32_0=='m') ) {s = 21;}

                        else if ( (LA32_0=='{') ) {s = 22;}

                        else if ( (LA32_0=='}') ) {s = 23;}

                        else if ( (LA32_0=='e') ) {s = 24;}

                        else if ( (LA32_0=='.') ) {s = 25;}

                        else if ( (LA32_0=='/') ) {s = 26;}

                        else if ( (LA32_0=='^') ) {s = 27;}

                        else if ( ((LA32_0>='A' && LA32_0<='Z')||LA32_0=='_'||LA32_0=='h'||(LA32_0>='j' && LA32_0<='k')||LA32_0=='q'||(LA32_0>='w' && LA32_0<='y')) ) {s = 28;}

                        else if ( ((LA32_0>='0' && LA32_0<='9')) ) {s = 29;}

                        else if ( (LA32_0=='\'') ) {s = 30;}

                        else if ( ((LA32_0>='\t' && LA32_0<='\n')||LA32_0=='\r'||LA32_0==' ') ) {s = 31;}

                        else if ( ((LA32_0>='\u0000' && LA32_0<='\b')||(LA32_0>='\u000B' && LA32_0<='\f')||(LA32_0>='\u000E' && LA32_0<='\u001F')||LA32_0=='!'||(LA32_0>='#' && LA32_0<='&')||(LA32_0>='(' && LA32_0<=',')||(LA32_0>=';' && LA32_0<='@')||(LA32_0>='[' && LA32_0<=']')||LA32_0=='`'||LA32_0=='|'||(LA32_0>='~' && LA32_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA32_120 = input.LA(1);

                        s = -1;
                        if ( ((LA32_120>='0' && LA32_120<='5')) ) {s = 196;}

                        else if ( (LA32_120=='.') ) {s = 119;}

                        else if ( (LA32_120=='/') ) {s = 115;}

                        else if ( (LA32_120=='\"') ) {s = 116;}

                        else if ( ((LA32_120>='6' && LA32_120<='9')) ) {s = 197;}

                        else if ( (LA32_120=='-') ) {s = 117;}

                        else if ( ((LA32_120>='\u0000' && LA32_120<='!')||(LA32_120>='#' && LA32_120<=',')||(LA32_120>=';' && LA32_120<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_120==':') ) {s = 118;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA32_187 = input.LA(1);

                        s = -1;
                        if ( (LA32_187=='/') ) {s = 115;}

                        else if ( (LA32_187=='\"') ) {s = 116;}

                        else if ( ((LA32_187>='0' && LA32_187<='9')) ) {s = 197;}

                        else if ( (LA32_187=='.') ) {s = 119;}

                        else if ( (LA32_187=='-') ) {s = 117;}

                        else if ( ((LA32_187>='\u0000' && LA32_187<='!')||(LA32_187>='#' && LA32_187<=',')||(LA32_187>=';' && LA32_187<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_187==':') ) {s = 118;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA32_196 = input.LA(1);

                        s = -1;
                        if ( (LA32_196=='/') ) {s = 115;}

                        else if ( (LA32_196=='\"') ) {s = 116;}

                        else if ( ((LA32_196>='0' && LA32_196<='9')) ) {s = 197;}

                        else if ( (LA32_196=='-') ) {s = 117;}

                        else if ( ((LA32_196>='\u0000' && LA32_196<='!')||(LA32_196>='#' && LA32_196<=',')||(LA32_196>=';' && LA32_196<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_196==':') ) {s = 118;}

                        else if ( (LA32_196=='.') ) {s = 119;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA32_267 = input.LA(1);

                        s = -1;
                        if ( ((LA32_267>='\u0000' && LA32_267<='/')||(LA32_267>=':' && LA32_267<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_267=='1') ) {s = 335;}

                        else if ( (LA32_267=='2') ) {s = 336;}

                        else if ( (LA32_267=='0'||(LA32_267>='3' && LA32_267<='9')) ) {s = 337;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA32_40 = input.LA(1);

                        s = -1;
                        if ( (LA32_40=='o') ) {s = 110;}

                        else if ( ((LA32_40>='-' && LA32_40<='9')||(LA32_40>='A' && LA32_40<='Z')||LA32_40=='_'||(LA32_40>='a' && LA32_40<='n')||(LA32_40>='p' && LA32_40<='z')) ) {s = 111;}

                        else if ( (LA32_40==':') ) {s = 112;}

                        else if ( ((LA32_40>='\u0000' && LA32_40<=',')||(LA32_40>=';' && LA32_40<='@')||(LA32_40>='[' && LA32_40<='^')||LA32_40=='`'||(LA32_40>='{' && LA32_40<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA32_328 = input.LA(1);

                        s = -1;
                        if ( ((LA32_328>='-' && LA32_328<='9')||(LA32_328>='A' && LA32_328<='Z')||LA32_328=='_'||(LA32_328>='a' && LA32_328<='z')) ) {s = 386;}

                        else if ( (LA32_328=='\"') ) {s = 261;}

                        else if ( ((LA32_328>='\u0000' && LA32_328<='!')||(LA32_328>='#' && LA32_328<=',')||(LA32_328>=':' && LA32_328<='@')||(LA32_328>='[' && LA32_328<='^')||LA32_328=='`'||(LA32_328>='{' && LA32_328<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA32_270 = input.LA(1);

                        s = -1;
                        if ( ((LA32_270>='\u0000' && LA32_270<='/')||(LA32_270>=':' && LA32_270<='\uFFFF')) ) {s = 49;}

                        else if ( ((LA32_270>='0' && LA32_270<='9')) ) {s = 339;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA32_339 = input.LA(1);

                        s = -1;
                        if ( (LA32_339=='\"') ) {s = 266;}

                        else if ( ((LA32_339>='0' && LA32_339<='9')) ) {s = 339;}

                        else if ( ((LA32_339>='\u0000' && LA32_339<='!')||(LA32_339>='#' && LA32_339<='/')||(LA32_339>=':' && LA32_339<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA32_189 = input.LA(1);

                        s = -1;
                        if ( (LA32_189=='\"') ) {s = 116;}

                        else if ( ((LA32_189>='\u0000' && LA32_189<='!')||(LA32_189>='#' && LA32_189<=',')||(LA32_189>=':' && LA32_189<='@')||(LA32_189>='[' && LA32_189<='^')||LA32_189=='`'||(LA32_189>='{' && LA32_189<='\uFFFF')) ) {s = 49;}

                        else if ( ((LA32_189>='-' && LA32_189<='9')||(LA32_189>='A' && LA32_189<='Z')||LA32_189=='_'||(LA32_189>='a' && LA32_189<='z')) ) {s = 262;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA32_112 = input.LA(1);

                        s = -1;
                        if ( ((LA32_112>='\u0000' && LA32_112<='-')||(LA32_112>='0' && LA32_112<='@')||(LA32_112>='[' && LA32_112<=']')||LA32_112=='`'||(LA32_112>='{' && LA32_112<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_112=='.') ) {s = 183;}

                        else if ( (LA32_112=='/') ) {s = 184;}

                        else if ( (LA32_112=='^') ) {s = 185;}

                        else if ( ((LA32_112>='A' && LA32_112<='Z')||LA32_112=='_'||(LA32_112>='a' && LA32_112<='z')) ) {s = 186;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA32_192 = input.LA(1);

                        s = -1;
                        if ( (LA32_192=='/') ) {s = 115;}

                        else if ( (LA32_192=='\"') ) {s = 116;}

                        else if ( ((LA32_192>='0' && LA32_192<='9')) ) {s = 192;}

                        else if ( ((LA32_192>='\u0000' && LA32_192<='!')||(LA32_192>='#' && LA32_192<='.')||(LA32_192>=':' && LA32_192<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA32_259 = input.LA(1);

                        s = -1;
                        if ( (LA32_259==':') ) {s = 260;}

                        else if ( (LA32_259=='\"') ) {s = 261;}

                        else if ( ((LA32_259>='-' && LA32_259<='9')||(LA32_259>='A' && LA32_259<='Z')||LA32_259=='_'||(LA32_259>='a' && LA32_259<='z')) ) {s = 259;}

                        else if ( ((LA32_259>='\u0000' && LA32_259<='!')||(LA32_259>='#' && LA32_259<=',')||(LA32_259>=';' && LA32_259<='@')||(LA32_259>='[' && LA32_259<='^')||LA32_259=='`'||(LA32_259>='{' && LA32_259<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA32_269 = input.LA(1);

                        s = -1;
                        if ( (LA32_269=='\"') ) {s = 266;}

                        else if ( ((LA32_269>='0' && LA32_269<='9')) ) {s = 339;}

                        else if ( (LA32_269=='.') ) {s = 267;}

                        else if ( ((LA32_269>='\u0000' && LA32_269<='!')||(LA32_269>='#' && LA32_269<='-')||LA32_269=='/'||(LA32_269>=':' && LA32_269<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA32_333 = input.LA(1);

                        s = -1;
                        if ( (LA32_333=='\"') ) {s = 266;}

                        else if ( ((LA32_333>='0' && LA32_333<='9')) ) {s = 339;}

                        else if ( ((LA32_333>='\u0000' && LA32_333<='!')||(LA32_333>='#' && LA32_333<='-')||LA32_333=='/'||(LA32_333>=':' && LA32_333<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_333=='.') ) {s = 267;}

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA32_518 = input.LA(1);

                        s = -1;
                        if ( ((LA32_518>='0' && LA32_518<='9')) ) {s = 531;}

                        else if ( ((LA32_518>='\u0000' && LA32_518<='/')||(LA32_518>=':' && LA32_518<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA32_531 = input.LA(1);

                        s = -1;
                        if ( ((LA32_531>='\u0000' && LA32_531<='/')||(LA32_531>=';' && LA32_531<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_531==':') ) {s = 264;}

                        else if ( ((LA32_531>='0' && LA32_531<='9')) ) {s = 531;}

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA32_338 = input.LA(1);

                        s = -1;
                        if ( (LA32_338=='\"') ) {s = 266;}

                        else if ( ((LA32_338>='0' && LA32_338<='9')) ) {s = 339;}

                        else if ( (LA32_338=='.') ) {s = 267;}

                        else if ( ((LA32_338>='\u0000' && LA32_338<='!')||(LA32_338>='#' && LA32_338<='-')||LA32_338=='/'||(LA32_338>=':' && LA32_338<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA32_195 = input.LA(1);

                        s = -1;
                        if ( ((LA32_195>='0' && LA32_195<='9')) ) {s = 269;}

                        else if ( (LA32_195=='\"') ) {s = 266;}

                        else if ( (LA32_195=='.') ) {s = 267;}

                        else if ( ((LA32_195>='\u0000' && LA32_195<='!')||(LA32_195>='#' && LA32_195<='-')||LA32_195=='/'||(LA32_195>=':' && LA32_195<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA32_332 = input.LA(1);

                        s = -1;
                        if ( (LA32_332=='-') ) {s = 388;}

                        else if ( ((LA32_332>='0' && LA32_332<='9')) ) {s = 332;}

                        else if ( ((LA32_332>='\u0000' && LA32_332<=',')||(LA32_332>='.' && LA32_332<='/')||(LA32_332>=':' && LA32_332<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA32_388 = input.LA(1);

                        s = -1;
                        if ( ((LA32_388>='0' && LA32_388<='9')) ) {s = 437;}

                        else if ( ((LA32_388>='\u0000' && LA32_388<='/')||(LA32_388>=':' && LA32_388<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA32_392 = input.LA(1);

                        s = -1;
                        if ( (LA32_392=='.') ) {s = 390;}

                        else if ( ((LA32_392>='\u0000' && LA32_392<='-')||(LA32_392>='/' && LA32_392<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA32_265 = input.LA(1);

                        s = -1;
                        if ( ((LA32_265>='0' && LA32_265<='9')) ) {s = 333;}

                        else if ( (LA32_265=='\"') ) {s = 266;}

                        else if ( (LA32_265=='.') ) {s = 267;}

                        else if ( ((LA32_265>='\u0000' && LA32_265<='!')||(LA32_265>='#' && LA32_265<='-')||LA32_265=='/'||(LA32_265>=':' && LA32_265<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA32_438 = input.LA(1);

                        s = -1;
                        if ( (LA32_438=='.') ) {s = 390;}

                        else if ( ((LA32_438>='\u0000' && LA32_438<='-')||(LA32_438>='/' && LA32_438<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA32_268 = input.LA(1);

                        s = -1;
                        if ( ((LA32_268>='0' && LA32_268<='5')) ) {s = 338;}

                        else if ( (LA32_268=='\"') ) {s = 266;}

                        else if ( ((LA32_268>='6' && LA32_268<='9')) ) {s = 339;}

                        else if ( (LA32_268=='.') ) {s = 267;}

                        else if ( ((LA32_268>='\u0000' && LA32_268<='!')||(LA32_268>='#' && LA32_268<='-')||LA32_268=='/'||(LA32_268>=':' && LA32_268<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA32_3 = input.LA(1);

                        s = -1;
                        if ( (LA32_3=='n') ) {s = 40;}

                        else if ( (LA32_3=='\"') ) {s = 41;}

                        else if ( (LA32_3=='1') ) {s = 42;}

                        else if ( (LA32_3=='2') ) {s = 43;}

                        else if ( (LA32_3=='0'||(LA32_3>='3' && LA32_3<='9')) ) {s = 44;}

                        else if ( (LA32_3=='.') ) {s = 45;}

                        else if ( (LA32_3=='/') ) {s = 46;}

                        else if ( (LA32_3=='^') ) {s = 47;}

                        else if ( ((LA32_3>='A' && LA32_3<='Z')||LA32_3=='_'||(LA32_3>='a' && LA32_3<='m')||(LA32_3>='o' && LA32_3<='z')) ) {s = 48;}

                        else if ( ((LA32_3>='\u0000' && LA32_3<='!')||(LA32_3>='#' && LA32_3<='-')||(LA32_3>=':' && LA32_3<='@')||(LA32_3>='[' && LA32_3<=']')||LA32_3=='`'||(LA32_3>='{' && LA32_3<='\uFFFF')) ) {s = 49;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA32_264 = input.LA(1);

                        s = -1;
                        if ( ((LA32_264>='\u0000' && LA32_264<='/')||(LA32_264>=':' && LA32_264<='\uFFFF')) ) {s = 49;}

                        else if ( ((LA32_264>='0' && LA32_264<='9')) ) {s = 332;}

                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA32_442 = input.LA(1);

                        s = -1;
                        if ( ((LA32_442>='\u0000' && LA32_442<='-')||(LA32_442>='/' && LA32_442<='\uFFFF')) ) {s = 49;}

                        else if ( (LA32_442=='.') ) {s = 390;}

                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA32_30 = input.LA(1);

                        s = -1;
                        if ( ((LA32_30>='\u0000' && LA32_30<='\uFFFF')) ) {s = 49;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA32_193 = input.LA(1);

                        s = -1;
                        if ( ((LA32_193>='0' && LA32_193<='9')) ) {s = 265;}

                        else if ( (LA32_193=='\"') ) {s = 266;}

                        else if ( (LA32_193=='.') ) {s = 267;}

                        else if ( ((LA32_193>='\u0000' && LA32_193<='!')||(LA32_193>='#' && LA32_193<='-')||LA32_193=='/'||(LA32_193>=':' && LA32_193<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA32_194 = input.LA(1);

                        s = -1;
                        if ( ((LA32_194>='0' && LA32_194<='5')) ) {s = 268;}

                        else if ( ((LA32_194>='6' && LA32_194<='9')) ) {s = 269;}

                        else if ( (LA32_194=='\"') ) {s = 266;}

                        else if ( (LA32_194=='.') ) {s = 267;}

                        else if ( ((LA32_194>='\u0000' && LA32_194<='!')||(LA32_194>='#' && LA32_194<='-')||LA32_194=='/'||(LA32_194>=':' && LA32_194<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}