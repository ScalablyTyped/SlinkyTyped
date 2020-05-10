package typingsSlinky.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResult extends js.Object {
  var accounts: js.Array[ChannelSearchResult] = js.native
  var channels: js.Array[ChannelSearchResult] = js.native
  var lists: js.Array[PlaylistSearchResult] = js.native
  var playlists: js.Array[PlaylistSearchResult] = js.native
  var videos: js.Array[VideoSearchResult] = js.native
}

object SearchResult {
  @scala.inline
  def apply(
    accounts: js.Array[ChannelSearchResult],
    channels: js.Array[ChannelSearchResult],
    lists: js.Array[PlaylistSearchResult],
    playlists: js.Array[PlaylistSearchResult],
    videos: js.Array[VideoSearchResult]
  ): SearchResult = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any], playlists = playlists.asInstanceOf[js.Any], videos = videos.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  implicit class SearchResultOps[Self <: SearchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccounts(value: js.Array[ChannelSearchResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannels(value: js.Array[ChannelSearchResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLists(value: js.Array[PlaylistSearchResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaylists(value: js.Array[PlaylistSearchResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideos(value: js.Array[VideoSearchResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

