package typingsSlinky.tensorflowTfjsBackendWebgl.reduceMod

import typingsSlinky.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/reduce", "reduce")
@js.native
object reduce extends js.Object {
  
  def apply(x: TensorInfo, dtype: DataType, reductionType: ReduceTypes, backend: MathBackendWebGL): TensorInfo = js.native
}
