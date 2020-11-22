package typingsSlinky.yup.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Exclude
import typingsSlinky.std.Record
import typingsSlinky.yup.anon.Values
import typingsSlinky.yup.yupBooleans.`false`
import typingsSlinky.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectSchema[T /* <: js.UndefOr[js.Object | Null] */, C] extends Schema[T, C] {
  
  def camelCase(): ObjectSchema[T, C] = js.native
  
  def concat[U /* <: js.Object */](schema: ObjectSchema[U, C]): ObjectSchema[T with U, C] = js.native
  
  def constantCase(): ObjectSchema[T, C] = js.native
  
  def defined(): ObjectSchema[Exclude[T, js.UndefOr[scala.Nothing]], C] = js.native
  
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): ObjectSchema[U, C] = js.native
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: js.UndefOr[TestOptionsMessage[Values, _]]): ObjectSchema[U, C] = js.native
  
  var fields: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: yup.yup.Schema<T[k], C>}
    */ typingsSlinky.yup.yupStrings.ObjectSchema with TopLevel[T] = js.native
  
  def from(fromKey: String, toKey: String): ObjectSchema[T, C] = js.native
  def from(fromKey: String, toKey: String, alias: Boolean): ObjectSchema[T, C] = js.native
  
  def noUnknown(): ObjectSchema[T, C] = js.native
  def noUnknown(onlyKnownKeys: js.UndefOr[scala.Nothing], message: js.UndefOr[TestOptionsMessage[js.Object, _]]): ObjectSchema[T, C] = js.native
  def noUnknown(onlyKnownKeys: Boolean): ObjectSchema[T, C] = js.native
  def noUnknown(onlyKnownKeys: Boolean, message: js.UndefOr[TestOptionsMessage[js.Object, _]]): ObjectSchema[T, C] = js.native
  
  def notRequired(): ObjectSchema[js.UndefOr[T], C] = js.native
  
  def nullable(): ObjectSchema[T | Null, C] = js.native
  def nullable(isNullable: Boolean): ObjectSchema[T, C] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): ObjectSchema[Exclude[T, Null], C] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): ObjectSchema[T | Null, C] = js.native
  
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): ObjectSchema[U, C] = js.native
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: js.UndefOr[TestOptionsMessage[Values, _]]): ObjectSchema[U, C] = js.native
  
  def optional(): ObjectSchema[js.UndefOr[T], C] = js.native
  
  def required(): ObjectSchema[Exclude[T, js.UndefOr[Null]], C] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): ObjectSchema[Exclude[T, js.UndefOr[Null]], C] = js.native
  
  def shape[U /* <: js.Object */](fields: ObjectSchemaDefinition[U, C]): ObjectSchema[Shape[T, U], C] = js.native
  def shape[U /* <: js.Object */](fields: ObjectSchemaDefinition[U, C], noSortEdges: js.Array[js.Tuple2[String, String]]): ObjectSchema[Shape[T, U], C] = js.native
  
  def snakeCase(): ObjectSchema[T, C] = js.native
  
  def test(
    name: String,
    message: TestOptionsMessage[js.Object, _],
    test: TestFunction[js.UndefOr[T | Null], C]
  ): this.type = js.native
  def test(options: TestOptions[Record[String, _], C]): this.type = js.native
  def test[U /* <: T */](options: AssertingTestOptions[U, Record[String, _], C]): ObjectSchema[U, C] = js.native
  @JSName("test")
  def test_U_T_ObjectSchema[U /* <: T */](name: String, message: TestOptionsMessage[js.Object, _], test: AssertingTestFunction[U, C]): ObjectSchema[U, C] = js.native
  
  def transformKeys(callback: js.Function1[/* key */ js.Any, _]): Unit = js.native
  
  def unknown(): ObjectSchema[T, C] = js.native
  def unknown(allow: js.UndefOr[scala.Nothing], message: js.UndefOr[TestOptionsMessage[js.Object, _]]): ObjectSchema[T, C] = js.native
  def unknown(allow: Boolean): ObjectSchema[T, C] = js.native
  def unknown(allow: Boolean, message: js.UndefOr[TestOptionsMessage[js.Object, _]]): ObjectSchema[T, C] = js.native
}
