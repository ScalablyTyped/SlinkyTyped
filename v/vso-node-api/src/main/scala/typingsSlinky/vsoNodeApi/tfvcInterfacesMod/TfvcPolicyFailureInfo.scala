package typingsSlinky.vsoNodeApi.tfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TfvcPolicyFailureInfo extends js.Object {
  
  var message: String = js.native
  
  var policyName: String = js.native
}
object TfvcPolicyFailureInfo {
  
  @scala.inline
  def apply(message: String, policyName: String): TfvcPolicyFailureInfo = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], policyName = policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcPolicyFailureInfo]
  }
  
  @scala.inline
  implicit class TfvcPolicyFailureInfoOps[Self <: TfvcPolicyFailureInfo] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyName(value: String): Self = this.set("policyName", value.asInstanceOf[js.Any])
  }
}
