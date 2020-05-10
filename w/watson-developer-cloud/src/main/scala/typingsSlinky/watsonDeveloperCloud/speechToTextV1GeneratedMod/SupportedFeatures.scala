package typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the additional service features that are supported with the model. */
@js.native
trait SupportedFeatures extends js.Object {
  /** Indicates whether the customization interface can be used to create a custom language model based on the language model. */
  var custom_language_model: Boolean = js.native
  /** Indicates whether the `speaker_labels` parameter can be used with the language model. */
  var speaker_labels: Boolean = js.native
}

object SupportedFeatures {
  @scala.inline
  def apply(custom_language_model: Boolean, speaker_labels: Boolean): SupportedFeatures = {
    val __obj = js.Dynamic.literal(custom_language_model = custom_language_model.asInstanceOf[js.Any], speaker_labels = speaker_labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedFeatures]
  }
  @scala.inline
  implicit class SupportedFeaturesOps[Self <: SupportedFeatures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustom_language_model(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_language_model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeaker_labels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speaker_labels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

