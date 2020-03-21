package typingsSlinky.tslint

import typingsSlinky.typescript.mod.AccessorDeclaration
import typingsSlinky.typescript.mod.ArrayLiteralExpression
import typingsSlinky.typescript.mod.ArrayTypeNode
import typingsSlinky.typescript.mod.ArrowFunction
import typingsSlinky.typescript.mod.BinaryExpression
import typingsSlinky.typescript.mod.BindingElement
import typingsSlinky.typescript.mod.BindingPattern
import typingsSlinky.typescript.mod.Block
import typingsSlinky.typescript.mod.BreakOrContinueStatement
import typingsSlinky.typescript.mod.CallExpression
import typingsSlinky.typescript.mod.CaseClause
import typingsSlinky.typescript.mod.CatchClause
import typingsSlinky.typescript.mod.ClassDeclaration
import typingsSlinky.typescript.mod.ClassExpression
import typingsSlinky.typescript.mod.ConditionalExpression
import typingsSlinky.typescript.mod.ConstructSignatureDeclaration
import typingsSlinky.typescript.mod.ConstructorDeclaration
import typingsSlinky.typescript.mod.DefaultClause
import typingsSlinky.typescript.mod.DoStatement
import typingsSlinky.typescript.mod.ElementAccessExpression
import typingsSlinky.typescript.mod.EnumDeclaration
import typingsSlinky.typescript.mod.EnumMember
import typingsSlinky.typescript.mod.ExportAssignment
import typingsSlinky.typescript.mod.ExpressionStatement
import typingsSlinky.typescript.mod.ForInStatement
import typingsSlinky.typescript.mod.ForOfStatement
import typingsSlinky.typescript.mod.ForStatement
import typingsSlinky.typescript.mod.FunctionDeclaration
import typingsSlinky.typescript.mod.FunctionExpression
import typingsSlinky.typescript.mod.FunctionOrConstructorTypeNode
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.IfStatement
import typingsSlinky.typescript.mod.ImportDeclaration
import typingsSlinky.typescript.mod.ImportEqualsDeclaration
import typingsSlinky.typescript.mod.IndexSignatureDeclaration
import typingsSlinky.typescript.mod.InterfaceDeclaration
import typingsSlinky.typescript.mod.JsxAttribute
import typingsSlinky.typescript.mod.JsxElement
import typingsSlinky.typescript.mod.JsxExpression
import typingsSlinky.typescript.mod.JsxSelfClosingElement
import typingsSlinky.typescript.mod.JsxSpreadAttribute
import typingsSlinky.typescript.mod.LabeledStatement
import typingsSlinky.typescript.mod.MethodDeclaration
import typingsSlinky.typescript.mod.ModuleDeclaration
import typingsSlinky.typescript.mod.NamedImports
import typingsSlinky.typescript.mod.NamespaceImport
import typingsSlinky.typescript.mod.NewExpression
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.NonNullExpression
import typingsSlinky.typescript.mod.NumericLiteral
import typingsSlinky.typescript.mod.ObjectLiteralExpression
import typingsSlinky.typescript.mod.ParameterDeclaration
import typingsSlinky.typescript.mod.PostfixUnaryExpression
import typingsSlinky.typescript.mod.PrefixUnaryExpression
import typingsSlinky.typescript.mod.PropertyAccessExpression
import typingsSlinky.typescript.mod.PropertyAssignment
import typingsSlinky.typescript.mod.PropertyDeclaration
import typingsSlinky.typescript.mod.ReturnStatement
import typingsSlinky.typescript.mod.SignatureDeclaration
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.Statement
import typingsSlinky.typescript.mod.StringLiteral
import typingsSlinky.typescript.mod.SwitchStatement
import typingsSlinky.typescript.mod.TemplateExpression
import typingsSlinky.typescript.mod.ThrowStatement
import typingsSlinky.typescript.mod.TryStatement
import typingsSlinky.typescript.mod.TupleTypeNode
import typingsSlinky.typescript.mod.TypeAliasDeclaration
import typingsSlinky.typescript.mod.TypeAssertion
import typingsSlinky.typescript.mod.TypeLiteralNode
import typingsSlinky.typescript.mod.TypeReferenceNode
import typingsSlinky.typescript.mod.VariableDeclaration
import typingsSlinky.typescript.mod.VariableDeclarationList
import typingsSlinky.typescript.mod.VariableStatement
import typingsSlinky.typescript.mod.WhileStatement
import typingsSlinky.typescript.mod.WithStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker/syntaxWalker", JSImport.Namespace)
@js.native
object syntaxWalkerMod extends js.Object {
  @js.native
  class SyntaxWalker () extends js.Object {
    /* protected */ def visitAnyKeyword(node: Node): Unit = js.native
    /* protected */ def visitArrayLiteralExpression(node: ArrayLiteralExpression): Unit = js.native
    /* protected */ def visitArrayType(node: ArrayTypeNode): Unit = js.native
    /* protected */ def visitArrowFunction(node: ArrowFunction): Unit = js.native
    /* protected */ def visitBinaryExpression(node: BinaryExpression): Unit = js.native
    /* protected */ def visitBindingElement(node: BindingElement): Unit = js.native
    /* protected */ def visitBindingPattern(node: BindingPattern): Unit = js.native
    /* protected */ def visitBlock(node: Block): Unit = js.native
    /* protected */ def visitBreakStatement(node: BreakOrContinueStatement): Unit = js.native
    /* protected */ def visitCallExpression(node: CallExpression): Unit = js.native
    /* protected */ def visitCallSignature(node: SignatureDeclaration): Unit = js.native
    /* protected */ def visitCaseClause(node: CaseClause): Unit = js.native
    /* protected */ def visitCatchClause(node: CatchClause): Unit = js.native
    /* protected */ def visitClassDeclaration(node: ClassDeclaration): Unit = js.native
    /* protected */ def visitClassExpression(node: ClassExpression): Unit = js.native
    /* protected */ def visitConditionalExpression(node: ConditionalExpression): Unit = js.native
    /* protected */ def visitConstructSignature(node: ConstructSignatureDeclaration): Unit = js.native
    /* protected */ def visitConstructorDeclaration(node: ConstructorDeclaration): Unit = js.native
    /* protected */ def visitConstructorType(node: FunctionOrConstructorTypeNode): Unit = js.native
    /* protected */ def visitContinueStatement(node: BreakOrContinueStatement): Unit = js.native
    /* protected */ def visitDebuggerStatement(node: Statement): Unit = js.native
    /* protected */ def visitDefaultClause(node: DefaultClause): Unit = js.native
    /* protected */ def visitDoStatement(node: DoStatement): Unit = js.native
    /* protected */ def visitElementAccessExpression(node: ElementAccessExpression): Unit = js.native
    /* protected */ def visitEndOfFileToken(node: Node): Unit = js.native
    /* protected */ def visitEnumDeclaration(node: EnumDeclaration): Unit = js.native
    /* protected */ def visitEnumMember(node: EnumMember): Unit = js.native
    /* protected */ def visitExportAssignment(node: ExportAssignment): Unit = js.native
    /* protected */ def visitExpressionStatement(node: ExpressionStatement): Unit = js.native
    /* protected */ def visitForInStatement(node: ForInStatement): Unit = js.native
    /* protected */ def visitForOfStatement(node: ForOfStatement): Unit = js.native
    /* protected */ def visitForStatement(node: ForStatement): Unit = js.native
    /* protected */ def visitFunctionDeclaration(node: FunctionDeclaration): Unit = js.native
    /* protected */ def visitFunctionExpression(node: FunctionExpression): Unit = js.native
    /* protected */ def visitFunctionType(node: FunctionOrConstructorTypeNode): Unit = js.native
    /* protected */ def visitGetAccessor(node: AccessorDeclaration): Unit = js.native
    /* protected */ def visitIdentifier(node: Identifier): Unit = js.native
    /* protected */ def visitIfStatement(node: IfStatement): Unit = js.native
    /* protected */ def visitImportDeclaration(node: ImportDeclaration): Unit = js.native
    /* protected */ def visitImportEqualsDeclaration(node: ImportEqualsDeclaration): Unit = js.native
    /* protected */ def visitIndexSignatureDeclaration(node: IndexSignatureDeclaration): Unit = js.native
    /* protected */ def visitInterfaceDeclaration(node: InterfaceDeclaration): Unit = js.native
    /* protected */ def visitJsxAttribute(node: JsxAttribute): Unit = js.native
    /* protected */ def visitJsxElement(node: JsxElement): Unit = js.native
    /* protected */ def visitJsxExpression(node: JsxExpression): Unit = js.native
    /* protected */ def visitJsxSelfClosingElement(node: JsxSelfClosingElement): Unit = js.native
    /* protected */ def visitJsxSpreadAttribute(node: JsxSpreadAttribute): Unit = js.native
    /* protected */ def visitLabeledStatement(node: LabeledStatement): Unit = js.native
    /* protected */ def visitMethodDeclaration(node: MethodDeclaration): Unit = js.native
    /* protected */ def visitMethodSignature(node: SignatureDeclaration): Unit = js.native
    /* protected */ def visitModuleDeclaration(node: ModuleDeclaration): Unit = js.native
    /* protected */ def visitNamedImports(node: NamedImports): Unit = js.native
    /* protected */ def visitNamespaceImport(node: NamespaceImport): Unit = js.native
    /* protected */ def visitNewExpression(node: NewExpression): Unit = js.native
    /* protected */ def visitNode(node: Node): Unit = js.native
    /* protected */ def visitNonNullExpression(node: NonNullExpression): Unit = js.native
    /* protected */ def visitNumericLiteral(node: NumericLiteral): Unit = js.native
    /* protected */ def visitObjectLiteralExpression(node: ObjectLiteralExpression): Unit = js.native
    /* protected */ def visitParameterDeclaration(node: ParameterDeclaration): Unit = js.native
    /* protected */ def visitPostfixUnaryExpression(node: PostfixUnaryExpression): Unit = js.native
    /* protected */ def visitPrefixUnaryExpression(node: PrefixUnaryExpression): Unit = js.native
    /* protected */ def visitPropertyAccessExpression(node: PropertyAccessExpression): Unit = js.native
    /* protected */ def visitPropertyAssignment(node: PropertyAssignment): Unit = js.native
    /* protected */ def visitPropertyDeclaration(node: PropertyDeclaration): Unit = js.native
    /* protected */ def visitPropertySignature(node: Node): Unit = js.native
    /* protected */ def visitRegularExpressionLiteral(node: Node): Unit = js.native
    /* protected */ def visitReturnStatement(node: ReturnStatement): Unit = js.native
    /* protected */ def visitSetAccessor(node: AccessorDeclaration): Unit = js.native
    /* protected */ def visitSourceFile(node: SourceFile): Unit = js.native
    /* protected */ def visitStringLiteral(node: StringLiteral): Unit = js.native
    /* protected */ def visitSwitchStatement(node: SwitchStatement): Unit = js.native
    /* protected */ def visitTemplateExpression(node: TemplateExpression): Unit = js.native
    /* protected */ def visitThrowStatement(node: ThrowStatement): Unit = js.native
    /* protected */ def visitTryStatement(node: TryStatement): Unit = js.native
    /* protected */ def visitTupleType(node: TupleTypeNode): Unit = js.native
    /* protected */ def visitTypeAliasDeclaration(node: TypeAliasDeclaration): Unit = js.native
    /* protected */ def visitTypeAssertionExpression(node: TypeAssertion): Unit = js.native
    /* protected */ def visitTypeLiteral(node: TypeLiteralNode): Unit = js.native
    /* protected */ def visitTypeReference(node: TypeReferenceNode): Unit = js.native
    /* protected */ def visitVariableDeclaration(node: VariableDeclaration): Unit = js.native
    /* protected */ def visitVariableDeclarationList(node: VariableDeclarationList): Unit = js.native
    /* protected */ def visitVariableStatement(node: VariableStatement): Unit = js.native
    /* protected */ def visitWhileStatement(node: WhileStatement): Unit = js.native
    /* protected */ def visitWithStatement(node: WithStatement): Unit = js.native
    def walk(node: Node): Unit = js.native
    /* protected */ def walkChildren(node: Node): Unit = js.native
  }
  
}

