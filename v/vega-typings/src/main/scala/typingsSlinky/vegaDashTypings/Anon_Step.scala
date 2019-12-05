package typingsSlinky.vegaDashTypings

import typingsSlinky.vegaDashTypings.typesSpecScaleMod._RangeBand
import typingsSlinky.vegaDashTypings.typesSpecSignalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Step extends _RangeBand {
  var step: Double | SignalRef
}

object Anon_Step {
  @scala.inline
  def apply(step: Double | SignalRef): Anon_Step = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Step]
  }
}

