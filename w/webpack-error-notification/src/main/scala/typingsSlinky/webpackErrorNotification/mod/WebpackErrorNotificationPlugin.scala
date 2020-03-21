package typingsSlinky.webpackErrorNotification.mod

import typingsSlinky.webpack.mod.Plugin
import typingsSlinky.webpack.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpackErrorNotificationPlugin extends Plugin {
  def compilationDone(stats: Stats): Unit = js.native
  def compileMessage(stats: Stats): String = js.native
}

