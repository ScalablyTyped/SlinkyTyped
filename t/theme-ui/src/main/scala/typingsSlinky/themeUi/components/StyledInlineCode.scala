package typingsSlinky.themeUi.components

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.themeUi.anon.As
import typingsSlinky.themeUi.mod.SxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StyledInlineCode {
  @JSImport("theme-ui", "Styled.inlineCode")
  @js.native
  object component extends js.Object
  
  def withProps(p: (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) with SxProps with As): `SharedBuilder_<intersection>_1810236765`[LegacyRef[js.Any]] = new `SharedBuilder_<intersection>_1810236765`[LegacyRef[js.Any]](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StyledInlineCode.type): `SharedBuilder_<intersection>_1810236765`[LegacyRef[js.Any]] = new `SharedBuilder_<intersection>_1810236765`[LegacyRef[js.Any]](js.Array(this.component, js.Dictionary.empty))()
}

