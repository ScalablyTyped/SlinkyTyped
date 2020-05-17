package typingsSlinky.storybookComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inline extends js.Object {
  var `inline`: Boolean = js.native
}

object Inline {
  @scala.inline
  def apply(`inline`: Boolean): Inline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inline]
  }
  @scala.inline
  implicit class InlineOps[Self <: Inline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

