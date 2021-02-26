package typingsSlinky.winrtUwp.Windows.Storage

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapChangedEventArgs
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IObservableMap
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.MapChangedEventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.mapchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the settings in a settings container. The ApplicationDataContainer.Values property returns an object that can be cast to this type. */
@js.native
trait ApplicationDataContainerSettings extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, _]): Unit = js.native
  
  /** Removes all related application settings. */
  def clear(): Unit = js.native
  
  /**
    * Retrieves an iterator to enumerate the settings in the settings container.
    * @return The iterator.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  
  /**
    * Returns a read-only snapshot of the contents of the settings container.
    * @return The view of the settings container.
    */
  def getView(): IMapView[String, _] = js.native
  
  /**
    * Determines whether there is an application setting with the specified key.
    * @param key The key.
    * @return True if the key is found; otherwise false.
    */
  def hasKey(key: String): Boolean = js.native
  
  /**
    * Inserts or replaces an application setting.
    * @param key The key of the setting to insert or replace.
    * @param value The setting value.
    * @return True if an item with the specified key is an existing item and was replaced; otherwise, false.
    */
  def insert(key: String, value: js.Any): Boolean = js.native
  
  /**
    * Retrieves the specified application setting.
    * @param key The key of the setting.
    * @return The application setting.
    */
  def lookup(key: String): js.Any = js.native
  
  /** Occurs when the map changes. */
  def onmapchanged(ev: IMapChangedEventArgs[String] with (WinRTEvent[IObservableMap[String, _]])): Unit = js.native
  /** Occurs when the map changes. */
  @JSName("onmapchanged")
  var onmapchanged_Original: MapChangedEventHandler[String, _] = js.native
  
  /**
    * Removes a specific item from the ApplicationDataContainerSettings .
    * @param key The key of the item to remove.
    * @return true if the item was removed, otherwise false.
    */
  def remove(key: String): Boolean = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, _]): Unit = js.native
  
  /**
    * Removes the specified application setting.
    * @param key The key of the setting.
    */
  @JSName("remove")
  def remove_Unit(key: String): Unit = js.native
  
  /** Gets the number of related application settings. */
  var size: Double = js.native
}
