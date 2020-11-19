package typingsSlinky.storybookReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookReactNative.addonsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Addons {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Addons.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}
