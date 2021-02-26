package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.baseLocationServiceMod.BaseLocationServices
import typingsSlinky.uirouterCore.routerMod.UIRouter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryLocationServiceMod {
  
  @JSImport("@uirouter/core/lib/vanilla/memoryLocationService", "MemoryLocationService")
  @js.native
  class MemoryLocationService protected () extends BaseLocationServices {
    def this(router: UIRouter) = this()
    
    var _url: String = js.native
  }
}
