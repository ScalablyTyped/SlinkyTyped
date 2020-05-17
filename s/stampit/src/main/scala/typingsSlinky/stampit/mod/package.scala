package typingsSlinky.stampit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MethodMap[This] = org.scalablytyped.runtime.StringDictionary[(js.ThisFunction1[/* this */ This, /* repeated */ js.Any, js.Any]) | js.Object]
  /** @internal A plain old JavaScript object created by a `Stamp`. */
  type Pojo = js.Object
  /** @internal Base type for all `properties`-like metadata. */
  // TODO: discriminate Array
  type PropertyMap = js.Object
  /**
    * @internal Chainables `Stamp` additionnal methods
    * @template Obj The object type that the `Stamp` will create.
    */
  type StampChainables[Obj] = typingsSlinky.stampit.mod.Chainables[
    typingsSlinky.stampit.mod.StampObjectType[Obj], 
    typingsSlinky.stampit.mod.StampType[Obj]
  ]
}
