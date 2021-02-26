package typingsSlinky.tuyaPanelKit.anon

import typingsSlinky.reactNative.mod.Animated.WithAnimatedValue
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleWithAnimatedValue extends StObject {
  
  var style: WithAnimatedValue[StyleProp[ViewStyle]] = js.native
}
object StyleWithAnimatedValue {
  
  @scala.inline
  def apply(): StyleWithAnimatedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleWithAnimatedValue]
  }
  
  @scala.inline
  implicit class StyleWithAnimatedValueMutableBuilder[Self <: StyleWithAnimatedValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
