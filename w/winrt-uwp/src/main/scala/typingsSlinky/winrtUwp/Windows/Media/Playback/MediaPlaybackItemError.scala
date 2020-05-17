package typingsSlinky.winrtUwp.Windows.Media.Playback

import typingsSlinky.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an error that occurred trying to resolve a MediaPlaybackItem . */
@js.native
trait MediaPlaybackItemError extends js.Object {
  /** Gets the error code associated with the playback item error. */
  var errorCode: MediaPlaybackItemErrorCode = js.native
  /** Gets the extended error code for the MediaPlaybackItem error. */
  var extendedError: WinRTError = js.native
}

object MediaPlaybackItemError {
  @scala.inline
  def apply(errorCode: MediaPlaybackItemErrorCode, extendedError: WinRTError): MediaPlaybackItemError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], extendedError = extendedError.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlaybackItemError]
  }
  @scala.inline
  implicit class MediaPlaybackItemErrorOps[Self <: MediaPlaybackItemError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: MediaPlaybackItemErrorCode): Self = {
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

