package typingsSlinky.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaSourceStateChangedEventArgs extends js.Object {
  /** Gets the new current state of the MediaSource . */
  var newState: MediaSourceState = js.native
  /** Gets the previous state of the MediaSource before the state changed. */
  var oldState: MediaSourceState = js.native
}

object MediaSourceStateChangedEventArgs {
  @scala.inline
  def apply(newState: MediaSourceState, oldState: MediaSourceState): MediaSourceStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSourceStateChangedEventArgs]
  }
  @scala.inline
  implicit class MediaSourceStateChangedEventArgsOps[Self <: MediaSourceStateChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewState(value: MediaSourceState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldState(value: MediaSourceState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

