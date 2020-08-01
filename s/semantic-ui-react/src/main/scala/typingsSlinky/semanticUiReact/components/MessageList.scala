package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.messageListMod.MessageListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MessageList {
  @JSImport("semantic-ui-react/dist/commonjs/collections/Message/MessageList", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: MessageListProps): SharedBuilder_MessageListProps1781517395 = new SharedBuilder_MessageListProps1781517395(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MessageList.type): SharedBuilder_MessageListProps1781517395 = new SharedBuilder_MessageListProps1781517395(js.Array(this.component, js.Dictionary.empty))()
}

