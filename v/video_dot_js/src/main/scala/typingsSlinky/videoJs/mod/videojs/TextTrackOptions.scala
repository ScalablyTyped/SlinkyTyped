package typingsSlinky.videoJs.mod.videojs

import typingsSlinky.videoJs.mod.videojs.TextTrack.Kind
import typingsSlinky.videoJs.mod.videojs.TextTrack.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTrackOptions extends TrackOptions {
  var default: js.UndefOr[Boolean] = js.native
  @JSName("kind")
  var kind_TextTrackOptions: js.UndefOr[Kind] = js.native
  var mode: js.UndefOr[Mode] = js.native
  var src: js.UndefOr[String] = js.native
  var srclang: js.UndefOr[String] = js.native
  var tech: js.UndefOr[Tech] = js.native
}

object TextTrackOptions {
  @scala.inline
  def apply(): TextTrackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTrackOptions]
  }
  @scala.inline
  implicit class TextTrackOptionsOps[Self <: TextTrackOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: Kind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: Mode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
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
    def withSrclang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srclang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrclang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srclang")(js.undefined)
        ret
    }
    @scala.inline
    def withTech(value: Tech): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTech: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tech")(js.undefined)
        ret
    }
  }
  
}

