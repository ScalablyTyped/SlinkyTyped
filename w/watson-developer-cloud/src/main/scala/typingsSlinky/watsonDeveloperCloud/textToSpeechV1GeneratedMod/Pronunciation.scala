package typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * model interfaces
  ************************/
/** Pronunciation. */
@js.native
trait Pronunciation extends js.Object {
  /** The pronunciation of the specified text in the requested voice and format. If a custom voice model is specified, the pronunciation also reflects that custom voice. */
  var pronunciation: String = js.native
}

object Pronunciation {
  @scala.inline
  def apply(pronunciation: String): Pronunciation = {
    val __obj = js.Dynamic.literal(pronunciation = pronunciation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pronunciation]
  }
  @scala.inline
  implicit class PronunciationOps[Self <: Pronunciation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPronunciation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pronunciation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

