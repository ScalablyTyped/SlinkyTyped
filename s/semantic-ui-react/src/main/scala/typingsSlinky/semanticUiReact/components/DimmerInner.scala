package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.dimmerInnerMod.DimmerInnerProps
import typingsSlinky.semanticUiReact.dimmerInnerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DimmerInner {
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dimmer/DimmerInner", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: DimmerInnerProps): SharedBuilder_DimmerInnerProps_65086474[default] = new SharedBuilder_DimmerInnerProps_65086474[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DimmerInner.type): SharedBuilder_DimmerInnerProps_65086474[default] = new SharedBuilder_DimmerInnerProps_65086474[default](js.Array(this.component, js.Dictionary.empty))()
}

