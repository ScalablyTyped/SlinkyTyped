package typingsSlinky.tcpPing.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tcp-ping", "probe")
@js.native
object probe extends js.Object {
  def apply(
    address: String,
    port: Double,
    callback: js.Function2[/* error */ js.Error, /* result */ Result, Unit]
  ): Unit = js.native
}

