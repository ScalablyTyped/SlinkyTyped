package typingsSlinky.scrivito.components

import typingsSlinky.StBuildingComponent
import typingsSlinky.scrivito.mod.BackgroundImageBackgroundProp
import typingsSlinky.scrivito.mod.BackgroundImageTagProps
import typingsSlinky.scrivito.mod.CSSPropsWithoutBackground
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BackgroundImageTag {
  
  @JSImport("scrivito", "BackgroundImageTag")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.scrivito.mod.BackgroundImageTag] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tag(value: String): this.type = set("tag", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BackgroundImageTagProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(style: CSSPropsWithoutBackground with BackgroundImageBackgroundProp): Builder = {
    val __props = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BackgroundImageTagProps]))
  }
}
