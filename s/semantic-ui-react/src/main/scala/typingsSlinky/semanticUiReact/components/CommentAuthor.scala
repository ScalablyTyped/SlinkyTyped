package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.commentAuthorMod.CommentAuthorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CommentAuthor {
  @JSImport("semantic-ui-react/dist/commonjs/views/Comment/CommentAuthor", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: CommentAuthorProps): SharedBuilder_CommentAuthorProps86975002 = new SharedBuilder_CommentAuthorProps86975002(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CommentAuthor.type): SharedBuilder_CommentAuthorProps86975002 = new SharedBuilder_CommentAuthorProps86975002(js.Array(this.component, js.Dictionary.empty))()
}

