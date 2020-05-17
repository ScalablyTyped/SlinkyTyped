package typingsSlinky.winrtUwp.Windows.Media.Effects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio effect. */
@js.native
trait AudioEffect extends js.Object {
  /** Gets the type of the audio effect. */
  var audioEffectType: AudioEffectType = js.native
}

object AudioEffect {
  @scala.inline
  def apply(audioEffectType: AudioEffectType): AudioEffect = {
    val __obj = js.Dynamic.literal(audioEffectType = audioEffectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioEffect]
  }
  @scala.inline
  implicit class AudioEffectOps[Self <: AudioEffect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioEffectType(value: AudioEffectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioEffectType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

