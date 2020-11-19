package typingsSlinky.winjs.WinJS.Binding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a base class for list projections.
  **/
@js.native
trait ListProjection[T] extends ListBaseWithMutators[T] {
  
  //#region Methods
  /**
    * Disconnects a WinJS.Binding.List projection from its underlying WinJS.Binding.List. It's only important to call this method when the WinJS.Binding.List projection and the WinJS.Binding.List have different lifetimes. (Call this method on the WinJS.Binding.List projection, not the underlying WinJS.Binding.List.)
    **/
  def dispose(): Unit = js.native
  
  /**
    * Gets a key/data pair for the specified key.
    * @param key The key of the value to retrieve.
    * @returns An object with two properties: key and data.
    **/
  def getItemFromKey(key: String): IKeyDataPair[T] = js.native
  
  /**
    * Moves the value at index to position newIndex.
    * @param index The original index of the value.
    * @param newIndex The index of the value after the move.
    **/
  def move(index: Double, newIndex: Double): Unit = js.native
  
  def splice(start: Double, howMany: js.UndefOr[scala.Nothing], item: T*): js.Array[T] = js.native
  /**
    * Removes elements from a list and, if necessary, inserts new elements in their place, returning the deleted elements.
    * @param start The zero-based location in the list from which to start removing elements.
    * @param howMany The number of elements to remove.
    * @param item The elements to insert into the list in place of the deleted elements.
    * @returns The deleted elements.
    **/
  def splice(start: Double, howMany: Double, item: T*): js.Array[T] = js.native
}
