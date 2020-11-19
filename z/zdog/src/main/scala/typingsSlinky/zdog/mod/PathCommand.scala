package typingsSlinky.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.zdog.mod.VectorOptions
  - typingsSlinky.zdog.mod.PathLineCommand
  - typingsSlinky.zdog.mod.PathMoveCommand
  - typingsSlinky.zdog.mod.PathArcCommand
  - typingsSlinky.zdog.mod.PathBezierCommand
*/
trait PathCommand extends js.Object
object PathCommand {
  
  @scala.inline
  def PathLineCommand(line: VectorOptions): PathCommand = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommand]
  }
  
  @scala.inline
  def PathBezierCommand(bezier: js.Tuple3[VectorOptions, VectorOptions, VectorOptions]): PathCommand = {
    val __obj = js.Dynamic.literal(bezier = bezier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommand]
  }
  
  @scala.inline
  def PathArcCommand(arc: js.Tuple2[VectorOptions, VectorOptions]): PathCommand = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommand]
  }
  
  @scala.inline
  def VectorOptions(): PathCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathCommand]
  }
  
  @scala.inline
  def PathMoveCommand(move: VectorOptions): PathCommand = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommand]
  }
}
