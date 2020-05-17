package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A delay-line; an AudioNode audio-processing module that causes a delay between the arrival of an input data and its propagation to the output. */
@js.native
trait DelayNode extends AudioNode {
  val delayTime: org.scalajs.dom.raw.AudioParam = js.native
}

