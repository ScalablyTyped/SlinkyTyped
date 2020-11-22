package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.binaryTypesMod.ComplexBinaryKernelImpl
import typingsSlinky.tensorflowTfjsBackendCpu.binaryTypesMod.ComplexBinaryOperation
import typingsSlinky.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/kernel_utils", JSImport.Namespace)
@js.native
object kernelUtilsMod extends js.Object {
  
  def binaryKernelFunc(name: String, simpleImpl: SimpleBinaryKernelImpl): KernelFunc = js.native
  def binaryKernelFunc(
    name: String,
    simpleImpl: SimpleBinaryKernelImpl,
    complexImpl: js.UndefOr[scala.Nothing],
    dtype: DataType
  ): KernelFunc = js.native
  def binaryKernelFunc(name: String, simpleImpl: SimpleBinaryKernelImpl, complexImpl: ComplexBinaryKernelImpl): KernelFunc = js.native
  def binaryKernelFunc(
    name: String,
    simpleImpl: SimpleBinaryKernelImpl,
    complexImpl: ComplexBinaryKernelImpl,
    dtype: DataType
  ): KernelFunc = js.native
  
  def createComplexBinaryKernelImpl(op: ComplexBinaryOperation): ComplexBinaryKernelImpl = js.native
}
