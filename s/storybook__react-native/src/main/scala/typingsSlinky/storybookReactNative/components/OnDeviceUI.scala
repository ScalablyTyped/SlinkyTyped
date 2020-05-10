package typingsSlinky.storybookReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookReactNative.onDeviceUIMod.OnDeviceUIProps
import typingsSlinky.storybookReactNative.onDeviceUIMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OnDeviceUI {
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def isUIHidden(value: Boolean): this.type = set("isUIHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def keyboardAvoidingViewVerticalOffset(value: Double): this.type = set("keyboardAvoidingViewVerticalOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldDisableKeyboardAvoidingView(value: Boolean): this.type = set("shouldDisableKeyboardAvoidingView", value.asInstanceOf[js.Any])
    @scala.inline
    def tabOpen(value: Double): this.type = set("tabOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def url(value: String): this.type = set("url", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OnDeviceUIProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(stories: js.Any): Builder = {
    val __props = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OnDeviceUIProps]))
  }
}

