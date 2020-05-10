package typingsSlinky.tryghostContentApi.mod

import typingsSlinky.tryghostContentApi.AnonBrowse
import typingsSlinky.tryghostContentApi.AnonBrowseBrowseFunction
import typingsSlinky.tryghostContentApi.AnonBrowseRead
import typingsSlinky.tryghostContentApi.AnonRead
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GhostAPI extends js.Object {
  var authors: AnonRead = js.native
  var pages: AnonBrowse = js.native
  var posts: AnonBrowse = js.native
  var settings: AnonBrowseBrowseFunction = js.native
  var tags: AnonBrowseRead = js.native
}

object GhostAPI {
  @scala.inline
  def apply(
    authors: AnonRead,
    pages: AnonBrowse,
    posts: AnonBrowse,
    settings: AnonBrowseBrowseFunction,
    tags: AnonBrowseRead
  ): GhostAPI = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostAPI]
  }
  @scala.inline
  implicit class GhostAPIOps[Self <: GhostAPI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthors(value: AnonRead): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPages(value: AnonBrowse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosts(value: AnonBrowse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: AnonBrowseBrowseFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: AnonBrowseRead): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

