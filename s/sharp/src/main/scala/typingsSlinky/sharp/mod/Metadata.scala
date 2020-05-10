package typingsSlinky.sharp.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends WriteableMetadata {
  /** Number of bands e.g. 3 for sRGB, 4 for CMYK */
  var channels: js.UndefOr[Channels] = js.native
  /** String containing JPEG chroma subsampling, 4:2:0 or 4:4:4 for RGB, 4:2:0:4 or 4:4:4:4 for CMYK */
  var chromaSubsampling: String = js.native
  /** Delay in ms between each page in an animated image, provided as an array of integers. */
  var delay: js.UndefOr[js.Array[Double]] = js.native
  /** Number of pixels per inch (DPI), if present */
  var density: js.UndefOr[Double] = js.native
  /** Name of pixel depth format e.g. uchar, char, ushort, float ... */
  var depth: js.UndefOr[String] = js.native
  /** Buffer containing raw EXIF data, if present */
  var exif: js.UndefOr[Buffer] = js.native
  /** Name of decoder used to decompress image data e.g. jpeg, png, webp, gif, svg */
  var format: js.UndefOr[String] = js.native
  /** Boolean indicating the presence of an alpha transparency channel */
  var hasAlpha: js.UndefOr[Boolean] = js.native
  /** Boolean indicating the presence of an embedded ICC profile */
  var hasProfile: js.UndefOr[Boolean] = js.native
  /** Number of pixels high (EXIF orientation is not taken into consideration) */
  var height: js.UndefOr[Double] = js.native
  /** Buffer containing raw ICC profile data, if present */
  var icc: js.UndefOr[Buffer] = js.native
  /** Buffer containing raw IPTC data, if present */
  var iptc: js.UndefOr[Buffer] = js.native
  /** Boolean indicating whether the image is interlaced using a progressive scan */
  var isProgressive: js.UndefOr[Boolean] = js.native
  /** Number of times to loop an animated image, zero refers to a continuous loop. */
  var loop: js.UndefOr[Double] = js.native
  /** Number of pixels high each page in a multi-page image will be. */
  var pageHeight: js.UndefOr[Double] = js.native
  /**  Number of the primary page in a HEIF image */
  var pagePrimary: js.UndefOr[Double] = js.native
  /** Number of pages/frames contained within the image, with support for TIFF, HEIF, PDF, animated GIF and animated WebP */
  var pages: js.UndefOr[Double] = js.native
  /** Total size of image in bytes, for Stream and Buffer input only */
  var size: js.UndefOr[Double] = js.native
  /** Name of colour space interpretation e.g. srgb, rgb, cmyk, lab, b-w ... */
  var space: js.UndefOr[String] = js.native
  /** Buffer containing raw TIFFTAG_PHOTOSHOP data, if present */
  var tifftagPhotoshop: js.UndefOr[Buffer] = js.native
  /** Number of pixels wide (EXIF orientation is not taken into consideration) */
  var width: js.UndefOr[Double] = js.native
  /** Buffer containing raw XMP data, if present */
  var xmp: js.UndefOr[Buffer] = js.native
}

object Metadata {
  @scala.inline
  def apply(chromaSubsampling: String): Metadata = {
    val __obj = js.Dynamic.literal(chromaSubsampling = chromaSubsampling.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
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
    def withChannels(value: Channels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("density")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDensity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("density")(js.undefined)
        ret
    }
    @scala.inline
    def withDepth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withExif(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exif")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExif: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exif")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHasAlpha(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withHasProfile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIcc(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icc")(js.undefined)
        ret
    }
    @scala.inline
    def withIptc(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iptc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIptc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iptc")(js.undefined)
        ret
    }
    @scala.inline
    def withIsProgressive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProgressive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsProgressive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProgressive")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withPageHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPagePrimary(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagePrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagePrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagePrimary")(js.undefined)
        ret
    }
    @scala.inline
    def withPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.undefined)
        ret
    }
    @scala.inline
    def withTifftagPhotoshop(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tifftagPhotoshop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTifftagPhotoshop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tifftagPhotoshop")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withXmp(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmp")(js.undefined)
        ret
    }
  }
  
}

