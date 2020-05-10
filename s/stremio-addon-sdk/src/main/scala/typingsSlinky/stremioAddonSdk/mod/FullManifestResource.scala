package typingsSlinky.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullManifestResource extends js.Object {
  /**
    * Use this if you want your addon to be called only for specific content IDs
    *
    * For example, if you set this to ["yt_id:", "tt"], your addon will only be called for id values that start with 'yt_id:' or 'tt'.
    */
  var idPrefixes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Resource name.
    */
  var name: ShortManifestResource = js.native
  /**
    * Supported types.
    */
  var types: js.Array[ContentType] = js.native
}

object FullManifestResource {
  @scala.inline
  def apply(name: ShortManifestResource, types: js.Array[ContentType]): FullManifestResource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullManifestResource]
  }
  @scala.inline
  implicit class FullManifestResourceOps[Self <: FullManifestResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: ShortManifestResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[ContentType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdPrefixes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idPrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdPrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idPrefixes")(js.undefined)
        ret
    }
  }
  
}

