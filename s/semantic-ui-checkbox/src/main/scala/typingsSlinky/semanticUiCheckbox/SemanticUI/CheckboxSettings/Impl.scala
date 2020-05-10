package typingsSlinky.semanticUiCheckbox.SemanticUI.CheckboxSettings

import typingsSlinky.semanticUiCheckbox.SemanticUI.Checkbox.ClassNameSettings
import typingsSlinky.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings
import typingsSlinky.semanticUiCheckbox.SemanticUI.Checkbox.SelectorSettings
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxBooleans.`false`
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * Class names used to determine element state
    */
  var className: ClassNameSettings = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * Whether callbacks for checked status should be fired on init as well as change
    *
    * @default false
    */
  var fireOnInit: Boolean = js.native
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String = js.native
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String = js.native
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  // endregion
  // region DOM Settings
  /**
    * Selectors used to find parts of a module
    */
  var selector: SelectorSettings = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  // region Behavior
  /**
    * Setting to true/false will determine whether an input will allow no selection. Auto will set disallow this behavior only for radio boxes
    *
    * @default 'auto'
    */
  var uncheckable: auto | Boolean = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  /**
    * Callback before a checkbox is checked. Can cancel change by returning false
    */
  def beforeChecked(): Unit | `false` = js.native
  /**
    * Callback before a checkbox is set to determinate. Can cancel change by returning false
    */
  def beforeDeterminate(): Unit | `false` = js.native
  /**
    * Callback before a checkbox is set to undeterminate. Can cancel change by returning false
    */
  def beforeIndeterminate(): Unit | `false` = js.native
  /**
    * Callback before a checkbox is unchecked. Can cancel change by returning false
    */
  def beforeUnchecked(): Unit | `false` = js.native
  // endregion
  // region Callbacks
  /**
    * Callback after a checkbox is either checked or unchecked.
    */
  def onChange(): Unit = js.native
  /**
    * Callback after a checkbox is checked.
    */
  def onChecked(): Unit = js.native
  /**
    * Callback after a checkbox is set to determinate.
    */
  def onDeterminate(): Unit = js.native
  /**
    * Callback after a checkbox is disabled.
    */
  def onDisable(): Unit = js.native
  /**
    * Callback after a checkbox is disabled.
    *
    * @deprecated
    */
  def onDisabled(): Unit = js.native
  /**
    * Callback after a checkbox is enabled.
    */
  def onEnable(): Unit = js.native
  /**
    * Callback after a checkbox is enabled.
    *
    * @deprecated
    */
  def onEnabled(): Unit = js.native
  /**
    * Callback after a checkbox is set to undeterminate.
    */
  def onIndeterminate(): Unit = js.native
  /**
    * Callback after a checkbox is unchecked.
    */
  def onUnchecked(): Unit = js.native
}

object Impl {
  @scala.inline
  def apply(
    beforeChecked: () => Unit | `false`,
    beforeDeterminate: () => Unit | `false`,
    beforeIndeterminate: () => Unit | `false`,
    beforeUnchecked: () => Unit | `false`,
    className: ClassNameSettings,
    debug: Boolean,
    error: ErrorSettings,
    fireOnInit: Boolean,
    name: String,
    namespace: String,
    onChange: () => Unit,
    onChecked: () => Unit,
    onDeterminate: () => Unit,
    onDisable: () => Unit,
    onDisabled: () => Unit,
    onEnable: () => Unit,
    onEnabled: () => Unit,
    onIndeterminate: () => Unit,
    onUnchecked: () => Unit,
    performance: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    uncheckable: auto | Boolean,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(beforeChecked = js.Any.fromFunction0(beforeChecked), beforeDeterminate = js.Any.fromFunction0(beforeDeterminate), beforeIndeterminate = js.Any.fromFunction0(beforeIndeterminate), beforeUnchecked = js.Any.fromFunction0(beforeUnchecked), className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fireOnInit = fireOnInit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onChecked = js.Any.fromFunction0(onChecked), onDeterminate = js.Any.fromFunction0(onDeterminate), onDisable = js.Any.fromFunction0(onDisable), onDisabled = js.Any.fromFunction0(onDisabled), onEnable = js.Any.fromFunction0(onEnable), onEnabled = js.Any.fromFunction0(onEnabled), onIndeterminate = js.Any.fromFunction0(onIndeterminate), onUnchecked = js.Any.fromFunction0(onUnchecked), performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], uncheckable = uncheckable.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeChecked(value: () => Unit | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChecked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBeforeDeterminate(value: () => Unit | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDeterminate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBeforeIndeterminate(value: () => Unit | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeIndeterminate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBeforeUnchecked(value: () => Unit | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUnchecked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClassName(value: ClassNameSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: ErrorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFireOnInit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireOnInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnChecked(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChecked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDeterminate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeterminate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDisable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDisabled(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnEnabled(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnIndeterminate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIndeterminate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnUnchecked(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnchecked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: SelectorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUncheckable(value: auto | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

