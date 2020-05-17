package typingsSlinky.stremioAddonSdk.mod

import typingsSlinky.stremioAddonSdk.anon.DefaultVideo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detailed description of a meta item.
  *
  * This description is displayed when the user selects an item form the catalog.
  */
@js.native
trait MetaDetail extends MetaPreview {
  /**
    * Human-readable that describes all the significant awards.
    */
  var awards: js.UndefOr[String] = js.native
  var behaviourHints: js.UndefOr[DefaultVideo] = js.native
  /**
    * Array of members of the cast.
    *
    * use 'links' instead
    *
    * @deprecated
    */
  var cast: js.UndefOr[js.Array[String]] = js.native
  /**
    * Official country of origin.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * Array of directors.
    *
    * Deprecated: use 'links' instead
    *
    * @deprecated
    */
  var director: js.UndefOr[js.Array[String]] = js.native
  /**
    * genre/categories of the content.
    *
    * e.g. ["Thriller", "Horror"]
    *
    * **WARNING: this will soon be deprecated, use 'links' instead**
    */
  var genres: js.UndefOr[js.Array[String]] = js.native
  /**
    * IMDb rating, which should be a number from 0.0 to 10.0.
    */
  var imdbRating: js.UndefOr[String] = js.native
  /**
    * Spoken language.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Can be used to link to internal pages of Stremio.
    *
    * example: array of actor / genre / director links.
    */
  var links: js.UndefOr[js.Array[MetaLink]] = js.native
  var releaseInfo: js.UndefOr[String] = js.native
  /**
    * ISO 8601, initial release date.
    *
    * For movies, this is the cinema debut.
    *
    * e.g. "2010-12-06T05:00:00.000Z"
    */
  var released: js.UndefOr[String] = js.native
  /**
    * Human-readable expected runtime.
    *
    * e.g. "120m"
    */
  var runtime: js.UndefOr[String] = js.native
  /**
    * Used for channel and series.
    *
    * If you do not provide this (e.g. for movie), Stremio assumes this meta item has one video, and it's ID is equal to the meta item id.
    */
  var videos: js.UndefOr[js.Array[MetaVideo]] = js.native
  /**
    * URL to official website.
    */
  var website: js.UndefOr[String] = js.native
}

object MetaDetail {
  @scala.inline
  def apply(id: String, name: String, `type`: ContentType): MetaDetail = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaDetail]
  }
  @scala.inline
  implicit class MetaDetailOps[Self <: MetaDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwards(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awards")(js.undefined)
        ret
    }
    @scala.inline
    def withBehaviourHints(value: DefaultVideo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviourHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehaviourHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviourHints")(js.undefined)
        ret
    }
    @scala.inline
    def withCast(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withDirector(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("director")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("director")(js.undefined)
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
    @scala.inline
    def withImdbRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imdbRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImdbRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imdbRating")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: js.Array[MetaLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withReleased(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("released")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleased: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("released")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(js.undefined)
        ret
    }
    @scala.inline
    def withVideos(value: js.Array[MetaVideo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videos")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website")(js.undefined)
        ret
    }
  }
  
}

