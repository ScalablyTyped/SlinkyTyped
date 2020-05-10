package typingsSlinky.std

import typingsSlinky.std.stdStrings.bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnderlyingByteSource extends js.Object {
  var autoAllocateChunkSize: js.UndefOr[Double] = js.native
  var cancel: js.UndefOr[ReadableStreamErrorCallback] = js.native
  var pull: js.UndefOr[ReadableByteStreamControllerCallback] = js.native
  var start: js.UndefOr[ReadableByteStreamControllerCallback] = js.native
  var `type`: bytes = js.native
}

object UnderlyingByteSource {
  @scala.inline
  def apply(`type`: bytes): UnderlyingByteSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnderlyingByteSource]
  }
  @scala.inline
  implicit class UnderlyingByteSourceOps[Self <: UnderlyingByteSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: bytes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoAllocateChunkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAllocateChunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAllocateChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAllocateChunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: /* reason */ js.Any => Unit | js.Thenable[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withPull(value: /* controller */ ReadableByteStreamController => Unit | js.Thenable[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: /* controller */ ReadableByteStreamController => Unit | js.Thenable[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

