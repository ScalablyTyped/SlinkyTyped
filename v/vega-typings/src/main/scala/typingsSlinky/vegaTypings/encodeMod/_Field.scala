package typingsSlinky.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Field extends js.Object
object _Field {
  
  @scala.inline
  def SignalRef(signal: String): _Field = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Field]
  }
  
  @scala.inline
  def DatumFieldRef(datum: Field): _Field = {
    val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Field]
  }
  
  @scala.inline
  def GroupFieldRef(group: Field): _Field = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Field]
  }
  
  @scala.inline
  def ParentFieldRef(parent: Field): _Field = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Field]
  }
}
