package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsoleLogEvent extends RealtimeBuildEvent {
  
  var lines: js.Array[String] = js.native
  
  var timelineId: String = js.native
  
  var timelineRecordId: String = js.native
}
object ConsoleLogEvent {
  
  @scala.inline
  def apply(buildId: Double, lines: js.Array[String], timelineId: String, timelineRecordId: String): ConsoleLogEvent = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], timelineId = timelineId.asInstanceOf[js.Any], timelineRecordId = timelineRecordId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleLogEvent]
  }
  
  @scala.inline
  implicit class ConsoleLogEventMutableBuilder[Self <: ConsoleLogEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value :_*))
    
    @scala.inline
    def setTimelineId(value: String): Self = StObject.set(x, "timelineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineRecordId(value: String): Self = StObject.set(x, "timelineRecordId", value.asInstanceOf[js.Any])
  }
}
