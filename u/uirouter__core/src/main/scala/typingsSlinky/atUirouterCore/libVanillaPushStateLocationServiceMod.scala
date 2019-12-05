package typingsSlinky.atUirouterCore

import typingsSlinky.atUirouterCore.libCommonCoreservicesMod.LocationConfig
import typingsSlinky.atUirouterCore.libRouterMod.UIRouter
import typingsSlinky.atUirouterCore.libVanillaBaseLocationServiceMod.BaseLocationServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/pushStateLocationService", JSImport.Namespace)
@js.native
object libVanillaPushStateLocationServiceMod extends js.Object {
  @js.native
  class PushStateLocationService protected () extends BaseLocationServices {
    def this(router: UIRouter) = this()
    var _config: LocationConfig = js.native
    /**
      * Gets the base prefix without:
      * - trailing slash
      * - trailing filename
      * - protocol and hostname
      *
      * If <base href='/base/'>, this returns '/base'.
      * If <base href='/foo/base/'>, this returns '/foo/base'.
      * If <base href='/base/index.html'>, this returns '/base'.
      * If <base href='http://localhost:8080/base/index.html'>, this returns '/base'.
      * If <base href='/base'>, this returns ''.
      * If <base href='http://localhost:8080'>, this returns ''.
      * If <base href='http://localhost:8080/'>, this returns ''.
      *
      * See: https://html.spec.whatwg.org/dev/semantics.html#the-base-element
      */
    var _getBasePrefix: js.Any = js.native
  }
  
}

