package typingsSlinky.sixDashRuntime.Six

import typingsSlinky.sixDashRuntime.Six.plugins.sso.ssoConf
import typingsSlinky.sixDashRuntime.Six.plugins.sso.ssoFactory
import typingsSlinky.sixDashRuntime.Six.plugins.static.staticConf
import typingsSlinky.sixDashRuntime.Six.plugins.static.staticFactory
import typingsSlinky.sixDashRuntime.Six.plugins.uac.uacConf
import typingsSlinky.sixDashRuntime.Six.plugins.uac.uacFactory
import typingsSlinky.sixDashRuntime.Six.plugins.upm.upmConf
import typingsSlinky.sixDashRuntime.Six.plugins.upm.upmFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginsMap extends js.Object {
  @JSName("sso")
  var sso_Original: ssoFactory = js.native
  @JSName("static")
  var static_Original: staticFactory = js.native
  @JSName("uac")
  var uac_Original: uacFactory = js.native
  @JSName("upm")
  var upm_Original: upmFactory = js.native
  def sso(conf: ssoConf): js.Any = js.native
  def static(conf: staticConf): middleware = js.native
  def uac(conf: uacConf): js.Any = js.native
  def upm(conf: upmConf): js.Any = js.native
}

