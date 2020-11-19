package typingsSlinky.wordpressBlocks

import typingsSlinky.wordpressBlocks.mod.Block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks/api/validation", JSImport.Namespace)
@js.native
object validationMod extends js.Object {
  
  def isValidBlockContent[T](blockTypeOrName: String, attributes: T, originalBlockContent: String): Boolean = js.native
  def isValidBlockContent[T](blockTypeOrName: Block[T], attributes: T, originalBlockContent: String): Boolean = js.native
}
