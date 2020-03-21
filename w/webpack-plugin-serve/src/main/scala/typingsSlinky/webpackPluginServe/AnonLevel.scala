package typingsSlinky.webpackPluginServe

import typingsSlinky.webpackPluginServe.webpackPluginServeStrings.debug
import typingsSlinky.webpackPluginServe.webpackPluginServeStrings.error
import typingsSlinky.webpackPluginServe.webpackPluginServeStrings.info
import typingsSlinky.webpackPluginServe.webpackPluginServeStrings.trace
import typingsSlinky.webpackPluginServe.webpackPluginServeStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  var level: trace | debug | info | warn | error
  var timestamp: js.UndefOr[Boolean] = js.undefined
}

object AnonLevel {
  @scala.inline
  def apply(level: trace | debug | info | warn | error, timestamp: js.UndefOr[Boolean] = js.undefined): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLevel]
  }
}

