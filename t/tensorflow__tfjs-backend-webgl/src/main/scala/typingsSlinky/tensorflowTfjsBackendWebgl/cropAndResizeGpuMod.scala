package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.bilinear
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.nearest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cropAndResizeGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/crop_and_resize_gpu", "CropAndResizeProgram")
  @js.native
  class CropAndResizeProgram protected () extends GPGPUProgram {
    def this(
      imageShape: js.Tuple4[Double, Double, Double, Double],
      boxShape: js.Tuple2[Double, Double],
      cropSize: js.Tuple2[Double, Double],
      method: bilinear,
      extrapolationValue: Double
    ) = this()
    def this(
      imageShape: js.Tuple4[Double, Double, Double, Double],
      boxShape: js.Tuple2[Double, Double],
      cropSize: js.Tuple2[Double, Double],
      method: nearest,
      extrapolationValue: Double
    ) = this()
  }
}
