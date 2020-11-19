package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.modalContentMod.ModalContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ModalContent {
  
  @JSImport("semantic-ui-react", "ModalContent")
  @js.native
  object component extends js.Object
  
  def withProps(p: ModalContentProps): SharedBuilder_ModalContentProps2067565862 = new SharedBuilder_ModalContentProps2067565862(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ModalContent.type): SharedBuilder_ModalContentProps2067565862 = new SharedBuilder_ModalContentProps2067565862(js.Array(this.component, js.Dictionary.empty))()
}
