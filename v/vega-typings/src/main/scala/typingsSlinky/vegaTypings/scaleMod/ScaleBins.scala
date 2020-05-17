package typingsSlinky.vegaTypings.scaleMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[scala.Double | typingsSlinky.vegaTypings.signalMod.SignalRef]
  - typingsSlinky.vegaTypings.signalMod.SignalRef
  - typingsSlinky.vegaTypings.scaleMod.ScaleBinParams
*/
trait ScaleBins extends js.Object

object ScaleBins {
  @scala.inline
  implicit def apply(value: js.Array[Double | SignalRef]): ScaleBins = value.asInstanceOf[ScaleBins]
  @scala.inline
  implicit def apply(value: ScaleBinParams): ScaleBins = value.asInstanceOf[ScaleBins]
  @scala.inline
  implicit def apply(value: SignalRef): ScaleBins = value.asInstanceOf[ScaleBins]
}

