package typingsSlinky.winrtUwp.Windows.Media.Core

import typingsSlinky.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an error that occurred with a timed metadata track. */
@js.native
trait TimedMetadataTrackError extends js.Object {
  /** Gets the error code associated with the timed metadata track error. */
  var errorCode: TimedMetadataTrackErrorCode = js.native
  /** Gets the extended error code for the TimedMetadataTrackError . */
  var extendedError: WinRTError = js.native
}

object TimedMetadataTrackError {
  @scala.inline
  def apply(errorCode: TimedMetadataTrackErrorCode, extendedError: WinRTError): TimedMetadataTrackError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], extendedError = extendedError.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedMetadataTrackError]
  }
  @scala.inline
  implicit class TimedMetadataTrackErrorOps[Self <: TimedMetadataTrackError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: TimedMetadataTrackErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendedError(value: WinRTError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedError")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

