package typingsSlinky.vis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Maximum extends StObject {
  
  var maximum: js.UndefOr[Double] = js.native
  
  var minimum: js.UndefOr[Double] = js.native
}
object Maximum {
  
  @scala.inline
  def apply(): Maximum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Maximum]
  }
  
  @scala.inline
  implicit class MaximumMutableBuilder[Self <: Maximum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
  }
}
