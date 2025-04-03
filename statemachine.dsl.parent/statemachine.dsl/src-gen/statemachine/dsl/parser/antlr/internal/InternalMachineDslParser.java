package statemachine.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import statemachine.dsl.services.MachineDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMachineDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'{'", "'}'", "'int'", "';'", "'initial'", "'state'", "'entry'", "'exit'", "'event'", "'jump'", "'print'", "','", "'++'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMachineDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMachineDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMachineDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMachineDsl.g"; }



     	private MachineDslGrammarAccess grammarAccess;

        public InternalMachineDslParser(TokenStream input, MachineDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Machine";
       	}

       	@Override
       	protected MachineDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMachine"
    // InternalMachineDsl.g:64:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // InternalMachineDsl.g:64:48: (iv_ruleMachine= ruleMachine EOF )
            // InternalMachineDsl.g:65:2: iv_ruleMachine= ruleMachine EOF
            {
             newCompositeNode(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMachine=ruleMachine();

            state._fsp--;

             current =iv_ruleMachine; 
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
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalMachineDsl.g:71:1: ruleMachine returns [EObject current=null] : (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ( (lv_states_4_0= ruleState ) )* otherlv_5= '}' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_fields_3_0 = null;

        EObject lv_states_4_0 = null;



        	enterRule();

        try {
            // InternalMachineDsl.g:77:2: ( (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ( (lv_states_4_0= ruleState ) )* otherlv_5= '}' ) )
            // InternalMachineDsl.g:78:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ( (lv_states_4_0= ruleState ) )* otherlv_5= '}' )
            {
            // InternalMachineDsl.g:78:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ( (lv_states_4_0= ruleState ) )* otherlv_5= '}' )
            // InternalMachineDsl.g:79:3: otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ( (lv_states_4_0= ruleState ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMachineAccess().getMachineKeyword_0());
            		
            // InternalMachineDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMachineDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMachineDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMachineDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMachineDsl.g:105:3: ( (lv_fields_3_0= ruleField ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMachineDsl.g:106:4: (lv_fields_3_0= ruleField )
            	    {
            	    // InternalMachineDsl.g:106:4: (lv_fields_3_0= ruleField )
            	    // InternalMachineDsl.g:107:5: lv_fields_3_0= ruleField
            	    {

            	    					newCompositeNode(grammarAccess.getMachineAccess().getFieldsFieldParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_fields_3_0=ruleField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_3_0,
            	    						"statemachine.dsl.MachineDsl.Field");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMachineDsl.g:124:3: ( (lv_states_4_0= ruleState ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=16 && LA2_0<=17)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMachineDsl.g:125:4: (lv_states_4_0= ruleState )
            	    {
            	    // InternalMachineDsl.g:125:4: (lv_states_4_0= ruleState )
            	    // InternalMachineDsl.g:126:5: lv_states_4_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getMachineAccess().getStatesStateParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_states_4_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_4_0,
            	    						"statemachine.dsl.MachineDsl.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleField"
    // InternalMachineDsl.g:151:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalMachineDsl.g:151:46: (iv_ruleField= ruleField EOF )
            // InternalMachineDsl.g:152:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalMachineDsl.g:158:1: ruleField returns [EObject current=null] : (otherlv_0= 'int' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMachineDsl.g:164:2: ( (otherlv_0= 'int' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalMachineDsl.g:165:2: (otherlv_0= 'int' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalMachineDsl.g:165:2: (otherlv_0= 'int' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalMachineDsl.g:166:3: otherlv_0= 'int' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getIntKeyword_0());
            		
            // InternalMachineDsl.g:170:3: ()
            // InternalMachineDsl.g:171:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFieldAccess().getFieldAction_1(),
            					current);
            			

            }

            // InternalMachineDsl.g:177:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMachineDsl.g:178:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMachineDsl.g:178:4: (lv_name_2_0= RULE_ID )
            // InternalMachineDsl.g:179:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleState"
    // InternalMachineDsl.g:203:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMachineDsl.g:203:46: (iv_ruleState= ruleState EOF )
            // InternalMachineDsl.g:204:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMachineDsl.g:210:1: ruleState returns [EObject current=null] : ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_entry_4_0= ruleEntry ) )? ( (lv_events_5_0= ruleEvent ) )* ( (lv_exit_6_0= ruleExit ) )? otherlv_7= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_entry_4_0 = null;

        EObject lv_events_5_0 = null;

        EObject lv_exit_6_0 = null;



        	enterRule();

        try {
            // InternalMachineDsl.g:216:2: ( ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_entry_4_0= ruleEntry ) )? ( (lv_events_5_0= ruleEvent ) )* ( (lv_exit_6_0= ruleExit ) )? otherlv_7= '}' ) )
            // InternalMachineDsl.g:217:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_entry_4_0= ruleEntry ) )? ( (lv_events_5_0= ruleEvent ) )* ( (lv_exit_6_0= ruleExit ) )? otherlv_7= '}' )
            {
            // InternalMachineDsl.g:217:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_entry_4_0= ruleEntry ) )? ( (lv_events_5_0= ruleEvent ) )* ( (lv_exit_6_0= ruleExit ) )? otherlv_7= '}' )
            // InternalMachineDsl.g:218:3: ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_entry_4_0= ruleEntry ) )? ( (lv_events_5_0= ruleEvent ) )* ( (lv_exit_6_0= ruleExit ) )? otherlv_7= '}'
            {
            // InternalMachineDsl.g:218:3: ( (lv_initial_0_0= 'initial' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMachineDsl.g:219:4: (lv_initial_0_0= 'initial' )
                    {
                    // InternalMachineDsl.g:219:4: (lv_initial_0_0= 'initial' )
                    // InternalMachineDsl.g:220:5: lv_initial_0_0= 'initial'
                    {
                    lv_initial_0_0=(Token)match(input,16,FOLLOW_8); 

                    					newLeafNode(lv_initial_0_0, grammarAccess.getStateAccess().getInitialInitialKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "initial", lv_initial_0_0 != null, "initial");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalMachineDsl.g:236:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMachineDsl.g:237:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMachineDsl.g:237:4: (lv_name_2_0= RULE_ID )
            // InternalMachineDsl.g:238:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMachineDsl.g:258:3: ( (lv_entry_4_0= ruleEntry ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMachineDsl.g:259:4: (lv_entry_4_0= ruleEntry )
                    {
                    // InternalMachineDsl.g:259:4: (lv_entry_4_0= ruleEntry )
                    // InternalMachineDsl.g:260:5: lv_entry_4_0= ruleEntry
                    {

                    					newCompositeNode(grammarAccess.getStateAccess().getEntryEntryParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_entry_4_0=ruleEntry();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStateRule());
                    					}
                    					set(
                    						current,
                    						"entry",
                    						lv_entry_4_0,
                    						"statemachine.dsl.MachineDsl.Entry");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMachineDsl.g:277:3: ( (lv_events_5_0= ruleEvent ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMachineDsl.g:278:4: (lv_events_5_0= ruleEvent )
            	    {
            	    // InternalMachineDsl.g:278:4: (lv_events_5_0= ruleEvent )
            	    // InternalMachineDsl.g:279:5: lv_events_5_0= ruleEvent
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getEventsEventParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_events_5_0=ruleEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"events",
            	    						lv_events_5_0,
            	    						"statemachine.dsl.MachineDsl.Event");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalMachineDsl.g:296:3: ( (lv_exit_6_0= ruleExit ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMachineDsl.g:297:4: (lv_exit_6_0= ruleExit )
                    {
                    // InternalMachineDsl.g:297:4: (lv_exit_6_0= ruleExit )
                    // InternalMachineDsl.g:298:5: lv_exit_6_0= ruleExit
                    {

                    					newCompositeNode(grammarAccess.getStateAccess().getExitExitParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_exit_6_0=ruleExit();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStateRule());
                    					}
                    					set(
                    						current,
                    						"exit",
                    						lv_exit_6_0,
                    						"statemachine.dsl.MachineDsl.Exit");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEntry"
    // InternalMachineDsl.g:323:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalMachineDsl.g:323:46: (iv_ruleEntry= ruleEntry EOF )
            // InternalMachineDsl.g:324:2: iv_ruleEntry= ruleEntry EOF
            {
             newCompositeNode(grammarAccess.getEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntry=ruleEntry();

            state._fsp--;

             current =iv_ruleEntry; 
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
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // InternalMachineDsl.g:330:1: ruleEntry returns [EObject current=null] : (otherlv_0= 'entry' () otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalMachineDsl.g:336:2: ( (otherlv_0= 'entry' () otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' ) )
            // InternalMachineDsl.g:337:2: (otherlv_0= 'entry' () otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' )
            {
            // InternalMachineDsl.g:337:2: (otherlv_0= 'entry' () otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' )
            // InternalMachineDsl.g:338:3: otherlv_0= 'entry' () otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntryAccess().getEntryKeyword_0());
            		
            // InternalMachineDsl.g:342:3: ()
            // InternalMachineDsl.g:343:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntryAccess().getEntryAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getEntryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMachineDsl.g:353:3: ( (lv_commands_3_0= ruleCommand ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=21 && LA7_0<=22)||LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMachineDsl.g:354:4: (lv_commands_3_0= ruleCommand )
            	    {
            	    // InternalMachineDsl.g:354:4: (lv_commands_3_0= ruleCommand )
            	    // InternalMachineDsl.g:355:5: lv_commands_3_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getEntryAccess().getCommandsCommandParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_commands_3_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_3_0,
            	    						"statemachine.dsl.MachineDsl.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntryAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleExit"
    // InternalMachineDsl.g:380:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // InternalMachineDsl.g:380:45: (iv_ruleExit= ruleExit EOF )
            // InternalMachineDsl.g:381:2: iv_ruleExit= ruleExit EOF
            {
             newCompositeNode(grammarAccess.getExitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExit=ruleExit();

            state._fsp--;

             current =iv_ruleExit; 
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
    // $ANTLR end "entryRuleExit"


    // $ANTLR start "ruleExit"
    // InternalMachineDsl.g:387:1: ruleExit returns [EObject current=null] : (otherlv_0= 'exit' () otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalMachineDsl.g:393:2: ( (otherlv_0= 'exit' () otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' ) )
            // InternalMachineDsl.g:394:2: (otherlv_0= 'exit' () otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' )
            {
            // InternalMachineDsl.g:394:2: (otherlv_0= 'exit' () otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' )
            // InternalMachineDsl.g:395:3: otherlv_0= 'exit' () otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExitAccess().getExitKeyword_0());
            		
            // InternalMachineDsl.g:399:3: ()
            // InternalMachineDsl.g:400:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExitAccess().getExitAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getExitAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMachineDsl.g:410:3: ( (lv_commands_3_0= ruleCommand ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=21 && LA8_0<=22)||LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMachineDsl.g:411:4: (lv_commands_3_0= ruleCommand )
            	    {
            	    // InternalMachineDsl.g:411:4: (lv_commands_3_0= ruleCommand )
            	    // InternalMachineDsl.g:412:5: lv_commands_3_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getExitAccess().getCommandsCommandParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_commands_3_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExitRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_3_0,
            	    						"statemachine.dsl.MachineDsl.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getExitAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleExit"


    // $ANTLR start "entryRuleEvent"
    // InternalMachineDsl.g:437:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalMachineDsl.g:437:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalMachineDsl.g:438:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalMachineDsl.g:444:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalMachineDsl.g:450:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' ) )
            // InternalMachineDsl.g:451:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' )
            {
            // InternalMachineDsl.g:451:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' )
            // InternalMachineDsl.g:452:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
            		
            // InternalMachineDsl.g:456:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMachineDsl.g:457:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMachineDsl.g:457:4: (lv_name_1_0= RULE_ID )
            // InternalMachineDsl.g:458:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMachineDsl.g:478:3: ( (lv_commands_3_0= ruleCommand ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=21 && LA9_0<=22)||LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMachineDsl.g:479:4: (lv_commands_3_0= ruleCommand )
            	    {
            	    // InternalMachineDsl.g:479:4: (lv_commands_3_0= ruleCommand )
            	    // InternalMachineDsl.g:480:5: lv_commands_3_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getEventAccess().getCommandsCommandParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_commands_3_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEventRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_3_0,
            	    						"statemachine.dsl.MachineDsl.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleCommand"
    // InternalMachineDsl.g:505:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalMachineDsl.g:505:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalMachineDsl.g:506:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
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
    // InternalMachineDsl.g:512:1: ruleCommand returns [EObject current=null] : (this_Jump_0= ruleJump | this_Print_1= rulePrint | this_IncrementField_2= ruleIncrementField ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Jump_0 = null;

        EObject this_Print_1 = null;

        EObject this_IncrementField_2 = null;



        	enterRule();

        try {
            // InternalMachineDsl.g:518:2: ( (this_Jump_0= ruleJump | this_Print_1= rulePrint | this_IncrementField_2= ruleIncrementField ) )
            // InternalMachineDsl.g:519:2: (this_Jump_0= ruleJump | this_Print_1= rulePrint | this_IncrementField_2= ruleIncrementField )
            {
            // InternalMachineDsl.g:519:2: (this_Jump_0= ruleJump | this_Print_1= rulePrint | this_IncrementField_2= ruleIncrementField )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 22:
                {
                alt10=2;
                }
                break;
            case 24:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMachineDsl.g:520:3: this_Jump_0= ruleJump
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getJumpParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Jump_0=ruleJump();

                    state._fsp--;


                    			current = this_Jump_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMachineDsl.g:529:3: this_Print_1= rulePrint
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getPrintParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Print_1=rulePrint();

                    state._fsp--;


                    			current = this_Print_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMachineDsl.g:538:3: this_IncrementField_2= ruleIncrementField
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getIncrementFieldParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IncrementField_2=ruleIncrementField();

                    state._fsp--;


                    			current = this_IncrementField_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleJump"
    // InternalMachineDsl.g:550:1: entryRuleJump returns [EObject current=null] : iv_ruleJump= ruleJump EOF ;
    public final EObject entryRuleJump() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJump = null;


        try {
            // InternalMachineDsl.g:550:45: (iv_ruleJump= ruleJump EOF )
            // InternalMachineDsl.g:551:2: iv_ruleJump= ruleJump EOF
            {
             newCompositeNode(grammarAccess.getJumpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJump=ruleJump();

            state._fsp--;

             current =iv_ruleJump; 
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
    // $ANTLR end "entryRuleJump"


    // $ANTLR start "ruleJump"
    // InternalMachineDsl.g:557:1: ruleJump returns [EObject current=null] : (otherlv_0= 'jump' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleJump() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMachineDsl.g:563:2: ( (otherlv_0= 'jump' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMachineDsl.g:564:2: (otherlv_0= 'jump' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMachineDsl.g:564:2: (otherlv_0= 'jump' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // InternalMachineDsl.g:565:3: otherlv_0= 'jump' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJumpAccess().getJumpKeyword_0());
            		
            // InternalMachineDsl.g:569:3: ( (otherlv_1= RULE_ID ) )
            // InternalMachineDsl.g:570:4: (otherlv_1= RULE_ID )
            {
            // InternalMachineDsl.g:570:4: (otherlv_1= RULE_ID )
            // InternalMachineDsl.g:571:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJumpRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_1, grammarAccess.getJumpAccess().getTargetStateCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getJumpAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleJump"


    // $ANTLR start "entryRulePrint"
    // InternalMachineDsl.g:590:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalMachineDsl.g:590:46: (iv_rulePrint= rulePrint EOF )
            // InternalMachineDsl.g:591:2: iv_rulePrint= rulePrint EOF
            {
             newCompositeNode(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;

             current =iv_rulePrint; 
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
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalMachineDsl.g:597:1: rulePrint returns [EObject current=null] : (otherlv_0= 'print' ( (lv_arguments_1_0= rulePrintArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= rulePrintArgument ) ) )* otherlv_4= ';' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalMachineDsl.g:603:2: ( (otherlv_0= 'print' ( (lv_arguments_1_0= rulePrintArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= rulePrintArgument ) ) )* otherlv_4= ';' ) )
            // InternalMachineDsl.g:604:2: (otherlv_0= 'print' ( (lv_arguments_1_0= rulePrintArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= rulePrintArgument ) ) )* otherlv_4= ';' )
            {
            // InternalMachineDsl.g:604:2: (otherlv_0= 'print' ( (lv_arguments_1_0= rulePrintArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= rulePrintArgument ) ) )* otherlv_4= ';' )
            // InternalMachineDsl.g:605:3: otherlv_0= 'print' ( (lv_arguments_1_0= rulePrintArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= rulePrintArgument ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
            		
            // InternalMachineDsl.g:609:3: ( (lv_arguments_1_0= rulePrintArgument ) )
            // InternalMachineDsl.g:610:4: (lv_arguments_1_0= rulePrintArgument )
            {
            // InternalMachineDsl.g:610:4: (lv_arguments_1_0= rulePrintArgument )
            // InternalMachineDsl.g:611:5: lv_arguments_1_0= rulePrintArgument
            {

            					newCompositeNode(grammarAccess.getPrintAccess().getArgumentsPrintArgumentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_arguments_1_0=rulePrintArgument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_1_0,
            						"statemachine.dsl.MachineDsl.PrintArgument");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMachineDsl.g:628:3: (otherlv_2= ',' ( (lv_arguments_3_0= rulePrintArgument ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMachineDsl.g:629:4: otherlv_2= ',' ( (lv_arguments_3_0= rulePrintArgument ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPrintAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMachineDsl.g:633:4: ( (lv_arguments_3_0= rulePrintArgument ) )
            	    // InternalMachineDsl.g:634:5: (lv_arguments_3_0= rulePrintArgument )
            	    {
            	    // InternalMachineDsl.g:634:5: (lv_arguments_3_0= rulePrintArgument )
            	    // InternalMachineDsl.g:635:6: lv_arguments_3_0= rulePrintArgument
            	    {

            	    						newCompositeNode(grammarAccess.getPrintAccess().getArgumentsPrintArgumentParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_arguments_3_0=rulePrintArgument();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPrintRule());
            	    						}
            	    						add(
            	    							current,
            	    							"arguments",
            	    							lv_arguments_3_0,
            	    							"statemachine.dsl.MachineDsl.PrintArgument");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPrintAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRulePrintArgument"
    // InternalMachineDsl.g:661:1: entryRulePrintArgument returns [EObject current=null] : iv_rulePrintArgument= rulePrintArgument EOF ;
    public final EObject entryRulePrintArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintArgument = null;


        try {
            // InternalMachineDsl.g:661:54: (iv_rulePrintArgument= rulePrintArgument EOF )
            // InternalMachineDsl.g:662:2: iv_rulePrintArgument= rulePrintArgument EOF
            {
             newCompositeNode(grammarAccess.getPrintArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintArgument=rulePrintArgument();

            state._fsp--;

             current =iv_rulePrintArgument; 
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
    // $ANTLR end "entryRulePrintArgument"


    // $ANTLR start "rulePrintArgument"
    // InternalMachineDsl.g:668:1: rulePrintArgument returns [EObject current=null] : (this_StringArgument_0= ruleStringArgument | this_FieldReference_1= ruleFieldReference ) ;
    public final EObject rulePrintArgument() throws RecognitionException {
        EObject current = null;

        EObject this_StringArgument_0 = null;

        EObject this_FieldReference_1 = null;



        	enterRule();

        try {
            // InternalMachineDsl.g:674:2: ( (this_StringArgument_0= ruleStringArgument | this_FieldReference_1= ruleFieldReference ) )
            // InternalMachineDsl.g:675:2: (this_StringArgument_0= ruleStringArgument | this_FieldReference_1= ruleFieldReference )
            {
            // InternalMachineDsl.g:675:2: (this_StringArgument_0= ruleStringArgument | this_FieldReference_1= ruleFieldReference )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMachineDsl.g:676:3: this_StringArgument_0= ruleStringArgument
                    {

                    			newCompositeNode(grammarAccess.getPrintArgumentAccess().getStringArgumentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringArgument_0=ruleStringArgument();

                    state._fsp--;


                    			current = this_StringArgument_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMachineDsl.g:685:3: this_FieldReference_1= ruleFieldReference
                    {

                    			newCompositeNode(grammarAccess.getPrintArgumentAccess().getFieldReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldReference_1=ruleFieldReference();

                    state._fsp--;


                    			current = this_FieldReference_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePrintArgument"


    // $ANTLR start "entryRuleStringArgument"
    // InternalMachineDsl.g:697:1: entryRuleStringArgument returns [EObject current=null] : iv_ruleStringArgument= ruleStringArgument EOF ;
    public final EObject entryRuleStringArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringArgument = null;


        try {
            // InternalMachineDsl.g:697:55: (iv_ruleStringArgument= ruleStringArgument EOF )
            // InternalMachineDsl.g:698:2: iv_ruleStringArgument= ruleStringArgument EOF
            {
             newCompositeNode(grammarAccess.getStringArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringArgument=ruleStringArgument();

            state._fsp--;

             current =iv_ruleStringArgument; 
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
    // $ANTLR end "entryRuleStringArgument"


    // $ANTLR start "ruleStringArgument"
    // InternalMachineDsl.g:704:1: ruleStringArgument returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringArgument() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMachineDsl.g:710:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMachineDsl.g:711:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMachineDsl.g:711:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMachineDsl.g:712:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMachineDsl.g:712:3: (lv_value_0_0= RULE_STRING )
            // InternalMachineDsl.g:713:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringArgumentAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringArgumentRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringArgument"


    // $ANTLR start "entryRuleFieldReference"
    // InternalMachineDsl.g:732:1: entryRuleFieldReference returns [EObject current=null] : iv_ruleFieldReference= ruleFieldReference EOF ;
    public final EObject entryRuleFieldReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldReference = null;


        try {
            // InternalMachineDsl.g:732:55: (iv_ruleFieldReference= ruleFieldReference EOF )
            // InternalMachineDsl.g:733:2: iv_ruleFieldReference= ruleFieldReference EOF
            {
             newCompositeNode(grammarAccess.getFieldReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldReference=ruleFieldReference();

            state._fsp--;

             current =iv_ruleFieldReference; 
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
    // $ANTLR end "entryRuleFieldReference"


    // $ANTLR start "ruleFieldReference"
    // InternalMachineDsl.g:739:1: ruleFieldReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleFieldReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMachineDsl.g:745:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMachineDsl.g:746:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMachineDsl.g:746:2: ( (otherlv_0= RULE_ID ) )
            // InternalMachineDsl.g:747:3: (otherlv_0= RULE_ID )
            {
            // InternalMachineDsl.g:747:3: (otherlv_0= RULE_ID )
            // InternalMachineDsl.g:748:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFieldReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getFieldReferenceAccess().getFieldFieldCrossReference_0());
            			

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
    // $ANTLR end "ruleFieldReference"


    // $ANTLR start "entryRuleIncrementField"
    // InternalMachineDsl.g:762:1: entryRuleIncrementField returns [EObject current=null] : iv_ruleIncrementField= ruleIncrementField EOF ;
    public final EObject entryRuleIncrementField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncrementField = null;


        try {
            // InternalMachineDsl.g:762:55: (iv_ruleIncrementField= ruleIncrementField EOF )
            // InternalMachineDsl.g:763:2: iv_ruleIncrementField= ruleIncrementField EOF
            {
             newCompositeNode(grammarAccess.getIncrementFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIncrementField=ruleIncrementField();

            state._fsp--;

             current =iv_ruleIncrementField; 
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
    // $ANTLR end "entryRuleIncrementField"


    // $ANTLR start "ruleIncrementField"
    // InternalMachineDsl.g:769:1: ruleIncrementField returns [EObject current=null] : (otherlv_0= '++' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleIncrementField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMachineDsl.g:775:2: ( (otherlv_0= '++' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMachineDsl.g:776:2: (otherlv_0= '++' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMachineDsl.g:776:2: (otherlv_0= '++' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // InternalMachineDsl.g:777:3: otherlv_0= '++' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIncrementFieldAccess().getPlusSignPlusSignKeyword_0());
            		
            // InternalMachineDsl.g:781:3: ( (otherlv_1= RULE_ID ) )
            // InternalMachineDsl.g:782:4: (otherlv_1= RULE_ID )
            {
            // InternalMachineDsl.g:782:4: (otherlv_1= RULE_ID )
            // InternalMachineDsl.g:783:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncrementFieldRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_1, grammarAccess.getIncrementFieldAccess().getFieldFieldCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getIncrementFieldAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleIncrementField"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000036000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001C2000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000182000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001602000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000808000L});

}