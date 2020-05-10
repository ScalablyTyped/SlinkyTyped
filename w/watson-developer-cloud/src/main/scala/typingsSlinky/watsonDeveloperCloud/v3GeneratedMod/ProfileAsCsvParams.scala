package typingsSlinky.watsonDeveloperCloud.v3GeneratedMod

import typingsSlinky.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage
import typingsSlinky.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentLanguage
import typingsSlinky.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `profileAsCsv` operation. */
@js.native
trait ProfileAsCsvParams extends js.Object {
  /** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can specify any combination of languages for the input and response content. */
  var accept_language: js.UndefOr[AcceptLanguage | String] = js.native
  /** Indicates whether consumption preferences are returned with the results. By default, no consumption preferences are returned. */
  var consumption_preferences: js.UndefOr[Boolean] = js.native
  /** A maximum of 20 MB of content to analyze, though the service requires much less text; for more information, see [Providing sufficient input](https://cloud.ibm.com/docs/services/personality-insights/input.html#sufficient). For JSON input, provide an object of type `Content`. */
  var content: Content | String = js.native
  /** The language of the input text for the request: Arabic, English, Japanese, Korean, or Spanish. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The effect of the **Content-Language** parameter depends on the **Content-Type** parameter. When **Content-Type** is `text/plain` or `text/html`, **Content-Language** is the only way to specify the language. When **Content-Type** is `application/json`, **Content-Language** overrides a language specified with the `language` parameter of a `ContentItem` object, and content items that specify a different language are ignored; omit this parameter to base the language on the specification of the content items. You can specify any combination of languages for **Content-Language** and **Accept-Language**. */
  var content_language: js.UndefOr[ContentLanguage | String] = js.native
  /** The type of the input. For more information, see **Content types** in the method description. Default: `text/plain`. */
  var content_type: js.UndefOr[ContentType | String] = js.native
  /** Indicates whether column labels are returned with a CSV response. By default, no column labels are returned. Applies only when the response type is CSV (`text/csv`). */
  var csv_headers: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** Indicates whether a raw score in addition to a normalized percentile is returned for each characteristic; raw scores are not compared with a sample population. By default, only normalized percentiles are returned. */
  var raw_scores: js.UndefOr[Boolean] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
}

object ProfileAsCsvParams {
  @scala.inline
  def apply(content: Content | String): ProfileAsCsvParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileAsCsvParams]
  }
  @scala.inline
  implicit class ProfileAsCsvParamsOps[Self <: ProfileAsCsvParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: Content | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccept_language(value: AcceptLanguage | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept_language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccept_language: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept_language")(js.undefined)
        ret
    }
    @scala.inline
    def withConsumption_preferences(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumption_preferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumption_preferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumption_preferences")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_language(value: ContentLanguage | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_language: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_language")(js.undefined)
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
    def withCsv_headers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csv_headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsv_headers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csv_headers")(js.undefined)
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
    def withRaw_scores(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw_scores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw_scores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw_scores")(js.undefined)
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
  }
  
}

