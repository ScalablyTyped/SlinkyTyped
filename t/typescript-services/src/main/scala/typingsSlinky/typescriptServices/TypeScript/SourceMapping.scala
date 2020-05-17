package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMapping extends js.Object {
  var childMappings: js.Array[SourceMapping] = js.native
  var end: SourceMapPosition = js.native
  var nameIndex: Double = js.native
  var start: SourceMapPosition = js.native
}

object SourceMapping {
  @scala.inline
  def apply(
    childMappings: js.Array[SourceMapping],
    end: SourceMapPosition,
    nameIndex: Double,
    start: SourceMapPosition
  ): SourceMapping = {
    val __obj = js.Dynamic.literal(childMappings = childMappings.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], nameIndex = nameIndex.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapping]
  }
  @scala.inline
  implicit class SourceMappingOps[Self <: SourceMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildMappings(value: js.Array[SourceMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: SourceMapPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: SourceMapPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

