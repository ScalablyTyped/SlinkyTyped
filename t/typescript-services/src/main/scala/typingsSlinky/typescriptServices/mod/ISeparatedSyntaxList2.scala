package typingsSlinky.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ISeparatedSyntaxList2")
@js.native
class ISeparatedSyntaxList2 protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ISeparatedSyntaxList2 {
  def this(
    _fileName: String,
    members: js.Array[typingsSlinky.typescriptServices.TypeScript.AST],
    _separatorCount: Double
  ) = this()
  /* CompleteClass */
  override var _astID: js.Any = js.native
  /* CompleteClass */
  override var _end: Double = js.native
  /* CompleteClass */
  override var _fileName: js.Any = js.native
  /* CompleteClass */
  override var _postComments: js.Any = js.native
  /* CompleteClass */
  override var _preComments: js.Any = js.native
  /* CompleteClass */
  override var _separatorCount: js.Any = js.native
  /* CompleteClass */
  override var _start: Double = js.native
  /* CompleteClass */
  override var _trailingTriviaWidth: Double = js.native
  /* CompleteClass */
  override var members: js.Any = js.native
  /* CompleteClass */
  override var parent: typingsSlinky.typescriptServices.TypeScript.AST = js.native
  /* CompleteClass */
  override def end(): Double = js.native
  /* CompleteClass */
  override def fileName(): String = js.native
  /* CompleteClass */
  override def isExpression(): Boolean = js.native
  /* CompleteClass */
  override def kind(): typingsSlinky.typescriptServices.TypeScript.SyntaxKind = js.native
  /* CompleteClass */
  override def nonSeparatorAt(index: Double): typingsSlinky.typescriptServices.TypeScript.AST = js.native
  /* CompleteClass */
  override def nonSeparatorCount(): Double = js.native
  /* CompleteClass */
  override def nonSeparatorIndexOf(ast: typingsSlinky.typescriptServices.TypeScript.AST): Double = js.native
  /* CompleteClass */
  override def postComments(): js.Array[typingsSlinky.typescriptServices.TypeScript.Comment] = js.native
  /* CompleteClass */
  override def preComments(): js.Array[typingsSlinky.typescriptServices.TypeScript.Comment] = js.native
  /* CompleteClass */
  override def separatorCount(): Double = js.native
  /* CompleteClass */
  override def setPostComments(comments: js.Array[typingsSlinky.typescriptServices.TypeScript.Comment]): Unit = js.native
  /* CompleteClass */
  override def setPreComments(comments: js.Array[typingsSlinky.typescriptServices.TypeScript.Comment]): Unit = js.native
  /* CompleteClass */
  override def start(): Double = js.native
  /* CompleteClass */
  override def structuralEquals(ast: typingsSlinky.typescriptServices.TypeScript.AST, includingPosition: Boolean): Boolean = js.native
  /* CompleteClass */
  override def structuralEquals(ast: typingsSlinky.typescriptServices.TypeScript.ISeparatedSyntaxList2, includingPosition: Boolean): Boolean = js.native
  /* CompleteClass */
  override def syntaxID(): Double = js.native
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  /* CompleteClass */
  override def width(): Double = js.native
}

