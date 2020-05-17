package typingsSlinky.tryghostContentApi.mod

import typingsSlinky.tryghostContentApi.anon.Browse
import typingsSlinky.tryghostContentApi.anon.BrowseBrowseFunction
import typingsSlinky.tryghostContentApi.anon.BrowseRead
import typingsSlinky.tryghostContentApi.anon.Read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GhostAPI extends js.Object {
  var authors: Read = js.native
  var pages: Browse = js.native
  var posts: Browse = js.native
  var settings: BrowseBrowseFunction = js.native
  var tags: BrowseRead = js.native
}

object GhostAPI {
  @scala.inline
  def apply(authors: Read, pages: Browse, posts: Browse, settings: BrowseBrowseFunction, tags: BrowseRead): GhostAPI = {
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
    def withAuthors(value: Read): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPages(value: Browse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosts(value: Browse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: BrowseBrowseFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: BrowseRead): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

