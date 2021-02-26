package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskHubLicenseDetails extends StObject {
  
  var enterpriseUsersCount: Double = js.native
  
  var freeLicenseCount: Double = js.native
  
  var hasLicenseCountEverUpdated: Boolean = js.native
  
  var hostedAgentMinutesFreeCount: Double = js.native
  
  var hostedAgentMinutesUsedCount: Double = js.native
  
  var msdnUsersCount: Double = js.native
  
  var purchasedHostedLicenseCount: Double = js.native
  
  var purchasedLicenseCount: Double = js.native
  
  var totalLicenseCount: Double = js.native
}
object TaskHubLicenseDetails {
  
  @scala.inline
  def apply(
    enterpriseUsersCount: Double,
    freeLicenseCount: Double,
    hasLicenseCountEverUpdated: Boolean,
    hostedAgentMinutesFreeCount: Double,
    hostedAgentMinutesUsedCount: Double,
    msdnUsersCount: Double,
    purchasedHostedLicenseCount: Double,
    purchasedLicenseCount: Double,
    totalLicenseCount: Double
  ): TaskHubLicenseDetails = {
    val __obj = js.Dynamic.literal(enterpriseUsersCount = enterpriseUsersCount.asInstanceOf[js.Any], freeLicenseCount = freeLicenseCount.asInstanceOf[js.Any], hasLicenseCountEverUpdated = hasLicenseCountEverUpdated.asInstanceOf[js.Any], hostedAgentMinutesFreeCount = hostedAgentMinutesFreeCount.asInstanceOf[js.Any], hostedAgentMinutesUsedCount = hostedAgentMinutesUsedCount.asInstanceOf[js.Any], msdnUsersCount = msdnUsersCount.asInstanceOf[js.Any], purchasedHostedLicenseCount = purchasedHostedLicenseCount.asInstanceOf[js.Any], purchasedLicenseCount = purchasedLicenseCount.asInstanceOf[js.Any], totalLicenseCount = totalLicenseCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskHubLicenseDetails]
  }
  
  @scala.inline
  implicit class TaskHubLicenseDetailsMutableBuilder[Self <: TaskHubLicenseDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnterpriseUsersCount(value: Double): Self = StObject.set(x, "enterpriseUsersCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeLicenseCount(value: Double): Self = StObject.set(x, "freeLicenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasLicenseCountEverUpdated(value: Boolean): Self = StObject.set(x, "hasLicenseCountEverUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedAgentMinutesFreeCount(value: Double): Self = StObject.set(x, "hostedAgentMinutesFreeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedAgentMinutesUsedCount(value: Double): Self = StObject.set(x, "hostedAgentMinutesUsedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsdnUsersCount(value: Double): Self = StObject.set(x, "msdnUsersCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchasedHostedLicenseCount(value: Double): Self = StObject.set(x, "purchasedHostedLicenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchasedLicenseCount(value: Double): Self = StObject.set(x, "purchasedLicenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalLicenseCount(value: Double): Self = StObject.set(x, "totalLicenseCount", value.asInstanceOf[js.Any])
  }
}
