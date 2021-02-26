package typingsSlinky.storybookReactNative

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.storybookAddons.distMod.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons/list", JSImport.Default)
  @js.native
  class default () extends AddonList
  
  @js.native
  trait AddonList
    extends PureComponent[Props, js.Object, js.Any] {
    
    def renderTab(id: String, title: String): ReactElement = js.native
  }
  
  @js.native
  trait Props extends StObject {
    
    var addonSelected: String = js.native
    
    def onPressAddon(id: String): Unit = js.native
    
    var panels: Collection = js.native
  }
  object Props {
    
    @scala.inline
    def apply(addonSelected: String, onPressAddon: String => Unit, panels: Collection): Props = {
      val __obj = js.Dynamic.literal(addonSelected = addonSelected.asInstanceOf[js.Any], onPressAddon = js.Any.fromFunction1(onPressAddon), panels = panels.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddonSelected(value: String): Self = StObject.set(x, "addonSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPressAddon(value: String => Unit): Self = StObject.set(x, "onPressAddon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPanels(value: Collection): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
    }
  }
}
