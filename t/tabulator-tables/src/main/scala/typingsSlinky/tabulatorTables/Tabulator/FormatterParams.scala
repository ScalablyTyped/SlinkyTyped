package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tabulatorTables.Tabulator.MoneyParams
  - typingsSlinky.tabulatorTables.Tabulator.ImageParams
  - typingsSlinky.tabulatorTables.Tabulator.LinkParams
  - typingsSlinky.tabulatorTables.Tabulator.DateTimeParams
  - typingsSlinky.tabulatorTables.Tabulator.DateTimeDifferenceParams
  - typingsSlinky.tabulatorTables.Tabulator.TickCrossParams
  - typingsSlinky.tabulatorTables.Tabulator.TrafficParams
  - typingsSlinky.tabulatorTables.Tabulator.StarRatingParams
  - typingsSlinky.tabulatorTables.Tabulator.JSONRecord
  - js.Function1[/ * cell * / typingsSlinky.tabulatorTables.Tabulator.CellComponent, js.Object]
*/
trait FormatterParams extends js.Object

object FormatterParams {
  @scala.inline
  implicit def apply(value: DateTimeDifferenceParams): FormatterParams = value.asInstanceOf[FormatterParams]
  @scala.inline
  implicit def apply(value: DateTimeParams): FormatterParams = value.asInstanceOf[FormatterParams]
  @scala.inline
  implicit def apply(value: js.Function1[/* cell */ CellComponent, js.Object]): FormatterParams = value.asInstanceOf[FormatterParams]
  @scala.inline
  implicit def apply(value: ImageParams): FormatterParams = value.asInstanceOf[FormatterParams]
  @scala.inline
  implicit def apply(value: JSONRecord): FormatterParams = value.asInstanceOf[FormatterParams]
  @scala.inline
  implicit def apply(value: LinkParams): FormatterParams = value.asInstanceOf[FormatterParams]
  @scala.inline
  implicit def apply(value: MoneyParams): FormatterParams = value.asInstanceOf[FormatterParams]
  @scala.inline
  implicit def apply(value: StarRatingParams): FormatterParams = value.asInstanceOf[FormatterParams]
  @scala.inline
  implicit def apply(value: TickCrossParams): FormatterParams = value.asInstanceOf[FormatterParams]
  @scala.inline
  implicit def apply(value: TrafficParams): FormatterParams = value.asInstanceOf[FormatterParams]
}

