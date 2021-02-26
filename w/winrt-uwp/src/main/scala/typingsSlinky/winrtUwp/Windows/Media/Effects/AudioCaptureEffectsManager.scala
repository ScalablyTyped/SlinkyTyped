package typingsSlinky.winrtUwp.Windows.Media.Effects

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.audiocaptureeffectschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represent an audio capture effects manager which can be used to discover the audio processing chain on a device for a specific media category and audio processing mode. */
@js.native
trait AudioCaptureEffectsManager extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audiocaptureeffectschanged(`type`: audiocaptureeffectschanged, listener: TypedEventHandler[AudioCaptureEffectsManager, _]): Unit = js.native
  
  /**
    * Gets the list of audio effects on the device.
    * @return The list of audio effects.
    */
  def getAudioCaptureEffects(): IVectorView[AudioEffect] = js.native
  
  /** Occurs when audio process chain changes. */
  def onaudiocaptureeffectschanged(ev: js.Any with WinRTEvent[AudioCaptureEffectsManager]): Unit = js.native
  /** Occurs when audio process chain changes. */
  @JSName("onaudiocaptureeffectschanged")
  var onaudiocaptureeffectschanged_Original: TypedEventHandler[AudioCaptureEffectsManager, _] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audiocaptureeffectschanged(`type`: audiocaptureeffectschanged, listener: TypedEventHandler[AudioCaptureEffectsManager, _]): Unit = js.native
}
