package typingsSlinky.wordpressApiFetch.anon

import typingsSlinky.wordpressApiFetch.wordpressApiFetchBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Author extends js.Object {
  var author: js.UndefOr[`true`] = js.native
  var comments: js.UndefOr[`true`] = js.native
  var `custom-fields`: js.UndefOr[`true`] = js.native
  var editor: js.UndefOr[`true`] = js.native
  var excerpt: js.UndefOr[`true`] = js.native
  var `page-attributes`: js.UndefOr[`true`] = js.native
  var `post-formats`: js.UndefOr[`true`] = js.native
  var revisions: js.UndefOr[`true`] = js.native
  var thumbnail: js.UndefOr[`true`] = js.native
  var title: js.UndefOr[`true`] = js.native
  var trackbacks: js.UndefOr[`true`] = js.native
}

object Author {
  @scala.inline
  def apply(): Author = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Author]
  }
  @scala.inline
  implicit class AuthorOps[Self <: Author] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def `withCustom-fields`(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom-fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCustom-fields`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom-fields")(js.undefined)
        ret
    }
    @scala.inline
    def withEditor(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(js.undefined)
        ret
    }
    @scala.inline
    def withExcerpt(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excerpt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcerpt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excerpt")(js.undefined)
        ret
    }
    @scala.inline
    def `withPage-attributes`(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPage-attributes`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-attributes")(js.undefined)
        ret
    }
    @scala.inline
    def `withPost-formats`(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post-formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPost-formats`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post-formats")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisions(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisions")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnail(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: `true`): Self = {
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
    def withTrackbacks(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackbacks")(js.undefined)
        ret
    }
  }
  
}

