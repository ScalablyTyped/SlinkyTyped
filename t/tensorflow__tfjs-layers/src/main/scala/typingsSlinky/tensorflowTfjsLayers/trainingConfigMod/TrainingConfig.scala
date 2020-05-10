package typingsSlinky.tensorflowTfjsLayers.trainingConfigMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.SampleWeightMode
import typingsSlinky.tensorflowTfjsLayers.lossConfigMod.LossIdentifier
import typingsSlinky.tensorflowTfjsLayers.optimizerConfigMod.OptimizerSerialization
import typingsSlinky.tensorflowTfjsLayers.typesMod.PyJsonDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainingConfig extends PyJsonDict {
  var loss: LossIdentifier | js.Array[LossIdentifier] | StringDictionary[LossIdentifier] = js.native
  var loss_weights: js.UndefOr[LossWeights] = js.native
  var metrics: js.UndefOr[js.Array[MetricsIdentifier] | StringDictionary[MetricsIdentifier]] = js.native
  var optimizer_config: OptimizerSerialization = js.native
  var sample_weight_mode: js.UndefOr[SampleWeightMode] = js.native
  var weighted_metrics: js.UndefOr[js.Array[MetricsIdentifier]] = js.native
}

object TrainingConfig {
  @scala.inline
  def apply(
    loss: LossIdentifier | js.Array[LossIdentifier] | StringDictionary[LossIdentifier],
    optimizer_config: OptimizerSerialization
  ): TrainingConfig = {
    val __obj = js.Dynamic.literal(loss = loss.asInstanceOf[js.Any], optimizer_config = optimizer_config.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingConfig]
  }
  @scala.inline
  implicit class TrainingConfigOps[Self <: TrainingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoss(value: LossIdentifier | js.Array[LossIdentifier] | StringDictionary[LossIdentifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizer_config(value: OptimizerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizer_config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoss_weights(value: LossWeights): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loss_weights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoss_weights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loss_weights")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: js.Array[MetricsIdentifier] | StringDictionary[MetricsIdentifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withSample_weight_mode(value: SampleWeightMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample_weight_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSample_weight_mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample_weight_mode")(js.undefined)
        ret
    }
    @scala.inline
    def withWeighted_metrics(value: js.Array[MetricsIdentifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weighted_metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeighted_metrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weighted_metrics")(js.undefined)
        ret
    }
  }
  
}

