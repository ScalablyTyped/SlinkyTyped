package typingsSlinky.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeAPI extends js.Object {
  
  def close(id: String): Unit = js.native
  def close(id: Double): Unit = js.native
  
  def closeAll(): Unit = js.native
  
  def getOpenItems(): js.Array[_] = js.native
  
  def getState(): js.Any = js.native
  
  def isBranchOpen(id: String): Boolean = js.native
  def isBranchOpen(id: Double): Boolean = js.native
  
  def open(id: String): Unit = js.native
  def open(id: String, show: Boolean): Unit = js.native
  def open(id: Double): Unit = js.native
  def open(id: Double, show: Boolean): Unit = js.native
  
  def openAll(): Unit = js.native
  
  def setState(state: js.Any): Unit = js.native
}
@JSImport("webix", "TreeAPI")
@js.native
object TreeAPI extends TopLevel[TreeAPI]
