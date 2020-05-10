package typingsSlinky.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used as a response for defineResourceHandler.
  */
@js.native
trait AddonCatalog extends js.Object {
  /**
    * Object representing the addon's Manifest Object.
    */
  var manifest: Manifest = js.native
  /**
    * only http is currently officially supported.
    */
  var transportName: String = js.native
  /**
    * The URL of the addon's manifest.json file.
    */
  var transportUrl: String = js.native
}

object AddonCatalog {
  @scala.inline
  def apply(manifest: Manifest, transportName: String, transportUrl: String): AddonCatalog = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any], transportName = transportName.asInstanceOf[js.Any], transportUrl = transportUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonCatalog]
  }
  @scala.inline
  implicit class AddonCatalogOps[Self <: AddonCatalog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManifest(value: Manifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransportName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransportUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

