package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.messageHeaderMod.MessageHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MessageHeader {
  @JSImport("semantic-ui-react/dist/commonjs/collections/Message/MessageHeader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: MessageHeaderProps): SharedBuilder_MessageHeaderProps325359624 = new SharedBuilder_MessageHeaderProps325359624(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MessageHeader.type): SharedBuilder_MessageHeaderProps325359624 = new SharedBuilder_MessageHeaderProps325359624(js.Array(this.component, js.Dictionary.empty))()
}

