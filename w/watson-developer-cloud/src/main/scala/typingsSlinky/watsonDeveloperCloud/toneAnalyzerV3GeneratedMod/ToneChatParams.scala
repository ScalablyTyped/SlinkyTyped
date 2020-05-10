package typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage
import typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.ContentLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `toneChat` operation. */
@js.native
trait ToneChatParams extends js.Object {
  /** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can use different languages for **Content-Language** and **Accept-Language**. */
  var accept_language: js.UndefOr[AcceptLanguage | String] = js.native
  /** The language of the input text for the request: English or French. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The input content must match the specified language. Do not submit content that contains both languages. You can use different languages for **Content-Language** and **Accept-Language**. * **`2017-09-21`:** Accepts `en` or `fr`. * **`2016-05-19`:** Accepts only `en`. */
  var content_language: js.UndefOr[ContentLanguage | String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** An array of `Utterance` objects that provides the input content that the service is to analyze. */
  var utterances: js.Array[Utterance] = js.native
}

object ToneChatParams {
  @scala.inline
  def apply(utterances: js.Array[Utterance]): ToneChatParams = {
    val __obj = js.Dynamic.literal(utterances = utterances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToneChatParams]
  }
  @scala.inline
  implicit class ToneChatParamsOps[Self <: ToneChatParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUtterances(value: js.Array[Utterance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utterances")(value.asInstanceOf[js.Any])
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

