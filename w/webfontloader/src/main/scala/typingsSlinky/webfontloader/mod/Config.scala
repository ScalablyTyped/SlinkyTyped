package typingsSlinky.webfontloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /** This event is triggered when the fonts have rendered. */
  var active: js.UndefOr[js.Function0[Unit]] = js.native
  /** Setting this to false will disable html classes (defaults to true) */
  var classes: js.UndefOr[Boolean] = js.native
  /** Child window or iframes to manage fonts for */
  var context: js.UndefOr[js.Array[String]] = js.native
  var custom: js.UndefOr[Custom] = js.native
  /** Settings this to false will disable callbacks/events (defaults to true) */
  var events: js.UndefOr[Boolean] = js.native
  /** This event is triggered once for each font that renders. */
  var fontactive: js.UndefOr[js.Function2[/* familyName */ String, /* fvd */ String, Unit]] = js.native
  var fontdeck: js.UndefOr[Fontdeck] = js.native
  /** This event is triggered if the font can't be loaded. */
  var fontinactive: js.UndefOr[js.Function2[/* familyName */ String, /* fvd */ String, Unit]] = js.native
  /** This event is triggered once for each font that's loaded. */
  var fontloading: js.UndefOr[js.Function2[/* familyName */ String, /* fvd */ String, Unit]] = js.native
  var google: js.UndefOr[Google] = js.native
  /** This event is triggered when the browser does not support linked fonts or if none of the fonts could be loaded. */
  var inactive: js.UndefOr[js.Function0[Unit]] = js.native
  /** This event is triggered when all fonts have been requested. */
  var loading: js.UndefOr[js.Function0[Unit]] = js.native
  var monotype: js.UndefOr[Monotype] = js.native
  /** Time (in ms) until the fontinactive callback will be triggered (defaults to 5000) */
  var timeout: js.UndefOr[Double] = js.native
  var typekit: js.UndefOr[Typekit] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withClasses(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom(value: Custom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withFontactive(value: (/* familyName */ String, /* fvd */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontactive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFontactive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontactive")(js.undefined)
        ret
    }
    @scala.inline
    def withFontdeck(value: Fontdeck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontdeck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontdeck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontdeck")(js.undefined)
        ret
    }
    @scala.inline
    def withFontinactive(value: (/* familyName */ String, /* fvd */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontinactive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFontinactive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontinactive")(js.undefined)
        ret
    }
    @scala.inline
    def withFontloading(value: (/* familyName */ String, /* fvd */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontloading")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFontloading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontloading")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogle(value: Google): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("google")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("google")(js.undefined)
        ret
    }
    @scala.inline
    def withInactive(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInactive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactive")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withMonotype(value: Monotype): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monotype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonotype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monotype")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTypekit(value: Typekit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typekit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypekit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typekit")(js.undefined)
        ret
    }
  }
  
}

