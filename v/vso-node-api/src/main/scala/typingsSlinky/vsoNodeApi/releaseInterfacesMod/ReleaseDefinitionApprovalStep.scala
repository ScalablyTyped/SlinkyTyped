package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseDefinitionApprovalStep extends ReleaseDefinitionEnvironmentStep {
  
  var approver: IdentityRef = js.native
  
  var isAutomated: Boolean = js.native
  
  var isNotificationOn: Boolean = js.native
  
  var rank: Double = js.native
}
object ReleaseDefinitionApprovalStep {
  
  @scala.inline
  def apply(approver: IdentityRef, id: Double, isAutomated: Boolean, isNotificationOn: Boolean, rank: Double): ReleaseDefinitionApprovalStep = {
    val __obj = js.Dynamic.literal(approver = approver.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isAutomated = isAutomated.asInstanceOf[js.Any], isNotificationOn = isNotificationOn.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionApprovalStep]
  }
  
  @scala.inline
  implicit class ReleaseDefinitionApprovalStepMutableBuilder[Self <: ReleaseDefinitionApprovalStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprover(value: IdentityRef): Self = StObject.set(x, "approver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutomated(value: Boolean): Self = StObject.set(x, "isAutomated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNotificationOn(value: Boolean): Self = StObject.set(x, "isNotificationOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
  }
}
