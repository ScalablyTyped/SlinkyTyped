package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import typingsSlinky.vsoNodeApi.galleryInterfacesMod.PublishedExtension
import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionEvent extends js.Object {
  /**
    * The extension which has been updated
    */
  var extension: PublishedExtension = js.native
  /**
    * The current version of the extension that was updated
    */
  var extensionVersion: String = js.native
  /**
    * Name of the collection for which the extension was requested
    */
  var host: ExtensionHost = js.native
  /**
    * Gallery host url
    */
  var links: ExtensionEventUrls = js.native
  /**
    * Represents the user who initiated the update
    */
  var modifiedBy: IdentityRef = js.native
  /**
    * The type of update that was made
    */
  var updateType: ExtensionUpdateType = js.native
}

object ExtensionEvent {
  @scala.inline
  def apply(
    extension: PublishedExtension,
    extensionVersion: String,
    host: ExtensionHost,
    links: ExtensionEventUrls,
    modifiedBy: IdentityRef,
    updateType: ExtensionUpdateType
  ): ExtensionEvent = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], extensionVersion = extensionVersion.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], updateType = updateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionEvent]
  }
  @scala.inline
  implicit class ExtensionEventOps[Self <: ExtensionEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtension(value: PublishedExtension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: ExtensionHost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinks(value: ExtensionEventUrls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateType(value: ExtensionUpdateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

