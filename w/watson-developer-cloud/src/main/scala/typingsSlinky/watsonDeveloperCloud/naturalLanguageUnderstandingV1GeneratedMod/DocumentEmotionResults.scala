package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Emotion results for the document as a whole. */
@js.native
trait DocumentEmotionResults extends js.Object {
  /** Emotion results for the document as a whole. */
  var emotion: js.UndefOr[EmotionScores] = js.native
}

object DocumentEmotionResults {
  @scala.inline
  def apply(): DocumentEmotionResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentEmotionResults]
  }
  @scala.inline
  implicit class DocumentEmotionResultsOps[Self <: DocumentEmotionResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmotion(value: EmotionScores): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emotion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmotion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emotion")(js.undefined)
        ret
    }
  }
  
}

