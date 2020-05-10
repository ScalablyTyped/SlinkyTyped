package typingsSlinky.winrt.Windows.ApplicationModel

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPackage extends js.Object {
  var dependencies: IVectorView[Package] = js.native
  var description: String = js.native
  var displayName: String = js.native
  var id: PackageId = js.native
  var installedLocation: StorageFolder = js.native
  var isBundle: Boolean = js.native
  var isDevelopmentMode: Boolean = js.native
  var isFramework: Boolean = js.native
  var isResourcePackage: Boolean = js.native
  var logo: Uri = js.native
  var publisherDisplayName: String = js.native
}

object IPackage {
  @scala.inline
  def apply(
    dependencies: IVectorView[Package],
    description: String,
    displayName: String,
    id: PackageId,
    installedLocation: StorageFolder,
    isBundle: Boolean,
    isDevelopmentMode: Boolean,
    isFramework: Boolean,
    isResourcePackage: Boolean,
    logo: Uri,
    publisherDisplayName: String
  ): IPackage = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], installedLocation = installedLocation.asInstanceOf[js.Any], isBundle = isBundle.asInstanceOf[js.Any], isDevelopmentMode = isDevelopmentMode.asInstanceOf[js.Any], isFramework = isFramework.asInstanceOf[js.Any], isResourcePackage = isResourcePackage.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], publisherDisplayName = publisherDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPackage]
  }
  @scala.inline
  implicit class IPackageOps[Self <: IPackage] (val x: Self) extends AnyVal {
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
    def withId(value: PackageId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
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
  }
  
}

