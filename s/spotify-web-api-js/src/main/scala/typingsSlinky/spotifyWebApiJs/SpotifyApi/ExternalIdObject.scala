package typingsSlinky.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * External Id object
  * [](https://developer.spotify.com/web-api/object-model/)
  *
  * Note that there might be other types available, it couldn't be found in the docs.
  */
@js.native
trait ExternalIdObject extends js.Object {
  var ean: js.UndefOr[String] = js.native
  var isrc: js.UndefOr[String] = js.native
  var upc: js.UndefOr[String] = js.native
}

object ExternalIdObject {
  @scala.inline
  def apply(): ExternalIdObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalIdObject]
  }
  @scala.inline
  implicit class ExternalIdObjectOps[Self <: ExternalIdObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ean")(js.undefined)
        ret
    }
    @scala.inline
    def withIsrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isrc")(js.undefined)
        ret
    }
    @scala.inline
    def withUpc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upc")(js.undefined)
        ret
    }
  }
  
}

