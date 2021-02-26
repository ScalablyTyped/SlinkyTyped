package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R3
import typingsSlinky.tensorflowTfjsCore.mod.serialization.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typingsSlinky.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import typingsSlinky.tensorflowTfjsLayers.activationsMod.Activation
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.Constraint
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typingsSlinky.tensorflowTfjsLayers.initializersMod.Initializer
import typingsSlinky.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.BaseRNNLayerArgs
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.LSTMCell
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.RNNCell
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.RNN_
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.Regularizer
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convolutionalRecurrentMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent", "ConvLSTM2D")
  @js.native
  class ConvLSTM2D protected () extends ConvRNN2D {
    def this(args: ConvLSTM2DArgs) = this()
  }
  /* static members */
  object ConvLSTM2D {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent", "ConvLSTM2D")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent", "ConvLSTM2D.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent", "ConvLSTM2D.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.tensorflowTfjsCore.serializationMod.Serializable because Already inherited
  - typingsSlinky.tensorflowTfjsCore.baseMod.serialization.Serializable because Already inherited
  - typingsSlinky.tensorflowTfjsCore.mod.serialization.Serializable because Already inherited
  - typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer because Already inherited
  - typingsSlinky.tensorflowTfjsLayers.recurrentMod.RNNCell because Already inherited
  - typingsSlinky.tensorflowTfjsLayers.convolutionalRecurrentMod.ConvRNN2DCell because var conflicts: _addedWeightNames, _built, _callHook, _losses, _nonTrainableWeights, _refCount, _stateful, _trainableWeights, _updates, activityRegularizer, addInboundNode, batchInputShape, built, dropoutMask, dtype, fastWeightInitDuringBuild, getNodeAtIndex, inboundNodes, initialWeights, inputSpec, name, nonTrainableWeights, outboundNodes, recurrentDropoutMask, stateSize, supportsMasking, trainable, trainableWeights, trainable_. Inlined filters, kernelSize, strides, padding, dataFormat, dilationRate */ @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent", "ConvLSTM2DCell")
  @js.native
  class ConvLSTM2DCell protected () extends LSTMCell {
    def this(args: ConvLSTM2DCellArgs) = this()
    
    val dataFormat: DataFormat = js.native
    
    val dilationRate: js.Array[Double] = js.native
    
    val filters: Double = js.native
    
    def inputConv(x: Tensor[Rank], w: Tensor[Rank]): Tensor[R3] = js.native
    def inputConv(x: Tensor[Rank], w: Tensor[Rank], b: js.UndefOr[scala.Nothing], padding: PaddingMode): Tensor[R3] = js.native
    def inputConv(x: Tensor[Rank], w: Tensor[Rank], b: Tensor[Rank]): Tensor[R3] = js.native
    def inputConv(x: Tensor[Rank], w: Tensor[Rank], b: Tensor[Rank], padding: PaddingMode): Tensor[R3] = js.native
    
    val kernelSize: js.Array[Double] = js.native
    
    val padding: PaddingMode = js.native
    
    def recurrentConv(x: Tensor[Rank], w: Tensor[Rank]): Tensor[R3] = js.native
    
    val strides: js.Array[Double] = js.native
  }
  /* static members */
  object ConvLSTM2DCell {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent", "ConvLSTM2DCell")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent", "ConvLSTM2DCell.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined parent std.Omit<@tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/layers/recurrent.LSTMLayerArgs, 'units' | 'cell'> */
  /* Inlined parent @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent.ConvRNN2DLayerArgs */
  @js.native
  trait ConvLSTM2DArgs extends StObject {
    
    var activation: js.UndefOr[ActivationIdentifier] = js.native
    
    /**
      * If defined, will be used to create an input layer to insert before this
      * layer. If both `inputShape` and `batchInputShape` are defined,
      * `batchInputShape` will be used. This argument is only applicable to input
      * layers (the first layer of a model).
      */
    var batchInputShape: js.UndefOr[Shape] = js.native
    
    /**
      * If `inputShape` is specified and `batchInputShape` is *not* specified,
      * `batchSize` is used to construct the `batchInputShape`: `[batchSize,
      * ...inputShape]`
      */
    var batchSize: js.UndefOr[Double] = js.native
    
    var biasConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
    
    var biasInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    var biasRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
    /**
      * A RNN cell instance. A RNN cell is a class that has:
      *   - a `call()` method, which takes `[Tensor, Tensor]` as the
      *     first input argument. The first item is the input at time t, and
      *     second item is the cell state at time t.
      *     The `call()` method returns `[outputAtT, statesAtTPlus1]`.
      *     The `call()` method of the cell can also take the argument `constants`,
      *     see section "Note on passing external constants" below.
      *     Porting Node: PyKeras overrides the `call()` signature of RNN cells,
      *       which are Layer subtypes, to accept two arguments. tfjs-layers does
      *       not do such overriding. Instead we preseve the `call()` signature,
      *       which due to its `Tensor|Tensor[]` argument and return value, is
      *       flexible enough to handle the inputs and states.
      *   - a `stateSize` attribute. This can be a single integer (single state)
      *     in which case it is the size of the recurrent state (which should be
      *     the same as the size of the cell output). This can also be an Array of
      *     integers (one size per state). In this case, the first entry
      *     (`stateSize[0]`) should be the same as the size of the cell output.
      * It is also possible for `cell` to be a list of RNN cell instances, in which
      * case the cells get stacked on after the other in the RNN, implementing an
      * efficient stacked RNN.
      */
    var cell: js.UndefOr[RNNCell | js.Array[RNNCell]] = js.native
    
    /**
      * Format of the data, which determines the ordering of the dimensions in
      * the inputs.
      *
      * `channels_last` corresponds to inputs with shape
      *   `(batch, ..., channels)`
      *
      *  `channels_first` corresponds to inputs with shape `(batch, channels,
      * ...)`.
      *
      * Defaults to `channels_last`.
      */
    var dataFormat: js.UndefOr[DataFormat] = js.native
    
    /**
      * The dilation rate to use for the dilated convolution in each dimension.
      * Should be an integer or array of two or three integers.
      *
      * Currently, specifying any `dilationRate` value != 1 is incompatible with
      * specifying any `strides` value != 1.
      */
    var dilationRate: js.UndefOr[Double | js.Array[Double] | (js.Tuple2[Double, Double])] = js.native
    
    var dropout: js.UndefOr[Double] = js.native
    
    /**
      * The data-type for this layer. Defaults to 'float32'.
      * This argument is only applicable to input layers (the first layer of a
      * model).
      */
    var dtype: js.UndefOr[DataType] = js.native
    
    /**
      * The dimensionality of the output space (i.e. the number of filters in the
      * convolution).
      */
    var filters: Double = js.native
    
    /**
      * If `true`, process the input sequence backwards and return the reversed
      * sequence (default: `false`).
      */
    var goBackwards: js.UndefOr[Boolean] = js.native
    
    var implementation: js.UndefOr[Double] = js.native
    
    /** Legacy support. Do not use for new code. */
    var inputDType: js.UndefOr[DataType] = js.native
    
    /**
      * Dimensionality of the input (integer).
      *   This option (or alternatively, the option `inputShape`) is required when
      *   this layer is used as the first layer in a model.
      */
    var inputDim: js.UndefOr[Double] = js.native
    
    /**
      * Length of the input sequences, to be specified when it is constant.
      * This argument is required if you are going to connect `Flatten` then
      * `Dense` layers upstream (without it, the shape of the dense outputs cannot
      * be computed). Note that if the recurrent layer is not the first layer in
      * your model, you would need to specify the input length at the level of the
      * first layer (e.g., via the `inputShape` option).
      */
    var inputLength: js.UndefOr[Double] = js.native
    
    /**
      * If defined, will be used to create an input layer to insert before this
      * layer. If both `inputShape` and `batchInputShape` are defined,
      * `batchInputShape` will be used. This argument is only applicable to input
      * layers (the first layer of a model).
      */
    var inputShape: js.UndefOr[Shape] = js.native
    
    var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
    
    var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
    /**
      * The dimensions of the convolution window. If kernelSize is a number, the
      * convolutional window will be square.
      */
    var kernelSize: Double | js.Array[Double] = js.native
    
    /** Name for this layer. */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Padding mode.
      */
    var padding: js.UndefOr[PaddingMode] = js.native
    
    var recurrentActivation: js.UndefOr[ActivationIdentifier] = js.native
    
    var recurrentConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
    
    var recurrentDropout: js.UndefOr[Double] = js.native
    
    var recurrentInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    var recurrentRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
    /**
      * Whether to return the last output in the output sequence, or the full
      * sequence.
      */
    var returnSequences: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to return the last state in addition to the output.
      */
    var returnState: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, the last state for each sample at index i in a batch will be
      * used as initial state of the sample of index i in the following batch
      * (default: `false`).
      *
      * You can set RNN layers to be "stateful", which means that the states
      * computed for the samples in one batch will be reused as initial states
      * for the samples in the next batch. This assumes a one-to-one mapping
      * between samples in different successive batches.
      *
      * To enable "statefulness":
      *   - specify `stateful: true` in the layer constructor.
      *   - specify a fixed batch size for your model, by passing
      *     - if sequential model:
      *       `batchInputShape: [...]` to the first layer in your model.
      *     - else for functional model with 1 or more Input layers:
      *       `batchShape: [...]` to all the first layers in your model.
      *     This is the expected shape of your inputs
      *     *including the batch size*.
      *     It should be a tuple of integers, e.g., `[32, 10, 100]`.
      *   - specify `shuffle: false` when calling `LayersModel.fit()`.
      *
      * To reset the state of your model, call `resetStates()` on either the
      * specific layer or on the entire model.
      */
    var stateful: js.UndefOr[Boolean] = js.native
    
    /**
      * The strides of the convolution in each dimension. If strides is a number,
      * strides in both dimensions are equal.
      *
      * Specifying any stride value != 1 is incompatible with specifying any
      * `dilationRate` value != 1.
      */
    var strides: js.UndefOr[Double | js.Array[Double]] = js.native
    
    /**
      * Whether the weights of this layer are updatable by `fit`.
      * Defaults to true.
      */
    var trainable: js.UndefOr[Boolean] = js.native
    
    var unitForgetBias: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, the network will be unrolled, else a symbolic loop will be
      * used. Unrolling can speed-up a RNN, although it tends to be more memory-
      * intensive. Unrolling is only suitable for short sequences (default:
      * `false`).
      * Porting Note: tfjs-layers has an imperative backend. RNNs are executed with
      *   normal TypeScript control flow. Hence this property is inapplicable and
      *   ignored in tfjs-layers.
      */
    var unroll: js.UndefOr[Boolean] = js.native
    
    var useBias: js.UndefOr[Boolean] = js.native
    
    /**
      * Initial weight values of the layer.
      */
    var weights: js.UndefOr[js.Array[Tensor[Rank]]] = js.native
  }
  object ConvLSTM2DArgs {
    
    @scala.inline
    def apply(filters: Double, kernelSize: Double | js.Array[Double]): ConvLSTM2DArgs = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernelSize = kernelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvLSTM2DArgs]
    }
    
    @scala.inline
    implicit class ConvLSTM2DArgsMutableBuilder[Self <: ConvLSTM2DArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivation(value: ActivationIdentifier): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      @scala.inline
      def setBatchInputShape(value: Shape): Self = StObject.set(x, "batchInputShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchInputShapeUndefined: Self = StObject.set(x, "batchInputShape", js.undefined)
      
      @scala.inline
      def setBatchInputShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "batchInputShape", js.Array(value :_*))
      
      @scala.inline
      def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      @scala.inline
      def setBiasConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "biasConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasConstraintUndefined: Self = StObject.set(x, "biasConstraint", js.undefined)
      
      @scala.inline
      def setBiasInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "biasInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasInitializerUndefined: Self = StObject.set(x, "biasInitializer", js.undefined)
      
      @scala.inline
      def setBiasRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "biasRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasRegularizerUndefined: Self = StObject.set(x, "biasRegularizer", js.undefined)
      
      @scala.inline
      def setCell(value: RNNCell | js.Array[RNNCell]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      @scala.inline
      def setCellVarargs(value: RNNCell*): Self = StObject.set(x, "cell", js.Array(value :_*))
      
      @scala.inline
      def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
      
      @scala.inline
      def setDilationRate(value: Double | js.Array[Double] | (js.Tuple2[Double, Double])): Self = StObject.set(x, "dilationRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDilationRateUndefined: Self = StObject.set(x, "dilationRate", js.undefined)
      
      @scala.inline
      def setDilationRateVarargs(value: Double*): Self = StObject.set(x, "dilationRate", js.Array(value :_*))
      
      @scala.inline
      def setDropout(value: Double): Self = StObject.set(x, "dropout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropoutUndefined: Self = StObject.set(x, "dropout", js.undefined)
      
      @scala.inline
      def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
      
      @scala.inline
      def setFilters(value: Double): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoBackwards(value: Boolean): Self = StObject.set(x, "goBackwards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoBackwardsUndefined: Self = StObject.set(x, "goBackwards", js.undefined)
      
      @scala.inline
      def setImplementation(value: Double): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
      
      @scala.inline
      def setInputDType(value: DataType): Self = StObject.set(x, "inputDType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputDTypeUndefined: Self = StObject.set(x, "inputDType", js.undefined)
      
      @scala.inline
      def setInputDim(value: Double): Self = StObject.set(x, "inputDim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputDimUndefined: Self = StObject.set(x, "inputDim", js.undefined)
      
      @scala.inline
      def setInputLength(value: Double): Self = StObject.set(x, "inputLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputLengthUndefined: Self = StObject.set(x, "inputLength", js.undefined)
      
      @scala.inline
      def setInputShape(value: Shape): Self = StObject.set(x, "inputShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputShapeUndefined: Self = StObject.set(x, "inputShape", js.undefined)
      
      @scala.inline
      def setInputShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "inputShape", js.Array(value :_*))
      
      @scala.inline
      def setKernelConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "kernelConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelConstraintUndefined: Self = StObject.set(x, "kernelConstraint", js.undefined)
      
      @scala.inline
      def setKernelInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "kernelInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelInitializerUndefined: Self = StObject.set(x, "kernelInitializer", js.undefined)
      
      @scala.inline
      def setKernelRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "kernelRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelRegularizerUndefined: Self = StObject.set(x, "kernelRegularizer", js.undefined)
      
      @scala.inline
      def setKernelSize(value: Double | js.Array[Double]): Self = StObject.set(x, "kernelSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelSizeVarargs(value: Double*): Self = StObject.set(x, "kernelSize", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPadding(value: PaddingMode): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setRecurrentActivation(value: ActivationIdentifier): Self = StObject.set(x, "recurrentActivation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrentActivationUndefined: Self = StObject.set(x, "recurrentActivation", js.undefined)
      
      @scala.inline
      def setRecurrentConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "recurrentConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrentConstraintUndefined: Self = StObject.set(x, "recurrentConstraint", js.undefined)
      
      @scala.inline
      def setRecurrentDropout(value: Double): Self = StObject.set(x, "recurrentDropout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrentDropoutUndefined: Self = StObject.set(x, "recurrentDropout", js.undefined)
      
      @scala.inline
      def setRecurrentInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "recurrentInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrentInitializerUndefined: Self = StObject.set(x, "recurrentInitializer", js.undefined)
      
      @scala.inline
      def setRecurrentRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "recurrentRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrentRegularizerUndefined: Self = StObject.set(x, "recurrentRegularizer", js.undefined)
      
      @scala.inline
      def setReturnSequences(value: Boolean): Self = StObject.set(x, "returnSequences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnSequencesUndefined: Self = StObject.set(x, "returnSequences", js.undefined)
      
      @scala.inline
      def setReturnState(value: Boolean): Self = StObject.set(x, "returnState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnStateUndefined: Self = StObject.set(x, "returnState", js.undefined)
      
      @scala.inline
      def setStateful(value: Boolean): Self = StObject.set(x, "stateful", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatefulUndefined: Self = StObject.set(x, "stateful", js.undefined)
      
      @scala.inline
      def setStrides(value: Double | js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
      
      @scala.inline
      def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value :_*))
      
      @scala.inline
      def setTrainable(value: Boolean): Self = StObject.set(x, "trainable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrainableUndefined: Self = StObject.set(x, "trainable", js.undefined)
      
      @scala.inline
      def setUnitForgetBias(value: Boolean): Self = StObject.set(x, "unitForgetBias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitForgetBiasUndefined: Self = StObject.set(x, "unitForgetBias", js.undefined)
      
      @scala.inline
      def setUnroll(value: Boolean): Self = StObject.set(x, "unroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnrollUndefined: Self = StObject.set(x, "unroll", js.undefined)
      
      @scala.inline
      def setUseBias(value: Boolean): Self = StObject.set(x, "useBias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseBiasUndefined: Self = StObject.set(x, "useBias", js.undefined)
      
      @scala.inline
      def setWeights(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightsUndefined: Self = StObject.set(x, "weights", js.undefined)
      
      @scala.inline
      def setWeightsVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "weights", js.Array(value :_*))
    }
  }
  
  /* Inlined parent std.Omit<@tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/layers/recurrent.LSTMCellLayerArgs, 'units'> */
  /* Inlined parent @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent.ConvRNN2DCellArgs */
  @js.native
  trait ConvLSTM2DCellArgs extends StObject {
    
    var activation: js.UndefOr[ActivationIdentifier] = js.native
    
    var batchInputShape: js.UndefOr[Shape] = js.native
    
    var batchSize: js.UndefOr[Double] = js.native
    
    var biasConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
    
    var biasInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    var biasRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
    /**
      * Format of the data, which determines the ordering of the dimensions in
      * the inputs.
      *
      * `channels_last` corresponds to inputs with shape
      *   `(batch, ..., channels)`
      *
      *  `channels_first` corresponds to inputs with shape `(batch, channels,
      * ...)`.
      *
      * Defaults to `channels_last`.
      */
    var dataFormat: js.UndefOr[DataFormat] = js.native
    
    /**
      * The dilation rate to use for the dilated convolution in each dimension.
      * Should be an integer or array of two or three integers.
      *
      * Currently, specifying any `dilationRate` value != 1 is incompatible with
      * specifying any `strides` value != 1.
      */
    var dilationRate: js.UndefOr[Double | js.Array[Double] | (js.Tuple2[Double, Double])] = js.native
    
    var dropout: js.UndefOr[Double] = js.native
    
    var dtype: js.UndefOr[DataType] = js.native
    
    /**
      * The dimensionality of the output space (i.e. the number of filters in the
      * convolution).
      */
    var filters: Double = js.native
    
    var implementation: js.UndefOr[Double] = js.native
    
    var inputDType: js.UndefOr[DataType] = js.native
    
    var inputShape: js.UndefOr[Shape] = js.native
    
    var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
    
    var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
    /**
      * The dimensions of the convolution window. If kernelSize is a number, the
      * convolutional window will be square.
      */
    var kernelSize: Double | js.Array[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    /**
      * Padding mode.
      */
    var padding: js.UndefOr[PaddingMode] = js.native
    
    var recurrentActivation: js.UndefOr[ActivationIdentifier] = js.native
    
    var recurrentConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
    
    var recurrentDropout: js.UndefOr[Double] = js.native
    
    var recurrentInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    var recurrentRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
    /**
      * The strides of the convolution in each dimension. If strides is a number,
      * strides in both dimensions are equal.
      *
      * Specifying any stride value != 1 is incompatible with specifying any
      * `dilationRate` value != 1.
      */
    var strides: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var trainable: js.UndefOr[Boolean] = js.native
    
    var unitForgetBias: js.UndefOr[Boolean] = js.native
    
    var useBias: js.UndefOr[Boolean] = js.native
    
    var weights: js.UndefOr[js.Array[Tensor[Rank]]] = js.native
  }
  object ConvLSTM2DCellArgs {
    
    @scala.inline
    def apply(filters: Double, kernelSize: Double | js.Array[Double]): ConvLSTM2DCellArgs = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernelSize = kernelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvLSTM2DCellArgs]
    }
    
    @scala.inline
    implicit class ConvLSTM2DCellArgsMutableBuilder[Self <: ConvLSTM2DCellArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivation(value: ActivationIdentifier): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      @scala.inline
      def setBatchInputShape(value: Shape): Self = StObject.set(x, "batchInputShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchInputShapeUndefined: Self = StObject.set(x, "batchInputShape", js.undefined)
      
      @scala.inline
      def setBatchInputShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "batchInputShape", js.Array(value :_*))
      
      @scala.inline
      def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      @scala.inline
      def setBiasConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "biasConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasConstraintUndefined: Self = StObject.set(x, "biasConstraint", js.undefined)
      
      @scala.inline
      def setBiasInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "biasInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasInitializerUndefined: Self = StObject.set(x, "biasInitializer", js.undefined)
      
      @scala.inline
      def setBiasRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "biasRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasRegularizerUndefined: Self = StObject.set(x, "biasRegularizer", js.undefined)
      
      @scala.inline
      def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
      
      @scala.inline
      def setDilationRate(value: Double | js.Array[Double] | (js.Tuple2[Double, Double])): Self = StObject.set(x, "dilationRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDilationRateUndefined: Self = StObject.set(x, "dilationRate", js.undefined)
      
      @scala.inline
      def setDilationRateVarargs(value: Double*): Self = StObject.set(x, "dilationRate", js.Array(value :_*))
      
      @scala.inline
      def setDropout(value: Double): Self = StObject.set(x, "dropout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropoutUndefined: Self = StObject.set(x, "dropout", js.undefined)
      
      @scala.inline
      def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
      
      @scala.inline
      def setFilters(value: Double): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplementation(value: Double): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
      
      @scala.inline
      def setInputDType(value: DataType): Self = StObject.set(x, "inputDType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputDTypeUndefined: Self = StObject.set(x, "inputDType", js.undefined)
      
      @scala.inline
      def setInputShape(value: Shape): Self = StObject.set(x, "inputShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputShapeUndefined: Self = StObject.set(x, "inputShape", js.undefined)
      
      @scala.inline
      def setInputShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "inputShape", js.Array(value :_*))
      
      @scala.inline
      def setKernelConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "kernelConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelConstraintUndefined: Self = StObject.set(x, "kernelConstraint", js.undefined)
      
      @scala.inline
      def setKernelInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "kernelInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelInitializerUndefined: Self = StObject.set(x, "kernelInitializer", js.undefined)
      
      @scala.inline
      def setKernelRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "kernelRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelRegularizerUndefined: Self = StObject.set(x, "kernelRegularizer", js.undefined)
      
      @scala.inline
      def setKernelSize(value: Double | js.Array[Double]): Self = StObject.set(x, "kernelSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelSizeVarargs(value: Double*): Self = StObject.set(x, "kernelSize", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPadding(value: PaddingMode): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setRecurrentActivation(value: ActivationIdentifier): Self = StObject.set(x, "recurrentActivation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrentActivationUndefined: Self = StObject.set(x, "recurrentActivation", js.undefined)
      
      @scala.inline
      def setRecurrentConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "recurrentConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrentConstraintUndefined: Self = StObject.set(x, "recurrentConstraint", js.undefined)
      
      @scala.inline
      def setRecurrentDropout(value: Double): Self = StObject.set(x, "recurrentDropout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrentDropoutUndefined: Self = StObject.set(x, "recurrentDropout", js.undefined)
      
      @scala.inline
      def setRecurrentInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "recurrentInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrentInitializerUndefined: Self = StObject.set(x, "recurrentInitializer", js.undefined)
      
      @scala.inline
      def setRecurrentRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "recurrentRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrentRegularizerUndefined: Self = StObject.set(x, "recurrentRegularizer", js.undefined)
      
      @scala.inline
      def setStrides(value: Double | js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
      
      @scala.inline
      def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value :_*))
      
      @scala.inline
      def setTrainable(value: Boolean): Self = StObject.set(x, "trainable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrainableUndefined: Self = StObject.set(x, "trainable", js.undefined)
      
      @scala.inline
      def setUnitForgetBias(value: Boolean): Self = StObject.set(x, "unitForgetBias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitForgetBiasUndefined: Self = StObject.set(x, "unitForgetBias", js.undefined)
      
      @scala.inline
      def setUseBias(value: Boolean): Self = StObject.set(x, "useBias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseBiasUndefined: Self = StObject.set(x, "useBias", js.undefined)
      
      @scala.inline
      def setWeights(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightsUndefined: Self = StObject.set(x, "weights", js.undefined)
      
      @scala.inline
      def setWeightsVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "weights", js.Array(value :_*))
    }
  }
  
  /**
    * Base class for convolutional-recurrent layers.
    */
  @js.native
  trait ConvRNN2D extends RNN_ {
    
    @JSName("cell")
    val cell_ConvRNN2D: ConvRNN2DCell = js.native
    
    def computeOutputShape(inputShape: Shape): Shape | js.Array[Shape] = js.native
    
    /* protected */ def computeSingleOutputShape(inputShape: Shape): Shape = js.native
  }
  
  @js.native
  trait ConvRNN2DCell extends RNNCell {
    
    val activation: Activation = js.native
    
    val biasConstraint: Constraint = js.native
    
    val biasInitializer: Initializer = js.native
    
    val biasRegularizer: Regularizer = js.native
    
    val dataFormat: DataFormat = js.native
    
    val dilationRate: js.Array[Double] = js.native
    
    val dropout: Double = js.native
    
    val filters: Double = js.native
    
    val kernelConstraint: Constraint = js.native
    
    val kernelInitializer: Initializer = js.native
    
    val kernelRegularizer: Regularizer = js.native
    
    val kernelSize: js.Array[Double] = js.native
    
    val padding: PaddingMode = js.native
    
    val recurrentConstraint: Constraint = js.native
    
    val recurrentDropout: Double = js.native
    
    val recurrentInitializer: Initializer = js.native
    
    val recurrentRegularizer: Regularizer = js.native
    
    val strides: js.Array[Double] = js.native
    
    val useBias: Boolean = js.native
  }
  
  /* Inlined parent std.Omit<@tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/layers/recurrent.SimpleRNNCellLayerArgs, 'units'> */
  @js.native
  trait ConvRNN2DCellArgs extends StObject {
    
    var activation: js.UndefOr[ActivationIdentifier] = js.native
    
    var batchInputShape: js.UndefOr[Shape] = js.native
    
    var batchSize: js.UndefOr[Double] = js.native
    
    var biasConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
    
    var biasInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    var biasRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
    /**
      * Format of the data, which determines the ordering of the dimensions in
      * the inputs.
      *
      * `channels_last` corresponds to inputs with shape
      *   `(batch, ..., channels)`
      *
      *  `channels_first` corresponds to inputs with shape `(batch, channels,
      * ...)`.
      *
      * Defaults to `channels_last`.
      */
    var dataFormat: js.UndefOr[DataFormat] = js.native
    
    /**
      * The dilation rate to use for the dilated convolution in each dimension.
      * Should be an integer or array of two or three integers.
      *
      * Currently, specifying any `dilationRate` value != 1 is incompatible with
      * specifying any `strides` value != 1.
      */
    var dilationRate: js.UndefOr[Double | js.Array[Double] | (js.Tuple2[Double, Double])] = js.native
    
    var dropout: js.UndefOr[Double] = js.native
    
    var dtype: js.UndefOr[DataType] = js.native
    
    /**
      * The dimensionality of the output space (i.e. the number of filters in the
      * convolution).
      */
    var filters: Double = js.native
    
    var inputDType: js.UndefOr[DataType] = js.native
    
    var inputShape: js.UndefOr[Shape] = js.native
    
    var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
    
    var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
    /**
      * The dimensions of the convolution window. If kernelSize is a number, the
      * convolutional window will be square.
      */
    var kernelSize: Double | js.Array[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    /**
      * Padding mode.
      */
    var padding: js.UndefOr[PaddingMode] = js.native
    
    var recurrentConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
    
    var recurrentDropout: js.UndefOr[Double] = js.native
    
    var recurrentInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    var recurrentRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
    /**
      * The strides of the convolution in each dimension. If strides is a number,
      * strides in both dimensions are equal.
      *
      * Specifying any stride value != 1 is incompatible with specifying any
      * `dilationRate` value != 1.
      */
    var strides: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var trainable: js.UndefOr[Boolean] = js.native
    
    var useBias: js.UndefOr[Boolean] = js.native
    
    var weights: js.UndefOr[js.Array[Tensor[Rank]]] = js.native
  }
  object ConvRNN2DCellArgs {
    
    @scala.inline
    def apply(filters: Double, kernelSize: Double | js.Array[Double]): ConvRNN2DCellArgs = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernelSize = kernelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvRNN2DCellArgs]
    }
    
    @scala.inline
    implicit class ConvRNN2DCellArgsMutableBuilder[Self <: ConvRNN2DCellArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivation(value: ActivationIdentifier): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      @scala.inline
      def setBatchInputShape(value: Shape): Self = StObject.set(x, "batchInputShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchInputShapeUndefined: Self = StObject.set(x, "batchInputShape", js.undefined)
      
      @scala.inline
      def setBatchInputShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "batchInputShape", js.Array(value :_*))
      
      @scala.inline
      def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      @scala.inline
      def setBiasConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "biasConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasConstraintUndefined: Self = StObject.set(x, "biasConstraint", js.undefined)
      
      @scala.inline
      def setBiasInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "biasInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasInitializerUndefined: Self = StObject.set(x, "biasInitializer", js.undefined)
      
      @scala.inline
      def setBiasRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "biasRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasRegularizerUndefined: Self = StObject.set(x, "biasRegularizer", js.undefined)
      
      @scala.inline
      def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
      
      @scala.inline
      def setDilationRate(value: Double | js.Array[Double] | (js.Tuple2[Double, Double])): Self = StObject.set(x, "dilationRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDilationRateUndefined: Self = StObject.set(x, "dilationRate", js.undefined)
      
      @scala.inline
      def setDilationRateVarargs(value: Double*): Self = StObject.set(x, "dilationRate", js.Array(value :_*))
      
      @scala.inline
      def setDropout(value: Double): Self = StObject.set(x, "dropout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropoutUndefined: Self = StObject.set(x, "dropout", js.undefined)
      
      @scala.inline
      def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
      
      @scala.inline
      def setFilters(value: Double): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputDType(value: DataType): Self = StObject.set(x, "inputDType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputDTypeUndefined: Self = StObject.set(x, "inputDType", js.undefined)
      
      @scala.inline
      def setInputShape(value: Shape): Self = StObject.set(x, "inputShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputShapeUndefined: Self = StObject.set(x, "inputShape", js.undefined)
      
      @scala.inline
      def setInputShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "inputShape", js.Array(value :_*))
      
      @scala.inline
      def setKernelConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "kernelConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelConstraintUndefined: Self = StObject.set(x, "kernelConstraint", js.undefined)
      
      @scala.inline
      def setKernelInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "kernelInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelInitializerUndefined: Self = StObject.set(x, "kernelInitializer", js.undefined)
      
      @scala.inline
      def setKernelRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "kernelRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelRegularizerUndefined: Self = StObject.set(x, "kernelRegularizer", js.undefined)
      
      @scala.inline
      def setKernelSize(value: Double | js.Array[Double]): Self = StObject.set(x, "kernelSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelSizeVarargs(value: Double*): Self = StObject.set(x, "kernelSize", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPadding(value: PaddingMode): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setRecurrentConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "recurrentConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrentConstraintUndefined: Self = StObject.set(x, "recurrentConstraint", js.undefined)
      
      @scala.inline
      def setRecurrentDropout(value: Double): Self = StObject.set(x, "recurrentDropout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrentDropoutUndefined: Self = StObject.set(x, "recurrentDropout", js.undefined)
      
      @scala.inline
      def setRecurrentInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "recurrentInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrentInitializerUndefined: Self = StObject.set(x, "recurrentInitializer", js.undefined)
      
      @scala.inline
      def setRecurrentRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "recurrentRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrentRegularizerUndefined: Self = StObject.set(x, "recurrentRegularizer", js.undefined)
      
      @scala.inline
      def setStrides(value: Double | js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
      
      @scala.inline
      def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value :_*))
      
      @scala.inline
      def setTrainable(value: Boolean): Self = StObject.set(x, "trainable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrainableUndefined: Self = StObject.set(x, "trainable", js.undefined)
      
      @scala.inline
      def setUseBias(value: Boolean): Self = StObject.set(x, "useBias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseBiasUndefined: Self = StObject.set(x, "useBias", js.undefined)
      
      @scala.inline
      def setWeights(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightsUndefined: Self = StObject.set(x, "weights", js.undefined)
      
      @scala.inline
      def setWeightsVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "weights", js.Array(value :_*))
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.tensorflowTfjsLayers.convolutionalRecurrentMod.ConvRNN2DCellArgs because var conflicts: batchInputShape, batchSize, dtype, inputDType, inputShape, name, trainable, weights. Inlined filters, kernelSize, strides, padding, dataFormat, dilationRate, recurrentRegularizer, useBias, biasInitializer, dropout, kernelRegularizer, recurrentInitializer, biasRegularizer, kernelConstraint, biasConstraint, kernelInitializer, recurrentConstraint, activation, recurrentDropout */ @js.native
  trait ConvRNN2DLayerArgs extends BaseRNNLayerArgs {
    
    var activation: js.UndefOr[ActivationIdentifier] = js.native
    
    var biasConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
    
    var biasInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    var biasRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
    /**
      * Format of the data, which determines the ordering of the dimensions in
      * the inputs.
      *
      * `channels_last` corresponds to inputs with shape
      *   `(batch, ..., channels)`
      *
      *  `channels_first` corresponds to inputs with shape `(batch, channels,
      * ...)`.
      *
      * Defaults to `channels_last`.
      */
    var dataFormat: js.UndefOr[DataFormat] = js.native
    
    /**
      * The dilation rate to use for the dilated convolution in each dimension.
      * Should be an integer or array of two or three integers.
      *
      * Currently, specifying any `dilationRate` value != 1 is incompatible with
      * specifying any `strides` value != 1.
      */
    var dilationRate: js.UndefOr[Double | js.Array[Double] | (js.Tuple2[Double, Double])] = js.native
    
    var dropout: js.UndefOr[Double] = js.native
    
    /**
      * The dimensionality of the output space (i.e. the number of filters in the
      * convolution).
      */
    var filters: Double = js.native
    
    var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
    
    var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
    /**
      * The dimensions of the convolution window. If kernelSize is a number, the
      * convolutional window will be square.
      */
    var kernelSize: Double | js.Array[Double] = js.native
    
    /**
      * Padding mode.
      */
    var padding: js.UndefOr[PaddingMode] = js.native
    
    var recurrentConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
    
    var recurrentDropout: js.UndefOr[Double] = js.native
    
    var recurrentInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    var recurrentRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
    /**
      * The strides of the convolution in each dimension. If strides is a number,
      * strides in both dimensions are equal.
      *
      * Specifying any stride value != 1 is incompatible with specifying any
      * `dilationRate` value != 1.
      */
    var strides: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var useBias: js.UndefOr[Boolean] = js.native
  }
  object ConvRNN2DLayerArgs {
    
    @scala.inline
    def apply(filters: Double, kernelSize: Double | js.Array[Double]): ConvRNN2DLayerArgs = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernelSize = kernelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvRNN2DLayerArgs]
    }
    
    @scala.inline
    implicit class ConvRNN2DLayerArgsMutableBuilder[Self <: ConvRNN2DLayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivation(value: ActivationIdentifier): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      @scala.inline
      def setBiasConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "biasConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasConstraintUndefined: Self = StObject.set(x, "biasConstraint", js.undefined)
      
      @scala.inline
      def setBiasInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "biasInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasInitializerUndefined: Self = StObject.set(x, "biasInitializer", js.undefined)
      
      @scala.inline
      def setBiasRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "biasRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasRegularizerUndefined: Self = StObject.set(x, "biasRegularizer", js.undefined)
      
      @scala.inline
      def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
      
      @scala.inline
      def setDilationRate(value: Double | js.Array[Double] | (js.Tuple2[Double, Double])): Self = StObject.set(x, "dilationRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDilationRateUndefined: Self = StObject.set(x, "dilationRate", js.undefined)
      
      @scala.inline
      def setDilationRateVarargs(value: Double*): Self = StObject.set(x, "dilationRate", js.Array(value :_*))
      
      @scala.inline
      def setDropout(value: Double): Self = StObject.set(x, "dropout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropoutUndefined: Self = StObject.set(x, "dropout", js.undefined)
      
      @scala.inline
      def setFilters(value: Double): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "kernelConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelConstraintUndefined: Self = StObject.set(x, "kernelConstraint", js.undefined)
      
      @scala.inline
      def setKernelInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "kernelInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelInitializerUndefined: Self = StObject.set(x, "kernelInitializer", js.undefined)
      
      @scala.inline
      def setKernelRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "kernelRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelRegularizerUndefined: Self = StObject.set(x, "kernelRegularizer", js.undefined)
      
      @scala.inline
      def setKernelSize(value: Double | js.Array[Double]): Self = StObject.set(x, "kernelSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelSizeVarargs(value: Double*): Self = StObject.set(x, "kernelSize", js.Array(value :_*))
      
      @scala.inline
      def setPadding(value: PaddingMode): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setRecurrentConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "recurrentConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrentConstraintUndefined: Self = StObject.set(x, "recurrentConstraint", js.undefined)
      
      @scala.inline
      def setRecurrentDropout(value: Double): Self = StObject.set(x, "recurrentDropout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrentDropoutUndefined: Self = StObject.set(x, "recurrentDropout", js.undefined)
      
      @scala.inline
      def setRecurrentInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "recurrentInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrentInitializerUndefined: Self = StObject.set(x, "recurrentInitializer", js.undefined)
      
      @scala.inline
      def setRecurrentRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "recurrentRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrentRegularizerUndefined: Self = StObject.set(x, "recurrentRegularizer", js.undefined)
      
      @scala.inline
      def setStrides(value: Double | js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
      
      @scala.inline
      def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value :_*))
      
      @scala.inline
      def setUseBias(value: Boolean): Self = StObject.set(x, "useBias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseBiasUndefined: Self = StObject.set(x, "useBias", js.undefined)
    }
  }
}
