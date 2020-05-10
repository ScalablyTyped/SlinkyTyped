package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyBinding extends js.Object {
  var copyToClipboard: js.UndefOr[String | Boolean] = js.native
  var navDown: js.UndefOr[String | Boolean] = js.native
  var navLeft: js.UndefOr[String | Boolean] = js.native
  var navNext: js.UndefOr[String | Boolean] = js.native
  var navPrev: js.UndefOr[String | Boolean] = js.native
  var navRight: js.UndefOr[String | Boolean] = js.native
  var navUp: js.UndefOr[String | Boolean] = js.native
  var redo: js.UndefOr[String | Boolean] = js.native
  var scrollPageDown: js.UndefOr[String | Boolean] = js.native
  var scrollPageUp: js.UndefOr[String | Boolean] = js.native
  var scrollToEnd: js.UndefOr[String | Boolean] = js.native
  var scrollToStart: js.UndefOr[String | Boolean] = js.native
  var undo: js.UndefOr[String | Boolean] = js.native
}

object KeyBinding {
  @scala.inline
  def apply(): KeyBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyBinding]
  }
  @scala.inline
  implicit class KeyBindingOps[Self <: KeyBinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyToClipboard(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyToClipboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyToClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyToClipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withNavDown(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navDown")(js.undefined)
        ret
    }
    @scala.inline
    def withNavLeft(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withNavNext(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navNext")(js.undefined)
        ret
    }
    @scala.inline
    def withNavPrev(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navPrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navPrev")(js.undefined)
        ret
    }
    @scala.inline
    def withNavRight(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navRight")(js.undefined)
        ret
    }
    @scala.inline
    def withNavUp(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navUp")(js.undefined)
        ret
    }
    @scala.inline
    def withRedo(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redo")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollPageDown(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPageDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollPageDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPageDown")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollPageUp(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPageUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollPageUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPageUp")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToEnd(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToStart(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToStart")(js.undefined)
        ret
    }
    @scala.inline
    def withUndo(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(js.undefined)
        ret
    }
  }
  
}

