package typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod

import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseRNNLayerConfig extends LayerConfig {
  var cell: js.UndefOr[RNNCellSerialization | js.Array[RNNCellSerialization]] = js.native
  var go_backwards: js.UndefOr[Boolean] = js.native
  var input_dim: js.UndefOr[Double] = js.native
  var input_length: js.UndefOr[Double] = js.native
  var return_sequences: js.UndefOr[Boolean] = js.native
  var return_state: js.UndefOr[Boolean] = js.native
  var stateful: js.UndefOr[Boolean] = js.native
  var unroll: js.UndefOr[Boolean] = js.native
}

object BaseRNNLayerConfig {
  @scala.inline
  def apply(): BaseRNNLayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseRNNLayerConfig]
  }
  @scala.inline
  implicit class BaseRNNLayerConfigOps[Self <: BaseRNNLayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCell(value: RNNCellSerialization | js.Array[RNNCellSerialization]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(js.undefined)
        ret
    }
    @scala.inline
    def withGo_backwards(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("go_backwards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGo_backwards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("go_backwards")(js.undefined)
        ret
    }
    @scala.inline
    def withInput_dim(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_dim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput_dim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_dim")(js.undefined)
        ret
    }
    @scala.inline
    def withInput_length(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput_length: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_length")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_sequences(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_sequences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_sequences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_sequences")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_state(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_state: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_state")(js.undefined)
        ret
    }
    @scala.inline
    def withStateful(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateful: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateful")(js.undefined)
        ret
    }
    @scala.inline
    def withUnroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unroll")(js.undefined)
        ret
    }
  }
  
}

