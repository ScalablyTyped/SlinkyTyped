package typingsSlinky.semanticUiCheckbox

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.semanticUiCheckbox.SemanticUI.Checkbox.ClassNameSettings
import typingsSlinky.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings
import typingsSlinky.semanticUiCheckbox.SemanticUI.Checkbox.SelectorSettings
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxBooleans.`false`
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl, keyof semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  var beforeChecked: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]] = js.native
  var beforeDeterminate: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]] = js.native
  var beforeIndeterminate: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]] = js.native
  var beforeUnchecked: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]] = js.native
  var className: js.UndefOr[ClassNameSettings] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[ErrorSettings] = js.native
  var fireOnInit: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var namespace: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.native
  var onChecked: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.native
  var onDeterminate: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.native
  var onDisable: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.native
  var onDisabled: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.native
  var onEnable: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.native
  var onEnabled: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.native
  var onIndeterminate: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.native
  var onUnchecked: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.native
  var performance: js.UndefOr[Boolean] = js.native
  var selector: js.UndefOr[SelectorSettings] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var uncheckable: js.UndefOr[auto | Boolean] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplOps[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeChecked(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDeterminate(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDeterminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeDeterminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDeterminate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeIndeterminate(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeIndeterminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeIndeterminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeIndeterminate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeUnchecked(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUnchecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeUnchecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUnchecked")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: ClassNameSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: ErrorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withFireOnInit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireOnInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFireOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireOnInit")(js.undefined)
        ret
    }
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
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChecked(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeterminate(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeterminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDeterminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeterminate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDisable(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisable")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDisabled(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnable(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnabled(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIndeterminate(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIndeterminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnIndeterminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIndeterminate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnchecked(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnchecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnUnchecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnchecked")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: SelectorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withUncheckable(value: auto | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncheckable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckable")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

