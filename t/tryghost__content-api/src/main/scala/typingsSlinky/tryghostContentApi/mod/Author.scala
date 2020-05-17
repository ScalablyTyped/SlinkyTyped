package typingsSlinky.tryghostContentApi.mod

import typingsSlinky.tryghostContentApi.anon.Posts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Author
  extends Identification
     with Metadata
     with GhostData {
  var bio: js.UndefOr[Nullable[String]] = js.native
  var count: js.UndefOr[Posts] = js.native
  var cover_image: js.UndefOr[Nullable[String]] = js.native
  var facebook: js.UndefOr[Nullable[String]] = js.native
  var location: js.UndefOr[Nullable[String]] = js.native
  var name: js.UndefOr[String] = js.native
  var profile_image: js.UndefOr[Nullable[String]] = js.native
  var twitter: js.UndefOr[Nullable[String]] = js.native
  var url: js.UndefOr[Nullable[String]] = js.native
  var website: js.UndefOr[Nullable[String]] = js.native
}

object Author {
  @scala.inline
  def apply(id: String, slug: String): Author = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
  @scala.inline
  implicit class AuthorOps[Self <: Author] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBio(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bio")(js.undefined)
        ret
    }
    @scala.inline
    def withBioNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bio")(null)
        ret
    }
    @scala.inline
    def withCount(value: Posts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withCover_image(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover_image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCover_image: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover_image")(js.undefined)
        ret
    }
    @scala.inline
    def withCover_imageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover_image")(null)
        ret
    }
    @scala.inline
    def withFacebook(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacebook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebook")(js.undefined)
        ret
    }
    @scala.inline
    def withFacebookNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebook")(null)
        ret
    }
    @scala.inline
    def withLocation(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(null)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile_image(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile_image: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_image")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile_imageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_image")(null)
        ret
    }
    @scala.inline
    def withTwitter(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitter")(js.undefined)
        ret
    }
    @scala.inline
    def withTwitterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitter")(null)
        ret
    }
    @scala.inline
    def withUrl(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(null)
        ret
    }
    @scala.inline
    def withWebsite(value: Nullable[String]): Self = {
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
    @scala.inline
    def withWebsiteNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website")(null)
        ret
    }
  }
  
}

