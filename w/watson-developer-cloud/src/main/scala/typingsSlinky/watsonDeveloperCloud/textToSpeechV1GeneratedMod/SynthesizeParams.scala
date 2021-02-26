package typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Accept
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `synthesize` operation. */
@js.native
trait SynthesizeParams extends StObject {
  
  /** The requested format (MIME type) of the audio. You can use the `Accept` header or the `accept` parameter to specify the audio format. For more information about specifying an audio format, see **Audio formats (accept types)** in the method description. Default: `audio/ogg;codecs=opus`. */
  var accept: js.UndefOr[Accept | String] = js.native
  
  /** The customization ID (GUID) of a custom voice model to use for the synthesis. If a custom voice model is specified, it is guaranteed to work only if it matches the language of the indicated voice. You must make the request with service credentials created for the instance of the service that owns the custom model. Omit the parameter to use the specified voice with no customization. */
  var customization_id: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** The text to synthesize. */
  var text: String = js.native
  
  /** The voice to use for synthesis. */
  var voice: js.UndefOr[
    typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice | String
  ] = js.native
}
object SynthesizeParams {
  
  @scala.inline
  def apply(text: String): SynthesizeParams = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesizeParams]
  }
  
  @scala.inline
  implicit class SynthesizeParamsMutableBuilder[Self <: SynthesizeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: Accept | String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    @scala.inline
    def setCustomization_id(value: String): Self = StObject.set(x, "customization_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomization_idUndefined: Self = StObject.set(x, "customization_id", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoice(
      value: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.SynthesizeConstants.Voice | String
    ): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
  }
}
