package typingsSlinky.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TextSpan")
@js.native
class TextSpan protected ()
  extends typingsSlinky.typescriptServices.TypeScript.TextSpan {
  def this(start: Double, length: Double) = this()
  /* CompleteClass */
  override var _length: js.Any = js.native
  /* CompleteClass */
  override var _start: js.Any = js.native
  /* CompleteClass */
  override def containsPosition(position: Double): Boolean = js.native
  /* CompleteClass */
  override def containsTextSpan(span: typingsSlinky.typescriptServices.TypeScript.TextSpan): Boolean = js.native
  /* CompleteClass */
  override def end(): Double = js.native
  /* CompleteClass */
  override def intersection(span: typingsSlinky.typescriptServices.TypeScript.TextSpan): typingsSlinky.typescriptServices.TypeScript.TextSpan = js.native
  /* CompleteClass */
  override def intersectsWith(start: Double, length: Double): Boolean = js.native
  /* CompleteClass */
  override def intersectsWithPosition(position: Double): Boolean = js.native
  /* CompleteClass */
  override def intersectsWithTextSpan(span: typingsSlinky.typescriptServices.TypeScript.TextSpan): Boolean = js.native
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  /* CompleteClass */
  override def length(): Double = js.native
  /* CompleteClass */
  override def overlap(span: typingsSlinky.typescriptServices.TypeScript.TextSpan): typingsSlinky.typescriptServices.TypeScript.TextSpan = js.native
  /* CompleteClass */
  override def overlapsWith(span: typingsSlinky.typescriptServices.TypeScript.TextSpan): Boolean = js.native
  /* CompleteClass */
  override def start(): Double = js.native
}

/* static members */
@JSGlobal("TypeScript.TextSpan")
@js.native
object TextSpan extends js.Object {
  def fromBounds(start: Double, end: Double): typingsSlinky.typescriptServices.TypeScript.TextSpan = js.native
}

