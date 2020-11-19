package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.modalDescriptionMod.ModalDescriptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ModalDescription {
  
  @JSImport("semantic-ui-react", "ModalDescription")
  @js.native
  object component extends js.Object
  
  def withProps(p: ModalDescriptionProps): SharedBuilder_ModalDescriptionProps155144246 = new SharedBuilder_ModalDescriptionProps155144246(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ModalDescription.type): SharedBuilder_ModalDescriptionProps155144246 = new SharedBuilder_ModalDescriptionProps155144246(js.Array(this.component, js.Dictionary.empty))()
}
