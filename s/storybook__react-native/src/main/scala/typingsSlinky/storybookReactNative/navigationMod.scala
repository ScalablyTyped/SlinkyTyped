package typingsSlinky.storybookReactNative

import typingsSlinky.react.mod.PureComponent
import typingsSlinky.storybookReactNative.anon.IsUIVisible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/navigation", JSImport.Default)
  @js.native
  class default () extends Navigation
  
  @js.native
  trait Navigation
    extends PureComponent[Props, js.Object, js.Any] {
    
    def handleSwipeLeft(): Unit = js.native
    
    def handleSwipeRight(): Unit = js.native
    
    def handleToggleUI(): Unit = js.native
    
    @JSName("state")
    var state_Navigation: IsUIVisible = js.native
  }
  
  @js.native
  trait Props extends StObject {
    
    var initialUiVisible: js.UndefOr[Boolean] = js.native
    
    def onChangeTab(index: Double): Unit = js.native
    
    var tabOpen: Double = js.native
  }
  object Props {
    
    @scala.inline
    def apply(onChangeTab: Double => Unit, tabOpen: Double): Props = {
      val __obj = js.Dynamic.literal(onChangeTab = js.Any.fromFunction1(onChangeTab), tabOpen = tabOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialUiVisible(value: Boolean): Self = StObject.set(x, "initialUiVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialUiVisibleUndefined: Self = StObject.set(x, "initialUiVisible", js.undefined)
      
      @scala.inline
      def setOnChangeTab(value: Double => Unit): Self = StObject.set(x, "onChangeTab", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTabOpen(value: Double): Self = StObject.set(x, "tabOpen", value.asInstanceOf[js.Any])
    }
  }
}
