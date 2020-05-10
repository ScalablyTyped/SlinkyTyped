package typingsSlinky.switchery.mod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Node
import typingsSlinky.switchery.mod.Switchery.Options
import typingsSlinky.switchery.mod.Switchery.SwitcheryStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("switchery", JSImport.Default)
@js.native
class default protected () extends Switchery {
  def this(node: Node) = this()
  def this(node: Node, options: Options) = this()
}

@JSImport("switchery", JSImport.Default)
@js.native
object default extends TopLevel[SwitcheryStatic]

