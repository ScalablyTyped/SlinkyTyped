package typingsSlinky.yogBigpipe.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.yogBigpipe.mod.Pagelet.mode
import typingsSlinky.yogBigpipe.mod.Pagelet.status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yog-bigpipe", "Pagelet")
@js.native
class Pagelet_ protected () extends EventEmitter {
  def this(obj: PageletOption) = this()
  
  def addCss(css: String): Unit = js.native
  def addCss(css: js.Array[String]): Unit = js.native
  
  def addCsses(css: String): Unit = js.native
  def addCsses(css: js.Array[String]): Unit = js.native
  
  def addJs(css: String): Unit = js.native
  def addJs(css: js.Array[String]): Unit = js.native
  
  def addJses(css: String): Unit = js.native
  def addJses(css: js.Array[String]): Unit = js.native
  
  def addScript(css: String): Unit = js.native
  def addScript(css: js.Array[String]): Unit = js.native
  
  def addScripts(css: String): Unit = js.native
  def addScripts(css: js.Array[String]): Unit = js.native
  
  def addStyle(css: String): Unit = js.native
  def addStyle(css: js.Array[String]): Unit = js.native
  
  def addStyles(css: String): Unit = js.native
  def addStyles(css: js.Array[String]): Unit = js.native
  
  var compiled: Boolean = js.native
  
  var container: String = js.native
  
  var css: js.Array[String] = js.native
  
  def destroy(): Unit = js.native
  
  var html: String = js.native
  
  var id: String = js.native
  
  @JSName("js")
  var js_ : js.Array[String] = js.native
  
  var mode: mode = js.native
  
  var reqID: String = js.native
  
  var scripts: js.Array[String] = js.native
  
  var skipAnalysis: Boolean = js.native
  
  def start(provider: js.Promise[_], sync: Boolean): Unit = js.native
  
  var state: status = js.native
  
  var styles: js.Array[String] = js.native
  
  def toJson(): PageletData = js.native
}
