package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object that represents an index entry in a `TableView`.
  */
@js.native
trait TableViewIndexEntry extends js.Object {
  /**
  	 * Row index associated with this item.
  	 */
  var index: js.UndefOr[Double] = js.native
  /**
  	 * Title to display in the index bar for this item.
  	 */
  var title: js.UndefOr[java.lang.String] = js.native
}

object TableViewIndexEntry {
  @scala.inline
  def apply(): TableViewIndexEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableViewIndexEntry]
  }
  @scala.inline
  implicit class TableViewIndexEntryOps[Self <: TableViewIndexEntry] (val x: Self) extends AnyVal {
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
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

