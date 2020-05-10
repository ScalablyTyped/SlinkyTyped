package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The contents of the current table's header. */
@js.native
trait TableHeaders extends js.Object {
  /** The unique ID of the cell in the current table. */
  var cell_id: js.UndefOr[String] = js.native
  /** The `begin` index of this cell's `column` location in the current table. */
  var column_index_begin: js.UndefOr[Double] = js.native
  /** The `end` index of this cell's `column` location in the current table. */
  var column_index_end: js.UndefOr[Double] = js.native
  /** The location of the table header cell in the current table as defined by its `begin` and `end` offsets, respectfully, in the input document. */
  var location: js.UndefOr[js.Object] = js.native
  /** The `begin` index of this cell's `row` location in the current table. */
  var row_index_begin: js.UndefOr[Double] = js.native
  /** The `end` index of this cell's `row` location in the current table. */
  var row_index_end: js.UndefOr[Double] = js.native
  /** The textual contents of the cell from the input document without associated markup content. */
  var text: js.UndefOr[String] = js.native
}

object TableHeaders {
  @scala.inline
  def apply(): TableHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHeaders]
  }
  @scala.inline
  implicit class TableHeadersOps[Self <: TableHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCell_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCell_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell_id")(js.undefined)
        ret
    }
    @scala.inline
    def withColumn_index_begin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_index_begin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn_index_begin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_index_begin")(js.undefined)
        ret
    }
    @scala.inline
    def withColumn_index_end(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_index_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn_index_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_index_end")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withRow_index_begin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row_index_begin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow_index_begin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row_index_begin")(js.undefined)
        ret
    }
    @scala.inline
    def withRow_index_end(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row_index_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow_index_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row_index_end")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

