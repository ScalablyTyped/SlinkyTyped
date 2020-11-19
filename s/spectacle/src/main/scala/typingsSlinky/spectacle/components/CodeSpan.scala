package typingsSlinky.spectacle.components

import typingsSlinky.spectacle.mod.TypographyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeSpan {
  
  @JSImport("spectacle", "CodeSpan")
  @js.native
  object component extends js.Object
  
  def withProps(p: TypographyProps): SharedBuilder_TypographyProps_1522227064 = new SharedBuilder_TypographyProps_1522227064(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: CodeSpan.type): SharedBuilder_TypographyProps_1522227064 = new SharedBuilder_TypographyProps_1522227064(js.Array(this.component, js.Dictionary.empty))()
}
