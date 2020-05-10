package typingsSlinky.winrt.Windows.Management.Deployment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeploymentResult extends js.Object {
  var activityId: String = js.native
  var errorText: String = js.native
  var extendedErrorCode: Double = js.native
}

object IDeploymentResult {
  @scala.inline
  def apply(activityId: String, errorText: String, extendedErrorCode: Double): IDeploymentResult = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], extendedErrorCode = extendedErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeploymentResult]
  }
  @scala.inline
  implicit class IDeploymentResultOps[Self <: IDeploymentResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendedErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

