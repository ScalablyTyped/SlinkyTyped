package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCError extends DOMException {
  val errorDetail: RTCErrorDetailType = js.native
  val httpRequestStatusCode: Double | Null = js.native
  val receivedAlert: Double | Null = js.native
  val sctpCauseCode: Double | Null = js.native
  val sdpLineNumber: Double | Null = js.native
  val sentAlert: Double | Null = js.native
}

@JSGlobal("RTCError")
@js.native
object RTCError
  extends Instantiable1[/* init */ RTCErrorInit, RTCError]
     with Instantiable2[/* init */ RTCErrorInit, /* message */ java.lang.String, RTCError]

