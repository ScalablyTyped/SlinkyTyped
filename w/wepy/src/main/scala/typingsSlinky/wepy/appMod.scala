package typingsSlinky.wepy

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.wepy.anon.Pages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMod {
  
  @JSImport("wepy/app", JSImport.Default)
  @js.native
  class default () extends app
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.wepy.wepyStrings.requestfix
    - typingsSlinky.wepy.wepyStrings.promisify
  */
  trait AddOn extends StObject
  object AddOn {
    
    @scala.inline
    def promisify: typingsSlinky.wepy.wepyStrings.promisify = "promisify".asInstanceOf[typingsSlinky.wepy.wepyStrings.promisify]
    
    @scala.inline
    def requestfix: typingsSlinky.wepy.wepyStrings.requestfix = "requestfix".asInstanceOf[typingsSlinky.wepy.wepyStrings.requestfix]
  }
  
  @js.native
  trait AppConfig extends StObject {
    
    var appEvents: js.UndefOr[js.Array[String]] = js.native
    
    var noPromiseAPI: js.UndefOr[js.Array[String] | StringDictionary[Boolean]] = js.native
    
    var pageEvents: js.UndefOr[js.Array[String]] = js.native
  }
  object AppConfig {
    
    @scala.inline
    def apply(): AppConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppConfig]
    }
    
    @scala.inline
    implicit class AppConfigMutableBuilder[Self <: AppConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppEvents(value: js.Array[String]): Self = StObject.set(x, "appEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppEventsUndefined: Self = StObject.set(x, "appEvents", js.undefined)
      
      @scala.inline
      def setAppEventsVarargs(value: String*): Self = StObject.set(x, "appEvents", js.Array(value :_*))
      
      @scala.inline
      def setNoPromiseAPI(value: js.Array[String] | StringDictionary[Boolean]): Self = StObject.set(x, "noPromiseAPI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoPromiseAPIUndefined: Self = StObject.set(x, "noPromiseAPI", js.undefined)
      
      @scala.inline
      def setNoPromiseAPIVarargs(value: String*): Self = StObject.set(x, "noPromiseAPI", js.Array(value :_*))
      
      @scala.inline
      def setPageEvents(value: js.Array[String]): Self = StObject.set(x, "pageEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageEventsUndefined: Self = StObject.set(x, "pageEvents", js.undefined)
      
      @scala.inline
      def setPageEventsVarargs(value: String*): Self = StObject.set(x, "pageEvents", js.Array(value :_*))
    }
  }
  
  @js.native
  trait AppConstructor extends Instantiable0[app]
  
  @js.native
  trait app extends StObject {
    
    @JSName("$init")
    def $init(wepy: js.Any, config: AppConfig): Unit = js.native
    
    @JSName("$initAPI")
    def $initAPI(wepy: js.Any, noPromiseAPI: js.Array[String]): Unit = js.native
    @JSName("$initAPI")
    def $initAPI(wepy: js.Any, noPromiseAPI: StringDictionary[Boolean]): Unit = js.native
    
    var config: Pages = js.native
    
    def use(addonName: AddOn, args: js.Any*): Unit = js.native
  }
}
