package typingsSlinky.shipitCli.mod

import typingsSlinky.node.childProcessMod.ExecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shipit-cli", "remoteCopy")
@js.native
object remoteCopy extends js.Object {
  def apply(src: String, dest: String): js.Thenable[ShipitLocal] = js.native
  def apply(
    src: String,
    dest: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
  ): js.Thenable[ShipitLocal] = js.native
  def apply(src: String, dest: String, options: ExecOptions): js.Thenable[ShipitLocal] = js.native
  def apply(
    src: String,
    dest: String,
    options: ExecOptions,
    callback: js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
  ): js.Thenable[ShipitLocal] = js.native
}

