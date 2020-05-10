package typingsSlinky.spotifyApi.SpotifyApi

import typingsSlinky.spotifyApi.spotifyApiStrings.album
import typingsSlinky.spotifyApi.spotifyApiStrings.artist
import typingsSlinky.spotifyApi.spotifyApiStrings.playlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Context Object
  * [](https://developer.spotify.com/web-api/object-model/#context-object)
  */
@js.native
trait ContextObject extends js.Object {
  /**
    * Known external URLs.
    */
  var external_urls: ExternalUrlObject = js.native
  /**
    * A link to the Web API endpoint providing full details.
    */
  var href: String = js.native
  /**
    * The object type.
    */
  var `type`: artist | playlist | album = js.native
  /**
    * The [Spotify URI](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids).
    */
  var uri: String = js.native
}

object ContextObject {
  @scala.inline
  def apply(external_urls: ExternalUrlObject, href: String, `type`: artist | playlist | album, uri: String): ContextObject = {
    val __obj = js.Dynamic.literal(external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextObject]
  }
  @scala.inline
  implicit class ContextObjectOps[Self <: ContextObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExternal_urls(value: ExternalUrlObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: artist | playlist | album): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

