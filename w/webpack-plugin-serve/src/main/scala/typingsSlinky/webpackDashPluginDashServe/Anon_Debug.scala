package typingsSlinky.webpackDashPluginDashServe

import typingsSlinky.webpackDashPluginDashServe.webpackDashPluginDashServeStrings.debug
import typingsSlinky.webpackDashPluginDashServe.webpackDashPluginDashServeStrings.error
import typingsSlinky.webpackDashPluginDashServe.webpackDashPluginDashServeStrings.info
import typingsSlinky.webpackDashPluginDashServe.webpackDashPluginDashServeStrings.trace
import typingsSlinky.webpackDashPluginDashServe.webpackDashPluginDashServeStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var level: trace | debug | info | warn | error
  var timestamp: js.UndefOr[Boolean] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(level: trace | debug | info | warn | error, timestamp: js.UndefOr[Boolean] = js.undefined): Anon_Debug = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Debug]
  }
}

