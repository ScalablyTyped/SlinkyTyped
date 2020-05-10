package typingsSlinky.videoJs.mod.videojs.Player

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.videoJs.mod.videojs.Tech.SourceObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that describes a single piece of media.
  * Properties that are not part of this type description will be retained; so, this can be viewed as a generic metadata storage mechanism as well.
  */
@js.native
trait MediaObject
  extends /**
  * Properties that are not part of this type description will be retained; so, this can be viewed as a generic metadata storage mechanism as well.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Unused, except if this object is passed to the MediaSession API.
    */
  var album: js.UndefOr[String] = js.native
  /**
    * Unused, except if this object is passed to the MediaSession API.
    */
  var artist: js.UndefOr[String] = js.native
  /**
    * Unused, except if this object is passed to the MediaSession API. If not specified, will be populated via the poster, if available.
    */
  var artwork: js.UndefOr[js.Array[_]] = js.native
  /**
    * URL to an image that will display before playback.
    */
  var poster: js.UndefOr[String] = js.native
  /**
    * A single source object, an array of source objects, or a string referencing a URL to a media source.
    * It is highly recommended that an object or array of objects is used here, so that source selection algorithms can take the type into account.
    */
  var src: js.UndefOr[String | SourceObject | js.Array[SourceObject]] = js.native
  /**
    *  An array of objects to be used to create text tracks, following the native track element format.
    *  For ease of removal, these will be created as "remote" text tracks and set to automatically clean up on source changes.
    */
  var textTracks: js.UndefOr[js.Array[_]] = js.native
  /**
    * Unused, except if this object is passed to the MediaSession API.
    */
  var title: js.UndefOr[String] = js.native
}

object MediaObject {
  @scala.inline
  def apply(): MediaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaObject]
  }
  @scala.inline
  implicit class MediaObjectOps[Self <: MediaObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album")(js.undefined)
        ret
    }
    @scala.inline
    def withArtist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist")(js.undefined)
        ret
    }
    @scala.inline
    def withArtwork(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artwork")(js.undefined)
        ret
    }
    @scala.inline
    def withPoster(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String | SourceObject | js.Array[SourceObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
    @scala.inline
    def withTextTracks(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextTracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTracks")(js.undefined)
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
  }
  
}

