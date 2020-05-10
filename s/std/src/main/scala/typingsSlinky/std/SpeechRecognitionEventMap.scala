package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechRecognitionEventMap extends js.Object {
  var audioend: Event_ = js.native
  var audiostart: Event_ = js.native
  var end: Event_ = js.native
  var error: Event_ = js.native
  var nomatch: SpeechRecognitionEvent = js.native
  var result: SpeechRecognitionEvent = js.native
  var soundend: Event_ = js.native
  var soundstart: Event_ = js.native
  var speechend: Event_ = js.native
  var speechstart: Event_ = js.native
  var start: Event_ = js.native
}

object SpeechRecognitionEventMap {
  @scala.inline
  def apply(
    audioend: Event_,
    audiostart: Event_,
    end: Event_,
    error: Event_,
    nomatch: SpeechRecognitionEvent,
    result: SpeechRecognitionEvent,
    soundend: Event_,
    soundstart: Event_,
    speechend: Event_,
    speechstart: Event_,
    start: Event_
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
    def withAudioend(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudiostart(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audiostart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: Event_): Self = {
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
    def withSoundend(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoundstart(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeechend(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeechstart(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

