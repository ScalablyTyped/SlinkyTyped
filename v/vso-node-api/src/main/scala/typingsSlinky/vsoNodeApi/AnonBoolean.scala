package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBoolean extends js.Object {
  var boolean: Double = js.native
  var branchFilter: Double = js.native
  var multiLine: Double = js.native
  var pickList: Double = js.native
  var radio: Double = js.native
  var string: Double = js.native
  var stringList: Double = js.native
}

object AnonBoolean {
  @scala.inline
  def apply(
    boolean: Double,
    branchFilter: Double,
    multiLine: Double,
    pickList: Double,
    radio: Double,
    string: Double,
    stringList: Double
  ): AnonBoolean = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], branchFilter = branchFilter.asInstanceOf[js.Any], multiLine = multiLine.asInstanceOf[js.Any], pickList = pickList.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], stringList = stringList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoolean]
  }
  @scala.inline
  implicit class AnonBooleanOps[Self <: AnonBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoolean(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranchFilter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPickList(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringList(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

