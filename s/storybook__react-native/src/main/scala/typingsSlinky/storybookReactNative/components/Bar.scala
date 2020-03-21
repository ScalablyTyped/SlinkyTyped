package typingsSlinky.storybookReactNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.storybookReactNative.barMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Bar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/navigation/bar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(index: Double, onPress: Double => Unit, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onPress = js.Any.fromFunction1(onPress))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.storybookReactNative.barMod.Props
}

