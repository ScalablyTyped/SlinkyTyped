package typingsSlinky.storybookReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookReactNative.absolutePositionedKeyboardAwareViewMod.PreviewDimens
import typingsSlinky.storybookReactNative.absolutePositionedKeyboardAwareViewMod.Props
import typingsSlinky.storybookReactNative.absolutePositionedKeyboardAwareViewMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AbsolutePositionedKeyboardAwareView {
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/absolute-positioned-keyboard-aware-view", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onLayout: PreviewDimens => Unit, previewHeight: Double, previewWidth: Double): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(onLayout = js.Any.fromFunction1(onLayout), previewHeight = previewHeight.asInstanceOf[js.Any], previewWidth = previewWidth.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

