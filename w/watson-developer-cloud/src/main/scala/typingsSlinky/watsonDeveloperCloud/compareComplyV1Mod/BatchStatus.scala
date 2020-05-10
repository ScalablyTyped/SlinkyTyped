package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The batch-request status. */
@js.native
trait BatchStatus extends js.Object {
  /** The method to be run against the documents. Possible values are `html_conversion`, `element_classification`, and `tables`. */
  var _function: js.UndefOr[String] = js.native
  /** The unique identifier for the batch request. */
  var batch_id: js.UndefOr[String] = js.native
  /** The creation time of the batch request. */
  var created: js.UndefOr[String] = js.native
  /** Document counts. */
  var document_counts: js.UndefOr[DocCounts] = js.native
  /** The geographical location of the Cloud Object Storage input bucket as listed on the **Endpoint** tab of your COS instance; for example, `us-geo`, `eu-geo`, or `ap-geo`. */
  var input_bucket_location: js.UndefOr[String] = js.native
  /** The name of the Cloud Object Storage input bucket. */
  var input_bucket_name: js.UndefOr[String] = js.native
  /** The geographical location of the Cloud Object Storage output bucket as listed on the **Endpoint** tab of your COS instance; for example, `us-geo`, `eu-geo`, or `ap-geo`. */
  var output_bucket_location: js.UndefOr[String] = js.native
  /** The name of the Cloud Object Storage output bucket. */
  var output_bucket_name: js.UndefOr[String] = js.native
  /** The status of the batch request. */
  var status: js.UndefOr[String] = js.native
  /** The time of the most recent update to the batch request. */
  var updated: js.UndefOr[String] = js.native
}

object BatchStatus {
  @scala.inline
  def apply(): BatchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStatus]
  }
  @scala.inline
  implicit class BatchStatusOps[Self <: BatchStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_function(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_function: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_function")(js.undefined)
        ret
    }
    @scala.inline
    def withBatch_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatch_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch_id")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withDocument_counts(value: DocCounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_counts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument_counts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_counts")(js.undefined)
        ret
    }
    @scala.inline
    def withInput_bucket_location(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_bucket_location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput_bucket_location: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_bucket_location")(js.undefined)
        ret
    }
    @scala.inline
    def withInput_bucket_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_bucket_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput_bucket_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_bucket_name")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput_bucket_location(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output_bucket_location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput_bucket_location: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output_bucket_location")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput_bucket_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output_bucket_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput_bucket_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output_bucket_name")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
  }
  
}

