package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import typingsSlinky.tensorflowTfjsCore.segmentUtilMod.SegOpInfo
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.unsortedSegmentSum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/segment_gpu", JSImport.Namespace)
@js.native
object segmentGpuMod extends js.Object {
  @js.native
  class SegmentOpProgram protected () extends GPGPUProgram {
    def this(segOpInfo: SegOpInfo, segOpType: unsortedSegmentSum) = this()
  }
  
}

