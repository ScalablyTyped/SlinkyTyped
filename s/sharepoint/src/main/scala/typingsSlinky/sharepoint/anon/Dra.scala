package typingsSlinky.sharepoint.anon

import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Splitter
import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.SplitterHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dra extends js.Object {
  var dra: Splitter = js.native
  var dragHandle: SplitterHandle = js.native
  var hover: Splitter = js.native
  var hoverHandle: SplitterHandle = js.native
  var normal: Splitter = js.native
  var normalHandle: SplitterHandle = js.native
}

object Dra {
  @scala.inline
  def apply(
    dra: Splitter,
    dragHandle: SplitterHandle,
    hover: Splitter,
    hoverHandle: SplitterHandle,
    normal: Splitter,
    normalHandle: SplitterHandle
  ): Dra = {
    val __obj = js.Dynamic.literal(dra = dra.asInstanceOf[js.Any], dragHandle = dragHandle.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], hoverHandle = hoverHandle.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalHandle = normalHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dra]
  }
  @scala.inline
  implicit class DraOps[Self <: Dra] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDra(value: Splitter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragHandle(value: SplitterHandle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHover(value: Splitter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverHandle(value: SplitterHandle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormal(value: Splitter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalHandle(value: SplitterHandle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalHandle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

