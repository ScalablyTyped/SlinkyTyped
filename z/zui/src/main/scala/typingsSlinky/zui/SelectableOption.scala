package typingsSlinky.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectableOption extends js.Object {
  var clickBehavior: js.UndefOr[String] = js.native
  var finish: js.UndefOr[js.Function1[/* e */ js.UndefOr[SelectableEvent], Unit]] = js.native
  var ignoreVal: js.UndefOr[Double] = js.native
  var mouseButton: js.UndefOr[String] = js.native
  var rangeStyle: js.UndefOr[String | js.Object] = js.native
  var select: js.UndefOr[js.Function1[/* e */ js.UndefOr[SelectableEvent], Unit]] = js.native
  var selector: js.UndefOr[String] = js.native
  var start: js.UndefOr[js.Function1[/* e */ js.UndefOr[SelectableEvent], Boolean]] = js.native
  var trigger: js.UndefOr[String] = js.native
  var unselect: js.UndefOr[js.Function1[/* e */ js.UndefOr[SelectableEvent], Unit]] = js.native
}

object SelectableOption {
  @scala.inline
  def apply(): SelectableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectableOption]
  }
  @scala.inline
  implicit class SelectableOptionOps[Self <: SelectableOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickBehavior(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withFinish(value: /* e */ js.UndefOr[SelectableEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFinish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreVal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreVal")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeStyle(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: /* e */ js.UndefOr[SelectableEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: /* e */ js.UndefOr[SelectableEvent] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselect(value: /* e */ js.UndefOr[SelectableEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselect")(js.undefined)
        ret
    }
  }
  
}

