package typingsSlinky.storybookTheming.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typography extends StObject {
  
  var typography: typingsSlinky.storybookTheming.typesMod.Typography = js.native
}
object Typography {
  
  @scala.inline
  def apply(typography: typingsSlinky.storybookTheming.typesMod.Typography): Typography = {
    val __obj = js.Dynamic.literal(typography = typography.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typography]
  }
  
  @scala.inline
  implicit class TypographyMutableBuilder[Self <: Typography] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypography(value: typingsSlinky.storybookTheming.typesMod.Typography): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
  }
}
