package typingsSlinky.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PngOptions extends js.Object {
  /** use adaptive row filtering (optional, default false) */
  var adaptiveFiltering: js.UndefOr[Boolean] = js.native
  /** Alternative Spelling of "colours". Maximum number of palette entries, requires libimagequant (optional, default 256) */
  var colors: js.UndefOr[Double] = js.native
  /** Maximum number of palette entries, requires libimagequant (optional, default 256) */
  var colours: js.UndefOr[Double] = js.native
  /** zlib compression level, 0-9 (optional, default 9) */
  var compressionLevel: js.UndefOr[Double] = js.native
  /**  Level of Floyd-Steinberg error diffusion, requires libimagequant (optional, default 1.0) */
  var dither: js.UndefOr[Double] = js.native
  /** Force PNG output, otherwise attempt to use input format (optional, default  true) */
  var force: js.UndefOr[Boolean] = js.native
  /** Quantise to a palette-based image with alpha transparency support, requires libimagequant (optional, default false) */
  var palette: js.UndefOr[Boolean] = js.native
  /** Use progressive (interlace) scan (optional, default false) */
  var progressive: js.UndefOr[Boolean] = js.native
  /** use the lowest number of colours needed to achieve given quality, requires libimagequant (optional, default `100`) */
  var quality: js.UndefOr[Double] = js.native
}

object PngOptions {
  @scala.inline
  def apply(): PngOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PngOptions]
  }
  @scala.inline
  implicit class PngOptionsOps[Self <: PngOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdaptiveFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptiveFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withColours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colours")(js.undefined)
        ret
    }
    @scala.inline
    def withCompressionLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressionLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withDither(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dither")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDither: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dither")(js.undefined)
        ret
    }
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withPalette(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPalette: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressive")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
  }
  
}

