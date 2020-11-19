package typingsSlinky.yaml.typesMod.Schema

import typingsSlinky.yaml.mod.Document
import typingsSlinky.yaml.parseCstMod.CST.Node
import typingsSlinky.yaml.yamlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yaml.typesMod.Schema.CustomTag
  - typingsSlinky.yaml.typesMod.Schema.DefaultTag
*/
trait Tag extends js.Object
object Tag {
  
  @scala.inline
  def CustomTag(
    identify: js.Any => Boolean,
    resolve: (Document, Node) => typingsSlinky.yaml.typesMod.Node | js.Any,
    tag: String
  ): Tag = {
    val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction2(resolve), tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  def DefaultTag(
    default: `true`,
    identify: js.Any => Boolean,
    resolve: /* repeated */ String => typingsSlinky.yaml.typesMod.Node | js.Any,
    tag: String,
    test: js.RegExp
  ): Tag = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction1(resolve), tag = tag.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}
