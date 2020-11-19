package typingsSlinky.yup.mod

import typingsSlinky.std.Record
import typingsSlinky.yup.anon.Max
import typingsSlinky.yup.anon.Min
import typingsSlinky.yup.anon.Values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicArraySchema[E, T /* <: js.UndefOr[js.Array[E] | Null] */] extends Schema[T] {
  
  def compact(): this.type = js.native
  def compact(
    rejector: js.Function3[
      /* value */ InferredArrayType[T], 
      /* index */ Double, 
      /* array */ js.Array[InferredArrayType[T]], 
      Boolean
    ]
  ): this.type = js.native
  
  def ensure(): this.type = js.native
  
  def equals(arrayOfValues: js.Array[T | Ref_ | Null]): this.type = js.native
  def equals(arrayOfValues: js.Array[T | Ref_ | Null], message: js.UndefOr[TestOptionsMessage[Values, _]]): this.type = js.native
  
  var innerType: Schema[E] = js.native
  
  def max(limit: Double): this.type = js.native
  def max(limit: Double, message: js.UndefOr[TestOptionsMessage[Max, _]]): this.type = js.native
  def max(limit: Ref_): this.type = js.native
  def max(limit: Ref_, message: js.UndefOr[TestOptionsMessage[Max, _]]): this.type = js.native
  
  def min(limit: Double): this.type = js.native
  def min(limit: Double, message: js.UndefOr[TestOptionsMessage[Min, _]]): this.type = js.native
  def min(limit: Ref_): this.type = js.native
  def min(limit: Ref_, message: js.UndefOr[TestOptionsMessage[Min, _]]): this.type = js.native
  
  // This doesn't narrow the type of the schema like the more primitive oneOf calls
  // it would be very complex to do that accurately with the subtypes, and it's not
  // really worth it because the oneOf check is a shallow (==) comparison so it rarely
  // applies to arrays anyway.
  def oneOf(arrayOfValues: js.Array[T | Ref_ | Null]): this.type = js.native
  def oneOf(arrayOfValues: js.Array[T | Ref_ | Null], message: js.UndefOr[TestOptionsMessage[Values, _]]): this.type = js.native
  
  def test(name: String, message: TestOptionsMessage[js.Object, _], test: TestFunction): this.type = js.native
  def test(options: TestOptions[Record[String, _]]): this.type = js.native
}
