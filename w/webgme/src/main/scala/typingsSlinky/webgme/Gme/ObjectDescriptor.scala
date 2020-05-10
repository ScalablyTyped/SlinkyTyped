package typingsSlinky.webgme.Gme

import typingsSlinky.webgme.GmeCommon.Dictionary
import typingsSlinky.webgme.GmeCommon.Pointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectDescriptor extends js.Object {
  var childrenIds: js.Array[String] = js.native
  var childrenNum: Double = js.native
  var control: js.UndefOr[VisualizerControl] = js.native
  var dstObjId: String = js.native
  var dstPos: Pos2D = js.native
  var dstSubCompId: js.UndefOr[String] = js.native
  var editable: js.UndefOr[Boolean] = js.native
  var id: String = js.native
  var isConnection: Boolean = js.native
  var metaInfo: js.UndefOr[Dictionary[String]] = js.native
  var name: String = js.native
  var parentId: String = js.native
  var pointers: Dictionary[Pointer] = js.native
  var position: Double = js.native
  var preferencesHelper: js.UndefOr[PreferenceHelper] = js.native
  var reconnectable: js.UndefOr[Boolean] = js.native
  var source: String = js.native
  var srcObjId: String = js.native
  var srcPos: Pos2D = js.native
  var srcSubCompId: js.UndefOr[String] = js.native
  var target: String = js.native
}

object ObjectDescriptor {
  @scala.inline
  def apply(
    childrenIds: js.Array[String],
    childrenNum: Double,
    dstObjId: String,
    dstPos: Pos2D,
    id: String,
    isConnection: Boolean,
    name: String,
    parentId: String,
    pointers: Dictionary[Pointer],
    position: Double,
    source: String,
    srcObjId: String,
    srcPos: Pos2D,
    target: String
  ): ObjectDescriptor = {
    val __obj = js.Dynamic.literal(childrenIds = childrenIds.asInstanceOf[js.Any], childrenNum = childrenNum.asInstanceOf[js.Any], dstObjId = dstObjId.asInstanceOf[js.Any], dstPos = dstPos.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isConnection = isConnection.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], srcObjId = srcObjId.asInstanceOf[js.Any], srcPos = srcPos.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectDescriptor]
  }
  @scala.inline
  implicit class ObjectDescriptorOps[Self <: ObjectDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDstObjId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstObjId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDstPos(value: Pos2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsConnection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointers(value: Dictionary[Pointer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcObjId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcObjId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcPos(value: Pos2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControl(value: VisualizerControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(js.undefined)
        ret
    }
    @scala.inline
    def withDstSubCompId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstSubCompId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDstSubCompId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstSubCompId")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaInfo(value: Dictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferencesHelper(value: PreferenceHelper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferencesHelper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferencesHelper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferencesHelper")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectable")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcSubCompId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcSubCompId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcSubCompId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcSubCompId")(js.undefined)
        ret
    }
  }
  
}

