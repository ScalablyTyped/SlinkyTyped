package typingsSlinky.scrollbooster

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.scrollbooster.mod.ScrollingState
import typingsSlinky.scrollbooster.scrollboosterStrings.all
import typingsSlinky.scrollbooster.scrollboosterStrings.horizontal
import typingsSlinky.scrollbooster.scrollboosterStrings.mouse
import typingsSlinky.scrollbooster.scrollboosterStrings.native
import typingsSlinky.scrollbooster.scrollboosterStrings.touch
import typingsSlinky.scrollbooster.scrollboosterStrings.transform
import typingsSlinky.scrollbooster.scrollboosterStrings.vertical
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<scrollbooster.scrollbooster.ScrollBoosterOptions> */
@js.native
trait PartialScrollBoosterOptio extends js.Object {
  var bounce: js.UndefOr[Boolean] = js.native
  var bounceForce: js.UndefOr[Double] = js.native
  var content: js.UndefOr[HTMLElement] = js.native
  var direction: js.UndefOr[horizontal | vertical | all] = js.native
  var emulateScroll: js.UndefOr[Boolean] = js.native
  var friction: js.UndefOr[Double] = js.native
  var inputsFocus: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[js.Function2[/* state */ ScrollingState, /* event */ Event_, Unit]] = js.native
  var onUpdate: js.UndefOr[js.Function1[/* state */ ScrollingState, Unit]] = js.native
  var pointerMode: js.UndefOr[touch | mouse | all] = js.native
  var scrollMode: js.UndefOr[transform | native] = js.native
  var shouldScroll: js.UndefOr[js.Function2[/* state */ ScrollingState, /* event */ Event_, Boolean]] = js.native
  var textSelection: js.UndefOr[Boolean] = js.native
  var viewport: js.UndefOr[HTMLElement] = js.native
}

object PartialScrollBoosterOptio {
  @scala.inline
  def apply(): PartialScrollBoosterOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScrollBoosterOptio]
  }
  @scala.inline
  implicit class PartialScrollBoosterOptioOps[Self <: PartialScrollBoosterOptio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounce")(js.undefined)
        ret
    }
    @scala.inline
    def withBounceForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounceForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceForce")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: horizontal | vertical | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withEmulateScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emulateScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmulateScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emulateScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(js.undefined)
        ret
    }
    @scala.inline
    def withInputsFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputsFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputsFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputsFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: (/* state */ ScrollingState, /* event */ Event_) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: /* state */ ScrollingState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerMode(value: touch | mouse | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerMode")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollMode(value: transform | native): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollMode")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldScroll(value: (/* state */ ScrollingState, /* event */ Event_) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldScroll")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutShouldScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withTextSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withViewport(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(js.undefined)
        ret
    }
  }
  
}

