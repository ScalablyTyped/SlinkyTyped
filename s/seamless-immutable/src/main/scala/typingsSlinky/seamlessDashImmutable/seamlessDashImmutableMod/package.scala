package typingsSlinky.seamlessDashImmutable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object seamlessDashImmutableMod {
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableMod.Immutable.MakeImmutable
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableArray.Additions
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableArray.Overrides
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableArray.ReadOnlyIndexer
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableArray.Remaining
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias seamless-immutable.seamless-immutable.DeepPartial<T[P]> * / object}
    */ typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.DeepPartial with js.Any
  type Immutable[T, O /* <: js.Object */] = (MakeImmutable[T, O]) | (js.Promise[MakeImmutable[js.Any, O]])
  /** An ImmutableArray provides read-only access to the array elements, and provides functions (such as `map()`) that return immutable data structures. */
  type ImmutableArray[T] = Remaining[T] with Additions[T] with Overrides[T] with ReadOnlyIndexer[T]
  /** An ImmutableDate disables the use of mutating functions like `setDate` and `setFullYear`. */
  type ImmutableDate = typingsSlinky.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableDate.Remaining with typingsSlinky.seamlessDashImmutable.seamlessDashImmutableMod.ImmutableDate.Additions
  type ImmutableObject[T] = ImmutableObjectMixin[T] with typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.ImmutableObject with T
  /** From type T, take all properties except those specified by K. */
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
