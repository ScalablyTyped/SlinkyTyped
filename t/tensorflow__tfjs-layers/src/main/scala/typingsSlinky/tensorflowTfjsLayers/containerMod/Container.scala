package typingsSlinky.tensorflowTfjsLayers.containerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Set
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.serialization.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
import typingsSlinky.tensorflowTfjsLayers.topologyMod.Node
import typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import typingsSlinky.tensorflowTfjsLayers.typesMod.PyJsonDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/engine/container", "Container")
@js.native
abstract class Container protected () extends Layer {
  def this(args: ContainerArgs) = this()
  
  /**
    * Builds a map of internal node keys to node ordering.
    * Used in serializaion a node orderings may change as unused nodes are
    * dropped. Porting Note:  This helper method was pulled out of getConfig to
    * improve readability.
    * @param layers An array of Layers in the model.
    * @returns Map of Node Keys to index order within the layer.
    */
  var buildNodeConversionMap: js.Any = js.native
  
  var containerNodes: Set[String] = js.native
  
  var feedInputNames: js.Array[String] = js.native
  
  var feedInputShapes: js.Array[Shape] = js.native
  
  var feedOutputNames: js.Array[String] = js.native
  
  /**
    * Retrieves a layer based on either its name (unique) or index.
    *
    * Indices are based on order of horizontal graph traversal (bottom-up).
    *
    * If both `name` and `index` are specified, `index` takes precedence.
    *
    * @param name Name of layer.
    * @param index Index of layer.
    * @returns A Layer instance.
    * @throws ValueError: In case of invalid layer name or index.
    */
  /**
    * @doc {
    *    heading: 'Layers',
    *    subheading: 'Classes',
    *    namespace: 'layers',
    *    subclasses: ['LayersModel']
    * }
    */
  def getLayer(): Layer = js.native
  def getLayer(name: js.UndefOr[scala.Nothing], index: Double): Layer = js.native
  def getLayer(name: String): Layer = js.native
  def getLayer(name: String, index: Double): Layer = js.native
  
  var inputLayers: js.Array[Layer] = js.native
  
  var inputLayersNodeIndices: js.Array[Double] = js.native
  
  var inputLayersTensorIndices: js.Array[Double] = js.native
  
  var inputNames: js.Array[String] = js.native
  
  var inputs: js.Array[SymbolicTensor] = js.native
  
  var internalContainerRefs: js.Array[Container] = js.native
  
  var internalInputShapes: js.Array[Shape] = js.native
  
  var internalOutputShapes: js.Array[Shape] = js.native
  
  var layers: js.Array[Layer] = js.native
  
  var layersByDepth: StringDictionary[js.Array[Layer]] = js.native
  
  /**
    * Loads all layer weights from a JSON object.
    *
    * Porting Note: HDF5 weight files cannot be directly loaded in JavaScript /
    *   TypeScript. The utility script at `scripts/pykeras.py` offers means
    *   to convert them into JSON strings compatible with this method.
    * Porting Note: TensorFlow.js Layers supports only loading by name currently.
    *
    * @param weights A JSON mapping weight names to weight values as nested
    *   arrays of numbers, or a `NamedTensorMap`, i.e., a JSON mapping weight
    *   names to `tf.Tensor` objects.
    * @param strict Require that the provided weights exactly match those
    *   required by the container.  Default: `true`.  Passing `false` means that
    *   extra weights and missing weights will be silently ignored.
    */
  def loadWeights(weights: NamedTensorMap): Unit = js.native
  def loadWeights(weights: NamedTensorMap, strict: Boolean): Unit = js.native
  
  var nodesByDepth: StringDictionary[js.Array[Node]] = js.native
  
  var outputLayers: js.Array[Layer] = js.native
  
  var outputLayersNodeIndices: js.Array[Double] = js.native
  
  var outputLayersTensorIndices: js.Array[Double] = js.native
  
  var outputNames: js.Array[String] = js.native
  
  var outputs: js.Array[SymbolicTensor] = js.native
  
  /**
    * Computes output tensors for new inputs.
    *
    * Note:
    *   - Expects `inputs` to be a list (potentially with 1 element).
    *
    * @param inputs List of tensors
    * @param masks List of masks (tensors or null).
    * @return Three lists: outputTensors, outputMasks, outputShapes
    */
  /* protected */ def runInternalGraph(inputs: js.Array[Tensor[Rank]]): js.Tuple3[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]], js.Array[Shape]] = js.native
  /* protected */ def runInternalGraph(inputs: js.Array[Tensor[Rank]], masks: js.Array[Tensor[Rank]]): js.Tuple3[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]], js.Array[Shape]] = js.native
  
  /**
    * Returns a JSON string containing the network configuration.
    *
    * To load a network from a JSON save file, use
    * models.modelFromJSON(jsonString);
    * @param extraJsonArgs Unused in tfjs-layers, maintained for PyKeras
    * @param returnString Whether the return value should be stringified
    *    (default: `true`).
    * @returns a JSON string if `returnString` (default), or a JSON object if
    *   `!returnString`.
    */
  def toJSON(): String | PyJsonDict = js.native
  def toJSON(unused: js.UndefOr[scala.Nothing], returnString: Boolean): String | PyJsonDict = js.native
  def toJSON(unused: js.Any): String | PyJsonDict = js.native
  def toJSON(unused: js.Any, returnString: Boolean): String | PyJsonDict = js.native
  
  /**
    * Util shared between different serialization methods.
    * @returns LayersModel config with Keras version information added.
    */
  /* protected */ def updatedConfig(): ConfigDict = js.native
}
/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/engine/container", "Container")
@js.native
object Container extends js.Object {
  
  /**
    * Instantiates a LayersModel from its config (output of `get_config()`).
    * @param cls the class to create
    * @param config LayersModel config dictionary.
    * @param customObjects An optional dictionary of custom objects.
    * @param fastWeightInit Optional flag to use fast weight initialization
    *   during deserialization. This is applicable to cases in which
    *   the initialization will be immediately overwritten by loaded weight
    *   values. Default: `false`.
    * @returns A LayersModel instance.
    * @throws ValueError: In case of improperly formatted config dict.
    */
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  def fromConfig[T /* <: Serializable */](
    cls: SerializableConstructor[T],
    config: ConfigDict,
    customObjects: js.UndefOr[scala.Nothing],
    fastWeightInit: Boolean
  ): T = js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
  def fromConfig[T /* <: Serializable */](
    cls: SerializableConstructor[T],
    config: ConfigDict,
    customObjects: ConfigDict,
    fastWeightInit: Boolean
  ): T = js.native
}
