package typingsSlinky.winrtUwp.Windows.Security.Authentication.Web

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Indicates the result of the authentication operation. */
@js.native
trait WebAuthenticationResult extends js.Object {
  /** Contains the protocol data when the operation successfully completes. */
  var responseData: String = js.native
  /** Returns the HTTP error code when ResponseStatus is equal to WebAuthenticationStatus.ErrorHttp . This is only available if there is an error. */
  var responseErrorDetail: Double = js.native
  /** Contains the status of the asynchronous operation when it completes. */
  var responseStatus: WebAuthenticationStatus = js.native
}

object WebAuthenticationResult {
  @scala.inline
  def apply(responseData: String, responseErrorDetail: Double, responseStatus: WebAuthenticationStatus): WebAuthenticationResult = {
    val __obj = js.Dynamic.literal(responseData = responseData.asInstanceOf[js.Any], responseErrorDetail = responseErrorDetail.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAuthenticationResult]
  }
  @scala.inline
  implicit class WebAuthenticationResultOps[Self <: WebAuthenticationResult] (val x: Self) extends AnyVal {
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

