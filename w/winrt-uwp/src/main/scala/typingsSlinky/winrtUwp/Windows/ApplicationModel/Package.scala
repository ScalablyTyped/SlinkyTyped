package typingsSlinky.winrtUwp.Windows.ApplicationModel

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a package. */
@js.native
trait Package extends js.Object {
  /** Gets the packages on which the current package depends. */
  var dependencies: IVectorView[Package] = js.native
  /** Gets the description of the package. */
  var description: String = js.native
  /** Gets the display name of the package. */
  var displayName: String = js.native
  var getAppListEntriesAsync: js.Any = js.native
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
  /** Gets the logo of the package. */
  var logo: Uri = js.native
  /** Gets the publisher display name of the package. */
  var publisherDisplayName: String = js.native
  var status: js.Any = js.native
   /* unmapped type */ /**
    * Windows Phone only. Returns a token that can be used to retrieve the thumbnail image associated with this application package.
    * @return A token that can be used to retrieve the thumbnail image associated with this application package.
    */
  def getThumbnailToken(): String = js.native
  /**
    * Windows Phone only. Launches the specified application.
    * @param parameters The navigation URI that specifies the page to launch and optional parameters. Use an empty string to specify the default page for the app.
    */
  def launch(parameters: String): Unit = js.native
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
  implicit class PackageOps[Self <: Package] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependencies(value: IVectorView[Package]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAppListEntriesAsync(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAppListEntriesAsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetThumbnailToken(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThumbnailToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: PackageId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstalledDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstalledLocation(value: StorageFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installedLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBundle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDevelopmentMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDevelopmentMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFramework(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFramework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsResourcePackage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResourcePackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaunch(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLogo(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

