package typingsSlinky.winrtUwp.global.Windows.Media.SpeechRecognition

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A constraint for a SpeechRecognizer object based on a list of words or phrases. When initialized, this object is added to the Constraints collection. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionListConstraint")
@js.native
class SpeechRecognitionListConstraint protected ()
  extends typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionListConstraint {
  /**
    * Creates an instance of the SpeechRecognitionListConstraint class from an array of words or phrases.
    * @param commands A string array of words or phrases that make up the constraint.
    */
  def this(commands: IIterable[String]) = this()
  /**
    * Creates an instance of the SpeechRecognitionListConstraint class from an array of words or phrases and a tag.
    * @param commands A string array of words or phrases that make up the constraint.
    * @param tag The tag to assign to the constraint.
    */
  def this(commands: IIterable[String], tag: String) = this()
  /** Gets the array of words or phrases that make up the constraint. */
  /* CompleteClass */
  override var commands: IVector[String] = js.native
  /** Gets or sets whether the constraint can be used by the speech recognizer to perform recognition. */
  /* CompleteClass */
  override var isEnabled: Boolean = js.native
  /** Gets or sets the weighted value of the constraint. */
  /* CompleteClass */
  override var probability: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintProbability = js.native
  /** Gets or sets a tag that can be useful for identifying the constraint. */
  /* CompleteClass */
  override var tag: String = js.native
  /** Gets the type of the constraint. */
  /* CompleteClass */
  override var `type`: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintType = js.native
}

