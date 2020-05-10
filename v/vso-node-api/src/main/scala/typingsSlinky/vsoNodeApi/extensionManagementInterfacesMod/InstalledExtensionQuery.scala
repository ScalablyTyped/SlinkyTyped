package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstalledExtensionQuery extends js.Object {
  var assetTypes: js.Array[String] = js.native
  var monikers: js.Array[ExtensionIdentifier] = js.native
}

object InstalledExtensionQuery {
  @scala.inline
  def apply(assetTypes: js.Array[String], monikers: js.Array[ExtensionIdentifier]): InstalledExtensionQuery = {
    val __obj = js.Dynamic.literal(assetTypes = assetTypes.asInstanceOf[js.Any], monikers = monikers.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledExtensionQuery]
  }
  @scala.inline
  implicit class InstalledExtensionQueryOps[Self <: InstalledExtensionQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonikers(value: js.Array[ExtensionIdentifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monikers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

