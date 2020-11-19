package typingsSlinky.xmlcreate.xmlEntityRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlEntityRef[Parent] extends js.Object {
  
  var _name: js.Any = js.native
  
  val _parent: js.Any = js.native
  
  val _validation: js.Any = js.native
  
  /**
    * Gets the name of this entity reference.
    */
  def name: String = js.native
  /**
    * Sets the name of this entity reference.
    */
  def name_=(name: String): Unit = js.native
  
  /**
    * Returns the parent of this entity reference.
    */
  def up(): Parent = js.native
}
