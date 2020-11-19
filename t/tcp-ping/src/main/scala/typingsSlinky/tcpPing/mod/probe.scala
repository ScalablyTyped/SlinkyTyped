package typingsSlinky.tcpPing.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tcp-ping", "probe")
@js.native
object probe extends js.Object {
  
  def apply(
    address: String,
    port: Double,
    callback: js.Function2[/* error */ js.Error, /* result */ Boolean, Unit]
  ): Unit = js.native
}
