package typingsSlinky.vsoNodeApi.locationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessMapping extends js.Object {
  var accessPoint: String = js.native
  var displayName: String = js.native
  var moniker: String = js.native
  /**
    * The service which owns this access mapping e.g. TFS, ELS, etc.
    */
  var serviceOwner: String = js.native
  /**
    * Part of the access mapping which applies context after the access point of the server.
    */
  var virtualDirectory: String = js.native
}

object AccessMapping {
  @scala.inline
  def apply(
    accessPoint: String,
    displayName: String,
    moniker: String,
    serviceOwner: String,
    virtualDirectory: String
  ): AccessMapping = {
    val __obj = js.Dynamic.literal(accessPoint = accessPoint.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], moniker = moniker.asInstanceOf[js.Any], serviceOwner = serviceOwner.asInstanceOf[js.Any], virtualDirectory = virtualDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessMapping]
  }
  @scala.inline
  implicit class AccessMappingOps[Self <: AccessMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessPoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoniker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moniker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualDirectory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

