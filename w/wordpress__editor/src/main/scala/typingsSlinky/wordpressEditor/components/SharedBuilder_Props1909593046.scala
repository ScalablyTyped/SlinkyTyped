package typingsSlinky.wordpressEditor.components

import org.scalablytyped.runtime.StringDictionary
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressBlocks.mod.BlockInstance
import typingsSlinky.wordpressEditor.anon.PartialEditorSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_Props1909593046[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def blocks(value: js.Array[BlockInstance[StringDictionary[_]]]): this.type = set("blocks", value.asInstanceOf[js.Any])
  @scala.inline
  def initialEdits(value: js.Object): this.type = set("initialEdits", value.asInstanceOf[js.Any])
  @scala.inline
  def settings(value: PartialEditorSettings): this.type = set("settings", value.asInstanceOf[js.Any])
  @scala.inline
  def useSubRegistry(value: Boolean): this.type = set("useSubRegistry", value.asInstanceOf[js.Any])
}

