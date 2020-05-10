package typingsSlinky.semanticUiDropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl, 'remoteValues'> */
@js.native
trait PickImplremoteValues extends js.Object {
  var remoteValues: String = js.native
}

object PickImplremoteValues {
  @scala.inline
  def apply(remoteValues: String): PickImplremoteValues = {
    val __obj = js.Dynamic.literal(remoteValues = remoteValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplremoteValues]
  }
  @scala.inline
  implicit class PickImplremoteValuesOps[Self <: PickImplremoteValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoteValues(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

