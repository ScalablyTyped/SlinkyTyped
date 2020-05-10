package typingsSlinky.splitJs.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.splitJs.splitJsStrings.`col-resize`
import typingsSlinky.splitJs.splitJsStrings.`row-resize`
import typingsSlinky.splitJs.splitJsStrings.height
import typingsSlinky.splitJs.splitJsStrings.horizontal
import typingsSlinky.splitJs.splitJsStrings.vertical
import typingsSlinky.splitJs.splitJsStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  // Cursor to display while dragging.
  var cursor: js.UndefOr[`col-resize` | `row-resize`] = js.native
  // Direction to split: horizontal or vertical.
  var direction: js.UndefOr[horizontal | vertical] = js.native
  // Called to set the style of each element.
  var elementStyle: js.UndefOr[
    js.Function3[
      /* dimension */ width | height, 
      /* elementSize */ Double, 
      /* gutterSize */ Double, 
      CSSStyleDeclarationPartial
    ]
  ] = js.native
  // Called to create each gutter element
  var gutter: js.UndefOr[
    js.Function2[/* index */ Double, /* direction */ horizontal | vertical, HTMLElement]
  ] = js.native
  // Gutter size in pixels.
  var gutterSize: js.UndefOr[Double] = js.native
  // Called to set the style of the gutter.
  var gutterStyle: js.UndefOr[
    js.Function2[/* dimension */ width | height, /* gutterSize */ Double, CSSStyleDeclarationPartial]
  ] = js.native
  // Minimum size of each element.
  var minSize: js.UndefOr[Double | js.Array[Double]] = js.native
  // Callback on drag.
  var onDrag: js.UndefOr[js.Function1[/* sizes */ js.Array[Double], Unit]] = js.native
  // Callback on drag end.
  var onDragEnd: js.UndefOr[js.Function1[/* sizes */ js.Array[Double], Unit]] = js.native
  // Callback on drag start.
  var onDragStart: js.UndefOr[js.Function1[/* sizes */ js.Array[Double], Unit]] = js.native
  // Initial sizes of each element in percents or CSS values.
  var sizes: js.UndefOr[js.Array[Double]] = js.native
  // Snap to minimum size offset in pixels.
  var snapOffset: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCursor(value: `col-resize` | `row-resize`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withElementStyle(
      value: (/* dimension */ width | height, /* elementSize */ Double, /* gutterSize */ Double) => CSSStyleDeclarationPartial
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementStyle")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutElementStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withGutter(value: (/* index */ Double, /* direction */ horizontal | vertical) => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(js.undefined)
        ret
    }
    @scala.inline
    def withGutterSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutterSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutterSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutterSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGutterStyle(value: (/* dimension */ width | height, /* gutterSize */ Double) => CSSStyleDeclarationPartial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutterStyle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGutterStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutterStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSize(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: /* sizes */ js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnd(value: /* sizes */ js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: /* sizes */ js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSizes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapOffset")(js.undefined)
        ret
    }
  }
  
}

