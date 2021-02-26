package typingsSlinky.winrt.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrt.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IApplicationDataContainer extends StObject {
  
  var containers: IMapView[String, ApplicationDataContainer] = js.native
  
  def createContainer(name: String, disposition: ApplicationDataCreateDisposition): ApplicationDataContainer = js.native
  
  def deleteContainer(name: String): Unit = js.native
  
  var locality: ApplicationDataLocality = js.native
  
  var name: String = js.native
  
  var values: IPropertySet = js.native
}
object IApplicationDataContainer {
  
  @scala.inline
  def apply(
    containers: IMapView[String, ApplicationDataContainer],
    createContainer: (String, ApplicationDataCreateDisposition) => ApplicationDataContainer,
    deleteContainer: String => Unit,
    locality: ApplicationDataLocality,
    name: String,
    values: IPropertySet
  ): IApplicationDataContainer = {
    val __obj = js.Dynamic.literal(containers = containers.asInstanceOf[js.Any], createContainer = js.Any.fromFunction2(createContainer), deleteContainer = js.Any.fromFunction1(deleteContainer), locality = locality.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApplicationDataContainer]
  }
  
  @scala.inline
  implicit class IApplicationDataContainerMutableBuilder[Self <: IApplicationDataContainer] (val x: Self) extends AnyVal {
    
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
