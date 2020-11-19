package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.Parameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined typescript.typescript.ParameterDeclaration & {  parent :typescript.typescript.ConstructorDeclaration,   name :typescript.typescript.Identifier} */
@js.native
trait ParameterPropertyDeclaration extends js.Object {
  
  var _declarationBrand: js.Any = js.native
  
  var decorators: js.UndefOr[NodeArray[Decorator]] = js.native
  
  var dotDotDotToken: js.UndefOr[DotDotDotToken] = js.native
  
  var end: Double = js.native
  
  var flags: NodeFlags = js.native
  
  def forEachChild[T](cbNode: js.Function1[/* node */ Node, js.UndefOr[T]]): js.UndefOr[T] = js.native
  def forEachChild[T](
    cbNode: js.Function1[/* node */ Node, js.UndefOr[T]],
    cbNodeArray: js.Function1[/* nodes */ NodeArray[Node], js.UndefOr[T]]
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
  
  def getFullText(): java.lang.String = js.native
  def getFullText(sourceFile: SourceFile): java.lang.String = js.native
  
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
  
  def getText(): java.lang.String = js.native
  def getText(sourceFile: SourceFile): java.lang.String = js.native
  
  def getWidth(): Double = js.native
  def getWidth(sourceFile: SourceFileLike): Double = js.native
  
  var initializer: js.UndefOr[Expression] = js.native
  
  var kind: Parameter = js.native
  
  var modifiers: js.UndefOr[ModifiersArray] = js.native
  
  var name: BindingName with Identifier = js.native
  
  var parent: SignatureDeclaration with ConstructorDeclaration = js.native
  
  var pos: Double = js.native
  
  var questionToken: js.UndefOr[QuestionToken] = js.native
  
  var `type`: js.UndefOr[TypeNode] = js.native
}
