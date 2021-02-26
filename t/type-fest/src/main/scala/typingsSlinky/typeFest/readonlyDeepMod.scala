package typingsSlinky.typeFest

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.ReadonlyMap
import typingsSlinky.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readonlyDeepMod {
  
  type ReadonlyDeep[T] = js.Any | ReadonlyObjectDeep[T] | ReadonlySetDeep[js.Any] | (ReadonlyMapDeep[js.Any, js.Any]) | T
  
  /**
  Same as `ReadonlyDeep`, but accepts only `ReadonlyMap`s as inputs. Internal helper for `ReadonlyDeep`.
  */
  @js.native
  trait ReadonlyMapDeep[KeyType, ValueType] extends ReadonlyMap[ReadonlyDeep[KeyType], ReadonlyDeep[ValueType]]
  
  /**
  Same as `ReadonlyDeep`, but accepts only `object`s as inputs. Internal helper for `ReadonlyDeep`.
  */
  type ReadonlyObjectDeep[ObjectType /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ KeyType in keyof ObjectType ]: type-fest.type-fest/source/readonly-deep.ReadonlyDeep<ObjectType[KeyType]>}
    */ typingsSlinky.typeFest.typeFestStrings.ReadonlyObjectDeep with TopLevel[ObjectType]
  
  /**
  Same as `ReadonlyDeep`, but accepts only `ReadonlySet`s as inputs. Internal helper for `ReadonlyDeep`.
  */
  @js.native
  trait ReadonlySetDeep[ItemType] extends ReadonlySet[ReadonlyDeep[ItemType]]
}
