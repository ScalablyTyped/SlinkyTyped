package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechRecognitionEventMap extends js.Object {
  var audioend: org.scalajs.dom.raw.Event = js.native
  var audiostart: org.scalajs.dom.raw.Event = js.native
  var end: org.scalajs.dom.raw.Event = js.native
  var error: org.scalajs.dom.raw.Event = js.native
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
    error: org.scalajs.dom.raw.Event,
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
  implicit class SpeechRecognitionEventMapOps[Self <: SpeechRecognitionEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioend(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudiostart(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audiostart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNomatch(value: SpeechRecognitionEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nomatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: SpeechRecognitionEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoundend(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoundstart(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeechend(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeechstart(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

