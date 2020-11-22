package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.modalDimmerMod.ModalDimmerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ModalDimmer {
  
  @JSImport("semantic-ui-react", "ModalDimmer")
  @js.native
  object component extends js.Object
  
  def withProps(p: ModalDimmerProps): SharedBuilder_ModalDimmerProps329564763 = new SharedBuilder_ModalDimmerProps329564763(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ModalDimmer.type): SharedBuilder_ModalDimmerProps329564763 = new SharedBuilder_ModalDimmerProps329564763(js.Array(this.component, js.Dictionary.empty))()
}
