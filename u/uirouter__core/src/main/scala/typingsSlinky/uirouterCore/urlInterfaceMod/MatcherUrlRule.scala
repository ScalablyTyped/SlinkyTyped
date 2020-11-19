package typingsSlinky.uirouterCore.urlInterfaceMod

import typingsSlinky.uirouterCore.uirouterCoreStrings.STATE
import typingsSlinky.uirouterCore.uirouterCoreStrings.URLMATCHER
import typingsSlinky.uirouterCore.urlMatcherMod.UrlMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatcherUrlRule extends UrlRule {
  
  @JSName("type")
  var type_MatcherUrlRule: URLMATCHER | STATE = js.native
  
  var urlMatcher: UrlMatcher = js.native
}
