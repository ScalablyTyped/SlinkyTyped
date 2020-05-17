package typingsSlinky.tabulatorTables.Tabulator

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tabulatorTables.Tabulator.RowComponent
  - typingsSlinky.std.HTMLElement
  - java.lang.String
  - scala.Double
  - js.Array[scala.Double | java.lang.String]
*/
trait RowLookup extends js.Object

object RowLookup {
  @scala.inline
  implicit def apply(value: js.Array[Double | String]): RowLookup = value.asInstanceOf[RowLookup]
  @scala.inline
  implicit def apply(value: Double): RowLookup = value.asInstanceOf[RowLookup]
  @scala.inline
  implicit def apply(value: HTMLElement): RowLookup = value.asInstanceOf[RowLookup]
  @scala.inline
  implicit def apply(value: RowComponent): RowLookup = value.asInstanceOf[RowLookup]
  @scala.inline
  implicit def apply(value: String): RowLookup = value.asInstanceOf[RowLookup]
}

