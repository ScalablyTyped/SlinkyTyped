package typingsSlinky.storybookReactNative

import typingsSlinky.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visibilityButtonMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/navigation/visibility-button", JSImport.Default)
  @js.native
  class default () extends VisibilityButton
  
  @js.native
  trait Props extends StObject {
    
    def onPress(): Unit = js.native
  }
  object Props {
    
    @scala.inline
    def apply(onPress: () => Unit): Props = {
      val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction0(onPress))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait VisibilityButton
    extends PureComponent[Props, js.Object, js.Any]
}
