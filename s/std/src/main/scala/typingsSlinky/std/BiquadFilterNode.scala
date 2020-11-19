package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A simple low-order filter, and is created using the AudioContext.createBiquadFilter() method. It is an AudioNode that can represent different kinds of filters, tone control devices, and graphic equalizers. */
@js.native
trait BiquadFilterNode extends AudioNode {
  
  val Q: org.scalajs.dom.raw.AudioParam = js.native
  
  val detune: org.scalajs.dom.raw.AudioParam = js.native
  
  val frequency: org.scalajs.dom.raw.AudioParam = js.native
  
  val gain: org.scalajs.dom.raw.AudioParam = js.native
  
  def getFrequencyResponse(
    frequencyHz: js.typedarray.Float32Array,
    magResponse: js.typedarray.Float32Array,
    phaseResponse: js.typedarray.Float32Array
  ): Unit = js.native
  
  var `type`: BiquadFilterType = js.native
}
