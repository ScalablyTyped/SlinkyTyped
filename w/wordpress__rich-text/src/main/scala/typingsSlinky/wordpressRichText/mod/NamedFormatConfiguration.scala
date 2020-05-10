package typingsSlinky.wordpressRichText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedFormatConfiguration extends FormatConfiguration {
  var name: String = js.native
}

object NamedFormatConfiguration {
  @scala.inline
  def apply(
    edit: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentType<FormatProps> */ js.Any,
    name: String,
    tagName: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any) with String,
    title: String
  ): NamedFormatConfiguration = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedFormatConfiguration]
  }
  @scala.inline
  implicit class NamedFormatConfigurationOps[Self <: NamedFormatConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

