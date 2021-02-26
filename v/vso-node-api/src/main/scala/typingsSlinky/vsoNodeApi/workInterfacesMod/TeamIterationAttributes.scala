package typingsSlinky.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamIterationAttributes extends StObject {
  
  var finishDate: js.Date = js.native
  
  var startDate: js.Date = js.native
  
  var timeFrame: TimeFrame = js.native
}
object TeamIterationAttributes {
  
  @scala.inline
  def apply(finishDate: js.Date, startDate: js.Date, timeFrame: TimeFrame): TeamIterationAttributes = {
    val __obj = js.Dynamic.literal(finishDate = finishDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], timeFrame = timeFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamIterationAttributes]
  }
  
  @scala.inline
  implicit class TeamIterationAttributesMutableBuilder[Self <: TeamIterationAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinishDate(value: js.Date): Self = StObject.set(x, "finishDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeFrame(value: TimeFrame): Self = StObject.set(x, "timeFrame", value.asInstanceOf[js.Any])
  }
}
