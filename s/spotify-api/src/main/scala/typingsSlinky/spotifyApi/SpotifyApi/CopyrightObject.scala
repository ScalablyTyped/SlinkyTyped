package typingsSlinky.spotifyApi.SpotifyApi

import typingsSlinky.spotifyApi.spotifyApiStrings.C
import typingsSlinky.spotifyApi.spotifyApiStrings.P
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Copyright object
  * [copyright object](https://developer.spotify.com/web-api/object-model/)
  */
@js.native
trait CopyrightObject extends js.Object {
  var text: String = js.native
  var `type`: C | P = js.native
}

object CopyrightObject {
  @scala.inline
  def apply(text: String, `type`: C | P): CopyrightObject = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyrightObject]
  }
  @scala.inline
  implicit class CopyrightObjectOps[Self <: CopyrightObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: C | P): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

