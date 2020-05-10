package typingsSlinky.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaylistItem extends js.Object {
  var author: PlaylistAuthor = js.native
  var listId: String = js.native
  var owner: String = js.native
  var thumbnailUrl: String = js.native
  var thumbnailUrlHQ: String = js.native
  var title: String = js.native
  var url: String = js.native
  var videoId: String = js.native
}

object PlaylistItem {
  @scala.inline
  def apply(
    author: PlaylistAuthor,
    listId: String,
    owner: String,
    thumbnailUrl: String,
    thumbnailUrlHQ: String,
    title: String,
    url: String,
    videoId: String
  ): PlaylistItem = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], listId = listId.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], thumbnailUrl = thumbnailUrl.asInstanceOf[js.Any], thumbnailUrlHQ = thumbnailUrlHQ.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistItem]
  }
  @scala.inline
  implicit class PlaylistItemOps[Self <: PlaylistItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: PlaylistAuthor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnailUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnailUrlHQ(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailUrlHQ")(value.asInstanceOf[js.Any])
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
    def withVideoId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

