package typingsSlinky.tablesorter.resizingOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizingOptions extends js.Object {
  /**
    * A value indicating whether column widths are saved locally.
    */
  var resizable: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether the last column should have a resize-handle.
    */
  var resizable_addLastColumn: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether the user can resize the columns inside the footer.
    */
  var resizable_includeFooter: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether always the last column should shrink when resizing.
    */
  var resizable_targetLast: js.UndefOr[Boolean] = js.native
  /**
    * The number of milliseconds to wait before raising the `mousemove`-event.
    */
  var resizable_throttle: js.UndefOr[Boolean | Double] = js.native
  /**
    * The initial widths of the columns.
    */
  var resizable_widths: js.UndefOr[js.Array[String]] = js.native
}

object ResizingOptions {
  @scala.inline
  def apply(): ResizingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizingOptions]
  }
  @scala.inline
  implicit class ResizingOptionsOps[Self <: ResizingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable_addLastColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable_addLastColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable_addLastColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable_addLastColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable_includeFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable_includeFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable_includeFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable_includeFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable_targetLast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable_targetLast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable_targetLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable_targetLast")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable_throttle(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable_throttle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable_throttle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable_throttle")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable_widths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable_widths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable_widths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable_widths")(js.undefined)
        ret
    }
  }
  
}

