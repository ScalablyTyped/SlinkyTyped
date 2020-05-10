package typingsSlinky.welldoneSoftwareWhyDidYouRender

import typingsSlinky.welldoneSoftwareWhyDidYouRender.WhyDidYouRender.WhyDidYouRenderComponentMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofComponent extends js.Object {
  val whyDidYouRender: WhyDidYouRenderComponentMember = js.native
}

object TypeofComponent {
  @scala.inline
  def apply(whyDidYouRender: WhyDidYouRenderComponentMember): TypeofComponent = {
    val __obj = js.Dynamic.literal(whyDidYouRender = whyDidYouRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofComponent]
  }
  @scala.inline
  implicit class TypeofComponentOps[Self <: TypeofComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWhyDidYouRender(value: WhyDidYouRenderComponentMember): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whyDidYouRender")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

