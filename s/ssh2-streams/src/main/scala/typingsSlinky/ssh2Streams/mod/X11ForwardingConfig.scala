package typingsSlinky.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait X11ForwardingConfig extends js.Object {
  /**
    * The X11 authentication cookie encoded in hexadecimal.
    */
  var cookie: String = js.native
  /**
    * The name of the X11 authentication method used (e.g. MIT-MAGIC-COOKIE-1).
    */
  var protocol: String = js.native
  /**
    * The screen number to forward X11 connections for.
    */
  var screen: Double = js.native
  /**
    * true if only a single connection should be forwarded.
    */
  var single: Boolean = js.native
}

object X11ForwardingConfig {
  @scala.inline
  def apply(cookie: String, protocol: String, screen: Double, single: Boolean): X11ForwardingConfig = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any])
    __obj.asInstanceOf[X11ForwardingConfig]
  }
  @scala.inline
  implicit class X11ForwardingConfigOps[Self <: X11ForwardingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookie(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

