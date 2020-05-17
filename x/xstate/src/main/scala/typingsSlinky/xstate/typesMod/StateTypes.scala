package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xstate.xstateStrings.atomic
  - typingsSlinky.xstate.xstateStrings.compound
  - typingsSlinky.xstate.xstateStrings.parallel
  - typingsSlinky.xstate.xstateStrings.`final`
  - typingsSlinky.xstate.xstateStrings.history
  - java.lang.String
*/
trait StateTypes extends js.Object

object StateTypes {
  @scala.inline
  def atomic: typingsSlinky.xstate.xstateStrings.atomic = "atomic".asInstanceOf[typingsSlinky.xstate.xstateStrings.atomic]
  @scala.inline
  def compound: typingsSlinky.xstate.xstateStrings.compound = "compound".asInstanceOf[typingsSlinky.xstate.xstateStrings.compound]
  @scala.inline
  def parallel: typingsSlinky.xstate.xstateStrings.parallel = "parallel".asInstanceOf[typingsSlinky.xstate.xstateStrings.parallel]
  @scala.inline
  def `final`: typingsSlinky.xstate.xstateStrings.`final` = "final".asInstanceOf[typingsSlinky.xstate.xstateStrings.`final`]
  @scala.inline
  def history: typingsSlinky.xstate.xstateStrings.history = "history".asInstanceOf[typingsSlinky.xstate.xstateStrings.history]
  @scala.inline
  implicit def apply(value: String): StateTypes = value.asInstanceOf[StateTypes]
}

