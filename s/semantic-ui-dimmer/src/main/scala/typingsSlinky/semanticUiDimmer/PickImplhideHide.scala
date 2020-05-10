package typingsSlinky.semanticUiDimmer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.ClassNameSettings._Impl, 'hide'> */
@js.native
trait PickImplhideHide extends js.Object {
  var hide: String = js.native
}

object PickImplhideHide {
  @scala.inline
  def apply(hide: String): PickImplhideHide = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhideHide]
  }
  @scala.inline
  implicit class PickImplhideHideOps[Self <: PickImplhideHide] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHide(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

