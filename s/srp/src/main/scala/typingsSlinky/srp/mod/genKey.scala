package typingsSlinky.srp.mod

import typingsSlinky.node.Buffer
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("srp", "genKey")
@js.native
object genKey extends js.Object {
  def apply(bytes: Double, callback: js.Function2[/* error */ js.Error, /* key */ Buffer, Unit]): Unit = js.native
  def apply(callback: js.Function2[/* error */ Error, /* key */ Buffer, Unit]): Unit = js.native
}

