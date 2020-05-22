package typingsSlinky.themeUi.components

import org.scalajs.dom.raw.HTMLHeadingElement
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.themeUi.anon.As
import typingsSlinky.themeUi.mod.SxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StyledH5 {
  @JSImport("theme-ui", "Styled.h5")
  @js.native
  object component extends js.Object
  
  def withProps(
    p: (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) with SxProps with As
  ): SharedBuilder_DetailedHTMLPropsSxPropsAs1112162328[LegacyRef[js.Any] with js.Object] = new SharedBuilder_DetailedHTMLPropsSxPropsAs1112162328[LegacyRef[js.Any] with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StyledH5.type): SharedBuilder_DetailedHTMLPropsSxPropsAs1112162328[LegacyRef[js.Any] with js.Object] = new SharedBuilder_DetailedHTMLPropsSxPropsAs1112162328[LegacyRef[js.Any] with js.Object](js.Array(this.component, js.Dictionary.empty))()
}

