package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A key range can be a single value or a range with upper and lower bounds or endpoints. If the key range has both upper and lower bounds, then it is bounded; if it has no bounds, it is unbounded. A bounded key range can either be open (the endpoints are excluded) or closed (the endpoints are included). To retrieve all keys within a certain range, you can use the following code constructs: */
@js.native
trait IDBKeyRange extends js.Object {
  /**
    * Returns lower bound, or undefined if none.
    */
  val lower: js.Any = js.native
  /**
    * Returns true if the lower open flag is set, and false otherwise.
    */
  val lowerOpen: scala.Boolean = js.native
  /**
    * Returns upper bound, or undefined if none.
    */
  val upper: js.Any = js.native
  /**
    * Returns true if the upper open flag is set, and false otherwise.
    */
  val upperOpen: scala.Boolean = js.native
  /**
    * Returns true if key is included in the range, and false otherwise.
    */
  def includes(key: js.Any): scala.Boolean = js.native
}

@JSGlobal("IDBKeyRange")
@js.native
object IDBKeyRange
  extends Instantiable0[org.scalajs.dom.raw.IDBKeyRange] {
  /**
    * Returns a new IDBKeyRange spanning from lower to upper. If lowerOpen is true, lower is not included in the range. If upperOpen is true, upper is not included in the range.
    */
  def bound(lower: js.Any, upper: js.Any): org.scalajs.dom.raw.IDBKeyRange = js.native
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

