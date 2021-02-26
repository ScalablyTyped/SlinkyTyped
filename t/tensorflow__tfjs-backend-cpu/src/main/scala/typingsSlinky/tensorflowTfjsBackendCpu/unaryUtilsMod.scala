package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.unaryTypesMod.SimpleUnaryImpl
import typingsSlinky.tensorflowTfjsBackendCpu.unaryTypesMod.SimpleUnaryOperation
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unaryUtilsMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/unary_utils", "unaryKernelFunc")
  @js.native
  def unaryKernelFunc(name: String, op: SimpleUnaryOperation): KernelFunc = js.native
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/unary_utils", "unaryKernelFunc")
  @js.native
  def unaryKernelFunc(name: String, op: SimpleUnaryOperation, dtype: DataType): KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/unary_utils", "unaryKernelFuncFromImpl")
  @js.native
  def unaryKernelFuncFromImpl(name: String, unaryImpl: SimpleUnaryImpl): KernelFunc = js.native
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/unary_utils", "unaryKernelFuncFromImpl")
  @js.native
  def unaryKernelFuncFromImpl(name: String, unaryImpl: SimpleUnaryImpl, dtype: DataType): KernelFunc = js.native
}
