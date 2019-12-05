package typingsSlinky.slickgrid.Slick.Controls

import typingsSlinky.slickgrid.Slick.Column
import typingsSlinky.slickgrid.Slick.Grid
import typingsSlinky.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Controls.ColumnPicker")
@js.native
class ColumnPicker[T /* <: SlickData */] protected () extends js.Object {
  def this(columns: js.Array[Column[T]], grid: Grid[T], options: SlickColumnPickerOptions) = this()
  def destroy(): Unit = js.native
  def getAllColumns(): js.Array[Column[T]] = js.native
}

