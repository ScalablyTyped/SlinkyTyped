package typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Web.Http.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the DownloadCompleted event. */
@js.native
trait AdaptiveMediaSourceDownloadCompletedEventArgs extends js.Object {
  /** Gets the http response message, if any, returned from the completed media download request. */
  var httpResponseMessage: HttpResponseMessage = js.native
  /** Gets the byte range length of the completed media download request. */
  var resourceByteRangeLength: Double = js.native
  /** Gets the byte range offset of the completed media download request. */
  var resourceByteRangeOffset: Double = js.native
  /** Gets the resource type of the completed media download request. */
  var resourceType: AdaptiveMediaSourceResourceType = js.native
  /** Gets the resource URI of the completed media download request. */
  var resourceUri: Uri = js.native
}

object AdaptiveMediaSourceDownloadCompletedEventArgs {
  @scala.inline
  def apply(
    httpResponseMessage: HttpResponseMessage,
    resourceByteRangeLength: Double,
    resourceByteRangeOffset: Double,
    resourceType: AdaptiveMediaSourceResourceType,
    resourceUri: Uri
  ): AdaptiveMediaSourceDownloadCompletedEventArgs = {
    val __obj = js.Dynamic.literal(httpResponseMessage = httpResponseMessage.asInstanceOf[js.Any], resourceByteRangeLength = resourceByteRangeLength.asInstanceOf[js.Any], resourceByteRangeOffset = resourceByteRangeOffset.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], resourceUri = resourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourceDownloadCompletedEventArgs]
  }
  @scala.inline
  implicit class AdaptiveMediaSourceDownloadCompletedEventArgsOps[Self <: AdaptiveMediaSourceDownloadCompletedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpResponseMessage(value: HttpResponseMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpResponseMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceByteRangeLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceByteRangeLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceByteRangeOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceByteRangeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: AdaptiveMediaSourceResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

