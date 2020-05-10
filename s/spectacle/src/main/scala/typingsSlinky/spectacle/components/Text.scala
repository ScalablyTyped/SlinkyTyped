package typingsSlinky.spectacle.components

import typingsSlinky.spectacle.mod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Text {
  @JSImport("spectacle", "Text")
  @js.native
  object component extends js.Object
  
  def withProps(p: TextProps): SharedBuilder_TextProps_1636630117[typingsSlinky.spectacle.mod.Text] = new SharedBuilder_TextProps_1636630117[typingsSlinky.spectacle.mod.Text](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Text.type): SharedBuilder_TextProps_1636630117[typingsSlinky.spectacle.mod.Text] = new SharedBuilder_TextProps_1636630117[typingsSlinky.spectacle.mod.Text](js.Array(this.component, js.Dictionary.empty))()
}

