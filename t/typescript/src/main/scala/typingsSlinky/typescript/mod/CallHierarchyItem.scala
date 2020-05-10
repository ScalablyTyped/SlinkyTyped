package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallHierarchyItem extends js.Object {
  var file: java.lang.String = js.native
  var kind: ScriptElementKind = js.native
  var name: java.lang.String = js.native
  var selectionSpan: TextSpan = js.native
  var span: TextSpan = js.native
}

object CallHierarchyItem {
  @scala.inline
  def apply(
    file: java.lang.String,
    kind: ScriptElementKind,
    name: java.lang.String,
    selectionSpan: TextSpan,
    span: TextSpan
  ): CallHierarchyItem = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSpan = selectionSpan.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyItem]
  }
  @scala.inline
  implicit class CallHierarchyItemOps[Self <: CallHierarchyItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: ScriptElementKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionSpan(value: TextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpan(value: TextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

