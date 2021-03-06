package typingsSlinky.winrtUwp.Windows.ApplicationModel

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about a package. */
@js.native
trait Package extends StObject {
  
  /** Gets the packages on which the current package depends. */
  var dependencies: IVectorView[Package] = js.native
  
  /** Gets the description of the package. */
  var description: String = js.native
  
  /** Gets the display name of the package. */
  var displayName: String = js.native
  
  var getAppListEntriesAsync: js.Any = js.native
  
  /* unmapped type */
  /**
    * Windows Phone only. Returns a token that can be used to retrieve the thumbnail image associated with this application package.
    * @return A token that can be used to retrieve the thumbnail image associated with this application package.
    */
  def getThumbnailToken(): String = js.native
  
  /** Gets the package identity of the current package. */
  var id: PackageId = js.native
  
  /** Windows Phone only. Gets the date the application package was installed on the user's phone. */
  var installDate: js.Date = js.native
  
  /** Gets the date on which the application package was installed or last updated. */
  var installedDate: js.Date = js.native
  
  /** Gets the location of the installed package. */
  var installedLocation: StorageFolder = js.native
  
  /** Indicates whether the package is a bundle package. */
  var isBundle: Boolean = js.native
  
  /** Indicates whether the package is installed in development mode. */
  var isDevelopmentMode: Boolean = js.native
  
  /** Indicates whether other packages can declare a dependency on this package. */
  var isFramework: Boolean = js.native
  
  /** Indicates whether the package is a resource package. */
  var isResourcePackage: Boolean = js.native
  
  /**
    * Windows Phone only. Launches the specified application.
    * @param parameters The navigation URI that specifies the page to launch and optional parameters. Use an empty string to specify the default page for the app.
    */
  def launch(parameters: String): Unit = js.native
  
  /** Gets the logo of the package. */
  var logo: Uri = js.native
  
  /** Gets the publisher display name of the package. */
  var publisherDisplayName: String = js.native
  
  var status: js.Any = js.native
}
object Package {
  
  @scala.inline
  def apply(
    dependencies: IVectorView[Package],
    description: String,
    displayName: String,
    getAppListEntriesAsync: js.Any,
    getThumbnailToken: () => String,
    id: PackageId,
    installDate: js.Date,
    installedDate: js.Date,
    installedLocation: StorageFolder,
    isBundle: Boolean,
    isDevelopmentMode: Boolean,
    isFramework: Boolean,
    isResourcePackage: Boolean,
    launch: String => Unit,
    logo: Uri,
    publisherDisplayName: String,
    status: js.Any
  ): Package = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], getAppListEntriesAsync = getAppListEntriesAsync.asInstanceOf[js.Any], getThumbnailToken = js.Any.fromFunction0(getThumbnailToken), id = id.asInstanceOf[js.Any], installDate = installDate.asInstanceOf[js.Any], installedDate = installedDate.asInstanceOf[js.Any], installedLocation = installedLocation.asInstanceOf[js.Any], isBundle = isBundle.asInstanceOf[js.Any], isDevelopmentMode = isDevelopmentMode.asInstanceOf[js.Any], isFramework = isFramework.asInstanceOf[js.Any], isResourcePackage = isResourcePackage.asInstanceOf[js.Any], launch = js.Any.fromFunction1(launch), logo = logo.asInstanceOf[js.Any], publisherDisplayName = publisherDisplayName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Package]
  }
  
  @scala.inline
  implicit class PackageMutableBuilder[Self <: Package] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependencies(value: IVectorView[Package]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAppListEntriesAsync(value: js.Any): Self = StObject.set(x, "getAppListEntriesAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetThumbnailToken(value: () => String): Self = StObject.set(x, "getThumbnailToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: PackageId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallDate(value: js.Date): Self = StObject.set(x, "installDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledDate(value: js.Date): Self = StObject.set(x, "installedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledLocation(value: StorageFolder): Self = StObject.set(x, "installedLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBundle(value: Boolean): Self = StObject.set(x, "isBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDevelopmentMode(value: Boolean): Self = StObject.set(x, "isDevelopmentMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFramework(value: Boolean): Self = StObject.set(x, "isFramework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResourcePackage(value: Boolean): Self = StObject.set(x, "isResourcePackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunch(value: String => Unit): Self = StObject.set(x, "launch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLogo(value: Uri): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherDisplayName(value: String): Self = StObject.set(x, "publisherDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: js.Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
