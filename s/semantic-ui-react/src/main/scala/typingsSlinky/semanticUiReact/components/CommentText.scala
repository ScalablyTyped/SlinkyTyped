package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.commentTextMod.CommentTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CommentText {
  @JSImport("semantic-ui-react", "CommentText")
  @js.native
  object component extends js.Object
  
  def withProps(p: CommentTextProps): SharedBuilder_CommentTextProps_1587354396 = new SharedBuilder_CommentTextProps_1587354396(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CommentText.type): SharedBuilder_CommentTextProps_1587354396 = new SharedBuilder_CommentTextProps_1587354396(js.Array(this.component, js.Dictionary.empty))()
}

