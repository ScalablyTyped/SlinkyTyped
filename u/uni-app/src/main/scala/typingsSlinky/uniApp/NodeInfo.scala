package typingsSlinky.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeInfo extends StObject {
  
  /**
    * 节点的下边界坐标
    */
  var bottom: js.UndefOr[Double] = js.native
  
  /**
    * 节点对应的 Context 对象
    */
  var context: js.UndefOr[MapContext | CanvasContext | VideoContext | EditorContext] = js.native
  
  /**
    * 节点的dataset
    */
  var dataset: js.UndefOr[js.Any] = js.native
  
  /**
    * 节点的高度
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * 节点的ID
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * 节点的左边界坐标
    */
  var left: js.UndefOr[Double] = js.native
  
  /**
    * 节点的右边界坐标
    */
  var right: js.UndefOr[Double] = js.native
  
  /**
    * 节点的水平滚动位置
    */
  var scrollLeft: js.UndefOr[Double] = js.native
  
  /**
    * 节点的垂直滚动位置
    */
  var scrollTop: js.UndefOr[Double] = js.native
  
  /**
    * 节点的上边界坐标
    */
  var top: js.UndefOr[Double] = js.native
  
  /**
    * 节点的宽度
    */
  var width: js.UndefOr[Double] = js.native
}
object NodeInfo {
  
  @scala.inline
  def apply(): NodeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeInfo]
  }
  
  @scala.inline
  implicit class NodeInfoMutableBuilder[Self <: NodeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setContext(value: MapContext | CanvasContext | VideoContext | EditorContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDataset(value: js.Any): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
