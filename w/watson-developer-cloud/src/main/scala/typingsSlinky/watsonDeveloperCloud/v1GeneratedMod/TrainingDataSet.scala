package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TrainingDataSet. */
@js.native
trait TrainingDataSet extends js.Object {
  /** The collection id associated with this training data set. */
  var collection_id: js.UndefOr[String] = js.native
  /** The environment id associated with this training data set. */
  var environment_id: js.UndefOr[String] = js.native
  /** Array of training queries. */
  var queries: js.UndefOr[js.Array[TrainingQuery]] = js.native
}

object TrainingDataSet {
  @scala.inline
  def apply(): TrainingDataSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingDataSet]
  }
  @scala.inline
  implicit class TrainingDataSetOps[Self <: TrainingDataSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollection_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection_id")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment_id")(js.undefined)
        ret
    }
    @scala.inline
    def withQueries(value: js.Array[TrainingQuery]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(js.undefined)
        ret
    }
  }
  
}

