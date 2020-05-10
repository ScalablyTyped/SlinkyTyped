package typingsSlinky.stremioAddonSdk.mod

import typingsSlinky.stremioAddonSdk.AnonAdult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Manifest extends js.Object {
  /**
    * Array of Catalog objects, a list of other addon manifests.
    *
    * This can be used for an addon to act just as a catalog of other addons.
    */
  var addonCatalogs: js.UndefOr[js.Array[ManifestCatalog]] = js.native
  /**
    * Background image for the addon.
    *
    * URL to png/jpg, at least 1024x786 resolution.
    */
  var background: js.UndefOr[String] = js.native
  var behaviorHints: js.UndefOr[AnonAdult] = js.native
  /**
    * A list of the content catalogs your addon provides.
    *
    * Leave this an empty array ([]) if your addon does not provide the catalog resource.
    */
  var catalogs: js.Array[ManifestCatalog] = js.native
  /**
    * Contact email for addon issues.
    * Used for the Report button in the app.
    * Also, the Stremio team may reach you on this email for anything relating your addon.
    */
  var contactEmail: js.UndefOr[String] = js.native
  /**
    *  Human readable description
    */
  var description: String = js.native
  /**
    * Identifier, dot-separated, e.g. "com.stremio.filmon"
    */
  var id: String = js.native
  /**
    * Use this if you want your addon to be called only for specific content IDs.
    *
    * For example, if you set this to ["yt_id:", "tt"], your addon will only be called for id values that start with 'yt_id:' or 'tt'.
    */
  var idPrefixes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Logo icon, URL to png, monochrome, 256x256.
    */
  var logo: js.UndefOr[String] = js.native
  /**
    * Human readable name
    */
  var name: String = js.native
  /**
    * Supported resources, defined as an array of objects (long version) or strings (short version).
    *
    * Example #1: [{"name": "stream", "types": ["movie"], "idPrefixes": ["tt"]}]
    *
    * Example #2: ["catalog", "meta", "stream", "subtitles", "addon_catalog"]
    */
  var resources: js.Array[FullManifestResource | ShortManifestResource] = js.native
  /**
    * Supported types.
    */
  var types: js.Array[ContentType] = js.native
  /**
    * Semantic version of the addon
    */
  var version: String = js.native
}

object Manifest {
  @scala.inline
  def apply(
    catalogs: js.Array[ManifestCatalog],
    description: String,
    id: String,
    name: String,
    resources: js.Array[FullManifestResource | ShortManifestResource],
    types: js.Array[ContentType],
    version: String
  ): Manifest = {
    val __obj = js.Dynamic.literal(catalogs = catalogs.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
  @scala.inline
  implicit class ManifestOps[Self <: Manifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCatalogs(value: js.Array[ManifestCatalog]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withResources(value: js.Array[FullManifestResource | ShortManifestResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[ContentType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddonCatalogs(value: js.Array[ManifestCatalog]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addonCatalogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddonCatalogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addonCatalogs")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBehaviorHints(value: AnonAdult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviorHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehaviorHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviorHints")(js.undefined)
        ret
    }
    @scala.inline
    def withContactEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactEmail")(js.undefined)
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
    @scala.inline
    def withLogo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(js.undefined)
        ret
    }
  }
  
}

