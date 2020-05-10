package typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Voices. */
@js.native
trait Voices extends js.Object {
  /** A list of available voices. */
  var voices: js.Array[Voice] = js.native
}

object Voices {
  @scala.inline
  def apply(voices: js.Array[Voice]): Voices = {
    val __obj = js.Dynamic.literal(voices = voices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Voices]
  }
  @scala.inline
  implicit class VoicesOps[Self <: Voices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVoices(value: js.Array[Voice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

