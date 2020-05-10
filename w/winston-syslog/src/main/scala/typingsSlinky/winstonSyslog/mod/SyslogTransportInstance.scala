package typingsSlinky.winstonSyslog.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.node.dgramMod.Socket
import typingsSlinky.winstonSyslog.winstonSyslogBooleans.`true`
import typingsSlinky.winstonTransport.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyslogTransportInstance
  extends ^
     with Instantiable0[SyslogTransportInstance]
     with Instantiable1[/* options */ SyslogTransportOptions, SyslogTransportInstance] {
  var producer: js.Any = js.native
  var socket: Socket | typingsSlinky.node.netMod.Socket = js.native
  @JSName("connect")
  def connect_true(callback: js.Function1[/* err */ `true` | Null, _]): Unit = js.native
}

