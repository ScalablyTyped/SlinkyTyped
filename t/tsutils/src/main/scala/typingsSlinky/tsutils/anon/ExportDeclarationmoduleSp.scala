package typingsSlinky.tsutils.anon

import typingsSlinky.tsutils.utilUtilMod._ImportLike
import typingsSlinky.typescript.mod.Decorator
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.ModifiersArray
import typingsSlinky.typescript.mod.ModuleBlock
import typingsSlinky.typescript.mod.NamedExportBindings
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.NodeArray
import typingsSlinky.typescript.mod.NodeFlags
import typingsSlinky.typescript.mod.NumericLiteral
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.SourceFileLike
import typingsSlinky.typescript.mod.StringLiteral
import typingsSlinky.typescript.mod.SyntaxKind.ExportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined typescript.typescript.ExportDeclaration & {  moduleSpecifier :{}} */
@js.native
trait ExportDeclarationmoduleSp extends _ImportLike {
  
  var _declarationBrand: js.Any = js.native
  
  var _statementBrand: js.Any = js.native
  
  var decorators: js.UndefOr[NodeArray[Decorator]] = js.native
  
  var end: Double = js.native
  
  /** Will not be assigned in the case of `export * from "foo";` */
  var exportClause: js.UndefOr[NamedExportBindings] = js.native
  
  var flags: NodeFlags = js.native
  
  def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
  def forEachChild[T](
    cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
    cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
  ): js.UndefOr[T] = js.native
  
  def getChildAt(index: Double): Node = js.native
  def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
  
  def getChildCount(): Double = js.native
  def getChildCount(sourceFile: SourceFile): Double = js.native
  
  def getChildren(): js.Array[Node] = js.native
  def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
  
  def getEnd(): Double = js.native
  
  def getFirstToken(): js.UndefOr[Node] = js.native
  def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
  
  def getFullStart(): Double = js.native
  
  def getFullText(): String = js.native
  def getFullText(sourceFile: SourceFile): String = js.native
  
  def getFullWidth(): Double = js.native
  
  def getLastToken(): js.UndefOr[Node] = js.native
  def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
  
  def getLeadingTriviaWidth(): Double = js.native
  def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
  
  def getSourceFile(): SourceFile = js.native
  
  def getStart(): Double = js.native
  def getStart(sourceFile: js.UndefOr[scala.Nothing], includeJsDocComment: Boolean): Double = js.native
  def getStart(sourceFile: SourceFile): Double = js.native
  def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
  
  def getText(): String = js.native
  def getText(sourceFile: SourceFile): String = js.native
  
  def getWidth(): Double = js.native
  def getWidth(sourceFile: SourceFileLike): Double = js.native
  
  var isTypeOnly: Boolean = js.native
  
  var kind: ExportDeclaration = js.native
  
  var modifiers: js.UndefOr[ModifiersArray] = js.native
  
  /** If this is not a StringLiteral it will be a grammar error. */
  var moduleSpecifier: js.UndefOr[Expression] with js.Object = js.native
  
  var name: js.UndefOr[Identifier | StringLiteral | NumericLiteral] = js.native
  
  var parent: SourceFile | ModuleBlock = js.native
  
  var pos: Double = js.native
}
