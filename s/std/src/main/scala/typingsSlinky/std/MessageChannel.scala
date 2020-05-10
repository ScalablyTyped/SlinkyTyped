package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Channel Messaging API interface allows us to create a new message channel and send data through it via its two MessagePort properties. */
@js.native
trait MessageChannel extends js.Object {
  /**
    * Returns the first MessagePort object.
    */
  val port1: org.scalajs.dom.raw.MessagePort = js.native
  /**
    * Returns the second MessagePort object.
    */
  val port2: org.scalajs.dom.raw.MessagePort = js.native
}

@JSGlobal("MessageChannel")
@js.native
object MessageChannel
  extends Instantiable0[org.scalajs.dom.raw.MessageChannel]

