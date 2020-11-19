package typingsSlinky.utilityTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Array
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.Extract
import typingsSlinky.std.NonNullable
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import typingsSlinky.std.ReadonlyArray
import typingsSlinky.std.Record
import typingsSlinky.std.Required
import typingsSlinky.utilityTypes.anon.BrandU
import typingsSlinky.utilityTypes.utilityTypesStrings._DeepNonNullableObject
import typingsSlinky.utilityTypes.utilityTypesStrings._DeepPartialObject
import typingsSlinky.utilityTypes.utilityTypesStrings._DeepReadonlyObject
import typingsSlinky.utilityTypes.utilityTypesStrings._DeepRequiredObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("utility-types/dist/mapped-types", JSImport.Namespace)
@js.native
object mappedTypesMod extends js.Object {
  
  @js.native
  trait DeepNonNullableArray[T] extends Array[DeepNonNullable[NonNullable[T]]]
  
  @js.native
  trait DeepPartialArray[T] extends Array[DeepPartial[T]]
  
  @js.native
  trait DeepReadonlyArray[T] extends ReadonlyArray[DeepReadonly[T]]
  
  @js.native
  trait DeepRequiredArray[T] extends Array[DeepRequired[NonUndefined[T]]]
  
  type Assign[T /* <: js.Object */, U /* <: js.Object */, I] = Pick[I, /* keyof I */ String]
  
  type AugmentedRequired[T /* <: js.Object */, K /* <: /* keyof T */ String */] = (Omit[T, K]) with (Required[Pick[T, K]])
  
  type Brand[T, U] = T with BrandU[U]
  
  type DeepNonNullable[T] = T | DeepNonNullableObject[T] | (DeepNonNullableArray[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ])
  
  type DeepNonNullableObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? utility-types.utility-types/dist/mapped-types.DeepNonNullable<std.NonNullable<T[P]>>}
    */ _DeepNonNullableObject with TopLevel[T]
  
  type DeepPartial[T] = js.UndefOr[T | DeepPartialObject[T] | DeepPartialArray[js.Any]]
  
  type DeepPartialObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? utility-types.utility-types/dist/mapped-types.DeepPartial<T[P]>}
    */ _DeepPartialObject with TopLevel[T]
  
  type DeepReadonly[T] = T | DeepReadonlyObject[js.Any] | DeepReadonlyArray[js.Any]
  
  type DeepReadonlyObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: utility-types.utility-types/dist/mapped-types.DeepReadonly<T[P]>}
    */ _DeepReadonlyObject with TopLevel[T]
  
  type DeepRequired[T] = T | DeepRequiredObject[T] | (DeepRequiredArray[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ])
  
  type DeepRequiredObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? utility-types.utility-types/dist/mapped-types.DeepRequired<utility-types.utility-types/dist/mapped-types.NonUndefined<T[P]>>}
    */ _DeepRequiredObject with TopLevel[T]
  
  type Diff[T /* <: js.Object */, U /* <: js.Object */] = Pick[T, SetDifference[/* keyof T */ String, /* keyof U */ String]]
  
  type Exact[A /* <: js.Object */] = A with typingsSlinky.utilityTypes.anon.Brand[A]
  
  type FunctionKeys[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? utility-types.utility-types/dist/mapped-types.NonUndefined<T[K]> extends std.Function? K : never}[keyof T] */ js.Any
  
  type IfEquals[X, Y, A, B] = B | A
  
  type Intersection[T /* <: js.Object */, U /* <: js.Object */] = Pick[T, Extract[/* keyof T */ String, /* keyof U */ String]]
  
  type Mutable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: T[P]}
    */ typingsSlinky.utilityTypes.utilityTypesStrings.Mutable with TopLevel[T]
  
  type MutableKeys[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: -? utility-types.utility-types/dist/mapped-types.IfEquals<{[ Q in P ]: T[P]}, {-readonly [ Q in P ]: T[P]}, P, never>}[keyof T] */ js.Any
  
  type NonFunctionKeys[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? utility-types.utility-types/dist/mapped-types.NonUndefined<T[K]> extends std.Function? never : K}[keyof T] */ js.Any
  
  type NonUndefined[A] = A
  
  type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, SetDifference[/* keyof T */ String, K]]
  
  type OmitByValue[T, ValueType] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: -? T[Key] extends ValueType? never : Key}[keyof T] */ js.Any
  ]
  
  type OmitByValueExact[T, ValueType] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: -? [ValueType] extends [T[Key]]? [T[Key]] extends [ValueType]? never : Key : Key}[keyof T] */ js.Any
  ]
  
  type Optional[T /* <: js.Object */, K /* <: /* keyof T */ String */] = (Omit[T, K]) with (Partial[Pick[T, K]])
  
  type OptionalKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? {} extends std.Pick<T, K>? K : never}[keyof T] */ js.Any
  
  type Overwrite[T /* <: js.Object */, U /* <: js.Object */, I] = Pick[I, /* keyof I */ String]
  
  type PickByValue[T, ValueType] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: -? T[Key] extends ValueType? Key : never}[keyof T] */ js.Any
  ]
  
  type PickByValueExact[T, ValueType] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: -? [ValueType] extends [T[Key]]? [T[Key]] extends [ValueType]? Key : never : never}[keyof T] */ js.Any
  ]
  
  type PromiseType[T /* <: js.Promise[_] */] = js.Any
  
  type ReadonlyKeys[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: -? utility-types.utility-types/dist/mapped-types.IfEquals<{[ Q in P ]: T[P]}, {-readonly [ Q in P ]: T[P]}, never, P>}[keyof T] */ js.Any
  
  type RequiredKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? {} extends std.Pick<T, K>? never : K}[keyof T] */ js.Any
  
  type SetComplement[A, A1 /* <: A */] = SetDifference[A, A1]
  
  type SetDifference[A, B] = A
  
  type SetIntersection[A, B] = A
  
  type Subtract[T /* <: T1 */, T1 /* <: js.Object */] = Pick[T, SetComplement[/* keyof T */ String, /* keyof T1 */ String]]
  
  type SymmetricDifference[A, B] = SetDifference[A | B, A with B]
  
  type UnionToIntersection[U] = js.Any
  
  type Unionize[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: {[ Q in P ]: T[P]}}[keyof T] */ js.Any
  
  type ValuesType[T /* <: js.Array[_] | ArrayLike[_] | (Record[_, _]) */] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  type Writable[T] = Mutable[T]
  
  type WritableKeys[T /* <: js.Object */] = MutableKeys[T]
}
