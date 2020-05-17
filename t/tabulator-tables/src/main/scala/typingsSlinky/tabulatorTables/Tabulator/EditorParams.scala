package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tabulatorTables.Tabulator.NumberParams
  - typingsSlinky.tabulatorTables.Tabulator.CheckboxParams
  - typingsSlinky.tabulatorTables.Tabulator.SelectParams
  - typingsSlinky.tabulatorTables.Tabulator.AutoCompleteParams
  - typingsSlinky.tabulatorTables.Tabulator.InputParams
  - typingsSlinky.tabulatorTables.Tabulator.TextAreaParams
  - js.Function1[/ * cell * / typingsSlinky.tabulatorTables.Tabulator.CellComponent, js.Object]
*/
trait EditorParams extends js.Object

object EditorParams {
  @scala.inline
  implicit def apply(value: AutoCompleteParams): EditorParams = value.asInstanceOf[EditorParams]
  @scala.inline
  implicit def apply(value: CheckboxParams): EditorParams = value.asInstanceOf[EditorParams]
  @scala.inline
  implicit def apply(value: js.Function1[/* cell */ CellComponent, js.Object]): EditorParams = value.asInstanceOf[EditorParams]
  @scala.inline
  implicit def apply(value: InputParams): EditorParams = value.asInstanceOf[EditorParams]
  @scala.inline
  implicit def apply(value: NumberParams): EditorParams = value.asInstanceOf[EditorParams]
  @scala.inline
  implicit def apply(value: SelectParams): EditorParams = value.asInstanceOf[EditorParams]
  @scala.inline
  implicit def apply(value: TextAreaParams): EditorParams = value.asInstanceOf[EditorParams]
}

