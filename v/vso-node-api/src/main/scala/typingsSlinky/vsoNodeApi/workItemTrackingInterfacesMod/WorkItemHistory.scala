package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemHistory extends WorkItemTrackingResource {
  var rev: Double
  var revisedBy: IdentityReference
  var revisedDate: js.Date
  var value: String
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
}

