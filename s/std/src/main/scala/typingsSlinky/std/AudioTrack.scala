package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single audio track from one of the HTML media elements, <audio> or <video>.  */
@js.native
trait AudioTrack extends js.Object {
  var enabled: scala.Boolean = js.native
  val id: java.lang.String = js.native
  var kind: java.lang.String = js.native
  val label: java.lang.String = js.native
  var language: java.lang.String = js.native
  val sourceBuffer: SourceBuffer | Null = js.native
}

object AudioTrack {
  @scala.inline
  def apply(
    enabled: scala.Boolean,
    id: java.lang.String,
    kind: java.lang.String,
    label: java.lang.String,
    language: java.lang.String
  ): AudioTrack = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTrack]
  }
  @scala.inline
  implicit class AudioTrackOps[Self <: org.scalajs.dom.raw.AudioTrack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceBuffer(value: SourceBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceBufferNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceBuffer")(null)
        ret
    }
  }
  
}

