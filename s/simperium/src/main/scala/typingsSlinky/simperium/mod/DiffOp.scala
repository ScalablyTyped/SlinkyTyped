package typingsSlinky.simperium.mod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.simperium.simperiumStrings.I
import typingsSlinky.simperium.simperiumStrings.L
import typingsSlinky.simperium.simperiumStrings.O
import typingsSlinky.simperium.simperiumStrings.Plussign
import typingsSlinky.simperium.simperiumStrings.`-_`
import typingsSlinky.simperium.simperiumStrings.d
import typingsSlinky.simperium.simperiumStrings.r
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.simperium.anon.O[T]
  - typingsSlinky.simperium.anon.`0`
  - typingsSlinky.simperium.anon.V[T]
  - typingsSlinky.simperium.anon.OV
  - typingsSlinky.simperium.anon.`1`[T]
  - typingsSlinky.simperium.anon.VJSONDiff[T]
  - typingsSlinky.simperium.anon.VDMPDiff
*/
trait DiffOp[T] extends js.Object
object DiffOp {
  
  @scala.inline
  def VDMPDiff[T](o: d, v: DMPDiff): DiffOp[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOp[T]]
  }
  
  @scala.inline
  def O[T](o: Plussign, v: T): DiffOp[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOp[T]]
  }
  
  @scala.inline
  def OV[T](o: I, v: Double): DiffOp[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOp[T]]
  }
  
  @scala.inline
  def `0`[T](o: `-_`): DiffOp[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOp[T]]
  }
  
  @scala.inline
  def VJSONDiff[T](o: O, v: JSONDiff[T]): DiffOp[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOp[T]]
  }
  
  @scala.inline
  def `1`[T](o: L, v: NumberDictionary[js.Any]): DiffOp[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOp[T]]
  }
  
  @scala.inline
  def V[T](o: r, v: T): DiffOp[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOp[T]]
  }
}
