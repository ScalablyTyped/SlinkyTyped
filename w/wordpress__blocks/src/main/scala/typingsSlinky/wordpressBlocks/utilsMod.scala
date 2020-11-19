package typingsSlinky.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.wordpressBlocks.mod.BlockIcon
import typingsSlinky.wordpressBlocks.mod.BlockIconNormalized
import typingsSlinky.wordpressBlocks.mod.BlockInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks/api/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def isUnmodifiedDefaultBlock(block: BlockInstance[StringDictionary[_]]): Boolean = js.native
  
  def isValidIcon(icon: js.Any): Boolean = js.native
  
  def normalizeIconObject(): BlockIconNormalized = js.native
  def normalizeIconObject(icon: BlockIcon): BlockIconNormalized = js.native
}
