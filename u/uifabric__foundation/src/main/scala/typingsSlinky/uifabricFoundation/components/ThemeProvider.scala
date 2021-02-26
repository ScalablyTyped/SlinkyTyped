package typingsSlinky.uifabricFoundation.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluentuiTheme.ischemeMod.ISchemeNames
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.uifabricFoundation.themeProviderMod.IThemeProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  @JSImport("@uifabric/foundation", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def scheme(value: ISchemeNames): this.type = set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ThemeProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IThemeProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
