package typingsSlinky.vfileMessage.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.unist.mod.Node
import typingsSlinky.unist.mod.Point
import typingsSlinky.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vfile-message", JSImport.Namespace)
@js.native
class ^ protected () extends VFileMessage {
  /**
    * Constructor of a message for `reason` at `position` from `origin`.
    * When an error is passed in as `reason`, copies the `stack`.
    *
    * @param reason Reason for message (`string` or `Error`). Uses the stack and message of the error if given.
    * @param position Place at which the message occurred in a file (`Node`, `Position`, or `Point`, optional).
    * @param origin Place in code the message originates from (`string`, optional).
    */
  def this(reason: String) = this()
  def this(reason: js.Error) = this()
  def this(reason: String, position: Node) = this()
  def this(reason: String, position: Point) = this()
  def this(reason: String, position: Position) = this()
  def this(reason: js.Error, position: Node) = this()
  def this(reason: js.Error, position: Point) = this()
  def this(reason: js.Error, position: Position) = this()
  def this(reason: String, position: js.UndefOr[scala.Nothing], origin: String) = this()
  def this(reason: String, position: Node, origin: String) = this()
  def this(reason: String, position: Point, origin: String) = this()
  def this(reason: String, position: Position, origin: String) = this()
  def this(reason: js.Error, position: js.UndefOr[scala.Nothing], origin: String) = this()
  def this(reason: js.Error, position: Node, origin: String) = this()
  def this(reason: js.Error, position: Point, origin: String) = this()
  def this(reason: js.Error, position: Position, origin: String) = this()
}
@JSImport("vfile-message", JSImport.Namespace)
@js.native
object ^ extends TopLevel[VFileMessage]
