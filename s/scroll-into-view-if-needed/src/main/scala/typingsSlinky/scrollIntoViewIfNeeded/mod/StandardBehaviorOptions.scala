package typingsSlinky.scrollIntoViewIfNeeded.mod

import typingsSlinky.scrollIntoViewIfNeeded.typesMod.ScrollBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardBehaviorOptions
  extends typingsSlinky.scrollIntoViewIfNeeded.typesMod.Options {
  var behavior: js.UndefOr[ScrollBehavior] = js.native
}

object StandardBehaviorOptions {
  @scala.inline
  def apply(): StandardBehaviorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardBehaviorOptions]
  }
  @scala.inline
  implicit class StandardBehaviorOptionsOps[Self <: StandardBehaviorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBehavior(value: ScrollBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(js.undefined)
        ret
    }
  }
  
}

