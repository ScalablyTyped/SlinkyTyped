package typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContentType extends StObject
/** The format (MIME type) of the audio. For more information about specifying an audio format, see **Audio formats (content types)** in the method description. */
@JSImport("watson-developer-cloud/speech-to-text/v1-generated", "CreateJobConstants.ContentType")
@js.native
object ContentType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContentType with String] = js.native
  
  @js.native
  sealed trait APPLICATION_OCTET_STREAM extends ContentType
  /* "application/octet-stream" */ val APPLICATION_OCTET_STREAM: typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.ContentType.APPLICATION_OCTET_STREAM with String = js.native
  
  @js.native
  sealed trait AUDIO_ALAW extends ContentType
  /* "audio/alaw" */ val AUDIO_ALAW: typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.ContentType.AUDIO_ALAW with String = js.native
  
  @js.native
  sealed trait AUDIO_BASIC extends ContentType
  /* "audio/basic" */ val AUDIO_BASIC: typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.ContentType.AUDIO_BASIC with String = js.native
  
  @js.native
  sealed trait AUDIO_FLAC extends ContentType
  /* "audio/flac" */ val AUDIO_FLAC: typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.ContentType.AUDIO_FLAC with String = js.native
  
  @js.native
  sealed trait AUDIO_G729 extends ContentType
  /* "audio/g729" */ val AUDIO_G729: typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.ContentType.AUDIO_G729 with String = js.native
  
  @js.native
  sealed trait AUDIO_L16 extends ContentType
  /* "audio/l16" */ val AUDIO_L16: typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.ContentType.AUDIO_L16 with String = js.native
  
  @js.native
  sealed trait AUDIO_MP3 extends ContentType
  /* "audio/mp3" */ val AUDIO_MP3: typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.ContentType.AUDIO_MP3 with String = js.native
  
  @js.native
  sealed trait AUDIO_MPEG extends ContentType
  /* "audio/mpeg" */ val AUDIO_MPEG: typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.ContentType.AUDIO_MPEG with String = js.native
  
  @js.native
  sealed trait AUDIO_MULAW extends ContentType
  /* "audio/mulaw" */ val AUDIO_MULAW: typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.ContentType.AUDIO_MULAW with String = js.native
  
  @js.native
  sealed trait AUDIO_OGG extends ContentType
  /* "audio/ogg" */ val AUDIO_OGG: typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.ContentType.AUDIO_OGG with String = js.native
  
  @js.native
  sealed trait AUDIO_OGG_CODECS_OPUS extends ContentType
  /* "audio/ogg;codecs=opus" */ val AUDIO_OGG_CODECS_OPUS: typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.ContentType.AUDIO_OGG_CODECS_OPUS with String = js.native
  
  @js.native
  sealed trait AUDIO_OGG_CODECS_VORBIS extends ContentType
  /* "audio/ogg;codecs=vorbis" */ val AUDIO_OGG_CODECS_VORBIS: typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.ContentType.AUDIO_OGG_CODECS_VORBIS with String = js.native
  
  @js.native
  sealed trait AUDIO_WAV extends ContentType
  /* "audio/wav" */ val AUDIO_WAV: typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.ContentType.AUDIO_WAV with String = js.native
  
  @js.native
  sealed trait AUDIO_WEBM extends ContentType
  /* "audio/webm" */ val AUDIO_WEBM: typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.ContentType.AUDIO_WEBM with String = js.native
  
  @js.native
  sealed trait AUDIO_WEBM_CODECS_OPUS extends ContentType
  /* "audio/webm;codecs=opus" */ val AUDIO_WEBM_CODECS_OPUS: typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.ContentType.AUDIO_WEBM_CODECS_OPUS with String = js.native
  
  @js.native
  sealed trait AUDIO_WEBM_CODECS_VORBIS extends ContentType
  /* "audio/webm;codecs=vorbis" */ val AUDIO_WEBM_CODECS_VORBIS: typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateJobConstants.ContentType.AUDIO_WEBM_CODECS_VORBIS with String = js.native
}
