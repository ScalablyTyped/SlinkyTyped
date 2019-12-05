package typingsSlinky.atTensorflowTfjs.atTensorflowTfjsMod

import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.serialization.Serializable
import typingsSlinky.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typingsSlinky.atTensorflowTfjsDashCore.distSerializationMod.SerializableConstructor
import typingsSlinky.atTensorflowTfjsDashLayers.distEngineInputUnderscoreLayerMod.InputConfig
import typingsSlinky.atTensorflowTfjsDashLayers.distEngineInputUnderscoreLayerMod.InputLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.LayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersAdvancedUnderscoreActivationsMod.ELULayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersAdvancedUnderscoreActivationsMod.LeakyReLULayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersAdvancedUnderscoreActivationsMod.PReLULayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersAdvancedUnderscoreActivationsMod.ReLULayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersAdvancedUnderscoreActivationsMod.SoftmaxLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersAdvancedUnderscoreActivationsMod.ThresholdedReLULayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersConvolutionalMod.ConvLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersConvolutionalMod.Cropping2DLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersConvolutionalMod.SeparableConvLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersConvolutionalMod.UpSampling2DLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersConvolutionalUnderscoreDepthwiseMod.DepthwiseConv2DLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersCoreMod.ActivationLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersCoreMod.DenseLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersCoreMod.DropoutLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersCoreMod.FlattenLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersCoreMod.MaskingArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersCoreMod.PermuteLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersCoreMod.RepeatVectorLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersCoreMod.ReshapeLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersCoreMod.SpatialDropout1DLayerConfig
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersEmbeddingsMod.EmbeddingLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersMergeMod.ConcatenateLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersMergeMod.DotLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersNoiseMod.AlphaDropout
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersNoiseMod.AlphaDropoutArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersNoiseMod.GaussianDropout
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersNoiseMod.GaussianDropoutArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersNoiseMod.GaussianNoise
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersNoiseMod.GaussianNoiseArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersNormalizationMod.BatchNormalizationLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersNormalizationMod.LayerNormalizationLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersPaddingMod.ZeroPadding2DLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersPoolingMod.GlobalPooling2DLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersPoolingMod.Pooling1DLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersPoolingMod.Pooling2DLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersPoolingMod.Pooling3DLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersRecurrentMod.GRUCellLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersRecurrentMod.GRULayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersRecurrentMod.LSTMCellLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersRecurrentMod.LSTMLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersRecurrentMod.RNNLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersRecurrentMod.SimpleRNNCellLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersRecurrentMod.SimpleRNNLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersRecurrentMod.StackedRNNCellsArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersWrappersMod.Bidirectional
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersWrappersMod.BidirectionalLayerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distLayersWrappersMod.WrapperLayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "layers")
@js.native
object layers extends js.Object {
  @js.native
  abstract class Layer protected ()
    extends typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersMod.layers.Layer {
    def this(args: LayerArgs) = this()
  }
  
  @js.native
  class RNN protected ()
    extends typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersMod.layers.RNN {
    def this(args: RNNLayerArgs) = this()
  }
  
  @js.native
  abstract class RNNCell ()
    extends typingsSlinky.atTensorflowTfjsDashLayers.distLayersRecurrentMod.RNNCell
  
