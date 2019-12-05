package typingsSlinky.atUirouterCore

import typingsSlinky.atUirouterCore.libRouterMod.UIRouter
import typingsSlinky.atUirouterCore.libVanillaBaseLocationServiceMod.BaseLocationServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/hashLocationService", JSImport.Namespace)
@js.native
object libVanillaHashLocationServiceMod extends js.Object {
  @js.native
  class HashLocationService protected () extends BaseLocationServices {
    def this(router: UIRouter) = this()
  }
  
}

