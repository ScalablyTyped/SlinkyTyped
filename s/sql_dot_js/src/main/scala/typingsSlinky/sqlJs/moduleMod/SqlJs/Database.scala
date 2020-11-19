package typingsSlinky.sqlJs.moduleMod.SqlJs

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sql.js/module", "SqlJs.Database")
@js.native
class Database () extends js.Object {
  def this(data: js.Array[Double]) = this()
  def this(data: Buffer) = this()
  def this(data: js.typedarray.Uint8Array) = this()
  
  def close(): Unit = js.native
  
  def create_function(name: String, func: js.Function): Unit = js.native
  
  def each(sql: String, callback: ParamsCallback, done: js.Function0[Unit]): Unit = js.native
  def each(sql: String, params: js.Array[ValueType], callback: ParamsCallback, done: js.Function0[Unit]): Unit = js.native
  def each(sql: String, params: ParamsObject, callback: ParamsCallback, done: js.Function0[Unit]): Unit = js.native
  
  def exec(sql: String): js.Array[QueryResults] = js.native
  
  def export(): js.typedarray.Uint8Array = js.native
  
  def getRowsModified(): Double = js.native
  
  def prepare(sql: String): Statement = js.native
  def prepare(sql: String, params: js.Array[ValueType]): Statement = js.native
  def prepare(sql: String, params: ParamsObject): Statement = js.native
  
  def run(sql: String): Database = js.native
  def run(sql: String, params: js.Array[ValueType]): Database = js.native
  def run(sql: String, params: ParamsObject): Database = js.native
}
