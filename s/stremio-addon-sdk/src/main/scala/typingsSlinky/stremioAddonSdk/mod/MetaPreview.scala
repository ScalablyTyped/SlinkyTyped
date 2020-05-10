package typingsSlinky.stremioAddonSdk.mod

import typingsSlinky.stremioAddonSdk.stremioAddonSdkStrings.landscape
import typingsSlinky.stremioAddonSdk.stremioAddonSdkStrings.regular
import typingsSlinky.stremioAddonSdk.stremioAddonSdkStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Summarized collection of meta items.
  *
  * Catalogs are displayed on the Stremio's Board, Discover and Search.
  */
@js.native
trait MetaPreview extends js.Object {
  /**
    * The background shown on the stremio detail page.
    *
    * Heavily encouraged if you want your content to look good.
    *
    * URL to PNG, max file size 500kb.
    */
  var background: js.UndefOr[String] = js.native
  /**
    * A few sentences describing your content.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Universal identifier.
    * You may use a prefix unique to your addon.
    *
    * Example: 'yt_id:UCrDkAvwZum-UTjHmzDI2iIw'
    */
  var id: String = js.native
  /**
    * The logo shown on the stremio detail page.
    *
    * Encouraged if you want your content to look good.
    *
    * URL to PNG.
    */
  var logo: js.UndefOr[String] = js.native
  /**
    * Name of the content.
    */
  var name: String = js.native
  /**
    * URL to PNG of poster.
    *
    * Accepted aspect ratios: 1:0.675 (IMDb poster type) or 1:1 (square).
    *
    * You can use any resolution, as long as the file size is below 100kb.
    * Below 50kb is recommended
    */
  var poster: js.UndefOr[String] = js.native
  /**
    * Poster can be square (1:1 aspect) or regular (1:0.675) or landscape (1:1.77).
    *
    * Defaults to 'regular'.
    */
  var posterShape: js.UndefOr[square | regular | landscape] = js.native
  /**
    * Type of the content.
    */
  var `type`: ContentType = js.native
}

object MetaPreview {
  @scala.inline
  def apply(id: String, name: String, `type`: ContentType): MetaPreview = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaPreview]
  }
  @scala.inline
  implicit class MetaPreviewOps[Self <: MetaPreview] (val x: Self) extends AnyVal {
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
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
    @scala.inline
    def withPoster(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster")(js.undefined)
        ret
    }
    @scala.inline
    def withPosterShape(value: square | regular | landscape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posterShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosterShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posterShape")(js.undefined)
        ret
    }
  }
  
}

