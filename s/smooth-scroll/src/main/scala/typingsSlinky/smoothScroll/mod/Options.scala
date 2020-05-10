package typingsSlinky.smoothScroll.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var clip: js.UndefOr[Boolean] = js.native
  var customEasing: js.UndefOr[js.Function1[/* time */ Double, Double]] = js.native
  var durationMax: js.UndefOr[Double | Null] = js.native
  var durationMin: js.UndefOr[Double | Null] = js.native
  var easing: js.UndefOr[Easing] = js.native
  // Custom Events
  var emitEvents: js.UndefOr[Boolean] = js.native
  var header: js.UndefOr[String] = js.native
  // Selectors
  var ignore: js.UndefOr[String] = js.native
  var offset: js.UndefOr[
    Double | (js.Function2[
      /* anchor */ js.UndefOr[Element | Double | Null], 
      /* toggle */ js.UndefOr[Element | Null], 
      Double
    ])
  ] = js.native
  var popstate: js.UndefOr[Boolean] = js.native
  // Speed & Easing
  var speed: js.UndefOr[Double] = js.native
  var speedAsDuration: js.UndefOr[Boolean] = js.native
  var topOnEmptyHash: js.UndefOr[Boolean] = js.native
  // History
  var updateURL: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomEasing(value: /* time */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEasing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMax")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationMaxNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMax")(null)
        ret
    }
    @scala.inline
    def withDurationMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMin")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationMinNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMin")(null)
        ret
    }
    @scala.inline
    def withEasing(value: Easing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withEmitEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetFunction2(
      value: (/* anchor */ js.UndefOr[Element | Double | Null], /* toggle */ js.UndefOr[Element | Null]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOffset(
      value: Double | (js.Function2[
          /* anchor */ js.UndefOr[Element | Double | Null], 
          /* toggle */ js.UndefOr[Element | Null], 
          Double
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPopstate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popstate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopstate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popstate")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeedAsDuration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedAsDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeedAsDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedAsDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTopOnEmptyHash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topOnEmptyHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopOnEmptyHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topOnEmptyHash")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateURL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateURL")(js.undefined)
        ret
    }
  }
  
}

