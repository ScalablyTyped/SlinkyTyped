package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAgentSession extends js.Object {
  /**
    * Gets or sets the agent which is the target of the session.
    */
  var agent: TaskAgentReference = js.native
  /**
    * Gets the key used to encrypt message traffic for this session.
    */
  var encryptionKey: TaskAgentSessionKey = js.native
  /**
    * Gets or sets the owner name of this session. Generally this will be the machine of origination.
    */
  var ownerName: String = js.native
  /**
    * Gets the unique identifier for this session.
    */
  var sessionId: String = js.native
  var systemCapabilities: StringDictionary[String] = js.native
}

object TaskAgentSession {
  @scala.inline
  def apply(
    agent: TaskAgentReference,
    encryptionKey: TaskAgentSessionKey,
    ownerName: String,
    sessionId: String,
    systemCapabilities: StringDictionary[String]
  ): TaskAgentSession = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], encryptionKey = encryptionKey.asInstanceOf[js.Any], ownerName = ownerName.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], systemCapabilities = systemCapabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentSession]
  }
  @scala.inline
  implicit class TaskAgentSessionOps[Self <: TaskAgentSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgent(value: TaskAgentReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionKey(value: TaskAgentSessionKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemCapabilities(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

