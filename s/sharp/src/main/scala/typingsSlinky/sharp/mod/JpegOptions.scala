package typingsSlinky.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JpegOptions extends OutputOptions {
  /** Set to '4:4:4' to prevent chroma subsampling when quality <= 90 (optional, default '4:2:0') */
  var chromaSubsampling: js.UndefOr[String] = js.native
  /** Optimise Huffman coding tables (optional, default true) */
  var optimiseCoding: js.UndefOr[Boolean] = js.native
  /** Optimise progressive scans, forces progressive, requires mozjpeg (optional, default false) */
  var optimiseScans: js.UndefOr[Boolean] = js.native
  /** Alternative spelling of optimiseCoding (optional, default true) */
  var optimizeCoding: js.UndefOr[Boolean] = js.native
  /** Alternative spelling of optimiseScans (optional, default false) */
  var optimizeScans: js.UndefOr[Boolean] = js.native
  /** Apply overshoot deringing, requires mozjpeg (optional, default  false) */
  var overshootDeringing: js.UndefOr[Boolean] = js.native
  /** Use progressive (interlace) scan (optional, default false) */
  var progressive: js.UndefOr[Boolean] = js.native
  /** Quantization table to use, integer 0-8, requires mozjpeg (optional, default 0) */
  var quantisationTable: js.UndefOr[Double] = js.native
  /** Alternative spelling of quantisationTable (optional, default 0) */
  var quantizationTable: js.UndefOr[Double] = js.native
  /** Apply trellis quantisation, requires mozjpeg (optional, default  false) */
  var trellisQuantisation: js.UndefOr[Boolean] = js.native
}

object JpegOptions {
  @scala.inline
  def apply(): JpegOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JpegOptions]
  }
  @scala.inline
  implicit class JpegOptionsOps[Self <: JpegOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChromaSubsampling(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromaSubsampling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromaSubsampling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromaSubsampling")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimiseCoding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimiseCoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimiseCoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimiseCoding")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimiseScans(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimiseScans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimiseScans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimiseScans")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizeCoding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeCoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizeCoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeCoding")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizeScans(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeScans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizeScans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeScans")(js.undefined)
        ret
    }
    @scala.inline
    def withOvershootDeringing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overshootDeringing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOvershootDeringing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overshootDeringing")(js.undefined)
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
    def withQuantisationTable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantisationTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantisationTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantisationTable")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantizationTable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantizationTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantizationTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantizationTable")(js.undefined)
        ret
    }
    @scala.inline
    def withTrellisQuantisation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trellisQuantisation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrellisQuantisation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trellisQuantisation")(js.undefined)
        ret
    }
  }
  
}

