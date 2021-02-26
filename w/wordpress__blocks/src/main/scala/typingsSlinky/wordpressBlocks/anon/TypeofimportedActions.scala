package typingsSlinky.wordpressBlocks.anon

import typingsSlinky.wordpressBlocks.categoriesMod.Category
import typingsSlinky.wordpressBlocks.mod.BlockConfiguration
import typingsSlinky.wordpressBlocks.mod.BlockStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedActions extends StObject {
  
  def addBlockStyles(blockName: String, styles: js.Array[BlockStyle]): Unit = js.native
  def addBlockStyles(blockName: String, styles: BlockStyle): Unit = js.native
  
  def addBlockTypes(blockTypes: js.Array[BlockConfiguration[_]]): Unit = js.native
  def addBlockTypes(blockTypes: BlockConfiguration[_]): Unit = js.native
  
  def removeBlockStyles(blockName: String, styleNames: String): Unit = js.native
  def removeBlockStyles(blockName: String, styleNames: js.Array[String]): Unit = js.native
  
  def removeBlockTypes(names: String): Unit = js.native
  def removeBlockTypes(names: js.Array[String]): Unit = js.native
  
  def setCategories(categories: js.Array[Category]): Unit = js.native
  
  def setDefaultBlockName(name: String): Unit = js.native
  
  def setFreeformFallbackBlockName(name: String): Unit = js.native
  
  def setGroupingBlockName(name: String): Unit = js.native
  
  def setUnregisteredFallbackBlockName(name: String): Unit = js.native
  
  def updateCategory(slug: String, category: PartialCategory): Unit = js.native
}
