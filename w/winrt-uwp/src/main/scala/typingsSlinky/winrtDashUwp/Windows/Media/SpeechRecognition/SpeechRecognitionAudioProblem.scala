package typingsSlinky.winrtDashUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpeechRecognitionAudioProblem extends js.Object

/** Specifies the type of audio problem detected. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem")
@js.native
object SpeechRecognitionAudioProblem extends js.Object {
  /** No audio. For example, the microphone may have been muted. */
  @js.native
  sealed trait noSignal extends SpeechRecognitionAudioProblem
  
  /** No audio problem. */
  @js.native
  sealed trait none extends SpeechRecognitionAudioProblem
  
  /** User spoke too fast. */
  @js.native
  sealed trait tooFast extends SpeechRecognitionAudioProblem
  
  /** Input volume too high. */
  @js.native
  sealed trait tooLoud extends SpeechRecognitionAudioProblem
  
  /** Too much background noise interfering with the speech recognition. */
  @js.native
  sealed trait tooNoisy extends SpeechRecognitionAudioProblem
  
  /** Input volume too quiet. */
  @js.native
  sealed trait tooQuiet extends SpeechRecognitionAudioProblem
  
  /** User spoke too slowly. */
  @js.native
  sealed trait tooSlow extends SpeechRecognitionAudioProblem
  
  /* 2 */ val noSignal: typingsSlinky.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.noSignal with Double = js.native
  /* 0 */ val none: typingsSlinky.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.none with Double = js.native
  /* 5 */ val tooFast: typingsSlinky.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.tooFast with Double = js.native
  /* 3 */ val tooLoud: typingsSlinky.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.tooLoud with Double = js.native
  /* 1 */ val tooNoisy: typingsSlinky.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.tooNoisy with Double = js.native
  /* 4 */ val tooQuiet: typingsSlinky.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.tooQuiet with Double = js.native
  /* 6 */ val tooSlow: typingsSlinky.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.tooSlow with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpeechRecognitionAudioProblem with Double] = js.native
}

