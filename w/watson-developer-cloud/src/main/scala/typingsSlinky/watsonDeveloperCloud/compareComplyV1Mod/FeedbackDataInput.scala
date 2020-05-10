package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Feedback data for submission. */
@js.native
trait FeedbackDataInput extends js.Object {
  /** Brief information about the input document. */
  var document: js.UndefOr[ShortDoc] = js.native
  /** The type of feedback. The only permitted value is `element_classification`. */
  var feedback_type: String = js.native
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: Location = js.native
  /** An optional string identifying the model ID. The only permitted value is `contracts`. */
  var model_id: js.UndefOr[String] = js.native
  /** An optional string identifying the version of the model used. */
  var model_version: js.UndefOr[String] = js.native
  /** The original labeling from the input document, without the submitted feedback. */
  var original_labels: OriginalLabelsIn = js.native
  /** The text on which to submit feedback. */
  var text: String = js.native
  /** The updated labeling from the input document, accounting for the submitted feedback. */
  var updated_labels: UpdatedLabelsIn = js.native
}

object FeedbackDataInput {
  @scala.inline
  def apply(
    feedback_type: String,
    location: Location,
    original_labels: OriginalLabelsIn,
    text: String,
    updated_labels: UpdatedLabelsIn
  ): FeedbackDataInput = {
    val __obj = js.Dynamic.literal(feedback_type = feedback_type.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], original_labels = original_labels.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updated_labels = updated_labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedbackDataInput]
  }
  @scala.inline
  implicit class FeedbackDataInputOps[Self <: FeedbackDataInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeedback_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal_labels(value: OriginalLabelsIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_labels(value: UpdatedLabelsIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_labels")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

