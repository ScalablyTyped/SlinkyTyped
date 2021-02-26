package typingsSlinky.yup

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def array: typingsSlinky.yup.mod.ArraySchemaConstructor = typingsSlinky.yup.mod.^.asInstanceOf[js.Dynamic].selectDynamic("array").asInstanceOf[typingsSlinky.yup.mod.ArraySchemaConstructor]
  
  @scala.inline
  def bool: typingsSlinky.yup.mod.BooleanSchemaConstructor = typingsSlinky.yup.mod.^.asInstanceOf[js.Dynamic].selectDynamic("bool").asInstanceOf[typingsSlinky.yup.mod.BooleanSchemaConstructor]
  
  @scala.inline
  def boolean: typingsSlinky.yup.mod.BooleanSchemaConstructor = typingsSlinky.yup.mod.^.asInstanceOf[js.Dynamic].selectDynamic("boolean").asInstanceOf[typingsSlinky.yup.mod.BooleanSchemaConstructor]
  
  @scala.inline
  def date: typingsSlinky.yup.mod.DateSchemaConstructor = typingsSlinky.yup.mod.^.asInstanceOf[js.Dynamic].selectDynamic("date").asInstanceOf[typingsSlinky.yup.mod.DateSchemaConstructor]
  
  @scala.inline
  def mixed: typingsSlinky.yup.mod.MixedSchemaConstructor = typingsSlinky.yup.mod.^.asInstanceOf[js.Dynamic].selectDynamic("mixed").asInstanceOf[typingsSlinky.yup.mod.MixedSchemaConstructor]
  
  @scala.inline
  def number: typingsSlinky.yup.mod.NumberSchemaConstructor = typingsSlinky.yup.mod.^.asInstanceOf[js.Dynamic].selectDynamic("number").asInstanceOf[typingsSlinky.yup.mod.NumberSchemaConstructor]
  
  @scala.inline
  def string: typingsSlinky.yup.mod.StringSchemaConstructor = typingsSlinky.yup.mod.^.asInstanceOf[js.Dynamic].selectDynamic("string").asInstanceOf[typingsSlinky.yup.mod.StringSchemaConstructor]
  
  type AssertingTestFunction[T, C] = js.ThisFunction1[
    /* this */ typingsSlinky.yup.mod.TestContext[C], 
    /* value */ js.Any, 
    /* is T */ scala.Boolean
  ]
  
  type Id[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends object? yup.yup.InnerInferType<T[K]> : T[K]}
    */ typingsSlinky.yup.yupStrings.Id with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type InferType[T] = typingsSlinky.yup.mod.InnerInferType[js.Any]
  
  type InferredArrayType[T] = T
  
  type InnerInferType[T] = (typingsSlinky.yup.mod.Id[
    typingsSlinky.yup.mod.NotRequiredProps[_] with typingsSlinky.yup.mod.RequiredProps[_]
  ]) | typingsSlinky.yup.mod.InnerInferTypeArray[js.Any] | typingsSlinky.yup.mod.PreserveOptionals[T]
  
  type KeyOfUndefined[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: -? undefined extends T[P]? P : never}[keyof T] */ js.Any
  
  type Lazy_ = typingsSlinky.yup.mod.Schema[js.Any, js.Object]
  
  type LocaleValue = java.lang.String | (js.Function1[/* params */ typingsSlinky.yup.mod.FormatErrorParams, java.lang.String])
  
  /** If `T` is optional, returns optional `U`. */
  type MaintainOptionality[T, U] = js.UndefOr[U]
  
  type NotRequiredProps[T] = typingsSlinky.std.Partial[typingsSlinky.std.Pick[T, typingsSlinky.yup.mod.KeyOfUndefined[T]]]
  
  type ObjectSchemaDefinition[T /* <: js.UndefOr[js.Object | scala.Null] */, C] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ field in keyof T ]: yup.yup.Schema<T[field], C> | yup.yup.MixedSchema<T[field], C> | yup.yup.Ref}
    */ typingsSlinky.yup.yupStrings.ObjectSchemaDefinition with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type PreserveNull[T] = scala.Null
  
  type PreserveOptionals[T] = typingsSlinky.yup.mod.PreserveNull[T] | typingsSlinky.yup.mod.PreserveUndefined[T]
  
  type PreserveUndefined[T] = js.UndefOr[scala.Nothing]
  
  type RequiredProps[T] = typingsSlinky.std.Pick[
    T, 
    typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, typingsSlinky.yup.mod.KeyOfUndefined[T]]
  ]
  
  type Shape[T /* <: js.UndefOr[js.Object | scala.Null] */, U /* <: js.Object */] = (typingsSlinky.yup.yupStrings.Shape with org.scalablytyped.runtime.TopLevel[js.Any] with U) | typingsSlinky.yup.mod.PreserveOptionals[T]
  
  type TestFunction[T, C] = js.ThisFunction1[
    /* this */ typingsSlinky.yup.mod.TestContext[C], 
    /* value */ T, 
    scala.Boolean | typingsSlinky.yup.mod.ValidationError | (js.Promise[scala.Boolean | typingsSlinky.yup.mod.ValidationError])
  ]
  
  type TestOptionsMessage[Extra /* <: typingsSlinky.std.Record[java.lang.String, _] */, R] = java.lang.String | (js.Function1[/* params */ Extra with typingsSlinky.yup.anon.PartialTestMessageParams, R])
  
  type TransformFunction[T] = js.ThisFunction2[/* this */ T, /* value */ js.Any, /* originalValue */ js.Any, js.Any]
  
  type WhenOptions[T] = typingsSlinky.yup.mod.WhenOptionsBuilderFunction[T] | typingsSlinky.yup.mod.WhenOptionsBuilderObject
  
  type WhenOptionsBuilderObject = typingsSlinky.yup.anon.Is | js.Object
  
  type WhenOptionsBuilderObjectIs = (js.Function1[/* repeated */ js.Any, scala.Boolean]) | scala.Boolean | scala.Double | scala.Null | js.Object | java.lang.String
  
  @scala.inline
  def addMethod[T /* <: typingsSlinky.yup.mod.Schema[_, js.Object] */](
    schemaCtor: typingsSlinky.yup.mod.AnySchemaConstructor,
    name: java.lang.String,
    method: js.ThisFunction1[/* this */ T, /* repeated */ js.Any, T]
  ): scala.Unit = (typingsSlinky.yup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addMethod")(schemaCtor.asInstanceOf[js.Any], name.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def isSchema(obj: js.Any): /* is yup.yup.Schema<any, object> */ scala.Boolean = typingsSlinky.yup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isSchema")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is yup.yup.Schema<any, object> */ scala.Boolean]
  
  @scala.inline
  def `lazy`[T](fn: js.Function1[/* value */ T, typingsSlinky.yup.mod.Schema[T, js.Object]]): typingsSlinky.yup.mod.Lazy_ = typingsSlinky.yup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(fn.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.yup.mod.Lazy_]
  
  @scala.inline
  def `object`: typingsSlinky.yup.mod.ObjectSchemaConstructor = typingsSlinky.yup.mod.^.asInstanceOf[js.Dynamic].selectDynamic("object").asInstanceOf[typingsSlinky.yup.mod.ObjectSchemaConstructor]
  
  @scala.inline
  def reach[T, C](schema: typingsSlinky.yup.mod.Schema[T, C], path: java.lang.String): typingsSlinky.yup.mod.Schema[T, C] = (typingsSlinky.yup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reach")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.yup.mod.Schema[T, C]]
  @scala.inline
  def reach[T, C](
    schema: typingsSlinky.yup.mod.Schema[T, C],
    path: java.lang.String,
    value: js.UndefOr[scala.Nothing],
    context: js.Any
  ): typingsSlinky.yup.mod.Schema[T, C] = (typingsSlinky.yup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reach")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.yup.mod.Schema[T, C]]
  @scala.inline
  def reach[T, C](schema: typingsSlinky.yup.mod.Schema[T, C], path: java.lang.String, value: js.Any): typingsSlinky.yup.mod.Schema[T, C] = (typingsSlinky.yup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reach")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.yup.mod.Schema[T, C]]
  @scala.inline
  def reach[T, C](schema: typingsSlinky.yup.mod.Schema[T, C], path: java.lang.String, value: js.Any, context: js.Any): typingsSlinky.yup.mod.Schema[T, C] = (typingsSlinky.yup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reach")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.yup.mod.Schema[T, C]]
  
  @scala.inline
  def ref(path: java.lang.String): typingsSlinky.yup.mod.Ref_ = typingsSlinky.yup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ref")(path.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.yup.mod.Ref_]
  @scala.inline
  def ref(path: java.lang.String, options: typingsSlinky.yup.anon.ContextPrefix): typingsSlinky.yup.mod.Ref_ = (typingsSlinky.yup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ref")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.yup.mod.Ref_]
  
  @scala.inline
  def setLocale(customLocale: typingsSlinky.yup.mod.LocaleObject): scala.Unit = typingsSlinky.yup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(customLocale.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
