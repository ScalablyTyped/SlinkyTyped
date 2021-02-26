package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.serialization.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typingsSlinky.tensorflowTfjsCore.typesMod.IOHandler
import typingsSlinky.tensorflowTfjsCore.typesMod.LoadOptions
import typingsSlinky.tensorflowTfjsLayers.advancedActivationsMod.ELULayerArgs
import typingsSlinky.tensorflowTfjsLayers.advancedActivationsMod.LeakyReLULayerArgs
import typingsSlinky.tensorflowTfjsLayers.advancedActivationsMod.PReLULayerArgs
import typingsSlinky.tensorflowTfjsLayers.advancedActivationsMod.ReLULayerArgs
import typingsSlinky.tensorflowTfjsLayers.advancedActivationsMod.SoftmaxLayerArgs
import typingsSlinky.tensorflowTfjsLayers.advancedActivationsMod.ThresholdedReLULayerArgs
import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.BaseCallback
import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.BaseCallbackConstructor
import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.CustomCallbackArgs
import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.YieldEveryOptions
import typingsSlinky.tensorflowTfjsLayers.callbacksMod.EarlyStoppingCallbackArgs
import typingsSlinky.tensorflowTfjsLayers.callbacksMod.EarlyStopping_
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.Constraint
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.MaxNormArgs
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.MinMaxNormArgs
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.UnitNormArgs
import typingsSlinky.tensorflowTfjsLayers.containerMod.ContainerArgs
import typingsSlinky.tensorflowTfjsLayers.convolutionalDepthwiseMod.DepthwiseConv2DLayerArgs
import typingsSlinky.tensorflowTfjsLayers.convolutionalMod.ConvLayerArgs
import typingsSlinky.tensorflowTfjsLayers.convolutionalMod.Cropping2DLayerArgs
import typingsSlinky.tensorflowTfjsLayers.convolutionalMod.SeparableConvLayerArgs
import typingsSlinky.tensorflowTfjsLayers.convolutionalMod.UpSampling2DLayerArgs
import typingsSlinky.tensorflowTfjsLayers.convolutionalRecurrentMod.ConvLSTM2D
import typingsSlinky.tensorflowTfjsLayers.convolutionalRecurrentMod.ConvLSTM2DArgs
import typingsSlinky.tensorflowTfjsLayers.convolutionalRecurrentMod.ConvLSTM2DCell
import typingsSlinky.tensorflowTfjsLayers.convolutionalRecurrentMod.ConvLSTM2DCellArgs
import typingsSlinky.tensorflowTfjsLayers.coreMod.ActivationLayerArgs
import typingsSlinky.tensorflowTfjsLayers.coreMod.DenseLayerArgs
import typingsSlinky.tensorflowTfjsLayers.coreMod.DropoutLayerArgs
import typingsSlinky.tensorflowTfjsLayers.coreMod.FlattenLayerArgs
import typingsSlinky.tensorflowTfjsLayers.coreMod.MaskingArgs
import typingsSlinky.tensorflowTfjsLayers.coreMod.PermuteLayerArgs
import typingsSlinky.tensorflowTfjsLayers.coreMod.RepeatVectorLayerArgs
import typingsSlinky.tensorflowTfjsLayers.coreMod.ReshapeLayerArgs
import typingsSlinky.tensorflowTfjsLayers.coreMod.SpatialDropout1DLayerConfig
import typingsSlinky.tensorflowTfjsLayers.distTypesMod.Kwargs
import typingsSlinky.tensorflowTfjsLayers.embeddingsMod.EmbeddingLayerArgs
import typingsSlinky.tensorflowTfjsLayers.initializersMod.ConstantArgs
import typingsSlinky.tensorflowTfjsLayers.initializersMod.IdentityArgs
import typingsSlinky.tensorflowTfjsLayers.initializersMod.Initializer
import typingsSlinky.tensorflowTfjsLayers.initializersMod.OrthogonalArgs
import typingsSlinky.tensorflowTfjsLayers.initializersMod.RandomNormalArgs
import typingsSlinky.tensorflowTfjsLayers.initializersMod.RandomUniformArgs
import typingsSlinky.tensorflowTfjsLayers.initializersMod.SeedOnlyInitializerArgs
import typingsSlinky.tensorflowTfjsLayers.initializersMod.TruncatedNormalArgs
import typingsSlinky.tensorflowTfjsLayers.initializersMod.VarianceScalingArgs
import typingsSlinky.tensorflowTfjsLayers.initializersMod.Zeros
import typingsSlinky.tensorflowTfjsLayers.inputLayerMod.InputConfig
import typingsSlinky.tensorflowTfjsLayers.inputLayerMod.InputLayerArgs
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsSlinky.tensorflowTfjsLayers.mergeMod.ConcatenateLayerArgs
import typingsSlinky.tensorflowTfjsLayers.mergeMod.DotLayerArgs
import typingsSlinky.tensorflowTfjsLayers.modelsMod.ModelAndWeightsConfig
import typingsSlinky.tensorflowTfjsLayers.modelsMod.Sequential
import typingsSlinky.tensorflowTfjsLayers.modelsMod.SequentialArgs
import typingsSlinky.tensorflowTfjsLayers.noiseMod.AlphaDropout
import typingsSlinky.tensorflowTfjsLayers.noiseMod.AlphaDropoutArgs
import typingsSlinky.tensorflowTfjsLayers.noiseMod.GaussianDropout
import typingsSlinky.tensorflowTfjsLayers.noiseMod.GaussianDropoutArgs
import typingsSlinky.tensorflowTfjsLayers.noiseMod.GaussianNoise
import typingsSlinky.tensorflowTfjsLayers.noiseMod.GaussianNoiseArgs
import typingsSlinky.tensorflowTfjsLayers.normalizationMod.BatchNormalizationLayerArgs
import typingsSlinky.tensorflowTfjsLayers.normalizationMod.LayerNormalizationLayerArgs
import typingsSlinky.tensorflowTfjsLayers.paddingMod.ZeroPadding2DLayerArgs
import typingsSlinky.tensorflowTfjsLayers.poolingMod.GlobalPooling2DLayerArgs
import typingsSlinky.tensorflowTfjsLayers.poolingMod.Pooling1DLayerArgs
import typingsSlinky.tensorflowTfjsLayers.poolingMod.Pooling2DLayerArgs
import typingsSlinky.tensorflowTfjsLayers.poolingMod.Pooling3DLayerArgs
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.GRUCellLayerArgs
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.GRULayerArgs
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.LSTMCellLayerArgs
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.LSTMLayerArgs
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.RNNLayerArgs
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.RNN_
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.SimpleRNNCellLayerArgs
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.SimpleRNNLayerArgs
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.StackedRNNCellsArgs
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.L1Args
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.L1L2Args
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.L2Args
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.Regularizer
import typingsSlinky.tensorflowTfjsLayers.topologyMod.InputSpecArgs
import typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import typingsSlinky.tensorflowTfjsLayers.typesMod.PyJsonDict
import typingsSlinky.tensorflowTfjsLayers.wrappersMod.Bidirectional
import typingsSlinky.tensorflowTfjsLayers.wrappersMod.BidirectionalLayerArgs
import typingsSlinky.tensorflowTfjsLayers.wrappersMod.WrapperLayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tensorflow/tfjs-layers", "Callback")
  @js.native
  abstract class Callback ()
    extends typingsSlinky.tensorflowTfjsLayers.callbacksMod.Callback
  
  @JSImport("@tensorflow/tfjs-layers", "CallbackList")
  @js.native
  /**
    * Constructor of CallbackList.
    * @param callbacks Array of `Callback` instances.
    * @param queueLength Queue length for keeping running statistics over
    *   callback execution time.
    */
  class CallbackList ()
    extends typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.CallbackList {
    def this(callbacks: js.Array[BaseCallback]) = this()
    def this(callbacks: js.UndefOr[scala.Nothing], queueLength: Double) = this()
    def this(callbacks: js.Array[BaseCallback], queueLength: Double) = this()
  }
  
  @JSImport("@tensorflow/tfjs-layers", "CustomCallback")
  @js.native
  class CustomCallback protected ()
    extends typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.CustomCallback {
    def this(args: CustomCallbackArgs) = this()
    def this(args: CustomCallbackArgs, yieldEvery: YieldEveryOptions) = this()
  }
  
  @JSImport("@tensorflow/tfjs-layers", "EarlyStopping")
  @js.native
  class EarlyStopping () extends EarlyStopping_ {
    def this(args: EarlyStoppingCallbackArgs) = this()
  }
  
  @JSImport("@tensorflow/tfjs-layers", "History")
  @js.native
  class History ()
    extends typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.History
  
  @JSImport("@tensorflow/tfjs-layers", "InputSpec")
  @js.native
  class InputSpec protected ()
    extends typingsSlinky.tensorflowTfjsLayers.topologyMod.InputSpec {
    def this(args: InputSpecArgs) = this()
  }
  
  @JSImport("@tensorflow/tfjs-layers", "LayerVariable")
  @js.native
  class LayerVariable protected ()
    extends typingsSlinky.tensorflowTfjsLayers.variablesMod.LayerVariable {
    /**
      * Construct Variable from a `tf.Tensor`.
      *
      * If not explicitly named, the Variable will be given a name with the
      * prefix 'Variable'. Variable names are unique. In the case of name
      * collision, suffixies '_<num>' will be added to the name.
      *
      * @param val Initial value of the Variable.
      * @param name Name of the variable. If `null` or `undefined` is provided, it
      *   will default a name with the prefix 'Variable'.
      * @param constraint Optional, projection function to be applied to the
      * variable after optimize updates
      * @throws ValueError if `name` is `null` or `undefined`.
      */
    def this(`val`: Tensor[Rank]) = this()
    def this(`val`: Tensor[Rank], dtype: DataType) = this()
    def this(`val`: Tensor[Rank], dtype: js.UndefOr[scala.Nothing], name: String) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      trainable: Boolean
    ) = this()
    def this(`val`: Tensor[Rank], dtype: js.UndefOr[scala.Nothing], name: String, trainable: Boolean) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: js.UndefOr[scala.Nothing], trainable: Boolean) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String, trainable: Boolean) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      trainable: js.UndefOr[scala.Nothing],
      constraint: Constraint
    ) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      trainable: Boolean,
      constraint: Constraint
    ) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: js.UndefOr[scala.Nothing],
      name: String,
      trainable: js.UndefOr[scala.Nothing],
      constraint: Constraint
    ) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: js.UndefOr[scala.Nothing],
      name: String,
      trainable: Boolean,
      constraint: Constraint
    ) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: DataType,
      name: js.UndefOr[scala.Nothing],
      trainable: js.UndefOr[scala.Nothing],
      constraint: Constraint
    ) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: DataType,
      name: js.UndefOr[scala.Nothing],
      trainable: Boolean,
      constraint: Constraint
    ) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: DataType,
      name: String,
      trainable: js.UndefOr[scala.Nothing],
      constraint: Constraint
    ) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String, trainable: Boolean, constraint: Constraint) = this()
  }
  
  @JSImport("@tensorflow/tfjs-layers", "LayersModel")
  @js.native
  class LayersModel protected ()
    extends typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel {
    def this(args: ContainerArgs) = this()
  }
  /* static members */
  object LayersModel {
    
    @JSImport("@tensorflow/tfjs-layers", "LayersModel")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers", "LayersModel.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers", "RNN")
  @js.native
  class RNN protected () extends RNN_ {
    def this(args: RNNLayerArgs) = this()
  }
  /* static members */
  object RNN {
    
    @JSImport("@tensorflow/tfjs-layers", "RNN")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers", "RNN.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers", "RNN.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
    @JSImport("@tensorflow/tfjs-layers", "RNN.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers", "Sequential")
  @js.native
  class Sequential_ () extends Sequential {
    def this(args: SequentialArgs) = this()
  }
  /* static members */
  object Sequential_ {
    
    @JSImport("@tensorflow/tfjs-layers", "Sequential")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers", "Sequential.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers", "Sequential.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
    @JSImport("@tensorflow/tfjs-layers", "Sequential.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](
      cls: SerializableConstructor[T],
      config: ConfigDict,
      customObjects: js.UndefOr[scala.Nothing],
      fastWeightInit: Boolean
    ): T = js.native
    @JSImport("@tensorflow/tfjs-layers", "Sequential.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
    @JSImport("@tensorflow/tfjs-layers", "Sequential.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](
      cls: SerializableConstructor[T],
      config: ConfigDict,
      customObjects: ConfigDict,
      fastWeightInit: Boolean
    ): T = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers", "SymbolicTensor")
  @js.native
  class SymbolicTensor protected ()
    extends typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor {
    /**
      *
      * @param dtype
      * @param shape
      * @param sourceLayer The Layer that produced this symbolic tensor.
      * @param inputs The inputs passed to sourceLayer's __call__() method.
      * @param nodeIndex
      * @param tensorIndex
      * @param callArgs The keyword arguments passed to the __call__() method.
      * @param name
      * @param outputTensorIndex The index of this tensor in the list of outputs
      *   returned by apply().
      */
    def this(
      dtype: DataType,
      shape: Shape,
      sourceLayer: Layer,
      inputs: js.Array[typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor],
      callArgs: Kwargs
    ) = this()
    def this(
      dtype: DataType,
      shape: Shape,
      sourceLayer: Layer,
      inputs: js.Array[typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor],
      callArgs: Kwargs,
      name: String
    ) = this()
    def this(
      dtype: DataType,
      shape: Shape,
      sourceLayer: Layer,
      inputs: js.Array[typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor],
      callArgs: Kwargs,
      name: js.UndefOr[scala.Nothing],
      outputTensorIndex: Double
    ) = this()
    def this(
      dtype: DataType,
      shape: Shape,
      sourceLayer: Layer,
      inputs: js.Array[typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor],
      callArgs: Kwargs,
      name: String,
      outputTensorIndex: Double
    ) = this()
  }
  
  object callbacks {
    
    @JSImport("@tensorflow/tfjs-layers", "callbacks")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "callbacks.earlyStopping")
    @js.native
    def earlyStopping(): EarlyStopping_ = js.native
    @JSImport("@tensorflow/tfjs-layers", "callbacks.earlyStopping")
    @js.native
    def earlyStopping(args: EarlyStoppingCallbackArgs): EarlyStopping_ = js.native
    @JSImport("@tensorflow/tfjs-layers", "callbacks.earlyStopping")
    @js.native
    def earlyStopping_Fcallbacks: js.Function1[/* args */ js.UndefOr[EarlyStoppingCallbackArgs], EarlyStopping_] = js.native
    
    @scala.inline
    def earlyStopping_Fcallbacks_=(x: js.Function1[/* args */ js.UndefOr[EarlyStoppingCallbackArgs], EarlyStopping_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("earlyStopping")(x.asInstanceOf[js.Any])
  }
  
  object constraints {
    
    @JSImport("@tensorflow/tfjs-layers", "constraints.maxNorm")
    @js.native
    def maxNorm(args: MaxNormArgs): Constraint = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "constraints.minMaxNorm")
    @js.native
    def minMaxNorm(config: MinMaxNormArgs): Constraint = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "constraints.nonNeg")
    @js.native
    def nonNeg(): Constraint = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "constraints.unitNorm")
    @js.native
    def unitNorm(args: UnitNormArgs): Constraint = js.native
  }
  
  object initializers {
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.constant")
    @js.native
    def constant(args: ConstantArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.glorotNormal")
    @js.native
    def glorotNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.glorotUniform")
    @js.native
    def glorotUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.heNormal")
    @js.native
    def heNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.heUniform")
    @js.native
    def heUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.identity")
    @js.native
    def identity(args: IdentityArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.leCunNormal")
    @js.native
    def leCunNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.leCunUniform")
    @js.native
    def leCunUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.ones")
    @js.native
    def ones(): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.orthogonal")
    @js.native
    def orthogonal(args: OrthogonalArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.randomNormal")
    @js.native
    def randomNormal(args: RandomNormalArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.randomUniform")
    @js.native
    def randomUniform(args: RandomUniformArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.truncatedNormal")
    @js.native
    def truncatedNormal(args: TruncatedNormalArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.varianceScaling")
    @js.native
    def varianceScaling(config: VarianceScalingArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.zeros")
    @js.native
    def zeros(): Zeros = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers", "input")
  @js.native
  def input(config: InputConfig): typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor = js.native
  
  object layers {
    
    @JSImport("@tensorflow/tfjs-layers", "layers.Layer")
    @js.native
    abstract class Layer ()
      extends typingsSlinky.tensorflowTfjsLayers.exportsLayersMod.Layer {
      def this(args: LayerArgs) = this()
    }
    /* static members */
    object Layer {
      
      /**
        * Converts a layer and its index to a unique (immutable type) name.
        * This function is used internally with `this.containerNodes`.
        * @param layer The layer.
        * @param nodeIndex The layer's position (e.g. via enumerate) in a list of
        *   nodes.
        *
        * @returns The unique name.
        */
      @JSImport("@tensorflow/tfjs-layers", "layers.Layer.nodeKey")
      @js.native
      def nodeKey(layer: typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer, nodeIndex: Double): String = js.native
    }
    
    @JSImport("@tensorflow/tfjs-layers", "layers.RNNCell")
    @js.native
    abstract class RNNCell ()
      extends typingsSlinky.tensorflowTfjsLayers.exportsLayersMod.RNNCell {
      def this(args: LayerArgs) = this()
    }
    
    @JSImport("@tensorflow/tfjs-layers", "layers.RNN")
    @js.native
    class RNN_ protected ()
      extends typingsSlinky.tensorflowTfjsLayers.exportsLayersMod.RNN_ {
      def this(args: RNNLayerArgs) = this()
    }
    /* static members */
    object RNN_ {
      
      @JSImport("@tensorflow/tfjs-layers", "layers.RNN")
      @js.native
      val ^ : js.Any = js.native
      
      /** @nocollapse */
      @JSImport("@tensorflow/tfjs-layers", "layers.RNN.className")
      @js.native
      def className: String = js.native
      @scala.inline
      def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** @nocollapse */
      @JSImport("@tensorflow/tfjs-layers", "layers.RNN.fromConfig")
      @js.native
      def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
      @JSImport("@tensorflow/tfjs-layers", "layers.RNN.fromConfig")
      @js.native
      def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
    }
    
    @JSImport("@tensorflow/tfjs-layers", "layers.activation")
    @js.native
    def activation(args: ActivationLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.add")
    @js.native
    def add(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.add")
    @js.native
    def add(args: LayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.alphaDropout")
    @js.native
    def alphaDropout(args: AlphaDropoutArgs): AlphaDropout = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.average")
    @js.native
    def average(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.average")
    @js.native
    def average(args: LayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.averagePooling1d")
    @js.native
    def averagePooling1d(args: Pooling1DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.averagePooling2d")
    @js.native
    def averagePooling2d(args: Pooling2DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.averagePooling3d")
    @js.native
    def averagePooling3d(args: Pooling3DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.avgPool1d")
    @js.native
    def avgPool1d(args: Pooling1DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.avgPool2d")
    @js.native
    def avgPool2d(args: Pooling2DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.avgPool3d")
    @js.native
    def avgPool3d(args: Pooling3DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.avgPooling1d")
    @js.native
    def avgPooling1d(args: Pooling1DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.avgPooling2d")
    @js.native
    def avgPooling2d(args: Pooling2DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.avgPooling3d")
    @js.native
    def avgPooling3d(args: Pooling3DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.batchNormalization")
    @js.native
    def batchNormalization(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.batchNormalization")
    @js.native
    def batchNormalization(args: BatchNormalizationLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.bidirectional")
    @js.native
    def bidirectional(args: BidirectionalLayerArgs): Bidirectional = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.concatenate")
    @js.native
    def concatenate(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.concatenate")
    @js.native
    def concatenate(args: ConcatenateLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.conv1d")
    @js.native
    def conv1d(args: ConvLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.conv2d")
    @js.native
    def conv2d(args: ConvLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.conv2dTranspose")
    @js.native
    def conv2dTranspose(args: ConvLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.conv3d")
    @js.native
    def conv3d(args: ConvLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.convLstm2d")
    @js.native
    def convLstm2d(args: ConvLSTM2DArgs): ConvLSTM2D = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.convLstm2dCell")
    @js.native
    def convLstm2dCell(args: ConvLSTM2DCellArgs): ConvLSTM2DCell = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.cropping2D")
    @js.native
    def cropping2D(args: Cropping2DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.dense")
    @js.native
    def dense(args: DenseLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.depthwiseConv2d")
    @js.native
    def depthwiseConv2d(args: DepthwiseConv2DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.dot")
    @js.native
    def dot(args: DotLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.dropout")
    @js.native
    def dropout(args: DropoutLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.elu")
    @js.native
    def elu(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.elu")
    @js.native
    def elu(args: ELULayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.embedding")
    @js.native
    def embedding(args: EmbeddingLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.flatten")
    @js.native
    def flatten(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.flatten")
    @js.native
    def flatten(args: FlattenLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.gaussianDropout")
    @js.native
    def gaussianDropout(args: GaussianDropoutArgs): GaussianDropout = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.gaussianNoise")
    @js.native
    def gaussianNoise(args: GaussianNoiseArgs): GaussianNoise = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.globalAveragePooling1d")
    @js.native
    def globalAveragePooling1d(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.globalAveragePooling1d")
    @js.native
    def globalAveragePooling1d(args: LayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.globalAveragePooling2d")
    @js.native
    def globalAveragePooling2d(args: GlobalPooling2DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.globalMaxPool1d")
    @js.native
    val globalMaxPool1d: js.Function1[
        /* args */ js.UndefOr[LayerArgs], 
        typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
      ] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.globalMaxPool2d")
    @js.native
    val globalMaxPool2d: js.Function1[
        /* args */ GlobalPooling2DLayerArgs, 
        typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
      ] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.globalMaxPooling1d")
    @js.native
    def globalMaxPooling1d(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.globalMaxPooling1d")
    @js.native
    def globalMaxPooling1d(args: LayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.globalMaxPooling2d")
    @js.native
    def globalMaxPooling2d(args: GlobalPooling2DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.gru")
    @js.native
    def gru(args: GRULayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.gruCell")
    @js.native
    def gruCell(args: GRUCellLayerArgs): typingsSlinky.tensorflowTfjsLayers.recurrentMod.RNNCell = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.input")
    @js.native
    def input(config: InputConfig): typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.inputLayer")
    @js.native
    def inputLayer(args: InputLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.layerNormalization")
    @js.native
    def layerNormalization(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.layerNormalization")
    @js.native
    def layerNormalization(args: LayerNormalizationLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.leakyReLU")
    @js.native
    def leakyReLU(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.leakyReLU")
    @js.native
    def leakyReLU(args: LeakyReLULayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.lstm")
    @js.native
    def lstm(args: LSTMLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.lstmCell")
    @js.native
    def lstmCell(args: LSTMCellLayerArgs): typingsSlinky.tensorflowTfjsLayers.recurrentMod.RNNCell = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.masking")
    @js.native
    def masking(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.masking")
    @js.native
    def masking(args: MaskingArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.maxPool1d")
    @js.native
    val maxPool1d: js.Function1[
        /* args */ Pooling1DLayerArgs, 
        typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
      ] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.maxPool2d")
    @js.native
    val maxPool2d: js.Function1[
        /* args */ Pooling2DLayerArgs, 
        typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
      ] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.maxPooling1d")
    @js.native
    def maxPooling1d(args: Pooling1DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.maxPooling2d")
    @js.native
    def maxPooling2d(args: Pooling2DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.maxPooling3d")
    @js.native
    def maxPooling3d(args: Pooling3DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.maximum")
    @js.native
    def maximum(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.maximum")
    @js.native
    def maximum(args: LayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.minimum")
    @js.native
    def minimum(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.minimum")
    @js.native
    def minimum(args: LayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.multiply")
    @js.native
    def multiply(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.multiply")
    @js.native
    def multiply(args: LayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.permute")
    @js.native
    def permute(args: PermuteLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.prelu")
    @js.native
    def prelu(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.prelu")
    @js.native
    def prelu(args: PReLULayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.reLU")
    @js.native
    def reLU(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.reLU")
    @js.native
    def reLU(args: ReLULayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.repeatVector")
    @js.native
    def repeatVector(args: RepeatVectorLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.reshape")
    @js.native
    def reshape(args: ReshapeLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.rnn")
    @js.native
    def rnn(args: RNNLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.separableConv2d")
    @js.native
    def separableConv2d(args: SeparableConvLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.simpleRNN")
    @js.native
    def simpleRNN(args: SimpleRNNLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.simpleRNNCell")
    @js.native
    def simpleRNNCell(args: SimpleRNNCellLayerArgs): typingsSlinky.tensorflowTfjsLayers.recurrentMod.RNNCell = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.softmax")
    @js.native
    def softmax(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.softmax")
    @js.native
    def softmax(args: SoftmaxLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.spatialDropout1d")
    @js.native
    def spatialDropout1d(args: SpatialDropout1DLayerConfig): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.stackedRNNCells")
    @js.native
    def stackedRNNCells(args: StackedRNNCellsArgs): typingsSlinky.tensorflowTfjsLayers.recurrentMod.RNNCell = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.thresholdedReLU")
    @js.native
    def thresholdedReLU(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.thresholdedReLU")
    @js.native
    def thresholdedReLU(args: ThresholdedReLULayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.timeDistributed")
    @js.native
    def timeDistributed(args: WrapperLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.upSampling2d")
    @js.native
    def upSampling2d(args: UpSampling2DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.zeroPadding2d")
    @js.native
    def zeroPadding2d(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.zeroPadding2d")
    @js.native
    def zeroPadding2d(args: ZeroPadding2DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers", "loadLayersModel")
  @js.native
  def loadLayersModel(pathOrIOHandler: String): js.Promise[typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers", "loadLayersModel")
  @js.native
  def loadLayersModel(pathOrIOHandler: String, options: LoadOptions): js.Promise[typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers", "loadLayersModel")
  @js.native
  def loadLayersModel(pathOrIOHandler: IOHandler): js.Promise[typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers", "loadLayersModel")
  @js.native
  def loadLayersModel(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  
  object metrics {
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.MAPE")
    @js.native
    def MAPE_(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.MSE")
    @js.native
    def MSE_(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.binaryAccuracy")
    @js.native
    def binaryAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.binaryCrossentropy")
    @js.native
    def binaryCrossentropy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.categoricalAccuracy")
    @js.native
    def categoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.categoricalCrossentropy")
    @js.native
    def categoricalCrossentropy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.cosineProximity")
    @js.native
    def cosineProximity(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.mape")
    @js.native
    def mape(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.meanAbsoluteError")
    @js.native
    def meanAbsoluteError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.meanAbsolutePercentageError")
    @js.native
    def meanAbsolutePercentageError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.meanSquaredError")
    @js.native
    def meanSquaredError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.mse")
    @js.native
    def mse(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.precision")
    @js.native
    def precision(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.recall")
    @js.native
    def recall(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.sparseCategoricalAccuracy")
    @js.native
    def sparseCategoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers", "model")
  @js.native
  def model(args: ContainerArgs): typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel = js.native
  
  object models {
    
    @JSImport("@tensorflow/tfjs-layers", "models.modelFromJSON")
    @js.native
    def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
    @JSImport("@tensorflow/tfjs-layers", "models.modelFromJSON")
    @js.native
    def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
    @JSImport("@tensorflow/tfjs-layers", "models.modelFromJSON")
    @js.native
    def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
    @JSImport("@tensorflow/tfjs-layers", "models.modelFromJSON")
    @js.native
    def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers", "registerCallbackConstructor")
  @js.native
  def registerCallbackConstructor(verbosityLevel: Double, callbackConstructor: BaseCallbackConstructor): Unit = js.native
  
  object regularizers {
    
    @JSImport("@tensorflow/tfjs-layers", "regularizers.l1")
    @js.native
    def l1(): Regularizer = js.native
    @JSImport("@tensorflow/tfjs-layers", "regularizers.l1")
    @js.native
    def l1(config: L1Args): Regularizer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "regularizers.l1l2")
    @js.native
    def l1l2(): Regularizer = js.native
    @JSImport("@tensorflow/tfjs-layers", "regularizers.l1l2")
    @js.native
    def l1l2(config: L1L2Args): Regularizer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "regularizers.l2")
    @js.native
    def l2(): Regularizer = js.native
    @JSImport("@tensorflow/tfjs-layers", "regularizers.l2")
    @js.native
    def l2(config: L2Args): Regularizer = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers", "sequential")
  @js.native
  def sequential(): Sequential = js.native
  @JSImport("@tensorflow/tfjs-layers", "sequential")
  @js.native
  def sequential(config: SequentialArgs): Sequential = js.native
  
  @JSImport("@tensorflow/tfjs-layers", "version_layers")
  @js.native
  val versionLayers: /* "2.7.0" */ String = js.native
}
