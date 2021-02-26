package typingsSlinky.tensorflowTfjsNode

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.modelTypesMod.InferenceModel
import typingsSlinky.tensorflowTfjsCore.modelTypesMod.MetaGraph
import typingsSlinky.tensorflowTfjsCore.modelTypesMod.SignatureDefEntry
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typingsSlinky.tensorflowTfjsNode.nodejsKernelBackendMod.NodeJSKernelBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object savedModelMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/saved_model", "TFSavedModel")
  @js.native
  class TFSavedModel protected () extends InferenceModel {
    def this(sessionId: Double, jsid: Double, signature: SignatureDefEntry, backend: NodeJSKernelBackend) = this()
    
    var backend: js.Any = js.native
    
    /**
      * Delete the SavedModel from nodeBackend and delete corresponding session in
      * the C++ backend if the session is only used by this TFSavedModel.
      *
      * @doc {heading: 'Models', subheading: 'SavedModel'}
      */
    def dispose(): Unit = js.native
    
    var disposed: js.Any = js.native
    
    var jsid: js.Any = js.native
    
    val outputNodeNames: StringDictionary[String] = js.native
    
    var outputNodeNames_ : js.Any = js.native
    
    def predict(inputs: js.Array[Tensor[Rank]]): Tensor[Rank] | js.Array[Tensor[Rank]] | NamedTensorMap = js.native
    /**
      * Execute the inference for the input tensors.
      *
      * @param input The input tensors, when there is single input for the model,
      * inputs param should be a Tensor. For models with multiple inputs, inputs
      * params should be in either Tensor[] if the input order is fixed, or
      * otherwise NamedTensorMap format. The keys in the NamedTensorMap are the
      * name of input tensors in SavedModel signatureDef. It can be found through
      * `tf.node.getMetaGraphsFromSavedModel()`.
      *
      * For batch inference execution, the tensors for each input need to be
      * concatenated together. For example with mobilenet, the required input shape
      * is [1, 244, 244, 3], which represents the [batch, height, width, channel].
      * If we are provide a batched data of 100 images, the input tensor should be
      * in the shape of [100, 244, 244, 3].
      *
      * @param config Prediction configuration for specifying the batch size.
      *
      * @returns Inference result tensors. The output would be single Tensor if
      * model has single output node, otherwise Tensor[] or NamedTensorMap[] will
      * be returned for model with multiple outputs.
      *
      * @doc {heading: 'Models', subheading: 'SavedModel'}
      */
    def predict(inputs: Tensor[Rank]): Tensor[Rank] | js.Array[Tensor[Rank]] | NamedTensorMap = js.native
    def predict(inputs: NamedTensorMap): Tensor[Rank] | js.Array[Tensor[Rank]] | NamedTensorMap = js.native
    
    var sessionId: js.Any = js.native
    
    var signature: js.Any = js.native
  }
  
  @JSImport("@tensorflow/tfjs-node/dist/saved_model", "getEnumKeyFromValue")
  @js.native
  def getEnumKeyFromValue(`object`: js.Any, value: Double): String = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/saved_model", "getMetaGraphsFromSavedModel")
  @js.native
  def getMetaGraphsFromSavedModel(path: String): js.Promise[js.Array[MetaGraph]] = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/saved_model", "getNumOfSavedModels")
  @js.native
  def getNumOfSavedModels(): Double = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/saved_model", "getSignatureDefEntryFromMetaGraphInfo")
  @js.native
  def getSignatureDefEntryFromMetaGraphInfo(savedModelInfo: js.Array[MetaGraph], tags: js.Array[String], signature: String): SignatureDefEntry = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/saved_model", "loadSavedModel")
  @js.native
  def loadSavedModel(path: String): js.Promise[TFSavedModel] = js.native
  @JSImport("@tensorflow/tfjs-node/dist/saved_model", "loadSavedModel")
  @js.native
  def loadSavedModel(path: String, tags: js.UndefOr[scala.Nothing], signature: String): js.Promise[TFSavedModel] = js.native
  @JSImport("@tensorflow/tfjs-node/dist/saved_model", "loadSavedModel")
  @js.native
  def loadSavedModel(path: String, tags: js.Array[String]): js.Promise[TFSavedModel] = js.native
  @JSImport("@tensorflow/tfjs-node/dist/saved_model", "loadSavedModel")
  @js.native
  def loadSavedModel(path: String, tags: js.Array[String], signature: String): js.Promise[TFSavedModel] = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/saved_model", "readSavedModelProto")
  @js.native
  def readSavedModelProto(path: String): js.Promise[_] = js.native
}
