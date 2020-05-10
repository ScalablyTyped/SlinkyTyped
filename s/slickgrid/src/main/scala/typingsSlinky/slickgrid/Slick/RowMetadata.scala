package typingsSlinky.slickgrid.Slick

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowMetadata[T] extends js.Object {
  /**
  		 * Metadata related to individual columns
  		 */
  var columns: js.UndefOr[
    (/**
  			 * Metadata indexed by column id
  			 */
  StringDictionary[ColumnMetadata[T]]) with (/**
  			 * Metadata indexed by column index
  			 */
  NumberDictionary[ColumnMetadata[T]])
  ] = js.native
  /**
  		 * One or more (space-separated) CSS classes to be added to the entire row.
  		 */
  var cssClasses: js.UndefOr[String] = js.native
  /**
  		 * Whether or not any cells in the row can be set as "active".
  		 */
  var focusable: js.UndefOr[Boolean] = js.native
  /**
  		 * Whether or not a row or any cells in it can be selected.
  		 */
  var selectable: js.UndefOr[Boolean] = js.native
}

object RowMetadata {
  @scala.inline
  def apply[T](): RowMetadata[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowMetadata[T]]
  }
  @scala.inline
  implicit class RowMetadataOps[Self[t] <: RowMetadata[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withColumns(
      value: (/**
    			 * Metadata indexed by column id
    			 */
    StringDictionary[ColumnMetadata[T]]) with (/**
    			 * Metadata indexed by column index
    			 */
    NumberDictionary[ColumnMetadata[T]])
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClasses(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClasses: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusable")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
  }
  
}

