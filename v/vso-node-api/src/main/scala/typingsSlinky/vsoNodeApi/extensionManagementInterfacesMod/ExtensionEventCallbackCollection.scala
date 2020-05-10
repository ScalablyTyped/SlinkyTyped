package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionEventCallbackCollection extends js.Object {
  /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension disable has occurred.
    */
  var postDisable: ExtensionEventCallback = js.native
  /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension enable has occurred.
    */
  var postEnable: ExtensionEventCallback = js.native
  /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension install has completed.
    */
  var postInstall: ExtensionEventCallback = js.native
  /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension uninstall has occurred.
    */
  var postUninstall: ExtensionEventCallback = js.native
  /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension update has occurred.
    */
  var postUpdate: ExtensionEventCallback = js.native
  /**
    * Optional.  Defines an endpoint that gets called via a POST reqeust to notify that an extension install is about to occur.  Response indicates whether to proceed or abort.
    */
  var preInstall: ExtensionEventCallback = js.native
  /**
    * For multi-version extensions, defines an endpoint that gets called via an OPTIONS request to determine the particular version of the extension to be used
    */
  var versionCheck: ExtensionEventCallback = js.native
}

object ExtensionEventCallbackCollection {
  @scala.inline
  def apply(
    postDisable: ExtensionEventCallback,
    postEnable: ExtensionEventCallback,
    postInstall: ExtensionEventCallback,
    postUninstall: ExtensionEventCallback,
    postUpdate: ExtensionEventCallback,
    preInstall: ExtensionEventCallback,
    versionCheck: ExtensionEventCallback
  ): ExtensionEventCallbackCollection = {
    val __obj = js.Dynamic.literal(postDisable = postDisable.asInstanceOf[js.Any], postEnable = postEnable.asInstanceOf[js.Any], postInstall = postInstall.asInstanceOf[js.Any], postUninstall = postUninstall.asInstanceOf[js.Any], postUpdate = postUpdate.asInstanceOf[js.Any], preInstall = preInstall.asInstanceOf[js.Any], versionCheck = versionCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionEventCallbackCollection]
  }
  @scala.inline
  implicit class ExtensionEventCallbackCollectionOps[Self <: ExtensionEventCallbackCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostDisable(value: ExtensionEventCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postDisable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostEnable(value: ExtensionEventCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostInstall(value: ExtensionEventCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postInstall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostUninstall(value: ExtensionEventCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postUninstall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostUpdate(value: ExtensionEventCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreInstall(value: ExtensionEventCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preInstall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionCheck(value: ExtensionEventCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionCheck")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

