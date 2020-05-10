package typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SpeechModel. */
@js.native
trait SpeechModel extends js.Object {
  /** A brief description of the model. */
  var description: String = js.native
  /** The language identifier of the model (for example, `en-US`). */
  var language: String = js.native
  /** The name of the model for use as an identifier in calls to the service (for example, `en-US_BroadbandModel`). */
  var name: String = js.native
  /** The sampling rate (minimum acceptable rate for audio) used by the model in Hertz. */
  var rate: Double = js.native
  /** Describes the additional service features that are supported with the model. */
  var supported_features: SupportedFeatures = js.native
  /** The URI for the model. */
  var url: String = js.native
}

object SpeechModel {
  @scala.inline
  def apply(
    description: String,
    language: String,
    name: String,
    rate: Double,
    supported_features: SupportedFeatures,
    url: String
  ): SpeechModel = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], supported_features = supported_features.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechModel]
  }
  @scala.inline
  implicit class SpeechModelOps[Self <: SpeechModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupported_features(value: SupportedFeatures): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supported_features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

