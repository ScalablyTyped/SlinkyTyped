package typingsSlinky.vegaTypings.bindMod

import typingsSlinky.vegaTypings.vegaTypingsStrings.radio
import typingsSlinky.vegaTypings.vegaTypingsStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindRadioSelect
  extends BaseBinding
     with Binding {
  var input: radio | select = js.native
  var labels: js.UndefOr[js.Array[String]] = js.native
  var options: js.Array[_] = js.native
}

object BindRadioSelect {
  @scala.inline
  def apply(input: radio | select, options: js.Array[_]): BindRadioSelect = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindRadioSelect]
  }
  @scala.inline
  implicit class BindRadioSelectOps[Self <: BindRadioSelect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: radio | select): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
  }
  
}

