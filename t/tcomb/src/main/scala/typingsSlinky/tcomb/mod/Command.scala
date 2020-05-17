package typingsSlinky.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tcomb.mod.ApplyCommand
  - typingsSlinky.tcomb.mod.PushCommand
  - typingsSlinky.tcomb.mod.RemoveCommand
  - typingsSlinky.tcomb.mod.SetCommand
  - typingsSlinky.tcomb.mod.SpliceCommand
  - typingsSlinky.tcomb.mod.SwapCommand
  - typingsSlinky.tcomb.mod.UnshiftCommand
  - typingsSlinky.tcomb.mod.MergeCommand
*/
trait Command extends UpdatePatch

object Command {
  @scala.inline
  implicit def apply(value: ApplyCommand): Command = value.asInstanceOf[Command]
  @scala.inline
  implicit def apply(value: MergeCommand): Command = value.asInstanceOf[Command]
  @scala.inline
  implicit def apply(value: PushCommand): Command = value.asInstanceOf[Command]
  @scala.inline
  implicit def apply(value: RemoveCommand): Command = value.asInstanceOf[Command]
  @scala.inline
  implicit def apply(value: SetCommand): Command = value.asInstanceOf[Command]
  @scala.inline
  implicit def apply(value: SpliceCommand): Command = value.asInstanceOf[Command]
  @scala.inline
  implicit def apply(value: SwapCommand): Command = value.asInstanceOf[Command]
  @scala.inline
  implicit def apply(value: UnshiftCommand): Command = value.asInstanceOf[Command]
}

