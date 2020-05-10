package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackageId extends js.Object {
  /**
    * Name of the package.
    * Should not include `@types`.
    * If accessing a non-index file, this should include its name e.g. "foo/bar".
    */
  var name: java.lang.String = js.native
  /**
    * Name of a submodule within this package.
    * May be "".
    */
  var subModuleName: java.lang.String = js.native
  /** Version of the package, e.g. "1.2.3" */
  var version: java.lang.String = js.native
}

object PackageId {
  @scala.inline
  def apply(name: java.lang.String, subModuleName: java.lang.String, version: java.lang.String): PackageId = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subModuleName = subModuleName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageId]
  }
  @scala.inline
  implicit class PackageIdOps[Self <: PackageId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubModuleName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subModuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

