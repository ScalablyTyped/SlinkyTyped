package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the value of the search bar changes.
		 */
@js.native
trait SearchBarChangeEvent extends SearchBarBaseEvent {
  /**
  			 * Value of the search bar.
  			 */
  var value: String = js.native
}

object SearchBarChangeEvent {
  @scala.inline
  def apply(source: SearchBar, value: String): SearchBarChangeEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarChangeEvent]
  }
  @scala.inline
  implicit class SearchBarChangeEventOps[Self <: SearchBarChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

