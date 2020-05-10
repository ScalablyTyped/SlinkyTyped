package typingsSlinky.storybookReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookReactNative.navigationMod.Props
import typingsSlinky.storybookReactNative.navigationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Navigation {
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/navigation", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def initialUiVisible(value: Boolean): this.type = set("initialUiVisible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onChangeTab: Double => Unit, tabOpen: Double): Builder = {
    val __props = js.Dynamic.literal(onChangeTab = js.Any.fromFunction1(onChangeTab), tabOpen = tabOpen.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

