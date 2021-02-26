package typingsSlinky.winrt.global.Windows.Graphics

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.PropertyType
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Imaging {
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapAlphaMode")
  @js.native
  object BitmapAlphaMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapAlphaMode with Double] = js.native
    
    /* 2 */ val ignore: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapAlphaMode.ignore with Double = js.native
    
    /* 0 */ val premultiplied: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapAlphaMode.premultiplied with Double = js.native
    
    /* 1 */ val straight: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapAlphaMode.straight with Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapCodecInformation")
  @js.native
  class BitmapCodecInformation ()
    extends typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapCodecInformation
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
  @js.native
  class BitmapDecoder ()
    extends typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapDecoder
  /* static members */
  object BitmapDecoder {
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.bmpDecoderId")
    @js.native
    def bmpDecoderId: String = js.native
    @scala.inline
    def bmpDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bmpDecoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.createAsync")
    @js.native
    def createAsync(decoderId: String, stream: IRandomAccessStream): IAsyncOperation[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapDecoder] = js.native
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.createAsync")
    @js.native
    def createAsync(stream: IRandomAccessStream): IAsyncOperation[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapDecoder] = js.native
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.getDecoderInformationEnumerator")
    @js.native
    def getDecoderInformationEnumerator(): IVectorView[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapCodecInformation] = js.native
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.gifDecoderId")
    @js.native
    def gifDecoderId: String = js.native
    @scala.inline
    def gifDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gifDecoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.icoDecoderId")
    @js.native
    def icoDecoderId: String = js.native
    @scala.inline
    def icoDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("icoDecoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.jpegDecoderId")
    @js.native
    def jpegDecoderId: String = js.native
    @scala.inline
    def jpegDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegDecoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.jpegXRDecoderId")
    @js.native
    def jpegXRDecoderId: String = js.native
    @scala.inline
    def jpegXRDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegXRDecoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.pngDecoderId")
    @js.native
    def pngDecoderId: String = js.native
    @scala.inline
    def pngDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pngDecoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.tiffDecoderId")
    @js.native
    def tiffDecoderId: String = js.native
    @scala.inline
    def tiffDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tiffDecoderId")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder")
  @js.native
  class BitmapEncoder ()
    extends typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapEncoder
  /* static members */
  object BitmapEncoder {
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.bmpEncoderId")
    @js.native
    def bmpEncoderId: String = js.native
    @scala.inline
    def bmpEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bmpEncoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.createAsync")
    @js.native
    def createAsync(encoderId: String, stream: IRandomAccessStream): IAsyncOperation[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapEncoder] = js.native
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.createAsync")
    @js.native
    def createAsync(
      encoderId: String,
      stream: IRandomAccessStream,
      encodingOptions: IIterable[
          IKeyValuePair[String, typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapTypedValue]
        ]
    ): IAsyncOperation[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapEncoder] = js.native
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.createForInPlacePropertyEncodingAsync")
    @js.native
    def createForInPlacePropertyEncodingAsync(bitmapDecoder: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapDecoder): IAsyncOperation[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapEncoder] = js.native
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.createForTranscodingAsync")
    @js.native
    def createForTranscodingAsync(
      stream: IRandomAccessStream,
      bitmapDecoder: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapDecoder
    ): IAsyncOperation[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapEncoder] = js.native
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.getEncoderInformationEnumerator")
    @js.native
    def getEncoderInformationEnumerator(): IVectorView[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapCodecInformation] = js.native
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.gifEncoderId")
    @js.native
    def gifEncoderId: String = js.native
    @scala.inline
    def gifEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gifEncoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.jpegEncoderId")
    @js.native
    def jpegEncoderId: String = js.native
    @scala.inline
    def jpegEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegEncoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.jpegXREncoderId")
    @js.native
    def jpegXREncoderId: String = js.native
    @scala.inline
    def jpegXREncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegXREncoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.pngEncoderId")
    @js.native
    def pngEncoderId: String = js.native
    @scala.inline
    def pngEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pngEncoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.tiffEncoderId")
    @js.native
    def tiffEncoderId: String = js.native
    @scala.inline
    def tiffEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tiffEncoderId")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapFlip")
  @js.native
  object BitmapFlip extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapFlip with Double] = js.native
    
    /* 1 */ val horizontal: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapFlip.horizontal with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapFlip.none with Double = js.native
    
    /* 2 */ val vertical: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapFlip.vertical with Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapFrame")
  @js.native
  class BitmapFrame ()
    extends typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapFrame
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapInterpolationMode")
  @js.native
  object BitmapInterpolationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode with Double] = js.native
    
    /* 2 */ val cubic: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode.cubic with Double = js.native
    
    /* 3 */ val fant: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode.fant with Double = js.native
    
    /* 1 */ val linear: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode.linear with Double = js.native
    
    /* 0 */ val nearestNeighbor: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode.nearestNeighbor with Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapPixelFormat")
  @js.native
  object BitmapPixelFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapPixelFormat with Double] = js.native
    
    /* 3 */ val bgra8: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapPixelFormat.bgra8 with Double = js.native
    
    /* 1 */ val rgba16: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapPixelFormat.rgba16 with Double = js.native
    
    /* 2 */ val rgba8: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapPixelFormat.rgba8 with Double = js.native
    
    /* 0 */ val unknown: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapPixelFormat.unknown with Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapProperties")
  @js.native
  class BitmapProperties ()
    extends typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapProperties
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapPropertiesView")
  @js.native
  class BitmapPropertiesView ()
    extends typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapPropertiesView
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapPropertySet")
  @js.native
  class BitmapPropertySet ()
    extends typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapPropertySet
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapRotation")
  @js.native
  object BitmapRotation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapRotation with Double] = js.native
    
    /* 2 */ val clockwise180Degrees: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapRotation.clockwise180Degrees with Double = js.native
    
    /* 3 */ val clockwise270Degrees: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapRotation.clockwise270Degrees with Double = js.native
    
    /* 1 */ val clockwise90Degrees: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapRotation.clockwise90Degrees with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapRotation.none with Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapTransform")
  @js.native
  class BitmapTransform ()
    extends typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapTransform
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapTypedValue")
  @js.native
  class BitmapTypedValue protected ()
    extends typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapTypedValue {
    def this(value: js.Any, `type`: PropertyType) = this()
  }
  
  @JSGlobal("Windows.Graphics.Imaging.ColorManagementMode")
  @js.native
  object ColorManagementMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Graphics.Imaging.ColorManagementMode with Double] = js.native
    
    /* 1 */ val colorManageToSRgb: typingsSlinky.winrt.Windows.Graphics.Imaging.ColorManagementMode.colorManageToSRgb with Double = js.native
    
    /* 0 */ val doNotColorManage: typingsSlinky.winrt.Windows.Graphics.Imaging.ColorManagementMode.doNotColorManage with Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.ExifOrientationMode")
  @js.native
  object ExifOrientationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Graphics.Imaging.ExifOrientationMode with Double] = js.native
    
    /* 0 */ val ignoreExifOrientation: typingsSlinky.winrt.Windows.Graphics.Imaging.ExifOrientationMode.ignoreExifOrientation with Double = js.native
    
    /* 1 */ val respectExifOrientation: typingsSlinky.winrt.Windows.Graphics.Imaging.ExifOrientationMode.respectExifOrientation with Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.ImageStream")
  @js.native
  class ImageStream ()
    extends typingsSlinky.winrt.Windows.Graphics.Imaging.ImageStream
  
  @JSGlobal("Windows.Graphics.Imaging.JpegSubsamplingMode")
  @js.native
  object JpegSubsamplingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Graphics.Imaging.JpegSubsamplingMode with Double] = js.native
    
    /* 0 */ val default: typingsSlinky.winrt.Windows.Graphics.Imaging.JpegSubsamplingMode.default with Double = js.native
    
    /* 1 */ val y4Cb2Cr0: typingsSlinky.winrt.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb2Cr0 with Double = js.native
    
    /* 2 */ val y4Cb2Cr2: typingsSlinky.winrt.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb2Cr2 with Double = js.native
    
    /* 3 */ val y4Cb4Cr4: typingsSlinky.winrt.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb4Cr4 with Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.PixelDataProvider")
  @js.native
  class PixelDataProvider ()
    extends typingsSlinky.winrt.Windows.Graphics.Imaging.PixelDataProvider
  
  @JSGlobal("Windows.Graphics.Imaging.PngFilterMode")
  @js.native
  object PngFilterMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Graphics.Imaging.PngFilterMode with Double] = js.native
    
    /* 6 */ val adaptive: typingsSlinky.winrt.Windows.Graphics.Imaging.PngFilterMode.adaptive with Double = js.native
    
    /* 0 */ val automatic: typingsSlinky.winrt.Windows.Graphics.Imaging.PngFilterMode.automatic with Double = js.native
    
    /* 4 */ val average: typingsSlinky.winrt.Windows.Graphics.Imaging.PngFilterMode.average with Double = js.native
    
    /* 1 */ val none: typingsSlinky.winrt.Windows.Graphics.Imaging.PngFilterMode.none with Double = js.native
    
    /* 5 */ val paeth: typingsSlinky.winrt.Windows.Graphics.Imaging.PngFilterMode.paeth with Double = js.native
    
    /* 2 */ val sub: typingsSlinky.winrt.Windows.Graphics.Imaging.PngFilterMode.sub with Double = js.native
    
    /* 3 */ val up: typingsSlinky.winrt.Windows.Graphics.Imaging.PngFilterMode.up with Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.TiffCompressionMode")
  @js.native
  object TiffCompressionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Graphics.Imaging.TiffCompressionMode with Double] = js.native
    
    /* 0 */ val automatic: typingsSlinky.winrt.Windows.Graphics.Imaging.TiffCompressionMode.automatic with Double = js.native
    
    /* 2 */ val ccitt3: typingsSlinky.winrt.Windows.Graphics.Imaging.TiffCompressionMode.ccitt3 with Double = js.native
    
    /* 3 */ val ccitt4: typingsSlinky.winrt.Windows.Graphics.Imaging.TiffCompressionMode.ccitt4 with Double = js.native
    
    /* 4 */ val lzw: typingsSlinky.winrt.Windows.Graphics.Imaging.TiffCompressionMode.lzw with Double = js.native
    
    /* 7 */ val lzwhDifferencing: typingsSlinky.winrt.Windows.Graphics.Imaging.TiffCompressionMode.lzwhDifferencing with Double = js.native
    
    /* 1 */ val none: typingsSlinky.winrt.Windows.Graphics.Imaging.TiffCompressionMode.none with Double = js.native
    
    /* 5 */ val rle: typingsSlinky.winrt.Windows.Graphics.Imaging.TiffCompressionMode.rle with Double = js.native
    
    /* 6 */ val zip: typingsSlinky.winrt.Windows.Graphics.Imaging.TiffCompressionMode.zip with Double = js.native
  }
}
