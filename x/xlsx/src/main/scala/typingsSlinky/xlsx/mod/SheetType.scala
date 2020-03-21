package typingsSlinky.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xlsx.xlsxStrings.sheet
  - typingsSlinky.xlsx.xlsxStrings.chart
*/
trait SheetType extends _SheetKeys

object SheetType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chart: typingsSlinky.xlsx.xlsxStrings.chart = this.cast("chart")
  @scala.inline
  def sheet: typingsSlinky.xlsx.xlsxStrings.sheet = this.cast("sheet")
}

