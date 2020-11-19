package typingsSlinky.slickgrid.global.Slick

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import typingsSlinky.slickgrid.Slick.Column
import typingsSlinky.slickgrid.Slick.DataProvider
import typingsSlinky.slickgrid.Slick.GridOptions
import typingsSlinky.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Slick.Grid")
@js.native
class Grid[T /* <: SlickData */] protected ()
  extends typingsSlinky.slickgrid.Slick.Grid[T] {
  /**
    * Create an instance of the grid.
    * @param container Container node to create the grid in. This can be a DOM Element, a jQuery node, or a jQuery selector.
    * @param data Databinding source. This can either be a regular JavaScript array or a custom object exposing getItem(index) and getLength() functions.
    * @param columns An array of column definition objects. See Column Options for a list of options that can be included on each column definition object.
    * @param options Additional options.  See Grid Options for a list of options that can be included.
    **/
  def this(container: String, data: js.Array[T], columns: js.Array[Column[T]], options: GridOptions[T]) = this()
  def this(container: String, data: DataProvider[T], columns: js.Array[Column[T]], options: GridOptions[T]) = this()
  def this(
    container: JQuery[HTMLElement],
    data: js.Array[T],
    columns: js.Array[Column[T]],
    options: GridOptions[T]
  ) = this()
  def this(
    container: JQuery[HTMLElement],
    data: DataProvider[T],
    columns: js.Array[Column[T]],
    options: GridOptions[T]
  ) = this()
  def this(container: HTMLElement, data: js.Array[T], columns: js.Array[Column[T]], options: GridOptions[T]) = this()
  def this(
    container: HTMLElement,
    data: DataProvider[T],
    columns: js.Array[Column[T]],
    options: GridOptions[T]
  ) = this()
}
