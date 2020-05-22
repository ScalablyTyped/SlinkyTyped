package typingsSlinky.winrtUwp.global.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaPlaybackList::CurrentItemChanged event. */
@JSGlobal("Windows.Media.Playback.CurrentMediaPlaybackItemChangedEventArgs")
@js.native
abstract class CurrentMediaPlaybackItemChangedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.Media.Playback.CurrentMediaPlaybackItemChangedEventArgs {
  /** Gets the new current MediaPlaybackItem . */
  /* CompleteClass */
  override var newItem: typingsSlinky.winrtUwp.Windows.Media.Playback.MediaPlaybackItem = js.native
  /** Gets the previous current MediaPlaybackItem . */
  /* CompleteClass */
  override var oldItem: typingsSlinky.winrtUwp.Windows.Media.Playback.MediaPlaybackItem = js.native
}

