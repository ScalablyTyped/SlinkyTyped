package typingsSlinky.uirouterCore.mod

import typingsSlinky.uirouterCore.urlInterfaceMod.UrlRuleHandlerFn
import typingsSlinky.uirouterCore.urlInterfaceMod.UrlRuleMatchFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "BaseUrlRule")
@js.native
class BaseUrlRule protected ()
  extends typingsSlinky.uirouterCore.libUrlMod.BaseUrlRule {
  def this(`match`: UrlRuleMatchFn) = this()
  def this(`match`: UrlRuleMatchFn, handler: UrlRuleHandlerFn) = this()
}

