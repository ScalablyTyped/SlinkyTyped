package typingsSlinky.textBuffer.anon

import typingsSlinky.textBuffer.textBufferStrings.inside
import typingsSlinky.textBuffer.textBufferStrings.never
import typingsSlinky.textBuffer.textBufferStrings.overlap
import typingsSlinky.textBuffer.textBufferStrings.surround
import typingsSlinky.textBuffer.textBufferStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invalidate extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.native
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.native
  var reversed: js.UndefOr[Boolean] = js.native
}

object Invalidate {
  @scala.inline
  def apply(): Invalidate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invalidate]
  }
  @scala.inline
  implicit class InvalidateOps[Self <: Invalidate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclusive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidate(value: never | surround | overlap | inside | touch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(js.undefined)
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

