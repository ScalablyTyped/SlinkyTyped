package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.UI.TableViewRow
import typingsSlinky.titanium.Titanium.UI.TableViewSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments for the <Titanium.UI.TableView.rowsselected> event.
  */
@js.native
trait SelectedRowObject extends js.Object {
  /**
  	 * Row index.
  	 */
  var index: js.UndefOr[Double] = js.native
  /**
  	 * Table view row object.
  	 */
  var row: js.UndefOr[TableViewRow] = js.native
  /**
  	 * Properties of the row. Use this property rather than `row` to access any custom row properties.
  	 */
  var rowData: js.UndefOr[Dictionary[TableViewRow]] = js.native
  /**
  	 * Table view section object, if the clicked row is contained in a section.
  	 */
  var section: js.UndefOr[TableViewSection] = js.native
}

object SelectedRowObject {
  @scala.inline
  def apply(): SelectedRowObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedRowObject]
  }
  @scala.inline
  implicit class SelectedRowObjectOps[Self <: SelectedRowObject] (val x: Self) extends AnyVal {
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
    def withRow(value: TableViewRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(js.undefined)
        ret
    }
    @scala.inline
    def withRowData(value: Dictionary[TableViewRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(js.undefined)
        ret
    }
    @scala.inline
    def withSection(value: TableViewSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(js.undefined)
        ret
    }
  }
  
}

