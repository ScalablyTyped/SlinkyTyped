package typingsSlinky.stompit.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit/lib/connect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(optionsOrPath: String): typingsSlinky.stompit.clientMod.^ = js.native
  def apply(
    optionsOrPath: String,
    connectionListener: js.Function2[/* err */ js.Error | Null, /* client */ typingsSlinky.stompit.clientMod.^, Unit]
  ): typingsSlinky.stompit.clientMod.^ = js.native
  def apply(optionsOrPath: ConnectOptions): typingsSlinky.stompit.clientMod.^ = js.native
  def apply(
    optionsOrPath: ConnectOptions,
    connectionListener: js.Function2[/* err */ js.Error | Null, /* client */ typingsSlinky.stompit.clientMod.^, Unit]
  ): typingsSlinky.stompit.clientMod.^ = js.native
  def apply(port: Double): typingsSlinky.stompit.clientMod.^ = js.native
  def apply(port: Double, host: String): typingsSlinky.stompit.clientMod.^ = js.native
  def apply(
    port: Double,
    host: String,
    connectionListener: js.Function2[/* err */ js.Error | Null, /* client */ typingsSlinky.stompit.clientMod.^, Unit]
  ): typingsSlinky.stompit.clientMod.^ = js.native
}

