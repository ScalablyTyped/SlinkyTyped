package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A simple low-order filter, and is created using the AudioContext.createBiquadFilter() method. It is an AudioNode that can represent different kinds of filters, tone control devices, and graphic equalizers. */
@js.native
trait BiquadFilterNode extends AudioNode {
  val Q: org.scalajs.dom.raw.AudioParam = js.native
  val detune: org.scalajs.dom.raw.AudioParam = js.native
  val frequency: org.scalajs.dom.raw.AudioParam = js.native
  val gain: org.scalajs.dom.raw.AudioParam = js.native
  var `type`: BiquadFilterType = js.native
  def getFrequencyResponse(
    frequencyHz: scala.scalajs.js.typedarray.Float32Array,
    magResponse: scala.scalajs.js.typedarray.Float32Array,
    phaseResponse: scala.scalajs.js.typedarray.Float32Array
  ): Unit = js.native
}

@JSGlobal("BiquadFilterNode")
@js.native
object BiquadFilterNode
  extends Instantiable1[/* context */ BaseAudioContext, BiquadFilterNode]
     with Instantiable2[/* context */ BaseAudioContext, /* options */ BiquadFilterOptions, BiquadFilterNode]

