package typingsSlinky.vis.mod

import typingsSlinky.vis.visStrings.daily
import typingsSlinky.vis.visStrings.monthly
import typingsSlinky.vis.visStrings.weekly
import typingsSlinky.vis.visStrings.yearly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineHiddenDateOption extends StObject {
  
  var end: DateType = js.native
  
  var repeat: js.UndefOr[daily | weekly | monthly | yearly] = js.native
  
  var start: DateType = js.native
}
object TimelineHiddenDateOption {
  
  @scala.inline
  def apply(end: DateType, start: DateType): TimelineHiddenDateOption = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineHiddenDateOption]
  }
  
  @scala.inline
  implicit class TimelineHiddenDateOptionMutableBuilder[Self <: TimelineHiddenDateOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: DateType): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeat(value: daily | weekly | monthly | yearly): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    @scala.inline
    def setStart(value: DateType): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
