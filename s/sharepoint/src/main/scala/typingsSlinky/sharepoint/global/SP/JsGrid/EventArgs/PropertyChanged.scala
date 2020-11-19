package typingsSlinky.sharepoint.global.SP.JsGrid.EventArgs

import typingsSlinky.sharepoint.SP.JsGrid.IChangeKey
import typingsSlinky.sharepoint.SP.JsGrid.IPropertyType
import typingsSlinky.sharepoint.SP.JsGrid.Internal.PropertyUpdate
import typingsSlinky.sharepoint.SP.JsGrid.ValidationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.JsGrid.EventArgs.PropertyChanged")
@js.native
class PropertyChanged protected ()
  extends typingsSlinky.sharepoint.SP.JsGrid.EventArgs.PropertyChanged {
  def this(
    recordKey: Double,
    fieldKey: String,
    oldProp: PropertyUpdate,
    newProp: PropertyUpdate,
    propType: IPropertyType,
    changeKey: IChangeKey,
    validationState: ValidationState
  ) = this()
}
