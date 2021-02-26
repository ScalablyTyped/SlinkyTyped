package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.anon.Data
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensor
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typingsSlinky.tensorflowTfjsCore.typesMod.ModelArtifacts
import typingsSlinky.tensorflowTfjsCore.typesMod.ModelArtifactsInfo
import typingsSlinky.tensorflowTfjsCore.typesMod.WeightGroup
import typingsSlinky.tensorflowTfjsCore.typesMod.WeightsManifestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ioUtilsMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "arrayBufferToBase64String")
  @js.native
  def arrayBufferToBase64String(buffer: js.typedarray.ArrayBuffer): String = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "base64StringToArrayBuffer")
  @js.native
  def base64StringToArrayBuffer(str: String): js.typedarray.ArrayBuffer = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "basename")
  @js.native
  def basename(path: String): String = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "concatenateArrayBuffers")
  @js.native
  def concatenateArrayBuffers(buffers: js.Array[js.typedarray.ArrayBuffer]): js.typedarray.ArrayBuffer = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "concatenateTypedArrays")
  @js.native
  def concatenateTypedArrays(xs: js.Array[TypedArray]): js.typedarray.ArrayBuffer = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "decodeWeights")
  @js.native
  def decodeWeights(buffer: js.typedarray.ArrayBuffer, specs: js.Array[WeightsManifestEntry]): NamedTensorMap = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "encodeWeights")
  @js.native
  def encodeWeights(tensors: js.Array[NamedTensor]): js.Promise[Data] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "encodeWeights")
  @js.native
  def encodeWeights(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[Data] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "encodeWeights")
  @js.native
  def encodeWeights(tensors: NamedTensorMap): js.Promise[Data] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "encodeWeights")
  @js.native
  def encodeWeights(tensors: NamedTensorMap, group: WeightGroup): js.Promise[Data] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "getFloat16Decoder")
  @js.native
  def getFloat16Decoder(): js.Function1[/* buffer */ js.typedarray.Uint16Array, js.typedarray.Float32Array] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "getModelArtifactsInfoForJSON")
  @js.native
  def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): ModelArtifactsInfo = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "stringByteLength")
  @js.native
  def stringByteLength(str: String): Double = js.native
}
