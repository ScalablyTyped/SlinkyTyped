package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The sentiment of the content. */
@js.native
trait SentimentResult extends js.Object {
  /** The document level sentiment. */
  var document: js.UndefOr[DocumentSentimentResults] = js.native
  /** The targeted sentiment to analyze. */
  var targets: js.UndefOr[js.Array[TargetedSentimentResults]] = js.native
}

object SentimentResult {
  @scala.inline
  def apply(): SentimentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SentimentResult]
  }
  @scala.inline
  implicit class SentimentResultOps[Self <: SentimentResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: DocumentSentimentResults): Self = {
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
    def withTargets(value: js.Array[TargetedSentimentResults]): Self = {
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

