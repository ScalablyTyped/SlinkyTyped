package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitVersionDescriptor extends js.Object {
  /**
    * Version string identifier (name of tag/branch, SHA1 of commit)
    */
  var version: String = js.native
  /**
    * Version options - Specify additional modifiers to version (e.g Previous)
    */
  var versionOptions: GitVersionOptions = js.native
  /**
    * Version type (branch, tag, or commit). Determines how Id is interpreted
    */
  var versionType: GitVersionType = js.native
}

object GitVersionDescriptor {
  @scala.inline
  def apply(version: String, versionOptions: GitVersionOptions, versionType: GitVersionType): GitVersionDescriptor = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any], versionOptions = versionOptions.asInstanceOf[js.Any], versionType = versionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitVersionDescriptor]
  }
  @scala.inline
  implicit class GitVersionDescriptorOps[Self <: GitVersionDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionOptions(value: GitVersionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionType(value: GitVersionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

