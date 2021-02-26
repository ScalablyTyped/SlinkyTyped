package typingsSlinky.ssimJs

import typingsSlinky.ssimJs.ssimJsBooleans.`false`
import typingsSlinky.ssimJs.ssimJsStrings.bezkrovny
import typingsSlinky.ssimJs.ssimJsStrings.fast
import typingsSlinky.ssimJs.ssimJsStrings.integer
import typingsSlinky.ssimJs.ssimJsStrings.original
import typingsSlinky.ssimJs.ssimJsStrings.weber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait ImageData extends ImageMatrix {
    
    val data: js.typedarray.Uint8ClampedArray = js.native
    
    val height: Double = js.native
    
    val width: Double = js.native
  }
  object ImageData {
    
    @scala.inline
    def apply(data: js.typedarray.Uint8ClampedArray, height: Double, width: Double): ImageData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageData]
    }
    
    @scala.inline
    implicit class ImageDataMutableBuilder[Self <: ImageData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ssimJs.typesMod.Matrix
    - typingsSlinky.ssimJs.typesMod.ImageData
    - typingsSlinky.ssimJs.anon.Height
  */
  trait ImageMatrix extends StObject
  object ImageMatrix {
    
    @scala.inline
    def Height(
      data: js.typedarray.Uint8Array | js.typedarray.Int8Array | js.typedarray.Uint32Array | js.typedarray.Int32Array | js.typedarray.Uint16Array,
      height: Double,
      width: Double
    ): typingsSlinky.ssimJs.anon.Height = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.ssimJs.anon.Height]
    }
    
    @scala.inline
    def ImageData(data: js.typedarray.Uint8ClampedArray, height: Double, width: Double): typingsSlinky.ssimJs.typesMod.ImageData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.ssimJs.typesMod.ImageData]
    }
    
    @scala.inline
    def Matrix(data: js.Array[Double], height: Double, width: Double): typingsSlinky.ssimJs.typesMod.Matrix = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.ssimJs.typesMod.Matrix]
    }
  }
  
  type Images = js.Tuple3[ImageData, ImageData, Options]
  
  /* Inlined ssim.js.ssim.js/dist/types.Matrix & {  mssim :number} */
  @js.native
  trait MSSIMMatrix extends StObject {
    
    var data: js.Array[Double] = js.native
    
    var height: Double = js.native
    
    var mssim: Double = js.native
    
    var width: Double = js.native
  }
  object MSSIMMatrix {
    
    @scala.inline
    def apply(data: js.Array[Double], height: Double, mssim: Double, width: Double): MSSIMMatrix = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], mssim = mssim.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MSSIMMatrix]
    }
    
    @scala.inline
    implicit class MSSIMMatrixMutableBuilder[Self <: MSSIMMatrix] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMssim(value: Double): Self = StObject.set(x, "mssim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type Matrices = js.Tuple3[Matrix, Matrix, Options]
  
  @js.native
  trait Matrix extends ImageMatrix {
    
    var data: js.Array[Double] = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Matrix {
    
    @scala.inline
    def apply(data: js.Array[Double], height: Double, width: Double): Matrix = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matrix]
    }
    
    @scala.inline
    implicit class MatrixMutableBuilder[Self <: Matrix] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var bitDepth: Double = js.native
    
    var downsample: original | fast | `false` = js.native
    
    var k1: Double = js.native
    
    var k2: Double = js.native
    
    var maxSize: js.UndefOr[Double] = js.native
    
    var rgb2grayVersion: original | integer = js.native
    
    var ssim: fast | original | bezkrovny | weber = js.native
    
    var windowSize: Double = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      bitDepth: Double,
      downsample: original | fast | `false`,
      k1: Double,
      k2: Double,
      rgb2grayVersion: original | integer,
      ssim: fast | original | bezkrovny | weber,
      windowSize: Double
    ): Options = {
      val __obj = js.Dynamic.literal(bitDepth = bitDepth.asInstanceOf[js.Any], downsample = downsample.asInstanceOf[js.Any], k1 = k1.asInstanceOf[js.Any], k2 = k2.asInstanceOf[js.Any], rgb2grayVersion = rgb2grayVersion.asInstanceOf[js.Any], ssim = ssim.asInstanceOf[js.Any], windowSize = windowSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitDepth(value: Double): Self = StObject.set(x, "bitDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownsample(value: original | fast | `false`): Self = StObject.set(x, "downsample", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK1(value: Double): Self = StObject.set(x, "k1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK2(value: Double): Self = StObject.set(x, "k2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setRgb2grayVersion(value: original | integer): Self = StObject.set(x, "rgb2grayVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsim(value: fast | original | bezkrovny | weber): Self = StObject.set(x, "ssim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowSize(value: Double): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ssimJs.ssimJsStrings.full
    - typingsSlinky.ssimJs.ssimJsStrings.same
    - typingsSlinky.ssimJs.ssimJsStrings.valid
  */
  trait Shape extends StObject
  object Shape {
    
    @scala.inline
    def full: typingsSlinky.ssimJs.ssimJsStrings.full = "full".asInstanceOf[typingsSlinky.ssimJs.ssimJsStrings.full]
    
    @scala.inline
    def same: typingsSlinky.ssimJs.ssimJsStrings.same = "same".asInstanceOf[typingsSlinky.ssimJs.ssimJsStrings.same]
    
    @scala.inline
    def valid: typingsSlinky.ssimJs.ssimJsStrings.valid = "valid".asInstanceOf[typingsSlinky.ssimJs.ssimJsStrings.valid]
  }
}
