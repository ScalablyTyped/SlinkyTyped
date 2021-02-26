package typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `getPronunciation` operation. */
object GetPronunciationConstants {
  
  @js.native
  sealed trait Format extends StObject
  /** The phoneme format in which to return the pronunciation. Omit the parameter to obtain the pronunciation in the default format. */
  @JSImport("watson-developer-cloud/text-to-speech/v1-generated", "GetPronunciationConstants.Format")
  @js.native
  object Format extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Format with String] = js.native
    
    @js.native
    sealed trait IBM extends Format
    /* "ibm" */ val IBM: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Format.IBM with String = js.native
    
    @js.native
    sealed trait IPA extends Format
    /* "ipa" */ val IPA: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Format.IPA with String = js.native
  }
  
  @js.native
  sealed trait Voice extends StObject
  /** A voice that specifies the language in which the pronunciation is to be returned. All voices for the same language (for example, `en-US`) return the same translation. */
  @JSImport("watson-developer-cloud/text-to-speech/v1-generated", "GetPronunciationConstants.Voice")
  @js.native
  object Voice extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice with String
      ] = js.native
    
    @js.native
    sealed trait DE_DE_BIRGITV2VOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "de-DE_BirgitV2Voice" */ val DE_DE_BIRGITV2VOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.DE_DE_BIRGITV2VOICE with String = js.native
    
    @js.native
    sealed trait DE_DE_BIRGITVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "de-DE_BirgitVoice" */ val DE_DE_BIRGITVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.DE_DE_BIRGITVOICE with String = js.native
    
    @js.native
    sealed trait DE_DE_DIETERV2VOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "de-DE_DieterV2Voice" */ val DE_DE_DIETERV2VOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.DE_DE_DIETERV2VOICE with String = js.native
    
    @js.native
    sealed trait DE_DE_DIETERVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "de-DE_DieterVoice" */ val DE_DE_DIETERVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.DE_DE_DIETERVOICE with String = js.native
    
    @js.native
    sealed trait EN_GB_KATEVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "en-GB_KateVoice" */ val EN_GB_KATEVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.EN_GB_KATEVOICE with String = js.native
    
    @js.native
    sealed trait EN_US_ALLISONV2VOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "en-US_AllisonV2Voice" */ val EN_US_ALLISONV2VOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.EN_US_ALLISONV2VOICE with String = js.native
    
    @js.native
    sealed trait EN_US_ALLISONVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "en-US_AllisonVoice" */ val EN_US_ALLISONVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.EN_US_ALLISONVOICE with String = js.native
    
    @js.native
    sealed trait EN_US_LISAV2VOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "en-US_LisaV2Voice" */ val EN_US_LISAV2VOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.EN_US_LISAV2VOICE with String = js.native
    
    @js.native
    sealed trait EN_US_LISAVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "en-US_LisaVoice" */ val EN_US_LISAVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.EN_US_LISAVOICE with String = js.native
    
    @js.native
    sealed trait EN_US_MICHAELV2VOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "en-US_MichaelV2Voice" */ val EN_US_MICHAELV2VOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.EN_US_MICHAELV2VOICE with String = js.native
    
    @js.native
    sealed trait EN_US_MICHAELVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "en-US_MichaelVoice" */ val EN_US_MICHAELVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.EN_US_MICHAELVOICE with String = js.native
    
    @js.native
    sealed trait ES_ES_ENRIQUEVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "es-ES_EnriqueVoice" */ val ES_ES_ENRIQUEVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.ES_ES_ENRIQUEVOICE with String = js.native
    
    @js.native
    sealed trait ES_ES_LAURAVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "es-ES_LauraVoice" */ val ES_ES_LAURAVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.ES_ES_LAURAVOICE with String = js.native
    
    @js.native
    sealed trait ES_LA_SOFIAVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "es-LA_SofiaVoice" */ val ES_LA_SOFIAVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.ES_LA_SOFIAVOICE with String = js.native
    
    @js.native
    sealed trait ES_US_SOFIAVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "es-US_SofiaVoice" */ val ES_US_SOFIAVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.ES_US_SOFIAVOICE with String = js.native
    
    @js.native
    sealed trait FR_FR_RENEEVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "fr-FR_ReneeVoice" */ val FR_FR_RENEEVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.FR_FR_RENEEVOICE with String = js.native
    
    @js.native
    sealed trait IT_IT_FRANCESCAV2VOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "it-IT_FrancescaV2Voice" */ val IT_IT_FRANCESCAV2VOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.IT_IT_FRANCESCAV2VOICE with String = js.native
    
    @js.native
    sealed trait IT_IT_FRANCESCAVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "it-IT_FrancescaVoice" */ val IT_IT_FRANCESCAVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.IT_IT_FRANCESCAVOICE with String = js.native
    
    @js.native
    sealed trait JA_JP_EMIVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "ja-JP_EmiVoice" */ val JA_JP_EMIVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.JA_JP_EMIVOICE with String = js.native
    
    @js.native
    sealed trait PT_BR_ISABELAVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "pt-BR_IsabelaVoice" */ val PT_BR_ISABELAVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.PT_BR_ISABELAVOICE with String = js.native
  }
}
