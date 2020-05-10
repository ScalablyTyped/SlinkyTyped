package typingsSlinky.textBuffer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShouldDestroyOnFileDelete extends js.Object {
  /**
    *  A function that returns a Boolean indicating whether the buffer should
    *  be destroyed if its file is deleted.
    */
  var shouldDestroyOnFileDelete: js.UndefOr[js.Function0[Boolean]] = js.native
  /** The initial string text of the buffer. */
  var text: js.UndefOr[String] = js.native
}

object AnonShouldDestroyOnFileDelete {
  @scala.inline
  def apply(): AnonShouldDestroyOnFileDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonShouldDestroyOnFileDelete]
  }
  @scala.inline
  implicit class AnonShouldDestroyOnFileDeleteOps[Self <: AnonShouldDestroyOnFileDelete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

