package typingsSlinky.wordpressBlocks.parserMod

import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.attribute
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.children
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.html
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.node
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.query_
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.tag
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def Children[T](source: children): Source[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  
  @scala.inline
  def Text[T](source: text): Source[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  
  @scala.inline
  def HTML[T](source: html): Source[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  
  @scala.inline
  def Node[T](source: node): Source[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  
  @scala.inline
  def Tag[T](source: tag): Source[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  
  @scala.inline
  def Attribute[T](attribute: String, source: attribute): Source[T] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  
  @scala.inline
  def Query[T](query: T, source: query_): Source[T] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
}
