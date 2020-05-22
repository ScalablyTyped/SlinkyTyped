package typingsSlinky.wordpressBlocks.parserMod

import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.attribute
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.boolean
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.children
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.html
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.node
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.query_
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.string
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.tag
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressBlocks.parserMod.Schema.Attribute
  - typingsSlinky.wordpressBlocks.parserMod.Schema.Children
  - typingsSlinky.wordpressBlocks.parserMod.Schema.HTML
  - typingsSlinky.wordpressBlocks.parserMod.Schema.Node
  - typingsSlinky.wordpressBlocks.parserMod.Schema.Query[T]
  - typingsSlinky.wordpressBlocks.parserMod.Schema.Tag
  - typingsSlinky.wordpressBlocks.parserMod.Schema.Text
*/
trait Source[T] extends js.Object

object Source {
  @scala.inline
  def Children[T](source: children, selector: String = null): Source[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  @scala.inline
  def Text[T](source: text, selector: String = null): Source[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  @scala.inline
  def HTML[T](
    source: html,
    multiline: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any = null,
    selector: String = null
  ): Source[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (multiline != null) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  @scala.inline
  def Node[T](source: node, selector: String = null): Source[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  @scala.inline
  def Tag[T](source: tag, selector: String = null): Source[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  @scala.inline
  def Attribute[T](attribute: String, source: attribute, selector: String = null, `type`: string | boolean = null): Source[T] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  @scala.inline
  def Query[T](query: T, source: query_, selector: String = null): Source[T] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
}

