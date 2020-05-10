package typingsSlinky.socketIo.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The client behind each socket (can have multiple sockets)
	 */
@js.native
trait Client extends js.Object {
  /**
  		 * The underlying Engine.io Socket instance
  		 */
  var conn: EngineSocket = js.native
  /**
  		 * The ID for this client. Regenerated at every connection
  		 */
  var id: String = js.native
  /**
  		 * A dictionary of all the namespaces for this client, with the Socket that
  		 * deals with that namespace
  		 */
  var nsps: StringDictionary[Socket] = js.native
  /**
  		 * The http.IncomingMessage request sent with the connection. Useful
  		 * for recovering headers etc
  		 */
  var request: js.Any = js.native
  /**
  		 * The Server that this client belongs to
  		 */
  var server: Server = js.native
  /**
  		 * The dictionary of sockets currently connect via this client (i.e. to different
  		 * namespaces) where the Socket ID is the key
  		 */
  var sockets: StringDictionary[Socket] = js.native
}

object Client {
  @scala.inline
  def apply(
    conn: EngineSocket,
    id: String,
    nsps: StringDictionary[Socket],
    request: js.Any,
    server: Server,
    sockets: StringDictionary[Socket]
  ): Client = {
    val __obj = js.Dynamic.literal(conn = conn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nsps = nsps.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], sockets = sockets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConn(value: EngineSocket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNsps(value: StringDictionary[Socket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServer(value: Server): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSockets(value: StringDictionary[Socket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sockets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

