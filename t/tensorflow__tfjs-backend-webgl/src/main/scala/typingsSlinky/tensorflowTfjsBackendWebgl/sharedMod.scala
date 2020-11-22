package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/shared", JSImport.Namespace)
@js.native
object sharedMod extends js.Object {
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(addImplCPU, ceilImplCPU, expImplCPU, expm1ImplCPU, floorImplCPU, logImplCPU, maxImplCPU, multiplyImplCPU, rsqrtImplCPU, sliceImplCPU, subImplCPU, transposeImplCPU, uniqueImplCPU) */ val simpleAbsImplCPU: js.Function1[/* vals */ TypedArray, js.typedarray.Float32Array] = js.native
  
  type SimpleBinaryKernelImplCPU = SimpleBinaryKernelImpl
}
