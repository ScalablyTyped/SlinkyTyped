package typingsSlinky.waterline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Adapter = js.Object
  type AttributeValidationAsyncFn[T] = js.Function1[/* cb */ js.Function1[/* value */ T, js.Any], scala.Unit]
  type AttributeValidationSyncFn[T] = js.Function0[T]
  type Callback[T] = js.Function2[/* err */ js.Any, /* result */ T, js.Any]
  type CollectionClass = js.Function0[typingsSlinky.waterline.mod.Collection]
  type DefaultsToFn[T] = js.Function0[T]
  type FunctionAttribute = js.Function0[js.Any]
}
