package typingsSlinky.solidReact.components

import org.scalajs.dom.raw.HTMLButtonElement
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.solidReact.mod.ActivityButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Follow {
  
  @JSImport("@solid/react", "Follow")
  @js.native
  object component extends js.Object
  
  def withProps(p: ActivityButtonProps with HTMLAttributes[HTMLButtonElement]): SharedBuilder_ActivityButtonPropsHTMLAttributes307943597[typingsSlinky.solidReact.mod.Follow] = new SharedBuilder_ActivityButtonPropsHTMLAttributes307943597[typingsSlinky.solidReact.mod.Follow](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Follow.type): SharedBuilder_ActivityButtonPropsHTMLAttributes307943597[typingsSlinky.solidReact.mod.Follow] = new SharedBuilder_ActivityButtonPropsHTMLAttributes307943597[typingsSlinky.solidReact.mod.Follow](js.Array(this.component, js.Dictionary.empty))()
}
