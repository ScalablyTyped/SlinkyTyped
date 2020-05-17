package typingsSlinky.winrtUwp.Windows.Web.Http.Headers

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents accept information used in the Accept HTTP header on an HTTP request. */
@js.native
trait HttpMediaTypeWithQualityHeaderValue extends js.Object {
  /** Gets or sets the character set of the content to accept that is used in the Accept HTTP header. */
  var charSet: String = js.native
  /** Gets or sets the media-type of the content to accept that is used in the Accept HTTP header. */
  var mediaType: String = js.native
  /** Gets a set of parameters included in the Accept HTTP header. */
  var parameters: IVector[HttpNameValueHeaderValue] = js.native
  /** Get or set the qvalue or quality used in the Accept HTTP header. */
  var quality: Double = js.native
}

object HttpMediaTypeWithQualityHeaderValue {
  @scala.inline
  def apply(charSet: String, mediaType: String, parameters: IVector[HttpNameValueHeaderValue], quality: Double): HttpMediaTypeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(charSet = charSet.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpMediaTypeWithQualityHeaderValue]
  }
  @scala.inline
  implicit class HttpMediaTypeWithQualityHeaderValueOps[Self <: HttpMediaTypeWithQualityHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: IVector[HttpNameValueHeaderValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

