package typingsSlinky.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionOptions extends js.Object {
  var highlightEdges: js.UndefOr[Boolean] = js.native
  var unselectAll: js.UndefOr[Boolean] = js.native
}

object SelectionOptions {
  @scala.inline
  def apply(): SelectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionOptions]
  }
  @scala.inline
  implicit class SelectionOptionsOps[Self <: SelectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighlightEdges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightEdges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightEdges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightEdges")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselectAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnselectAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectAll")(js.undefined)
        ret
    }
  }
  
}

