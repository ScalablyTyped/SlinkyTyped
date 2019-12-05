package typingsSlinky.streamingDashJsonDashStringify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object streamingDashJsonDashStringifyMod {
  import typingsSlinky.node.streamMod.TransformOptions
  import typingsSlinky.std.Partial

  type Options = Partial[Instance] with TransformOptions
  type Replacer = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
}
