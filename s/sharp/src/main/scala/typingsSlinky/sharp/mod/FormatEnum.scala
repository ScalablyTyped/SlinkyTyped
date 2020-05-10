package typingsSlinky.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatEnum extends js.Object {
  var dz: AvailableFormatInfo = js.native
  var fits: AvailableFormatInfo = js.native
  var gif: AvailableFormatInfo = js.native
  var input: AvailableFormatInfo = js.native
  var jpeg: AvailableFormatInfo = js.native
  var magick: AvailableFormatInfo = js.native
  var openslide: AvailableFormatInfo = js.native
  var pdf: AvailableFormatInfo = js.native
  var png: AvailableFormatInfo = js.native
  var ppm: AvailableFormatInfo = js.native
  var raw: AvailableFormatInfo = js.native
  var svg: AvailableFormatInfo = js.native
  var tiff: AvailableFormatInfo = js.native
  var v: AvailableFormatInfo = js.native
  var webp: AvailableFormatInfo = js.native
}

object FormatEnum {
  @scala.inline
  def apply(
    dz: AvailableFormatInfo,
    fits: AvailableFormatInfo,
    gif: AvailableFormatInfo,
    input: AvailableFormatInfo,
    jpeg: AvailableFormatInfo,
    magick: AvailableFormatInfo,
    openslide: AvailableFormatInfo,
    pdf: AvailableFormatInfo,
    png: AvailableFormatInfo,
    ppm: AvailableFormatInfo,
    raw: AvailableFormatInfo,
    svg: AvailableFormatInfo,
    tiff: AvailableFormatInfo,
    v: AvailableFormatInfo,
    webp: AvailableFormatInfo
  ): FormatEnum = {
    val __obj = js.Dynamic.literal(dz = dz.asInstanceOf[js.Any], fits = fits.asInstanceOf[js.Any], gif = gif.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], jpeg = jpeg.asInstanceOf[js.Any], magick = magick.asInstanceOf[js.Any], openslide = openslide.asInstanceOf[js.Any], pdf = pdf.asInstanceOf[js.Any], png = png.asInstanceOf[js.Any], ppm = ppm.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], tiff = tiff.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], webp = webp.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatEnum]
  }
  @scala.inline
  implicit class FormatEnumOps[Self <: FormatEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDz(value: AvailableFormatInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFits(value: AvailableFormatInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGif(value: AvailableFormatInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gif")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: AvailableFormatInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJpeg(value: AvailableFormatInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jpeg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMagick(value: AvailableFormatInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenslide(value: AvailableFormatInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openslide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPdf(value: AvailableFormatInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPng(value: AvailableFormatInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("png")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPpm(value: AvailableFormatInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ppm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: AvailableFormatInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSvg(value: AvailableFormatInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiff(value: AvailableFormatInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withV(value: AvailableFormatInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebp(value: AvailableFormatInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

