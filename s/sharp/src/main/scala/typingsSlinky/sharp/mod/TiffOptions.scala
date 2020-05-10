package typingsSlinky.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TiffOptions extends OutputOptions {
  /** Compression options: lzw, deflate, jpeg, ccittfax4 (optional, default 'jpeg') */
  var compression: js.UndefOr[String] = js.native
  /** Compression predictor options: none, horizontal, float (optional, default 'horizontal') */
  var predictor: js.UndefOr[String] = js.native
  /** Squash 8-bit images down to 1 bit (optional, default false) */
  var squash: js.UndefOr[Boolean] = js.native
  /** Horizontal resolution in pixels/mm (optional, default 1.0) */
  var xres: js.UndefOr[Double] = js.native
  /** Vertical resolution in pixels/mm (optional, default 1.0) */
  var yres: js.UndefOr[Double] = js.native
}

object TiffOptions {
  @scala.inline
  def apply(): TiffOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TiffOptions]
  }
  @scala.inline
  implicit class TiffOptionsOps[Self <: TiffOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withPredictor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predictor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredictor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predictor")(js.undefined)
        ret
    }
    @scala.inline
    def withSquash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("squash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSquash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("squash")(js.undefined)
        ret
    }
    @scala.inline
    def withXres(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xres")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXres: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xres")(js.undefined)
        ret
    }
    @scala.inline
    def withYres(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yres")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYres: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yres")(js.undefined)
        ret
    }
  }
  
}

