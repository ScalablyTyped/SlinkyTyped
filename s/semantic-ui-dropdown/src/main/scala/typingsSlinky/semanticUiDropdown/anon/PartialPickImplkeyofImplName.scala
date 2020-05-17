package typingsSlinky.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplName extends js.Object {
  var name: js.UndefOr[String] = js.native
  var remoteValues: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
  var values: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplName {
  @scala.inline
  def apply(): PartialPickImplkeyofImplName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplName]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplNameOps[Self <: PartialPickImplkeyofImplName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteValues(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteValues")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

