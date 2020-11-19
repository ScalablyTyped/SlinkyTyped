package typingsSlinky.wordpressRichText.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedFormatConfiguration extends FormatConfiguration {
  
  var name: String = js.native
}
object NamedFormatConfiguration {
  
  @scala.inline
  def apply(
    edit: ReactComponentClass[FormatProps],
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
