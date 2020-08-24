package typingsSlinky.semanticUiVisibility.SemanticUI

import typingsSlinky.semanticUiVisibility.JQuery
import typingsSlinky.semanticUiVisibility.SemanticUI.Visibility.ClassNameSettings
import typingsSlinky.semanticUiVisibility.SemanticUI.Visibility.ElementCalculations
import typingsSlinky.semanticUiVisibility.SemanticUI.Visibility.ErrorSettings
import typingsSlinky.semanticUiVisibility.SemanticUI.Visibility.ScreenCalculations
import typingsSlinky.semanticUiVisibility.SemanticUI.Visibility.ScreenSize
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityBooleans.`false`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.`disable callbacks`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.`enable callbacks`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.`get element calculations`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.`get pixels passed`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.`get screen calculations`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.`get screen size`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.`is off screen`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.`is on screen`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.`type`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.checkOnRefresh
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.className
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.context
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.continuous
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.debug
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.destroy
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.duration
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.error
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.fixed
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.image
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.includeMargin
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.initialCheck
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.name
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.namespace
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.observeChanges
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.offset
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onAllLoaded
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onBottomPassed
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onBottomPassedReverse
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onBottomVisible
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onBottomVisibleReverse
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onFixed
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onLoad
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onOffScreen
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onOnScreen
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onPassing
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onPassingReverse
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onRefresh
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onTopPassed
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onTopPassedReverse
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onTopVisible
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onTopVisibleReverse
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onUnfixed
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onUpdate
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.once
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.performance
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.refreshOnLoad
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.refreshOnResize
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.setting
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.silent
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.throttle
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.transition
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.verbose
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.zIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visibility_ extends js.Object {
  var settings: VisibilitySettings = js.native
  def apply(): JQuery = js.native
  /**
    * Disable callbacks temporarily. This is useful if you need to adjust scroll position and do not want to trigger callbacks during the position change.
    */
  def apply(behavior: `disable callbacks`): JQuery = js.native
  /**
    * Re-enable callbacks
    */
  def apply(behavior: `enable callbacks`): JQuery = js.native
  /**
    * Returns element calculations as object
    */
  def apply(behavior: `get element calculations`): ElementCalculations = js.native
  /**
    * Returns number of pixels passed in current element from top of element
    */
  def apply(behavior: `get pixels passed`): Double = js.native
  /**
    * Returns screen calculations as object
    */
  def apply(behavior: `get screen calculations`): ScreenCalculations = js.native
  /**
    * Returns screen size as object
    */
  def apply(behavior: `get screen size`): ScreenSize = js.native
  /**
    * Returns whether element is off screen
    */
  def apply(behavior: `is off screen`): Boolean = js.native
  /**
    * Returns whether element is on screen
    */
  def apply(behavior: `is on screen`): Boolean = js.native
  def apply(behavior: destroy): JQuery = js.native
  def apply(behavior: setting, name: `type`, value: js.UndefOr[scala.Nothing]): `false` | image | fixed = js.native
  def apply(behavior: setting, name: `type`, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: `type`, value: fixed): JQuery = js.native
  def apply(behavior: setting, name: `type`, value: image): JQuery = js.native
  def apply(behavior: setting, name: checkOnRefresh, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: checkOnRefresh, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
  def apply(behavior: setting, name: context, value: String): JQuery = js.native
  def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: continuous, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: continuous, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: includeMargin, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: includeMargin, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: initialCheck, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: initialCheck, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: observeChanges, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: offset, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: offset, value: Double): JQuery = js.native
  def apply(behavior: setting, name: onAllLoaded, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onAllLoaded, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onBottomPassedReverse, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onBottomPassedReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onBottomPassed, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onBottomPassed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onBottomVisibleReverse, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onBottomVisibleReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onBottomVisible, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onBottomVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onFixed, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onFixed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onLoad, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onLoad, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onOffScreen, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onOffScreen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onOnScreen, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onOnScreen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onPassingReverse, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onPassingReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onPassing, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onPassing, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onRefresh, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onRefresh, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onTopPassedReverse, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onTopPassedReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onTopPassed, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onTopPassed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onTopVisibleReverse, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onTopVisibleReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onTopVisible, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onTopVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onUnfixed, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onUnfixed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onUpdate, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit] = js.native
  def apply(
    behavior: setting,
    name: onUpdate,
    value: js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: once, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: once, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: refreshOnLoad, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: refreshOnLoad, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: refreshOnResize, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: refreshOnResize, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: throttle, value: js.UndefOr[scala.Nothing]): `false` | Double = js.native
  def apply(behavior: setting, name: throttle, value: Double): JQuery = js.native
  def apply(behavior: setting, name: throttle, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: transition, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
  def apply(behavior: setting, name: transition, value: String): JQuery = js.native
  def apply(behavior: setting, name: transition, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: zIndex, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: zIndex, value: Double): JQuery = js.native
  def apply(behavior: setting, value: VisibilitySettings): JQuery = js.native
  def apply(settings: VisibilitySettings): JQuery = js.native
}

