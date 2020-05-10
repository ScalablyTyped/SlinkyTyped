package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object that represents an index entry in a `ListView`.
  */
@js.native
trait ListViewIndexEntry extends js.Object {
  /**
  	 * Section index associated with this title.
  	 */
  var index: js.UndefOr[Double] = js.native
  /**
  	 * Title to display in the index bar.
  	 */
  var title: js.UndefOr[java.lang.String] = js.native
}

object ListViewIndexEntry {
  @scala.inline
  def apply(): ListViewIndexEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewIndexEntry]
  }
  @scala.inline
  implicit class ListViewIndexEntryOps[Self <: ListViewIndexEntry] (val x: Self) extends AnyVal {
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

