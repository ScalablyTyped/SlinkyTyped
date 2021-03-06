package typingsSlinky.tensorflowTfjsCore

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.ImageData
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.PixelData
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/browser", "fromPixels")
  @js.native
  val fromPixels: js.Function2[
    /* pixels */ PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement, 
    /* numChannels */ js.UndefOr[Double], 
    Tensor3D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/browser", "toPixels")
  @js.native
  def toPixels(img: Tensor2D | Tensor3D | TensorLike): js.Promise[js.typedarray.Uint8ClampedArray] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/browser", "toPixels")
  @js.native
  def toPixels(img: Tensor2D | Tensor3D | TensorLike, canvas: HTMLCanvasElement): js.Promise[js.typedarray.Uint8ClampedArray] = js.native
}
