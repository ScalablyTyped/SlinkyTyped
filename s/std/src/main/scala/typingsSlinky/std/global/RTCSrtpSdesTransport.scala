package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.std.RTCSrtpSdesParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCSrtpSdesTransport")
@js.native
class RTCSrtpSdesTransport protected ()
  extends typingsSlinky.std.RTCSrtpSdesTransport {
  def this(
    transport: typingsSlinky.std.RTCIceTransport,
    encryptParameters: RTCSrtpSdesParameters,
    decryptParameters: RTCSrtpSdesParameters
  ) = this()
}

@JSGlobal("RTCSrtpSdesTransport")
@js.native
object RTCSrtpSdesTransport
  extends Instantiable3[
      /* transport */ typingsSlinky.std.RTCIceTransport, 
      /* encryptParameters */ RTCSrtpSdesParameters, 
      /* decryptParameters */ RTCSrtpSdesParameters, 
      typingsSlinky.std.RTCSrtpSdesTransport
    ] {
  def getLocalParameters(): js.Array[RTCSrtpSdesParameters] = js.native
}

