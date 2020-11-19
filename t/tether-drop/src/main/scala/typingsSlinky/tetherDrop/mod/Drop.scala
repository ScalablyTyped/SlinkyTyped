package typingsSlinky.tetherDrop.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// global Drop constructor
@js.native
trait Drop extends js.Object {
  
  def close(): Unit = js.native
  
  var content: HTMLElement = js.native
  
  def destroy(): Unit = js.native
  
  def isOpened(): Boolean = js.native
  
  def off(event: String): Unit = js.native
  def off(event: String, handler: js.Function): Unit = js.native
  
  /*
    * Drop instances fire "open" and "close" events.
    */
  def on(event: String, handler: js.Function): Unit = js.native
  def on(event: String, handler: js.Function, context: js.Any): Unit = js.native
  
  def once(event: String, handler: js.Function): Unit = js.native
  def once(event: String, handler: js.Function, context: js.Any): Unit = js.native
  
  def open(): Unit = js.native
  
  def position(): Unit = js.native
  
  def remove(): Unit = js.native
  
  var tether: typingsSlinky.tether.mod.^ = js.native
  
  def toggle(): Unit = js.native
}
