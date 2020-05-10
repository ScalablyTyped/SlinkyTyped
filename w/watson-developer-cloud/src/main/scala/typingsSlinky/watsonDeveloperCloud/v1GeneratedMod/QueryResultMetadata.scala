package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Metadata of a query result. */
@js.native
trait QueryResultMetadata extends js.Object {
  /** The confidence score for the given result. Calculated based on how relevant the result is estimated to be. confidence can range from `0.0` to `1.0`. The higher the number, the more relevant the document. The `confidence` value for a result was calculated using the model specified in the `document_retrieval_strategy` field of the result set. */
  var confidence: js.UndefOr[Double] = js.native
  /** An unbounded measure of the relevance of a particular result, dependent on the query and matching document. A higher score indicates a greater match to the query parameters. */
  var score: Double = js.native
}

object QueryResultMetadata {
  @scala.inline
  def apply(score: Double): QueryResultMetadata = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResultMetadata]
  }
  @scala.inline
  implicit class QueryResultMetadataOps[Self <: QueryResultMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(js.undefined)
        ret
    }
  }
  
}

