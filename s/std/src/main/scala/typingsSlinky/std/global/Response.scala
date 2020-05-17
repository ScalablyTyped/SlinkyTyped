package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.experimental.ResponseInit
import typingsSlinky.std.BodyInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Response")
@js.native
class Response ()
  extends typingsSlinky.std.Response {
  def this(body: BodyInit) = this()
  def this(body: Null, init: ResponseInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
}

@JSGlobal("Response")
@js.native
object Response
  extends Instantiable0[org.scalajs.dom.experimental.Response]
     with Instantiable1[/* body */ BodyInit, org.scalajs.dom.experimental.Response]
     with Instantiable2[
      (/* body */ BodyInit) | (/* body */ Null), 
      /* init */ ResponseInit, 
      org.scalajs.dom.experimental.Response
    ] {
  def error(): org.scalajs.dom.experimental.Response = js.native
  def redirect(url: java.lang.String): org.scalajs.dom.experimental.Response = js.native
  def redirect(url: java.lang.String, status: Double): org.scalajs.dom.experimental.Response = js.native
}

