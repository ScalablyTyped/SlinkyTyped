package typingsSlinky.sharedb.agentMod

import typingsSlinky.sharedb.anon.DuplexisServerboolean
import typingsSlinky.sharedb.sharedbMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `Agent` is the representation of a client's `Connection` state on the
  * server. If the `Connection` was created through `backend.connect` (i.e. the
  * client is running in the same Node process as the server), then the `Agent`
  * associated with a `Connection` can be accessed through `connection.agent`.
  *
  * The `Agent` will be made available in all middleware requests. The
  * `agent.custom` field is an object that can be used for storing arbitrary
  * information for use in middleware.
  *
  * @see https://github.com/share/sharedb#class-sharedbagent
  */
@js.native
trait Agent extends js.Object {
  var backend: typingsSlinky.sharedb.mod.^ = js.native
  /**
    * Object for custom use in middleware to store app-specific state for a
    * given client session. It is in memory only as long as the session is
    * active, and it is passed to each middleware call.
    */
  var custom: Custom = js.native
  var stream: DuplexisServerboolean = js.native
  /**
    * Sends a JSON-compatible message to the client for this agent.
    *
    * @param message
    */
  def send(message: JSONObject): Unit = js.native
}

object Agent {
  @scala.inline
  def apply(
    backend: typingsSlinky.sharedb.mod.^,
    custom: Custom,
    send: JSONObject => Unit,
    stream: DuplexisServerboolean
  ): Agent = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], send = js.Any.fromFunction1(send), stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Agent]
  }
  @scala.inline
  implicit class AgentOps[Self <: Agent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackend(value: typingsSlinky.sharedb.mod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom(value: Custom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSend(value: JSONObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStream(value: DuplexisServerboolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

