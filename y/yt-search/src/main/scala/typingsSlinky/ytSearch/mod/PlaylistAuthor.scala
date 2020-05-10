package typingsSlinky.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<yt-search.yt-search.Author, 'userName' | 'channelName'> */
@js.native
trait PlaylistAuthor extends js.Object {
  var channelId: String = js.native
  var channelText: String = js.native
  var channelUrl: String = js.native
  var id: String = js.native
  var name: String = js.native
  var url: String = js.native
  var userId: String = js.native
  var userText: String = js.native
  var userUrl: String = js.native
}

object PlaylistAuthor {
  @scala.inline
  def apply(
    channelId: String,
    channelText: String,
    channelUrl: String,
    id: String,
    name: String,
    url: String,
    userId: String,
    userText: String,
    userUrl: String
  ): PlaylistAuthor = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], channelText = channelText.asInstanceOf[js.Any], channelUrl = channelUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], userText = userText.asInstanceOf[js.Any], userUrl = userUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistAuthor]
  }
  @scala.inline
  implicit class PlaylistAuthorOps[Self <: PlaylistAuthor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannelUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelUrl")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

