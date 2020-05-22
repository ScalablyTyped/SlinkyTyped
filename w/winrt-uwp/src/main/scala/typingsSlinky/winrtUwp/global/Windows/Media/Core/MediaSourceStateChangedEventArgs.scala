package typingsSlinky.winrtUwp.global.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Core.MediaSourceStateChangedEventArgs")
@js.native
abstract class MediaSourceStateChangedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.Media.Core.MediaSourceStateChangedEventArgs {
  /** Gets the new current state of the MediaSource . */
  /* CompleteClass */
  override var newState: typingsSlinky.winrtUwp.Windows.Media.Core.MediaSourceState = js.native
  /** Gets the previous state of the MediaSource before the state changed. */
  /* CompleteClass */
  override var oldState: typingsSlinky.winrtUwp.Windows.Media.Core.MediaSourceState = js.native
}

