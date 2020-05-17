package typingsSlinky.tinySliderReact.mod

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TinySliderProps extends js.Object {
  var onClick: js.UndefOr[
    js.Function3[/* slideClicked */ Double, /* info */ String, /* event */ Event, Unit]
  ] = js.native
  var onIndexChanged: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.native
  var onTouchEnd: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.native
  var onTouchMove: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.native
  var onTouchStart: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.native
  var onTransitionEnd: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.native
  var onTransitionStart: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.native
  var settings: js.UndefOr[TinySliderSettings] = js.native
  var startIndex: js.UndefOr[Double] = js.native
}

object TinySliderProps {
  @scala.inline
  def apply(): TinySliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TinySliderProps]
  }
  @scala.inline
  implicit class TinySliderPropsOps[Self <: TinySliderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClick(value: (/* slideClicked */ Double, /* info */ String, /* event */ Event) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIndexChanged(value: /* info */ TinySliderInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIndexChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIndexChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIndexChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEnd(value: /* info */ TinySliderInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchMove(value: /* info */ TinySliderInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchStart(value: /* info */ TinySliderInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitionEnd(value: /* info */ TinySliderInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTransitionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitionStart(value: /* info */ TinySliderInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTransitionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: TinySliderSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(js.undefined)
        ret
    }
  }
  
}

