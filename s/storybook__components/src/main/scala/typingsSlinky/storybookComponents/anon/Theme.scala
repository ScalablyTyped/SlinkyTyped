package typingsSlinky.storybookComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Theme extends StObject {
  
  var theme: typingsSlinky.storybookTheming.typesMod.Theme = js.native
}
object Theme {
  
  @scala.inline
  def apply(theme: typingsSlinky.storybookTheming.typesMod.Theme): Theme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  @scala.inline
  implicit class ThemeMutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTheme(value: typingsSlinky.storybookTheming.typesMod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
