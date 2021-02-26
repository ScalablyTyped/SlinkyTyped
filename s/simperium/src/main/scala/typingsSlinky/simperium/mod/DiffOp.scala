package typingsSlinky.simperium.mod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.simperium.simperiumStrings.I
import typingsSlinky.simperium.simperiumStrings.L
import typingsSlinky.simperium.simperiumStrings.O
import typingsSlinky.simperium.simperiumStrings.Plussign
import typingsSlinky.simperium.simperiumStrings.`-_`
import typingsSlinky.simperium.simperiumStrings.d
import typingsSlinky.simperium.simperiumStrings.r
import org.scalablytyped.runtime.StObject
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
trait DiffOp[T] extends StObject
object DiffOp {
  
  @scala.inline
  def `0`(o: `-_`): typingsSlinky.simperium.anon.`0` = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.simperium.anon.`0`]
  }
  
  @scala.inline
  def `1`[T](o: L, v: NumberDictionary[js.Any]): typingsSlinky.simperium.anon.`1`[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.simperium.anon.`1`[T]]
  }
  
  @scala.inline
  def O[T](o: Plussign, v: T): typingsSlinky.simperium.anon.O[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.simperium.anon.O[T]]
  }
  
  @scala.inline
  def OV(o: I, v: Double): typingsSlinky.simperium.anon.OV = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.simperium.anon.OV]
  }
  
  @scala.inline
  def V[T](o: r, v: T): typingsSlinky.simperium.anon.V[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.simperium.anon.V[T]]
  }
  
  @scala.inline
  def VDMPDiff(o: d, v: DMPDiff): typingsSlinky.simperium.anon.VDMPDiff = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.simperium.anon.VDMPDiff]
  }
  
  @scala.inline
  def VJSONDiff[T](o: O, v: JSONDiff[T]): typingsSlinky.simperium.anon.VJSONDiff[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.simperium.anon.VJSONDiff[T]]
  }
}
