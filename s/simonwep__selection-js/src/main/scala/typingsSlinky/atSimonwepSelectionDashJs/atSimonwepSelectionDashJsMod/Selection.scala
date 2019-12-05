package typingsSlinky.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.`class`
import typingsSlinky.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.boundaries
import typingsSlinky.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.disableTouch
import typingsSlinky.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.mode
import typingsSlinky.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.scrollSpeedDivider
import typingsSlinky.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.selectables
import typingsSlinky.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.selectionAreaContainer
import typingsSlinky.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.singleClick
import typingsSlinky.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.startThreshold
import typingsSlinky.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.startareas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Selection extends js.Object {
  def cancel(): Unit = js.native
  def cancel(keepEvent: Boolean): Unit = js.native
  def clearSelection(): Unit = js.native
  def destroy(): Unit = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def getSelection(): js.Array[Element] = js.native
  def keepSelection(): Unit = js.native
  def off[E /* <: String */](
    ev: E,
    cb: /* import warning: importer.ImportType#apply Failed type conversion: @simonwep/selection-js.@simonwep/selection-js.SelectionEvents[E] */ js.Any
  ): this.type = js.native
  def on[E /* <: String */](
    ev: E,
    cb: /* import warning: importer.ImportType#apply Failed type conversion: @simonwep/selection-js.@simonwep/selection-js.SelectionEvents[E] */ js.Any
  ): this.type = js.native
  @JSName("option")
  def option_boundaries(name: boundaries): js.Array[String] = js.native
  @JSName("option")
  def option_boundaries(name: boundaries, value: js.Array[String]): js.Array[String] = js.native
  @JSName("option")
  def option_class(name: `class`): String = js.native
  @JSName("option")
  def option_class(name: `class`, value: String): String = js.native
  @JSName("option")
  def option_disableTouch(name: disableTouch): Boolean = js.native
  @JSName("option")
  def option_disableTouch(name: disableTouch, value: Boolean): Boolean = js.native
  @JSName("option")
  def option_mode(name: mode): Mode = js.native
  @JSName("option")
  def option_mode(name: mode, value: Mode): Mode = js.native
  @JSName("option")
  def option_scrollSpeedDivider(name: scrollSpeedDivider): Double = js.native
  @JSName("option")
  def option_scrollSpeedDivider(name: scrollSpeedDivider, value: Double): Double = js.native
  @JSName("option")
  def option_selectables(name: selectables): js.Array[String] = js.native
  @JSName("option")
  def option_selectables(name: selectables, value: js.Array[String]): js.Array[String] = js.native
  @JSName("option")
  def option_selectionAreaContainer(name: selectionAreaContainer): String | HTMLElement | (js.Array[String | HTMLElement]) = js.native
  @JSName("option")
  def option_selectionAreaContainer(name: selectionAreaContainer, value: String | HTMLElement | (js.Array[String | HTMLElement])): String | HTMLElement | (js.Array[String | HTMLElement]) = js.native
  @JSName("option")
  def option_singleClick(name: singleClick): Boolean = js.native
  @JSName("option")
  def option_singleClick(name: singleClick, value: Boolean): Boolean = js.native
  @JSName("option")
  def option_startThreshold(name: startThreshold): Double = js.native
  @JSName("option")
  def option_startThreshold(name: startThreshold, value: Double): Double = js.native
  @JSName("option")
  def option_startareas(name: startareas): js.Array[String] = js.native
  @JSName("option")
  def option_startareas(name: startareas, value: js.Array[String]): js.Array[String] = js.native
  def removeFromSelection(el: Element): Unit = js.native
  def resolveSelectables(): Unit = js.native
  @JSName("select")
  def select_0(
    query: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(selector : string | std.HTMLElement | std.ReadonlyArray<string | std.HTMLElement>): std.Array<std.Element>>[0] */ js.Any
  ): this.type = js.native
}

