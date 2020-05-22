package typingsSlinky.winrtUwp.global.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaPlaybackList::ItemFailed event. */
@JSGlobal("Windows.Media.Playback.MediaPlaybackItemFailedEventArgs")
@js.native
abstract class MediaPlaybackItemFailedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.Media.Playback.MediaPlaybackItemFailedEventArgs {
  /** Gets a wrapper object for the MediaPlaybackItem error that provides high-level information about the cause of the error. */
  /* CompleteClass */
  override var error: typingsSlinky.winrtUwp.Windows.Media.Playback.MediaPlaybackItemError = js.native
  /** Gets the MediaPlaybackItem associated with the error. */
  /* CompleteClass */
  override var item: typingsSlinky.winrtUwp.Windows.Media.Playback.MediaPlaybackItem = js.native
}

