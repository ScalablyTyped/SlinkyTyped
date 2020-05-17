package typingsSlinky.winrt.Windows.UI.Input

import typingsSlinky.winrt.Windows.Foundation.Point
import typingsSlinky.winrt.Windows.Foundation.Rect
import typingsSlinky.winrt.anon.OutPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPointerPointTransform extends js.Object {
  var inverse: IPointerPointTransform = js.native
  def transformBounds(rect: Rect): Rect = js.native
  def tryTransform(inPoint: Point): OutPoint = js.native
}

object IPointerPointTransform {
  @scala.inline
  def apply(inverse: IPointerPointTransform, transformBounds: Rect => Rect, tryTransform: Point => OutPoint): IPointerPointTransform = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any], transformBounds = js.Any.fromFunction1(transformBounds), tryTransform = js.Any.fromFunction1(tryTransform))
    __obj.asInstanceOf[IPointerPointTransform]
  }
  @scala.inline
  implicit class IPointerPointTransformOps[Self <: IPointerPointTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInverse(value: IPointerPointTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformBounds(value: Rect => Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformBounds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTryTransform(value: Point => OutPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryTransform")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

