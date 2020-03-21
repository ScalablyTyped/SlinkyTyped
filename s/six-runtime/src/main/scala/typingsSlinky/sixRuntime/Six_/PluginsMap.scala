package typingsSlinky.sixRuntime.Six_

import typingsSlinky.sixRuntime.Six_.plugins.sso.ssoConf
import typingsSlinky.sixRuntime.Six_.plugins.sso.ssoFactory
import typingsSlinky.sixRuntime.Six_.plugins.static.staticConf
import typingsSlinky.sixRuntime.Six_.plugins.static.staticFactory
import typingsSlinky.sixRuntime.Six_.plugins.uac.uacConf
import typingsSlinky.sixRuntime.Six_.plugins.uac.uacFactory
import typingsSlinky.sixRuntime.Six_.plugins.upm.upmConf
import typingsSlinky.sixRuntime.Six_.plugins.upm.upmFactory
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

