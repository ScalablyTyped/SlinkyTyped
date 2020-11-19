package typingsSlinky.typeahead.mod

import typingsSlinky.typeahead.Bloodhound
import typingsSlinky.typeahead.Bloodhound.BloodhoundOptions
import typingsSlinky.typeahead.Bloodhound.Tokenizers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object ^ extends js.Object {
  
  /**
    * Returns a reference to Bloodhound and reverts window.Bloodhound to its
    * previous value. Can be used to avoid naming collisions.
    */
  def noConflict(): Bloodhound[_] = js.native
  
  /**
    * The Bloodhound suggestion engine is token-based, so how datums and queries are tokenized plays a vital role in the quality of search results.
    * Specify how you want datums and queries tokenized.
    */
  var tokenizers: Tokenizers = js.native
}
