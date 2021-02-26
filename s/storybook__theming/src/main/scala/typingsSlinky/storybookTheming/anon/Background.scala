package typingsSlinky.storybookTheming.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Background extends StObject {
  
  var background: typingsSlinky.storybookTheming.typesMod.Background = js.native
  
  var color: typingsSlinky.storybookTheming.typesMod.Color = js.native
  
  var typography: typingsSlinky.storybookTheming.typesMod.Typography = js.native
}
object Background {
  
  @scala.inline
  def apply(
    background: typingsSlinky.storybookTheming.typesMod.Background,
    color: typingsSlinky.storybookTheming.typesMod.Color,
    typography: typingsSlinky.storybookTheming.typesMod.Typography
  ): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
  
  @scala.inline
  implicit class BackgroundMutableBuilder[Self <: Background] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: typingsSlinky.storybookTheming.typesMod.Background): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: typingsSlinky.storybookTheming.typesMod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypography(value: typingsSlinky.storybookTheming.typesMod.Typography): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
  }
}
