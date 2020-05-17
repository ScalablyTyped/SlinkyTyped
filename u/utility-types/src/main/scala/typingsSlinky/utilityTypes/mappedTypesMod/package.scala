package typingsSlinky.utilityTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mappedTypesMod {
  type Assign[T /* <: js.Object */, U /* <: js.Object */, I] = typingsSlinky.std.Pick[I, /* keyof I */ java.lang.String]
  type DeepReadonlyObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in utility-types.utility-types/dist/mapped-types.NonFunctionKeys<T> ]: utility-types.utility-types/dist/mapped-types.DeepReadonly<T[P]>}
    */ typingsSlinky.utilityTypes.utilityTypesStrings._DeepReadonlyObject with org.scalablytyped.runtime.TopLevel[T]
  type Diff[T /* <: js.Object */, U /* <: js.Object */] = typingsSlinky.std.Pick[
    T, 
    typingsSlinky.utilityTypes.mappedTypesMod.SetDifference[/* keyof T */ java.lang.String, /* keyof U */ java.lang.String]
  ]
  type FunctionKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? K : never}[keyof T] */ js.Any
  type Intersection[T /* <: js.Object */, U /* <: js.Object */] = typingsSlinky.std.Pick[
    T, 
    typingsSlinky.utilityTypes.mappedTypesMod.SetIntersection[/* keyof T */ java.lang.String, /* keyof U */ java.lang.String]
  ]
  type NonFunctionKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[
    T, 
    typingsSlinky.utilityTypes.mappedTypesMod.SetComplement[/* keyof T */ java.lang.String, K]
  ]
  type Overwrite[T /* <: js.Object */, U /* <: js.Object */, I] = typingsSlinky.std.Pick[I, /* keyof I */ java.lang.String]
  type PromiseType[T] = T
  type SetComplement[A, A1 /* <: A */] = typingsSlinky.utilityTypes.mappedTypesMod.SetDifference[A, A1]
  type SetDifference[A, B] = A
  type SetIntersection[A, B] = A
  type Subtract[T /* <: T1 */, T1 /* <: js.Object */] = typingsSlinky.std.Pick[
    T, 
    typingsSlinky.utilityTypes.mappedTypesMod.SetComplement[/* keyof T */ java.lang.String, /* keyof T1 */ java.lang.String]
  ]
  type SymmetricDifference[A, B] = typingsSlinky.utilityTypes.mappedTypesMod.SetDifference[A | B, A with B]
  type UnboxPromise[T] = typingsSlinky.utilityTypes.mappedTypesMod.PromiseType[T]
  type Unionize[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: {[ Q in P ]: T[P]}}[keyof T] */ js.Any
}
