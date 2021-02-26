package typingsSlinky.superstruct

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Omit
import typingsSlinky.std.Pick
import typingsSlinky.superstruct.structMod.Struct
import typingsSlinky.superstruct.structMod.StructContext
import typingsSlinky.superstruct.structMod.StructResult
import typingsSlinky.superstruct.xtrasMod.Assign
import typingsSlinky.superstruct.xtrasMod.InferObjectStruct
import typingsSlinky.superstruct.xtrasMod.ObjectSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesMod {
  
  @JSImport("superstruct/lib/utilities", "assign")
  @js.native
  def assign[A /* <: ObjectSchema */, B /* <: ObjectSchema */](Structs: js.Tuple2[InferObjectStruct[A], InferObjectStruct[B]]): InferObjectStruct[Assign[A, B]] = js.native
  @JSImport("superstruct/lib/utilities", "assign")
  @js.native
  def assign[A /* <: ObjectSchema */, B /* <: ObjectSchema */, C /* <: ObjectSchema */](Structs: js.Tuple3[InferObjectStruct[A], InferObjectStruct[B], InferObjectStruct[C]]): InferObjectStruct[Assign[Assign[A, B], C]] = js.native
  @JSImport("superstruct/lib/utilities", "assign")
  @js.native
  def assign[A /* <: ObjectSchema */, B /* <: ObjectSchema */, C /* <: ObjectSchema */, D /* <: ObjectSchema */](
    Structs: js.Tuple4[InferObjectStruct[A], InferObjectStruct[B], InferObjectStruct[C], InferObjectStruct[D]]
  ): InferObjectStruct[Assign[Assign[Assign[A, B], C], D]] = js.native
  @JSImport("superstruct/lib/utilities", "assign")
  @js.native
  def assign[A /* <: ObjectSchema */, B /* <: ObjectSchema */, C /* <: ObjectSchema */, D /* <: ObjectSchema */, E /* <: ObjectSchema */](
    Structs: js.Tuple5[
      InferObjectStruct[A], 
      InferObjectStruct[B], 
      InferObjectStruct[C], 
      InferObjectStruct[D], 
      InferObjectStruct[E]
    ]
  ): InferObjectStruct[Assign[Assign[Assign[Assign[A, B], C], D], E]] = js.native
  
  @JSImport("superstruct/lib/utilities", "dynamic")
  @js.native
  def dynamic[T](fn: js.Function2[/* value */ js.Any, /* ctx */ StructContext, Struct[T, _]]): Struct[T, _] = js.native
  
  @JSImport("superstruct/lib/utilities", "omit")
  @js.native
  def omit[S /* <: ObjectSchema */, K /* <: /* keyof S */ String */](struct: InferObjectStruct[S], keys: js.Array[K]): InferObjectStruct[Omit[S, K]] = js.native
  
  @JSImport("superstruct/lib/utilities", "partial")
  @js.native
  def partial[S /* <: ObjectSchema */](struct: S): InferObjectStruct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: superstruct.superstruct/lib/struct.Struct<superstruct.superstruct/lib/struct.StructType<S[K]> | undefined, any>}
    */ typingsSlinky.superstruct.superstructStrings.partial with TopLevel[S]
  ] = js.native
  @JSImport("superstruct/lib/utilities", "partial")
  @js.native
  def partial[S /* <: ObjectSchema */](struct: InferObjectStruct[S]): InferObjectStruct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: superstruct.superstruct/lib/struct.Struct<superstruct.superstruct/lib/struct.StructType<S[K]> | undefined, any>}
    */ typingsSlinky.superstruct.superstructStrings.partial with TopLevel[S]
  ] = js.native
  
  @JSImport("superstruct/lib/utilities", "pick")
  @js.native
  def pick[S /* <: ObjectSchema */, K /* <: /* keyof S */ String */](struct: InferObjectStruct[S], keys: js.Array[K]): InferObjectStruct[Pick[S, K]] = js.native
  
  @JSImport("superstruct/lib/utilities", "struct")
  @js.native
  def struct[T](
    name: String,
    validator: js.Function2[/* value */ js.Any, /* context */ StructContext, StructResult]
  ): Struct[T, Null] = js.native
  
  @JSImport("superstruct/lib/utilities", "lazy")
  @js.native
  def `lazy`[T](fn: js.Function0[Struct[T, _]]): Struct[T, _] = js.native
}
