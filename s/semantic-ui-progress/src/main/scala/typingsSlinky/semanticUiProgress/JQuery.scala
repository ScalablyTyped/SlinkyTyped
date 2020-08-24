package typingsSlinky.semanticUiProgress

import typingsSlinky.semanticUiProgress.SemanticUI.Progress
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.ClassNameSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.ErrorSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.MetadataSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.RandomSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.RegExpSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.SelectorSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.TextSettings
import typingsSlinky.semanticUiProgress.SemanticUI.ProgressSettings
import typingsSlinky.semanticUiProgress.semanticUiProgressBooleans.`false`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`get normalized value`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`get percent`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`get text`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`get total`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`get value`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`is active`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`is complete`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`is error`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`is success`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`is warning`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`remove active`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`remove error`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`remove success`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`remove warning`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`set active`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`set bar label`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`set duration`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`set error`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`set label`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`set percent`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`set progress`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`set success`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`set total`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`set warning`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`update progress`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.autoSuccess
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.className
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.complete
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.debug
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.decrement
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.destroy
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.error
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.increment
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.label
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.limitValues
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.metadata
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.name
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.namespace
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.onActive
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.onChange
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.onError
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.onSuccess
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.onWarning
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.percent
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.performance
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.precision
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.random
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.ratio
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.regExp
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.reset
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.selector
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.setting
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.showActivity
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.silent
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.text
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.total
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.value
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("progress")
  var progress_Original: Progress = js.native
  def progress(): JQuery = js.native
  def progress(behavior: setting, name: autoSuccess, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def progress(behavior: setting, name: autoSuccess, value: Boolean): JQuery = js.native
  def progress(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def progress(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def progress(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def progress(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def progress(behavior: setting, name: label, value: js.UndefOr[scala.Nothing]): percent | ratio = js.native
  def progress(behavior: setting, name: label, value: percent): JQuery = js.native
  def progress(behavior: setting, name: label, value: ratio): JQuery = js.native
  def progress(behavior: setting, name: limitValues, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def progress(behavior: setting, name: limitValues, value: Boolean): JQuery = js.native
  def progress(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def progress(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def progress(behavior: setting, name: namespace, value: String): JQuery = js.native
  def progress(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def progress(behavior: setting, name: name, value: String): JQuery = js.native
  def progress(behavior: setting, name: onActive, value: js.UndefOr[scala.Nothing]): js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit] = js.native
  def progress(
    behavior: setting,
    name: onActive,
    value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ): JQuery = js.native
  def progress(behavior: setting, name: onChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit] = js.native
  def progress(
    behavior: setting,
    name: onChange,
    value: js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit]
  ): JQuery = js.native
  def progress(behavior: setting, name: onError, value: js.UndefOr[scala.Nothing]): js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit] = js.native
  def progress(
    behavior: setting,
    name: onError,
    value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ): JQuery = js.native
  def progress(behavior: setting, name: onSuccess, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit] = js.native
  def progress(
    behavior: setting,
    name: onSuccess,
    value: js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit]
  ): JQuery = js.native
  def progress(behavior: setting, name: onWarning, value: js.UndefOr[scala.Nothing]): js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit] = js.native
  def progress(
    behavior: setting,
    name: onWarning,
    value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ): JQuery = js.native
  def progress(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def progress(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def progress(behavior: setting, name: precision, value: js.UndefOr[scala.Nothing]): Double = js.native
  def progress(behavior: setting, name: precision, value: Double): JQuery = js.native
  def progress(behavior: setting, name: random, value: RandomSettings): JQuery = js.native
  def progress(behavior: setting, name: regExp, value: js.UndefOr[scala.Nothing]): RegExpSettings = js.native
  def progress(behavior: setting, name: regExp, value: RegExpSettings): JQuery = js.native
  def progress(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def progress(behavior: setting, name: showActivity, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def progress(behavior: setting, name: showActivity, value: Boolean): JQuery = js.native
  def progress(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def progress(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def progress(behavior: setting, name: text, value: TextSettings): JQuery = js.native
  def progress(behavior: setting, name: total, value: js.UndefOr[scala.Nothing]): `false` | Double = js.native
  def progress(behavior: setting, name: total, value: Double): JQuery = js.native
  def progress(behavior: setting, name: total, value: `false`): JQuery = js.native
  def progress(behavior: setting, name: value, value: js.UndefOr[scala.Nothing]): `false` | Double = js.native
  def progress(behavior: setting, name: value, value: Double): JQuery = js.native
  def progress(behavior: setting, name: value, value: `false`): JQuery = js.native
  def progress(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def progress(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def progress(settings: ProgressSettings): JQuery = js.native
  @JSName("progress")
  def progress_ClassNameSettings(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
  @JSName("progress")
  def progress_ErrorSettings(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  @JSName("progress")
  def progress_MetadataSettings(behavior: setting, name: metadata, value: js.UndefOr[scala.Nothing]): MetadataSettings = js.native
  @JSName("progress")
  def progress_RandomSettings(behavior: setting, name: random, value: js.UndefOr[scala.Nothing]): RandomSettings = js.native
  @JSName("progress")
  def progress_SelectorSettings(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  @JSName("progress")
  def progress_TextSettings(behavior: setting, name: text, value: js.UndefOr[scala.Nothing]): TextSettings = js.native
  /**
    * Finishes progress and sets loaded to 100%
    */
  @JSName("progress")
  def progress_complete(behavior: complete): JQuery = js.native
  /**
    * Decrements progress by decrement value, if not passed a value will use random amount specified in settings
    */
  @JSName("progress")
  def progress_decrement(behavior: decrement): JQuery = js.native
  @JSName("progress")
  def progress_decrement(behavior: decrement, decrementValue: Double): JQuery = js.native
  @JSName("progress")
  def progress_destroy(behavior: destroy): JQuery = js.native
  /**
    * Returns normalized value inside acceptable range specified by total.
    */
  @JSName("progress")
  def progress_getnormalizedvalue(behavior: `get normalized value`, value: Double): Double = js.native
  /**
    * Returns percent as last specified
    */
  @JSName("progress")
  def progress_getpercent(behavior: `get percent`): Double = js.native
  /**
    * Replaces templated string with value, total, percent left and percent.
    */
  @JSName("progress")
  def progress_gettext(behavior: `get text`, text: String): String = js.native
  /**
    * Returns total
    */
  @JSName("progress")
  def progress_gettotal(behavior: `get total`): Double = js.native
  /**
    * Returns current progress value
    */
  @JSName("progress")
  def progress_getvalue(behavior: `get value`): Double = js.native
  /**
    * Increments progress by increment value, if not passed a value will use random amount specified in settings
    */
  @JSName("progress")
  def progress_increment(behavior: increment): JQuery = js.native
  @JSName("progress")
  def progress_increment(behavior: increment, incrementValue: Double): JQuery = js.native
  /**
    * Returns whether progress is in active state
    */
  @JSName("progress")
  def progress_isactive(behavior: `is active`): Boolean = js.native
  /**
    * Returns whether progress is completed
    */
  @JSName("progress")
  def progress_iscomplete(behavior: `is complete`): Boolean = js.native
  /**
    * Returns whether progress is in error state
    */
  @JSName("progress")
  def progress_iserror(behavior: `is error`): Boolean = js.native
  /**
    * Returns whether progress was a success
    */
  @JSName("progress")
  def progress_issuccess(behavior: `is success`): Boolean = js.native
  /**
    * Returns whether progress is in warning state
    */
  @JSName("progress")
  def progress_iswarning(behavior: `is warning`): Boolean = js.native
  /**
    * Removes progress to active state
    */
  @JSName("progress")
  def progress_removeactive(behavior: `remove active`): JQuery = js.native
  /**
    * Removes progress to error state
    */
  @JSName("progress")
  def progress_removeerror(behavior: `remove error`): JQuery = js.native
  /**
    * Removes progress to success state
    */
  @JSName("progress")
  def progress_removesuccess(behavior: `remove success`): JQuery = js.native
  /**
    * Removes progress to warning state
    */
  @JSName("progress")
  def progress_removewarning(behavior: `remove warning`): JQuery = js.native
  /**
    * Resets progress to zero
    */
  @JSName("progress")
  def progress_reset(behavior: reset): JQuery = js.native
  /**
    * Sets progress to active state
    */
  @JSName("progress")
  def progress_setactive(behavior: `set active`): JQuery = js.native
  /**
    * Sets progress bar label to text
    */
  @JSName("progress")
  def progress_setbarlabel(behavior: `set bar label`, text: String): JQuery = js.native
  /**
    * Changes progress animation speed
    */
  @JSName("progress")
  def progress_setduration(behavior: `set duration`, value: Double): JQuery = js.native
  /**
    * Sets progress to error state
    */
  @JSName("progress")
  def progress_seterror(behavior: `set error`): JQuery = js.native
  /**
    * Sets progress exterior label to text
    */
  @JSName("progress")
  def progress_setlabel(behavior: `set label`, text: String): JQuery = js.native
  /**
    * Sets current percent of progress to value. If using a total will convert from percent to estimated value.
    */
  @JSName("progress")
  def progress_setpercent(behavior: `set percent`, percent: Double): JQuery = js.native
  /**
    * Sets progress to specified value. Will automatically calculate percent from total.
    */
  @JSName("progress")
  def progress_setprogress(behavior: `set progress`, value: Double): JQuery = js.native
  /**
    * Sets progress to success state
    */
  @JSName("progress")
  def progress_setsuccess(behavior: `set success`): JQuery = js.native
  @JSName("progress")
  def progress_setting(behavior: setting, value: ProgressSettings): JQuery = js.native
  /**
    * Set total to a new value
    */
  @JSName("progress")
  def progress_settotal(behavior: `set total`, total: Double): JQuery = js.native
  /**
    * Sets progress to warning state
    */
  @JSName("progress")
  def progress_setwarning(behavior: `set warning`): JQuery = js.native
  /**
    * Immediately updates progress to value, ignoring progress animation interval delays
    */
  @JSName("progress")
  def progress_updateprogress(behavior: `update progress`, value: Double): JQuery = js.native
}

