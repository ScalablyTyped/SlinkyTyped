package typingsSlinky.textBuffer.mod._Global_.TextBuffer.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferLoad extends js.Object {
  /** The file's encoding. */
  var encoding: js.UndefOr[String] = js.native
  /**
    *  A function that returns a boolean indicating whether the buffer should
    *  be destroyed if its file is deleted.
    */
  var shouldDestroyOnFileDelete: js.UndefOr[js.Function0[Boolean]] = js.native
}

object BufferLoad {
  @scala.inline
  def apply(): BufferLoad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferLoad]
  }
  @scala.inline
  implicit class BufferLoadOps[Self <: BufferLoad] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldDestroyOnFileDelete(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldDestroyOnFileDelete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShouldDestroyOnFileDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldDestroyOnFileDelete")(js.undefined)
        ret
    }
  }
  
}

