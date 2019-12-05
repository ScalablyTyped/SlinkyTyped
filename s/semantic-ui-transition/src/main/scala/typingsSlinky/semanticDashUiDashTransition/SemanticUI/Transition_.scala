package typingsSlinky.semanticDashUiDashTransition.SemanticUI

import typingsSlinky.semanticDashUiDashTransition.JQuery
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`clear queue`
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`force repaint`
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`get animation event`
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`get animation name`
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`is animating`
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`is looping`
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`is supported`
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`is visible`
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`remove looping`
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`restore conditions`
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`save conditions`
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`set duration`
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`stop all`
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.destroy
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.disable
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.enable
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.hide
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.looping
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.repaint
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.reset
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.setting
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.show
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.stop
import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Transition")
@js.native
trait Transition_ extends js.Object {
  var settings: TransitionSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Clears all queued animations
    */
  def apply(behavior: `clear queue`): JQuery = js.native
  /**
    * Forces reflow using a more expensive but stable method
    */
  def apply(behavior: `force repaint`): JQuery = js.native
  /**
    * Returns vendor prefixed animation property for animationend
    */
  def apply(behavior: `get animation event`): String = js.native
  /**
    * Returns vendor prefixed animation property for animationname
    */
  def apply(behavior: `get animation name`): String = js.native
  /**
    * Returns whether transition is currently occurring
    */
  def apply(behavior: `is animating`): Boolean = js.native
  /**
    * Returns whether animation looping is set
    */
  def apply(behavior: `is looping`): Boolean = js.native
  /**
    * Returns whether animations are supported
    */
  def apply(behavior: `is supported`): Boolean = js.native
  /**
    * Returns whether element is currently visible
    */
  def apply(behavior: `is visible`): Boolean = js.native
  /**
    * Removes looping state from element
    */
  def apply(behavior: `remove looping`): JQuery = js.native
  /**
    * Adds back cached names and styles to element
    */
  def apply(behavior: `restore conditions`): JQuery = js.native
  /**
    * Saves all class names and styles to cache to be retrieved after animation
    */
  def apply(behavior: `save conditions`): JQuery = js.native
  /**
    * Modifies element animation duration
    */
  def apply(behavior: `set duration`, duration: Double): JQuery = js.native
  /**
    * Stop current animation and queued animations
    */
  def apply(behavior: `stop all`): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Adds disabled state (stops ability to animate)
    */
  def apply(behavior: disable): JQuery = js.native
  /**
    * Removes disabled state
    */
  def apply(behavior: enable): JQuery = js.native
  /**
    * Stop current animation and hide element
    */
  def apply(behavior: hide): JQuery = js.native
  /**
    * Enables animation looping
    */
  def apply(behavior: looping): JQuery = js.native
  /**
    * Triggers reflow on element
    */
  def apply(behavior: repaint): JQuery = js.native
  /**
    * Resets all conditions changes during transition
    */
  def apply(behavior: reset): JQuery = js.native
  def apply(behavior: setting, value: TransitionSettings): JQuery = js.native
  /**
    * Stop current animation and show element
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Stop current animation and preserve queue
    */
  def apply(behavior: stop): JQuery = js.native
  /**
    * Toggles between hide and show
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: TransitionSettings): JQuery = js.native
  def apply(transition: String): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-transition.SemanticUI.TransitionSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-transition.SemanticUI.TransitionSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

