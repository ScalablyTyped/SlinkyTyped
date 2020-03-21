package typingsSlinky.vegaTypings.sceneMod

import typingsSlinky.vegaTypings.AnonRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vega-typings.vega-typings/types/runtime/scene.SceneItem & {  align  :vega-typings.vega-typings/types/runtime/scene.SceneTextAlign,   angle  :number,   baseline  :vega-typings.vega-typings/types/runtime/scene.SceneTextBaseline,   fill  :string,   font  :string,   fontSize  :number,   text  :string} */
trait SceneText extends js.Object {
  var align: SceneTextAlign
  var angle: Double
  var baseline: SceneTextBaseline
  var bounds: Bounds
  var datum: js.UndefOr[js.Object] = js.undefined
  var fill: String
  var font: String
  var fontSize: Double
  var mark: AnonRole
  var text: String
  var x: Double
  var y: Double
}

object SceneText {
  @scala.inline
  def apply(
    align: SceneTextAlign,
    angle: Double,
    baseline: SceneTextBaseline,
    bounds: Bounds,
    fill: String,
    font: String,
    fontSize: Double,
    mark: AnonRole,
    text: String,
    x: Double,
    y: Double,
    datum: js.Object = null
  ): SceneText = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneText]
  }
}

