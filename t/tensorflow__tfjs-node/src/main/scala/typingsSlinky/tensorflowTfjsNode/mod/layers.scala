package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.mod.serialization.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typingsSlinky.tensorflowTfjsLayers.advancedActivationsMod.ELULayerArgs
import typingsSlinky.tensorflowTfjsLayers.advancedActivationsMod.LeakyReLULayerArgs
import typingsSlinky.tensorflowTfjsLayers.advancedActivationsMod.PReLULayerArgs
import typingsSlinky.tensorflowTfjsLayers.advancedActivationsMod.ReLULayerArgs
import typingsSlinky.tensorflowTfjsLayers.advancedActivationsMod.SoftmaxLayerArgs
import typingsSlinky.tensorflowTfjsLayers.advancedActivationsMod.ThresholdedReLULayerArgs
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
import typingsSlinky.tensorflowTfjsLayers.embeddingsMod.EmbeddingLayerArgs
import typingsSlinky.tensorflowTfjsLayers.inputLayerMod.InputConfig
import typingsSlinky.tensorflowTfjsLayers.inputLayerMod.InputLayerArgs
import typingsSlinky.tensorflowTfjsLayers.mergeMod.ConcatenateLayerArgs
import typingsSlinky.tensorflowTfjsLayers.mergeMod.DotLayerArgs
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
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.SimpleRNNCellLayerArgs
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.SimpleRNNLayerArgs
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.StackedRNNCellsArgs
import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import typingsSlinky.tensorflowTfjsLayers.wrappersMod.Bidirectional
import typingsSlinky.tensorflowTfjsLayers.wrappersMod.BidirectionalLayerArgs
import typingsSlinky.tensorflowTfjsLayers.wrappersMod.WrapperLayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layers {
  
  @JSImport("@tensorflow/tfjs-node", "layers.Layer")
  @js.native
  abstract class Layer ()
    extends typingsSlinky.tensorflowTfjs.mod.layers.Layer {
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
    @JSImport("@tensorflow/tfjs-node", "layers.Layer.nodeKey")
    @js.native
    def nodeKey(layer: typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer, nodeIndex: Double): String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-node", "layers.RNNCell")
  @js.native
  abstract class RNNCell ()
    extends typingsSlinky.tensorflowTfjs.mod.layers.RNNCell {
    def this(args: LayerArgs) = this()
  }
  
  @JSImport("@tensorflow/tfjs-node", "layers.RNN")
  @js.native
  class RNN_ protected ()
    extends typingsSlinky.tensorflowTfjs.mod.layers.RNN_ {
    def this(args: RNNLayerArgs) = this()
  }
  /* static members */
  object RNN_ {
    
    @JSImport("@tensorflow/tfjs-node", "layers.RNN")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-node", "layers.RNN.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-node", "layers.RNN.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
    @JSImport("@tensorflow/tfjs-node", "layers.RNN.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
  }
  
  @JSImport("@tensorflow/tfjs-node", "layers.activation")
  @js.native
  def activation(args: ActivationLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.add")
  @js.native
  def add(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.add")
  @js.native
  def add(args: LayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.alphaDropout")
  @js.native
  def alphaDropout(args: AlphaDropoutArgs): AlphaDropout = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.average")
  @js.native
  def average(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.average")
  @js.native
  def average(args: LayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.averagePooling1d")
  @js.native
  def averagePooling1d(args: Pooling1DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.averagePooling2d")
  @js.native
  def averagePooling2d(args: Pooling2DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.averagePooling3d")
  @js.native
  def averagePooling3d(args: Pooling3DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.avgPool1d")
  @js.native
  def avgPool1d(args: Pooling1DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.avgPool2d")
  @js.native
  def avgPool2d(args: Pooling2DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.avgPool3d")
  @js.native
  def avgPool3d(args: Pooling3DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.avgPooling1d")
  @js.native
  def avgPooling1d(args: Pooling1DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.avgPooling2d")
  @js.native
  def avgPooling2d(args: Pooling2DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.avgPooling3d")
  @js.native
  def avgPooling3d(args: Pooling3DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.batchNormalization")
  @js.native
  def batchNormalization(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.batchNormalization")
  @js.native
  def batchNormalization(args: BatchNormalizationLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.bidirectional")
  @js.native
  def bidirectional(args: BidirectionalLayerArgs): Bidirectional = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.concatenate")
  @js.native
  def concatenate(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.concatenate")
  @js.native
  def concatenate(args: ConcatenateLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.conv1d")
  @js.native
  def conv1d(args: ConvLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.conv2d")
  @js.native
  def conv2d(args: ConvLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.conv2dTranspose")
  @js.native
  def conv2dTranspose(args: ConvLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.conv3d")
  @js.native
  def conv3d(args: ConvLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.convLstm2d")
  @js.native
  def convLstm2d(args: ConvLSTM2DArgs): ConvLSTM2D = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.convLstm2dCell")
  @js.native
  def convLstm2dCell(args: ConvLSTM2DCellArgs): ConvLSTM2DCell = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.cropping2D")
  @js.native
  def cropping2D(args: Cropping2DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.dense")
  @js.native
  def dense(args: DenseLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.depthwiseConv2d")
  @js.native
  def depthwiseConv2d(args: DepthwiseConv2DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.dot")
  @js.native
  def dot(args: DotLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.dropout")
  @js.native
  def dropout(args: DropoutLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.elu")
  @js.native
  def elu(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.elu")
  @js.native
  def elu(args: ELULayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.embedding")
  @js.native
  def embedding(args: EmbeddingLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.flatten")
  @js.native
  def flatten(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.flatten")
  @js.native
  def flatten(args: FlattenLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.gaussianDropout")
  @js.native
  def gaussianDropout(args: GaussianDropoutArgs): GaussianDropout = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.gaussianNoise")
  @js.native
  def gaussianNoise(args: GaussianNoiseArgs): GaussianNoise = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.globalAveragePooling1d")
  @js.native
  def globalAveragePooling1d(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.globalAveragePooling1d")
  @js.native
  def globalAveragePooling1d(args: LayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.globalAveragePooling2d")
  @js.native
  def globalAveragePooling2d(args: GlobalPooling2DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.globalMaxPool1d")
  @js.native
  val globalMaxPool1d: js.Function1[
    /* args */ js.UndefOr[LayerArgs], 
    typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.globalMaxPool2d")
  @js.native
  val globalMaxPool2d: js.Function1[
    /* args */ GlobalPooling2DLayerArgs, 
    typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.globalMaxPooling1d")
  @js.native
  def globalMaxPooling1d(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.globalMaxPooling1d")
  @js.native
  def globalMaxPooling1d(args: LayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.globalMaxPooling2d")
  @js.native
  def globalMaxPooling2d(args: GlobalPooling2DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.gru")
  @js.native
  def gru(args: GRULayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.gruCell")
  @js.native
  def gruCell(args: GRUCellLayerArgs): typingsSlinky.tensorflowTfjsLayers.recurrentMod.RNNCell = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.input")
  @js.native
  def input(config: InputConfig): typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.inputLayer")
  @js.native
  def inputLayer(args: InputLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.layerNormalization")
  @js.native
  def layerNormalization(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.layerNormalization")
  @js.native
  def layerNormalization(args: LayerNormalizationLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.leakyReLU")
  @js.native
  def leakyReLU(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.leakyReLU")
  @js.native
  def leakyReLU(args: LeakyReLULayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.lstm")
  @js.native
  def lstm(args: LSTMLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.lstmCell")
  @js.native
  def lstmCell(args: LSTMCellLayerArgs): typingsSlinky.tensorflowTfjsLayers.recurrentMod.RNNCell = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.masking")
  @js.native
  def masking(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.masking")
  @js.native
  def masking(args: MaskingArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.maxPool1d")
  @js.native
  val maxPool1d: js.Function1[
    /* args */ Pooling1DLayerArgs, 
    typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.maxPool2d")
  @js.native
  val maxPool2d: js.Function1[
    /* args */ Pooling2DLayerArgs, 
    typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.maxPooling1d")
  @js.native
  def maxPooling1d(args: Pooling1DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.maxPooling2d")
  @js.native
  def maxPooling2d(args: Pooling2DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.maxPooling3d")
  @js.native
  def maxPooling3d(args: Pooling3DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.maximum")
  @js.native
  def maximum(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.maximum")
  @js.native
  def maximum(args: LayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.minimum")
  @js.native
  def minimum(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.minimum")
  @js.native
  def minimum(args: LayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.multiply")
  @js.native
  def multiply(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.multiply")
  @js.native
  def multiply(args: LayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.permute")
  @js.native
  def permute(args: PermuteLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.prelu")
  @js.native
  def prelu(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.prelu")
  @js.native
  def prelu(args: PReLULayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.reLU")
  @js.native
  def reLU(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.reLU")
  @js.native
  def reLU(args: ReLULayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.repeatVector")
  @js.native
  def repeatVector(args: RepeatVectorLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.reshape")
  @js.native
  def reshape(args: ReshapeLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.rnn")
  @js.native
  def rnn(args: RNNLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.separableConv2d")
  @js.native
  def separableConv2d(args: SeparableConvLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.simpleRNN")
  @js.native
  def simpleRNN(args: SimpleRNNLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.simpleRNNCell")
  @js.native
  def simpleRNNCell(args: SimpleRNNCellLayerArgs): typingsSlinky.tensorflowTfjsLayers.recurrentMod.RNNCell = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.softmax")
  @js.native
  def softmax(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.softmax")
  @js.native
  def softmax(args: SoftmaxLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.spatialDropout1d")
  @js.native
  def spatialDropout1d(args: SpatialDropout1DLayerConfig): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.stackedRNNCells")
  @js.native
  def stackedRNNCells(args: StackedRNNCellsArgs): typingsSlinky.tensorflowTfjsLayers.recurrentMod.RNNCell = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.thresholdedReLU")
  @js.native
  def thresholdedReLU(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.thresholdedReLU")
  @js.native
  def thresholdedReLU(args: ThresholdedReLULayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.timeDistributed")
  @js.native
  def timeDistributed(args: WrapperLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.upSampling2d")
  @js.native
  def upSampling2d(args: UpSampling2DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.zeroPadding2d")
  @js.native
  def zeroPadding2d(): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.zeroPadding2d")
  @js.native
  def zeroPadding2d(args: ZeroPadding2DLayerArgs): typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer = js.native
}
