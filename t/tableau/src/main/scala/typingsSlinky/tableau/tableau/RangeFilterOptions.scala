package typingsSlinky.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeFilterOptions extends StObject {
  
  /** Maximum value for the range (inclusive). Optional. Leave blank if you want a >= filter. */
  var max: Double | js.Date = js.native
  
  /** Minimum value for the range (inclusive). Optional. Leave blank if you want a <= filter. */
  var min: Double | js.Date = js.native
  
  /** The null values to include */
  var nullOption: NullOption = js.native
}
object RangeFilterOptions {
  
  @scala.inline
  def apply(max: Double | js.Date, min: Double | js.Date, nullOption: NullOption): RangeFilterOptions = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], nullOption = nullOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeFilterOptions]
  }
  
  @scala.inline
  implicit class RangeFilterOptionsMutableBuilder[Self <: RangeFilterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double | js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDate(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double | js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDate(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullOption(value: NullOption): Self = StObject.set(x, "nullOption", value.asInstanceOf[js.Any])
  }
}
