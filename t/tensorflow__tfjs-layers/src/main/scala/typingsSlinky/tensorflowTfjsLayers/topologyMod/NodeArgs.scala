package typingsSlinky.tensorflowTfjsLayers.topologyMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeArgs extends js.Object {
  /**
    * A list of layers, the same length as `inputTensors`, the layers from where
    * `inputTensors` originate.
    */
  var inboundLayers: js.Array[Layer] = js.native
  /** List of input masks (a mask can be a tensor, or null). */
  var inputMasks: js.Array[Tensor[Rank]] = js.native
  /** List of input shape tuples. */
  var inputShapes: Shape | js.Array[Shape] = js.native
  /** List of input tensors. */
  var inputTensors: js.Array[SymbolicTensor] = js.native
  /**
    * A list of integers, the same length as `inboundLayers`. `nodeIndices[i]` is
    * the origin node of `inputTensors[i]` (necessary since each inbound layer
    * might have several nodes, e.g. if the layer is being shared with a
    * different data stream).
    */
  var nodeIndices: js.Array[Double] = js.native
  /**
    * The layer that takes `inputTensors` and turns them into `outputTensors`.
    * (the node gets created when the `call` method of the layer is called).
    */
  var outboundLayer: Layer = js.native
  /** List of output masks (a mask can be a tensor, or null). */
  var outputMasks: js.Array[Tensor[Rank]] = js.native
  /** List of output shape tuples. */
  var outputShapes: Shape | js.Array[Shape] = js.native
  /** List of output tensors. */
  var outputTensors: js.Array[SymbolicTensor] = js.native
  /**
    * A list of integers, the same length as `inboundLayers`. `tensorIndices[i]`
    * is the index of `inputTensors[i]` within the output of the inbound layer
    * (necessary since each inbound layer might have multiple tensor outputs,
    * with each one being independently manipulable).
    */
  var tensorIndices: js.Array[Double] = js.native
}

object NodeArgs {
  @scala.inline
  def apply(
    inboundLayers: js.Array[Layer],
    inputMasks: js.Array[Tensor[Rank]],
    inputShapes: Shape | js.Array[Shape],
    inputTensors: js.Array[SymbolicTensor],
    nodeIndices: js.Array[Double],
    outboundLayer: Layer,
    outputMasks: js.Array[Tensor[Rank]],
    outputShapes: Shape | js.Array[Shape],
    outputTensors: js.Array[SymbolicTensor],
    tensorIndices: js.Array[Double]
  ): NodeArgs = {
    val __obj = js.Dynamic.literal(inboundLayers = inboundLayers.asInstanceOf[js.Any], inputMasks = inputMasks.asInstanceOf[js.Any], inputShapes = inputShapes.asInstanceOf[js.Any], inputTensors = inputTensors.asInstanceOf[js.Any], nodeIndices = nodeIndices.asInstanceOf[js.Any], outboundLayer = outboundLayer.asInstanceOf[js.Any], outputMasks = outputMasks.asInstanceOf[js.Any], outputShapes = outputShapes.asInstanceOf[js.Any], outputTensors = outputTensors.asInstanceOf[js.Any], tensorIndices = tensorIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeArgs]
  }
  @scala.inline
  implicit class NodeArgsOps[Self <: NodeArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInboundLayers(value: js.Array[Layer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inboundLayers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputMasks(value: js.Array[Tensor[Rank]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputShapes(value: Shape | js.Array[Shape]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputShapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputTensors(value: js.Array[SymbolicTensor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTensors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutboundLayer(value: Layer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outboundLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputMasks(value: js.Array[Tensor[Rank]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputMasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputShapes(value: Shape | js.Array[Shape]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputShapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputTensors(value: js.Array[SymbolicTensor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputTensors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTensorIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorIndices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

