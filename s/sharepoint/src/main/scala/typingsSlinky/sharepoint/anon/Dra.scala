package typingsSlinky.sharepoint.anon

import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Splitter
import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.SplitterHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dra extends StObject {
  
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
  implicit class DraMutableBuilder[Self <: Dra] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDra(value: Splitter): Self = StObject.set(x, "dra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragHandle(value: SplitterHandle): Self = StObject.set(x, "dragHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHover(value: Splitter): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverHandle(value: SplitterHandle): Self = StObject.set(x, "hoverHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: Splitter): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalHandle(value: SplitterHandle): Self = StObject.set(x, "normalHandle", value.asInstanceOf[js.Any])
  }
}
