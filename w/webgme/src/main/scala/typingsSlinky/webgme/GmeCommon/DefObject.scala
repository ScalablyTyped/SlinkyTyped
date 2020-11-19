package typingsSlinky.webgme.GmeCommon

import typingsSlinky.webgme.webgmeStrings.asset
import typingsSlinky.webgme.webgmeStrings.boolean
import typingsSlinky.webgme.webgmeStrings.float
import typingsSlinky.webgme.webgmeStrings.integer
import typingsSlinky.webgme.webgmeStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webgme.GmeCommon.DefStringObject
  - typingsSlinky.webgme.GmeCommon.DefIntegerObject
  - typingsSlinky.webgme.GmeCommon.DefFloatObject
  - typingsSlinky.webgme.GmeCommon.DefBoolObject
  - typingsSlinky.webgme.GmeCommon.DefAssetObject
*/
trait DefObject extends js.Object
object DefObject {
  
  @scala.inline
  def DefFloatObject(`type`: float): DefObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefObject]
  }
  
  @scala.inline
  def DefAssetObject(`type`: asset): DefObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefObject]
  }
  
  @scala.inline
  def DefIntegerObject(`type`: integer): DefObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefObject]
  }
  
  @scala.inline
  def DefStringObject(`type`: string): DefObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefObject]
  }
  
  @scala.inline
  def DefBoolObject(`type`: boolean): DefObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefObject]
  }
}
