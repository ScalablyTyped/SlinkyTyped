package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.messageListMod.MessageListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MessageList {
  
  @JSImport("semantic-ui-react", "MessageList")
  @js.native
  object component extends js.Object
  
  def withProps(p: MessageListProps): SharedBuilder_MessageListProps1781517395 = new SharedBuilder_MessageListProps1781517395(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: MessageList.type): SharedBuilder_MessageListProps1781517395 = new SharedBuilder_MessageListProps1781517395(js.Array(this.component, js.Dictionary.empty))()
}
