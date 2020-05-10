package typingsSlinky.tinymce.mod.geom

import org.scalajs.dom.raw.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rect extends js.Object {
  def clamp(rect: Rect, clampRect: Rect, fixedSize: Boolean): Rect = js.native
  def create(x: Double, y: Double, w: Double, h: Double): Rect = js.native
  def findBestRelativePosition(rect: Rect, targetRect: Rect, constrainRect: Rect, rels: js.Array[_]): Unit = js.native
  def fromClientRect(clientRect: ClientRect): Rect = js.native
  def inflate(rect: Rect, w: Double, h: Double): Rect = js.native
  def intersect(rect: Rect, cropRect: Rect): Rect = js.native
  def relativePosition(rect: Rect, targetRect: Rect, rel: String): Unit = js.native
}

object Rect {
  @scala.inline
  def apply(
    clamp: (Rect, Rect, Boolean) => Rect,
    create: (Double, Double, Double, Double) => Rect,
    findBestRelativePosition: (Rect, Rect, Rect, js.Array[_]) => Unit,
    fromClientRect: ClientRect => Rect,
    inflate: (Rect, Double, Double) => Rect,
    intersect: (Rect, Rect) => Rect,
    relativePosition: (Rect, Rect, String) => Unit
  ): Rect = {
    val __obj = js.Dynamic.literal(clamp = js.Any.fromFunction3(clamp), create = js.Any.fromFunction4(create), findBestRelativePosition = js.Any.fromFunction4(findBestRelativePosition), fromClientRect = js.Any.fromFunction1(fromClientRect), inflate = js.Any.fromFunction3(inflate), intersect = js.Any.fromFunction2(intersect), relativePosition = js.Any.fromFunction3(relativePosition))
    __obj.asInstanceOf[Rect]
  }
  @scala.inline
  implicit class RectOps[Self <: Rect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClamp(value: (Rect, Rect, Boolean) => Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clamp")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCreate(value: (Double, Double, Double, Double) => Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withFindBestRelativePosition(value: (Rect, Rect, Rect, js.Array[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findBestRelativePosition")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withFromClientRect(value: ClientRect => Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromClientRect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInflate(value: (Rect, Double, Double) => Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inflate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withIntersect(value: (Rect, Rect) => Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRelativePosition(value: (Rect, Rect, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePosition")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

