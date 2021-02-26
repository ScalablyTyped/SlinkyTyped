package typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage
import typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.ContentLanguage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `toneChat` operation. */
@js.native
trait ToneChatParams extends StObject {
  
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
  implicit class ToneChatParamsMutableBuilder[Self <: ToneChatParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept_language(value: AcceptLanguage | String): Self = StObject.set(x, "accept_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccept_languageUndefined: Self = StObject.set(x, "accept_language", js.undefined)
    
    @scala.inline
    def setContent_language(value: ContentLanguage | String): Self = StObject.set(x, "content_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_languageUndefined: Self = StObject.set(x, "content_language", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setUtterances(value: js.Array[Utterance]): Self = StObject.set(x, "utterances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtterancesVarargs(value: Utterance*): Self = StObject.set(x, "utterances", js.Array(value :_*))
  }
}
