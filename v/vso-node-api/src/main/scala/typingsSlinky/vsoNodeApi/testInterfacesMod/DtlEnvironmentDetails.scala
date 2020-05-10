package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DtlEnvironmentDetails extends js.Object {
  var csmContent: String = js.native
  var csmParameters: String = js.native
  var subscriptionName: String = js.native
}

object DtlEnvironmentDetails {
  @scala.inline
  def apply(csmContent: String, csmParameters: String, subscriptionName: String): DtlEnvironmentDetails = {
    val __obj = js.Dynamic.literal(csmContent = csmContent.asInstanceOf[js.Any], csmParameters = csmParameters.asInstanceOf[js.Any], subscriptionName = subscriptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DtlEnvironmentDetails]
  }
  @scala.inline
  implicit class DtlEnvironmentDetailsOps[Self <: DtlEnvironmentDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCsmContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csmContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsmParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csmParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

