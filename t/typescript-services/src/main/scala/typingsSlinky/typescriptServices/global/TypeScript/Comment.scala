package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxTrivia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Comment")
@js.native
class Comment protected ()
  extends typingsSlinky.typescriptServices.TypeScript.Comment {
  def this(_trivia: ISyntaxTrivia, endsLine: Boolean, _start: Double, _end: Double) = this()
  /* CompleteClass */
  override var _end: Double = js.native
  /* CompleteClass */
  override var _start: Double = js.native
  /* CompleteClass */
  override var _trivia: js.Any = js.native
  /* CompleteClass */
  override var endsLine: Boolean = js.native
  /* CompleteClass */
  override def end(): Double = js.native
  /* CompleteClass */
  override def fullText(): String = js.native
  /* CompleteClass */
  override def kind(): typingsSlinky.typescriptServices.TypeScript.SyntaxKind = js.native
  /* CompleteClass */
  override def start(): Double = js.native
  /* CompleteClass */
  override def structuralEquals(ast: typingsSlinky.typescriptServices.TypeScript.Comment, includingPosition: Boolean): Boolean = js.native
}

