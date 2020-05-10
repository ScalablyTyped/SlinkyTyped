package typingsSlinky.tabris.JSX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementAttributesProperty extends js.Object {
  var jsxAttributes: js.Any = js.native
}

object ElementAttributesProperty {
  @scala.inline
  def apply(jsxAttributes: js.Any): ElementAttributesProperty = {
    val __obj = js.Dynamic.literal(jsxAttributes = jsxAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementAttributesProperty]
  }
  @scala.inline
  implicit class ElementAttributesPropertyOps[Self <: ElementAttributesProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJsxAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsxAttributes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

