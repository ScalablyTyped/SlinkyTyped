package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fields extends StObject {
  
  /** 指定样式名列表，返回节点对应样式名的当前值
    *
    * 最低基础库： `2.1.0` */
  var computedStyle: js.UndefOr[js.Array[String]] = js.native
  
  /** 是否返回节点对应的 Context 对象
    *
    * 最低基础库： `2.4.2` */
  var context: js.UndefOr[Boolean] = js.native
  
  /** 是否返回节点 dataset */
  var dataset: js.UndefOr[Boolean] = js.native
  
  /** 是否返回节点 id */
  var id: js.UndefOr[Boolean] = js.native
  
  /** 是否返回节点 mark */
  var mark: js.UndefOr[Boolean] = js.native
  
  /** 是否返回节点对应的 Node 实例
    *
    * 最低基础库： `2.7.0` */
  var node: js.UndefOr[Boolean] = js.native
  
  /** 指定属性名列表，返回节点对应属性名的当前属性值（只能获得组件文档中标注的常规属性值，id class style 和事件绑定的属性值不可获取） */
  var properties: js.UndefOr[js.Array[String]] = js.native
  
  /** 是否返回节点布局位置（`left` `right` `top` `bottom`） */
  var rect: js.UndefOr[Boolean] = js.native
  
  /** 否 是否返回节点的 `scrollLeft` `scrollTop`，节点必须是 `scroll-view` 或者 `viewport` */
  var scrollOffset: js.UndefOr[Boolean] = js.native
  
  /** 是否返回节点尺寸（`width` `height`） */
  var size: js.UndefOr[Boolean] = js.native
}
object Fields {
  
  @scala.inline
  def apply(): Fields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fields]
  }
  
  @scala.inline
  implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputedStyle(value: js.Array[String]): Self = StObject.set(x, "computedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputedStyleUndefined: Self = StObject.set(x, "computedStyle", js.undefined)
    
    @scala.inline
    def setComputedStyleVarargs(value: String*): Self = StObject.set(x, "computedStyle", js.Array(value :_*))
    
    @scala.inline
    def setContext(value: Boolean): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDataset(value: Boolean): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    @scala.inline
    def setNode(value: Boolean): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setRect(value: Boolean): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
    
    @scala.inline
    def setScrollOffset(value: Boolean): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollOffsetUndefined: Self = StObject.set(x, "scrollOffset", js.undefined)
    
    @scala.inline
    def setSize(value: Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
