package typingsSlinky.wepy

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.wepy.anon.Delta
import typingsSlinky.wepy.wepyStrings.navigateTo
import typingsSlinky.wepy.wepyStrings.redirectTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageMod {
  
  @JSImport("wepy/page", JSImport.Default)
  @js.native
  class default () extends page
  
  @js.native
  trait PageConfig extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var backgroundTextStyle: js.UndefOr[String] = js.native
    
    var disableScroll: js.UndefOr[Boolean] = js.native
    
    var enablePullDownRefresh: js.UndefOr[Boolean] = js.native
    
    var navigationBarBackgroundColor: js.UndefOr[String] = js.native
    
    var navigationBarTextStyle: js.UndefOr[String] = js.native
    
    var navigationBarTitleText: js.UndefOr[String] = js.native
    
    var onReachBottomDistance: js.UndefOr[Double] = js.native
  }
  object PageConfig {
    
    @scala.inline
    def apply(): PageConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageConfig]
    }
    
    @scala.inline
    implicit class PageConfigMutableBuilder[Self <: PageConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBackgroundTextStyle(value: String): Self = StObject.set(x, "backgroundTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundTextStyleUndefined: Self = StObject.set(x, "backgroundTextStyle", js.undefined)
      
      @scala.inline
      def setDisableScroll(value: Boolean): Self = StObject.set(x, "disableScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableScrollUndefined: Self = StObject.set(x, "disableScroll", js.undefined)
      
      @scala.inline
      def setEnablePullDownRefresh(value: Boolean): Self = StObject.set(x, "enablePullDownRefresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePullDownRefreshUndefined: Self = StObject.set(x, "enablePullDownRefresh", js.undefined)
      
      @scala.inline
      def setNavigationBarBackgroundColor(value: String): Self = StObject.set(x, "navigationBarBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationBarBackgroundColorUndefined: Self = StObject.set(x, "navigationBarBackgroundColor", js.undefined)
      
      @scala.inline
      def setNavigationBarTextStyle(value: String): Self = StObject.set(x, "navigationBarTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationBarTextStyleUndefined: Self = StObject.set(x, "navigationBarTextStyle", js.undefined)
      
      @scala.inline
      def setNavigationBarTitleText(value: String): Self = StObject.set(x, "navigationBarTitleText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationBarTitleTextUndefined: Self = StObject.set(x, "navigationBarTitleText", js.undefined)
      
      @scala.inline
      def setOnReachBottomDistance(value: Double): Self = StObject.set(x, "onReachBottomDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnReachBottomDistanceUndefined: Self = StObject.set(x, "onReachBottomDistance", js.undefined)
    }
  }
  
  @js.native
  trait PageConstructor extends Instantiable0[page]
  
  @js.native
  trait UrlParam extends StObject {
    
    var url: String = js.native
  }
  object UrlParam {
    
    @scala.inline
    def apply(url: String): UrlParam = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlParam]
    }
    
    @scala.inline
    implicit class UrlParamMutableBuilder[Self <: UrlParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait page
    extends typingsSlinky.wepy.componentMod.default {
    
    @JSName("$back")
    def $back(delta: Double): js.Any = js.native
    @JSName("$back")
    def $back(delta: Delta): js.Any = js.native
    
    @JSName("$init")
    def $init(wxpage: js.Any, $parent: js.Any): js.Any = js.native
    
    @JSName("$preload")
    def $preload(key: String, data: js.Any): js.Any = js.native
    @JSName("$preload")
    def $preload(key: StringDictionary[js.Any], data: js.Any): js.Any = js.native
    
    @JSName("$preloadData")
    var $preloadData: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    @JSName("$redirect")
    def $redirect(url: String): js.Any = js.native
    @JSName("$redirect")
    def $redirect(url: String, params: js.Object): js.Any = js.native
    
    @JSName("$route")
    def $route_navigateTo(`type`: navigateTo, url: String): js.Any = js.native
    @JSName("$route")
    def $route_navigateTo(`type`: navigateTo, url: String, params: StringDictionary[js.Any]): js.Any = js.native
    @JSName("$route")
    def $route_navigateTo(`type`: navigateTo, url: UrlParam): js.Any = js.native
    @JSName("$route")
    def $route_navigateTo(`type`: navigateTo, url: UrlParam, params: StringDictionary[js.Any]): js.Any = js.native
    @JSName("$route")
    def $route_redirectTo(`type`: redirectTo, url: String): js.Any = js.native
    @JSName("$route")
    def $route_redirectTo(`type`: redirectTo, url: String, params: StringDictionary[js.Any]): js.Any = js.native
    @JSName("$route")
    def $route_redirectTo(`type`: redirectTo, url: UrlParam): js.Any = js.native
    @JSName("$route")
    def $route_redirectTo(`type`: redirectTo, url: UrlParam, params: StringDictionary[js.Any]): js.Any = js.native
    
    @JSName("$switch")
    def $switch(url: String): js.Any = js.native
    @JSName("$switch")
    def $switch(url: UrlParam): js.Any = js.native
    
    var config: js.UndefOr[PageConfig] = js.native
  }
}
