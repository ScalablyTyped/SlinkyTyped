package typingsSlinky.socketIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handshake extends js.Object {
  /**
  		 * The remote address of the connection request
  		 */
  var address: String = js.native
  /**
  		 * The headers passed along with the request. e.g. 'host',
  		 * 'connection', 'accept', 'referer', 'cookie'
  		 */
  var headers: js.Any = js.native
  /**
  		 * The timestamp for when this was issued
  		 */
  var issued: Double = js.native
  /**
  		 * Any query string parameters in the request url
  		 */
  var query: js.Any = js.native
  /**
  		 * Is this a secure request?
  		 */
  var secure: Boolean = js.native
  /**
  		 * The current time, as a string
  		 */
  var time: String = js.native
  /**
  		 * The request url
  		 */
  var url: String = js.native
  /**
  		 * Is this a cross-domain request?
  		 */
  var xdomain: Boolean = js.native
}

object Handshake {
  @scala.inline
  def apply(
    address: String,
    headers: js.Any,
    issued: Double,
    query: js.Any,
    secure: Boolean,
    time: String,
    url: String,
    xdomain: Boolean
  ): Handshake = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], issued = issued.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xdomain = xdomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handshake]
  }
  @scala.inline
  implicit class HandshakeOps[Self <: Handshake] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssued(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXdomain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xdomain")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

