package typingsSlinky.webgme.GmeCommon

import typingsSlinky.webgme.Core.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaInfo extends js.Object {
  var owner: Node = js.native
  var ownerPath: Path = js.native
  var target: Node = js.native
  var targetPath: Path = js.native
}

object MetaInfo {
  @scala.inline
  def apply(owner: Node, ownerPath: Path, target: Node, targetPath: Path): MetaInfo = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ownerPath = ownerPath.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetPath = targetPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaInfo]
  }
  @scala.inline
  implicit class MetaInfoOps[Self <: MetaInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerPath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetPath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

