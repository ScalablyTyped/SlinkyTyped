package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.messageContentMod.MessageContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MessageContent {
  @JSImport("semantic-ui-react", "MessageContent")
  @js.native
  object component extends js.Object
  
  def withProps(p: MessageContentProps): SharedBuilder_MessageContentProps596902138 = new SharedBuilder_MessageContentProps596902138(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MessageContent.type): SharedBuilder_MessageContentProps596902138 = new SharedBuilder_MessageContentProps596902138(js.Array(this.component, js.Dictionary.empty))()
}

