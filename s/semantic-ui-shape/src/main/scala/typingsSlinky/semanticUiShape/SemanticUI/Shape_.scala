package typingsSlinky.semanticUiShape.SemanticUI

import typingsSlinky.semanticUiShape.JQuery
import typingsSlinky.semanticUiShape.SemanticUI.Shape.ClassNameSettings
import typingsSlinky.semanticUiShape.SemanticUI.Shape.ErrorSettings
import typingsSlinky.semanticUiShape.SemanticUI.Shape.SelectorSettings
import typingsSlinky.semanticUiShape.SemanticUI.Shape.Translation
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`flip back`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`flip down`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`flip left`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`flip over`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`flip right`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`flip up`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`get transform down`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`get transform left`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`get transform right`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`get transform up`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`is animating`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`set default side`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`set next side`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.`set stage size`
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.beforeChange
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.className
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.debug
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.destroy
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.duration
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.error
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.height
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.initial
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.name
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.namespace
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.next
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.onChange
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.performance
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.queue
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.refresh
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.repaint
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.reset
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.selector
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.setting
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.silent
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.verbose
import typingsSlinky.semanticUiShape.semanticUiShapeStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shape_ extends js.Object {
  var settings: ShapeSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Flips the shape over counter-clockwise
    */
  def apply(behavior: `flip back`): JQuery = js.native
  /**
    * Flips the shape downward
    */
  def apply(behavior: `flip down`): JQuery = js.native
  /**
    * Flips the shape left
    */
  def apply(behavior: `flip left`): JQuery = js.native
  /**
    * Flips the shape over clock-wise
    */
  def apply(behavior: `flip over`): JQuery = js.native
  /**
    * Flips the shape right
    */
  def apply(behavior: `flip right`): JQuery = js.native
  /**
    * Flips the shape upward
    */
  def apply(behavior: `flip up`): JQuery = js.native
  /**
    * Returns translation for next side staged below
    */
  def apply(behavior: `get transform down`): Translation = js.native
  /**
    * Returns translation for next side staged left
    */
  def apply(behavior: `get transform left`): Translation = js.native
  /**
    * Returns translation for next side staged right
    */
  def apply(behavior: `get transform right`): Translation = js.native
  /**
    * Returns translation for next side staged up
    */
  def apply(behavior: `get transform up`): Translation = js.native
  /**
    * Returns whether shape is currently animating
    */
  def apply(behavior: `is animating`): Boolean = js.native
  /**
    * Set the next side to next sibling to active element
    */
  def apply(behavior: `set default side`): JQuery = js.native
  /**
    * Set the next side to a specific selector
    */
  def apply(behavior: `set next side`, selector: String): JQuery = js.native
  def apply(behavior: `set next side`, selector: JQuery): JQuery = js.native
  /**
    * Sets shape to the content size of the next side
    */
  def apply(behavior: `set stage size`): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Queues an animation until after current animation
    */
  def apply(behavior: queue, animation: String): JQuery = js.native
  /**
    * Refreshes the selector cache for element sides
    */
  def apply(behavior: refresh): JQuery = js.native
  /**
    * Forces a reflow on element
    */
  def apply(behavior: repaint): JQuery = js.native
  /**
    * Removes all inline styles
    */
  def apply(behavior: reset): JQuery = js.native
  def apply(behavior: setting, name: beforeChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: beforeChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def apply(behavior: setting, name: height, value: js.UndefOr[scala.Nothing]): next | initial | Double = js.native
  def apply(behavior: setting, name: height, value: Double): JQuery = js.native
  def apply(behavior: setting, name: height, value: initial): JQuery = js.native
  def apply(behavior: setting, name: height, value: next): JQuery = js.native
  def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: width, value: js.UndefOr[scala.Nothing]): next | initial | Double = js.native
  def apply(behavior: setting, name: width, value: Double): JQuery = js.native
  def apply(behavior: setting, name: width, value: initial): JQuery = js.native
  def apply(behavior: setting, name: width, value: next): JQuery = js.native
  def apply(behavior: setting, value: ShapeSettings): JQuery = js.native
  def apply(settings: ShapeSettings): JQuery = js.native
}

