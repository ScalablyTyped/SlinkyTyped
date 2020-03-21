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
trait PickImpldataType extends js.Object {
  var dataType: xml | json | jsonp | script | html | text
}

object PickImpldataType {
  @scala.inline
  def apply(dataType: xml | json | jsonp | script | html | text): PickImpldataType = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickImpldataType]
  }
}

