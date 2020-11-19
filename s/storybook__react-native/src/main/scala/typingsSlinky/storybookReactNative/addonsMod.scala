package typingsSlinky.storybookReactNative

import typingsSlinky.react.mod.Component
import typingsSlinky.storybookAddons.distMod.Collection
import typingsSlinky.storybookReactNative.anon.AddonSelected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons", JSImport.Namespace)
@js.native
object addonsMod extends js.Object {
  
  @js.native
  trait Addons
    extends Component[js.Object, AddonSelected, js.Any] {
    
    def onPressAddon(addonSelected: String): Unit = js.native
    
    var panels: Collection = js.native
  }
  
  @js.native
  class default protected () extends Addons {
    def this(props: js.Object) = this()
  }
}
