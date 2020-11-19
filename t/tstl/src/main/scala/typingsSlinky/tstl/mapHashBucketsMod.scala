package typingsSlinky.tstl

import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.hashBucketsMod.HashBuckets
import typingsSlinky.tstl.hasherMod.Hasher
import typingsSlinky.tstl.ihashmapMod.IHashMap
import typingsSlinky.tstl.ihashmapMod.IHashMap.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/hash/MapHashBuckets", JSImport.Namespace)
@js.native
object mapHashBucketsMod extends js.Object {
  
  @js.native
  class MapHashBuckets[Key, T, Unique /* <: Boolean */, Source /* <: IHashMap[Key, T, Unique, Source] */] protected () extends HashBuckets[Iterator[Key, T, Unique, Source]] {
    /**
      * Initializer Constructor
      *
      * @param source Source map container
      * @param hash Hash function
      * @param pred Equality function
      */
    def this(source: IHashMap[Key, T, Unique, Source], hash: Hasher[Key], pred: Comparator[Key, Key]) = this()
    
    def find(key: Key): Iterator[Key, T, Unique, Source] = js.native
    
    def hash_function(): Hasher[Key] = js.native
    
    var hash_function_ : js.Any = js.native
    
    def key_eq(): Comparator[Key, Key] = js.native
    
    var key_eq_ : js.Any = js.native
    
    var source_ : js.Any = js.native
  }
}
