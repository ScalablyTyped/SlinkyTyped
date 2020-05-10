package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportedIde extends js.Object {
  /**
    * The download URL for the IDE.
    */
  var downloadUrl: String = js.native
  /**
    * The type of the IDE.
    */
  var ideType: SupportedIdeType = js.native
  /**
    * The name of the IDE.
    */
  var name: String = js.native
  /**
    * The URL to open the protocol handler for the IDE.
    */
  var protocolHandlerUrl: String = js.native
  /**
    * A list of SupportedPlatforms.
    */
  var supportedPlatforms: js.Array[String] = js.native
}

object SupportedIde {
  @scala.inline
  def apply(
    downloadUrl: String,
    ideType: SupportedIdeType,
    name: String,
    protocolHandlerUrl: String,
    supportedPlatforms: js.Array[String]
  ): SupportedIde = {
    val __obj = js.Dynamic.literal(downloadUrl = downloadUrl.asInstanceOf[js.Any], ideType = ideType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protocolHandlerUrl = protocolHandlerUrl.asInstanceOf[js.Any], supportedPlatforms = supportedPlatforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedIde]
  }
  @scala.inline
  implicit class SupportedIdeOps[Self <: SupportedIde] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdeType(value: SupportedIdeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ideType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocolHandlerUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolHandlerUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedPlatforms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedPlatforms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

