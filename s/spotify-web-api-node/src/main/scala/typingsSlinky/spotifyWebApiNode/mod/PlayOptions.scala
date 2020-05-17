package typingsSlinky.spotifyWebApiNode.mod

import typingsSlinky.spotifyWebApiNode.anon.Position
import typingsSlinky.spotifyWebApiNode.anon.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayOptions extends DeviceOptions {
  var context_uri: js.UndefOr[String] = js.native
  var offset: js.UndefOr[Position | Uri] = js.native
  var position_ms: js.UndefOr[Double] = js.native
  var uris: js.UndefOr[js.Array[String]] = js.native
}

object PlayOptions {
  @scala.inline
  def apply(): PlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayOptions]
  }
  @scala.inline
  implicit class PlayOptionsOps[Self <: PlayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Position | Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition_ms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position_ms")(js.undefined)
        ret
    }
    @scala.inline
    def withUris(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uris")(js.undefined)
        ret
    }
  }
  
}

