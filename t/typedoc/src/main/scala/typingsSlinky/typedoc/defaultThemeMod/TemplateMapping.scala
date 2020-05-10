package typingsSlinky.typedoc.defaultThemeMod

import typingsSlinky.typedoc.abstractMod.ReflectionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateMapping extends js.Object {
  var directory: String = js.native
  var isLeaf: Boolean = js.native
  var kind: js.Array[ReflectionKind] = js.native
  var template: String = js.native
}

object TemplateMapping {
  @scala.inline
  def apply(directory: String, isLeaf: Boolean, kind: js.Array[ReflectionKind], template: String): TemplateMapping = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateMapping]
  }
  @scala.inline
  implicit class TemplateMappingOps[Self <: TemplateMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLeaf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLeaf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: js.Array[ReflectionKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

