package typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import typingsSlinky.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationStatisticsQueryConditions extends js.Object {
  var endDate: js.Date
  var hitCountMinimum: Double
  var path: String
  var startDate: js.Date
  var `type`: NotificationStatisticType
  var user: IdentityRef
}

object NotificationStatisticsQueryConditions {
  @scala.inline
  def apply(
    endDate: js.Date,
    hitCountMinimum: Double,
    path: String,
    startDate: js.Date,
    `type`: NotificationStatisticType,
    user: IdentityRef
  ): NotificationStatisticsQueryConditions = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], hitCountMinimum = hitCountMinimum.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationStatisticsQueryConditions]
  }
}

