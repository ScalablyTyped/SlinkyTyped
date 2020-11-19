package typingsSlinky.simperium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ChangeVersion = java.lang.String
  
  type DMPDiff = java.lang.String
  
  type EntitiesCallback[T, E] = js.Function2[
    /* error */ typingsSlinky.std.NonNullable[E] | scala.Null, 
    /* entities */ js.UndefOr[js.Array[T]], 
    scala.Unit
  ]
  
  type EntityCallback[T, E] = js.Function2[
    /* error */ typingsSlinky.std.NonNullable[E] | scala.Null, 
    /* entity */ js.UndefOr[T], 
    scala.Unit
  ]
  
  type EntityId = java.lang.String
  
  type Heartbeat = typingsSlinky.simperium.mod.CustomEventEmitter[typingsSlinky.simperium.mod.HeartbeatEvent]
  
  type JSONDiff[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? simperium.simperium.DiffOp<T[K]>}
    */ typingsSlinky.simperium.simperiumStrings.JSONDiff with org.scalablytyped.runtime.TopLevel[T]
  
  type LocalQueue[T] = typingsSlinky.simperium.mod.CustomEventEmitter[typingsSlinky.simperium.mod.LocalQueueEvent[T]]
  
  type SimperiumEvent = org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, scala.Unit]]
}
