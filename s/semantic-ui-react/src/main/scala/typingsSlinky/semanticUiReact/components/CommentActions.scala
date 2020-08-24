package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.commentActionsMod.CommentActionsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CommentActions {
  @JSImport("semantic-ui-react", "CommentActions")
  @js.native
  object component extends js.Object
  
  def withProps(p: CommentActionsProps): SharedBuilder_CommentActionsProps_2089688949 = new SharedBuilder_CommentActionsProps_2089688949(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CommentActions.type): SharedBuilder_CommentActionsProps_2089688949 = new SharedBuilder_CommentActionsProps_2089688949(js.Array(this.component, js.Dictionary.empty))()
}

