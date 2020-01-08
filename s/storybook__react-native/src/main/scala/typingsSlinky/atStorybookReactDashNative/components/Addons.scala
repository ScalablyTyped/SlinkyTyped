package typingsSlinky.atStorybookReactDashNative.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atStorybookReactDashNative.distPreviewComponentsOnDeviceUIAddonsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Addons
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, default] {
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

