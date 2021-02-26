package typingsSlinky.sharp.mod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: Channels): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    @scala.inline
    def setChromaSubsampling(value: String): Self = StObject.set(x, "chromaSubsampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: js.Array[Double]): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDelayVarargs(value: Double*): Self = StObject.set(x, "delay", js.Array(value :_*))
    
    @scala.inline
    def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    @scala.inline
    def setDepth(value: String): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setExif(value: Buffer): Self = StObject.set(x, "exif", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExifUndefined: Self = StObject.set(x, "exif", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHasAlpha(value: Boolean): Self = StObject.set(x, "hasAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAlphaUndefined: Self = StObject.set(x, "hasAlpha", js.undefined)
    
    @scala.inline
    def setHasProfile(value: Boolean): Self = StObject.set(x, "hasProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasProfileUndefined: Self = StObject.set(x, "hasProfile", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIcc(value: Buffer): Self = StObject.set(x, "icc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIccUndefined: Self = StObject.set(x, "icc", js.undefined)
    
    @scala.inline
    def setIptc(value: Buffer): Self = StObject.set(x, "iptc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIptcUndefined: Self = StObject.set(x, "iptc", js.undefined)
    
    @scala.inline
    def setIsProgressive(value: Boolean): Self = StObject.set(x, "isProgressive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsProgressiveUndefined: Self = StObject.set(x, "isProgressive", js.undefined)
    
    @scala.inline
    def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setPageHeight(value: Double): Self = StObject.set(x, "pageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageHeightUndefined: Self = StObject.set(x, "pageHeight", js.undefined)
    
    @scala.inline
    def setPagePrimary(value: Double): Self = StObject.set(x, "pagePrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagePrimaryUndefined: Self = StObject.set(x, "pagePrimary", js.undefined)
    
    @scala.inline
    def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    @scala.inline
    def setTifftagPhotoshop(value: Buffer): Self = StObject.set(x, "tifftagPhotoshop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTifftagPhotoshopUndefined: Self = StObject.set(x, "tifftagPhotoshop", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setXmp(value: Buffer): Self = StObject.set(x, "xmp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmpUndefined: Self = StObject.set(x, "xmp", js.undefined)
  }
}
