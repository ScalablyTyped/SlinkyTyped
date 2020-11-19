package typingsSlinky.stampit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  /**
    * @internal The type of the object produced by the `Stamp`.
    * @template Original The type (either a `Stamp` or a `ExtendedDescriptor`) to get the object type from.
    */
  type StampObjectType[Original] = Original | js.Any
  
  /**
    * @internal Extracts the `Stamp` type.
    * @template Original The type to extract the `Stamp` type from.
    */
  type StampType[Original] = (typingsSlinky.stampit.mod.stampit.Stamp[js.Any | Original]) | Original | js.Any
}
