package typingsSlinky.tryghostContentApi.mod

import typingsSlinky.tryghostContentApi.anon.Browse
import typingsSlinky.tryghostContentApi.anon.BrowseBrowseFunction
import typingsSlinky.tryghostContentApi.anon.BrowseRead
import typingsSlinky.tryghostContentApi.anon.Read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GhostAPI extends js.Object {
  var authors: Read
  var pages: Browse
  var posts: Browse
  var settings: BrowseBrowseFunction
  var tags: BrowseRead
}

object GhostAPI {
  @scala.inline
  def apply(authors: Read, pages: Browse, posts: Browse, settings: BrowseBrowseFunction, tags: BrowseRead): GhostAPI = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostAPI]
  }
}

