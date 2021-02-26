package typingsSlinky.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineWindow extends StObject {
  
  var end: js.Date = js.native
  
  var start: js.Date = js.native
}
object TimelineWindow {
  
  @scala.inline
  def apply(end: js.Date, start: js.Date): TimelineWindow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineWindow]
  }
  
  @scala.inline
  implicit class TimelineWindowMutableBuilder[Self <: TimelineWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
