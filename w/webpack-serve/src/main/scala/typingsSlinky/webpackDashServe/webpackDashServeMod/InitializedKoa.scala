package typingsSlinky.webpackDashServe.webpackDashServeMod

import typingsSlinky.koa.koaMod.DefaultContext
import typingsSlinky.koa.koaMod.DefaultState
import typingsSlinky.node.netMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitializedKoa
  extends typingsSlinky.koa.koaMod.^[DefaultState, DefaultContext] {
  var server: Server = js.native
  def stop(): Unit = js.native
}

