package typingsSlinky.typeahead

import typingsSlinky.typeahead.Bloodhound.BloodhoundOptions
import typingsSlinky.typeahead.Bloodhound.Tokenizers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Bloodhound is the typeahead.js suggestion engine. Bloodhound is robust,
    * flexible, and offers advanced functionalities such as prefetching,
    * intelligent caching, fast lookups, and backfilling with remote data.
    */
  @JSImport("bloodhound", JSImport.Namespace)
  @js.native
  class ^[T] protected () extends Bloodhound[T] {
    /**
      * The constructor function.
      *
      * @constructor
      * @param options Options hash.
      */
    def this(options: BloodhoundOptions[T]) = this()
  }
  @JSImport("bloodhound", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a reference to Bloodhound and reverts window.Bloodhound to its
    * previous value. Can be used to avoid naming collisions.
    */
  /* static member */
  @JSImport("bloodhound", "noConflict")
  @js.native
  def noConflict(): Bloodhound[_] = js.native
  
  /**
    * The Bloodhound suggestion engine is token-based, so how datums and queries are tokenized plays a vital role in the quality of search results.
    * Specify how you want datums and queries tokenized.
    */
  /* static member */
  @JSImport("bloodhound", "tokenizers")
  @js.native
  def tokenizers: Tokenizers = js.native
  @scala.inline
  def tokenizers_=(x: Tokenizers): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenizers")(x.asInstanceOf[js.Any])
}
