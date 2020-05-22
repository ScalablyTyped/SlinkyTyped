package typingsSlinky.winrtUwp.global.Windows.Media.SpeechRecognition

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the semantic properties of a recognized phrase in a Speech Recognition Grammar Specification (SRGS) grammar. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionSemanticInterpretation")
@js.native
abstract class SpeechRecognitionSemanticInterpretation ()
  extends typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionSemanticInterpretation {
  /** Gets a dictionary of the semantic properties. */
  /* CompleteClass */
  override var properties: IMapView[String, IVectorView[_]] = js.native
}

