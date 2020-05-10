package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionIdentifier extends js.Object {
  /**
    * The ExtensionName component part of the fully qualified ExtensionIdentifier
    */
  var extensionName: String = js.native
  /**
    * The PublisherName component part of the fully qualified ExtensionIdentifier
    */
  var publisherName: String = js.native
}

object ExtensionIdentifier {
  @scala.inline
  def apply(extensionName: String, publisherName: String): ExtensionIdentifier = {
    val __obj = js.Dynamic.literal(extensionName = extensionName.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionIdentifier]
  }
  @scala.inline
  implicit class ExtensionIdentifierOps[Self <: ExtensionIdentifier] (val x: Self) extends AnyVal {
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
    def withPublisherName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

