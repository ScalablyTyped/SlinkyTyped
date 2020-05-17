package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vscode.mod.DebugAdapterExecutable
  - typingsSlinky.vscode.mod.DebugAdapterServer
  - typingsSlinky.vscode.mod.DebugAdapterInlineImplementation
*/
trait DebugAdapterDescriptor extends js.Object

object DebugAdapterDescriptor {
  @scala.inline
  implicit def apply(value: DebugAdapterExecutable): DebugAdapterDescriptor = value.asInstanceOf[DebugAdapterDescriptor]
  @scala.inline
  implicit def apply(value: DebugAdapterInlineImplementation): DebugAdapterDescriptor = value.asInstanceOf[DebugAdapterDescriptor]
  @scala.inline
  implicit def apply(value: DebugAdapterServer): DebugAdapterDescriptor = value.asInstanceOf[DebugAdapterDescriptor]
}

