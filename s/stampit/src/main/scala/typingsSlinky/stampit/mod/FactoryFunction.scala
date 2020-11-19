package typingsSlinky.stampit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A factory function to create plain object instances.
  * @template Obj The object type that the `Stamp` will create.
  */
@js.native
trait FactoryFunction[Obj] extends js.Object {
  
  def apply(options: js.UndefOr[scala.Nothing], args: js.Any*): StampObjectType[Obj] = js.native
  def apply(options: PropertyMap, args: js.Any*): StampObjectType[Obj] = js.native
}
