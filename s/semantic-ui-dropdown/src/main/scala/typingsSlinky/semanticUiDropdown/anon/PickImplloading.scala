package typingsSlinky.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'loading'> */
@js.native
trait PickImplloading extends js.Object {
  var loading: String = js.native
}

object PickImplloading {
  @scala.inline
  def apply(loading: String): PickImplloading = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplloading]
  }
  @scala.inline
  implicit class PickImplloadingOps[Self <: PickImplloading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

