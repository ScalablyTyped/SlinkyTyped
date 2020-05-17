package typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an error from a web account provider. */
@js.native
trait WebProviderError extends js.Object {
  /** Gets the error code. */
  var errorCode: Double = js.native
  /** Gets the error message. */
  var errorMessage: String = js.native
  /** Gets the error properties. */
  var properties: IMap[String, String] = js.native
}

object WebProviderError {
  @scala.inline
  def apply(errorCode: Double, errorMessage: String, properties: IMap[String, String]): WebProviderError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebProviderError]
  }
  @scala.inline
  implicit class WebProviderErrorOps[Self <: WebProviderError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: IMap[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

