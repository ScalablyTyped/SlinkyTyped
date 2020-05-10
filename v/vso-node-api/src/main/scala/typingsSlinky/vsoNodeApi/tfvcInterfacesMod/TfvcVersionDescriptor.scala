package typingsSlinky.vsoNodeApi.tfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcVersionDescriptor extends js.Object {
  var version: String = js.native
  var versionOption: TfvcVersionOption = js.native
  var versionType: TfvcVersionType = js.native
}

object TfvcVersionDescriptor {
  @scala.inline
  def apply(version: String, versionOption: TfvcVersionOption, versionType: TfvcVersionType): TfvcVersionDescriptor = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any], versionOption = versionOption.asInstanceOf[js.Any], versionType = versionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcVersionDescriptor]
  }
  @scala.inline
  implicit class TfvcVersionDescriptorOps[Self <: TfvcVersionDescriptor] (val x: Self) extends AnyVal {
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

