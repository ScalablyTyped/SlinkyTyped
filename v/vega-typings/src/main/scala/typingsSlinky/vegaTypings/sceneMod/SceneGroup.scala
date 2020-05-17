package typingsSlinky.vegaTypings.sceneMod

import typingsSlinky.vegaTypings.anon.Role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vega-typings.vega-typings/types/runtime/scene.SceneItem & {  context  :vega-typings.vega-typings/types/runtime/scene.SceneContext,   items  :std.Array<vega-typings.vega-typings/types/runtime/scene.SceneItem>,   height  :number,   width  :number,   stroke ? :string} */
@js.native
trait SceneGroup extends js.Object {
  var bounds: Bounds = js.native
  var context: SceneContext = js.native
  var datum: js.UndefOr[js.Object] = js.native
  var height: Double = js.native
  var items: js.Array[SceneItem] = js.native
  var mark: Role = js.native
  var stroke: js.UndefOr[String] = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object SceneGroup {
  @scala.inline
  def apply(
    bounds: Bounds,
    context: SceneContext,
    height: Double,
    items: js.Array[SceneItem],
    mark: Role,
    width: Double,
    x: Double,
    y: Double
  ): SceneGroup = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneGroup]
  }
  @scala.inline
  implicit class SceneGroupOps[Self <: SceneGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: Bounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: SceneContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[SceneItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMark(value: Role): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatum(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datum")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
  }
  
}

