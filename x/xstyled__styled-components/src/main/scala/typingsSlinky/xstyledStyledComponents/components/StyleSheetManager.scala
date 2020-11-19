package typingsSlinky.xstyledStyledComponents.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.styledComponents.styledComponentsMod.ServerStyleSheet
import typingsSlinky.styledComponents.styledComponentsMod.StyleSheetManagerProps
import typingsSlinky.styledComponents.styledComponentsMod.StylisPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyleSheetManager {
  
  @JSImport("@xstyled/styled-components", "StyleSheetManager")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.xstyledStyledComponents.mod.StyleSheetManager] {
    
    @scala.inline
    def disableCSSOMInjection(value: Boolean): this.type = set("disableCSSOMInjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableVendorPrefixes(value: Boolean): this.type = set("disableVendorPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sheet(value: ServerStyleSheet): this.type = set("sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylisPluginsVarargs(value: StylisPlugin*): this.type = set("stylisPlugins", js.Array(value :_*))
    
    @scala.inline
    def stylisPlugins(value: js.Array[StylisPlugin]): this.type = set("stylisPlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def target(value: HTMLElement): this.type = set("target", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StyleSheetManagerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: StyleSheetManager.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
