package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timeline extends TimelineReference {
  
  /**
    * The process or person that last changed the timeline.
    */
  var lastChangedBy: String = js.native
  
  /**
    * The time the timeline was last changed.
    */
  var lastChangedOn: js.Date = js.native
  
  var records: js.Array[TimelineRecord] = js.native
}
object Timeline {
  
  @scala.inline
  def apply(
    changeId: Double,
    id: String,
    lastChangedBy: String,
    lastChangedOn: js.Date,
    records: js.Array[TimelineRecord],
    url: String
  ): Timeline = {
    val __obj = js.Dynamic.literal(changeId = changeId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastChangedBy = lastChangedBy.asInstanceOf[js.Any], lastChangedOn = lastChangedOn.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeline]
  }
  
  @scala.inline
  implicit class TimelineMutableBuilder[Self <: Timeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastChangedBy(value: String): Self = StObject.set(x, "lastChangedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChangedOn(value: js.Date): Self = StObject.set(x, "lastChangedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecords(value: js.Array[TimelineRecord]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsVarargs(value: TimelineRecord*): Self = StObject.set(x, "records", js.Array(value :_*))
  }
}
