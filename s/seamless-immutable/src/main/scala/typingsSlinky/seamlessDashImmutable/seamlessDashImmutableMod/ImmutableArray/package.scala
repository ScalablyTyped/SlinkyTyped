package typingsSlinky.seamlessDashImmutable.seamlessDashImmutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImmutableArray {
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableMod.Omit
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.copyWithin
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.fill
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.pop
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.push
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.reverse
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.shift
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.sort
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.splice
  import typingsSlinky.seamlessDashImmutable.seamlessDashImmutableStrings.unshift
  import typingsSlinky.std.Extract

  /** NOTE: These methods mutate data, but seamless-immutable does not ban them. We will ban them in our type definitions. */
  type AdditionalMutatingArrayMethods = Extract[js.Array[String], copyWithin | fill]
  /** These methods are banned by seamless-immutable. */
  type MutatingArrayMethods = Extract[js.Array[String], push | pop | sort | splice | shift | unshift | reverse | Double]
  /** The remaining properties on Array<T>, after we remove the mutating functions and the wrapped non-mutating functions. */
  type Remaining[T] = Omit[js.Array[T], MutatingArrayMethods | AdditionalMutatingArrayMethods | String]
}
