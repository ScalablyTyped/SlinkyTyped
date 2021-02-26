package typingsSlinky.ydnDb.ydn.db

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends StObject {
  
  def count(): Request = js.native
  
  def list(): Request = js.native
  def list(limit: Double): Request = js.native
  
  def open(callback: js.Function1[/* ICursor */ js.Any, Unit], Iterator: js.Any, TransactionMode: js.Any): Request = js.native
  
  def order(field_name: String): Query = js.native
  def order(field_name: String, descending: Boolean): Query = js.native
  def order(field_names: js.Array[String]): Query = js.native
  def order(field_names: js.Array[String], descending: Boolean): Query = js.native
  
  def patch(Object: js.Any): Request = js.native
  def patch(field_name: String, value: js.Any): Request = js.native
  def patch(field_names: js.Array[String], value: js.Array[_]): Request = js.native
  
  def reverse(): Query = js.native
  
  def where(field_name: String, op: Op, value: js.Any): js.Any = js.native
  def where(field_name: String, op: Op, value: js.Any, op2: Op, value2: js.Any): js.Any = js.native
}
