package typingsSlinky.tensorflowTfjsConverter

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.IAttrValue
import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.ISignatureDef
import typingsSlinky.tensorflowTfjsConverter.executionContextMod.ExecutionContext
import typingsSlinky.tensorflowTfjsConverter.resourceManagerMod.ResourceManager
import typingsSlinky.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationsTypesMod {
  
  @js.native
  trait AttrParamMapper extends ParamMapper {
    
    var tfDeprecatedName: js.UndefOr[String] = js.native
    
    var tfName: js.UndefOr[String] = js.native
  }
  object AttrParamMapper {
    
    @scala.inline
    def apply(name: String, `type`: ParamType): AttrParamMapper = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttrParamMapper]
    }
    
    @scala.inline
    implicit class AttrParamMapperMutableBuilder[Self <: AttrParamMapper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTfDeprecatedName(value: String): Self = StObject.set(x, "tfDeprecatedName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTfDeprecatedNameUndefined: Self = StObject.set(x, "tfDeprecatedName", js.undefined)
      
      @scala.inline
      def setTfName(value: String): Self = StObject.set(x, "tfName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTfNameUndefined: Self = StObject.set(x, "tfName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.arithmetic
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.basic_math
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.control
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.convolution
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.custom
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.dynamic
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.evaluation
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.image
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.creation
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.graph
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.logical
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.matrices
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.normalization
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.reduction
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.slice_join
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.spectral
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.transformation
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.hash_table
  */
  trait Category extends StObject
  object Category {
    
    @scala.inline
    def arithmetic: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.arithmetic = "arithmetic".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.arithmetic]
    
    @scala.inline
    def basic_math: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.basic_math = "basic_math".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.basic_math]
    
    @scala.inline
    def control: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.control = "control".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.control]
    
    @scala.inline
    def convolution: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.convolution = "convolution".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.convolution]
    
    @scala.inline
    def creation: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.creation = "creation".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.creation]
    
    @scala.inline
    def custom: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.custom = "custom".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.custom]
    
    @scala.inline
    def dynamic: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.dynamic = "dynamic".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.dynamic]
    
    @scala.inline
    def evaluation: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.evaluation = "evaluation".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.evaluation]
    
    @scala.inline
    def graph: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.graph = "graph".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.graph]
    
    @scala.inline
    def hash_table: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.hash_table = "hash_table".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.hash_table]
    
    @scala.inline
    def image: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.image = "image".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.image]
    
    @scala.inline
    def logical: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.logical = "logical".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.logical]
    
    @scala.inline
    def matrices: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.matrices = "matrices".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.matrices]
    
    @scala.inline
    def normalization: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.normalization = "normalization".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.normalization]
    
    @scala.inline
    def reduction: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.reduction = "reduction".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.reduction]
    
    @scala.inline
    def slice_join: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.slice_join = "slice_join".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.slice_join]
    
    @scala.inline
    def spectral: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.spectral = "spectral".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.spectral]
    
    @scala.inline
    def transformation: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.transformation = "transformation".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.transformation]
  }
  
  @js.native
  trait Graph extends StObject {
    
    var functions: js.UndefOr[StringDictionary[Graph]] = js.native
    
    var initNodes: js.UndefOr[js.Array[Node]] = js.native
    
    var inputs: js.Array[Node] = js.native
    
    var nodes: StringDictionary[Node] = js.native
    
    var outputs: js.Array[Node] = js.native
    
    var placeholders: js.Array[Node] = js.native
    
    var signature: js.UndefOr[ISignatureDef] = js.native
    
    var weights: js.Array[Node] = js.native
  }
  object Graph {
    
    @scala.inline
    def apply(
      inputs: js.Array[Node],
      nodes: StringDictionary[Node],
      outputs: js.Array[Node],
      placeholders: js.Array[Node],
      weights: js.Array[Node]
    ): Graph = {
      val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], placeholders = placeholders.asInstanceOf[js.Any], weights = weights.asInstanceOf[js.Any])
      __obj.asInstanceOf[Graph]
    }
    
    @scala.inline
    implicit class GraphMutableBuilder[Self <: Graph] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctions(value: StringDictionary[Graph]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      @scala.inline
      def setInitNodes(value: js.Array[Node]): Self = StObject.set(x, "initNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitNodesUndefined: Self = StObject.set(x, "initNodes", js.undefined)
      
      @scala.inline
      def setInitNodesVarargs(value: Node*): Self = StObject.set(x, "initNodes", js.Array(value :_*))
      
      @scala.inline
      def setInputs(value: js.Array[Node]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsVarargs(value: Node*): Self = StObject.set(x, "inputs", js.Array(value :_*))
      
      @scala.inline
      def setNodes(value: StringDictionary[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputs(value: js.Array[Node]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputsVarargs(value: Node*): Self = StObject.set(x, "outputs", js.Array(value :_*))
      
      @scala.inline
      def setPlaceholders(value: js.Array[Node]): Self = StObject.set(x, "placeholders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholdersVarargs(value: Node*): Self = StObject.set(x, "placeholders", js.Array(value :_*))
      
      @scala.inline
      def setSignature(value: ISignatureDef): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      
      @scala.inline
      def setWeights(value: js.Array[Node]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightsVarargs(value: Node*): Self = StObject.set(x, "weights", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GraphNode extends StObject {
    
    var attrs: StringDictionary[ValueType] = js.native
    
    var inputs: js.Array[Tensor[Rank]] = js.native
  }
  object GraphNode {
    
    @scala.inline
    def apply(attrs: StringDictionary[ValueType], inputs: js.Array[Tensor[Rank]]): GraphNode = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphNode]
    }
    
    @scala.inline
    implicit class GraphNodeMutableBuilder[Self <: GraphNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: StringDictionary[ValueType]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputs(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    }
  }
  
  @js.native
  trait InputParamMapper extends ParamMapper {
    
    var end: js.UndefOr[Double] = js.native
    
    var start: Double = js.native
  }
  object InputParamMapper {
    
    @scala.inline
    def apply(name: String, start: Double, `type`: ParamType): InputParamMapper = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputParamMapper]
    }
    
    @scala.inline
    implicit class InputParamMapperMutableBuilder[Self <: InputParamMapper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InputParamValue extends ParamValue {
    
    var inputIndexEnd: js.UndefOr[Double] = js.native
    
    var inputIndexStart: js.UndefOr[Double] = js.native
  }
  object InputParamValue {
    
    @scala.inline
    def apply(`type`: ParamType): InputParamValue = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputParamValue]
    }
    
    @scala.inline
    implicit class InputParamValueMutableBuilder[Self <: InputParamValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInputIndexEnd(value: Double): Self = StObject.set(x, "inputIndexEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputIndexEndUndefined: Self = StObject.set(x, "inputIndexEnd", js.undefined)
      
      @scala.inline
      def setInputIndexStart(value: Double): Self = StObject.set(x, "inputIndexStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputIndexStartUndefined: Self = StObject.set(x, "inputIndexStart", js.undefined)
    }
  }
  
  type InternalOpAsyncExecutor = js.Function4[
    /* node */ Node, 
    /* tensorMap */ NamedTensorsMap, 
    /* context */ ExecutionContext, 
    /* resourceManager */ js.UndefOr[ResourceManager], 
    js.Promise[js.Array[Tensor[Rank]]]
  ]
  
  type InternalOpExecutor = js.Function3[
    /* node */ Node, 
    /* tensorMap */ NamedTensorsMap, 
    /* context */ ExecutionContext, 
    Tensor[Rank] | js.Array[Tensor[Rank]]
  ]
  
  @js.native
  trait Node extends StObject {
    
    var attrParams: StringDictionary[ParamValue] = js.native
    
    var category: Category = js.native
    
    var children: js.Array[Node] = js.native
    
    var defaultOutput: js.UndefOr[Double] = js.native
    
    var inputNames: js.Array[String] = js.native
    
    var inputParams: StringDictionary[InputParamValue] = js.native
    
    var inputs: js.Array[Node] = js.native
    
    var name: String = js.native
    
    var op: String = js.native
    
    var rawAttrs: js.UndefOr[StringDictionary[IAttrValue]] = js.native
    
    var signatureKey: js.UndefOr[String] = js.native
  }
  object Node {
    
    @scala.inline
    def apply(
      attrParams: StringDictionary[ParamValue],
      category: Category,
      children: js.Array[Node],
      inputNames: js.Array[String],
      inputParams: StringDictionary[InputParamValue],
      inputs: js.Array[Node],
      name: String,
      op: String
    ): Node = {
      val __obj = js.Dynamic.literal(attrParams = attrParams.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], inputNames = inputNames.asInstanceOf[js.Any], inputParams = inputParams.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrParams(value: StringDictionary[ParamValue]): Self = StObject.set(x, "attrParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategory(value: Category): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDefaultOutput(value: Double): Self = StObject.set(x, "defaultOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOutputUndefined: Self = StObject.set(x, "defaultOutput", js.undefined)
      
      @scala.inline
      def setInputNames(value: js.Array[String]): Self = StObject.set(x, "inputNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputNamesVarargs(value: String*): Self = StObject.set(x, "inputNames", js.Array(value :_*))
      
      @scala.inline
      def setInputParams(value: StringDictionary[InputParamValue]): Self = StObject.set(x, "inputParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputs(value: js.Array[Node]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsVarargs(value: Node*): Self = StObject.set(x, "inputs", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawAttrs(value: StringDictionary[IAttrValue]): Self = StObject.set(x, "rawAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawAttrsUndefined: Self = StObject.set(x, "rawAttrs", js.undefined)
      
      @scala.inline
      def setSignatureKey(value: String): Self = StObject.set(x, "signatureKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureKeyUndefined: Self = StObject.set(x, "signatureKey", js.undefined)
    }
  }
  
  type OpExecutor = js.Function1[
    /* node */ GraphNode, 
    Tensor[Rank] | js.Array[Tensor[Rank]] | (js.Promise[Tensor[Rank] | js.Array[Tensor[Rank]]])
  ]
  
  @js.native
  trait OpMapper extends StObject {
    
    var attrs: js.UndefOr[js.Array[AttrParamMapper]] = js.native
    
    var category: js.UndefOr[Category] = js.native
    
    var customExecutor: js.UndefOr[OpExecutor] = js.native
    
    var inputs: js.UndefOr[js.Array[InputParamMapper]] = js.native
    
    var tfOpName: String = js.native
  }
  object OpMapper {
    
    @scala.inline
    def apply(tfOpName: String): OpMapper = {
      val __obj = js.Dynamic.literal(tfOpName = tfOpName.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpMapper]
    }
    
    @scala.inline
    implicit class OpMapperMutableBuilder[Self <: OpMapper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: js.Array[AttrParamMapper]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      @scala.inline
      def setAttrsVarargs(value: AttrParamMapper*): Self = StObject.set(x, "attrs", js.Array(value :_*))
      
      @scala.inline
      def setCategory(value: Category): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setCustomExecutor(
        value: /* node */ GraphNode => Tensor[Rank] | js.Array[Tensor[Rank]] | (js.Promise[Tensor[Rank] | js.Array[Tensor[Rank]]])
      ): Self = StObject.set(x, "customExecutor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomExecutorUndefined: Self = StObject.set(x, "customExecutor", js.undefined)
      
      @scala.inline
      def setInputs(value: js.Array[InputParamMapper]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
      
      @scala.inline
      def setInputsVarargs(value: InputParamMapper*): Self = StObject.set(x, "inputs", js.Array(value :_*))
      
      @scala.inline
      def setTfOpName(value: String): Self = StObject.set(x, "tfOpName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParamMapper extends StObject {
    
    var defaultValue: js.UndefOr[ValueType] = js.native
    
    var name: String = js.native
    
    var notSupported: js.UndefOr[Boolean] = js.native
    
    var `type`: ParamType = js.native
  }
  object ParamMapper {
    
    @scala.inline
    def apply(name: String, `type`: ParamType): ParamMapper = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParamMapper]
    }
    
    @scala.inline
    implicit class ParamMapperMutableBuilder[Self <: ParamMapper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: ValueType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: (js.Array[Double] | Boolean | Double | String | Tensor[Rank])*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotSupported(value: Boolean): Self = StObject.set(x, "notSupported", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotSupportedUndefined: Self = StObject.set(x, "notSupported", js.undefined)
      
      @scala.inline
      def setType(value: ParamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.number
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.string
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`string[]`
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`number[]`
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.bool
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`bool[]`
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.shape
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`shape[]`
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.tensor
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.tensors
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.dtype
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`dtype[]`
    - typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.func
  */
  trait ParamType extends StObject
  object ParamType {
    
    @scala.inline
    def bool: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.bool = "bool".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.bool]
    
    @scala.inline
    def `bool[]`: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`bool[]` = "bool[]".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`bool[]`]
    
    @scala.inline
    def dtype: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.dtype = "dtype".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.dtype]
    
    @scala.inline
    def `dtype[]`: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`dtype[]` = "dtype[]".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`dtype[]`]
    
    @scala.inline
    def func: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.func = "func".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.func]
    
    @scala.inline
    def number: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.number = "number".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.number]
    
    @scala.inline
    def `number[]`: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`number[]` = "number[]".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`number[]`]
    
    @scala.inline
    def shape: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.shape = "shape".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.shape]
    
    @scala.inline
    def `shape[]`: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`shape[]` = "shape[]".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`shape[]`]
    
    @scala.inline
    def string: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.string = "string".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.string]
    
    @scala.inline
    def `string[]`: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`string[]` = "string[]".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.`string[]`]
    
    @scala.inline
    def tensor: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.tensor = "tensor".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.tensor]
    
    @scala.inline
    def tensors: typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.tensors = "tensors".asInstanceOf[typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.tensors]
  }
  
  @js.native
  trait ParamValue extends StObject {
    
    var `type`: ParamType = js.native
    
    var value: js.UndefOr[ValueType] = js.native
  }
  object ParamValue {
    
    @scala.inline
    def apply(`type`: ParamType): ParamValue = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParamValue]
    }
    
    @scala.inline
    implicit class ParamValueMutableBuilder[Self <: ParamValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: ParamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: (js.Array[Double] | Boolean | Double | String | Tensor[Rank])*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type ValueType = String | (js.Array[js.Array[Double] | Boolean | Double | String | Tensor[Rank]]) | Double | Boolean | Tensor[Rank]
}
