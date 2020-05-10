package typingsSlinky.webgme.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonNode extends js.Object {
  var attributes: js.Any = js.native
  var base: String = js.native
  var constratints: js.Any = js.native
  var meta: js.Any = js.native
  var parent: String = js.native
  var pointers: js.Any = js.native
  var registry: js.Any = js.native
  var sets: js.Any = js.native
}

object JsonNode {
  @scala.inline
  def apply(
    attributes: js.Any,
    base: String,
    constratints: js.Any,
    meta: js.Any,
    parent: String,
    pointers: js.Any,
    registry: js.Any,
    sets: js.Any
  ): JsonNode = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], constratints = constratints.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], sets = sets.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonNode]
  }
  @scala.inline
  implicit class JsonNodeOps[Self <: JsonNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstratints(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constratints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistry(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

