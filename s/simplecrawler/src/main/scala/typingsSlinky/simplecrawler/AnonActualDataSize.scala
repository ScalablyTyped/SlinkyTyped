package typingsSlinky.simplecrawler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActualDataSize extends js.Object {
  var actualDataSize: Double = js.native
  var code: Double = js.native
  var contentLength: Double = js.native
  var contentType: String = js.native
  var downloadTime: Double = js.native
  var headers: js.Object = js.native
  var requestLatency: Double = js.native
  var requestTime: Double = js.native
  var sentIncorrectSize: Boolean = js.native
}

object AnonActualDataSize {
  @scala.inline
  def apply(
    actualDataSize: Double,
    code: Double,
    contentLength: Double,
    contentType: String,
    downloadTime: Double,
    headers: js.Object,
    requestLatency: Double,
    requestTime: Double,
    sentIncorrectSize: Boolean
  ): AnonActualDataSize = {
    val __obj = js.Dynamic.literal(actualDataSize = actualDataSize.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], contentLength = contentLength.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], downloadTime = downloadTime.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], requestLatency = requestLatency.asInstanceOf[js.Any], requestTime = requestTime.asInstanceOf[js.Any], sentIncorrectSize = sentIncorrectSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActualDataSize]
  }
  @scala.inline
  implicit class AnonActualDataSizeOps[Self <: AnonActualDataSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActualDataSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualDataSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestLatency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestLatency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSentIncorrectSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentIncorrectSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

