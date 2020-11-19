package typingsSlinky.shipitCli.mod

import typingsSlinky.node.childProcessMod.ExecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shipit-cli", "local")
@js.native
object local extends js.Object {
  
  def apply(command: String): js.Thenable[ShipitLocal] = js.native
  def apply(
    command: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
  ): js.Thenable[ShipitLocal] = js.native
  def apply(command: String, options: ExecOptions): js.Thenable[ShipitLocal] = js.native
  def apply(
    command: String,
    options: ExecOptions,
    callback: js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
  ): js.Thenable[ShipitLocal] = js.native
}
