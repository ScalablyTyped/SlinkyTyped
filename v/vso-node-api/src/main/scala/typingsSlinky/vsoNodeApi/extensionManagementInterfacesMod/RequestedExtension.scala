package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestedExtension extends js.Object {
  /**
    * The unique name of the extension
    */
  var extensionName: String = js.native
  /**
    * A list of each request for the extension
    */
  var extensionRequests: js.Array[ExtensionRequest] = js.native
  /**
    * DisplayName of the publisher that owns the extension being published.
    */
  var publisherDisplayName: String = js.native
  /**
    * Represents the Publisher of the requested extension
    */
  var publisherName: String = js.native
  /**
    * The total number of requests for an extension
    */
  var requestCount: Double = js.native
}

object RequestedExtension {
  @scala.inline
  def apply(
    extensionName: String,
    extensionRequests: js.Array[ExtensionRequest],
    publisherDisplayName: String,
    publisherName: String,
    requestCount: Double
  ): RequestedExtension = {
    val __obj = js.Dynamic.literal(extensionName = extensionName.asInstanceOf[js.Any], extensionRequests = extensionRequests.asInstanceOf[js.Any], publisherDisplayName = publisherDisplayName.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], requestCount = requestCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestedExtension]
  }
  @scala.inline
  implicit class RequestedExtensionOps[Self <: RequestedExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionRequests(value: js.Array[ExtensionRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

