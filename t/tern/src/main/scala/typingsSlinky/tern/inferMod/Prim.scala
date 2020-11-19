package typingsSlinky.tern.inferMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tern.anon.Objnamestring
import typingsSlinky.tern.ternStrings.bool
import typingsSlinky.tern.ternStrings.number
import typingsSlinky.tern.ternStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Prim
  extends IType
     with Type {
  
  def gatherProperties(f: js.Function1[/* repeated */ js.Any, Unit], depth: Double): Unit = js.native
  
  /** Get an `AVal` that represents the named property of this type. */
  def getProp(prop: String): AVal = js.native
  
  /** The name of the type, if any. */
  var name: string | bool | number = js.native
  
  /** The prototype of the object, or null. */
  var proto: Objnamestring = js.native
}
@JSImport("tern/lib/infer", "Prim")
@js.native
object Prim extends TopLevel[PrimConstructor]
