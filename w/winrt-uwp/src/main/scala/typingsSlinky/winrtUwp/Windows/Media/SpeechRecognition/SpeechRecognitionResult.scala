package typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The result of a speech recognition session. */
@js.native
trait SpeechRecognitionResult extends js.Object {
  /** Gets a value that indicates the confidence of the speech recognizer in the recognition result. */
  var confidence: SpeechRecognitionConfidence = js.native
  /** Gets the constraint that was triggered to return the recognized phrase. */
  var constraint: ISpeechRecognitionConstraint = js.native
  /** Gets the amount of time required for the utterance. */
  var phraseDuration: Double = js.native
  /** Gets the start time of the utterance. */
  var phraseStartTime: js.Date = js.native
  /** Gets a value that indicates the relative confidence of the SpeechRecognitionResult when compared with a collection of alternatives returned with the recognition result. */
  var rawConfidence: Double = js.native
  /** Gets the hierarchy of rule elements that were triggered to return the recognized phrase. */
  var rulePath: IVectorView[String] = js.native
  /** Gets an interpretation object containing the semantic properties of a recognized phrase in a Speech Recognition Grammar Specification (SRGS) grammar. */
  var semanticInterpretation: SpeechRecognitionSemanticInterpretation = js.native
  /** Gets the result state ( SpeechRecognitionResultStatus ) of a speech recognition session. */
  var status: SpeechRecognitionResultStatus = js.native
  /** Gets the recognized phrase of the speech recognition session. */
  var text: String = js.native
  /**
    * Gets a collection of recognition result alternatives, ordered by RawConfidence from most likely to least likely. The first item in the collection is the recognition result indicated by the parent object.
    * @param maxAlternates The maximum number of speech recognition results to return in the collection.
    * @return A collection of speech recognition results, ordered by confidence from most likely to least likely.
    */
  def getAlternates(maxAlternates: Double): IVectorView[SpeechRecognitionResult] = js.native
}

object SpeechRecognitionResult {
  @scala.inline
  def apply(
    confidence: SpeechRecognitionConfidence,
    constraint: ISpeechRecognitionConstraint,
    getAlternates: Double => IVectorView[SpeechRecognitionResult],
    phraseDuration: Double,
    phraseStartTime: js.Date,
    rawConfidence: Double,
    rulePath: IVectorView[String],
    semanticInterpretation: SpeechRecognitionSemanticInterpretation,
    status: SpeechRecognitionResultStatus,
    text: String
  ): SpeechRecognitionResult = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], constraint = constraint.asInstanceOf[js.Any], getAlternates = js.Any.fromFunction1(getAlternates), phraseDuration = phraseDuration.asInstanceOf[js.Any], phraseStartTime = phraseStartTime.asInstanceOf[js.Any], rawConfidence = rawConfidence.asInstanceOf[js.Any], rulePath = rulePath.asInstanceOf[js.Any], semanticInterpretation = semanticInterpretation.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionResult]
  }
  @scala.inline
  implicit class SpeechRecognitionResultOps[Self <: SpeechRecognitionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfidence(value: SpeechRecognitionConfidence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstraint(value: ISpeechRecognitionConstraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAlternates(value: Double => IVectorView[SpeechRecognitionResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAlternates")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPhraseDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phraseDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhraseStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phraseStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawConfidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRulePath(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemanticInterpretation(value: SpeechRecognitionSemanticInterpretation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semanticInterpretation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: SpeechRecognitionResultStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

