package typingsSlinky.strongErrorHandler.mod.StrongErrorHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait options extends js.Object {
  /***
    * HTTP responses include all error properties, including sensitive data such as file paths,
    * URLs and stack traces, defaults to false.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /***
    * Specify the default response content type to use when the client does not provide any Accepts header.
    * Defaults to 'json'.
    */
  var defaultType: js.UndefOr[String] = js.native
  /***
    *If true, all errors are printed via console.error, including an array of fields (custom error properties)
    *that are safe to include in response messages (both 4xx and 5xx).
    *If false, sends only the error back in the response.
    * Defaults to true
    */
  var log: js.UndefOr[Boolean] = js.native
  /***
    * Negotiate the response content type via Accepts request header.
    * When disabled, strong-error-handler will always use the default content type when producing responses.
    * Disabling content type negotiation is useful if you want to see JSON-formatted
    * error responses in browsers, because browsers usually prefer HTML and XML over other content types.
    */
  var negotiateContentType: js.UndefOr[Boolean] = js.native
  /***
    * Specifies property names on errors that are allowed to be passed through in 4xx and 5xx responses.
    */
  var safeFields: js.UndefOr[js.Array[String]] = js.native
}

object options {
  @scala.inline
  def apply(): options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[options]
  }
  @scala.inline
  implicit class optionsOps[Self <: options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultType")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withNegotiateContentType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negotiateContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegotiateContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negotiateContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeFields")(js.undefined)
        ret
    }
  }
  
}

