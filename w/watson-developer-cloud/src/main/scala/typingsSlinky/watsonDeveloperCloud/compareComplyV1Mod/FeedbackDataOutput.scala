package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information returned from the `POST /v1/feedback` method. */
@js.native
trait FeedbackDataOutput extends js.Object {
  /** Brief information about the input document. */
  var document: js.UndefOr[ShortDoc] = js.native
  /** A string identifying the user adding the feedback. The only permitted value is `element_classification`. */
  var feedback_type: js.UndefOr[String] = js.native
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.native
  /** An optional string identifying the model ID. The only permitted value is `contracts`. */
  var model_id: js.UndefOr[String] = js.native
  /** An optional string identifying the version of the model used. */
  var model_version: js.UndefOr[String] = js.native
  /** The original labeling from the input document, without the submitted feedback. */
  var original_labels: js.UndefOr[OriginalLabelsOut] = js.native
  /** Pagination details, if required by the length of the output. */
  var pagination: js.UndefOr[Pagination] = js.native
  /** The text to which the feedback applies. */
  var text: js.UndefOr[String] = js.native
  /** The updated labeling from the input document, accounting for the submitted feedback. */
  var updated_labels: js.UndefOr[UpdatedLabelsOut] = js.native
}

object FeedbackDataOutput {
  @scala.inline
  def apply(): FeedbackDataOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedbackDataOutput]
  }
  @scala.inline
  implicit class FeedbackDataOutputOps[Self <: FeedbackDataOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: ShortDoc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(js.undefined)
        ret
    }
    @scala.inline
    def withFeedback_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedback_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback_type")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withModel_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model_id")(js.undefined)
        ret
    }
    @scala.inline
    def withModel_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model_version")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginal_labels(value: OriginalLabelsOut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginal_labels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_labels")(js.undefined)
        ret
    }
    @scala.inline
    def withPagination(value: Pagination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated_labels(value: UpdatedLabelsOut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated_labels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_labels")(js.undefined)
        ret
    }
  }
  
}

