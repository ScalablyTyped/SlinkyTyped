package typingsSlinky.typescriptServices.TypeScript.Services.Formatting

import typingsSlinky.typescriptServices.FormattingOptions
import typingsSlinky.typescriptServices.TypeScript.ArgumentListSyntax
import typingsSlinky.typescriptServices.TypeScript.ArrayLiteralExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ArrayTypeSyntax
import typingsSlinky.typescriptServices.TypeScript.BinaryExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.BlockSyntax
import typingsSlinky.typescriptServices.TypeScript.BreakStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.CallSignatureSyntax
import typingsSlinky.typescriptServices.TypeScript.CaseSwitchClauseSyntax
import typingsSlinky.typescriptServices.TypeScript.CastExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.CatchClauseSyntax
import typingsSlinky.typescriptServices.TypeScript.ClassDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.ConditionalExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ConstraintSyntax
import typingsSlinky.typescriptServices.TypeScript.ConstructSignatureSyntax
import typingsSlinky.typescriptServices.TypeScript.ConstructorDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.ConstructorTypeSyntax
import typingsSlinky.typescriptServices.TypeScript.ContinueStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.DebuggerStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.DefaultSwitchClauseSyntax
import typingsSlinky.typescriptServices.TypeScript.DeleteExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.DoStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.ElementAccessExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ElseClauseSyntax
import typingsSlinky.typescriptServices.TypeScript.EmptyStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.EnumDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.EnumElementSyntax
import typingsSlinky.typescriptServices.TypeScript.EqualsValueClauseSyntax
import typingsSlinky.typescriptServices.TypeScript.ExportAssignmentSyntax
import typingsSlinky.typescriptServices.TypeScript.ExpressionStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.ExternalModuleReferenceSyntax
import typingsSlinky.typescriptServices.TypeScript.FinallyClauseSyntax
import typingsSlinky.typescriptServices.TypeScript.ForInStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.ForStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.FunctionDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.FunctionExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.FunctionPropertyAssignmentSyntax
import typingsSlinky.typescriptServices.TypeScript.FunctionTypeSyntax
import typingsSlinky.typescriptServices.TypeScript.GenericTypeSyntax
import typingsSlinky.typescriptServices.TypeScript.GetAccessorSyntax
import typingsSlinky.typescriptServices.TypeScript.HeritageClauseSyntax
import typingsSlinky.typescriptServices.TypeScript.ISeparatedSyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import typingsSlinky.typescriptServices.TypeScript.IfStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.ImportDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.IndexMemberDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.IndexSignatureSyntax
import typingsSlinky.typescriptServices.TypeScript.InterfaceDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.InvocationExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.LabeledStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.MemberAccessExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.MemberVariableDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.MethodSignatureSyntax
import typingsSlinky.typescriptServices.TypeScript.ModuleDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.ModuleNameModuleReferenceSyntax
import typingsSlinky.typescriptServices.TypeScript.ObjectCreationExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ObjectLiteralExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ObjectTypeSyntax
import typingsSlinky.typescriptServices.TypeScript.OmittedExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ParameterListSyntax
import typingsSlinky.typescriptServices.TypeScript.ParameterSyntax
import typingsSlinky.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ParenthesizedExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.PostfixUnaryExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.PrefixUnaryExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.PropertySignatureSyntax
import typingsSlinky.typescriptServices.TypeScript.QualifiedNameSyntax
import typingsSlinky.typescriptServices.TypeScript.ReturnStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.SetAccessorSyntax
import typingsSlinky.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.SimplePropertyAssignmentSyntax
import typingsSlinky.typescriptServices.TypeScript.SourceUnitSyntax
import typingsSlinky.typescriptServices.TypeScript.SwitchStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.SyntaxNode
import typingsSlinky.typescriptServices.TypeScript.SyntaxWalker
import typingsSlinky.typescriptServices.TypeScript.TextSpan
import typingsSlinky.typescriptServices.TypeScript.ThrowStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.TryStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.TypeAnnotationSyntax
import typingsSlinky.typescriptServices.TypeScript.TypeArgumentListSyntax
import typingsSlinky.typescriptServices.TypeScript.TypeOfExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.TypeParameterListSyntax
import typingsSlinky.typescriptServices.TypeScript.TypeParameterSyntax
import typingsSlinky.typescriptServices.TypeScript.TypeQuerySyntax
import typingsSlinky.typescriptServices.TypeScript.VariableDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.VariableDeclaratorSyntax
import typingsSlinky.typescriptServices.TypeScript.VariableStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.VoidExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.WhileStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.WithStatementSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndentationTrackingWalker extends SyntaxWalker {
  
  var _indentationNodeContextPool: js.Any = js.native
  
  var _lastTriviaWasNewLine: js.Any = js.native
  
  var _parent: js.Any = js.native
  
  var _position: js.Any = js.native
  
  var _snapshot: js.Any = js.native
  
  var _textSpan: js.Any = js.native
  
  def forceIndentNextToken(tokenStart: Double): Unit = js.native
  
  /* private */ def forceRecomputeIndentationOfParent(tokenStart: js.Any, newLineAdded: js.Any): js.Any = js.native
  
  def forceSkipIndentingNextToken(tokenStart: Double): Unit = js.native
  
  /* private */ def getCommentIndentationAmount(token: js.Any): js.Any = js.native
  
  /* private */ def getNodeIndentation(node: js.Any, newLineInsertedByFormatting: js.Any): js.Any = js.native
  
  /* private */ def getTokenIndentationAmount(token: js.Any): js.Any = js.native
  
  def indentToken(token: ISyntaxToken, indentationAmount: Double, commentIndentationAmount: Double): Unit = js.native
  
  def indentationNodeContextPool(): IndentationNodeContextPool = js.native
  
  var options: FormattingOptions = js.native
  
  def parent(): IndentationNodeContext = js.native
  
  def position(): Double = js.native
  
  /* private */ def shouldIndentBlockInParent(parent: js.Any): js.Any = js.native
  
  def snapshot(): ITextSnapshot = js.native
  
  def textSpan(): TextSpan = js.native
  
  def visitTokenInSpan(token: ISyntaxToken): Unit = js.native
}
object IndentationTrackingWalker {
  
