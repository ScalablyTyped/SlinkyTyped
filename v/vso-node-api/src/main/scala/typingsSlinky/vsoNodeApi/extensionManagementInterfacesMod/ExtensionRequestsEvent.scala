package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import typingsSlinky.vsoNodeApi.galleryInterfacesMod.PublishedExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionRequestsEvent extends js.Object {
  /**
    * The extension which has been requested
    */
  var extension: PublishedExtension = js.native
  /**
    * Information about the host for which this extension is requested
    */
  var host: ExtensionHost = js.native
  /**
    * Gallery host url
    */
  var links: ExtensionRequestUrls = js.native
  /**
    * The extension request object
    */
  var requests: js.Array[ExtensionRequest] = js.native
  /**
    * The type of update that was made
    */
  var updateType: ExtensionRequestUpdateType = js.native
}

object ExtensionRequestsEvent {
  @scala.inline
  def apply(
    extension: PublishedExtension,
    host: ExtensionHost,
    links: ExtensionRequestUrls,
    requests: js.Array[ExtensionRequest],
    updateType: ExtensionRequestUpdateType
  ): ExtensionRequestsEvent = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], updateType = updateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionRequestsEvent]
  }
  @scala.inline
  implicit class ExtensionRequestsEventOps[Self <: ExtensionRequestsEvent] (val x: Self) extends AnyVal {
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
    def withHost(value: ExtensionHost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinks(value: ExtensionRequestUrls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequests(value: js.Array[ExtensionRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateType(value: ExtensionRequestUpdateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