  val globalMaxPool1d: js.Function1[
    /* args */ js.UndefOr[LayerArgs], 
    typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
  ] = js.native
  val globalMaxPool2d: js.Function1[
    /* args */ GlobalPooling2DLayerArgs, 
    typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
  ] = js.native
  val maxPool1d: js.Function1[
    /* args */ Pooling1DLayerArgs, 
    typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
  ] = js.native
  val maxPool2d: js.Function1[
    /* args */ Pooling2DLayerArgs, 
    typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
  ] = js.native
  def activation(args: ActivationLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def add(): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def add(args: LayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def alphaDropout(args: AlphaDropoutArgs): AlphaDropout = js.native
  def average(): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def average(args: LayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def averagePooling1d(args: Pooling1DLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def averagePooling2d(args: Pooling2DLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def averagePooling3d(args: Pooling3DLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def avgPool1d(args: Pooling1DLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def avgPool2d(args: Pooling2DLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def avgPool3d(args: Pooling3DLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def avgPooling1d(args: Pooling1DLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def avgPooling2d(args: Pooling2DLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def avgPooling3d(args: Pooling3DLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def batchNormalization(): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def batchNormalization(args: BatchNormalizationLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def bidirectional(args: BidirectionalLayerArgs): Bidirectional = js.native
  def concatenate(): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def concatenate(args: ConcatenateLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def conv1d(args: ConvLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def conv2d(args: ConvLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def conv2dTranspose(args: ConvLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def conv3d(args: ConvLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def cropping2D(args: Cropping2DLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def dense(args: DenseLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def depthwiseConv2d(args: DepthwiseConv2DLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def dot(args: DotLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def dropout(args: DropoutLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def elu(): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def elu(args: ELULayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def embedding(args: EmbeddingLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def flatten(): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def flatten(args: FlattenLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def gaussianDropout(args: GaussianDropoutArgs): GaussianDropout = js.native
  def gaussianNoise(args: GaussianNoiseArgs): GaussianNoise = js.native
  def globalAveragePooling1d(): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def globalAveragePooling1d(args: LayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def globalAveragePooling2d(args: GlobalPooling2DLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def globalMaxPooling1d(): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def globalMaxPooling1d(args: LayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def globalMaxPooling2d(args: GlobalPooling2DLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def gru(args: GRULayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def gruCell(args: GRUCellLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distLayersRecurrentMod.RNNCell = js.native
  def input(config: InputConfig): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.SymbolicTensor = js.native
  def inputLayer(args: InputLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def layerNormalization(): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def layerNormalization(args: LayerNormalizationLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def leakyReLU(): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def leakyReLU(args: LeakyReLULayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def lstm(args: LSTMLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def lstmCell(args: LSTMCellLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distLayersRecurrentMod.RNNCell = js.native
  def masking(): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def masking(args: MaskingArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def maxPooling1d(args: Pooling1DLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def maxPooling2d(args: Pooling2DLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def maxPooling3d(args: Pooling3DLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def maximum(): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def maximum(args: LayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def minimum(): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def minimum(args: LayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def multiply(): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def multiply(args: LayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def permute(args: PermuteLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def prelu(): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def prelu(args: PReLULayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def reLU(): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def reLU(args: ReLULayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def repeatVector(args: RepeatVectorLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def reshape(args: ReshapeLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def rnn(args: RNNLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def separableConv2d(args: SeparableConvLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def simpleRNN(args: SimpleRNNLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def simpleRNNCell(args: SimpleRNNCellLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distLayersRecurrentMod.RNNCell = js.native
  def softmax(): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def softmax(args: SoftmaxLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def spatialDropout1d(args: SpatialDropout1DLayerConfig): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def stackedRNNCells(args: StackedRNNCellsArgs): typingsSlinky.atTensorflowTfjsDashLayers.distLayersRecurrentMod.RNNCell = js.native
  def thresholdedReLU(): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def thresholdedReLU(args: ThresholdedReLULayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def timeDistributed(args: WrapperLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def upSampling2d(args: UpSampling2DLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def zeroPadding2d(): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def zeroPadding2d(args: ZeroPadding2DLayerArgs): typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  /* static members */
  @js.native
  object Layer extends js.Object {
    /**
      * Converts a layer and its index to a unique (immutable type) name.
      * This function is used internally with `this.containerNodes`.
      * @param layer The layer.
      * @param nodeIndex The layer's position (e.g. via enumerate) in a list of
      *   nodes.
      *
      * @returns The unique name.
      */
    /* protected */ def nodeKey(layer: typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer, nodeIndex: Double): String = js.native
  }
  
  /* static members */
  @js.native
  object RNN extends js.Object {
    /** @nocollapse */
    var className: String = js.native
    /** @nocollapse */
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
  }
  
}

