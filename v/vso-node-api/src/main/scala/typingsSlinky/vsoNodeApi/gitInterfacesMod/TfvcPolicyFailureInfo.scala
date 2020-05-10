package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

