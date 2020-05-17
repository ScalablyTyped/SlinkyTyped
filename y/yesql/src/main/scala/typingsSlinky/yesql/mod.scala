package typingsSlinky.yesql

import typingsSlinky.std.Record
import typingsSlinky.yesql.anon.Pg
import typingsSlinky.yesql.anon.Sql
import typingsSlinky.yesql.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yesql", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(dir: String): String = js.native
  def apply(dir: String, options: Pg): String = js.native
  def mysql[TParams /* <: js.Object */](query: String): js.Function1[/* params */ TParams, Sql[TParams]] = js.native
  def pg[TParams /* <: js.Object */](query: String): js.Function1[/* params */ TParams, Text[TParams]] = js.native
  type AnyParams = Record[String, js.Any]
}

