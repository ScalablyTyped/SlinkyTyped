package typingsSlinky.spectacle.components

import typingsSlinky.spectacle.mod.BaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BlockQuote {
  @JSImport("spectacle", "BlockQuote")
  @js.native
  object component extends js.Object
  
  def withProps(p: BaseProps): SharedBuilder_BaseProps_65666440[typingsSlinky.spectacle.mod.BlockQuote] = new SharedBuilder_BaseProps_65666440[typingsSlinky.spectacle.mod.BlockQuote](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BlockQuote.type): SharedBuilder_BaseProps_65666440[typingsSlinky.spectacle.mod.BlockQuote] = new SharedBuilder_BaseProps_65666440[typingsSlinky.spectacle.mod.BlockQuote](js.Array(this.component, js.Dictionary.empty))()
}

