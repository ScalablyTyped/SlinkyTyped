package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TrainingStatus. */
@js.native
trait TrainingStatus extends js.Object {
  /** When `true`, the collection has been successfully trained. */
  var available: js.UndefOr[Boolean] = js.native
  /** The timestamp of when the data was uploaded. */
  var data_updated: js.UndefOr[String] = js.native
  /** When `true`, the collection has a sufficent amount of examples added for training to occur. */
  var minimum_examples_added: js.UndefOr[Boolean] = js.native
  /** When `true`, the collection has a sufficent amount of queries added for training to occur. */
  var minimum_queries_added: js.UndefOr[Boolean] = js.native
  /** The number of notices associated with this data set. */
  var notices: js.UndefOr[Double] = js.native
  /** When `true`, the collection is currently processing training. */
  var processing: js.UndefOr[Boolean] = js.native
  /** The timestamp of when the collection was successfully trained. */
  var successfully_trained: js.UndefOr[String] = js.native
  /** When `true`, the collection has a sufficent amount of diversity in labeled results for training to occur. */
  var sufficient_label_diversity: js.UndefOr[Boolean] = js.native
  /** The total number of training examples uploaded to this collection. */
  var total_examples: js.UndefOr[Double] = js.native
}

object TrainingStatus {
  @scala.inline
  def apply(): TrainingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingStatus]
  }
  @scala.inline
  implicit class TrainingStatusOps[Self <: TrainingStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(js.undefined)
        ret
    }
    @scala.inline
    def withData_updated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData_updated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_updated")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum_examples_added(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum_examples_added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum_examples_added: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum_examples_added")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum_queries_added(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum_queries_added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum_queries_added: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum_queries_added")(js.undefined)
        ret
    }
    @scala.inline
    def withNotices(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notices")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processing")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessfully_trained(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successfully_trained")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessfully_trained: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successfully_trained")(js.undefined)
        ret
    }
    @scala.inline
    def withSufficient_label_diversity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sufficient_label_diversity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSufficient_label_diversity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sufficient_label_diversity")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal_examples(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_examples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_examples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_examples")(js.undefined)
        ret
    }
  }
  
}

