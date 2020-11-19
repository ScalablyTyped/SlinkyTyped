package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.coreservicesMod.LocationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core/lib/vanilla/browserLocationConfig", JSImport.Namespace)
@js.native
object browserLocationConfigMod extends js.Object {
  
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
