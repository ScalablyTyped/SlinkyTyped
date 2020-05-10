package typingsSlinky.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractHandshake extends js.Object {
  var authType: String = js.native
  var authVersion: String = js.native
  var deploymentId: String = js.native
  var sandboxId: String = js.native
  def getHandshakeFields(client: Client): HandshakeFields = js.native
}

object AbstractHandshake {
  @scala.inline
  def apply(
    authType: String,
    authVersion: String,
    deploymentId: String,
    getHandshakeFields: Client => HandshakeFields,
    sandboxId: String
  ): AbstractHandshake = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any], authVersion = authVersion.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], getHandshakeFields = js.Any.fromFunction1(getHandshakeFields), sandboxId = sandboxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractHandshake]
  }
  @scala.inline
  implicit class AbstractHandshakeOps[Self <: AbstractHandshake] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeploymentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetHandshakeFields(value: Client => HandshakeFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHandshakeFields")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSandboxId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandboxId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

