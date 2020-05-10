package typingsSlinky.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostOrPage
  extends Identification
     with Excerpt
     with CodeInjection
     with Metadata
     with Facebook
     with Twitter
     with GhostData {
  // Authors - Only shown when using Include Param
  var authors: js.UndefOr[js.Array[Author]] = js.native
  var canonical_url: js.UndefOr[Nullable[String]] = js.native
  var comment_id: js.UndefOr[String] = js.native
  // Dates
  var created_at: js.UndefOr[String] = js.native
  // Custom Template for posts and pages
  var custom_template: js.UndefOr[Nullable[String]] = js.native
  // Image
  var feature_image: js.UndefOr[Nullable[String]] = js.native
  var featured: js.UndefOr[Boolean] = js.native
  var html: js.UndefOr[Nullable[String]] = js.native
  // Post or Page
  var page: js.UndefOr[Boolean] = js.native
  var plaintext: js.UndefOr[Nullable[String]] = js.native
  var primary_author: js.UndefOr[Nullable[Author]] = js.native
  var primary_tag: js.UndefOr[Nullable[Tag]] = js.native
  var published_at: js.UndefOr[Nullable[String]] = js.native
  // Reading time
  var reading_time: js.UndefOr[Double] = js.native
  // Tags - Only shown when using Include param
  var tags: js.UndefOr[js.Array[Tag]] = js.native
  // Post or Page
  var title: js.UndefOr[String] = js.native
  var updated_at: js.UndefOr[Nullable[String]] = js.native
  var url: js.UndefOr[String] = js.native
  // Identification
  var uuid: js.UndefOr[String] = js.native
}

object PostOrPage {
  @scala.inline
  def apply(id: String, slug: String): PostOrPage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostOrPage]
  }
  @scala.inline
  implicit class PostOrPageOps[Self <: PostOrPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthors(value: js.Array[Author]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authors")(js.undefined)
        ret
    }
    @scala.inline
    def withCanonical_url(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonical_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanonical_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonical_url")(js.undefined)
        ret
    }
    @scala.inline
    def withCanonical_urlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonical_url")(null)
        ret
    }
    @scala.inline
    def withComment_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_id")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom_template(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_template: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_template")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom_templateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_template")(null)
        ret
    }
    @scala.inline
    def withFeature_image(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feature_image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeature_image: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feature_image")(js.undefined)
        ret
    }
    @scala.inline
    def withFeature_imageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feature_image")(null)
        ret
    }
    @scala.inline
    def withFeatured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatured: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featured")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(null)
        ret
    }
    @scala.inline
    def withPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaintext(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plaintext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaintext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plaintext")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaintextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plaintext")(null)
        ret
    }
    @scala.inline
    def withPrimary_author(value: Nullable[Author]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary_author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary_author: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary_author")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary_authorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary_author")(null)
        ret
    }
    @scala.inline
    def withPrimary_tag(value: Nullable[Tag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary_tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary_tag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary_tag")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary_tagNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary_tag")(null)
        ret
    }
    @scala.inline
    def withPublished_at(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublished_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_at")(js.undefined)
        ret
    }
    @scala.inline
    def withPublished_atNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_at")(null)
        ret
    }
    @scala.inline
    def withReading_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reading_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReading_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reading_time")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[Tag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated_at(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated_atNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(null)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
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
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.undefined)
        ret
    }
  }
  
}

