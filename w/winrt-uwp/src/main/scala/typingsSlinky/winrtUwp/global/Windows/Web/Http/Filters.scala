package typingsSlinky.winrtUwp.global.Windows.Web.Http

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes to send HTTP requests and an interface to create filters to target HTTP and REST services in Windows Store apps. */
@JSGlobal("Windows.Web.Http.Filters")
@js.native
object Filters extends js.Object {
  
  /** The base protocol filter for an HttpClient instance. */
  @js.native
  /** Initializes a new instance of the HttpBaseProtocolFilter class. */
  class HttpBaseProtocolFilter ()
    extends typingsSlinky.winrtUwp.Windows.Web.Http.Filters.HttpBaseProtocolFilter
  
  /** Provides control of the local HTTP cache for responses to HTTP requests by methods in the Windows.Web.Http and Windows.Web.Http.Filters namespaces. */
  @js.native
  abstract class HttpCacheControl ()
    extends typingsSlinky.winrtUwp.Windows.Web.Http.Filters.HttpCacheControl
  
  /** Indicates if read requests by class methods in the Windows.Web.Http and Windows.Web.Http.Filters namespaces use the local HTTP cache for the response. */
  @js.native
  object HttpCacheReadBehavior extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Web.Http.Filters.HttpCacheReadBehavior with Double
      ] = js.native
    
    /* 0 */ val default: typingsSlinky.winrtUwp.Windows.Web.Http.Filters.HttpCacheReadBehavior.default with Double = js.native
    
    /* 1 */ val mostRecent: typingsSlinky.winrtUwp.Windows.Web.Http.Filters.HttpCacheReadBehavior.mostRecent with Double = js.native
    
    /* 2 */ val onlyFromCache: typingsSlinky.winrtUwp.Windows.Web.Http.Filters.HttpCacheReadBehavior.onlyFromCache with Double = js.native
  }
  
  /** Indicates if content returned by requests used by class methods in the Windows.Web.Http and Windows.Web.Http.Filters namespaces is written to the local HTTP cache. */
  @js.native
  object HttpCacheWriteBehavior extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Web.Http.Filters.HttpCacheWriteBehavior with Double
      ] = js.native
    
    /* 0 */ val default: typingsSlinky.winrtUwp.Windows.Web.Http.Filters.HttpCacheWriteBehavior.default with Double = js.native
    
    /* 1 */ val noCache: typingsSlinky.winrtUwp.Windows.Web.Http.Filters.HttpCacheWriteBehavior.noCache with Double = js.native
  }
  
  /** Defines the cookie usage behavior that is used in the CookieUsageBehavior property. */
  @js.native
  object HttpCookieUsageBehavior extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Web.Http.Filters.HttpCookieUsageBehavior with Double
      ] = js.native
    
    /* 0 */ val default: typingsSlinky.winrtUwp.Windows.Web.Http.Filters.HttpCookieUsageBehavior.default with Double = js.native
    
    /* 1 */ val noCookies: typingsSlinky.winrtUwp.Windows.Web.Http.Filters.HttpCookieUsageBehavior.noCookies with Double = js.native
  }
}
