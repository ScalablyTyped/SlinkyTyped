package typingsSlinky.atUirouterCore

import typingsSlinky.atUirouterCore.libCommonCoreservicesMod.LocationServices
import typingsSlinky.atUirouterCore.libRouterMod.UIRouter
import typingsSlinky.atUirouterCore.libUrlInterfaceMod.MatchResult
import typingsSlinky.atUirouterCore.libUrlInterfaceMod.UrlParts
import typingsSlinky.atUirouterCore.libUrlInterfaceMod.UrlSyncApi
import typingsSlinky.atUirouterCore.libUrlUrlConfigMod.UrlConfig
import typingsSlinky.atUirouterCore.libUrlUrlRulesMod.UrlRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/url/urlService", JSImport.Namespace)
@js.native
object libUrlUrlServiceMod extends js.Object {
  @js.native
  class UrlService protected ()
    extends LocationServices
       with UrlSyncApi {
    /** @hidden */
    def this(/** @hidden */ router: UIRouter) = this()
    /** @hidden */ var _stopListeningFn: js.Any = js.native
    /**
      * The nested [[UrlConfig]] API to configure the URL and retrieve URL information
      *
      * See: [[UrlConfig]] for details
      */
    var config: UrlConfig = js.native
    /** @hidden */ var interceptDeferred: Boolean = js.native
    var router: js.Any = js.native
    /**
      * The nested [[UrlRules]] API for managing URL rules and rewrites
      *
      * See: [[UrlRules]] for details
      */
    var rules: UrlRules = js.native
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
  }
  
}

