package typingsSlinky.solidReact.components

import org.scalajs.dom.raw.HTMLButtonElement
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.solidReact.mod.ActivityButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LikeButton {
  
  @JSImport("@solid/react", "LikeButton")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: LikeButton.type): SharedBuilder_ActivityButtonPropsHTMLAttributes307943597[typingsSlinky.solidReact.mod.LikeButton] = new SharedBuilder_ActivityButtonPropsHTMLAttributes307943597[typingsSlinky.solidReact.mod.LikeButton](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ActivityButtonProps with HTMLAttributes[HTMLButtonElement]): SharedBuilder_ActivityButtonPropsHTMLAttributes307943597[typingsSlinky.solidReact.mod.LikeButton] = new SharedBuilder_ActivityButtonPropsHTMLAttributes307943597[typingsSlinky.solidReact.mod.LikeButton](js.Array(this.component, p.asInstanceOf[js.Any]))
}
