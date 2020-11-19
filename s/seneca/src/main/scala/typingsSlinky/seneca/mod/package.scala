package typingsSlinky.seneca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ActCallback = js.Function2[/* error */ js.Error | scala.Null, /* result */ js.UndefOr[js.Any], scala.Unit]
  
  type AddCallback[T] = js.Function2[
    /* msg */ typingsSlinky.seneca.mod.MessagePayload[T], 
    /* respond */ js.Function2[/* error */ js.Error | scala.Null, /* msg */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
  
  type CloseCallback = js.Function2[
    /* optional */ js.Any, 
    /* done */ js.Function1[/* error */ js.Error, scala.Unit], 
    scala.Unit
  ]
  
  type DatabaseID = java.lang.String
  
  type EntityListCallback = js.Function2[/* error */ js.Error, /* result */ js.Array[js.Any], scala.Unit]
  
  type EntityLoadCallback = js.Function2[/* error */ js.Error, /* result */ js.Any, scala.Unit]
  
  type EntityRemoveCallback = js.Function1[/* error */ js.Error, scala.Unit]
  
  type EntitySaveCallback = js.Function2[/* error */ js.Error, /* result */ js.Any, scala.Unit]
  
  type ExecutorCallback = js.Function2[/* err */ js.Error, /* result */ js.Any, scala.Unit]
  
  type ExecutorWorker = js.Function1[/* callback */ js.Any, scala.Unit]
  
  type GlobalErrorHandler = js.Function1[/* error */ js.Error, scala.Unit]
  
  type MessagePayload[T] = typingsSlinky.seneca.mod.PartialMessagePayload with T
  
  type Pattern = java.lang.String | typingsSlinky.seneca.mod.MinimalPattern
  
  type PluginModule = js.Function1[/* options */ js.Any, scala.Unit]
  
  type UnknownType = js.Any
}
