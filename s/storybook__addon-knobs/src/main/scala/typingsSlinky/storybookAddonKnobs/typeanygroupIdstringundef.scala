package typingsSlinky.storybookAddonKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  type  :any,   groupId ? :string | undefined,   name  :string,   label  :string,   used ? :boolean | undefined,   defaultValue ? :any,   hideLabel ? :boolean | undefined,   callback ? :(): any | undefined} & std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.ObjectTypeKnob<any>, 'value'> */
@js.native
trait typeanygroupIdstringundef extends js.Object {
  var callback: js.UndefOr[js.Function0[_]] = js.native
  var defaultValue: js.UndefOr[js.Any] = js.native
  var groupId: js.UndefOr[String] = js.native
  var hideLabel: js.UndefOr[Boolean] = js.native
  var label: String = js.native
  var name: String = js.native
  var `type`: js.Any = js.native
  var used: js.UndefOr[Boolean] = js.native
  var value: js.Any = js.native
}

object typeanygroupIdstringundef {
  @scala.inline
  def apply(label: String, name: String, `type`: js.Any, value: js.Any): typeanygroupIdstringundef = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typeanygroupIdstringundef]
  }
  @scala.inline
  implicit class typeanygroupIdstringundefOps[Self <: typeanygroupIdstringundef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallback(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(js.undefined)
        ret
    }
    @scala.inline
    def withHideLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withUsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("used")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("used")(js.undefined)
        ret
    }
  }
  
}

