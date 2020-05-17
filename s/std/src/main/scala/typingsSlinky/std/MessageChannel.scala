package typingsSlinky.std

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

object MessageChannel {
  @scala.inline
  def apply(port1: org.scalajs.dom.raw.MessagePort, port2: org.scalajs.dom.raw.MessagePort): MessageChannel = {
    val __obj = js.Dynamic.literal(port1 = port1.asInstanceOf[js.Any], port2 = port2.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageChannel]
  }
  @scala.inline
  implicit class MessageChannelOps[Self <: org.scalajs.dom.raw.MessageChannel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPort1(value: org.scalajs.dom.raw.MessagePort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort2(value: org.scalajs.dom.raw.MessagePort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

