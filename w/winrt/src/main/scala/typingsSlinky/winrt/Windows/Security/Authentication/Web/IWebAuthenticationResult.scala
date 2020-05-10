package typingsSlinky.winrt.Windows.Security.Authentication.Web

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebAuthenticationResult extends js.Object {
  var responseData: String = js.native
  var responseErrorDetail: Double = js.native
  var responseStatus: WebAuthenticationStatus = js.native
}

object IWebAuthenticationResult {
  @scala.inline
  def apply(responseData: String, responseErrorDetail: Double, responseStatus: WebAuthenticationStatus): IWebAuthenticationResult = {
    val __obj = js.Dynamic.literal(responseData = responseData.asInstanceOf[js.Any], responseErrorDetail = responseErrorDetail.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebAuthenticationResult]
  }
  @scala.inline
  implicit class IWebAuthenticationResultOps[Self <: IWebAuthenticationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponseData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseErrorDetail(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseErrorDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseStatus(value: WebAuthenticationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