  @scala.inline
  def apply(
    _indentationNodeContextPool: js.Any,
    _lastTriviaWasNewLine: js.Any,
    _parent: js.Any,
    _position: js.Any,
    _snapshot: js.Any,
    _textSpan: js.Any,
    forceIndentNextToken: Double => Unit,
    forceRecomputeIndentationOfParent: (js.Any, js.Any) => js.Any,
    forceSkipIndentingNextToken: Double => Unit,
    getCommentIndentationAmount: js.Any => js.Any,
    getNodeIndentation: (js.Any, js.Any) => js.Any,
    getTokenIndentationAmount: js.Any => js.Any,
    indentToken: (ISyntaxToken, Double, Double) => Unit,
    indentationNodeContextPool: () => IndentationNodeContextPool,
    options: FormattingOptions,
    parent: () => IndentationNodeContext,
    position: () => Double,
    shouldIndentBlockInParent: js.Any => js.Any,
    snapshot: () => ITextSnapshot,
    textSpan: () => TextSpan,
    visitArgumentList: ArgumentListSyntax => js.Any,
    visitArrayLiteralExpression: ArrayLiteralExpressionSyntax => js.Any,
    visitArrayType: ArrayTypeSyntax => js.Any,
    visitBinaryExpression: BinaryExpressionSyntax => js.Any,
    visitBlock: BlockSyntax => js.Any,
    visitBreakStatement: BreakStatementSyntax => js.Any,
    visitCallSignature: CallSignatureSyntax => js.Any,
    visitCaseSwitchClause: CaseSwitchClauseSyntax => js.Any,
    visitCastExpression: CastExpressionSyntax => js.Any,
    visitCatchClause: CatchClauseSyntax => js.Any,
    visitClassDeclaration: ClassDeclarationSyntax => js.Any,
    visitConditionalExpression: ConditionalExpressionSyntax => js.Any,
    visitConstraint: ConstraintSyntax => js.Any,
    visitConstructSignature: ConstructSignatureSyntax => js.Any,
    visitConstructorDeclaration: ConstructorDeclarationSyntax => js.Any,
    visitConstructorType: ConstructorTypeSyntax => js.Any,
    visitContinueStatement: ContinueStatementSyntax => js.Any,
    visitDebuggerStatement: DebuggerStatementSyntax => js.Any,
    visitDefaultSwitchClause: DefaultSwitchClauseSyntax => js.Any,
    visitDeleteExpression: DeleteExpressionSyntax => js.Any,
    visitDoStatement: DoStatementSyntax => js.Any,
    visitElementAccessExpression: ElementAccessExpressionSyntax => js.Any,
    visitElseClause: ElseClauseSyntax => js.Any,
    visitEmptyStatement: EmptyStatementSyntax => js.Any,
    visitEnumDeclaration: EnumDeclarationSyntax => js.Any,
    visitEnumElement: EnumElementSyntax => js.Any,
    visitEqualsValueClause: EqualsValueClauseSyntax => js.Any,
    visitExportAssignment: ExportAssignmentSyntax => js.Any,
    visitExpressionStatement: ExpressionStatementSyntax => js.Any,
    visitExternalModuleReference: ExternalModuleReferenceSyntax => js.Any,
    visitFinallyClause: FinallyClauseSyntax => js.Any,
    visitForInStatement: ForInStatementSyntax => js.Any,
    visitForStatement: ForStatementSyntax => js.Any,
    visitFunctionDeclaration: FunctionDeclarationSyntax => js.Any,
    visitFunctionExpression: FunctionExpressionSyntax => js.Any,
    visitFunctionPropertyAssignment: FunctionPropertyAssignmentSyntax => js.Any,
    visitFunctionType: FunctionTypeSyntax => js.Any,
    visitGenericType: GenericTypeSyntax => js.Any,
    visitGetAccessor: GetAccessorSyntax => js.Any,
    visitHeritageClause: HeritageClauseSyntax => js.Any,
    visitIfStatement: IfStatementSyntax => js.Any,
    visitImportDeclaration: ImportDeclarationSyntax => js.Any,
    visitIndexMemberDeclaration: IndexMemberDeclarationSyntax => js.Any,
    visitIndexSignature: IndexSignatureSyntax => js.Any,
    visitInterfaceDeclaration: InterfaceDeclarationSyntax => js.Any,
    visitInvocationExpression: InvocationExpressionSyntax => js.Any,
    visitLabeledStatement: LabeledStatementSyntax => js.Any,
    visitList: ISyntaxList => Unit,
    visitMemberAccessExpression: MemberAccessExpressionSyntax => js.Any,
    visitMemberFunctionDeclaration: MemberFunctionDeclarationSyntax => js.Any,
    visitMemberVariableDeclaration: MemberVariableDeclarationSyntax => js.Any,
    visitMethodSignature: MethodSignatureSyntax => js.Any,
    visitModuleDeclaration: ModuleDeclarationSyntax => js.Any,
    visitModuleNameModuleReference: ModuleNameModuleReferenceSyntax => js.Any,
    visitNode: SyntaxNode => Unit,
    visitNodeOrToken: ISyntaxNodeOrToken => Unit,
    visitObjectCreationExpression: ObjectCreationExpressionSyntax => js.Any,
    visitObjectLiteralExpression: ObjectLiteralExpressionSyntax => js.Any,
    visitObjectType: ObjectTypeSyntax => js.Any,
    visitOmittedExpression: OmittedExpressionSyntax => js.Any,
    visitOptionalNode: SyntaxNode => Unit,
    visitOptionalNodeOrToken: ISyntaxNodeOrToken => Unit,
    visitOptionalToken: js.Any => js.Any,
    visitParameter: ParameterSyntax => js.Any,
    visitParameterList: ParameterListSyntax => js.Any,
    visitParenthesizedArrowFunctionExpression: ParenthesizedArrowFunctionExpressionSyntax => js.Any,
    visitParenthesizedExpression: ParenthesizedExpressionSyntax => js.Any,
    visitPostfixUnaryExpression: PostfixUnaryExpressionSyntax => js.Any,
    visitPrefixUnaryExpression: PrefixUnaryExpressionSyntax => js.Any,
    visitPropertySignature: PropertySignatureSyntax => js.Any,
    visitQualifiedName: QualifiedNameSyntax => js.Any,
    visitReturnStatement: ReturnStatementSyntax => js.Any,
    visitSeparatedList: ISeparatedSyntaxList => Unit,
    visitSetAccessor: SetAccessorSyntax => js.Any,
    visitSimpleArrowFunctionExpression: SimpleArrowFunctionExpressionSyntax => js.Any,
    visitSimplePropertyAssignment: SimplePropertyAssignmentSyntax => js.Any,
    visitSourceUnit: SourceUnitSyntax => js.Any,
    visitSwitchStatement: SwitchStatementSyntax => js.Any,
    visitThrowStatement: ThrowStatementSyntax => js.Any,
    visitToken: ISyntaxToken => js.Any,
    visitTokenInSpan: ISyntaxToken => Unit,
    visitTryStatement: TryStatementSyntax => js.Any,
    visitTypeAnnotation: TypeAnnotationSyntax => js.Any,
    visitTypeArgumentList: TypeArgumentListSyntax => js.Any,
    visitTypeOfExpression: TypeOfExpressionSyntax => js.Any,
    visitTypeParameter: TypeParameterSyntax => js.Any,
    visitTypeParameterList: TypeParameterListSyntax => js.Any,
    visitTypeQuery: TypeQuerySyntax => js.Any,
    visitVariableDeclaration: VariableDeclarationSyntax => js.Any,
    visitVariableDeclarator: VariableDeclaratorSyntax => js.Any,
    visitVariableStatement: VariableStatementSyntax => js.Any,
    visitVoidExpression: VoidExpressionSyntax => js.Any,
    visitWhileStatement: WhileStatementSyntax => js.Any,
    visitWithStatement: WithStatementSyntax => js.Any
  ): IndentationTrackingWalker = {
    val __obj = js.Dynamic.literal(_indentationNodeContextPool = _indentationNodeContextPool.asInstanceOf[js.Any], _lastTriviaWasNewLine = _lastTriviaWasNewLine.asInstanceOf[js.Any], _parent = _parent.asInstanceOf[js.Any], _position = _position.asInstanceOf[js.Any], _snapshot = _snapshot.asInstanceOf[js.Any], _textSpan = _textSpan.asInstanceOf[js.Any], forceIndentNextToken = js.Any.fromFunction1(forceIndentNextToken), forceRecomputeIndentationOfParent = js.Any.fromFunction2(forceRecomputeIndentationOfParent), forceSkipIndentingNextToken = js.Any.fromFunction1(forceSkipIndentingNextToken), getCommentIndentationAmount = js.Any.fromFunction1(getCommentIndentationAmount), getNodeIndentation = js.Any.fromFunction2(getNodeIndentation), getTokenIndentationAmount = js.Any.fromFunction1(getTokenIndentationAmount), indentToken = js.Any.fromFunction3(indentToken), indentationNodeContextPool = js.Any.fromFunction0(indentationNodeContextPool), options = options.asInstanceOf[js.Any], parent = js.Any.fromFunction0(parent), position = js.Any.fromFunction0(position), shouldIndentBlockInParent = js.Any.fromFunction1(shouldIndentBlockInParent), snapshot = js.Any.fromFunction0(snapshot), textSpan = js.Any.fromFunction0(textSpan), visitArgumentList = js.Any.fromFunction1(visitArgumentList), visitArrayLiteralExpression = js.Any.fromFunction1(visitArrayLiteralExpression), visitArrayType = js.Any.fromFunction1(visitArrayType), visitBinaryExpression = js.Any.fromFunction1(visitBinaryExpression), visitBlock = js.Any.fromFunction1(visitBlock), visitBreakStatement = js.Any.fromFunction1(visitBreakStatement), visitCallSignature = js.Any.fromFunction1(visitCallSignature), visitCaseSwitchClause = js.Any.fromFunction1(visitCaseSwitchClause), visitCastExpression = js.Any.fromFunction1(visitCastExpression), visitCatchClause = js.Any.fromFunction1(visitCatchClause), visitClassDeclaration = js.Any.fromFunction1(visitClassDeclaration), visitConditionalExpression = js.Any.fromFunction1(visitConditionalExpression), visitConstraint = js.Any.fromFunction1(visitConstraint), visitConstructSignature = js.Any.fromFunction1(visitConstructSignature), visitConstructorDeclaration = js.Any.fromFunction1(visitConstructorDeclaration), visitConstructorType = js.Any.fromFunction1(visitConstructorType), visitContinueStatement = js.Any.fromFunction1(visitContinueStatement), visitDebuggerStatement = js.Any.fromFunction1(visitDebuggerStatement), visitDefaultSwitchClause = js.Any.fromFunction1(visitDefaultSwitchClause), visitDeleteExpression = js.Any.fromFunction1(visitDeleteExpression), visitDoStatement = js.Any.fromFunction1(visitDoStatement), visitElementAccessExpression = js.Any.fromFunction1(visitElementAccessExpression), visitElseClause = js.Any.fromFunction1(visitElseClause), visitEmptyStatement = js.Any.fromFunction1(visitEmptyStatement), visitEnumDeclaration = js.Any.fromFunction1(visitEnumDeclaration), visitEnumElement = js.Any.fromFunction1(visitEnumElement), visitEqualsValueClause = js.Any.fromFunction1(visitEqualsValueClause), visitExportAssignment = js.Any.fromFunction1(visitExportAssignment), visitExpressionStatement = js.Any.fromFunction1(visitExpressionStatement), visitExternalModuleReference = js.Any.fromFunction1(visitExternalModuleReference), visitFinallyClause = js.Any.fromFunction1(visitFinallyClause), visitForInStatement = js.Any.fromFunction1(visitForInStatement), visitForStatement = js.Any.fromFunction1(visitForStatement), visitFunctionDeclaration = js.Any.fromFunction1(visitFunctionDeclaration), visitFunctionExpression = js.Any.fromFunction1(visitFunctionExpression), visitFunctionPropertyAssignment = js.Any.fromFunction1(visitFunctionPropertyAssignment), visitFunctionType = js.Any.fromFunction1(visitFunctionType), visitGenericType = js.Any.fromFunction1(visitGenericType), visitGetAccessor = js.Any.fromFunction1(visitGetAccessor), visitHeritageClause = js.Any.fromFunction1(visitHeritageClause), visitIfStatement = js.Any.fromFunction1(visitIfStatement), visitImportDeclaration = js.Any.fromFunction1(visitImportDeclaration), visitIndexMemberDeclaration = js.Any.fromFunction1(visitIndexMemberDeclaration), visitIndexSignature = js.Any.fromFunction1(visitIndexSignature), visitInterfaceDeclaration = js.Any.fromFunction1(visitInterfaceDeclaration), visitInvocationExpression = js.Any.fromFunction1(visitInvocationExpression), visitLabeledStatement = js.Any.fromFunction1(visitLabeledStatement), visitList = js.Any.fromFunction1(visitList), visitMemberAccessExpression = js.Any.fromFunction1(visitMemberAccessExpression), visitMemberFunctionDeclaration = js.Any.fromFunction1(visitMemberFunctionDeclaration), visitMemberVariableDeclaration = js.Any.fromFunction1(visitMemberVariableDeclaration), visitMethodSignature = js.Any.fromFunction1(visitMethodSignature), visitModuleDeclaration = js.Any.fromFunction1(visitModuleDeclaration), visitModuleNameModuleReference = js.Any.fromFunction1(visitModuleNameModuleReference), visitNode = js.Any.fromFunction1(visitNode), visitNodeOrToken = js.Any.fromFunction1(visitNodeOrToken), visitObjectCreationExpression = js.Any.fromFunction1(visitObjectCreationExpression), visitObjectLiteralExpression = js.Any.fromFunction1(visitObjectLiteralExpression), visitObjectType = js.Any.fromFunction1(visitObjectType), visitOmittedExpression = js.Any.fromFunction1(visitOmittedExpression), visitOptionalNode = js.Any.fromFunction1(visitOptionalNode), visitOptionalNodeOrToken = js.Any.fromFunction1(visitOptionalNodeOrToken), visitOptionalToken = js.Any.fromFunction1(visitOptionalToken), visitParameter = js.Any.fromFunction1(visitParameter), visitParameterList = js.Any.fromFunction1(visitParameterList), visitParenthesizedArrowFunctionExpression = js.Any.fromFunction1(visitParenthesizedArrowFunctionExpression), visitParenthesizedExpression = js.Any.fromFunction1(visitParenthesizedExpression), visitPostfixUnaryExpression = js.Any.fromFunction1(visitPostfixUnaryExpression), visitPrefixUnaryExpression = js.Any.fromFunction1(visitPrefixUnaryExpression), visitPropertySignature = js.Any.fromFunction1(visitPropertySignature), visitQualifiedName = js.Any.fromFunction1(visitQualifiedName), visitReturnStatement = js.Any.fromFunction1(visitReturnStatement), visitSeparatedList = js.Any.fromFunction1(visitSeparatedList), visitSetAccessor = js.Any.fromFunction1(visitSetAccessor), visitSimpleArrowFunctionExpression = js.Any.fromFunction1(visitSimpleArrowFunctionExpression), visitSimplePropertyAssignment = js.Any.fromFunction1(visitSimplePropertyAssignment), visitSourceUnit = js.Any.fromFunction1(visitSourceUnit), visitSwitchStatement = js.Any.fromFunction1(visitSwitchStatement), visitThrowStatement = js.Any.fromFunction1(visitThrowStatement), visitToken = js.Any.fromFunction1(visitToken), visitTokenInSpan = js.Any.fromFunction1(visitTokenInSpan), visitTryStatement = js.Any.fromFunction1(visitTryStatement), visitTypeAnnotation = js.Any.fromFunction1(visitTypeAnnotation), visitTypeArgumentList = js.Any.fromFunction1(visitTypeArgumentList), visitTypeOfExpression = js.Any.fromFunction1(visitTypeOfExpression), visitTypeParameter = js.Any.fromFunction1(visitTypeParameter), visitTypeParameterList = js.Any.fromFunction1(visitTypeParameterList), visitTypeQuery = js.Any.fromFunction1(visitTypeQuery), visitVariableDeclaration = js.Any.fromFunction1(visitVariableDeclaration), visitVariableDeclarator = js.Any.fromFunction1(visitVariableDeclarator), visitVariableStatement = js.Any.fromFunction1(visitVariableStatement), visitVoidExpression = js.Any.fromFunction1(visitVoidExpression), visitWhileStatement = js.Any.fromFunction1(visitWhileStatement), visitWithStatement = js.Any.fromFunction1(visitWithStatement))
    __obj.asInstanceOf[IndentationTrackingWalker]
  }
  
