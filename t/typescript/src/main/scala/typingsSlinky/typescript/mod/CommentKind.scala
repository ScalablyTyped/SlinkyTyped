package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.MultiLineCommentTrivia
import typingsSlinky.typescript.mod.SyntaxKind.SingleLineCommentTrivia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.SyntaxKind.SingleLineCommentTrivia
  - typingsSlinky.typescript.mod.SyntaxKind.MultiLineCommentTrivia
*/
trait CommentKind extends js.Object

object CommentKind {
  @scala.inline
  implicit def apply(value: MultiLineCommentTrivia): CommentKind = value.asInstanceOf[CommentKind]
  @scala.inline
  implicit def apply(value: SingleLineCommentTrivia): CommentKind = value.asInstanceOf[CommentKind]
}

