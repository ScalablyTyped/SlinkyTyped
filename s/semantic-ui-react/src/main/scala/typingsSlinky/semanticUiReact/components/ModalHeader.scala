package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.modalHeaderMod.ModalHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ModalHeader {
  
  @JSImport("semantic-ui-react", "ModalHeader")
  @js.native
  object component extends js.Object
  
  def withProps(p: ModalHeaderProps): SharedBuilder_ModalHeaderProps557306730 = new SharedBuilder_ModalHeaderProps557306730(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ModalHeader.type): SharedBuilder_ModalHeaderProps557306730 = new SharedBuilder_ModalHeaderProps557306730(js.Array(this.component, js.Dictionary.empty))()
}
