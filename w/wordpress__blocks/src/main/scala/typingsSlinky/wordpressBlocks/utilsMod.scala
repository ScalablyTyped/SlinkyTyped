package typingsSlinky.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.wordpressBlocks.mod.BlockIcon
import typingsSlinky.wordpressBlocks.mod.BlockIconNormalized
import typingsSlinky.wordpressBlocks.mod.BlockInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@wordpress/blocks/api/utils", "isUnmodifiedDefaultBlock")
  @js.native
  def isUnmodifiedDefaultBlock(block: BlockInstance[StringDictionary[_]]): Boolean = js.native
  
  @JSImport("@wordpress/blocks/api/utils", "isValidIcon")
  @js.native
  def isValidIcon(icon: js.Any): Boolean = js.native
  
  @JSImport("@wordpress/blocks/api/utils", "normalizeIconObject")
  @js.native
  def normalizeIconObject(): BlockIconNormalized = js.native
  @JSImport("@wordpress/blocks/api/utils", "normalizeIconObject")
  @js.native
  def normalizeIconObject(icon: BlockIcon): BlockIconNormalized = js.native
}
