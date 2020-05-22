package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.onEventsMod._Update
import typingsSlinky.vegaTypings.signalMod.SignalValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueSignalValue extends _Update {
  var value: SignalValue
}

object ValueSignalValue {
  @scala.inline
  def apply(value: SignalValue): ValueSignalValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSignalValue]
  }
}

