package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * request interfaces
  ************************/
/** Parameters for the `analyze` operation. */
@js.native
trait AnalyzeParams extends js.Object {
  /** Set this to `false` to disable webpage cleaning. To learn more about webpage cleaning, see the [Analyzing webpages](https://cloud.ibm.com/docs/services/natural-language-understanding/analyzing-webpages.html) documentation. */
  var clean: js.UndefOr[Boolean] = js.native
  /** Whether to use raw HTML content if text cleaning fails. */
  var fallback_to_raw: js.UndefOr[Boolean] = js.native
  /** Specific features to analyze the document for. */
  var features: Features = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** The HTML file to analyze. One of the `text`, `html`, or `url` parameters is required. */
  var html: js.UndefOr[String] = js.native
  /** ISO 639-1 code that specifies the language of your text. This overrides automatic language detection. Language support differs depending on the features you include in your analysis. See [Language support](https://www.bluemix.net/docs/services/natural-language-understanding/language-support.html) for more information. */
  var language: js.UndefOr[String] = js.native
  /** Sets the maximum number of characters that are processed by the service. */
  var limit_text_characters: js.UndefOr[Double] = js.native
  /** Whether or not to return the analyzed text. */
  var return_analyzed_text: js.UndefOr[Boolean] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** The plain text to analyze. One of the `text`, `html`, or `url` parameters is required. */
  var text: js.UndefOr[String] = js.native
  /** The webpage to analyze. One of the `text`, `html`, or `url` parameters is required. */
  var url: js.UndefOr[String] = js.native
  /** An [XPath query](https://cloud.ibm.com/docs/services/natural-language-understanding/analyzing-webpages.html#xpath) to perform on `html` or `url` input. Results of the query will be appended to the cleaned webpage text before it is analyzed. To analyze only the results of the XPath query, set the `clean` parameter to `false`. */
  var xpath: js.UndefOr[String] = js.native
}

object AnalyzeParams {
  @scala.inline
  def apply(features: Features): AnalyzeParams = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzeParams]
  }
  @scala.inline
  implicit class AnalyzeParamsOps[Self <: AnalyzeParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatures(value: Features): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(js.undefined)
        ret
    }
    @scala.inline
    def withFallback_to_raw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback_to_raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallback_to_raw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback_to_raw")(js.undefined)
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
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit_text_characters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit_text_characters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit_text_characters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit_text_characters")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_analyzed_text(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_analyzed_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_analyzed_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_analyzed_text")(js.undefined)
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
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withXpath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpath")(js.undefined)
        ret
    }
  }
  
}

