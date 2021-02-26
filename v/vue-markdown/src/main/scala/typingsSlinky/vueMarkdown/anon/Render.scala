package typingsSlinky.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Render extends StObject {
  
  var render: js.Any = js.native
  
  var renderAttrs: js.Any = js.native
  
  var renderInline: js.Any = js.native
  
  var renderInlineAsText: js.Any = js.native
  
  var renderToken: js.Any = js.native
  
  var rules: Codeblock = js.native
}
object Render {
  
  @scala.inline
  def apply(
    render: js.Any,
    renderAttrs: js.Any,
    renderInline: js.Any,
    renderInlineAsText: js.Any,
    renderToken: js.Any,
    rules: Codeblock
  ): Render = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any], renderAttrs = renderAttrs.asInstanceOf[js.Any], renderInline = renderInline.asInstanceOf[js.Any], renderInlineAsText = renderInlineAsText.asInstanceOf[js.Any], renderToken = renderToken.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Render]
  }
  
  @scala.inline
  implicit class RenderMutableBuilder[Self <: Render] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRender(value: js.Any): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderAttrs(value: js.Any): Self = StObject.set(x, "renderAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderInline(value: js.Any): Self = StObject.set(x, "renderInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderInlineAsText(value: js.Any): Self = StObject.set(x, "renderInlineAsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderToken(value: js.Any): Self = StObject.set(x, "renderToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(value: Codeblock): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
  }
}
