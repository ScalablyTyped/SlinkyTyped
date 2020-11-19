package typingsSlinky.winrtUwp.Windows.ApplicationModel.Resources.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapChangedEventArgs
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IObservableMap
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.MapChangedEventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.mapchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Notifies listeners of dynamic changes to a map of ResourceQualifier objects, such as when items get added or removed, and allows qualifier values to change. */
@js.native
trait ResourceQualifierObservableMap extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, String]): Unit = js.native
  
  /** Removes all items from the observable map. */
  def clear(): Unit = js.native
  
  /**
    * Returns an iterator to enumerate the items in the observable map.
    * @return The iterator. The current position of the iterator is index 0, or the end of the observable map if the observable map is empty.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  
  /**
    * Returns an unchangeable view of the observable map.
    * @return The view of the map.
    */
  def getView(): IMapView[String, String] = js.native
  
  /**
    * Determines whether the observable map contains the specified key.
    * @param key The key to locate in the observable map.
    * @return TRUE if the key is found, otherwise FALSE if it is not found.
    */
  def hasKey(key: String): Boolean = js.native
  
  /**
    * Inserts or replaces an item in the observable map.
    * @param key The key associated with the item to insert.
    * @param value The item to insert.
    * @return TRUE if an item with the specified key is an existing item and was replaced, otherwise FALSE.
    */
  def insert(key: String, value: String): Boolean = js.native
  
  /**
    * Returns the qualifier name at the specified key in the observable map.
    * @param key The key to locate in the observable map.
    * @return The qualifier name associated with the specified key.
    */
  def lookup(key: String): String = js.native
  
  /** Occurs when the map changes. */
  def onmapchanged(ev: IMapChangedEventArgs[String] with (WinRTEvent[IObservableMap[String, String]])): Unit = js.native
  /** Occurs when the map changes. */
  @JSName("onmapchanged")
  var onmapchanged_Original: MapChangedEventHandler[String, String] = js.native
  
  /**
    * Removes an item from the observable map.
    * @param key The key associated with the item to remove.
    */
  def remove(key: String): Unit = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, String]): Unit = js.native
  
  /** Gets the number of ResourceQualifier objects in the observable map. */
  var size: Double = js.native
}
