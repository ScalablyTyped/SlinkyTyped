package typingsSlinky.stompit.libConnectMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit/lib/connect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(optionsOrPath: String): typingsSlinky.stompit.libClientMod.^ = js.native
  def apply(
    optionsOrPath: String,
    connectionListener: js.Function2[/* err */ Error | Null, /* client */ typingsSlinky.stompit.libClientMod.^, Unit]
  ): typingsSlinky.stompit.libClientMod.^ = js.native
  def apply(optionsOrPath: ConnectOptions): typingsSlinky.stompit.libClientMod.^ = js.native
  def apply(
    optionsOrPath: ConnectOptions,
    connectionListener: js.Function2[/* err */ Error | Null, /* client */ typingsSlinky.stompit.libClientMod.^, Unit]
  ): typingsSlinky.stompit.libClientMod.^ = js.native
  def apply(port: Double): typingsSlinky.stompit.libClientMod.^ = js.native
  def apply(port: Double, host: String): typingsSlinky.stompit.libClientMod.^ = js.native
  def apply(
    port: Double,
    host: String,
    connectionListener: js.Function2[/* err */ js.Error | Null, /* client */ typingsSlinky.stompit.libClientMod.^, Unit]
  ): typingsSlinky.stompit.libClientMod.^ = js.native
}

