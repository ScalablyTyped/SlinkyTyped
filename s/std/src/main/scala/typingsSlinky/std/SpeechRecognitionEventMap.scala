package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechRecognitionEventMap extends js.Object {
  var audioend: org.scalajs.dom.raw.Event
  var audiostart: org.scalajs.dom.raw.Event
  var end: org.scalajs.dom.raw.Event
  var error: SpeechRecognitionError
  var nomatch: SpeechRecognitionEvent
  var result: SpeechRecognitionEvent
  var soundend: org.scalajs.dom.raw.Event
  var soundstart: org.scalajs.dom.raw.Event
  var speechend: org.scalajs.dom.raw.Event
  var speechstart: org.scalajs.dom.raw.Event
  var start: org.scalajs.dom.raw.Event
}

object SpeechRecognitionEventMap {
  @scala.inline
  def apply(
    audioend: org.scalajs.dom.raw.Event,
    audiostart: org.scalajs.dom.raw.Event,
    end: org.scalajs.dom.raw.Event,
    error: SpeechRecognitionError,
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
}

