package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionPolicy extends js.Object {
  /**
    * Permissions on 'Install' operation
    */
  var install: ExtensionPolicyFlags = js.native
  /**
    * Permission on 'Request' operation
    */
  var request: ExtensionPolicyFlags = js.native
}

object ExtensionPolicy {
  @scala.inline
  def apply(install: ExtensionPolicyFlags, request: ExtensionPolicyFlags): ExtensionPolicy = {
    val __obj = js.Dynamic.literal(install = install.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionPolicy]
  }
  @scala.inline
  implicit class ExtensionPolicyOps[Self <: ExtensionPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstall(value: ExtensionPolicyFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("install")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: ExtensionPolicyFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

