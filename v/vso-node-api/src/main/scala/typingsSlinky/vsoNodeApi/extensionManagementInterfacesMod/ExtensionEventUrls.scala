package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionEventUrls extends ExtensionUrls {
  /**
    * Url of the extension management page
    */
  var manageExtensionsPage: String = js.native
}

object ExtensionEventUrls {
  @scala.inline
  def apply(extensionIcon: String, extensionPage: String, manageExtensionsPage: String): ExtensionEventUrls = {
    val __obj = js.Dynamic.literal(extensionIcon = extensionIcon.asInstanceOf[js.Any], extensionPage = extensionPage.asInstanceOf[js.Any], manageExtensionsPage = manageExtensionsPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionEventUrls]
  }
  @scala.inline
  implicit class ExtensionEventUrlsOps[Self <: ExtensionEventUrls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManageExtensionsPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manageExtensionsPage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

