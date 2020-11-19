package typingsSlinky.workboxCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object workboxPluginMod {
  
  type CacheDidUpdateCallback = js.Function1[
    /* param */ typingsSlinky.workboxCore.workboxPluginMod.CacheDidUpdateCallbackParam, 
    js.Promise[scala.Unit]
  ]
  
  type CacheKeyWillBeUsedCallback = js.Function1[
    /* param */ typingsSlinky.workboxCore.workboxPluginMod.CacheKeyWillBeUsedCallbackParam, 
    js.Promise[org.scalajs.dom.experimental.Request | java.lang.String]
  ]
  
  type CacheWillUpdateCallback = js.Function1[
    /* param */ typingsSlinky.workboxCore.workboxPluginMod.CacheWillUpdateCallbackParamParam, 
    js.Promise[js.UndefOr[org.scalajs.dom.experimental.Response]]
  ]
  
  type CachedResponseWillBeUsedCallback = js.Function1[
    /* param */ typingsSlinky.workboxCore.workboxPluginMod.CachedResponseWillBeUsedCallbackParam, 
    js.Promise[js.UndefOr[org.scalajs.dom.experimental.Response]]
  ]
  
  type FetchDidFailCallback = js.Function1[
    /* param */ typingsSlinky.workboxCore.workboxPluginMod.FetchDidFailCallbackParam, 
    js.Promise[scala.Unit]
  ]
  
  type FetchDidSucceedCallback = js.Function1[
    /* param */ typingsSlinky.workboxCore.workboxPluginMod.FetchDidSucceedCallbackParam, 
    js.Promise[org.scalajs.dom.experimental.Response]
  ]
  
  type RequestWillFetchCallback = js.Function1[
    /* param */ typingsSlinky.workboxCore.workboxPluginMod.RequestWillFetchCallbackParam, 
    js.Promise[js.UndefOr[org.scalajs.dom.experimental.Request]]
  ]
}
