package typingsSlinky.webgme.v1Mod

import typingsSlinky.webgme.GmeCommon.RelId
import typingsSlinky.webgme.anon.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonObj extends js.Object {
   // guid tree of hashes
  var bases: js.Any = js.native
  var containment: JsonContainment = js.native
  var metaSheets: js.Any = js.native
   //
  var nodes: js.Any = js.native
  var relids: js.Array[RelId] = js.native
  var root: Guid = js.native
}

object JsonObj {
  @scala.inline
  def apply(
    bases: js.Any,
    containment: JsonContainment,
    metaSheets: js.Any,
    nodes: js.Any,
    relids: js.Array[RelId],
    root: Guid
  ): JsonObj = {
    val __obj = js.Dynamic.literal(bases = bases.asInstanceOf[js.Any], containment = containment.asInstanceOf[js.Any], metaSheets = metaSheets.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], relids = relids.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonObj]
  }
  @scala.inline
  implicit class JsonObjOps[Self <: JsonObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBases(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainment(value: JsonContainment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetaSheets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaSheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelids(value: js.Array[RelId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: Guid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

