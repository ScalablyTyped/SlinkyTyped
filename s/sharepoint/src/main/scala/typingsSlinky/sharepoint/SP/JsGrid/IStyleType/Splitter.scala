package typingsSlinky.sharepoint.SP.JsGrid.IStyleType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Splitter
  extends typingsSlinky.sharepoint.SP.JsGrid.IStyleType {
  var backgroundColor: js.Any = js.native
  var innerBorderColor: js.Any = js.native
  var leftInnerBorderColor: js.Any = js.native
  var outerBorderColor: js.Any = js.native
}

object Splitter {
  @scala.inline
  def apply(
    backgroundColor: js.Any,
    innerBorderColor: js.Any,
    leftInnerBorderColor: js.Any,
    outerBorderColor: js.Any
  ): Splitter = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], innerBorderColor = innerBorderColor.asInstanceOf[js.Any], leftInnerBorderColor = leftInnerBorderColor.asInstanceOf[js.Any], outerBorderColor = outerBorderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Splitter]
  }
  @scala.inline
  implicit class SplitterOps[Self <: Splitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerBorderColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftInnerBorderColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftInnerBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterBorderColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

