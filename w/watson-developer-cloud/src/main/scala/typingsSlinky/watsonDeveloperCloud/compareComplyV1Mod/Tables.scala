package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The contents of the tables extracted from a document. */
@js.native
trait Tables extends js.Object {
  /** An array of cells that are neither table header nor column header nor row header cells, of the current table with corresponding row and column header associations. */
  var body_cells: js.UndefOr[js.Array[BodyCells]] = js.native
  /** An array of column-level cells, each applicable as a header to other cells in the same column as itself, of the current table. */
  var column_headers: js.UndefOr[js.Array[ColumnHeaders]] = js.native
  /** An array of key-value pairs identified in the current table. */
  var key_value_pairs: js.UndefOr[js.Array[KeyValuePair]] = js.native
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.native
  /** An array of row-level cells, each applicable as a header to other cells in the same row as itself, of the current table. */
  var row_headers: js.UndefOr[js.Array[RowHeaders]] = js.native
  /** The table's section title, if identified. */
  var section_title: js.UndefOr[SectionTitle] = js.native
  /** An array of table-level cells that apply as headers to all the other cells in the current table. */
  var table_headers: js.UndefOr[js.Array[TableHeaders]] = js.native
  /** The textual contents of the current table from the input document without associated markup content. */
  var text: js.UndefOr[String] = js.native
}

object Tables {
  @scala.inline
  def apply(): Tables = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tables]
  }
  @scala.inline
  implicit class TablesOps[Self <: Tables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody_cells(value: js.Array[BodyCells]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body_cells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody_cells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body_cells")(js.undefined)
        ret
    }
    @scala.inline
    def withColumn_headers(value: js.Array[ColumnHeaders]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn_headers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_headers")(js.undefined)
        ret
    }
    @scala.inline
    def withKey_value_pairs(value: js.Array[KeyValuePair]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key_value_pairs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey_value_pairs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key_value_pairs")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
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
    def withRow_headers(value: js.Array[RowHeaders]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row_headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow_headers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row_headers")(js.undefined)
        ret
    }
    @scala.inline
    def withSection_title(value: SectionTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSection_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section_title")(js.undefined)
        ret
    }
    @scala.inline
    def withTable_headers(value: js.Array[TableHeaders]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable_headers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_headers")(js.undefined)
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

