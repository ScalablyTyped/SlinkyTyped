package typingsSlinky.sortDashArray

import typingsSlinky.sortDashArray.sortDashArrayMod.ColumnNames
import typingsSlinky.sortDashArray.sortDashArrayMod.CustomOrder
import typingsSlinky.sortDashArray.sortDashArrayMod.CustomOrderTypes
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sort-array", JSImport.Namespace)
@js.native
object sortDashArrayMod extends js.Object {
  def apply(recordset: js.Array[js.Object], columnNames: String): js.Array[js.Object] = js.native
  def apply(recordset: js.Array[js.Object], columnNames: String, customOrder: Record[String, js.Array[_]]): js.Array[js.Object] = js.native
  def apply(recordset: js.Array[js.Object], columnNames: js.Array[String]): js.Array[js.Object] = js.native
  def apply(
    recordset: js.Array[js.Object],
    columnNames: js.Array[String],
    customOrder: Record[String, js.Array[_]]
  ): js.Array[js.Object] = js.native
  def apply[T](recordset: js.Array[T], columnNames: ColumnNames[T]): js.Array[T] = js.native
  def apply[T](recordset: js.Array[T], columnNames: ColumnNames[T], customOrder: Partial[CustomOrder[T]]): js.Array[T] = js.native
  type ColumnNames[T] = String | js.Array[String]
  type CustomOrder[T] = Record[String, CustomOrderTypes[T]]
  type CustomOrderTypes[T] = js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
}