  @scala.inline
  implicit class IndentationTrackingWalkerMutableBuilder[Self <: IndentationTrackingWalker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceIndentNextToken(value: Double => Unit): Self = StObject.set(x, "forceIndentNextToken", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForceRecomputeIndentationOfParent(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "forceRecomputeIndentationOfParent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setForceSkipIndentingNextToken(value: Double => Unit): Self = StObject.set(x, "forceSkipIndentingNextToken", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCommentIndentationAmount(value: js.Any => js.Any): Self = StObject.set(x, "getCommentIndentationAmount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeIndentation(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "getNodeIndentation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetTokenIndentationAmount(value: js.Any => js.Any): Self = StObject.set(x, "getTokenIndentationAmount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndentToken(value: (ISyntaxToken, Double, Double) => Unit): Self = StObject.set(x, "indentToken", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIndentationNodeContextPool(value: () => IndentationNodeContextPool): Self = StObject.set(x, "indentationNodeContextPool", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptions(value: FormattingOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: () => IndentationNodeContext): Self = StObject.set(x, "parent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPosition(value: () => Double): Self = StObject.set(x, "position", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShouldIndentBlockInParent(value: js.Any => js.Any): Self = StObject.set(x, "shouldIndentBlockInParent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSnapshot(value: () => ITextSnapshot): Self = StObject.set(x, "snapshot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTextSpan(value: () => TextSpan): Self = StObject.set(x, "textSpan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVisitTokenInSpan(value: ISyntaxToken => Unit): Self = StObject.set(x, "visitTokenInSpan", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_indentationNodeContextPool(value: js.Any): Self = StObject.set(x, "_indentationNodeContextPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lastTriviaWasNewLine(value: js.Any): Self = StObject.set(x, "_lastTriviaWasNewLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_parent(value: js.Any): Self = StObject.set(x, "_parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_position(value: js.Any): Self = StObject.set(x, "_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_snapshot(value: js.Any): Self = StObject.set(x, "_snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textSpan(value: js.Any): Self = StObject.set(x, "_textSpan", value.asInstanceOf[js.Any])
  }
}
