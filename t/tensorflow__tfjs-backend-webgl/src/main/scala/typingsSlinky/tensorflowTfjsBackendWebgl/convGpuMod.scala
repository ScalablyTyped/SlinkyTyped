package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv3DInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/conv_gpu", JSImport.Namespace)
@js.native
object convGpuMod extends js.Object {
  
  @js.native
  class Conv2DProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean) = this()
    def this(convInfo: Conv2DInfo, addBias: js.UndefOr[scala.Nothing], activation: String) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean, activation: String) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: js.UndefOr[scala.Nothing],
      activation: js.UndefOr[scala.Nothing],
      hasPreluActivationWeights: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: js.UndefOr[scala.Nothing],
      activation: String,
      hasPreluActivationWeights: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      addBias: Boolean,
      activation: js.UndefOr[scala.Nothing],
      hasPreluActivationWeights: Boolean
    ) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean, activation: String, hasPreluActivationWeights: Boolean) = this()
  }
  
  @js.native
  class Conv3DProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv3DInfo) = this()
  }
}
