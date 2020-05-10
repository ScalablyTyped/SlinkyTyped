package typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Voice. */
@js.native
trait Voice extends js.Object {
  /** If `true`, the voice can be customized; if `false`, the voice cannot be customized. (Same as `custom_pronunciation`; maintained for backward compatibility.). */
  var customizable: Boolean = js.native
  /** Returns information about a specified custom voice model. This field is returned only by the **Get a voice** method and only when you specify the customization ID of a custom voice model. */
  var customization: js.UndefOr[VoiceModel] = js.native
  /** A textual description of the voice. */
  var description: String = js.native
  /** The gender of the voice: `male` or `female`. */
  var gender: String = js.native
  /** The language and region of the voice (for example, `en-US`). */
  var language: String = js.native
  /** The name of the voice. Use this as the voice identifier in all requests. */
  var name: String = js.native
  /** Describes the additional service features that are supported with the voice. */
  var supported_features: SupportedFeatures = js.native
  /** The URI of the voice. */
  var url: String = js.native
}

object Voice {
  @scala.inline
  def apply(
    customizable: Boolean,
    description: String,
    gender: String,
    language: String,
    name: String,
    supported_features: SupportedFeatures,
    url: String
  ): Voice = {
    val __obj = js.Dynamic.literal(customizable = customizable.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supported_features = supported_features.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Voice]
  }
  @scala.inline
  implicit class VoiceOps[Self <: Voice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withCustomization(value: VoiceModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customization")(js.undefined)
        ret
    }
  }
  
}

