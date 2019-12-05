package typingsSlinky.semanticDashUiDashShape

import typingsSlinky.semanticDashUiDashShape.SemanticUI.Shape
import typingsSlinky.semanticDashUiDashShape.SemanticUI.Shape.Translation
import typingsSlinky.semanticDashUiDashShape.SemanticUI.ShapeSettings
import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`flip back`
import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`flip down`
import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`flip left`
import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`flip over`
import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`flip right`
import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`flip up`
import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`get transform down`
import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`get transform left`
import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`get transform right`
import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`get transform up`
import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`is animating`
import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`set default side`
import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`set next side`
import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`set stage size`
import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.destroy
import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.queue
import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.refresh
import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.repaint
import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.reset
import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("shape")
  var shape_Original: Shape = js.native
  def shape(): JQuery = js.native
  def shape(settings: ShapeSettings): JQuery = js.native
  @JSName("shape")
  def shape_destroy(behavior: destroy): JQuery = js.native
  /**
    * Flips the shape over counter-clockwise
    */
  @JSName("shape")
  def shape_flipback(behavior: `flip back`): JQuery = js.native
  /**
    * Flips the shape downward
    */
  @JSName("shape")
  def shape_flipdown(behavior: `flip down`): JQuery = js.native
  /**
    * Flips the shape left
    */
  @JSName("shape")
  def shape_flipleft(behavior: `flip left`): JQuery = js.native
  /**
    * Flips the shape over clock-wise
    */
  @JSName("shape")
  def shape_flipover(behavior: `flip over`): JQuery = js.native
  /**
    * Flips the shape right
    */
  @JSName("shape")
  def shape_flipright(behavior: `flip right`): JQuery = js.native
  /**
    * Flips the shape upward
    */
  @JSName("shape")
  def shape_flipup(behavior: `flip up`): JQuery = js.native
  /**
    * Returns translation for next side staged below
    */
  @JSName("shape")
  def shape_gettransformdown(behavior: `get transform down`): Translation = js.native
  /**
    * Returns translation for next side staged left
    */
  @JSName("shape")
  def shape_gettransformleft(behavior: `get transform left`): Translation = js.native
  /**
    * Returns translation for next side staged right
    */
  @JSName("shape")
  def shape_gettransformright(behavior: `get transform right`): Translation = js.native
  /**
    * Returns translation for next side staged up
    */
  @JSName("shape")
  def shape_gettransformup(behavior: `get transform up`): Translation = js.native
  /**
    * Returns whether shape is currently animating
    */
  @JSName("shape")
  def shape_isanimating(behavior: `is animating`): Boolean = js.native
  /**
    * Queues an animation until after current animation
    */
  @JSName("shape")
  def shape_queue(behavior: queue, animation: String): JQuery = js.native
  /**
    * Refreshes the selector cache for element sides
    */
  @JSName("shape")
  def shape_refresh(behavior: refresh): JQuery = js.native
  /**
    * Forces a reflow on element
    */
  @JSName("shape")
  def shape_repaint(behavior: repaint): JQuery = js.native
  /**
    * Removes all inline styles
    */
  @JSName("shape")
  def shape_reset(behavior: reset): JQuery = js.native
  /**
    * Set the next side to next sibling to active element
    */
  @JSName("shape")
  def shape_setdefaultside(behavior: `set default side`): JQuery = js.native
  /**
    * Set the next side to a specific selector
    */
  @JSName("shape")
  def shape_setnextside(behavior: `set next side`, selector: String): JQuery = js.native
  @JSName("shape")
  def shape_setnextside(behavior: `set next side`, selector: JQuery): JQuery = js.native
  /**
    * Sets shape to the content size of the next side
    */
  @JSName("shape")
  def shape_setstagesize(behavior: `set stage size`): JQuery = js.native
  @JSName("shape")
  def shape_setting(behavior: setting, value: ShapeSettings): JQuery = js.native
  @JSName("shape")
  def shape_setting[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-shape.SemanticUI.ShapeSettings._Impl[K] */ js.Any = js.native
  @JSName("shape")
  def shape_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-shape.SemanticUI.ShapeSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

