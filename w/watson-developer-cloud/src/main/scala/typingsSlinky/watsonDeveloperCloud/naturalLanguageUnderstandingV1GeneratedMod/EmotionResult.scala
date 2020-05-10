package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The detected anger, disgust, fear, joy, or sadness that is conveyed by the content. Emotion information can be returned for detected entities, keywords, or user-specified target phrases found in the text. */
@js.native
trait EmotionResult extends js.Object {
  /** Emotion results for the document as a whole. */
  var document: js.UndefOr[DocumentEmotionResults] = js.native
  /** Emotion results for specified targets. */
  var targets: js.UndefOr[js.Array[TargetedEmotionResults]] = js.native
}

object EmotionResult {
  @scala.inline
  def apply(): EmotionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmotionResult]
  }
  @scala.inline
  implicit class EmotionResultOps[Self <: EmotionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: DocumentEmotionResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(js.undefined)
        ret
    }
    @scala.inline
    def withTargets(value: js.Array[TargetedEmotionResults]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(js.undefined)
        ret
    }
  }
  
}

