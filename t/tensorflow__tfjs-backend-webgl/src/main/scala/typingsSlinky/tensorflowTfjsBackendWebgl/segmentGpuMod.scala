package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.unsortedSegmentSum
import typingsSlinky.tensorflowTfjsCore.segmentUtilMod.SegOpInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/segment_gpu", JSImport.Namespace)
@js.native
object segmentGpuMod extends js.Object {
  
  @js.native
  class SegmentOpProgram protected () extends GPGPUProgram {
    def this(segOpInfo: SegOpInfo, segOpType: unsortedSegmentSum) = this()
  }
}
