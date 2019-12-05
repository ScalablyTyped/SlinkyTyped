package typingsSlinky.atStorybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distFormInputInputMod {
  import org.scalajs.dom.raw.HTMLInputElement
  import org.scalajs.dom.raw.HTMLSelectElement
  import typingsSlinky.atStorybookComponents.atStorybookComponentsStrings.align
  import typingsSlinky.atStorybookComponents.atStorybookComponentsStrings.size
  import typingsSlinky.atStorybookComponents.atStorybookComponentsStrings.valid
  import typingsSlinky.react.reactMod.HTMLProps
  import typingsSlinky.react.reactMod.SelectHTMLAttributes
  import typingsSlinky.reactDashTextareaDashAutosize.reactDashTextareaDashAutosizeMod.TextareaAutosizeProps
  import typingsSlinky.std.Omit

  type InputProps = (Omit[HTMLProps[HTMLInputElement], size | align | valid]) with InputStyleProps
  type SelectProps = (Omit[SelectHTMLAttributes[HTMLSelectElement], size | align | valid]) with InputStyleProps
  type TextareaProps = (Omit[TextareaAutosizeProps, size | align | valid]) with InputStyleProps
}
