package typingsSlinky.tensorflowTfjsCore.engineMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeState extends js.Object {
  var id: Double
  var name: String
  var track: js.Array[Tensor[Rank]]
}

object ScopeState {
  @scala.inline
  def apply(id: Double, name: String, track: js.Array[Tensor[Rank]]): ScopeState = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScopeState]
  }
}

