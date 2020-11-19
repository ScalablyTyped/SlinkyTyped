package typingsSlinky.sharedb.agentMod

import typingsSlinky.sharedb.anon.DuplexisServerbooleanunde
import typingsSlinky.sharedb.sharedbMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  /**
    * Sends a JSON-compatible message to the client for this agent.
    *
    * @param message
    */
  def send(message: JSONObject): Unit = js.native
  
  var stream: DuplexisServerbooleanunde = js.native
}
object Agent {
  
  @scala.inline
  def apply(
    backend: typingsSlinky.sharedb.mod.^,
    custom: Custom,
    send: JSONObject => Unit,
    stream: DuplexisServerbooleanunde
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackend(value: typingsSlinky.sharedb.mod.^): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: Custom): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend(value: JSONObject => Unit): Self = this.set("send", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStream(value: DuplexisServerbooleanunde): Self = this.set("stream", value.asInstanceOf[js.Any])
  }
}
