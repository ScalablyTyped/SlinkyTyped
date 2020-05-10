package typingsSlinky.tabris.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "WebSocket")
@js.native
class WebSocket protected ()
  extends typingsSlinky.tabris.WebSocket {
  def this(url: String) = this()
  def this(url: String, protocols: String) = this()
  def this(url: String, protocols: js.Array[String]) = this()
}

@JSImport("tabris", "WebSocket")
@js.native
object WebSocket
  extends Instantiable1[/* url */ String, typingsSlinky.tabris.WebSocket]
     with Instantiable2[
      /* url */ String, 
      (/* protocols */ js.Array[String]) | (/* protocols */ String), 
      typingsSlinky.tabris.WebSocket
    ] {
  val CLOSED: Double = js.native
  val CLOSING: Double = js.native
  val CONNECTING: Double = js.native
  val OPEN: Double = js.native
}

