package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractRange extends js.Object {
  /**
    * Returns true if range is collapsed, and false otherwise.
    */
  val collapsed: scala.Boolean = js.native
  /**
    * Returns range's end node.
    */
  val endContainer: org.scalajs.dom.raw.Node = js.native
  /**
    * Returns range's end offset.
    */
  val endOffset: Double = js.native
  /**
    * Returns range's start node.
    */
  val startContainer: org.scalajs.dom.raw.Node = js.native
  /**
    * Returns range's start offset.
    */
  val startOffset: Double = js.native
}

@JSGlobal("AbstractRange")
@js.native
object AbstractRange extends Instantiable0[AbstractRange]

