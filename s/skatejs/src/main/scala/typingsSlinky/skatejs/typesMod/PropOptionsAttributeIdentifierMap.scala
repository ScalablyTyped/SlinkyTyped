package typingsSlinky.skatejs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropOptionsAttributeIdentifierMap extends PropOptionsAttribute {
  var source: js.UndefOr[PropOptionsAttributeIdentifier] = js.native
  var target: js.UndefOr[PropOptionsAttributeIdentifier] = js.native
}

object PropOptionsAttributeIdentifierMap {
  @scala.inline
  def apply(): PropOptionsAttributeIdentifierMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropOptionsAttributeIdentifierMap]
  }
  @scala.inline
  implicit class PropOptionsAttributeIdentifierMapOps[Self <: PropOptionsAttributeIdentifierMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: PropOptionsAttributeIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: PropOptionsAttributeIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

