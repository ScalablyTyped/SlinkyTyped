package typingsSlinky.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamIterationAttributes extends js.Object {
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
  implicit class TeamIterationAttributesOps[Self <: TeamIterationAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinishDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeFrame(value: TimeFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFrame")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

