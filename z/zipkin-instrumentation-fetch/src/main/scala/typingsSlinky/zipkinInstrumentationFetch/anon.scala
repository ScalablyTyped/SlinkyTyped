package typingsSlinky.zipkinInstrumentationFetch

import typingsSlinky.nodeFetch.mod.RequestInfo
import typingsSlinky.nodeFetch.mod.RequestInit
import typingsSlinky.nodeFetch.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Typeoffetch extends StObject {
    
    def apply(url: RequestInfo): js.Promise[Response] = js.native
    def apply(url: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    
    def isRedirect(code: Double): Boolean = js.native
  }
}
