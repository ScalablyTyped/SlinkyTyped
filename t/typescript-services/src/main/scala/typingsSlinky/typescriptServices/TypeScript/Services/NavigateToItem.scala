package typingsSlinky.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigateToItem extends js.Object {
  var additionalSpans: js.Array[SpanInfo] = js.native
  var containerKind: String = js.native
  var containerName: String = js.native
  var fileName: String = js.native
  var kind: String = js.native
  var kindModifiers: String = js.native
  var limChar: Double = js.native
  var matchKind: String = js.native
  var minChar: Double = js.native
  var name: String = js.native
}

object NavigateToItem {
  @scala.inline
  def apply(
    additionalSpans: js.Array[SpanInfo],
    containerKind: String,
    containerName: String,
    fileName: String,
    kind: String,
    kindModifiers: String,
    limChar: Double,
    matchKind: String,
    minChar: Double,
    name: String
  ): NavigateToItem = {
    val __obj = js.Dynamic.literal(additionalSpans = additionalSpans.asInstanceOf[js.Any], containerKind = containerKind.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], limChar = limChar.asInstanceOf[js.Any], matchKind = matchKind.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToItem]
  }
  @scala.inline
  implicit class NavigateToItemOps[Self <: NavigateToItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalSpans(value: js.Array[SpanInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalSpans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKindModifiers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kindModifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimChar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinChar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

