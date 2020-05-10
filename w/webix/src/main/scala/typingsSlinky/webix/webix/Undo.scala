package typingsSlinky.webix.webix

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Undo extends js.Object {
  def ignoreUndo(functor: WebixCallback): Unit = js.native
  def removeUndo(id: String): Unit = js.native
  def undo(id: String): Unit = js.native
}

@JSGlobal("webix.Undo")
@js.native
object Undo extends TopLevel[Undo]

