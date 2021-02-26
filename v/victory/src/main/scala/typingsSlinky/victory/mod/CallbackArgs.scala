package typingsSlinky.victory.mod

import typingsSlinky.victory.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the first parameter of a callback when a callback is used to
  * resolve the value of a property instead of a concrete value.
  *
  * Note that additional properties here like `scale`, `x`, `y`, etc are resolved
  * values of properties from the VictoryXXXProps for each component.
  */
@js.native
trait CallbackArgs extends StObject {
  
  var active: Boolean = js.native
  
  var datum: js.Any = js.native
  
  var horizontal: Boolean = js.native
  
  var scale: js.UndefOr[`1`] = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object CallbackArgs {
  
  @scala.inline
  def apply(active: Boolean, datum: js.Any, horizontal: Boolean, x: Double, y: Double): CallbackArgs = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackArgs]
  }
  
  @scala.inline
  implicit class CallbackArgsMutableBuilder[Self <: CallbackArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatum(value: js.Any): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: `1`): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
