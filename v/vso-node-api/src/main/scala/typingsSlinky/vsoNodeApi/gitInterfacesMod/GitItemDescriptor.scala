package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitItemDescriptor extends js.Object {
  /**
    * Path to item
    */
  var path: String = js.native
  /**
    * Specifies whether to include children (OneLevel), all descendants (Full), or None
    */
  var recursionLevel: VersionControlRecursionType = js.native
  /**
    * Version string (interpretation based on VersionType defined in subclass
    */
  var version: String = js.native
  /**
    * Version modifiers (e.g. previous)
    */
  var versionOptions: GitVersionOptions = js.native
  /**
    * How to interpret version (branch,tag,commit)
    */
  var versionType: GitVersionType = js.native
}

object GitItemDescriptor {
  @scala.inline
  def apply(
    path: String,
    recursionLevel: VersionControlRecursionType,
    version: String,
    versionOptions: GitVersionOptions,
    versionType: GitVersionType
  ): GitItemDescriptor = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], recursionLevel = recursionLevel.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionOptions = versionOptions.asInstanceOf[js.Any], versionType = versionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitItemDescriptor]
  }
  @scala.inline
  implicit class GitItemDescriptorOps[Self <: GitItemDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecursionLevel(value: VersionControlRecursionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursionLevel")(value.asInstanceOf[js.Any])
        ret
    }
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

