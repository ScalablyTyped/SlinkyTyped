package typingsSlinky.slickgrid.global.Slick

import typingsSlinky.slickgrid.Slick.ColumnMetadata
import typingsSlinky.slickgrid.Slick.SlickData
import typingsSlinky.slickgrid.Slick.SlickGridCheckBoxSelectColumnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.CheckboxSelectColumn")
@js.native
class CheckboxSelectColumn[T /* <: SlickData */] ()
  extends typingsSlinky.slickgrid.Slick.CheckboxSelectColumn[T] {
  def this(options: SlickGridCheckBoxSelectColumnOptions) = this()
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def getColumnDefinition(): ColumnMetadata[T] = js.native
  /* CompleteClass */
  override def init(grid: typingsSlinky.slickgrid.Slick.Grid[T]): Unit = js.native
}

