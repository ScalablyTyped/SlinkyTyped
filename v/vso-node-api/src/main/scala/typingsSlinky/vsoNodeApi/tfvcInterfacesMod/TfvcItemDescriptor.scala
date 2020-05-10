package typingsSlinky.vsoNodeApi.tfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcItemDescriptor extends js.Object {
  var path: String = js.native
  var recursionLevel: VersionControlRecursionType = js.native
  var version: String = js.native
  var versionOption: TfvcVersionOption = js.native
  var versionType: TfvcVersionType = js.native
}

object TfvcItemDescriptor {
  @scala.inline
  def apply(
    path: String,
    recursionLevel: VersionControlRecursionType,
    version: String,
    versionOption: TfvcVersionOption,
    versionType: TfvcVersionType
  ): TfvcItemDescriptor = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], recursionLevel = recursionLevel.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionOption = versionOption.asInstanceOf[js.Any], versionType = versionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcItemDescriptor]
  }
  @scala.inline
  implicit class TfvcItemDescriptorOps[Self <: TfvcItemDescriptor] (val x: Self) extends AnyVal {
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
    def withVersionOption(value: TfvcVersionOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionType(value: TfvcVersionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

