package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.TextTransformProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTransformProps extends js.Object {
  val textTransform: js.UndefOr[ResponsiveValue[TextTransformProperty]] = js.native
}

object TextTransformProps {
  @scala.inline
  def apply(): TextTransformProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTransformProps]
  }
  @scala.inline
  implicit class TextTransformPropsOps[Self <: TextTransformProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextTransform(value: ResponsiveValue[TextTransformProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTransform")(js.undefined)
        ret
    }
  }
  
}

