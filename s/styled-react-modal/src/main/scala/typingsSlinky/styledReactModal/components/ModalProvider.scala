package typingsSlinky.styledReactModal.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.styledComponents.styledComponentsMod.AnyStyledComponent
import typingsSlinky.styledReactModal.mod.ModalProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ModalProvider {
  
  @JSImport("styled-react-modal", "ModalProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.styledReactModal.mod.ModalProvider] {
    
    @scala.inline
    def backgroundComponent(value: AnyStyledComponent): this.type = set("backgroundComponent", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ModalProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ModalProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
