package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.coreservicesMod.LocationServices
import typingsSlinky.uirouterCore.routerMod.UIRouter
import typingsSlinky.uirouterCore.urlConfigMod.UrlConfig
import typingsSlinky.uirouterCore.urlInterfaceMod.MatchResult
import typingsSlinky.uirouterCore.urlInterfaceMod.UrlParts
import typingsSlinky.uirouterCore.urlInterfaceMod.UrlSyncApi
import typingsSlinky.uirouterCore.urlRulesMod.UrlRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlServiceMod {
  
  @JSImport("@uirouter/core/lib/url/urlService", "UrlService")
  @js.native
  class UrlService protected ()
    extends LocationServices
       with UrlSyncApi {
    /** @internal */
    def this(/** @internal */ router: UIRouter) = this()
    
    /** @internal */ var _stopListeningFn: js.Any = js.native
    
    /**
      * The nested [[UrlConfig]] API to configure the URL and retrieve URL information
      *
      * See: [[UrlConfig]] for details
      */
    var config: UrlConfig = js.native
    
    /** @internal */ var interceptDeferred: Boolean = js.native
    
    /**
      * Matches a URL
      *
      * Given a URL (as a [[UrlParts]] object), check all rules and determine the best matching rule.
      * Return the result as a [[MatchResult]].
      */
    def `match`(url: UrlParts): MatchResult = js.native
    
    /**
      * Gets the current URL parts
      *
      * This method returns the different parts of the current URL (the [[path]], [[search]], and [[hash]]) as a [[UrlParts]] object.
      */
    def parts(): UrlParts = js.native
    
    var router: js.Any = js.native
    
    /**
      * The nested [[UrlRules]] API for managing URL rules and rewrites
      *
      * See: [[UrlRules]] for details
      */
    var rules: UrlRules = js.native
  }
}
