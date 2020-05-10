package typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod

import typingsSlinky.ibmCloudSdkCore.helperMod.FileObject
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.ContentType
import typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.RecognizeConstants.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `recognize` operation. */
@js.native
trait RecognizeParams extends js.Object {
  /** The customization ID (GUID) of a custom acoustic model that is to be used with the recognition request. The base model of the specified custom acoustic model must match the model specified with the `model` parameter. You must make the request with credentials for the instance of the service that owns the custom model. By default, no custom acoustic model is used. See [Custom models](https://cloud.ibm.com/docs/services/speech-to-text/input.html#custom-input). */
  var acoustic_customization_id: js.UndefOr[String] = js.native
  /** The audio to transcribe. */
  var audio: ReadableStream | FileObject | Buffer = js.native
  /** The version of the specified base model that is to be used with recognition request. Multiple versions of a base model can exist when a model is updated for internal improvements. The parameter is intended primarily for use with custom models that have been upgraded for a new base model. The default value depends on whether the parameter is used with or without a custom model. See [Base model version](https://cloud.ibm.com/docs/services/speech-to-text/input.html#version). */
  var base_model_version: js.UndefOr[String] = js.native
  /** The format (MIME type) of the audio. For more information about specifying an audio format, see **Audio formats (content types)** in the method description. */
  var content_type: js.UndefOr[ContentType | String] = js.native
  /** **Deprecated.** Use the `language_customization_id` parameter to specify the customization ID (GUID) of a custom language model that is to be used with the recognition request. Do not specify both parameters with a request. */
  var customization_id: js.UndefOr[String] = js.native
  /** If you specify the customization ID (GUID) of a custom language model with the recognition request, the customization weight tells the service how much weight to give to words from the custom language model compared to those from the base model for the current request. Specify a value between 0.0 and 1.0. Unless a different customization weight was specified for the custom model when it was trained, the default value is 0.3. A customization weight that you specify overrides a weight that was specified when the custom model was trained. The default value yields the best performance in general. Assign a higher value if your audio makes frequent use of OOV words from the custom model. Use caution when setting the weight: a higher value can improve the accuracy of phrases from the custom model's domain, but it can negatively affect performance on non-domain phrases. See [Custom models](https://cloud.ibm.com/docs/services/speech-to-text/input.html#custom-input). */
  var customization_weight: js.UndefOr[Double] = js.native
  /** The name of a grammar that is to be used with the recognition request. If you specify a grammar, you must also use the `language_customization_id` parameter to specify the name of the custom language model for which the grammar is defined. The service recognizes only strings that are recognized by the specified grammar; it does not recognize other custom words from the model's words resource. See [Grammars](https://cloud.ibm.com/docs/services/speech-to-text/input.html#grammars-input). */
  var grammar_name: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** The time in seconds after which, if only silence (no speech) is detected in streaming audio, the connection is closed with a 400 error. The parameter is useful for stopping audio submission from a live microphone when a user simply walks away. Use `-1` for infinity. See [Inactivity timeout](https://cloud.ibm.com/docs/services/speech-to-text/input.html#timeouts-inactivity). */
  var inactivity_timeout: js.UndefOr[Double] = js.native
  /** An array of keyword strings to spot in the audio. Each keyword string can include one or more string tokens. Keywords are spotted only in the final results, not in interim hypotheses. If you specify any keywords, you must also specify a keywords threshold. You can spot a maximum of 1000 keywords. Omit the parameter or specify an empty array if you do not need to spot keywords. See [Keyword spotting](https://cloud.ibm.com/docs/services/speech-to-text/output.html#keyword_spotting). */
  var keywords: js.UndefOr[js.Array[String]] = js.native
  /** A confidence value that is the lower bound for spotting a keyword. A word is considered to match a keyword if its confidence is greater than or equal to the threshold. Specify a probability between 0.0 and 1.0. If you specify a threshold, you must also specify one or more keywords. The service performs no keyword spotting if you omit either parameter. See [Keyword spotting](https://cloud.ibm.com/docs/services/speech-to-text/output.html#keyword_spotting). */
  var keywords_threshold: js.UndefOr[Double] = js.native
  /** The customization ID (GUID) of a custom language model that is to be used with the recognition request. The base model of the specified custom language model must match the model specified with the `model` parameter. You must make the request with credentials for the instance of the service that owns the custom model. By default, no custom language model is used. See [Custom models](https://cloud.ibm.com/docs/services/speech-to-text/input.html#custom-input). **Note:** Use this parameter instead of the deprecated `customization_id` parameter. */
  var language_customization_id: js.UndefOr[String] = js.native
  /** The maximum number of alternative transcripts that the service is to return. By default, the service returns a single transcript. If you specify a value of `0`, the service uses the default value, `1`. See [Maximum alternatives](https://cloud.ibm.com/docs/services/speech-to-text/output.html#max_alternatives). */
  var max_alternatives: js.UndefOr[Double] = js.native
  /** The identifier of the model that is to be used for the recognition request. See [Languages and models](https://cloud.ibm.com/docs/services/speech-to-text/models.html). */
  var model: js.UndefOr[Model | String] = js.native
  /** If `true`, the service filters profanity from all output except for keyword results by replacing inappropriate words with a series of asterisks. Set the parameter to `false` to return results with no censoring. Applies to US English transcription only. See [Profanity filtering](https://cloud.ibm.com/docs/services/speech-to-text/output.html#profanity_filter). */
  var profanity_filter: js.UndefOr[Boolean] = js.native
  /** If `true`, the service redacts, or masks, numeric data from final transcripts. The feature redacts any number that has three or more consecutive digits by replacing each digit with an `X` character. It is intended to redact sensitive numeric data, such as credit card numbers. By default, the service performs no redaction. When you enable redaction, the service automatically enables smart formatting, regardless of whether you explicitly disable that feature. To ensure maximum security, the service also disables keyword spotting (ignores the `keywords` and `keywords_threshold` parameters) and returns only a single final transcript (forces the `max_alternatives` parameter to be `1`). **Note:** Applies to US English, Japanese, and Korean transcription only. See [Numeric redaction](https://cloud.ibm.com/docs/services/speech-to-text/output.html#redaction). */
  var redaction: js.UndefOr[Boolean] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** If `true`, the service converts dates, times, series of digits and numbers, phone numbers, currency values, and internet addresses into more readable, conventional representations in the final transcript of a recognition request. For US English, the service also converts certain keyword strings to punctuation symbols. By default, the service performs no smart formatting. **Note:** Applies to US English, Japanese, and Spanish transcription only. See [Smart formatting](https://cloud.ibm.com/docs/services/speech-to-text/output.html#smart_formatting). */
  var smart_formatting: js.UndefOr[Boolean] = js.native
  /** If `true`, the response includes labels that identify which words were spoken by which participants in a multi-person exchange. By default, the service returns no speaker labels. Setting `speaker_labels` to `true` forces the `timestamps` parameter to be `true`, regardless of whether you specify `false` for the parameter. **Note:** Applies to US English, Japanese, and Spanish transcription only. To determine whether a language model supports speaker labels, you can also use the **Get a model** method and check that the attribute `speaker_labels` is set to `true`. See [Speaker labels](https://cloud.ibm.com/docs/services/speech-to-text/output.html#speaker_labels). */
  var speaker_labels: js.UndefOr[Boolean] = js.native
  /** If `true`, the service returns time alignment for each word. By default, no timestamps are returned. See [Word timestamps](https://cloud.ibm.com/docs/services/speech-to-text/output.html#word_timestamps). */
  var timestamps: js.UndefOr[Boolean] = js.native
  /** A confidence value that is the lower bound for identifying a hypothesis as a possible word alternative (also known as "Confusion Networks"). An alternative word is considered if its confidence is greater than or equal to the threshold. Specify a probability between 0.0 and 1.0. By default, the service computes no alternative words. See [Word alternatives](https://cloud.ibm.com/docs/services/speech-to-text/output.html#word_alternatives). */
  var word_alternatives_threshold: js.UndefOr[Double] = js.native
  /** If `true`, the service returns a confidence measure in the range of 0.0 to 1.0 for each word. By default, the service returns no word confidence scores. See [Word confidence](https://cloud.ibm.com/docs/services/speech-to-text/output.html#word_confidence). */
  var word_confidence: js.UndefOr[Boolean] = js.native
}

object RecognizeParams {
  @scala.inline
  def apply(audio: ReadableStream | FileObject | Buffer): RecognizeParams = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecognizeParams]
  }
  @scala.inline
  implicit class RecognizeParamsOps[Self <: RecognizeParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudio(value: ReadableStream | FileObject | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcoustic_customization_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acoustic_customization_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcoustic_customization_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acoustic_customization_id")(js.undefined)
        ret
    }
    @scala.inline
    def withBase_model_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_model_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase_model_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_model_version")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_type(value: ContentType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomization_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customization_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomization_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customization_id")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomization_weight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customization_weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomization_weight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customization_weight")(js.undefined)
        ret
    }
    @scala.inline
    def withGrammar_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grammar_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrammar_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grammar_name")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withInactivity_timeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactivity_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactivity_timeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactivity_timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withKeywords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(js.undefined)
        ret
    }
    @scala.inline
    def withKeywords_threshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords_threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywords_threshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords_threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage_customization_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language_customization_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage_customization_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language_customization_id")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_alternatives(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_alternatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_alternatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_alternatives")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: Model | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withProfanity_filter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profanity_filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfanity_filter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profanity_filter")(js.undefined)
        ret
    }
    @scala.inline
    def withRedaction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redaction")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_response(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_response: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_response")(js.undefined)
        ret
    }
    @scala.inline
    def withSmart_formatting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smart_formatting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmart_formatting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smart_formatting")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeaker_labels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speaker_labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeaker_labels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speaker_labels")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamps")(js.undefined)
        ret
    }
    @scala.inline
    def withWord_alternatives_threshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word_alternatives_threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWord_alternatives_threshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word_alternatives_threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withWord_confidence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word_confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWord_confidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word_confidence")(js.undefined)
        ret
    }
  }
  
}

