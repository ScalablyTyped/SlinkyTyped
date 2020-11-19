package typingsSlinky.winrtUwp.Windows.ApplicationModel.Resources.Core

import typingsSlinky.std.Array
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.anon.Index
import typingsSlinky.winrtUwp.anon.ItemsResourceCandidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a collection of ResourceCandidate objects. */
@js.native
trait ResourceCandidateVectorView extends Array[ResourceCandidate] {
  
  /**
    * Returns an iterator to enumerate the items in the set of ResourceCandidate objects.
    * @return The iterator. The current position of the iterator is index 0, or the end of the set if the set is empty.
    */
  def first(): IIterator[ResourceCandidate] = js.native
  
  /**
    * Returns the ResourceCandidate at the specified index in the set.
    * @param index The zero-based index of the ResourceCandidate in the set to return.
    * @return The ResourceCandidate at the specified index.
    */
  def getAt(index: Double): ResourceCandidate = js.native
  
  /**
    * Returns the ResourceCandidate objects that start at the specified index in the set.
    * @param startIndex The zero-based index of the start of the ResourceCandidate objects in the set to return.
    */
  def getMany(startIndex: Double): ItemsResourceCandidate = js.native
  
  def indexOf(value: ResourceCandidate, extra: js.Any*): Index = js.native
  /**
    * Returns the index of a specified ResourceCandidate in the set.
    * @param value The ResourceCandidate to find in the set.
    */
  @JSName("indexOf")
  def indexOf_Index(value: ResourceCandidate): Index = js.native
  
  /** Gets the number of ResourceCandidate objects in the set. */
  var size: Double = js.native
}
