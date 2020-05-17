package typingsSlinky.winrtUwp.Windows.Web.Http.Headers

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents transfer coding information used in the Transfer-Encoding HTTP header on an HTTP request. */
@js.native
trait HttpTransferCodingHeaderValue extends js.Object {
  /** Gets a set of parameters used in the Transfer-Encoding HTTP header. */
  var parameters: IVector[HttpNameValueHeaderValue] = js.native
  /** Gets the transfer-coding value used in the Transfer-Encoding HTTP header. */
  var value: String = js.native
}

object HttpTransferCodingHeaderValue {
  @scala.inline
  def apply(parameters: IVector[HttpNameValueHeaderValue], value: String): HttpTransferCodingHeaderValue = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpTransferCodingHeaderValue]
  }
  @scala.inline
  implicit class HttpTransferCodingHeaderValueOps[Self <: HttpTransferCodingHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameters(value: IVector[HttpNameValueHeaderValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

