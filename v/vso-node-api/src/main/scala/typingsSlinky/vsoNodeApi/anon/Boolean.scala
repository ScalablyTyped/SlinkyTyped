package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Boolean extends js.Object {
  var boolean: scala.Double = js.native
  var branchFilter: scala.Double = js.native
  var multiLine: scala.Double = js.native
  var pickList: scala.Double = js.native
  var radio: scala.Double = js.native
  var string: scala.Double = js.native
  var stringList: scala.Double = js.native
}

object Boolean {
  @scala.inline
  def apply(
    boolean: scala.Double,
    branchFilter: scala.Double,
    multiLine: scala.Double,
    pickList: scala.Double,
    radio: scala.Double,
    string: scala.Double,
    stringList: scala.Double
  ): Boolean = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], branchFilter = branchFilter.asInstanceOf[js.Any], multiLine = multiLine.asInstanceOf[js.Any], pickList = pickList.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], stringList = stringList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boolean]
  }
  @scala.inline
  implicit class BooleanOps[Self <: Boolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoolean(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranchFilter(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiLine(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPickList(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadio(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringList(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

