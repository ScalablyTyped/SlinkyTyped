package typingsSlinky.tableResolver

import typingsSlinky.tableResolver.anon.Column
import typingsSlinky.tableResolver.anon.Columns
import typingsSlinky.tableResolver.anon.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("table-resolver", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def columnChildren[T](args: Columns[T]): js.Array[T] = js.native
  def headerRows[T](args: Columns[T]): js.Array[T] = js.native
  def nested[T](args: Column[T]): T = js.native
  def resolve[T](args: Method[T]): js.Function1[/* data */ js.Any, js.Array[T]] = js.native
}

