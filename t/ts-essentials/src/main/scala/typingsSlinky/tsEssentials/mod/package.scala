package typingsSlinky.tsEssentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends std.Array<infer U>? std.Array</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias ts-essentials.ts-essentials.DeepPartial<U> * / object> : T[P] extends std.ReadonlyArray<infer U>? std.ReadonlyArray</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias ts-essentials.ts-essentials.DeepPartial<U> * / object> : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias ts-essentials.ts-essentials.DeepPartial<T[P]> * / object}
    */ typingsSlinky.tsEssentials.tsEssentialsStrings.DeepPartial with org.scalablytyped.runtime.TopLevel[js.Any]
  type DeepReadonlyObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: ts-essentials.ts-essentials.DeepReadonly<T[P]>}
    */ typingsSlinky.tsEssentials.tsEssentialsStrings.DeepReadonlyObject with org.scalablytyped.runtime.TopLevel[T]
  type Dictionary[T, K /* <: java.lang.String | scala.Double */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: T}
    */ typingsSlinky.tsEssentials.tsEssentialsStrings.Dictionary with org.scalablytyped.runtime.TopLevel[js.Any]
  type DictionaryValues[T] = js.Any
  type Merge[M, N] = (typingsSlinky.tsEssentials.mod.Omit[
    M, 
    typingsSlinky.std.Extract[/* keyof M */ java.lang.String, /* keyof N */ java.lang.String]
  ]) with N
  type NonNullable[T] = T with js.Object
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type Opaque[K, T] = T with typingsSlinky.tsEssentials.anon.TYPE[K]
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
