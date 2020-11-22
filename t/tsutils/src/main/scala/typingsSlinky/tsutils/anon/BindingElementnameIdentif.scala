package typingsSlinky.tsutils.anon

import typingsSlinky.typescript.mod.BindingName
import typingsSlinky.typescript.mod.BindingPattern
import typingsSlinky.typescript.mod.Decorator
import typingsSlinky.typescript.mod.DotDotDotToken
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.ModifiersArray
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.NodeArray
import typingsSlinky.typescript.mod.NodeFlags
import typingsSlinky.typescript.mod.PropertyName
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.SourceFileLike
import typingsSlinky.typescript.mod.SyntaxKind.BindingElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined typescript.typescript.BindingElement & {  name :typescript.typescript.Identifier} */
@js.native
trait BindingElementnameIdentif extends js.Object {
  
  var _declarationBrand: js.Any = js.native
  
  val decorators: js.UndefOr[NodeArray[Decorator]] = js.native
  
  val dotDotDotToken: js.UndefOr[DotDotDotToken] = js.native
  
  val end: Double = js.native
  
  val flags: NodeFlags = js.native
  
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
  
  val initializer: js.UndefOr[Expression] = js.native
  
  val kind: BindingElement = js.native
  
  val modifiers: js.UndefOr[ModifiersArray] = js.native
  
  val name: BindingName with Identifier = js.native
  
  val parent: BindingPattern = js.native
  
  val pos: Double = js.native
  
  val propertyName: js.UndefOr[PropertyName] = js.native
}
