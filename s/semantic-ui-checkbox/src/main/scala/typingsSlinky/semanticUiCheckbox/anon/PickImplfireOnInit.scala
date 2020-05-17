package typingsSlinky.semanticUiCheckbox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl, 'fireOnInit'> */
@js.native
trait PickImplfireOnInit extends js.Object {
  var fireOnInit: Boolean = js.native
}

object PickImplfireOnInit {
  @scala.inline
  def apply(fireOnInit: Boolean): PickImplfireOnInit = {
    val __obj = js.Dynamic.literal(fireOnInit = fireOnInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfireOnInit]
  }
  @scala.inline
  implicit class PickImplfireOnInitOps[Self <: PickImplfireOnInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFireOnInit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireOnInit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

