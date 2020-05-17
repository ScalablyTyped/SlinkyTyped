package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.experimental.RequestInit
import typingsSlinky.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Request")
@js.native
class Request protected ()
  extends typingsSlinky.std.Request {
  def this(input: RequestInfo) = this()
  def this(input: RequestInfo, init: RequestInit) = this()
}

@JSGlobal("Request")
@js.native
object Request
  extends Instantiable1[/* input */ RequestInfo, org.scalajs.dom.experimental.Request]
     with Instantiable2[
      /* input */ RequestInfo, 
      /* init */ RequestInit, 
      org.scalajs.dom.experimental.Request
    ]

