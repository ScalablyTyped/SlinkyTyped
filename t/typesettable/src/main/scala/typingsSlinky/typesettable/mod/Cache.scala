package typingsSlinky.typesettable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typesettable", "Cache")
@js.native
class Cache[T] protected ()
  extends typingsSlinky.typesettable.utilsMod.Cache[T] {
  /**
    * @constructor
    *
    * @param {string} compute The function whose results will be cached.
    */
  def this(compute: js.Function1[/* k */ String, T]) = this()
}
