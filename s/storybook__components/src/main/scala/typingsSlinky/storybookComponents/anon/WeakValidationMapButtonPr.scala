package typingsSlinky.storybookComponents.anon

import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<@storybook/components.@storybook/components/dist/Button/Button.ButtonProps & react.react.RefAttributes<any>> */
@js.native
trait WeakValidationMapButtonPr extends js.Object {
  var containsIcon: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var inForm: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var isLink: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var key: js.UndefOr[Validator[js.UndefOr[Key | Null]]] = js.native
  var outline: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var primary: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var ref: js.UndefOr[Validator[js.UndefOr[Null | Ref[_]]]] = js.native
  var secondary: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var small: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var tertiary: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
}

object WeakValidationMapButtonPr {
  @scala.inline
  def apply(): WeakValidationMapButtonPr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapButtonPr]
  }
  @scala.inline
  implicit class WeakValidationMapButtonPrOps[Self <: WeakValidationMapButtonPr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainsIcon(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainsIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInForm(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inForm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inForm")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLink(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLink")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: Validator[js.UndefOr[Key | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withOutline(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(js.undefined)
        ret
    }
    @scala.inline
    def withRef(value: Validator[js.UndefOr[Null | Ref[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondary(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary")(js.undefined)
        ret
    }
    @scala.inline
    def withSmall(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(js.undefined)
        ret
    }
    @scala.inline
    def withTertiary(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tertiary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTertiary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tertiary")(js.undefined)
        ret
    }
  }
  
}

