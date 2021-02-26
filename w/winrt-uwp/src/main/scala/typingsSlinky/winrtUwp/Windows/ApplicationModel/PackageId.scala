package typingsSlinky.winrtUwp.Windows.ApplicationModel

import typingsSlinky.winrtUwp.Windows.System.ProcessorArchitecture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides package identification info, such as name, version, and publisher. */
@js.native
trait PackageId extends StObject {
  
  /** Gets the processor architecture for which the package was created. */
  var architecture: ProcessorArchitecture = js.native
  
  /** Windows Phone only. Gets the value of the Author attribute for the specified application package. */
  var author: String = js.native
  
  /** Gets the family name of the package. */
  var familyName: String = js.native
  
  /** Gets the full name of the package. */
  var fullName: String = js.native
  
  /** Gets the name of the package. */
  var name: String = js.native
  
  /** Windows Phone only. Gets the value of the ProductID attribute associated with this application package. */
  var productId: String = js.native
  
  /** Gets the publisher of the package. */
  var publisher: String = js.native
  
  /** Gets the publisher ID of the package. */
  var publisherId: String = js.native
  
  /** Gets the resource ID of the package. */
  var resourceId: String = js.native
  
  /** Gets the package version info. */
  var version: PackageVersion = js.native
}
object PackageId {
  
  @scala.inline
  def apply(
    architecture: ProcessorArchitecture,
    author: String,
    familyName: String,
    fullName: String,
    name: String,
    productId: String,
    publisher: String,
    publisherId: String,
    resourceId: String,
    version: PackageVersion
  ): PackageId = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], publisherId = publisherId.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageId]
  }
  
  @scala.inline
  implicit class PackageIdMutableBuilder[Self <: PackageId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchitecture(value: ProcessorArchitecture): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherId(value: String): Self = StObject.set(x, "publisherId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: PackageVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
