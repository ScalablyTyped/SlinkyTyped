package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportedExtension extends js.Object {
  /**
    * Unique Identifier for this extension
    */
  var extension: String = js.native
  /**
    * Unique Identifier for this publisher
    */
  var publisher: String = js.native
  /**
    * Supported version for this extension
    */
  var version: String = js.native
}

object SupportedExtension {
  @scala.inline
  def apply(extension: String, publisher: String, version: String): SupportedExtension = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedExtension]
  }
  @scala.inline
  implicit class SupportedExtensionOps[Self <: SupportedExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

