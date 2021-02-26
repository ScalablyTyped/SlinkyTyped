package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.srcTimeunitMod.TimeUnitParams
import typingsSlinky.vegaLite.srcTypeMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeUnit extends StObject {
  
  var timeUnit: typingsSlinky.vegaLite.srcTimeunitMod.TimeUnit | TimeUnitParams = js.native
  
  var `type`: js.UndefOr[Type] = js.native
  
  var undefinedIfExprNotRequired: js.UndefOr[Boolean] = js.native
  
  var wrapTime: js.UndefOr[Boolean] = js.native
}
object TimeUnit {
  
  @scala.inline
  def apply(timeUnit: typingsSlinky.vegaLite.srcTimeunitMod.TimeUnit | TimeUnitParams): TimeUnit = {
    val __obj = js.Dynamic.literal(timeUnit = timeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeUnit]
  }
  
  @scala.inline
  implicit class TimeUnitMutableBuilder[Self <: TimeUnit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeUnit(value: typingsSlinky.vegaLite.srcTimeunitMod.TimeUnit | TimeUnitParams): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUndefinedIfExprNotRequired(value: Boolean): Self = StObject.set(x, "undefinedIfExprNotRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefinedIfExprNotRequiredUndefined: Self = StObject.set(x, "undefinedIfExprNotRequired", js.undefined)
    
    @scala.inline
    def setWrapTime(value: Boolean): Self = StObject.set(x, "wrapTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapTimeUndefined: Self = StObject.set(x, "wrapTime", js.undefined)
  }
}
