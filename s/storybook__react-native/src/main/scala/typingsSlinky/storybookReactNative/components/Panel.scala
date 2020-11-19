package typingsSlinky.storybookReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookReactNative.panelMod.Props
import typingsSlinky.storybookReactNative.panelMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Panel {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/panel", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(style: js.Array[_]): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
