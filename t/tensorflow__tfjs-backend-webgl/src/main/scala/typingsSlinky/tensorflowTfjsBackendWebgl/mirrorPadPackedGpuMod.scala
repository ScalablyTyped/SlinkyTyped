package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.reflect
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.symmetric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mirrorPadPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/mirror_pad_packed_gpu", "MirrorPadPackedProgram")
  @js.native
  class MirrorPadPackedProgram protected () extends GPGPUProgram {
    def this(xShape: js.Array[Double], paddings: js.Array[js.Tuple2[Double, Double]], mode: reflect) = this()
    def this(xShape: js.Array[Double], paddings: js.Array[js.Tuple2[Double, Double]], mode: symmetric) = this()
    
    @JSName("packedInputs")
    var packedInputs_MirrorPadPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_MirrorPadPackedProgram: Boolean = js.native
  }
}
