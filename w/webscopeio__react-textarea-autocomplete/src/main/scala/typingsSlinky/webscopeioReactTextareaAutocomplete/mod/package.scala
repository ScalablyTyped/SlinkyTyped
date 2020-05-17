package typingsSlinky.webscopeioReactTextareaAutocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DataProviderType[TItem] = js.Function1[/* token */ java.lang.String, js.Promise[js.Array[TItem]] | js.Array[TItem]]
  type TriggerType[TItem] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.webscopeioReactTextareaAutocomplete.mod.SettingType[TItem]]
}
