package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyntaxDedenter extends SyntaxRewriter {
  
  /* private */ def abort(): js.Any = js.native
  
  /* private */ def dedentMultiLineComment(trivia: js.Any): js.Any = js.native
  
  /* private */ def dedentSegment(segment: js.Any, hasFollowingNewLineTrivia: js.Any): js.Any = js.native
  
  /* private */ def dedentTriviaList(triviaList: js.Any): js.Any = js.native
  
  /* private */ def dedentWhitespace(trivia: js.Any, hasFollowingNewLineTrivia: js.Any): js.Any = js.native
  
  var dedentationAmount: js.Any = js.native
  
  /* private */ def isAborted(): js.Any = js.native
  
  var lastTriviaWasNewLine: js.Any = js.native
  
  var minimumIndent: js.Any = js.native
  
  var options: js.Any = js.native
}
object SyntaxDedenter {
  
  @scala.inline
  def apply(
    abort: () => js.Any,
    dedentMultiLineComment: js.Any => js.Any,
    dedentSegment: (js.Any, js.Any) => js.Any,
    dedentTriviaList: js.Any => js.Any,
    dedentWhitespace: (js.Any, js.Any) => js.Any,
    dedentationAmount: js.Any,
    isAborted: () => js.Any,
    lastTriviaWasNewLine: js.Any,
    minimumIndent: js.Any,
    options: js.Any,
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
    visitList: ISyntaxList => ISyntaxList,
    visitMemberAccessExpression: MemberAccessExpressionSyntax => js.Any,
    visitMemberFunctionDeclaration: MemberFunctionDeclarationSyntax => js.Any,
    visitMemberVariableDeclaration: MemberVariableDeclarationSyntax => js.Any,
    visitMethodSignature: MethodSignatureSyntax => js.Any,
    visitModuleDeclaration: ModuleDeclarationSyntax => js.Any,
    visitModuleNameModuleReference: ModuleNameModuleReferenceSyntax => js.Any,
    visitNode: SyntaxNode => SyntaxNode,
    visitNodeOrToken: ISyntaxNodeOrToken => ISyntaxNodeOrToken,
    visitObjectCreationExpression: ObjectCreationExpressionSyntax => js.Any,
    visitObjectLiteralExpression: ObjectLiteralExpressionSyntax => js.Any,
    visitObjectType: ObjectTypeSyntax => js.Any,
    visitOmittedExpression: OmittedExpressionSyntax => js.Any,
    visitParameter: ParameterSyntax => js.Any,
    visitParameterList: ParameterListSyntax => js.Any,
    visitParenthesizedArrowFunctionExpression: ParenthesizedArrowFunctionExpressionSyntax => js.Any,
    visitParenthesizedExpression: ParenthesizedExpressionSyntax => js.Any,
    visitPostfixUnaryExpression: PostfixUnaryExpressionSyntax => js.Any,
    visitPrefixUnaryExpression: PrefixUnaryExpressionSyntax => js.Any,
    visitPropertySignature: PropertySignatureSyntax => js.Any,
    visitQualifiedName: QualifiedNameSyntax => js.Any,
    visitReturnStatement: ReturnStatementSyntax => js.Any,
    visitSeparatedList: ISeparatedSyntaxList => ISeparatedSyntaxList,
    visitSetAccessor: SetAccessorSyntax => js.Any,
    visitSimpleArrowFunctionExpression: SimpleArrowFunctionExpressionSyntax => js.Any,
    visitSimplePropertyAssignment: SimplePropertyAssignmentSyntax => js.Any,
    visitSourceUnit: SourceUnitSyntax => js.Any,
    visitSwitchStatement: SwitchStatementSyntax => js.Any,
    visitThrowStatement: ThrowStatementSyntax => js.Any,
    visitToken: ISyntaxToken => js.Any,
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
  ): SyntaxDedenter = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), dedentMultiLineComment = js.Any.fromFunction1(dedentMultiLineComment), dedentSegment = js.Any.fromFunction2(dedentSegment), dedentTriviaList = js.Any.fromFunction1(dedentTriviaList), dedentWhitespace = js.Any.fromFunction2(dedentWhitespace), dedentationAmount = dedentationAmount.asInstanceOf[js.Any], isAborted = js.Any.fromFunction0(isAborted), lastTriviaWasNewLine = lastTriviaWasNewLine.asInstanceOf[js.Any], minimumIndent = minimumIndent.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], visitArgumentList = js.Any.fromFunction1(visitArgumentList), visitArrayLiteralExpression = js.Any.fromFunction1(visitArrayLiteralExpression), visitArrayType = js.Any.fromFunction1(visitArrayType), visitBinaryExpression = js.Any.fromFunction1(visitBinaryExpression), visitBlock = js.Any.fromFunction1(visitBlock), visitBreakStatement = js.Any.fromFunction1(visitBreakStatement), visitCallSignature = js.Any.fromFunction1(visitCallSignature), visitCaseSwitchClause = js.Any.fromFunction1(visitCaseSwitchClause), visitCastExpression = js.Any.fromFunction1(visitCastExpression), visitCatchClause = js.Any.fromFunction1(visitCatchClause), visitClassDeclaration = js.Any.fromFunction1(visitClassDeclaration), visitConditionalExpression = js.Any.fromFunction1(visitConditionalExpression), visitConstraint = js.Any.fromFunction1(visitConstraint), visitConstructSignature = js.Any.fromFunction1(visitConstructSignature), visitConstructorDeclaration = js.Any.fromFunction1(visitConstructorDeclaration), visitConstructorType = js.Any.fromFunction1(visitConstructorType), visitContinueStatement = js.Any.fromFunction1(visitContinueStatement), visitDebuggerStatement = js.Any.fromFunction1(visitDebuggerStatement), visitDefaultSwitchClause = js.Any.fromFunction1(visitDefaultSwitchClause), visitDeleteExpression = js.Any.fromFunction1(visitDeleteExpression), visitDoStatement = js.Any.fromFunction1(visitDoStatement), visitElementAccessExpression = js.Any.fromFunction1(visitElementAccessExpression), visitElseClause = js.Any.fromFunction1(visitElseClause), visitEmptyStatement = js.Any.fromFunction1(visitEmptyStatement), visitEnumDeclaration = js.Any.fromFunction1(visitEnumDeclaration), visitEnumElement = js.Any.fromFunction1(visitEnumElement), visitEqualsValueClause = js.Any.fromFunction1(visitEqualsValueClause), visitExportAssignment = js.Any.fromFunction1(visitExportAssignment), visitExpressionStatement = js.Any.fromFunction1(visitExpressionStatement), visitExternalModuleReference = js.Any.fromFunction1(visitExternalModuleReference), visitFinallyClause = js.Any.fromFunction1(visitFinallyClause), visitForInStatement = js.Any.fromFunction1(visitForInStatement), visitForStatement = js.Any.fromFunction1(visitForStatement), visitFunctionDeclaration = js.Any.fromFunction1(visitFunctionDeclaration), visitFunctionExpression = js.Any.fromFunction1(visitFunctionExpression), visitFunctionPropertyAssignment = js.Any.fromFunction1(visitFunctionPropertyAssignment), visitFunctionType = js.Any.fromFunction1(visitFunctionType), visitGenericType = js.Any.fromFunction1(visitGenericType), visitGetAccessor = js.Any.fromFunction1(visitGetAccessor), visitHeritageClause = js.Any.fromFunction1(visitHeritageClause), visitIfStatement = js.Any.fromFunction1(visitIfStatement), visitImportDeclaration = js.Any.fromFunction1(visitImportDeclaration), visitIndexMemberDeclaration = js.Any.fromFunction1(visitIndexMemberDeclaration), visitIndexSignature = js.Any.fromFunction1(visitIndexSignature), visitInterfaceDeclaration = js.Any.fromFunction1(visitInterfaceDeclaration), visitInvocationExpression = js.Any.fromFunction1(visitInvocationExpression), visitLabeledStatement = js.Any.fromFunction1(visitLabeledStatement), visitList = js.Any.fromFunction1(visitList), visitMemberAccessExpression = js.Any.fromFunction1(visitMemberAccessExpression), visitMemberFunctionDeclaration = js.Any.fromFunction1(visitMemberFunctionDeclaration), visitMemberVariableDeclaration = js.Any.fromFunction1(visitMemberVariableDeclaration), visitMethodSignature = js.Any.fromFunction1(visitMethodSignature), visitModuleDeclaration = js.Any.fromFunction1(visitModuleDeclaration), visitModuleNameModuleReference = js.Any.fromFunction1(visitModuleNameModuleReference), visitNode = js.Any.fromFunction1(visitNode), visitNodeOrToken = js.Any.fromFunction1(visitNodeOrToken), visitObjectCreationExpression = js.Any.fromFunction1(visitObjectCreationExpression), visitObjectLiteralExpression = js.Any.fromFunction1(visitObjectLiteralExpression), visitObjectType = js.Any.fromFunction1(visitObjectType), visitOmittedExpression = js.Any.fromFunction1(visitOmittedExpression), visitParameter = js.Any.fromFunction1(visitParameter), visitParameterList = js.Any.fromFunction1(visitParameterList), visitParenthesizedArrowFunctionExpression = js.Any.fromFunction1(visitParenthesizedArrowFunctionExpression), visitParenthesizedExpression = js.Any.fromFunction1(visitParenthesizedExpression), visitPostfixUnaryExpression = js.Any.fromFunction1(visitPostfixUnaryExpression), visitPrefixUnaryExpression = js.Any.fromFunction1(visitPrefixUnaryExpression), visitPropertySignature = js.Any.fromFunction1(visitPropertySignature), visitQualifiedName = js.Any.fromFunction1(visitQualifiedName), visitReturnStatement = js.Any.fromFunction1(visitReturnStatement), visitSeparatedList = js.Any.fromFunction1(visitSeparatedList), visitSetAccessor = js.Any.fromFunction1(visitSetAccessor), visitSimpleArrowFunctionExpression = js.Any.fromFunction1(visitSimpleArrowFunctionExpression), visitSimplePropertyAssignment = js.Any.fromFunction1(visitSimplePropertyAssignment), visitSourceUnit = js.Any.fromFunction1(visitSourceUnit), visitSwitchStatement = js.Any.fromFunction1(visitSwitchStatement), visitThrowStatement = js.Any.fromFunction1(visitThrowStatement), visitToken = js.Any.fromFunction1(visitToken), visitTryStatement = js.Any.fromFunction1(visitTryStatement), visitTypeAnnotation = js.Any.fromFunction1(visitTypeAnnotation), visitTypeArgumentList = js.Any.fromFunction1(visitTypeArgumentList), visitTypeOfExpression = js.Any.fromFunction1(visitTypeOfExpression), visitTypeParameter = js.Any.fromFunction1(visitTypeParameter), visitTypeParameterList = js.Any.fromFunction1(visitTypeParameterList), visitTypeQuery = js.Any.fromFunction1(visitTypeQuery), visitVariableDeclaration = js.Any.fromFunction1(visitVariableDeclaration), visitVariableDeclarator = js.Any.fromFunction1(visitVariableDeclarator), visitVariableStatement = js.Any.fromFunction1(visitVariableStatement), visitVoidExpression = js.Any.fromFunction1(visitVoidExpression), visitWhileStatement = js.Any.fromFunction1(visitWhileStatement), visitWithStatement = js.Any.fromFunction1(visitWithStatement))
    __obj.asInstanceOf[SyntaxDedenter]
  }
  
  @scala.inline
  implicit class SyntaxDedenterOps[Self <: SyntaxDedenter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbort(value: () => js.Any): Self = this.set("abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDedentMultiLineComment(value: js.Any => js.Any): Self = this.set("dedentMultiLineComment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDedentSegment(value: (js.Any, js.Any) => js.Any): Self = this.set("dedentSegment", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDedentTriviaList(value: js.Any => js.Any): Self = this.set("dedentTriviaList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDedentWhitespace(value: (js.Any, js.Any) => js.Any): Self = this.set("dedentWhitespace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDedentationAmount(value: js.Any): Self = this.set("dedentationAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAborted(value: () => js.Any): Self = this.set("isAborted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLastTriviaWasNewLine(value: js.Any): Self = this.set("lastTriviaWasNewLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumIndent(value: js.Any): Self = this.set("minimumIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
