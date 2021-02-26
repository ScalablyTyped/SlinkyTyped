package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechRecognitionEventMap extends StObject {
  
  var audioend: org.scalajs.dom.raw.Event = js.native
  
  var audiostart: org.scalajs.dom.raw.Event = js.native
  
  var end: org.scalajs.dom.raw.Event = js.native
  
  var error: org.scalajs.dom.raw.ErrorEvent = js.native
  
  var nomatch: SpeechRecognitionEvent = js.native
  
  var result: SpeechRecognitionEvent = js.native
  
  var soundend: org.scalajs.dom.raw.Event = js.native
  
  var soundstart: org.scalajs.dom.raw.Event = js.native
  
  var speechend: org.scalajs.dom.raw.Event = js.native
  
  var speechstart: org.scalajs.dom.raw.Event = js.native
  
  var start: org.scalajs.dom.raw.Event = js.native
}
object SpeechRecognitionEventMap {
  
  @scala.inline
  def apply(
    audioend: org.scalajs.dom.raw.Event,
    audiostart: org.scalajs.dom.raw.Event,
    end: org.scalajs.dom.raw.Event,
    error: org.scalajs.dom.raw.ErrorEvent,
    nomatch: SpeechRecognitionEvent,
    result: SpeechRecognitionEvent,
    soundend: org.scalajs.dom.raw.Event,
    soundstart: org.scalajs.dom.raw.Event,
    speechend: org.scalajs.dom.raw.Event,
    speechstart: org.scalajs.dom.raw.Event,
    start: org.scalajs.dom.raw.Event
  ): SpeechRecognitionEventMap = {
    val __obj = js.Dynamic.literal(audioend = audioend.asInstanceOf[js.Any], audiostart = audiostart.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], nomatch = nomatch.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], soundend = soundend.asInstanceOf[js.Any], soundstart = soundstart.asInstanceOf[js.Any], speechend = speechend.asInstanceOf[js.Any], speechstart = speechstart.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionEventMap]
  }
  
  @scala.inline
  implicit class SpeechRecognitionEventMapMutableBuilder[Self <: SpeechRecognitionEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioend(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "audioend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudiostart(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "audiostart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: org.scalajs.dom.raw.ErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNomatch(value: SpeechRecognitionEvent): Self = StObject.set(x, "nomatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: SpeechRecognitionEvent): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundend(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "soundend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundstart(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "soundstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechend(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "speechend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechstart(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "speechstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
