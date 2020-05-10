package typingsSlinky.welldoneSoftwareWhyDidYouRender.React

import typingsSlinky.welldoneSoftwareWhyDidYouRender.WhyDidYouRender.WhyDidYouRenderComponentMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionComponent[P] extends js.Object {
  var whyDidYouRender: js.UndefOr[WhyDidYouRenderComponentMember] = js.native
}

object FunctionComponent {
  @scala.inline
  def apply[P](): FunctionComponent[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionComponent[P]]
  }
  @scala.inline
  implicit class FunctionComponentOps[Self[p] <: FunctionComponent[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withWhyDidYouRender(value: WhyDidYouRenderComponentMember): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whyDidYouRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhyDidYouRender: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whyDidYouRender")(js.undefined)
        ret
    }
  }
  
}

