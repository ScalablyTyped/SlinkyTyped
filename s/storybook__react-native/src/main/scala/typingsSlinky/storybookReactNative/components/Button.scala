package typingsSlinky.storybookReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookReactNative.buttonMod.Props
import typingsSlinky.storybookReactNative.buttonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/navigation/button", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(active: Boolean, id: Double | String, onPress: Double | String => Unit): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onPress = js.Any.fromFunction1(onPress))
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

