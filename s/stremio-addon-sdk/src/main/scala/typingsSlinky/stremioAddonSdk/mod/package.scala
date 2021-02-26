package typingsSlinky.stremioAddonSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def getRouter(addonInterface: typingsSlinky.stremioAddonSdk.mod.AddonInterface): js.Any = typingsSlinky.stremioAddonSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getRouter")(addonInterface.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def publishToCentral(url: java.lang.String): scala.Unit = typingsSlinky.stremioAddonSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("publishToCentral")(url.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def serveHTTP(
    addonInterface: typingsSlinky.stremioAddonSdk.mod.AddonInterface,
    options: typingsSlinky.stremioAddonSdk.anon.CacheMaxAge
  ): scala.Unit = (typingsSlinky.stremioAddonSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("serveHTTP")(addonInterface.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
