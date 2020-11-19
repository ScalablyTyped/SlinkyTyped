package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.commentAvatarMod.CommentAvatarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CommentAvatar {
  
  @JSImport("semantic-ui-react", "CommentAvatar")
  @js.native
  object component extends js.Object
  
  def withProps(p: CommentAvatarProps): SharedBuilder_CommentAvatarProps1848801338 = new SharedBuilder_CommentAvatarProps1848801338(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: CommentAvatar.type): SharedBuilder_CommentAvatarProps1848801338 = new SharedBuilder_CommentAvatarProps1848801338(js.Array(this.component, js.Dictionary.empty))()
}
