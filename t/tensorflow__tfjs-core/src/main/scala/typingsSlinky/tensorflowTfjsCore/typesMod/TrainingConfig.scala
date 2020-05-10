package typingsSlinky.tensorflowTfjsCore.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainingConfig extends js.Object {
  /** Loss function(s) for the model's output(s). */
  var loss: String | js.Array[String] | StringDictionary[String] = js.native
  var loss_weights: js.UndefOr[js.Array[Double] | StringDictionary[Double]] = js.native
  /** Metric function(s) for the model's output(s). */
  var metrics: js.UndefOr[js.Array[String] | StringDictionary[String]] = js.native
  var sample_weight_mode: js.UndefOr[String] = js.native
  var weighted_metrics: js.UndefOr[js.Array[String]] = js.native
}

object TrainingConfig {
  @scala.inline
  def apply(loss: String | js.Array[String] | StringDictionary[String]): TrainingConfig = {
    val __obj = js.Dynamic.literal(loss = loss.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingConfig]
  }
  @scala.inline
  implicit class TrainingConfigOps[Self <: TrainingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoss(value: String | js.Array[String] | StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoss_weights(value: js.Array[Double] | StringDictionary[Double]): Self = {
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
    def withMetrics(value: js.Array[String] | StringDictionary[String]): Self = {
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
    def withSample_weight_mode(value: String): Self = {
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
    def withWeighted_metrics(value: js.Array[String]): Self = {
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

