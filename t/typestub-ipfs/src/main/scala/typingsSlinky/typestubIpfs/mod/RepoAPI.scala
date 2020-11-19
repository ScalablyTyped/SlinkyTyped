package typingsSlinky.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepoAPI extends js.Object {
  
  def gc(): Unit = js.native
  
  def init(bits: Double, empty: Boolean, callback: Callback[_]): Unit = js.native
  
  def path(): String = js.native
  
  def version(callback: Callback[_]): Unit = js.native
  def version(options: js.Any, callback: Callback[_]): Unit = js.native
}
