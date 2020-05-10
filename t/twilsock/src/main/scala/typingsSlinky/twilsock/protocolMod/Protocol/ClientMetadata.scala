package typingsSlinky.twilsock.protocolMod.Protocol

import typingsSlinky.twilsock.AnonName
import typingsSlinky.twilsock.AnonOs
import typingsSlinky.twilsock.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientMetadata extends js.Object {
  var application: AnonName = js.native
  var runtime: AnonOs = js.native
  var sdk: AnonType = js.native
}

object ClientMetadata {
  @scala.inline
  def apply(application: AnonName, runtime: AnonOs, sdk: AnonType): ClientMetadata = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], sdk = sdk.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientMetadata]
  }
  @scala.inline
  implicit class ClientMetadataOps[Self <: ClientMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: AnonName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuntime(value: AnonOs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSdk(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdk")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

