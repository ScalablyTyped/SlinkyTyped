package typingsSlinky.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import typingsSlinky.wordpressBlocks.anon.BlockName
import typingsSlinky.wordpressBlocks.mod.Block
import typingsSlinky.wordpressBlocks.mod.BlockInstance
import typingsSlinky.wordpressBlocks.mod.Transform
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.from
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.to
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks/api/factory", JSImport.Namespace)
@js.native
object factoryMod extends js.Object {
  
  def cloneBlock[T /* <: Record[String, _] */](block: BlockInstance[T]): BlockInstance[T] = js.native
  def cloneBlock[T /* <: Record[String, _] */](
    block: BlockInstance[T],
    mergeAttributes: js.UndefOr[scala.Nothing],
    newInnerBlocks: js.Array[BlockInstance[StringDictionary[_]]]
  ): BlockInstance[T] = js.native
  def cloneBlock[T /* <: Record[String, _] */](block: BlockInstance[T], mergeAttributes: Partial[T]): BlockInstance[T] = js.native
  def cloneBlock[T /* <: Record[String, _] */](
    block: BlockInstance[T],
    mergeAttributes: Partial[T],
    newInnerBlocks: js.Array[BlockInstance[StringDictionary[_]]]
  ): BlockInstance[T] = js.native
  
  def createBlock[T /* <: Record[String, _] */](name: String): BlockInstance[T] = js.native
  def createBlock[T /* <: Record[String, _] */](
    name: String,
    attributes: js.UndefOr[scala.Nothing],
    innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]
  ): BlockInstance[T] = js.native
  def createBlock[T /* <: Record[String, _] */](name: String, attributes: Partial[T]): BlockInstance[T] = js.native
  def createBlock[T /* <: Record[String, _] */](name: String, attributes: Partial[T], innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]): BlockInstance[T] = js.native
  
  def findTransform[T /* <: Transform[Record[String, _]] */, U /* <: Record[String, _] */](transforms: js.Array[T], predicate: js.Function1[/* transform */ T, Boolean]): Transform[U] | Null = js.native
  
  @JSName("getBlockTransforms")
  def getBlockTransforms_from[T /* <: Record[String, _] */](direction: from): js.Array[Transform[T] with BlockName] = js.native
  @JSName("getBlockTransforms")
  def getBlockTransforms_from[T /* <: Record[String, _] */](direction: from, blockTypeOrName: String): js.Array[Transform[T] with BlockName] = js.native
  @JSName("getBlockTransforms")
  def getBlockTransforms_from[T /* <: Record[String, _] */](direction: from, blockTypeOrName: Block[js.Object]): js.Array[Transform[T] with BlockName] = js.native
  @JSName("getBlockTransforms")
  def getBlockTransforms_to[T /* <: Record[String, _] */](direction: to): js.Array[Transform[T] with BlockName] = js.native
  @JSName("getBlockTransforms")
  def getBlockTransforms_to[T /* <: Record[String, _] */](direction: to, blockTypeOrName: String): js.Array[Transform[T] with BlockName] = js.native
  @JSName("getBlockTransforms")
  def getBlockTransforms_to[T /* <: Record[String, _] */](direction: to, blockTypeOrName: Block[js.Object]): js.Array[Transform[T] with BlockName] = js.native
  
  def getPossibleBlockTransformations(blocks: js.Array[BlockInstance[StringDictionary[_]]]): js.Array[Block[Record[String, _]]] = js.native
  
  def switchToBlockType(blocks: js.Array[BlockInstance[StringDictionary[_]]], name: String): js.Array[BlockInstance[StringDictionary[_]]] | Null = js.native
  def switchToBlockType(blocks: BlockInstance[StringDictionary[_]], name: String): js.Array[BlockInstance[StringDictionary[_]]] | Null = js.native
}
