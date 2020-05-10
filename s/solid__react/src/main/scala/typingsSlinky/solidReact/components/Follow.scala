package typingsSlinky.solidReact.components

import org.scalajs.dom.raw.HTMLButtonElement
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.solidReact.mod.ActivityButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Follow {
  @JSImport("@solid/react", "Follow")
  @js.native
  object component extends js.Object
  
  def withProps(p: ActivityButtonProps with HTMLAttributes[HTMLButtonElement]): `SharedBuilder_<intersection>307943597`[typingsSlinky.solidReact.mod.Follow] = new `SharedBuilder_<intersection>307943597`[typingsSlinky.solidReact.mod.Follow](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Follow.type): `SharedBuilder_<intersection>307943597`[typingsSlinky.solidReact.mod.Follow] = new `SharedBuilder_<intersection>307943597`[typingsSlinky.solidReact.mod.Follow](js.Array(this.component, js.Dictionary.empty))()
}

