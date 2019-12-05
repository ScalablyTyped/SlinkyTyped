package typingsSlinky.atTensorflowTfjsDashCore

import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.avg
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.max
import typingsSlinky.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import typingsSlinky.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod.Conv2DInfo
import typingsSlinky.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod.Conv3DInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/pool_gpu", JSImport.Namespace)
@js.native
object distBackendsWebglPoolUnderscoreGpuMod extends js.Object {
  @js.native
  class Pool2DProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv2DInfo, poolType: avg, computePositions: Boolean) = this()
    def this(convInfo: Conv2DInfo, poolType: max, computePositions: Boolean) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
  @js.native
  class Pool3DProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv3DInfo, poolType: avg, computePositions: Boolean) = this()
    def this(convInfo: Conv3DInfo, poolType: max, computePositions: Boolean) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

