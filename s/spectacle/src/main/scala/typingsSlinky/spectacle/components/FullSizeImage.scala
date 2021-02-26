package typingsSlinky.spectacle.components

import typingsSlinky.react.mod.ImgHTMLAttributes
import typingsSlinky.styledSystem.mod.LayoutProps
import typingsSlinky.styledSystem.mod.PositionProps
import typingsSlinky.styledSystem.mod.RequiredTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FullSizeImage {
  
  @JSImport("spectacle", "FullSizeImage")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: FullSizeImage.type): SharedBuilder_ImgHTMLAttributesLayoutPropsPositionProps_256285861 = new SharedBuilder_ImgHTMLAttributesLayoutPropsPositionProps_256285861(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ImgHTMLAttributes[js.Object] with LayoutProps[RequiredTheme] with PositionProps[RequiredTheme]): SharedBuilder_ImgHTMLAttributesLayoutPropsPositionProps_256285861 = new SharedBuilder_ImgHTMLAttributesLayoutPropsPositionProps_256285861(js.Array(this.component, p.asInstanceOf[js.Any]))
}
