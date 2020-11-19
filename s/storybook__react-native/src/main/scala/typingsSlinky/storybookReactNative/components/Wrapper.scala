package typingsSlinky.storybookReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookAddons.distMod.Collection
import typingsSlinky.storybookReactNative.wrapperMod.Props
import typingsSlinky.storybookReactNative.wrapperMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Wrapper {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons/wrapper", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(addonSelected: String, panels: Collection): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(addonSelected = addonSelected.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
