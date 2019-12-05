package typingsSlinky.atSentryWebpackDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atSentryWebpackDashPluginMod {
  import typingsSlinky.webpack.webpackMod.Plugin

  type EntriesFunction = js.Function1[/* key */ String, Boolean]
  type ErrorHandlerFunction = js.Function2[/* err */ js.Error, /* invokeErr */ js.Function0[Unit], Unit]
  type SentryPlugin = Plugin
}
