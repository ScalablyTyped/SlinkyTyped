package typingsSlinky.weappApi.mod.wx

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageOptions
  extends /* key */ StringDictionary[js.Any] {
  
  /** 页面的初始数据 */
  var data: js.UndefOr[js.Any] = js.native
  
  /** 生命周期函数--监听页面隐藏 */
  var onHide: js.UndefOr[NoneParamCallback] = js.native
  
  /** 生命周期函数--监听页面加载 */
  var onLoad: js.UndefOr[js.Function1[/* options */ js.Any, Unit]] = js.native
  
  /** 生命周期函数--监听页面渲染完成 */
  var onReady: js.UndefOr[NoneParamCallback] = js.native
  
  /** 生命周期函数--监听页面显示 */
  var onShow: js.UndefOr[NoneParamCallback] = js.native
  
  /** 生命周期函数--监听页面卸载 */
  var onUnload: js.UndefOr[NoneParamCallback] = js.native
}
object PageOptions {
  
  @scala.inline
  def apply(): PageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageOptions]
  }
  
  @scala.inline
  implicit class PageOptionsMutableBuilder[Self <: PageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnLoad(value: /* options */ js.Any => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setOnUnload(value: () => Unit): Self = StObject.set(x, "onUnload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnUnloadUndefined: Self = StObject.set(x, "onUnload", js.undefined)
  }
}
