package typingsSlinky.tslint

import typingsSlinky.typescript.typescriptMod.AccessorDeclaration
import typingsSlinky.typescript.typescriptMod.ArrayLiteralExpression
import typingsSlinky.typescript.typescriptMod.ArrayTypeNode
import typingsSlinky.typescript.typescriptMod.ArrowFunction
import typingsSlinky.typescript.typescriptMod.BinaryExpression
import typingsSlinky.typescript.typescriptMod.BindingElement
import typingsSlinky.typescript.typescriptMod.BindingPattern
import typingsSlinky.typescript.typescriptMod.Block
import typingsSlinky.typescript.typescriptMod.BreakOrContinueStatement
import typingsSlinky.typescript.typescriptMod.CallExpression
import typingsSlinky.typescript.typescriptMod.CaseClause
import typingsSlinky.typescript.typescriptMod.CatchClause
import typingsSlinky.typescript.typescriptMod.ClassDeclaration
import typingsSlinky.typescript.typescriptMod.ClassExpression
import typingsSlinky.typescript.typescriptMod.ConditionalExpression
import typingsSlinky.typescript.typescriptMod.ConstructSignatureDeclaration
import typingsSlinky.typescript.typescriptMod.ConstructorDeclaration
import typingsSlinky.typescript.typescriptMod.DefaultClause
import typingsSlinky.typescript.typescriptMod.DoStatement
import typingsSlinky.typescript.typescriptMod.ElementAccessExpression
import typingsSlinky.typescript.typescriptMod.EnumDeclaration
import typingsSlinky.typescript.typescriptMod.EnumMember
import typingsSlinky.typescript.typescriptMod.ExportAssignment
import typingsSlinky.typescript.typescriptMod.ExpressionStatement
import typingsSlinky.typescript.typescriptMod.ForInStatement
import typingsSlinky.typescript.typescriptMod.ForOfStatement
import typingsSlinky.typescript.typescriptMod.ForStatement
import typingsSlinky.typescript.typescriptMod.FunctionDeclaration
import typingsSlinky.typescript.typescriptMod.FunctionExpression
import typingsSlinky.typescript.typescriptMod.FunctionOrConstructorTypeNode
import typingsSlinky.typescript.typescriptMod.Identifier
import typingsSlinky.typescript.typescriptMod.IfStatement
import typingsSlinky.typescript.typescriptMod.ImportDeclaration
import typingsSlinky.typescript.typescriptMod.ImportEqualsDeclaration
import typingsSlinky.typescript.typescriptMod.IndexSignatureDeclaration
import typingsSlinky.typescript.typescriptMod.InterfaceDeclaration
import typingsSlinky.typescript.typescriptMod.JsxAttribute
import typingsSlinky.typescript.typescriptMod.JsxElement
import typingsSlinky.typescript.typescriptMod.JsxExpression
import typingsSlinky.typescript.typescriptMod.JsxSelfClosingElement
import typingsSlinky.typescript.typescriptMod.JsxSpreadAttribute
import typingsSlinky.typescript.typescriptMod.LabeledStatement
import typingsSlinky.typescript.typescriptMod.MethodDeclaration
import typingsSlinky.typescript.typescriptMod.ModuleDeclaration
import typingsSlinky.typescript.typescriptMod.NamedImports
import typingsSlinky.typescript.typescriptMod.NamespaceImport
import typingsSlinky.typescript.typescriptMod.NewExpression
import typingsSlinky.typescript.typescriptMod.Node
import typingsSlinky.typescript.typescriptMod.NonNullExpression
import typingsSlinky.typescript.typescriptMod.NumericLiteral
import typingsSlinky.typescript.typescriptMod.ObjectLiteralExpression
import typingsSlinky.typescript.typescriptMod.ParameterDeclaration
import typingsSlinky.typescript.typescriptMod.PostfixUnaryExpression
import typingsSlinky.typescript.typescriptMod.PrefixUnaryExpression
import typingsSlinky.typescript.typescriptMod.PropertyAccessExpression
import typingsSlinky.typescript.typescriptMod.PropertyAssignment
import typingsSlinky.typescript.typescriptMod.PropertyDeclaration
import typingsSlinky.typescript.typescriptMod.ReturnStatement
import typingsSlinky.typescript.typescriptMod.SignatureDeclaration
import typingsSlinky.typescript.typescriptMod.SourceFile
import typingsSlinky.typescript.typescriptMod.Statement
import typingsSlinky.typescript.typescriptMod.StringLiteral
import typingsSlinky.typescript.typescriptMod.SwitchStatement
import typingsSlinky.typescript.typescriptMod.TemplateExpression
import typingsSlinky.typescript.typescriptMod.ThrowStatement
import typingsSlinky.typescript.typescriptMod.TryStatement
import typingsSlinky.typescript.typescriptMod.TupleTypeNode
import typingsSlinky.typescript.typescriptMod.TypeAliasDeclaration
import typingsSlinky.typescript.typescriptMod.TypeAssertion
import typingsSlinky.typescript.typescriptMod.TypeLiteralNode
import typingsSlinky.typescript.typescriptMod.TypeReferenceNode
import typingsSlinky.typescript.typescriptMod.VariableDeclaration
import typingsSlinky.typescript.typescriptMod.VariableDeclarationList
import typingsSlinky.typescript.typescriptMod.VariableStatement
import typingsSlinky.typescript.typescriptMod.WhileStatement
import typingsSlinky.typescript.typescriptMod.WithStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker/syntaxWalker", JSImport.Namespace)
@js.native
object libLanguageWalkerSyntaxWalkerMod extends js.Object {
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

