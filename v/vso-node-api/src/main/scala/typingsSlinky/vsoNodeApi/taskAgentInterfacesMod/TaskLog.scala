package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskLog extends TaskLogReference {
  
  var createdOn: js.Date = js.native
  
  var indexLocation: String = js.native
  
  var lastChangedOn: js.Date = js.native
  
  var lineCount: Double = js.native
  
  var path: String = js.native
}
object TaskLog {
  
  @scala.inline
  def apply(
    createdOn: js.Date,
    id: Double,
    indexLocation: String,
    lastChangedOn: js.Date,
    lineCount: Double,
    location: String,
    path: String
  ): TaskLog = {
    val __obj = js.Dynamic.literal(createdOn = createdOn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], indexLocation = indexLocation.asInstanceOf[js.Any], lastChangedOn = lastChangedOn.asInstanceOf[js.Any], lineCount = lineCount.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskLog]
  }
  
  @scala.inline
  implicit class TaskLogMutableBuilder[Self <: TaskLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedOn(value: js.Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexLocation(value: String): Self = StObject.set(x, "indexLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChangedOn(value: js.Date): Self = StObject.set(x, "lastChangedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCount(value: Double): Self = StObject.set(x, "lineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
