package typingsSlinky.watchify.mod

import typingsSlinky.browserify.mod.BrowserifyObject
import typingsSlinky.watchify.anon.Cache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Watch mode for browserify builds.
  * Update any source file and your browserify bundle will be recompiled on the spot
  */
@js.native
trait Constructor extends js.Object {
  
  def apply(b: BrowserifyObject): BrowserifyObject = js.native
  def apply(b: BrowserifyObject, opts: Options): BrowserifyObject = js.native
  def apply[T /* <: BrowserifyObject */](b: T): T = js.native
  def apply[T /* <: BrowserifyObject */](b: T, opts: Options): T = js.native
  
  var args: Cache = js.native
  
  /** Close all the open watch handles. */
  def close(): Unit = js.native
}
