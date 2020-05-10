package typingsSlinky.videoJs.mod.videojs.Tech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Object containing a structure like: `{src: 'url', type: 'mimetype'}` or string
  * that just contains the src url alone.
  * `var SourceObject = {src: 'http://ex.com/video.mp4', type: 'video/mp4'};`
  * `var SourceString = 'http://example.com/some-video.mp4';`
  */
@js.native
trait SourceObject extends js.Object {
  /**
    * The url to the source
    */
  var src: String = js.native
  /**
    * The mime type of the source
    */
  var `type`: js.UndefOr[String] = js.native
}

object SourceObject {
  @scala.inline
  def apply(src: String): SourceObject = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceObject]
  }
  @scala.inline
  implicit class SourceObjectOps[Self <: SourceObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

