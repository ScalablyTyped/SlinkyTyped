package typingsSlinky.semanticUiRating.SemanticUI

import typingsSlinky.semanticUiRating.JQuery
import typingsSlinky.semanticUiRating.SemanticUI.Rating.ClassNameSettings
import typingsSlinky.semanticUiRating.SemanticUI.Rating.ErrorSettings
import typingsSlinky.semanticUiRating.SemanticUI.Rating.SelectorSettings
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.`clear rating`
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.`get rating`
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.`set rating`
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.auto
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.className
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.clearable
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.debug
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.destroy
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.disable
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.enable
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.error
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.fireOnInit
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.initialRating
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.interactive
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.name
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.namespace
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.onRate
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.performance
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.selector
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.setting
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.silent
import typingsSlinky.semanticUiRating.semanticUiRatingStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rating_ extends js.Object {
  var settings: RatingSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Clears current rating
    */
  def apply(behavior: `clear rating`): JQuery = js.native
  /**
    * Gets current rating
    */
  def apply(behavior: `get rating`): Double = js.native
  /**
    * Sets rating programmatically
    */
  def apply(behavior: `set rating`, rating: Double): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Disables interactive rating mode
    */
  def apply(behavior: disable): JQuery = js.native
  /**
    * Enables interactive rating mode
    */
  def apply(behavior: enable): JQuery = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: clearable, value: js.UndefOr[scala.Nothing]): auto | Boolean = js.native
  def apply(behavior: setting, name: clearable, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: clearable, value: auto): JQuery = js.native
  def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: fireOnInit, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: fireOnInit, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: initialRating, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: initialRating, value: Double): JQuery = js.native
  def apply(behavior: setting, name: interactive, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: interactive, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onRate, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit] = js.native
  def apply(
    behavior: setting,
    name: onRate,
    value: js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: RatingSettings): JQuery = js.native
  def apply(settings: RatingSettings): JQuery = js.native
}

