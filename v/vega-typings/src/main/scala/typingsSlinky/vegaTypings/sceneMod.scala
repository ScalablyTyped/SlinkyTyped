package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.anon.Index
import typingsSlinky.vegaTypings.anon.Role
import typingsSlinky.vegaTypings.vegaTypingsStrings.ltr
import typingsSlinky.vegaTypings.vegaTypingsStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneMod {
  
  @JSImport("vega-typings/types/runtime/scene", "Bounds")
  @js.native
  class Bounds () extends StObject {
    
    def add(x: Double, y: Double): Bounds = js.native
    
    def alignsWith(b: Bounds): Boolean = js.native
    
    def clear(): Bounds = js.native
    
    def contains(x: Double, y: Double): Boolean = js.native
    
    def empty(): Unit = js.native
    
    def encloses(b: Bounds): Boolean = js.native
    
    def equals(b: Bounds): Boolean = js.native
    
    def expand(d: Double): Bounds = js.native
    
    def height(): Double = js.native
    
    def intersects(b: Bounds): Boolean = js.native
    
    def rotate(angle: Double, x: Double, y: Double): Bounds = js.native
    
    def rotatedPoints(angle: Double, x: Double, y: Double): js.Array[Double] = js.native
    
    def round(): Bounds = js.native
    
    def set(x1: Double, y1: Double, x2: Double, y2: Double): Bounds = js.native
    
    def translate(dx: Double, dy: Double): Bounds = js.native
    
    def union(b: Bounds): Bounds = js.native
    
    def width(): Double = js.native
    
    var x1: Double = js.native
    
    var x2: Double = js.native
    
    var y1: Double = js.native
    
    var y2: Double = js.native
  }
  
  @JSImport("vega-typings/types/runtime/scene", "sceneVisit")
  @js.native
  def sceneVisit(scene: SceneGroup, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = js.native
  @JSImport("vega-typings/types/runtime/scene", "sceneVisit")
  @js.native
  def sceneVisit(scene: Scene, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = js.native
  
  @js.native
  trait Scene extends StObject {
    
    var bounds: Bounds = js.native
    
    var clip: Boolean = js.native
    
    var interactive: Boolean = js.native
    
    var items: js.Array[SceneGroup] = js.native
    
    var marktype: String = js.native
    
    var name: String = js.native
    
    var role: String = js.native
  }
  object Scene {
    
    @scala.inline
    def apply(
      bounds: Bounds,
      clip: Boolean,
      interactive: Boolean,
      items: js.Array[SceneGroup],
      marktype: String,
      name: String,
      role: String
    ): Scene = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], marktype = marktype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scene]
    }
    
    @scala.inline
    implicit class SceneMutableBuilder[Self <: Scene] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[SceneGroup]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: SceneGroup*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMarktype(value: String): Self = StObject.set(x, "marktype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SceneContext extends StObject {
    
    var background: js.UndefOr[String] = js.native
  }
  object SceneContext {
    
    @scala.inline
    def apply(): SceneContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SceneContext]
    }
    
    @scala.inline
    implicit class SceneContextMutableBuilder[Self <: SceneContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    }
  }
  
  /* Inlined vega-typings.vega-typings/types/runtime/scene.SceneItem & {  context :vega-typings.vega-typings/types/runtime/scene.SceneContext,   items :std.Array<vega-typings.vega-typings/types/runtime/scene.SceneItem>,   height :number,   width :number,   stroke :string | undefined} */
  @js.native
  trait SceneGroup extends StObject {
    
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
    implicit class SceneGroupMutableBuilder[Self <: SceneGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: SceneContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatum(value: js.Object): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[SceneItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: SceneItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMark(value: Role): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SceneItem extends StObject {
    
    var bounds: Bounds = js.native
    
    var datum: js.UndefOr[js.Object] = js.native
    
    var mark: Role = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object SceneItem {
    
    @scala.inline
    def apply(bounds: Bounds, mark: Role, x: Double, y: Double): SceneItem = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SceneItem]
    }
    
    @scala.inline
    implicit class SceneItemMutableBuilder[Self <: SceneItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatum(value: js.Object): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      @scala.inline
      def setMark(value: Role): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SceneLegendItem extends StObject {
    
    var datum: Index = js.native
  }
  object SceneLegendItem {
    
    @scala.inline
    def apply(datum: Index): SceneLegendItem = {
      val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any])
      __obj.asInstanceOf[SceneLegendItem]
    }
    
    @scala.inline
    implicit class SceneLegendItemMutableBuilder[Self <: SceneLegendItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatum(value: Index): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined vega-typings.vega-typings/types/runtime/scene.SceneItem & {  opacity :number,   stroke :string,   strokeWidth :number,   x2 :number,   y2 :number} */
  @js.native
  trait SceneLine extends StObject {
    
    var bounds: Bounds = js.native
    
    var datum: js.UndefOr[js.Object] = js.native
    
    var mark: Role = js.native
    
    var opacity: Double = js.native
    
    var stroke: String = js.native
    
    var strokeWidth: Double = js.native
    
    var x: Double = js.native
    
    var x2: Double = js.native
    
    var y: Double = js.native
    
    var y2: Double = js.native
  }
  object SceneLine {
    
    @scala.inline
    def apply(
      bounds: Bounds,
      mark: Role,
      opacity: Double,
      stroke: String,
      strokeWidth: Double,
      x: Double,
      x2: Double,
      y: Double,
      y2: Double
    ): SceneLine = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[SceneLine]
    }
    
    @scala.inline
    implicit class SceneLineMutableBuilder[Self <: SceneLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatum(value: js.Object): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      @scala.inline
      def setMark(value: Role): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined vega-typings.vega-typings/types/runtime/scene.SceneItem & {  fill :string,   height :number,   width :number} */
  @js.native
  trait SceneRect extends StObject {
    
    var bounds: Bounds = js.native
    
    var datum: js.UndefOr[js.Object] = js.native
    
    var fill: String = js.native
    
    var height: Double = js.native
    
    var mark: Role = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object SceneRect {
    
    @scala.inline
    def apply(bounds: Bounds, fill: String, height: Double, mark: Role, width: Double, x: Double, y: Double): SceneRect = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SceneRect]
    }
    
    @scala.inline
    implicit class SceneRectMutableBuilder[Self <: SceneRect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatum(value: js.Object): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMark(value: Role): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined vega-typings.vega-typings/types/runtime/scene.SceneItem & {  fill :string,   shape :string,   size :number,   strokeWidth :number} */
  @js.native
  trait SceneSymbol extends StObject {
    
    var bounds: Bounds = js.native
    
    var datum: js.UndefOr[js.Object] = js.native
    
    var fill: String = js.native
    
    var mark: Role = js.native
    
    var shape: String = js.native
    
    var size: Double = js.native
    
    var strokeWidth: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object SceneSymbol {
    
    @scala.inline
    def apply(
      bounds: Bounds,
      fill: String,
      mark: Role,
      shape: String,
      size: Double,
      strokeWidth: Double,
      x: Double,
      y: Double
    ): SceneSymbol = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SceneSymbol]
    }
    
    @scala.inline
    implicit class SceneSymbolMutableBuilder[Self <: SceneSymbol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatum(value: js.Object): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMark(value: Role): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined vega-typings.vega-typings/types/runtime/scene.SceneItem & {  align :vega-typings.vega-typings/types/runtime/scene.SceneTextAlign | undefined,   angle :number | undefined,   baseline :vega-typings.vega-typings/types/runtime/scene.SceneTextBaseline,   dir :'rtl' | 'ltr' | undefined,   dx :number | undefined,   dy :number,   ellipsis :string | undefined,   fill :string,   font :string,   fontSize :number,   fontStyle :string | undefined,   fontWeight :number | string | undefined,   limit :number | undefined,   lineBreak :string | undefined,   lineHeight :number | undefined,   radius :number | undefined,   text :string,   theta :number | undefined} */
  @js.native
  trait SceneText extends StObject {
    
    var align: js.UndefOr[SceneTextAlign] = js.native
    
    var angle: js.UndefOr[Double] = js.native
    
    var baseline: SceneTextBaseline = js.native
    
    var bounds: Bounds = js.native
    
    var datum: js.UndefOr[js.Object] = js.native
    
    var dir: js.UndefOr[rtl | ltr] = js.native
    
    var dx: js.UndefOr[Double] = js.native
    
    var dy: Double = js.native
    
    var ellipsis: js.UndefOr[String] = js.native
    
    var fill: String = js.native
    
    var font: String = js.native
    
    var fontSize: Double = js.native
    
    var fontStyle: js.UndefOr[String] = js.native
    
    var fontWeight: js.UndefOr[Double | String] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var lineBreak: js.UndefOr[String] = js.native
    
    var lineHeight: js.UndefOr[Double] = js.native
    
    var mark: Role = js.native
    
    var radius: js.UndefOr[Double] = js.native
    
    var text: String = js.native
    
    var theta: js.UndefOr[Double] = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object SceneText {
    
    @scala.inline
    def apply(
      baseline: SceneTextBaseline,
      bounds: Bounds,
      dy: Double,
      fill: String,
      font: String,
      fontSize: Double,
      mark: Role,
      text: String,
      x: Double,
      y: Double
    ): SceneText = {
      val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SceneText]
    }
    
    @scala.inline
    implicit class SceneTextMutableBuilder[Self <: SceneText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: SceneTextAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setBaseline(value: SceneTextBaseline): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatum(value: js.Object): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      @scala.inline
      def setDir(value: rtl | ltr): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      @scala.inline
      def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsis(value: String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: Double | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setLineBreak(value: String): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setMark(value: Role): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheta(value: Double): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.vegaTypingsStrings.left
    - typingsSlinky.vegaTypings.vegaTypingsStrings.center
    - typingsSlinky.vegaTypings.vegaTypingsStrings.right
  */
  trait SceneTextAlign extends StObject
  object SceneTextAlign {
    
    @scala.inline
    def center: typingsSlinky.vegaTypings.vegaTypingsStrings.center = "center".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.center]
    
    @scala.inline
    def left: typingsSlinky.vegaTypings.vegaTypingsStrings.left = "left".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.left]
    
    @scala.inline
    def right: typingsSlinky.vegaTypings.vegaTypingsStrings.right = "right".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.vegaTypingsStrings.top
    - typingsSlinky.vegaTypings.vegaTypingsStrings.middle
    - typingsSlinky.vegaTypings.vegaTypingsStrings.bottom
  */
  trait SceneTextBaseline extends StObject
  object SceneTextBaseline {
    
    @scala.inline
    def bottom: typingsSlinky.vegaTypings.vegaTypingsStrings.bottom = "bottom".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.bottom]
    
    @scala.inline
    def middle: typingsSlinky.vegaTypings.vegaTypingsStrings.middle = "middle".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.middle]
    
    @scala.inline
    def top: typingsSlinky.vegaTypings.vegaTypingsStrings.top = "top".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.top]
  }
}
