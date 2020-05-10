package typingsSlinky.semanticUiProgress.SemanticUI.ProgressSettings

import typingsSlinky.semanticUiProgress.SemanticUI.Progress.ClassNameSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.ErrorSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.MetadataSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.RandomSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.RegExpSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.SelectorSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.TextSettings
import typingsSlinky.semanticUiProgress.semanticUiProgressBooleans.`false`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.percent
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.ratio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  // region Progress Settings
  /**
    * Whether success state should automatically trigger when progress completes
    *
    * @default true
    */
  var autoSuccess: Boolean = js.native
  /**
    * Class names used to attach style to state
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
    * Can be set to either to display progress as percent or ratio. Matches up to corresponding text template with the same name.
    *
    * @default 'percent'
    */
  var label: percent | ratio = js.native
  /**
    * When set to true, values that calculate to above 100% or below 0% will be adjusted.
    * When set to false, inappropriate values will produce an error.
    *
    * @default true
    */
  var limitValues: Boolean = js.native
  /**
    * DOM metadata used by module
    */
  var metadata: MetadataSettings = js.native
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
  /**
    * Decimal point precision for calculated progress
    *
    * @default 1
    */
  var precision: Double = js.native
  /**
    * When incrementing without value, sets range for random increment value
    */
  var random: RandomSettings = js.native
  /**
    * Regular expressions used by module
    */
  var regExp: RegExpSettings = js.native
  /**
    * Selectors used by module
    */
  var selector: SelectorSettings = js.native
  /**
    * Whether progress should automatically show activity when incremented
    *
    * @default true
    */
  var showActivity: Boolean = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  // endregion
  // region DOM Settings
  /**
    * Text content for each state, uses simple templating with {percent}, {value}, {total}
    */
  var text: TextSettings = js.native
  /**
    * Setting a total value will make each call to increment get closer to this total (i.e. 1/20, 2/20 etc)
    *
    * @default false
    */
  var total: `false` | Double = js.native
  /**
    * Sets current value, when total is specified, this is used to calculate a ratio of the total, with percent this should be the overall percent
    *
    * @default false
    */
  var value: `false` | Double = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  /**
    * Callback on active state
    */
  def onActive(value: Double, total: Double): Unit = js.native
  // endregion
  // region Callbacks
  /**
    * Callback on percentage change
    */
  def onChange(percent: Double, value: Double, total: Double): Unit = js.native
  /**
    * Callback on error state
    */
  def onError(value: Double, total: Double): Unit = js.native
  /**
    * Callback on success state
    */
  def onSuccess(total: Double): Unit = js.native
  /**
    * Callback on warning state
    */
  def onWarning(value: Double, total: Double): Unit = js.native
}

object Impl {
  @scala.inline
  def apply(
    autoSuccess: Boolean,
    className: ClassNameSettings,
    debug: Boolean,
    error: ErrorSettings,
    label: percent | ratio,
    limitValues: Boolean,
    metadata: MetadataSettings,
    name: String,
    namespace: String,
    onActive: (Double, Double) => Unit,
    onChange: (Double, Double, Double) => Unit,
    onError: (Double, Double) => Unit,
    onSuccess: Double => Unit,
    onWarning: (Double, Double) => Unit,
    performance: Boolean,
    precision: Double,
    random: RandomSettings,
    regExp: RegExpSettings,
    selector: SelectorSettings,
    showActivity: Boolean,
    silent: Boolean,
    text: TextSettings,
    total: `false` | Double,
    value: `false` | Double,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(autoSuccess = autoSuccess.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], limitValues = limitValues.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onActive = js.Any.fromFunction2(onActive), onChange = js.Any.fromFunction3(onChange), onError = js.Any.fromFunction2(onError), onSuccess = js.Any.fromFunction1(onSuccess), onWarning = js.Any.fromFunction2(onWarning), performance = performance.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], random = random.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], showActivity = showActivity.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSuccess")(value.asInstanceOf[js.Any])
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
    def withLabel(value: percent | ratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimitValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: MetadataSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
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
    def withOnActive(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnChange(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnError(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnSuccess(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnWarning(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWarning")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRandom(value: RandomSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegExp(value: RegExpSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: SelectorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowActivity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: TextSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: `false` | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: `false` | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
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

