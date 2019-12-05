package typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import typingsSlinky.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportingWorkItemLink extends js.Object {
  var changedBy: IdentityRef
  var changedDate: js.Date
  var changedOperation: LinkChangeType
  var comment: String
  var isActive: Boolean
  var linkType: String
  var rel: String
  var sourceId: Double
  var targetId: Double
}

object ReportingWorkItemLink {
  @scala.inline
  def apply(
    changedBy: IdentityRef,
    changedDate: js.Date,
    changedOperation: LinkChangeType,
    comment: String,
    isActive: Boolean,
    linkType: String,
    rel: String,
    sourceId: Double,
    targetId: Double
  ): ReportingWorkItemLink = {
    val __obj = js.Dynamic.literal(changedBy = changedBy.asInstanceOf[js.Any], changedDate = changedDate.asInstanceOf[js.Any], changedOperation = changedOperation.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReportingWorkItemLink]
  }
}

