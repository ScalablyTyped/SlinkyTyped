package typingsSlinky.twilsock.protocolMod.Protocol

import typingsSlinky.twilsock.AnonName
import typingsSlinky.twilsock.AnonOs
import typingsSlinky.twilsock.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientMetadata extends js.Object {
  var application: AnonName
  var runtime: AnonOs
  var sdk: AnonType
}

object ClientMetadata {
  @scala.inline
  def apply(application: AnonName, runtime: AnonOs, sdk: AnonType): ClientMetadata = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], sdk = sdk.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientMetadata]
  }
}

