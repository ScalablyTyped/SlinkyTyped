package typingsSlinky.victory.anon

import typingsSlinky.victory.mod.OrientationTypes
import typingsSlinky.victory.victoryStrings.horizontal
import typingsSlinky.victory.victoryStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  gutter :number | undefined,   orientation :'vertical' | 'horizontal' | undefined,   titleOrientation :victory.victory.OrientationTypes | undefined,   style :{  data :react.react.CSSProperties & {  type :victory.victory.ScatterSymbolType | undefined} | undefined,   labels :react.react.CSSProperties | undefined,   title :react.react.CSSProperties | undefined} | undefined} & victory.victory.ThemeBaseProps */
@js.native
trait gutternumberundefinedorie extends StObject {
  
  var colorScale: js.Array[String] = js.native
  
  var gutter: js.UndefOr[Double] = js.native
  
  var height: Double = js.native
  
  var orientation: js.UndefOr[vertical | horizontal] = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[Labels] = js.native
  
  var titleOrientation: js.UndefOr[OrientationTypes] = js.native
  
  var width: Double = js.native
}
object gutternumberundefinedorie {
  
  @scala.inline
  def apply(colorScale: js.Array[String], height: Double, width: Double): gutternumberundefinedorie = {
    val __obj = js.Dynamic.literal(colorScale = colorScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[gutternumberundefinedorie]
  }
  
  @scala.inline
  implicit class gutternumberundefinedorieMutableBuilder[Self <: gutternumberundefinedorie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorScale(value: js.Array[String]): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorScaleVarargs(value: String*): Self = StObject.set(x, "colorScale", js.Array(value :_*))
    
    @scala.inline
    def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setStyle(value: Labels): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTitleOrientation(value: OrientationTypes): Self = StObject.set(x, "titleOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleOrientationUndefined: Self = StObject.set(x, "titleOrientation", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
