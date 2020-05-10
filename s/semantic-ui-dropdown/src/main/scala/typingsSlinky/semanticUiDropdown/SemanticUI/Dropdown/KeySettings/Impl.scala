package typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.KeySettings

import typingsSlinky.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 8
    */
  var backspace: Double = js.native
  /**
    * @default 46
    */
  var deleteKey: Double = js.native
  /**
    * @default 188
    */
  var delimiter: Double | `false` = js.native
  /**
    * @default 40
    */
  var downArrow: Double = js.native
  /**
    * @default 13
    */
  var enter: Double = js.native
  /**
    * @default 27
    */
  var escape: Double = js.native
  /**
    * @default 37
    */
  var leftArrow: Double = js.native
  /**
    * @default 34
    */
  var pageDown: Double = js.native
  /**
    * @default 33
    */
  var pageUp: Double = js.native
  /**
    * @default 39
    */
  var rightArrow: Double = js.native
  /**
    * @default 38
    */
  var upArrow: Double = js.native
}

object Impl {
  @scala.inline
  def apply(
    backspace: Double,
    deleteKey: Double,
    delimiter: Double | `false`,
    downArrow: Double,
    enter: Double,
    escape: Double,
    leftArrow: Double,
    pageDown: Double,
    pageUp: Double,
    rightArrow: Double,
    upArrow: Double
  ): Impl = {
    val __obj = js.Dynamic.literal(backspace = backspace.asInstanceOf[js.Any], deleteKey = deleteKey.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], downArrow = downArrow.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any], leftArrow = leftArrow.asInstanceOf[js.Any], pageDown = pageDown.asInstanceOf[js.Any], pageUp = pageUp.asInstanceOf[js.Any], rightArrow = rightArrow.asInstanceOf[js.Any], upArrow = upArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackspace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelimiter(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownArrow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEscape(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftArrow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageDown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageUp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightArrow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpArrow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upArrow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

