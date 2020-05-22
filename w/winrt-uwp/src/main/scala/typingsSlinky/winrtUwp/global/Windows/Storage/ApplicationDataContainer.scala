package typingsSlinky.winrtUwp.global.Windows.Storage

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a container for app settings. The methods and properties of this class support creating, deleting, enumerating, and traversing the container hierarchy. */
@JSGlobal("Windows.Storage.ApplicationDataContainer")
@js.native
abstract class ApplicationDataContainer ()
  extends typingsSlinky.winrtUwp.Windows.Storage.ApplicationDataContainer {
  /** Gets the child application settings containers of this application settings container. */
  /* CompleteClass */
  override var containers: IMapView[String, typingsSlinky.winrtUwp.Windows.Storage.ApplicationDataContainer] = js.native
  /** Gets the type (local or roaming) of the app data store that is associated with the current settings container. */
  /* CompleteClass */
  override var locality: typingsSlinky.winrtUwp.Windows.Storage.ApplicationDataLocality = js.native
  /** Gets the name of the current settings container. */
  /* CompleteClass */
  override var name: String = js.native
  /** Gets an object that represents the settings in this settings container. */
  /* CompleteClass */
  override var values: IPropertySet = js.native
  /**
    * Creates or opens the specified settings container in the current settings container.
    * @param name The name of the container.
    * @param disposition One of the enumeration values.
    * @return The settings container.
    */
  /* CompleteClass */
  override def createContainer(name: String, disposition: typingsSlinky.winrtUwp.Windows.Storage.ApplicationDataCreateDisposition): typingsSlinky.winrtUwp.Windows.Storage.ApplicationDataContainer = js.native
  /**
    * Deletes the specified settings container, its subcontainers, and all application settings in the hierarchy.
    * @param name The name of the settings container.
    */
  /* CompleteClass */
  override def deleteContainer(name: String): Unit = js.native
}

