package typingsSlinky.seamlessImmutable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImmutableArray {
  /** These methods are banned by seamless-immutable. */
  type MutatingArrayMethods = typingsSlinky.std.Extract[
    js.Array[java.lang.String], 
    typingsSlinky.seamlessImmutable.seamlessImmutableStrings.push | typingsSlinky.seamlessImmutable.seamlessImmutableStrings.pop | typingsSlinky.seamlessImmutable.seamlessImmutableStrings.sort | typingsSlinky.seamlessImmutable.seamlessImmutableStrings.splice | typingsSlinky.seamlessImmutable.seamlessImmutableStrings.shift | typingsSlinky.seamlessImmutable.seamlessImmutableStrings.unshift | typingsSlinky.seamlessImmutable.seamlessImmutableStrings.reverse | scala.Double
  ]
  /** The remaining properties on Array<T>, after we remove the mutating functions and the wrapped non-mutating functions. */
  type Remaining[T] = typingsSlinky.seamlessImmutable.mod.Omit[
    js.Array[T], 
    typingsSlinky.seamlessImmutable.mod.ImmutableArray.MutatingArrayMethods | typingsSlinky.seamlessImmutable.mod.ImmutableArray.AdditionalMutatingArrayMethods | java.lang.String
  ]
}
