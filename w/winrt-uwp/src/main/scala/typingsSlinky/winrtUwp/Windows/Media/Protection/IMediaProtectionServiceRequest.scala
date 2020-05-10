package typingsSlinky.winrtUwp.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows a content enabler object to be exposed directly to an application rather than through a wrapper supplied by the ContentEnabler object. */
@js.native
trait IMediaProtectionServiceRequest extends js.Object {
  /** Allows the application to identify the content protection system being used and therefore how to interpret the protection task. */
  var protectionSystem: String = js.native
  /** Retrieves the GUID for the type of operation that the IMediaProtectionServiceRequest performs. */
  var `type`: String = js.native
}

object IMediaProtectionServiceRequest {
  @scala.inline
  def apply(protectionSystem: String, `type`: String): IMediaProtectionServiceRequest = {
    val __obj = js.Dynamic.literal(protectionSystem = protectionSystem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaProtectionServiceRequest]
  }
  @scala.inline
  implicit class IMediaProtectionServiceRequestOps[Self <: IMediaProtectionServiceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProtectionSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectionSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

