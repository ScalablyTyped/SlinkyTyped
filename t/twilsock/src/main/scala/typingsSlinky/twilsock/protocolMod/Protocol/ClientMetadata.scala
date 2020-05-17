package typingsSlinky.twilsock.protocolMod.Protocol

import typingsSlinky.twilsock.anon.Name
import typingsSlinky.twilsock.anon.Os
import typingsSlinky.twilsock.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientMetadata extends js.Object {
  var application: Name = js.native
  var runtime: Os = js.native
  var sdk: Type = js.native
}

object ClientMetadata {
  @scala.inline
  def apply(application: Name, runtime: Os, sdk: Type): ClientMetadata = {
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
    def withApplication(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuntime(value: Os): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSdk(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdk")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

