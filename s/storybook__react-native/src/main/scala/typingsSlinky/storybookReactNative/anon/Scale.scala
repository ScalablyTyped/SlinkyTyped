package typingsSlinky.storybookReactNative.anon

import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scale extends StObject {
  
  var scale: AnimatedInterpolation = js.native
}
object Scale {
  
  @scala.inline
  def apply(scale: AnimatedInterpolation): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  implicit class ScaleMutableBuilder[Self <: Scale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScale(value: AnimatedInterpolation): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
