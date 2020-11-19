package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.bool
import typingsSlinky.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.complex64
import typingsSlinky.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.float32
import typingsSlinky.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.int32
import typingsSlinky.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.string
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/kernel_utils", JSImport.Namespace)
@js.native
object kernelUtilsMod extends js.Object {
  
  def createBinaryKernelConfig(
    name: String,
    op: js.Function5[
      /* aShape */ js.Array[Double], 
      /* bShape */ js.Array[Double], 
      /* aVals */ TypedArray, 
      /* bVals */ TypedArray, 
      /* dtype */ DataType, 
      js.Tuple2[TypedArray, js.Array[Double]]
    ]
  ): KernelConfig = js.native
  
  def createBinaryKernelImpl(op: js.Function2[/* a */ Double, /* b */ Double, Double]): js.Function5[
    /* aShape */ js.Array[Double], 
    /* bShape */ js.Array[Double], 
    /* aVals */ TypedArray, 
    /* bVals */ TypedArray, 
    /* dtype */ string | float32 | int32 | bool | complex64, 
    js.Tuple2[TypedArray, js.Array[Double]]
  ] = js.native
}
