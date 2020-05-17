package typingsSlinky.synaptic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connections extends js.Object {
  var connections: Double = js.native
  var neurons: Double = js.native
}

object Connections {
  @scala.inline
  def apply(connections: Double, neurons: Double): Connections = {
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any], neurons = neurons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connections]
  }
  @scala.inline
  implicit class ConnectionsOps[Self <: Connections] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeurons(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neurons")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

