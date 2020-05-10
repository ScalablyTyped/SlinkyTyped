package typingsSlinky.soundmanager2.soundmanager

import typingsSlinky.soundmanager2.soundmanager2Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flash9Options extends js.Object {
  var isMovieStar: js.UndefOr[`true` | Null] = js.native
  var onbufferchange: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var ondataerror: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var onfailure: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var useEQData: js.UndefOr[Boolean] = js.native
  var usePeakData: js.UndefOr[Boolean] = js.native
  var useWaveformData: js.UndefOr[Boolean] = js.native
}

object Flash9Options {
  @scala.inline
  def apply(): Flash9Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flash9Options]
  }
  @scala.inline
  implicit class Flash9OptionsOps[Self <: Flash9Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsMovieStar(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMovieStar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMovieStar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMovieStar")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMovieStarNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMovieStar")(null)
        ret
    }
    @scala.inline
    def withOnbufferchange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbufferchange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnbufferchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbufferchange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnbufferchangeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onbufferchange")(null)
        ret
    }
    @scala.inline
    def withOndataerror(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondataerror")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOndataerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondataerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOndataerrorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondataerror")(null)
        ret
    }
    @scala.inline
    def withOnfailure(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfailure")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnfailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfailure")(js.undefined)
        ret
    }
    @scala.inline
    def withOnfailureNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfailure")(null)
        ret
    }
    @scala.inline
    def withUseEQData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEQData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseEQData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEQData")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePeakData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePeakData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePeakData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePeakData")(js.undefined)
        ret
    }
    @scala.inline
    def withUseWaveformData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWaveformData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseWaveformData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWaveformData")(js.undefined)
        ret
    }
  }
  
}

