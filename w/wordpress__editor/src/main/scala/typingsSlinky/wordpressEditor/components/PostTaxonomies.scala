package typingsSlinky.wordpressEditor.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressApiFetch.mod.Schema.Taxonomy
import typingsSlinky.wordpressEditor.postTaxonomiesMod.PostTaxonomies.Props
import typingsSlinky.wordpressEditor.wordpressEditorStrings.edit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PostTaxonomies {
  
  @JSImport("@wordpress/editor", "PostTaxonomies")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def taxonomyWrapper(value: (/* content */ ReactElement, /* taxonomy */ Taxonomy[edit]) => ReactElement): this.type = set("taxonomyWrapper", js.Any.fromFunction2(value))
  }
  
  implicit def make(companion: PostTaxonomies.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
