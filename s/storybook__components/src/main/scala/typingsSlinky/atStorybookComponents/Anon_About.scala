package typingsSlinky.atStorybookComponents

import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLSelectElement
import slinky.core.ReactComponentClass
import typingsSlinky.atEmotionStyledDashBase.atEmotionStyledDashBaseMod.StyledComponent
import typingsSlinky.atStorybookComponents.distFormFieldFieldMod.FieldProps
import typingsSlinky.atStorybookComponents.distFormInputInputMod.InputStyleProps
import typingsSlinky.atStorybookTheming.distTypesMod.Theme
import typingsSlinky.react.reactMod.HTMLProps
import typingsSlinky.react.reactMod.RefAttributes
import typingsSlinky.react.reactMod.SelectHTMLAttributes
import typingsSlinky.reactDashTextareaDashAutosize.reactDashTextareaDashAutosizeMod.TextareaAutosizeProps
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_About extends js.Object {
  var Button: ReactComponentClass[_]
  var Field: ReactComponentClass[FieldProps]
  var Input: (StyledComponent[
    (Pick[
      (Pick[
        HTMLProps[HTMLInputElement], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 360 */ js.Any
      ]) with InputStyleProps, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 362 */ js.Any
    ]) with RefAttributes[_], 
    InputStyleProps, 
    Theme
  ]) with Anon_DisplayName
  var Select: (StyledComponent[
    (Pick[
      SelectHTMLAttributes[HTMLSelectElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 262 */ js.Any
    ]) with InputStyleProps with RefAttributes[_], 
    (Pick[
      SelectHTMLAttributes[HTMLSelectElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 262 */ js.Any
    ]) with InputStyleProps, 
    Theme
  ]) with Anon_DisplayName
  var Textarea: (StyledComponent[
    (Pick[
      (Pick[
        TextareaAutosizeProps, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 365 */ js.Any
      ]) with InputStyleProps, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 367 */ js.Any
    ]) with RefAttributes[_], 
    (Pick[
      TextareaAutosizeProps, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 365 */ js.Any
    ]) with InputStyleProps, 
    Theme
  ]) with Anon_DisplayName
}

object Anon_About {
  @scala.inline
  def apply(
    Button: ReactComponentClass[_],
    Field: ReactComponentClass[FieldProps],
    Input: (StyledComponent[
      (Pick[
        (Pick[
          HTMLProps[HTMLInputElement], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 360 */ js.Any
        ]) with InputStyleProps, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 362 */ js.Any
      ]) with RefAttributes[_], 
      InputStyleProps, 
      Theme
    ]) with Anon_DisplayName,
    Select: (StyledComponent[
      (Pick[
        SelectHTMLAttributes[HTMLSelectElement], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 262 */ js.Any
      ]) with InputStyleProps with RefAttributes[_], 
      (Pick[
        SelectHTMLAttributes[HTMLSelectElement], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 262 */ js.Any
      ]) with InputStyleProps, 
      Theme
    ]) with Anon_DisplayName,
    Textarea: (StyledComponent[
      (Pick[
        (Pick[
          TextareaAutosizeProps, 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 365 */ js.Any
        ]) with InputStyleProps, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 367 */ js.Any
      ]) with RefAttributes[_], 
      (Pick[
        TextareaAutosizeProps, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 365 */ js.Any
      ]) with InputStyleProps, 
      Theme
    ]) with Anon_DisplayName
  ): Anon_About = {
    val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], Field = Field.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any], Select = Select.asInstanceOf[js.Any], Textarea = Textarea.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_About]
  }
}

