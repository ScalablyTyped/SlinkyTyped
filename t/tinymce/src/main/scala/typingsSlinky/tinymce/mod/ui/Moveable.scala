package typingsSlinky.tinymce.mod.ui

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Moveable extends js.Object {
  def moveRel(elm: Node, rel: String): Control
}

object Moveable {
  @scala.inline
  def apply(moveRel: (Node, String) => Control): Moveable = {
    val __obj = js.Dynamic.literal(moveRel = js.Any.fromFunction2(moveRel))
  
    __obj.asInstanceOf[Moveable]
  }
}

