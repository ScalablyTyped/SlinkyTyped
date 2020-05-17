package typingsSlinky.winrtUwp.Windows.Services.Store

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Package
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about a package for the current app that has an update available for download from the Windows Store. */
@js.native
trait StorePackageUpdate extends js.Object {
  /** Gets the package that has an update available for download from the Windows Store. */
  @JSName("package")
  var _package: Package = js.native
  /** Gets a value that indicates whether the package that has an update available for download from the Windows Store is a mandatory package, as specified by the developer in the Windows Dev Center dashboard. */
  var mandatory: Boolean = js.native
}

object StorePackageUpdate {
  @scala.inline
  def apply(_package: Package, mandatory: Boolean): StorePackageUpdate = {
    val __obj = js.Dynamic.literal(mandatory = mandatory.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePackageUpdate]
  }
  @scala.inline
  implicit class StorePackageUpdateOps[Self <: StorePackageUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_package(value: Package): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMandatory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandatory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

