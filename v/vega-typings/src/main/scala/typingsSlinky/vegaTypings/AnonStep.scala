package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.scaleMod._RangeBand
import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStep extends _RangeBand {
  var step: Double | SignalRef
}

object AnonStep {
  @scala.inline
  def apply(step: Double | SignalRef): AnonStep = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStep]
  }
}

