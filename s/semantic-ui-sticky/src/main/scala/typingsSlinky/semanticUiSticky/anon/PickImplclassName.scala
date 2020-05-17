package typingsSlinky.semanticUiSticky.anon

import typingsSlinky.semanticUiSticky.SemanticUI.Sticky.ClassNameSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, 'className'> */
@js.native
trait PickImplclassName extends js.Object {
  var className: ClassNameSettings = js.native
}

object PickImplclassName {
  @scala.inline
  def apply(className: ClassNameSettings): PickImplclassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplclassName]
  }
  @scala.inline
  implicit class PickImplclassNameOps[Self <: PickImplclassName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: ClassNameSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

