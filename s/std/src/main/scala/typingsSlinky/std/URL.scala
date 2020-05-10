package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The URL interface represents an object providing static methods used for creating object URLs. */
@js.native
trait URL extends js.Object {
  var hash: java.lang.String = js.native
  var host: java.lang.String = js.native
  var hostname: java.lang.String = js.native
  var href: java.lang.String = js.native
  val origin: java.lang.String = js.native
  var password: java.lang.String = js.native
  var pathname: java.lang.String = js.native
  var port: java.lang.String = js.native
  var protocol: java.lang.String = js.native
  var search: java.lang.String = js.native
  val searchParams: URLSearchParams = js.native
  var username: java.lang.String = js.native
  def toJSON(): java.lang.String = js.native
}

@JSGlobal("URL")
@js.native
object URL
  extends Instantiable1[/* url */ java.lang.String, org.scalajs.dom.experimental.URL]
     with Instantiable2[
      /* url */ java.lang.String, 
      (/* base */ java.lang.String) | (/* base */ org.scalajs.dom.experimental.URL), 
      org.scalajs.dom.experimental.URL
    ] {
  def createObjectURL(`object`: js.Any): java.lang.String = js.native
  def revokeObjectURL(url: java.lang.String): Unit = js.native
}

