package typingsSlinky.sweetalert

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sweetalert/typings/modules/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def getNode(className: String): HTMLElement = js.native
  
  def insertAfter(newNode: Node, referenceNode: Node): Unit = js.native
  
  def isPlainObject(value: js.Any): Boolean = js.native
  
  def ordinalSuffixOf(num: Double): String = js.native
  
  def removeNode(node: Node): Unit = js.native
  
  def stringToNode(html: String): HTMLElement = js.native
  
  def throwErr(message: String): scala.Nothing = js.native
}
