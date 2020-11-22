package typingsSlinky.stylableCore.stylableMetaMod

import typingsSlinky.postcss.mod.Node
import typingsSlinky.stylableCore.stylableCoreStrings.`class`
import typingsSlinky.stylableCore.stylableCoreStrings.`import`
import typingsSlinky.stylableCore.stylableCoreStrings.`var`
import typingsSlinky.stylableCore.stylableCoreStrings.cssVar
import typingsSlinky.stylableCore.stylableCoreStrings.default
import typingsSlinky.stylableCore.stylableCoreStrings.element
import typingsSlinky.stylableCore.stylableCoreStrings.keyframes
import typingsSlinky.stylableCore.stylableCoreStrings.named
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stylableCore.stylableMetaMod.ImportSymbol
  - typingsSlinky.stylableCore.stylableMetaMod.VarSymbol
  - typingsSlinky.stylableCore.stylableMetaMod.ClassSymbol
  - typingsSlinky.stylableCore.stylableMetaMod.ElementSymbol
  - typingsSlinky.stylableCore.stylableMetaMod.CSSVarSymbol
  - typingsSlinky.stylableCore.stylableMetaMod.KeyframesSymbol
*/
trait StylableSymbol extends js.Object
object StylableSymbol {
  
  @scala.inline
  def ImportSymbol(_kind: `import`, context: String, `import`: Imported, name: String, `type`: named | default): StylableSymbol = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylableSymbol]
  }
  
  @scala.inline
  def KeyframesSymbol(_kind: keyframes, alias: String, name: String): StylableSymbol = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylableSymbol]
  }
  
  @scala.inline
  def ElementSymbol(_kind: element, name: String): StylableSymbol = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylableSymbol]
  }
  
  @scala.inline
  def VarSymbol(_kind: `var`, name: String, node: Node, text: String, value: String): StylableSymbol = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylableSymbol]
  }
  
  @scala.inline
  def CSSVarSymbol(_kind: cssVar, name: String): StylableSymbol = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylableSymbol]
  }
  
  @scala.inline
  def ClassSymbol(_kind: `class`, name: String): StylableSymbol = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylableSymbol]
  }
}
