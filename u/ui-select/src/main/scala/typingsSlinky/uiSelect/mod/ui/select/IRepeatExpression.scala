package typingsSlinky.uiSelect.mod.ui.select

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRepeatExpression extends js.Object {
  var filters: String = js.native
  var itemName: String = js.native
  var keyName: String = js.native
  var modelMapper: String = js.native
  var source: String = js.native
  var trackByExp: String = js.native
  def repeatExpression(grouped: Boolean): String = js.native
}

object IRepeatExpression {
  @scala.inline
  def apply(
    filters: String,
    itemName: String,
    keyName: String,
    modelMapper: String,
    repeatExpression: Boolean => String,
    source: String,
    trackByExp: String
  ): IRepeatExpression = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any], modelMapper = modelMapper.asInstanceOf[js.Any], repeatExpression = js.Any.fromFunction1(repeatExpression), source = source.asInstanceOf[js.Any], trackByExp = trackByExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRepeatExpression]
  }
  @scala.inline
  implicit class IRepeatExpressionOps[Self <: IRepeatExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelMapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeatExpression(value: Boolean => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackByExp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackByExp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

