package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the index bar is clicked by the user.
		 */
@js.native
trait TableViewIndexclickEvent extends TableViewBaseEvent {
  /**
  			 * The index number clicked.
  			 */
  var index: Double = js.native
  /**
  			 * The title of the index clicked.
  			 */
  var title: String = js.native
}

object TableViewIndexclickEvent {
  @scala.inline
  def apply(index: Double, source: TableView, title: String): TableViewIndexclickEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewIndexclickEvent]
  }
  @scala.inline
  implicit class TableViewIndexclickEventOps[Self <: TableViewIndexclickEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

