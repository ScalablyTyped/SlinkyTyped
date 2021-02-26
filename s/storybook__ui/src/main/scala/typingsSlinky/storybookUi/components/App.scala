package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSizeme.anon.Height
import typingsSlinky.storybookUi.anon.PickAppPropsviewModepanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object App {
  
  @scala.inline
  def apply(
    docsOnly: Boolean,
    layout: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['layout'] */ js.Any,
    panelCount: Double,
    viewMode: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any
  ): Builder = {
    val __props = js.Dynamic.literal(docsOnly = docsOnly.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], panelCount = panelCount.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PickAppPropsviewModepanel]))
  }
  
  @JSImport("@storybook/ui/dist/app", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def onSize(value: /* size */ Height => Unit): this.type = set("onSize", js.Any.fromFunction1(value))
  }
  
  def withProps(p: PickAppPropsviewModepanel): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
