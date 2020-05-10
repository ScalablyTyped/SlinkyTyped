package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TrainingQuery. */
@js.native
trait TrainingQuery extends js.Object {
  /** Array of training examples. */
  var examples: js.UndefOr[js.Array[TrainingExample]] = js.native
  /** The filter used on the collection before the **natural_language_query** is applied. */
  var filter: js.UndefOr[String] = js.native
  /** The natural text query for the training query. */
  var natural_language_query: js.UndefOr[String] = js.native
  /** The query ID associated with the training query. */
  var query_id: js.UndefOr[String] = js.native
}

object TrainingQuery {
  @scala.inline
  def apply(): TrainingQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingQuery]
  }
  @scala.inline
  implicit class TrainingQueryOps[Self <: TrainingQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExamples(value: js.Array[TrainingExample]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examples")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withNatural_language_query(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natural_language_query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatural_language_query: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natural_language_query")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query_id")(js.undefined)
        ret
    }
  }
  
}

