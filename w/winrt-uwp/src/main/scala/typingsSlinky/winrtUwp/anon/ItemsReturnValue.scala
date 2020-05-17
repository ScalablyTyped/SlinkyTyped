package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Media.Core.AudioTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsReturnValue extends js.Object {
  /** The audio tracks that start at startIndex in the list. */ var items: AudioTrack = js.native
  /** The number of audio tracks retrieved. */ var returnValue: Double = js.native
}

object ItemsReturnValue {
  @scala.inline
  def apply(items: AudioTrack, returnValue: Double): ItemsReturnValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsReturnValue]
  }
  @scala.inline
  implicit class ItemsReturnValueOps[Self <: ItemsReturnValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: AudioTrack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

