package typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `tone` operation. */
object ToneConstants {
  
  @js.native
  sealed trait AcceptLanguage extends StObject
  /** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can use different languages for **Content-Language** and **Accept-Language**. */
  @JSImport("watson-developer-cloud/tone-analyzer/v3-generated", "ToneConstants.AcceptLanguage")
  @js.native
  object AcceptLanguage extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AcceptLanguage with String] = js.native
    
    @js.native
    sealed trait AR extends AcceptLanguage
    /* "ar" */ val AR: typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.AR with String = js.native
    
    @js.native
    sealed trait DE extends AcceptLanguage
    /* "de" */ val DE: typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.DE with String = js.native
    
    @js.native
    sealed trait EN extends AcceptLanguage
    /* "en" */ val EN: typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.EN with String = js.native
    
    @js.native
    sealed trait ES extends AcceptLanguage
    /* "es" */ val ES: typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.ES with String = js.native
    
    @js.native
    sealed trait FR extends AcceptLanguage
    /* "fr" */ val FR: typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.FR with String = js.native
    
    @js.native
    sealed trait IT extends AcceptLanguage
    /* "it" */ val IT: typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.IT with String = js.native
    
    @js.native
    sealed trait JA extends AcceptLanguage
    /* "ja" */ val JA: typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.JA with String = js.native
    
    @js.native
    sealed trait KO extends AcceptLanguage
    /* "ko" */ val KO: typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.KO with String = js.native
    
    @js.native
    sealed trait PT_BR extends AcceptLanguage
    /* "pt-br" */ val PT_BR: typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.PT_BR with String = js.native
    
    @js.native
    sealed trait ZH_CN extends AcceptLanguage
    /* "zh-cn" */ val ZH_CN: typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.ZH_CN with String = js.native
    
    @js.native
    sealed trait ZH_TW extends AcceptLanguage
    /* "zh-tw" */ val ZH_TW: typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.ZH_TW with String = js.native
  }
  
  @js.native
  sealed trait ContentLanguage extends StObject
  /** The language of the input text for the request: English or French. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The input content must match the specified language. Do not submit content that contains both languages. You can use different languages for **Content-Language** and **Accept-Language**. * **`2017-09-21`:** Accepts `en` or `fr`. * **`2016-05-19`:** Accepts only `en`. */
  @JSImport("watson-developer-cloud/tone-analyzer/v3-generated", "ToneConstants.ContentLanguage")
  @js.native
  object ContentLanguage extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ContentLanguage with String] = js.native
    
    @js.native
    sealed trait EN extends ContentLanguage
    /* "en" */ val EN: typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentLanguage.EN with String = js.native
    
    @js.native
    sealed trait FR extends ContentLanguage
    /* "fr" */ val FR: typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentLanguage.FR with String = js.native
  }
  
  @js.native
  sealed trait ContentType extends StObject
  /** The type of the input. A character encoding can be specified by including a `charset` parameter. For example, 'text/plain;charset=utf-8'. */
  @JSImport("watson-developer-cloud/tone-analyzer/v3-generated", "ToneConstants.ContentType")
  @js.native
  object ContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ContentType with String] = js.native
    
    @js.native
    sealed trait APPLICATION_JSON extends ContentType
    /* "application/json" */ val APPLICATION_JSON: typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentType.APPLICATION_JSON with String = js.native
    
    @js.native
    sealed trait TEXT_HTML extends ContentType
    /* "text/html" */ val TEXT_HTML: typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentType.TEXT_HTML with String = js.native
    
    @js.native
    sealed trait TEXT_PLAIN extends ContentType
    /* "text/plain" */ val TEXT_PLAIN: typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentType.TEXT_PLAIN with String = js.native
  }
  
  @js.native
  sealed trait Tones extends StObject
  /** **`2017-09-21`:** Deprecated. The service continues to accept the parameter for backward-compatibility, but the parameter no longer affects the response. **`2016-05-19`:** A comma-separated list of tones for which the service is to return its analysis of the input; the indicated tones apply both to the full document and to individual sentences of the document. You can specify one or more of the valid values. Omit the parameter to request results for all three tones. */
  @JSImport("watson-developer-cloud/tone-analyzer/v3-generated", "ToneConstants.Tones")
  @js.native
  object Tones extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Tones with String] = js.native
    
    @js.native
    sealed trait EMOTION extends Tones
    /* "emotion" */ val EMOTION: typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.Tones.EMOTION with String = js.native
    
    @js.native
    sealed trait LANGUAGE extends Tones
    /* "language" */ val LANGUAGE: typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.Tones.LANGUAGE with String = js.native
    
    @js.native
    sealed trait SOCIAL extends Tones
    /* "social" */ val SOCIAL: typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.Tones.SOCIAL with String = js.native
  }
}
