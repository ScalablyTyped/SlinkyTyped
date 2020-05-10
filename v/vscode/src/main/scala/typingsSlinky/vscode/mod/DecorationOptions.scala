package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecorationOptions extends js.Object {
  /**
  		 * A message that should be rendered when hovering over the decoration.
  		 */
  var hoverMessage: js.UndefOr[MarkedString | js.Array[MarkedString]] = js.native
  /**
  		 * Range to which this decoration is applied. The range must not be empty.
  		 */
  var range: Range = js.native
  /**
  		 * Render options applied to the current decoration. For performance reasons, keep the
  		 * number of decoration specific options small, and use decoration types wherever possible.
  		 */
  var renderOptions: js.UndefOr[DecorationInstanceRenderOptions] = js.native
}

object DecorationOptions {
  @scala.inline
  def apply(range: Range): DecorationOptions = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorationOptions]
  }
  @scala.inline
  implicit class DecorationOptionsOps[Self <: DecorationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverMessage(value: MarkedString | js.Array[MarkedString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderOptions(value: DecorationInstanceRenderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOptions")(js.undefined)
        ret
    }
  }
  
}

