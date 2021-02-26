package typingsSlinky.vueInbrowserCompilerUtils.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vueInbrowserCompilerUtils.typesMod.ParamTag
  - typingsSlinky.vueInbrowserCompilerUtils.typesMod.Tag
*/
trait BlockTag extends StObject
object BlockTag {
  
  @scala.inline
  def ParamTag(title: String): typingsSlinky.vueInbrowserCompilerUtils.typesMod.ParamTag = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vueInbrowserCompilerUtils.typesMod.ParamTag]
  }
  
  @scala.inline
  def Tag(content: String | Boolean, title: String): typingsSlinky.vueInbrowserCompilerUtils.typesMod.Tag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vueInbrowserCompilerUtils.typesMod.Tag]
  }
}
