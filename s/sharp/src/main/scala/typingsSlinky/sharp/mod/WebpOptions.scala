package typingsSlinky.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpOptions extends OutputOptions {
  /** Quality of alpha layer, number from 0-100 (optional, default 100) */
  var alphaQuality: js.UndefOr[Double] = js.native
  /** Use lossless compression mode (optional, default false) */
  var lossless: js.UndefOr[Boolean] = js.native
  /** Use near_lossless compression mode (optional, default false) */
  var nearLossless: js.UndefOr[Boolean] = js.native
  /** Level of CPU effort to reduce file size, integer 0-6 (optional, default 4) */
  var reductionEffort: js.UndefOr[Double] = js.native
  /** Use high quality chroma subsampling (optional, default false) */
  var smartSubsample: js.UndefOr[Boolean] = js.native
}

object WebpOptions {
  @scala.inline
  def apply(): WebpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpOptions]
  }
  @scala.inline
  implicit class WebpOptionsOps[Self <: WebpOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlphaQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphaQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaQuality")(js.undefined)
        ret
    }
    @scala.inline
    def withLossless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lossless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLossless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lossless")(js.undefined)
        ret
    }
    @scala.inline
    def withNearLossless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearLossless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNearLossless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearLossless")(js.undefined)
        ret
    }
    @scala.inline
    def withReductionEffort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reductionEffort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReductionEffort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reductionEffort")(js.undefined)
        ret
    }
    @scala.inline
    def withSmartSubsample(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartSubsample")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmartSubsample: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartSubsample")(js.undefined)
        ret
    }
  }
  
}

