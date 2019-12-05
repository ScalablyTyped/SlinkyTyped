package typingsSlinky.yup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yupMod {
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick
  import typingsSlinky.std.Record
  import typingsSlinky.yup.Anon_Is

  type Id[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typingsSlinky.yup.yupStrings.Id with T
  type InferType[T] = InnerInferType[js.Any]
  type InferredArrayType[T] = T
  type InnerInferType[T] = Id[NotRequiredProps[T] with RequiredProps[T]]
  type KeyOfUndefined[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: -? undefined extends T[P]? P : never}[keyof T] */ js.Any
  type Lazy = Schema[js.Any]
  type LocaleValue = String | (js.Function1[/* params */ FormatErrorParams, String])
  type NotRequiredProps[T] = Partial[Pick[T, KeyOfUndefined[T]]]
  type ObjectSchemaDefinition[T /* <: js.UndefOr[js.Object | Null] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ field in keyof T ]: yup.yup.Schema<T[field]> | yup.yup.Ref}
    */ typingsSlinky.yup.yupStrings.ObjectSchemaDefinition with T
  type RequiredProps[T] = Pick[T, Exclude[String, KeyOfUndefined[T]]]
  type Shape[T /* <: js.UndefOr[js.Object | Null] */, U /* <: js.Object */] = typingsSlinky.yup.yupStrings.Shape with js.Any with U
  type TestOptionsMessage[Extra /* <: Record[String, _] */, R] = String | (js.Function1[/* params */ Extra with Partial[TestMessageParams], R])
  type TransformFunction[T] = js.ThisFunction2[/* this */ T, /* value */ js.Any, /* originalValue */ js.Any, js.Any]
  type WhenOptions[T] = WhenOptionsBuilderFunction[T] | WhenOptionsBuilderObject
  type WhenOptionsBuilderObject = Anon_Is | js.Object
  type WhenOptionsBuilderObjectIs = (js.Function1[/* repeated */ js.Any, Boolean]) | Boolean | Double | Null | js.Object | String
}
