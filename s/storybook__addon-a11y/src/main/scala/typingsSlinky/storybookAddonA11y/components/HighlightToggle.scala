package typingsSlinky.storybookAddonA11y.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.axeCore.mod.NodeResult
import typingsSlinky.storybookAddonA11y.highlightToggleMod.ToggleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HighlightToggle {
  
  @scala.inline
  def apply(elementsToHighlight: js.Array[NodeResult]): Builder = {
    val __props = js.Dynamic.literal(elementsToHighlight = elementsToHighlight.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ToggleProps]))
  }
  
  @JSImport("@storybook/addon-a11y/dist/components/Report/HighlightToggle", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def toggleId(value: String): this.type = set("toggleId", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToggleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
