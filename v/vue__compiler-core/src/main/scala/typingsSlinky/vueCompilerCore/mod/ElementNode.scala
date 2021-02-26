package typingsSlinky.vueCompilerCore.mod

import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`0`
import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`1`
import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`2`
import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vueCompilerCore.mod.PlainElementNode
  - typingsSlinky.vueCompilerCore.mod.ComponentNode
  - typingsSlinky.vueCompilerCore.mod.SlotOutletNode
  - typingsSlinky.vueCompilerCore.mod.TemplateNode
*/
trait ElementNode
  extends TemplateChildNode
     with ParentNode2
object ElementNode {
  
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
