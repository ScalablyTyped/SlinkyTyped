package typingsSlinky.typescript.mod

import typingsSlinky.typescript.typescriptStrings.camelCase
import typingsSlinky.typescript.typescriptStrings.exact
import typingsSlinky.typescript.typescriptStrings.prefix
import typingsSlinky.typescript.typescriptStrings.substring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigateToItem extends js.Object {
  var containerKind: ScriptElementKind = js.native
  var containerName: java.lang.String = js.native
  var fileName: java.lang.String = js.native
  var isCaseSensitive: Boolean = js.native
  var kind: ScriptElementKind = js.native
  var kindModifiers: java.lang.String = js.native
  var matchKind: exact | prefix | substring | camelCase = js.native
  var name: java.lang.String = js.native
  var textSpan: TextSpan = js.native
}

object NavigateToItem {
  @scala.inline
  def apply(
    containerKind: ScriptElementKind,
    containerName: java.lang.String,
    fileName: java.lang.String,
    isCaseSensitive: Boolean,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    matchKind: exact | prefix | substring | camelCase,
    name: java.lang.String,
    textSpan: TextSpan
  ): NavigateToItem = {
    val __obj = js.Dynamic.literal(containerKind = containerKind.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], isCaseSensitive = isCaseSensitive.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], matchKind = matchKind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToItem]
  }
  @scala.inline
  implicit class NavigateToItemOps[Self <: NavigateToItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerKind(value: ScriptElementKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCaseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: ScriptElementKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKindModifiers(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kindModifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchKind(value: exact | prefix | substring | camelCase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextSpan(value: TextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSpan")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

