package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.fusedUtilMod.Activation
import typingsSlinky.tensorflowTfjsCore.mod.Tensor_
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsLayers.distTypesMod.HasShape
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.cpu
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.float32
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int32
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.webgl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/backend/tfjs_backend", JSImport.Namespace)
@js.native
object tfjsBackendMod extends js.Object {
  def batchFlatten(x: Tensor_[Rank]): Tensor_[Rank] = js.native
  def biasAdd(x: Tensor_[Rank], bias: Tensor_[Rank]): Tensor_[Rank] = js.native
  def biasAdd(x: Tensor_[Rank], bias: Tensor_[Rank], dataFormat: DataFormat): Tensor_[Rank] = js.native
  def cast(x: Tensor_[Rank], dtype: DataType): Tensor_[Rank] = js.native
  def concatAlongFirstAxis(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
  def concatenate(tensors: js.Array[Tensor_[Rank]]): Tensor_[Rank] = js.native
  def concatenate(tensors: js.Array[Tensor_[Rank]], axis: Double): Tensor_[Rank] = js.native
  def countParams(x: HasShape): Double = js.native
  def dot(a: Tensor_[Rank], b: Tensor_[Rank]): Tensor_[Rank] = js.native
  def dot(a: Tensor_[Rank], b: Tensor_[Rank], activation: Activation): Tensor_[Rank] = js.native
  def dot(a: Tensor_[Rank], b: Tensor_[Rank], activation: Activation, bias: Tensor_[Rank]): Tensor_[Rank] = js.native
  def dropout(x: Tensor_[Rank], level: Double): Tensor_[Rank] = js.native
  def dropout(x: Tensor_[Rank], level: Double, noiseShape: js.Array[Double]): Tensor_[Rank] = js.native
  def dropout(x: Tensor_[Rank], level: Double, noiseShape: js.Array[Double], seed: Double): Tensor_[Rank] = js.native
  def elu(x: Tensor_[Rank]): Tensor_[Rank] = js.native
  def elu(x: Tensor_[Rank], alpha: Double): Tensor_[Rank] = js.native
  def expandDims(x: Tensor_[Rank]): Tensor_[Rank] = js.native
  def expandDims(x: Tensor_[Rank], axis: Double): Tensor_[Rank] = js.native
  def flatten(x: Tensor_[Rank]): Tensor_[Rank] = js.native
  def gather(reference: Tensor_[Rank], indices: js.Array[Double]): Tensor_[Rank] = js.native
  def gather(reference: Tensor_[Rank], indices: js.Array[Double], axis: Double): Tensor_[Rank] = js.native
  def gather(reference: Tensor_[Rank], indices: Tensor1D): Tensor_[Rank] = js.native
  def gather(reference: Tensor_[Rank], indices: Tensor1D, axis: Double): Tensor_[Rank] = js.native
  def getBackend(): cpu | webgl = js.native
  def hardSigmoid(x: Tensor_[Rank]): Tensor_[Rank] = js.native
  def inTrainPhase[T](x: js.Function0[T], alt: js.Function0[T]): T = js.native
  def inTrainPhase[T](x: js.Function0[T], alt: js.Function0[T], training: Boolean): T = js.native
  def isBackendSymbolic(): Boolean = js.native
  def oneHot(indices: Tensor_[Rank], numClasses: Double): Tensor_[Rank] = js.native
  def pow(x: Tensor_[Rank], a: Double): Tensor_[Rank] = js.native
  def pow(x: Tensor_[Rank], a: Tensor_[Rank]): Tensor_[Rank] = js.native
  def randomNormal(shape: Shape): Tensor_[Rank] = js.native
  def randomNormal(shape: Shape, mean: Double): Tensor_[Rank] = js.native
  def randomNormal(shape: Shape, mean: Double, stddev: Double): Tensor_[Rank] = js.native
  @JSName("randomNormal")
  def randomNormal_float32(shape: Shape, mean: Double, stddev: Double, dtype: float32): Tensor_[Rank] = js.native
  @JSName("randomNormal")
  def randomNormal_float32(shape: Shape, mean: Double, stddev: Double, dtype: float32, seed: Double): Tensor_[Rank] = js.native
  @JSName("randomNormal")
  def randomNormal_int32(shape: Shape, mean: Double, stddev: Double, dtype: int32): Tensor_[Rank] = js.native
  @JSName("randomNormal")
  def randomNormal_int32(shape: Shape, mean: Double, stddev: Double, dtype: int32, seed: Double): Tensor_[Rank] = js.native
  def repeat(x: Tensor_[Rank], n: Double): Tensor_[Rank] = js.native
  @JSName("setBackend")
  def setBackend_cpu(requestedBackend: cpu): Unit = js.native
  @JSName("setBackend")
  def setBackend_webgl(requestedBackend: webgl): Unit = js.native
  def sign(x: Tensor_[Rank]): Tensor_[Rank] = js.native
  def sliceAlongAxis(array: Tensor_[Rank], start: Double, size: Double, axis: Double): Tensor_[Rank] = js.native
  def sliceAlongFirstAxis(array: Tensor_[Rank], start: Double, size: Double): Tensor_[Rank] = js.native
  def sliceAlongLastAxis(array: Tensor_[Rank], start: Double, size: Double): Tensor_[Rank] = js.native
  def softsign(x: Tensor_[Rank]): Tensor_[Rank] = js.native
  def square(x: Tensor_[Rank]): Tensor_[Rank] = js.native
  def tile(x: Tensor_[Rank], n: js.Array[Double]): Tensor_[Rank] = js.native
  def tile(x: Tensor_[Rank], n: Double): Tensor_[Rank] = js.native
}

