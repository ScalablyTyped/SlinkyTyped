package typingsSlinky.textBuffer.anon

import typingsSlinky.textBuffer.textBufferStrings.backward
import typingsSlinky.textBuffer.textBufferStrings.closest
import typingsSlinky.textBuffer.textBufferStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClipDirection extends js.Object {
  var clipDirection: js.UndefOr[backward | forward | closest] = js.native
  var reversed: js.UndefOr[Boolean] = js.native
}

object ClipDirection {
  @scala.inline
  def apply(): ClipDirection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipDirection]
  }
  @scala.inline
  implicit class ClipDirectionOps[Self <: ClipDirection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClipDirection(value: backward | forward | closest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withReversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(js.undefined)
        ret
    }
  }
  
}

