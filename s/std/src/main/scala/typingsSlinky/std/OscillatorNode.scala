package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The OscillatorNode interface represents a periodic waveform, such as a sine wave. It is an AudioScheduledSourceNode audio-processing module that causes a specified frequency of a given wave to be created—in effect, a constant tone. */
@js.native
trait OscillatorNode extends AudioScheduledSourceNode {
  
  val detune: org.scalajs.dom.raw.AudioParam = js.native
  
  val frequency: org.scalajs.dom.raw.AudioParam = js.native
  
  def setPeriodicWave(periodicWave: org.scalajs.dom.raw.PeriodicWave): Unit = js.native
  
  var `type`: OscillatorType = js.native
}
