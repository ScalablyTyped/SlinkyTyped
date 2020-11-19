package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.ImageData
import typingsSlinky.tensorflowTfjsCore.distTypesMod.PixelData
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor2D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "browser")
@js.native
object browser extends js.Object {
  
  val fromPixels: js.Function2[
    /* pixels */ PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement, 
    /* numChannels */ js.UndefOr[Double], 
    Tensor3D
  ] = js.native
  
  def toPixels(img: Tensor2D | Tensor3D | TensorLike): js.Promise[js.typedarray.Uint8ClampedArray] = js.native
  def toPixels(img: Tensor2D | Tensor3D | TensorLike, canvas: HTMLCanvasElement): js.Promise[js.typedarray.Uint8ClampedArray] = js.native
}
