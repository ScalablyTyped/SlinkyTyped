package typingsSlinky.typescriptServices.global.TypeScript.Services

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
import typingsSlinky.typescriptServices.TypeScript.ISyntaxElement
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.OutliningElementsCollector")
@js.native
class OutliningElementsCollector ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.OutliningElementsCollector {
  /* CompleteClass */
  override var _depth: js.Any = js.native
  /* CompleteClass */
  override var _maximumDepth: js.Any = js.native
  /* CompleteClass */
  override var _position: js.Any = js.native
  /* CompleteClass */
  override var elements: js.Any = js.native
  /* CompleteClass */
  override var inObjectLiteralExpression: js.Any = js.native
  /* CompleteClass */
  /* private */ override def addOutlineRange(node: js.Any, startElement: js.Any, endElement: js.Any): js.Any = js.native
  /* CompleteClass */
  override def position(): Double = js.native
  /* CompleteClass */
  override def skip(element: ISyntaxElement): Unit = js.native
  /* CompleteClass */
  override def visitArgumentList(node: ArgumentListSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitArrayLiteralExpression(node: ArrayLiteralExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitArrayType(node: ArrayTypeSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitBinaryExpression(node: BinaryExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitBlock(node: BlockSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitBreakStatement(node: BreakStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitCallSignature(node: CallSignatureSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitCaseSwitchClause(node: CaseSwitchClauseSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitCastExpression(node: CastExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitCatchClause(node: CatchClauseSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitClassDeclaration(node: ClassDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitConditionalExpression(node: ConditionalExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitConstraint(node: ConstraintSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitConstructSignature(node: ConstructSignatureSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitConstructorDeclaration(node: ConstructorDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitConstructorType(node: ConstructorTypeSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitContinueStatement(node: ContinueStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitDebuggerStatement(node: DebuggerStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitDefaultSwitchClause(node: DefaultSwitchClauseSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitDeleteExpression(node: DeleteExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitDoStatement(node: DoStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitElementAccessExpression(node: ElementAccessExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitElseClause(node: ElseClauseSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitEmptyStatement(node: EmptyStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitEnumDeclaration(node: EnumDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitEnumElement(node: EnumElementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitEqualsValueClause(node: EqualsValueClauseSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitExportAssignment(node: ExportAssignmentSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitExpressionStatement(node: ExpressionStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitExternalModuleReference(node: ExternalModuleReferenceSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitFinallyClause(node: FinallyClauseSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitForInStatement(node: ForInStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitForStatement(node: ForStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitFunctionDeclaration(node: FunctionDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitFunctionExpression(node: FunctionExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitFunctionPropertyAssignment(node: FunctionPropertyAssignmentSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitFunctionType(node: FunctionTypeSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitGenericType(node: GenericTypeSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitGetAccessor(node: GetAccessorSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitHeritageClause(node: HeritageClauseSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitIfStatement(node: IfStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitImportDeclaration(node: ImportDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitIndexMemberDeclaration(node: IndexMemberDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitIndexSignature(node: IndexSignatureSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitInterfaceDeclaration(node: InterfaceDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitInvocationExpression(node: InvocationExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitLabeledStatement(node: LabeledStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitList(list: ISyntaxList): Unit = js.native
  /* CompleteClass */
  override def visitMemberAccessExpression(node: MemberAccessExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitMemberFunctionDeclaration(node: MemberFunctionDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitMemberVariableDeclaration(node: MemberVariableDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitMethodSignature(node: MethodSignatureSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitModuleDeclaration(node: ModuleDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitModuleNameModuleReference(node: ModuleNameModuleReferenceSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitNode(node: SyntaxNode): Unit = js.native
  /* CompleteClass */
  override def visitNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
  /* CompleteClass */
  override def visitObjectCreationExpression(node: ObjectCreationExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitObjectLiteralExpression(node: ObjectLiteralExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitObjectType(node: ObjectTypeSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitOmittedExpression(node: OmittedExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitOptionalNode(node: SyntaxNode): Unit = js.native
  /* CompleteClass */
  override def visitOptionalNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
  /* CompleteClass */
  /* private */ override def visitOptionalToken(token: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitParameter(node: ParameterSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitParameterList(node: ParameterListSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitParenthesizedArrowFunctionExpression(node: ParenthesizedArrowFunctionExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitParenthesizedExpression(node: ParenthesizedExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitPostfixUnaryExpression(node: PostfixUnaryExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitPrefixUnaryExpression(node: PrefixUnaryExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitPropertySignature(node: PropertySignatureSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitQualifiedName(node: QualifiedNameSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitReturnStatement(node: ReturnStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitSeparatedList(list: ISeparatedSyntaxList): Unit = js.native
  /* CompleteClass */
  override def visitSetAccessor(node: SetAccessorSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitSimpleArrowFunctionExpression(node: SimpleArrowFunctionExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitSimplePropertyAssignment(node: SimplePropertyAssignmentSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitSourceUnit(node: SourceUnitSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitSwitchStatement(node: SwitchStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitThrowStatement(node: ThrowStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitToken(token: ISyntaxToken): js.Any = js.native
  /* CompleteClass */
  override def visitTryStatement(node: TryStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitTypeAnnotation(node: TypeAnnotationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitTypeArgumentList(node: TypeArgumentListSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitTypeOfExpression(node: TypeOfExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitTypeParameter(node: TypeParameterSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitTypeParameterList(node: TypeParameterListSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitTypeQuery(node: TypeQuerySyntax): js.Any = js.native
  /* CompleteClass */
  override def visitVariableDeclaration(node: VariableDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitVariableDeclarator(node: VariableDeclaratorSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitVariableStatement(node: VariableStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitVoidExpression(node: VoidExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitWhileStatement(node: WhileStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitWithStatement(node: WithStatementSyntax): js.Any = js.native
}

/* static members */
@JSGlobal("TypeScript.Services.OutliningElementsCollector")
@js.native
object OutliningElementsCollector extends js.Object {
  var MaximumDepth: js.Any = js.native
  def collectElements(node: SourceUnitSyntax): js.Array[TextSpan] = js.native
}

