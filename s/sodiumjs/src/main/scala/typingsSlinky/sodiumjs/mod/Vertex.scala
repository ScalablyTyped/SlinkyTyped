package typingsSlinky.sodiumjs.mod

import typingsSlinky.sodiumjs.vertexMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs", "Vertex")
@js.native
class Vertex protected ()
  extends typingsSlinky.sodiumjs.vertexMod.Vertex {
  def this(name: String, rank: Double, sources: js.Array[Source]) = this()
}
/* static members */
@JSImport("sodiumjs", "Vertex")
@js.native
object Vertex extends js.Object {
  
  var NULL: typingsSlinky.sodiumjs.vertexMod.Vertex = js.native
  
  def collectCycles(): scala.Unit = js.native
  
  def collectRoots(): scala.Unit = js.native
  
  var collectingCycles: Boolean = js.native
  
  def markRoots(): scala.Unit = js.native
  
  def scanRoots(): scala.Unit = js.native
  
  var toBeFreedList: js.Array[typingsSlinky.sodiumjs.vertexMod.Vertex] = js.native
}
