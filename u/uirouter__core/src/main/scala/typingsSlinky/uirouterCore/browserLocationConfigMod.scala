package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.coreservicesMod.LocationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserLocationConfigMod {
  
  @JSImport("@uirouter/core/lib/vanilla/browserLocationConfig", "BrowserLocationConfig")
  @js.native
  class BrowserLocationConfig () extends LocationConfig {
    def this(router: js.Any) = this()
    def this(router: js.UndefOr[scala.Nothing], _isHtml5: Boolean) = this()
    def this(router: js.Any, _isHtml5: Boolean) = this()
    
    var _baseHref: js.Any = js.native
    
    var _hashPrefix: js.Any = js.native
    
    var _isHtml5: js.Any = js.native
    
    def baseHref(href: String): String = js.native
    
    var getBaseHref: js.Any = js.native
  }
}
