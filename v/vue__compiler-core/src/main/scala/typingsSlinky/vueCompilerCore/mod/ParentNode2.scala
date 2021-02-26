package typingsSlinky.vueCompilerCore.mod

import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`0`
import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`10`
import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`11`
import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`1`
import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`2`
import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vueCompilerCore.mod.RootNode
  - typingsSlinky.vueCompilerCore.mod.ElementNode
  - typingsSlinky.vueCompilerCore.mod.IfBranchNode
  - typingsSlinky.vueCompilerCore.mod.ForNode
*/
trait ParentNode2 extends StObject
object ParentNode2 {
  
  @scala.inline
  def ComponentNode(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String,
    tagType: `1`,
    `type`: `1`
  ): typingsSlinky.vueCompilerCore.mod.ComponentNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = tagType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vueCompilerCore.mod.ComponentNode]
  }
  
  @scala.inline
  def ForNode(
    children: js.Array[TemplateChildNode],
    loc: SourceLocation,
    parseResult: ForParseResult,
    source: ExpressionNode,
    `type`: `11`
  ): typingsSlinky.vueCompilerCore.mod.ForNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], parseResult = parseResult.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vueCompilerCore.mod.ForNode]
  }
  
  @scala.inline
  def IfBranchNode(children: js.Array[TemplateChildNode], loc: SourceLocation, `type`: `10`): typingsSlinky.vueCompilerCore.mod.IfBranchNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vueCompilerCore.mod.IfBranchNode]
  }
  
  @scala.inline
  def PlainElementNode(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String,
    tagType: `0`,
    `type`: `1`
  ): typingsSlinky.vueCompilerCore.mod.PlainElementNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = tagType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vueCompilerCore.mod.PlainElementNode]
  }
  
  @scala.inline
  def RootNode(
    cached: Double,
    children: js.Array[TemplateChildNode],
    components: js.Array[String],
    directives: js.Array[String],
    helpers: js.Array[js.Symbol],
    hoists: js.Array[JSChildNode | Null],
    imports: js.Array[ImportItem],
    loc: SourceLocation,
    temps: Double,
    `type`: `0`
  ): typingsSlinky.vueCompilerCore.mod.RootNode = {
    val __obj = js.Dynamic.literal(cached = cached.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], hoists = hoists.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], temps = temps.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vueCompilerCore.mod.RootNode]
  }
  
  @scala.inline
  def SlotOutletNode(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String,
    tagType: `2`,
    `type`: `1`
  ): typingsSlinky.vueCompilerCore.mod.SlotOutletNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = tagType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vueCompilerCore.mod.SlotOutletNode]
  }
  
  @scala.inline
  def TemplateNode(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String,
    tagType: `3`,
    `type`: `1`
  ): typingsSlinky.vueCompilerCore.mod.TemplateNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = tagType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vueCompilerCore.mod.TemplateNode]
  }
}
