package typingsSlinky.atTensorflowTfjsDashCore

import typingsSlinky.atTensorflowTfjsDashCore.distIoTypesMod.ModelArtifacts
import typingsSlinky.atTensorflowTfjsDashCore.distIoTypesMod.ModelArtifactsInfo
import typingsSlinky.atTensorflowTfjsDashCore.distIoTypesMod.WeightGroup
import typingsSlinky.atTensorflowTfjsDashCore.distIoTypesMod.WeightsManifestEntry
import typingsSlinky.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.NamedTensor
import typingsSlinky.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.NamedTensorMap
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/io_utils", JSImport.Namespace)
@js.native
object distIoIoUnderscoreUtilsMod extends js.Object {
  def arrayBufferToBase64String(buffer: scala.scalajs.js.typedarray.ArrayBuffer): String = js.native
  def base64StringToArrayBuffer(str: String): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def basename(path: String): String = js.native
  def concatenateArrayBuffers(buffers: js.Array[scala.scalajs.js.typedarray.ArrayBuffer]): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def concatenateTypedArrays(xs: js.Array[TypedArray]): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def decodeWeights(buffer: scala.scalajs.js.typedarray.ArrayBuffer, specs: js.Array[WeightsManifestEntry]): NamedTensorMap = js.native
  def encodeWeights(tensors: js.Array[NamedTensor]): js.Promise[Anon_Data] = js.native
  def encodeWeights(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[Anon_Data] = js.native
  def encodeWeights(tensors: NamedTensorMap): js.Promise[Anon_Data] = js.native
  def encodeWeights(tensors: NamedTensorMap, group: WeightGroup): js.Promise[Anon_Data] = js.native
  def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): ModelArtifactsInfo = js.native
  def stringByteLength(str: String): Double = js.native
}

