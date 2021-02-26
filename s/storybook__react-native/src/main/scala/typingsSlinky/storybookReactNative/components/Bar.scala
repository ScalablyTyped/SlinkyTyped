package typingsSlinky.storybookReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookReactNative.barMod.Props
import typingsSlinky.storybookReactNative.barMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Bar {
  
  @scala.inline
  def apply(index: Double, onPress: Double => Unit): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onPress = js.Any.fromFunction1(onPress))
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/navigation/bar", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
