package typingsSlinky.tstl

import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.hashBucketsMod.HashBuckets
import typingsSlinky.tstl.hasherMod.Hasher
import typingsSlinky.tstl.ihashsetMod.IHashSet
import typingsSlinky.tstl.ihashsetMod.IHashSet.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/hash/SetHashBuckets", JSImport.Namespace)
@js.native
object setHashBucketsMod extends js.Object {
  @js.native
  class SetHashBuckets[Key, Unique /* <: Boolean */, Source /* <: IHashSet[Key, Unique, Source] */] protected () extends HashBuckets[Iterator[Key, Unique, Source]] {
    def this(source: IHashSet[Key, Unique, Source], hash: Hasher[Key], pred: Comparator[Key, Key]) = this()
    var hash_function_ : js.Any = js.native
    var key_eq_ : js.Any = js.native
    var source_ : js.Any = js.native
    def find(`val`: Key): Iterator[Key, Unique, Source] = js.native
    def hash_function(): Hasher[Key] = js.native
    def key_eq(): Comparator[Key, Key] = js.native
  }
  
}

