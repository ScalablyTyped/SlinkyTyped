package typingsSlinky.titanium.Titanium.App.iOS

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchQueryEventMap extends ProxyEventMap {
  var completed: SearchQueryCompletedEvent = js.native
  var founditems: SearchQueryFounditemsEvent = js.native
}

object SearchQueryEventMap {
  @scala.inline
  def apply(completed: SearchQueryCompletedEvent, founditems: SearchQueryFounditemsEvent): SearchQueryEventMap = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], founditems = founditems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQueryEventMap]
  }
  @scala.inline
  implicit class SearchQueryEventMapOps[Self <: SearchQueryEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompleted(value: SearchQueryCompletedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFounditems(value: SearchQueryFounditemsEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("founditems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

