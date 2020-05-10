package typingsSlinky.yarnpkgLockfile

import typingsSlinky.yarnpkgLockfile.yarnpkgLockfileStrings.conflict
import typingsSlinky.yarnpkgLockfile.yarnpkgLockfileStrings.merge
import typingsSlinky.yarnpkgLockfile.yarnpkgLockfileStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonObject extends js.Object {
  var `object`: js.Any = js.native
  var `type`: success | merge | conflict = js.native
}

object AnonObject {
  @scala.inline
  def apply(`object`: js.Any, `type`: success | merge | conflict): AnonObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonObject]
  }
  @scala.inline
  implicit class AnonObjectOps[Self <: AnonObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: success | merge | conflict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

