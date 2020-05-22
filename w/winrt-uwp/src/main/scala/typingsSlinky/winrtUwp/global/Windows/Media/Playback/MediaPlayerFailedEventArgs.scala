package typingsSlinky.winrtUwp.global.Windows.Media.Playback

import typingsSlinky.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the data for MediaFailed events. */
@JSGlobal("Windows.Media.Playback.MediaPlayerFailedEventArgs")
@js.native
abstract class MediaPlayerFailedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.Media.Playback.MediaPlayerFailedEventArgs {
  /** Gets the MediaPlayerError value for the error that triggered the event. */
  /* CompleteClass */
  override var error: typingsSlinky.winrtUwp.Windows.Media.Playback.MediaPlayerError = js.native
  /** Gets a string describing the error that occurred. */
  /* CompleteClass */
  override var errorMessage: String = js.native
  /** Gets an HResult that indicates any extra data about the error that occurred. */
  /* CompleteClass */
  override var extendedErrorCode: WinRTError = js.native
}

