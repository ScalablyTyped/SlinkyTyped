package typingsSlinky.semanticUiProgress.SemanticUI

import typingsSlinky.semanticUiProgress.JQuery
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.ClassNameSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.ErrorSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.MetadataSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.RandomSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.RegExpSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.SelectorSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.TextSettings
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
trait Progress_ extends js.Object {
  var settings: ProgressSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Returns normalized value inside acceptable range specified by total.
    */
  def apply(behavior: `get normalized value`, value: Double): Double = js.native
  /**
    * Returns percent as last specified
    */
  def apply(behavior: `get percent`): Double = js.native
  /**
    * Replaces templated string with value, total, percent left and percent.
    */
  def apply(behavior: `get text`, text: String): String = js.native
  /**
    * Returns total
    */
  def apply(behavior: `get total`): Double = js.native
  /**
    * Returns current progress value
    */
  def apply(behavior: `get value`): Double = js.native
  /**
    * Returns whether progress is in active state
    */
  def apply(behavior: `is active`): Boolean = js.native
  /**
    * Returns whether progress is completed
    */
  def apply(behavior: `is complete`): Boolean = js.native
  /**
    * Returns whether progress is in error state
    */
  def apply(behavior: `is error`): Boolean = js.native
  /**
    * Returns whether progress was a success
    */
  def apply(behavior: `is success`): Boolean = js.native
  /**
    * Returns whether progress is in warning state
    */
  def apply(behavior: `is warning`): Boolean = js.native
  /**
    * Removes progress to active state
    */
  def apply(behavior: `remove active`): JQuery = js.native
  /**
    * Removes progress to error state
    */
  def apply(behavior: `remove error`): JQuery = js.native
  /**
    * Removes progress to success state
    */
  def apply(behavior: `remove success`): JQuery = js.native
  /**
    * Removes progress to warning state
    */
  def apply(behavior: `remove warning`): JQuery = js.native
  /**
    * Sets progress to active state
    */
  def apply(behavior: `set active`): JQuery = js.native
  /**
    * Sets progress bar label to text
    */
  def apply(behavior: `set bar label`, text: String): JQuery = js.native
  /**
    * Changes progress animation speed
    */
  def apply(behavior: `set duration`, value: Double): JQuery = js.native
  /**
    * Sets progress to error state
    */
  def apply(behavior: `set error`): JQuery = js.native
  /**
    * Sets progress exterior label to text
    */
  def apply(behavior: `set label`, text: String): JQuery = js.native
  /**
    * Sets current percent of progress to value. If using a total will convert from percent to estimated value.
    */
  def apply(behavior: `set percent`, percent: Double): JQuery = js.native
  /**
    * Sets progress to specified value. Will automatically calculate percent from total.
    */
  def apply(behavior: `set progress`, value: Double): JQuery = js.native
  /**
    * Sets progress to success state
    */
  def apply(behavior: `set success`): JQuery = js.native
  /**
    * Set total to a new value
    */
  def apply(behavior: `set total`, total: Double): JQuery = js.native
  /**
    * Sets progress to warning state
    */
  def apply(behavior: `set warning`): JQuery = js.native
  /**
    * Immediately updates progress to value, ignoring progress animation interval delays
    */
  def apply(behavior: `update progress`, value: Double): JQuery = js.native
  /**
    * Finishes progress and sets loaded to 100%
    */
  def apply(behavior: complete): JQuery = js.native
  /**
    * Decrements progress by decrement value, if not passed a value will use random amount specified in settings
    */
  def apply(behavior: decrement): JQuery = js.native
  def apply(behavior: decrement, decrementValue: Double): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Increments progress by increment value, if not passed a value will use random amount specified in settings
    */
  def apply(behavior: increment): JQuery = js.native
  def apply(behavior: increment, incrementValue: Double): JQuery = js.native
  /**
    * Resets progress to zero
    */
  def apply(behavior: reset): JQuery = js.native
  def apply(behavior: setting, name: autoSuccess): Boolean = js.native
  def apply(behavior: setting, name: autoSuccess, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: className): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: debug): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: error): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: label): percent | ratio = js.native
  def apply(behavior: setting, name: label, value: percent): JQuery = js.native
  def apply(behavior: setting, name: label, value: ratio): JQuery = js.native
  def apply(behavior: setting, name: limitValues): Boolean = js.native
  def apply(behavior: setting, name: limitValues, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: metadata): MetadataSettings = js.native
  def apply(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def apply(behavior: setting, name: name): String = js.native
  def apply(behavior: setting, name: namespace): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onActive): js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit] = js.native
  def apply(
    behavior: setting,
    name: onActive,
    value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onChange): js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit] = js.native
  def apply(
    behavior: setting,
    name: onChange,
    value: js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onError): js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit] = js.native
  def apply(
    behavior: setting,
    name: onError,
    value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onSuccess): js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit] = js.native
  def apply(
    behavior: setting,
    name: onSuccess,
    value: js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onWarning): js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit] = js.native
  def apply(
    behavior: setting,
    name: onWarning,
    value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: performance): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: precision): Double = js.native
  def apply(behavior: setting, name: precision, value: Double): JQuery = js.native
  def apply(behavior: setting, name: random): RandomSettings = js.native
  def apply(behavior: setting, name: random, value: RandomSettings): JQuery = js.native
  def apply(behavior: setting, name: regExp): RegExpSettings = js.native
  def apply(behavior: setting, name: regExp, value: RegExpSettings): JQuery = js.native
  def apply(behavior: setting, name: selector): SelectorSettings = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: showActivity): Boolean = js.native
  def apply(behavior: setting, name: showActivity, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: silent): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: text): TextSettings = js.native
  def apply(behavior: setting, name: text, value: TextSettings): JQuery = js.native
  def apply(behavior: setting, name: total): `false` | Double = js.native
  def apply(behavior: setting, name: total, value: Double): JQuery = js.native
  def apply(behavior: setting, name: total, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: value): `false` | Double = js.native
  def apply(behavior: setting, name: value, value: Double): JQuery = js.native
  def apply(behavior: setting, name: value, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: verbose): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: ProgressSettings): JQuery = js.native
  def apply(settings: ProgressSettings): JQuery = js.native
}

