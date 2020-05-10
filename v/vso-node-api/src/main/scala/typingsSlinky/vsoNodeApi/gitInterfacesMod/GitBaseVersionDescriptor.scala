package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitBaseVersionDescriptor extends GitVersionDescriptor {
  /**
    * Version string identifier (name of tag/branch, SHA1 of commit)
    */
  var baseVersion: String = js.native
  /**
    * Version options - Specify additional modifiers to version (e.g Previous)
    */
  var baseVersionOptions: GitVersionOptions = js.native
  /**
    * Version type (branch, tag, or commit). Determines how Id is interpreted
    */
  var baseVersionType: GitVersionType = js.native
}

object GitBaseVersionDescriptor {
  @scala.inline
  def apply(
    baseVersion: String,
    baseVersionOptions: GitVersionOptions,
    baseVersionType: GitVersionType,
    version: String,
    versionOptions: GitVersionOptions,
    versionType: GitVersionType
  ): GitBaseVersionDescriptor = {
    val __obj = js.Dynamic.literal(baseVersion = baseVersion.asInstanceOf[js.Any], baseVersionOptions = baseVersionOptions.asInstanceOf[js.Any], baseVersionType = baseVersionType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionOptions = versionOptions.asInstanceOf[js.Any], versionType = versionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitBaseVersionDescriptor]
  }
  @scala.inline
  implicit class GitBaseVersionDescriptorOps[Self <: GitBaseVersionDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseVersionOptions(value: GitVersionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseVersionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseVersionType(value: GitVersionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseVersionType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

