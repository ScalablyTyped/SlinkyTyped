package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemHistory extends WorkItemTrackingResource {
  var rev: Double = js.native
  var revisedBy: IdentityReference = js.native
  var revisedDate: js.Date = js.native
  var value: String = js.native
}

object WorkItemHistory {
  @scala.inline
  def apply(
    _links: js.Any,
    rev: Double,
    revisedBy: IdentityReference,
    revisedDate: js.Date,
    url: String,
    value: String
  ): WorkItemHistory = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], revisedBy = revisedBy.asInstanceOf[js.Any], revisedDate = revisedDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemHistory]
  }
  @scala.inline
  implicit class WorkItemHistoryOps[Self <: WorkItemHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRev(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevisedBy(value: IdentityReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevisedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

