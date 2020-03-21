package typingsSlinky.seamlessImmutable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias seamless-immutable.seamless-immutable.DeepPartial<T[P]> * / object}
    */ typingsSlinky.seamlessImmutable.seamlessImmutableStrings.DeepPartial with js.Any
  type Immutable[T, O /* <: js.Object */] = (typingsSlinky.seamlessImmutable.mod.Immutable.MakeImmutable[T, O]) | (js.Promise[typingsSlinky.seamlessImmutable.mod.Immutable.MakeImmutable[js.Any, O]])
  /** An ImmutableArray provides read-only access to the array elements, and provides functions (such as `map()`) that return immutable data structures. */
  type ImmutableArray[T] = typingsSlinky.seamlessImmutable.mod.ImmutableArray.Remaining[T] with typingsSlinky.seamlessImmutable.mod.ImmutableArray.Additions[T] with typingsSlinky.seamlessImmutable.mod.ImmutableArray.Overrides[T] with typingsSlinky.seamlessImmutable.mod.ImmutableArray.ReadOnlyIndexer[T]
  type ImmutableDate = typingsSlinky.seamlessImmutable.mod.ImmutableDate_
  type ImmutableObject[T] = typingsSlinky.seamlessImmutable.mod.ImmutableObjectMixin[T] with typingsSlinky.seamlessImmutable.seamlessImmutableStrings.ImmutableObject with T
  /** From type T, take all properties except those specified by K. */
  type Omit[T, K /* <: java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[java.lang.String, K]]
}
