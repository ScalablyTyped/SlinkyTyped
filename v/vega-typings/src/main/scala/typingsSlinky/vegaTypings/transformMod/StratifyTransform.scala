package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.vegaTypingsStrings.stratify
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StratifyTransform extends Transforms {
  var key: FieldRef = js.native
  var parentKey: FieldRef = js.native
  var `type`: stratify = js.native
}

object StratifyTransform {
  @scala.inline
  def apply(key: FieldRef, parentKey: FieldRef, `type`: stratify): StratifyTransform = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parentKey = parentKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StratifyTransform]
  }
  @scala.inline
  implicit class StratifyTransformOps[Self <: StratifyTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: FieldRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentKey(value: FieldRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: stratify): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

