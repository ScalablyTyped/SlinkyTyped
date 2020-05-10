package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Fetch API interface represents the response to a request. */
@js.native
trait Response extends Body {
  val headers: org.scalajs.dom.experimental.Headers = js.native
  val ok: scala.Boolean = js.native
  val redirected: scala.Boolean = js.native
  val status: Double = js.native
  val statusText: java.lang.String = js.native
  val trailer: js.Promise[org.scalajs.dom.experimental.Headers] = js.native
  val `type`: org.scalajs.dom.experimental.ResponseType = js.native
  val url: java.lang.String = js.native
}

@JSGlobal("Response")
@js.native
object Response
  extends Instantiable0[org.scalajs.dom.experimental.Response]
     with Instantiable1[/* body */ BodyInit, org.scalajs.dom.experimental.Response]
     with Instantiable2[
      (/* body */ BodyInit) | (/* body */ Null), 
      /* init */ org.scalajs.dom.experimental.ResponseInit, 
      org.scalajs.dom.experimental.Response
    ] {
  def error(): org.scalajs.dom.experimental.Response = js.native
  def redirect(url: java.lang.String): org.scalajs.dom.experimental.Response = js.native
  def redirect(url: java.lang.String, status: Double): org.scalajs.dom.experimental.Response = js.native
}

