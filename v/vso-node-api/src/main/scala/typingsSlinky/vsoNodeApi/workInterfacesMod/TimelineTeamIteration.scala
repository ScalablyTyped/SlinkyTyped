package typingsSlinky.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineTeamIteration extends js.Object {
  /**
    * The end date of the iteration
    */
  var finishDate: js.Date = js.native
  /**
    * The iteration name
    */
  var name: String = js.native
  /**
    * All the partially paged workitems in this iteration.
    */
  var partiallyPagedWorkItems: js.Array[js.Array[_]] = js.native
  /**
    * The iteration path
    */
  var path: String = js.native
  /**
    * The start date of the iteration
    */
  var startDate: js.Date = js.native
  /**
    * The status of this iteration
    */
  var status: TimelineIterationStatus = js.native
  /**
    * The work items that have been paged in this iteration
    */
  var workItems: js.Array[js.Array[_]] = js.native
}

object TimelineTeamIteration {
  @scala.inline
  def apply(
    finishDate: js.Date,
    name: String,
    partiallyPagedWorkItems: js.Array[js.Array[_]],
    path: String,
    startDate: js.Date,
    status: TimelineIterationStatus,
    workItems: js.Array[js.Array[_]]
  ): TimelineTeamIteration = {
    val __obj = js.Dynamic.literal(finishDate = finishDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partiallyPagedWorkItems = partiallyPagedWorkItems.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineTeamIteration]
  }
  @scala.inline
  implicit class TimelineTeamIterationOps[Self <: TimelineTeamIteration] (val x: Self) extends AnyVal {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartiallyPagedWorkItems(value: js.Array[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partiallyPagedWorkItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: TimelineIterationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItems(value: js.Array[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

