package typingsSlinky.socketIoRedis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Options to pass to the redis server when creating it
	 */
@js.native
trait SocketIORedisOptions extends js.Object {
  /**
    * The optional password to connect to redis on
    */
  var auth_pass: js.UndefOr[Double | String] = js.native
  /**
  		 * The optional host to connect to redis on
  		 * @default localhost
  		 */
  var host: js.UndefOr[String] = js.native
  /**
  		 * The optional name of the key to pub/sub events on as prefix
  		 * @default socket.io
  		 */
  var key: js.UndefOr[String] = js.native
  /**
  		 * The optional port to connect to redis on
  		 * @default 6379
  		 */
  var port: js.UndefOr[Double] = js.native
  /**
  		 * The optional redis client to publish events on
  		 */
  var pubClient: js.UndefOr[js.Any] = js.native
  /**
  		 * The optional redis client to subscribe to events on
  		 */
  var subClient: js.UndefOr[js.Any] = js.native
}

object SocketIORedisOptions {
  @scala.inline
  def apply(): SocketIORedisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketIORedisOptions]
  }
  @scala.inline
  implicit class SocketIORedisOptionsOps[Self <: SocketIORedisOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth_pass(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_pass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth_pass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_pass")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withPubClient(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubClient")(js.undefined)
        ret
    }
    @scala.inline
    def withSubClient(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subClient")(js.undefined)
        ret
    }
  }
  
}

