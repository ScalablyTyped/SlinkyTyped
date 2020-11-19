package typingsSlinky.webpackServe.mod

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.node.netMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitializedKoa
  extends typingsSlinky.koa.mod.^[DefaultState, DefaultContext] {
  
  var server: Server = js.native
  
  def stop(): Unit = js.native
}
