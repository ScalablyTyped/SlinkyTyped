package typingsSlinky.tensorflowTfjsConverter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Name extends js.Object {
  var defaultValue: AnyOf = js.native
  var name: Type = js.native
  var notSupported: Type = js.native
  var tfDeprecatedName: Type = js.native
  var tfName: Type = js.native
  var `type`: Ref = js.native
}

object Name {
  @scala.inline
  def apply(
    defaultValue: AnyOf,
    name: Type,
    notSupported: Type,
    tfDeprecatedName: Type,
    tfName: Type,
    `type`: Ref
  ): Name = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notSupported = notSupported.asInstanceOf[js.Any], tfDeprecatedName = tfDeprecatedName.asInstanceOf[js.Any], tfName = tfName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: AnyOf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotSupported(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTfDeprecatedName(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfDeprecatedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTfName(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Ref): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

