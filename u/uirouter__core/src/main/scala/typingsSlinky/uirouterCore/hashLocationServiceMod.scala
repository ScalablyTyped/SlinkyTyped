package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.baseLocationServiceMod.BaseLocationServices
import typingsSlinky.uirouterCore.routerMod.UIRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core/lib/vanilla/hashLocationService", JSImport.Namespace)
@js.native
object hashLocationServiceMod extends js.Object {
  
  @js.native
  class HashLocationService protected () extends BaseLocationServices {
    def this(router: UIRouter) = this()
  }
}
