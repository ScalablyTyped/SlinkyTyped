package typingsSlinky.stremioAddonSdk

import typingsSlinky.stremioAddonSdk.mod.ContentType
import typingsSlinky.stremioAddonSdk.mod.ShortManifestResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  resource  :stremio-addon-sdk.stremio-addon-sdk.ShortManifestResource} & stremio-addon-sdk.stremio-addon-sdk.Args */
@js.native
trait resourceShortManifestReso extends js.Object {
  var extra: AnonGenre = js.native
  var id: String = js.native
  var resource: ShortManifestResource = js.native
  var `type`: ContentType = js.native
}

object resourceShortManifestReso {
  @scala.inline
  def apply(extra: AnonGenre, id: String, resource: ShortManifestResource, `type`: ContentType): resourceShortManifestReso = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[resourceShortManifestReso]
  }
  @scala.inline
  implicit class resourceShortManifestResoOps[Self <: resourceShortManifestReso] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtra(value: AnonGenre): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: ShortManifestResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

