package typingsSlinky.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaVideo extends js.Object {
  /**
    * Set to true to explicitly state that this video is available for streaming, from your addon.
    *
    * No need to use this if you've passed stream.
    */
  var available: js.UndefOr[Boolean] = js.native
  /**
    * Episode number, if applicable.
    */
  var episode: js.UndefOr[Double] = js.native
  /**
    * ID of the video.
    */
  var id: String = js.native
  /**
    * Video overview/summary
    */
  var overview: js.UndefOr[String] = js.native
  /**
    * ISO 8601, publish date of the video.
    *
    * for episodes, this should be the initial air date.
    *
    * e.g. "2010-12-06T05:00:00.000Z"
    */
  var released: String = js.native
  /**
    * Season number, if applicable.
    */
  var season: js.UndefOr[Double] = js.native
  /**
    * In case you can return links to streams while forming meta response,
    * you can pass and array of Stream Objects to point the video to a HTTP URL, BitTorrent,
    * YouTube or any other stremio-supported transport protocol.
    *
    * Note that this is exclusive: passing video.streams means that Stremio will not request any streams
    * from other addons for that video.
    * If you return streams that way, it is still recommended to implement the streams resource.
    */
  var streams: js.UndefOr[js.Array[Stream]] = js.native
  /**
    * URL to png of the video thumbnail, in the video's aspect ratio.
    *
    * max file size 5kb.
    */
  var thumbnail: js.UndefOr[String] = js.native
  /**
    * Title of the video.
    */
  var title: String = js.native
  /**
    * YouTube ID of the trailer video; use if this is an episode for a series.
    */
  var trailer: js.UndefOr[String] = js.native
}

object MetaVideo {
  @scala.inline
  def apply(id: String, released: String, title: String): MetaVideo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], released = released.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaVideo]
  }
  @scala.inline
  implicit class MetaVideoOps[Self <: MetaVideo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleased(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("released")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(js.undefined)
        ret
    }
    @scala.inline
    def withEpisode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("episode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEpisode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("episode")(js.undefined)
        ret
    }
    @scala.inline
    def withOverview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(js.undefined)
        ret
    }
    @scala.inline
    def withSeason(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("season")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("season")(js.undefined)
        ret
    }
    @scala.inline
    def withStreams(value: js.Array[Stream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streams")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnail(value: String): Self = {
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
    def withTrailer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailer")(js.undefined)
        ret
    }
  }
  
}

