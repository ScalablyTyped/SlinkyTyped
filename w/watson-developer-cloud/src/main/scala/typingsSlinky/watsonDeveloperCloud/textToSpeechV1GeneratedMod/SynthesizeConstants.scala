package typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `synthesize` operation. */
object SynthesizeConstants {
  
  @js.native
  sealed trait Accept extends StObject
  /** The requested format (MIME type) of the audio. You can use the `Accept` header or the `accept` parameter to specify the audio format. For more information about specifying an audio format, see **Audio formats (accept types)** in the method description. Default: `audio/ogg;codecs=opus`. */
  @JSImport("watson-developer-cloud/text-to-speech/v1-generated", "SynthesizeConstants.Accept")
  @js.native
  object Accept extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Accept with String] = js.native
    
    @js.native
    sealed trait AUDIO_BASIC extends Accept
    /* "audio/basic" */ val AUDIO_BASIC: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_BASIC with String = js.native
    
    @js.native
    sealed trait AUDIO_FLAC extends Accept
    /* "audio/flac" */ val AUDIO_FLAC: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_FLAC with String = js.native
    
    @js.native
    sealed trait AUDIO_L16 extends Accept
    /* "audio/l16" */ val AUDIO_L16: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_L16 with String = js.native
    
    @js.native
    sealed trait AUDIO_MP3 extends Accept
    /* "audio/mp3" */ val AUDIO_MP3: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_MP3 with String = js.native
    
    @js.native
    sealed trait AUDIO_MPEG extends Accept
    /* "audio/mpeg" */ val AUDIO_MPEG: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_MPEG with String = js.native
    
    @js.native
    sealed trait AUDIO_MULAW extends Accept
    /* "audio/mulaw" */ val AUDIO_MULAW: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_MULAW with String = js.native
    
    @js.native
    sealed trait AUDIO_OGG extends Accept
    /* "audio/ogg" */ val AUDIO_OGG: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_OGG with String = js.native
    
    @js.native
    sealed trait AUDIO_OGG_CODECS_OPUS extends Accept
    /* "audio/ogg;codecs=opus" */ val AUDIO_OGG_CODECS_OPUS: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_OGG_CODECS_OPUS with String = js.native
    
    @js.native
    sealed trait AUDIO_OGG_CODECS_VORBIS extends Accept
    /* "audio/ogg;codecs=vorbis" */ val AUDIO_OGG_CODECS_VORBIS: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_OGG_CODECS_VORBIS with String = js.native
    
    @js.native
    sealed trait AUDIO_WAV extends Accept
    /* "audio/wav" */ val AUDIO_WAV: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_WAV with String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM extends Accept
    /* "audio/webm" */ val AUDIO_WEBM: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_WEBM with String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM_CODECS_OPUS extends Accept
    /* "audio/webm;codecs=opus" */ val AUDIO_WEBM_CODECS_OPUS: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_WEBM_CODECS_OPUS with String = js.native
    
    @js.native
    sealed trait AUDIO_WEBM_CODECS_VORBIS extends Accept
    /* "audio/webm;codecs=vorbis" */ val AUDIO_WEBM_CODECS_VORBIS: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept.AUDIO_WEBM_CODECS_VORBIS with String = js.native
  }
  
  @js.native
  sealed trait Voice extends StObject
  /** The voice to use for synthesis. */
  @JSImport("watson-developer-cloud/text-to-speech/v1-generated", "SynthesizeConstants.Voice")
  @js.native
  object Voice extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice with String
      ] = js.native
    
    @js.native
    sealed trait DE_DE_BIRGITV2VOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "de-DE_BirgitV2Voice" */ val DE_DE_BIRGITV2VOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.DE_DE_BIRGITV2VOICE with String = js.native
    
    @js.native
    sealed trait DE_DE_BIRGITVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "de-DE_BirgitVoice" */ val DE_DE_BIRGITVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.DE_DE_BIRGITVOICE with String = js.native
    
    @js.native
    sealed trait DE_DE_DIETERV2VOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "de-DE_DieterV2Voice" */ val DE_DE_DIETERV2VOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.DE_DE_DIETERV2VOICE with String = js.native
    
    @js.native
    sealed trait DE_DE_DIETERVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "de-DE_DieterVoice" */ val DE_DE_DIETERVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.DE_DE_DIETERVOICE with String = js.native
    
    @js.native
    sealed trait EN_GB_KATEVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "en-GB_KateVoice" */ val EN_GB_KATEVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.EN_GB_KATEVOICE with String = js.native
    
    @js.native
    sealed trait EN_US_ALLISONV2VOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "en-US_AllisonV2Voice" */ val EN_US_ALLISONV2VOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.EN_US_ALLISONV2VOICE with String = js.native
    
    @js.native
    sealed trait EN_US_ALLISONVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "en-US_AllisonVoice" */ val EN_US_ALLISONVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.EN_US_ALLISONVOICE with String = js.native
    
    @js.native
    sealed trait EN_US_LISAV2VOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "en-US_LisaV2Voice" */ val EN_US_LISAV2VOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.EN_US_LISAV2VOICE with String = js.native
    
    @js.native
    sealed trait EN_US_LISAVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "en-US_LisaVoice" */ val EN_US_LISAVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.EN_US_LISAVOICE with String = js.native
    
    @js.native
    sealed trait EN_US_MICHAELV2VOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "en-US_MichaelV2Voice" */ val EN_US_MICHAELV2VOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.EN_US_MICHAELV2VOICE with String = js.native
    
    @js.native
    sealed trait EN_US_MICHAELVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "en-US_MichaelVoice" */ val EN_US_MICHAELVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.EN_US_MICHAELVOICE with String = js.native
    
    @js.native
    sealed trait ES_ES_ENRIQUEVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "es-ES_EnriqueVoice" */ val ES_ES_ENRIQUEVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.ES_ES_ENRIQUEVOICE with String = js.native
    
    @js.native
    sealed trait ES_ES_LAURAVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "es-ES_LauraVoice" */ val ES_ES_LAURAVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.ES_ES_LAURAVOICE with String = js.native
    
    @js.native
    sealed trait ES_LA_SOFIAVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "es-LA_SofiaVoice" */ val ES_LA_SOFIAVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.ES_LA_SOFIAVOICE with String = js.native
    
    @js.native
    sealed trait ES_US_SOFIAVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "es-US_SofiaVoice" */ val ES_US_SOFIAVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.ES_US_SOFIAVOICE with String = js.native
    
    @js.native
    sealed trait FR_FR_RENEEVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "fr-FR_ReneeVoice" */ val FR_FR_RENEEVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.FR_FR_RENEEVOICE with String = js.native
    
    @js.native
    sealed trait IT_IT_FRANCESCAV2VOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "it-IT_FrancescaV2Voice" */ val IT_IT_FRANCESCAV2VOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.IT_IT_FRANCESCAV2VOICE with String = js.native
    
    @js.native
    sealed trait IT_IT_FRANCESCAVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "it-IT_FrancescaVoice" */ val IT_IT_FRANCESCAVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.IT_IT_FRANCESCAVOICE with String = js.native
    
    @js.native
    sealed trait JA_JP_EMIVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "ja-JP_EmiVoice" */ val JA_JP_EMIVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.JA_JP_EMIVOICE with String = js.native
    
    @js.native
    sealed trait PT_BR_ISABELAVOICE
      extends typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice
    /* "pt-BR_IsabelaVoice" */ val PT_BR_ISABELAVOICE: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice.PT_BR_ISABELAVOICE with String = js.native
  }
}
