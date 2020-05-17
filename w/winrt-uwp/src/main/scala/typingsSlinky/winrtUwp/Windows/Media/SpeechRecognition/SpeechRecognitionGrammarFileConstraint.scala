package typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition

import typingsSlinky.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A constraint for a SpeechRecognizer object based on a Speech Recognition Grammar Specification (SRGS) file. */
@js.native
trait SpeechRecognitionGrammarFileConstraint extends js.Object {
  /** Gets the StorageFile object representing the Speech Recognition Grammar Specification (SRGS) grammar file. */
  var grammarFile: StorageFile = js.native
  /** Gets or sets whether the constraint can be used by the speech recognizer to perform recognition. */
  var isEnabled: Boolean = js.native
  /** Gets or sets the weighted value of the constraint. */
  var probability: SpeechRecognitionConstraintProbability = js.native
  /** Gets or sets a tag that can be useful for identifying the constraint. */
  var tag: String = js.native
  /** Gets the type of the constraint. */
  var `type`: SpeechRecognitionConstraintType = js.native
}

object SpeechRecognitionGrammarFileConstraint {
  @scala.inline
  def apply(
    grammarFile: StorageFile,
    isEnabled: Boolean,
    probability: SpeechRecognitionConstraintProbability,
    tag: String,
    `type`: SpeechRecognitionConstraintType
  ): SpeechRecognitionGrammarFileConstraint = {
    val __obj = js.Dynamic.literal(grammarFile = grammarFile.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionGrammarFileConstraint]
  }
  @scala.inline
  implicit class SpeechRecognitionGrammarFileConstraintOps[Self <: SpeechRecognitionGrammarFileConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrammarFile(value: StorageFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grammarFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProbability(value: SpeechRecognitionConstraintProbability): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("probability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: SpeechRecognitionConstraintType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

