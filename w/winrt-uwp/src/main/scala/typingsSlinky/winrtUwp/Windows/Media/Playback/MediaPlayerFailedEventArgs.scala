package typingsSlinky.winrtUwp.Windows.Media.Playback

import typingsSlinky.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the data for MediaFailed events. */
@js.native
trait MediaPlayerFailedEventArgs extends js.Object {
  /** Gets the MediaPlayerError value for the error that triggered the event. */
  var error: MediaPlayerError = js.native
  /** Gets a string describing the error that occurred. */
  var errorMessage: String = js.native
  /** Gets an HResult that indicates any extra data about the error that occurred. */
  var extendedErrorCode: WinRTError = js.native
}

object MediaPlayerFailedEventArgs {
  @scala.inline
  def apply(error: MediaPlayerError, errorMessage: String, extendedErrorCode: WinRTError): MediaPlayerFailedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], extendedErrorCode = extendedErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlayerFailedEventArgs]
  }
  @scala.inline
  implicit class MediaPlayerFailedEventArgsOps[Self <: MediaPlayerFailedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: MediaPlayerError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendedErrorCode(value: WinRTError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

