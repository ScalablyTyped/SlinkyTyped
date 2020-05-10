package typingsSlinky.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonName extends js.Object {
  var defaultValue: AnonAnyOf = js.native
  var name: AnonType = js.native
  var notSupported: AnonType = js.native
  var tfDeprecatedName: AnonType = js.native
  var tfName: AnonType = js.native
  var `type`: AnonRef = js.native
}

object AnonName {
  @scala.inline
  def apply(
    defaultValue: AnonAnyOf,
    name: AnonType,
    notSupported: AnonType,
    tfDeprecatedName: AnonType,
    tfName: AnonType,
    `type`: AnonRef
  ): AnonName = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notSupported = notSupported.asInstanceOf[js.Any], tfDeprecatedName = tfDeprecatedName.asInstanceOf[js.Any], tfName = tfName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
  @scala.inline
  implicit class AnonNameOps[Self <: AnonName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: AnonAnyOf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotSupported(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTfDeprecatedName(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfDeprecatedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTfName(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: AnonRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

