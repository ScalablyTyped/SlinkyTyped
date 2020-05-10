package typingsSlinky.simpleStatistics.perceptronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerceptronModel extends js.Object {
  var bias: Double = js.native
  var weights: js.Array[Double] = js.native
  def predict(features: js.Array[Double]): Double = js.native
  def train(features: js.Array[Double], label: Double): PerceptronModel = js.native
}

object PerceptronModel {
  @scala.inline
  def apply(
    bias: Double,
    predict: js.Array[Double] => Double,
    train: (js.Array[Double], Double) => PerceptronModel,
    weights: js.Array[Double]
  ): PerceptronModel = {
    val __obj = js.Dynamic.literal(bias = bias.asInstanceOf[js.Any], predict = js.Any.fromFunction1(predict), train = js.Any.fromFunction2(train), weights = weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptronModel]
  }
  @scala.inline
  implicit class PerceptronModelOps[Self <: PerceptronModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBias(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredict(value: js.Array[Double] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predict")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrain(value: (js.Array[Double], Double) => PerceptronModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("train")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWeights(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weights")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

