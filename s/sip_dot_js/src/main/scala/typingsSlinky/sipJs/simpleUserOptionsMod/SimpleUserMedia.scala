package typingsSlinky.sipJs.simpleUserOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleUserMedia extends js.Object {
  /**
    * Offer/Answer constraints determine of audio and/or video are utilized.
    * If not specified, only audio is offered (audio is true, video is false).
    */
  var constraints: js.UndefOr[SimpleUserMediaConstraints] = js.native
  /** HTML elements for local media streams. */
  var local: js.UndefOr[SimpleUserMediaLocal] = js.native
  /** Local HTML media elements. */
  var remote: js.UndefOr[SimpleUserMediaRemote] = js.native
}

object SimpleUserMedia {
  @scala.inline
  def apply(): SimpleUserMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleUserMedia]
  }
  @scala.inline
  implicit class SimpleUserMediaOps[Self <: SimpleUserMedia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraints(value: SimpleUserMediaConstraints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal(value: SimpleUserMediaLocal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(js.undefined)
        ret
    }
    @scala.inline
    def withRemote(value: SimpleUserMediaRemote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(js.undefined)
        ret
    }
  }
  
}

