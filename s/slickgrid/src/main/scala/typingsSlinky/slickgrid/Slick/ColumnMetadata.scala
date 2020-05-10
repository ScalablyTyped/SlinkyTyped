package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnMetadata[T /* <: SlickData */] extends js.Object {
  /**
  		 * Number of columns this cell will span. Can also contain "*" to indicate that the cell should span the rest of the row.
  		 */
  var colspan: js.UndefOr[Double | String] = js.native
  /**
  		 * A custom cell editor.
  		 */
  var editor: js.UndefOr[js.Any] = js.native
  /**
  		 * Whether or not a cell can be set as "active".
  		 */
  var focusable: js.UndefOr[Boolean] = js.native
  /**
  		 * A custom cell formatter.
  		 */
  var formatter: js.UndefOr[Formatter[T]] = js.native
  /**
  		 * Whether or not a cell can be selected.
  		 */
  var selectable: js.UndefOr[Boolean] = js.native
}

object ColumnMetadata {
  @scala.inline
  def apply[T](): ColumnMetadata[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnMetadata[T]]
  }
  @scala.inline
  implicit class ColumnMetadataOps[Self[t] <: ColumnMetadata[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withColspan(value: Double | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colspan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColspan: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colspan")(js.undefined)
        ret
    }
    @scala.inline
    def withEditor(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(js.undefined)
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
    def withFormatter(
      value: (/* row */ Double, /* cell */ Double, /* value */ js.Any, /* columnDef */ Column[T], /* dataContext */ SlickData) => String
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutFormatter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
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

