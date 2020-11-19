package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A node able to provide real-time frequency and time-domain analysis information. It is an AudioNode that passes the audio stream unchanged from the input to the output, but allows you to take the generated data, process it, and create audio visualizations. */
@js.native
trait AnalyserNode extends AudioNode {
  
  var fftSize: Double = js.native
  
  val frequencyBinCount: Double = js.native
  
  def getByteFrequencyData(array: js.typedarray.Uint8Array): Unit = js.native
  
  def getByteTimeDomainData(array: js.typedarray.Uint8Array): Unit = js.native
  
  def getFloatFrequencyData(array: js.typedarray.Float32Array): Unit = js.native
  
  def getFloatTimeDomainData(array: js.typedarray.Float32Array): Unit = js.native
  
  var maxDecibels: Double = js.native
  
  var minDecibels: Double = js.native
  
  var smoothingTimeConstant: Double = js.native
}
