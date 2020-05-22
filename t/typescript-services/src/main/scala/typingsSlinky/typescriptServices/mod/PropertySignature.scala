package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.IASTToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PropertySignature")
@js.native
class PropertySignature protected ()
  extends typingsSlinky.typescriptServices.TypeScript.PropertySignature {
  def this(
    propertyName: IASTToken,
    questionToken: typingsSlinky.typescriptServices.TypeScript.ASTSpan,
    typeAnnotation: typingsSlinky.typescriptServices.TypeScript.TypeAnnotation
  ) = this()
  /* CompleteClass */
  override var _astID: js.Any = js.native
  /* CompleteClass */
  override var _end: Double = js.native
  /* CompleteClass */
  override var _postComments: js.Any = js.native
  /* CompleteClass */
  override var _preComments: js.Any = js.native
  /* CompleteClass */
  override var _start: Double = js.native
  /* CompleteClass */
  override var _trailingTriviaWidth: Double = js.native
  /* CompleteClass */
  override var parent: typingsSlinky.typescriptServices.TypeScript.AST = js.native
  /* CompleteClass */
  override var propertyName: IASTToken = js.native
  /* CompleteClass */
  override var questionToken: typingsSlinky.typescriptServices.TypeScript.ASTSpan = js.native
  /* CompleteClass */
  override var typeAnnotation: typingsSlinky.typescriptServices.TypeScript.TypeAnnotation = js.native
  /* CompleteClass */
  override def end(): Double = js.native
  /* CompleteClass */
  override def fileName(): String = js.native
  /* CompleteClass */
  override def isExpression(): Boolean = js.native
  /* CompleteClass */
  override def kind(): typingsSlinky.typescriptServices.TypeScript.SyntaxKind = js.native
  /* CompleteClass */
  override def postComments(): js.Array[typingsSlinky.typescriptServices.TypeScript.Comment] = js.native
  /* CompleteClass */
  override def preComments(): js.Array[typingsSlinky.typescriptServices.TypeScript.Comment] = js.native
  /* CompleteClass */
  override def setPostComments(comments: js.Array[typingsSlinky.typescriptServices.TypeScript.Comment]): Unit = js.native
  /* CompleteClass */
  override def setPreComments(comments: js.Array[typingsSlinky.typescriptServices.TypeScript.Comment]): Unit = js.native
  /* CompleteClass */
  override def start(): Double = js.native
  /* CompleteClass */
  override def structuralEquals(ast: typingsSlinky.typescriptServices.TypeScript.AST, includingPosition: Boolean): Boolean = js.native
  /* CompleteClass */
  override def syntaxID(): Double = js.native
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  /* CompleteClass */
  override def width(): Double = js.native
}

