package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.commentAuthorMod.CommentAuthorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CommentAuthor {
  
  @JSImport("semantic-ui-react", "CommentAuthor")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CommentAuthor.type): SharedBuilder_CommentAuthorProps86975002 = new SharedBuilder_CommentAuthorProps86975002(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CommentAuthorProps): SharedBuilder_CommentAuthorProps86975002 = new SharedBuilder_CommentAuthorProps86975002(js.Array(this.component, p.asInstanceOf[js.Any]))
}
