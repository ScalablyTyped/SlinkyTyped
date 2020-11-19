package typingsSlinky.wordpressBlockEditor.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressBlockEditor.anon.Children
import typingsSlinky.wordpressBlockEditor.innerBlocksMod.InnerBlocks.Props
import typingsSlinky.wordpressBlockEditor.mod.EditorTemplateLock
import typingsSlinky.wordpressBlocks.templatesMod.TemplateArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerBlocks {
  
  @JSImport("@wordpress/block-editor", "InnerBlocks")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def allowedBlocksVarargs(value: String*): this.type = set("allowedBlocks", js.Array(value :_*))
    
    @scala.inline
    def allowedBlocks(value: js.Array[String]): this.type = set("allowedBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderAppenderFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("renderAppender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderAppenderComponentClass(value: ReactComponentClass[js.Object]): this.type = set("renderAppender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderAppender(value: ReactComponentClass[js.Object]): this.type = set("renderAppender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def template(value: TemplateArray): this.type = set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def templateInsertUpdatesSelection(value: Boolean): this.type = set("templateInsertUpdatesSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def templateLock(value: EditorTemplateLock): this.type = set("templateLock", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: InnerBlocks.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  object ButtonBlockerAppender {
    
    @JSImport("@wordpress/block-editor", "InnerBlocks.ButtonBlockerAppender")
    @js.native
    object component extends js.Object
    
    def withProps(p: Children): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: ButtonBlockerAppender.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Content {
    
    @JSImport("@wordpress/block-editor", "InnerBlocks.Content")
    @js.native
    object component extends js.Object
    
    def withProps(p: Children): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Content.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  }
  
  object DefaultBlockAppender {
    
    @JSImport("@wordpress/block-editor", "InnerBlocks.DefaultBlockAppender")
    @js.native
    object component extends js.Object
    
    def withProps(p: Children): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: DefaultBlockAppender.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  }
}
