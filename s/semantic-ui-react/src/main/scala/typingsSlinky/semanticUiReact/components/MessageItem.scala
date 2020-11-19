package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.messageItemMod.MessageItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MessageItem {
  
  @JSImport("semantic-ui-react", "MessageItem")
  @js.native
  object component extends js.Object
  
  def withProps(p: MessageItemProps): SharedBuilder_MessageItemProps_528637509 = new SharedBuilder_MessageItemProps_528637509(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: MessageItem.type): SharedBuilder_MessageItemProps_528637509 = new SharedBuilder_MessageItemProps_528637509(js.Array(this.component, js.Dictionary.empty))()
}
