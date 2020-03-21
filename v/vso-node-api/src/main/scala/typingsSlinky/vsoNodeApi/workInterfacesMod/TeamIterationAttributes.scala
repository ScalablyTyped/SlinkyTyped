package typingsSlinky.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamIterationAttributes extends js.Object {
  var finishDate: js.Date
  var startDate: js.Date
  var timeFrame: TimeFrame
}

object TeamIterationAttributes {
  @scala.inline
  def apply(finishDate: js.Date, startDate: js.Date, timeFrame: TimeFrame): TeamIterationAttributes = {
    val __obj = js.Dynamic.literal(finishDate = finishDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], timeFrame = timeFrame.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamIterationAttributes]
  }
}

