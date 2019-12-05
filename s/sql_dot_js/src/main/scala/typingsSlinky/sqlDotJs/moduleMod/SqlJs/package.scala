package typingsSlinky.sqlDotJs.moduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SqlJs {
  import typingsSlinky.emscripten.EmscriptenModule
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Record

  type Config = Partial[EmscriptenModule]
  type ParamsCallback = js.Function1[/* obj */ ParamsObject, Unit]
  type ParamsObject = Record[String, ValueType]
  type ValueType = Double | String | scala.scalajs.js.typedarray.Uint8Array | Null
}
