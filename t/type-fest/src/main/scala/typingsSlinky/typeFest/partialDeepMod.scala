package typingsSlinky.typeFest

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Map
import typingsSlinky.std.Partial
import typingsSlinky.std.ReadonlyMap
import typingsSlinky.std.ReadonlySet
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partialDeepMod {
  
  type PartialDeep[T] = js.UndefOr[
    js.Any | PartialObjectDeep[T] | T | PartialReadonlySetDeep[js.Any] | (PartialReadonlyMapDeep[js.Any, js.Any]) | PartialSetDeep[js.Any] | (PartialMapDeep[js.Any, js.Any]) | Partial[T]
  ]
  
  /**
  Same as `PartialDeep`, but accepts only `Map`s and  as inputs. Internal helper for `PartialDeep`.
  */
  @js.native
  trait PartialMapDeep[KeyType, ValueType] extends Map[PartialDeep[KeyType], PartialDeep[ValueType]]
  
  /**
  Same as `PartialDeep`, but accepts only `object`s as inputs. Internal helper for `PartialDeep`.
  */
  type PartialObjectDeep[ObjectType /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ KeyType in keyof ObjectType ]:? type-fest.type-fest/source/partial-deep.PartialDeep<ObjectType[KeyType]>}
    */ typingsSlinky.typeFest.typeFestStrings.PartialObjectDeep with TopLevel[ObjectType]
  
  /**
  Same as `PartialDeep`, but accepts only `ReadonlyMap`s as inputs. Internal helper for `PartialDeep`.
  */
  @js.native
  trait PartialReadonlyMapDeep[KeyType, ValueType] extends ReadonlyMap[PartialDeep[KeyType], PartialDeep[ValueType]]
  
  /**
  Same as `PartialDeep`, but accepts only `ReadonlySet`s as inputs. Internal helper for `PartialDeep`.
  */
  @js.native
  trait PartialReadonlySetDeep[T] extends ReadonlySet[PartialDeep[T]]
  
  /**
  Same as `PartialDeep`, but accepts only `Set`s as inputs. Internal helper for `PartialDeep`.
  */
  @js.native
  trait PartialSetDeep[T] extends Set[PartialDeep[T]]
}
