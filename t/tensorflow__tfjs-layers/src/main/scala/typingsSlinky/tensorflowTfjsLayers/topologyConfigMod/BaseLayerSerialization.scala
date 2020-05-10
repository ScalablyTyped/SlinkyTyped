package typingsSlinky.tensorflowTfjsLayers.topologyConfigMod

import typingsSlinky.tensorflowTfjsLayers.nodeConfigMod.NodeConfig
import typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseLayerSerialization[N /* <: String */, C /* <: LayerConfig */] extends BaseSerialization[N, JsonLayer[C]] {
  var inbound_nodes: js.UndefOr[js.Array[NodeConfig]] = js.native
  var name: String = js.native
}

object BaseLayerSerialization {
  @scala.inline
  def apply[N, C](class_name: N, config: JsonLayer[C], name: String): BaseLayerSerialization[N, C] = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLayerSerialization[N, C]]
  }
  @scala.inline
  implicit class BaseLayerSerializationOps[Self[n, c] <: BaseLayerSerialization[n, c], N, C] (val x: Self[N, C]) extends AnyVal {
    @scala.inline
    def duplicate: Self[N, C] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[N, C]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[N, C]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[N, C]) with Other]
    @scala.inline
    def withName(value: String): Self[N, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInbound_nodes(value: js.Array[NodeConfig]): Self[N, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inbound_nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInbound_nodes: Self[N, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inbound_nodes")(js.undefined)
        ret
    }
  }
  
}

