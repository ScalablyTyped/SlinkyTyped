package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A delay-line; an AudioNode audio-processing module that causes a delay between the arrival of an input data and its propagation to the output. */
@js.native
trait DelayNode extends AudioNode {
  val delayTime: org.scalajs.dom.raw.AudioParam = js.native
}

@JSGlobal("DelayNode")
@js.native
object DelayNode
  extends Instantiable1[/* context */ BaseAudioContext, org.scalajs.dom.raw.DelayNode]
     with Instantiable2[
      /* context */ BaseAudioContext, 
      /* options */ DelayOptions, 
      org.scalajs.dom.raw.DelayNode
    ]

