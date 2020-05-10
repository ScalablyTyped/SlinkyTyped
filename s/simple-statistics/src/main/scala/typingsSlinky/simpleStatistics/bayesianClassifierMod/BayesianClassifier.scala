package typingsSlinky.simpleStatistics.bayesianClassifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * https://simplestatistics.org/docs/#bayesianclassifier
  */
@js.native
trait BayesianClassifier extends js.Object {
  var data: Data = js.native
  var totalCount: Double = js.native
  def score(item: Item): OddsSums = js.native
  def train(item: Item, category: String): Unit = js.native
}

object BayesianClassifier {
  @scala.inline
  def apply(data: Data, score: Item => OddsSums, totalCount: Double, train: (Item, String) => Unit): BayesianClassifier = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], score = js.Any.fromFunction1(score), totalCount = totalCount.asInstanceOf[js.Any], train = js.Any.fromFunction2(train))
    __obj.asInstanceOf[BayesianClassifier]
  }
  @scala.inline
  implicit class BayesianClassifierOps[Self <: BayesianClassifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScore(value: Item => OddsSums): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTotalCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrain(value: (Item, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("train")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

