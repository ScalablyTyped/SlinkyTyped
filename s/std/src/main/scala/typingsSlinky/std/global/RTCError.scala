package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.RTCErrorInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCError")
@js.native
class RTCError protected ()
  extends typingsSlinky.std.RTCError {
  def this(init: RTCErrorInit) = this()
  def this(init: RTCErrorInit, message: java.lang.String) = this()
}

@JSGlobal("RTCError")
@js.native
object RTCError
  extends Instantiable1[/* init */ RTCErrorInit, typingsSlinky.std.RTCError]
     with Instantiable2[/* init */ RTCErrorInit, /* message */ java.lang.String, typingsSlinky.std.RTCError]

