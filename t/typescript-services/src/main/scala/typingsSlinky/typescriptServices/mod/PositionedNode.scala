package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxElement
import typingsSlinky.typescriptServices.TypeScript.ISyntaxNodeOrToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PositionedNode")
@js.native
class PositionedNode protected ()
  extends typingsSlinky.typescriptServices.TypeScript.PositionedNode {
  def this(
    parent: typingsSlinky.typescriptServices.TypeScript.PositionedElement,
    node: typingsSlinky.typescriptServices.TypeScript.SyntaxNode,
    fullStart: Double
  ) = this()
  /* CompleteClass */
  override var _element: js.Any = js.native
  /* CompleteClass */
  override var _fullStart: js.Any = js.native
  /* CompleteClass */
  override var _parent: js.Any = js.native
  /* CompleteClass */
  override def childAt(index: Double): typingsSlinky.typescriptServices.TypeScript.PositionedElement = js.native
  /* CompleteClass */
  override def childCount(): Double = js.native
  /* CompleteClass */
  override def childEnd(child: ISyntaxElement): Double = js.native
  /* CompleteClass */
  override def childEndAt(index: Double): Double = js.native
  /* CompleteClass */
  override def childIndex(child: ISyntaxElement): Double = js.native
  /* CompleteClass */
  override def childStart(child: ISyntaxElement): Double = js.native
  /* CompleteClass */
  override def childStartAt(index: Double): Double = js.native
  /* CompleteClass */
  override def containingNode(): typingsSlinky.typescriptServices.TypeScript.PositionedNode = js.native
  /* CompleteClass */
  override def element(): ISyntaxElement = js.native
  /* CompleteClass */
  override def end(): Double = js.native
  /* CompleteClass */
  override def fullEnd(): Double = js.native
  /* CompleteClass */
  override def fullStart(): Double = js.native
  /* CompleteClass */
  override def fullWidth(): Double = js.native
  /* CompleteClass */
  override def getPositionedChild(child: ISyntaxElement): typingsSlinky.typescriptServices.TypeScript.PositionedElement = js.native
  /* CompleteClass */
  override def kind(): typingsSlinky.typescriptServices.TypeScript.SyntaxKind = js.native
  /* CompleteClass */
  override def node(): typingsSlinky.typescriptServices.TypeScript.SyntaxNode = js.native
  /* CompleteClass */
  override def nodeOrToken(): ISyntaxNodeOrToken = js.native
  /* CompleteClass */
  override def parent(): typingsSlinky.typescriptServices.TypeScript.PositionedElement = js.native
  /* CompleteClass */
  override def parentElement(): ISyntaxElement = js.native
  /* CompleteClass */
  override def root(): typingsSlinky.typescriptServices.TypeScript.PositionedNode = js.native
  /* CompleteClass */
  override def start(): Double = js.native
}

