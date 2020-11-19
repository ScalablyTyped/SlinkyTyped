package typingsSlinky.wordpressEditor.postTaxonomiesMod.PostTaxonomies

import slinky.core.facade.ReactElement
import typingsSlinky.wordpressApiFetch.mod.Schema.Taxonomy
import typingsSlinky.wordpressEditor.wordpressEditorStrings.edit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var children: js.UndefOr[scala.Nothing] = js.native
  
  var taxonomyWrapper: js.UndefOr[
    js.Function2[/* content */ ReactElement, /* taxonomy */ Taxonomy[edit], ReactElement]
  ] = js.native
}
object Props {
  
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTaxonomyWrapper(value: (/* content */ ReactElement, /* taxonomy */ Taxonomy[edit]) => ReactElement): Self = this.set("taxonomyWrapper", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTaxonomyWrapper: Self = this.set("taxonomyWrapper", js.undefined)
  }
}
