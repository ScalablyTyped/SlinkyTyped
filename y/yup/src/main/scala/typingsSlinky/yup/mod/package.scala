package typingsSlinky.yup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Id[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typingsSlinky.yup.yupStrings.Id with org.scalablytyped.runtime.TopLevel[T]
  type InferType[T] = typingsSlinky.yup.mod.InnerInferType[js.Any]
  type InferredArrayType[T] = T
  type KeyOfUndefined[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: -? undefined extends T[P]? P : never}[keyof T] */ js.Any
  type Lazy_ = typingsSlinky.yup.mod.Schema[js.Any]
  type NotRequiredProps[T] = typingsSlinky.std.Partial[typingsSlinky.std.Pick[T, typingsSlinky.yup.mod.KeyOfUndefined[T]]]
  type ObjectSchemaDefinition[T /* <: js.UndefOr[js.Object | scala.Null] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ field in keyof T ]: yup.yup.Schema<T[field]> | yup.yup.Ref}
    */ typingsSlinky.yup.yupStrings.ObjectSchemaDefinition with org.scalablytyped.runtime.TopLevel[T]
  type PreserveNull[T] = scala.Null
  type RequiredProps[T] = typingsSlinky.std.Pick[
    T, 
    typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, typingsSlinky.yup.mod.KeyOfUndefined[T]]
  ]
  type TransformFunction[T] = js.ThisFunction2[/* this */ T, /* value */ js.Any, /* originalValue */ js.Any, js.Any]
}
