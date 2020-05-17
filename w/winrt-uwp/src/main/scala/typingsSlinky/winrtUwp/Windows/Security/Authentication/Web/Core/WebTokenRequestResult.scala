package typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of a web token request to an identity provider. */
@js.native
trait WebTokenRequestResult extends js.Object {
  /** Gets the response data from the web token provider. */
  var responseData: IVectorView[WebTokenResponse] = js.native
  /** Gets the error returned by the web provider, if any. */
  var responseError: WebProviderError = js.native
  /** Gets the status of the request. */
  var responseStatus: WebTokenRequestStatus = js.native
  /**
    * Invalidates the current cached WebTokenRequestResult . Use this method if an access denied error is returned when trying to use a token.
    * @return This method does not return an object or value.
    */
  def invalidateCacheAsync(): IPromiseWithIAsyncAction = js.native
}

object WebTokenRequestResult {
  @scala.inline
  def apply(
    invalidateCacheAsync: () => IPromiseWithIAsyncAction,
    responseData: IVectorView[WebTokenResponse],
    responseError: WebProviderError,
    responseStatus: WebTokenRequestStatus
  ): WebTokenRequestResult = {
    val __obj = js.Dynamic.literal(invalidateCacheAsync = js.Any.fromFunction0(invalidateCacheAsync), responseData = responseData.asInstanceOf[js.Any], responseError = responseError.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebTokenRequestResult]
  }
  @scala.inline
  implicit class WebTokenRequestResultOps[Self <: WebTokenRequestResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvalidateCacheAsync(value: () => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidateCacheAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResponseData(value: IVectorView[WebTokenResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseError(value: WebProviderError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseStatus(value: WebTokenRequestStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

