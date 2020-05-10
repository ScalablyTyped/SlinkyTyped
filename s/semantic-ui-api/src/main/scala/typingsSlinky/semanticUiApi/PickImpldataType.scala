package typingsSlinky.semanticUiApi

import typingsSlinky.semanticUiApi.semanticUiApiStrings.html
import typingsSlinky.semanticUiApi.semanticUiApiStrings.json
import typingsSlinky.semanticUiApi.semanticUiApiStrings.jsonp
import typingsSlinky.semanticUiApi.semanticUiApiStrings.script
import typingsSlinky.semanticUiApi.semanticUiApiStrings.text
import typingsSlinky.semanticUiApi.semanticUiApiStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'dataType'> */
@js.native
trait PickImpldataType extends js.Object {
  var dataType: xml | json | jsonp | script | html | text = js.native
}

object PickImpldataType {
  @scala.inline
  def apply(dataType: xml | json | jsonp | script | html | text): PickImpldataType = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldataType]
  }
  @scala.inline
  implicit class PickImpldataTypeOps[Self <: PickImpldataType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataType(value: xml | json | jsonp | script | html | text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

