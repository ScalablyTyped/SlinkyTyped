package typingsSlinky.wordpressBlocks.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.array
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.html
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.li
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.meta
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.p
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.query_
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.string
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _BlockAttribute[T] extends js.Object

object _BlockAttribute {
  @scala.inline
  def HTML[T](
    source: html,
    `type`: string,
    default: String = null,
    multiline: li | p = null,
    selector: String = null
  ): _BlockAttribute[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (multiline != null) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[_BlockAttribute[T]]
  }
  @scala.inline
  def Meta[T](meta: String, source: meta, `type`: string, default: String = null): _BlockAttribute[T] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[_BlockAttribute[T]]
  }
  @scala.inline
  def Children[T](
    source: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.children,
    `type`: array,
    selector: String = null
  ): _BlockAttribute[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[_BlockAttribute[T]]
  }
  @scala.inline
  def Text[T](source: text, `type`: string, default: String = null, selector: String = null): _BlockAttribute[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[_BlockAttribute[T]]
  }
  @scala.inline
  def Query[T](
    query: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typingsSlinky.wordpressBlocks.wordpressBlocksStrings.Query with TopLevel[js.Any],
    selector: String,
    source: query_,
    `type`: array,
    default: js.Array[_] = null
  ): _BlockAttribute[T] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[_BlockAttribute[T]]
  }
}

