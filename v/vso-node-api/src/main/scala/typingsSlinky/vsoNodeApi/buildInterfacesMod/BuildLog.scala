package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildLog extends BuildLogReference {
  
  /**
    * The date and time the log was created.
    */
  var createdOn: js.Date = js.native
  
  /**
    * The date and time the log was last changed.
    */
  var lastChangedOn: js.Date = js.native
  
  /**
    * The number of lines in the log.
    */
  var lineCount: Double = js.native
}
object BuildLog {
  
  @scala.inline
  def apply(
    createdOn: js.Date,
    id: Double,
    lastChangedOn: js.Date,
    lineCount: Double,
    `type`: String,
    url: String
  ): BuildLog = {
    val __obj = js.Dynamic.literal(createdOn = createdOn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastChangedOn = lastChangedOn.asInstanceOf[js.Any], lineCount = lineCount.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildLog]
  }
  
  @scala.inline
  implicit class BuildLogMutableBuilder[Self <: BuildLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedOn(value: js.Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChangedOn(value: js.Date): Self = StObject.set(x, "lastChangedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCount(value: Double): Self = StObject.set(x, "lineCount", value.asInstanceOf[js.Any])
  }
}
