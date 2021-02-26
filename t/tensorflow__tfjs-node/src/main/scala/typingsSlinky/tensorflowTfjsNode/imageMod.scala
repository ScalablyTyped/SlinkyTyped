package typingsSlinky.tensorflowTfjsNode

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings._empty
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.cm
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.grayscale
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.in
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod {
  
  @js.native
  sealed trait ImageType extends StObject
  @JSImport("@tensorflow/tfjs-node/dist/image", "ImageType")
  @js.native
  object ImageType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ImageType with String] = js.native
    
    @js.native
    sealed trait BMP extends ImageType
    /* "BMP" */ val BMP: typingsSlinky.tensorflowTfjsNode.imageMod.ImageType.BMP with String = js.native
    
    @js.native
    sealed trait GIF extends ImageType
    /* "gif" */ val GIF: typingsSlinky.tensorflowTfjsNode.imageMod.ImageType.GIF with String = js.native
    
    @js.native
    sealed trait JPEG extends ImageType
    /* "jpeg" */ val JPEG: typingsSlinky.tensorflowTfjsNode.imageMod.ImageType.JPEG with String = js.native
    
    @js.native
    sealed trait PNG extends ImageType
    /* "png" */ val PNG: typingsSlinky.tensorflowTfjsNode.imageMod.ImageType.PNG with String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-node/dist/image", "decodeBmp")
  @js.native
  def decodeBmp(contents: js.typedarray.Uint8Array): Tensor3D = js.native
  @JSImport("@tensorflow/tfjs-node/dist/image", "decodeBmp")
  @js.native
  def decodeBmp(contents: js.typedarray.Uint8Array, channels: Double): Tensor3D = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/image", "decodeGif")
  @js.native
  def decodeGif(contents: js.typedarray.Uint8Array): Tensor4D = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/image", "decodeImage")
  @js.native
  def decodeImage(content: js.typedarray.Uint8Array): Tensor3D | Tensor4D = js.native
  @JSImport("@tensorflow/tfjs-node/dist/image", "decodeImage")
  @js.native
  def decodeImage(
    content: js.typedarray.Uint8Array,
    channels: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    expandAnimations: Boolean
  ): Tensor3D | Tensor4D = js.native
  @JSImport("@tensorflow/tfjs-node/dist/image", "decodeImage")
  @js.native
  def decodeImage(content: js.typedarray.Uint8Array, channels: js.UndefOr[scala.Nothing], dtype: String): Tensor3D | Tensor4D = js.native
  @JSImport("@tensorflow/tfjs-node/dist/image", "decodeImage")
  @js.native
  def decodeImage(
    content: js.typedarray.Uint8Array,
    channels: js.UndefOr[scala.Nothing],
    dtype: String,
    expandAnimations: Boolean
  ): Tensor3D | Tensor4D = js.native
  @JSImport("@tensorflow/tfjs-node/dist/image", "decodeImage")
  @js.native
  def decodeImage(content: js.typedarray.Uint8Array, channels: Double): Tensor3D | Tensor4D = js.native
  @JSImport("@tensorflow/tfjs-node/dist/image", "decodeImage")
  @js.native
  def decodeImage(
    content: js.typedarray.Uint8Array,
    channels: Double,
    dtype: js.UndefOr[scala.Nothing],
    expandAnimations: Boolean
  ): Tensor3D | Tensor4D = js.native
  @JSImport("@tensorflow/tfjs-node/dist/image", "decodeImage")
  @js.native
  def decodeImage(content: js.typedarray.Uint8Array, channels: Double, dtype: String): Tensor3D | Tensor4D = js.native
  @JSImport("@tensorflow/tfjs-node/dist/image", "decodeImage")
  @js.native
  def decodeImage(content: js.typedarray.Uint8Array, channels: Double, dtype: String, expandAnimations: Boolean): Tensor3D | Tensor4D = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/image", "decodeJpeg")
  @js.native
  def decodeJpeg(
    contents: js.typedarray.Uint8Array,
    channels: js.UndefOr[Double],
    ratio: js.UndefOr[Double],
    fancyUpscaling: js.UndefOr[Boolean],
    tryRecoverTruncated: js.UndefOr[Boolean],
    acceptableFraction: js.UndefOr[Double],
    dctMethod: js.UndefOr[String]
  ): Tensor3D = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/image", "decodePng")
  @js.native
  def decodePng(contents: js.typedarray.Uint8Array): Tensor3D = js.native
  @JSImport("@tensorflow/tfjs-node/dist/image", "decodePng")
  @js.native
  def decodePng(contents: js.typedarray.Uint8Array, channels: js.UndefOr[scala.Nothing], dtype: String): Tensor3D = js.native
  @JSImport("@tensorflow/tfjs-node/dist/image", "decodePng")
  @js.native
  def decodePng(contents: js.typedarray.Uint8Array, channels: Double): Tensor3D = js.native
  @JSImport("@tensorflow/tfjs-node/dist/image", "decodePng")
  @js.native
  def decodePng(contents: js.typedarray.Uint8Array, channels: Double, dtype: String): Tensor3D = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/image", "encodeJpeg")
  @js.native
  def encodeJpeg(
    image: Tensor3D,
    format: js.UndefOr[_empty | grayscale | rgb],
    quality: js.UndefOr[Double],
    progressive: js.UndefOr[Boolean],
    optimizeSize: js.UndefOr[Boolean],
    chromaDownsampling: js.UndefOr[Boolean],
    densityUnit: js.UndefOr[in | cm],
    xDensity: js.UndefOr[Double],
    yDensity: js.UndefOr[Double],
    xmpMetadata: js.UndefOr[String]
  ): js.Promise[js.typedarray.Uint8Array] = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/image", "encodePng")
  @js.native
  def encodePng(image: Tensor3D): js.Promise[js.typedarray.Uint8Array] = js.native
  @JSImport("@tensorflow/tfjs-node/dist/image", "encodePng")
  @js.native
  def encodePng(image: Tensor3D, compression: Double): js.Promise[js.typedarray.Uint8Array] = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/image", "getImageType")
  @js.native
  def getImageType(content: js.typedarray.Uint8Array): String = js.native
}
