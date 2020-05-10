package typingsSlinky.stremioAddonSdk.mod

import typingsSlinky.stremioAddonSdk.AnonCountryWhitelist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tells Stremio how to obtain the media content.
  *
  * It may be torrent info hash, HTTP URL, etc.
  */
@js.native
trait Stream extends js.Object {
  var behaviorHints: js.UndefOr[AnonCountryWhitelist] = js.native
  /**
    * Meta Link or an external URL to the video, which should be opened in a browser (webpage).
    *
    * e.g. a link to Netflix.
    */
  var externalUrl: js.UndefOr[String] = js.native
  /**
    * The index of the video file within the torrent (from infoHash).
    *
    * If fileIdx is not specified, the largest file in the torrent will be selected.
    */
  var fileIdx: js.UndefOr[Double] = js.native
  /**
    * Info hash of a torrent file, and fileIdx is the index of the video file within the torrent.
    *
    * If fileIdx is not specified, the largest file in the torrent will be selected.
    */
  var infoHash: js.UndefOr[String] = js.native
  /**
    * Name of the stream
    *
    * Usually a short name to identify the addon that provided the stream
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Array of Subtitle objects representing subtitles for this stream.
    */
  var subtitles: js.UndefOr[js.Array[Subtitle]] = js.native
  /**
    * Title of the stream
    *
    * Usually used for stream quality.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Direct URL to a video stream - http, https, rtmp protocols are supported.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Youtube video ID, plays using the built-in YouTube player.
    */
  var ytId: js.UndefOr[String] = js.native
}

object Stream {
  @scala.inline
  def apply(): Stream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stream]
  }
  @scala.inline
  implicit class StreamOps[Self <: Stream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBehaviorHints(value: AnonCountryWhitelist): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviorHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehaviorHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviorHints")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFileIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileIdx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileIdx")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoHash")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitles(value: js.Array[Subtitle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitles")(js.undefined)
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
    def withYtId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ytId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYtId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ytId")(js.undefined)
        ret
    }
  }
  
}

