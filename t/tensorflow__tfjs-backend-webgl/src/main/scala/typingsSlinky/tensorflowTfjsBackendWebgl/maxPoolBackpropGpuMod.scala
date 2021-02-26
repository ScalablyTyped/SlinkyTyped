package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv3DInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxPoolBackpropGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/max_pool_backprop_gpu", "MaxPool2DBackpropProgram")
  @js.native
  class MaxPool2DBackpropProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/max_pool_backprop_gpu", "MaxPool3DBackpropProgram")
  @js.native
  class MaxPool3DBackpropProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv3DInfo) = this()
  }
}
