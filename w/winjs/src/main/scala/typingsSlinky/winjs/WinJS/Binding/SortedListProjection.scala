package typingsSlinky.winjs.WinJS.Binding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Do not instantiate. Returned by the createSorted method.
  **/
@js.native
trait SortedListProjection[T] extends ListProjection[T] {
  
  //#region Methods
  /**
    * Returns a key/data pair for the specified index.
    * @param index The index of the value to retrieve.
    * @returns An object that has two properties: key and data.
    **/
  def getItem(index: Double): IKeyDataPair[T] = js.native
  
  /**
    * Returns the index of the first occurrence of a key.
    * @param key The key to locate in the list.
    * @returns The index of the first occurrence of a key in a list, or -1 if not found.
    **/
  def indexOfKey(key: String): Double = js.native
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the length of the list. Returns an integer value one higher than the highest element defined in a list.
    **/
  var length: Double = js.native
  
  /**
    * Forces the list to send a itemmutated notification to any listeners for the value at the specified index.
    * @param index The index of the value that was mutated.
    **/
  def notifyMutated(index: Double): Unit = js.native
  
  /**
    * Replaces the value at the specified index with a new value.
    * @param index The index of the value to be replaced.
    * @param newValue The new value.
    **/
  def setAt(index: Double, newValue: T): Unit = js.native
}
