package typingsSlinky.seneca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object senecaMod {
  type ActCallback = js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[js.Any], Unit]
  type AddCallback[T] = js.Function2[
    /* msg */ MessagePayload[T], 
    /* respond */ js.Function2[/* error */ js.Error | Null, /* msg */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  type CloseCallback = js.Function2[/* optional */ js.Any, /* done */ js.Function1[/* error */ js.Error, Unit], Unit]
  type DatabaseID = String
  type EntityListCallback = js.Function2[/* error */ js.Error, /* result */ js.Array[js.Any], Unit]
  type EntityLoadCallback = js.Function2[/* error */ js.Error, /* result */ js.Any, Unit]
  type EntityRemoveCallback = js.Function1[/* error */ js.Error, Unit]
  type EntitySaveCallback = js.Function2[/* error */ js.Error, /* result */ js.Any, Unit]
  type ExecutorCallback = js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]
  type ExecutorWorker = js.Function1[/* callback */ js.Any, Unit]
  type GlobalErrorHandler = js.Function1[/* error */ js.Error, Unit]
  type MessagePayload[T] = PartialMessagePayload with T
  type Pattern = String | MinimalPattern
  type PluginModule = js.Function1[/* options */ js.Any, Unit]
  type UnknownType = js.Any
}
