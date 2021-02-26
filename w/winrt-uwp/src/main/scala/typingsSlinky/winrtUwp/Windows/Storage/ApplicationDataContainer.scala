package typingsSlinky.winrtUwp.Windows.Storage

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a container for app settings. The methods and properties of this class support creating, deleting, enumerating, and traversing the container hierarchy. */
@js.native
trait ApplicationDataContainer extends StObject {
  
  /** Gets the child application settings containers of this application settings container. */
  var containers: IMapView[String, ApplicationDataContainer] = js.native
  
  /**
    * Creates or opens the specified settings container in the current settings container.
    * @param name The name of the container.
    * @param disposition One of the enumeration values.
    * @return The settings container.
    */
  def createContainer(name: String, disposition: ApplicationDataCreateDisposition): ApplicationDataContainer = js.native
  
  /**
    * Deletes the specified settings container, its subcontainers, and all application settings in the hierarchy.
    * @param name The name of the settings container.
    */
  def deleteContainer(name: String): Unit = js.native
  
  /** Gets the type (local or roaming) of the app data store that is associated with the current settings container. */
  var locality: ApplicationDataLocality = js.native
  
  /** Gets the name of the current settings container. */
  var name: String = js.native
  
  /** Gets an object that represents the settings in this settings container. */
  var values: IPropertySet = js.native
}
object ApplicationDataContainer {
  
  @scala.inline
  def apply(
    containers: IMapView[String, ApplicationDataContainer],
    createContainer: (String, ApplicationDataCreateDisposition) => ApplicationDataContainer,
    deleteContainer: String => Unit,
    locality: ApplicationDataLocality,
    name: String,
    values: IPropertySet
  ): ApplicationDataContainer = {
    val __obj = js.Dynamic.literal(containers = containers.asInstanceOf[js.Any], createContainer = js.Any.fromFunction2(createContainer), deleteContainer = js.Any.fromFunction1(deleteContainer), locality = locality.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationDataContainer]
  }
  
  @scala.inline
  implicit class ApplicationDataContainerMutableBuilder[Self <: ApplicationDataContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainers(value: IMapView[String, ApplicationDataContainer]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateContainer(value: (String, ApplicationDataCreateDisposition) => ApplicationDataContainer): Self = StObject.set(x, "createContainer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeleteContainer(value: String => Unit): Self = StObject.set(x, "deleteContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocality(value: ApplicationDataLocality): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: IPropertySet): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
