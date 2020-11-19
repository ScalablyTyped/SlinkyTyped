package typingsSlinky.wordpressBlocks.mod

import org.scalablytyped.runtime.TopLevel
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactChild
import typingsSlinky.std.Record
import typingsSlinky.wordpressBlocks.anon.Attributetypeboolean
import typingsSlinky.wordpressBlocks.parserMod.Schema.Attribute
import typingsSlinky.wordpressBlocks.parserMod.Schema.Children
import typingsSlinky.wordpressBlocks.parserMod.Schema.HTML
import typingsSlinky.wordpressBlocks.parserMod.Schema.Node
import typingsSlinky.wordpressBlocks.parserMod.Schema.Query
import typingsSlinky.wordpressBlocks.parserMod.Schema.Tag
import typingsSlinky.wordpressBlocks.parserMod.Schema.Text
import typingsSlinky.wordpressBlocks.parserMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks", "parseWithAttributeSchema")
@js.native
object parseWithAttributeSchema extends js.Object {
  
  def apply(innerHTML: String, schema: Attributetypeboolean): js.UndefOr[Boolean] = js.native
  def apply(innerHTML: String, schema: Attribute): js.UndefOr[String] = js.native
  def apply(innerHTML: String, schema: Children): js.Array[ReactChild] = js.native
  def apply(innerHTML: String, schema: HTML): js.UndefOr[String] = js.native
  def apply(innerHTML: String, schema: Node): ReactElement | Null = js.native
  def apply(innerHTML: String, schema: Tag): js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 173 */ js.Any
  ] = js.native
  def apply(innerHTML: String, schema: Text): js.UndefOr[String] = js.native
  def apply[T /* <: Record[String, Source[_]] */](innerHTML: String, schema: Query[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<T[k]>}
    */ typingsSlinky.wordpressBlocks.wordpressBlocksStrings.parseWithAttributeSchema with TopLevel[T] = js.native
}
