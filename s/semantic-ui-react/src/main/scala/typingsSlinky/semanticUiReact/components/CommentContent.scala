package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.commentContentMod.CommentContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CommentContent {
  @JSImport("semantic-ui-react", "CommentContent")
  @js.native
  object component extends js.Object
  
  def withProps(p: CommentContentProps): SharedBuilder_CommentContentProps_449648905 = new SharedBuilder_CommentContentProps_449648905(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CommentContent.type): SharedBuilder_CommentContentProps_449648905 = new SharedBuilder_CommentContentProps_449648905(js.Array(this.component, js.Dictionary.empty))()
}

