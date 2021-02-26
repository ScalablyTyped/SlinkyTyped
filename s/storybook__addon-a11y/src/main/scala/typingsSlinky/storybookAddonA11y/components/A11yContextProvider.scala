package typingsSlinky.storybookAddonA11y.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddonA11y.a11yContextMod.A11yContextProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object A11yContextProvider {
  
  @scala.inline
  def apply(active: Boolean): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[A11yContextProviderProps]))
  }
  
  @JSImport("@storybook/addon-a11y/dist/components/A11yContext", "A11yContextProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: A11yContextProviderProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
