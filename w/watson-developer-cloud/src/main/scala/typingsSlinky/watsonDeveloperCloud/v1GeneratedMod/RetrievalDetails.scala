package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object contain retrieval type information. */
@js.native
trait RetrievalDetails extends js.Object {
  /** Indentifies the document retrieval strategy used for this query. `relevancy_training` indicates that the results were returned using a relevancy trained model. `continuous_relevancy_training` indicates that the results were returned using the continuous relevancy training model created by result feedback analysis. `untrained` means the results were returned using the standard untrained model. **Note**: In the event of trained collections being queried, but the trained model is not used to return results, the **document_retrieval_strategy** will be listed as `untrained`. */
  var document_retrieval_strategy: js.UndefOr[String] = js.native
}

object RetrievalDetails {
  @scala.inline
  def apply(): RetrievalDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrievalDetails]
  }
  @scala.inline
  implicit class RetrievalDetailsOps[Self <: RetrievalDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument_retrieval_strategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_retrieval_strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument_retrieval_strategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_retrieval_strategy")(js.undefined)
        ret
    }
  }
  
}

