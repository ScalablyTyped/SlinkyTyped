package typingsSlinky.tern.inferMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.estree.mod.Node
import typingsSlinky.tern.anon.Objnamestring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Obj
  extends IType
     with Type {
  
  /** Looks up the given property, or defines it if it did not yet exist (in which case it will be associated with the given AST node). */
  def defProp(prop: String): AVal = js.native
  def defProp(prop: String, originNode: Node): AVal = js.native
  
  /** Call the given function for all properties of the object, including properties that are added in the future. */
  def forAllProps(f: js.Function3[/* prop */ String, /* val */ AVal, /* local */ Boolean, Unit]): Unit = js.native
  
  def gatherProperties(f: js.Function1[/* repeated */ js.Any, Unit], depth: Double): Unit = js.native
  
  /**
    * Asks the AVal if it contains an Object type. Useful when
    * you aren’t interested in other kinds of types.
    */
  def getObjType(): Obj = js.native
  
  /** Get an `AVal` that represents the named property of this type. */
  def getProp(prop: String): AVal = js.native
  
  /** Looks up the AVal associated with the given property, or returns null if it doesn’t exist. */
  def hasProp(prop: String): AVal | Null = js.native
  
  /** The name of the type, if any. */
  var name: js.UndefOr[String] = js.native
  
  /** The prototype of the object, or null. */
  var proto: Objnamestring | Null = js.native
}
@JSImport("tern/lib/infer", "Obj")
@js.native
object Obj extends TopLevel[ObjConstructor]
