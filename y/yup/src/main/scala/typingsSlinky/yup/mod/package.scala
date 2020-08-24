package typingsSlinky.yup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AssertingTestFunction[T] = js.ThisFunction1[
    /* this */ typingsSlinky.yup.mod.TestContext, 
    /* value */ js.Any, 
    /* is T */ scala.Boolean
  ]
  type Id[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typingsSlinky.yup.yupStrings.Id with org.scalablytyped.runtime.TopLevel[T]
  type InferType[T] = typingsSlinky.yup.mod.InnerInferType[js.Any]
  type InferredArrayType[T] = T
  type InnerInferType[T] = (typingsSlinky.yup.mod.Id[
    typingsSlinky.yup.mod.NotRequiredProps[_] with typingsSlinky.yup.mod.RequiredProps[_]
  ]) | typingsSlinky.yup.mod.InnerInferTypeArray[js.Any] | typingsSlinky.yup.mod.PreserveOptionals[T]
  type KeyOfUndefined[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: -? undefined extends T[P]? P : never}[keyof T] */ js.Any
  type Lazy_ = typingsSlinky.yup.mod.Schema[js.Any]
  type LocaleValue = java.lang.String | (js.Function1[/* params */ typingsSlinky.yup.mod.FormatErrorParams, java.lang.String])
  /** If `T` is optional, returns optional `U`. */
  type MaintainOptionality[T, U] = js.UndefOr[U]
  type NotRequiredProps[T] = typingsSlinky.std.Partial[typingsSlinky.std.Pick[T, typingsSlinky.yup.mod.KeyOfUndefined[T]]]
  type ObjectSchemaDefinition[T /* <: js.UndefOr[js.Object | scala.Null] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ field in keyof T ]: yup.yup.Schema<T[field]> | yup.yup.MixedSchema<T[field]> | yup.yup.Ref}
    */ typingsSlinky.yup.yupStrings.ObjectSchemaDefinition with org.scalablytyped.runtime.TopLevel[js.Any]
  type PreserveNull[T] = scala.Null
  type PreserveOptionals[T] = typingsSlinky.yup.mod.PreserveNull[T] | typingsSlinky.yup.mod.PreserveUndefined[T]
  type PreserveUndefined[T] = js.UndefOr[scala.Nothing]
  type RequiredProps[T] = typingsSlinky.std.Pick[
    T, 
    typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, typingsSlinky.yup.mod.KeyOfUndefined[T]]
  ]
  type Shape[T /* <: js.UndefOr[js.Object | scala.Null] */, U /* <: js.Object */] = (typingsSlinky.yup.yupStrings.Shape with org.scalablytyped.runtime.TopLevel[js.Any] with U) | typingsSlinky.yup.mod.PreserveOptionals[T]
  type TestFunction = js.ThisFunction1[
    /* this */ typingsSlinky.yup.mod.TestContext, 
    /* value */ js.Any, 
    scala.Boolean | typingsSlinky.yup.mod.ValidationError | (js.Promise[scala.Boolean | typingsSlinky.yup.mod.ValidationError])
  ]
  type TestOptionsMessage[Extra /* <: typingsSlinky.std.Record[java.lang.String, _] */, R] = java.lang.String | (js.Function1[/* params */ Extra with typingsSlinky.yup.anon.PartialTestMessageParams, R])
  type TransformFunction[T] = js.ThisFunction2[/* this */ T, /* value */ js.Any, /* originalValue */ js.Any, js.Any]
  type WhenOptions[T] = typingsSlinky.yup.mod.WhenOptionsBuilderFunction[T] | typingsSlinky.yup.mod.WhenOptionsBuilderObject
  type WhenOptionsBuilderObject = typingsSlinky.yup.anon.Is | js.Object
  type WhenOptionsBuilderObjectIs = (js.Function1[/* repeated */ js.Any, scala.Boolean]) | scala.Boolean | scala.Double | scala.Null | js.Object | java.lang.String
}
