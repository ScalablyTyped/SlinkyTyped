package typingsSlinky.semanticUiReact.formFormMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.semanticUiReact.formButtonMod.FormButtonProps
import typingsSlinky.semanticUiReact.formCheckboxMod.FormCheckboxProps
import typingsSlinky.semanticUiReact.formDropdownMod.FormDropdownProps
import typingsSlinky.semanticUiReact.formFieldMod.FormFieldProps
import typingsSlinky.semanticUiReact.formGroupMod.FormGroupProps
import typingsSlinky.semanticUiReact.formInputMod.FormInputProps
import typingsSlinky.semanticUiReact.formRadioMod.FormRadioProps
import typingsSlinky.semanticUiReact.formSelectMod.FormSelectProps
import typingsSlinky.semanticUiReact.formTextAreaMod.FormTextAreaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormComponent extends FunctionComponent[FormProps] {
  var Button: ReactComponentClass[FormButtonProps] = js.native
  var Checkbox: ReactComponentClass[FormCheckboxProps] = js.native
  var Dropdown: ReactComponentClass[FormDropdownProps] = js.native
  var Field: ReactComponentClass[FormFieldProps] = js.native
  var Group: ReactComponentClass[FormGroupProps] = js.native
  var Input: ReactComponentClass[FormInputProps] = js.native
  var Radio: ReactComponentClass[FormRadioProps] = js.native
  var Select: ReactComponentClass[FormSelectProps] = js.native
  var TextArea: ReactComponentClass[FormTextAreaProps] = js.native
}

