package typingsSlinky.winrtUwp.Windows.Media.SpeechSynthesis

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the functionality of an installed speech synthesis engine (voice). */
@js.native
trait SpeechSynthesizer extends js.Object {
  /** Gets or sets the speech synthesis engine (voice). */
  var voice: VoiceInformation = js.native
  /** Closes the SpeechSynthesizer and releases system resources. */
  def close(): Unit = js.native
  /**
    * Asynchronously generate speech output from a string containing Speech Synthesis Markup Language (SSML).
    * @param Ssml The SSML-modified text to speak.
    * @return A SpeechSynthesisStream that represents the speech generated from the Speech Synthesis Markup Language (SSML).
    */
  def synthesizeSsmlToStreamAsync(Ssml: String): IPromiseWithIAsyncOperation[SpeechSynthesisStream] = js.native
  /**
    * Asynchronously generate speech output from a string.
    * @param text The text to speak.
    * @return A SpeechSynthesisStream that represents the speech generated from the text.
    */
  def synthesizeTextToStreamAsync(text: String): IPromiseWithIAsyncOperation[SpeechSynthesisStream] = js.native
}

object SpeechSynthesizer {
  @scala.inline
  def apply(
    close: () => Unit,
    synthesizeSsmlToStreamAsync: String => IPromiseWithIAsyncOperation[SpeechSynthesisStream],
    synthesizeTextToStreamAsync: String => IPromiseWithIAsyncOperation[SpeechSynthesisStream],
    voice: VoiceInformation
  ): SpeechSynthesizer = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), synthesizeSsmlToStreamAsync = js.Any.fromFunction1(synthesizeSsmlToStreamAsync), synthesizeTextToStreamAsync = js.Any.fromFunction1(synthesizeTextToStreamAsync), voice = voice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesizer]
  }
  @scala.inline
  implicit class SpeechSynthesizerOps[Self <: SpeechSynthesizer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSynthesizeSsmlToStreamAsync(value: String => IPromiseWithIAsyncOperation[SpeechSynthesisStream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synthesizeSsmlToStreamAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSynthesizeTextToStreamAsync(value: String => IPromiseWithIAsyncOperation[SpeechSynthesisStream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synthesizeTextToStreamAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVoice(value: VoiceInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voice")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

