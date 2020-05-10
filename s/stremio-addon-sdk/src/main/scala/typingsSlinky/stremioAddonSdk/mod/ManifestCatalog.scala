package typingsSlinky.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManifestCatalog extends js.Object {
  /**
    * All extra properties related to this catalog.
    */
  var extra: js.UndefOr[js.Array[ManifestExtra]] = js.native
  /**
    * Use the 'options' property of 'extra' instead.
    * @deprecated
    */
  var genres: js.UndefOr[js.Array[String]] = js.native
  /**
    * The id of the catalog, can be any unique string describing the catalog (unique per addon, as an addon can have many catalogs).
    *
    * For example: if the catalog name is "Favourite Youtube Videos", the id can be "fav_youtube_videos".
    */
  var id: String = js.native
  /**
    * Human readable name of the catalog.
    */
  var name: String = js.native
  /**
    *  This is the content type of the catalog.
    */
  var `type`: ContentType = js.native
}

object ManifestCatalog {
  @scala.inline
  def apply(id: String, name: String, `type`: ContentType): ManifestCatalog = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestCatalog]
  }
  @scala.inline
  implicit class ManifestCatalogOps[Self <: ManifestCatalog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtra(value: js.Array[ManifestExtra]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(js.undefined)
        ret
    }
    @scala.inline
    def withGenres(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genres")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenres: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genres")(js.undefined)
        ret
    }
  }
  
}

