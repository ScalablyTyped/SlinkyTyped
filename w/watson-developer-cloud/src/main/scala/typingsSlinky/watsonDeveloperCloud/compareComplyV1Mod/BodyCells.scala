package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Cells that are not table header, column header, or row header cells. */
@js.native
trait BodyCells extends js.Object {
  var attributes: js.UndefOr[js.Array[Attribute]] = js.native
  /** The unique ID of the cell in the current table. */
  var cell_id: js.UndefOr[String] = js.native
  var column_header_ids: js.UndefOr[js.Array[ColumnHeaderIds]] = js.native
  var column_header_texts: js.UndefOr[js.Array[ColumnHeaderTexts]] = js.native
  var column_header_texts_normalized: js.UndefOr[js.Array[ColumnHeaderTextsNormalized]] = js.native
  /** The `begin` index of this cell's `column` location in the current table. */
  var column_index_begin: js.UndefOr[Double] = js.native
  /** The `end` index of this cell's `column` location in the current table. */
  var column_index_end: js.UndefOr[Double] = js.native
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.native
  var row_header_ids: js.UndefOr[js.Array[RowHeaderIds]] = js.native
  var row_header_texts: js.UndefOr[js.Array[RowHeaderTexts]] = js.native
  var row_header_texts_normalized: js.UndefOr[js.Array[RowHeaderTextsNormalized]] = js.native
  /** The `begin` index of this cell's `row` location in the current table. */
  var row_index_begin: js.UndefOr[Double] = js.native
  /** The `end` index of this cell's `row` location in the current table. */
  var row_index_end: js.UndefOr[Double] = js.native
  /** The textual contents of this cell from the input document without associated markup content. */
  var text: js.UndefOr[String] = js.native
}

object BodyCells {
  @scala.inline
  def apply(): BodyCells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyCells]
  }
  @scala.inline
  implicit class BodyCellsOps[Self <: BodyCells] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Array[Attribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
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
    def withColumn_header_ids(value: js.Array[ColumnHeaderIds]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_header_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn_header_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_header_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withColumn_header_texts(value: js.Array[ColumnHeaderTexts]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_header_texts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn_header_texts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_header_texts")(js.undefined)
        ret
    }
    @scala.inline
    def withColumn_header_texts_normalized(value: js.Array[ColumnHeaderTextsNormalized]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_header_texts_normalized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn_header_texts_normalized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_header_texts_normalized")(js.undefined)
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
    def withRow_header_ids(value: js.Array[RowHeaderIds]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row_header_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow_header_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row_header_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withRow_header_texts(value: js.Array[RowHeaderTexts]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row_header_texts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow_header_texts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row_header_texts")(js.undefined)
        ret
    }
    @scala.inline
    def withRow_header_texts_normalized(value: js.Array[RowHeaderTextsNormalized]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row_header_texts_normalized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow_header_texts_normalized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row_header_texts_normalized")(js.undefined)
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

