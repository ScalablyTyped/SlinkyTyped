package typingsSlinky.workboxDashSw.workboxDashSwMod._Global_.workbox

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("workbox.expiration")
@js.native
object expiration extends js.Object {
  @js.native
  class CacheExpiration protected ()
    extends typingsSlinky.workboxDashExpiration.workboxDashExpirationMod.CacheExpiration {
    def this(cacheName: String) = this()
  }
  
  @js.native
  class Plugin ()
    extends typingsSlinky.workboxDashExpiration.workboxDashExpirationMod.Plugin
  
  var CacheExpiration: Instantiable1[
    /* cacheName */ String, 
    typingsSlinky.workboxDashExpiration.workboxDashExpirationMod.CacheExpiration
  ] = js.native
  var Plugin: Instantiable0[typingsSlinky.workboxDashExpiration.workboxDashExpirationMod.Plugin] = js.native
}

