package typingsSlinky.typescriptServices.mod.Services

import typingsSlinky.typescriptServices.FormattingOptions
import typingsSlinky.typescriptServices.TypeScript.ILogger
import typingsSlinky.typescriptServices.TypeScript.ISimpleText
import typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind
import typingsSlinky.typescriptServices.TypeScript.Services.Formatting.ITextSnapshot
import typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleAction
import typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleFlags
import typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.ITokenAccess
import typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange
import typingsSlinky.typescriptServices.TypeScript.SourceUnitSyntax
import typingsSlinky.typescriptServices.TypeScript.SyntaxKind
import typingsSlinky.typescriptServices.TypeScript.SyntaxNode
import typingsSlinky.typescriptServices.TypeScript.SyntaxTree
import typingsSlinky.typescriptServices.TypeScript.TextSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Formatting {
  
  @JSImport("typescript-services", "Services.Formatting.Formatter")
  @js.native
  class Formatter protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Formatter {
    def this(
      textSpan: TextSpan,
      sourceUnit: SourceUnitSyntax,
      indentFirstToken: Boolean,
      options: FormattingOptions,
      snapshot: ITextSnapshot,
      rulesProvider: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
      formattingRequestKind: FormattingRequestKind
    ) = this()
  }
  object Formatter {
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Formatter.getEdits")
    @js.native
    def getEdits(
      textSpan: TextSpan,
      sourceUnit: SourceUnitSyntax,
      options: FormattingOptions,
      indentFirstToken: Boolean,
      snapshot: ITextSnapshot,
      rulesProvider: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
      formattingRequestKind: FormattingRequestKind
    ): js.Array[typingsSlinky.typescriptServices.TypeScript.Services.Formatting.TextEditInfo] = js.native
  }
  
  @JSImport("typescript-services", "Services.Formatting.FormattingContext")
  @js.native
  class FormattingContext protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext {
    def this(snapshot: ITextSnapshot, formattingRequestKind: FormattingRequestKind) = this()
  }
  
  @JSImport("typescript-services", "Services.Formatting.FormattingManager")
  @js.native
  class FormattingManager protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingManager {
    def this(
      syntaxTree: SyntaxTree,
      snapshot: ITextSnapshot,
      rulesProvider: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
      editorOptions: typingsSlinky.typescriptServices.TypeScript.Services.EditorOptions
    ) = this()
  }
  
  @JSImport("typescript-services", "Services.Formatting.FormattingRequestKind")
  @js.native
  object FormattingRequestKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind with Double
      ] = js.native
    
    /* 0 */ val FormatDocument: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatDocument with Double = js.native
    
    /* 4 */ val FormatOnClosingCurlyBrace: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatOnClosingCurlyBrace with Double = js.native
    
    /* 2 */ val FormatOnEnter: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatOnEnter with Double = js.native
    
    /* 5 */ val FormatOnPaste: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatOnPaste with Double = js.native
    
    /* 3 */ val FormatOnSemicolon: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatOnSemicolon with Double = js.native
    
    /* 1 */ val FormatSelection: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatSelection with Double = js.native
  }
  
  @JSImport("typescript-services", "Services.Formatting.IndentationNodeContext")
  @js.native
  class IndentationNodeContext protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext {
    def this(
      parent: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext,
      node: SyntaxNode,
      fullStart: Double,
      indentationAmount: Double,
      childIndentationAmountDelta: Double
    ) = this()
  }
  
  @JSImport("typescript-services", "Services.Formatting.IndentationNodeContextPool")
  @js.native
  class IndentationNodeContextPool ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContextPool
  
  @JSImport("typescript-services", "Services.Formatting.IndentationTrackingWalker")
  @js.native
  class IndentationTrackingWalker protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.IndentationTrackingWalker {
    def this(
      textSpan: TextSpan,
      sourceUnit: SourceUnitSyntax,
      snapshot: ITextSnapshot,
      indentFirstToken: Boolean,
      options: FormattingOptions
    ) = this()
  }
  
  @JSImport("typescript-services", "Services.Formatting.MultipleTokenIndenter")
  @js.native
  class MultipleTokenIndenter protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.MultipleTokenIndenter {
    def this(
      textSpan: TextSpan,
      sourceUnit: SourceUnitSyntax,
      snapshot: ITextSnapshot,
      indentFirstToken: Boolean,
      options: FormattingOptions
    ) = this()
  }
  
  @JSImport("typescript-services", "Services.Formatting.Rule")
  @js.native
  class Rule protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Rule {
    def this(
      Descriptor: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor,
      Operation: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleOperation
    ) = this()
    def this(
      Descriptor: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor,
      Operation: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleOperation,
      Flag: RuleFlags
    ) = this()
  }
  
  @JSImport("typescript-services", "Services.Formatting.RuleAction")
  @js.native
  object RuleAction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleAction with Double
      ] = js.native
    
    /* 3 */ val Delete: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleAction.Delete with Double = js.native
    
    /* 0 */ val Ignore: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleAction.Ignore with Double = js.native
    
    /* 2 */ val NewLine: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleAction.NewLine with Double = js.native
    
    /* 1 */ val Space: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleAction.Space with Double = js.native
  }
  
  @JSImport("typescript-services", "Services.Formatting.RuleDescriptor")
  @js.native
  class RuleDescriptor protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor {
    def this(LeftTokenRange: TokenRange, RightTokenRange: TokenRange) = this()
  }
  object RuleDescriptor {
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.RuleDescriptor.create1")
    @js.native
    def create1(left: SyntaxKind, right: SyntaxKind): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.RuleDescriptor.create2")
    @js.native
    def create2(left: TokenRange, right: SyntaxKind): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.RuleDescriptor.create3")
    @js.native
    def create3(left: SyntaxKind, right: TokenRange): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.RuleDescriptor.create4")
    @js.native
    def create4(left: TokenRange, right: TokenRange): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
  }
  
  @JSImport("typescript-services", "Services.Formatting.RuleFlags")
  @js.native
  object RuleFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleFlags with Double
      ] = js.native
    
    /* 1 */ val CanDeleteNewLines: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleFlags.CanDeleteNewLines with Double = js.native
    
    /* 0 */ val None: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleFlags.None with Double = js.native
  }
  
  @JSImport("typescript-services", "Services.Formatting.RuleOperation")
  @js.native
  class RuleOperation ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleOperation
  object RuleOperation {
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.RuleOperation.create1")
    @js.native
    def create1(action: RuleAction): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleOperation = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.RuleOperation.create2")
    @js.native
    def create2(
      context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleOperationContext,
      action: RuleAction
    ): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleOperation = js.native
  }
  
  @JSImport("typescript-services", "Services.Formatting.RuleOperationContext")
  @js.native
  class RuleOperationContext protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleOperationContext {
    def this(funcs: (js.Function1[
            /* context */ typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext, 
            Boolean
          ])*) = this()
  }
  object RuleOperationContext {
    
    @JSImport("typescript-services", "Services.Formatting.RuleOperationContext")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.RuleOperationContext.Any")
    @js.native
    def Any: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleOperationContext = js.native
    @scala.inline
    def Any_=(x: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleOperationContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Any")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typescript-services", "Services.Formatting.Rules")
  @js.native
  class Rules ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Rules
  object Rules {
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsAfterCodeBlockContext")
    @js.native
    def IsAfterCodeBlockContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsBeforeBlockContext")
    @js.native
    def IsBeforeBlockContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsBeforeMultilineBlockContext")
    @js.native
    def IsBeforeMultilineBlockContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsBinaryOpContext")
    @js.native
    def IsBinaryOpContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsBlockContext")
    @js.native
    def IsBlockContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsControlDeclContext")
    @js.native
    def IsControlDeclContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsForContext")
    @js.native
    def IsForContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsFunctionCallContext")
    @js.native
    def IsFunctionCallContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsFunctionCallOrNewContext")
    @js.native
    def IsFunctionCallOrNewContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsFunctionDeclContext")
    @js.native
    def IsFunctionDeclContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsModuleDeclContext")
    @js.native
    def IsModuleDeclContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsMultilineBlockContext")
    @js.native
    def IsMultilineBlockContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsNewContext")
    @js.native
    def IsNewContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsNotBinaryOpContext")
    @js.native
    def IsNotBinaryOpContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsNotForContext")
    @js.native
    def IsNotForContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsNotFormatOnEnter")
    @js.native
    def IsNotFormatOnEnter(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsObjectContext")
    @js.native
    def IsObjectContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsObjectTypeContext")
    @js.native
    def IsObjectTypeContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsSameLineTokenContext")
    @js.native
    def IsSameLineTokenContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsSameLineTokenOrBeforeMultilineBlockContext")
    @js.native
    def IsSameLineTokenOrBeforeMultilineBlockContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsSingleLineBlockContext")
    @js.native
    def IsSingleLineBlockContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsTypeArgumentOrParameter")
    @js.native
    def IsTypeArgumentOrParameter(tokenKind: SyntaxKind, parentKind: SyntaxKind): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsTypeArgumentOrParameterContext")
    @js.native
    def IsTypeArgumentOrParameterContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsTypeScriptDeclWithBlockContext")
    @js.native
    def IsTypeScriptDeclWithBlockContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.IsVoidOpContext")
    @js.native
    def IsVoidOpContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.NodeIsBlockContext")
    @js.native
    def NodeIsBlockContext(node: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = js.native
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.Rules.NodeIsTypeScriptDeclWithBlockContext")
    @js.native
    def NodeIsTypeScriptDeclWithBlockContext(node: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = js.native
  }
  
  @JSImport("typescript-services", "Services.Formatting.RulesBucket")
  @js.native
  class RulesBucket ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesBucket
  
  @JSImport("typescript-services", "Services.Formatting.RulesBucketConstructionState")
  @js.native
  class RulesBucketConstructionState ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesBucketConstructionState
  
  @JSImport("typescript-services", "Services.Formatting.RulesMap")
  @js.native
  class RulesMap ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesMap
  object RulesMap {
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.RulesMap.create")
    @js.native
    def create(rules: js.Array[typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Rule]): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesMap = js.native
  }
  
  @JSImport("typescript-services", "Services.Formatting.RulesPosition")
  @js.native
  object RulesPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesPosition with Double
      ] = js.native
    
    /* 2 */ val ContextRulesAny: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesPosition.ContextRulesAny with Double = js.native
    
    /* 1 */ val ContextRulesSpecific: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesPosition.ContextRulesSpecific with Double = js.native
    
    /* 0 */ val IgnoreRulesAny: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesPosition.IgnoreRulesAny with Double = js.native
    
    /* 0 */ val IgnoreRulesSpecific: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesPosition.IgnoreRulesSpecific with Double = js.native
    
    /* 4 */ val NoContextRulesAny: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesPosition.NoContextRulesAny with Double = js.native
    
    /* 3 */ val NoContextRulesSpecific: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesPosition.NoContextRulesSpecific with Double = js.native
  }
  
  @JSImport("typescript-services", "Services.Formatting.RulesProvider")
  @js.native
  class RulesProvider protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesProvider {
    def this(logger: ILogger) = this()
  }
  
  object Shared {
    
    @JSImport("typescript-services", "Services.Formatting.Shared.TokenAllAccess")
    @js.native
    class TokenAllAccess ()
      extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenAllAccess
    
    @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange")
    @js.native
    class TokenRange protected ()
      extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange {
      def this(tokenAccess: ITokenAccess) = this()
    }
    object TokenRange {
      
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange.AllTokens")
      @js.native
      def AllTokens(): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      
      /* static member */
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange.Any")
      @js.native
      def Any: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      
      /* static member */
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange.AnyIncludingMultilineComments")
      @js.native
      def AnyIncludingMultilineComments: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def AnyIncludingMultilineComments_=(x: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnyIncludingMultilineComments")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def Any_=(x: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Any")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange.BinaryKeywordOperators")
      @js.native
      def BinaryKeywordOperators: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def BinaryKeywordOperators_=(x: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BinaryKeywordOperators")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange.BinaryOperators")
      @js.native
      def BinaryOperators: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def BinaryOperators_=(x: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BinaryOperators")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange.Comments")
      @js.native
      def Comments: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def Comments_=(x: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Comments")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange.FromRange")
      @js.native
      def FromRange(f: SyntaxKind, to: SyntaxKind): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange.FromRange")
      @js.native
      def FromRange(f: SyntaxKind, to: SyntaxKind, except: js.Array[SyntaxKind]): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      
      /* static member */
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange.FromToken")
      @js.native
      def FromToken(token: SyntaxKind): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      
      /* static member */
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange.FromTokens")
      @js.native
      def FromTokens(tokens: js.Array[SyntaxKind]): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      
      /* static member */
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange.Keywords")
      @js.native
      def Keywords: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def Keywords_=(x: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Keywords")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange.Operators")
      @js.native
      def Operators: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def Operators_=(x: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Operators")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange.ReservedKeywords")
      @js.native
      def ReservedKeywords: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def ReservedKeywords_=(x: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReservedKeywords")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange.TypeNames")
      @js.native
      def TypeNames: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def TypeNames_=(x: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeNames")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange.UnaryPostdecrementExpressions")
      @js.native
      def UnaryPostdecrementExpressions: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def UnaryPostdecrementExpressions_=(x: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPostdecrementExpressions")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange.UnaryPostincrementExpressions")
      @js.native
      def UnaryPostincrementExpressions: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def UnaryPostincrementExpressions_=(x: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPostincrementExpressions")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange.UnaryPredecrementExpressions")
      @js.native
      def UnaryPredecrementExpressions: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def UnaryPredecrementExpressions_=(x: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPredecrementExpressions")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange.UnaryPrefixExpressions")
      @js.native
      def UnaryPrefixExpressions: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def UnaryPrefixExpressions_=(x: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPrefixExpressions")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange.UnaryPrefixOperators")
      @js.native
      def UnaryPrefixOperators: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def UnaryPrefixOperators_=(x: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPrefixOperators")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("typescript-services", "Services.Formatting.Shared.TokenRange.UnaryPreincrementExpressions")
      @js.native
      def UnaryPreincrementExpressions: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def UnaryPreincrementExpressions_=(x: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPreincrementExpressions")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("typescript-services", "Services.Formatting.Shared.TokenRangeAccess")
    @js.native
    class TokenRangeAccess protected ()
      extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRangeAccess {
      def this(from: SyntaxKind, to: SyntaxKind, except: js.Array[SyntaxKind]) = this()
    }
    
    @JSImport("typescript-services", "Services.Formatting.Shared.TokenSingleValueAccess")
    @js.native
    class TokenSingleValueAccess protected ()
      extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenSingleValueAccess {
      def this(token: SyntaxKind) = this()
    }
    
    @JSImport("typescript-services", "Services.Formatting.Shared.TokenValuesAccess")
    @js.native
    class TokenValuesAccess protected ()
      extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenValuesAccess {
      def this(tks: js.Array[SyntaxKind]) = this()
    }
  }
  
  @JSImport("typescript-services", "Services.Formatting.SingleTokenIndenter")
  @js.native
  class SingleTokenIndenter protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.SingleTokenIndenter {
    def this(
      indentationPosition: Double,
      sourceUnit: SourceUnitSyntax,
      snapshot: ITextSnapshot,
      indentFirstToken: Boolean,
      options: FormattingOptions
    ) = this()
  }
  object SingleTokenIndenter {
    
    /* static member */
    @JSImport("typescript-services", "Services.Formatting.SingleTokenIndenter.getIndentationAmount")
    @js.native
    def getIndentationAmount(
      position: Double,
      sourceUnit: SourceUnitSyntax,
      snapshot: ITextSnapshot,
      options: FormattingOptions
    ): Double = js.native
  }
  
  @JSImport("typescript-services", "Services.Formatting.SnapshotPoint")
  @js.native
  class SnapshotPoint protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.SnapshotPoint {
    def this(snapshot: ITextSnapshot, position: Double) = this()
  }
  
  @JSImport("typescript-services", "Services.Formatting.TextEditInfo")
  @js.native
  class TextEditInfo protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.TextEditInfo {
    def this(position: Double, length: Double, replaceWith: String) = this()
  }
  
  @JSImport("typescript-services", "Services.Formatting.TextSnapshot")
  @js.native
  class TextSnapshot protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.TextSnapshot {
    def this(snapshot: ISimpleText) = this()
  }
  
  @JSImport("typescript-services", "Services.Formatting.TextSnapshotLine")
  @js.native
  class TextSnapshotLine protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.TextSnapshotLine {
    def this(_snapshot: ITextSnapshot, _lineNumber: Double, _start: Double, _end: Double, _lineBreak: String) = this()
  }
  
  @JSImport("typescript-services", "Services.Formatting.TokenSpan")
  @js.native
  class TokenSpan protected ()
    extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.TokenSpan {
    def this(kind: SyntaxKind, start: Double, length: Double) = this()
  }
}
