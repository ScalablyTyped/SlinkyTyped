package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A node able to provide real-time frequency and time-domain analysis information. It is an AudioNode that passes the audio stream unchanged from the input to the output, but allows you to take the generated data, process it, and create audio visualizations. */
@js.native
trait AnalyserNode extends AudioNode {
  var fftSize: Double = js.native
  val frequencyBinCount: Double = js.native
  var maxDecibels: Double = js.native
  var minDecibels: Double = js.native
  var smoothingTimeConstant: Double = js.native
  def getByteFrequencyData(array: scala.scalajs.js.typedarray.Uint8Array): Unit = js.native
  def getByteTimeDomainData(array: scala.scalajs.js.typedarray.Uint8Array): Unit = js.native
  def getFloatFrequencyData(array: scala.scalajs.js.typedarray.Float32Array): Unit = js.native
  def getFloatTimeDomainData(array: scala.scalajs.js.typedarray.Float32Array): Unit = js.native
}

@JSGlobal("AnalyserNode")
@js.native
object AnalyserNode
  extends Instantiable1[/* context */ BaseAudioContext, AnalyserNode]
     with Instantiable2[/* context */ BaseAudioContext, /* options */ AnalyserOptions, AnalyserNode]

