package typingsSlinky.urlMetadata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  @JSName("article:author")
  var articleColonauthor: js.UndefOr[String] = js.native
  @JSName("article:expiration_time")
  var articleColonexpiration_time: js.UndefOr[String] = js.native
  @JSName("article:modified_time")
  var articleColonmodified_time: js.UndefOr[String] = js.native
  @JSName("article:published_time")
  var articleColonpublished_time: js.UndefOr[String] = js.native
  @JSName("article:section")
  var articleColonsection: js.UndefOr[String] = js.native
  @JSName("article:tag")
  var articleColontag: js.UndefOr[String] = js.native
  var author: String = js.native
  var canonical: String = js.native
  var description: String = js.native
  var image: String = js.native
  var keywords: String = js.native
  @JSName("og:article:author")
  var ogColonarticleColonauthor: js.UndefOr[String] = js.native
  @JSName("og:article:expiration_time")
  var ogColonarticleColonexpiration_time: js.UndefOr[String] = js.native
  @JSName("og:article:modified_time")
  var ogColonarticleColonmodified_time: js.UndefOr[String] = js.native
  @JSName("og:article:published_time")
  var ogColonarticleColonpublished_time: js.UndefOr[String] = js.native
  @JSName("og:article:section")
  var ogColonarticleColonsection: js.UndefOr[String] = js.native
  @JSName("og:article:tag")
  var ogColonarticleColontag: js.UndefOr[String] = js.native
  @JSName("og:description")
  var ogColondescription: String = js.native
  @JSName("og:determiner")
  var ogColondeterminer: String = js.native
  @JSName("og:image")
  var ogColonimage: String = js.native
  @JSName("og:image:height")
  var ogColonimageColonheight: String = js.native
  @JSName("og:image:secure_url")
  var ogColonimageColonsecure_url: String = js.native
  @JSName("og:image:type")
  var ogColonimageColontype: String = js.native
  @JSName("og:image:width")
  var ogColonimageColonwidth: String = js.native
  @JSName("og:locale")
  var ogColonlocale: String = js.native
  @JSName("og:locale:alternate")
  var ogColonlocaleColonalternate: String = js.native
  @JSName("og:site_name")
  var ogColonsite_name: String = js.native
  @JSName("og:title")
  var ogColontitle: String = js.native
  @JSName("og:type")
  var ogColontype: String = js.native
  @JSName("og:url")
  var ogColonurl: String = js.native
  var source: String = js.native
  var title: String = js.native
  var url: String = js.native
}

object Result {
  @scala.inline
  def apply(
    author: String,
    canonical: String,
    description: String,
    image: String,
    keywords: String,
    ogColondescription: String,
    ogColondeterminer: String,
    ogColonimage: String,
    ogColonimageColonheight: String,
    ogColonimageColonsecure_url: String,
    ogColonimageColontype: String,
    ogColonimageColonwidth: String,
    ogColonlocale: String,
    ogColonlocaleColonalternate: String,
    ogColonsite_name: String,
    ogColontitle: String,
    ogColontype: String,
    ogColonurl: String,
    source: String,
    title: String,
    url: String
  ): Result = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], canonical = canonical.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("og:description")(ogColondescription.asInstanceOf[js.Any])
    __obj.updateDynamic("og:determiner")(ogColondeterminer.asInstanceOf[js.Any])
    __obj.updateDynamic("og:image")(ogColonimage.asInstanceOf[js.Any])
    __obj.updateDynamic("og:image:height")(ogColonimageColonheight.asInstanceOf[js.Any])
    __obj.updateDynamic("og:image:secure_url")(ogColonimageColonsecure_url.asInstanceOf[js.Any])
    __obj.updateDynamic("og:image:type")(ogColonimageColontype.asInstanceOf[js.Any])
    __obj.updateDynamic("og:image:width")(ogColonimageColonwidth.asInstanceOf[js.Any])
    __obj.updateDynamic("og:locale")(ogColonlocale.asInstanceOf[js.Any])
    __obj.updateDynamic("og:locale:alternate")(ogColonlocaleColonalternate.asInstanceOf[js.Any])
    __obj.updateDynamic("og:site_name")(ogColonsite_name.asInstanceOf[js.Any])
    __obj.updateDynamic("og:title")(ogColontitle.asInstanceOf[js.Any])
    __obj.updateDynamic("og:type")(ogColontype.asInstanceOf[js.Any])
    __obj.updateDynamic("og:url")(ogColonurl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanonical(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeywords(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOgColondescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOgColondeterminer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:determiner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOgColonimage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOgColonimageColonheight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:image:height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOgColonimageColonsecure_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:image:secure_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOgColonimageColontype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:image:type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOgColonimageColonwidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:image:width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOgColonlocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOgColonlocaleColonalternate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:locale:alternate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOgColonsite_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:site_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOgColontitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOgColontype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOgColonurl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArticleColonauthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("article:author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArticleColonauthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("article:author")(js.undefined)
        ret
    }
    @scala.inline
    def withArticleColonexpiration_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("article:expiration_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArticleColonexpiration_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("article:expiration_time")(js.undefined)
        ret
    }
    @scala.inline
    def withArticleColonmodified_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("article:modified_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArticleColonmodified_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("article:modified_time")(js.undefined)
        ret
    }
    @scala.inline
    def withArticleColonpublished_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("article:published_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArticleColonpublished_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("article:published_time")(js.undefined)
        ret
    }
    @scala.inline
    def withArticleColonsection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("article:section")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArticleColonsection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("article:section")(js.undefined)
        ret
    }
    @scala.inline
    def withArticleColontag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("article:tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArticleColontag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("article:tag")(js.undefined)
        ret
    }
    @scala.inline
    def withOgColonarticleColonauthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:article:author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOgColonarticleColonauthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:article:author")(js.undefined)
        ret
    }
    @scala.inline
    def withOgColonarticleColonexpiration_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:article:expiration_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOgColonarticleColonexpiration_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:article:expiration_time")(js.undefined)
        ret
    }
    @scala.inline
    def withOgColonarticleColonmodified_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:article:modified_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOgColonarticleColonmodified_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:article:modified_time")(js.undefined)
        ret
    }
    @scala.inline
    def withOgColonarticleColonpublished_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:article:published_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOgColonarticleColonpublished_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:article:published_time")(js.undefined)
        ret
    }
    @scala.inline
    def withOgColonarticleColonsection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:article:section")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOgColonarticleColonsection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:article:section")(js.undefined)
        ret
    }
    @scala.inline
    def withOgColonarticleColontag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:article:tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOgColonarticleColontag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("og:article:tag")(js.undefined)
        ret
    }
  }
  
}

