package typingsSlinky.tensorflowTfjsLayers.topologyMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerArgs extends js.Object {
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
  /**
    * The data-type for this layer. Defaults to 'float32'.
    * This argument is only applicable to input layers (the first layer of a
    * model).
    */
  var dtype: js.UndefOr[DataType] = js.native
  /** Legacy support. Do not use for new code. */
  var inputDType: js.UndefOr[DataType] = js.native
  /**
    * If defined, will be used to create an input layer to insert before this
    * layer. If both `inputShape` and `batchInputShape` are defined,
    * `batchInputShape` will be used. This argument is only applicable to input
    * layers (the first layer of a model).
    */
  var inputShape: js.UndefOr[Shape] = js.native
  /** Name for this layer. */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether the weights of this layer are updatable by `fit`.
    * Defaults to true.
    */
  var trainable: js.UndefOr[Boolean] = js.native
  /**
    * Initial weight values of the layer.
    */
  var weights: js.UndefOr[js.Array[Tensor[Rank]]] = js.native
}

object LayerArgs {
  @scala.inline
  def apply(): LayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerArgs]
  }
  @scala.inline
  implicit class LayerArgsOps[Self <: LayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchInputShape(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchInputShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchInputShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchInputShape")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDtype(value: DataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDtype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtype")(js.undefined)
        ret
    }
    @scala.inline
    def withInputDType(value: DataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputDType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDType")(js.undefined)
        ret
    }
    @scala.inline
    def withInputShape(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputShape")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainable")(js.undefined)
        ret
    }
    @scala.inline
    def withWeights(value: js.Array[Tensor[Rank]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weights")(js.undefined)
        ret
    }
  }
  
}

