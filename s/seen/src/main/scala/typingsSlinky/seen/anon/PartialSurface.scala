package typingsSlinky.seen.anon

import typingsSlinky.seen.mod.Color
import typingsSlinky.seen.mod.Material
import typingsSlinky.seen.mod.Painter
import typingsSlinky.seen.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<seen.seen.Surface> */
@js.native
trait PartialSurface extends js.Object {
  var constructor: js.UndefOr[
    js.Function2[/* points */ js.Array[Point], /* painter */ js.UndefOr[Painter], js.Any]
  ] = js.native
  var cullBackfaces: js.UndefOr[Boolean] = js.native
  var dirty: js.UndefOr[Boolean] = js.native
  var fill: js.UndefOr[js.Function1[/* fill */ String | Color, this.type]] = js.native
  var fillMaterial: js.UndefOr[Material] = js.native
  var id: js.UndefOr[String] = js.native
  var painter: js.UndefOr[Painter] = js.native
  var points: js.UndefOr[js.Array[Point]] = js.native
  var stroke: js.UndefOr[js.Function1[/* stroke */ String | Color, this.type]] = js.native
  var strokeMaterial: js.UndefOr[Material] = js.native
}

object PartialSurface {
  @scala.inline
  def apply(): PartialSurface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSurface]
  }
  @scala.inline
  implicit class PartialSurfaceOps[Self <: PartialSurface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstructor(value: (/* points */ js.Array[Point], /* painter */ js.UndefOr[Painter]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutConstructor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(js.undefined)
        ret
    }
    @scala.inline
    def withCullBackfaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cullBackfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCullBackfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cullBackfaces")(js.undefined)
        ret
    }
    @scala.inline
    def withDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: /* fill */ String | Color => PartialSurface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFillMaterial(value: Material): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillMaterial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillMaterial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillMaterial")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withPainter(value: Painter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("painter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPainter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("painter")(js.undefined)
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[Point]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: /* stroke */ String | Color => PartialSurface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeMaterial(value: Material): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeMaterial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeMaterial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeMaterial")(js.undefined)
        ret
    }
  }
  
}

