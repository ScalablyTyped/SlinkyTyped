package typingsSlinky.xmppXml.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@xmpp/xml", "Parser")
@js.native
class Parser () extends EventEmitter {
  
  val XMLError: Instantiable0[typingsSlinky.xmppXml.mod.XMLError] = js.native
  
  var cursor: Element | Null = js.native
  
  def end(data: Buffer): Unit = js.native
  
  def onEndElement(name: String): Unit = js.native
  
  def onStartElement(name: String): Unit = js.native
  def onStartElement(name: String, attrs: String): Unit = js.native
  def onStartElement(name: String, attrs: StringDictionary[js.Any]): Unit = js.native
  
  def onText(str: String): Unit = js.native
  
  val parser: typingsSlinky.ltx.mod.Parser = js.native
  
  var root: Element | Null = js.native
  
  def write(data: Buffer): Unit = js.native
}
