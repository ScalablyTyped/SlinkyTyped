package typingsSlinky.tabulatorTables.Tabulator

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tabulatorTables.Tabulator.ColumnComponent
  - typingsSlinky.tabulatorTables.Tabulator.ColumnDefinition
  - typingsSlinky.std.HTMLElement
  - java.lang.String
*/
trait ColumnLookup extends js.Object

object ColumnLookup {
  @scala.inline
  implicit def apply(value: ColumnComponent): ColumnLookup = value.asInstanceOf[ColumnLookup]
  @scala.inline
  implicit def apply(value: ColumnDefinition): ColumnLookup = value.asInstanceOf[ColumnLookup]
  @scala.inline
  implicit def apply(value: HTMLElement): ColumnLookup = value.asInstanceOf[ColumnLookup]
  @scala.inline
  implicit def apply(value: String): ColumnLookup = value.asInstanceOf[ColumnLookup]
}

