package typingsSlinky.winrtUwp.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaPlaybackList::CurrentItemChanged event. */
@js.native
trait CurrentMediaPlaybackItemChangedEventArgs extends js.Object {
  /** Gets the new current MediaPlaybackItem . */
  var newItem: MediaPlaybackItem = js.native
  /** Gets the previous current MediaPlaybackItem . */
  var oldItem: MediaPlaybackItem = js.native
}

object CurrentMediaPlaybackItemChangedEventArgs {
  @scala.inline
  def apply(newItem: MediaPlaybackItem, oldItem: MediaPlaybackItem): CurrentMediaPlaybackItemChangedEventArgs = {
    val __obj = js.Dynamic.literal(newItem = newItem.asInstanceOf[js.Any], oldItem = oldItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentMediaPlaybackItemChangedEventArgs]
  }
  @scala.inline
  implicit class CurrentMediaPlaybackItemChangedEventArgsOps[Self <: CurrentMediaPlaybackItemChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewItem(value: MediaPlaybackItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldItem(value: MediaPlaybackItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldItem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

