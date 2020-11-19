package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("IDBKeyRange")
@js.native
class IDBKeyRange ()
  extends typingsSlinky.std.IDBKeyRange
@JSGlobal("IDBKeyRange")
@js.native
object IDBKeyRange
  extends Instantiable0[org.scalajs.dom.raw.IDBKeyRange] {
  
  /**
    * Returns a new IDBKeyRange spanning from lower to upper. If lowerOpen is true, lower is not included in the range. If upperOpen is true, upper is not included in the range.
    */
  def bound(lower: js.Any, upper: js.Any): org.scalajs.dom.raw.IDBKeyRange = js.native
  def bound(lower: js.Any, upper: js.Any, lowerOpen: js.UndefOr[scala.Nothing], upperOpen: scala.Boolean): org.scalajs.dom.raw.IDBKeyRange = js.native
  def bound(lower: js.Any, upper: js.Any, lowerOpen: scala.Boolean): org.scalajs.dom.raw.IDBKeyRange = js.native
  def bound(lower: js.Any, upper: js.Any, lowerOpen: scala.Boolean, upperOpen: scala.Boolean): org.scalajs.dom.raw.IDBKeyRange = js.native
  
  /**
    * Returns a new IDBKeyRange starting at key with no upper bound. If open is true, key is not included in the range.
    */
  def lowerBound(lower: js.Any): org.scalajs.dom.raw.IDBKeyRange = js.native
  def lowerBound(lower: js.Any, open: scala.Boolean): org.scalajs.dom.raw.IDBKeyRange = js.native
  
  /**
    * Returns a new IDBKeyRange spanning only key.
    */
  def only(value: js.Any): org.scalajs.dom.raw.IDBKeyRange = js.native
  
  /**
    * Returns a new IDBKeyRange with no lower bound and ending at key. If open is true, key is not included in the range.
    */
  def upperBound(upper: js.Any): org.scalajs.dom.raw.IDBKeyRange = js.native
  def upperBound(upper: js.Any, open: scala.Boolean): org.scalajs.dom.raw.IDBKeyRange = js.native
}
