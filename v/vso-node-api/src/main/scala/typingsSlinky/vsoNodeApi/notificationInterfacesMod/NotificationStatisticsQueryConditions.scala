package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationStatisticsQueryConditions extends js.Object {
  
  var endDate: js.Date = js.native
  
  var hitCountMinimum: Double = js.native
  
  var path: String = js.native
  
  var startDate: js.Date = js.native
  
  var `type`: NotificationStatisticType = js.native
  
  var user: IdentityRef = js.native
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
  
  @scala.inline
  implicit class NotificationStatisticsQueryConditionsOps[Self <: NotificationStatisticsQueryConditions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndDate(value: js.Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitCountMinimum(value: Double): Self = this.set("hitCountMinimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: js.Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NotificationStatisticType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: IdentityRef): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
