package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Inherits properties from its parent, AudioNode. */
@js.native
trait DynamicsCompressorNode extends AudioNode {
  val attack: org.scalajs.dom.raw.AudioParam = js.native
  val knee: org.scalajs.dom.raw.AudioParam = js.native
  val ratio: org.scalajs.dom.raw.AudioParam = js.native
  val reduction: Double = js.native
  val release: org.scalajs.dom.raw.AudioParam = js.native
  val threshold: org.scalajs.dom.raw.AudioParam = js.native
}

@JSGlobal("DynamicsCompressorNode")
@js.native
object DynamicsCompressorNode
  extends Instantiable1[/* context */ BaseAudioContext, org.scalajs.dom.raw.DynamicsCompressorNode]
     with Instantiable2[
      /* context */ BaseAudioContext, 
      /* options */ DynamicsCompressorOptions, 
      org.scalajs.dom.raw.DynamicsCompressorNode
    ]

