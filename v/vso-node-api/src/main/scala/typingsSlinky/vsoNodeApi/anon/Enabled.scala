package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Enabled extends StObject {
  
  var disabled: scala.Double = js.native
  
  var enabled: scala.Double = js.native
  
  var undefined: scala.Double = js.native
}
object Enabled {
  
  @scala.inline
  def apply(disabled: scala.Double, enabled: scala.Double, undefined: scala.Double): Enabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
  
  @scala.inline
  implicit class EnabledMutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: scala.Double): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: scala.Double): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefined(value: scala.Double): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
  }
}
