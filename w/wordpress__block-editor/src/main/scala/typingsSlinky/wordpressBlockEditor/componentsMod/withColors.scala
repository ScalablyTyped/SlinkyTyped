package typingsSlinky.wordpressBlockEditor.componentsMod

import slinky.core.ReactComponentClass
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/block-editor/components", "withColors")
@js.native
object withColors extends js.Object {
  def apply(colorTypes: (String | (Record[String, String]))*): js.Function1[/* component */ ReactComponentClass[_], ReactComponentClass[_]] = js.native
}

