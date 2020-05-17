package typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive

import typingsSlinky.winrtUwp.Windows.Web.Http.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of the creation of a AdaptiveMediaSource object. */
@js.native
trait AdaptiveMediaSourceCreationResult extends js.Object {
  /** Gets the HTTP response message, if any, returned from an attempt to create a AdaptiveMediaSource object. */
  var httpResponseMessage: HttpResponseMessage = js.native
  /** Gets the AdaptiveMediaSource object that represents the source of adaptive streaming content. */
  var mediaSource: AdaptiveMediaSource = js.native
  /** Gets the status of an attempt to create a AdaptiveMediaSource object. */
  var status: AdaptiveMediaSourceCreationStatus = js.native
}

object AdaptiveMediaSourceCreationResult {
  @scala.inline
  def apply(
    httpResponseMessage: HttpResponseMessage,
    mediaSource: AdaptiveMediaSource,
    status: AdaptiveMediaSourceCreationStatus
  ): AdaptiveMediaSourceCreationResult = {
    val __obj = js.Dynamic.literal(httpResponseMessage = httpResponseMessage.asInstanceOf[js.Any], mediaSource = mediaSource.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourceCreationResult]
  }
  @scala.inline
  implicit class AdaptiveMediaSourceCreationResultOps[Self <: AdaptiveMediaSourceCreationResult] (val x: Self) extends AnyVal {
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
    def withMediaSource(value: AdaptiveMediaSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: AdaptiveMediaSourceCreationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

